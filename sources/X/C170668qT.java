package X;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Collections;
import java.util.Enumeration;
import javax.crypto.SecretKey;

/* renamed from: X.8qT  reason: invalid class name and case insensitive filesystem */
public class C170668qT extends C22711Cx {
    public KeyStore A00;
    public final C18030ve A01;

    public static StringBuilder A01() {
        StringBuilder sb = new StringBuilder();
        sb.append("EncryptedKeyHelperAESKeyStore/");
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r3.A01, 1862) == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.security.KeyStore A02() {
        /*
            r3 = this;
            java.security.KeyStore r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            X.0ve r2 = r3.A01
            r1 = 1862(0x746, float:2.609E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x001c
        L_0x0010:
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r1 = java.security.KeyStore.getInstance(r0)
            r3.A00 = r1
            r0 = 0
            r1.load(r0)
        L_0x001c:
            java.security.KeyStore r0 = r3.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170668qT.A02():java.security.KeyStore");
    }

    private SecretKey A04(KeyStore keyStore) {
        KeyStore.SecretKeyEntry secretKeyEntry = (KeyStore.SecretKeyEntry) keyStore.getEntry("aes_auth_key", (KeyStore.ProtectionParameter) null);
        if (secretKeyEntry != null) {
            return secretKeyEntry.getSecretKey();
        }
        Enumeration<String> aliases = keyStore.aliases();
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Missing key alias ");
        A10.append("aes_auth_key");
        A10.append("; available aliases = ");
        throw new KeyStoreException(AnonymousClass000.A0y(TextUtils.join(",", Collections.list(aliases)), A10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C191309mN A06(byte[] r11) {
        /*
            r10 = this;
            java.lang.String r3 = "ged"
            java.security.KeyStore r1 = r10.A02()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            java.lang.String r4 = "aes_auth_key"
            boolean r0 = r1.containsAlias(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            if (r0 == 0) goto L_0x001b
            java.lang.Class<java.security.KeyStore$SecretKeyEntry> r0 = java.security.KeyStore.SecretKeyEntry.class
            boolean r0 = r1.entryInstanceOf(r4, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            if (r0 == 0) goto L_0x001b
            javax.crypto.SecretKey r2 = r10.A03()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            goto L_0x005b
        L_0x001b:
            java.lang.String r1 = "AES"
            java.lang.String r0 = "AndroidKeyStore"
            javax.crypto.KeyGenerator r6 = javax.crypto.KeyGenerator.getInstance(r1, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r0 = 3
            android.security.keystore.KeyGenParameterSpec$Builder r2 = new android.security.keystore.KeyGenParameterSpec$Builder     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r2.<init>(r4, r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r5 = 1
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            java.lang.String r0 = "GCM"
            r4 = 0
            r1[r4] = r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            android.security.keystore.KeyGenParameterSpec$Builder r2 = r2.setBlockModes(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            java.lang.String[] r1 = new java.lang.String[r5]     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            java.lang.String r0 = "NoPadding"
            r1[r4] = r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r2.setEncryptionPaddings(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            android.security.keystore.KeyGenParameterSpec$Builder r1 = r0.setUserAuthenticationRequired(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            boolean r0 = X.AnonymousClass112.A05()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            if (r0 == 0) goto L_0x0050
            android.security.keystore.KeyGenParameterSpec$Builder r0 = r1.setUserConfirmationRequired(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r0.setUserPresenceRequired(r4)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
        L_0x0050:
            android.security.keystore.KeyGenParameterSpec r0 = r1.build()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r6.init(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            javax.crypto.SecretKey r2 = r6.generateKey()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
        L_0x005b:
            if (r2 == 0) goto L_0x0076
            javax.crypto.Cipher r1 = X.AnonymousClass8BR.A18()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r0 = 1
            r1.init(r0, r2)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            byte[] r7 = r1.getIV()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            byte[] r6 = r1.doFinal(r11)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r5 = 0
            r9 = 0
            X.9mN r4 = new X.9mN     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r8 = r5
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            return r4
        L_0x0076:
            java.lang.String r1 = "could not get key store entry"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x007e, IOException | KeyStoreException | NoSuchProviderException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x0086 }
        L_0x007e:
            r2 = move-exception
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "crypto issue on encryption"
            goto L_0x008d
        L_0x0086:
            r2 = move-exception
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "key store issue on decryption"
        L_0x008d:
            X.C108985cd.A1M(r0, r1, r2)
            java.lang.Throwable r0 = r2.getCause()
            if (r0 == 0) goto L_0x009a
            java.lang.Throwable r2 = r2.getCause()
        L_0x009a:
            r10.A05(r3, r2)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170668qT.A06(byte[]):X.9mN");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] A08(X.C191309mN r7, java.lang.Integer r8) {
        /*
            r6 = this;
            java.lang.String r5 = "gd-"
            int r0 = r7.A00
            r4 = 0
            if (r0 == 0) goto L_0x0011
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "getDecrypted invalid type"
            X.C17890vO.A19(r1, r0)
            return r4
        L_0x0011:
            javax.crypto.SecretKey r3 = r6.A03()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            if (r3 == 0) goto L_0x002c
            javax.crypto.Cipher r2 = X.AnonymousClass8BR.A18()     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            byte[] r0 = r7.A03     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            javax.crypto.spec.GCMParameterSpec r1 = X.AnonymousClass8BT.A11(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            r0 = 2
            r2.init(r0, r3, r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            byte[] r0 = r7.A02     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            byte[] r0 = r2.doFinal(r0)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            return r0
        L_0x002c:
            java.lang.String r1 = "could not get key store entry"
            java.security.KeyStoreException r0 = new java.security.KeyStoreException     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            r0.<init>(r1)     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
            throw r0     // Catch:{ NullPointerException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0034, IOException | KeyStoreException | ProviderException | UnrecoverableEntryException | CertificateException -> 0x003c }
        L_0x0034:
            r3 = move-exception
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "crypto issue on decryption"
            goto L_0x0043
        L_0x003c:
            r3 = move-exception
            java.lang.StringBuilder r1 = A01()
            java.lang.String r0 = "key store issue on decryption"
        L_0x0043:
            X.C108985cd.A1M(r0, r1, r3)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A11(r5)
            int r1 = r8.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0065
            java.lang.String r0 = "selftest"
        L_0x0053:
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r2)
            java.lang.Throwable r0 = r3.getCause()
            if (r0 == 0) goto L_0x0061
            java.lang.Throwable r3 = r3.getCause()
        L_0x0061:
            r6.A05(r1, r3)
            return r4
        L_0x0065:
            java.lang.String r0 = "active"
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C170668qT.A08(X.9mN, java.lang.Integer):byte[]");
    }

    public C170668qT(AnonymousClass190 r1, AnonymousClass18O r2, C18030ve r3, C18010vc r4) {
        super(r1, r2, r4);
        this.A01 = r3;
    }

    private SecretKey A03() {
        try {
            return A04(A02());
        } catch (UnrecoverableKeyException e) {
            e = e;
            C17890vO.A19(A01(), " KeyStore error, will wait and retry with new keystore");
            if (e.getCause() != null) {
                e = e.getCause();
            }
            A05("gd", e);
            SystemClock.sleep(50);
            return A04(A02());
        }
    }

    public void A07() {
        try {
            A02().deleteEntry("aes_auth_key");
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
            C17890vO.A19(A01(), "failed to clear keyStore");
        }
    }
}
