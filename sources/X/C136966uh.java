package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.ArrayList;

/* renamed from: X.6uh  reason: invalid class name and case insensitive filesystem */
public abstract class C136966uh {
    public ArrayList A00 = AnonymousClass000.A13();
    public final WebViewClient A01 = new WebViewClient();

    public void A01(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        String str;
        Context context;
        if (this instanceof C114165qG) {
            C114165qG r2 = (C114165qG) this;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("WaSecureWebViewClient/onSafeBrowsingHit: Unsafe page hit: ");
            String str2 = null;
            if (webView != null) {
                str = webView.getUrl();
            } else {
                str = null;
            }
            C17890vO.A19(A10, C114165qG.A00(C26215Cuu.A01(str)));
            C160948As r22 = r2.A03;
            if (!(webView == null || (context = webView.getContext()) == null)) {
                str2 = context.getString(2131898504);
            }
            r22.CAW(str2);
            return;
        }
        this.A01.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public void A02(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A01.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
    }

    public void A03(WebView webView, String str) {
        this.A01.onPageCommitVisible(webView, str);
    }

    @Deprecated
    public void A04(WebView webView, int i, String str, String str2) {
        this.A01.onReceivedError(webView, i, str, str2);
    }

    public void A05(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A01.onReceivedError(webView, webResourceRequest, webResourceError);
    }

    public void A06(WebView webView, String str) {
        this.A01.onPageFinished(webView, str);
    }

    public void A07(WebView webView, String str, Bitmap bitmap) {
        this.A01.onPageStarted(webView, str, bitmap);
    }

    public void A08(WebView webView, String str, boolean z) {
        this.A01.doUpdateVisitedHistory(webView, str, z);
    }

    public boolean A09(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A01.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
