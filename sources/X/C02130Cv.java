package X;

/* renamed from: X.0Cv  reason: invalid class name and case insensitive filesystem */
public final class C02130Cv {
    public double A00;
    public double A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C02130Cv) {
                C02130Cv r7 = (C02130Cv) obj;
                if (!(Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A00, r7.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0I(Double.doubleToLongBits(this.A01)) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A00));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ComplexDouble(_real=");
        A10.append(this.A01);
        A10.append(", _imaginary=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
