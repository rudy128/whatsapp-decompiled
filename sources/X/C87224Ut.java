package X;

/* renamed from: X.4Ut  reason: invalid class name and case insensitive filesystem */
public final class C87224Ut {
    public final int A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87224Ut) {
                C87224Ut r5 = (C87224Ut) obj;
                if (this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((this.A00 * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A02)) * 31) + C17880vN.A02(this.A01);
    }

    public C87224Ut(Integer num, String str, String str2, String str3, int i) {
        this.A00 = i;
        this.A04 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ScreenshotUploadResult(result=");
        A10.append(this.A00);
        A10.append(", uploadUrl=");
        A10.append(this.A04);
        A10.append(", iv=");
        A10.append(this.A03);
        A10.append(", cipherKey=");
        A10.append(this.A02);
        A10.append(", mediaType=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
