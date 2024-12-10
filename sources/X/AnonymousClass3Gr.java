package X;

/* renamed from: X.3Gr  reason: invalid class name */
public abstract class AnonymousClass3Gr extends C49712Ro {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a8, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(java.io.File r10, java.lang.String r11, java.nio.charset.Charset r12) {
        /*
            r0 = 1
            X.C18070vi.A0d(r11, r0)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r10)
            r5 = 0
            int r4 = r11.length()     // Catch:{ all -> 0x00a5 }
            r8 = 8192(0x2000, float:1.14794E-41)
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r4 >= r0) goto L_0x001c
            byte[] r0 = X.C18070vi.A1A(r11, r12)     // Catch:{ all -> 0x00a5 }
            r2.write(r0)     // Catch:{ all -> 0x00a5 }
            goto L_0x009a
        L_0x001c:
            java.nio.charset.CharsetEncoder r0 = r12.newEncoder()     // Catch:{ all -> 0x00a5 }
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE     // Catch:{ all -> 0x00a5 }
            java.nio.charset.CharsetEncoder r0 = r0.onMalformedInput(r1)     // Catch:{ all -> 0x00a5 }
            java.nio.charset.CharsetEncoder r6 = r0.onUnmappableCharacter(r1)     // Catch:{ all -> 0x00a5 }
            java.nio.CharBuffer r3 = java.nio.CharBuffer.allocate(r8)     // Catch:{ all -> 0x00a5 }
            X.C18070vi.A0b(r6)     // Catch:{ all -> 0x00a5 }
            r0 = 1
            X.C18070vi.A0d(r6, r0)     // Catch:{ all -> 0x00a5 }
            float r0 = r6.maxBytesPerChar()     // Catch:{ all -> 0x00a5 }
            double r0 = (double) r0     // Catch:{ all -> 0x00a5 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x00a5 }
            float r7 = (float) r0     // Catch:{ all -> 0x00a5 }
            int r0 = (int) r7     // Catch:{ all -> 0x00a5 }
            int r8 = r8 * r0
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.allocate(r8)     // Catch:{ all -> 0x00a5 }
            X.C18070vi.A0X(r9)     // Catch:{ all -> 0x00a5 }
            r10 = 0
            r8 = 0
        L_0x004a:
            int r1 = 8192 - r8
            int r0 = r4 - r10
            int r1 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x00a5 }
            int r7 = r10 + r1
            char[] r0 = r3.array()     // Catch:{ all -> 0x00a5 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00a5 }
            r11.getChars(r10, r7, r0, r8)     // Catch:{ all -> 0x00a5 }
            int r1 = r1 + r8
            r3.limit(r1)     // Catch:{ all -> 0x00a5 }
            r8 = 1
            boolean r0 = X.AnonymousClass000.A1T(r7, r4)
            java.nio.charset.CoderResult r0 = r6.encode(r3, r9, r0)     // Catch:{ all -> 0x00a5 }
            boolean r0 = r0.isUnderflow()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x009e
            byte[] r1 = r9.array()     // Catch:{ all -> 0x00a5 }
            int r0 = r9.position()     // Catch:{ all -> 0x00a5 }
            r2.write(r1, r5, r0)     // Catch:{ all -> 0x00a5 }
            int r1 = r3.position()     // Catch:{ all -> 0x00a5 }
            int r0 = r3.limit()     // Catch:{ all -> 0x00a5 }
            if (r1 == r0) goto L_0x0094
            char r0 = r3.get()     // Catch:{ all -> 0x00a5 }
            r3.put(r5, r0)     // Catch:{ all -> 0x00a5 }
        L_0x008d:
            r3.clear()     // Catch:{ all -> 0x00a5 }
            r9.clear()     // Catch:{ all -> 0x00a5 }
            goto L_0x0096
        L_0x0094:
            r8 = 0
            goto L_0x008d
        L_0x0096:
            r10 = r7
            if (r7 >= r4) goto L_0x009a
            goto L_0x004a
        L_0x009a:
            r2.close()
            return
        L_0x009e:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Gr.A01(java.io.File, java.lang.String, java.nio.charset.Charset):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.OutputStream, java.io.ByteArrayOutputStream, X.2QO] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0096, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] A02(java.io.File r9) {
        /*
            r5 = 0
            X.C18070vi.A0d(r9, r5)
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r9)
            long r3 = r9.length()     // Catch:{ all -> 0x0090 }
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r8 = "File "
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0075
            int r7 = (int) r3
            r6 = r7
            byte[] r4 = new byte[r7]     // Catch:{ all -> 0x0090 }
            r1 = 0
        L_0x001b:
            if (r7 <= 0) goto L_0x0026
            int r0 = r2.read(r4, r1, r7)     // Catch:{ all -> 0x0090 }
            if (r0 < 0) goto L_0x0026
            int r7 = r7 - r0
            int r1 = r1 + r0
            goto L_0x001b
        L_0x0026:
            if (r7 <= 0) goto L_0x0030
            byte[] r4 = java.util.Arrays.copyOf(r4, r1)     // Catch:{ all -> 0x0090 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x0090 }
            goto L_0x0071
        L_0x0030:
            int r1 = r2.read()     // Catch:{ all -> 0x0090 }
            r0 = -1
            if (r1 == r0) goto L_0x0071
            r0 = 8193(0x2001, float:1.1481E-41)
            X.2QO r3 = new X.2QO     // Catch:{ all -> 0x0090 }
            r3.<init>(r0)     // Catch:{ all -> 0x0090 }
            r3.write(r1)     // Catch:{ all -> 0x0090 }
            X.C196989vy.A00(r2, r3)     // Catch:{ all -> 0x0090 }
            int r0 = r3.size()     // Catch:{ all -> 0x0090 }
            int r0 = r0 + r6
            if (r0 < 0) goto L_0x005e
            byte[] r1 = r3.A00()     // Catch:{ all -> 0x0090 }
            byte[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch:{ all -> 0x0090 }
            X.C18070vi.A0X(r4)     // Catch:{ all -> 0x0090 }
            int r0 = r3.size()     // Catch:{ all -> 0x0090 }
            java.lang.System.arraycopy(r1, r5, r4, r6, r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0071
        L_0x005e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)     // Catch:{ all -> 0x0090 }
            r1.append(r9)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = " is too big to fit in memory."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0090 }
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0090 }
            r1.<init>(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x008f
        L_0x0071:
            r2.close()
            return r4
        L_0x0075:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)     // Catch:{ all -> 0x0090 }
            r1.append(r9)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = " is too big ("
            r1.append(r0)     // Catch:{ all -> 0x0090 }
            r1.append(r3)     // Catch:{ all -> 0x0090 }
            java.lang.String r0 = " bytes) to fit in memory."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0090 }
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x0090 }
            r1.<init>(r0)     // Catch:{ all -> 0x0090 }
        L_0x008f:
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Gr.A02(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        X.CDX.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r2.<init>(r0, r3)
            java.lang.String r0 = X.C181849Sb.A00(r2)     // Catch:{ all -> 0x0012 }
            r2.close()
            return r0
        L_0x0012:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3Gr.A00(java.io.File, java.nio.charset.Charset):java.lang.String");
    }
}
