package com.whatsapp.payments.ui;

import X.AFQ;
import X.AFT;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass18K;
import X.AnonymousClass1QS;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BR;
import X.AnonymousClass8BV;
import X.AnonymousClass8BX;
import X.C171858sO;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C20031A4a;
import X.C20112A7u;
import X.C36751oP;
import X.C63572tK;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;

public final class PaymentMerchantUpsellEducationBottomSheet extends Hilt_PaymentMerchantUpsellEducationBottomSheet {
    public int A00 = -1;
    public C36751oP A01;
    public C18030ve A02;
    public AnonymousClass18K A03;
    public AnonymousClass1QS A04;
    public C20031A4a A05;
    public WaImageView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WDSButton A09;
    public WDSButton A0A;
    public String A0B;

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        Context A14 = A14();
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("payment_account_type", -1);
            this.A0B = AnonymousClass8BR.A0y(bundle2);
        }
        A00(this, (Integer) null, 0, this.A00);
        this.A06 = AnonymousClass3MW.A0R(view, 2131435141);
        this.A07 = AnonymousClass3MW.A0T(view, 2131435140);
        this.A08 = AnonymousClass3MW.A0T(view, 2131435137);
        this.A09 = AnonymousClass3MW.A0q(view, 2131432000);
        this.A0A = AnonymousClass3MW.A0q(view, 2131433187);
        int ceil = (int) Math.ceil((double) (AnonymousClass3MZ.A09(this).getDisplayMetrics().density * 10.0f));
        int i = this.A00;
        if (i == 0) {
            WaImageView waImageView = this.A06;
            if (waImageView != null) {
                waImageView.setImageResource(2131231838);
            }
            WaTextView waTextView = this.A07;
            if (waTextView != null) {
                waTextView.setText(2131895663);
            }
            WaTextView waTextView2 = this.A08;
            if (waTextView2 != null) {
                waTextView2.setText(2131895664);
            }
            WDSButton wDSButton = this.A09;
            if (wDSButton != null) {
                wDSButton.setText(2131891631);
            }
            WaImageView waImageView2 = this.A06;
            if (waImageView2 != null) {
                waImageView2.setPadding(ceil, ceil, ceil, ceil);
            }
        } else if (i != 6) {
            Log.e("Unsupported action");
        } else {
            WaImageView waImageView3 = this.A06;
            if (waImageView3 != null) {
                waImageView3.setImageResource(2131232821);
            }
            WaImageView waImageView4 = this.A06;
            if (waImageView4 != null) {
                waImageView4.setPadding(ceil, ceil, ceil, ceil);
            }
            WaTextView waTextView3 = this.A07;
            if (waTextView3 != null) {
                waTextView3.setText(2131895666);
            }
            WaTextView waTextView4 = this.A08;
            if (waTextView4 != null) {
                waTextView4.setText(2131895667);
            }
            WDSButton wDSButton2 = this.A09;
            if (wDSButton2 != null) {
                wDSButton2.setText(2131891633);
            }
        }
        C36751oP r0 = this.A01;
        if (r0 != null) {
            int i2 = this.A00;
            AnonymousClass00H r5 = r0.A00.A00;
            C17880vN.A1C(AnonymousClass8BV.A06(r5), AnonymousClass001.A1I("smb_merchant_payment_account_nag_count_", AnonymousClass000.A10(), i2), C17880vN.A0B(r5).getInt(AnonymousClass001.A1I("smb_merchant_payment_account_nag_count_", AnonymousClass000.A10(), i2), 0) + 1);
            WDSButton wDSButton3 = this.A09;
            if (wDSButton3 != null) {
                AFT.A00(wDSButton3, this, A14, 21);
            }
            WDSButton wDSButton4 = this.A0A;
            if (wDSButton4 != null) {
                AFQ.A00(wDSButton4, this, 14);
                return;
            }
            return;
        }
        C18070vi.A11("merchantEducationManager");
        throw null;
    }

    public static final void A00(PaymentMerchantUpsellEducationBottomSheet paymentMerchantUpsellEducationBottomSheet, Integer num, int i, int i2) {
        String str;
        String str2;
        C18030ve r2 = paymentMerchantUpsellEducationBottomSheet.A02;
        if (r2 == null) {
            str = "abProps";
        } else if (C18020vd.A05(C18040vf.A02, r2, 7163)) {
            C20112A7u A022 = C20112A7u.A02();
            if (i2 == 0) {
                str2 = "psp";
                A022.A07("payment_account", str2);
            } else if (i2 != 6) {
                Log.e("Unsupported action");
            } else {
                str2 = "pix";
                A022.A07("payment_account", str2);
            }
            C171858sO r1 = new C171858sO();
            C20031A4a a4a = paymentMerchantUpsellEducationBottomSheet.A05;
            if (a4a != null) {
                C20031A4a.A00(r1, a4a);
                C63572tK r0 = C63572tK.A0E;
                r1.A0R = "BR";
                AnonymousClass8BR.A1H(r1, A022);
                AnonymousClass8BX.A19(r1, num, "merchant_payment_upsell_prompt", i);
                String str3 = paymentMerchantUpsellEducationBottomSheet.A0B;
                if (str3 != null) {
                    r1.A0a = str3;
                }
                AnonymousClass18K r02 = paymentMerchantUpsellEducationBottomSheet.A03;
                if (r02 != null) {
                    r02.CC7(r1);
                    return;
                }
                str = "wamRuntime";
            } else {
                str = "paymentFieldStats";
            }
        } else {
            return;
        }
        C18070vi.A11(str);
        throw null;
    }

    public void A1s() {
        super.A1s();
        this.A06 = null;
        this.A0A = null;
        this.A08 = null;
        this.A09 = null;
        this.A07 = null;
    }

    public int A2F() {
        return 2131626020;
    }
}
