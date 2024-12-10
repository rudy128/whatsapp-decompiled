package com.whatsapp.payments.ui;

import X.AnonymousClass1HF;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3Ma;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class BasePaymentIncentiveFragment extends RoundedBottomSheetDialogFragment {
    public TextEmojiLabel A00;
    public WaImageButton A01;
    public WaTextView A02;
    public WDSButton A03;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass3MX.A09(layoutInflater, viewGroup, 2131626366);
    }

    public void A21(Bundle bundle, View view) {
        super.A21(bundle, view);
        this.A02 = AnonymousClass3MW.A0T(view, 2131433547);
        this.A00 = AnonymousClass3MX.A0V(view, 2131433546);
        WDSButton A0q = AnonymousClass3MW.A0q(view, 2131433260);
        this.A03 = A0q;
        AnonymousClass3Ma.A19(A0q, this, 35);
        WaImageButton waImageButton = (WaImageButton) AnonymousClass1HF.A06(view, 2131428012);
        this.A01 = waImageButton;
        AnonymousClass3Ma.A19(waImageButton, this, 36);
    }
}
