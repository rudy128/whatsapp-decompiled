package com.whatsapp.consent;

import X.AnonymousClass00R;
import X.AnonymousClass1DF;
import X.AnonymousClass20F;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass7AN;
import X.AnonymousClass7AO;
import X.C149447j4;
import X.C149457j5;
import X.C149467j6;
import X.C155557sw;
import X.C155567sx;
import X.C18100vl;
import X.C73203Rj;
import X.C99274sY;
import android.app.Dialog;
import android.os.Bundle;

public final class YouthConsentDialog extends Hilt_YouthConsentDialog {
    public final C18100vl A00;

    public YouthConsentDialog() {
        C18100vl A002 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C149457j5(new C149447j4(this)));
        AnonymousClass20F A15 = AnonymousClass3MW.A15(ConsentNavigationViewModel.class);
        this.A00 = C99274sY.A00(new C149467j6(A002), new C155567sx(this, A002), new C155557sw(A002), A15);
    }

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0E(2131898606);
        A03.A0D(2131898607);
        A03.A0g(this, new AnonymousClass7AN(this, 49), 2131898608);
        A03.A0e(this, new AnonymousClass7AO(this, 0), 2131898605);
        return AnonymousClass3MY.A0L(A03);
    }
}
