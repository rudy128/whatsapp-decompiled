package X;

import android.net.Uri;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.5f1  reason: invalid class name and case insensitive filesystem */
public class C110155f1 extends WebViewClient {
    public final /* synthetic */ C122086Ms A00;

    public C110155f1(C122086Ms r1) {
        this.A00 = r1;
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C122086Ms r3 = this.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("webview_error_");
        C122086Ms.A03(r3, "WebViewClient error", C17880vN.A0t(A10, webResourceError.getErrorCode()), true);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith("y://error")) {
            C122086Ms.A03(this.A00, "iFrame api script error", "iframe_api_script_error", true);
        }
        if (str.startsWith("https://")) {
            this.A00.A0D.CGU(webView.getContext(), Uri.parse(str), (AnonymousClass206) null);
        }
        return true;
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        C122086Ms.A03(this.A00, "WebViewClient error", AnonymousClass001.A1I("webview_error_", AnonymousClass000.A10(), i), true);
    }
}
