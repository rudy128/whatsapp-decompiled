package com.whatsapp.profile.fragments;

import X.AnonymousClass00R;
import X.AnonymousClass0LC;
import X.AnonymousClass1DF;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass5L8;
import X.AnonymousClass5L9;
import X.AnonymousClass5LA;
import X.AnonymousClass5LB;
import X.AnonymousClass5LC;
import X.AnonymousClass5P4;
import X.C156927v9;
import X.C156937vA;
import X.C18100vl;
import X.C27142DWd;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameShareViewModel;

public final class UsernameShareFragment extends WaComposeFragment {
    public final C18100vl A00;
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27142DWd(this, 7), 1319668346, true);

    public AnonymousClass1OS A26() {
        return this.A02;
    }

    public UsernameShareFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5LB(new AnonymousClass5LA(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernameShareViewModel.class);
        this.A01 = C99274sY.A00(new AnonymousClass5LC(A002), new C156937vA(this, A002), new C156927v9(A002), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new AnonymousClass5L8(this), new AnonymousClass5L9(this), new AnonymousClass5P4(this), A152);
    }
}
