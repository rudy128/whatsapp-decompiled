package X;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.5ey  reason: invalid class name and case insensitive filesystem */
public class C110125ey extends WebView {
    public BA8 A00;
    public C133646pF A01;
    public String A02;
    public ArrayList A03;
    public boolean A04;
    public boolean A05;
    public final C129556hz A06 = new C129556hz(this);
    public final Context A07;

    public static void A01(WebSettings webSettings) {
        webSettings.setAllowFileAccessFromFileURLs(false);
        webSettings.setAllowUniversalAccessFromFileURLs(false);
    }

    public static void A02(WebSettings webSettings) {
        webSettings.setMixedContentMode(1);
    }

    public void loadUrl(String str) {
        loadUrl(str, (Map) null);
    }

    public final void setCookieStringsSecure(String str, AnonymousClass6US r3, Collection collection) {
        setCookieStrings(str, r3, collection, (ValueCallback) null);
    }

    public final void A03(AnonymousClass6ZC r5) {
        BA8 ba8;
        if (this.A04 && (ba8 = this.A00) != null) {
            ba8.CFI("webview.SecureWebView", "WebChromeClient has been set already", (Throwable) null);
        }
        this.A04 = true;
        super.setWebChromeClient(new C110095ev(r5));
    }

    public final void A04(C136966uh r5) {
        BA8 ba8;
        if (this.A05 && (ba8 = this.A00) != null) {
            ba8.CFI("webview.SecureWebView", "WebViewClient has been set already", (Throwable) null);
        }
        this.A05 = true;
        super.setWebViewClient(new C110175f3(r5));
    }

    public final void A06(String str, Map map) {
        C133646pF r0 = this.A01;
        getContext();
        if (r0.A01(str).intValue() == 0) {
            Iterator it = this.A03.iterator();
            if (it.hasNext()) {
                it.next();
                getContext();
                throw AnonymousClass000.A0s("execute");
            }
            super.loadUrl(str, map);
        }
    }

    public final void setCookieStrings(String str, AnonymousClass6US r7, Collection collection, ValueCallback valueCallback) {
        if (collection != null) {
            try {
                if (!r7.A01(C26215Cuu.A01(str))) {
                    C26294Cx6.A0F(this.A02, "SecureUriWebView cannot load the cookie for the url \n%s\n. Please verify your cookie settings.\n", str);
                    return;
                }
                try {
                    CookieManager instance = CookieManager.getInstance();
                    instance.flush();
                    instance.setAcceptCookie(true);
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        String A0v = C17880vN.A0v(it);
                        if (valueCallback != null) {
                            instance.setCookie(str, A0v, valueCallback);
                        } else {
                            instance.setCookie(str, A0v);
                        }
                    }
                } catch (IllegalArgumentException unused) {
                }
            } catch (SecurityException e) {
                C26294Cx6.A0D(this.A02, "Parse url run triggers the exception on url: \n%s\n", e, str);
            }
        }
    }

    public final void setCookieStringsInsecure(String str, Collection collection) {
        setCookieStrings(str, C137566vf.A00, collection, (ValueCallback) null);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.BA8] */
    public C110125ey(Context context) {
        super(context);
        ArrayList A13 = AnonymousClass000.A13();
        ArrayList A132 = AnonymousClass000.A13();
        ArrayList A0z = C17880vN.A0z(4);
        String[] A1Y = C17880vN.A1Y();
        A1Y[0] = "https";
        List asList = Arrays.asList(A1Y);
        if (!asList.isEmpty()) {
            A0z.add(new C114185qI(asList));
            this.A01 = A00(AnonymousClass6VX.A00(A0z), A132, A13);
            this.A02 = "SecureWebView";
            this.A07 = context.getApplicationContext();
            WebSettings webSettings = getSecureSettings().A00;
            webSettings.setAllowFileAccess(false);
            webSettings.setAllowContentAccess(false);
            A01(webSettings);
            A02(webSettings);
            ? obj = new Object();
            this.A03 = AnonymousClass000.A13();
            this.A00 = obj;
            this.A05 = false;
            this.A04 = false;
            return;
        }
        throw AnonymousClass000.A0k("Cannot set 0 schemes");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, X.BA8] */
    public static C133646pF A00(Object obj, ArrayList arrayList, List list) {
        C18070vi.A0X(obj);
        arrayList.add(obj);
        return new C133646pF(new Object(), new AnonymousClass6VW(), list, arrayList);
    }

    public final C129556hz getSecureJsBridgeAuth() {
        return this.A06;
    }

    public AnonymousClass6ZD getSecureSettings() {
        return new AnonymousClass6ZD(getSettings());
    }

    public final C133646pF getUriHandler() {
        return this.A01;
    }

    public void A05(String str) {
        super.loadUrl(str);
    }

    public final void setReporter(BA8 ba8) {
        this.A00 = ba8;
    }

    public void loadUrl(String str, Map map) {
        A06(str, map);
    }
}
