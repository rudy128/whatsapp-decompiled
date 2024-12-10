package X;

/* renamed from: X.6GR  reason: invalid class name */
public final class AnonymousClass6GR extends C123196Tm {
    public final C1418377d A00;
    public final C139726zL A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6GR) {
                AnonymousClass6GR r5 = (AnonymousClass6GR) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A00, AnonymousClass000.A0L(this.A01));
    }

    public AnonymousClass6GR(C139726zL r1, C1418377d r2) {
        this.A01 = r1;
        this.A00 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvatarSticker(stableId=");
        A10.append(this.A01);
        A10.append(", sticker=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
