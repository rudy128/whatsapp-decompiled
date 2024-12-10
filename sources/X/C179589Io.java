package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.9Io  reason: invalid class name and case insensitive filesystem */
public enum C179589Io {
    NANOSECONDS(0),
    MICROSECONDS(1),
    MILLISECONDS(2),
    SECONDS(3),
    MINUTES(4),
    HOURS(5),
    DAYS(6);
    
    public final TimeUnit timeUnit;

    /* access modifiers changed from: public */
    static {
        C179589Io[] r0;
        A00 = C19780yz.A00(r0);
    }

    /* access modifiers changed from: public */
    C179589Io(int i) {
        this.timeUnit = r2;
    }
}
