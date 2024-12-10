package com.whatsapp.payments.ui;

import X.AFQ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.C17880vN;
import X.C17960vV;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class PaymentTypePickerFragment extends Hilt_PaymentTypePickerFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626429);
    }

    public void A21(Bundle bundle, View view) {
        String string = A15().getString("arg_type", "goodAndServices");
        C17960vV.A07(string);
        C17880vN.A0E(view, 2131428634).setText(2131887599);
        C17880vN.A0E(view, 2131428633).setText(AnonymousClass3MY.A0n(this, 2131887384));
        C17880vN.A0E(view, 2131435207).setText(2131895765);
        C17880vN.A0E(view, 2131435206).setText(AnonymousClass3MY.A0n(this, 2131887404));
        boolean equals = string.equals("goodAndServices");
        View findViewById = view.findViewById(2131428631);
        if (equals) {
            findViewById.setVisibility(0);
            AnonymousClass3MY.A1B(view, 2131435204, 4);
        } else {
            findViewById.setVisibility(4);
            AnonymousClass3MY.A1B(view, 2131435204, 0);
        }
        view.findViewById(2131435205).setOnClickListener(new AFQ(this, 24));
        view.findViewById(2131428632).setOnClickListener(new AFQ(this, 25));
        view.findViewById(2131428012).setOnClickListener(new AFQ(this, 26));
    }
}
