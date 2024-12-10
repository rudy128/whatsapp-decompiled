package com.whatsapp.inappsupport.ui;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass3MY;
import X.AnonymousClass797;
import X.C108955ca;
import X.C109005cf;
import X.C110085eu;
import X.C110135ez;
import X.C1403871f;
import X.C1423279a;
import X.C18070vi;
import X.C19620yd;
import X.C89954dI;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;

public final class FaqItemActivityV2 extends AnonymousClass1FY {
    public View A00;
    public WebChromeClient.CustomViewCallback A01;
    public WebView A02;
    public FrameLayout A03;
    public C1403871f A04;
    public String A05;
    public boolean A06;

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C1403871f r0 = this.A04;
        if (r0 != null) {
            r0.A02();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        String stringExtra = getIntent().getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        if (stringExtra == null || stringExtra.length() == 0) {
            return super.onCreateOptionsMenu(menu);
        }
        this.A05 = C108955ca.A0r(this, "com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        menu.add(0, 2131432605, 0, getString(2131899033)).setShowAsAction(0);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int A012 = AnonymousClass3MY.A01(menuItem, 0);
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (A012 != 2131432605) {
            return false;
        } else {
            String str = this.A05;
            str.getClass();
            startActivity(AnonymousClass3MY.A07(Uri.parse(str)));
            return true;
        }
    }

    public static final void A03(FaqItemActivityV2 faqItemActivityV2) {
        View view = faqItemActivityV2.A00;
        if (view != null) {
            FrameLayout frameLayout = faqItemActivityV2.A03;
            if (frameLayout == null) {
                C18070vi.A11("fullscreenContainer");
                throw null;
            }
            frameLayout.removeView(view);
            faqItemActivityV2.A00 = null;
            WebChromeClient.CustomViewCallback customViewCallback = faqItemActivityV2.A01;
            if (customViewCallback != null) {
                customViewCallback.onCustomViewHidden();
            }
        }
        WebView webView = faqItemActivityV2.A02;
        if (webView == null) {
            C18070vi.A11("faqItemWebView");
            throw null;
        } else {
            webView.setVisibility(0);
        }
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
        }
    }

    public void onBackPressed() {
        if (this.A00 != null) {
            A03(this);
        } else {
            super.onBackPressed();
        }
    }

    public FaqItemActivityV2(int i) {
        this.A06 = false;
        C1423279a.A00(this, 5);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String A0F = C18070vi.A0F(this, 2131899401);
        setTitle(A0F);
        setContentView(2131625304);
        Toolbar toolbar = (Toolbar) AnonymousClass3MY.A0C(this, 2131436270);
        C109005cf.A0O(this, toolbar, this.A00);
        toolbar.setTitle((CharSequence) A0F);
        toolbar.setNavigationOnClickListener(new C89954dI(this, 3));
        setSupportActionBar(toolbar);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.html_content");
        String stringExtra2 = intent.getStringExtra("com.whatsapp.inappsupport.ui.FaqItemActivityV2.url");
        WebView webView = (WebView) AnonymousClass3MY.A0H(this, 2131430793);
        this.A02 = webView;
        if (stringExtra != null) {
            if (webView != null) {
                webView.loadDataWithBaseURL(stringExtra2, stringExtra, "text/html", C19620yd.A0A, (String) null);
            }
            C18070vi.A11("faqItemWebView");
            throw null;
        }
        WebView webView2 = this.A02;
        if (webView2 != null) {
            webView2.getSettings().setJavaScriptEnabled(true);
            WebView webView3 = this.A02;
            if (webView3 != null) {
                webView3.setWebChromeClient(new C110085eu(this, 0));
                View findViewById = findViewById(2131433184);
                findViewById.getViewTreeObserver().addOnPreDrawListener(new AnonymousClass797(findViewById, this, 1));
                WebView webView4 = this.A02;
                if (webView4 != null) {
                    this.A04 = C1403871f.A00(this, webView4, findViewById);
                    WebView webView5 = this.A02;
                    if (webView5 != null) {
                        webView5.setWebViewClient(new C110135ez(this));
                        findViewById(2131433183).setOnClickListener(new C89954dI(this, 4));
                        return;
                    }
                }
            }
        }
        C18070vi.A11("faqItemWebView");
        throw null;
    }

    public FaqItemActivityV2() {
        this(0);
    }
}
