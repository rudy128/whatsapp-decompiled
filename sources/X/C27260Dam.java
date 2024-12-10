package X;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Dam  reason: case insensitive filesystem */
public final class C27260Dam extends PhantomReference {
    public static final ReferenceQueue A03 = new ReferenceQueue();
    public static final ConcurrentHashMap A04 = AnonymousClass8BR.A17();
    public static final ThreadPoolExecutor A05 = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), DW7.A00);
    public final AtomicBoolean A00 = C108965cb.A0w();
    public final AtomicLong A01 = new AtomicLong(0);
    public final C22821Di A02;

    public C27260Dam(Object obj, C22821Di r7, long j) {
        super(obj, A03);
        this.A02 = r7;
        A04.put(this, true);
        boolean compareAndSet = this.A00.compareAndSet(false, true);
        AtomicLong atomicLong = this.A01;
        if (compareAndSet) {
            atomicLong.set(j);
        } else if (atomicLong.get() == 0) {
            throw AnonymousClass000.A0n("Native instance has been released and must not be used anymore");
        } else {
            throw AnonymousClass000.A0n("Native instance is already initialized");
        }
    }

    public final long A00() {
        long j = this.A01.get();
        if (!this.A00.get()) {
            throw AnonymousClass000.A0n("Native instance has not been initialized");
        } else if (j != 0) {
            return j;
        } else {
            throw AnonymousClass000.A0n("Native instance has been released and must not be used anymore");
        }
    }
}
