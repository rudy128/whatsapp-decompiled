package com.whatsapp.avatar.profilephoto;

import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass5BA;
import X.AnonymousClass5BB;
import X.C103835Lv;
import X.C18100vl;
import X.C73203Rj;
import X.C88794an;
import X.C99274sY;
import android.app.Dialog;
import android.os.Bundle;

public final class AvatarProfilePhotoErrorDialog extends Hilt_AvatarProfilePhotoErrorDialog {
    public final C18100vl A00;

    public AvatarProfilePhotoErrorDialog() {
        AnonymousClass20F A15 = AnonymousClass3MW.A15(AvatarProfilePhotoViewModel.class);
        this.A00 = C99274sY.A00(new AnonymousClass5BA(this), new AnonymousClass5BB(this), new C103835Lv(this), A15);
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0D(2131886860);
        C73203Rj.A09(A03, this, 16, 2131899286);
        A03.A0G(new C88794an(this, 3));
        return AnonymousClass3MY.A0L(A03);
    }
}
