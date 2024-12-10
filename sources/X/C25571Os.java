package X;

import android.os.Parcelable;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.1Os  reason: invalid class name and case insensitive filesystem */
public class C25571Os {
    public final AnonymousClass190 A00;
    public final AnonymousClass11S A01;
    public final C218717s A02;
    public final C25501Ol A03;
    public final C18030ve A04;
    public final List A05 = Collections.synchronizedList(new LinkedList());
    public final ConcurrentHashMap A06 = new ConcurrentHashMap();
    public final Object A07 = new Object();
    public final ConcurrentHashMap A08 = new ConcurrentHashMap();

    public static C71363Ez A00(C60002nE r3, C25571Os r4) {
        ConcurrentHashMap concurrentHashMap = r4.A06;
        Integer valueOf = Integer.valueOf(Math.abs(r4.A02(r3).hashCode()) % 512);
        if (!concurrentHashMap.containsKey(valueOf)) {
            concurrentHashMap.putIfAbsent(valueOf, new C71363Ez(r4));
        }
        Object obj = concurrentHashMap.get(valueOf);
        C17960vV.A07(obj);
        return (C71363Ez) obj;
    }

    public static C71363Ez A01(C25571Os r3, C59982nC r4) {
        ConcurrentHashMap concurrentHashMap = r3.A08;
        StringBuilder sb = new StringBuilder();
        sb.append(r4.A01);
        sb.append(":");
        sb.append(r3.A02(r4.A00));
        Integer valueOf = Integer.valueOf(Math.abs(sb.toString().hashCode()) % 32);
        if (!concurrentHashMap.containsKey(valueOf)) {
            concurrentHashMap.putIfAbsent(valueOf, new C71363Ez(r3));
        }
        Object obj = concurrentHashMap.get(valueOf);
        C17960vV.A07(obj);
        return (C71363Ez) obj;
    }

    private String A02(C60002nE r5) {
        int i = r5.A01;
        if (!(i == 0 || i == 3)) {
            try {
                String str = r5.A03;
                Parcelable.Creator creator = AnonymousClass1E2.CREATOR;
                PhoneUserJid A0D = this.A03.A00.A0D(C42501yH.A01(str));
                if (A0D != null) {
                    r5 = C63962tz.A02(DeviceJid.Companion.A03(A0D, r5.A00));
                }
            } catch (AnonymousClass11T e) {
                if (C18020vd.A05(C18040vf.A02, this.A04, 7495)) {
                    try {
                        String str2 = r5.A03;
                        Parcelable.Creator creator2 = AnonymousClass1ED.CREATOR;
                        C50232Tq.A00(str2);
                    } catch (AnonymousClass11T unused) {
                    }
                }
                Log.e("SignalLocks/getPhoneNumberSignalAddressIfAvailable", e);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5.A03);
        sb.append(".");
        sb.append(r5.A01);
        return sb.toString();
    }

    public static void A03(C71363Ez r3, C25571Os r4) {
        C218717s r0 = r4.A02;
        if (r0 == null || !r0.A00()) {
            if (C18020vd.A05(C18040vf.A02, r4.A04, 4831)) {
                r4.A04(new HashSet(Collections.singleton(r3)));
                return;
            }
        }
        r3.lock();
    }

    private boolean A06(Set set) {
        boolean z;
        synchronized (this.A07) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Lock lock = (Lock) it.next();
                if (!lock.tryLock()) {
                    break;
                }
                hashSet.add(lock);
            }
            z = true;
            if (hashSet.size() != set.size()) {
                z = false;
                A05(hashSet);
            }
        }
        return z;
    }

    public C71363Ez A07() {
        C60002nE r3;
        AnonymousClass11S r0 = this.A01;
        r0.A0I();
        AnonymousClass1E3 r02 = r0.A02;
        if (r02 != null) {
            r3 = C63962tz.A02(r02);
        } else {
            r3 = new C60002nE(AnonymousClass00R.A00, "", 0, 0);
        }
        C71363Ez A002 = A00(r3, this);
        A03(A002, this);
        return A002;
    }

    public C71363Ez A08(DeviceJid deviceJid) {
        C71363Ez A002 = A00(C63962tz.A02(deviceJid.userJid.getPrimaryDevice()), this);
        A03(A002, this);
        return A002;
    }

    public C25571Os(AnonymousClass190 r2, AnonymousClass11S r3, C218717s r4, C25501Ol r5, C18030ve r6) {
        this.A04 = r6;
        this.A00 = r2;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
    }

    private void A04(Set set) {
        if (!A06(set)) {
            HashMap hashMap = new HashMap();
            for (Map.Entry value : this.A06.entrySet()) {
                ReentrantLock reentrantLock = (ReentrantLock) value.getValue();
                if (reentrantLock.isHeldByCurrentThread()) {
                    hashMap.put(reentrantLock, Integer.valueOf(reentrantLock.getHoldCount()));
                }
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                for (int i = 0; i < ((Number) entry.getValue()).intValue(); i++) {
                    ((Lock) entry.getKey()).unlock();
                }
            }
            set.addAll(hashMap.keySet());
            while (!A06(set)) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                List list = this.A05;
                list.add(countDownLatch);
                try {
                    countDownLatch.await(10, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
                list.remove(countDownLatch);
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                for (int i2 = 0; i2 < ((Number) entry2.getValue()).intValue() - 1; i2++) {
                    ((Lock) entry2.getKey()).lock();
                }
            }
        }
    }

    public static void A05(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((Lock) it.next()).unlock();
        }
    }

    public HashSet A09(Set set) {
        if (set.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(A00((C60002nE) it.next(), this));
        }
        return hashSet;
    }

    public void A0A(Set set) {
        if (set.size() == 1) {
            A03((C71363Ez) set.iterator().next(), this);
            return;
        }
        C218717s r0 = this.A02;
        if (r0 == null || !r0.A00()) {
            if (C18020vd.A05(C18040vf.A02, this.A04, 4831)) {
                A04(new HashSet(set));
                return;
            }
        }
        while (!A06(set)) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            List list = this.A05;
            list.add(countDownLatch);
            try {
                countDownLatch.await(10, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
            }
            list.remove(countDownLatch);
        }
    }
}
