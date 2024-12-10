package X;

/* renamed from: X.5zE  reason: invalid class name and case insensitive filesystem */
public final class C117105zE extends C125876bp {
    public final AnonymousClass1BI A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117105zE) && C18070vi.A18(this.A00, ((C117105zE) obj).A00));
    }

    public C117105zE(AnonymousClass1BI r1) {
        super(r1);
        this.A00 = r1;
    }

    public int hashCode() {
        return -1884754331 + AnonymousClass001.A0k(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OpenAvatarEditor(origin=");
        A10.append("expressions_sheet");
        A10.append(", chatJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
