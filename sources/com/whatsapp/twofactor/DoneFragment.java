package com.whatsapp.twofactor;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DoneFragment extends Hilt_DoneFragment {
    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131625391);
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A15().getString("primaryCTA", "DONE");
    }

    public void A21(Bundle bundle, View view) {
        TextView A0J = AnonymousClass3MW.A0J(view, 2131430125);
        A0J.setText(2131889794);
        AnonymousClass3Ma.A1E(A0J, this, 6);
        TwoFactorAuthActivity twoFactorAuthActivity = (TwoFactorAuthActivity) A1B();
        twoFactorAuthActivity.A4b(view, twoFactorAuthActivity.A08.length);
    }
}
