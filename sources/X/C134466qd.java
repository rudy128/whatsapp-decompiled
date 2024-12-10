package X;

/* renamed from: X.6qd  reason: invalid class name and case insensitive filesystem */
public final class C134466qd {
    public final AnonymousClass77S A00;

    public C134466qd(AnonymousClass77S r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C134466qd) && C18070vi.A18(this.A00, ((C134466qd) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("XFamilyFbUserEntity(accessToken=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
