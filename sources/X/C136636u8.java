package X;

/* renamed from: X.6u8  reason: invalid class name and case insensitive filesystem */
public final class C136636u8 {
    public String A00 = null;
    public String A01 = null;
    public String A02 = null;
    public String A03 = null;
    public String A04 = null;
    public boolean A05 = false;
    public boolean A06 = false;
    public boolean A07 = false;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136636u8) {
                C136636u8 r5 = (C136636u8) obj;
                if (!(this.A0B == r5.A0B && this.A09 == r5.A09 && this.A0A == r5.A0A && this.A05 == r5.A05 && this.A08 == r5.A08 && this.A0D == r5.A0D && C18070vi.A18(this.A02, r5.A02) && C18070vi.A18(this.A03, r5.A03) && C18070vi.A18(this.A01, r5.A01) && C18070vi.A18(this.A04, r5.A04) && this.A06 == r5.A06 && this.A0C == r5.A0C && this.A07 == r5.A07 && C18070vi.A18(this.A00, r5.A00))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A0B), this.A09), this.A0A), this.A05), this.A08), this.A0D) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A04)) * 31, this.A06), this.A0C), this.A07) + C108955ca.A06(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerInfo(isInstalled=");
        A10.append(this.A0B);
        A10.append(", isFavorited=");
        A10.append(this.A09);
        A10.append(", isFromStickerMaker=");
        A10.append(this.A0A);
        A10.append(", hasPackInStore=");
        A10.append(this.A05);
        A10.append(", isAvatarSticker=");
        A10.append(this.A08);
        A10.append(", userHasAvatar=");
        A10.append(this.A0D);
        A10.append(", packName=");
        A10.append(this.A02);
        A10.append(", packPublisher=");
        A10.append(this.A03);
        A10.append(", packId=");
        A10.append(this.A01);
        A10.append(", playStoreLink=");
        A10.append(this.A04);
        A10.append(", isAiSticker=");
        A10.append(this.A06);
        A10.append(", isRecent=");
        A10.append(this.A0C);
        A10.append(", isAvatarSocialSticker=");
        A10.append(this.A07);
        A10.append(", avatarStickerStyle=");
        return C17900vP.A0B(this.A00, A10);
    }
}
