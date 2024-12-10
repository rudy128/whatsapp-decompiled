package X;

/* renamed from: X.CbF  reason: case insensitive filesystem */
public final class C25219CbF {
    public final int A00;
    public final C140066zt A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25219CbF) {
                C25219CbF cbF = (C25219CbF) obj;
                if (!(C18070vi.A18(this.A01, cbF.A01) && this.A00 == cbF.A00 && this.A02 == cbF.A02 && this.A04 == cbF.A04 && this.A03 == cbF.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass000.A0L(this.A01) + this.A00) * 31, this.A02), this.A04), this.A03);
    }

    public C25219CbF(C140066zt r1, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = z;
        this.A04 = z2;
        this.A03 = z3;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CachedSpec(spec=");
        A10.append(this.A01);
        A10.append(", screenOrientation=");
        A10.append(this.A00);
        A10.append(", isEmbedded=");
        A10.append(this.A02);
        A10.append(", isVerticalGrid=");
        A10.append(this.A04);
        A10.append(", isHorizontalGridEnabled=");
        return C17900vP.A0F(A10, this.A03);
    }
}
