package X;

import android.content.SharedPreferences;

/* renamed from: X.1Bc  reason: invalid class name */
public class AnonymousClass1Bc {
    public SharedPreferences A00;
    public final AnonymousClass11P A01;
    public final C18010vc A02;

    public static synchronized SharedPreferences A00(AnonymousClass1Bc r2) {
        SharedPreferences sharedPreferences;
        synchronized (r2) {
            sharedPreferences = r2.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r2.A02.A05("core_health_event_pref_file");
                r2.A00 = sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public AnonymousClass1Bc(AnonymousClass11P r1, C18010vc r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
