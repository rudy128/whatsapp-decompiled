package X;

/* renamed from: X.455  reason: invalid class name */
public final class AnonymousClass455 extends C83354Eu {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass455) && this.A00 == ((AnonymousClass455) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass455(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("HeaderDataItem(title=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
