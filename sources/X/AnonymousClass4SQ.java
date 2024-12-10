package X;

import java.util.List;

/* renamed from: X.4SQ  reason: invalid class name */
public class AnonymousClass4SQ {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C216416v A04;
    public final C54242dp A05;
    public final AnonymousClass206 A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final long A0A;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            AnonymousClass4SQ r7 = (AnonymousClass4SQ) obj;
            if (!(this.A08 == r7.A08 && this.A00 == r7.A00 && this.A03 == r7.A03 && this.A0A == r7.A0A && this.A02 == r7.A02 && this.A01 == r7.A01 && this.A06.equals(r7.A06) && C42171xk.A00(this.A05, r7.A05) && this.A07.equals(r7.A07) && this.A09 == r7.A09)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = Boolean.valueOf(this.A08);
        AnonymousClass000.A1M(objArr, this.A00);
        AnonymousClass3Ma.A1S(objArr, this.A03);
        objArr[3] = this.A06;
        AnonymousClass3Ma.A1T(objArr, 100);
        objArr[5] = Long.valueOf(this.A0A);
        C17890vO.A1H(objArr, this.A02);
        C17890vO.A1I(objArr, this.A01);
        objArr[8] = this.A05;
        objArr[9] = this.A07;
        return AnonymousClass000.A0P(Boolean.valueOf(this.A09), objArr, 10);
    }

    public AnonymousClass4SQ(C216416v r1, C54242dp r2, AnonymousClass206 r3, List list, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        this.A08 = z;
        this.A00 = i;
        this.A03 = i2;
        this.A06 = r3;
        this.A0A = j;
        this.A02 = i3;
        this.A01 = i4;
        this.A05 = r2;
        this.A07 = list;
        this.A09 = z2;
        this.A04 = r1;
    }
}
