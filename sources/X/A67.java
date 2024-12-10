package X;

public final class A67 {
    public static final A67 A00 = new Object();

    public static long A00(byte[] bArr, int i, int i2) {
        return ((long) ((short) (bArr[i] & 255))) << i2;
    }

    public static long A01(byte[] bArr, int i, int i2, long j) {
        return j ^ (((long) ((short) (bArr[i] & 255))) << i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00c0, code lost:
        r0 = A01(r9, r8 + 12, 32, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00cd, code lost:
        r0 = A01(r9, r8 + 11, 24, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00da, code lost:
        r0 = r0 ^ (((long) ((short) (r20[r8 + 10] & 255))) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00f2, code lost:
        r0 = A01(r9, r8 + 9, 8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0103, code lost:
        r0 = A01(r9, r8 + 8, 0, r0) * 5545529020109919103L;
        r2 = 33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0116, code lost:
        r4 = r4 ^ (java.lang.Long.rotateLeft(r0, r2) * -8663945395140668459L);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0139, code lost:
        r1 = r8 + 1;
        r0 = java.lang.Long.rotateLeft(A01(r9, r8, 0, A01(r9, r1, 8, A01(r9, r8 + 3, 24, A01(r9, r8 + 4, 32, A01(r9, r8 + 5, 40, r0))) ^ (((long) ((short) (r20[r8 + 2] & 255))) << 16))) * -8663945395140668459L, 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0180, code lost:
        r0 = A01(r9, r8 + 3, 24, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x018d, code lost:
        r0 = r0 ^ (((long) ((short) (r20[r8 + 2] & 255))) << 16);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01a5, code lost:
        r0 = A01(r9, r8 + 1, 8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01b6, code lost:
        r0 = A01(r9, r8, 0, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01c1, code lost:
        r0 = java.lang.Long.rotateLeft(r0 * -8663945395140668459L, 31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01c7, code lost:
        r6 = r6 ^ (r0 * 5545529020109919103L);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A02(byte[] r20) {
        /*
            r19 = this;
            r9 = r20
            int r0 = r9.length
            r18 = r0
            r0 = 16
            int r0 = r18 - r0
            int r3 = r0 + 1
            r6 = 0
            r4 = 0
            r8 = 0
        L_0x0010:
            r2 = 33
            r15 = 31
            r10 = 5545529020109919103(0x4cf5ad432745937f, double:5.573325460219186E62)
            r16 = -8663945395140668459(0x87c37b91114253d5, double:-2.8811287363897357E-271)
            if (r8 >= r3) goto L_0x0069
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r9)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r0 = r0.order(r12)
            long r0 = r0.getLong(r8)
            int r14 = r8 + 8
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r9)
            java.nio.ByteBuffer r8 = r8.order(r12)
            long r12 = r8.getLong(r14)
            int r8 = r14 + 8
            long r0 = r0 * r16
            long r0 = java.lang.Long.rotateLeft(r0, r15)
            long r0 = r0 * r10
            long r6 = r6 ^ r0
            r0 = 27
            long r6 = java.lang.Long.rotateLeft(r6, r0)
            long r6 = r6 + r4
            r0 = 5
            long r6 = r6 * r0
            r0 = 1390208809(0x52dce729, double:6.86854413E-315)
            long r6 = r6 + r0
            long r10 = r10 * r12
            long r0 = java.lang.Long.rotateLeft(r10, r2)
            long r0 = r0 * r16
            long r4 = r4 ^ r0
            long r4 = java.lang.Long.rotateLeft(r4, r15)
            long r4 = r4 + r6
            r0 = 5
            long r4 = r4 * r0
            r0 = 944331445(0x38495ab5, double:4.665617253E-315)
            long r4 = r4 + r0
            goto L_0x0010
        L_0x0069:
            r0 = r18 & 15
            r13 = 40
            r12 = 32
            r14 = 24
            switch(r0) {
                case 1: goto L_0x01bc;
                case 2: goto L_0x01ae;
                case 3: goto L_0x019a;
                case 4: goto L_0x0187;
                case 5: goto L_0x017a;
                case 6: goto L_0x016d;
                case 7: goto L_0x0131;
                case 8: goto L_0x011d;
                case 9: goto L_0x010e;
                case 10: goto L_0x00fb;
                case 11: goto L_0x00e7;
                case 12: goto L_0x00d4;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00ba;
                case 15: goto L_0x00aa;
                default: goto L_0x0074;
            }
        L_0x0074:
            r0 = r18
            long r2 = (long) r0
            long r8 = r2 ^ r6
            long r2 = r2 ^ r4
            long r8 = r8 + r2
            long r2 = r2 + r8
            r4 = 33
            long r0 = r8 >>> r4
            long r8 = r8 ^ r0
            r0 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
            long r8 = r8 * r0
            long r0 = r8 >>> r4
            long r8 = r8 ^ r0
            r0 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
            long r8 = r8 * r0
            long r0 = r8 >>> r4
            long r8 = r8 ^ r0
            long r0 = r2 >>> r4
            long r2 = r2 ^ r0
            r0 = -49064778989728563(0xff51afd7ed558ccd, double:-1.9406492979739223E305)
            long r2 = r2 * r0
            long r0 = r2 >>> r4
            long r2 = r2 ^ r0
            r0 = -4265267296055464877(0xc4ceb9fe1a85ec53, double:-2.902039044684214E23)
            long r2 = r2 * r0
            long r0 = r2 >>> r4
            long r2 = r2 ^ r0
            long r8 = r8 + r2
            return r8
        L_0x00aa:
            int r1 = r8 + 14
            r0 = 48
            long r2 = A00(r9, r1, r0)
            int r0 = r8 + 13
            long r0 = A00(r9, r0, r13)
            long r0 = r0 ^ r2
            goto L_0x00c0
        L_0x00ba:
            int r0 = r8 + 13
            long r0 = A00(r9, r0, r13)
        L_0x00c0:
            int r2 = r8 + 12
            long r0 = A01(r9, r2, r12, r0)
            goto L_0x00cd
        L_0x00c7:
            int r0 = r8 + 12
            long r0 = A00(r9, r0, r12)
        L_0x00cd:
            int r2 = r8 + 11
            long r0 = A01(r9, r2, r14, r0)
            goto L_0x00da
        L_0x00d4:
            int r0 = r8 + 11
            long r0 = A00(r9, r0, r14)
        L_0x00da:
            int r2 = r8 + 10
            byte r2 = r20[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
            long r2 = (long) r2
            r15 = 16
            long r2 = r2 << r15
            long r0 = r0 ^ r2
            goto L_0x00f2
        L_0x00e7:
            int r0 = r8 + 10
            byte r0 = r20[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            long r0 = (long) r0
            r2 = 16
            long r0 = r0 << r2
        L_0x00f2:
            int r3 = r8 + 9
            r2 = 8
            long r0 = A01(r9, r3, r2, r0)
            goto L_0x0103
        L_0x00fb:
            int r1 = r8 + 9
            r0 = 8
            long r0 = A00(r9, r1, r0)
        L_0x0103:
            int r3 = r8 + 8
            r2 = 0
            long r0 = A01(r9, r3, r2, r0)
            long r0 = r0 * r10
            r2 = 33
            goto L_0x0116
        L_0x010e:
            int r1 = r8 + 8
            r0 = 0
            long r0 = A00(r9, r1, r0)
            long r0 = r0 * r10
        L_0x0116:
            long r2 = java.lang.Long.rotateLeft(r0, r2)
            long r2 = r2 * r16
            long r4 = r4 ^ r2
        L_0x011d:
            int r0 = r8 + 7
            byte r0 = r20[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            long r0 = (long) r0
            r2 = 56
            long r0 = r0 << r2
            int r3 = r8 + 6
            r2 = 48
            long r0 = A01(r9, r3, r2, r0)
            goto L_0x0139
        L_0x0131:
            int r1 = r8 + 6
            r0 = 48
            long r0 = A00(r9, r1, r0)
        L_0x0139:
            int r2 = r8 + 5
            long r0 = A01(r9, r2, r13, r0)
            int r2 = r8 + 4
            long r0 = A01(r9, r2, r12, r0)
            int r2 = r8 + 3
            long r2 = A01(r9, r2, r14, r0)
            int r0 = r8 + 2
            byte r0 = r20[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            long r0 = (long) r0
            r12 = 16
            long r0 = r0 << r12
            long r2 = r2 ^ r0
            int r1 = r8 + 1
            r0 = 8
            long r0 = A01(r9, r1, r0, r2)
            r2 = 0
            long r1 = A01(r9, r8, r2, r0)
            long r1 = r1 * r16
            r0 = 31
            long r0 = java.lang.Long.rotateLeft(r1, r0)
            goto L_0x01c7
        L_0x016d:
            int r0 = r8 + 5
            long r0 = A00(r9, r0, r13)
            int r2 = r8 + 4
            long r0 = A01(r9, r2, r12, r0)
            goto L_0x0180
        L_0x017a:
            int r0 = r8 + 4
            long r0 = A00(r9, r0, r12)
        L_0x0180:
            int r2 = r8 + 3
            long r0 = A01(r9, r2, r14, r0)
            goto L_0x018d
        L_0x0187:
            int r0 = r8 + 3
            long r0 = A00(r9, r0, r14)
        L_0x018d:
            int r2 = r8 + 2
            byte r2 = r20[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
            long r2 = (long) r2
            r12 = 16
            long r2 = r2 << r12
            long r0 = r0 ^ r2
            goto L_0x01a5
        L_0x019a:
            int r0 = r8 + 2
            byte r0 = r20[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            short r0 = (short) r0
            long r0 = (long) r0
            r2 = 16
            long r0 = r0 << r2
        L_0x01a5:
            int r3 = r8 + 1
            r2 = 8
            long r0 = A01(r9, r3, r2, r0)
            goto L_0x01b6
        L_0x01ae:
            int r1 = r8 + 1
            r0 = 8
            long r0 = A00(r9, r1, r0)
        L_0x01b6:
            r2 = 0
            long r0 = A01(r9, r8, r2, r0)
            goto L_0x01c1
        L_0x01bc:
            r0 = 0
            long r0 = A00(r9, r8, r0)
        L_0x01c1:
            long r0 = r0 * r16
            long r0 = java.lang.Long.rotateLeft(r0, r15)
        L_0x01c7:
            long r0 = r0 * r10
            long r6 = r6 ^ r0
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A67.A02(byte[]):long");
    }
}
