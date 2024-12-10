package com.whatsapp.product.newsletterenforcements.disputesettlement;

import X.AnonymousClass11C;
import X.AnonymousClass1KB;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3Ma;
import X.AnonymousClass4CG;
import X.AnonymousClass5V2;
import X.C18070vi;
import X.C89964dJ;
import X.C91634g0;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.wds.components.textlayout.WDSTextLayout;

public final class DisputeSettlementBodyCopyFragment extends Hilt_DisputeSettlementBodyCopyFragment {
    public AnonymousClass1KB A00;
    public AnonymousClass11C A01;
    public NewsletterEnforcementSelectActionViewModel A02;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625123, viewGroup, false);
        View inflate2 = layoutInflater.inflate(2131625122, viewGroup, false);
        NewsletterEnforcementSelectActionViewModel newsletterEnforcementSelectActionViewModel = this.A02;
        if (newsletterEnforcementSelectActionViewModel == null) {
            AnonymousClass3MW.A1H();
            throw null;
        }
        C91634g0.A00(A1G(), newsletterEnforcementSelectActionViewModel.A00, new AnonymousClass5V2(inflate2, this), 8);
        WDSTextLayout wDSTextLayout = (WDSTextLayout) inflate.findViewById(2131430071);
        AnonymousClass3MY.A1J(this, wDSTextLayout, 2131892570);
        wDSTextLayout.setDescriptionText(A1H(2131892569));
        C18070vi.A0b(inflate2);
        AnonymousClass4CG.A00(inflate2, wDSTextLayout);
        AnonymousClass3MY.A1I(this, wDSTextLayout, 2131898783);
        wDSTextLayout.setPrimaryButtonClickListener(new C89964dJ(this, 18));
        return inflate;
    }

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        this.A02 = (NewsletterEnforcementSelectActionViewModel) AnonymousClass3Ma.A0I(this).A00(NewsletterEnforcementSelectActionViewModel.class);
    }

    public void A1u() {
        super.A1u();
        A1D().setTitle(2131892584);
    }
}
