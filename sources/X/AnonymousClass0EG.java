package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.LayoutIdElement;

/* renamed from: X.0EG  reason: invalid class name */
public abstract class AnonymousClass0EG {
    public static final void A00(AnonymousClass0tB r38, C17130tn r39, C17090tj r40, AnonymousClass1OS r41, AnonymousClass1OS r42, AnonymousClass1OS r43, AnonymousClass1OS r44, AnonymousClass1OS r45, AnonymousClass1OS r46, AnonymousClass1OS r47, AnonymousClass1OS r48, C36001nB r49, float f, int i, int i2, boolean z) {
        int i3;
        int i4;
        C17090tj r37 = r40;
        C18070vi.A0d(r37, 0);
        AnonymousClass1OS r36 = r41;
        C18070vi.A0d(r36, 1);
        AnonymousClass1OS r35 = r47;
        C18070vi.A0d(r35, 10);
        C18070vi.A0d(r38, 12);
        C17130tn r8 = r39;
        r8.COC(-1830307184);
        int i5 = i;
        if ((i & 14) == 0) {
            i3 = AnonymousClass001.A0Z(r8, r37) | i;
        } else {
            i3 = i5;
        }
        if ((i & 112) == 0) {
            i3 |= AnonymousClass001.A0b(r8, r36);
        }
        AnonymousClass1OS r21 = r42;
        if ((i5 & 896) == 0) {
            i3 |= AnonymousClass001.A0c(r8, r21);
        }
        C36001nB r22 = r49;
        if ((i5 & 7168) == 0) {
            i3 |= AnonymousClass001.A0d(r8, r22);
        }
        AnonymousClass1OS r23 = r43;
        if ((57344 & i) == 0) {
            i3 |= AnonymousClass000.A08(r8.BEh(r23) ? 1 : 0);
        }
        AnonymousClass1OS r24 = r44;
        if ((458752 & i) == 0) {
            i3 |= AnonymousClass001.A0e(r8, r24);
        }
        AnonymousClass1OS r25 = r45;
        if ((3670016 & i) == 0) {
            i3 |= AnonymousClass001.A0f(r8, r25);
        }
        AnonymousClass1OS r26 = r46;
        if ((29360128 & i) == 0) {
            i3 |= AnonymousClass001.A0g(r8, r26);
        }
        boolean z2 = z;
        if ((234881024 & i) == 0) {
            i3 |= AnonymousClass000.A07(r8.BEg(z2) ? 1 : 0);
        }
        float f2 = f;
        if ((1879048192 & i) == 0) {
            i3 |= AnonymousClass000.A06(r8.BEc(f2) ? 1 : 0);
        }
        int i6 = i2;
        if ((i2 & 14) == 0) {
            i4 = AnonymousClass000.A09(r8.BEh(r35) ? 1 : 0) | i2;
        } else {
            i4 = i6;
        }
        AnonymousClass1OS r28 = r48;
        if ((i2 & 112) == 0) {
            i4 |= AnonymousClass001.A0b(r8, r28);
        }
        if ((i6 & 896) == 0) {
            i4 |= AnonymousClass001.A0S(r8, r38);
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 731) == 146 && r8.BZO()) {
            r8.CNR();
        } else {
            boolean A1a = AnonymousClass001.A1a(r8, Boolean.valueOf(z2), Float.valueOf(f2), 1618982084) | r8.BEf(r38);
            Object CER = r8.CER();
            if (A1a || CER == AnonymousClass0MH.A00) {
                CER = new AnonymousClass0X8(r38, f2, z2);
                r8.CRH(CER);
            }
            AnonymousClass0VR r6 = (AnonymousClass0VR) r8;
            AnonymousClass0VR.A0R(r6, false);
            AnonymousClass07W r5 = AnonymousClass0OD.A06;
            C24246By4 by4 = (C24246By4) r8.BFh(r5);
            r8.COB(-1323940314);
            AnonymousClass07W r4 = AnonymousClass0OD.A01;
            Object BFh = r8.BFh(r4);
            Object BFh2 = r8.BFh(r5);
            AnonymousClass07W r3 = AnonymousClass0OD.A0B;
            Object BFh3 = r8.BFh(r3);
            C18090vk A00 = C05030Qc.A00();
            AnonymousClass04D A002 = AnonymousClass0LO.A00(r37);
            int A0O = AnonymousClass001.A0O(r8, (i3 << 3) & 112);
            if (r6.A0K) {
                r8.BHe(A00);
            } else {
                r8.CRc();
            }
            AnonymousClass1OS A04 = C05030Qc.A04();
            AnonymousClass0EM.A00(r8, CER, A04);
            AnonymousClass1OS A02 = C05030Qc.A02();
            AnonymousClass0EM.A00(r8, BFh, A02);
            AnonymousClass1OS A03 = C05030Qc.A03();
            AnonymousClass0EM.A00(r8, BFh2, A03);
            AnonymousClass1OS A07 = C05030Qc.A07();
            AnonymousClass0EM.A00(r8, BFh3, A07);
            A002.invoke(new AnonymousClass0OT(r8), r8, AnonymousClass000.A0q(A0O));
            r8.COB(2058660585);
            r35.invoke(r8, AnonymousClass000.A0p(i4));
            r8.COB(-95272008);
            if (r43 != null) {
                C17090tj CP5 = new LayoutIdElement("Leading").CP5(AnonymousClass0PE.A01);
                Alignment alignment = AnonymousClass0MX.A05;
                r8.COB(733328855);
                C16870tM A003 = C04870Pg.A00(r8, alignment, false);
                Object A1D = AnonymousClass001.A1D(r8, r4);
                Object BFh4 = r8.BFh(r5);
                Object BFh5 = r8.BFh(r3);
                AnonymousClass04D A004 = AnonymousClass0LO.A00(CP5);
                int A0O2 = AnonymousClass001.A0O(r8, (48 << 3) & 112);
                if (r6.A0K) {
                    r8.BHe(A00);
                } else {
                    r8.CRc();
                }
                r6.A0O = false;
                AnonymousClass0EM.A00(r8, A003, A04);
                AnonymousClass0EM.A00(r8, A1D, A02);
                AnonymousClass0EM.A00(r8, BFh4, A03);
                AnonymousClass0EM.A00(r8, BFh5, A07);
                A004.invoke(AnonymousClass0OT.A00(r8), r8, AnonymousClass001.A14(A0O2));
                r8.COB(2058660585);
                r23.invoke(r8, AnonymousClass000.A0p(i3 >> 12));
                AnonymousClass0VR.A0K(r6);
            }
            AnonymousClass0VR.A0R(r6, false);
            r8.COB(-95271673);
            if (r44 != null) {
                C17090tj CP52 = new LayoutIdElement("Trailing").CP5(AnonymousClass0PE.A01);
                Alignment alignment2 = AnonymousClass0MX.A05;
                r8.COB(733328855);
                C16870tM A005 = C04870Pg.A00(r8, alignment2, false);
                Object A1D2 = AnonymousClass001.A1D(r8, r4);
                Object BFh6 = r8.BFh(r5);
                Object BFh7 = r8.BFh(r3);
                AnonymousClass04D A006 = AnonymousClass0LO.A00(CP52);
                int A0O3 = AnonymousClass001.A0O(r8, (48 << 3) & 112);
                if (r6.A0K) {
                    r8.BHe(A00);
                } else {
                    r8.CRc();
                }
                r6.A0O = false;
                AnonymousClass0EM.A00(r8, A005, A04);
                AnonymousClass0EM.A00(r8, A1D2, A02);
                AnonymousClass0EM.A00(r8, BFh6, A03);
                AnonymousClass0EM.A00(r8, BFh7, A07);
                A006.invoke(AnonymousClass0OT.A00(r8), r8, AnonymousClass001.A14(A0O3));
                r8.COB(2058660585);
                r24.invoke(r8, AnonymousClass000.A0p(i3 >> 15));
                AnonymousClass0VR.A0K(r6);
            }
            AnonymousClass0VR.A0R(r6, false);
            AnonymousClass0tB r0 = r38;
            float A01 = AnonymousClass0Q7.A01(r0, by4);
            float A007 = AnonymousClass0Q7.A00(r0, by4);
            if (r43 != null) {
                A01 -= 12.0f;
                if (A01 < 0.0f) {
                    A01 = 0.0f;
                }
            }
            if (r44 != null) {
                A007 -= 12.0f;
                if (A007 < 0.0f) {
                    A007 = 0.0f;
                }
            }
            r8.COB(-95270733);
            if (r45 != null) {
                C17090tj A06 = AnonymousClass0Q7.A06(C05130Qo.A03(AnonymousClass0MX.A03, AnonymousClass0WA.A00("Prefix")), A01, 0.0f, 2.0f, 0.0f);
                C16870tM A008 = C04870Pg.A00(r8, AnonymousClass000.A0c(r8), false);
                Object A1D3 = AnonymousClass001.A1D(r8, r4);
                Object BFh8 = r8.BFh(r5);
                Object BFh9 = r8.BFh(r3);
                AnonymousClass04D A009 = AnonymousClass0LO.A00(A06);
                r8.COE();
                if (r6.A0K) {
                    r8.BHe(A00);
                } else {
                    r8.CRc();
                }
                r6.A0O = false;
                AnonymousClass0EM.A00(r8, A008, A04);
                AnonymousClass0EM.A00(r8, A1D3, A02);
                AnonymousClass0EM.A00(r8, BFh8, A03);
                AnonymousClass0EM.A00(r8, BFh9, A07);
                A009.invoke(AnonymousClass0OT.A00(r8), r8, AnonymousClass001.A14(6));
                r8.COB(2058660585);
                r25.invoke(r8, AnonymousClass000.A0p(i3 >> 18));
                AnonymousClass0VR.A0K(r6);
            }
            AnonymousClass0VR.A0R(r6, false);
            r8.COB(-95270334);
            if (r46 != null) {
                C17090tj A062 = AnonymousClass0Q7.A06(C05130Qo.A03(AnonymousClass0MX.A03, AnonymousClass0WA.A00("Suffix")), 2.0f, 0.0f, A007, 0.0f);
                C16870tM A0010 = C04870Pg.A00(r8, AnonymousClass000.A0c(r8), false);
                Object A1D4 = AnonymousClass001.A1D(r8, r4);
                Object BFh10 = r8.BFh(r5);
                Object BFh11 = r8.BFh(r3);
                AnonymousClass04D A0011 = AnonymousClass0LO.A00(A062);
                int A0O4 = AnonymousClass001.A0O(r8, (0 << 3) & 112);
                if (r6.A0K) {
                    r8.BHe(A00);
                } else {
                    r8.CRc();
                }
                r6.A0O = false;
                AnonymousClass0EM.A00(r8, A0010, A04);
                AnonymousClass0EM.A00(r8, A1D4, A02);
                AnonymousClass0EM.A00(r8, BFh10, A03);
                AnonymousClass0EM.A00(r8, BFh11, A07);
                A0011.invoke(AnonymousClass0OT.A00(r8), r8, AnonymousClass001.A14(A0O4));
                r26.invoke(r8, AnonymousClass001.A15(r8, i3));
                AnonymousClass0VR.A0K(r6);
            }
            AnonymousClass0VR.A0R(r6, false);
            r8.COB(-95269936);
            if (r42 != null) {
                C17090tj A063 = AnonymousClass0Q7.A06(C05130Qo.A03(AnonymousClass0MX.A03, C05130Qo.A0A(new LayoutIdElement("Label"), AnonymousClass001.A00(f2, 24.0f, 16.0f), Float.NaN)), A01, 0.0f, A007, 0.0f);
                C16870tM A0012 = C04870Pg.A00(r8, AnonymousClass000.A0c(r8), false);
                Object A1D5 = AnonymousClass001.A1D(r8, r4);
                Object BFh12 = r8.BFh(r5);
                Object BFh13 = r8.BFh(r3);
                AnonymousClass04D A0013 = AnonymousClass0LO.A00(A063);
                int A0O5 = AnonymousClass001.A0O(r8, (0 << 3) & 112);
                if (r6.A0K) {
                    r8.BHe(A00);
                } else {
                    r8.CRc();
                }
                r6.A0O = false;
                AnonymousClass0EM.A00(r8, A0012, A04);
                AnonymousClass0EM.A00(r8, A1D5, A02);
                AnonymousClass0EM.A00(r8, BFh12, A03);
                AnonymousClass0EM.A00(r8, BFh13, A07);
                A0013.invoke(AnonymousClass0OT.A00(r8), r8, AnonymousClass001.A14(A0O5));
                r8.COB(2058660585);
                r21.invoke(r8, AnonymousClass000.A0p(i3 >> 6));
                AnonymousClass0VR.A0K(r6);
            }
            AnonymousClass0VR.A0R(r6, false);
            C17090tj A0A = C05130Qo.A0A(C17090tj.A00, 24.0f, Float.NaN);
            C16340s6 r13 = AnonymousClass0MX.A03;
            C17090tj A032 = C05130Qo.A03(r13, A0A);
            if (r45 != null) {
                A01 = 0.0f;
            }
            if (r46 != null) {
                A007 = 0.0f;
            }
            C17090tj A064 = AnonymousClass0Q7.A06(A032, A01, 0.0f, A007, 0.0f);
            r8.COB(-95269212);
            if (r49 != null) {
                r22.invoke(new LayoutIdElement("Hint").CP5(A064), r8, Integer.valueOf((i3 >> 6) & 112));
            }
            AnonymousClass0VR.A0R(r6, false);
            C17090tj CP53 = new LayoutIdElement("TextField").CP5(A064);
            Alignment A0c = AnonymousClass000.A0c(r8);
            C16870tM A0014 = C04870Pg.A00(r8, A0c, true);
            Object A1D6 = AnonymousClass001.A1D(r8, r4);
            Object BFh14 = r8.BFh(r5);
            Object BFh15 = r8.BFh(r3);
            AnonymousClass04D A0015 = AnonymousClass0LO.A00(CP53);
            int A0O6 = AnonymousClass001.A0O(r8, (384 << 3) & 112);
            if (r6.A0K) {
                r8.BHe(A00);
            } else {
                r8.CRc();
            }
            r6.A0O = false;
            AnonymousClass0EM.A00(r8, A0014, A04);
            AnonymousClass1OS r15 = A02;
            AnonymousClass0EM.A00(r8, A1D6, r15);
            AnonymousClass0EM.A00(r8, BFh14, A03);
            AnonymousClass0EM.A00(r8, BFh15, A07);
            A0015.invoke(AnonymousClass0OT.A00(r8), r8, Integer.valueOf((A0O6 >> 3) & 112));
            r8.COB(2058660585);
            r36.invoke(r8, AnonymousClass000.A0p(i3 >> 3));
            boolean z3 = false;
            boolean A0Y = AnonymousClass0VR.A0Y(r6);
            r8.COB(243142693);
            if (r48 != null) {
                C17090tj A033 = AnonymousClass0Q7.A03(r8, r13);
                C16870tM A0016 = C04870Pg.A00(r8, A0c, false);
                Object A1D7 = AnonymousClass001.A1D(r8, r4);
                Object BFh16 = r8.BFh(r5);
                Object BFh17 = r8.BFh(r3);
                AnonymousClass04D A0017 = AnonymousClass0LO.A00(A033);
                int A0O7 = AnonymousClass001.A0O(r8, (0 << 3) & 112);
                if (r6.A0K) {
                    r8.BHe(A00);
                } else {
                    r8.CRc();
                }
                r6.A0O = false;
                AnonymousClass0EM.A00(r8, A0016, A04);
                AnonymousClass0EM.A00(r8, A1D7, r15);
                AnonymousClass0EM.A00(r8, BFh16, A03);
                AnonymousClass0EM.A00(r8, BFh17, A07);
                A0017.invoke(AnonymousClass0OT.A00(r8), r8, Integer.valueOf((A0O7 >> 3) & 112));
                r8.COB(2058660585);
                r28.invoke(r8, AnonymousClass000.A0p(i4 >> 3));
                z3 = false;
                AnonymousClass0VR.A0Q(r6, A0Y);
            }
            AnonymousClass0VR.A0R(r6, z3);
            AnonymousClass0VR.A0R(r6, z3);
            AnonymousClass0VR.A0R(r6, A0Y);
            AnonymousClass0VR.A0R(r6, z3);
        }
        C05660Vf BKF = r8.BKF();
        if (BKF != null) {
            BKF.A03(new C13850o4(r38, r37, r36, r21, r23, r24, r25, r26, r35, r28, r22, f2, i5, i6, z2));
        }
    }
}
