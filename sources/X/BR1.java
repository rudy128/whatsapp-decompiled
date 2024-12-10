package X;

public final class BR1 extends C3B {
    public final AnonymousClass1D6 A00;

    public BR1(AnonymousClass1D6 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof BR1) && C18070vi.A18(this.A00, ((BR1) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ArEffectPlatformEvent(platformEvent=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
