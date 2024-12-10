package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: X.5f0  reason: invalid class name and case insensitive filesystem */
public final class C110145f0 extends WebViewClient {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C114115qB A01;
    public final /* synthetic */ boolean A02;

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        String scheme;
        C18070vi.A0d(webResourceRequest, 1);
        String A0H = C18070vi.A0H(webResourceRequest.getUrl());
        Uri A0F = C108955ca.A0F(A0H);
        if (webResourceRequest.isForMainFrame() && (URLUtil.isHttpsUrl(A0H) || ((scheme = A0F.getScheme()) != null && this.A01.A03.BeT(scheme)))) {
            C114115qB r3 = this.A01;
            if (!r3.A03.CM4(A0H)) {
                Intent intent = new Intent("android.intent.action.VIEW", C26215Cuu.A01(A0H));
                intent.addFlags(268435456);
                C108995ce.A17(r3.A01, AnonymousClass1L9.A06(this.A00, intent) ? 1 : 0);
            }
        }
        return true;
    }

    public C110145f0(Context context, C114115qB r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = context;
    }
}
