package X;

/* renamed from: X.9ke  reason: invalid class name and case insensitive filesystem */
public final class C190269ke {
    public final C18100vl A00 = AnonymousClass1DF.A01(C22083AxN.A00);
    public final AnonymousClass00H A01;

    public C190269ke(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0076 A[Catch:{ Error -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A00(int r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            X.00H r0 = r8.A01
            X.0vd r0 = X.C17880vN.A0P(r0)
            java.lang.String r3 = X.C108955ca.A0v(r0, r9)
            int r0 = r3.length()
            r2 = 0
            if (r0 == 0) goto L_0x00a2
            X.0vl r4 = r8.A00
            java.lang.Object r0 = r4.getValue()
            X.00z r0 = (X.C002100z) r0
            java.lang.Object r0 = r0.A04(r3)
            if (r0 != 0) goto L_0x0090
            r7 = r8
            monitor-enter(r7)
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x008c }
            X.00z r0 = (X.C002100z) r0     // Catch:{ all -> 0x008c }
            java.lang.Object r0 = r0.A04(r3)     // Catch:{ all -> 0x008c }
            if (r0 != 0) goto L_0x008f
            javax.crypto.Cipher r0 = X.AnonymousClass9UE.A01     // Catch:{ Error -> 0x007b }
            java.lang.String r6 = ""
            java.lang.String r0 = "!=!"
            boolean r0 = r3.contains(r0)     // Catch:{ Error -> 0x007b }
            if (r0 != 0) goto L_0x003f
            r6 = r3
            goto L_0x006f
        L_0x003f:
            javax.crypto.Cipher r5 = X.AnonymousClass9UE.A01     // Catch:{ InvalidKeyException -> 0x0065, InvalidAlgorithmParameterException -> 0x0061, BadPaddingException -> 0x005d, IllegalBlockSizeException -> 0x0069 }
            java.security.Key r1 = X.AnonymousClass9UE.A00     // Catch:{ InvalidKeyException -> 0x0065, InvalidAlgorithmParameterException -> 0x0061, BadPaddingException -> 0x005d, IllegalBlockSizeException -> 0x0069 }
            byte[] r0 = X.AnonymousClass9UE.A03     // Catch:{ InvalidKeyException -> 0x0065, InvalidAlgorithmParameterException -> 0x0061, BadPaddingException -> 0x005d, IllegalBlockSizeException -> 0x0069 }
            X.AnonymousClass8BW.A1O(r1, r5, r0)     // Catch:{ InvalidKeyException -> 0x0065, InvalidAlgorithmParameterException -> 0x0061, BadPaddingException -> 0x005d, IllegalBlockSizeException -> 0x0069 }
            r0 = 3
            java.lang.String r0 = r3.substring(r0)     // Catch:{ InvalidKeyException -> 0x0065, InvalidAlgorithmParameterException -> 0x0061, BadPaddingException -> 0x005d, IllegalBlockSizeException -> 0x0069 }
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch:{ InvalidKeyException -> 0x0065, InvalidAlgorithmParameterException -> 0x0061, BadPaddingException -> 0x005d, IllegalBlockSizeException -> 0x0069 }
            byte[] r0 = r5.doFinal(r0)     // Catch:{ InvalidKeyException -> 0x0065, InvalidAlgorithmParameterException -> 0x0061, BadPaddingException -> 0x005d, IllegalBlockSizeException -> 0x0069 }
            X.AnonymousClass9UE.A02 = r0     // Catch:{ InvalidKeyException -> 0x0065, InvalidAlgorithmParameterException -> 0x0061, BadPaddingException -> 0x005d, IllegalBlockSizeException -> 0x0069 }
            java.lang.String r6 = new java.lang.String     // Catch:{ Error -> 0x007b }
            r6.<init>(r0)     // Catch:{ Error -> 0x007b }
            goto L_0x006f
        L_0x005d:
            r1 = move-exception
            java.lang.String r0 = "EncryptionUtils/invalid padding in creating deciphered text"
            goto L_0x006c
        L_0x0061:
            r1 = move-exception
            java.lang.String r0 = "EncryptionUtils/invalid algorithm parameter in cipher initialization"
            goto L_0x006c
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "EncryptionUtils/invalid key in cipher initialization"
            goto L_0x006c
        L_0x0069:
            r1 = move-exception
            java.lang.String r0 = "EncryptionUtils/illegal blocksize in creating deciphered text"
        L_0x006c:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Error -> 0x007b }
        L_0x006f:
            r0 = 1
            java.util.List r0 = X.C108985cd.A0s(r6, r0)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x0080
            java.util.Set r1 = X.C29431cG.A12(r0)     // Catch:{ all -> 0x008c }
            goto L_0x0082
        L_0x007b:
            java.lang.String r0 = "Cannot decrypt merchant list"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x008c }
        L_0x0080:
            X.1Om r1 = X.C25511Om.A00     // Catch:{ all -> 0x008c }
        L_0x0082:
            java.lang.Object r0 = r4.getValue()     // Catch:{ all -> 0x008c }
            X.00z r0 = (X.C002100z) r0     // Catch:{ all -> 0x008c }
            r0.A08(r3, r1)     // Catch:{ all -> 0x008c }
            goto L_0x008f
        L_0x008c:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x008f:
            monitor-exit(r7)
        L_0x0090:
            java.lang.Object r0 = r4.getValue()
            X.00z r0 = (X.C002100z) r0
            java.lang.Object r0 = r0.A04(r3)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x00a2
            boolean r2 = r0.contains(r10)
        L_0x00a2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190269ke.A00(int, java.lang.String):boolean");
    }
}
