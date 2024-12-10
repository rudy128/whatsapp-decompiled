package X;

/* renamed from: X.2lP  reason: invalid class name and case insensitive filesystem */
public final class C58882lP {
    public final C166418cr A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C58882lP) && C18070vi.A18(this.A00, ((C58882lP) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C58882lP(C166418cr r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingNewsletterPlaintext(newsletterMessage=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
