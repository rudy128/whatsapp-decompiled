package X;

import android.text.format.Time;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.util.Calendar;

public abstract class A87 {
    public static final C192129nr A00 = new C177979Bi(3);
    public static final C192129nr A01 = new C177979Bi(4);
    public static final C192129nr A02 = new C177979Bi(0);
    public static final C192129nr A03 = new C177979Bi(2);
    public static final C192129nr A04 = new C177979Bi(1);

    public static int A00(Integer num, long j, long j2) {
        int i = (int) ((j - j2) / 86400000);
        if (Math.abs(i) > num.intValue() + 1) {
            return i;
        }
        Time time = new Time();
        time.set(j);
        long j3 = time.gmtoff;
        time.set(j2);
        return ((int) ((j + (j3 * 1000)) / 86400000)) - ((int) ((j2 + (time.gmtoff * 1000)) / 86400000));
    }

    public static String A02(long j) {
        return AnonymousClass8BU.A0r((DateFormat) A02.A01(), j);
    }

    public static String A03(C18000vb r1, String str, String str2) {
        String A08 = r1.A08(180);
        Object[] A1b = AnonymousClass3MW.A1b();
        AnonymousClass001.A1Q(str2, str, A1b);
        return MessageFormat.format(A08, A1b);
    }

    public static boolean A04(long j, long j2) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5)) {
            return true;
        }
        return false;
    }

    public static boolean A05(long j, long j2) {
        Calendar calendar = (Calendar) A04.A01();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = (Calendar) A03.A01();
        calendar2.setTimeInMillis(j2);
        if (calendar.get(1) != calendar2.get(1)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A01(long r9) {
        /*
            long r7 = X.AnonymousClass8BR.A04(r9)
            r5 = 0
            r3 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0036
            r3 = 60000(0xea60, double:2.9644E-319)
        L_0x0010:
            long r7 = r7 / r3
            long r7 = r7 * r3
            long r9 = r9 + r7
            long r9 = r9 + r3
        L_0x0014:
            java.util.GregorianCalendar r2 = new java.util.GregorianCalendar
            r2.<init>()
            r1 = 5
            r0 = 1
            r2.add(r1, r0)
            r0 = 11
            r1 = 0
            r2.set(r0, r1)
            r0 = 12
            X.AnonymousClass8BV.A1Q(r2, r0, r1)
            long r1 = r2.getTimeInMillis()
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0035
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0040
        L_0x0035:
            return r1
        L_0x0036:
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0010
            r9 = 0
            goto L_0x0014
        L_0x0040:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A87.A01(long):long");
    }
}
