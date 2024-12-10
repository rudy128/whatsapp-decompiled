package X;

/* renamed from: X.4oC  reason: invalid class name and case insensitive filesystem */
public final class C96654oC implements AnonymousClass5Y3 {
    public final int A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C96654oC) && this.A00 == ((C96654oC) obj).A00);
    }

    public int hashCode() {
        return this.A00;
    }

    public C96654oC(int i) {
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StaticFilterHeader(header=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
