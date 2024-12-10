package com.whatsapp.profile.fragments;

import X.AnonymousClass00R;
import X.AnonymousClass0LC;
import X.AnonymousClass1DF;
import X.AnonymousClass1OS;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.C156847v1;
import X.C156857v2;
import X.C18100vl;
import X.C27143DWe;
import X.C27771Dkr;
import X.C27772Dks;
import X.C27773Dkt;
import X.C27774Dku;
import X.C27775Dkv;
import X.C27835DmW;
import X.C88414Zp;
import X.C99274sY;
import com.whatsapp.compose.core.WaComposeBottomSheetFragment;
import com.whatsapp.profile.viewmodel.UsernameNavigationViewModel;
import com.whatsapp.profile.viewmodel.UsernamePinEntryViewModel;

public final class UsernamePinEntryBottomSheetFragment extends WaComposeBottomSheetFragment {
    public final C18100vl A00 = C88414Zp.A02(this, "username");
    public final C18100vl A01;
    public final C18100vl A02;
    public final AnonymousClass1OS A03 = AnonymousClass0LC.A01(new C27143DWe(this, 7), -1663675510, true);

    public UsernamePinEntryBottomSheetFragment() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(UsernameNavigationViewModel.class);
        this.A01 = new C99274sY(new C27771Dkr(this), new C27772Dks(this), new C27835DmW(this), A15);
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C27774Dku(new C27773Dkt(this)));
        AnonymousClass20F A152 = AnonymousClass3MW.A15(UsernamePinEntryViewModel.class);
        this.A02 = new C99274sY(new C27775Dkv(A002), new C156857v2(this, A002), new C156847v1(A002), A152);
    }
}
