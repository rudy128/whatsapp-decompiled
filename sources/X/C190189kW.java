package X;

import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.9kW  reason: invalid class name and case insensitive filesystem */
public class C190189kW {
    public final KeyStore A00;
    public final AnonymousClass1QE A01 = AnonymousClass1QE.A00("Secp256r1KeyStoreHelper", "infra", "COMMON");

    public KeyPair A00() {
        try {
            KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder("alias-payments-br-trusted-device-key", 4).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setKeySize(256);
            String[] A1Y = C17880vN.A1Y();
            A1Y[0] = "SHA-256";
            KeyGenParameterSpec build = keySize.setDigests(A1Y).build();
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            instance.initialize(build);
            return instance.generateKeyPair();
        } catch (Exception e) {
            this.A01.A0A("", e);
            return null;
        }
    }

    public C190189kW(KeyStore keyStore) {
        this.A00 = keyStore;
    }
}
