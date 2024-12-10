package com.whatsapp.profile.fragments;

import X.AnonymousClass0LC;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C103415Kf;
import X.C103425Kg;
import X.C103435Kh;
import X.C103445Ki;
import X.C104605Ou;
import X.C104615Ov;
import X.C18100vl;
import X.C27142DWd;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernameSetViewModel;

public final class UsernameDeleteConfirmationDialogFragment extends WaComposeFragment {
    public final C18100vl A00;
    public final C18100vl A01;
    public final AnonymousClass1OS A02 = AnonymousClass0LC.A01(new C27142DWd(this, 1), -1793266294, true);

    public AnonymousClass1OS A26() {
        return this.A02;
    }

    public UsernameDeleteConfirmationDialogFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A00 = C99274sY.A00(new C103415Kf(this), new C103425Kg(this), new C104605Ou(this), A15);
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernameSetViewModel.class);
        this.A01 = C99274sY.A00(new C103435Kh(this), new C103445Ki(this), new C104615Ov(this), A152);
    }
}
