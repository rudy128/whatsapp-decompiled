package X;

import android.content.SharedPreferences;

/* renamed from: X.1TK  reason: invalid class name */
public final class AnonymousClass1TK {
    public final C19830z4 A00;
    public final C18010vc A01;
    public final C18100vl A02 = new C18110vm(new C71023Dm(this, 22));

    public AnonymousClass1TK(C19830z4 r3, C18010vc r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
        Boolean bool = C17960vV.A01;
    }

    public static final void A00(AnonymousClass1TK r5, String str) {
        C18100vl r52 = r5.A02;
        ((SharedPreferences) r52.getValue()).edit().putLong(str, ((SharedPreferences) r52.getValue()).getLong(str, 0) + 1).apply();
    }

    public final void A01() {
        ((SharedPreferences) this.A00.A00.get()).edit().putBoolean("chat_lock_broken_encoding_checked", true).apply();
    }

    public void A02(boolean z) {
        ((SharedPreferences) this.A00.A00.get()).edit().putBoolean("lock_folder_hidden", z).apply();
    }

    public final void A03(boolean z) {
        ((SharedPreferences) this.A00.A00.get()).edit().putBoolean("does_user_have_passcode", z).apply();
    }

    public boolean A04() {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("lock_folder_hidden", false);
    }

    public final boolean A05() {
        return ((SharedPreferences) this.A00.A00.get()).getBoolean("does_user_have_passcode", false);
    }
}
