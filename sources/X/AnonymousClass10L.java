package X;

import java.util.concurrent.Executor;

/* renamed from: X.10L  reason: invalid class name */
public final /* synthetic */ class AnonymousClass10L implements Executor {
    public final void execute(Runnable runnable) {
        Executor executor = AnonymousClass10J.A07;
        new C201010v(runnable, "AnomalyExecutorThread").start();
    }
}
