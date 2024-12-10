package X;

/* renamed from: X.4Ux  reason: invalid class name and case insensitive filesystem */
public final class C87264Ux {
    public final float A00;
    public final int A01;
    public final AnonymousClass4T9 A02;
    public final AnonymousClass4D1 A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87264Ux) {
                C87264Ux r5 = (C87264Ux) obj;
                if (!(this.A01 == r5.A01 && C18070vi.A18(this.A02, r5.A02) && Float.compare(this.A00, r5.A00) == 0 && this.A04 == r5.A04 && this.A03 == r5.A03 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C17880vN.A01(AnonymousClass000.A0N(this.A03, AnonymousClass0DV.A00(AnonymousClass000.A0B(AnonymousClass000.A0N(this.A02, this.A01 * 31), this.A00), this.A04)), this.A05);
    }

    public C87264Ux(AnonymousClass4T9 r1, AnonymousClass4D1 r2, float f, int i, boolean z, boolean z2) {
        this.A01 = i;
        this.A02 = r1;
        this.A00 = f;
        this.A04 = z;
        this.A03 = r2;
        this.A05 = z2;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ButtonState(res=");
        A10.append(this.A01);
        A10.append(", accessibilityProvider=");
        A10.append(this.A02);
        A10.append(", rotationDegrees=");
        A10.append(this.A00);
        A10.append(", enabled=");
        A10.append(this.A04);
        A10.append(", wdsButtonSize=");
        A10.append(this.A03);
        A10.append(", selected=");
        return C17900vP.A0F(A10, this.A05);
    }
}
