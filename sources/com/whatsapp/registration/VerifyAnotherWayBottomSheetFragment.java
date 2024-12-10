package com.whatsapp.registration;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MZ;
import X.C72463Mc;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.wds.components.button.WDSButton;

public class VerifyAnotherWayBottomSheetFragment extends Hilt_VerifyAnotherWayBottomSheetFragment {
    public WDSButton A00;
    public WDSButton A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(2131626728, viewGroup);
        ViewGroup A0C = AnonymousClass3MW.A0C(inflate, 2131434595);
        this.A01 = (WDSButton) layoutInflater.inflate(2131626729, A0C, false);
        this.A00 = (WDSButton) layoutInflater.inflate(2131626730, A0C, false);
        A0C.addView(this.A01);
        A0C.addView(this.A00);
        return inflate;
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        AnonymousClass3MZ.A1L(AnonymousClass1HF.A06(view, 2131434590), this, 4);
        C72463Mc.A13(view, 2131434592);
        TextView A0J = AnonymousClass3MW.A0J(view, 2131434594);
        TextView A0J2 = AnonymousClass3MW.A0J(view, 2131434591);
        A0J.setText(2131897759);
        A0J2.setText(2131897758);
        this.A01.setText(2131897802);
        this.A01.setIcon(2131232243);
        AnonymousClass3MZ.A1L(this.A01, this, 3);
        this.A00.setText(2131897815);
        this.A00.setIcon(2131231742);
        AnonymousClass3MZ.A1L(this.A00, this, 2);
    }
}
