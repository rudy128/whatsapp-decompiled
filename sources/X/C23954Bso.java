package X;

/* renamed from: X.Bso  reason: case insensitive filesystem */
public final class C23954Bso extends C4U {
    public final double A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23954Bso) && Double.compare(this.A00, ((C23954Bso) obj).A00) == 0);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(Double.doubleToLongBits(this.A00));
    }

    public C23954Bso(double d) {
        this.A00 = d;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Float64(value=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
