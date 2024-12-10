package com.whatsapp.profile.fragments;

import X.AnonymousClass0LC;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C103455Kj;
import X.C103465Kk;
import X.C104625Ow;
import X.C18100vl;
import X.C27142DWd;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeBottomSheetFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;

public final class UsernameEditBottomSheetFragment extends WaComposeBottomSheetFragment {
    public final C18100vl A00;
    public final AnonymousClass1OS A01 = AnonymousClass0LC.A01(new C27142DWd(this, 2), -1988848284, true);

    public AnonymousClass1OS A2K() {
        return this.A01;
    }

    public UsernameEditBottomSheetFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new C103455Kj(this), new C103465Kk(this), new C104625Ow(this), A15);
    }
}
