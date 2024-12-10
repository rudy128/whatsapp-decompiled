package X;

import java.util.List;

/* renamed from: X.0Qj  reason: invalid class name and case insensitive filesystem */
public final class C05090Qj {
    public static final void A04(AnonymousClass0NM r5, C25146CZx cZx, EBT ebt, C22821Di r8, long j) {
        r8.invoke(C26224CvE.A00((C27069DRu) null, cZx.A00(), 5, C25858CnM.A00(ebt.CPo(r5.A01(true, j)))));
    }

    public static final void A07(C16960tV r13, C26227CvJ cvJ) {
        boolean z;
        long j;
        float f;
        C26227CvJ cvJ2 = cvJ;
        C16960tV r9 = r13;
        if (!cvJ.A0S() || cvJ.A02.A01 == 3) {
            z = false;
        } else {
            z = true;
            long j2 = cvJ.A00;
            long j3 = AnonymousClass0QY.A03;
            long A0p = AnonymousClass001.A0p(AnonymousClass000.A02(j2), (float) AnonymousClass000.A0H(j2));
            long j4 = AnonymousClass0QG.A02;
            AnonymousClass0NU A00 = C02470Ed.A00(j3, A0p);
            r13.CGe();
            r13.BF1(A00);
        }
        C26053CrN crN = cvJ.A02.A04.A02;
        C25827Cme cme = crN.A0C;
        if (cme == null) {
            cme = C25827Cme.A02;
        }
        AnonymousClass0NG r10 = crN.A03;
        if (r10 == null) {
            r10 = AnonymousClass0NG.A03;
        }
        C02000Cg r11 = crN.A04;
        if (r11 == null) {
            r11 = C016909m.A00;
        }
        try {
            EBX ebx = crN.A0D;
            C03380Hv BNh = ebx.BNh();
            if (BNh != null) {
                if (ebx != D6B.A00) {
                    f = ebx.BMz();
                } else {
                    f = 1.0f;
                }
                C75.A00(BNh, r9, r10, r11, cvJ2.A01, cme, f);
            } else {
                if (ebx != D6B.A00) {
                    j = ebx.BOw();
                } else {
                    j = C05100Qk.A01;
                }
                cvJ.A01.A08(r9, r10, r11, cme, j);
            }
        } finally {
            if (z) {
                r9.CFz();
            }
        }
    }

    public final C25246Cbl A0A(C25146CZx cZx, C26041Cr5 cr5, C26224CvE cvE, C25147CZy cZy, C22821Di r11, C22821Di r12) {
        return A00(cZx, cr5, cvE, cZy, r11, r12);
    }

    public static final C25246Cbl A00(C25146CZx cZx, C26041Cr5 cr5, C26224CvE cvE, C25147CZy cZy, C22821Di r6, C22821Di r7) {
        C98494rF r1 = new C98494rF();
        C25246Cbl A00 = cZy.A00(cr5, cvE, new C11210jf(cZx, r6, r1), r7);
        r1.element = A00;
        return A00;
    }

    public static final void A03(AnonymousClass0Q4 r4, C16910tQ r5, C26227CvJ cvJ, EBT ebt, C26224CvE cvE, C25246Cbl cbl, boolean z) {
        AnonymousClass0NU r6;
        if (z) {
            int CB1 = ebt.CB1(C26260Cw5.A01(cvE.A01()));
            if (CB1 >= cvJ.A0N().A03().length()) {
                if (CB1 != 0) {
                    CB1--;
                } else {
                    r6 = new AnonymousClass0NU(0.0f, 0.0f, 1.0f, (float) AnonymousClass000.A0H(C04550Nv.A01(r4.A06(), r4.A07(), r4.A08(), C04550Nv.A00, 1)));
                    float f = r6.A01;
                    float f2 = r6.A03;
                    long A0p = AnonymousClass001.A0p(f, f2);
                    long j = AnonymousClass0QY.A03;
                    long Bhu = r5.Bhu(A0p);
                    long A0p2 = AnonymousClass001.A0p(AnonymousClass0QY.A01(Bhu), AnonymousClass0QY.A02(Bhu));
                    long A0p3 = AnonymousClass001.A0p(r6.A02 - f, r6.A00 - f2);
                    long j2 = AnonymousClass0QG.A02;
                    cbl.A01(C02470Ed.A00(A0p2, A0p3));
                }
            }
            r6 = cvJ.A0J(CB1);
            float f3 = r6.A01;
            float f22 = r6.A03;
            long A0p4 = AnonymousClass001.A0p(f3, f22);
            long j3 = AnonymousClass0QY.A03;
            long Bhu2 = r5.Bhu(A0p4);
            long A0p22 = AnonymousClass001.A0p(AnonymousClass0QY.A01(Bhu2), AnonymousClass0QY.A02(Bhu2));
            long A0p32 = AnonymousClass001.A0p(r6.A02 - f3, r6.A00 - f22);
            long j22 = AnonymousClass0QG.A02;
            cbl.A01(C02470Ed.A00(A0p22, A0p32));
        }
    }

    public static final void A05(AnonymousClass0NM r8, EBT ebt, C26224CvE cvE, C25246Cbl cbl) {
        C16910tQ r1;
        C16910tQ r2 = r8.A01;
        if (r2 != null && r2.Be8() && (r1 = r8.A00) != null) {
            C26227CvJ A03 = r8.A03();
            C09730hC r82 = new C09730hC(r2);
            cbl.A02(AnonymousClass0E6.A00(r2), r2.Bhs(r1, false), A03, ebt, cvE, r82);
        }
    }

    public static final C25262Cc3 A01(C25262Cc3 cc3, long j) {
        EBT A01 = cc3.A01();
        int CB1 = A01.CB1(AnonymousClass000.A0G(j));
        int CB12 = A01.CB1(AnonymousClass000.A0H(j));
        int min = Math.min(CB1, CB12);
        int max = Math.max(CB1, CB12);
        C27068DRt dRt = new C27068DRt(cc3.A00());
        dRt.A03(new C26053CrN((AnonymousClass0NG) null, (C24693CGf) null, (C25823Cma) null, (C25824Cmb) null, (DSF) null, (C25825Cmc) null, C25289Ccr.A01(), (C26040Cr4) null, (String) null, 61439, 0, 0, 0, 0), min, max);
        return new C25262Cc3(dRt.A00(), A01);
    }

    public static final AnonymousClass7PS A02(AnonymousClass0Q4 r1, C26227CvJ cvJ, C24246By4 by4, long j) {
        C26227CvJ A05 = r1.A05(cvJ, by4, j);
        long A0H = A05.A0H();
        return new AnonymousClass7PS(Integer.valueOf(AnonymousClass000.A0G(A0H)), Integer.valueOf(AnonymousClass000.A0H(A0H)), A05);
    }

    public static final void A06(C16960tV r4, C16790tE r5, C26227CvJ cvJ, EBT ebt, C26224CvE cvE) {
        int CB1;
        int CB12;
        long A01 = cvE.A01();
        if (!C26260Cw5.A04(A01) && (CB1 = ebt.CB1(C26260Cw5.A02(A01))) != (CB12 = ebt.CB1(C26260Cw5.A01(A01)))) {
            r4.BJd(r5, cvJ.A0L(CB1, CB12));
        }
        A07(r4, cvJ);
    }

    public static final void A08(C25146CZx cZx, C25246Cbl cbl, List list, C22821Di r4) {
        C26224CvE A01 = cZx.A01(list);
        if (cbl != null) {
            cbl.A03((C26224CvE) null, A01);
        }
        r4.invoke(A01);
    }

    public static final void A09(C25146CZx cZx, C25246Cbl cbl, C22821Di r6) {
        r6.invoke(C26224CvE.A00((C27069DRu) null, cZx.A00(), 3, 0));
        cbl.A00();
    }
}
