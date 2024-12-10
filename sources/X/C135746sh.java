package X;

/* renamed from: X.6sh  reason: invalid class name and case insensitive filesystem */
public final class C135746sh {
    public final int A00;
    public final AnonymousClass1E7 A01;
    public final AnonymousClass1BI A02;
    public final C1418377d A03;

    public C135746sh(AnonymousClass1E7 r2, AnonymousClass1BI r3, C1418377d r4, int i) {
        C18070vi.A0d(r4, 2);
        this.A00 = i;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135746sh) {
                C135746sh r5 = (C135746sh) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A02, AnonymousClass000.A0N(this.A03, this.A00 * 31)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendAiStickerResult(position=");
        A10.append(this.A00);
        A10.append(", sticker=");
        A10.append(this.A03);
        A10.append(", chatJid=");
        A10.append(this.A02);
        A10.append(", waContact=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
