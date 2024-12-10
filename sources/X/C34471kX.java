package X;

import android.content.SharedPreferences;

/* renamed from: X.1kX  reason: invalid class name and case insensitive filesystem */
public class C34471kX {
    public SharedPreferences A00;
    public final C18010vc A01;

    public static synchronized SharedPreferences A00(C34471kX r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A01.A05("daily_metrics_prefs");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public C34471kX(C18010vc r1) {
        this.A01 = r1;
    }
}
