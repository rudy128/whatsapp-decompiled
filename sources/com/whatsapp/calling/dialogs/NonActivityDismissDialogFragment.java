package com.whatsapp.calling.dialogs;

import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass757;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.base.WaDialogFragment;

public final class NonActivityDismissDialogFragment extends WaDialogFragment {
    public Dialog A27(Bundle bundle) {
        Bundle A15 = A15();
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0S(A15.getString("text"));
        A03.A0T(true);
        if (A15.getBoolean("dismiss", false)) {
            A03.setPositiveButton(2131899286, AnonymousClass757.A00(this, 8));
        }
        return AnonymousClass3MY.A0L(A03);
    }
}
