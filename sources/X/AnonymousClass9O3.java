package X;

/* renamed from: X.9O3  reason: invalid class name */
public final class AnonymousClass9O3 {
    public C1418477e A00;
    public AnonymousClass8pF A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9O3) {
                AnonymousClass9O3 r5 = (AnonymousClass9O3) obj;
                if (!C18070vi.A18(this.A01, r5.A01) || this.A03 != r5.A03 || this.A04 != r5.A04 || !C18070vi.A18(this.A02, r5.A02) || !C18070vi.A18(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0L(this.A01), this.A03), this.A04) * 31) + C17900vP.A00(this.A02)) * 31) + C17880vN.A02(this.A00);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IndiaUpiNonWaContactData(indiaUpiContactData=");
        A10.append(this.A01);
        A10.append(", isMerchant=");
        A10.append(this.A03);
        A10.append(", isVerifiedMerchant=");
        A10.append(this.A04);
        C108975cc.A17(A10, ", transactionType=");
        A10.append(", merchantCarrierCode=");
        A10.append(this.A02);
        A10.append(", upiNumber=");
        return AnonymousClass001.A1F(this.A00, A10);
    }
}
