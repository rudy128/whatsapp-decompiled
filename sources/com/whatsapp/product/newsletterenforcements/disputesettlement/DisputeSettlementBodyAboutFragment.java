package com.whatsapp.product.newsletterenforcements.disputesettlement;

import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CF;
import X.C18070vi;
import X.C88494Zy;
import X.C89964dJ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.base.WaFragment;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class DisputeSettlementBodyAboutFragment extends WaFragment {
    public NewsletterEnforcementSelectActionViewModel A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625123, viewGroup, false);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) inflate.findViewById(2131430071);
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131892565);
        wDSTextLayout.setDescriptionText(A1H(2131892564));
        AnonymousClass3MY.A1I(this, wDSTextLayout, 2131887451);
        wDSTextLayout.setPrimaryButtonClickListener(new C89964dJ(this, 17));
        C88494Zy[] r6 = new C88494Zy[3];
        C88494Zy.A01(AnonymousClass3MY.A0n(this, 2131892581), A1H(2131892580), r6, 2131233346, 0);
        r6[1] = new C88494Zy(AnonymousClass3MY.A0n(this, 2131892574), A1H(2131892573), 2131233275);
        AnonymousClass4CF.A00(wDSTextLayout, C18070vi.A0O(new C88494Zy(AnonymousClass3MY.A0n(this, 2131892583), A1H(2131892582), 2131233311), r6, 2));
        return inflate;
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        this.A00 = (NewsletterEnforcementSelectActionViewModel) AnonymousClass3Ma.A0I(this).A00(NewsletterEnforcementSelectActionViewModel.class);
    }

    public void A1u() {
        super.A1u();
        A1D().setTitle(2131892584);
    }
}
