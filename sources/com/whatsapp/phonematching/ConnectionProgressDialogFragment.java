package com.whatsapp.phonematching;

import X.AnonymousClass1GP;
import X.C18070vi;
import X.C34001jj;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

public final class ConnectionProgressDialogFragment extends Hilt_ConnectionProgressDialogFragment {
    public void A2C(AnonymousClass1GP r2, String str) {
        C18070vi.A0d(r2, 0);
        C34001jj r0 = new C34001jj(r2);
        r0.A0B(this, str);
        r0.A02();
    }

    public Dialog A27(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(A1B());
        progressDialog.setMessage(A1H(2131894984));
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }
}
