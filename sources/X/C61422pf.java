package X;

import android.content.SharedPreferences;

/* renamed from: X.2pf  reason: invalid class name and case insensitive filesystem */
public final class C61422pf {
    public SharedPreferences A00;
    public final C18010vc A01;

    public C61422pf(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public static final SharedPreferences A00(C61422pf r3) {
        if (r3.A00 == null) {
            synchronized (C61422pf.class) {
                if (r3.A00 == null) {
                    r3.A00 = r3.A01.A05("xfamily_fb_account_file");
                }
            }
        }
        SharedPreferences sharedPreferences = r3.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw C17880vN.A0g();
    }
}
