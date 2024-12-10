package X;

import android.os.Trace;
import android.util.SparseArray;

/* renamed from: X.Cjt  reason: case insensitive filesystem */
public class C25663Cjt {
    public final SparseArray A00 = BE6.A0Q();
    public final SparseArray A01 = BE6.A0Q();
    public final C25639CjS A02;

    public void A01(EA3 ea3, EAK eak) {
        try {
            Trace.beginSection("sendOutputData");
            DDn dDn = (DDn) this.A00.get(0);
            if (dDn == null) {
                this.A02.A00(C0H.A0B);
            } else if (eak != null) {
                eak.BVx();
                EA3 A002 = DDn.A00(dDn, ea3);
                EAJ A012 = dDn.A01.A01();
                if (dDn.A02 == null) {
                    C26780DDk dDk = new C26780DDk(dDn.A04);
                    dDn.A02 = dDk;
                    dDk.BCi(A012);
                }
                dDn.A02.A00(A012, A002, eak);
            } else {
                dDn.A02(ea3);
            }
        } finally {
            Trace.endSection();
        }
    }

    public static DDn A00(C26045Cr9 cr9, C25663Cjt cjt, int i) {
        SparseArray sparseArray = cjt.A00;
        DDn dDn = (DDn) sparseArray.get(i);
        if (dDn == null) {
            synchronized (sparseArray) {
                dDn = (DDn) sparseArray.get(i);
                if (dDn == null) {
                    dDn = new DDn(cjt.A02);
                    sparseArray.put(i, dDn);
                }
            }
        }
        if (!cr9.A08.A00.contains(dDn)) {
            cr9.A03(dDn);
        }
        return dDn;
    }

    public C25663Cjt(C25639CjS cjS) {
        this.A02 = cjS;
    }
}
