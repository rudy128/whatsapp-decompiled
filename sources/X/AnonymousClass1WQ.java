package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.1WQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1WQ implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        return new C201010v(runnable, "EphremeralExecutor");
    }
}
