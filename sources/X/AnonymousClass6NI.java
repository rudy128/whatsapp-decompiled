package X;

/* renamed from: X.6NI  reason: invalid class name */
public final class AnonymousClass6NI extends AnonymousClass6U5 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6NI) && this.A00 == ((AnonymousClass6NI) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass6NI(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Error(errorLayoutStatus=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
