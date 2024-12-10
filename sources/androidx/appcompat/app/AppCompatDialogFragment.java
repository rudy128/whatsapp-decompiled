package androidx.appcompat.app;

import X.AnonymousClass02A;
import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public abstract class AppCompatDialogFragment extends DialogFragment {
    public void A2B(int i, Dialog dialog) {
        if (dialog instanceof AnonymousClass02A) {
            AnonymousClass02A r2 = (AnonymousClass02A) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            r2.A05();
            return;
        }
        super.A2B(i, dialog);
    }

    public Dialog A27(Bundle bundle) {
        return new AnonymousClass02A(A1n(), A25());
    }
}
