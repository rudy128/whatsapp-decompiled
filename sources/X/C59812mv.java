package X;

/* renamed from: X.2mv  reason: invalid class name and case insensitive filesystem */
public final class C59812mv {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C42691ya A04;
    public final C42691ya A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !C18070vi.A14(this, obj)) {
                return false;
            }
            C59812mv r4 = (C59812mv) obj;
            if (!(this.A03 == r4.A03 && this.A01 == r4.A01 && this.A08 == r4.A08 && this.A02 == r4.A02 && this.A00 == r4.A00 && C42171xk.A00(this.A07, r4.A07) && C42171xk.A00(this.A06, r4.A06) && C42171xk.A00(this.A05, r4.A05) && C42171xk.A00(this.A04, r4.A04))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        AnonymousClass000.A1L(objArr, this.A03);
        AnonymousClass000.A1M(objArr, this.A01);
        objArr[2] = this.A07;
        objArr[3] = this.A06;
        objArr[4] = this.A05;
        objArr[5] = this.A04;
        objArr[6] = Boolean.valueOf(this.A08);
        C17890vO.A1I(objArr, this.A02);
        return AnonymousClass000.A0P(Integer.valueOf(this.A00), objArr, 8);
    }

    public C59812mv(C42691ya r1, C42691ya r2, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        this.A03 = i;
        this.A01 = i2;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r1;
        this.A04 = r2;
        this.A08 = z;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VerifiedNameData(oldVerifiedLevel=");
        A10.append(this.A03);
        A10.append(", newVerifiedLevel=");
        A10.append(this.A01);
        A10.append(", oldVerifiedName=");
        A10.append(this.A07);
        A10.append(", newVerifiedName=");
        A10.append(this.A06);
        A10.append(", oldPrivacyMode=");
        A10.append(this.A05);
        A10.append(", newPrivacyMode=");
        A10.append(this.A04);
        A10.append(", verifiedNameInSync=");
        A10.append(this.A08);
        A10.append(", oldClient=");
        A10.append(this.A02);
        A10.append(", newClient=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
