package X;

/* renamed from: X.4Si  reason: invalid class name and case insensitive filesystem */
public final class C86614Si {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C86614Si) && this.A00 == ((C86614Si) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C86614Si(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CAGInfoRow(rowType=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
