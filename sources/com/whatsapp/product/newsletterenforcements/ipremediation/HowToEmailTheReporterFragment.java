package com.whatsapp.product.newsletterenforcements.ipremediation;

import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C103335Jx;
import X.C103345Jy;
import X.C104445Oe;
import X.C18070vi;
import X.C18100vl;
import X.C89964dJ;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.base.WaFragment;
import com.whatsapp.product.newsletterenforcements.disputesettlement.NewsletterEnforcementSelectActionViewModel;

public final class HowToEmailTheReporterFragment extends WaFragment {
    public final C18100vl A00;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625173, viewGroup, false);
        C89964dJ.A00(inflate.findViewById(2131431111), this, 23);
        return inflate;
    }

    public HowToEmailTheReporterFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(NewsletterEnforcementSelectActionViewModel.class);
        this.A00 = C99274sY.A00(new C103335Jx(this), new C103345Jy(this), new C104445Oe(this), A15);
    }

    public void A1u() {
        super.A1u();
        A1D().setTitle(2131892589);
    }
}
