package com.google.android.gms.common;

import X.C18210vx;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog A00;
    public DialogInterface.OnCancelListener A01;
    public Dialog A02;

    public Dialog A27(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog != null) {
            return dialog;
        }
        this.A0D = false;
        Dialog dialog2 = this.A02;
        if (dialog2 != null) {
            return dialog2;
        }
        Context A1n = A1n();
        C18210vx.A00(A1n);
        AlertDialog create = new AlertDialog.Builder(A1n).create();
        this.A02 = create;
        return create;
    }
}
