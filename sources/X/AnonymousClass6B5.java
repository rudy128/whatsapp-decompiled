package X;

/* renamed from: X.6B5  reason: invalid class name */
public final class AnonymousClass6B5 extends AnonymousClass6TV {
    public int A00 = -1;
    public AnonymousClass1E7 A01;
    public Integer A02 = null;
    public String A03;
    public String A04 = null;
    public boolean A05;
    public final C46162Dk A06;

    public AnonymousClass6B5(C46162Dk r3, AnonymousClass1E7 r4, String str, boolean z) {
        this.A06 = r3;
        this.A01 = r4;
        this.A05 = z;
        this.A03 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B5) {
                AnonymousClass6B5 r5 = (AnonymousClass6B5) obj;
                if (!C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A01, r5.A01) || this.A05 != r5.A05 || !C18070vi.A18(this.A03, r5.A03) || this.A00 != r5.A00 || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((((AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0L(this.A06)), this.A05) * 31) + C17900vP.A00(this.A03)) * 31) + this.A00) * 31) + C17900vP.A00(this.A04)) * 31) + C17880vN.A02(this.A02);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NewsletterDataItem(newsletterInfo=");
        C108965cb.A1R(this.A06, A10);
        C108965cb.A1T(this.A01, A10);
        A10.append(this.A05);
        C108975cc.A17(A10, ", pcId=");
        A10.append(", categoryName=");
        A10.append(this.A03);
        A10.append(", categoryIndex=");
        A10.append(this.A00);
        A10.append(", countrySelected=");
        A10.append(this.A04);
        A10.append(", pillSelected=");
        return AnonymousClass001.A1F(this.A02, A10);
    }
}
