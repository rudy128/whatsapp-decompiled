package X;

/* renamed from: X.9tW  reason: invalid class name and case insensitive filesystem */
public final class C195549tW {
    public final C20079A6f A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195549tW) {
                C195549tW r5 = (C195549tW) obj;
                if (!C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A06, r5.A06) || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || this.A07 != r5.A07) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A00, C17890vO.A02(this.A01, C17880vN.A03(this.A04)));
        return C17880vN.A01(C17890vO.A02(this.A05, (((C17890vO.A02(this.A06, A0N) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A02)) * 31), this.A07);
    }

    public C195549tW(C20079A6f a6f, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.A04 = str;
        this.A01 = str2;
        this.A00 = a6f;
        this.A06 = str3;
        this.A03 = str4;
        this.A02 = str5;
        this.A05 = str6;
        this.A07 = z;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("BusinessSearchRequestPayload(searchQuery=");
        A10.append(this.A04);
        A10.append(", countryCode=");
        A10.append(this.A01);
        A10.append(", searchLocation=");
        A10.append(this.A00);
        A10.append(", useCase=");
        A10.append(this.A06);
        A10.append(", searchId=");
        A10.append(this.A03);
        A10.append(", queryId=");
        A10.append(this.A02);
        A10.append(", searchSessionId=");
        A10.append(this.A05);
        A10.append(", isTest=");
        return C17900vP.A0F(A10, this.A07);
    }
}
