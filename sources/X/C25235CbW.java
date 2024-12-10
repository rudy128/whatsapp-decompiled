package X;

/* renamed from: X.CbW  reason: case insensitive filesystem */
public final class C25235CbW {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final E34 A07;
    public final int A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25235CbW) {
                C25235CbW cbW = (C25235CbW) obj;
                if (!(Float.compare(this.A04, cbW.A04) == 0 && Float.compare(this.A05, cbW.A05) == 0 && Float.compare(this.A03, cbW.A03) == 0 && Float.compare(this.A00, cbW.A00) == 0 && this.A06 == cbW.A06 && Float.compare(this.A01, cbW.A01) == 0 && Float.compare(this.A02, cbW.A02) == 0 && C18070vi.A18(this.A07, cbW.A07) && this.A08 == cbW.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A07, AnonymousClass000.A0B(AnonymousClass000.A0B((AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A0B(AnonymousClass000.A05(this.A04), this.A05), this.A03), this.A00) + this.A06) * 31, this.A01), this.A02)) + this.A08;
    }

    public C25235CbW(E34 e34, float f, float f2, float f3, float f4, float f5, float f6, int i, int i2) {
        this.A04 = f;
        this.A05 = f2;
        this.A03 = f3;
        this.A00 = f4;
        this.A06 = i;
        this.A01 = f5;
        this.A02 = f6;
        this.A07 = e34;
        this.A08 = i2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Particle(x=");
        A10.append(this.A04);
        A10.append(", y=");
        A10.append(this.A05);
        A10.append(", width=");
        A10.append(this.A03);
        A10.append(", height=");
        A10.append(this.A00);
        A10.append(", color=");
        A10.append(this.A06);
        A10.append(", rotation=");
        A10.append(this.A01);
        A10.append(", scaleX=");
        A10.append(this.A02);
        A10.append(", shape=");
        A10.append(this.A07);
        A10.append(", alpha=");
        return AnonymousClass001.A1L(A10, this.A08);
    }
}
