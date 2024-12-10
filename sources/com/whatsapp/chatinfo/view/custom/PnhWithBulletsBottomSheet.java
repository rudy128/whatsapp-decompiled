package com.whatsapp.chatinfo.view.custom;

import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C29261bv;
import X.C43421zm;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.bottomsheet.WDSBottomSheetDialogFragment;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class PnhWithBulletsBottomSheet extends WDSBottomSheetDialogFragment implements View.OnClickListener {
    public ListItemWithLeftIcon A00;
    public ListItemWithLeftIcon A01;
    public ListItemWithLeftIcon A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WDSButton A06;
    public WDSButton A07;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131626455, false);
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        super.A21(bundle, view);
        this.A03 = AnonymousClass3MW.A0S(view, 2131433906);
        this.A05 = AnonymousClass3MW.A0U(view, 2131433913);
        this.A06 = AnonymousClass3MW.A0r(view, 2131433911);
        this.A07 = AnonymousClass3MW.A0r(view, 2131433912);
        this.A00 = (ListItemWithLeftIcon) view.findViewById(2131433908);
        this.A01 = (ListItemWithLeftIcon) view.findViewById(2131433909);
        this.A02 = (ListItemWithLeftIcon) view.findViewById(2131433910);
        WaTextView A0U = AnonymousClass3MW.A0U(view, 2131433907);
        A0U.setTextDirection(3);
        if (this instanceof CreatorPrivacyNewsletterBottomSheet) {
            C43421zm.A04(A0U);
            A0U.setTextSize(14.0f);
        } else {
            C29261bv.A09(A0U, 8, 24, 2, 2);
        }
        this.A04 = A0U;
        WDSButton wDSButton = this.A07;
        if (wDSButton != null) {
            wDSButton.setOnClickListener(this);
        }
        WDSButton wDSButton2 = this.A06;
        if (wDSButton2 != null) {
            wDSButton2.setOnClickListener(this);
        }
        WaTextView waTextView = this.A05;
        C18070vi.A0z(waTextView, "null cannot be cast to non-null type android.view.View");
        AnonymousClass1Y5.A0A(waTextView, true);
    }

    public void A1s() {
        super.A1s();
        WDSButton wDSButton = this.A07;
        if (wDSButton != null) {
            wDSButton.setOnClickListener((View.OnClickListener) null);
        }
        WDSButton wDSButton2 = this.A06;
        if (wDSButton2 != null) {
            wDSButton2.setOnClickListener((View.OnClickListener) null);
        }
        this.A04 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        this.A03 = null;
    }
}
