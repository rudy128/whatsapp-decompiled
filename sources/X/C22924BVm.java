package X;

import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.util.AbstractList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.BVm  reason: case insensitive filesystem */
public class C22924BVm extends C26697D9v implements C28653ECn {
    public synchronized void A08(C28652ECm eCm) {
        synchronized (this) {
            this.A0F.add(eCm);
        }
    }

    public void BFG(DSC dsc, byte[] bArr) {
    }

    public synchronized long Bad(String str) {
        long j;
        synchronized (this) {
            Long l = (Long) this.A0H.get(str);
            if (l == null) {
                j = -1;
            } else {
                j = l.longValue();
            }
        }
        return j;
    }

    public byte[] CDR(DSC dsc) {
        return null;
    }

    public synchronized void CF0(DSC dsc) {
        CF1(dsc, "not_provided");
    }

    public synchronized void CF1(DSC dsc, String str) {
        HashMap hashMap = this.A0G;
        String str2 = dsc.A07;
        TreeSet treeSet = (TreeSet) hashMap.get(str2);
        long j = this.A00;
        long j2 = dsc.A04;
        this.A00 = j - j2;
        if (treeSet == null || !treeSet.remove(dsc)) {
            this.A0E.Bt8((int) dsc.A05, (int) j2, "removeSpan failed", str2);
        }
        dsc.A06.delete();
        if (treeSet != null && treeSet.isEmpty()) {
            hashMap.remove(str2);
            Set set = this.A0N;
            if (set != null) {
                set.remove(str2);
            }
        }
        A09(dsc, str);
    }

    public synchronized void CLA(String str, long j) {
        synchronized (this) {
            this.A0H.put(str, Long.valueOf(j));
        }
    }

    public synchronized DSC CO7(Integer num, String str, long j) {
        DSC CO8;
        synchronized (this) {
            CO8 = CO8(num, str, j, 0);
        }
        return CO8;
    }

    public synchronized DSC CO9(Integer num, String str, long j) {
        DSC A01;
        synchronized (this) {
            A01 = C26697D9v.A01(C26214Cut.A02(str, j), this, num);
        }
        return A01;
    }

    public void A09(DSC dsc, String str) {
        HashMap hashMap = this.A0I;
        DSC dsc2 = dsc;
        String str2 = dsc2.A07;
        AbstractList abstractList = (AbstractList) hashMap.get(str2);
        if (abstractList != null) {
            int size = abstractList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C28571E8c) abstractList.get(size)).C62(this, dsc2);
            }
        }
        C28652ECm eCm = this.A0E;
        if (eCm != null) {
            eCm.C62(this, dsc2);
        }
        Iterator it = this.A0F.iterator();
        while (it.hasNext()) {
            C28652ECm eCm2 = (C28652ECm) it.next();
            if (eCm2 instanceof C26700D9y) {
                C26700D9y d9y = (C26700D9y) eCm2;
                Tracer.A00("CacheInstrumentationListener.onSpanRemoved");
                try {
                    C25582CiM ciM = d9y.A01;
                    if (ciM != null) {
                        ciM.A01.add(new C27067DRq(C24301Byy.SPAN_REMOVED, d9y.A02, (String) null, (String) null, str2, (String) null, str, dsc2.A05, dsc2.A04, 0, 0));
                    }
                } finally {
                    Systrace.A01();
                }
            } else {
                eCm2.C62(this, dsc2);
            }
        }
    }
}
