package com.whatsapp.payments.ui;

import X.AnonymousClass1M9;
import X.AnonymousClass1QJ;
import X.AnonymousClass3MW;
import X.AnonymousClass7AS;
import X.C003401n;
import X.C145917Nc;
import X.C1583380h;
import X.C18070vi;
import X.C21132Af0;
import X.C21432Ajz;
import X.C75243eE;
import android.os.Build;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.BrazilSendPixKeyViewModel;

public final class BrazilPaymentPixSendKeyActivity extends C75243eE {
    public AnonymousClass1M9 A00;
    public UserJid A01;
    public AnonymousClass1QJ A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public BrazilSendPixKeyViewModel A09;

    public static final void A03(BrazilPaymentPixSendKeyActivity brazilPaymentPixSendKeyActivity) {
        brazilPaymentPixSendKeyActivity.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            brazilPaymentPixSendKeyActivity.overrideActivityTransition(1, 0, 0);
        } else {
            brazilPaymentPixSendKeyActivity.overridePendingTransition(0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0E();
        }
        setContentView(2131626470);
        this.A09 = (BrazilSendPixKeyViewModel) AnonymousClass3MW.A0N(this).A00(BrazilSendPixKeyViewModel.class);
        this.A01 = UserJid.Companion.A04(getIntent().getStringExtra("extra_receiver_jid"));
        String stringExtra = getIntent().getStringExtra("referral_screen");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.A08 = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("previous_screen");
        if (stringExtra2 == null) {
            stringExtra2 = str;
        }
        this.A07 = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("extra_pix_info_key_credential_id");
        if (stringExtra3 == null) {
            stringExtra3 = str;
        }
        this.A03 = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("pix_info_key_type");
        if (stringExtra4 == null) {
            stringExtra4 = str;
        }
        this.A05 = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra("pix_info_key_value");
        if (stringExtra5 == null) {
            stringExtra5 = str;
        }
        this.A06 = stringExtra5;
        String stringExtra6 = getIntent().getStringExtra("pix_info_display_name");
        if (stringExtra6 != null) {
            str = stringExtra6;
        }
        this.A04 = str;
        BrazilSendPixKeyViewModel brazilSendPixKeyViewModel = this.A09;
        if (brazilSendPixKeyViewModel == null) {
            C18070vi.A11("brazilSendPixKeyViewModel");
            throw null;
        }
        AnonymousClass7AS.A00(this, brazilSendPixKeyViewModel.A00, new C1583380h(this), 5);
        C21132Af0 af0 = new C21132Af0();
        this.A05.CGF(new C21432Ajz(this, af0, 10));
        af0.A09(new C145917Nc(this, 22));
    }

    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }
}
