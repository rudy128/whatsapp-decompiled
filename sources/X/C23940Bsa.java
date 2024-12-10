package X;

/* renamed from: X.Bsa  reason: case insensitive filesystem */
public final class C23940Bsa extends C4R {
    public final C25173CaP A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C23940Bsa) && C18070vi.A18(this.A00, ((C23940Bsa) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C23940Bsa(C25173CaP caP) {
        this.A00 = caP;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Required(inner=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
