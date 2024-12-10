package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.4Dc  reason: invalid class name and case insensitive filesystem */
public enum C83034Dc {
    A03("EIGHT_HOURS", TimeUnit.HOURS.toMillis(8)),
    A04("ONE_WEEK", TimeUnit.DAYS.toMillis(7)),
    A02("ALWAYS", -1);
    
    public final long durationInMillis;
    public final int id;

    /* access modifiers changed from: public */
    static {
        C83034Dc[] r2;
        A00 = C19780yz.A00(r2);
    }

    /* access modifiers changed from: public */
    C83034Dc(String str, long j) {
        this.id = r2;
        this.durationInMillis = j;
    }
}
