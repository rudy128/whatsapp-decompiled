package X;

/* renamed from: X.6tm  reason: invalid class name and case insensitive filesystem */
public final class C136416tm {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136416tm) {
                C136416tm r5 = (C136416tm) obj;
                if (!(this.A01 == r5.A01 && C18070vi.A18(this.A02, r5.A02) && this.A00 == r5.A00 && C18070vi.A18(this.A03, r5.A03) && C18070vi.A18(this.A04, r5.A04) && this.A06 == r5.A06 && this.A07 == r5.A07 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((((C17890vO.A02(this.A02, this.A01 * 31) + this.A00) * 31) + C17900vP.A00(this.A03)) * 31) + C108955ca.A06(this.A04)) * 31, this.A06), this.A07), this.A05);
    }

    public C136416tm(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3) {
        this.A01 = i;
        this.A02 = str;
        this.A00 = i2;
        this.A03 = str2;
        this.A04 = str3;
        this.A06 = z;
        this.A07 = z2;
        this.A05 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ConsentData(year=");
        A10.append(this.A01);
        A10.append(", date=");
        A10.append(this.A02);
        A10.append(", age=");
        A10.append(this.A00);
        A10.append(", errorMessage=");
        A10.append(this.A03);
        A10.append(", resultError=");
        A10.append(this.A04);
        A10.append(", isLoading=");
        A10.append(this.A06);
        A10.append(", isMonthAndDayRequired=");
        A10.append(this.A07);
        A10.append(", isCtaEnabled=");
        return C17900vP.A0F(A10, this.A05);
    }
}
