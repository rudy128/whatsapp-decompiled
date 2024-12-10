package X;

/* renamed from: X.0JW  reason: invalid class name */
public final class AnonymousClass0JW {
    public final float A00;
    public final float A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0JW) {
                AnonymousClass0JW r5 = (AnonymousClass0JW) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
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

    public AnonymousClass0JW(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlingResult(distanceCoefficient=");
        A10.append(this.A00);
        A10.append(", velocityCoefficient=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
