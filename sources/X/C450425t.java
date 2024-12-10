package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

/* renamed from: X.25t  reason: invalid class name and case insensitive filesystem */
public class C450425t extends DialogFragment {
    public Dialog A00;
    public DialogInterface.OnCancelListener A01;
    public Dialog A02;

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.A01;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.A00;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        Dialog dialog2 = this.A02;
        if (dialog2 != null) {
            return dialog2;
        }
        Activity activity = getActivity();
        C18210vx.A00(activity);
        AlertDialog create = new AlertDialog.Builder(activity).create();
        this.A02 = create;
        return create;
    }
}
