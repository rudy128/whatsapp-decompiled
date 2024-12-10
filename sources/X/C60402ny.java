package X;

import android.util.Pair;

/* renamed from: X.2ny  reason: invalid class name and case insensitive filesystem */
public abstract class C60402ny {
    public static final boolean A01(String str, String str2) {
        String str3 = str2;
        int length = str2.length();
        String str4 = str;
        if (!str4.regionMatches(true, 0, str3, 0, length) || !str4.regionMatches(length, "://", 0, 3)) {
            return false;
        }
        return true;
    }

    public static final Pair A00(CharSequence charSequence, int i, int i2) {
        if (i != 0 && charSequence.charAt(i - 1) == '@') {
            return null;
        }
        if (charSequence.length() <= i2 || charSequence.charAt(i2) != '/') {
            while (AnonymousClass1YF.A0C(".,!?", charSequence.charAt(i2 - 1), 0, false) != -1) {
                i2--;
            }
        } else {
            i2++;
        }
        return AnonymousClass712.A00(C17890vO.A0E(Integer.valueOf(i), i2), AnonymousClass712.A01, charSequence);
    }
}
