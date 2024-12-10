package X;

/* renamed from: X.CCl  reason: case insensitive filesystem */
public abstract class C24625CCl {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r3 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r13.BEf(r15) == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x009c, code lost:
        if ((r58 & 16) != 0) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r52, X.C17090tj r53, X.C26251Cvq r54, java.lang.String r55, char r56, int r57, int r58, long r59) {
        /*
            r15 = r54
            r4 = r59
            r7 = r56
            r12 = r55
            r2 = r53
            r0 = 1658171657(0x62d5b109, float:1.9709566E21)
            r13 = r52
            r13.COC(r0)
            r11 = r58 & 1
            r1 = r57
            r8 = r57 | 6
            if (r11 != 0) goto L_0x0024
            r0 = r57 & 6
            if (r0 != 0) goto L_0x01a6
            int r8 = X.AnonymousClass001.A0Q(r13, r2)
            r8 = r8 | r57
        L_0x0024:
            r10 = r58 & 2
            if (r10 == 0) goto L_0x019b
            r8 = r8 | 48
        L_0x002a:
            r9 = r58 & 4
            if (r9 == 0) goto L_0x0175
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0030:
            r0 = r1 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0043
            r0 = r58 & 8
            if (r0 != 0) goto L_0x0040
            boolean r3 = r13.BEe(r4)
            r0 = 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0042
        L_0x0040:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0042:
            r8 = r8 | r0
        L_0x0043:
            r0 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0056
            r0 = r58 & 16
            if (r0 != 0) goto L_0x0053
            boolean r3 = r13.BEf(r15)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r3 != 0) goto L_0x0055
        L_0x0053:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0055:
            r8 = r8 | r0
        L_0x0056:
            r3 = r8 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r3 != r0) goto L_0x0081
            boolean r0 = r13.BZO()
            if (r0 == 0) goto L_0x0081
            r13.CNR()
        L_0x0065:
            X.0Vf r3 = r13.BKF()
            if (r3 == 0) goto L_0x0080
            X.DX8 r0 = new X.DX8
            r52 = r0
            r53 = r2
            r54 = r15
            r55 = r12
            r56 = r7
            r57 = r1
            r59 = r4
            r52.<init>(r53, r54, r55, r56, r57, r58, r59)
            r3.A06 = r0
        L_0x0080:
            return
        L_0x0081:
            r13.CNl()
            r0 = r57 & 1
            r3 = -57345(0xffffffffffff1fff, float:NaN)
            if (r0 == 0) goto L_0x0153
            boolean r0 = r13.BQS()
            if (r0 != 0) goto L_0x0153
            r13.CNR()
            r0 = r58 & 8
            if (r0 == 0) goto L_0x009a
            r8 = r8 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x009a:
            r0 = r58 & 16
            if (r0 == 0) goto L_0x009f
        L_0x009e:
            r8 = r8 & r3
        L_0x009f:
            r13.BKA()
            r16 = 0
            androidx.compose.foundation.layout.FillElement r0 = X.C05130Qo.A01
            X.0tj r3 = r2.CP5(r0)
            X.0s6 r0 = X.AnonymousClass0MX.A04
            X.0tM r11 = X.BEB.A0N(r13, r0)
            r0 = r13
            X.0VR r0 = (X.AnonymousClass0VR) r0
            int r10 = r0.A01
            X.0uW r9 = r13.BPs()
            X.0vk r6 = X.C05030Qc.A00
            X.04D r3 = X.AnonymousClass0LO.A01(r3)
            X.BEA.A19(r13, r0, r6)
            X.BE9.A18(r13, r11, r9)
            X.1OS r9 = X.C05030Qc.A01
            boolean r6 = r0.A0K
            if (r6 != 0) goto L_0x00d1
            boolean r6 = X.BE9.A1R(r13, r10)
            if (r6 != 0) goto L_0x00d4
        L_0x00d1:
            X.BE9.A19(r13, r9, r10)
        L_0x00d4:
            X.0OT r9 = new X.0OT
            r9.<init>(r13)
            java.lang.Integer r6 = X.AnonymousClass3MY.A0f()
            X.BE8.A0y(r13, r3, r9, r6)
            X.0WC r9 = X.C17090tj.A00
            X.07W r3 = X.CG8.A00
            r13.BFh(r3)
            r6 = 1082130432(0x40800000, float:4.0)
            r3 = 0
            X.0tj r14 = X.AnonymousClass0Q7.A05(r9, r6, r3)
            java.lang.String r21 = java.lang.String.valueOf(r7)
            int r3 = r8 >> 3
            r6 = r3 & 896(0x380, float:1.256E-42)
            int r27 = r8 << 6
            r8 = 3670016(0x380000, float:5.142788E-39)
            r27 = r27 & r8
            r28 = 65528(0xfff8, float:9.1824E-41)
            r31 = 0
            r23 = 0
            r18 = r16
            r19 = r16
            r20 = r16
            r22 = r16
            r25 = r23
            r35 = r31
            r37 = r23
            r17 = r16
            r24 = r23
            r26 = r6
            r29 = r4
            r33 = r31
            X.AnonymousClass0PA.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37)
            r46 = r3 & 14
            r46 = r46 | r6
            r48 = 65530(0xfffa, float:9.1827E-41)
            r36 = r16
            r37 = r16
            r38 = r16
            r39 = r16
            r40 = r16
            r42 = r16
            r44 = r23
            r45 = r23
            r53 = r31
            r55 = r31
            r57 = r23
            r33 = r13
            r34 = r16
            r35 = r15
            r41 = r12
            r43 = r23
            r47 = r27
            r49 = r4
            r51 = r31
            X.AnonymousClass0PA.A01(r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r51, r53, r55, r57)
            X.BEA.A18(r13, r0)
            goto L_0x0065
        L_0x0153:
            if (r11 == 0) goto L_0x0157
            X.0WC r2 = X.C17090tj.A00
        L_0x0157:
            if (r10 == 0) goto L_0x015b
            java.lang.String r12 = ""
        L_0x015b:
            if (r9 == 0) goto L_0x015f
            r7 = 8226(0x2022, float:1.1527E-41)
        L_0x015f:
            r0 = r58 & 8
            if (r0 == 0) goto L_0x0169
            long r4 = X.C26257Cw2.A00(r13)
            r8 = r8 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0169:
            r0 = r58 & 16
            if (r0 == 0) goto L_0x009f
            X.Ciy r0 = X.BE7.A0S(r13)
            X.Cvq r15 = r0.A02
            goto L_0x009e
        L_0x0175:
            r0 = r1 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0030
            r6 = r13
            X.0VR r6 = (X.AnonymousClass0VR) r6
            java.lang.Object r3 = r6.A0a()
            boolean r0 = r3 instanceof java.lang.Character
            if (r0 == 0) goto L_0x0191
            java.lang.Character r3 = (java.lang.Character) r3
            char r0 = r3.charValue()
            if (r7 != r0) goto L_0x0191
            r0 = 128(0x80, float:1.794E-43)
        L_0x018e:
            r8 = r8 | r0
            goto L_0x0030
        L_0x0191:
            java.lang.Character r0 = java.lang.Character.valueOf(r7)
            r6.A0c(r0)
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x018e
        L_0x019b:
            r0 = r57 & 48
            if (r0 != 0) goto L_0x002a
            int r0 = X.AnonymousClass001.A0R(r13, r12)
            r8 = r8 | r0
            goto L_0x002a
        L_0x01a6:
            r8 = r1
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24625CCl.A00(X.0tn, X.0tj, X.Cvq, java.lang.String, char, int, int, long):void");
    }
}
