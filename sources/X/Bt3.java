package X;

public final class Bt3 extends C4V {
    public final C4S A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Bt3) && C18070vi.A18(this.A00, ((Bt3) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Bt3(C4S c4s) {
        this.A00 = c4s;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Nullable(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
