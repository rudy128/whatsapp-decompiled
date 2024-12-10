package com.whatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass4QC;
import X.AnonymousClass4a6;
import X.AnonymousClass4bC;
import X.C17880vN;
import X.C17960vV;
import X.C23211Fd;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class CreateOrAddToContactsDialog extends Hilt_CreateOrAddToContactsDialog {
    public C23211Fd A00;
    public String A01 = null;
    public boolean A02;

    public static CreateOrAddToContactsDialog A00(AnonymousClass1E7 r4, boolean z) {
        CreateOrAddToContactsDialog createOrAddToContactsDialog = new CreateOrAddToContactsDialog();
        Bundle A0D = C17880vN.A0D();
        AnonymousClass1BI r0 = r4.A0J;
        C17960vV.A07(r0);
        A0D.putString("CONTACT_JID_KEY", r0.getRawString());
        A0D.putBoolean("IS_ME_KEY", z);
        createOrAddToContactsDialog.A1R(A0D);
        return createOrAddToContactsDialog;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1x(android.content.Context r3) {
        /*
            r2 = this;
            super.A1x(r3)
            androidx.fragment.app.Fragment r1 = r2.A0E
            boolean r0 = r1 instanceof X.C23211Fd
            if (r0 == 0) goto L_0x000f
            r3 = r1
        L_0x000a:
            X.1Fd r3 = (X.C23211Fd) r3
            r2.A00 = r3
            return
        L_0x000f:
            boolean r0 = r3 instanceof X.C23211Fd
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "CreateOrAddToContactsDialog requires a Listener as it's host"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.dialogs.CreateOrAddToContactsDialog.A1x(android.content.Context):void");
    }

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle A15 = A15();
        this.A01 = A15.getString("CONTACT_JID_KEY");
        this.A02 = A15.getBoolean("IS_ME_KEY");
        if (bundle != null) {
            this.A01 = bundle.getString("CONTACT_JID_KEY");
            this.A02 = bundle.getBoolean("IS_ME_KEY");
        }
    }

    public void A20(Bundle bundle) {
        super.A20(bundle);
        bundle.putString("CONTACT_JID_KEY", this.A01);
        bundle.putBoolean("IS_ME_KEY", this.A02);
    }

    public Dialog A27(Bundle bundle) {
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(new AnonymousClass4QC(A1H(2131889080), 2131432546));
        A13.add(new AnonymousClass4QC(A1H(2131886477), 2131432547));
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0H(new AnonymousClass4bC((Object) this, (Object) A13, 18), new ArrayAdapter(A1n(), 17367043, A13));
        return A03.create();
    }
}
