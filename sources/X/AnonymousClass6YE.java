package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.6YE  reason: invalid class name */
public abstract class AnonymousClass6YE {
    public static void A00(Activity activity, String str, String str2, int i, boolean z) {
        Intent className = C17880vN.A0A().setClassName(activity.getPackageName(), "com.whatsapp.accountlinking.FxWaInAppBrowserActivity");
        C18070vi.A0X(className);
        C17960vV.A07(str2);
        className.putExtra("webview_url", str2);
        className.putExtra("webview_callback", str);
        className.putExtra("webview_avoid_external", z);
        className.putExtra("webview_hide_url", true);
        className.putExtra("webview_javascript_enabled", true);
        A5E.A00().A02().A02(activity, className, i);
    }
}
