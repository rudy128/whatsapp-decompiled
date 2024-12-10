package X;

/* renamed from: X.6tK  reason: invalid class name and case insensitive filesystem */
public final class C136136tK {
    public final Integer A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136136tK) {
                C136136tK r5 = (C136136tK) obj;
                if (!C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C17890vO.A02(this.A04, C17890vO.A02(this.A02, C17880vN.A03(this.A05))) + C17900vP.A00(this.A03)) * 31) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00);
    }

    public C136136tK(Integer num, Long l, String str, String str2, String str3, String str4) {
        C18070vi.A0o(str, str2, str3);
        this.A05 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A03 = str4;
        this.A01 = l;
        this.A00 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AddMediaUploadParams(previewImage=");
        A10.append(this.A05);
        A10.append(", collectionId=");
        A10.append(this.A02);
        A10.append(", mediaJobId=");
        A10.append(this.A04);
        A10.append(", fileName=");
        A10.append(this.A03);
        A10.append(", fileSize=");
        A10.append(this.A01);
        A10.append(", documentPageCount=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
