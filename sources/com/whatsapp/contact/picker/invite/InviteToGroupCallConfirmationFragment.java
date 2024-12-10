package com.whatsapp.contact.picker.invite;

import X.AnonymousClass000;
import X.AnonymousClass1EG;
import X.AnonymousClass1FL;
import X.AnonymousClass1M9;
import X.AnonymousClass1YL;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bA;
import X.AnonymousClass4bC;
import X.C010105w;
import X.C18070vi;
import X.C24921Me;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import com.whatsapp.jid.UserJid;

public final class InviteToGroupCallConfirmationFragment extends Hilt_InviteToGroupCallConfirmationFragment {
    public AnonymousClass1M9 A00;
    public C24921Me A01;

    public Dialog A27(Bundle bundle) {
        String str;
        UserJid A04 = UserJid.Companion.A04(A15().getString("peer_id"));
        if (A04 != null) {
            AnonymousClass1FL A1D = A1D();
            C73203Rj A002 = AnonymousClass4a6.A00(A1D);
            C24921Me r1 = this.A01;
            if (r1 != null) {
                AnonymousClass1M9 r0 = this.A00;
                if (r0 != null) {
                    A002.A0k(A1I(2131891494, AnonymousClass000.A1b(AnonymousClass3MY.A0q(r1, r0.A0H(A04)), 1)));
                    String A03 = AnonymousClass1EG.A03(A1D, AnonymousClass1YL.A00(A1D, 2130968583, 2131099679));
                    C18070vi.A0X(A03);
                    Spanned fromHtml = Html.fromHtml(A1I(2131891492, AnonymousClass000.A1b(A03, 1)));
                    C18070vi.A0X(fromHtml);
                    A002.A0S(fromHtml);
                    A002.setPositiveButton(2131891493, new AnonymousClass4bC((Object) this, (Object) A04, 9));
                    AnonymousClass4bA.A00(A002, this, 13, 2131898766);
                    C010105w create = A002.create();
                    create.setCanceledOnTouchOutside(true);
                    return create;
                }
                str = "contactManager";
            } else {
                str = "waContactNames";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw AnonymousClass000.A0k("null peer jid");
    }
}
