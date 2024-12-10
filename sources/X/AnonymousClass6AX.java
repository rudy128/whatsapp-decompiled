package X;

import java.io.IOException;

/* renamed from: X.6AX  reason: invalid class name */
public final class AnonymousClass6AX extends AnonymousClass6SB {
    public final IOException throwable;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6AX) && C18070vi.A18(this.throwable, ((AnonymousClass6AX) obj).throwable));
    }

    public int hashCode() {
        return this.throwable.hashCode();
    }

    public AnonymousClass6AX(IOException iOException) {
        this.throwable = iOException;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ModelIOError(throwable=");
        return AnonymousClass001.A1F(this.throwable, A10);
    }
}
