package X;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;

/* renamed from: X.9PC  reason: invalid class name */
public abstract class AnonymousClass9PC {
    public static final PublicKey A00() {
        try {
            KeyPairGenerator instance = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            KeyGenParameterSpec.Builder userAuthenticationRequired = new KeyGenParameterSpec.Builder("payment_bio_key_alias", 4).setDigests(new String[]{"SHA-256"}).setAlgorithmParameterSpec(new ECGenParameterSpec("secp256r1")).setUserAuthenticationRequired(true);
            C18070vi.A0X(userAuthenticationRequired);
            if (AnonymousClass112.A07()) {
                userAuthenticationRequired.setUserAuthenticationParameters(0, 2);
            } else {
                userAuthenticationRequired.setUserAuthenticationValidityDurationSeconds(-1);
            }
            if (AnonymousClass112.A02()) {
                userAuthenticationRequired.setInvalidatedByBiometricEnrollment(true);
            }
            instance.initialize(userAuthenticationRequired.build());
            return instance.generateKeyPair().getPublic();
        } catch (Exception e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("FingerprintHelper/generateKey generateKey: api=");
            A10.append(Build.VERSION.SDK_INT);
            throw AnonymousClass8BR.A0w(AnonymousClass001.A1E(e, " error: ", A10));
        }
    }
}
