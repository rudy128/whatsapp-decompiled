package X;

public abstract class CA7 {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0069, code lost:
        if (r2 == -9223372036854775807L) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long[] A00(X.CUI r19) {
        /*
            r13 = 3
            long[] r9 = new long[r13]
            r9 = {-1, -1, -1} // fill-array
            r2 = r19
            if (r19 == 0) goto L_0x0125
            java.util.List r5 = r2.A09     // Catch:{ Exception -> 0x011d }
            int r4 = r5.size()     // Catch:{ Exception -> 0x011d }
            r8 = 0
            java.lang.Object r3 = r5.get(r8)     // Catch:{ Exception -> 0x011d }
            X.CW8 r3 = (X.CW8) r3     // Catch:{ Exception -> 0x011d }
            int r0 = r4 + -1
            java.lang.Object r6 = r5.get(r0)     // Catch:{ Exception -> 0x011d }
            X.CW8 r6 = (X.CW8) r6     // Catch:{ Exception -> 0x011d }
            int r1 = r3.A00()     // Catch:{ Exception -> 0x011d }
            java.util.List r0 = r3.A01     // Catch:{ Exception -> 0x011d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x011d }
            X.CR8 r0 = (X.CR8) r0     // Catch:{ Exception -> 0x011d }
            java.util.List r0 = r0.A02     // Catch:{ Exception -> 0x011d }
            java.lang.Object r3 = r0.get(r8)     // Catch:{ Exception -> 0x011d }
            X.CPE r3 = (X.CPE) r3     // Catch:{ Exception -> 0x011d }
            int r1 = r6.A00()     // Catch:{ Exception -> 0x011d }
            java.util.List r0 = r6.A01     // Catch:{ Exception -> 0x011d }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x011d }
            X.CR8 r0 = (X.CR8) r0     // Catch:{ Exception -> 0x011d }
            java.util.List r0 = r0.A02     // Catch:{ Exception -> 0x011d }
            java.lang.Object r10 = r0.get(r8)     // Catch:{ Exception -> 0x011d }
            X.CPE r10 = (X.CPE) r10     // Catch:{ Exception -> 0x011d }
            boolean r0 = r3 instanceof X.BP1     // Catch:{ Exception -> 0x011d }
            if (r0 == 0) goto L_0x0125
            boolean r0 = r10 instanceof X.BP1     // Catch:{ Exception -> 0x011d }
            if (r0 == 0) goto L_0x0125
            X.BP1 r3 = (X.BP1) r3     // Catch:{ Exception -> 0x011d }
            X.BP1 r10 = (X.BP1) r10     // Catch:{ Exception -> 0x011d }
            X.BP5 r6 = r3.A00     // Catch:{ Exception -> 0x011d }
            long r0 = r6.A03     // Catch:{ Exception -> 0x011d }
            int r7 = (int) r0     // Catch:{ Exception -> 0x011d }
            r14 = 1
            int r4 = r4 - r14
            int r0 = X.AnonymousClass3MX.A01(r5)     // Catch:{ Exception -> 0x011d }
            if (r4 != r0) goto L_0x0106
            long r2 = r2.A01     // Catch:{ Exception -> 0x011d }
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0110
        L_0x006b:
            java.util.UUID r0 = X.C24736CHy.A04     // Catch:{ Exception -> 0x011d }
            long r4 = com.facebook.android.exoplayer2.util.Util.A04(r11)     // Catch:{ Exception -> 0x011d }
            X.BP5 r10 = r10.A00     // Catch:{ Exception -> 0x011d }
            boolean r11 = r10 instanceof X.BP4     // Catch:{ Exception -> 0x011d }
            if (r11 == 0) goto L_0x00fb
            java.util.List r0 = r10.A04     // Catch:{ Exception -> 0x011d }
            if (r0 == 0) goto L_0x00e0
            int r2 = r10.A00     // Catch:{ Exception -> 0x011d }
        L_0x007d:
            int r2 = r2 + r7
            int r2 = r2 - r14
            int r0 = r2 - r7
            int r12 = r0 + 1
            long r0 = (long) r7     // Catch:{ Exception -> 0x011d }
            long r18 = r6.A00(r0)     // Catch:{ Exception -> 0x011d }
            long r6 = (long) r2     // Catch:{ Exception -> 0x011d }
            long r16 = r10.A00(r6)     // Catch:{ Exception -> 0x011d }
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            java.util.List r0 = r10.A04     // Catch:{ Exception -> 0x011d }
            r14 = 1000000(0xf4240, double:4.940656E-318)
            if (r0 == 0) goto L_0x00bb
            long r0 = r10.A03     // Catch:{ Exception -> 0x011d }
            long r6 = r6 - r0
            int r0 = (int) r6     // Catch:{ Exception -> 0x011d }
            X.CX5 r0 = r10.A01(r0)     // Catch:{ Exception -> 0x011d }
            long r4 = r0.A03     // Catch:{ Exception -> 0x011d }
        L_0x00a3:
            long r4 = r4 * r14
            long r0 = r10.A01     // Catch:{ Exception -> 0x011d }
            long r4 = r4 / r0
        L_0x00a7:
            long r16 = r16 + r4
            long[] r3 = new long[r13]     // Catch:{ Exception -> 0x011d }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r18 = r18 / r0
            r3[r8] = r18     // Catch:{ Exception -> 0x011d }
            long r16 = r16 / r0
            r0 = 1
            r3[r0] = r16     // Catch:{ Exception -> 0x011d }
            long r1 = (long) r12     // Catch:{ Exception -> 0x011d }
            r0 = 2
            r3[r0] = r1     // Catch:{ Exception -> 0x011d }
            goto L_0x011c
        L_0x00bb:
            if (r11 == 0) goto L_0x00c2
            r1 = -1
        L_0x00be:
            r0 = -1
            if (r1 == r0) goto L_0x00dd
            goto L_0x00cc
        L_0x00c2:
            r0 = r10
            X.BP3 r0 = (X.BP3) r0     // Catch:{ Exception -> 0x011d }
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x011d }
            int r1 = r0.size()     // Catch:{ Exception -> 0x011d }
            goto L_0x00be
        L_0x00cc:
            long r2 = r10.A03     // Catch:{ Exception -> 0x011d }
            long r0 = (long) r1     // Catch:{ Exception -> 0x011d }
            long r2 = r2 + r0
            r0 = 1
            long r2 = r2 - r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00dd
            long r0 = r10.A00(r6)     // Catch:{ Exception -> 0x011d }
            long r4 = r4 - r0
            goto L_0x00a7
        L_0x00dd:
            long r4 = r10.A01     // Catch:{ Exception -> 0x011d }
            goto L_0x00a3
        L_0x00e0:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00f9
            long r2 = r10.A01     // Catch:{ Exception -> 0x011d }
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            long r0 = r10.A01     // Catch:{ Exception -> 0x011d }
            long r2 = r2 / r0
            long r4 = r4 + r2
            r0 = 1
            long r4 = r4 - r0
            long r4 = r4 / r2
            int r2 = (int) r4     // Catch:{ Exception -> 0x011d }
            goto L_0x007d
        L_0x00f9:
            r2 = -1
            goto L_0x007d
        L_0x00fb:
            r0 = r10
            X.BP3 r0 = (X.BP3) r0     // Catch:{ Exception -> 0x011d }
            java.util.List r0 = r0.A00     // Catch:{ Exception -> 0x011d }
            int r2 = r0.size()     // Catch:{ Exception -> 0x011d }
            goto L_0x007d
        L_0x0106:
            int r0 = r4 + 1
            java.lang.Object r0 = r5.get(r0)     // Catch:{ Exception -> 0x011d }
            X.CW8 r0 = (X.CW8) r0     // Catch:{ Exception -> 0x011d }
            long r2 = r0.A00     // Catch:{ Exception -> 0x011d }
        L_0x0110:
            java.lang.Object r0 = r5.get(r4)     // Catch:{ Exception -> 0x011d }
            X.CW8 r0 = (X.CW8) r0     // Catch:{ Exception -> 0x011d }
            long r0 = r0.A00     // Catch:{ Exception -> 0x011d }
            long r11 = r2 - r0
            goto L_0x006b
        L_0x011c:
            return r3
        L_0x011d:
            r2 = move-exception
            java.lang.String r1 = "DashManifestHelper2"
            java.lang.String r0 = "Could not get segment range from manifest"
            android.util.Log.w(r1, r0, r2)
        L_0x0125:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CA7.A00(X.CUI):long[]");
    }
}
