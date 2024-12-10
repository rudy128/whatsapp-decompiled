package X;

import android.net.Uri;

/* renamed from: X.Cf2  reason: case insensitive filesystem */
public abstract class C25400Cf2 {
    public static final AnonymousClass00P A00 = new AnonymousClass00O(0);

    public static synchronized Uri A00() {
        Uri uri;
        synchronized (C25400Cf2.class) {
            AnonymousClass00P r3 = A00;
            uri = (Uri) r3.get("com.google.android.gms.auth_account");
            if (uri == null) {
                uri = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
                r3.put("com.google.android.gms.auth_account", uri);
            }
        }
        return uri;
    }
}
