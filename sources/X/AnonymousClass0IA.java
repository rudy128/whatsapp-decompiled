package X;

/* renamed from: X.0IA  reason: invalid class name */
public final class AnonymousClass0IA {
    public int A00 = 300;
    public final AnonymousClass06w A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r10v0, types: [X.078, X.0I9] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0062, code lost:
        if (r9.A00 != 0) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x006c, code lost:
        if (X.AnonymousClass001.A0x(r6, r11) == 254) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x006e, code lost:
        r0 = X.AnonymousClass0GO.A01;
        r1 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0071, code lost:
        if (r7 == 0) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0073, code lost:
        r1 = (r7 * 2) + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        r22 = r9.A02;
        r14 = r9.A04;
        X.AnonymousClass06w.A01(r9, r1);
        r13 = r9.A02;
        r12 = r9.A04;
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0085, code lost:
        if (r11 >= r7) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008f, code lost:
        if (X.AnonymousClass001.A0x(r6, r11) >= 128) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0091, code lost:
        r21 = r22[r11];
        r1 = X.AnonymousClass001.A0D(r21);
        r5 = X.AnonymousClass06w.A00(r9, r1 >>> 7);
        r1 = (long) (r1 & com.facebook.common.dextricks.StringTreeSet.OFFSET_BASE_ENCODING);
        r0 = r9.A03;
        r20 = r5 >> 3;
        r19 = (r5 & 7) << 3;
        r0[r20] = (r0[r20] & ((255 << r19) ^ -1)) | (r1 << r19);
        r15 = X.AnonymousClass000.A0E(r5, r9.A00);
        r20 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r0[r20] = (r0[r20] & ((255 << r19) ^ -1)) | (r1 << r19);
        r13[r5] = r21;
        r12[r5] = r14[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d6, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00e0, code lost:
        r11 = X.AnonymousClass06w.A00(r9, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00e4, code lost:
        r9.A01++;
        r12 = r9.A00;
        r6 = r9.A03;
        r15 = r11 >> 3;
        r13 = r6[r15];
        r5 = (r11 & 7) << 3;
        r9.A00 = r12 - X.AnonymousClass000.A1P((((r13 >> r5) & 255) > 128 ? 1 : (((r13 >> r5) & 255) == 128 ? 0 : -1)));
        r6[r15] = (r13 & ((255 << r5) ^ -1)) | (r3 << r5);
        r0 = X.AnonymousClass000.A0E(r11, r9.A00);
        r5 = r0 >> 3;
        r2 = (r0 & 7) << 3;
        r6[r5] = (r3 << r2) | (((255 << r2) ^ -1) & r6[r5]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0058, code lost:
        if ((X.AnonymousClass000.A0U(r17) & -9187201950435737472L) == 0) goto L_0x00d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x005a, code lost:
        r11 = X.AnonymousClass06w.A00(r9, r8);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass078 A00(java.lang.Object r29, int r30) {
        /*
            r28 = this;
            X.0ra r0 = X.C02980Gd.A02
            X.078 r10 = new X.078
            r1 = r29
            r10.<init>(r0, r1)
            r0 = r28
            X.06w r9 = r0.A01
            r27 = r30
            int r0 = X.AnonymousClass001.A0D(r27)
            int r8 = r0 >>> 7
            r12 = r0 & 127(0x7f, float:1.78E-43)
            int r7 = r9.A00
            r5 = r8 & r7
            r19 = 0
        L_0x001d:
            long[] r6 = r9.A03
            long r17 = X.AnonymousClass002.A01(r6, r5)
            long r3 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r1 = r3 * r15
            long r1 = r1 ^ r17
            long r13 = r1 - r15
            r25 = -1
            long r1 = r1 ^ r25
            long r1 = r1 & r13
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r15
        L_0x003a:
            r13 = 0
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0051
            int r11 = X.AnonymousClass001.A0H(r5, r7, r1)
            int[] r0 = r9.A02
            r13 = r0[r11]
            r0 = r27
            if (r13 == r0) goto L_0x0128
            long r1 = X.AnonymousClass000.A0T(r1)
            goto L_0x003a
        L_0x0051:
            long r1 = X.AnonymousClass000.A0U(r17)
            long r1 = r1 & r15
            int r0 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x00d9
            int r11 = X.AnonymousClass06w.A00(r9, r8)
            int r0 = r9.A00
            r23 = 255(0xff, double:1.26E-321)
            if (r0 != 0) goto L_0x00e4
            long r12 = X.AnonymousClass001.A0x(r6, r11)
            r1 = 254(0xfe, double:1.255E-321)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00e4
            X.070 r0 = X.AnonymousClass0GO.A01
            r1 = 6
            if (r7 == 0) goto L_0x0077
            int r0 = r7 * 2
            int r1 = r0 + 1
        L_0x0077:
            int[] r0 = r9.A02
            r22 = r0
            java.lang.Object[] r14 = r9.A04
            X.AnonymousClass06w.A01(r9, r1)
            int[] r13 = r9.A02
            java.lang.Object[] r12 = r9.A04
            r11 = 0
        L_0x0085:
            if (r11 >= r7) goto L_0x00e0
            long r15 = X.AnonymousClass001.A0x(r6, r11)
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d6
            r21 = r22[r11]
            int r1 = X.AnonymousClass001.A0D(r21)
            int r0 = r1 >>> 7
            int r5 = X.AnonymousClass06w.A00(r9, r0)
            r0 = r1 & 127(0x7f, float:1.78E-43)
            long r1 = (long) r0
            long[] r0 = r9.A03
            int r20 = r5 >> 3
            r15 = r5 & 7
            int r19 = r15 << 3
            r17 = r0[r20]
            long r15 = r23 << r19
            long r15 = r15 ^ r25
            long r17 = r17 & r15
            long r15 = r1 << r19
            long r17 = r17 | r15
            r0[r20] = r17
            int r15 = r9.A00
            int r15 = X.AnonymousClass000.A0E(r5, r15)
            int r20 = r15 >> 3
            r15 = r15 & 7
            int r19 = r15 << 3
            r17 = r0[r20]
            long r15 = r23 << r19
            long r15 = r15 ^ r25
            long r17 = r17 & r15
            long r1 = r1 << r19
            long r17 = r17 | r1
            r0[r20] = r17
            r13[r5] = r21
            r0 = r14[r11]
            r12[r5] = r0
        L_0x00d6:
            int r11 = r11 + 1
            goto L_0x0085
        L_0x00d9:
            int r19 = r19 + 8
            int r5 = r5 + r19
            r5 = r5 & r7
            goto L_0x001d
        L_0x00e0:
            int r11 = X.AnonymousClass06w.A00(r9, r8)
        L_0x00e4:
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            int r12 = r9.A00
            long[] r6 = r9.A03
            int r15 = r11 >> 3
            r13 = r6[r15]
            r0 = r11 & 7
            int r5 = r0 << 3
            long r7 = r13 >> r5
            long r7 = r7 & r23
            r1 = 128(0x80, double:6.32E-322)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            int r12 = r12 - r0
            r9.A00 = r12
            long r0 = r23 << r5
            long r0 = r0 ^ r25
            long r13 = r13 & r0
            long r0 = r3 << r5
            long r13 = r13 | r0
            r6[r15] = r13
            int r0 = r9.A00
            int r0 = X.AnonymousClass000.A0E(r11, r0)
            int r5 = r0 >> 3
            r0 = r0 & 7
            int r2 = r0 << 3
            r0 = r6[r5]
            long r23 = r23 << r2
            long r23 = r23 ^ r25
            long r23 = r23 & r0
            long r3 = r3 << r2
            long r3 = r3 | r23
            r6[r5] = r3
        L_0x0128:
            int[] r0 = r9.A02
            r0[r11] = r30
            java.lang.Object[] r0 = r9.A04
            r0[r11] = r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0IA.A00(java.lang.Object, int):X.078");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.06w, X.0KT] */
    public AnonymousClass0IA() {
        AnonymousClass06w r0 = C02840Fp.A00;
        ? r1 = new AnonymousClass0KT();
        AnonymousClass070 r02 = AnonymousClass0GO.A01;
        AnonymousClass06w.A01(r1, 6);
        this.A01 = r1;
    }
}
