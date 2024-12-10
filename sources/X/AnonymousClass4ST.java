package X;

import java.util.List;

/* renamed from: X.4ST  reason: invalid class name */
public class AnonymousClass4ST {
    public final int A00;
    public final int A01;
    public final int A02;
    public final C216416v A03;
    public final C86494Rv A04;
    public final C54242dp A05;
    public final AnonymousClass206 A06;
    public final AnonymousClass206 A07;
    public final AnonymousClass205 A08;
    public final Integer A09;
    public final List A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4ST r5 = (AnonymousClass4ST) obj;
            if (!(this.A0C == r5.A0C && this.A02 == r5.A02 && this.A05.equals(r5.A05) && C42171xk.A00(this.A09, r5.A09) && C42171xk.A00(this.A04, r5.A04) && C42171xk.A00(this.A06, r5.A06) && this.A0D == r5.A0D && this.A0B == r5.A0B && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A07 == r5.A07 && this.A08 == r5.A08 && C42171xk.A00(this.A0A, r5.A0A))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[13];
        objArr[0] = Boolean.valueOf(this.A0C);
        objArr[1] = this.A05;
        AnonymousClass3Ma.A1S(objArr, this.A02);
        objArr[3] = this.A09;
        objArr[4] = this.A04;
        objArr[5] = this.A06;
        objArr[6] = Boolean.valueOf(this.A0D);
        objArr[7] = Boolean.valueOf(this.A0B);
        objArr[8] = Integer.valueOf(this.A00);
        objArr[9] = Integer.valueOf(this.A01);
        objArr[10] = this.A07;
        objArr[11] = this.A08;
        return AnonymousClass000.A0P(this.A0A, objArr, 12);
    }

    public AnonymousClass4ST(C216416v r1, C86494Rv r2, C54242dp r3, AnonymousClass206 r4, AnonymousClass206 r5, AnonymousClass205 r6, Integer num, List list, int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        this.A0C = z;
        this.A0B = z2;
        this.A0D = z3;
        this.A0A = list;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i;
        this.A05 = r3;
        this.A04 = r2;
        this.A09 = num;
        this.A06 = r4;
        this.A07 = r5;
        this.A08 = r6;
        this.A03 = r1;
    }
}
