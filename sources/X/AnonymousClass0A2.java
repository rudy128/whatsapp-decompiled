package X;

/* renamed from: X.0A2  reason: invalid class name */
public final class AnonymousClass0A2 extends AnonymousClass0HR {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;

    public AnonymousClass0A2(float f, float f2, float f3, float f4) {
        super(true, false);
        this.A00 = f;
        this.A02 = f2;
        this.A01 = f3;
        this.A03 = f4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0A2) {
                AnonymousClass0A2 r5 = (AnonymousClass0A2) obj;
                if (!(Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A03, r5.A03) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A00), this.A02), this.A01), this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RelativeReflectiveCurveTo(dx1=");
        A10.append(this.A00);
        A10.append(", dy1=");
        A10.append(this.A02);
        A10.append(", dx2=");
        A10.append(this.A01);
        A10.append(", dy2=");
        return AnonymousClass001.A1K(A10, this.A03);
    }
}
