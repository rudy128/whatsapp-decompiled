package X;

import android.content.SharedPreferences;

/* renamed from: X.1lZ  reason: invalid class name and case insensitive filesystem */
public final class C35051lZ {
    public SharedPreferences A00;
    public final AnonymousClass11P A01;
    public final C18010vc A02;

    public C35051lZ(AnonymousClass11P r2, C18010vc r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void A01() {
        SharedPreferences.Editor edit = A00(this).edit();
        C18070vi.A0X(edit);
        edit.putBoolean("is_wfal_link_active", true).apply();
    }

    public static final SharedPreferences A00(C35051lZ r3) {
        if (r3.A00 == null) {
            synchronized (C35051lZ.class) {
                if (r3.A00 == null) {
                    r3.A00 = r3.A02.A05("account_linking_prefs");
                }
            }
        }
        SharedPreferences sharedPreferences = r3.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A02(long j) {
        SharedPreferences.Editor edit = A00(this).edit();
        C18070vi.A0X(edit);
        edit.putLong("pref_ping_validity_time", (AnonymousClass11P.A01(this.A01) / 1000) + j).apply();
    }
}
