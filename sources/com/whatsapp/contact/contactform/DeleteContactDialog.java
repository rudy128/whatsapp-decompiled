package com.whatsapp.contact.contactform;

import X.AnonymousClass4DG;
import X.AnonymousClass4TM;
import X.C73193Ri;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public final class DeleteContactDialog extends Hilt_DeleteContactDialog {
    public AnonymousClass4TM A00;

    public Dialog A27(Bundle bundle) {
        AnonymousClass4DG r5 = AnonymousClass4DG.DESTRUCTIVE;
        this.A05 = r5;
        C73193Ri A002 = C73193Ri.A00(A14());
        AnonymousClass4TM r2 = this.A00;
        A002.A0V(2131893333);
        A002.A0U(r2.A00);
        A002.A0X(r2.A01, 2131898874);
        this.A07 = r5;
        A002.A0W((DialogInterface.OnClickListener) null, 2131898766);
        this.A05 = AnonymousClass4DG.NORMAL;
        return A002.create();
    }
}
