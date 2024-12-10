package X;

/* renamed from: X.09q  reason: invalid class name and case insensitive filesystem */
public final class C017209q extends AnonymousClass0HR {
    public final float A00;

    public C017209q(float f) {
        super(false, false);
        this.A00 = f;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C017209q) && Float.compare(this.A00, ((C017209q) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RelativeHorizontalTo(dx=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
