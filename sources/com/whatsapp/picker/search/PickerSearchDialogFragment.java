package com.whatsapp.picker.search;

import X.AnonymousClass1FL;
import X.AnonymousClass4Z9;
import X.AnonymousClass4bD;
import X.AnonymousClass722;
import X.AnonymousClass7MX;
import X.C117015z4;
import X.C17890vO;
import X.C18070vi;
import X.C23221Fe;
import X.C28281Zt;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class PickerSearchDialogFragment extends Hilt_PickerSearchDialogFragment {
    public AnonymousClass7MX A00;

    public void onDismiss(DialogInterface dialogInterface) {
        C117015z4 r0;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass7MX r2 = this.A00;
        if (r2 != null) {
            r2.A06 = false;
            if (r2.A07 && (r0 = r2.A00) != null) {
                r0.A0D();
            }
            r2.A03 = null;
            AnonymousClass722 r02 = r2.A09;
            if (r02 != null) {
                r02.A00 = null;
                C17890vO.A0t(r02.A02);
            }
        }
        this.A00 = null;
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C23221Fe r2;
        AnonymousClass1FL A1B = A1B();
        if ((A1B instanceof C23221Fe) && (r2 = (C23221Fe) A1B) != null) {
            r2.C0a(this);
        }
        return null;
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        A2A(0, 2132083524);
    }

    public Dialog A27(Bundle bundle) {
        Dialog A27 = super.A27(bundle);
        C28281Zt.A03(AnonymousClass4Z9.A00(A1n(), 2130971093), A27);
        A27.setOnKeyListener(new AnonymousClass4bD(this, 2));
        return A27;
    }
}
