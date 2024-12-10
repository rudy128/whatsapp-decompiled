package X;

import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.1Mi  reason: invalid class name and case insensitive filesystem */
public final class C24961Mi {
    public final WeakHashMap A00 = new WeakHashMap();
    public final ConcurrentHashMap A01 = new ConcurrentHashMap();
    public final AtomicLong A02 = new AtomicLong();
    public final AtomicLong A03 = new AtomicLong();
    public final AtomicLong A04 = new AtomicLong();
    public final AnonymousClass11P A05;

    public final synchronized void A00(Job job, int i) {
        C18070vi.A0d(job, 0);
        this.A03.incrementAndGet();
        if (!job.parameters.isPersistent) {
            this.A04.incrementAndGet();
        }
        long j = (long) i;
        AtomicLong atomicLong = this.A02;
        if (j > atomicLong.get()) {
            atomicLong.set(j);
        }
        String name = job.getClass().getName();
        ConcurrentHashMap concurrentHashMap = this.A01;
        C54362e1 r0 = (C54362e1) concurrentHashMap.get(name);
        if (r0 == null) {
            r0 = new C54362e1();
            concurrentHashMap.put(name, r0);
        }
        r0.A02.incrementAndGet();
    }

    public C24961Mi(AnonymousClass11P r2) {
        this.A05 = r2;
    }
}
