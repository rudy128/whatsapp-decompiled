package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.5qE  reason: invalid class name and case insensitive filesystem */
public final class C114145qE extends C136966uh {
    public final /* synthetic */ C144287Gs A00;

    public void A06(WebView webView, String str) {
        C18070vi.A0d(str, 1);
        super.A06(webView, str);
        C144287Gs r2 = this.A00;
        C22821Di r1 = r2.A01;
        if (r1 != null) {
            r1.invoke(true);
        }
        r2.A01 = null;
        C137536vc.A00(r2.A00);
        r2.A00 = null;
    }

    public C114145qE(C144287Gs r1) {
        this.A00 = r1;
    }

    public void A05(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.A05(webView, webResourceRequest, webResourceError);
        C144287Gs r2 = this.A00;
        C22821Di r1 = r2.A01;
        if (r1 != null) {
            r1.invoke(AnonymousClass000.A0h());
        }
        r2.A01 = null;
        C137536vc.A00(r2.A00);
        r2.A00 = null;
    }
}
