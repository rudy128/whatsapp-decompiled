package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass4a6;
import X.C73203Rj;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

public class WallpaperDownloadFailedDialogFragment extends Hilt_WallpaperDownloadFailedDialogFragment {
    public Dialog A27(Bundle bundle) {
        int i = A15().getInt("ERROR_STATE_KEY");
        C73203Rj A02 = AnonymousClass4a6.A02(this);
        A02.A0E(2131898441);
        int i2 = 2131898439;
        if (i == 5) {
            i2 = 2131898440;
        }
        A02.A0D(i2);
        A02.setPositiveButton(2131899286, (DialogInterface.OnClickListener) null);
        A02.A0T(false);
        return A02.create();
    }
}
