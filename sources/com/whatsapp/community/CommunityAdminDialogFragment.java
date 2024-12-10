package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass3MY;
import X.AnonymousClass4XS;
import X.AnonymousClass4a6;
import X.AnonymousClass4aq;
import X.C18070vi;
import X.C73203Rj;
import X.C84794Kw;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.jid.UserJid;

public final class CommunityAdminDialogFragment extends WaDialogFragment {
    public int A00;
    public C84794Kw A01;
    public UserJid A02;

    public void onCancel(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        UserJid userJid = this.A02;
        if (userJid != null) {
            C84794Kw r0 = this.A01;
            if (r0 == null) {
                C18070vi.A11("callback");
                throw null;
            } else {
                AnonymousClass4XS.A00(this, r0, userJid);
            }
        }
    }

    public Dialog A27(Bundle bundle) {
        String string;
        String string2;
        Bundle A15 = A15();
        if (A15.containsKey("dialog_id")) {
            this.A00 = A15.getInt("dialog_id");
            UserJid A04 = UserJid.Companion.A04(A15.getString("user_jid"));
            this.A02 = A04;
            if (A04 != null) {
                C73203Rj A03 = AnonymousClass4a6.A03(this);
                if (A15.containsKey("title")) {
                    A03.A0k(A15.getString("title"));
                }
                if (A15.containsKey("message")) {
                    A03.A0S(A15.getCharSequence("message"));
                }
                if (A15.containsKey("positive_button") && (string2 = A15.getString("positive_button")) != null) {
                    A03.A0L(new AnonymousClass4aq(this, 45), string2);
                }
                if (A15.containsKey("negative_button") && (string = A15.getString("negative_button")) != null) {
                    A03.A00.A0J(new AnonymousClass4aq(this, 46), string);
                }
                return AnonymousClass3MY.A0L(A03);
            }
            throw AnonymousClass000.A0k("CommunityAdminDialogFragment/user jid must be passed in");
        }
        throw AnonymousClass000.A0n("CommunityAdminDialogFragment/dialog_id should be provided.");
    }
}
