package X;

/* renamed from: X.CaX  reason: case insensitive filesystem */
public final class C25181CaX {
    public float A00 = 0.0f;
    public float A01 = 0.0f;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25181CaX) {
                C25181CaX caX = (C25181CaX) obj;
                if (!(Float.compare(this.A00, caX.A00) == 0 && Float.compare(this.A01, caX.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A05(this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Vector(x=");
        A10.append(this.A00);
        A10.append(", y=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
