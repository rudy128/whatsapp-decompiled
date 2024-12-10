package X;

import android.view.View;
import android.view.autofill.AutofillManager;

/* renamed from: X.0WG  reason: invalid class name */
public final class AnonymousClass0WG implements C15770rB {
    public final View A00;
    public final AnonymousClass0HA A01;
    public final AutofillManager A02;

    public AnonymousClass0WG(View view, AnonymousClass0HA r4) {
        this.A00 = view;
        this.A01 = r4;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.A02 = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw AnonymousClass000.A0n("Autofill service could not be located.");
    }

    public final AutofillManager A00() {
        return this.A02;
    }
}
