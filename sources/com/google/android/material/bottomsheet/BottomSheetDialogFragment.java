package com.google.android.material.bottomsheet;

import X.C110745gz;
import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;

public abstract class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public void A28() {
        Dialog dialog = this.A03;
        if (dialog instanceof C110745gz) {
            C110745gz r1 = (C110745gz) dialog;
            if (r1.A01 == null) {
                C110745gz.A02(r1);
            }
        }
        super.A28();
    }

    public void A29() {
        Dialog dialog = this.A03;
        if (dialog instanceof C110745gz) {
            C110745gz r1 = (C110745gz) dialog;
            if (r1.A01 == null) {
                C110745gz.A02(r1);
            }
        }
        super.A29();
    }

    public Dialog A27(Bundle bundle) {
        return new C110745gz(A1n(), A25());
    }
}
