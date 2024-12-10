package X;

public final class Bt0 extends C4V {
    public final C4Q A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Bt0) && C18070vi.A18(this.A00, ((Bt0) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Bt0(C4Q c4q) {
        this.A00 = c4q;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Desc(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
