package X;

/* renamed from: X.Cqy  reason: case insensitive filesystem */
public final class C26038Cqy {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final C26131Csu A05;
    public final C25779Clq A06;
    public final C25784Clv A07;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (r8 == r14.A02) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r12 == r0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C26038Cqy A02(X.C26038Cqy r15) {
        /*
            r14 = this;
            r4 = r14
            if (r15 == 0) goto L_0x0096
            int r8 = r15.A02
            int r9 = r15.A03
            long r12 = r15.A04
            X.Clq r6 = r15.A06
            X.Csu r5 = r15.A05
            int r10 = r15.A01
            int r11 = r15.A00
            X.Clv r7 = r15.A07
            long r0 = X.CE3.A00
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            if (r8 == r0) goto L_0x001f
            r3 = 0
            int r0 = r14.A02
            if (r8 != r0) goto L_0x0064
        L_0x001f:
            boolean r0 = X.C26054CrP.A03(r12)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002f
            long r0 = r14.A04
            X.ClU[] r2 = X.C26130Cst.A02
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0064
        L_0x002f:
            if (r6 == 0) goto L_0x0039
            X.Clq r0 = r14.A06
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0064
        L_0x0039:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 == r0) goto L_0x0041
            int r0 = r14.A03
            if (r9 != r0) goto L_0x0064
        L_0x0041:
            if (r5 == 0) goto L_0x004b
            X.Csu r0 = r14.A05
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0064
        L_0x004b:
            r0 = 0
            if (r10 == r0) goto L_0x0052
            int r0 = r14.A01
            if (r10 != r0) goto L_0x0064
        L_0x0052:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == r0) goto L_0x005a
            int r0 = r14.A00
            if (r11 != r0) goto L_0x0064
        L_0x005a:
            if (r7 == 0) goto L_0x0096
            X.Clv r0 = r14.A07
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0096
        L_0x0064:
            boolean r0 = X.C26054CrP.A03(r12)
            if (r0 == 0) goto L_0x006c
            long r12 = r14.A04
        L_0x006c:
            if (r6 != 0) goto L_0x0070
            X.Clq r6 = r14.A06
        L_0x0070:
            if (r3 == 0) goto L_0x0074
            int r8 = r14.A02
        L_0x0074:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r9 != r0) goto L_0x007a
            int r9 = r14.A03
        L_0x007a:
            X.Csu r0 = r14.A05
            if (r0 == 0) goto L_0x0082
            if (r5 == 0) goto L_0x0081
            r0 = r5
        L_0x0081:
            r5 = r0
        L_0x0082:
            r0 = 0
            if (r10 != r0) goto L_0x0087
            int r10 = r14.A01
        L_0x0087:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 != r0) goto L_0x008d
            int r11 = r14.A00
        L_0x008d:
            if (r7 != 0) goto L_0x0091
            X.Clv r7 = r14.A07
        L_0x0091:
            X.Cqy r4 = new X.Cqy
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0096:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26038Cqy.A02(X.Cqy):X.Cqy");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26038Cqy) {
                C26038Cqy cqy = (C26038Cqy) obj;
                if (this.A02 == cqy.A02 && this.A03 == cqy.A03) {
                    long j = this.A04;
                    long j2 = cqy.A04;
                    C25759ClU[] clUArr = C26130Cst.A02;
                    if (j != j2 || !C18070vi.A18(this.A06, cqy.A06) || !C18070vi.A18(this.A05, cqy.A05) || this.A01 != cqy.A01 || this.A00 != cqy.A00 || !C18070vi.A18(this.A07, cqy.A07)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static void A00(C26038Cqy cqy, StringBuilder sb) {
        String str;
        sb.append(", lineBreak=");
        sb.append(C25757ClS.A00(cqy.A01));
        sb.append(", hyphens=");
        int i = cqy.A00;
        if (i == 1) {
            str = "Hyphens.None";
        } else if (i == 2) {
            str = "Hyphens.Auto";
        } else if (i == Integer.MIN_VALUE) {
            str = "Hyphens.Unspecified";
        } else {
            str = "Invalid";
        }
        sb.append(str);
        sb.append(", textMotion=");
    }

    public static void A01(C26038Cqy cqy, StringBuilder sb) {
        sb.append(C26018CqZ.A01(cqy.A02));
        sb.append(", textDirection=");
        sb.append(C25758ClT.A00(cqy.A03));
        sb.append(", lineHeight=");
        sb.append(C26130Cst.A01(cqy.A04));
        sb.append(", textIndent=");
        sb.append(cqy.A06);
        sb.append(", platformStyle=");
    }

    public int hashCode() {
        int i = ((this.A02 * 31) + this.A03) * 31;
        long j = this.A04;
        C25759ClU[] clUArr = C26130Cst.A02;
        int i2 = 0;
        int A062 = (((BE6.A06((AnonymousClass001.A0K(j, i) + AnonymousClass001.A0l(this.A06)) * 31, AnonymousClass001.A0l(this.A05)) + this.A01) * 31) + this.A00) * 31;
        C25784Clv clv = this.A07;
        if (clv != null) {
            i2 = clv.hashCode();
        }
        return A062 + i2;
    }

    public C26038Cqy(C26131Csu csu, C25779Clq clq, C25784Clv clv, int i, int i2, int i3, int i4, long j) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = j;
        this.A06 = clq;
        this.A05 = csu;
        this.A01 = i3;
        this.A00 = i4;
        this.A07 = clv;
        if (j != C26130Cst.A01) {
            float A012 = AnonymousClass001.A01(j);
            if (A012 < 0.0f) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("lineHeight can't be negative (");
                throw AnonymousClass000.A0n(AnonymousClass001.A1K(A10, A012));
            }
        }
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ParagraphStyle(textAlign=");
        A01(this, A10);
        A10.append(this.A05);
        AnonymousClass000.A1G(A10, ", lineHeightStyle=");
        A00(this, A10);
        return AnonymousClass001.A1F(this.A07, A10);
    }
}
