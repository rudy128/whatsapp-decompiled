package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Dc7  reason: case insensitive filesystem */
public final class C27335Dc7 extends CancellationException {
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C27335Dc7() {
        super("Child of the scoped flow was cancelled");
    }
}
