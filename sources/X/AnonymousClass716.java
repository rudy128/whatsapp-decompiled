package X;

import android.content.SharedPreferences;

/* renamed from: X.716  reason: invalid class name */
public final class AnonymousClass716 {
    public SharedPreferences A00;
    public final C18010vc A01;

    public AnonymousClass716(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public static final SharedPreferences A00(AnonymousClass716 r3) {
        if (r3.A00 == null) {
            synchronized (AnonymousClass716.class) {
                if (r3.A00 == null) {
                    r3.A00 = r3.A01.A05("xfamily_crossposting_prefs");
                }
            }
        }
        SharedPreferences sharedPreferences = r3.A00;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        throw C17880vN.A0g();
    }

    public static SharedPreferences A01(AnonymousClass00H r0) {
        return A00((AnonymousClass716) r0.get());
    }
}
