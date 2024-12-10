package com.whatsapp.biz.product.view.fragment;

import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass757;
import X.B7R;
import X.C20151A9n;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;

public final class ReportProductDialogFragment extends Hilt_ReportProductDialogFragment {
    public B7R A00;

    public Dialog A27(Bundle bundle) {
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0E(2131887994);
        A03.A0D(2131887992);
        A03.setPositiveButton(2131898774, new C20151A9n(this, 23));
        A03.setNegativeButton(2131898766, AnonymousClass757.A00(this, 4));
        return AnonymousClass3MY.A0L(A03);
    }
}
