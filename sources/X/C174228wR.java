package X;

/* renamed from: X.8wR  reason: invalid class name and case insensitive filesystem */
public final class C174228wR extends C174358we {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C174228wR) && this.A00 == ((C174228wR) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C174228wR(int i) {
        super(65);
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerticalSpaceViewItemData(height=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
