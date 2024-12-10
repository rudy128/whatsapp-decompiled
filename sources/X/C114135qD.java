package X;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.5qD  reason: invalid class name and case insensitive filesystem */
public final class C114135qD extends C136966uh {
    public final /* synthetic */ C144267Gq A00;

    public void A06(WebView webView, String str) {
        C18070vi.A0d(str, 1);
        C144267Gq r4 = this.A00;
        r4.A01 = AnonymousClass00R.A0N;
        C18030ve r3 = r4.A04;
        if (!C18020vd.A05(C18040vf.A02, r3, 8869)) {
            C110125ey r2 = r4.A00;
            if (r2 != null) {
                AnonymousClass6WN.A00(new C155897tU(r2, new AnonymousClass75Z(r3, r4)));
            }
            C17890vO.A0D().postDelayed(r4.A05, 60000);
        }
        super.A06(webView, str);
    }

    public C114135qD(C144267Gq r1) {
        this.A00 = r1;
    }

    public void A05(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        C144267Gq r4 = this.A00;
        r4.A01 = AnonymousClass00R.A0C;
        if (!C18020vd.A05(C18040vf.A02, r4.A04, 8869)) {
            C17890vO.A0D().postDelayed(r4.A05, 60000);
        } else {
            r4.A00();
        }
        super.A05(webView, webResourceRequest, webResourceError);
    }
}
