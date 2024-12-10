package X;

/* renamed from: X.456  reason: invalid class name */
public final class AnonymousClass456 extends C83354Eu {
    public final C89494cY A00;

    public AnonymousClass456(C89494cY r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass456) && C18070vi.A18(this.A00, ((AnonymousClass456) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ReviewDataItem(newsletterAppeal=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
