package X;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.2wm  reason: invalid class name and case insensitive filesystem */
public class C65582wm implements E64 {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C65582wm(Object obj, Object obj2, Object obj3, int i, long j) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = j;
        this.A04 = obj3;
    }

    public final ScheduledFuture BB5(CLT clt) {
        int i = this.A00;
        C18770x8 r7 = (C18770x8) this.A02;
        Object obj = this.A03;
        long j = this.A01;
        TimeUnit timeUnit = (TimeUnit) this.A04;
        ScheduledExecutorService scheduledExecutorService = r7.A01;
        if (i != 0) {
            return scheduledExecutorService.schedule(new C27121DVh(clt, r7, obj, 5), j, timeUnit);
        }
        return scheduledExecutorService.schedule(new C27081DTg(clt, r7, obj, 36), j, timeUnit);
    }
}
