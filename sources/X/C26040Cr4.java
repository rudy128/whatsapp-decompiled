package X;

/* renamed from: X.Cr4  reason: case insensitive filesystem */
public final class C26040Cr4 {
    public static final C26040Cr4 A02 = new C26040Cr4(1.0f, 0.0f);
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26040Cr4) {
                C26040Cr4 cr4 = (C26040Cr4) obj;
                if (!(this.A00 == cr4.A00 && this.A01 == cr4.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final float A00() {
        return this.A00;
    }

    public final float A01() {
        return this.A01;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public C26040Cr4(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TextGeometricTransform(scaleX=");
        A10.append(this.A00);
        A10.append(", skewX=");
        return AnonymousClass001.A1K(A10, this.A01);
    }

    public C26040Cr4() {
        this(1.0f, 0.0f);
    }
}
