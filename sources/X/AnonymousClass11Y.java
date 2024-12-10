package X;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.11Y  reason: invalid class name */
public final class AnonymousClass11Y {
    public static final String A01(C18000vb r3, long j) {
        C18070vi.A0d(r3, 0);
        String A08 = r3.A08(172);
        C18070vi.A0X(A08);
        String format = new SimpleDateFormat(A08, r3.A0N()).format(new Date(j));
        C18070vi.A0X(format);
        return format;
    }

    public final String A05(C18000vb r3) {
        C18070vi.A0d(r3, 0);
        Locale A0N = r3.A0N();
        C18070vi.A0X(A0N);
        String A08 = r3.A08(298);
        C18070vi.A0X(A08);
        return A02(A0N, A08);
    }

    public final String A06(C18000vb r4, long j) {
        C18070vi.A0d(r4, 0);
        DateFormat dateFormat = r4.A03;
        if (dateFormat == null) {
            Locale A0N = r4.A0N();
            C18070vi.A0X(A0N);
            dateFormat = new SimpleDateFormat(android.text.format.DateFormat.getBestDateTimePattern(A0N, "MMMd"), A0N);
            r4.A03 = dateFormat;
        }
        Object clone = dateFormat.clone();
        C18070vi.A0z(clone, "null cannot be cast to non-null type java.text.DateFormat");
        String format = ((DateFormat) clone).format(new Date(j));
        C18070vi.A0X(format);
        return format;
    }

    public final String A07(C18000vb r3, long j) {
        C18070vi.A0d(r3, 0);
        DateFormat dateFormat = AnonymousClass11X.A02;
        if (dateFormat == null) {
            dateFormat = DateFormat.getDateInstance(2, r3.A0N());
            AnonymousClass11X.A02 = dateFormat;
        }
        Object clone = dateFormat.clone();
        C18070vi.A0z(clone, "null cannot be cast to non-null type java.text.DateFormat");
        String format = ((DateFormat) clone).format(new Date(j));
        C18070vi.A0X(format);
        return format;
    }

    public final String A08(C18000vb r3, long j) {
        C18070vi.A0d(r3, 0);
        Calendar instance = Calendar.getInstance(r3.A0N());
        instance.setTimeInMillis(j);
        return A00(r3, instance.get(7));
    }

    public final String A09(C18000vb r3, long j) {
        C18070vi.A0d(r3, 0);
        String format = A04(r3, 0).format(new Date(j));
        C18070vi.A0X(format);
        return format;
    }

    public final String A0A(C18000vb r6, long j) {
        DateFormat A04;
        C18070vi.A0d(r6, 0);
        Locale A0N = r6.A0N();
        C18070vi.A0X(A0N);
        Calendar instance = Calendar.getInstance(A0N);
        instance.setTimeInMillis(j);
        if (instance.get(1) == Calendar.getInstance(A0N).get(1)) {
            A04 = A03(r6);
        } else {
            A04 = A04(r6, 0);
        }
        String format = A04.format(instance.getTime());
        C18070vi.A0X(format);
        return format;
    }

    public final String A0B(C18000vb r3, long j) {
        C18070vi.A0d(r3, 0);
        DateFormat dateFormat = AnonymousClass11X.A01;
        if (dateFormat == null) {
            dateFormat = DateFormat.getDateInstance(3, r3.A0N());
            AnonymousClass11X.A01 = dateFormat;
        }
        Object clone = dateFormat.clone();
        C18070vi.A0z(clone, "null cannot be cast to non-null type java.text.DateFormat");
        String format = ((DateFormat) clone).format(new Date(j));
        C18070vi.A0X(format);
        return format;
    }

    public static final DateFormat A03(C18000vb r6) {
        String[] A00;
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        DateFormat dateFormat = r6.A02;
        SimpleDateFormat simpleDateFormat3 = dateFormat;
        if (dateFormat == null) {
            Locale A0N = r6.A0N();
            C18070vi.A0X(A0N);
            String A08 = r6.A08(174);
            C18070vi.A0X(A08);
            if (AnonymousClass1YF.A0Y(A08, "MMMM", false)) {
                A00 = C62902sB.A01(r6, 0);
                simpleDateFormat2 = new SimpleDateFormat(A08, A0N);
            } else if (AnonymousClass1YF.A0Y(A08, "LLLL", false)) {
                String A07 = AnonymousClass1YE.A07(A08, "LLLL", "MMMM", false);
                A00 = C62902sB.A00(r6);
                simpleDateFormat2 = new SimpleDateFormat(A07, A0N);
            } else {
                simpleDateFormat = new SimpleDateFormat(A08, A0N);
                r6.A02 = simpleDateFormat;
                simpleDateFormat3 = simpleDateFormat;
            }
            DateFormatSymbols dateFormatSymbols = simpleDateFormat2.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A00);
            simpleDateFormat2.setDateFormatSymbols(dateFormatSymbols);
            simpleDateFormat = simpleDateFormat2;
            r6.A02 = simpleDateFormat;
            simpleDateFormat3 = simpleDateFormat;
        }
        Object clone = simpleDateFormat3.clone();
        C18070vi.A0z(clone, "null cannot be cast to non-null type java.text.DateFormat");
        return (DateFormat) clone;
    }

    public static final DateFormat A04(C18000vb r7, int i) {
        DateFormat[] dateFormatArr = AnonymousClass11X.A03;
        if (dateFormatArr == null) {
            Locale A0N = r7.A0N();
            C18070vi.A0X(A0N);
            String A08 = r7.A08(169);
            C18070vi.A0X(A08);
            String[] A01 = C62902sB.A01(r7, 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(A08, A0N);
            DateFormatSymbols dateFormatSymbols = simpleDateFormat.getDateFormatSymbols();
            dateFormatSymbols.setMonths(A01);
            simpleDateFormat.setDateFormatSymbols(dateFormatSymbols);
            String[] A012 = C62902sB.A01(r7, 1);
            SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(A08, A0N);
            DateFormatSymbols dateFormatSymbols2 = simpleDateFormat2.getDateFormatSymbols();
            dateFormatSymbols2.setMonths(A012);
            simpleDateFormat2.setDateFormatSymbols(dateFormatSymbols2);
            String[] A013 = C62902sB.A01(r7, 2);
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat(A08, A0N);
            DateFormatSymbols dateFormatSymbols3 = simpleDateFormat3.getDateFormatSymbols();
            dateFormatSymbols3.setMonths(A013);
            simpleDateFormat3.setDateFormatSymbols(dateFormatSymbols3);
            dateFormatArr = new DateFormat[]{simpleDateFormat, simpleDateFormat2, simpleDateFormat3};
            AnonymousClass11X.A03 = dateFormatArr;
        }
        Object clone = dateFormatArr[i].clone();
        C18070vi.A0z(clone, "null cannot be cast to non-null type java.text.DateFormat");
        return (DateFormat) clone;
    }

    public static final String A00(C18000vb r3, int i) {
        int i2;
        switch (i) {
            case 1:
                i2 = 205;
                break;
            case 2:
                i2 = 203;
                break;
            case 3:
                i2 = 207;
                break;
            case 4:
                i2 = 208;
                break;
            case 5:
                i2 = 206;
                break;
            case 6:
                i2 = 202;
                break;
            case 7:
                i2 = 204;
                break;
            default:
                throw new AssertionError("Unreachable code");
        }
        String A08 = r3.A08(i2);
        C18070vi.A0X(A08);
        if (!"titlecase-firstword".equals(r3.A08(274))) {
            return A08;
        }
        Locale A0N = r3.A0N();
        C18070vi.A0X(A0N);
        return A02(A0N, A08);
    }

    public static final String A02(Locale locale, String str) {
        int i;
        int length = str.length();
        if (length == 0) {
            return str;
        }
        String language = locale.getLanguage();
        int codePointAt = str.codePointAt(0);
        if (codePointAt == 105) {
            if ("tr".equals(language) || "az".equals(language)) {
                i = 304;
                StringBuilder sb = new StringBuilder();
                sb.appendCodePoint(i);
                String substring = str.substring(Character.charCount(codePointAt));
                C18070vi.A0X(substring);
                sb.append(substring);
                String obj = sb.toString();
                C18070vi.A0X(obj);
                return obj;
            } else if (length >= 2 && str.charAt(1) == 'j' && "nl".equals(language)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("IJ");
                String substring2 = str.substring(2);
                C18070vi.A0X(substring2);
                sb2.append(substring2);
                return sb2.toString();
            }
        }
        i = Character.toTitleCase(codePointAt);
        StringBuilder sb3 = new StringBuilder();
        sb3.appendCodePoint(i);
        String substring3 = str.substring(Character.charCount(codePointAt));
        C18070vi.A0X(substring3);
        sb3.append(substring3);
        String obj2 = sb3.toString();
        C18070vi.A0X(obj2);
        return obj2;
    }
}
