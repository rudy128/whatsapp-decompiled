package X;

/* renamed from: X.BmB  reason: case insensitive filesystem */
public class C23581BmB extends C23582BmC {
    public static final long serialVersionUID = 1;
    public final byte[] bytes;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.DSQ) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = 1
            if (r9 == r8) goto L_0x006a
            boolean r0 = r9 instanceof X.DSQ
            r4 = 0
            if (r0 == 0) goto L_0x0025
            int r3 = r8.A02()
            r7 = r9
            X.DSQ r7 = (X.DSQ) r7
            int r2 = r7.A02()
            if (r3 != r2) goto L_0x0025
            if (r3 == 0) goto L_0x006a
            boolean r0 = r9 instanceof X.C23581BmB
            if (r0 == 0) goto L_0x0065
            int r1 = r8.hash
            int r0 = r7.hash
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r4
        L_0x0026:
            if (r3 > r2) goto L_0x0059
            boolean r0 = r7 instanceof X.C23581BmB
            if (r0 == 0) goto L_0x004c
            X.BmB r7 = (X.C23581BmB) r7
            byte[] r6 = r8.bytes
            byte[] r5 = r7.bytes
            int r4 = r8.A07()
            int r3 = r3 + r4
            int r2 = r7.A07()
        L_0x003b:
            if (r4 >= r3) goto L_0x004a
            byte r1 = r6[r4]
            byte r0 = r5[r2]
            if (r1 == r0) goto L_0x0045
            r0 = 0
            return r0
        L_0x0045:
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004a:
            r0 = 1
            return r0
        L_0x004c:
            X.DSQ r1 = r7.A03(r3)
            X.DSQ r0 = r8.A03(r3)
            boolean r0 = r1.equals(r0)
            return r0
        L_0x0059:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.BE9.A1K(r0, r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r0)
            throw r0
        L_0x0065:
            boolean r0 = r9.equals(r8)
            return r0
        L_0x006a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23581BmB.equals(java.lang.Object):boolean");
    }

    public int A07() {
        if (this instanceof C23580BmA) {
            return ((C23580BmA) this).bytesOffset;
        }
        return 0;
    }

    public C23581BmB(byte[] bArr) {
        if (bArr != null) {
            this.bytes = bArr;
            return;
        }
        throw BE6.A0m();
    }
}
