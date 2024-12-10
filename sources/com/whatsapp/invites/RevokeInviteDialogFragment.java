package com.whatsapp.invites;

import X.AnonymousClass1E7;
import X.AnonymousClass1FL;
import X.AnonymousClass1M9;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass4bC;
import X.AnonymousClass5a5;
import X.C010105w;
import X.C17880vN;
import X.C18070vi;
import X.C24921Me;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import com.whatsapp.jid.UserJid;

public final class RevokeInviteDialogFragment extends Hilt_RevokeInviteDialogFragment {
    public AnonymousClass1M9 A00;
    public C24921Me A01;
    public AnonymousClass5a5 A02;

    public void A1x(Context context) {
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (context instanceof AnonymousClass5a5) {
            this.A02 = (AnonymousClass5a5) context;
        }
    }

    public void A1K() {
        super.A1K();
        this.A02 = null;
    }

    public Dialog A27(Bundle bundle) {
        String str;
        Bundle A15 = A15();
        AnonymousClass1FL A1D = A1D();
        UserJid A04 = UserJid.Companion.A04(A15.getString("jid"));
        if (A04 != null) {
            AnonymousClass1M9 r0 = this.A00;
            if (r0 != null) {
                AnonymousClass1E7 A0H = r0.A0H(A04);
                AnonymousClass4bC r6 = new AnonymousClass4bC((Object) this, (Object) A04, 26);
                C73203Rj A002 = AnonymousClass4a6.A00(A1D);
                Object[] objArr = new Object[1];
                C24921Me r02 = this.A01;
                if (r02 != null) {
                    A002.A0S(AnonymousClass3MX.A16(this, AnonymousClass3MY.A0q(r02, A0H), objArr, 0, 2131895347));
                    C010105w A003 = C73203Rj.A00(r6, A002, 2131895337);
                    A003.setCanceledOnTouchOutside(true);
                    return A003;
                }
                str = "waContactNames";
            } else {
                str = "contactManager";
            }
            C18070vi.A11(str);
            throw null;
        }
        throw C17880vN.A0g();
    }
}
