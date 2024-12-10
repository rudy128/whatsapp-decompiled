package X;

/* renamed from: X.9LL  reason: invalid class name */
public final class AnonymousClass9LL extends Exception {
    public final Throwable cause;
    public final int errorCode;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9LL) {
                AnonymousClass9LL r5 = (AnonymousClass9LL) obj;
                if (this.errorCode != r5.errorCode || !C18070vi.A18(this.cause, r5.cause)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.errorCode * 31) + AnonymousClass001.A0k(this.cause);
    }

    public AnonymousClass9LL(int i, Throwable th) {
        super(th);
        this.errorCode = i;
        this.cause = th;
    }

    public Throwable getCause() {
        return this.cause;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorCodeException(errorCode=");
        A10.append(this.errorCode);
        A10.append(", cause=");
        return AnonymousClass001.A1F(this.cause, A10);
    }
}
