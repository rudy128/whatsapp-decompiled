package X;

/* renamed from: X.AdX  reason: case insensitive filesystem */
public final class C21041AdX implements C22392B5v {
    public final C188779hy A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C21041AdX) && C18070vi.A18(this.A00, ((C21041AdX) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C21041AdX(C188779hy r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnSilentAuthConsentRequired(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
