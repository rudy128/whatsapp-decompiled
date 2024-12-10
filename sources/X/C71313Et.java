package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.3Et  reason: invalid class name and case insensitive filesystem */
public final class C71313Et extends CancellationException {
    public final transient AnonymousClass1OB A00;

    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C71313Et)) {
            return false;
        }
        C71313Et r3 = (C71313Et) obj;
        if (!C18070vi.A18(r3.getMessage(), getMessage()) || !C18070vi.A18(r3.A00, this.A00) || !C18070vi.A18(r3.getCause(), getCause())) {
            return false;
        }
        return true;
    }

    public C71313Et(String str, Throwable th, AnonymousClass1OB r3) {
        super(str);
        this.A00 = r3;
        if (th != null) {
            initCause(th);
        }
    }

    public int hashCode() {
        String message = getMessage();
        C18070vi.A0b(message);
        return AnonymousClass000.A0N(this.A00, C17880vN.A03(message)) + AnonymousClass001.A0l(getCause());
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(super.toString());
        A10.append("; job=");
        return C17890vO.A0V(this.A00, A10);
    }
}
