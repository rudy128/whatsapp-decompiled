package X;

/* renamed from: X.6tC  reason: invalid class name and case insensitive filesystem */
public final class C136056tC {
    public C122726Rr A00;
    public C122726Rr A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C136056tC) {
                C136056tC r5 = (C136056tC) obj;
                if (!(this.A02 == r5.A02 && this.A03 == r5.A03 && this.A04 == r5.A04 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A01, AnonymousClass000.A0N(this.A00, AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A02), this.A03), this.A04)));
    }

    public C136056tC(C122726Rr r1, C122726Rr r2, boolean z, boolean z2, boolean z3) {
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrosspostContextualViewState(isVisible=");
        A10.append(this.A02);
        A10.append(", isXFamilyShareViewVisible=");
        A10.append(this.A03);
        A10.append(", shouldAnimate=");
        A10.append(this.A04);
        A10.append(", fbIconState=");
        A10.append(this.A00);
        A10.append(", igIconState=");
        return AnonymousClass001.A1F(this.A01, A10);
    }
}
