package X;

/* renamed from: X.1fK  reason: invalid class name and case insensitive filesystem */
public final class C31291fK {
    public final AnonymousClass11P A00;
    public final C18030ve A01;
    public final C29791cs A02;

    public C31291fK(AnonymousClass11P r2, C18030ve r3, C29791cs r4) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a4, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A01, 4015) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass184 A00(X.C62652rk r26, int r27, int r28, int r29, int r30, long r31, long r33) {
        /*
            r25 = this;
            long r15 = android.os.SystemClock.elapsedRealtime()
            long r23 = r15 - r31
            r4 = r25
            X.1cs r1 = r4.A02
            boolean r0 = r1.A03()
            r22 = r0 ^ 1
            r0 = 1
            r9 = r27
            if (r9 == r0) goto L_0x0122
            r0 = 5
            if (r9 == r0) goto L_0x0122
            java.lang.Long r8 = java.lang.Long.valueOf(r33)
        L_0x001c:
            r10 = r26
            int r3 = r10.A02
            java.lang.Integer r14 = X.C63602tO.A01(r3)
            java.lang.Integer r7 = r10.A01()
            int r21 = r10.A00()
            java.lang.String r11 = r10.A02()
            X.1ct r2 = r1.A00()
            int r0 = r2.A00
            r6 = 0
            if (r0 == 0) goto L_0x011f
            long r0 = r2.A02
            r12 = 0
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L_0x011f
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C17960vV.A07(r0)
            long r0 = r0.longValue()
            long r31 = r31 - r0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 10
            long r12 = r5.toMillis(r0)
            int r0 = (r31 > r12 ? 1 : (r31 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x011f
            long r0 = r2.A02
            long r15 = r15 - r0
            java.lang.Long r6 = java.lang.Long.valueOf(r15)
            int r0 = r2.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C17960vV.A07(r0)
            int r0 = r0.intValue()
            r13 = 1
            if (r0 == r13) goto L_0x0078
            r13 = 2
            if (r0 == r13) goto L_0x0078
            r13 = 3
            if (r0 != r13) goto L_0x0078
            r13 = 4
        L_0x0078:
            r1 = 1
            r2 = r30
            if (r30 == 0) goto L_0x0119
            r0 = 2
            if (r2 == r1) goto L_0x008c
            r1 = 3
            if (r2 == r0) goto L_0x0119
            r0 = 4
            if (r2 == r1) goto L_0x008c
            r1 = 5
            if (r2 == r0) goto L_0x0119
            if (r2 != r1) goto L_0x0116
            r0 = 6
        L_0x008c:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)
        L_0x0090:
            r0 = 12
            r20 = 0
            if (r3 != r0) goto L_0x00a6
            r20 = 1
            X.0ve r2 = r4.A01
            r1 = 4015(0xfaf, float:5.626E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r19 = 1
            if (r0 == 0) goto L_0x00a8
        L_0x00a6:
            r19 = 0
        L_0x00a8:
            int r0 = r10.A04
            r1 = r28
            long r4 = (long) r1
            r1 = r29
            long r2 = (long) r1
            java.lang.Boolean r1 = r10.A00
            if (r1 == 0) goto L_0x0113
            boolean r18 = r1.booleanValue()
        L_0x00b8:
            java.lang.Long r15 = r10.A01
            r16 = 6
            if (r20 != 0) goto L_0x0125
            X.2HG r10 = new X.2HG
            r10.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r10.A07 = r1
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A0A = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r10.A0D = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r10.A0E = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            r10.A09 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r10.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r10.A01 = r0
            r10.A0C = r15
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r10.A0B = r0
            if (r8 == 0) goto L_0x00fa
            r10.A0F = r8
        L_0x00fa:
            r10.A05 = r14
            r10.A04 = r7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            r10.A06 = r0
            r10.A0G = r11
            if (r6 == 0) goto L_0x010a
            r10.A08 = r6
        L_0x010a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r10.A03 = r0
            r10.A02 = r12
            return r10
        L_0x0113:
            r18 = 0
            goto L_0x00b8
        L_0x0116:
            r12 = 0
            goto L_0x0090
        L_0x0119:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
            goto L_0x0090
        L_0x011f:
            r13 = 3
            goto L_0x0078
        L_0x0122:
            r8 = 0
            goto L_0x001c
        L_0x0125:
            if (r19 == 0) goto L_0x0129
            r10 = 0
            return r10
        L_0x0129:
            X.2Gy r10 = new X.2Gy
            r10.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r10.A05 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r10.A08 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r23)
            r10.A07 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r22)
            r10.A00 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r10.A01 = r0
            if (r8 == 0) goto L_0x0150
            r10.A09 = r8
        L_0x0150:
            r10.A04 = r7
            if (r6 == 0) goto L_0x0156
            r10.A06 = r6
        L_0x0156:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r10.A03 = r0
            r10.A02 = r12
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31291fK.A00(X.2rk, int, int, int, int, long, long):X.184");
    }
}
