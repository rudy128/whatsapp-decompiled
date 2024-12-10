package X;

/* renamed from: X.0KO  reason: invalid class name */
public final class AnonymousClass0KO {
    public final float A00;
    public final float A01;

    public final float[] A00() {
        float f = this.A00;
        float f2 = this.A01;
        return new float[]{f / f2, 1.0f, ((1.0f - f) - f2) / f2};
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0KO) {
                AnonymousClass0KO r5 = (AnonymousClass0KO) obj;
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

    public AnonymousClass0KO(float f, float f2) {
        this.A00 = f;
        this.A01 = f2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("WhitePoint(x=");
        A10.append(this.A00);
        A10.append(", y=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
