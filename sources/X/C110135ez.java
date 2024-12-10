package X;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;

/* renamed from: X.5ez  reason: invalid class name and case insensitive filesystem */
public final class C110135ez extends WebViewClient {
    public final /* synthetic */ FaqItemActivityV2 A00;

    public C110135ez(FaqItemActivityV2 faqItemActivityV2) {
        this.A00 = faqItemActivityV2;
    }

    public void onPageFinished(WebView webView, String str) {
        C1403871f r0 = this.A00.A04;
        if (r0 != null) {
            r0.A02();
        }
    }
}
