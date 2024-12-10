package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass1FL;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass5OI;
import X.C107595aH;
import X.C18070vi;
import X.C18100vl;
import X.C73203Rj;
import X.C88414Zp;
import X.C91614fy;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public final class RevokeNewsletterAdminInviteDialogFragment extends Hilt_RevokeNewsletterAdminInviteDialogFragment {
    public C107595aH A00;
    public final C18100vl A01 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new AnonymousClass5OI(this));
    public final C18100vl A02 = C88414Zp.A02(this, "arg_contact_name");

    public void A1x(Context context) {
        C107595aH r1;
        C18070vi.A0d(context, 0);
        super.A1x(context);
        if (this.A00 == null) {
            AnonymousClass1FL A1B = A1B();
            if (A1B instanceof C107595aH) {
                r1 = (C107595aH) A1B;
            } else {
                r1 = null;
            }
            this.A00 = r1;
        }
    }

    public void A1K() {
        super.A1K();
        this.A00 = null;
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        C18100vl r4 = this.A02;
        A03.A0k(AnonymousClass3MX.A16(this, r4.getValue(), new Object[1], 0, 2131895341));
        A03.A0S(AnonymousClass3MX.A16(this, r4.getValue(), new Object[1], 0, 2131895339));
        A03.A0g(this, new C91614fy(this, 0), 2131895340);
        A03.A0e(this, new C91614fy(this, 1), 2131898766);
        return AnonymousClass3MY.A0L(A03);
    }
}
