package X;

import java.security.KeyStore;

public class A49 {
    public KeyStore A00;
    public final AnonymousClass1QE A01;
    public final AnonymousClass9ZL A02;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.9NF[]} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.9NF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(android.content.Context r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r3 = "onboarding"
            X.1QE r7 = r8.A01     // Catch:{ Exception -> 0x005b }
            java.lang.String r5 = "generate rsa key pairs for"
            r6 = 1
            X.9NF[] r4 = new X.AnonymousClass9NF[r6]     // Catch:{ Exception -> 0x005b }
            java.lang.String r0 = "alias"
            r2 = 2
            X.9NF r1 = new X.9NF     // Catch:{ Exception -> 0x005b }
            r1.<init>()     // Catch:{ Exception -> 0x005b }
            r1.A00 = r0     // Catch:{ Exception -> 0x005b }
            r1.A01 = r10     // Catch:{ Exception -> 0x005b }
            r0 = 0
            r4[r0] = r1     // Catch:{ Exception -> 0x005b }
            r7.A09(r3, r5, r4)     // Catch:{ Exception -> 0x005b }
            java.util.Calendar r5 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x005b }
            java.util.Calendar r4 = java.util.Calendar.getInstance()     // Catch:{ Exception -> 0x005b }
            r4.add(r2, r6)     // Catch:{ Exception -> 0x005b }
            android.security.KeyPairGeneratorSpec$Builder r0 = new android.security.KeyPairGeneratorSpec$Builder     // Catch:{ Exception -> 0x005b }
            r0.<init>(r9)     // Catch:{ Exception -> 0x005b }
            android.security.KeyPairGeneratorSpec$Builder r2 = r0.setAlias(r10)     // Catch:{ Exception -> 0x005b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x005b }
            java.lang.String r0 = "CN="
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r10, r1)     // Catch:{ Exception -> 0x005b }
            javax.security.auth.x500.X500Principal r0 = new javax.security.auth.x500.X500Principal     // Catch:{ Exception -> 0x005b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x005b }
            android.security.KeyPairGeneratorSpec$Builder r1 = r2.setSubject(r0)     // Catch:{ Exception -> 0x005b }
            java.math.BigInteger r0 = java.math.BigInteger.TEN     // Catch:{ Exception -> 0x005b }
            android.security.KeyPairGeneratorSpec$Builder r0 = X.AnonymousClass8BY.A0A(r1, r0, r5, r4)     // Catch:{ Exception -> 0x005b }
            android.security.KeyPairGeneratorSpec r2 = r0.build()     // Catch:{ Exception -> 0x005b }
            java.lang.String r1 = "RSA"
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyPairGenerator r0 = java.security.KeyPairGenerator.getInstance(r1, r0)     // Catch:{ Exception -> 0x005b }
            r0.initialize(r2)     // Catch:{ Exception -> 0x005b }
            r0.generateKeyPair()     // Catch:{ Exception -> 0x005b }
            return
        L_0x005b:
            r2 = move-exception
            X.1QE r1 = r8.A01
            r0 = 0
            r1.A08(r3, r0, r2)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A49.A00(android.content.Context, java.lang.String):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.9NF[]} */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.9NF, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(java.lang.String r10, java.lang.String r11) {
        /*
            r9 = this;
            X.1QE r6 = r9.A01
            r0 = 1
            X.9NF[] r2 = new X.AnonymousClass9NF[r0]
            java.lang.String r1 = "alias"
            X.9NF r0 = new X.9NF
            r0.<init>()
            r0.A00 = r1
            r0.A01 = r11
            r5 = 0
            r2[r5] = r0
            java.lang.String r4 = "onboarding"
            java.lang.String r0 = "generate and store aes key"
            r6.A09(r4, r0, r2)
            byte[] r7 = X.AnonymousClass8BX.A1Z()
            r3 = 0
            java.security.KeyStore r0 = r9.A00     // Catch:{ Exception -> 0x0066 }
            java.security.KeyStore$Entry r8 = r0.getEntry(r11, r3)     // Catch:{ Exception -> 0x0066 }
            java.security.KeyStore$PrivateKeyEntry r8 = (java.security.KeyStore.PrivateKeyEntry) r8     // Catch:{ Exception -> 0x0066 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0066 }
            r0 = 23
            if (r1 < r0) goto L_0x0053
            java.lang.String r0 = "RSA/ECB/OAEPPadding"
        L_0x002f:
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x0066 }
            java.security.cert.Certificate r0 = r8.getCertificate()     // Catch:{ Exception -> 0x0066 }
            java.security.PublicKey r1 = r0.getPublicKey()     // Catch:{ Exception -> 0x0066 }
            r0 = 1
            r2.init(r0, r1)     // Catch:{ Exception -> 0x0066 }
            java.io.ByteArrayOutputStream r1 = X.C108945cZ.A15()     // Catch:{ Exception -> 0x0066 }
            javax.crypto.CipherOutputStream r0 = new javax.crypto.CipherOutputStream     // Catch:{ Exception -> 0x0066 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0066 }
            r0.write(r7)     // Catch:{ Exception -> 0x0066 }
            r0.close()     // Catch:{ Exception -> 0x0066 }
            byte[] r0 = r1.toByteArray()     // Catch:{ Exception -> 0x0066 }
            goto L_0x0056
        L_0x0053:
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            goto L_0x002f
        L_0x0056:
            java.lang.String r1 = android.util.Base64.encodeToString(r0, r5)
            X.9ZL r0 = r9.A02
            android.content.SharedPreferences r0 = r0.A00
            android.content.SharedPreferences$Editor r0 = r0.edit()
            X.C17880vN.A1E(r0, r10, r1)
            return
        L_0x0066:
            r0 = move-exception
            r6.A08(r4, r3, r0)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A49.A01(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        r8.A01.A08("onboarding", (java.lang.String) null, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008e, code lost:
        throw X.AnonymousClass8BR.A0x(r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A49(android.content.Context r9, X.AnonymousClass11P r10, X.C18010vc r11) {
        /*
            r8 = this;
            r8.<init>()
            java.lang.String r1 = "IN"
            java.lang.String r0 = "CLKeyStorageManager"
            java.lang.String r4 = "onboarding"
            X.1QE r3 = X.AnonymousClass1QE.A00(r0, r4, r1)
            r8.A01 = r3
            X.9ZL r0 = new X.9ZL
            r0.<init>(r11)
            r8.A02 = r0
            X.1QD r0 = new X.1QD
            r0.<init>(r10, r11)
            android.content.SharedPreferences r2 = r0.A03()
            java.lang.String r0 = "psp_test_tool_enabled"
            r1 = 0
            boolean r0 = r2.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x008f
            r5 = 0
            java.lang.String r0 = "initializing KS"
            r3.A06(r0)     // Catch:{ Exception -> 0x0084 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ Exception -> 0x0084 }
            r8.A00 = r0     // Catch:{ Exception -> 0x0084 }
            r0.load(r5)     // Catch:{ Exception -> 0x0084 }
            r7 = r8
            monitor-enter(r7)     // Catch:{ Exception -> 0x0084 }
            X.9ZL r0 = r8.A02     // Catch:{ all -> 0x0081 }
            java.lang.String r6 = "use_ks"
            android.content.SharedPreferences r3 = r0.A00     // Catch:{ all -> 0x0081 }
            boolean r0 = r3.getBoolean(r6, r1)     // Catch:{ all -> 0x0081 }
            if (r0 != 0) goto L_0x007f
            java.security.KeyStore r0 = r8.A00     // Catch:{ Exception -> 0x0069 }
            r0.load(r5)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r2 = "k0"
            r8.A00(r9, r2)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r1 = "token"
            r8.A00(r9, r1)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = "aes_k0"
            r8.A01(r0, r2)     // Catch:{ Exception -> 0x0069 }
            java.lang.String r0 = "aes_token"
            r8.A01(r0, r1)     // Catch:{ Exception -> 0x0069 }
            r1 = 1
            android.content.SharedPreferences$Editor r0 = r3.edit()     // Catch:{ Exception -> 0x0069 }
            X.C17880vN.A1F(r0, r6, r1)     // Catch:{ Exception -> 0x0069 }
            goto L_0x007f
        L_0x0069:
            r3 = move-exception
            X.1QE r2 = r8.A01     // Catch:{ all -> 0x0081 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = " Skip Android KeyStore setup because: "
            r1.append(r0)     // Catch:{ all -> 0x0081 }
            X.AnonymousClass8BS.A1D(r3, r1)     // Catch:{ all -> 0x0081 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0081 }
            r2.A08(r4, r0, r3)     // Catch:{ all -> 0x0081 }
        L_0x007f:
            monitor-exit(r7)     // Catch:{ Exception -> 0x0084 }
            return
        L_0x0081:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ Exception -> 0x0084 }
            throw r0     // Catch:{ Exception -> 0x0084 }
        L_0x0084:
            r1 = move-exception
            X.1QE r0 = r8.A01
            r0.A08(r4, r5, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r1)
            throw r0
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A49.<init>(android.content.Context, X.11P, X.0vc):void");
    }
}
