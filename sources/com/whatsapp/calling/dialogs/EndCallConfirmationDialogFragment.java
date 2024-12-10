package com.whatsapp.calling.dialogs;

import X.AnonymousClass00H;
import X.AnonymousClass1F9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.C18100vl;
import X.C73203Rj;
import X.C88414Zp;
import X.C91494fm;
import X.C91574fu;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

public final class EndCallConfirmationDialogFragment extends Hilt_EndCallConfirmationDialogFragment {
    public AnonymousClass00H A00;
    public final AnonymousClass1F9 A01;

    public Dialog A27(Bundle bundle) {
        C18100vl A02 = C88414Zp.A02(this, "message");
        Context A14 = A14();
        C73203Rj A002 = AnonymousClass4a6.A00(A14);
        A002.A0S(AnonymousClass3MW.A0y(A02));
        A002.A0T(true);
        AnonymousClass1F9 r3 = this.A01;
        A002.A0g(r3, new C91574fu(this, 13), 2131887451);
        A002.A0e(r3, new C91494fm(A14, this, 0), 2131891183);
        return AnonymousClass3MY.A0L(A002);
    }

    public EndCallConfirmationDialogFragment(AnonymousClass1F9 r1) {
        this.A01 = r1;
    }
}
