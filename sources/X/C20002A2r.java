package X;

import java.io.File;

/* renamed from: X.A2r  reason: case insensitive filesystem */
public final class C20002A2r {
    public File A00;
    public final A55 A01;
    public final File A02;
    public final Object A03 = C17880vN.A0p();
    public final String A04;
    public final String A05;
    public final byte[] A06;
    public final AnonymousClass1NT A07;
    public final AnonymousClass1NM A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C20002A2r a2r = (C20002A2r) obj;
            if (!C18070vi.A18(this.A02, a2r.A02) || !C42171xk.A00(this.A01, a2r.A01)) {
                return false;
            }
        }
        return true;
    }

    public final long A00() {
        if (!this.A07.A04() || this.A06 == null) {
            return this.A02.length();
        }
        return this.A02.length() + 16;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0090, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/encrypt media failed", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0095, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        com.whatsapp.util.Log.w("encb/EncBackupManager/encrypt media failed", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0095 A[ExcHandler: InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r0v11 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:15:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.File A01() {
        /*
            r10 = this;
            X.1NT r6 = r10.A07
            boolean r0 = r6.A04()
            if (r0 == 0) goto L_0x00a0
            byte[] r2 = r10.A06
            if (r2 == 0) goto L_0x00a0
            java.lang.Object r4 = r10.A03
            monitor-enter(r4)
            java.io.File r5 = r10.A00     // Catch:{ all -> 0x009d }
            if (r5 == 0) goto L_0x001b
            boolean r0 = r5.exists()     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x001b
            goto L_0x009b
        L_0x001b:
            X.1NM r0 = r10.A08     // Catch:{ all -> 0x009d }
            X.17z r0 = r0.A00()     // Catch:{ all -> 0x009d }
            X.C219417z.A00(r0)     // Catch:{ all -> 0x009d }
            java.io.File r1 = r0.A04     // Catch:{ all -> 0x009d }
            java.lang.String r0 = r10.A05     // Catch:{ all -> 0x009d }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = r0.getName()     // Catch:{ all -> 0x009d }
            java.io.File r5 = X.C17880vN.A0e(r1, r0)     // Catch:{ all -> 0x009d }
            java.io.File r9 = r10.A02     // Catch:{ all -> 0x009d }
            java.lang.String r3 = "encb/EncBackupManager/encrypt media failed"
            X.1NO r0 = r6.A02     // Catch:{ all -> 0x009d }
            byte[] r1 = r0.A03()     // Catch:{ all -> 0x009d }
            r8 = 0
            if (r1 == 0) goto L_0x0099
            r0 = 48
            byte[] r7 = X.C20058A5h.A00(r1, r2, r0)     // Catch:{ all -> 0x009d }
            r6 = 32
            byte[] r2 = new byte[r6]     // Catch:{ all -> 0x009d }
            java.lang.System.arraycopy(r7, r8, r2, r8, r6)     // Catch:{ all -> 0x009d }
            r1 = 16
            byte[] r0 = new byte[r1]     // Catch:{ all -> 0x009d }
            java.lang.System.arraycopy(r7, r6, r0, r8, r1)     // Catch:{ all -> 0x009d }
            javax.crypto.Cipher r6 = X.AnonymousClass8BR.A18()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            javax.crypto.spec.SecretKeySpec r2 = X.AnonymousClass8BS.A0v(r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            javax.crypto.spec.IvParameterSpec r1 = X.AnonymousClass8BR.A19(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            r0 = 1
            r6.init(r0, r2, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            java.io.FileInputStream r2 = X.C108945cZ.A18(r9)     // Catch:{ IOException -> 0x0090, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            java.io.FileOutputStream r1 = X.C108945cZ.A19(r5)     // Catch:{ all -> 0x0086 }
            javax.crypto.CipherOutputStream r0 = new javax.crypto.CipherOutputStream     // Catch:{ all -> 0x0086 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0086 }
            X.C64062u9.A00(r2, r0)     // Catch:{ all -> 0x007c }
            r0.close()     // Catch:{ all -> 0x0086 }
            r2.close()     // Catch:{ IOException -> 0x0090, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            goto L_0x0099
        L_0x007c:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0081:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0086 }
        L_0x0085:
            throw r1     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0090, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
        L_0x008f:
            throw r1     // Catch:{ IOException -> 0x0090, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095, InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
        L_0x0090:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r0 = move-exception
            com.whatsapp.util.Log.w(r3, r0)     // Catch:{ all -> 0x009d }
        L_0x0099:
            r10.A00 = r5     // Catch:{ all -> 0x009d }
        L_0x009b:
            monitor-exit(r4)
            return r5
        L_0x009d:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00a0:
            java.io.File r0 = r10.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20002A2r.A01():java.io.File");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        com.whatsapp.util.Log.e("encb/EncBackupManager/getMediaDecryptionHash failed", r1);
        r4 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d A[ExcHandler: InvalidKeyException | NoSuchAlgorithmException (r1v3 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:16:0x005d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C20002A2r(X.C218617r r13, X.AnonymousClass1NW r14, X.AnonymousClass1NT r15, X.AMX r16, X.AnonymousClass1L7 r17, X.AnonymousClass1NM r18, java.io.File r19, java.lang.String r20, java.lang.String r21) {
        /*
            r12 = this;
            r12.<init>()
            java.lang.Object r0 = X.C17880vN.A0p()
            r12.A03 = r0
            r4 = r19
            r12.A02 = r4
            r1 = r20
            r12.A04 = r1
            r5 = r15
            r12.A07 = r15
            r0 = r18
            r12.A08 = r0
            boolean r0 = r15.A04()
            r3 = 0
            r2 = r17
            r6 = r21
            if (r0 == 0) goto L_0x0049
            r0 = r16
            boolean r0 = r0.Bf0(r1)
            if (r0 == 0) goto L_0x0049
            long r0 = r4.length()     // Catch:{ 8gm -> 0x0043 }
            java.lang.String r7 = X.C41361wE.A05(r14, r2, r4, r0)     // Catch:{ 8gm -> 0x0043 }
            if (r7 == 0) goto L_0x0049
            long r8 = r4.length()
            long r10 = r4.lastModified()
            X.A55 r4 = new X.A55
            r4.<init>(r5, r6, r7, r8, r10)
            goto L_0x004a
        L_0x0043:
            r1 = move-exception
            java.lang.String r0 = "gdrive/local-file/calcMd5() failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0049:
            r4 = r3
        L_0x004a:
            r12.A01 = r4
            if (r4 != 0) goto L_0x0053
            r12.A05 = r6
            r12.A06 = r3
            return
        L_0x0053:
            java.lang.String r4 = r4.A03
            java.lang.String r1 = "HmacSHA256"
            X.1NO r0 = r15.A02
            byte[] r0 = r0.A03()
            javax.crypto.Mac r3 = X.AnonymousClass8BX.A0p(r1, r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x007d }
            byte[] r1 = r6.getBytes()     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x007d }
            java.lang.String r0 = "SHA-256"
            byte[] r0 = X.AnonymousClass8BW.A1W(r1, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0077, InvalidKeyException | NoSuchAlgorithmException -> 0x007d }
            r3.update(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x007d }
            byte[] r0 = X.AnonymousClass1EG.A0J(r4)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x007d }
            byte[] r4 = r3.doFinal(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x007d }
            goto L_0x0084
        L_0x0077:
            r0 = move-exception
            java.lang.AssertionError r0 = X.AnonymousClass8BR.A0v(r0)     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x007d }
            throw r0     // Catch:{ InvalidKeyException | NoSuchAlgorithmException -> 0x007d }
        L_0x007d:
            r1 = move-exception
            java.lang.String r0 = "encb/EncBackupManager/getMediaDecryptionHash failed"
            com.whatsapp.util.Log.e(r0, r1)
            r4 = 0
        L_0x0084:
            java.lang.String r0 = "Failed to get media decryption hash"
            X.C17960vV.A08(r4, r0)
            r12.A06 = r4
            java.io.File r3 = r13.A0J()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.C17970vW.A06(r4)
            r1.append(r0)
            java.lang.String r0 = ".mcrypt1"
            java.io.File r0 = X.AnonymousClass8BW.A0X(r3, r0, r1)
            java.lang.String r0 = X.C41361wE.A06(r2, r0)
            if (r0 == 0) goto L_0x00a9
            r12.A05 = r0
            return
        L_0x00a9:
            java.lang.String r0 = "Failed to get a new uploadPath"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20002A2r.<init>(X.17r, X.1NW, X.1NT, X.AMX, X.1L7, X.1NM, java.io.File, java.lang.String, java.lang.String):void");
    }

    public int hashCode() {
        Object[] A1b = AnonymousClass3MW.A1b();
        A1b[0] = this.A02;
        return AnonymousClass000.A0P(this.A01, A1b, 1);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LocalFile{file=");
        A10.append(this.A02);
        A10.append(", metadata=");
        return AnonymousClass8BX.A0c(this.A01, A10);
    }

    public C20002A2r(AnonymousClass1NT r2, A55 a55, AnonymousClass1NM r4, File file, String str, String str2, byte[] bArr) {
        C18070vi.A0d(str2, 3);
        this.A02 = file;
        this.A04 = str;
        this.A05 = str2;
        this.A01 = a55;
        this.A06 = bArr;
        this.A07 = r2;
        this.A08 = r4;
    }
}
