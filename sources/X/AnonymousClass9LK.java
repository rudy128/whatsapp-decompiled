package X;

/* renamed from: X.9LK  reason: invalid class name */
public final class AnonymousClass9LK extends Exception {
    public final int errorCode;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9LK) && this.errorCode == ((AnonymousClass9LK) obj).errorCode);
    }

    public int hashCode() {
        return this.errorCode;
    }

    public AnonymousClass9LK(int i) {
        this.errorCode = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ErrorCodeException(errorCode=");
        return AnonymousClass001.A1L(A10, this.errorCode);
    }
}
