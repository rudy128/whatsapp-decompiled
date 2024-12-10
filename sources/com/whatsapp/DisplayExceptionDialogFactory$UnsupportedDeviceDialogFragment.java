package com.whatsapp;

import X.AnonymousClass4a6;
import X.C72463Mc;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class DisplayExceptionDialogFactory$UnsupportedDeviceDialogFragment extends Hilt_DisplayExceptionDialogFactory_UnsupportedDeviceDialogFragment {
    public Dialog A27(Bundle bundle) {
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        A04.A0E(2131898700);
        A04.A0D(2131889401);
        A04.A0T(false);
        C73203Rj.A06(A04);
        return A04.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C72463Mc.A1A(this);
    }
}
