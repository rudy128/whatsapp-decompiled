package com.whatsapp.group;

import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1KW;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C18600wl;
import X.C85094Mb;
import android.graphics.drawable.Drawable;

public final class KeyboardControllerViewModel extends AnonymousClass1J2 {
    public AnonymousClass1OB A00;
    public final AnonymousClass1DT A01 = AnonymousClass3MW.A0L();
    public final AnonymousClass1KW A02;
    public final C18600wl A03;

    public final void A0T(Drawable drawable, int i) {
        this.A01.A0E(new C85094Mb(drawable, i));
    }

    public KeyboardControllerViewModel(AnonymousClass1KW r2, C18600wl r3) {
        C18070vi.A0j(r2, r3);
        this.A02 = r2;
        this.A03 = r3;
    }
}
