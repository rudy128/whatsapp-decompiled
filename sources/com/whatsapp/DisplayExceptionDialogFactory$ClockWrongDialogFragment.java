package com.whatsapp;

import X.AnonymousClass11C;
import X.AnonymousClass11P;
import X.AnonymousClass194;
import X.AnonymousClass1FL;
import X.C166628dG;
import X.C17890vO;
import X.C88794an;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.os.Bundle;
import com.whatsapp.util.Log;

public class DisplayExceptionDialogFactory$ClockWrongDialogFragment extends Hilt_DisplayExceptionDialogFactory_ClockWrongDialogFragment {
    public AnonymousClass194 A00;
    public AnonymousClass11C A01;
    public AnonymousClass11P A02;
    public boolean A03 = true;

    public Dialog A27(Bundle bundle) {
        Log.w("home/dialog clock-wrong");
        AnonymousClass1FL A1D = A1D();
        C166628dG r2 = new C166628dG(A1D, this.A00, this.A01, this.A02, this.A01, this.A02);
        r2.setOnCancelListener(new C88794an(A1D, 1));
        return r2;
    }

    public void A1u() {
        super.A1u();
        if (!this.A00.A02()) {
            A28();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A03 = false;
        A28();
        new DisplayExceptionDialogFactory$ClockWrongDialogFragment().A2C(A1D().getSupportFragmentManager(), C17890vO.A0U(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.A03 && A1B() != null) {
            A1D().finish();
        }
    }
}
