package X;

/* renamed from: X.6sm  reason: invalid class name and case insensitive filesystem */
public final class C135796sm {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C135796sm) {
                C135796sm r5 = (C135796sm) obj;
                if (!(this.A00 == r5.A00 && this.A02 == r5.A02 && this.A01 == r5.A01 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass0DV.A00(AnonymousClass0DV.A00(AnonymousClass3MX.A03(this.A00), this.A02), this.A01), this.A03);
    }

    public C135796sm(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A00 = z;
        this.A02 = z2;
        this.A01 = z3;
        this.A03 = z4;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DoodleControllerConfig(aspectRatioTo9by16Enabled=");
        A10.append(this.A00);
        A10.append(", shouldDisableCropRectAndRotation=");
        A10.append(this.A02);
        A10.append(", resetBlueShapesOnCroppingEnabled=");
        A10.append(this.A01);
        A10.append(", snapBackEnabled=");
        return C17900vP.A0F(A10, this.A03);
    }
}
