package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2wn  reason: invalid class name and case insensitive filesystem */
public class C65592wn implements E64 {
    public final int A00;
    public final long A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C65592wn(C18770x8 r1, Runnable runnable, TimeUnit timeUnit, int i, long j, long j2) {
        this.A00 = i;
        this.A03 = r1;
        this.A04 = runnable;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = timeUnit;
    }

    public final ScheduledFuture BB5(CLT clt) {
        int i = this.A00;
        C18770x8 r2 = (C18770x8) this.A03;
        Object obj = this.A04;
        long j = this.A01;
        long j2 = this.A02;
        TimeUnit timeUnit = (TimeUnit) this.A05;
        ScheduledExecutorService scheduledExecutorService = r2.A01;
        if (i != 0) {
            return scheduledExecutorService.scheduleWithFixedDelay(new C27081DTg(clt, r2, obj, 34), j, j2, timeUnit);
        }
        return scheduledExecutorService.scheduleAtFixedRate(new C27081DTg(clt, r2, obj, 35), j, j2, timeUnit);
    }
}
