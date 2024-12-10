package com.whatsapp.gallery;

import X.AnonymousClass02B;
import X.AnonymousClass1YL;
import X.C18070vi;
import X.C28281Zt;
import android.content.Intent;
import com.whatsapp.gallerypicker.MediaPicker;

public final class NewMediaPicker extends MediaPicker {
    public void C82(AnonymousClass02B r3) {
        C18070vi.A0d(r3, 0);
        super.C82(r3);
        C28281Zt.A05(this, AnonymousClass1YL.A00(this, 2130969990, 2131101076));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1 && (i == 1 || i == 36)) {
            setResult(-1, intent);
            finish();
            return;
        }
        super.onActivityResult(i, i2, intent);
    }
}
