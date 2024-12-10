package X;

import android.content.SharedPreferences;

/* renamed from: X.1ed  reason: invalid class name and case insensitive filesystem */
public abstract class C30861ed {
    public static final boolean A00(AnonymousClass11P r6, C19830z4 r7) {
        String string;
        C18070vi.A0d(r6, 0);
        C18070vi.A0d(r7, 1);
        long A01 = AnonymousClass11P.A01(r6);
        AnonymousClass00H r4 = r7.A00;
        if (A01 >= ((SharedPreferences) r4.get()).getLong("device_switching_code_expiry", 0) || (string = ((SharedPreferences) r4.get()).getString("device_switching_code", (String) null)) == null || string.length() == 0) {
            return false;
        }
        return true;
    }
}
