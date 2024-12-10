package com.whatsapp.consent.common;

import X.A8V;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass4a6;
import X.AnonymousClass7AO;
import X.C108985cd;
import X.C17880vN;
import X.C18070vi;
import X.C18100vl;
import X.C25661Pc;
import X.C72453Mb;
import X.C73203Rj;
import X.C88414Zp;
import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.consent.DateOfBirthConfirmationDialog;
import com.whatsapp.consent.DateOfBirthRemediationDialog;
import com.whatsapp.pancake.dosa.DosaAgeConfirmationDialog;
import com.whatsapp.pancake.dosa.DosaRemediationConfirmationDialog;
import java.util.GregorianCalendar;

public abstract class AgeConfirmationDialog extends WaDialogFragment {
    public final C18100vl A00 = C88414Zp.A03(this, "arg_age", 0);

    public Dialog A27(Bundle bundle) {
        String string;
        String str;
        A8V a8v;
        if (!(this instanceof DosaRemediationConfirmationDialog)) {
            if (this instanceof DosaAgeConfirmationDialog) {
                C25661Pc r3 = ((DosaAgeConfirmationDialog) this).A00;
                if (r3 != null) {
                    C108985cd.A17(r3, C17880vN.A0h(), C17880vN.A0m(), 0);
                } else {
                    str = "contextualAgeCollectionLogUtil";
                }
            } else {
                if (this instanceof DateOfBirthRemediationDialog) {
                    a8v = ((DateOfBirthRemediationDialog) this).A00;
                } else {
                    a8v = ((DateOfBirthConfirmationDialog) this).A00;
                }
                if (a8v != null) {
                    a8v.A0L("age_collection_under18_confirmation", "age_collection_under18_confirmation_landing", "next", (String) null);
                } else {
                    str = "funnelLogger";
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        C18100vl r8 = this.A00;
        if (C72453Mb.A0I(r8) < 18) {
            Resources A09 = AnonymousClass3MZ.A09(this);
            int A0I = C72453Mb.A0I(r8);
            Object[] objArr = new Object[1];
            C17880vN.A1T(objArr, C72453Mb.A0I(r8), 0);
            string = A09.getQuantityString(2131755016, A0I, objArr);
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.add(1, -C72453Mb.A0I(r8));
            int i = gregorianCalendar.get(1);
            Resources A092 = AnonymousClass3MZ.A09(this);
            Object[] objArr2 = new Object[1];
            C17880vN.A1T(objArr2, i, 0);
            string = A092.getString(2131886563, objArr2);
        }
        C18070vi.A0b(string);
        A03.A0k(string);
        A03.A0D(2131886564);
        A03.A0g(this, new AnonymousClass7AO(this, 1), 2131886566);
        A03.A0e(this, new AnonymousClass7AO(this, 2), 2131886565);
        return AnonymousClass3MY.A0L(A03);
    }
}
