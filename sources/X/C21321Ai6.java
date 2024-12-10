package X;

import android.webkit.WebView;

/* renamed from: X.Ai6  reason: case insensitive filesystem */
public final class C21321Ai6 implements C1605889b {
    public final C133236oO A00;
    public final C18030ve A01;

    public void Bzz(WebView webView) {
    }

    public void Bzu(WebView webView) {
        if (C18020vd.A05(C18040vf.A02, this.A01, 12711)) {
            webView.evaluateJavascript("\n                    (function() { \n                        var meta = document.querySelector('meta[name=\"theme-color\"]'); \n                        return meta ? meta.getAttribute('content') : null; \n                    })();\n                    ", new C20308AFq(this));
        }
    }

    public C21321Ai6(C18030ve r1, C133236oO r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
