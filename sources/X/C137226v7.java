package X;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* renamed from: X.6v7  reason: invalid class name and case insensitive filesystem */
public abstract class C137226v7 {
    public static final String A00(AnonymousClass855 r1) {
        if (r1 instanceof AnonymousClass7HD) {
            return "image/*";
        }
        if (r1 instanceof AnonymousClass7HC) {
            return null;
        }
        throw AnonymousClass3MW.A14();
    }

    public static final boolean A01() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            return true;
        }
        return false;
    }
}
