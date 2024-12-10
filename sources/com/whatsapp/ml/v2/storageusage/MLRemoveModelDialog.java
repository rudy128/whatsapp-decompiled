package com.whatsapp.ml.v2.storageusage;

import X.AnonymousClass1F9;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.C18100vl;
import X.C73203Rj;
import X.C85164Mi;
import X.C88414Zp;
import X.C91604fx;
import android.app.Dialog;
import android.os.Bundle;

public final class MLRemoveModelDialog extends Hilt_MLRemoveModelDialog {
    public C85164Mi A00;
    public final AnonymousClass1F9 A01;

    public MLRemoveModelDialog(AnonymousClass1F9 r1) {
        this.A01 = r1;
    }

    public Dialog A27(Bundle bundle) {
        super.A27(bundle);
        C18100vl A02 = C88414Zp.A02(this, "ml_scope_storage_dialog_title");
        C18100vl A022 = C88414Zp.A02(this, "ml_scope_storage_dialog_message");
        C73203Rj A012 = AnonymousClass4a6.A01(A14(), 2132083642);
        A012.A0k(AnonymousClass3MW.A0y(A02));
        A012.A0S(AnonymousClass3MW.A0y(A022));
        A012.A0T(true);
        String A1H = A1H(2131899361);
        AnonymousClass1F9 r3 = this.A01;
        A012.A0i(r3, new C91604fx(this, 46), A1H);
        A012.A0h(r3, new C91604fx(this, 47), A1H(2131899360));
        return AnonymousClass3MY.A0L(A012);
    }
}
