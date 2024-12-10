package com.whatsapp.consent.common;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass7AO;
import X.C149547jE;
import X.C149557jF;
import X.C149567jG;
import X.C155577sy;
import X.C155587sz;
import X.C18100vl;
import X.C73203Rj;
import X.C99274sY;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.consent.ConsentNavigationViewModel;

public final class NonRecoverableErrorDialog extends Hilt_NonRecoverableErrorDialog {
    public final C18100vl A00;

    public NonRecoverableErrorDialog() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C149557jF(new C149547jE(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ConsentNavigationViewModel.class);
        this.A00 = C99274sY.A00(new C149567jG(A002), new C155587sz(this, A002), new C155577sy(A002), A15);
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0E(2131886572);
        A03.A0D(2131886573);
        A03.A0g(this, new AnonymousClass7AO(this, 3), 2131886571);
        return AnonymousClass3MY.A0L(A03);
    }
}
