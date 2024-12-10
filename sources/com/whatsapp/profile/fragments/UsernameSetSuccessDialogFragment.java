package com.whatsapp.profile.fragments;

import X.AnonymousClass00R;
import X.AnonymousClass0LC;
import X.AnonymousClass1DF;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C156907v7;
import X.C156917v8;
import X.C18100vl;
import X.C27143DWe;
import X.C27776Dkw;
import X.C27777Dkx;
import X.C27778Dky;
import X.C88414Zp;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameSetSuccessDialogViewModel;

public final class UsernameSetSuccessDialogFragment extends WaComposeFragment {
    public final C18100vl A00 = C88414Zp.A02(this, "username");
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27143DWe(this, 8), -1911249558, true);

    public UsernameSetSuccessDialogFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C27777Dkx(new C27776Dkw(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernameSetSuccessDialogViewModel.class);
        this.A01 = new C99274sY(new C27778Dky(A002), new C156917v8(this, A002), new C156907v7(A002), A15);
    }
}
