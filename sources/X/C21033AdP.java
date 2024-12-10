package X;

/* renamed from: X.AdP  reason: case insensitive filesystem */
public final class C21033AdP implements C22390B5t {
    public final C188779hy A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C21033AdP) && C18070vi.A18(this.A00, ((C21033AdP) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C21033AdP(C188779hy r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnPasskey2FacRequired(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
