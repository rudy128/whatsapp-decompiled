package X;

import android.content.DialogInterface;

/* renamed from: X.A9s  reason: case insensitive filesystem */
public class C20156A9s implements DialogInterface.OnDismissListener {
    public final int A00;

    public C20156A9s(int i) {
        this.A00 = i;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (2 - this.A00 != 0) {
            dialogInterface.dismiss();
        }
    }
}
