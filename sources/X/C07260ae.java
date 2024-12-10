package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.0ae  reason: invalid class name and case insensitive filesystem */
public final class C07260ae extends CancellationException {
    public C07260ae() {
        super("The Modifier.Node was detached");
    }

    public Throwable fillInStackTrace() {
        AnonymousClass000.A1I(this);
        return this;
    }
}
