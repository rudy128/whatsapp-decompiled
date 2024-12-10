package X;

/* renamed from: X.CCn  reason: case insensitive filesystem */
public abstract class C24627CCn {
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r8 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r3.BEe(r5) == false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r37, X.C17090tj r38, X.C04640Oe r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, int r43, int r44, long r45) {
        /*
            r4 = r42
            r5 = r45
            r17 = r39
            r18 = r38
            r1 = 0
            r15 = r40
            X.C18070vi.A0d(r15, r1)
            r0 = 1
            r10 = r41
            X.C18070vi.A0d(r10, r0)
            r0 = 1011393208(0x3c48a2b8, float:0.012245826)
            r3 = r37
            r3.COC(r0)
            r0 = r44 & 1
            r2 = r43
            if (r0 == 0) goto L_0x01cd
            r7 = r43 | 6
        L_0x0024:
            r0 = r44 & 2
            if (r0 == 0) goto L_0x01c2
            r7 = r7 | 48
        L_0x002a:
            r11 = r44 & 4
            if (r11 == 0) goto L_0x01b5
            r7 = r7 | 384(0x180, float:5.38E-43)
        L_0x0030:
            r0 = r2 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0045
            r0 = r44 & 8
            if (r0 != 0) goto L_0x0042
            r0 = r17
            boolean r8 = r3.BEh(r0)
            r0 = 2048(0x800, float:2.87E-42)
            if (r8 != 0) goto L_0x0044
        L_0x0042:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0044:
            r7 = r7 | r0
        L_0x0045:
            r0 = r2 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0058
            r0 = r44 & 16
            if (r0 != 0) goto L_0x0055
            boolean r8 = r3.BEe(r5)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r8 != 0) goto L_0x0057
        L_0x0055:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0057:
            r7 = r7 | r0
        L_0x0058:
            r9 = r44 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r9 != 0) goto L_0x0066
            r0 = r43 & r0
            if (r0 != 0) goto L_0x0067
            int r0 = X.AnonymousClass001.A0V(r3, r4)
        L_0x0066:
            r7 = r7 | r0
        L_0x0067:
            r8 = 74899(0x12493, float:1.04956E-40)
            r8 = r8 & r7
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r0) goto L_0x0097
            boolean r0 = r3.BZO()
            if (r0 == 0) goto L_0x0097
            r3.CNR()
        L_0x0079:
            X.0Vf r1 = r3.BKF()
            if (r1 == 0) goto L_0x0096
            X.DXE r0 = new X.DXE
            r37 = r0
            r38 = r18
            r39 = r17
            r40 = r15
            r41 = r10
            r42 = r4
            r43 = r2
            r45 = r5
            r37.<init>(r38, r39, r40, r41, r42, r43, r44, r45)
            r1.A06 = r0
        L_0x0096:
            return
        L_0x0097:
            r3.CNl()
            r0 = r43 & 1
            r8 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0196
            boolean r0 = r3.BQS()
            if (r0 != 0) goto L_0x0196
            r3.CNR()
            r0 = r44 & 8
            if (r0 == 0) goto L_0x00b0
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00b0:
            r0 = r44 & 16
            if (r0 == 0) goto L_0x00b5
            r7 = r7 & r8
        L_0x00b5:
            r3.BKA()
            X.0s6 r11 = X.AnonymousClass0MX.A04
            X.0uJ r9 = X.AnonymousClass0OB.A03
            int r0 = r7 >> 6
            r0 = r0 & 14
            r8 = r0 | 432(0x1b0, float:6.05E-43)
            r0 = 693286680(0x2952b718, float:4.6788176E-14)
            r3.COB(r0)
            X.0tM r14 = X.C03930Le.A00(r9, r3, r11)
            int r0 = r8 << 3
            r8 = r0 & 112(0x70, float:1.57E-43)
            r0 = -1323940314(0xffffffffb1164626, float:-2.1867748E-9)
            r3.COB(r0)
            r0 = r3
            X.0VR r0 = (X.AnonymousClass0VR) r0
            int r13 = r0.A01
            X.0uW r12 = r3.BPs()
            X.0vk r11 = X.C05030Qc.A00
            X.04D r9 = X.AnonymousClass0LO.A01(r18)
            int r8 = r8 << 9
            r8 = r8 & 7168(0x1c00, float:1.0045E-41)
            r16 = r8 | 6
            X.BEA.A19(r3, r0, r11)
            X.BE9.A18(r3, r14, r12)
            X.1OS r11 = X.C05030Qc.A01
            boolean r8 = r0.A0K
            if (r8 != 0) goto L_0x00fd
            boolean r8 = X.BE9.A1R(r3, r13)
            if (r8 != 0) goto L_0x0100
        L_0x00fd:
            X.BE9.A19(r3, r11, r13)
        L_0x0100:
            X.0OT r11 = new X.0OT
            r11.<init>(r3)
            int r8 = r16 >> 3
            r8 = r8 & 112(0x70, float:1.57E-43)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            X.BE8.A0y(r3, r9, r11, r8)
            X.0WC r9 = X.C17090tj.A00
            X.07W r8 = X.CG8.A00
            X.0tj r20 = X.BE9.A0P(r3, r8, r9)
            int r11 = r7 >> 9
            r23 = r11 & 14
            int r11 = r7 << 3
            r11 = r11 & 112(0x70, float:1.57E-43)
            r23 = r23 | r11
            int r11 = r7 >> 3
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r23 = r23 | r11
            r19 = r3
            r21 = r17
            r22 = r15
            r24 = r1
            r25 = r5
            X.C04040Lp.A00(r19, r20, r21, r22, r23, r24, r25)
            r22 = 0
            androidx.compose.foundation.layout.LayoutWeightElement r24 = new androidx.compose.foundation.layout.LayoutWeightElement
            r24.<init>()
            r27 = r7 & 14
            r7 = r7 & 112(0x70, float:1.57E-43)
            r27 = r27 | r7
            r23 = r3
            r25 = r15
            r26 = r10
            r28 = r1
            X.C24628CCo.A00(r23, r24, r25, r26, r27, r28)
            r7 = -1566065424(0xffffffffa2a7bcf0, float:-4.5465486E-18)
            r3.COB(r7)
            if (r4 == 0) goto L_0x018e
            r3.BFh(r8)
            r7 = 1098907648(0x41800000, float:16.0)
            X.0tj r20 = X.AnonymousClass0Q7.A04(r9, r7)
            long r35 = X.C26257Cw2.A00(r3)
            X.Ciy r7 = X.BE7.A0S(r3)
            X.Cvq r7 = r7.A02
            r34 = 65528(0xfff8, float:9.1824E-41)
            r37 = 0
            r24 = r22
            r25 = r22
            r26 = r22
            r28 = r22
            r30 = r1
            r31 = r1
            r32 = r1
            r33 = r1
            r41 = r37
            r43 = r1
            r23 = r22
            r27 = r4
            r29 = r1
            r39 = r37
            r21 = r7
            X.AnonymousClass0PA.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43)
        L_0x018e:
            X.AnonymousClass0VR.A0R(r0, r1)
            X.BEA.A18(r3, r0)
            goto L_0x0079
        L_0x0196:
            if (r11 == 0) goto L_0x019a
            X.0WC r18 = X.C17090tj.A00
        L_0x019a:
            r0 = r44 & 8
            if (r0 == 0) goto L_0x01a7
            r0 = 2131233243(0x7f0809db, float:1.8082618E38)
            X.0Oe r17 = X.AnonymousClass0LS.A00(r3, r0)
            r7 = r7 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x01a7:
            r0 = r44 & 16
            if (r0 == 0) goto L_0x01b0
            long r5 = X.C26257Cw2.A00(r3)
            r7 = r7 & r8
        L_0x01b0:
            if (r9 == 0) goto L_0x00b5
            r4 = 0
            goto L_0x00b5
        L_0x01b5:
            r0 = r2 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0030
            r0 = r18
            int r0 = X.AnonymousClass001.A0S(r3, r0)
            r7 = r7 | r0
            goto L_0x0030
        L_0x01c2:
            r0 = r43 & 48
            if (r0 != 0) goto L_0x002a
            int r0 = X.AnonymousClass001.A0R(r3, r10)
            r7 = r7 | r0
            goto L_0x002a
        L_0x01cd:
            r0 = r43 & 6
            if (r0 != 0) goto L_0x01d9
            int r7 = X.AnonymousClass001.A0Z(r3, r15)
            r7 = r7 | r43
            goto L_0x0024
        L_0x01d9:
            r7 = r2
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24627CCn.A00(X.0tn, X.0tj, X.0Oe, java.lang.String, java.lang.String, java.lang.String, int, int, long):void");
    }
}
