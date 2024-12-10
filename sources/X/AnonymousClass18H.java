package X;

import android.content.SharedPreferences;

/* renamed from: X.18H  reason: invalid class name */
public final class AnonymousClass18H {
    public final C18100vl A00;
    public final C18100vl A01;

    public AnonymousClass18H(C18010vc r3) {
        C18070vi.A0d(r3, 1);
        this.A00 = new C18110vm(new AnonymousClass18I(r3));
        this.A01 = new C18110vm(new AnonymousClass18J(r3));
    }

    public final synchronized void A00(boolean z) {
        if (AnonymousClass1Es.A00(this) >= 2) {
            SharedPreferences sharedPreferences = (SharedPreferences) this.A00.getValue();
            C18070vi.A0X(sharedPreferences);
            sharedPreferences.edit().putBoolean("wam_is_current_buffer_real_time", z).apply();
        } else {
            SharedPreferences sharedPreferences2 = (SharedPreferences) this.A01.getValue();
            C18070vi.A0X(sharedPreferences2);
            sharedPreferences2.edit().putBoolean("wam_is_current_buffer_real_time", z).apply();
        }
    }
}
