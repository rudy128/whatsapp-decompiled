package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

@Deprecated
/* renamed from: X.Cbz  reason: case insensitive filesystem */
public abstract class C25260Cbz {
    public static final Set A00 = Collections.newSetFromMap(new WeakHashMap());

    public BZL A03(BZL bzl) {
        if (this instanceof BZA) {
            C26126Cso.A03(((BZA) this).A00, bzl, 1);
            return bzl;
        }
        BZB bzb = (BZB) this;
        Map map = bzb.A0D;
        C24924CPx cPx = bzl.A01;
        boolean containsKey = map.containsKey(bzl.A00);
        String str = cPx.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GoogleApiClient is not configured to use ");
        A10.append(str);
        C18210vx.A07(containsKey, AnonymousClass000.A0y(" required for this call.", A10));
        Lock lock = bzb.A0G;
        lock.lock();
        try {
            EA7 ea7 = bzb.A01;
            if (ea7 != null) {
                if (bzb.A0K) {
                    Queue queue = bzb.A0F;
                    queue.add(bzl);
                    while (!queue.isEmpty()) {
                        BZL bzl2 = (BZL) queue.remove();
                        C25541Che che = bzb.A09;
                        che.A01.add(bzl2);
                        bzl2.A09.set(che.A00);
                        bzl2.CIq(Status.A06);
                    }
                } else {
                    bzl = ea7.CSn(bzl);
                }
                return bzl;
            }
            throw AnonymousClass000.A0n("GoogleApiClient is not connected yet.");
        } finally {
            lock.unlock();
        }
    }

    public void A04() {
        boolean z;
        if (this instanceof BZA) {
            throw BE6.A0v("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        }
        BZB bzb = (BZB) this;
        Lock lock = bzb.A0G;
        lock.lock();
        try {
            Set set = bzb.A09.A01;
            for (BasePendingResult basePendingResult : (BasePendingResult[]) set.toArray(new BasePendingResult[0])) {
                basePendingResult.A09.set((Object) null);
                synchronized (basePendingResult.A05) {
                    if (((C25260Cbz) basePendingResult.A06.get()) == null || !basePendingResult.A03) {
                        basePendingResult.A04();
                    }
                    z = basePendingResult.A02;
                }
                if (z) {
                    set.remove(basePendingResult);
                }
            }
            EA7 ea7 = bzb.A01;
            if (ea7 != null) {
                ea7.CSt();
            }
            Set<CWD> set2 = bzb.A08.A00;
            for (CWD cwd : set2) {
                cwd.A02 = null;
                cwd.A01 = null;
            }
            set2.clear();
            Queue<BZL> queue = bzb.A0F;
            for (BZL bzl : queue) {
                bzl.A09.set((Object) null);
                bzl.A04();
            }
            queue.clear();
            if (bzb.A01 != null) {
                bzb.A09();
                C26371CyX cyX = bzb.A0B;
                cyX.A08 = false;
                cyX.A07.incrementAndGet();
            }
        } finally {
            lock.unlock();
        }
    }

    public void A05(BZL bzl) {
        if (this instanceof BZA) {
            C26126Cso.A03(((BZA) this).A00, bzl, 0);
            return;
        }
        BZB bzb = (BZB) this;
        C24924CPx cPx = bzl.A01;
        boolean containsKey = bzb.A0D.containsKey(bzl.A00);
        String str = cPx.A02;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GoogleApiClient is not configured to use ");
        A10.append(str);
        C18210vx.A07(containsKey, AnonymousClass000.A0y(" required for this call.", A10));
        Lock lock = bzb.A0G;
        lock.lock();
        try {
            EA7 ea7 = bzb.A01;
            if (ea7 == null) {
                bzb.A0F.add(bzl);
            } else {
                ea7.CSm(bzl);
            }
        } finally {
            lock.unlock();
        }
    }

    public boolean A06() {
        if (this instanceof BZA) {
            throw BE6.A0v("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        }
        EA7 ea7 = ((BZB) this).A01;
        if (ea7 == null || !ea7.CSw()) {
            return false;
        }
        return true;
    }

    public void A07() {
        throw BE6.A0v("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
    }
}
