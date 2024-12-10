package X;

import java.lang.ref.WeakReference;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3DQ  reason: invalid class name */
public class AnonymousClass3DQ implements ThreadFactory {
    public final int A00;
    public final Object A01;

    public AnonymousClass3DQ(C25581Ot r2) {
        this.A00 = 1;
        this.A01 = r2;
    }

    public Thread newThread(Runnable runnable) {
        if (this.A00 != 0) {
            C201010v r1 = new C201010v(new C70573Bq(runnable, 19), "SignalExecutor");
            ((C25581Ot) this.A01).A01 = new WeakReference(r1);
            return r1;
        }
        Object[] objArr = new Object[1];
        AnonymousClass000.A1L(objArr, ((AtomicInteger) this.A01).getAndIncrement());
        return new Thread(runnable, String.format("firebase-installations-executor-%d", objArr));
    }

    public AnonymousClass3DQ() {
        this.A00 = 0;
        this.A01 = new AtomicInteger(1);
    }
}
