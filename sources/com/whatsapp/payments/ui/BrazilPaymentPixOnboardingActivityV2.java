package com.whatsapp.payments.ui;

import X.AnonymousClass1M9;
import X.AnonymousClass1QJ;
import X.AnonymousClass1QO;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BS;
import X.AnonymousClass8BX;
import X.AnonymousClass8eD;
import X.C17880vN;
import X.C18070vi;
import X.C194929sW;
import X.C20339AGv;
import X.C22231Azl;
import X.C22232Azm;
import X.C34001jj;
import X.C72453Mb;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;

public final class BrazilPaymentPixOnboardingActivityV2 extends AnonymousClass8eD {
    public AnonymousClass1M9 A00;
    public UserJid A01;
    public AnonymousClass1QJ A02;
    public AnonymousClass1QO A03;
    public BrazilAddPixKeyViewModel A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        this.A08 = AnonymousClass8BS.A05(this, 2131626470).getStringExtra("pix_info_key_type");
        this.A09 = getIntent().getStringExtra("pix_info_key_value");
        this.A07 = getIntent().getStringExtra("pix_info_display_name");
        this.A06 = getIntent().getStringExtra("extra_pix_info_key_credential_id");
        this.A0C = AnonymousClass3MY.A1a(getIntent(), "extra_is_edit_mode_enabled");
        this.A01 = UserJid.Companion.A04(getIntent().getStringExtra("extra_receiver_jid"));
        this.A0B = getIntent().getStringExtra("referral_screen");
        this.A0A = getIntent().getStringExtra("previous_screen");
        this.A05 = getIntent().getStringExtra("campaign_id");
        BrazilAddPixKeyViewModel A0L = AnonymousClass8BX.A0L(this);
        this.A04 = A0L;
        if (A0L == null) {
            C18070vi.A11("brazilAddPixKeyViewModel");
            throw null;
        }
        C20339AGv.A00(this, A0L.A00, new C22232Azm(this), 36);
        Boolean valueOf = Boolean.valueOf(this.A0C);
        C194929sW r7 = null;
        if (C18070vi.A19(valueOf, false)) {
            BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A04;
            if (brazilAddPixKeyViewModel == null) {
                C18070vi.A11("brazilAddPixKeyViewModel");
                throw null;
            }
            C20339AGv.A00(this, brazilAddPixKeyViewModel.A00, new C22231Azl(this), 36);
        }
        String str4 = this.A06;
        if (!(str4 == null || (str = this.A08) == null || (str2 = this.A09) == null || (str3 = this.A07) == null)) {
            r7 = new C194929sW(str, str2, str3, str4);
        }
        C34001jj A0H = AnonymousClass3Ma.A0H(this);
        String str5 = this.A0B;
        String str6 = this.A0A;
        String str7 = this.A05;
        BrazilAddPixFragment brazilAddPixFragment = new BrazilAddPixFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("extra_is_edit_mode_enabled", C72453Mb.A1Y(valueOf));
        if (r7 != null) {
            A0D.putString("extra_pix_info_key_credential_id", r7.A00);
            A0D.putString("pix_info_key_type", r7.A02);
            A0D.putString("pix_info_display_name", r7.A01);
            A0D.putString("pix_info_key_value", r7.A03);
        }
        A0D.putString("referral_screen", str5);
        A0D.putString("previous_screen", str6);
        A0D.putString("campaign_id", str7);
        brazilAddPixFragment.A1R(A0D);
        A0H.A09(brazilAddPixFragment, 2131429504);
        A0H.A00(false);
    }
}
