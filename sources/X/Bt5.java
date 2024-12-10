package X;

public final class Bt5 extends C4V {
    public final C25766Cld A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof Bt5) && C18070vi.A18(this.A00, ((Bt5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public Bt5(C25766Cld cld) {
        this.A00 = cld;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Record(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
