package X;

import android.os.Build;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Cne  reason: case insensitive filesystem */
public abstract class C25870Cne {
    public static boolean A01(char c, char c2, char c3) {
        if (!"samsung".equals(Build.MANUFACTURER)) {
            return false;
        }
        String str = Build.FINGERPRINT;
        int indexOf = str.indexOf(":user/");
        if (indexOf == -1) {
            indexOf = str.indexOf(":userdebug/");
        }
        if (indexOf == -1) {
            indexOf = str.indexOf(":eng/");
        }
        if (indexOf < 3) {
            return false;
        }
        char charAt = str.charAt(indexOf - 3);
        char charAt2 = str.charAt(indexOf - 2);
        char charAt3 = str.charAt(indexOf - 1);
        if (charAt <= c) {
            if (charAt != c) {
                return false;
            }
            if (charAt2 <= c2) {
                if (charAt2 != c2 || charAt3 < c3) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static boolean A02(Set set) {
        if (set.contains(C26008CqP.A03) || set.contains(C26008CqP.A04)) {
            return true;
        }
        return false;
    }

    public static HashSet A00(Object... objArr) {
        HashSet A12 = C17880vN.A12();
        for (Object add : objArr) {
            A12.add(add);
        }
        return A12;
    }
}
