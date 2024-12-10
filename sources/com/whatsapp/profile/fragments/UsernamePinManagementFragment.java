package com.whatsapp.profile.fragments;

import X.AnonymousClass0LC;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass5P0;
import X.AnonymousClass5P1;
import X.C103565Ku;
import X.C103575Kv;
import X.C103585Kw;
import X.C103595Kx;
import X.C18100vl;
import X.C27142DWd;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinSetViewModel;

public final class UsernamePinManagementFragment extends WaComposeFragment {
    public final C18100vl A00;
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27142DWd(this, 4), 1807020616, true);

    public AnonymousClass1OS A26() {
        return this.A02;
    }

    public UsernamePinManagementFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernamePinSetViewModel.class);
        this.A01 = C99274sY.A00(new C103565Ku(this), new C103575Kv(this), new AnonymousClass5P0(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new C103585Kw(this), new C103595Kx(this), new AnonymousClass5P1(this), A152);
    }
}
