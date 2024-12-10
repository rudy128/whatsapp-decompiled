package X;

/* renamed from: X.42Y  reason: invalid class name */
public final class AnonymousClass42Y extends C83274Em {
    public final C41761x1 A00;

    public AnonymousClass42Y(C41761x1 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass42Y) && C18070vi.A18(this.A00, ((AnonymousClass42Y) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Success(listInfo=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
