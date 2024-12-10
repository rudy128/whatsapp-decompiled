package X;

import android.content.SharedPreferences;

/* renamed from: X.1lU  reason: invalid class name and case insensitive filesystem */
public class C35001lU {
    public final C18010vc A00;
    public volatile SharedPreferences A01;

    public static SharedPreferences A00(C35001lU r3) {
        if (r3.A01 == null) {
            synchronized (C35001lU.class) {
                if (r3.A01 == null) {
                    r3.A01 = r3.A00.A05("fb_credentials_prefs");
                }
            }
        }
        return r3.A01;
    }

    public void A01(String str) {
        synchronized (C35001lU.class) {
            A00(this).edit().putString("pref_fb_user_credentials_encrypted", str).apply();
        }
    }

    public C35001lU(C18010vc r1) {
        this.A00 = r1;
    }
}
