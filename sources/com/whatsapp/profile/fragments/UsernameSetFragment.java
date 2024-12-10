package com.whatsapp.profile.fragments;

import X.AnonymousClass00R;
import X.AnonymousClass0LC;
import X.AnonymousClass1DF;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass5L3;
import X.AnonymousClass5L4;
import X.AnonymousClass5L5;
import X.AnonymousClass5L6;
import X.AnonymousClass5L7;
import X.AnonymousClass5P3;
import X.C156887v5;
import X.C156897v6;
import X.C18100vl;
import X.C27142DWd;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel;

public final class UsernameSetFragment extends WaComposeFragment {
    public final C18100vl A00;
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27142DWd(this, 6), 1937551156, true);

    public AnonymousClass1OS A26() {
        return this.A02;
    }

    public UsernameSetFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5L6(new AnonymousClass5L5(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernameSetViewModel.class);
        this.A01 = C99274sY.A00(new AnonymousClass5L7(A002), new C156897v6(this, A002), new C156887v5(A002), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new AnonymousClass5L3(this), new AnonymousClass5L4(this), new AnonymousClass5P3(this), A152);
    }
}
