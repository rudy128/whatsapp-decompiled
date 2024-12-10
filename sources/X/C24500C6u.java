package X;

/* renamed from: X.C6u  reason: case insensitive filesystem */
public abstract class C24500C6u {
    public static final C26251Cvq A00(C26251Cvq cvq, C24246By4 by4) {
        int i;
        int i2;
        float f;
        C26251Cvq cvq2 = C26251Cvq.A03;
        C26251Cvq cvq3 = cvq;
        C26053CrN crN = cvq3.A02;
        long j = C26095CsF.A00;
        EBX ebx = crN.A0D;
        if (ebx.equals(D6B.A00)) {
            ebx = C25969Cpb.A00(C26095CsF.A01);
        }
        long j2 = crN.A01;
        if (C26054CrP.A03(j2)) {
            j2 = C26095CsF.A02;
        }
        DSF dsf = crN.A09;
        if (dsf == null) {
            dsf = DSF.A03;
        }
        C25823Cma cma = crN.A07;
        if (cma != null) {
            i = cma.A00;
        } else {
            i = 0;
        }
        C25823Cma cma2 = new C25823Cma(i);
        C25824Cmb cmb = crN.A08;
        if (cmb != null) {
            i2 = cmb.A00;
        } else {
            i2 = 1;
        }
        C25824Cmb cmb2 = new C25824Cmb(i2);
        C24693CGf cGf = crN.A06;
        if (cGf == null) {
            cGf = C24693CGf.A01;
        }
        String str = crN.A0F;
        if (str == null) {
            str = "";
        }
        long j3 = crN.A02;
        if (C26054CrP.A03(j3)) {
            j3 = C26095CsF.A03;
        }
        C25825Cmc cmc = crN.A0B;
        if (cmc != null) {
            f = cmc.A00;
        } else {
            f = 0.0f;
        }
        C25825Cmc cmc2 = new C25825Cmc(f);
        C26040Cr4 cr4 = crN.A0E;
        if (cr4 == null) {
            cr4 = C26040Cr4.A02;
        }
        DUE due = crN.A0A;
        if (due == null) {
            due = CE6.A00.BPq();
        }
        long j4 = crN.A00;
        if (j4 == C05100Qk.A05) {
            j4 = C26095CsF.A00;
        }
        C25827Cme cme = crN.A0C;
        if (cme == null) {
            cme = C25827Cme.A02;
        }
        AnonymousClass0NG r1 = crN.A03;
        if (r1 == null) {
            r1 = AnonymousClass0NG.A03;
        }
        C25706Ckc ckc = crN.A05;
        C02000Cg r0 = crN.A04;
        if (r0 == null) {
            r0 = C016909m.A00;
        }
        AnonymousClass0NG r21 = r1;
        C02000Cg r22 = r0;
        C24693CGf cGf2 = cGf;
        C25823Cma cma3 = cma2;
        C26053CrN crN2 = new C26053CrN(r21, r22, ckc, cGf2, cma3, cmb2, dsf, due, cmc2, cme, ebx, cr4, str, j2, j3, j4);
        C26038Cqy cqy = cvq3.A00;
        long j5 = CE3.A00;
        int i3 = cqy.A02;
        if (i3 == Integer.MIN_VALUE) {
            i3 = 5;
        }
        int i4 = cqy.A03;
        if (AnonymousClass000.A1T(i4, 3)) {
            int ordinal = by4.ordinal();
            if (ordinal == 0) {
                i4 = 4;
            } else if (ordinal == 1) {
                i4 = 5;
            } else {
                throw AnonymousClass3MW.A14();
            }
        } else if (i4 == Integer.MIN_VALUE) {
            int ordinal2 = by4.ordinal();
            if (ordinal2 == 0) {
                i4 = 1;
            } else if (ordinal2 == 1) {
                i4 = 2;
            } else {
                throw AnonymousClass3MW.A14();
            }
        }
        long j6 = cqy.A04;
        if (C26054CrP.A03(j6)) {
            j6 = CE3.A00;
        }
        C25779Clq clq = cqy.A06;
        if (clq == null) {
            clq = C25779Clq.A02;
        }
        C26131Csu csu = cqy.A05;
        int i5 = cqy.A01;
        if (i5 == 0) {
            i5 = 66305;
        }
        int i6 = cqy.A00;
        if (i6 == Integer.MIN_VALUE) {
            i6 = 1;
        }
        C25784Clv clv = cqy.A07;
        if (clv == null) {
            clv = C25784Clv.A02;
        }
        return new C26251Cvq(new C26038Cqy(csu, clq, clv, i3, i4, i5, i6, j6), cvq3.A01, crN2);
    }
}
