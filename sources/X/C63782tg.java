package X;

/* renamed from: X.2tg  reason: invalid class name and case insensitive filesystem */
public abstract class C63782tg {
    public static long A01(String[] strArr, int i) {
        if (strArr.length > i) {
            return C20099A7c.A04(strArr[i], 0);
        }
        return 0;
    }

    public static Boolean A02(String[] strArr, int i) {
        if (strArr.length > i) {
            String str = strArr[i];
            if (!"null".equals(str)) {
                return Boolean.valueOf(Boolean.parseBoolean(str));
            }
        }
        return null;
    }

    public static Integer A03(String[] strArr, int i) {
        if (strArr.length > i) {
            String str = strArr[i];
            if (!"null".equals(str)) {
                return Integer.valueOf(C20099A7c.A01(str, 0));
            }
        }
        return null;
    }

    public static Long A05(String[] strArr, int i) {
        if (strArr.length > i) {
            String str = strArr[i];
            if (!"null".equals(str)) {
                return Long.valueOf(C20099A7c.A04(str, 0));
            }
        }
        return null;
    }

    public static Long A04(Long l, long j) {
        long longValue;
        if (l == null) {
            longValue = 0;
        } else {
            longValue = l.longValue();
        }
        return Long.valueOf(longValue + j);
    }

    public static long A00(String[] strArr, int i) {
        Long A05 = A05(strArr, i);
        if (A05 == null) {
            return 0;
        }
        return A05.longValue();
    }
}
