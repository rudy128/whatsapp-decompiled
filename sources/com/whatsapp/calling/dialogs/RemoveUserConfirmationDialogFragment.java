package com.whatsapp.calling.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass1M9;
import X.AnonymousClass1OA;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C17960vV;
import X.C18070vi;
import X.C22941Dw;
import X.C23761Hn;
import X.C24141Ja;
import X.C24921Me;
import X.C30391dr;
import X.C73203Rj;
import X.C89274cC;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public final class RemoveUserConfirmationDialogFragment extends Hilt_RemoveUserConfirmationDialogFragment {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public String A02;
    public UserJid A03;

    public void A1z(Bundle bundle) {
        super.A1z(bundle);
        Bundle A15 = A15();
        C22941Dw r0 = UserJid.Companion;
        UserJid A032 = C22941Dw.A03(A15.getString("user_jid"));
        this.A03 = A032;
        AnonymousClass3MW.A1X(C23761Hn.A02, new RemoveUserConfirmationDialogFragment$onCreate$1$1(this, A032, (C30391dr) null), AnonymousClass1OA.A00);
    }

    public Dialog A27(Bundle bundle) {
        Object obj;
        String A1I;
        Context A14 = A14();
        Bundle bundle2 = this.A06;
        if (bundle2 != null) {
            obj = C24141Ja.A00(bundle2, C89274cC.class, "callback");
        } else {
            obj = null;
        }
        C17960vV.A07(this.A03);
        C73203Rj A002 = AnonymousClass4a6.A00(A14);
        String str = this.A02;
        if (str == null) {
            A1I = new String();
        } else {
            A1I = A1I(2131887678, AnonymousClass000.A1b(str, 1));
            C18070vi.A0b(A1I);
        }
        A002.A0k(A1I);
        A002.A0S(A1H(2131887677));
        A002.A0T(true);
        C73203Rj.A09(A002, obj, 28, 2131887675);
        A002.A0X(new AnonymousClass4aq(obj, 29), 2131887669);
        A002.A0Y(new AnonymousClass4aq(this, 30), 2131898766);
        return AnonymousClass3MY.A0L(A002);
    }
}
