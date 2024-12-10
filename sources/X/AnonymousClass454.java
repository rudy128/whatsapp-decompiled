package X;

/* renamed from: X.454  reason: invalid class name */
public final class AnonymousClass454 extends C83354Eu {
    public final C83344Et A00;

    public AnonymousClass454(C83344Et r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass454) && C18070vi.A18(this.A00, ((AnonymousClass454) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AlertDataItem(newsletterAlert=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
