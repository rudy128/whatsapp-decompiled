package X;

import java.util.concurrent.RejectedExecutionException;

/* renamed from: X.1IK  reason: invalid class name */
public abstract class AnonymousClass1IK extends AnonymousClass1IJ {
    public Thread A0J() {
        if (!(this instanceof AnonymousClass1IM)) {
            return ((C37601pp) this).A00;
        }
        AnonymousClass1IM r2 = (AnonymousClass1IM) this;
        Thread thread = AnonymousClass1IM._thread;
        if (thread == null) {
            synchronized (r2) {
                thread = AnonymousClass1IM._thread;
                if (thread == null) {
                    thread = new Thread(r2, "X.1IM");
                    AnonymousClass1IM._thread = thread;
                    thread.setContextClassLoader(r2.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    public void A0K(C70903Cy r3, long j) {
        if (this instanceof AnonymousClass1IM) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        AnonymousClass1IM.A00.A0M(r3, j);
    }
}
