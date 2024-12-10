package X;

public final class BRH extends C3C {
    public final AnonymousClass1D6 A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BRH) && C18070vi.A18(this.A00, ((BRH) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public BRH(AnonymousClass1D6 r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PlatformEvent(event=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
