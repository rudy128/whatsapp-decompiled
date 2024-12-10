package X;

/* renamed from: X.AdL  reason: case insensitive filesystem */
public final class C21029AdL implements C22389B5s {
    public final C188779hy A00;

    public C21029AdL(C188779hy r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C21029AdL) && C18070vi.A18(this.A00, ((C21029AdL) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnOAuthEmailVerified(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
