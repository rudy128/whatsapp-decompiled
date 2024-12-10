package X;

/* renamed from: X.Cl2  reason: case insensitive filesystem */
public final class C25732Cl2 {
    public static final C25732Cl2 A05 = new C25732Cl2(1.0f, 1.0f, false, false);
    public final float A00;
    public final float A01;
    public final int A02;
    public final boolean A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C25732Cl2 cl2 = (C25732Cl2) obj;
            if (!(this.A01 == cl2.A01 && this.A00 == cl2.A00 && this.A04 == cl2.A04 && this.A03 == cl2.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + Float.floatToRawIntBits(this.A01)) * 31) + Float.floatToRawIntBits(this.A00)) * 31) + (this.A04 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0);
    }

    public C25732Cl2(float f, float f2, boolean z, boolean z2) {
        boolean z3 = true;
        C26056CrS.A02(AnonymousClass000.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        C26056CrS.A02(f2 <= 0.0f ? false : z3);
        this.A01 = f;
        this.A00 = f2;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = BE6.A04(f, 1000.0f);
    }
}
