package com.whatsapp.payments.ui;

import X.AFQ;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass8BW;
import X.C17880vN;
import X.C17960vV;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PaymentRailPickerFragment extends Hilt_PaymentRailPickerFragment {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.payments.ui.Hilt_PaymentRailPickerFragment, com.whatsapp.payments.ui.PaymentRailPickerFragment, androidx.fragment.app.Fragment] */
    public static PaymentRailPickerFragment A00(int i, boolean z) {
        String str;
        ? hilt_PaymentRailPickerFragment = new Hilt_PaymentRailPickerFragment();
        Bundle A0D = C17880vN.A0D();
        if (i != 0) {
            str = "debit";
        } else {
            str = "credit";
        }
        A0D.putString("arg_type", str);
        A0D.putBoolean("arg_is_p2p", z);
        hilt_PaymentRailPickerFragment.A1R(A0D);
        return hilt_PaymentRailPickerFragment;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626394);
    }

    public void A21(Bundle bundle, View view) {
        Bundle A15 = A15();
        String string = A15.getString("arg_type", "credit");
        C17960vV.A07(string);
        boolean equals = string.equals("credit");
        View findViewById = view.findViewById(2131429719);
        if (equals) {
            findViewById.setVisibility(0);
            AnonymousClass3MY.A1B(view, 2131429822, 4);
        } else {
            findViewById.setVisibility(4);
            AnonymousClass3MY.A1B(view, 2131429822, 0);
        }
        View findViewById2 = view.findViewById(2131433632);
        C17960vV.A05(findViewById2);
        AFQ.A00(findViewById2, this, 17);
        if (A15.getBoolean("arg_is_p2p")) {
            findViewById2.setEnabled(false);
            View findViewById3 = findViewById2.findViewById(2131433634);
            C17960vV.A05(findViewById3);
            Resources A09 = AnonymousClass3MZ.A09(this);
            AnonymousClass8BW.A0z(A1n(), A09, (TextView) findViewById3, 2130969369, 2131100372);
            View findViewById4 = findViewById2.findViewById(2131433633);
            C17960vV.A05(findViewById4);
            findViewById4.setVisibility(0);
        }
        AFQ.A00(view.findViewById(2131433635), this, 18);
        AFQ.A00(view.findViewById(2131428012), this, 19);
    }
}
