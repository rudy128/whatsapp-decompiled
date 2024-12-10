package X;

import android.app.KeyguardManager;
import android.content.Context;

/* renamed from: X.0Ku  reason: invalid class name and case insensitive filesystem */
public abstract class C03830Ku {
    public static KeyguardManager A00(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    public static boolean A01(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
