package X;

/* renamed from: X.DuM  reason: case insensitive filesystem */
public final class C28261DuM extends C24444C4e {
    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28261DuM) && Double.compare(0.5d, 0.5d) == 0 && Double.compare(0.12d, 0.12d) == 0);
    }

    public int hashCode() {
        return (AnonymousClass000.A0I(Double.doubleToLongBits(0.5d)) * 31) + AnonymousClass000.A0I(Double.doubleToLongBits(0.12d));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Relative(x=");
        A10.append(0.5d);
        A10.append(", y=");
        A10.append(0.12d);
        return AnonymousClass001.A1J(A10);
    }
}
