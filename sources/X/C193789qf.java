package X;

/* renamed from: X.9qf  reason: invalid class name and case insensitive filesystem */
public final class C193789qf {
    public final double A00;
    public final double A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C193789qf) {
                C193789qf r7 = (C193789qf) obj;
                if (!(Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0I(Double.doubleToLongBits(this.A00)) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(this.A01));
    }

    public C193789qf(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("LocationPoint(latitude=");
        A10.append(this.A00);
        A10.append(", longitude=");
        A10.append(this.A01);
        return AnonymousClass001.A1J(A10);
    }
}
