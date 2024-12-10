package X;

import android.content.SharedPreferences;

/* renamed from: X.1e7  reason: invalid class name and case insensitive filesystem */
public final class C30541e7 {
    public SharedPreferences A00;
    public final C18010vc A01;

    public C30541e7(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public static final synchronized SharedPreferences A00(C30541e7 r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A05("time_spent_logging_prefs");
                r2.A00 = sharedPreferences;
            }
            C18070vi.A0z(sharedPreferences, "null cannot be cast to non-null type android.content.SharedPreferences");
        }
        return sharedPreferences;
    }
}
