package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0ad  reason: invalid class name and case insensitive filesystem */
public final class C07250ad extends CancellationException {
    public C07250ad() {
        super("The coroutine scope left the composition");
    }

    public Throwable fillInStackTrace() {
        AnonymousClass000.A1I(this);
        return this;
    }
}
