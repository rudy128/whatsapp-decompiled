package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.1I0  reason: invalid class name */
public abstract class AnonymousClass1I0 {
    public static AnonymousClass1I3 A00 = AnonymousClass1I3.A00;
    public static final int A01;
    public static final int A02 = ((int) AnonymousClass1I1.A00("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 2097150));
    public static final long A03 = TimeUnit.SECONDS.toNanos(AnonymousClass1I1.A00("kotlinx.coroutines.scheduler.keep.alive.sec", 60, Long.MAX_VALUE));
    public static final long A04 = AnonymousClass1I1.A00("kotlinx.coroutines.scheduler.resolution.ns", 100000, Long.MAX_VALUE);
    public static final String A05;
    public static final AnonymousClass1I4 A06 = new AnonymousClass1I4(1);
    public static final AnonymousClass1I4 A07 = new AnonymousClass1I4(0);

    static {
        String str = "DefaultDispatcher";
        try {
            String property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
            if (property != null) {
                str = property;
            }
        } catch (SecurityException unused) {
        }
        A05 = str;
        int i = AnonymousClass1I2.A00;
        if (i < 2) {
            i = 2;
        }
        A01 = (int) AnonymousClass1I1.A00("kotlinx.coroutines.scheduler.core.pool.size", (long) i, 2147483647L);
    }
}
