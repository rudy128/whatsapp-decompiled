package X;

/* renamed from: X.4SW  reason: invalid class name */
public class AnonymousClass4SW {
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final AEW A04;
    public final AnonymousClass1E7 A05;
    public final AnonymousClass1E7 A06;
    public final C82974Cw A07;
    public final AnonymousClass1EC A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4SW r5 = (AnonymousClass4SW) obj;
            if (!(this.A09 == r5.A09 && this.A0A == r5.A0A && this.A0H == r5.A0H && this.A0I == r5.A0I && this.A0G == r5.A0G && this.A0E == r5.A0E && this.A0F == r5.A0F && this.A01 == r5.A01 && this.A05.equals(r5.A05) && C42171xk.A00(this.A08, r5.A08) && C42171xk.A00(this.A06, r5.A06) && this.A0C == r5.A0C && this.A0D == r5.A0D && this.A0B == r5.A0B && this.A03 == r5.A03 && this.A07 == r5.A07)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[18];
        objArr[0] = this.A05;
        objArr[1] = this.A08;
        objArr[2] = this.A06;
        objArr[3] = Boolean.valueOf(this.A09);
        objArr[4] = Boolean.valueOf(this.A0A);
        objArr[5] = Boolean.valueOf(this.A0H);
        objArr[6] = Boolean.valueOf(this.A0I);
        objArr[7] = Boolean.valueOf(this.A0G);
        objArr[8] = Boolean.valueOf(this.A0E);
        objArr[9] = AnonymousClass000.A0h();
        objArr[10] = Boolean.valueOf(this.A0F);
        objArr[11] = Integer.valueOf(this.A01);
        objArr[12] = Boolean.valueOf(this.A0C);
        objArr[13] = Boolean.valueOf(this.A0D);
        objArr[14] = Boolean.valueOf(this.A0B);
        objArr[15] = Integer.valueOf(this.A03);
        objArr[16] = null;
        return AnonymousClass000.A0P(this.A07, objArr, 17);
    }

    public AnonymousClass4SW(AEW aew, AnonymousClass1E7 r3, AnonymousClass1E7 r4, C82974Cw r5, AnonymousClass1EC r6, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        this.A05 = r3;
        this.A08 = r6;
        this.A06 = r4;
        this.A09 = z;
        this.A0A = z2;
        this.A0H = z3;
        this.A0I = z4;
        this.A0G = z5;
        this.A0E = z6;
        this.A0F = z7;
        this.A01 = i;
        this.A0C = z8;
        this.A0D = z9;
        this.A00 = i2;
        this.A0B = z10;
        this.A03 = i3;
        this.A02 = i4;
        this.A04 = aew;
        this.A07 = r5;
    }
}
