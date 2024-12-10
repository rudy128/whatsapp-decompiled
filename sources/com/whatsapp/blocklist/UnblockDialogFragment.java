package com.whatsapp.blocklist;

import X.AnonymousClass1FL;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.AnonymousClass4bC;
import X.AnonymousClass4bD;
import X.C010105w;
import X.C107105Yk;
import X.C17880vN;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public final class UnblockDialogFragment extends Hilt_UnblockDialogFragment {
    public C107105Yk A00;
    public boolean A01;

    public Dialog A27(Bundle bundle) {
        AnonymousClass4aq r3;
        AnonymousClass1FL A1D = A1D();
        String string = A15().getString("message");
        if (string != null) {
            int i = A15().getInt("title");
            if (this.A00 == null) {
                r3 = null;
            } else {
                r3 = new AnonymousClass4aq(this, 17);
            }
            AnonymousClass4bC r1 = new AnonymousClass4bC((Object) this, (Object) A1D, 2);
            C73203Rj A002 = AnonymousClass4a6.A00(A1D);
            A002.A0S(string);
            if (i != 0) {
                A002.A0E(i);
            }
            A002.A0Z(r3, 2131897273);
            A002.A0X(r1, 2131898766);
            if (this.A01) {
                A002.A00.A0P(new AnonymousClass4bD(A1D, 0));
            }
            C010105w create = A002.create();
            create.setCanceledOnTouchOutside(!this.A01);
            return create;
        }
        throw C17880vN.A0g();
    }
}
