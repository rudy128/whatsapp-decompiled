package X;

public final class A5C {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final A13 A06;
    public final A13 A07;
    public final A13 A08;
    public final C22518BBb A09;
    public final A5K A0A;
    public final A5K A0B;
    public final A5K A0C;
    public final AnonymousClass5YR A0D;

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0056 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0057
            r2 = 0
            if (r5 == 0) goto L_0x0061
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0061
            X.A5C r5 = (X.A5C) r5
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A02
            int r0 = r5.A02
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A04
            int r0 = r5.A04
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A05
            int r0 = r5.A05
            if (r1 != r0) goto L_0x0056
            int r1 = r4.A01
            int r0 = r5.A01
            if (r1 != r0) goto L_0x0056
            X.A5K r1 = r4.A0A
            X.A5K r0 = r5.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.A5K r1 = r4.A0C
            X.A5K r0 = r5.A0C
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.A5K r1 = r4.A0B
            X.A5K r0 = r5.A0B
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.A13 r1 = r4.A06
            X.A13 r0 = r5.A06
            if (r1 != 0) goto L_0x0058
            if (r0 == 0) goto L_0x0057
        L_0x0056:
            r3 = 0
        L_0x0057:
            return r3
        L_0x0058:
            if (r0 == 0) goto L_0x0056
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0056
            return r3
        L_0x0061:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5C.equals(java.lang.Object):boolean");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A5C(int r12) {
        /*
            r11 = this;
            X.A5K r3 = X.A5K.A05
            r1 = 0
            r7 = 8
            r8 = -1
            r10 = 0
            r0 = r11
            r6 = r12
            r2 = r1
            r4 = r3
            r5 = r3
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A5C.<init>(int):void");
    }

    public int hashCode() {
        return AnonymousClass000.A0O(this.A0B, AnonymousClass000.A0N(this.A0C, AnonymousClass000.A0N(this.A0A, (((((((31 + this.A02) * 31) + this.A04) * 31) + this.A05) * 31) + this.A01) * 31)));
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("PaymentBannerConfiguration{bannerVisibility=");
        A10.append(this.A02);
        A10.append(", ctaButtonVisibility=");
        A10.append(this.A04);
        A10.append(", secondaryCtaButtonVisibility=");
        A10.append(this.A05);
        A10.append(", bannerType=");
        A10.append(this.A01);
        A10.append(", cta=");
        A10.append(this.A0A);
        A10.append(", title=");
        A10.append(this.A0C);
        A10.append(", description=");
        A10.append(this.A0B);
        A10.append(", bannerOnClickListener=");
        return AnonymousClass8BX.A0c(this.A09, A10);
    }

    public A5C(A13 a13, A13 a132, A13 a133, C22518BBb bBb, A5K a5k, A5K a5k2, A5K a5k3, AnonymousClass5YR r8, int i, int i2, int i3, int i4, int i5, int i6) {
        this.A0A = a5k;
        this.A0C = a5k2;
        this.A0B = a5k3;
        this.A01 = i6;
        this.A06 = a13;
        this.A07 = a132;
        this.A08 = a133;
        this.A00 = i;
        this.A02 = i2;
        this.A04 = i3;
        this.A05 = i4;
        this.A03 = i5;
        this.A0D = r8;
        this.A09 = bBb;
    }

    public A5C(A13 a13, C22518BBb bBb, A5K a5k, A5K a5k2, A5K a5k3, int i, int i2, int i3, int i4, int i5) {
        this(a13, (A13) null, (A13) null, bBb, a5k, a5k2, a5k3, (AnonymousClass5YR) null, i, i2, i3, 8, i4, i5);
    }
}
