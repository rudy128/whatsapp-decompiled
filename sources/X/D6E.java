package X;

public final class D6E implements E79 {
    public final float A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof D6E) && Float.compare(this.A00, ((D6E) obj).A00) == 0);
    }

    public int hashCode() {
        return Float.floatToIntBits(this.A00);
    }

    public float BFt(float f) {
        return f / this.A00;
    }

    public float BFu(float f) {
        return f * this.A00;
    }

    public D6E(float f) {
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LinearFontScaleConverter(fontScale=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
