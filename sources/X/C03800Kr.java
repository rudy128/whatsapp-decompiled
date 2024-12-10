package X;

import android.hardware.biometrics.BiometricPrompt;

/* renamed from: X.0Kr  reason: invalid class name and case insensitive filesystem */
public abstract class C03800Kr {
    public static void A00(BiometricPrompt.Builder builder, boolean z) {
        builder.setConfirmationRequired(z);
    }

    public static void A01(BiometricPrompt.Builder builder, boolean z) {
        builder.setDeviceCredentialAllowed(z);
    }
}
