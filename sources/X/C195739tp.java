package X;

/* renamed from: X.9tp  reason: invalid class name and case insensitive filesystem */
public final class C195739tp {
    public String A00 = null;
    public String A01 = null;
    public String A02 = null;
    public String A03 = null;
    public boolean A04 = false;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;

    public C195739tp(String str, String str2, String str3, String str4, String str5) {
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A05 = str4;
        this.A06 = str5;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195739tp) {
                C195739tp r5 = (C195739tp) obj;
                if (!C18070vi.A18(this.A09, r5.A09) || !C18070vi.A18(this.A08, r5.A08) || !C18070vi.A18(this.A07, r5.A07) || !C18070vi.A18(this.A05, r5.A05) || !C18070vi.A18(this.A06, r5.A06) || this.A04 != r5.A04 || !C18070vi.A18(this.A03, r5.A03) || !C18070vi.A18(this.A00, r5.A00) || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((AnonymousClass0DV.A00(C17890vO.A02(this.A06, C17890vO.A02(this.A05, C17890vO.A02(this.A07, C17890vO.A02(this.A08, C17880vN.A03(this.A09))))), this.A04) + C17900vP.A00(this.A03)) * 31) + C17900vP.A00(this.A00)) * 31) + C17900vP.A00(this.A02)) * 31) + C108955ca.A06(this.A01);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExternalServerUpiApp(type=");
        A10.append(this.A09);
        A10.append(", packageName=");
        A10.append(this.A08);
        A10.append(", loggableName=");
        A10.append(this.A07);
        A10.append(", displayName=");
        A10.append(this.A05);
        A10.append(", imageUrl=");
        A10.append(this.A06);
        A10.append(", isPreferredPayment=");
        A10.append(this.A04);
        A10.append(", offerValueStr=");
        A10.append(this.A03);
        A10.append(", offerAmountType=");
        A10.append(this.A00);
        A10.append(", offerType=");
        A10.append(this.A02);
        A10.append(", offerDescription=");
        return C17900vP.A0B(this.A01, A10);
    }
}
