package com.whatsapp.bot.onboarding;

import X.AnonymousClass1D6;
import X.AnonymousClass1KB;
import X.AnonymousClass3MY;
import X.AnonymousClass9O6;
import X.C1408073d;
import X.C18070vi;
import android.content.DialogInterface;

public abstract class CustomBotTosBottomSheet extends Hilt_CustomBotTosBottomSheet {
    public AnonymousClass1KB A00;
    public C1408073d A01;

    public void onDismiss(DialogInterface dialogInterface) {
        C18070vi.A0d(dialogInterface, 0);
        AnonymousClass1D6[] r2 = new AnonymousClass1D6[1];
        AnonymousClass1D6.A03("CUSTOM_TOS_UI_DISMISS_RESULT_KEY", true, r2, 0);
        AnonymousClass3MY.A16(AnonymousClass9O6.A00(r2), this, "CUSTOM_TOS_UI_REQUEST_KEY");
        super.onDismiss(dialogInterface);
    }
}
