package X;

import android.os.PowerManager;
import android.view.Window;
import android.view.WindowManager;

/* renamed from: X.9no  reason: invalid class name and case insensitive filesystem */
public final class C192109no {
    public float A00 = -1.0f;

    public final void A00(Window window) {
        C18070vi.A0d(window, 0);
        window.clearFlags(128);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = this.A00;
        window.setAttributes(attributes);
    }

    public final void A01(Window window, AnonymousClass11C r4) {
        C18070vi.A0h(r4, window);
        WindowManager.LayoutParams attributes = window.getAttributes();
        this.A00 = attributes.screenBrightness;
        PowerManager A0G = r4.A0G();
        if (A0G != null && !A0G.isPowerSaveMode()) {
            window.addFlags(128);
            attributes.screenBrightness = 1.0f;
            window.setAttributes(attributes);
        }
    }
}
