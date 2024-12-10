package X;

/* renamed from: X.6Up  reason: invalid class name and case insensitive filesystem */
public final class C123476Up {
    public C122726Rr A00;
    public C122726Rr A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C123476Up) {
                C123476Up r5 = (C123476Up) obj;
                if (!(this.A04 == r5.A04 && this.A03 == r5.A03 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A06 == r5.A06 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C136056tC A00() {
        boolean z = this.A04;
        boolean z2 = this.A03;
        return new C136056tC(this.A00, this.A01, z, this.A02, z2);
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A04), this.A03))), this.A02), this.A06), this.A05);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrossPostingViewModelState(shareViewVisible=");
        A10.append(this.A04);
        A10.append(", shareViewShouldAnimate=");
        A10.append(this.A03);
        A10.append(", fbIconState=");
        A10.append(this.A00);
        A10.append(", igIconState=");
        A10.append(this.A01);
        A10.append(", migrationXFamilyShareViewVisible=");
        A10.append(this.A02);
        A10.append(", upsellViewVisible=");
        A10.append(this.A06);
        A10.append(", upsellViewShouldAnimate=");
        return C17900vP.A0F(A10, this.A05);
    }
}
