package X;

/* renamed from: X.6uA  reason: invalid class name and case insensitive filesystem */
public final class C136656uA {
    public String A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final boolean A0G;
    public final boolean A0H;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136656uA) {
                C136656uA r8 = (C136656uA) obj;
                if (!C18070vi.A18(this.A0C, r8.A0C) || !C18070vi.A18(this.A01, r8.A01) || this.A07 != r8.A07 || !C18070vi.A18(this.A0F, r8.A0F) || !C18070vi.A18(this.A0B, r8.A0B) || !C18070vi.A18(this.A09, r8.A09) || !C18070vi.A18(this.A0E, r8.A0E) || !C18070vi.A18(this.A0D, r8.A0D) || this.A04 != r8.A04 || this.A06 != r8.A06 || this.A05 != r8.A05 || !C18070vi.A18(this.A0A, r8.A0A) || this.A0H != r8.A0H || this.A02 != r8.A02 || !C18070vi.A18(this.A00, r8.A00) || this.A0G != r8.A0G || this.A03 != r8.A03 || !C18070vi.A18(this.A08, r8.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((((((((((((((AnonymousClass001.A0K(this.A07, (C17880vN.A03(this.A0C) + C17900vP.A00(this.A01)) * 31) + C17900vP.A00(this.A0F)) * 31) + C17900vP.A00(this.A0B)) * 31) + C17900vP.A00(this.A09)) * 31) + C17900vP.A00(this.A0E)) * 31) + C17900vP.A00(this.A0D)) * 31) + this.A04) * 31) + this.A06) * 31) + this.A05) * 31) + C17900vP.A00(this.A0A)) * 31, this.A0H), this.A02) + C17900vP.A00(this.A00)) * 31, this.A0G), this.A03) + C108955ca.A06(this.A08);
    }

    public C136656uA(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, int i2, int i3, long j, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A0C = str;
        this.A01 = str2;
        this.A07 = j;
        this.A0F = str3;
        this.A0B = str4;
        this.A09 = str5;
        this.A0E = str6;
        this.A0D = str7;
        this.A04 = i;
        this.A06 = i2;
        this.A05 = i3;
        this.A0A = str8;
        this.A0H = z;
        this.A02 = z2;
        this.A00 = str9;
        this.A0G = z3;
        this.A03 = z4;
        this.A08 = str10;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StarredStickerData(fileHash=");
        A10.append(this.A0C);
        A10.append(", imageHash=");
        A10.append(this.A01);
        A10.append(", timestamp=");
        A10.append(this.A07);
        A10.append(", url=");
        A10.append(this.A0F);
        A10.append(", encHash=");
        A10.append(this.A0B);
        A10.append(", directPath=");
        A10.append(this.A09);
        A10.append(", mimeType=");
        A10.append(this.A0E);
        A10.append(", mediaKey=");
        A10.append(this.A0D);
        A10.append(", fileSize=");
        A10.append(this.A04);
        A10.append(", width=");
        A10.append(this.A06);
        A10.append(", height=");
        A10.append(this.A05);
        A10.append(", emojis=");
        A10.append(this.A0A);
        A10.append(", isFirstParty=");
        A10.append(this.A0H);
        A10.append(", isAvatarSticker=");
        A10.append(this.A02);
        A10.append(", avatarStableId=");
        A10.append(this.A00);
        A10.append(", isAISticker=");
        A10.append(this.A0G);
        A10.append(", isLottie=");
        A10.append(this.A03);
        A10.append(", accessibilityText=");
        return C17900vP.A0B(this.A08, A10);
    }
}
