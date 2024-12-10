package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.BPv  reason: case insensitive filesystem */
public final class C22807BPv extends DDR implements EDC, E4Z {
    public static final LinkedHashMap A0B = C17880vN.A13();
    public int A00;
    public final Handler A01;
    public final E49 A02;
    public final C25639CjS A03;
    public final EDJ A04;
    public final C25675Ck6 A05;
    public final C26376Cyc A06;
    public final C26375Cyb A07;
    public volatile E4A A08;
    public volatile EAL A09;
    public volatile CountDownLatch A0A;

    public C22807BPv(C28592E9h e9h) {
        EDJ edj;
        boolean z;
        boolean z2;
        this.A00 = e9h;
        C9Z c9z = EDJ.A00;
        C26159CtX.A01(e9h);
        if (e9h.BeM(c9z)) {
            edj = (EDJ) DDR.A09(this, c9z);
        } else {
            edj = null;
        }
        this.A04 = edj;
        this.A02 = (E49) DDR.A0A(this, EBD.A0D);
        C25313CdJ cdJ = EBD.A07;
        Object A0h = AnonymousClass000.A0h();
        boolean A0B2 = DDR.A0B(this, cdJ, A0h);
        CK7 ck7 = new CK7();
        C9S c9s = C25517ChF.A02;
        C25313CdJ cdJ2 = EBD.A02;
        Object obj = C25675Ck6.A05;
        Object A0A2 = DDR.A0A(this, cdJ2);
        obj = A0A2 != null ? A0A2 : obj;
        Map map = ck7.A00;
        map.put(c9s, obj);
        C9S c9s2 = C25517ChF.A07;
        C25313CdJ cdJ3 = EBD.A0E;
        Object A0j = C17880vN.A0j();
        Object A0A3 = DDR.A0A(this, cdJ3);
        map.put(c9s2, A0A3 != null ? A0A3 : A0j);
        C9S c9s3 = C25517ChF.A01;
        Object obj2 = A0h;
        Object A0A4 = DDR.A0A(this, EBD.A01);
        map.put(c9s3, A0A4 != null ? A0A4 : obj2);
        C9S c9s4 = C25517ChF.A04;
        Object obj3 = A0h;
        Object A0A5 = DDR.A0A(this, EBD.A09);
        map.put(c9s4, A0A5 != null ? A0A5 : obj3);
        map.put(C25517ChF.A0B, DDR.A0A(this, EBD.A03));
        C9S c9s5 = C25517ChF.A05;
        boolean z3 = true;
        boolean z4 = true;
        Object obj4 = true;
        Object A0A6 = DDR.A0A(this, EBD.A0B);
        map.put(c9s5, A0A6 != null ? A0A6 : obj4);
        C9S c9s6 = C25517ChF.A09;
        Object A0A7 = DDR.A0A(this, EBD.A0F);
        map.put(c9s6, A0A7 != null ? A0A7 : z4);
        C9S c9s7 = C25517ChF.A03;
        Object obj5 = A0h;
        Object A0A8 = DDR.A0A(this, EBD.A04);
        map.put(c9s7, A0A8 != null ? A0A8 : obj5);
        C9S c9s8 = C25517ChF.A0D;
        if (!A0B2) {
            A00(this, EDH.A00);
            z = false;
        } else {
            z = true;
        }
        BE7.A1J(c9s8, map, z);
        C9S c9s9 = C25517ChF.A0C;
        if (!A0B2) {
            A00(this, EDH.A00);
            z2 = false;
        } else {
            z2 = true;
        }
        BE7.A1J(c9s9, map, z2);
        C9S c9s10 = C25517ChF.A0E;
        if (!A0B2) {
            A00(this, EDH.A00);
            z3 = false;
        }
        BE7.A1J(c9s10, map, z3);
        C9S c9s11 = C25517ChF.A08;
        C9Z c9z2 = EDH.A00;
        A00(this, c9z2);
        map.put(c9s11, A0h);
        C9S c9s12 = C25517ChF.A06;
        A00(this, c9z2);
        map.put(c9s12, A0h);
        if (!DDR.A0B(this, EBD.A08, A0h)) {
            A00(this, c9z2);
        } else {
            Looper looper = ((EDI) DDR.A09(this, EDI.A00)).BSH("Lite-GPU-Monitor-Thread").getLooper();
            C18070vi.A0X(looper);
            map.put(C25517ChF.A0A, looper);
        }
        Context A062 = DDR.A06(this);
        C25517ChF chF = new C25517ChF(ck7);
        C25313CdJ cdJ4 = EBD.A0A;
        Object obj6 = new Object();
        Object A0A9 = DDR.A0A(this, cdJ4);
        C25675Ck6 ck6 = new C25675Ck6(A062, new CJN(this), chF, (C9Y) (A0A9 != null ? A0A9 : obj6));
        this.A05 = ck6;
        C25313CdJ cdJ5 = EBD.A00;
        Object cjS = new C25639CjS();
        Object A0A10 = DDR.A0A(this, cdJ5);
        C25639CjS cjS2 = (C25639CjS) (A0A10 != null ? A0A10 : cjS);
        this.A03 = cjS2;
        Handler A002 = C8P.A00(e9h);
        this.A01 = A002;
        C26045Cr9 A003 = ck6.A00(A002.getLooper());
        A003.A07.A00 = new CJO(this);
        boolean A0B3 = DDR.A0B(this, EB0.A00, A0h);
        EAL eal = this.A09;
        if (eal == null) {
            eal = new DE7(this);
            this.A09 = eal;
        }
        C26376Cyc cyc = new C26376Cyc(cjS2, A003, eal, A0B3);
        this.A06 = cyc;
        this.A07 = new C26375Cyb(new C25841Cmv(this.A03, this.A04, cyc.A04), cyc);
        EDG edg = (EDG) DDR.A0A(this, EBD.A0C);
        if (edg != null) {
            this.A06.A01(edg);
        }
    }

    public static void A00(DDR ddr, C9Z c9z) {
        C28592E9h e9h = ddr.A00;
        C26159CtX.A01(e9h);
        if (e9h.BeM(c9z)) {
            C28592E9h e9h2 = ddr.A00;
            C26159CtX.A01(e9h2);
            e9h2.BP8(c9z);
        }
    }

    public static final void A01(C22807BPv bPv, BUP bup) {
        String str;
        EDJ edj = bPv.A04;
        if (edj != null) {
            Throwable cause = bup.getCause();
            if ((cause instanceof Error) || (cause instanceof RuntimeException)) {
                str = "high";
            } else {
                str = "medium";
            }
            edj.BiR(bup, str, BE6.A0O(bPv));
        }
    }

    public String BR9() {
        return "MediaGraphControllerImpl";
    }

    public C22892BUd BTg() {
        return EDC.A01;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.C5c, java.lang.Object] */
    public void CRF(int i, int i2, int i3, int i4, boolean z) {
        C26376Cyc cyc = this.A07.A01;
        SparseArray sparseArray = cyc.A02;
        ? obj = new Object();
        int i5 = i;
        obj.A01 = i;
        int i6 = i2;
        obj.A00 = i2;
        int i7 = i3;
        obj.A03 = i3;
        int i8 = i4;
        obj.A02 = i4;
        boolean z2 = z;
        obj.A04 = z;
        sparseArray.put(0, obj);
        EDG edg = cyc.A00;
        if (edg != null) {
            try {
                edg.CRE(0, i5, i6, i7, i8, z2);
            } catch (Exception e) {
                cyc.A05.Bxp(e);
            }
        }
    }
}
