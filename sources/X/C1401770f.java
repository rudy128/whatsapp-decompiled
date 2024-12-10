package X;

import android.os.Build;
import java.util.Locale;

/* renamed from: X.70f  reason: invalid class name and case insensitive filesystem */
public abstract class C1401770f {
    static {
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass6VG.A00(30);
            AnonymousClass6VG.A00(31);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass6VG.A00(33);
        }
        if (Build.VERSION.SDK_INT >= 30) {
            AnonymousClass6VG.A00(1000000);
        }
    }

    public static final boolean A00() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        if (i < 32) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        C18070vi.A0Z(str);
        if ("REL".equals(str)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = str.toUpperCase(locale);
        C18070vi.A0X(upperCase);
        String upperCase2 = "Tiramisu".toUpperCase(locale);
        C18070vi.A0X(upperCase2);
        if (upperCase.compareTo(upperCase2) >= 0) {
            return true;
        }
        return false;
    }

    public static final boolean A01() {
        if (Build.VERSION.SDK_INT >= 34) {
            String str = Build.VERSION.CODENAME;
            C18070vi.A0Z(str);
            if (!"REL".equals(str)) {
                Locale locale = Locale.ROOT;
                String upperCase = str.toUpperCase(locale);
                C18070vi.A0X(upperCase);
                String upperCase2 = "VanillaIceCream".toUpperCase(locale);
                C18070vi.A0X(upperCase2);
                if (upperCase.compareTo(upperCase2) < 0) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
