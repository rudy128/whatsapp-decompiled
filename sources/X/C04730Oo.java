package X;

import android.security.keystore.KeyGenParameterSpec;

/* renamed from: X.0Oo  reason: invalid class name and case insensitive filesystem */
public abstract class C04730Oo {
    public static void A02(KeyGenParameterSpec.Builder builder) {
        builder.setBlockModes(new String[]{"CBC"});
    }

    public static void A03(KeyGenParameterSpec.Builder builder) {
        builder.setEncryptionPaddings(new String[]{"PKCS7Padding"});
    }

    public static KeyGenParameterSpec.Builder A00() {
        return new KeyGenParameterSpec.Builder("androidxBiometric", 3);
    }

    public static KeyGenParameterSpec A01(KeyGenParameterSpec.Builder builder) {
        return builder.build();
    }
}
