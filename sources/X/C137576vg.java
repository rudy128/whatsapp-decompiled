package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6vg  reason: invalid class name and case insensitive filesystem */
public abstract class C137576vg {
    public static final Map A00;

    static {
        HashMap A11 = C17880vN.A11();
        A00 = A11;
        A11.put("instagram.com", "com.instagram.android");
        A11.put("ig.me", "com.instagram.android");
        A11.put("facebook.com", "com.facebook.katana");
        A11.put("fb.watch", "com.facebook.katana");
        A11.put("fb.com", "com.facebook.katana");
        A11.put("fb.me", "com.facebook.katana");
        A11.put("facebook.co", "com.facebook.katana");
        A11.put("fbcdn.net", "com.facebook.katana");
    }

    public static Intent A00(Context context, Uri uri, boolean z) {
        boolean z2;
        Intent A07 = AnonymousClass3MY.A07(uri);
        A07.putExtra("com.android.browser.application_id", context.getPackageName());
        A07.putExtra("create_new_tab", true);
        if (z) {
            String host = uri.getHost();
            if (host != null && host.startsWith("www.")) {
                host = host.replace("www.", "");
            }
            String A0s = C17880vN.A0s(host, A00);
            if (A0s == null) {
                return null;
            }
            try {
                context.getPackageManager().getPackageInfo(A0s, 0);
                z2 = true;
            } catch (PackageManager.NameNotFoundException unused) {
                z2 = false;
            }
            if (!z2) {
                return null;
            }
            A07.setPackage(A0s);
        }
        return A07;
    }
}
