package X;

/* renamed from: X.6tY  reason: invalid class name and case insensitive filesystem */
public final class C136276tY {
    public final Boolean A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136276tY) {
                C136276tY r5 = (C136276tY) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((((C17900vP.A00(this.A04) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A05)) * 31) + C17880vN.A02(this.A01);
    }

    public C136276tY(Boolean bool, Boolean bool2, String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A00 = bool;
        this.A03 = str2;
        this.A02 = str3;
        this.A05 = str4;
        this.A01 = bool2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PackMessageSticker(fileName=");
        A10.append(this.A04);
        A10.append(", isAnimated=");
        A10.append(this.A00);
        A10.append(", emojis=");
        C108965cb.A1U(A10, this.A03);
        A10.append(this.A02);
        A10.append(", mimeType=");
        A10.append(this.A05);
        A10.append(", isLottie=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
