package X;

import android.os.Build;

/* renamed from: X.1a1  reason: invalid class name and case insensitive filesystem */
public abstract class C28361a1 {
    public static final boolean A00() {
        if (!"chromium".equals(Build.MANUFACTURER) || !"chromium".equals(Build.BRAND)) {
            return false;
        }
        return true;
    }
}
