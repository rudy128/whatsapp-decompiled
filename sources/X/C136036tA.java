package X;

/* renamed from: X.6tA  reason: invalid class name and case insensitive filesystem */
public final class C136036tA {
    public final float A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136036tA) {
                C136036tA r5 = (C136036tA) obj;
                if (!(this.A03 == r5.A03 && this.A01 == r5.A01 && Float.compare(this.A00, r5.A00) == 0 && this.A02 == r5.A02 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass000.A0B((AnonymousClass3MX.A03(this.A03) + this.A01) * 31, this.A00), this.A02), this.A04);
    }

    public C136036tA(float f, int i, boolean z, boolean z2, boolean z3) {
        this.A03 = z;
        this.A01 = i;
        this.A00 = f;
        this.A02 = z2;
        this.A04 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CommandData(isBusinessThirdPartyBot=");
        A10.append(this.A03);
        A10.append(", botProfileSize=");
        A10.append(this.A01);
        A10.append(", botProfileRadius=");
        A10.append(this.A00);
        A10.append(", isBusinessAccount=");
        A10.append(this.A02);
        A10.append(", isFirstPartyBotAccount=");
        return C17900vP.A0F(A10, this.A04);
    }
}
