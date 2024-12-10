package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Dc8  reason: case insensitive filesystem */
public final class C27336Dc8 extends CancellationException {
    public final transient Object A00;

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public C27336Dc8(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.A00 = obj;
    }
}
