package X;

import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;

public abstract class A8Y {
    public static AtomicReference A00 = new AtomicReference();

    public static int A00(String str, String str2, int i, int i2) {
        while (i2 >= 0) {
            int length = str.length();
            if (i2 >= length || str2.indexOf(str.charAt(i2)) != -1) {
                break;
            }
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0) {
                        break;
                    } else if (i2 >= length) {
                        break;
                    }
                } while (str.charAt(i2) == '\'');
            }
            i2 += i;
        }
        return i2;
    }

    public static DateFormat A01(Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMd", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    public static DateFormat A02(Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("MMMEd", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    public static DateFormat A03(Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMd", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    public static DateFormat A04(Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMEd", locale);
        instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
        return instanceForSkeleton;
    }

    public static Calendar A07(Calendar calendar) {
        Calendar instance = Calendar.getInstance(java.util.TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            instance.clear();
            return instance;
        }
        instance.setTimeInMillis(calendar.getTimeInMillis());
        return instance;
    }

    public static Calendar A05() {
        Calendar instance = Calendar.getInstance();
        instance.set(11, 0);
        AnonymousClass8BV.A1Q(instance, 12, 0);
        instance.set(14, 0);
        instance.setTimeZone(java.util.TimeZone.getTimeZone("UTC"));
        return instance;
    }

    public static Calendar A06(Calendar calendar) {
        Calendar A07 = A07(calendar);
        Calendar A072 = A07((Calendar) null);
        A072.set(A07.get(1), A07.get(2), AnonymousClass8BT.A02(A07));
        return A072;
    }
}
