package X;

/* renamed from: X.9l8  reason: invalid class name and case insensitive filesystem */
public class C190549l8 {
    public final long A00;
    public final C185849dF A01;
    public final byte[] A02;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(java.io.InputStream r22, java.io.OutputStream r23, int r24, long r25, long r27) {
        /*
            r21 = this;
            r3 = 0
            r15 = 0
            r4 = r25
            int r0 = (r25 > r15 ? 1 : (r25 == r15 ? 0 : -1))
            r12 = r21
            r20 = r22
            if (r0 != 0) goto L_0x0099
            X.9dF r1 = r12.A01
            byte[] r2 = r1.A01
        L_0x0011:
            byte[] r0 = r1.A02
            javax.crypto.Mac r14 = X.A3N.A02(r2, r0)
            long r6 = r12.A00
            int r0 = (r25 > r6 ? 1 : (r25 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x0078
            r8 = 0
        L_0x001e:
            r10 = 0
        L_0x001f:
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r0]
            r2 = r27
        L_0x0025:
            int r0 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            r15 = r23
            if (r0 <= 0) goto L_0x00b5
            r0 = 8192(0x2000, double:4.0474E-320)
            long r0 = java.lang.Math.min(r2, r0)
            int r9 = (int) r0
            long r0 = (long) r9
            long r2 = r2 - r0
            r1 = 0
        L_0x0035:
            if (r1 >= r9) goto L_0x0044
            int r13 = r9 - r1
            r0 = r20
            int r13 = r0.read(r11, r1, r13)
            r0 = -1
            if (r13 == r0) goto L_0x00ae
            int r1 = r1 + r13
            goto L_0x0035
        L_0x0044:
            r0 = 0
            r14.update(r11, r0, r9)
            long r16 = r27 - r2
            long r16 = r16 + r25
            int r0 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x005a
            long r0 = (long) r9
            long r18 = r27 - r2
            long r16 = r25 + r18
            long r16 = r16 - r6
            long r0 = r0 - r16
            int r9 = (int) r0
        L_0x005a:
            if (r9 <= 0) goto L_0x006c
            java.lang.String r0 = "cipher should not be null"
            X.C17960vV.A08(r8, r0)
            r1 = 0
            byte[] r9 = r8.update(r11, r1, r9)
            if (r9 == 0) goto L_0x006f
            int r0 = r9.length
            r15.write(r9, r1, r0)
        L_0x006c:
            r15 = 0
            goto L_0x0025
        L_0x006f:
            if (r10 != 0) goto L_0x006c
            java.lang.String r0 = "decryption failed"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x0078:
            long r8 = r25 + r27
            r3 = 2
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            byte[] r1 = r1.A00
            if (r0 < 0) goto L_0x0087
            javax.crypto.Cipher r8 = X.A3N.A01(r2, r1, r3)
            r10 = 1
            goto L_0x001f
        L_0x0087:
            java.lang.String r0 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r8 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010d }
            javax.crypto.spec.SecretKeySpec r1 = X.AnonymousClass8BS.A0v(r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010d }
            javax.crypto.spec.IvParameterSpec r0 = X.AnonymousClass8BR.A19(r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010d }
            r8.init(r3, r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x010d }
            goto L_0x001e
        L_0x0099:
            r1 = 16
            byte[] r2 = new byte[r1]
            r0 = r20
            int r0 = r0.read(r2, r3, r1)
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            X.C17960vV.A0D(r0)
            X.9dF r1 = r12.A01
            goto L_0x0011
        L_0x00ae:
            java.lang.String r0 = "Stream unexpectedly closed!"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x00b5:
            if (r10 == 0) goto L_0x00d7
            if (r8 == 0) goto L_0x00d7
            byte[] r0 = r8.doFinal()     // Catch:{ IllegalBlockSizeException -> 0x00cc, BadPaddingException -> 0x00c1 }
            r15.write(r0)     // Catch:{ IllegalBlockSizeException -> 0x00cc, BadPaddingException -> 0x00c1 }
            goto L_0x00d7
        L_0x00c1:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            java.lang.String r0 = "Bad padding!"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x00cc:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)
            java.lang.String r0 = "Bad block size!"
            java.io.IOException r0 = X.C17880vN.A0f(r0)
            throw r0
        L_0x00d7:
            byte[] r1 = r14.doFinal()
            r0 = 10
            byte[] r2 = X.A8G.A04(r1, r0)
            byte[] r1 = r12.A02
            r3 = r24
            int r0 = r24 + 10
            byte[] r0 = java.util.Arrays.copyOfRange(r1, r3, r0)
            boolean r0 = java.security.MessageDigest.isEqual(r0, r2)
            if (r0 == 0) goto L_0x00f2
            return
        L_0x00f2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ChunkCipherDecrypter/match failed at byte_offset="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", end_of_payload="
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r10)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.1Sm r0 = new X.1Sm
            r0.<init>()
            throw r0
        L_0x010d:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190549l8.A00(java.io.InputStream, java.io.OutputStream, int, long, long):void");
    }

    public C190549l8(C185849dF r3, byte[] bArr, long j) {
        this.A01 = r3;
        this.A02 = bArr;
        this.A00 = j - 10;
    }
}
