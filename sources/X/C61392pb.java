package X;

import android.content.SharedPreferences;

/* renamed from: X.2pb  reason: invalid class name and case insensitive filesystem */
public class C61392pb {
    public C18010vc A00;
    public volatile SharedPreferences A01;

    public static SharedPreferences A00(C61392pb r2) {
        if (r2.A01 == null) {
            synchronized (r2) {
                if (r2.A01 == null) {
                    r2.A01 = r2.A00.A05("preloads_prefs");
                }
            }
        }
        return r2.A01;
    }
}
