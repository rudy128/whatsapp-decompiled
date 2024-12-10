package com.whatsapp.support.faq;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass18O;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1LU;
import X.AnonymousClass1QS;
import X.AnonymousClass3MY;
import X.AnonymousClass78P;
import X.AnonymousClass7RS;
import X.C003401n;
import X.C108955ca;
import X.C108975cc;
import X.C109005cf;
import X.C109695dr;
import X.C110165f2;
import X.C134036pu;
import X.C1403871f;
import X.C1423379b;
import X.C18070vi;
import X.C19620yd;
import X.C197289wS;
import X.C72453Mb;
import X.C72473Md;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public final class FaqItemActivity extends AnonymousClass1FY {
    public long A00;
    public long A01;
    public long A02;
    public C134036pu A03;
    public AnonymousClass1LU A04;
    public AnonymousClass1QS A05;
    public C1403871f A06;
    public boolean A07;
    public final WebViewClient A08;

    public void onConfigurationChanged(Configuration configuration) {
        C18070vi.A0d(configuration, 0);
        super.onConfigurationChanged(configuration);
        C1403871f r0 = this.A06;
        if (r0 != null) {
            r0.A02();
        }
    }

    public void A2y() {
        if (!this.A07) {
            this.A07 = true;
            AnonymousClass10E A0A = C109005cf.A0A(C108955ca.A0K(this), this);
            AnonymousClass1FB.A0M(A0A, this);
            AnonymousClass10G r1 = A0A.A00;
            C109005cf.A0c(A0A, r1, r1, this);
            C109005cf.A0e(A0A, r1, this, r1.A5A);
            this.A03 = (C134036pu) r1.AB8.get();
            this.A05 = (AnonymousClass1QS) A0A.A8J.get();
            this.A04 = AnonymousClass3MY.A0Z(A0A);
        }
    }

    public FaqItemActivity(int i) {
        this.A07 = false;
        C1423379b.A00(this, 3);
    }

    public void onBackPressed() {
        C109005cf.A0n(this);
        super.onBackPressed();
        overridePendingTransition(2130772057, 2130772062);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(2131895488);
        boolean A1S = C72473Md.A1S(this);
        setContentView(2131625303);
        String stringExtra = getIntent().getStringExtra("title");
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0S(stringExtra);
        }
        String stringExtra2 = getIntent().getStringExtra("content");
        String stringExtra3 = getIntent().getStringExtra("url");
        WebView webView = (WebView) findViewById(2131437045);
        webView.setWebViewClient(this.A08);
        if (stringExtra2 != null) {
            webView.loadDataWithBaseURL(stringExtra3, stringExtra2, "text/html", C19620yd.A0A, (String) null);
        }
        webView.getSettings().setJavaScriptEnabled(A1S);
        this.A00 = C108975cc.A05(getIntent(), "article_id");
        this.A02 = 0;
        String stringExtra4 = getIntent().getStringExtra("contact_us_context");
        if (!getIntent().getBooleanExtra("show_contact_support_button", false)) {
            return;
        }
        if (!C197289wS.A00(stringExtra4) || !this.A06.A09(AnonymousClass18O.A0S)) {
            String A0r = C108955ca.A0r(this, "contact_us_context");
            View findViewById = findViewById(2131428324);
            AnonymousClass7RS r4 = new AnonymousClass7RS(20, A0r, this);
            C18070vi.A0b(findViewById);
            this.A06 = C1403871f.A00(this, webView, findViewById);
            String A0F = C18070vi.A0F(this, 2131889540);
            C1403871f.A01(this, new C109695dr(r4, 4), (TextView) AnonymousClass3MY.A0H(this, 2131430118), A0F, 2132083281);
            C1403871f r0 = this.A06;
            if (r0 != null) {
                AnonymousClass78P.A00(r0.A01, r4, 42);
            }
            findViewById.setVisibility(0);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C72453Mb.A0B(menuItem) != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        overridePendingTransition(2130772057, 2130772062);
        return true;
    }

    public void onPause() {
        super.onPause();
        this.A02 += System.currentTimeMillis() - this.A01;
        this.A01 = System.currentTimeMillis();
    }

    public void onResume() {
        super.onResume();
        this.A01 = System.currentTimeMillis();
    }

    public void onStop() {
        super.onStop();
        C109005cf.A0n(this);
    }

    public FaqItemActivity() {
        this(0);
        this.A08 = new C110165f2(this);
    }
}
