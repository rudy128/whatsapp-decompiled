package X;

/* renamed from: X.0EC  reason: invalid class name */
public abstract class AnonymousClass0EC {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r10.BEf(r12) == false) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        if (r10.BEf(r15) == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r3 == false) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass0JY r14, X.C03530Iq r15, X.AnonymousClass0KM r16, X.C17130tn r17, X.C17090tj r18, X.C16370s9 r19, X.C36001nB r20, int r21, int r22) {
        /*
            r9 = r14
            r4 = r16
            r5 = r15
            r12 = r19
            r11 = r18
            r0 = 5
            r7 = r20
            X.C18070vi.A0d(r7, r0)
            r0 = 1179621553(0x464f98b1, float:13286.173)
            r10 = r17
            r10.COC(r0)
            r8 = r22 & 1
            r1 = r21
            r0 = r21 | 6
            if (r8 != 0) goto L_0x0028
            r0 = r21 & 14
            if (r0 != 0) goto L_0x018d
            int r0 = X.AnonymousClass001.A0Q(r10, r11)
            r0 = r0 | r21
        L_0x0028:
            r2 = r21 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L_0x003b
            r2 = r22 & 2
            if (r2 != 0) goto L_0x0038
            boolean r3 = r10.BEf(r12)
            r2 = 32
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r2 = 16
        L_0x003a:
            r0 = r0 | r2
        L_0x003b:
            r2 = r1 & 896(0x380, float:1.256E-42)
            if (r2 != 0) goto L_0x004e
            r2 = r22 & 4
            if (r2 != 0) goto L_0x004b
            boolean r3 = r10.BEf(r15)
            r2 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x004d
        L_0x004b:
            r2 = 128(0x80, float:1.794E-43)
        L_0x004d:
            r0 = r0 | r2
        L_0x004e:
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            if (r2 != 0) goto L_0x0061
            r2 = r22 & 8
            if (r2 != 0) goto L_0x005e
            boolean r3 = r10.BEf(r4)
            r2 = 2048(0x800, float:2.87E-42)
            if (r3 != 0) goto L_0x0060
        L_0x005e:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0060:
            r0 = r0 | r2
        L_0x0061:
            r6 = r22 & 16
            if (r6 == 0) goto L_0x017f
            r0 = r0 | 24576(0x6000, float:3.4438E-41)
        L_0x0067:
            r3 = r22 & 32
            r2 = 196608(0x30000, float:2.75506E-40)
            if (r3 != 0) goto L_0x0077
            r2 = 458752(0x70000, float:6.42848E-40)
            r2 = r2 & r21
            if (r2 != 0) goto L_0x0078
            int r2 = X.AnonymousClass001.A0e(r10, r7)
        L_0x0077:
            r0 = r0 | r2
        L_0x0078:
            r3 = 374491(0x5b6db, float:5.24774E-40)
            r3 = r3 & r0
            r2 = 74898(0x12492, float:1.04954E-40)
            if (r3 != r2) goto L_0x00a7
            boolean r2 = r10.BZO()
            if (r2 == 0) goto L_0x00a7
            r10.CNR()
        L_0x008a:
            X.0Vf r2 = r10.BKF()
            if (r2 == 0) goto L_0x00a6
            X.0nc r0 = new X.0nc
            r14 = r0
            r15 = r9
            r16 = r5
            r17 = r4
            r18 = r11
            r19 = r12
            r20 = r7
            r21 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)
            r2.A03(r0)
        L_0x00a6:
            return
        L_0x00a7:
            r10.CNl()
            r2 = r21 & 1
            if (r2 == 0) goto L_0x013b
            boolean r2 = r10.BQS()
            if (r2 != 0) goto L_0x013b
            r10.CNR()
            r2 = r22 & 2
            if (r2 == 0) goto L_0x00bd
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x00bd:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x00c3
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x00c3:
            r2 = r22 & 8
            if (r2 == 0) goto L_0x00c9
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x00c9:
            r10.BKA()
            r2 = -2116091914(0xffffffff81defff6, float:-8.1917207E-38)
            r10.COB(r2)
            long r2 = r5.A00
            X.0Qk r8 = new X.0Qk
            r8.<init>(r2)
            r6 = 0
            X.0uU r2 = X.AnonymousClass0Ou.A01(r10, r8)
            r8 = r10
            X.0VR r8 = (X.AnonymousClass0VR) r8
            X.AnonymousClass0VR.A0R(r8, r6)
            long r18 = X.AnonymousClass000.A0V(r2)
            r2 = 1779883118(0x6a16dc6e, float:4.5594956E25)
            r10.COB(r2)
            long r2 = r5.A01
            X.0uU r2 = X.AnonymousClass0Ou.A00(r10, r2)
            X.AnonymousClass0VR.A0R(r8, r6)
            long r20 = X.AnonymousClass000.A0V(r2)
            X.0uU r2 = r4.A01(r10)
            java.lang.Object r2 = r2.getValue()
            X.DSH r2 = (X.DSH) r2
            float r14 = r2.A02()
            X.0uU r2 = r4.A00(r10)
            java.lang.Object r2 = r2.getValue()
            X.DSH r2 = (X.DSH) r2
            float r15 = r2.A02()
            X.0mt r2 = new X.0mt
            r2.<init>(r7, r0)
            r3 = 664103990(0x27956c36, float:4.147313E-15)
            X.04D r13 = X.AnonymousClass0LC.A00(r10, r2, r3)
            r16 = 12582912(0xc00000, float:1.7632415E-38)
            r2 = r0 & 14
            r16 = r16 | r2
            r2 = r0 & 112(0x70, float:1.57E-43)
            r16 = r16 | r2
            r2 = 3670016(0x380000, float:5.142788E-39)
            int r0 = r0 << 6
            r0 = r0 & r2
            r16 = r16 | r0
            r17 = r6
            X.AnonymousClass0Pu.A04(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r20)
            goto L_0x008a
        L_0x013b:
            if (r8 == 0) goto L_0x013f
            X.0WC r11 = X.C17090tj.A00
        L_0x013f:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0154
            r2 = 1266660211(0x4b7fb373, float:1.6757619E7)
            r10.COB(r2)
            java.lang.Integer r2 = X.C02950Ga.A01
            X.0WV r12 = X.C04570Nx.A01(r10, r2)
            X.AnonymousClass0VR.A0T(r10)
            r0 = r0 & -113(0xffffffffffffff8f, float:NaN)
        L_0x0154:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x0165
            r14 = 15
            r15 = 0
            r13 = r10
            r17 = r15
            X.0Iq r5 = X.AnonymousClass0EB.A00(r13, r14, r15, r17)
            r0 = r0 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0165:
            r2 = r22 & 8
            if (r2 == 0) goto L_0x017a
            r2 = -574898487(0xffffffffddbbbec9, float:-1.69105892E18)
            r10.COB(r2)
            r2 = 0
            X.0KM r4 = new X.0KM
            r4.<init>(r2)
            X.AnonymousClass0VR.A0T(r10)
            r0 = r0 & -7169(0xffffffffffffe3ff, float:NaN)
        L_0x017a:
            if (r6 == 0) goto L_0x00c9
            r9 = 0
            goto L_0x00c9
        L_0x017f:
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r21
            if (r2 != 0) goto L_0x0067
            int r2 = X.AnonymousClass001.A0U(r10, r14)
            r0 = r0 | r2
            goto L_0x0067
        L_0x018d:
            r0 = r1
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0EC.A00(X.0JY, X.0Iq, X.0KM, X.0tn, X.0tj, X.0s9, X.1nB, int, int):void");
    }
}
