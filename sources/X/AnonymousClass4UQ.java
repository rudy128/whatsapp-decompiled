package X;

/* renamed from: X.4UQ  reason: invalid class name */
public final class AnonymousClass4UQ {
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4UQ) {
                AnonymousClass4UQ r5 = (AnonymousClass4UQ) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03 && Float.compare(this.A00, r5.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A02 * 31) + this.A01) * 31) + this.A03) * 31) + Float.floatToIntBits(this.A00);
    }

    public AnonymousClass4UQ(float f, int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = f;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BodyParametricStyleParameters(thumbColor=");
        A10.append(this.A02);
        A10.append(", filledTrackColor=");
        A10.append(this.A01);
        A10.append(", unfilledTrackColor=");
        A10.append(this.A03);
        A10.append(", stepSize=");
        return AnonymousClass001.A1K(A10, this.A00);
    }
}
