package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0ab  reason: invalid class name and case insensitive filesystem */
public final class C07230ab extends CancellationException {
    public C07230ab() {
        super("Mutation interrupted");
    }

    public Throwable fillInStackTrace() {
        AnonymousClass000.A1I(this);
        return this;
    }
}
