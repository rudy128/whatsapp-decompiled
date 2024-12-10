package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.6qE  reason: invalid class name and case insensitive filesystem */
public class C134216qE {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final UserJid A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C134216qE r5 = (C134216qE) obj;
            if (!(this.A04 == r5.A04 && this.A0M == r5.A0M && this.A0I == r5.A0I && this.A0F == r5.A0F && this.A0J == r5.A0J && this.A03 == r5.A03 && this.A0G == r5.A0G && this.A0R == r5.A0R && this.A0Q == r5.A0Q && this.A0P == r5.A0P && this.A0O == r5.A0O && this.A08 == r5.A08 && this.A09 == r5.A09 && this.A06 == r5.A06 && this.A07 == r5.A07 && this.A0B == r5.A0B && this.A0C == r5.A0C && this.A0N == r5.A0N && this.A0K == r5.A0K && this.A0S == r5.A0S && this.A0H == r5.A0H && this.A00 == r5.A00 && this.A05 == r5.A05 && this.A0L == r5.A0L && this.A02 == r5.A02 && this.A0E == r5.A0E && this.A0A.equals(r5.A0A) && this.A01 == r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[29];
        objArr[0] = this.A0A;
        AnonymousClass000.A1M(objArr, this.A04);
        objArr[2] = Boolean.valueOf(this.A0M);
        objArr[3] = Boolean.valueOf(this.A0I);
        objArr[4] = Boolean.valueOf(this.A0F);
        objArr[5] = Boolean.valueOf(this.A0J);
        objArr[6] = Boolean.valueOf(this.A0D);
        C17890vO.A1I(objArr, this.A03);
        objArr[8] = Boolean.valueOf(this.A0G);
        objArr[9] = Boolean.valueOf(this.A0R);
        objArr[10] = Boolean.valueOf(this.A0Q);
        objArr[11] = Boolean.valueOf(this.A0P);
        objArr[12] = Boolean.valueOf(this.A0O);
        objArr[13] = Integer.valueOf(this.A08);
        objArr[14] = Integer.valueOf(this.A09);
        objArr[15] = Integer.valueOf(this.A06);
        objArr[16] = Integer.valueOf(this.A07);
        objArr[17] = Boolean.valueOf(this.A0B);
        objArr[18] = Boolean.valueOf(this.A0C);
        objArr[19] = Boolean.valueOf(this.A0N);
        objArr[20] = Boolean.valueOf(this.A0K);
        objArr[21] = Boolean.valueOf(this.A0S);
        objArr[22] = Boolean.valueOf(this.A0H);
        objArr[23] = Integer.valueOf(this.A00);
        objArr[24] = Integer.valueOf(this.A05);
        objArr[25] = Boolean.valueOf(this.A0L);
        objArr[26] = Integer.valueOf(this.A02);
        objArr[27] = Boolean.valueOf(this.A0E);
        return AnonymousClass000.A0P(Integer.valueOf(this.A01), objArr, 28);
    }

    public C134216qE(UserJid userJid, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i2, boolean z6, int i3, boolean z7, boolean z8, boolean z9, boolean z10, int i4, int i5, int i6, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i7, int i8, boolean z17, int i9, boolean z18, int i10) {
        this.A0A = userJid;
        this.A04 = i;
        this.A0M = z;
        this.A0I = z2;
        this.A0F = z3;
        this.A0J = z4;
        this.A0D = z5;
        this.A03 = i2;
        this.A0G = z6;
        this.A0R = z7;
        this.A0Q = z8;
        this.A0P = z9;
        this.A0O = z10;
        this.A08 = i3;
        this.A09 = i4;
        this.A06 = i5;
        this.A07 = i6;
        this.A0B = z11;
        this.A0C = z12;
        this.A0N = z13;
        this.A0K = z14;
        this.A0S = z15;
        this.A0H = z16;
        this.A00 = i7;
        this.A05 = i8;
        this.A0L = z17;
        this.A02 = i9;
        this.A0E = z18;
        this.A01 = i10;
    }
}
