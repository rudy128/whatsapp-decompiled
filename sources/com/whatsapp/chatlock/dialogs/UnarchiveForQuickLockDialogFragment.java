package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.C22851Dl;
import X.C72463Mc;
import X.C73203Rj;
import X.C91574fu;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class UnarchiveForQuickLockDialogFragment extends Hilt_UnarchiveForQuickLockDialogFragment {
    public boolean A00;

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0D(2131888170);
        A03.A0e(this, (C22851Dl) null, 2131898766);
        A03.A0g(this, new C91574fu(this, 41), 2131887451);
        return AnonymousClass3MY.A0L(A03);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        Bundle A0J = C72463Mc.A0J(dialogInterface);
        A0J.putBoolean("UnarchiveForQuickLockDialogFragment_result_key", this.A00);
        A1F().A0w("UnarchiveForQuickLockDialogFragment_request_key", A0J);
        super.onDismiss(dialogInterface);
    }
}
