package X;

/* renamed from: X.5zL  reason: invalid class name and case insensitive filesystem */
public final class C117175zL extends C125876bp {
    public final AnonymousClass1BI A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117175zL) {
                C117175zL r5 = (C117175zL) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (C17900vP.A00(this.A01) * 31) + C17880vN.A02(this.A00);
    }

    public C117175zL(AnonymousClass1BI r1, String str) {
        super(r1);
        this.A01 = str;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnStickerPackSend(stickerPackLink=");
        A10.append(this.A01);
        A10.append(", chatJid=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
