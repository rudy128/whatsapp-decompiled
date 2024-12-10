package X;

import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.layout.OffsetPxElement;
import androidx.compose.ui.Alignment;

/* renamed from: X.0QL  reason: invalid class name */
public abstract class AnonymousClass0QL {
    public static final AnonymousClass0Tx A00 = new AnonymousClass0Tx(C02980Gd.A01, 100, 0);
    public static final float A01 = ((52.0f - 24.0f) - ((32.0f - 24.0f) / 2.0f));

    public static final C17090tj A01(C17210uI r9, C17090tj r10, AnonymousClass0JM r11, AnonymousClass0CK r12, C18090vk r13, boolean z) {
        return AnonymousClass0O1.A00(r10, AnonymousClass0PD.A02(C03870Ky.A01((C16040rc) null, r9, C17090tj.A00, r11, r13, 8, z), new C09640h3(r12), false), AnonymousClass0O1.A01());
    }

    public static final C17090tj A03(C17090tj r2, C22821Di r3) {
        return r2.CP5(new OffsetPxElement(r3, new C09530gr(r3)));
    }

    public static long A00(C17130tn r0, AnonymousClass0OI r1, float f, long j) {
        return AnonymousClass0Oy.A02(AnonymousClass0Oy.A03(AnonymousClass001.A11(j), C05100Qk.A04(j), C05100Qk.A03(j), C05100Qk.A02(j), f), ((AnonymousClass0OR) r0.BFh(r1)).A02());
    }

    public static final C17090tj A02(C17210uI r7, C17090tj r8, AnonymousClass0JM r9, C22821Di r10, boolean z, boolean z2) {
        AnonymousClass0CK r5;
        C22821Di A012 = AnonymousClass0O1.A01();
        AnonymousClass0WC r3 = C17090tj.A00;
        if (z) {
            r5 = AnonymousClass0CK.On;
        } else {
            r5 = AnonymousClass0CK.Off;
        }
        return AnonymousClass0O1.A00(r8, A01(r7, r3, r9, r5, new C08620fO(r10, z), z2), A012);
    }

    public static final void A04(C16110rj r32, C16140rm r33, AnonymousClass0J3 r34, C17130tn r35, C16300s2 r36, C16370s9 r37, AnonymousClass1OS r38, float f, float f2, float f3, int i, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        long j;
        float A06;
        long j2;
        long j3;
        long j4;
        float f4;
        C17130tn r4 = r35;
        r4.COC(-1968109941);
        int i5 = i;
        if ((i & 14) == 0) {
            i3 = AnonymousClass001.A0Z(r4, r33) | i;
        } else {
            i3 = i5;
        }
        boolean z3 = z;
        if ((i & 112) == 0) {
            i3 |= AnonymousClass000.A0A(r4.BEg(z3) ? 1 : 0);
        }
        boolean z4 = z2;
        if ((i5 & 896) == 0) {
            i3 |= AnonymousClass001.A0i(r4, z4);
        }
        AnonymousClass0J3 r5 = r34;
        if ((i5 & 7168) == 0) {
            i3 |= AnonymousClass001.A0T(r4, r5);
        }
        C16300s2 r352 = r36;
        if ((57344 & i) == 0) {
            i3 |= AnonymousClass001.A0U(r4, r352);
        }
        AnonymousClass1OS r30 = r38;
        if ((i & 458752) == 0) {
            i3 |= AnonymousClass001.A0e(r4, r30);
        }
        if ((i & 3670016) == 0) {
            i3 |= AnonymousClass001.A0W(r4, r32);
        }
        C16370s9 r362 = r37;
        if ((i & 29360128) == 0) {
            i3 |= AnonymousClass001.A0X(r4, r362);
        }
        float f5 = f;
        if ((i & 234881024) == 0) {
            i3 |= AnonymousClass000.A07(r4.BEc(f5) ? 1 : 0);
        }
        float f6 = f2;
        if ((i & 1879048192) == 0) {
            i3 |= AnonymousClass000.A06(r4.BEc(f6) ? 1 : 0);
        }
        int i6 = i2;
        float f7 = f3;
        if ((i2 & 14) == 0) {
            i4 = i2 | AnonymousClass000.A09(r4.BEc(f7) ? 1 : 0);
        } else {
            i4 = i6;
        }
        if ((i3 & 1533916891) == 306783378 && (i4 & 11) == 2 && r4.BZO()) {
            r4.CNR();
        } else {
            r4.COB(961511844);
            if (z2) {
                j = z ? r5.A03 : r5.A0F;
            } else {
                j = z ? r5.A07 : r5.A0B;
            }
            C17330uU A012 = AnonymousClass0Ou.A01(r4, new C05100Qk(j));
            AnonymousClass0VR r6 = (AnonymousClass0VR) r4;
            AnonymousClass0VR.A0R(r6, false);
            C17330uU A002 = C02270Dj.A00(r32, r4);
            AnonymousClass07W r8 = AnonymousClass0OD.A01;
            float CPF = ((C28644ECa) r4.BFh(r8)).CPF(AnonymousClass001.A06(r352));
            float f8 = 28.0f;
            if (!AnonymousClass001.A1b(A002)) {
                f8 = ((24.0f - f) * ((CPF - f2) / (f3 - f2))) + f;
            }
            r4.COB(-993794105);
            if (AnonymousClass001.A1b(A002)) {
                C28644ECa eCa = (C28644ECa) r4.BFh(r8);
                if (z) {
                    f4 = A01 - 2.0f;
                } else {
                    f4 = 2.0f;
                }
                A06 = eCa.CPQ(f4);
            } else {
                A06 = AnonymousClass001.A06(r352);
            }
            AnonymousClass0VR.A0R(r6, false);
            AnonymousClass0WV A013 = C04570Nx.A01(r4, C03080Gn.A0B);
            AnonymousClass0WC r24 = C17090tj.A00;
            Alignment alignment = AnonymousClass0MX.A05;
            C17090tj A062 = C05130Qo.A06(C05130Qo.A09(r33.BBz(alignment, r24), 52.0f), 32.0f);
            r4.COB(462653665);
            if (z2) {
                j2 = z ? r5.A00 : r5.A0C;
            } else {
                j2 = z ? r5.A04 : r5.A08;
            }
            C17330uU A014 = AnonymousClass0Ou.A01(r4, new C05100Qk(j2));
            AnonymousClass0VR.A0R(r6, false);
            C17090tj A003 = C02190Db.A00(A062.CP5(new BorderModifierNodeElement(new AnonymousClass09Y(AnonymousClass000.A0V(A014)), A013, 2.0f)), A013, AnonymousClass000.A0V(A012));
            C16870tM A004 = C04870Pg.A00(r4, AnonymousClass000.A0c(r4), false);
            Object A1D = AnonymousClass001.A1D(r4, r8);
            AnonymousClass07W r22 = AnonymousClass0OD.A06;
            Object BFh = r4.BFh(r22);
            AnonymousClass07W r21 = AnonymousClass0OD.A0B;
            Object BFh2 = r4.BFh(r21);
            C18090vk A005 = C05030Qc.A00();
            AnonymousClass04D A006 = AnonymousClass0LO.A00(A003);
            r4.COE();
            if (r6.A0K) {
                r4.BHe(A005);
            } else {
                r4.CRc();
            }
            r6.A0O = false;
            AnonymousClass1OS A04 = C05030Qc.A04();
            AnonymousClass0EM.A00(r4, A004, A04);
            AnonymousClass1OS A02 = C05030Qc.A02();
            AnonymousClass0EM.A00(r4, A1D, A02);
            AnonymousClass1OS A03 = C05030Qc.A03();
            AnonymousClass0EM.A00(r4, BFh, A03);
            AnonymousClass1OS A07 = C05030Qc.A07();
            AnonymousClass0EM.A00(r4, BFh2, A07);
            A006.invoke(AnonymousClass0OT.A00(r4), r4, 0);
            r4.COB(2058660585);
            C05540Uq r14 = C05540Uq.A00;
            r4.COB(-1539933265);
            if (z2) {
                j3 = z ? r5.A02 : r5.A0E;
            } else {
                j3 = z ? r5.A06 : r5.A0A;
            }
            C17330uU A007 = AnonymousClass0Ou.A00(r4, j3);
            AnonymousClass0VR.A0R(r6, false);
            long A0V = AnonymousClass000.A0V(A007);
            C17090tj BBz = r14.BBz(AnonymousClass0MX.A06, r24);
            boolean A1X = AnonymousClass001.A1X(r4, Float.valueOf(A06));
            Object CER = r4.CER();
            if (A1X || CER == AnonymousClass0MH.A00) {
                CER = new C10740ip(A06);
                r6.A0c(CER);
            }
            AnonymousClass0VR.A0R(r6, false);
            C17090tj A008 = C02190Db.A00(C05130Qo.A07(C03900Lb.A00(C04020Ln.A00(r4, 40.0f / 2.0f, 4), r32, A03(BBz, (C22821Di) CER)), f8), r362, A0V);
            r4.COB(733328855);
            C16870tM A009 = C04870Pg.A00(r4, alignment, false);
            r4.COB(-1323940314);
            Object BFh3 = r4.BFh(r8);
            Object BFh4 = r4.BFh(r22);
            Object BFh5 = r4.BFh(r21);
            AnonymousClass04D A0010 = AnonymousClass0LO.A00(A008);
            r4.COE();
            if (r6.A0K) {
                r4.BHe(A005);
            } else {
                r4.CRc();
            }
            r6.A0O = false;
            AnonymousClass0EM.A00(r4, A009, A04);
            AnonymousClass0EM.A00(r4, BFh3, A02);
            AnonymousClass0EM.A00(r4, BFh4, A03);
            AnonymousClass0EM.A00(r4, BFh5, A07);
            A0010.invoke(AnonymousClass0OT.A00(r4), r4, 0);
            r4.COB(2058660585);
            r4.COB(1420970387);
            if (r38 != null) {
                r4.COB(-153383122);
                if (z2) {
                    j4 = z ? r5.A01 : r5.A0D;
                } else {
                    j4 = z ? r5.A05 : r5.A09;
                }
                C17330uU A0011 = AnonymousClass0Ou.A00(r4, j4);
                AnonymousClass0VR.A0R(r6, false);
                C03230Hd[] r82 = new C03230Hd[1];
                AnonymousClass07W.A00(AnonymousClass0G4.A00, A0011.getValue(), r82, 0);
                AnonymousClass0PZ.A04(r4, r30, r82, ((i3 >> 12) & 112) | 8);
            }
            AnonymousClass0VR.A0R(r6, false);
            AnonymousClass0VR.A0Q(r6, AnonymousClass0VR.A0Y(r6));
        }
        C05660Vf BKF = r4.BKF();
        if (BKF != null) {
            BKF.A03(new C13840o3(r32, r33, r34, r352, r362, r30, f5, f6, f7, i5, i6, z3, z4));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        if (r4 == false) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.C17210uI r48, X.AnonymousClass0J3 r49, X.C17130tn r50, X.C17090tj r51, X.C22821Di r52, X.AnonymousClass1OS r53, int r54, int r55, boolean r56, boolean r57) {
        /*
            r14 = r48
            r22 = r49
            r18 = r57
            r19 = r53
            r21 = r51
            r1 = 1580463220(0x5e33f474, float:3.24177919E18)
            r0 = r50
            r0.COC(r1)
            r2 = r55 & 1
            r3 = r54
            r1 = r54 | 6
            if (r2 != 0) goto L_0x002b
            r2 = r54 & 14
            r1 = r3
            if (r2 != 0) goto L_0x002b
            r1 = r56
            boolean r1 = r0.BEg(r1)
            int r1 = X.AnonymousClass000.A09(r1)
            r1 = r1 | r54
        L_0x002b:
            r2 = r55 & 2
            r20 = r52
            if (r2 == 0) goto L_0x0332
            r1 = r1 | 48
        L_0x0033:
            r7 = r55 & 4
            if (r7 == 0) goto L_0x0325
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x0039:
            r6 = r55 & 8
            if (r6 == 0) goto L_0x0318
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x003f:
            r5 = r55 & 16
            if (r5 == 0) goto L_0x0304
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0045:
            r17 = 458752(0x70000, float:6.42848E-40)
            r2 = r54 & r17
            if (r2 != 0) goto L_0x005c
            r2 = r55 & 32
            if (r2 != 0) goto L_0x0059
            r2 = r22
            boolean r4 = r0.BEf(r2)
            r2 = 131072(0x20000, float:1.83671E-40)
            if (r4 != 0) goto L_0x005b
        L_0x0059:
            r2 = 65536(0x10000, float:9.18355E-41)
        L_0x005b:
            r1 = r1 | r2
        L_0x005c:
            r8 = r55 & 64
            r16 = 3670016(0x380000, float:5.142788E-39)
            r2 = 1572864(0x180000, float:2.204052E-39)
            if (r8 != 0) goto L_0x006c
            r2 = r54 & r16
            if (r2 != 0) goto L_0x006d
            int r2 = X.AnonymousClass001.A0W(r0, r14)
        L_0x006c:
            r1 = r1 | r2
        L_0x006d:
            r4 = 2995931(0x2db6db, float:4.198194E-39)
            r4 = r4 & r1
            r2 = 599186(0x92492, float:8.39638E-40)
            if (r4 != r2) goto L_0x009e
            boolean r2 = r0.BZO()
            if (r2 == 0) goto L_0x009e
            r0.CNR()
        L_0x007f:
            X.0Vf r1 = r0.BKF()
            if (r1 == 0) goto L_0x009d
            X.0no r0 = new X.0no
            r48 = r0
            r49 = r14
            r50 = r22
            r51 = r21
            r52 = r20
            r53 = r19
            r54 = r3
            r57 = r18
            r48.<init>(r49, r50, r51, r52, r53, r54, r55, r56, r57)
            r1.A03(r0)
        L_0x009d:
            return
        L_0x009e:
            r0.CNl()
            r2 = r54 & 1
            r4 = 0
            if (r2 == 0) goto L_0x0238
            boolean r2 = r0.BQS()
            if (r2 != 0) goto L_0x0238
            r0.CNR()
            r2 = r55 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x00b7:
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
        L_0x00ba:
            r0.BKA()
            r30 = 1103101952(0x41c00000, float:24.0)
            if (r19 != 0) goto L_0x00c3
            r30 = 1098907648(0x41800000, float:16.0)
        L_0x00c3:
            r8 = 1107296256(0x42000000, float:32.0)
            float r8 = r8 - r30
            r2 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r2
            X.07W r6 = X.AnonymousClass0OD.A01
            java.lang.Object r2 = r0.BFh(r6)
            X.ECa r2 = (X.C28644ECa) r2
            float r12 = r2.CPQ(r8)
            java.lang.Object r2 = r0.BFh(r6)
            X.ECa r2 = (X.C28644ECa) r2
            float r15 = A01
            float r5 = r2.CPQ(r15)
            java.lang.Float r4 = java.lang.Float.valueOf(r12)
            java.lang.Float r2 = java.lang.Float.valueOf(r5)
            boolean r2 = X.AnonymousClass001.A1Y(r0, r4, r2)
            java.lang.Object r4 = r0.CER()
            if (r2 != 0) goto L_0x00f8
            java.lang.Object r2 = X.AnonymousClass0MH.A00
            if (r4 != r2) goto L_0x0100
        L_0x00f8:
            X.0i8 r4 = new X.0i8
            r4.<init>(r5, r12)
            X.AnonymousClass0VR.A0V(r0, r4)
        L_0x0100:
            r7 = r0
            X.0VR r7 = (X.AnonymousClass0VR) r7
            r9 = 0
            X.AnonymousClass0VR.A0R(r7, r9)
            X.1Di r4 = (X.C22821Di) r4
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r56)
            java.lang.Object r2 = r4.invoke(r11)
            float r5 = X.AnonymousClass000.A04(r2)
            java.lang.Object r10 = X.AnonymousClass000.A0u(r0, r13)
            java.lang.Object r4 = X.AnonymousClass0MH.A00
            if (r10 != r4) goto L_0x0124
            X.0Q3 r10 = X.AnonymousClass0MV.A00(r5)
            r0.CRH(r10)
        L_0x0124:
            X.AnonymousClass0VR.A0R(r7, r9)
            X.0Q3 r10 = (X.AnonymousClass0Q3) r10
            r2 = 773894976(0x2e20b340, float:3.6538994E-11)
            r0.COB(r2)
            java.lang.Object r2 = X.AnonymousClass000.A0u(r0, r13)
            if (r2 != r4) goto L_0x0143
            X.1OR r2 = X.AnonymousClass1OR.A00
            X.1OX r4 = X.AnonymousClass0QC.A00(r0, r2)
            X.0Vk r2 = new X.0Vk
            r2.<init>(r4)
            r0.CRH(r2)
        L_0x0143:
            X.AnonymousClass0VR.A0R(r7, r9)
            X.0Vk r2 = (X.C05710Vk) r2
            X.1OX r4 = r2.A00()
            X.AnonymousClass0VR.A0R(r7, r9)
            X.0ev r2 = new X.0ev
            r2.<init>(r10, r12)
            X.AnonymousClass0QC.A05(r0, r2)
            X.0jj r2 = new X.0jj
            r2.<init>(r10, r4, r5)
            X.AnonymousClass0QC.A03(r0, r11, r2)
            if (r20 == 0) goto L_0x0233
            X.0WC r24 = X.C17090tj.A00
            r4 = 2
            X.0JM r2 = new X.0JM
            r2.<init>(r4)
            r23 = r14
            r25 = r2
            r26 = r20
            r27 = r56
            r28 = r18
            X.0tj r4 = A02(r23, r24, r25, r26, r27, r28)
            X.0tj r5 = X.AnonymousClass0MP.A00(r24)
        L_0x017b:
            r2 = r21
            X.0tj r2 = r2.CP5(r5)
            X.0tj r4 = r2.CP5(r4)
            androidx.compose.ui.Alignment r2 = X.AnonymousClass0MX.A05
            r11 = 0
            X.0tj r2 = X.C05130Qo.A04(r2, r4)
            X.0tj r4 = X.C05130Qo.A05(r2)
            androidx.compose.ui.Alignment r2 = X.AnonymousClass000.A0c(r0)
            X.0tM r13 = X.C04870Pg.A00(r0, r2, r9)
            java.lang.Object r12 = X.AnonymousClass001.A1D(r0, r6)
            java.lang.Object r9 = X.AnonymousClass000.A0t(r0)
            X.07W r2 = X.AnonymousClass0OD.A0B
            java.lang.Object r6 = r0.BFh(r2)
            X.0vk r5 = X.C05030Qc.A00()
            X.04D r4 = X.AnonymousClass0LO.A00(r4)
            r34 = 6
            r0.COE()
            boolean r2 = r7.A0K
            if (r2 == 0) goto L_0x022f
            r0.BHe(r5)
        L_0x01ba:
            r7.A0O = r11
            X.1OS r2 = X.C05030Qc.A04()
            X.AnonymousClass0EM.A00(r0, r13, r2)
            X.1OS r2 = X.C05030Qc.A02()
            X.AnonymousClass0EM.A00(r0, r12, r2)
            X.1OS r2 = X.C05030Qc.A03()
            X.AnonymousClass0EM.A00(r0, r9, r2)
            X.1OS r2 = X.C05030Qc.A07()
            X.AnonymousClass0EM.A00(r0, r6, r2)
            X.0OT r5 = X.AnonymousClass0OT.A00(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r4.invoke(r5, r0, r2)
            r2 = 2058660585(0x7ab4aae9, float:4.6903995E35)
            r0.COB(r2)
            X.0Uq r24 = X.C05540Uq.A00
            int r11 = r11 >> r34
            r2 = r11 & 112(0x70, float:1.57E-43)
            r5 = r2 | 6
            X.0Vr r4 = r10.A04
            java.lang.Integer r2 = X.C03080Gn.A07
            X.0WV r28 = X.C04570Nx.A01(r0, r2)
            r33 = r5 & 14
            int r2 = r1 << 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r33 = r33 | r2
            int r5 = r1 >> 6
            r2 = r5 & 896(0x380, float:1.256E-42)
            r33 = r33 | r2
            r2 = r5 & 7168(0x1c00, float:1.0045E-41)
            r33 = r33 | r2
            int r2 = r1 << 6
            r2 = r2 & r17
            r33 = r33 | r2
            r1 = r1 & r16
            r33 = r33 | r1
            r23 = r14
            r25 = r22
            r26 = r0
            r27 = r4
            r29 = r19
            r31 = r8
            r32 = r15
            r35 = r56
            r36 = r18
            A04(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            X.AnonymousClass0VR.A0K(r7)
            goto L_0x007f
        L_0x022f:
            r0.CRc()
            goto L_0x01ba
        L_0x0233:
            X.0WC r4 = X.C17090tj.A00
            r5 = r4
            goto L_0x017b
        L_0x0238:
            if (r7 == 0) goto L_0x023c
            X.0WC r21 = X.C17090tj.A00
        L_0x023c:
            if (r6 == 0) goto L_0x0240
            r19 = r4
        L_0x0240:
            if (r5 == 0) goto L_0x0244
            r18 = 1
        L_0x0244:
            r2 = r55 & 32
            r13 = -492369756(0xffffffffe2a708a4, float:-1.5406144E21)
            if (r2 == 0) goto L_0x02eb
            r2 = 1937926421(0x73826915, float:2.0664365E31)
            r0.COB(r2)
            java.lang.Integer r2 = X.C03080Gn.A08
            long r23 = X.AnonymousClass0QB.A05(r0, r2)
            java.lang.Integer r2 = X.C03080Gn.A0A
            long r25 = X.AnonymousClass0QB.A05(r0, r2)
            long r27 = X.C05100Qk.A04
            java.lang.Integer r2 = X.C03080Gn.A09
            long r29 = X.AnonymousClass0QB.A05(r0, r2)
            java.lang.Integer r2 = X.C03080Gn.A0D
            long r31 = X.AnonymousClass0QB.A05(r0, r2)
            java.lang.Integer r2 = X.C03080Gn.A0F
            long r33 = X.AnonymousClass0QB.A05(r0, r2)
            java.lang.Integer r2 = X.C03080Gn.A0C
            long r35 = X.AnonymousClass0QB.A05(r0, r2)
            java.lang.Integer r2 = X.C03080Gn.A0E
            long r37 = X.AnonymousClass0QB.A05(r0, r2)
            java.lang.Integer r2 = X.C03080Gn.A00
            long r4 = X.AnonymousClass0QB.A05(r0, r2)
            r2 = 1065353216(0x3f800000, float:1.0)
            long r6 = X.AnonymousClass0Oy.A03(X.AnonymousClass001.A11(r4), X.C05100Qk.A04(r4), X.C05100Qk.A03(r4), X.C05100Qk.A02(r4), r2)
            X.07W r2 = X.AnonymousClass0QB.A00
            java.lang.Object r4 = r0.BFh(r2)
            X.0OR r4 = (X.AnonymousClass0OR) r4
            X.0uU r4 = r4.A0O
            long r4 = X.AnonymousClass000.A0V(r4)
            long r39 = X.AnonymousClass0Oy.A02(r6, r4)
            java.lang.Integer r4 = X.C03080Gn.A02
            long r4 = X.AnonymousClass0QB.A05(r0, r4)
            r6 = 1039516303(0x3df5c28f, float:0.12)
            long r41 = A00(r0, r2, r6, r4)
            java.lang.Integer r4 = X.C03080Gn.A01
            long r4 = X.AnonymousClass0QB.A05(r0, r4)
            r7 = 1052938076(0x3ec28f5c, float:0.38)
            long r45 = A00(r0, r2, r7, r4)
            java.lang.Integer r4 = X.C03080Gn.A03
            long r4 = X.AnonymousClass0QB.A05(r0, r4)
            long r47 = A00(r0, r2, r7, r4)
            java.lang.Integer r4 = X.C03080Gn.A05
            long r4 = X.AnonymousClass0QB.A05(r0, r4)
            long r49 = A00(r0, r2, r6, r4)
            java.lang.Integer r4 = X.C03080Gn.A06
            long r4 = X.AnonymousClass0QB.A05(r0, r4)
            long r51 = A00(r0, r2, r6, r4)
            java.lang.Integer r4 = X.C03080Gn.A04
            long r4 = X.AnonymousClass0QB.A05(r0, r4)
            long r53 = A00(r0, r2, r7, r4)
            X.0J3 r22 = new X.0J3
            r43 = r27
            r22.<init>(r23, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53)
            X.AnonymousClass0VR.A0T(r0)
            r2 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r2
        L_0x02eb:
            if (r8 == 0) goto L_0x00ba
            java.lang.Object r14 = X.AnonymousClass000.A0u(r0, r13)
            java.lang.Object r2 = X.AnonymousClass0MH.A00
            if (r14 != r2) goto L_0x02fd
            X.0Um r14 = new X.0Um
            r14.<init>()
            X.AnonymousClass0VR.A0V(r0, r14)
        L_0x02fd:
            X.AnonymousClass0VR.A0T(r0)
            X.0uI r14 = (X.C17210uI) r14
            goto L_0x00ba
        L_0x0304:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r54
            if (r2 != 0) goto L_0x0045
            r2 = r18
            boolean r2 = r0.BEg(r2)
            int r2 = X.AnonymousClass000.A08(r2)
            r1 = r1 | r2
            goto L_0x0045
        L_0x0318:
            r2 = r3 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x003f
            r2 = r19
            int r2 = X.AnonymousClass001.A0d(r0, r2)
            r1 = r1 | r2
            goto L_0x003f
        L_0x0325:
            r2 = r3 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x0039
            r2 = r21
            int r2 = X.AnonymousClass001.A0S(r0, r2)
            r1 = r1 | r2
            goto L_0x0039
        L_0x0332:
            r2 = r54 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x0033
            r2 = r20
            int r2 = X.AnonymousClass001.A0b(r0, r2)
            r1 = r1 | r2
            goto L_0x0033
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0QL.A06(X.0uI, X.0J3, X.0tn, X.0tj, X.1Di, X.1OS, int, int, boolean, boolean):void");
    }
}
