package X;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.TreeMap;

public class A86 {
    public static TreeMap A00 = new TreeMap(new Object());
    public static TreeMap A01 = new TreeMap(new Object());
    public static TreeMap A02 = new TreeMap();
    public static HashSet A03 = C17880vN.A12();

    public static Integer A00(String str) {
        if (AnonymousClass8BU.A1Y(str, 0)) {
            return Integer.valueOf(Integer.parseInt(str) - 1);
        }
        Integer num = (Integer) A01.get(str);
        if (num != null) {
            return num;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("can not parse ");
        A10.append(str);
        throw AnonymousClass000.A0s(AnonymousClass000.A0y(" as month", A10));
    }

    public static GregorianCalendar A03() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(2000, 0, 0, 0, 0, 0);
        TimeZone timeZone = gregorianCalendar.getTimeZone();
        if (timeZone == null) {
            timeZone = TimeZone.getDefault();
        }
        gregorianCalendar.setTimeInMillis((long) (-timeZone.getRawOffset()));
        return gregorianCalendar;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.util.Comparator] */
    static {
        A03.add("à");
        A03.add("at");
        A03.add("MEZ");
        A03.add("Uhr");
        A03.add("h");
        A03.add("pm");
        A03.add("PM");
        A03.add("am");
        A03.add("AM");
        A03.add("min");
        A03.add("um");
        A03.add("o'clock");
        for (String str : TimeZone.getAvailableIDs()) {
            A02.put(str, TimeZone.getTimeZone(str));
        }
        for (Locale locale : DateFormatSymbols.getAvailableLocales()) {
            if (!"ja".equals(locale.getLanguage()) && !"ko".equals(locale.getLanguage()) && !"zh".equals(locale.getLanguage())) {
                DateFormatSymbols instance = DateFormatSymbols.getInstance(locale);
                String[] months = instance.getMonths();
                for (int i = 0; i < months.length; i++) {
                    if (months[i].length() != 0) {
                        A04(Integer.valueOf(i), months[i], A01);
                    }
                }
                String[] shortMonths = instance.getShortMonths();
                for (int i2 = 0; i2 < shortMonths.length; i2++) {
                    String str2 = shortMonths[i2];
                    if (str2.length() != 0 && !AnonymousClass8BU.A1Y(str2, str2.length() - 1)) {
                        TreeMap treeMap = A01;
                        String str3 = shortMonths[i2];
                        Integer valueOf = Integer.valueOf(i2);
                        A04(valueOf, str3, treeMap);
                        A04(valueOf, shortMonths[i2].replace(".", ""), A01);
                    }
                }
                String[] weekdays = instance.getWeekdays();
                for (int i3 = 0; i3 < weekdays.length; i3++) {
                    String str4 = weekdays[i3];
                    if (str4.length() != 0) {
                        TreeMap treeMap2 = A00;
                        Integer valueOf2 = Integer.valueOf(i3);
                        A04(valueOf2, str4, treeMap2);
                        A04(valueOf2, str4.replace(".", ""), A00);
                    }
                }
                String[] shortWeekdays = instance.getShortWeekdays();
                for (int i4 = 0; i4 < shortWeekdays.length; i4++) {
                    String str5 = shortWeekdays[i4];
                    if (str5.length() != 0) {
                        TreeMap treeMap3 = A00;
                        Integer valueOf3 = Integer.valueOf(i4);
                        A04(valueOf3, str5, treeMap3);
                        A04(valueOf3, str5.replace(".", ""), A00);
                    }
                }
            }
        }
    }

    public static String A01(String str, Calendar calendar, StringTokenizer stringTokenizer) {
        while (true) {
            TimeZone timeZone = (TimeZone) A02.get(str);
            if (timeZone != null) {
                calendar.setTimeZone(timeZone);
            } else if (!A03.contains(str)) {
                return str;
            } else {
                if (str.equalsIgnoreCase("pm")) {
                    calendar.add(9, 1);
                }
                if (str.equalsIgnoreCase("am")) {
                    calendar.add(9, 0);
                }
            }
            if (!stringTokenizer.hasMoreTokens()) {
                return null;
            }
            str = stringTokenizer.nextToken();
        }
    }

    public static Date A02(String str, Calendar calendar, StringTokenizer stringTokenizer) {
        String A012;
        String A013;
        String A014;
        calendar.set(11, Integer.parseInt(A01(str, calendar, stringTokenizer)));
        if (stringTokenizer.hasMoreTokens() && (A012 = A01(stringTokenizer.nextToken(), calendar, stringTokenizer)) != null) {
            calendar.set(12, Integer.parseInt(A012));
            if (stringTokenizer.hasMoreTokens() && (A013 = A01(stringTokenizer.nextToken(), calendar, stringTokenizer)) != null) {
                calendar.set(13, Integer.parseInt(A013));
                if (stringTokenizer.hasMoreTokens() && (A014 = A01(stringTokenizer.nextToken(), calendar, stringTokenizer)) != null) {
                    String A015 = A01(A014, calendar, stringTokenizer);
                    if (A015.length() == 4 && AnonymousClass8BU.A1Y(A015, 0)) {
                        int parseInt = Integer.parseInt(A015);
                        if (parseInt < 100) {
                            if (parseInt > 30) {
                                parseInt += 2000;
                            } else {
                                parseInt += 1900;
                            }
                        }
                        calendar.set(1, parseInt);
                    }
                }
            }
        }
        return calendar.getTime();
    }

    public static void A04(Integer num, String str, TreeMap treeMap) {
        treeMap.put(str, num);
        treeMap.put(str.replace("é", "e").replace("û", "u"), num);
    }
}
