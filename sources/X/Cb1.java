package X;

public final class Cb1 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Cb1) {
                Cb1 cb1 = (Cb1) obj;
                if (!(this.A03 == cb1.A03 && this.A02 == cb1.A02 && this.A01 == cb1.A01 && this.A00 == cb1.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A03 * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    public Cb1(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NavAndStatusColors(startStatusBarColor=");
        A10.append(this.A03);
        A10.append(", startNavBarColor=");
        A10.append(this.A02);
        A10.append(", returnStatusBarColor=");
        A10.append(this.A01);
        A10.append(", returnNavBarColor=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
