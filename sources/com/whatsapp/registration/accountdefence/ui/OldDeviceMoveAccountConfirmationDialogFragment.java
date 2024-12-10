package com.whatsapp.registration.accountdefence.ui;

import X.AnonymousClass000;
import X.AnonymousClass3MX;
import X.AnonymousClass3QU;
import X.AnonymousClass4a6;
import X.AnonymousClass4bB;
import X.C1411874q;
import X.C183559Ys;
import X.C73203Rj;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import java.util.ArrayList;

public class OldDeviceMoveAccountConfirmationDialogFragment extends Hilt_OldDeviceMoveAccountConfirmationDialogFragment {
    public final C183559Ys A00;

    public OldDeviceMoveAccountConfirmationDialogFragment(C183559Ys r1) {
        this.A00 = r1;
    }

    public Dialog A27(Bundle bundle) {
        Context A14 = A14();
        ArrayList A13 = AnonymousClass000.A13();
        String A1H = A1H(2131886326);
        String A1H2 = A1H(2131886324);
        C73203Rj A04 = AnonymousClass4a6.A04(this);
        A04.A0c(new AnonymousClass3QU(A14, (LinearLayout.LayoutParams) null, (Integer) null, (Integer) null, 20, (Integer) null, A1H, A1H2, A13));
        AnonymousClass4bB.A00(A04, this, 47, 2131886325);
        return AnonymousClass3MX.A0N(new C1411874q(33), A04, 2131898766);
    }
}
