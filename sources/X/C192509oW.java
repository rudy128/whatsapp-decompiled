package X;

import java.util.Arrays;

/* renamed from: X.9oW  reason: invalid class name and case insensitive filesystem */
public final class C192509oW {
    public String A00;
    public String A01;
    public String[] A02;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C192509oW
            r2 = 0
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r3.A00
            X.9oW r4 = (X.C192509oW) r4
            java.lang.String r0 = r4.A00
            if (r1 != 0) goto L_0x002a
            if (r0 != 0) goto L_0x0022
        L_0x000f:
            java.lang.String[] r1 = r3.A02
            java.lang.String[] r0 = r4.A02
            boolean r0 = X.C200210n.A03(r1, r0)
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r3.A01
            java.lang.String r0 = r4.A01
            if (r1 != 0) goto L_0x0023
            if (r0 != 0) goto L_0x0022
        L_0x0021:
            r2 = 1
        L_0x0022:
            return r2
        L_0x0023:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            goto L_0x0021
        L_0x002a:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0022
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192509oW.equals(java.lang.Object):boolean");
    }

    public C192509oW(String str, String str2, String[] strArr) {
        this.A00 = str;
        this.A02 = strArr;
        this.A01 = str2;
    }

    public int hashCode() {
        Object[] A1a = AnonymousClass8BR.A1a();
        A1a[0] = this.A02;
        A1a[1] = this.A00;
        A1a[2] = this.A01;
        return Arrays.deepHashCode(A1a);
    }
}
