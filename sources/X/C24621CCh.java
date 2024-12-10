package X;

/* renamed from: X.CCh  reason: case insensitive filesystem */
public abstract class C24621CCh {
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        if (r2.BEe(r14) == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r4 == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r2.BEf(r19) == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r4 == false) goto L_0x0085;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17130tn r31, X.C17090tj r32, X.C26251Cvq r33, X.C24263ByM r34, X.C24290Byn r35, X.C24290Byn r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, X.C18090vk r40, X.C18090vk r41, int r42, int r43, int r44, long r45) {
        /*
            r9 = r32
            r14 = r45
            r46 = r33
            r19 = r38
            r18 = r39
            r7 = r40
            r6 = r41
            r21 = r35
            r22 = r34
            r20 = r36
            r5 = 0
            r45 = r37
            r0 = r45
            X.C18070vi.A0d(r0, r5)
            r0 = 831820414(0x3194927e, float:4.324021E-9)
            r2 = r31
            r2.COC(r0)
            r0 = r44
            r3 = r44 & 1
            r1 = r42
            if (r3 == 0) goto L_0x0261
            r10 = r42 | 6
        L_0x002e:
            r17 = r44 & 2
            if (r17 == 0) goto L_0x0256
            r10 = r10 | 48
        L_0x0034:
            r3 = r1 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0047
            r3 = r44 & 4
            if (r3 != 0) goto L_0x0044
            boolean r4 = r2.BEe(r14)
            r3 = 256(0x100, float:3.59E-43)
            if (r4 != 0) goto L_0x0046
        L_0x0044:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r10 = r10 | r3
        L_0x0047:
            r3 = r1 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x005c
            r3 = r44 & 8
            if (r3 != 0) goto L_0x0059
            r3 = r46
            boolean r4 = r2.BEf(r3)
            r3 = 2048(0x800, float:2.87E-42)
            if (r4 != 0) goto L_0x005b
        L_0x0059:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x005b:
            r10 = r10 | r3
        L_0x005c:
            r3 = r1 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0071
            r3 = r44 & 16
            if (r3 != 0) goto L_0x006e
            r3 = r19
            boolean r4 = r2.BEf(r3)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L_0x0070
        L_0x006e:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x0070:
            r10 = r10 | r3
        L_0x0071:
            r3 = 196608(0x30000, float:2.75506E-40)
            r3 = r3 & r42
            if (r3 != 0) goto L_0x0088
            r3 = r44 & 32
            if (r3 != 0) goto L_0x0085
            r3 = r18
            boolean r4 = r2.BEf(r3)
            r3 = 131072(0x20000, float:1.83671E-40)
            if (r4 != 0) goto L_0x0087
        L_0x0085:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x0087:
            r10 = r10 | r3
        L_0x0088:
            r16 = r44 & 64
            r4 = 1572864(0x180000, float:2.204052E-39)
            if (r16 != 0) goto L_0x009c
            r3 = r42 & r4
            if (r3 != 0) goto L_0x009d
            boolean r3 = r2.BEh(r7)
            r4 = 524288(0x80000, float:7.34684E-40)
            if (r3 == 0) goto L_0x009c
            r4 = 1048576(0x100000, float:1.469368E-39)
        L_0x009c:
            r10 = r10 | r4
        L_0x009d:
            r8 = r0 & 128(0x80, float:1.794E-43)
            r4 = 12582912(0xc00000, float:1.7632415E-38)
            if (r8 != 0) goto L_0x00b1
            r3 = r42 & r4
            if (r3 != 0) goto L_0x00b2
            boolean r3 = r2.BEh(r6)
            r4 = 4194304(0x400000, float:5.877472E-39)
            if (r3 == 0) goto L_0x00b1
            r4 = 8388608(0x800000, float:1.17549435E-38)
        L_0x00b1:
            r10 = r10 | r4
        L_0x00b2:
            r4 = r0 & 256(0x100, float:3.59E-43)
            r11 = 100663296(0x6000000, float:2.4074124E-35)
            if (r4 != 0) goto L_0x00c8
            r3 = r42 & r11
            if (r3 != 0) goto L_0x00c9
            r3 = r21
            boolean r3 = r2.BEf(r3)
            r11 = 33554432(0x2000000, float:9.403955E-38)
            if (r3 == 0) goto L_0x00c8
            r11 = 67108864(0x4000000, float:1.5046328E-36)
        L_0x00c8:
            r10 = r10 | r11
        L_0x00c9:
            r11 = r0 & 512(0x200, float:7.175E-43)
            r12 = 805306368(0x30000000, float:4.656613E-10)
            if (r11 != 0) goto L_0x00df
            r3 = r42 & r12
            if (r3 != 0) goto L_0x00e0
            r3 = r22
            boolean r3 = r2.BEf(r3)
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            if (r3 == 0) goto L_0x00df
            r12 = 536870912(0x20000000, float:1.0842022E-19)
        L_0x00df:
            r10 = r10 | r12
        L_0x00e0:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            r35 = r43
            if (r12 == 0) goto L_0x0244
            r13 = r43 | 6
        L_0x00e8:
            r3 = 306783379(0x12492493, float:6.34695E-28)
            r10 = r10 & r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r10 != r3) goto L_0x0129
            r10 = r13 & 3
            r3 = 2
            if (r10 != r3) goto L_0x0129
            boolean r3 = r2.BZO()
            if (r3 == 0) goto L_0x0129
            r2.CNR()
        L_0x00ff:
            X.0Vf r3 = r2.BKF()
            if (r3 == 0) goto L_0x0128
            X.DXQ r2 = new X.DXQ
            r30 = r19
            r31 = r18
            r32 = r7
            r33 = r6
            r34 = r1
            r36 = r0
            r37 = r14
            r23 = r2
            r24 = r9
            r25 = r46
            r26 = r22
            r27 = r21
            r28 = r20
            r29 = r45
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r3.A06 = r2
        L_0x0128:
            return
        L_0x0129:
            r2.CNl()
            r3 = r42 & 1
            if (r3 == 0) goto L_0x01f9
            boolean r3 = r2.BQS()
            if (r3 != 0) goto L_0x01f9
            r2.CNR()
        L_0x0139:
            r2.BKA()
            androidx.compose.foundation.layout.FillElement r3 = X.C05130Qo.A00
            X.0tj r11 = r9.CP5(r3)
            X.07W r8 = X.CG7.A00
            X.Cw2 r4 = X.BE6.A0g(r2, r8)
            boolean r3 = r4 instanceof X.BqD
            if (r3 == 0) goto L_0x01f3
            X.BqD r4 = (X.BqD) r4
            long r3 = r4.A0D
        L_0x0150:
            r36 = 0
            X.0s9 r10 = X.AnonymousClass0GC.A00
            X.0tj r11 = X.C02190Db.A00(r11, r10, r3)
            androidx.compose.ui.Alignment r3 = X.AnonymousClass0MX.A05
            X.0tM r13 = X.BEA.A0S(r2, r3)
            r3 = r2
            X.0VR r3 = (X.AnonymousClass0VR) r3
            int r12 = r3.A01
            X.0uW r10 = r2.BPs()
            X.0vk r4 = X.C05030Qc.A00
            X.04D r11 = X.AnonymousClass0LO.A01(r11)
            X.BEA.A19(r2, r3, r4)
            X.BE9.A18(r2, r13, r10)
            X.1OS r10 = X.C05030Qc.A01
            boolean r4 = r3.A0K
            if (r4 != 0) goto L_0x017f
            boolean r4 = X.BE9.A1R(r2, r12)
            if (r4 != 0) goto L_0x0182
        L_0x017f:
            X.BE9.A19(r2, r10, r12)
        L_0x0182:
            X.BEB.A0r(r2, r11)
            X.0WC r11 = X.C17090tj.A00
            X.07W r4 = X.CG8.A00
            r2.BFh(r4)
            r10 = 1109393408(0x42200000, float:40.0)
            X.0tj r40 = X.AnonymousClass0Q7.A04(r11, r10)
            X.07W r10 = X.CG9.A00
            java.lang.Object r10 = r2.BFh(r10)
            X.Ciq r10 = (X.C25610Ciq) r10
            X.0WV r10 = r10.A07
            long r25 = X.C26257Cw2.A02(r2, r8)
            long r27 = X.C26257Cw2.A01(r2, r8)
            r24 = 12
            r23 = r2
            X.0Iq r37 = X.AnonymousClass0EB.A00(r23, r24, r25, r27)
            r2.BFh(r4)
            r8 = 1082130432(0x40800000, float:4.0)
            r4 = -574898487(0xffffffffddbbbec9, float:-1.69105892E18)
            r2.COB(r4)
            X.0KM r4 = new X.0KM
            r4.<init>(r8)
            X.AnonymousClass0VR.A0R(r3, r5)
            X.DXc r8 = new X.DXc
            r23 = r8
            r24 = r46
            r25 = r22
            r26 = r20
            r27 = r21
            r28 = r45
            r29 = r18
            r30 = r19
            r31 = r6
            r32 = r7
            r33 = r14
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r5 = 1042838662(0x3e287486, float:0.164507)
            X.04D r42 = X.AnonymousClass0LC.A00(r2, r8, r5)
            r43 = 196608(0x30000, float:2.75506E-40)
            r44 = 16
            r38 = r4
            r39 = r2
            r41 = r10
            X.AnonymousClass0EC.A00(r36, r37, r38, r39, r40, r41, r42, r43, r44)
            X.BEA.A18(r2, r3)
            goto L_0x00ff
        L_0x01f3:
            X.BqC r4 = (X.BqC) r4
            long r3 = r4.A0D
            goto L_0x0150
        L_0x01f9:
            if (r17 == 0) goto L_0x01fd
            X.0WC r9 = X.C17090tj.A00
        L_0x01fd:
            r3 = r44 & 4
            if (r3 == 0) goto L_0x0205
            long r14 = X.C26257Cw2.A00(r2)
        L_0x0205:
            r3 = r44 & 8
            if (r3 == 0) goto L_0x0211
            X.Ciy r3 = X.BE7.A0S(r2)
            X.Cvq r3 = r3.A02
            r46 = r3
        L_0x0211:
            r3 = r44 & 16
            if (r3 == 0) goto L_0x021c
            r3 = 2131899286(0x7f123396, float:1.9433514E38)
            java.lang.String r19 = X.AnonymousClass0LT.A00(r2, r3)
        L_0x021c:
            r3 = r44 & 32
            if (r3 == 0) goto L_0x0227
            r3 = 2131898766(0x7f12318e, float:1.943246E38)
            java.lang.String r18 = X.AnonymousClass0LT.A00(r2, r3)
        L_0x0227:
            if (r16 == 0) goto L_0x022e
            X.DWU r7 = new X.DWU
            r7.<init>(r5)
        L_0x022e:
            if (r8 == 0) goto L_0x0236
            r3 = 1
            X.DWU r6 = new X.DWU
            r6.<init>(r3)
        L_0x0236:
            if (r4 == 0) goto L_0x023a
            X.Byn r21 = X.C24290Byn.Borderless
        L_0x023a:
            if (r11 == 0) goto L_0x023e
            X.ByM r22 = X.C24263ByM.Default
        L_0x023e:
            if (r12 == 0) goto L_0x0139
            X.Byn r20 = X.C24290Byn.Borderless
            goto L_0x0139
        L_0x0244:
            r3 = r43 & 6
            if (r3 != 0) goto L_0x0252
            r3 = r20
            int r3 = X.AnonymousClass001.A0Q(r2, r3)
            r13 = r43 | r3
            goto L_0x00e8
        L_0x0252:
            r13 = r35
            goto L_0x00e8
        L_0x0256:
            r3 = r42 & 48
            if (r3 != 0) goto L_0x0034
            int r3 = X.AnonymousClass001.A0R(r2, r9)
            r10 = r10 | r3
            goto L_0x0034
        L_0x0261:
            r3 = r42 & 6
            if (r3 != 0) goto L_0x026f
            r3 = r45
            int r10 = X.AnonymousClass001.A0Z(r2, r3)
            r10 = r10 | r42
            goto L_0x002e
        L_0x026f:
            r10 = r1
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24621CCh.A00(X.0tn, X.0tj, X.Cvq, X.ByM, X.Byn, X.Byn, java.lang.String, java.lang.String, java.lang.String, X.0vk, X.0vk, int, int, int, long):void");
    }
}
