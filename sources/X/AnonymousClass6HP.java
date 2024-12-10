package X;

/* renamed from: X.6HP  reason: invalid class name */
public final class AnonymousClass6HP extends C123226Tp {
    public final C1418377d A00;
    public final C122606Ra A01;

    public AnonymousClass6HP(C1418377d r2, C122606Ra r3) {
        C18070vi.A0d(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6HP) {
                AnonymousClass6HP r5 = (AnonymousClass6HP) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass001.A0k(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AddToStickerPack(sticker=");
        A10.append(this.A00);
        A10.append(", origin=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
