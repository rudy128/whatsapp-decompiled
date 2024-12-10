package com.whatsapp.dialogs;

import X.C23451Gc;
import X.C450525u;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class ProgressDialogFragment extends Hilt_ProgressDialogFragment {
    public DialogInterface.OnKeyListener A00;
    public boolean A01 = false;

    public Dialog A27(Bundle bundle) {
        String str;
        if (bundle != null) {
            this.A01 = !C23451Gc.A02;
        }
        A15();
        int i = A15().getInt("title_id");
        int i2 = this.A06.getInt("message_id");
        if (bundle != null) {
            str = bundle.getString("previous_message_text");
        } else {
            str = null;
        }
        ProgressDialog progressDialog = new ProgressDialog(A1B());
        String string = this.A06.getString("title");
        if (!(string == null && (i == 0 || (string = A1H(i)) == null))) {
            progressDialog.setTitle(string);
        }
        if (!(str == null && (str = this.A06.getString("message")) == null && (i2 == 0 || (str = A1H(i2)) == null))) {
            progressDialog.setMessage(str);
        }
        progressDialog.setIndeterminate(true);
        A2D(false);
        DialogInterface.OnKeyListener onKeyListener = this.A00;
        if (onKeyListener != null) {
            progressDialog.setOnKeyListener(onKeyListener);
        }
        return progressDialog;
    }

    public static ProgressDialogFragment A00(int i, int i2) {
        ProgressDialogFragment progressDialogFragment = new ProgressDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("title_id", i);
        bundle.putInt("message_id", i2);
        progressDialogFragment.A1R(bundle);
        return progressDialogFragment;
    }

    public void A2H() {
        if (this.A04 >= 7) {
            A28();
        } else {
            this.A01 = true;
        }
    }

    public void A1v() {
        super.A1v();
        if (this.A01) {
            A28();
            this.A01 = false;
        }
    }

    public void A20(Bundle bundle) {
        CharSequence charSequence;
        super.A20(bundle);
        C450525u r0 = (C450525u) this.A03;
        if (r0 != null && (charSequence = r0.A00) != null) {
            bundle.putString("previous_message_text", charSequence.toString());
        }
    }
}
