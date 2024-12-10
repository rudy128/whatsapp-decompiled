package X;

/* renamed from: X.5zG  reason: invalid class name and case insensitive filesystem */
public final class C117125zG extends C125876bp {
    public final AnonymousClass1BI A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C117125zG) && C18070vi.A18(this.A00, ((C117125zG) obj).A00));
    }

    public int hashCode() {
        return AnonymousClass001.A0k(this.A00);
    }

    public C117125zG(AnonymousClass1BI r1) {
        super(r1);
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StartEmojiSearch(chatJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
