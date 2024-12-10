package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;

/* renamed from: X.5f3  reason: invalid class name and case insensitive filesystem */
public final class C110175f3 extends WebViewClient {
    public boolean A00 = false;
    public final C136966uh A01;

    private boolean A00(WebView webView, String str, boolean z) {
        Integer A002;
        boolean z2;
        if (!(webView instanceof C110125ey)) {
            return false;
        }
        C110125ey r8 = (C110125ey) webView;
        this.A00 = true;
        C133646pF r0 = r8.A01;
        if (z) {
            r8.getContext();
            A002 = r0.A01(str);
        } else {
            A002 = r0.A00(str);
        }
        boolean A1Z = AnonymousClass3Ma.A1Z(A002, AnonymousClass00R.A00);
        C136966uh r4 = this.A01;
        if (r4 instanceof C1593284c) {
            C114165qG r42 = (C114165qG) ((C1593284c) r4);
            if (str != null) {
                z2 = r42.A03.CM4(str);
            } else {
                z2 = false;
            }
            Context context = r8.getContext();
            if (!z2 && context != null) {
                AnonymousClass7RN.A00(r42.A02, r42, context, 42);
            }
        } else {
            z2 = false;
        }
        if (!A1Z && !z2) {
            return false;
        }
        this.A00 = false;
        if (A1Z || z2) {
            return true;
        }
        return false;
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.A01.A08(webView, str, z);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.A01.A01.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        this.A01.A01.onLoadResource(webView, str);
    }

    public void onPageCommitVisible(WebView webView, String str) {
        this.A01.A03(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.A01.A06(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (webView instanceof C110125ey) {
            C110125ey r3 = (C110125ey) webView;
            C129556hz r1 = r3.A06;
            if (r1.A02 && r1.A03.getSettings().getJavaScriptEnabled()) {
                r1.A01 = false;
                r1.A00 = C139456ys.A00(str);
            }
            if (this.A00) {
                this.A00 = false;
            }
            this.A01.A07(r3, str, bitmap);
        }
    }

    public void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        this.A01.A01.onReceivedClientCertRequest(webView, clientCertRequest);
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A01.A05(webView, webResourceRequest, webResourceError);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.A01.A01.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        this.A01.A02(webView, webResourceRequest, webResourceResponse);
    }

    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.A01.A01.onReceivedLoginRequest(webView, str, str2, str3);
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        String str;
        Integer num;
        Context context;
        C136966uh r2 = this.A01;
        if (r2 instanceof C114165qG) {
            C114165qG r22 = (C114165qG) r2;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("WaSecureWebViewClient/onReceivedSslError: SSL Error while loading the page: ");
            String str2 = null;
            if (sslError != null) {
                str = sslError.getUrl();
            } else {
                str = null;
            }
            A10.append(C114165qG.A00(C26215Cuu.A01(str)));
            A10.append(": Code ");
            if (sslError != null) {
                num = Integer.valueOf(sslError.getPrimaryError());
            } else {
                num = null;
            }
            A10.append(num);
            C17890vO.A0w(A10);
            if (sslErrorHandler != null) {
                sslErrorHandler.cancel();
            }
            if (webView != null) {
                webView.stopLoading();
            }
            C160948As r23 = r22.A03;
            if (!(webView == null || (context = webView.getContext()) == null)) {
                str2 = context.getString(2131898504);
            }
            if (sslError != null) {
                sslError.getPrimaryError();
            }
            r23.CAW(str2);
            return;
        }
        sslError.getCertificate();
        r2.A01.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.A01.A09(webView, renderProcessGoneDetail);
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        this.A01.A01(webView, webResourceRequest, i, safeBrowsingResponse);
    }

    public void onScaleChanged(WebView webView, float f, float f2) {
        this.A01.A01.onScaleChanged(webView, f, f2);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.A01.A01.onUnhandledKeyEvent(webView, keyEvent);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        String str;
        Uri url;
        WebResourceResponse C3Q;
        C136966uh r1 = this.A01;
        boolean z = r1 instanceof C114165qG;
        C114165qG r12 = r1;
        if (z) {
            C114165qG r13 = (C114165qG) r1;
            if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null) {
                str = null;
            } else {
                str = url.toString();
                if (!(str == null || (C3Q = r13.A03.C3Q(str)) == null)) {
                    return C3Q;
                }
            }
            r12 = r13;
            if (!URLUtil.isHttpsUrl(str)) {
                C17900vP.A0e("WaSecureWebViewClient/shouldInterceptRequest: Cannot open resource trough a not encrypted channel: ", str, AnonymousClass000.A10());
                return new WebResourceResponse("application/octet-stream", C19620yd.A0A, new ByteArrayInputStream(C108975cc.A1O("")));
            }
        }
        return r12.A01.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.A01.A01.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public C110175f3(C136966uh r2) {
        this.A01 = r2;
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.hasGesture();
        String obj = webResourceRequest.getUrl().toString();
        boolean A1O = AnonymousClass000.A1O(webResourceRequest.isForMainFrame() ? 1 : 0);
        webResourceRequest.hasGesture();
        return A00(webView, obj, A1O);
    }

    @Deprecated
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.A01.A04(webView, i, str, str2);
    }

    @Deprecated
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return A00(webView, str, true);
    }
}
