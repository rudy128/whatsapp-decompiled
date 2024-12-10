package com.whatsapp.backup.google;

import X.A9Q;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;

public class BaseNewUserSetupActivity$AuthRequestDialogFragment extends Hilt_BaseNewUserSetupActivity_AuthRequestDialogFragment {
    public Dialog A27(Bundle bundle) {
        ProgressDialog progressDialog = new ProgressDialog(A1n());
        progressDialog.setTitle(2131895854);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(A1H(2131895853));
        progressDialog.setCancelable(true);
        progressDialog.setOnCancelListener(new A9Q(this, 1));
        return progressDialog;
    }
}
