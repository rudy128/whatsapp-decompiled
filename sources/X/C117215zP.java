package X;

/* renamed from: X.5zP  reason: invalid class name and case insensitive filesystem */
public final class C117215zP extends C125876bp {
    public final int A00;
    public final AnonymousClass1BI A01;
    public final C1418377d A02;
    public final Integer A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C117215zP) {
                C117215zP r5 = (C117215zP) obj;
                if (!C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || this.A04 != r5.A04 || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(((((AnonymousClass001.A0k(this.A02) * 31) + AnonymousClass001.A0k(this.A03)) * 31) + this.A00) * 31, this.A04) + C17880vN.A02(this.A01);
    }

    public C117215zP(AnonymousClass1BI r1, C1418377d r2, Integer num, int i, boolean z) {
        super(r1);
        this.A02 = r2;
        this.A03 = num;
        this.A00 = i;
        this.A04 = z;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("OnStickerSelected(sticker=");
        A10.append(this.A02);
        A10.append(", stickerSendOrigin=");
        A10.append(this.A03);
        A10.append(", position=");
        A10.append(this.A00);
        A10.append(", isSearchScreen=");
        A10.append(this.A04);
        A10.append(", chatJid=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
