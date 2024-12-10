package X;

import java.util.Arrays;

/* renamed from: X.34x  reason: invalid class name and case insensitive filesystem */
public final class C688434x implements B5K {
    public final int A00;
    public final Long A01;
    public final byte[] A02;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (java.util.Arrays.equals(r1, r0) != false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0040
            java.lang.Class r1 = r4.getClass()
            if (r5 == 0) goto L_0x0034
            java.lang.Class r0 = r5.getClass()
        L_0x000d:
            boolean r0 = X.C18070vi.A18(r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.protocol.IncomingVerifiedNameValues"
            X.C18070vi.A0z(r5, r0)
            X.34x r5 = (X.C688434x) r5
            java.lang.Long r1 = r4.A01
            java.lang.Long r0 = r5.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0033
            byte[] r1 = r4.A02
            byte[] r0 = r5.A02
            if (r1 == 0) goto L_0x0036
            if (r0 == 0) goto L_0x0033
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0039
        L_0x0033:
            return r2
        L_0x0034:
            r0 = 0
            goto L_0x000d
        L_0x0036:
            if (r0 == 0) goto L_0x0039
            return r2
        L_0x0039:
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 == r0) goto L_0x0040
            return r2
        L_0x0040:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C688434x.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i = 0;
        int A0l = AnonymousClass001.A0l(this.A01) * 31;
        byte[] bArr = this.A02;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        }
        return ((A0l + i) * 31) + this.A00;
    }

    public C688434x(Long l, byte[] bArr, int i) {
        this.A01 = l;
        this.A00 = i;
        this.A02 = bArr;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("IncomingVerifiedNameValues(verifiedName=");
        A10.append(this.A01);
        A10.append(", verifiedLevel=");
        A10.append(this.A00);
        A10.append(", verifiedNameCert=");
        return C17900vP.A0B(Arrays.toString(this.A02), A10);
    }
}
