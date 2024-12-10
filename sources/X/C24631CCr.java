package X;

/* renamed from: X.CCr  reason: case insensitive filesystem */
public abstract class C24631CCr {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v37, resolved type: X.DWs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: X.DWs} */
    /* JADX WARNING: type inference failed for: r11v16 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01b7, code lost:
        if (r11 == X.AnonymousClass0MH.A00) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        if (r9.BEe(r0) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0058, code lost:
        if (r12 == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006d, code lost:
        if (r9.BEh(r17) == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if (r12 == false) goto L_0x0084;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        if ((r25 & 32) != 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0126, code lost:
        if ((196608 & r11) != 131072) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0194, code lost:
        if ((r11 & 3072) == 2048) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01aa, code lost:
        if ((r11 & 384) == 256) goto L_0x01ac;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r19, X.C17090tj r20, X.C04640Oe r21, java.lang.String r22, java.lang.String r23, int r24, int r25, long r26, long r28) {
        /*
            r8 = r23
            r17 = r21
            r2 = r28
            r0 = r26
            r18 = r20
            r5 = 0
            r29 = r22
            r4 = r29
            X.C18070vi.A0d(r4, r5)
            r4 = -815393979(0xffffffffcf661345, float:-3.86002253E9)
            r9 = r19
            r9.COC(r4)
            r6 = r25
            r4 = r25 & 1
            r10 = 4
            r7 = r24
            r11 = r24 | 6
            if (r4 != 0) goto L_0x0031
            r4 = r24 & 6
            if (r4 != 0) goto L_0x023f
            r4 = r29
            int r11 = X.AnonymousClass001.A0Q(r9, r4)
            r11 = r11 | r24
        L_0x0031:
            r13 = r25 & 2
            if (r13 == 0) goto L_0x0232
            r11 = r11 | 48
        L_0x0037:
            r4 = r7 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x004a
            r4 = r25 & 4
            if (r4 != 0) goto L_0x0047
            boolean r12 = r9.BEe(r0)
            r4 = 256(0x100, float:3.59E-43)
            if (r12 != 0) goto L_0x0049
        L_0x0047:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0049:
            r11 = r11 | r4
        L_0x004a:
            r4 = r7 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x005d
            r4 = r25 & 8
            if (r4 != 0) goto L_0x005a
            boolean r12 = r9.BEe(r2)
            r4 = 2048(0x800, float:2.87E-42)
            if (r12 != 0) goto L_0x005c
        L_0x005a:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x005c:
            r11 = r11 | r4
        L_0x005d:
            r4 = r7 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x0072
            r4 = r25 & 16
            if (r4 != 0) goto L_0x006f
            r4 = r17
            boolean r12 = r9.BEh(r4)
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r12 != 0) goto L_0x0071
        L_0x006f:
            r4 = 8192(0x2000, float:1.14794E-41)
        L_0x0071:
            r11 = r11 | r4
        L_0x0072:
            r14 = 196608(0x30000, float:2.75506E-40)
            r4 = r24 & r14
            if (r4 != 0) goto L_0x0087
            r4 = r25 & 32
            if (r4 != 0) goto L_0x0084
            boolean r12 = r9.BEf(r8)
            r4 = 131072(0x20000, float:1.83671E-40)
            if (r12 != 0) goto L_0x0086
        L_0x0084:
            r4 = 65536(0x10000, float:9.18355E-41)
        L_0x0086:
            r11 = r11 | r4
        L_0x0087:
            r4 = 74899(0x12493, float:1.04956E-40)
            r12 = r11 & r4
            r4 = 74898(0x12492, float:1.04954E-40)
            if (r12 != r4) goto L_0x00b6
            boolean r4 = r9.BZO()
            if (r4 == 0) goto L_0x00b6
            r9.CNR()
        L_0x009a:
            X.0Vf r5 = r9.BKF()
            if (r5 == 0) goto L_0x00b5
            X.DXF r4 = new X.DXF
            r9 = r4
            r10 = r18
            r11 = r17
            r12 = r29
            r13 = r8
            r14 = r7
            r15 = r6
            r16 = r0
            r18 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r18)
            r5.A06 = r4
        L_0x00b5:
            return
        L_0x00b6:
            r9.CNl()
            r4 = r24 & 1
            r12 = -57345(0xffffffffffff1fff, float:NaN)
            if (r4 == 0) goto L_0x01fd
            boolean r4 = r9.BQS()
            if (r4 != 0) goto L_0x01fd
            int r11 = X.BE9.A0A(r9, r6, r11)
            r4 = r25 & 8
            if (r4 == 0) goto L_0x00d0
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00d0:
            r4 = r25 & 16
            if (r4 == 0) goto L_0x00d5
            r11 = r11 & r12
        L_0x00d5:
            r4 = r25 & 32
            if (r4 == 0) goto L_0x00dd
        L_0x00d9:
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r11 = r11 & r4
        L_0x00dd:
            r9.BKA()
            r4 = 1555080502(0x5cb0a536, float:3.97769978E17)
            r9.COB(r4)
            r4 = r11 & 14
            r13 = 1
            boolean r4 = X.AnonymousClass000.A1T(r4, r10)
            java.lang.Object r12 = r9.CER()
            if (r4 != 0) goto L_0x00f7
            java.lang.Object r4 = X.AnonymousClass0MH.A00
            if (r12 != r4) goto L_0x0105
        L_0x00f7:
            java.lang.Integer r12 = X.AnonymousClass00R.A01
            r10 = 0
            r4 = r29
            X.CWz r4 = X.C25912CoW.A00(r12, r4, r10)
            X.CWH r12 = r4.A03
            r9.CRH(r12)
        L_0x0105:
            X.CWH r12 = (X.CWH) r12
            r10 = r9
            X.0VR r10 = (X.AnonymousClass0VR) r10
            X.AnonymousClass0VR.A0R(r10, r5)
            X.C18070vi.A0b(r12)
            r4 = 1555085270(0x5cb0b7d6, float:3.97933805E17)
            r9.COB(r4)
            r4 = 458752(0x70000, float:6.42848E-40)
            r4 = r4 & r11
            r4 = r4 ^ r14
            r15 = 131072(0x20000, float:1.83671E-40)
            if (r4 <= r15) goto L_0x0124
            boolean r4 = r9.BEf(r8)
            if (r4 != 0) goto L_0x0128
        L_0x0124:
            r14 = r14 & r11
            r4 = 0
            if (r14 != r15) goto L_0x0129
        L_0x0128:
            r4 = 1
        L_0x0129:
            java.lang.Object r14 = r9.CER()
            if (r4 != 0) goto L_0x0133
            java.lang.Object r4 = X.AnonymousClass0MH.A00
            if (r14 != r4) goto L_0x013b
        L_0x0133:
            X.7S7 r14 = new X.7S7
            r14.<init>(r8, r5)
            r9.CRH(r14)
        L_0x013b:
            X.1Di r14 = (X.C22821Di) r14
            X.AnonymousClass0VR.A0R(r10, r5)
            r4 = r18
            X.0tj r13 = X.AnonymousClass0PD.A02(r4, r14, r13)
            androidx.compose.ui.Alignment r4 = X.AnonymousClass0MX.A05
            X.0tM r16 = X.BEA.A0S(r9, r4)
            int r14 = r10.A01
            X.0uW r15 = r9.BPs()
            X.0vk r4 = X.C05030Qc.A00
            X.04D r13 = X.AnonymousClass0LO.A01(r13)
            X.BEA.A19(r9, r10, r4)
            r4 = r16
            X.BE9.A18(r9, r4, r15)
            X.1OS r15 = X.C05030Qc.A01
            boolean r4 = r10.A0K
            if (r4 != 0) goto L_0x016c
            boolean r4 = X.BE9.A1R(r9, r14)
            if (r4 != 0) goto L_0x016f
        L_0x016c:
            X.BE9.A19(r9, r15, r14)
        L_0x016f:
            X.BEB.A0r(r9, r13)
            r20 = 0
            androidx.compose.foundation.layout.FillElement r13 = X.C05130Qo.A00
            X.0s9 r4 = X.AnonymousClass0GC.A00
            X.0tj r13 = X.C02190Db.A00(r13, r4, r0)
            r4 = -855065614(0xffffffffcd08bbf2, float:-1.4337616E8)
            boolean r16 = X.BE7.A1V(r9, r12, r4)
            r4 = r11 & 7168(0x1c00, float:1.0045E-41)
            r4 = r4 ^ 3072(0xc00, float:4.305E-42)
            r14 = 2048(0x800, float:2.87E-42)
            if (r4 <= r14) goto L_0x0191
            boolean r4 = r9.BEe(r2)
            if (r4 != 0) goto L_0x0196
        L_0x0191:
            r4 = r11 & 3072(0xc00, float:4.305E-42)
            r15 = 0
            if (r4 != r14) goto L_0x0197
        L_0x0196:
            r15 = 1
        L_0x0197:
            r16 = r16 | r15
            r4 = r11 & 896(0x380, float:1.256E-42)
            r4 = r4 ^ 384(0x180, float:5.38E-43)
            r14 = 256(0x100, float:3.59E-43)
            if (r4 <= r14) goto L_0x01a7
            boolean r4 = r9.BEe(r0)
            if (r4 != 0) goto L_0x01ac
        L_0x01a7:
            r11 = r11 & 384(0x180, float:5.38E-43)
            r4 = 0
            if (r11 != r14) goto L_0x01ad
        L_0x01ac:
            r4 = 1
        L_0x01ad:
            r16 = r16 | r4
            java.lang.Object r11 = r9.CER()
            if (r16 != 0) goto L_0x01b9
            java.lang.Object r4 = X.AnonymousClass0MH.A00
            if (r11 != r4) goto L_0x01c9
        L_0x01b9:
            X.DWs r11 = new X.DWs
            r21 = r11
            r22 = r12
            r23 = r2
            r25 = r0
            r21.<init>(r22, r23, r25)
            r9.CRH(r11)
        L_0x01c9:
            X.1Di r11 = (X.C22821Di) r11
            X.AnonymousClass0VR.A0R(r10, r5)
            X.C02210Dd.A00(r9, r13, r11, r5)
            r4 = -855048918(0xffffffffcd08fd2a, float:-1.43643296E8)
            r9.COB(r4)
            if (r17 == 0) goto L_0x01f5
            r12 = 1048576000(0x3e800000, float:0.25)
            java.lang.Integer r11 = X.AnonymousClass00R.A0C
            androidx.compose.foundation.layout.FillElement r4 = new androidx.compose.foundation.layout.FillElement
            r4.<init>(r11, r12)
            r27 = 432(0x1b0, float:6.05E-43)
            r28 = 120(0x78, float:1.68E-43)
            r26 = 0
            r24 = r20
            r25 = r20
            r22 = r20
            r21 = r4
            r23 = r17
            X.C02230Df.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x01f5:
            X.AnonymousClass0VR.A0R(r10, r5)
            X.BEA.A18(r9, r10)
            goto L_0x009a
        L_0x01fd:
            if (r13 == 0) goto L_0x0201
            X.0WC r18 = X.C17090tj.A00
        L_0x0201:
            r4 = r25 & 4
            if (r4 == 0) goto L_0x020d
            X.07W r0 = X.CG7.A00
            long r0 = X.C26257Cw2.A02(r9, r0)
            r11 = r11 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x020d:
            r4 = r25 & 8
            if (r4 == 0) goto L_0x0219
            X.07W r2 = X.CG7.A00
            long r2 = X.C26257Cw2.A01(r9, r2)
            r11 = r11 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x0219:
            r4 = r25 & 16
            if (r4 == 0) goto L_0x0225
            r4 = 2131232233(0x7f0805e9, float:1.808057E38)
            X.0Oe r17 = X.AnonymousClass0LS.A00(r9, r4)
            r11 = r11 & r12
        L_0x0225:
            r4 = r25 & 32
            if (r4 == 0) goto L_0x00dd
            r4 = 2131894851(0x7f122243, float:1.9424518E38)
            java.lang.String r8 = X.AnonymousClass0LT.A00(r9, r4)
            goto L_0x00d9
        L_0x0232:
            r4 = r24 & 48
            if (r4 != 0) goto L_0x0037
            r4 = r18
            int r4 = X.AnonymousClass001.A0R(r9, r4)
            r11 = r11 | r4
            goto L_0x0037
        L_0x023f:
            r11 = r7
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24631CCr.A00(X.0tn, X.0tj, X.0Oe, java.lang.String, java.lang.String, int, int, long, long):void");
    }
}
