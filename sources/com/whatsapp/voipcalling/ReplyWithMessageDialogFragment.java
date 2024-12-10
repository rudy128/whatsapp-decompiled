package com.whatsapp.voipcalling;

import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass4a6;
import X.AnonymousClass4bC;
import X.C010105w;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public final class ReplyWithMessageDialogFragment extends Hilt_ReplyWithMessageDialogFragment {
    public static final int[] A04 = {2131891323, 2131891324, 2131891325, 2131891326, 2131891327};
    public AnonymousClass11P A00;
    public AnonymousClass00H A01;
    public final UserJid A02;
    public final String A03;

    public ReplyWithMessageDialogFragment(UserJid userJid, String str) {
        this.A02 = userJid;
        this.A03 = str;
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A032 = AnonymousClass4a6.A03(this);
        String[] A0R = this.A01.A0R(A04);
        A032.A0M(new AnonymousClass4bC((Object) this, (Object) A0R, 29), A0R);
        C010105w create = A032.create();
        create.setCanceledOnTouchOutside(true);
        return create;
    }
}
