package X;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* renamed from: X.6WH  reason: invalid class name */
public abstract class AnonymousClass6WH {
    public static final String A00(int i, int i2, int i3) {
        String str;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (i2 < 0 || i2 >= 12 || 1 > i3 || i3 >= 32) {
            gregorianCalendar.setTime(new Date(System.currentTimeMillis()));
            gregorianCalendar.set(1, i);
            str = "yyyy";
        } else {
            gregorianCalendar.set(i, i2, i3);
            str = "yyyy-MM-dd";
        }
        String format = new SimpleDateFormat(str, Locale.US).format(gregorianCalendar.getTime());
        C18070vi.A0b(format);
        return format;
    }
}
