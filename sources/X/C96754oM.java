package X;

/* renamed from: X.4oM  reason: invalid class name and case insensitive filesystem */
public final class C96754oM implements AnonymousClass5Y4 {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C96754oM) {
                C96754oM r5 = (C96754oM) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(((this.A00 * 31) + 2131233507) * 31, this.A02), this.A01), this.A03);
    }

    public C96754oM(int i, boolean z, boolean z2, boolean z3) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = z2;
        this.A03 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ListsHeader(description=");
        A10.append(this.A00);
        A10.append(", logo=");
        A10.append(2131233507);
        A10.append(", isEdit=");
        A10.append(this.A02);
        A10.append(", hasCreatedCustomList=");
        A10.append(this.A01);
        A10.append(", isReorderBottomSheet=");
        return C17900vP.A0F(A10, this.A03);
    }
}
