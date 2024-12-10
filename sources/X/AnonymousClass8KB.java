package X;

/* renamed from: X.8KB  reason: invalid class name */
public final class AnonymousClass8KB extends C180159Lj {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8KB) && this.A00 == ((AnonymousClass8KB) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass8KB(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConstraintsNotMet(reason=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
