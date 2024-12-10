package X;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.support.faq.FaqItemActivity;

/* renamed from: X.5f2  reason: invalid class name and case insensitive filesystem */
public final class C110165f2 extends WebViewClient {
    public final /* synthetic */ FaqItemActivity A00;

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        C18070vi.A0d(webResourceRequest, 1);
        Uri url = webResourceRequest.getUrl();
        C18070vi.A0X(url);
        return A00(url);
    }

    public C110165f2(FaqItemActivity faqItemActivity) {
        this.A00 = faqItemActivity;
    }

    public void onPageFinished(WebView webView, String str) {
        C1403871f r0 = this.A00.A06;
        if (r0 != null) {
            r0.A02();
        }
    }

    private final boolean A00(Uri uri) {
        if (C108975cc.A1N("tel:", C18070vi.A0H(uri))) {
            this.A00.startActivity(new Intent("android.intent.action.DIAL", uri));
            return true;
        }
        FaqItemActivity faqItemActivity = this.A00;
        if (!C17890vO.A1U(uri, "ombudsman")) {
            return false;
        }
        if (C18020vd.A05(C18040vf.A02, faqItemActivity.A0E, 2341)) {
            AnonymousClass1QS r0 = faqItemActivity.A05;
            if (r0 != null) {
                Class BPG = r0.A06().BPG();
                if (BPG == null) {
                    return true;
                }
                faqItemActivity.startActivity(new Intent(faqItemActivity, BPG));
                return true;
            }
            C18070vi.A11("paymentsManager");
            throw null;
        }
        C73203Rj A002 = AnonymousClass4a6.A00(faqItemActivity);
        A002.A0D(2131893616);
        A002.A0g(faqItemActivity, (C22851Dl) null, 2131899286);
        A002.A0C();
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        C18070vi.A0d(str, 1);
        Uri parse = Uri.parse(str);
        C18070vi.A0X(parse);
        return A00(parse);
    }
}
