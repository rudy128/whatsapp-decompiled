package X;

import java.io.Serializable;

/* renamed from: X.1IU  reason: invalid class name */
public final class AnonymousClass1IU implements Serializable {
    public final Throwable exception;

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass1IU) || !C18070vi.A18(this.exception, ((AnonymousClass1IU) obj).exception)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Failure(");
        sb.append(this.exception);
        sb.append(')');
        return sb.toString();
    }

    public AnonymousClass1IU(Throwable th) {
        this.exception = th;
    }
}
