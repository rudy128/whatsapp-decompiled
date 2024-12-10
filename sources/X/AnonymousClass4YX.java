package X;

/* renamed from: X.4YX  reason: invalid class name */
public final class AnonymousClass4YX {
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public AnonymousClass4YX() {
        this(0, false, true, false, false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass4YX) {
                AnonymousClass4YX r5 = (AnonymousClass4YX) obj;
                if (!(this.A04 == r5.A04 && this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00((AnonymousClass3MX.A03(this.A04) + this.A00) * 31, this.A02), this.A01), this.A03);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("State(toolTipVisible=");
        A10.append(this.A04);
        A10.append(", toolTipType=");
        A10.append(this.A00);
        A10.append(", entryIsBlank=");
        A10.append(this.A02);
        A10.append(", canSendPushToVideoMessages=");
        A10.append(this.A01);
        A10.append(", isCameraEntryPointEnabled=");
        return C17900vP.A0F(A10, this.A03);
    }

    public AnonymousClass4YX(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A04 = z;
        this.A00 = i;
        this.A02 = z2;
        this.A01 = z3;
        this.A03 = z4;
    }
}
