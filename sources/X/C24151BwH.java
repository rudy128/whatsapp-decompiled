package X;

/* renamed from: X.BwH  reason: case insensitive filesystem */
public final class C24151BwH extends C24442C4c {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C24151BwH) && this.A00 == ((C24151BwH) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C24151BwH(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Unconverted(imageFormat=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
