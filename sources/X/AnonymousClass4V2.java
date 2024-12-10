package X;

/* renamed from: X.4V2  reason: invalid class name */
public final class AnonymousClass4V2 {
    public final int A00;
    public final int A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4V2) {
                AnonymousClass4V2 r5 = (AnonymousClass4V2) obj;
                if (!(this.A05 == r5.A05 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A02 == r5.A02 && this.A04 == r5.A04 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((((AnonymousClass3MX.A03(this.A05) + this.A00) * 31) + this.A01) * 31, this.A02), this.A04), this.A03);
    }

    public AnonymousClass4V2(int i, int i2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A05 = z;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = z2;
        this.A04 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ToolTipUiState(toolTipVisible=");
        A10.append(this.A05);
        A10.append(", recorderMode=");
        A10.append(this.A00);
        A10.append(", toolTipType=");
        A10.append(this.A01);
        A10.append(", canToggleRecorderMode=");
        A10.append(this.A02);
        A10.append(", isToolTipAnimationEnabled=");
        A10.append(this.A04);
        A10.append(", isSimplifiedRecorderModeAnimationEnabled=");
        return C17900vP.A0F(A10, this.A03);
    }
}
