package com.whatsapp.conversation.conversationrow;

import X.A9U;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1MR;
import X.AnonymousClass3MX;
import X.AnonymousClass4a6;
import X.C17960vV;
import X.C18020vd;
import X.C18040vf;
import X.C20153A9p;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class IdentityChangeDialogFragment extends Hilt_IdentityChangeDialogFragment {
    public AnonymousClass1MR A00;
    public AnonymousClass00H A01;

    public Dialog A27(Bundle bundle) {
        A15();
        String string = this.A06.getString("participant_jid");
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(string);
        C17960vV.A08(A0l, AnonymousClass001.A1H("IdentityChangeDialogFragment/onCreateDialog/invalid remote resource jid=", string, AnonymousClass000.A10()));
        AnonymousClass1E7 A0H = this.A02.A0H(A0l);
        C73203Rj A002 = AnonymousClass4a6.A00(A1n());
        A002.A0S(A2H(A0H, 2131891239));
        A002.A0X((DialogInterface.OnClickListener) null, 2131899286);
        A002.A0Y(new C20153A9p(A0H, this, 11), 2131899101);
        int i = 2131897761;
        if (C18020vd.A05(C18040vf.A02, this.A02, 3336)) {
            i = 2131897795;
        }
        A002.setPositiveButton(i, new A9U(1, string, this));
        return A002.create();
    }
}
