package com.whatsapp.status.playback.fragment;

import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass758;
import X.C1412274u;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public final class OpenLinkConfirmationDialogFragment extends Hilt_OpenLinkConfirmationDialogFragment {
    public boolean A2G() {
        return true;
    }

    public Dialog A27(Bundle bundle) {
        String string = A15().getString("url");
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0E(2131896822);
        A03.A0S(string);
        A03.setNegativeButton(2131898766, new AnonymousClass758(this, 26));
        A03.setPositiveButton(2131896821, new C1412274u(2, string, this));
        return AnonymousClass3MY.A0L(A03);
    }
}
