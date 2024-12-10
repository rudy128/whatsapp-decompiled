package X;

import android.webkit.WebView;

/* renamed from: X.6vc  reason: invalid class name and case insensitive filesystem */
public abstract class C137536vc {
    public static final void A01(C110125ey r2) {
        r2.getSettings().setJavaScriptCanOpenWindowsAutomatically(false);
        r2.getSettings().setGeolocationEnabled(false);
        r2.getSettings().setSupportMultipleWindows(false);
        r2.getSettings().setSaveFormData(false);
    }

    public static final void A00(WebView webView) {
        if (webView != null) {
            webView.onPause();
            webView.loadUrl("about:blank");
            webView.clearHistory();
            webView.removeAllViews();
            webView.destroyDrawingCache();
            webView.destroy();
        }
    }
}
