package X;

import android.content.SharedPreferences;

/* renamed from: X.1de  reason: invalid class name and case insensitive filesystem */
public final class C30261de {
    public final C18030ve A00;
    public final C19830z4 A01;

    public C30261de(C19830z4 r2, C18030ve r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A00 = r3;
        this.A01 = r2;
    }

    public final void A00() {
        if (C18020vd.A05(C18040vf.A02, this.A00, 8841)) {
            ((SharedPreferences) this.A01.A00.get()).edit().putBoolean("pref_unread_message_clear_notification", false).apply();
        }
    }

    public final boolean A01() {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 8841) || ((SharedPreferences) this.A01.A00.get()).getBoolean("pref_unread_message_clear_notification", true)) {
            return true;
        }
        return false;
    }
}
