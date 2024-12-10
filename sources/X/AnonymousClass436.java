package X;

/* renamed from: X.436  reason: invalid class name */
public final class AnonymousClass436 extends C83294Eo {
    public int A00 = 0;
    public boolean A01 = false;
    public final int A02;
    public final C122716Rq A03;
    public final String A04;
    public final String A05;

    public AnonymousClass436(C122716Rq r3, String str, String str2, int i) {
        C18070vi.A0d(str2, 2);
        this.A04 = str;
        this.A05 = str2;
        this.A03 = r3;
        this.A02 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass436) {
                AnonymousClass436 r5 = (AnonymousClass436) obj;
                if (!(C18070vi.A18(this.A04, r5.A04) && C18070vi.A18(this.A05, r5.A05) && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01((((AnonymousClass000.A0N(this.A03, C17890vO.A02(this.A05, C17880vN.A03(this.A04))) + this.A02) * 31) + this.A00) * 31, this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AvailableLanguageItem(language=");
        A10.append(this.A04);
        A10.append(", languageTag=");
        A10.append(this.A05);
        A10.append(", modelFeature=");
        A10.append(this.A03);
        A10.append(", maxModelSizeInMb=");
        A10.append(this.A02);
        A10.append(", progress=");
        A10.append(this.A00);
        A10.append(", downloading=");
        return C17900vP.A0F(A10, this.A01);
    }
}
