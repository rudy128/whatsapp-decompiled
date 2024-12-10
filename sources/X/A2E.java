package X;

public final class A2E {
    public static final C188929iE A07 = new Object();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (r1.A00(r2, r0) == false) goto L_0x0037;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x005f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r4 = 1
            if (r7 == r8) goto L_0x0060
            boolean r0 = r8 instanceof X.A2E
            r6 = 0
            if (r0 == 0) goto L_0x0037
            int r1 = r7.A02
            X.A2E r8 = (X.A2E) r8
            int r0 = r8.A02
            if (r1 != r0) goto L_0x0037
            java.lang.String r1 = r7.A04
            java.lang.String r0 = r8.A04
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0037
            boolean r1 = r7.A06
            boolean r0 = r8.A06
            if (r1 != r0) goto L_0x0037
            int r5 = r7.A01
            r0 = 2
            int r3 = r8.A01
            if (r5 != r4) goto L_0x0038
            if (r3 != r0) goto L_0x0043
            java.lang.String r2 = r7.A03
            if (r2 == 0) goto L_0x0059
            X.9iE r1 = A07
            java.lang.String r0 = r8.A03
        L_0x0031:
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0043
        L_0x0037:
            return r6
        L_0x0038:
            if (r3 != r4) goto L_0x0043
            java.lang.String r2 = r8.A03
            if (r2 == 0) goto L_0x0043
            X.9iE r1 = A07
            java.lang.String r0 = r7.A03
            goto L_0x0031
        L_0x0043:
            if (r5 != r3) goto L_0x0059
            java.lang.String r2 = r7.A03
            if (r2 == 0) goto L_0x0054
            X.9iE r1 = A07
            java.lang.String r0 = r8.A03
            boolean r0 = r1.A00(r2, r0)
            if (r0 != 0) goto L_0x0059
            return r6
        L_0x0054:
            java.lang.String r0 = r8.A03
            if (r0 == 0) goto L_0x0059
            return r6
        L_0x0059:
            int r1 = r7.A00
            int r0 = r8.A00
            if (r1 == r0) goto L_0x0060
            r4 = 0
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2E.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int A032 = (C17880vN.A03(this.A04) + this.A00) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        return ((A032 + i) * 31) + this.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r0 != false) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public A2E(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6, int r7, boolean r8) {
        /*
            r2 = this;
            r2.<init>()
            r2.A04 = r3
            r2.A05 = r4
            r2.A06 = r8
            r2.A02 = r6
            r2.A03 = r5
            r2.A01 = r7
            java.lang.String r1 = X.AnonymousClass8BW.A0j(r4)
            java.lang.String r0 = "INT"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 == 0) goto L_0x001f
            r1 = 3
        L_0x001c:
            r2.A00 = r1
            return
        L_0x001f:
            java.lang.String r0 = "CHAR"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "CLOB"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "TEXT"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 != 0) goto L_0x005c
            java.lang.String r0 = "BLOB"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 == 0) goto L_0x0041
            r1 = 5
            goto L_0x001c
        L_0x0041:
            java.lang.String r0 = "REAL"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "FLOA"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "DOUB"
            boolean r0 = X.AnonymousClass1YF.A0V(r1, r0)
            r1 = 1
            if (r0 == 0) goto L_0x001c
        L_0x005a:
            r1 = 4
            goto L_0x001c
        L_0x005c:
            r1 = 2
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A2E.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Column{name='");
        A10.append(this.A04);
        A10.append("', type='");
        A10.append(this.A05);
        A10.append("', affinity='");
        A10.append(this.A00);
        A10.append("', notNull=");
        A10.append(this.A06);
        A10.append(", primaryKeyPosition=");
        A10.append(this.A02);
        A10.append(", defaultValue='");
        String str = this.A03;
        if (str == null) {
            str = "undefined";
        }
        A10.append(str);
        return AnonymousClass000.A0y("'}", A10);
    }
}
