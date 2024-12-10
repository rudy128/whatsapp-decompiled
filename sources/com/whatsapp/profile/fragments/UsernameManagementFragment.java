package com.whatsapp.profile.fragments;

import X.AnonymousClass0LC;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C103475Kl;
import X.C103485Km;
import X.C103495Kn;
import X.C103505Ko;
import X.C104635Ox;
import X.C104645Oy;
import X.C18100vl;
import X.C27142DWd;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameSettingsViewModel;

public final class UsernameManagementFragment extends WaComposeFragment {
    public final C18100vl A00;
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27142DWd(this, 3), 1996477482, true);

    public AnonymousClass1OS A26() {
        return this.A02;
    }

    public UsernameManagementFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernameSettingsViewModel.class);
        this.A01 = C99274sY.A00(new C103475Kl(this), new C103485Km(this), new C104635Ox(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new C103495Kn(this), new C103505Ko(this), new C104645Oy(this), A152);
    }
}
