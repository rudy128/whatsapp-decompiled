package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0ac  reason: invalid class name and case insensitive filesystem */
public final class C07240ac extends CancellationException {
    public C07240ac() {
        super("Mutation interrupted");
    }

    public Throwable fillInStackTrace() {
        AnonymousClass000.A1I(this);
        return this;
    }
}
