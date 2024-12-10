package com.whatsapp.payments.ui.compliance;

import X.AZ6;
import android.os.Bundle;

public final class IndiaConfirmLegalNameBottomSheetFragment extends Hilt_IndiaConfirmLegalNameBottomSheetFragment {
    public AZ6 A00;
    public String A01;
    public String A02;
    public String A03;

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle A15 = A15();
        this.A01 = A15.getString("extra_payment_config_id");
        this.A02 = A15.getString("extra_order_type");
        this.A03 = A15.getString("extra_referral_screen");
    }
}
