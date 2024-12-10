package X;

/* renamed from: X.43S  reason: invalid class name */
public final class AnonymousClass43S extends C83304Ep {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass43S) && this.A00 == ((AnonymousClass43S) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public AnonymousClass43S(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewMore(moreContactsCount=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
