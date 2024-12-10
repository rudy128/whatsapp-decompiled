package X;

import android.content.SharedPreferences;

/* renamed from: X.6xw  reason: invalid class name and case insensitive filesystem */
public final class C138936xw {
    public SharedPreferences A00;
    public final C18010vc A01;

    public C138936xw(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public static final synchronized SharedPreferences A00(C138936xw r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A05("wabai_consent_prefs");
                r2.A00 = sharedPreferences;
            }
            if (sharedPreferences == null) {
                C18070vi.A11("prefs");
                throw null;
            }
        }
        return sharedPreferences;
    }

    public final void A01(String str) {
        String str2;
        SharedPreferences.Editor edit = A00(this).edit();
        if (str.equals("biz_bot")) {
            edit.remove("consent_status");
            edit.remove("consent_last_fetch_timestamp");
            str2 = "consent_last_dismissed_timestamp";
        } else {
            if (str.equals("meta_ai_biz")) {
                str2 = "consent_status_meta_ai_biz";
            }
            edit.apply();
        }
        edit.remove(str2);
        edit.apply();
    }
}
