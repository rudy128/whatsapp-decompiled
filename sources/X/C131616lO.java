package X;

import android.content.Context;
import android.provider.Settings;

/* renamed from: X.6lO  reason: invalid class name and case insensitive filesystem */
public final class C131616lO {
    public final C18030ve A00;

    public C131616lO(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A00(Context context) {
        if (Settings.System.getFloat(context.getContentResolver(), "font_scale", 1.0f) < 1.5f) {
            if (!C18020vd.A05(C18040vf.A02, this.A00, 7686)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
