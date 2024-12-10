package X;

/* renamed from: X.60R  reason: invalid class name */
public final class AnonymousClass60R extends AnonymousClass6TI {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass60R) && this.A00 == ((AnonymousClass60R) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass60R(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(amount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
