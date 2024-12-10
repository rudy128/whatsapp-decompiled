package com.whatsapp.payments.ui;

import X.AnonymousClass1QJ;
import X.AnonymousClass1QO;
import X.AnonymousClass8BS;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.AnonymousClass9RG;
import X.C003401n;
import X.C166858eC;
import X.C18070vi;
import X.C194929sW;
import X.C19880zA;
import X.C20098A7b;
import X.C20339AGv;
import X.C22229Azj;
import X.C22230Azk;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;

public final class BrazilPaymentPixOnboardingActivity extends C166858eC {
    public C19880zA A00;
    public UserJid A01;
    public AnonymousClass1QJ A02;
    public AnonymousClass1QO A03;
    public BrazilAddPixKeyViewModel A04;
    public String A05;
    public String A06;
    public String A07;

    public static final void A03(BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity) {
        brazilPaymentPixOnboardingActivity.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            brazilPaymentPixOnboardingActivity.overrideActivityTransition(1, 0, 0);
        } else {
            brazilPaymentPixOnboardingActivity.overridePendingTransition(0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0E();
        }
        AnonymousClass8BS.A05(this, 2131626470).getStringExtra("pix_info_key_type");
        getIntent().getStringExtra("pix_info_key_value");
        getIntent().getStringExtra("pix_info_display_name");
        this.A01 = UserJid.Companion.A04(getIntent().getStringExtra("extra_receiver_jid"));
        this.A07 = AnonymousClass8BV.A0o(this);
        this.A06 = getIntent().getStringExtra("previous_screen");
        this.A05 = getIntent().getStringExtra("campaign_id");
        BrazilAddPixKeyViewModel A0L = AnonymousClass8BX.A0L(this);
        this.A04 = A0L;
        if (A0L != null) {
            C20339AGv.A00(this, A0L.A00, new C22230Azk(this), 35);
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A04;
            if (brazilAddPixKeyViewModel != null) {
                C20339AGv.A00(this, brazilAddPixKeyViewModel.A00, new C22229Azj(this), 35);
                BrazilPaymentMethodAddPixBottomSheet A002 = AnonymousClass9RG.A00((C194929sW) null, false, this.A07, this.A06, this.A05);
                A002.A2D(false);
                C20098A7b.A03(A002, getSupportFragmentManager(), "PaymentMethodAddPixBottomSheet");
                return;
            }
        }
        C18070vi.A11("brazilAddPixKeyViewModel");
        throw null;
    }

    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        A03(this);
        return true;
    }
}
