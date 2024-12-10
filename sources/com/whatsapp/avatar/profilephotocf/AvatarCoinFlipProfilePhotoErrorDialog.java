package com.whatsapp.avatar.profilephotocf;

import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass5BC;
import X.AnonymousClass5BD;
import X.C103845Lw;
import X.C18100vl;
import X.C73203Rj;
import X.C88794an;
import X.C91574fu;
import X.C99274sY;
import android.app.Dialog;
import android.os.Bundle;

public final class AvatarCoinFlipProfilePhotoErrorDialog extends Hilt_AvatarCoinFlipProfilePhotoErrorDialog {
    public final C18100vl A00;

    public AvatarCoinFlipProfilePhotoErrorDialog() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AvatarCoinFlipProfilePhotoViewModel.class);
        this.A00 = C99274sY.A00(new AnonymousClass5BC(this), new AnonymousClass5BD(this), new C103845Lw(this), A15);
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0D(2131886860);
        A03.A0g(this, new C91574fu(this, 4), 2131899286);
        A03.A0G(new C88794an(this, 4));
        return AnonymousClass3MY.A0L(A03);
    }
}
