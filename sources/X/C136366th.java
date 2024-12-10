package X;

/* renamed from: X.6th  reason: invalid class name and case insensitive filesystem */
public final class C136366th {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136366th) {
                C136366th r5 = (C136366th) obj;
                if (!C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A04, r5.A04) || !C18070vi.A18(this.A01, r5.A01) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C17890vO.A02(this.A01, C17890vO.A02(this.A04, C17880vN.A03(this.A03))) + C17900vP.A00(this.A02)) * 31) + C17900vP.A00(this.A05)) * 31) + C108955ca.A06(this.A06)) * 31) + this.A00;
    }

    public C136366th(String str, String str2, String str3, int i, String str4, String str5, String str6) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A02 = str4;
        this.A05 = str5;
        this.A06 = str6;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("FlowsStrDatePickerInputParams(inputName=");
        A10.append(this.A03);
        A10.append(", inputType=");
        A10.append(this.A04);
        A10.append(", dateFormat=");
        A10.append(this.A01);
        A10.append(", initialDate=");
        A10.append(this.A02);
        A10.append(", maxDate=");
        A10.append(this.A05);
        A10.append(", minDate=");
        A10.append(this.A06);
        A10.append(", flowsDatePickerMode=");
        return AnonymousClass001.A1L(A10, this.A00);
    }
}
