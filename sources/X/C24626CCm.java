package X;

/* renamed from: X.CCm  reason: case insensitive filesystem */
public abstract class C24626CCm {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r7.BEh(r18) == false) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r1 == false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (r7.BEe(r8) == false) goto L_0x0064;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r34, X.C17090tj r35, X.C04640Oe r36, java.lang.String r37, X.C18090vk r38, int r39, int r40, long r41, long r43) {
        /*
            r5 = r38
            r8 = r43
            r16 = r41
            r18 = r36
            r6 = r35
            r2 = 0
            r44 = r37
            r0 = r44
            X.C18070vi.A0d(r0, r2)
            r0 = -479076365(0xffffffffe371dff3, float:-4.4618026E21)
            r7 = r34
            r7.COC(r0)
            r3 = r40
            r0 = r40 & 1
            r4 = r39
            if (r0 == 0) goto L_0x01dc
            r10 = r39 | 6
        L_0x0024:
            r12 = r40 & 2
            if (r12 == 0) goto L_0x01d1
            r10 = r10 | 48
        L_0x002a:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x003f
            r0 = r40 & 4
            if (r0 != 0) goto L_0x003c
            r0 = r18
            boolean r1 = r7.BEh(r0)
            r0 = 256(0x100, float:3.59E-43)
            if (r1 != 0) goto L_0x003e
        L_0x003c:
            r0 = 128(0x80, float:1.794E-43)
        L_0x003e:
            r10 = r10 | r0
        L_0x003f:
            r0 = r4 & 3072(0xc00, float:4.305E-42)
            if (r0 != 0) goto L_0x0054
            r0 = r40 & 8
            if (r0 != 0) goto L_0x0051
            r0 = r16
            boolean r1 = r7.BEe(r0)
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 != 0) goto L_0x0053
        L_0x0051:
            r0 = 1024(0x400, float:1.435E-42)
        L_0x0053:
            r10 = r10 | r0
        L_0x0054:
            r0 = r4 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x0067
            r0 = r40 & 16
            if (r0 != 0) goto L_0x0064
            boolean r1 = r7.BEe(r8)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r1 != 0) goto L_0x0066
        L_0x0064:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0066:
            r10 = r10 | r0
        L_0x0067:
            r11 = r40 & 32
            r0 = 196608(0x30000, float:2.75506E-40)
            if (r11 != 0) goto L_0x0075
            r0 = r39 & r0
            if (r0 != 0) goto L_0x0076
            int r0 = X.AnonymousClass001.A0e(r7, r5)
        L_0x0075:
            r10 = r10 | r0
        L_0x0076:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r10
            r0 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r0) goto L_0x00a8
            boolean r0 = r7.BZO()
            if (r0 == 0) goto L_0x00a8
            r7.CNR()
        L_0x0088:
            X.0Vf r1 = r7.BKF()
            if (r1 == 0) goto L_0x00a7
            X.DXD r0 = new X.DXD
            r19 = r0
            r20 = r6
            r21 = r18
            r22 = r44
            r23 = r5
            r24 = r4
            r25 = r3
            r26 = r16
            r28 = r8
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r28)
            r1.A06 = r0
        L_0x00a7:
            return
        L_0x00a8:
            r7.CNl()
            r0 = r39 & 1
            r1 = -57345(0xffffffffffff1fff, float:NaN)
            r15 = 6
            if (r0 == 0) goto L_0x01a1
            boolean r0 = r7.BQS()
            if (r0 != 0) goto L_0x01a1
            int r10 = X.BE9.A0A(r7, r3, r10)
            r0 = r40 & 8
            if (r0 == 0) goto L_0x00c3
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c3:
            r0 = r40 & 16
            if (r0 == 0) goto L_0x00c8
            r10 = r10 & r1
        L_0x00c8:
            r7.BKA()
            r20 = 0
            r11 = 1
            androidx.compose.foundation.layout.FillElement r0 = X.C05130Qo.A01
            X.0tj r13 = r6.CP5(r0)
            r0 = -543778011(0xffffffffdf969b25, float:-2.1704617E19)
            r7.COB(r0)
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r10
            r0 = 131072(0x20000, float:1.83671E-40)
            if (r1 == r0) goto L_0x00e2
            r11 = 0
        L_0x00e2:
            java.lang.Object r12 = r7.CER()
            if (r11 != 0) goto L_0x00ec
            java.lang.Object r0 = X.AnonymousClass0MH.A00
            if (r12 != r0) goto L_0x00f5
        L_0x00ec:
            r0 = 5
            X.DWX r12 = new X.DWX
            r12.<init>(r5, r0)
            r7.CRH(r12)
        L_0x00f5:
            X.0vk r12 = (X.C18090vk) r12
            r0 = r7
            X.0VR r0 = (X.AnonymousClass0VR) r0
            X.AnonymousClass0VR.A0R(r0, r2)
            X.1Di r11 = X.AnonymousClass0O1.A00
            X.0ph r1 = new X.0ph
            r1.<init>(r12)
            X.0tj r12 = X.C04470Nn.A01(r13, r11, r1)
            X.0s6 r1 = X.AnonymousClass0MX.A03
            X.0tM r14 = X.BEB.A0N(r7, r1)
            int r13 = r0.A01
            X.0uW r11 = r7.BPs()
            X.0vk r1 = X.C05030Qc.A00
            X.04D r12 = X.AnonymousClass0LO.A01(r12)
            X.BEA.A19(r7, r0, r1)
            X.BE9.A18(r7, r14, r11)
            X.1OS r11 = X.C05030Qc.A01
            boolean r1 = r0.A0K
            if (r1 != 0) goto L_0x012c
            boolean r1 = X.BE9.A1R(r7, r13)
            if (r1 != 0) goto L_0x012f
        L_0x012c:
            X.BE9.A19(r7, r11, r13)
        L_0x012f:
            X.BEB.A0r(r7, r12)
            X.0WC r11 = X.C17090tj.A00
            X.07W r1 = X.CG8.A00
            r7.BFh(r1)
            r13 = 1103101952(0x41c00000, float:24.0)
            r7.BFh(r1)
            r1 = 1098907648(0x41800000, float:16.0)
            X.0tj r1 = X.AnonymousClass0Q7.A05(r11, r13, r1)
            long r11 = X.CIM.A00
            X.0tj r22 = X.C05130Qo.A08(r1, r13)
            int r1 = r10 >> 6
            r25 = r1 & 14
            int r1 = r10 << 3
            r1 = r1 & 112(0x70, float:1.57E-43)
            r25 = r25 | r1
            r1 = r10 & 7168(0x1c00, float:1.0045E-41)
            r25 = r25 | r1
            r21 = r7
            r23 = r18
            r24 = r44
            r26 = r2
            r27 = r16
            X.C04040Lp.A00(r21, r22, r23, r24, r25, r26, r27)
            X.Ciy r1 = X.BE7.A0S(r7)
            X.Cvq r1 = r1.A00
            r32 = r10 & 14
            int r10 = r10 >> r15
            r10 = r10 & 896(0x380, float:1.256E-42)
            r32 = r32 | r10
            r34 = 65530(0xfffa, float:9.1827E-41)
            r37 = 0
            r23 = r20
            r24 = r20
            r25 = r20
            r26 = r20
            r28 = r20
            r30 = r2
            r31 = r2
            r33 = r2
            r41 = r37
            r43 = r2
            r22 = r20
            r27 = r44
            r29 = r2
            r35 = r8
            r39 = r37
            r19 = r7
            r21 = r1
            X.AnonymousClass0PA.A01(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r43)
            X.BEA.A18(r7, r0)
            goto L_0x0088
        L_0x01a1:
            if (r12 == 0) goto L_0x01a5
            X.0WC r6 = X.C17090tj.A00
        L_0x01a5:
            r0 = r40 & 4
            if (r0 == 0) goto L_0x01b2
            r0 = 2131233243(0x7f0809db, float:1.8082618E38)
            X.0Oe r18 = X.AnonymousClass0LS.A00(r7, r0)
            r10 = r10 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x01b2:
            r0 = r40 & 8
            if (r0 == 0) goto L_0x01bc
            long r16 = X.C26257Cw2.A00(r7)
            r10 = r10 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x01bc:
            r0 = r40 & 16
            if (r0 == 0) goto L_0x01c7
            X.07W r0 = X.CG7.A00
            long r8 = X.C26257Cw2.A01(r7, r0)
            r10 = r10 & r1
        L_0x01c7:
            if (r11 == 0) goto L_0x00c8
            r0 = 2
            X.DWU r5 = new X.DWU
            r5.<init>(r0)
            goto L_0x00c8
        L_0x01d1:
            r0 = r39 & 48
            if (r0 != 0) goto L_0x002a
            int r0 = X.AnonymousClass001.A0R(r7, r6)
            r10 = r10 | r0
            goto L_0x002a
        L_0x01dc:
            r0 = r39 & 6
            if (r0 != 0) goto L_0x01ea
            r0 = r44
            int r10 = X.AnonymousClass001.A0Z(r7, r0)
            r10 = r10 | r39
            goto L_0x0024
        L_0x01ea:
            r10 = r4
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24626CCm.A00(X.0tn, X.0tj, X.0Oe, java.lang.String, X.0vk, int, int, long, long):void");
    }
}
