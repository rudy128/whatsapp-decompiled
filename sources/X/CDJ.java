package X;

public abstract class CDJ {
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        if (r8.BEf(r19) == false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r37, X.C17090tj r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, X.C22821Di r42, int r43, int r44) {
        /*
            r7 = r42
            r18 = r41
            r19 = r40
            r42 = r39
            r14 = r38
            r0 = 945703543(0x385e4a77, float:5.2998275E-5)
            r8 = r37
            r8.COC(r0)
            r5 = r44
            r11 = r44 & 1
            r6 = r43
            r10 = r43 | 6
            if (r11 != 0) goto L_0x0026
            r0 = r43 & 6
            if (r0 != 0) goto L_0x01b4
            int r10 = X.AnonymousClass001.A0Q(r8, r14)
            r10 = r10 | r43
        L_0x0026:
            r4 = r44 & 2
            if (r4 == 0) goto L_0x01a7
            r10 = r10 | 48
        L_0x002c:
            r0 = r6 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0041
            r0 = r44 & 4
            if (r0 != 0) goto L_0x003e
            r0 = r19
            boolean r1 = r8.BEf(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x0040
        L_0x003e:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r10 = r10 | r0
        L_0x0041:
            r3 = r44 & 8
            if (r3 == 0) goto L_0x019a
            r10 = r10 | 3072(0xc00, float:4.305E-42)
        L_0x0047:
            r2 = r44 & 16
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x018b
            r10 = r10 | 24576(0x6000, float:3.4438E-41)
        L_0x004f:
            r1 = r10 & 9363(0x2493, float:1.312E-41)
            r0 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r0) goto L_0x0077
            boolean r0 = r8.BZO()
            if (r0 == 0) goto L_0x0077
            r8.CNR()
        L_0x005e:
            X.0Vf r1 = r8.BKF()
            if (r1 == 0) goto L_0x0076
            X.DXB r0 = new X.DXB
            r8 = r0
            r9 = r14
            r10 = r42
            r11 = r19
            r12 = r18
            r13 = r7
            r14 = r6
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            r1.A06 = r0
        L_0x0076:
            return
        L_0x0077:
            r8.CNl()
            r0 = r43 & 1
            java.lang.String r27 = ""
            r9 = 0
            r17 = 0
            if (r0 == 0) goto L_0x0167
            boolean r0 = r8.BQS()
            if (r0 != 0) goto L_0x0167
            int r10 = X.BE9.A0A(r8, r5, r10)
        L_0x008d:
            r8.BKA()
            r0 = -421796608(0xffffffffe6dbe500, float:-5.192113E23)
            java.lang.Object r12 = X.AnonymousClass000.A0u(r8, r0)
            java.lang.Object r4 = X.AnonymousClass0MH.A00
            if (r12 != r4) goto L_0x00b1
            int r0 = r42.length()
            long r0 = X.C25858CnM.A02(r0, r0)
            X.CvE r3 = new X.CvE
            r2 = r42
            r3.<init>((java.lang.String) r2, (long) r0)
            X.08V r12 = X.AnonymousClass0Q9.A02(r3)
            r8.CRH(r12)
        L_0x00b1:
            X.0uU r12 = (X.C17330uU) r12
            r3 = r8
            X.0VR r3 = (X.AnonymousClass0VR) r3
            X.AnonymousClass0VR.A0R(r3, r9)
            r0 = -421791300(0xffffffffe6dbf9bc, float:-5.1940252E23)
            java.lang.Object r2 = X.AnonymousClass000.A0u(r8, r0)
            if (r2 != r4) goto L_0x00ca
            X.0Mr r2 = new X.0Mr
            r2.<init>()
            r8.CRH(r2)
        L_0x00ca:
            X.0Mr r2 = (X.C04310Mr) r2
            X.AnonymousClass0VR.A0R(r3, r9)
            androidx.compose.ui.focus.FocusRequesterElement r0 = new androidx.compose.ui.focus.FocusRequesterElement
            r0.<init>(r2)
            X.0tj r24 = r14.CP5(r0)
            java.lang.Object r11 = r12.getValue()
            X.CvE r11 = (X.C26224CvE) r11
            r40 = 0
            if (r18 == 0) goto L_0x00e6
            r40 = 1
            r27 = r18
        L_0x00e6:
            r1 = 0
            r13 = 1
            X.0Ob r16 = new X.0Ob
            r0 = r16
            r0.<init>(r13)
            r0 = 10
            X.DWa r13 = new X.DWa
            r13.<init>(r0)
            r0 = -421779666(0xffffffffe6dc272e, float:-5.1982168E23)
            r8.COB(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r10
            if (r0 != r15) goto L_0x0103
            r9 = 1
        L_0x0103:
            java.lang.Object r0 = r8.CER()
            if (r9 != 0) goto L_0x010b
            if (r0 != r4) goto L_0x0114
        L_0x010b:
            r9 = 4
            X.DWc r0 = new X.DWc
            r0.<init>(r7, r12, r9)
            r8.CRH(r0)
        L_0x0114:
            X.1Di r0 = (X.C22821Di) r0
            X.AnonymousClass0VR.A0R(r3, r1)
            r9 = r10 & 896(0x380, float:1.256E-42)
            r10 = 100663296(0x6000000, float:2.4074124E-35)
            r9 = r9 | r10
            r36 = 1572864(0x180000, float:2.204052E-39)
            r37 = 195760(0x2fcb0, float:2.74318E-40)
            r28 = r17
            r31 = r17
            r32 = r17
            r34 = r1
            r38 = r1
            r39 = r1
            r41 = r1
            r20 = r17
            r29 = r13
            r30 = r0
            r33 = r1
            r35 = r9
            r21 = r16
            r22 = r17
            r23 = r8
            r25 = r11
            r26 = r19
            X.C24624CCk.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            X.1Wu r10 = X.C27621Wu.A00
            r0 = -421773792(0xffffffffe6dc3e20, float:-5.200333E23)
            java.lang.Object r9 = X.AnonymousClass000.A0u(r8, r0)
            if (r9 != r4) goto L_0x015d
            com.whatsapp.profile.compose.UsernamePinInputFieldKt$UsernamePinInputField$4$1 r9 = new com.whatsapp.profile.compose.UsernamePinInputFieldKt$UsernamePinInputField$4$1
            r0 = r17
            r9.<init>(r2, r0)
            r8.CRH(r9)
        L_0x015d:
            X.1OS r9 = (X.AnonymousClass1OS) r9
            X.AnonymousClass0VR.A0R(r3, r1)
            X.AnonymousClass0QC.A04(r8, r10, r9)
            goto L_0x005e
        L_0x0167:
            if (r11 == 0) goto L_0x016b
            X.0WC r14 = X.C17090tj.A00
        L_0x016b:
            if (r4 == 0) goto L_0x016f
            r42 = r27
        L_0x016f:
            r0 = r44 & 4
            if (r0 == 0) goto L_0x017c
            r0 = 2131897694(0x7f122d5e, float:1.9430285E38)
            java.lang.String r19 = X.AnonymousClass0LT.A00(r8, r0)
            r10 = r10 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x017c:
            if (r3 == 0) goto L_0x0180
            r18 = r17
        L_0x0180:
            if (r2 == 0) goto L_0x008d
            r0 = 9
            X.DWa r7 = new X.DWa
            r7.<init>(r0)
            goto L_0x008d
        L_0x018b:
            r0 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x004f
            boolean r0 = r8.BEh(r7)
            int r0 = X.AnonymousClass000.A08(r0)
            r10 = r10 | r0
            goto L_0x004f
        L_0x019a:
            r0 = r6 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0047
            r0 = r18
            int r0 = X.AnonymousClass001.A0T(r8, r0)
            r10 = r10 | r0
            goto L_0x0047
        L_0x01a7:
            r0 = r43 & 48
            if (r0 != 0) goto L_0x002c
            r0 = r42
            int r0 = X.AnonymousClass001.A0R(r8, r0)
            r10 = r10 | r0
            goto L_0x002c
        L_0x01b4:
            r10 = r6
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CDJ.A00(X.0tn, X.0tj, java.lang.String, java.lang.String, java.lang.String, X.1Di, int, int):void");
    }
}
