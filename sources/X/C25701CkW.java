package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CkW  reason: case insensitive filesystem */
public class C25701CkW {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final long A0A;
    public final long A0B;
    public final long A0C;
    public final long A0D;
    public final C26001CqI A0E;
    public final C25552Chq A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final Map A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public C25701CkW(C26001CqI cqI, C25552Chq chq, C25701CkW ckW) {
        C25701CkW ckW2 = ckW;
        String str = ckW2.A0J;
        long j = ckW2.A09;
        boolean z = ckW2.A0P;
        int i = ckW2.A07;
        int i2 = ckW2.A06;
        int i3 = ckW2.A00;
        int i4 = ckW2.A08;
        boolean z2 = ckW2.A0R;
        boolean z3 = ckW2.A0O;
        long j2 = ckW2.A0B;
        long j3 = ckW2.A0D;
        boolean z4 = ckW2.A0Q;
        int i5 = ckW2.A05;
        int i6 = ckW2.A02;
        long j4 = ckW2.A0C;
        long j5 = ckW2.A0A;
        int i7 = ckW2.A01;
        Map map = ckW2.A0N;
        int i8 = ckW2.A03;
        String str2 = ckW2.A0H;
        String str3 = ckW2.A0G;
        String str4 = ckW2.A0I;
        String str5 = ckW2.A0M;
        String str6 = ckW2.A0K;
        HashMap A11 = C17880vN.A11();
        this.A0N = A11;
        this.A0J = str;
        this.A09 = j;
        this.A0P = z;
        this.A07 = i;
        this.A06 = i2;
        this.A00 = i3;
        this.A08 = i4;
        this.A0R = z2;
        this.A0O = z3;
        this.A04 = 0;
        this.A0B = j2;
        this.A0F = chq;
        this.A0D = j3;
        this.A0Q = z4;
        this.A05 = i5;
        this.A02 = i6;
        this.A0C = j4;
        this.A0A = j5;
        this.A01 = i7;
        this.A03 = i8;
        this.A0G = str3;
        this.A0H = str2;
        A11.putAll(map);
        this.A0E = cqI;
        this.A0L = null;
        this.A0I = str4;
        this.A0M = str5;
        this.A0K = str6;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(this.A0J);
        A10.append(", ");
        A10.append(this.A09);
        A10.append(", ");
        A10.append(this.A0P);
        A10.append(", ");
        A10.append(this.A07);
        A10.append(", ");
        A10.append(this.A06);
        A10.append(", ");
        A10.append(this.A00);
        A10.append(", ");
        A10.append(this.A08);
        A10.append(", ");
        A10.append(this.A0R);
        A10.append(", ");
        A10.append(this.A0O);
        A10.append(", ");
        A10.append(this.A04);
        A10.append(", ");
        A10.append(this.A0C);
        A10.append(", ");
        A10.append(this.A0A);
        A10.append(", ");
        A10.append(this.A01);
        A10.append(", ");
        A10.append(this.A03);
        A10.append(", ");
        A10.append(this.A05);
        A10.append(", ");
        A10.append(this.A02);
        A10.append(", ");
        A10.append(-1);
        C108975cc.A15(A10, ", ");
        A10.append(", ");
        return AnonymousClass000.A0y(this.A0L, A10);
    }

    public C25701CkW() {
        C25552Chq chq = new C25552Chq();
        C26001CqI cqI = C26001CqI.A02;
        this.A0N = C17880vN.A11();
        this.A0J = "";
        this.A09 = -1;
        this.A0P = false;
        this.A07 = -1;
        this.A06 = -1;
        this.A00 = -1;
        this.A08 = -1;
        this.A0R = false;
        this.A0O = false;
        this.A04 = -1;
        this.A0B = -1;
        this.A0F = chq;
        this.A0D = -1;
        this.A0Q = false;
        this.A05 = -1;
        this.A02 = -1;
        this.A0C = -1;
        this.A0A = -1;
        this.A01 = -1;
        this.A03 = -1;
        this.A0G = null;
        this.A0H = null;
        this.A0E = cqI;
        this.A0L = "";
        this.A0I = "";
        this.A0M = "";
        this.A0K = null;
    }
}
