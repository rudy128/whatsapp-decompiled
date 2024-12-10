package X;

import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class CWF {
    public long A00;
    public boolean A01;
    public final C25411CfJ A02 = C25411CfJ.A00;

    public String toString() {
        long j;
        TimeUnit timeUnit;
        String str;
        if (this.A01) {
            j = System.nanoTime() - this.A00;
        } else {
            j = 0;
        }
        if (BE6.A0N(j, TimeUnit.DAYS) > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (BE6.A0N(j, TimeUnit.HOURS) > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (BE6.A0N(j, TimeUnit.MINUTES) > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (BE6.A0N(j, TimeUnit.SECONDS) > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (BE6.A0N(j, TimeUnit.MILLISECONDS) > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else {
            TimeUnit timeUnit2 = TimeUnit.MICROSECONDS;
            timeUnit = TimeUnit.NANOSECONDS;
            if (timeUnit2.convert(j, timeUnit) > 0) {
                timeUnit = TimeUnit.MICROSECONDS;
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        Locale locale = Locale.ROOT;
        Object[] A1a = AnonymousClass3MW.A1a();
        A1a[0] = Double.valueOf(((double) j) / ((double) TimeUnit.NANOSECONDS.convert(1, timeUnit)));
        A10.append(String.format(locale, "%.4g", A1a));
        BE6.A1J(A10);
        switch (BE6.A0E(timeUnit, CFh.A00)) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                throw new AssertionError();
        }
        return AnonymousClass000.A0y(str, A10);
    }
}
