package X;

import android.security.KeyPairGeneratorSpec;
import android.text.TextUtils;
import android.util.Base64;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.x500.X500Principal;
import org.json.JSONException;
import org.json.JSONObject;

public class A7I {
    public KeyStore A00;
    public JSONObject A01;
    public boolean A02;
    public final AnonymousClass118 A03;
    public final AnonymousClass1QD A04;
    public final AnonymousClass1QE A05 = AnonymousClass1QE.A00("PaymentTrustedDeviceManager", "infra", "COMMON");
    public final AnonymousClass00H A06;

    private synchronized void A00() {
        byte[] decode;
        if (!this.A02) {
            A05();
            try {
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.A00 = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
                AnonymousClass1QD r2 = this.A04;
                if (!C17880vN.A1W(r2.A03(), "payment_trusted_device_credential_use_keystore") && !C17880vN.A1W(r2.A03(), "payment_trusted_device_credential_use_keystore")) {
                    try {
                        Calendar instance2 = Calendar.getInstance();
                        Calendar instance3 = Calendar.getInstance();
                        instance3.add(1, 50);
                        KeyPairGeneratorSpec build = AnonymousClass8BY.A0A(new KeyPairGeneratorSpec.Builder(this.A03.A00).setAlias("payment_trusted_device_key_alias").setSubject(new X500Principal("CN=payment_trusted_device_key_alias")), BigInteger.TEN, instance2, instance3).build();
                        KeyPairGenerator instance4 = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                        instance4.initialize(build);
                        instance4.generateKeyPair();
                    } catch (Exception e) {
                        AnonymousClass8BX.A1B(this.A05, e, "generate RSA key pairs fails: ", AnonymousClass000.A10());
                    }
                    A01();
                }
                this.A02 = true;
            } catch (Exception e2) {
                AnonymousClass8BX.A1B(this.A05, e2, "keystore init fails: ", AnonymousClass000.A10());
            }
            String A0r = C17880vN.A0r(this.A04.A03(), "payment_trusted_device_credential");
            if (!TextUtils.isEmpty(A0r) && (decode = Base64.decode(A0r, 3)) != null) {
                A06(decode, 1);
            }
        }
    }

    private byte[] A02(byte[] bArr) {
        byte[] bArr2;
        byte[] A032;
        try {
            String string = this.A04.A03().getString("payment_trusted_device_credential_encrypted_aes", (String) null);
            if (TextUtils.isEmpty(string) || (bArr2 = Base64.decode(string, 3)) == null) {
                bArr2 = A01();
            }
            if (bArr2 == null || (A032 = A03(bArr2)) == null) {
                return null;
            }
            byte[] A1Z = AnonymousClass8BX.A1Z();
            byte[] A1Q = AnonymousClass8BS.A1Q(AnonymousClass8BS.A0v(A032), AnonymousClass8BR.A19(A1Z), Cipher.getInstance("AES/CBC/PKCS5Padding"), bArr, 1);
            int length = A1Q.length;
            byte[] bArr3 = new byte[(16 + length)];
            System.arraycopy(A1Z, 0, bArr3, 0, 16);
            System.arraycopy(A1Q, 0, bArr3, 16, length);
            return bArr3;
        } catch (Exception e) {
            AnonymousClass8BX.A1B(this.A05, e, "encrypt key fails: ", AnonymousClass000.A10());
            return null;
        }
    }

    private byte[] A03(byte[] bArr) {
        CipherInputStream cipherInputStream;
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(2, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", (KeyStore.ProtectionParameter) null)).getPrivateKey());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                cipherInputStream = new CipherInputStream(byteArrayInputStream, instance);
                ArrayList A13 = AnonymousClass000.A13();
                while (true) {
                    int read = cipherInputStream.read();
                    if (read == -1) {
                        break;
                    }
                    A13.add(Byte.valueOf((byte) read));
                }
                int size = A13.size();
                byte[] bArr2 = new byte[size];
                for (int i = 0; i < size; i++) {
                    bArr2[i] = ((Byte) A13.get(i)).byteValue();
                }
                cipherInputStream.close();
                byteArrayInputStream.close();
                return bArr2;
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            AnonymousClass8BX.A1B(this.A05, e, "RSA decrypt fails: ", AnonymousClass000.A10());
            return null;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A06(byte[] r4, int r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 3
            java.lang.String r2 = android.util.Base64.encodeToString(r4, r0)     // Catch:{ JSONException -> 0x0021 }
            org.json.JSONObject r1 = r3.A01     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ JSONException -> 0x0021 }
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x0021 }
            X.1QD r1 = r3.A04     // Catch:{ JSONException -> 0x0021 }
            org.json.JSONObject r0 = r3.A01     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r2 = r0.toString()     // Catch:{ JSONException -> 0x0021 }
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass8BU.A07(r1)     // Catch:{ JSONException -> 0x0021 }
            java.lang.String r0 = "payments_trusted_device_credential_network_map"
            X.C17880vN.A1E(r1, r0, r2)     // Catch:{ JSONException -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            X.1QE r1 = r3.A05     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "setNetworkCredential failed"
            r1.A05(r0)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r3)
            return
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7I.A06(byte[], int):void");
    }

    public void A05() {
        JSONObject A15;
        try {
            String A0r = C17880vN.A0r(this.A04.A03(), "payments_trusted_device_credential_network_map");
            if (A0r != null) {
                A15 = C17880vN.A16(A0r);
            } else {
                A15 = C17880vN.A15();
            }
            this.A01 = A15;
        } catch (JSONException e) {
            this.A05.A05(C17900vP.A0C("JSONObject instantiation ", AnonymousClass000.A10(), e));
            this.A01 = C17880vN.A15();
        }
    }

    public A7I(AnonymousClass118 r4, AnonymousClass1QD r5, AnonymousClass00H r6) {
        this.A03 = r4;
        this.A04 = r5;
        this.A06 = r6;
    }

    private byte[] A01() {
        byte[] A1Z = AnonymousClass8BX.A1Z();
        byte[] bArr = null;
        try {
            Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            instance.init(1, ((KeyStore.PrivateKeyEntry) this.A00.getEntry("payment_trusted_device_key_alias", (KeyStore.ProtectionParameter) null)).getCertificate().getPublicKey());
            ByteArrayOutputStream A15 = C108945cZ.A15();
            CipherOutputStream cipherOutputStream = new CipherOutputStream(A15, instance);
            cipherOutputStream.write(A1Z);
            cipherOutputStream.close();
            bArr = A15.toByteArray();
        } catch (Exception e) {
            AnonymousClass8BX.A1B(this.A05, e, "RSA encrypt fails: ", AnonymousClass000.A10());
        }
        if (bArr != null) {
            AnonymousClass1QD r1 = this.A04;
            C17880vN.A1E(AnonymousClass8BU.A07(r1), "payment_trusted_device_credential_encrypted_aes", Base64.encodeToString(bArr, 3));
        }
        Arrays.fill(A1Z, (byte) 0);
        return bArr;
    }

    public PrivateKey A04(int i) {
        byte[] bArr;
        byte[] A032;
        A00();
        A05();
        byte[] bArr2 = null;
        String optString = this.A01.optString(String.valueOf(i), (String) null);
        if (!TextUtils.isEmpty(optString)) {
            bArr2 = Base64.decode(optString, 3);
        }
        if (bArr2 == null) {
            A00();
            try {
                KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
                instance.initialize(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH);
                PrivateKey privateKey = instance.genKeyPair().getPrivate();
                this.A06.get();
                byte[] A022 = A02(privateKey.getEncoded());
                if (A022 != null) {
                    A06(A022, i);
                    AnonymousClass1QD r3 = this.A04;
                    if (!C17880vN.A1W(r3.A03(), "payment_trusted_device_credential_use_keystore")) {
                        C17880vN.A1F(AnonymousClass8BU.A07(r3), "payment_trusted_device_credential_use_keystore", true);
                    }
                    Arrays.fill(A022, (byte) 0);
                    return privateKey;
                }
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                AnonymousClass8BX.A1B(this.A05, e, "generate RSA key fails: ", AnonymousClass000.A10());
            }
            return null;
        }
        try {
            AnonymousClass1QD r5 = this.A04;
            if (!C17880vN.A1W(r5.A03(), "payment_trusted_device_credential_use_keystore")) {
                byte[] A023 = A02(bArr2);
                if (A023 != null) {
                    A06(bArr2, i);
                    C17880vN.A1F(AnonymousClass8BU.A07(r5), "payment_trusted_device_credential_use_keystore", true);
                    Arrays.fill(A023, (byte) 0);
                }
            } else {
                try {
                    String string = r5.A03().getString("payment_trusted_device_credential_encrypted_aes", (String) null);
                    if (TextUtils.isEmpty(string) || (bArr = Base64.decode(string, 3)) == null) {
                        bArr = A01();
                    }
                    if (bArr == null || (A032 = A03(bArr)) == null) {
                        bArr2 = null;
                    } else {
                        byte[] bArr3 = new byte[16];
                        System.arraycopy(bArr2, 0, bArr3, 0, 16);
                        int length = bArr2.length - 16;
                        byte[] bArr4 = new byte[length];
                        System.arraycopy(bArr2, 16, bArr4, 0, length);
                        SecretKeySpec A0v = AnonymousClass8BS.A0v(A032);
                        Cipher instance2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
                        AnonymousClass8BW.A1O(A0v, instance2, bArr3);
                        bArr2 = instance2.doFinal(bArr4);
                    }
                } catch (Exception e2) {
                    AnonymousClass8BX.A1B(this.A05, e2, "decrypt key fails: ", AnonymousClass000.A10());
                    bArr2 = null;
                }
            }
            if (bArr2 == null) {
                return null;
            }
            PKCS8EncodedKeySpec pKCS8EncodedKeySpec = new PKCS8EncodedKeySpec(bArr2);
            KeyFactory instance3 = KeyFactory.getInstance("RSA");
            Arrays.fill(bArr2, (byte) 0);
            return instance3.generatePrivate(pKCS8EncodedKeySpec);
        } catch (Exception e3) {
            AnonymousClass8BX.A1B(this.A05, e3, "loadRSAKey fails, ", AnonymousClass000.A10());
            return null;
        }
    }
}
