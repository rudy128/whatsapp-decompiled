package com.whatsapp.voipcalling;

import X.AnonymousClass129;
import X.AnonymousClass1L8;
import X.AnonymousClass4a6;
import X.C73203Rj;
import X.C88814ar;
import android.app.Dialog;
import android.os.Bundle;

public class WASecuredDialogFragment extends Hilt_WASecuredDialogFragment {
    public AnonymousClass1L8 A00;
    public AnonymousClass129 A01;

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0D(2131894767);
        A03.setNegativeButton(2131899286, new C88814ar(this, 38));
        A03.A0Y(new C88814ar(this, 39), 2131899101);
        return A03.create();
    }
}
