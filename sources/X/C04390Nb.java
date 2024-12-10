package X;

import android.content.Context;
import android.hardware.biometrics.BiometricManager;
import android.hardware.biometrics.BiometricPrompt;
import java.lang.reflect.Method;

/* renamed from: X.0Nb  reason: invalid class name and case insensitive filesystem */
public abstract class C04390Nb {
    public static BiometricManager A01(Context context) {
        return (BiometricManager) context.getSystemService(BiometricManager.class);
    }

    public static Method A02() {
        try {
            return BiometricManager.class.getMethod("canAuthenticate", new Class[]{BiometricPrompt.CryptoObject.class});
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static int A00(BiometricManager biometricManager) {
        return biometricManager.canAuthenticate();
    }
}
