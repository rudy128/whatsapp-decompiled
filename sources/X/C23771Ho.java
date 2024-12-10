package X;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: X.1Ho  reason: invalid class name and case insensitive filesystem */
public abstract class C23771Ho extends C18600wl implements Closeable {
    public static final C23851Hw A00 = new C23851Hw();

    public void close() {
        ExecutorService executorService;
        if (this instanceof C23881Hz) {
            throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
        } else if (this instanceof AnonymousClass1IE) {
            throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
        } else {
            Executor executor = ((C23791Hq) this).A00;
            if ((executor instanceof ExecutorService) && (executorService = (ExecutorService) executor) != null) {
                executorService.shutdown();
            }
        }
    }
}
