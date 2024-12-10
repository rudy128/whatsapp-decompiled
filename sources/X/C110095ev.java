package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.5ev  reason: invalid class name and case insensitive filesystem */
public final class C110095ev extends WebChromeClient {
    public final AnonymousClass6ZC A00;

    public Bitmap getDefaultVideoPoster() {
        return this.A00.A00.getDefaultVideoPoster();
    }

    public View getVideoLoadingProgressView() {
        return this.A00.A00.getVideoLoadingProgressView();
    }

    public void getVisitedHistory(ValueCallback valueCallback) {
        this.A00.A00.getVisitedHistory(valueCallback);
    }

    public void onCloseWindow(WebView webView) {
        this.A00.A00.onCloseWindow(webView);
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        AnonymousClass6ZC r1 = this.A00;
        if (!(r1 instanceof C114115qB)) {
            return r1.A00.onConsoleMessage(consoleMessage);
        }
        C18070vi.A0d(consoleMessage, 0);
        Iterator it = ((C114115qB) r1).A04.iterator();
        while (it.hasNext()) {
            it.next();
            consoleMessage.message();
        }
        return true;
    }

    public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport;
        AnonymousClass6ZC r3 = this.A00;
        if (!(r3 instanceof C114115qB)) {
            return r3.A00.onCreateWindow(webView, z, z2, message);
        }
        C114115qB r32 = (C114115qB) r3;
        AnonymousClass3Ma.A1O(webView, 0, message);
        if (!z2 || !r32.A02.A06) {
            return false;
        }
        Context context = webView.getContext();
        C110125ey r2 = new C110125ey(context);
        r2.setWebViewClient(new C110145f0(context, r32, z2));
        Object obj = message.obj;
        if (!(obj instanceof WebView.WebViewTransport) || (webViewTransport = (WebView.WebViewTransport) obj) == null) {
            return false;
        }
        webViewTransport.setWebView(r2);
        message.sendToTarget();
        return true;
    }

    public void onGeolocationPermissionsHidePrompt() {
        this.A00.A00.onGeolocationPermissionsHidePrompt();
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        this.A00.A00.onGeolocationPermissionsShowPrompt(str, callback);
    }

    public void onHideCustomView() {
        this.A00.A00.onHideCustomView();
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsAlert(webView, str, str2, jsResult);
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsBeforeUnload(webView, str, str2, jsResult);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return this.A00.A00.onJsConfirm(webView, str, str2, jsResult);
    }

    public boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return this.A00.A00.onJsPrompt(webView, str, str2, str3, jsPromptResult);
    }

    public void onPermissionRequest(PermissionRequest permissionRequest) {
        AnonymousClass6ZC r1 = this.A00;
        if (r1 instanceof C114115qB) {
            C18070vi.A0d(permissionRequest, 0);
            ((C114115qB) r1).A03.C0Q(permissionRequest);
            return;
        }
        r1.A00.onPermissionRequest(permissionRequest);
    }

    public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
        AnonymousClass6ZC r1 = this.A00;
        if (r1 instanceof C114115qB) {
            C18070vi.A0d(permissionRequest, 0);
            ((C114115qB) r1).A03.C0R();
            return;
        }
        r1.A00.onPermissionRequestCanceled(permissionRequest);
    }

    public void onProgressChanged(WebView webView, int i) {
        String str;
        String str2;
        if ((webView instanceof C110125ey) && i >= 20) {
            C129556hz r4 = ((C110125ey) webView).A06;
            if (r4.A02) {
                C110125ey r5 = r4.A03;
                if (r5.getSettings().getJavaScriptEnabled() && (str = r4.A00) != null && !r4.A01) {
                    HashMap hashMap = r4.A04;
                    boolean containsKey = hashMap.containsKey(str);
                    String str3 = r4.A00;
                    if (!containsKey) {
                        C139456ys r1 = new C139456ys(str3);
                        str2 = r1.A01;
                        hashMap.put(r4.A00, r1);
                    } else {
                        C139456ys r0 = (C139456ys) hashMap.get(str3);
                        if (r0 != null) {
                            str2 = r0.A01;
                        } else {
                            str2 = "";
                        }
                    }
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("javascript:var __fbAndroidBridgeAuthToken = '");
                    A10.append(str2);
                    r5.A05(AnonymousClass000.A0y("';window.dispatchEvent(new Event('__fbAndroidBridgeAuthTokenInjected'));", A10));
                    r4.A01 = true;
                }
            }
        }
        AnonymousClass6ZC r12 = this.A00;
        if (r12 instanceof C114115qB) {
            C114115qB r13 = (C114115qB) r12;
            ProgressBar progressBar = r13.A00;
            if (progressBar != null) {
                boolean z = r13.A02.A05;
                int i2 = 0;
                if (!z || i == 100) {
                    i2 = 8;
                }
                progressBar.setVisibility(i2);
                progressBar.setProgress(i);
                return;
            }
            return;
        }
        r12.A00.onProgressChanged(webView, i);
    }

    public void onReceivedIcon(WebView webView, Bitmap bitmap) {
        this.A00.A00.onReceivedIcon(webView, bitmap);
    }

    public void onReceivedTitle(WebView webView, String str) {
        AnonymousClass6ZC r1 = this.A00;
        if (r1 instanceof C114115qB) {
            C18070vi.A0h(webView, str);
            C160948As r12 = ((C114115qB) r1).A03;
            r12.CRU(webView.getUrl());
            if (!AnonymousClass1EG.A0H(str) && !"about:blank".equals(str)) {
                r12.CRT(str);
                return;
            }
            return;
        }
        r1.A00.onReceivedTitle(webView, str);
    }

    public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
        this.A00.A00.onReceivedTouchIconUrl(webView, str, z);
    }

    public void onRequestFocus(WebView webView) {
        this.A00.A00.onRequestFocus(webView);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.A00.A00.onShowCustomView(view, customViewCallback);
    }

    public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        AnonymousClass6ZC r1 = this.A00;
        if (!(r1 instanceof C114115qB)) {
            return r1.A00.onShowFileChooser(webView, valueCallback, fileChooserParams);
        }
        C18070vi.A0j(valueCallback, fileChooserParams);
        return ((C114115qB) r1).A03.C5Y(valueCallback);
    }

    public C110095ev(AnonymousClass6ZC r1) {
        this.A00 = r1;
    }
}
