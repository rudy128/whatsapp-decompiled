package com.whatsapp.calling.dialogs;

import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass757;
import X.C010105w;
import X.C19830z4;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class SwitchConfirmationFragment extends Hilt_SwitchConfirmationFragment {
    public C19830z4 A00;

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0D(2131898284);
        A03.setPositiveButton(2131898283, AnonymousClass757.A00(this, 9));
        A03.setNegativeButton(2131898766, (DialogInterface.OnClickListener) null);
        C010105w A0L = AnonymousClass3MY.A0L(A03);
        A0L.setCanceledOnTouchOutside(true);
        return A0L;
    }
}
