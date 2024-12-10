package X;

/* renamed from: X.6tn  reason: invalid class name and case insensitive filesystem */
public final class C136426tn {
    public final Long A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136426tn) {
                C136426tn r5 = (C136426tn) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A03, r5.A03) || this.A07 != r5.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(((((((((((((C17900vP.A00(this.A01) * 31) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A04)) * 31) + C17900vP.A00(this.A05)) * 31) + AnonymousClass001.A0k(this.A00)) * 31) + C17900vP.A00(this.A06)) * 31) + C108955ca.A06(this.A03)) * 31, this.A07);
    }

    public C136426tn(Long l, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = l;
        this.A06 = str5;
        this.A03 = str6;
        this.A07 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ContactAddParam(accountName=");
        A10.append(this.A01);
        A10.append(", accountType=");
        A10.append(this.A02);
        A10.append(", firstName=");
        A10.append(this.A04);
        A10.append(", lastName=");
        A10.append(this.A05);
        A10.append(", updateContactRowId=");
        A10.append(this.A00);
        A10.append(", phoneNumber=");
        A10.append(this.A06);
        A10.append(", businessName=");
        A10.append(this.A03);
        A10.append(", savingWaContactToPhone=");
        return C17900vP.A0F(A10, this.A07);
    }
}
