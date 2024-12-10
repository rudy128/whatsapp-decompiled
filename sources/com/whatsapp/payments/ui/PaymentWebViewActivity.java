package com.whatsapp.payments.ui;

import X.AFQ;
import X.AnonymousClass1YF;
import X.AnonymousClass4aX;
import X.AnonymousClass6Q0;
import X.C108955ca;
import X.C108985cd;
import X.C130516jY;
import X.C17880vN;
import X.C18070vi;
import X.C200410p;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebStorage;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.whatsapp.WaImageView;
import java.util.Set;

public class PaymentWebViewActivity extends AnonymousClass6Q0 {
    public int A00 = -1;
    public String A01;
    public Set A02;

    public void A4h(TextView textView, TextView textView2, Toolbar toolbar, AppBarLayout appBarLayout, WaImageView waImageView) {
        C18070vi.A0d(toolbar, 1);
        toolbar.setNavigationIcon(AnonymousClass4aX.A02(this, 2131231814, 2131101222));
        toolbar.setNavigationOnClickListener(new AFQ(this, 27));
    }

    public boolean BeT(String str) {
        int i = this.A00;
        if (i == 0) {
            return this.A02.contains(str);
        }
        if (i == 1) {
            for (String A0I : C108955ca.A1b(C108985cd.A0s(C108955ca.A0v(this.A0E, 4642), 1))) {
                if (C18070vi.A18(str, AnonymousClass1YF.A0I(A0I))) {
                    return true;
                }
            }
        }
        return false;
    }

    public PaymentWebViewActivity() {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "android-app";
        A1Z[1] = "app";
        this.A02 = C200410p.A0S(A1Z);
    }

    public void A4c() {
        super.A4c();
        CookieManager.getInstance().removeAllCookies((ValueCallback) null);
        WebStorage.getInstance().deleteAllData();
    }

    public boolean A4k(String str) {
        String str2;
        String str3;
        boolean A4k = super.A4k(str);
        if (A4k || str == null || !(!AnonymousClass1YF.A0T(str)) || (str2 = this.A01) == null || !(!AnonymousClass1YF.A0T(str2)) || (str3 = this.A01) == null || !AnonymousClass1YF.A0Y(str, str3, false)) {
            return A4k;
        }
        Intent A0A = C17880vN.A0A();
        A0A.putExtra("webview_callback", str);
        A4f(0, A0A);
        return true;
    }

    public void A4l() {
        A4c();
    }

    public C130516jY CCt() {
        C130516jY CCt = super.CCt();
        CCt.A00 = 1;
        return CCt;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A01 = getIntent().getStringExtra("webview_cancel_callback");
        this.A00 = getIntent().getIntExtra("deep_link_type_support", -1);
    }
}
