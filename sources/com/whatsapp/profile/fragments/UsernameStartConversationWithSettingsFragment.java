package com.whatsapp.profile.fragments;

import X.AnonymousClass0LC;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass5LD;
import X.AnonymousClass5LE;
import X.AnonymousClass5LF;
import X.AnonymousClass5LG;
import X.AnonymousClass5P5;
import X.AnonymousClass5P6;
import X.C18100vl;
import X.C27142DWd;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameStartConversationWithSettingsViewModel;

public final class UsernameStartConversationWithSettingsFragment extends WaComposeFragment {
    public final C18100vl A00;
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27142DWd(this, 8), 1937709404, true);

    public AnonymousClass1OS A26() {
        return this.A02;
    }

    public UsernameStartConversationWithSettingsFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernameStartConversationWithSettingsViewModel.class);
        this.A01 = C99274sY.A00(new AnonymousClass5LD(this), new AnonymousClass5LE(this), new AnonymousClass5P5(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new AnonymousClass5LF(this), new AnonymousClass5LG(this), new AnonymousClass5P6(this), A152);
    }
}
