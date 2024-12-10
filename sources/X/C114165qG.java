package X;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;

/* renamed from: X.5qG  reason: invalid class name and case insensitive filesystem */
public final class C114165qG extends C136966uh implements C1593284c {
    public View A00;
    public String A01;
    public final AnonymousClass1KB A02;
    public final C160948As A03;
    public final ViewStub A04;
    public final AnonymousClass190 A05;
    public final C133236oO A06;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6ge, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v3, types: [X.6ge, java.lang.Object] */
    public static String A00(Uri uri) {
        C128766ge r1;
        String str;
        C128006fI r4 = C124506Yp.A00;
        String scheme = uri.getScheme();
        String authority = uri.getAuthority();
        if (scheme == null || "".equals(scheme) || authority == null || "".equals(authority)) {
            ? obj = new Object();
            obj.A01 = uri.getPath();
            obj.A02 = scheme;
            obj.A00 = authority;
            uri.getQuery();
            r1 = obj;
        } else {
            if (TextUtils.isEmpty(uri.getPath())) {
                str = null;
            } else {
                str = "/--sanitized--";
            }
            C124276Xs.A00(uri, r4);
            ? obj2 = new Object();
            obj2.A02 = scheme;
            obj2.A00 = authority;
            obj2.A01 = str;
            r1 = obj2;
        }
        String str2 = r1.A01;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public void A05(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        int i;
        String str;
        Uri url;
        CharSequence description;
        if (webResourceError != null) {
            i = webResourceError.getErrorCode();
        } else {
            i = -1;
        }
        String str2 = null;
        if (webResourceError == null || (description = webResourceError.getDescription()) == null) {
            str = null;
        } else {
            str = description.toString();
        }
        if (!(webResourceRequest == null || (url = webResourceRequest.getUrl()) == null)) {
            str2 = url.toString();
        }
        A04(webView, i, str, str2);
    }

    public void A08(WebView webView, String str, boolean z) {
        this.A03.BJ8(str);
        super.A08(webView, str, z);
    }

    public boolean A09(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        Boolean bool;
        AnonymousClass190 r3 = this.A05;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("did crash : ");
        if (renderProcessGoneDetail != null) {
            bool = Boolean.valueOf(renderProcessGoneDetail.didCrash());
        } else {
            bool = null;
        }
        r3.A0G("WaSecureWebViewClient/onRenderProcessGone: WebView render process crashed", C17890vO.A0V(bool, A10), true);
        C137536vc.A00(webView);
        return super.A09(webView, renderProcessGoneDetail);
    }

    public C114165qG(ViewStub viewStub, AnonymousClass190 r3, AnonymousClass1KB r4, C160948As r5, C133236oO r6) {
        C18070vi.A0o(r4, r6, r3);
        C18070vi.A0d(viewStub, 5);
        this.A02 = r4;
        this.A06 = r6;
        this.A05 = r3;
        this.A03 = r5;
        this.A04 = viewStub;
    }

    public void A04(WebView webView, int i, String str, String str2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WaSecureWebViewClient/onReceivedError: Error loading the page ");
        A10.append(A00(C26215Cuu.A01(str2)));
        C17900vP.A0e(": ", str, A10);
        if (str2 == null || str2.equals(this.A01)) {
            C160948As r1 = this.A03;
            if (r1.CCt().A04) {
                r1.CAW(str);
                return;
            }
            if (this.A00 == null) {
                View inflate = this.A04.inflate();
                this.A00 = inflate;
                AnonymousClass78M.A00(AnonymousClass1HF.A06(inflate, 2131437051), this, webView, 31);
            }
            C72453Mb.A1C(this.A00);
        }
    }

    public void A06(WebView webView, String str) {
        String str2;
        super.A06(webView, str);
        if (webView != null && webView.getProgress() == 100) {
            for (C1605889b Bzu : this.A03.BTe()) {
                Bzu.Bzu(webView);
            }
        }
        C160948As r2 = this.A03;
        r2.Bx9(false, str);
        r2.CRU(str);
        if (webView != null) {
            str2 = webView.getTitle();
        } else {
            str2 = null;
        }
        if (!"about:blank".equals(str2)) {
            if (webView != null) {
                String title = webView.getTitle();
                if (title != null) {
                    r2.CRT(title);
                }
            } else {
                return;
            }
        } else if (webView == null) {
            return;
        }
        C133236oO r22 = this.A06;
        AnonymousClass3MY.A1L(r22.A09, webView.canGoBack());
        AnonymousClass3MY.A1L(r22.A0A, webView.canGoForward());
    }

    public void A07(WebView webView, String str, Bitmap bitmap) {
        super.A07(webView, str, bitmap);
        C72453Mb.A1D(this.A00);
        this.A01 = str;
        C160948As r3 = this.A03;
        r3.Bx9(true, str);
        C133236oO r2 = this.A06;
        AnonymousClass3MY.A1L(r2.A09, webView.canGoBack());
        AnonymousClass3MY.A1L(r2.A0A, webView.canGoForward());
        for (C1605889b Bzz : r3.BTe()) {
            Bzz.Bzz(webView);
        }
    }
}
