package X;

/* renamed from: X.4q7  reason: invalid class name and case insensitive filesystem */
public final class C97824q7 implements C108465bk {
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final int A03;
    public final boolean A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C97824q7) {
                C97824q7 r5 = (C97824q7) obj;
                if (!C18070vi.A18(this.A00, r5.A00) || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int BQY() {
        return this.A03;
    }

    public int BXa() {
        return 2;
    }

    public boolean BeK() {
        return this.A04;
    }

    public int hashCode() {
        return C17880vN.A01(C17900vP.A00(this.A00) * 31, this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (X.AnonymousClass1YF.A0T(r4) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C97824q7(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            r3.A02 = r5
            r2 = 0
            if (r4 == 0) goto L_0x0011
            boolean r1 = X.AnonymousClass1YF.A0T(r4)
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r1 = r0 ^ 1
            r3.A01 = r1
            if (r1 != 0) goto L_0x0025
            r0 = 2131895561(0x7f122509, float:1.9425958E38)
        L_0x001b:
            r3.A03 = r0
            if (r1 == 0) goto L_0x0022
            if (r5 == 0) goto L_0x0022
            r2 = 1
        L_0x0022:
            r3.A04 = r2
            return
        L_0x0025:
            r0 = 2131895562(0x7f12250a, float:1.942596E38)
            if (r5 != 0) goto L_0x001b
            r0 = 2131895564(0x7f12250c, float:1.9425965E38)
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C97824q7.<init>(java.lang.String, boolean):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("EmailSecurityCheckup(emailAddress=");
        A10.append(this.A00);
        A10.append(", isVerified=");
        return C17900vP.A0F(A10, this.A02);
    }

    public int BSg() {
        return 2131232082;
    }

    public int BaX() {
        return 2131895563;
    }
}
