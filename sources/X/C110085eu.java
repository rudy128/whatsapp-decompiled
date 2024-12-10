package X;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.whatsapp.inappsupport.ui.FaqItemActivityV2;

/* renamed from: X.5eu  reason: invalid class name and case insensitive filesystem */
public class C110085eu extends WebChromeClient {
    public final int A00;
    public final Object A01;

    public C110085eu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public Bitmap getDefaultVideoPoster() {
        if (1 - this.A00 != 0) {
            return super.getDefaultVideoPoster();
        }
        return ((C122086Ms) this.A01).A09[0];
    }

    public void onHideCustomView() {
        if (this.A00 != 0) {
            super.onHideCustomView();
            return;
        }
        super.onHideCustomView();
        FaqItemActivityV2.A03((FaqItemActivityV2) this.A01);
    }

    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        String str;
        if (this.A00 != 0) {
            super.onShowCustomView(view, customViewCallback);
            return;
        }
        super.onShowCustomView(view, customViewCallback);
        if (view != null) {
            FaqItemActivityV2 faqItemActivityV2 = (FaqItemActivityV2) this.A01;
            if (faqItemActivityV2.A00 == null) {
                FrameLayout frameLayout = new FrameLayout(faqItemActivityV2);
                C108965cb.A12(frameLayout, -1);
                frameLayout.addView(view);
                faqItemActivityV2.A03 = frameLayout;
                faqItemActivityV2.A00 = view;
                faqItemActivityV2.A01 = customViewCallback;
                WebView webView = faqItemActivityV2.A02;
                if (webView == null) {
                    str = "faqItemWebView";
                } else {
                    webView.setVisibility(8);
                    FrameLayout frameLayout2 = faqItemActivityV2.A03;
                    if (frameLayout2 == null) {
                        str = "fullscreenContainer";
                    } else {
                        faqItemActivityV2.addContentView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
                        return;
                    }
                }
                C18070vi.A11(str);
                throw null;
            } else if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        }
    }
}
