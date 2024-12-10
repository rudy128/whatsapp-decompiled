package X;

/* renamed from: X.AdY  reason: case insensitive filesystem */
public final class C21042AdY implements C22392B5v {
    public final C188779hy A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C21042AdY) && C18070vi.A18(this.A00, ((C21042AdY) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C21042AdY(C188779hy r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnSilentAuthVerified(result=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
