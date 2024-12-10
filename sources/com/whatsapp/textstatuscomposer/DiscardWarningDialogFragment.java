package com.whatsapp.textstatuscomposer;

import X.AnonymousClass3MY;
import X.AnonymousClass4a6;
import X.AnonymousClass758;
import X.C1412574x;
import X.C73203Rj;
import android.app.Dialog;
import android.os.Bundle;
import com.whatsapp.statuscomposer.composer.TextStatusComposerFragment;

public final class DiscardWarningDialogFragment extends Hilt_DiscardWarningDialogFragment {
    public TextStatusComposerFragment A00;

    public Dialog A27(Bundle bundle) {
        Bundle A15 = A15();
        boolean z = A15.getBoolean("back_button_pressed", false);
        int i = A15.getInt("content", 1);
        int i2 = 2131898093;
        if (i == 1) {
            i2 = 2131896818;
        }
        C73203Rj A03 = AnonymousClass4a6.A03(this);
        A03.A0D(i2);
        A03.setNegativeButton(2131898766, new AnonymousClass758(this, 35));
        A03.setPositiveButton(2131896819, new C1412574x(this, i, z));
        return AnonymousClass3MY.A0L(A03);
    }
}
