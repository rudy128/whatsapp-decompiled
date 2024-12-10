package X;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.0In  reason: invalid class name and case insensitive filesystem */
public abstract class C03510In {
    public RunnableFuture A00;
    public Object A01;
    public final AtomicInteger A02 = new AtomicInteger(-1);

    public final Object A00() {
        RunnableFuture runnableFuture;
        Object obj;
        synchronized (this) {
            runnableFuture = this.A00;
            obj = this.A01;
        }
        if (obj != null) {
            return obj;
        }
        if (runnableFuture != null) {
            AtomicInteger atomicInteger = this.A02;
            if (atomicInteger.compareAndSet(-1, Process.myTid())) {
                runnableFuture.run();
            }
            Object A002 = C26176Ctu.A00(runnableFuture, atomicInteger.get());
            synchronized (this) {
                this.A01 = A002;
                this.A00 = null;
            }
            A01(A002);
            return A002;
        }
        throw AnonymousClass000.A0k("Required value was null.");
    }

    public void A01(Object obj) {
    }

    public C03510In(Callable callable) {
        this.A00 = new FutureTask(callable);
    }
}
