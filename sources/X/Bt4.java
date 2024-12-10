package X;

public final class Bt4 extends C4V {
    public final A2U A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Bt4) && C18070vi.A18(this.A00, ((Bt4) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Bt4(A2U a2u) {
        this.A00 = a2u;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Path(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
