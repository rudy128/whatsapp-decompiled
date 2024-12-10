package com.whatsapp.payments.ui;

import X.AnonymousClass00H;
import android.os.Bundle;

public final class P2mLiteConfirmLegalNameBottomSheetFragment extends Hilt_P2mLiteConfirmLegalNameBottomSheetFragment {
    public AnonymousClass00H A00;
    public AnonymousClass00H A01;
    public String A02;
    public String A03;

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle A15 = A15();
        this.A02 = A15.getString("extra_payment_config_id");
        this.A03 = A15.getString("extra_order_type");
    }
}
