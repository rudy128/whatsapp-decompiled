package X;

import android.os.Build;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.9v2  reason: invalid class name and case insensitive filesystem */
public abstract class C196429v2 {
    public static String A01(Locale locale, long j) {
        if (Build.VERSION.SDK_INT >= 24) {
            return A8Y.A03(locale).format(new Date(j));
        }
        DateFormat dateInstance = DateFormat.getDateInstance(2, locale);
        AnonymousClass8BV.A1P(dateInstance);
        return AnonymousClass8BU.A0r(dateInstance, j);
    }

    public static String A00(long j) {
        if (A8Y.A05().get(1) != AnonymousClass8BV.A0x(j).get(1)) {
            return A01(Locale.getDefault(), j);
        }
        Locale locale = Locale.getDefault();
        if (Build.VERSION.SDK_INT >= 24) {
            return A8Y.A01(locale).format(new Date(j));
        }
        DateFormat dateInstance = DateFormat.getDateInstance(2, locale);
        AnonymousClass8BV.A1P(dateInstance);
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) dateInstance;
        String pattern = simpleDateFormat.toPattern();
        int A00 = A8Y.A00(pattern, "yY", 1, 0);
        int length = pattern.length();
        if (A00 < length) {
            String str = "EMd";
            int A002 = A8Y.A00(pattern, str, 1, A00);
            if (A002 < length) {
                str = AnonymousClass000.A0y(",", AnonymousClass000.A11(str));
            }
            pattern = pattern.replace(pattern.substring(A8Y.A00(pattern, str, -1, A00) + 1, A002), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return AnonymousClass8BU.A0r(simpleDateFormat, j);
    }
}
