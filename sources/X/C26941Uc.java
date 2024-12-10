package X;

/* renamed from: X.1Uc  reason: invalid class name and case insensitive filesystem */
public final class C26941Uc extends Exception {
    public final A6Z error;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C26941Uc) && C18070vi.A18(this.error, ((C26941Uc) obj).error));
    }

    public int hashCode() {
        return this.error.hashCode();
    }

    public String toString() {
        return this.error.toString();
    }

    public C26941Uc(A6Z a6z) {
        this.error = a6z;
    }
}
