package X;

/* renamed from: X.0A5  reason: invalid class name */
public final class AnonymousClass0A5 extends AnonymousClass0HR {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final boolean A05;
    public final boolean A06;

    public AnonymousClass0A5(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        super(false, false);
        this.A02 = f;
        this.A04 = f2;
        this.A03 = f3;
        this.A05 = z;
        this.A06 = z2;
        this.A00 = f4;
        this.A01 = f5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0A5) {
                AnonymousClass0A5 r5 = (AnonymousClass0A5) obj;
                if (!(Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A04, r5.A04) == 0 && Float.compare(this.A03, r5.A03) == 0 && this.A05 == r5.A05 && this.A06 == r5.A06 && Float.compare(this.A00, r5.A00) == 0 && Float.compare(this.A01, r5.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0C(AnonymousClass000.A0B(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A02), this.A04), this.A03), this.A05), this.A06), this.A00), this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArcTo(horizontalEllipseRadius=");
        A10.append(this.A02);
        A10.append(", verticalEllipseRadius=");
        A10.append(this.A04);
        A10.append(", theta=");
        A10.append(this.A03);
        A10.append(", isMoreThanHalf=");
        A10.append(this.A05);
        A10.append(", isPositiveArc=");
        A10.append(this.A06);
        A10.append(", arcStartX=");
        A10.append(this.A00);
        A10.append(", arcStartY=");
        return AnonymousClass001.A1K(A10, this.A01);
    }
}
