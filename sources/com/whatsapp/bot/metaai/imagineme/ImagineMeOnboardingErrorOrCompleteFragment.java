package com.whatsapp.bot.metaai.imagineme;

import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.AnonymousClass5MB;
import X.C101195Br;
import X.C101205Bs;
import X.C18070vi;
import X.C18100vl;
import X.C30391dr;
import X.C99274sY;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public final class ImagineMeOnboardingErrorOrCompleteFragment extends Hilt_ImagineMeOnboardingErrorOrCompleteFragment {
    public FrameLayout A00;
    public final C18100vl A01;

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2131625372, viewGroup, false);
        C18070vi.A0z(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        this.A00 = frameLayout;
        return frameLayout;
    }

    public void A21(Bundle bundle, View view) {
        C18070vi.A0d(view, 0);
        AnonymousClass3MX.A1Q(new ImagineMeOnboardingErrorOrCompleteFragment$observeViewModel$1(this, (C30391dr) null), AnonymousClass3MZ.A0G(this));
    }

    public ImagineMeOnboardingErrorOrCompleteFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ImagineMeOnboardingViewModel.class);
        this.A01 = C99274sY.A00(new C101195Br(this), new C101205Bs(this), new AnonymousClass5MB(this), A15);
    }

    public void A1s() {
        super.A1s();
        this.A00 = null;
    }
}
