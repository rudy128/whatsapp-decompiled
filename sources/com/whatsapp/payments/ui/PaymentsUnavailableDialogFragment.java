package com.whatsapp.payments.ui;

import X.AnonymousClass1FL;
import X.AnonymousClass1MB;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.C132216mP;
import X.C17880vN;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class PaymentsUnavailableDialogFragment extends Hilt_PaymentsUnavailableDialogFragment {
    public C132216mP A00;
    public AnonymousClass1MB A01;

    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.payments.ui.Hilt_PaymentsUnavailableDialogFragment, com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment, androidx.fragment.app.Fragment] */
    public static PaymentsUnavailableDialogFragment A00() {
        ? hilt_PaymentsUnavailableDialogFragment = new Hilt_PaymentsUnavailableDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("arg_is_underage_unavailability", false);
        hilt_PaymentsUnavailableDialogFragment.A1R(A0D);
        return hilt_PaymentsUnavailableDialogFragment;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.whatsapp.payments.ui.Hilt_PaymentsUnavailableDialogFragment, com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment, androidx.fragment.app.Fragment] */
    public static PaymentsUnavailableDialogFragment A01() {
        ? hilt_PaymentsUnavailableDialogFragment = new Hilt_PaymentsUnavailableDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putBoolean("arg_is_underage_unavailability", true);
        hilt_PaymentsUnavailableDialogFragment.A1R(A0D);
        return hilt_PaymentsUnavailableDialogFragment;
    }

    public Dialog A27(Bundle bundle) {
        boolean z;
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            z = bundle2.getBoolean("arg_is_underage_unavailability");
        } else {
            z = false;
        }
        C73203Rj A02 = AnonymousClass4a6.A02(this);
        A02.A0E(2131894176);
        int i = 2131894175;
        if (z) {
            i = 2131894177;
        }
        A02.A0D(i);
        A02.A0T(false);
        int i2 = 2131899286;
        if (z) {
            i2 = 2131898766;
        }
        A02.A0Z((DialogInterface.OnClickListener) null, i2);
        if (z) {
            A02.A0Y(new AnonymousClass4bB(this, 31), 2131894985);
        }
        return A02.create();
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass1FL A1B = A1B();
        if (A1B != null) {
            A1B.finish();
        }
    }
}
