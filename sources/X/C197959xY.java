package X;

import android.content.SharedPreferences;

/* renamed from: X.9xY  reason: invalid class name and case insensitive filesystem */
public class C197959xY {
    public SharedPreferences A00;
    public final C18010vc A01;

    public static synchronized SharedPreferences A00(C197959xY r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A05("google_migrate_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C197959xY(C18010vc r1) {
        this.A01 = r1;
    }
}
