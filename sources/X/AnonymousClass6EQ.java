package X;

/* renamed from: X.6EQ  reason: invalid class name */
public final class AnonymousClass6EQ extends C123146Th {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6EQ) && this.A00 == ((AnonymousClass6EQ) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass6EQ(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Loading(progress=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
