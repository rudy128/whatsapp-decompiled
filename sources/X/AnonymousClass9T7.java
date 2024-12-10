package X;

import android.net.Uri;

/* renamed from: X.9T7  reason: invalid class name */
public abstract class AnonymousClass9T7 {
    public static final Uri A00;

    static {
        String str;
        if (AnonymousClass9T9.A00) {
            str = "com.facebook.appmanager.dev";
        } else {
            str = "com.facebook.appmanager";
        }
        A00 = new Uri.Builder().scheme("content").authority(AnonymousClass000.A0y(".firstparty.settings", AnonymousClass000.A11(str))).build();
    }
}
