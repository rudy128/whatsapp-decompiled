package X;

/* renamed from: X.5zN  reason: invalid class name and case insensitive filesystem */
public final class C117195zN extends C125876bp {
    public final AnonymousClass1BI A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117195zN) {
                C117195zN r5 = (C117195zN) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A03(this.A01) + AnonymousClass001.A0k(this.A00);
    }

    public C117195zN(AnonymousClass1BI r1, String str) {
        super(r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ShowSocialStickerWarning(message=");
        A10.append(this.A01);
        A10.append(", chatJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
