package X;

/* renamed from: X.9tT  reason: invalid class name and case insensitive filesystem */
public final class C195519tT {
    public final int A00;
    public final int A01;
    public final C122476Qn A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C195519tT(C122476Qn r2, String str, String str2, String str3, String str4, String str5, int i, int i2) {
        C18070vi.A0d(r2, 7);
        this.A07 = str;
        this.A06 = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = r2;
        this.A03 = str5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195519tT) {
                C195519tT r5 = (C195519tT) obj;
                if (!C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A04, r5.A04) || this.A00 != r5.A00 || this.A01 != r5.A01 || this.A02 != r5.A02 || !C18070vi.A18(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A022 = C17890vO.A02(this.A05, C17890vO.A02(this.A06, C17880vN.A03(this.A07)));
        return C108945cZ.A09(this.A03, AnonymousClass000.A0N(this.A02, (((C17890vO.A02(this.A04, A022) + this.A00) * 31) + this.A01) * 31));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Mask3DAsset(id=");
        A10.append(this.A07);
        A10.append(", fileName=");
        A10.append(this.A06);
        A10.append(", uri=");
        A10.append(this.A05);
        A10.append(", md5Hash=");
        A10.append(this.A04);
        A10.append(", fileSizeBytes=");
        A10.append(this.A00);
        A10.append(", uncompressedFileSizeBytes=");
        A10.append(this.A01);
        A10.append(", compressionType=");
        A10.append(this.A02);
        A10.append(", cacheKey=");
        return C17900vP.A0B(this.A03, A10);
    }
}
