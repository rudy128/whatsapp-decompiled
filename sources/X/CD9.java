package X;

public abstract class CD9 {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        r6 = new boolean[r1];
        r1 = r3.size() - 1;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r6[r5] = X.AnonymousClass000.A1T((X.BE9.A0I(r3, r1) >> 1) & 1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r6[r5 + 1] = X.AnonymousClass000.A1T((X.BE9.A0I(r3, r1) >> 2) & 1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        r6[r5 + 2] = X.AnonymousClass000.A1T((X.BE9.A0I(r3, r1) >> 3) & 1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r6[r5 + 3] = X.AnonymousClass000.A1T((X.BE9.A0I(r3, r1) >> 4) & 1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r6[r5 + 4] = X.AnonymousClass000.A1T((X.BE9.A0I(r3, r1) >> 5) & 1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r6[r5 + 5] = X.AnonymousClass000.A1T((X.BE9.A0I(r3, r1) >> 6) & 1, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r6[r5 + 6] = X.AnonymousClass000.A1T((X.BE9.A0I(r3, r1) >> 7) & 1, 1);
        r5 = r5 + 7;
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ea, code lost:
        if (r1 >= 0) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ec, code lost:
        r6 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C25171CaN r14) {
        /*
            java.lang.Object r5 = r14.A00()
            boolean r0 = r5 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0113
            X.DSD r5 = (X.DSD) r5     // Catch:{ all -> 0x010e }
            byte r0 = r5.A00     // Catch:{ all -> 0x010e }
            r2 = r0 & 255(0xff, float:3.57E-43)
            r0 = r2 & 128(0x80, float:1.794E-43)
            if (r0 != 0) goto L_0x0108
            r1 = 1
            r0 = r2 & 1
            boolean r7 = X.AnonymousClass000.A1T(r0, r1)
            r1 = 2
            r0 = r2 & 2
            boolean r8 = X.AnonymousClass000.A1T(r0, r1)
            r1 = 4
            r0 = r2 & 4
            boolean r9 = X.AnonymousClass000.A1T(r0, r1)
            r1 = 8
            r0 = r2 & 8
            boolean r10 = X.AnonymousClass000.A1T(r0, r1)
            r1 = 16
            r0 = r2 & 16
            boolean r11 = X.AnonymousClass000.A1T(r0, r1)
            r1 = 32
            r0 = r2 & 32
            boolean r12 = X.AnonymousClass000.A1T(r0, r1)
            r1 = 64
            r0 = r2 & 64
            boolean r13 = X.AnonymousClass000.A1T(r0, r1)
            if (r13 == 0) goto L_0x00f2
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x010e }
            r1 = 0
        L_0x0050:
            java.lang.Object r2 = r14.A00()     // Catch:{ all -> 0x010e }
            java.lang.Throwable r0 = X.C30671eK.A00(r2)     // Catch:{ all -> 0x010e }
            if (r0 != 0) goto L_0x00ed
            X.DSD r2 = (X.DSD) r2     // Catch:{ all -> 0x010e }
            byte r0 = r2.A00     // Catch:{ all -> 0x010e }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r1 + 7
            X.C17890vO.A1D(r3, r0)     // Catch:{ all -> 0x010e }
            r0 = r0 & 1
            r2 = 1
            if (r0 == r2) goto L_0x006b
            goto L_0x0071
        L_0x006b:
            r0 = 63
            if (r1 <= r0) goto L_0x0050
            goto L_0x00f4
        L_0x0071:
            boolean[] r6 = new boolean[r1]     // Catch:{ all -> 0x010e }
            int r1 = r3.size()     // Catch:{ all -> 0x010e }
            int r1 = r1 - r2
            r5 = 0
        L_0x0079:
            int r0 = X.BE9.A0I(r3, r1)     // Catch:{ all -> 0x010e }
            int r0 = r0 >> r2
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            r6[r5] = r0     // Catch:{ all -> 0x010e }
            int r4 = r5 + 1
            int r0 = X.BE9.A0I(r3, r1)     // Catch:{ all -> 0x010e }
            int r0 = r0 >> 2
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            r6[r4] = r0     // Catch:{ all -> 0x010e }
            int r4 = r5 + 2
            int r0 = X.BE9.A0I(r3, r1)     // Catch:{ all -> 0x010e }
            int r0 = r0 >> 3
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            r6[r4] = r0     // Catch:{ all -> 0x010e }
            int r4 = r5 + 3
            int r0 = X.BE9.A0I(r3, r1)     // Catch:{ all -> 0x010e }
            int r0 = r0 >> 4
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            r6[r4] = r0     // Catch:{ all -> 0x010e }
            int r4 = r5 + 4
            int r0 = X.BE9.A0I(r3, r1)     // Catch:{ all -> 0x010e }
            int r0 = r0 >> 5
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            r6[r4] = r0     // Catch:{ all -> 0x010e }
            int r4 = r5 + 5
            int r0 = X.BE9.A0I(r3, r1)     // Catch:{ all -> 0x010e }
            int r0 = r0 >> 6
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            r6[r4] = r0     // Catch:{ all -> 0x010e }
            int r4 = r5 + 6
            int r0 = X.BE9.A0I(r3, r1)     // Catch:{ all -> 0x010e }
            int r0 = r0 >> 7
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1T(r0, r2)
            r6[r4] = r0     // Catch:{ all -> 0x010e }
            int r5 = r5 + 7
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x0079
            goto L_0x00fd
        L_0x00ed:
            X.1IU r6 = X.C108945cZ.A1J(r0)     // Catch:{ all -> 0x010e }
            goto L_0x00fd
        L_0x00f2:
            r6 = 0
            goto L_0x0102
        L_0x00f4:
            X.Bsc r0 = new X.Bsc     // Catch:{ all -> 0x010e }
            r0.<init>()     // Catch:{ all -> 0x010e }
            X.1IU r6 = X.C30691eM.A00(r0)     // Catch:{ all -> 0x010e }
        L_0x00fd:
            X.C30691eM.A01(r6)     // Catch:{ all -> 0x010e }
            boolean[] r6 = (boolean[]) r6     // Catch:{ all -> 0x010e }
        L_0x0102:
            X.CmJ r5 = new X.CmJ     // Catch:{ all -> 0x010e }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x010e }
            goto L_0x0113
        L_0x0108:
            X.Bsb r0 = new X.Bsb     // Catch:{ all -> 0x010e }
            r0.<init>()     // Catch:{ all -> 0x010e }
            throw r0     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            X.1IU r5 = X.C108945cZ.A1J(r0)
        L_0x0113:
            boolean r0 = r5 instanceof X.AnonymousClass1IU
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x019f
            X.CmJ r5 = (X.C25806CmJ) r5     // Catch:{ all -> 0x0199 }
            X.CiF r3 = new X.CiF     // Catch:{ all -> 0x0199 }
            r3.<init>(r5)     // Catch:{ all -> 0x0199 }
            boolean r0 = r5.A00     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0141
            byte[] r0 = r14.A01     // Catch:{ all -> 0x0199 }
            int r1 = r0.length     // Catch:{ all -> 0x0199 }
            int r0 = r14.A00     // Catch:{ all -> 0x0199 }
            int r1 = r1 - r0
            java.lang.Object r1 = r14.A02(r1)     // Catch:{ all -> 0x0199 }
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x0199 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0199 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x0199 }
            X.1JD r0 = r3.A01     // Catch:{ all -> 0x0199 }
            r0.addLast(r1)     // Catch:{ all -> 0x0199 }
        L_0x013c:
            boolean r0 = r3.A00     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x0179
            goto L_0x018a
        L_0x0141:
            byte[] r0 = r14.A01     // Catch:{ all -> 0x0199 }
            int r1 = r0.length     // Catch:{ all -> 0x0199 }
            int r0 = r14.A00     // Catch:{ all -> 0x0199 }
            int r1 = r1 - r0
            java.lang.Object r0 = r14.A02(r1)     // Catch:{ all -> 0x0199 }
            X.C30691eM.A01(r0)     // Catch:{ all -> 0x0199 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0199 }
            X.Cqs r2 = new X.Cqs     // Catch:{ all -> 0x0199 }
            r2.<init>(r0)     // Catch:{ all -> 0x0199 }
        L_0x0155:
            java.lang.Object r1 = r2.A04()     // Catch:{ all -> 0x0199 }
            boolean r0 = r1 instanceof X.AnonymousClass1IU     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x015e
            r1 = 0
        L_0x015e:
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0199 }
            if (r1 == 0) goto L_0x013c
            long r0 = r1.longValue()     // Catch:{ all -> 0x0199 }
            java.lang.Object r1 = r2.A05(r0)     // Catch:{ all -> 0x0199 }
            X.C30691eM.A01(r1)     // Catch:{ all -> 0x0199 }
            byte[] r1 = (byte[]) r1     // Catch:{ all -> 0x0199 }
            r0 = 0
            X.C18070vi.A0d(r1, r0)     // Catch:{ all -> 0x0199 }
            X.1JD r0 = r3.A01     // Catch:{ all -> 0x0199 }
            r0.addLast(r1)     // Catch:{ all -> 0x0199 }
            goto L_0x0155
        L_0x0179:
            X.1JD r0 = r3.A01     // Catch:{ all -> 0x0199 }
            java.lang.Object r0 = r0.removeLast()     // Catch:{ all -> 0x0199 }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x0199 }
            X.Cqs r1 = new X.Cqs     // Catch:{ all -> 0x0199 }
            r1.<init>(r0)     // Catch:{ all -> 0x0199 }
            r0 = 1
            r3.A00 = r0     // Catch:{ all -> 0x0199 }
            goto L_0x018b
        L_0x018a:
            r1 = 0
        L_0x018b:
            if (r1 == 0) goto L_0x0193
            X.Cn2 r0 = new X.Cn2     // Catch:{ all -> 0x0199 }
            r0.<init>(r3, r1, r5)     // Catch:{ all -> 0x0199 }
            return r0
        L_0x0193:
            X.Bs6 r0 = new X.Bs6     // Catch:{ all -> 0x0199 }
            r0.<init>()     // Catch:{ all -> 0x0199 }
            throw r0     // Catch:{ all -> 0x0199 }
        L_0x0199:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
            return r0
        L_0x019f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CD9.A00(X.CaN):java.lang.Object");
    }
}
