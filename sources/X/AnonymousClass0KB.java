package X;

/* renamed from: X.0KB  reason: invalid class name */
public final class AnonymousClass0KB {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass0KB) {
                AnonymousClass0KB r7 = (AnonymousClass0KB) obj;
                if (!(Double.compare(this.A04, r7.A04) == 0 && Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A02, r7.A02) == 0 && Double.compare(this.A03, r7.A03) == 0 && Double.compare(0.0d, 0.0d) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public AnonymousClass0KB(double d, double d2, double d3, double d4, double d5) {
        this.A04 = d;
        this.A00 = d2;
        this.A01 = d3;
        this.A02 = d4;
        this.A03 = d5;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(0.0d) || Double.isNaN(d)) {
            throw AnonymousClass000.A0k("Parameters cannot be NaN");
        } else if (d5 < 0.0d || d5 > 1.0d) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Parameter d must be in the range [0..1], was ");
            A10.append(d5);
            throw AnonymousClass000.A0j(A10);
        } else if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw AnonymousClass000.A0k("Parameter a or g is zero, the transfer function is constant");
        } else if (d5 >= 1.0d && d4 == 0.0d) {
            throw AnonymousClass000.A0k("Parameter c is zero, the transfer function is constant");
        } else if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw AnonymousClass000.A0k("Parameter a or g is zero, and c is zero, the transfer function is constant");
        } else if (d4 < 0.0d) {
            throw AnonymousClass000.A0k("The transfer function must be increasing");
        } else if (d2 < 0.0d || d < 0.0d) {
            throw AnonymousClass000.A0k("The transfer function must be positive or increasing");
        }
    }

    public int hashCode() {
        int A0I = AnonymousClass000.A0I(Double.doubleToLongBits(0.0d));
        return (((((((((((AnonymousClass000.A0I(Double.doubleToLongBits(this.A04)) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A00))) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A01))) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A02))) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A03))) * 31) + A0I) * 31) + A0I;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("TransferParameters(gamma=");
        A10.append(this.A04);
        A10.append(", a=");
        A10.append(this.A00);
        A10.append(", b=");
        A10.append(this.A01);
        A10.append(", c=");
        A10.append(this.A02);
        A10.append(", d=");
        A10.append(this.A03);
        A10.append(", e=");
        A10.append(0.0d);
        A10.append(", f=");
        A10.append(0.0d);
        return AnonymousClass001.A1J(A10);
    }
}
