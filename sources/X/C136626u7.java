package X;

/* renamed from: X.6u7  reason: invalid class name and case insensitive filesystem */
public final class C136626u7 {
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136626u7) {
                C136626u7 r5 = (C136626u7) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A0D, r5.A0D) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A0A, r5.A0A) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A0C, r5.A0C) || !C18070vi.A18(this.A0B, r5.A0B) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A032 = C17880vN.A03(this.A03);
        return AnonymousClass000.A0O(this.A00, (((((((((((((((((((((C17890vO.A02(this.A09, A032) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A05)) * 31) + C17900vP.A00(this.A08)) * 31) + C17900vP.A00(this.A07)) * 31) + C17900vP.A00(this.A0D)) * 31) + C17900vP.A00(this.A06)) * 31) + C17900vP.A00(this.A0A)) * 31) + C17900vP.A00(this.A04)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17900vP.A00(this.A0C)) * 31) + C17900vP.A00(this.A0B)) * 31);
    }

    public C136626u7(Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        C18070vi.A0j(str, str2);
        this.A03 = str;
        this.A09 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A08 = str5;
        this.A07 = str6;
        this.A0D = str7;
        this.A06 = str8;
        this.A0A = str9;
        this.A04 = str10;
        this.A01 = l;
        this.A0C = str11;
        this.A0B = str12;
        this.A00 = l2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("MediaUploadSuccessParams(collectionId=");
        A10.append(this.A03);
        A10.append(", mediaJobId=");
        A10.append(this.A09);
        A10.append(", cdnUrl=");
        A10.append(this.A02);
        A10.append(", encKey=");
        A10.append(this.A05);
        A10.append(", iv=");
        A10.append(this.A08);
        A10.append(", hmacKey=");
        A10.append(this.A07);
        A10.append(", plaintextHash=");
        A10.append(this.A0D);
        A10.append(", encryptedHashWithTruncatedHmac=");
        A10.append(this.A06);
        A10.append(", mediaKey=");
        A10.append(this.A0A);
        A10.append(", directPath=");
        A10.append(this.A04);
        A10.append(", mediaKeyTimeStamp=");
        A10.append(this.A01);
        A10.append(", mimeType=");
        A10.append(this.A0C);
        A10.append(", mediaType=");
        A10.append(this.A0B);
        A10.append(", fileSize=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
