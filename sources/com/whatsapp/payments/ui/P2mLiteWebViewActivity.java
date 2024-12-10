package com.whatsapp.payments.ui;

import X.AGD;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1D6;
import X.AnonymousClass1D7;
import X.AnonymousClass1K1;
import X.AnonymousClass8BV;
import X.BD4;
import X.C000200d;
import X.C114925sD;
import X.C137116uw;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C189549jQ;
import X.C196449v5;
import X.C20129A8p;
import X.C20130A8q;
import X.C22579BDz;
import X.C63662tU;
import X.C63932tv;
import X.C72463Mc;
import android.content.Intent;
import android.os.Bundle;
import java.util.LinkedHashMap;

public final class P2mLiteWebViewActivity extends PaymentWebViewActivity {
    public C189549jQ A00;
    public AnonymousClass00H A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;

    public void A4f(int i, Intent intent) {
        C20129A8p a8p;
        C189549jQ r1 = this.A00;
        if (r1 != null) {
            String str = this.A03;
            C22579BDz bDz = null;
            if (str == null) {
                C18070vi.A11("fdsManagerId");
                throw null;
            }
            C20130A8q A002 = r1.A00(str);
            if (!(A002 == null || (a8p = A002.A00) == null)) {
                bDz = (C22579BDz) a8p.A0A("native_p2m_lite_hpp_checkout");
            }
            AnonymousClass1D6[] r2 = new AnonymousClass1D6[3];
            C72463Mc.A1H("result_code", Integer.valueOf(i), r2);
            AnonymousClass1D6.A03("result_data", intent, r2, 1);
            C72463Mc.A1I("last_screen", "in_app_browser_checkout", r2);
            LinkedHashMap A0B = AnonymousClass1D7.A0B(r2);
            if (bDz != null) {
                bDz.BLG(A0B);
            }
            finish();
            return;
        }
        C18070vi.A11("phoenixManagerRegistry");
        throw null;
    }

    public void A4l() {
        this.A07 = true;
        onBackPressed();
    }

    public void A2y() {
        if (!this.A06) {
            this.A06 = true;
            AnonymousClass1K1 A002 = C137116uw.A00(this);
            AnonymousClass10E r2 = A002.AAQ;
            C63932tv.A02(r2, this);
            AnonymousClass10G r1 = r2.A00;
            C63932tv.A01(r2, r1, this);
            C63662tU.A00(r2, r1, this, r1.A5A);
            C114925sD.A03(A002, r2, r1, this);
            this.A01 = C000200d.A00(r1.AEK);
            this.A00 = AnonymousClass8BV.A0H(r2);
        }
    }

    public boolean A4j() {
        return !C18020vd.A05(C18040vf.A02, this.A0E, 2718);
    }

    public P2mLiteWebViewActivity(int i) {
        this.A06 = false;
        AGD.A00(this, 40);
    }

    public void onBackPressed() {
        super.onBackPressed();
        int i = 1;
        if (this.A07) {
            i = 3;
        }
        AnonymousClass00H r0 = this.A01;
        if (r0 != null) {
            ((BD4) r0.get()).BiJ(C196449v5.A00(), Integer.valueOf(i), "in_app_browser_checkout", this.A05, this.A04, this.A02, 1, true, true, false);
            return;
        }
        C18070vi.A11("p2mLiteEventLogger");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A05 = AnonymousClass8BV.A0o(this);
        String stringExtra = getIntent().getStringExtra("extra_fds_manager_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.A03 = stringExtra;
        this.A04 = getIntent().getStringExtra("order_type");
        this.A02 = getIntent().getStringExtra("config_id");
    }

    public P2mLiteWebViewActivity() {
        this(0);
    }
}
