package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1DC;
import X.AnonymousClass1E7;
import X.AnonymousClass1M9;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4XI;
import X.AnonymousClass4a6;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C24921Me;
import X.C73203Rj;
import X.C88854aw;
import android.app.Dialog;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import java.util.ArrayList;

public class ConversationRow$ConversationRowDialogFragment extends Hilt_ConversationRow_ConversationRowDialogFragment {
    public AnonymousClass11S A00;
    public AnonymousClass1M9 A01;
    public C24921Me A02;
    public AnonymousClass1DC A03;

    public Dialog A27(Bundle bundle) {
        String string = this.A06.getString("jid");
        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(string);
        C17960vV.A08(A0l, AnonymousClass001.A1H("ConversationRow/onCreateDialog/invalid jid=", string, AnonymousClass000.A10()));
        AnonymousClass1M9 r0 = this.A01;
        C17960vV.A07(A0l);
        AnonymousClass1E7 A0H = r0.A0H(A0l);
        ArrayList A13 = AnonymousClass000.A13();
        if (!A0H.A0B() && (!this.A00.A0N())) {
            A13.add(new AnonymousClass4XI(A1n().getString(2131898687), 2131432524));
            A13.add(new AnonymousClass4XI(A1n().getString(2131886477), 2131432525));
        }
        String A0q = AnonymousClass3MY.A0q(this.A02, A0H);
        A13.add(new AnonymousClass4XI(C17880vN.A0q(A1n(), A0q, new Object[1], 0, 2131892049), 2131432594));
        A13.add(new AnonymousClass4XI(C17890vO.A0R(A1n(), A0q, 1, 0, 2131898015), 2131432650));
        A13.add(new AnonymousClass4XI(C17890vO.A0R(A1n(), A0q, 1, 0, 2131897835), 2131432648));
        C73203Rj A002 = AnonymousClass4a6.A00(A1n());
        A002.A0H(new C88854aw(A0l, this, A13, 5), new ArrayAdapter(A1n(), 17367043, A13));
        return A002.create();
    }
}
