package X;

/* renamed from: X.6Je  reason: invalid class name and case insensitive filesystem */
public final class C121316Je extends AnonymousClass6U0 implements C1603087y {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C123476Up A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C121316Je) {
                C121316Je r5 = (C121316Je) obj;
                if (!(C18070vi.A18(this.A03, r5.A03) && this.A04 == r5.A04 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass0DV.A00(AnonymousClass001.A0k(this.A03) * 31, this.A04) + this.A02) * 31) + this.A00) * 31) + this.A01;
    }

    public C121316Je(C123476Up r1, int i, int i2, int i3, boolean z) {
        this.A03 = r1;
        this.A04 = z;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
    }

    public C123476Up BPj() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CrossPostingItem(crossPostingViewModelState=");
        A10.append(this.A03);
        A10.append(", isAnchorEnabled=");
        A10.append(this.A04);
        A10.append(", topMarginRes=");
        A10.append(this.A02);
        A10.append(", sideMarginRes=");
        A10.append(this.A00);
        A10.append(", sideMarginUpsellingRes=");
        return AnonymousClass001.A1L(A10, this.A01);
    }
}
