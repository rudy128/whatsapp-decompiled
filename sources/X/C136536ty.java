package X;

/* renamed from: X.6ty  reason: invalid class name and case insensitive filesystem */
public final class C136536ty {
    public final int A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public C136536ty(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, long j, boolean z) {
        C18070vi.A0d(str, 1);
        this.A07 = str;
        this.A08 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A06 = str5;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str6;
        this.A02 = j;
        this.A09 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136536ty) {
                C136536ty r8 = (C136536ty) obj;
                if (!C18070vi.A18(this.A07, r8.A07) || !C18070vi.A18(this.A08, r8.A08) || !C18070vi.A18(this.A04, r8.A04) || !C18070vi.A18(this.A05, r8.A05) || !C18070vi.A18(this.A06, r8.A06) || this.A01 != r8.A01 || this.A00 != r8.A00 || !C18070vi.A18(this.A03, r8.A03) || this.A02 != r8.A02 || this.A09 != r8.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass001.A0K(this.A02, (((((((((((((C17880vN.A03(this.A07) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A06)) * 31) + this.A01) * 31) + this.A00) * 31) + C108955ca.A06(this.A03)) * 31), this.A09);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerSyncMetadata(stickerFileHash=");
        A10.append(this.A07);
        A10.append(", url=");
        A10.append(this.A08);
        A10.append(", encFileHash=");
        A10.append(this.A04);
        A10.append(", mediaKey=");
        A10.append(this.A05);
        A10.append(", mimeType=");
        A10.append(this.A06);
        A10.append(", width=");
        A10.append(this.A01);
        A10.append(", height=");
        A10.append(this.A00);
        A10.append(", directPath=");
        A10.append(this.A03);
        A10.append(", fileSize=");
        A10.append(this.A02);
        A10.append(", isLottie=");
        return C17900vP.A0F(A10, this.A09);
    }
}
