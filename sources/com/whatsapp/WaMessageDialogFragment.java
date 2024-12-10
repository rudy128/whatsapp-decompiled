package com.whatsapp;

import X.AnonymousClass1D6;
import X.AnonymousClass1GP;
import X.AnonymousClass9O6;
import X.C108985cd;
import X.C17890vO;
import X.C18070vi;
import X.C20153A9p;
import X.C20273AEg;
import X.C73193Ri;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.base.WaDialogFragment;
import java.util.Arrays;

public final class WaMessageDialogFragment extends WaDialogFragment {
    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        C20273AEg aEg;
        C18070vi.A0d(dialogInterface, 0);
        super.onDismiss(dialogInterface);
        AnonymousClass1GP A1F = A1F();
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03("action_type", "message_dialog_dismissed", r2, 0);
        Parcelable parcelable = A15().getParcelable("message_dialog_parameters");
        if (!(parcelable instanceof C20273AEg) || (aEg = (C20273AEg) parcelable) == null) {
            str = null;
        } else {
            str = aEg.A04;
        }
        C108985cd.A1G("dialog_tag", str, r2);
        A1F.A0w("message_dialog_action", AnonymousClass9O6.A00(r2));
    }

    public Dialog A27(Bundle bundle) {
        C20273AEg aEg;
        int length;
        Parcelable parcelable = A15().getParcelable("message_dialog_parameters");
        if (!(parcelable instanceof C20273AEg) || (aEg = (C20273AEg) parcelable) == null) {
            throw C17890vO.A0K();
        }
        C73193Ri A00 = C73193Ri.A00(A14());
        A00.A0f(true);
        Integer num = aEg.A03;
        if (num != null) {
            A00.A0V(num.intValue());
        }
        Integer num2 = aEg.A01;
        if (num2 != null) {
            int intValue = num2.intValue();
            Object[] objArr = aEg.A06;
            if (objArr == null || (length = objArr.length) == 0) {
                A00.A0U(intValue);
            } else {
                A00.A0d(A1I(intValue, Arrays.copyOf(objArr, length)));
            }
        }
        String str = aEg.A05;
        if (str != null) {
            A00.A0d(str);
        }
        A00.setPositiveButton(aEg.A00, new C20153A9p(aEg, this, 0));
        Integer num3 = aEg.A02;
        if (num3 != null) {
            A00.setNegativeButton(num3.intValue(), new C20153A9p(aEg, this, 1));
        }
        return A00.create();
    }
}
