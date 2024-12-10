package X;

/* renamed from: X.3vL  reason: invalid class name and case insensitive filesystem */
public final class C79383vL extends C95084lf {
    public final AnonymousClass11P A00;
    public final AnonymousClass1CJ A01;

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0090, code lost:
        if (r2 != null) goto L_0x0092;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0093 A[EDGE_INSN: B:54:0x0093->B:32:0x0093 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CMC(java.util.Collection r8) {
        /*
            r7 = this;
            r4 = 0
            X.C18070vi.A0d(r8, r4)
            X.206 r0 = X.AnonymousClass3MX.A0s(r8)
            X.205 r0 = r0.A0v
            X.1BI r1 = r0.A00
            boolean r0 = X.C22971Dz.A0V(r1)
            if (r0 == 0) goto L_0x00b9
            X.1CJ r0 = r7.A01
            X.1ci r1 = r0.A0A(r1)
            boolean r0 = r1 instanceof X.C46162Dk
            if (r0 == 0) goto L_0x0092
            X.2Dk r1 = (X.C46162Dk) r1
            r6 = 1
            if (r1 == 0) goto L_0x0092
            boolean r0 = r1.A0P()
            if (r0 != r6) goto L_0x0092
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r8.iterator()
        L_0x002f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.206 r0 = (X.AnonymousClass206) r0
            X.C18070vi.A0d(r0, r4)
            boolean r0 = X.AnonymousClass25A.A0a(r0)
            if (r0 == 0) goto L_0x002f
            r3.add(r1)
            goto L_0x002f
        L_0x0049:
            int r5 = r3.size()
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r8.iterator()
        L_0x0055:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x006f
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.206 r0 = (X.AnonymousClass206) r0
            X.C18070vi.A0d(r0, r4)
            int r0 = r0.A0D()
            if (r0 != 0) goto L_0x0055
            r3.add(r1)
            goto L_0x0055
        L_0x006f:
            int r0 = r3.size()
            if (r5 > 0) goto L_0x00b1
            if (r0 > 0) goto L_0x00b1
            java.util.Iterator r3 = r8.iterator()
        L_0x007b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.206 r1 = (X.AnonymousClass206) r1
            boolean r0 = r1.A0z
            if (r0 != 0) goto L_0x0090
            boolean r0 = r1 instanceof X.AnonymousClass23Q
            if (r0 == 0) goto L_0x007b
        L_0x0090:
            if (r2 == 0) goto L_0x0093
        L_0x0092:
            return r4
        L_0x0093:
            X.11P r3 = r7.A00
            java.util.Iterator r2 = r8.iterator()
        L_0x0099:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.206 r0 = (X.AnonymousClass206) r0
            boolean r0 = X.AnonymousClass4aS.A07(r3, r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0099
            if (r1 == 0) goto L_0x00b9
            return r4
        L_0x00b1:
            int r0 = r8.size()
            if (r5 == r0) goto L_0x00b8
            r6 = 0
        L_0x00b8:
            return r6
        L_0x00b9:
            boolean r0 = super.CMC(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79383vL.CMC(java.util.Collection):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79383vL(AnonymousClass11P r1, AnonymousClass1CJ r2, C87794Wz r3) {
        super(r3);
        C18070vi.A0o(r3, r2, r1);
        this.A01 = r2;
        this.A00 = r1;
    }
}
