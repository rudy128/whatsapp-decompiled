package X;

/* renamed from: X.36u  reason: invalid class name and case insensitive filesystem */
public final class C693336u implements AnonymousClass229 {
    public Float A00;
    public boolean A01;
    public byte[] A02;

    public final synchronized void A00(byte[] bArr) {
        this.A02 = bArr;
    }

    public final synchronized byte[] A01() {
        return this.A02;
    }

    public int hashCode() {
        Object[] objArr = new Object[2];
        objArr[0] = this.A02;
        return AnonymousClass000.A0P(this.A00, objArr, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
        if (r0 != null) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            if (r3 != r4) goto L_0x0004
            r0 = 1
            return r0
        L_0x0004:
            r2 = 0
            if (r4 == 0) goto L_0x0017
            boolean r0 = X.C18070vi.A14(r3, r4)
            if (r0 == 0) goto L_0x0017
            X.36u r4 = (X.C693336u) r4
            byte[] r1 = r3.A02
            byte[] r0 = r4.A02
            if (r1 != 0) goto L_0x0018
            if (r0 == 0) goto L_0x001f
        L_0x0017:
            return r2
        L_0x0018:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x001f
            return r2
        L_0x001f:
            java.lang.Float r1 = r3.A00
            java.lang.Float r0 = r4.A00
            boolean r2 = X.C42171xk.A00(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C693336u.equals(java.lang.Object):boolean");
    }
}
