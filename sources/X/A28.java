package X;

public final class A28 {
    public final A7B A00;
    public final A7B A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A28) {
                A28 a28 = (A28) obj;
                if (!(this.A04 == a28.A04 && this.A02 == a28.A02 && C18070vi.A18(this.A01, a28.A01) && C18070vi.A18(this.A00, a28.A00) && this.A05 == a28.A05 && this.A03 == a28.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00((((AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A04), this.A02) + AnonymousClass001.A0k(this.A01)) * 31) + C17880vN.A02(this.A00)) * 31, this.A05), this.A03);
    }

    public A28(A7B a7b, A7B a7b2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A02 = z2;
        this.A01 = a7b;
        this.A00 = a7b2;
        this.A05 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ViewState(isUpdateInProgress=");
        A10.append(this.A04);
        A10.append(", isDeregisterInProgress=");
        A10.append(this.A02);
        A10.append(", updateApiError=");
        A10.append(this.A01);
        A10.append(", deregisterApiError=");
        A10.append(this.A00);
        A10.append(", isUpdateSuccessful=");
        A10.append(this.A05);
        A10.append(", isDeregisterSuccessful=");
        return C17900vP.A0F(A10, this.A03);
    }

    public A28() {
        this((A7B) null, (A7B) null, false, false, false, false);
    }
}
