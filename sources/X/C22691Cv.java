package X;

import android.os.Build;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

/* renamed from: X.1Cv  reason: invalid class name and case insensitive filesystem */
public abstract class C22691Cv {
    public static SecureRandom A00() {
        if (Build.VERSION.SDK_INT < 26) {
            return new SecureRandom();
        }
        try {
            return SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException unused) {
            return new SecureRandom();
        }
    }
}
