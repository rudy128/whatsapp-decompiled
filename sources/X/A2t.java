package X;

public final class A2t {
    public static final C15950rT A0N = new AGM(0);
    public static final String A0O = AnonymousClass8BS.A0m("WorkSpec");
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public C20078A6e A0B;
    public A6Y A0C;
    public A6Y A0D;
    public Integer A0E;
    public Integer A0F;
    public Integer A0G;
    public String A0H;
    public String A0I;
    public boolean A0J;
    public final int A0K;
    public final int A0L;
    public final String A0M;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof A2t) {
                A2t a2t = (A2t) obj;
                if (!(C18070vi.A18(this.A0M, a2t.A0M) && this.A0G == a2t.A0G && C18070vi.A18(this.A0I, a2t.A0I) && C18070vi.A18(this.A0H, a2t.A0H) && C18070vi.A18(this.A0C, a2t.A0C) && C18070vi.A18(this.A0D, a2t.A0D) && this.A05 == a2t.A05 && this.A06 == a2t.A06 && this.A04 == a2t.A04 && C18070vi.A18(this.A0B, a2t.A0B) && this.A02 == a2t.A02 && this.A0E == a2t.A0E && this.A03 == a2t.A03 && this.A07 == a2t.A07 && this.A08 == a2t.A08 && this.A0A == a2t.A0A && this.A0J == a2t.A0J && this.A0F == a2t.A0F && this.A01 == a2t.A01 && this.A0K == a2t.A0K && this.A09 == a2t.A09 && this.A00 == a2t.A00 && this.A0L == a2t.A0L)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.A02 <= 0) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00() {
        /*
            r21 = this;
            r0 = r21
            java.lang.Integer r2 = r0.A0G
            java.lang.Integer r1 = X.AnonymousClass00R.A00
            if (r2 != r1) goto L_0x000e
            int r1 = r0.A02
            r19 = 1
            if (r1 > 0) goto L_0x0010
        L_0x000e:
            r19 = 0
        L_0x0010:
            int r5 = r0.A02
            java.lang.Integer r4 = r0.A0E
            long r7 = r0.A03
            long r9 = r0.A07
            int r6 = r0.A01
            long r15 = r0.A06
            r2 = 0
            int r1 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            boolean r20 = X.AnonymousClass000.A1O(r1)
            long r11 = r0.A05
            long r13 = r0.A04
            long r0 = r0.A09
            r17 = r0
            long r0 = X.AnonymousClass9OK.A00(r4, r5, r6, r7, r9, r11, r13, r15, r17, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2t.A00():long");
    }

    public int hashCode() {
        String str;
        String str2;
        int A032 = C17880vN.A03(this.A0M);
        Integer num = this.A0G;
        int A0N2 = (AnonymousClass000.A0N(this.A0B, AnonymousClass001.A0K(this.A04, AnonymousClass001.A0K(this.A06, AnonymousClass001.A0K(this.A05, AnonymousClass000.A0N(this.A0D, AnonymousClass000.A0N(this.A0C, C17890vO.A02(this.A0H, C17890vO.A02(this.A0I, (A032 + C72453Mb.A0E(num, C196349ut.A00(num))) * 31)))))))) + this.A02) * 31;
        int intValue = this.A0E.intValue();
        if (1 != intValue) {
            str = "EXPONENTIAL";
        } else {
            str = "LINEAR";
        }
        int A0K2 = AnonymousClass001.A0K(this.A0A, AnonymousClass001.A0K(this.A08, AnonymousClass001.A0K(this.A07, AnonymousClass001.A0K(this.A03, AnonymousClass8BW.A03(str, intValue, A0N2)))));
        boolean z = this.A0J;
        if (z) {
            z = true;
        }
        int i = (A0K2 + (z ? 1 : 0)) * 31;
        int intValue2 = this.A0F.intValue();
        if (1 != intValue2) {
            str2 = "RUN_AS_NON_EXPEDITED_WORK_REQUEST";
        } else {
            str2 = "DROP_WORK_REQUEST";
        }
        return ((AnonymousClass001.A0K(this.A09, (((AnonymousClass8BW.A03(str2, intValue2, i) + this.A01) * 31) + this.A0K) * 31) + this.A00) * 31) + this.A0L;
    }

    public A2t(C20078A6e a6e, A6Y a6y, A6Y a6y2, Integer num, Integer num2, Integer num3, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, boolean z) {
        C72473Md.A1I(str, str2);
        C18070vi.A0d(str3, 4);
        this.A0M = str;
        this.A0G = num;
        this.A0I = str2;
        this.A0H = str3;
        this.A0C = a6y;
        this.A0D = a6y2;
        this.A05 = j;
        this.A06 = j2;
        this.A04 = j3;
        this.A0B = a6e;
        this.A02 = i;
        this.A0E = num2;
        this.A03 = j4;
        this.A07 = j5;
        this.A08 = j6;
        this.A0A = j7;
        this.A0J = z;
        this.A0F = num3;
        this.A01 = i2;
        this.A0K = i3;
        this.A09 = j8;
        this.A00 = i4;
        this.A0L = i5;
    }

    public final void A01(long j, long j2) {
        if (j < 900000) {
            A5Z.A00().A06(A0O, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j3 = j;
        if (j < 900000) {
            j3 = 900000;
        }
        this.A06 = j3;
        long j4 = j2;
        if (j2 < 300000) {
            A5Z.A00().A06(A0O, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > this.A06) {
            A5Z.A00().A06(A0O, C17890vO.A0a("Flex duration greater than interval duration; Changed to ", AnonymousClass000.A10(), j));
        }
        this.A04 = C28851b7.A05(j4, 300000, this.A06);
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("{WorkSpec: ");
        A10.append(this.A0M);
        return C17890vO.A0b(A10);
    }
}
