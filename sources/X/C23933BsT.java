package X;

/* renamed from: X.BsT  reason: case insensitive filesystem */
public final class C23933BsT extends C4Q {
    public final double A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23933BsT) && Double.compare(this.A00, ((C23933BsT) obj).A00) == 0);
    }

    public int hashCode() {
        return AnonymousClass000.A0I(Double.doubleToLongBits(this.A00));
    }

    public C23933BsT(double d) {
        this.A00 = d;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Float(value=");
        A10.append(this.A00);
        return AnonymousClass001.A1J(A10);
    }
}
