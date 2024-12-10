package X;

/* renamed from: X.6pg  reason: invalid class name and case insensitive filesystem */
public final class C133896pg {
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public final C1418377d A04;

    public C133896pg(C1418377d r2, String str, String str2, String str3, long j) {
        C18070vi.A0d(str, 1);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = r2;
        this.A00 = j;
        this.A01 = str3;
    }

    public final void A00(C1418377d r3) {
        C1418377d r1 = this.A04;
        r1.A0F = r3.A0F;
        r1.A0C = r3.A0C;
        r1.A0I = r3.A0I;
        String str = r3.A0A;
        if (str != null) {
            r1.A0A = str;
        }
        r1.A08 = r3.A08;
        String str2 = r3.A0E;
        if (str2 != null) {
            r1.A0E = str2;
        }
        String str3 = r3.A0D;
        if (str3 != null) {
            r1.A0D = str3;
        }
        r1.A00 = r3.A00;
        r1.A03 = r3.A03;
        r1.A02 = r3.A02;
        r1.A0C = r3.A0C;
        r1.A0Q = r3.A02();
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("RecentStickerIdentifier{fileHash='");
        A10.append(this.A02);
        A10.append("', imageHash='");
        A10.append(this.A03);
        A10.append("', sticker=");
        A10.append(this.A04);
        A10.append(", lastStickerSentTs=");
        A10.append(this.A00);
        A10.append(", avatarTemplateId='");
        A10.append(this.A01);
        return AnonymousClass000.A0y("'}", A10);
    }
}
