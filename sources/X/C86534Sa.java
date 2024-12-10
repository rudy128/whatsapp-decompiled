package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.4Sa  reason: invalid class name and case insensitive filesystem */
public final class C86534Sa {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final long A05;
    public final C201110w A06;
    public final C134216qE A07;
    public final AnonymousClass1EC A08;
    public final UserJid A09;
    public final UserJid A0A;
    public final CallState A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
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

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C86534Sa r7 = (C86534Sa) obj;
            if (!(this.A0I == r7.A0I && this.A0L == r7.A0L && this.A0Q == r7.A0Q && this.A0M == r7.A0M && this.A0P == r7.A0P && this.A0K == r7.A0K && this.A06.equals(r7.A06) && this.A0B == r7.A0B && C42171xk.A00(this.A07, r7.A07) && C42171xk.A00(this.A08, r7.A08) && C42171xk.A00(this.A0A, r7.A0A) && C42171xk.A00(this.A09, r7.A09) && this.A0C.equals(r7.A0C) && this.A00 == r7.A00 && this.A0H == r7.A0H && C42171xk.A00(this.A0D, r7.A0D) && C42171xk.A00(this.A0E, r7.A0E) && this.A0G == r7.A0G && this.A02 == r7.A02 && this.A04 == r7.A04 && this.A0F == r7.A0F && this.A0O == r7.A0O && this.A03 == r7.A03 && this.A0J == r7.A0J && this.A05 == r7.A05 && this.A01 == r7.A01 && this.A0N == r7.A0N)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = new Object[27];
        objArr[0] = this.A06;
        objArr[1] = Boolean.valueOf(this.A0I);
        objArr[2] = Boolean.valueOf(this.A0L);
        objArr[3] = this.A0B;
        objArr[4] = Boolean.valueOf(this.A0Q);
        objArr[5] = Boolean.valueOf(this.A0M);
        objArr[6] = this.A07;
        objArr[7] = this.A08;
        objArr[8] = this.A0A;
        objArr[9] = this.A0C;
        objArr[10] = Boolean.valueOf(this.A0P);
        objArr[11] = Boolean.valueOf(this.A0K);
        objArr[12] = this.A09;
        objArr[13] = Integer.valueOf(this.A00);
        objArr[14] = Boolean.valueOf(this.A0H);
        objArr[15] = this.A0D;
        objArr[16] = this.A0E;
        objArr[17] = Boolean.valueOf(this.A0G);
        objArr[18] = Integer.valueOf(this.A02);
        objArr[19] = Integer.valueOf(this.A04);
        objArr[20] = Boolean.valueOf(this.A0F);
        objArr[21] = Boolean.valueOf(this.A0O);
        objArr[22] = Integer.valueOf(this.A03);
        objArr[23] = Boolean.valueOf(this.A0J);
        objArr[24] = Long.valueOf(this.A05);
        objArr[25] = Integer.valueOf(this.A01);
        return AnonymousClass000.A0P(Boolean.valueOf(this.A0N), objArr, 26);
    }

    public C86534Sa(C201110w r3, C134216qE r4, AnonymousClass1EC r5, UserJid userJid, UserJid userJid2, CallState callState, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.A06 = r3;
        this.A0I = z;
        this.A0L = z2;
        this.A0B = callState;
        this.A0Q = z3;
        this.A0M = z4;
        this.A07 = r4;
        this.A08 = r5;
        this.A0A = userJid;
        this.A0C = str;
        this.A0P = z5;
        this.A0K = z6;
        this.A09 = userJid2;
        this.A00 = i;
        this.A0H = z7;
        this.A0D = str2;
        this.A0E = str3;
        this.A0G = z8;
        this.A02 = i2;
        this.A04 = i3;
        this.A0F = z9;
        this.A0O = z10;
        this.A03 = i4;
        this.A0J = z11;
        this.A05 = j;
        this.A01 = i5;
        this.A0N = z12;
    }
}
