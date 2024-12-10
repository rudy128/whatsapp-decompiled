package com.whatsapp.profile.fragments;

import X.AnonymousClass00R;
import X.AnonymousClass0LC;
import X.AnonymousClass1DF;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C103515Kp;
import X.C103525Kq;
import X.C103535Kr;
import X.C103545Ks;
import X.C103555Kt;
import X.C104655Oz;
import X.C156827uz;
import X.C156837v0;
import X.C18100vl;
import X.C27143DWe;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinSetViewModel;

public final class UsernamePinDeleteConfirmationDialogFragment extends WaComposeFragment {
    public final C18100vl A00;
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27143DWe(this, 6), 362626942, true);

    public AnonymousClass1OS A26() {
        return this.A02;
    }

    public UsernamePinDeleteConfirmationDialogFragment() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C103545Ks(new C103535Kr(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernamePinSetViewModel.class);
        this.A01 = C99274sY.A00(new C103555Kt(A002), new C156837v0(this, A002), new C156827uz(A002), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new C103515Kp(this), new C103525Kq(this), new C104655Oz(this), A152);
    }
}
