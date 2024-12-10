package com.whatsapp.profile.fragments;

import X.AnonymousClass00R;
import X.AnonymousClass0LC;
import X.AnonymousClass1DF;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass5L0;
import X.AnonymousClass5L1;
import X.AnonymousClass5L2;
import X.AnonymousClass5P2;
import X.C103605Ky;
import X.C103615Kz;
import X.C156867v3;
import X.C156877v4;
import X.C18100vl;
import X.C27142DWd;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinSetViewModel;

public final class UsernamePinSetFragment extends WaComposeFragment {
    public final C18100vl A00;
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27142DWd(this, 5), 675710314, true);

    public AnonymousClass1OS A26() {
        return this.A02;
    }

    public UsernamePinSetFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5L1(new AnonymousClass5L0(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernamePinSetViewModel.class);
        this.A01 = C99274sY.A00(new AnonymousClass5L2(A002), new C156877v4(this, A002), new C156867v3(A002), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new C103605Ky(this), new C103615Kz(this), new AnonymousClass5P2(this), A152);
    }
}
