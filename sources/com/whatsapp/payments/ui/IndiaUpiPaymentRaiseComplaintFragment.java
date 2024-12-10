package com.whatsapp.payments.ui;

import X.AFP;
import X.AZ6;
import X.AnonymousClass1HF;
import X.AnonymousClass3MX;
import X.AnonymousClass8BS;
import X.B5Z;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class IndiaUpiPaymentRaiseComplaintFragment extends Hilt_IndiaUpiPaymentRaiseComplaintFragment {
    public AZ6 A00;
    public B5Z A01;

    public void A1K() {
        super.A1K();
        this.A01 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625660);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        AFP.A00(AnonymousClass1HF.A06(view, 2131429314), this, 15);
        AFP.A00(AnonymousClass8BS.A06(view), this, 16);
        this.A00.BiL((Integer) null, "raise_complaint_prompt", (String) null, 0);
    }
}
