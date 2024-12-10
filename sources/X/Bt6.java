package X;

public final class Bt6 extends C4V {
    public final C4U A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Bt6) && C18070vi.A18(this.A00, ((Bt6) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Bt6(C4U c4u) {
        this.A00 = c4u;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Scalar(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
