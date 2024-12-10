package X;

public abstract class CAK {
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        if ((!r9.A05(r2).equals(r10.A05(r2))) != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.C26052CrM r9, X.C26052CrM r10) {
        /*
            X.BzJ r2 = X.C24322BzJ.VIDEO
            java.util.HashMap r1 = r9.A06(r2)
            java.util.HashMap r0 = r10.A06(r2)
            if (r1 == r0) goto L_0x0014
            if (r1 == 0) goto L_0x0025
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0025
        L_0x0014:
            java.util.HashMap r1 = r9.A05(r2)
            java.util.HashMap r0 = r10.A05(r2)
            boolean r0 = r1.equals(r0)
            r1 = r0 ^ 1
            r0 = 0
            if (r1 == 0) goto L_0x0026
        L_0x0025:
            r0 = 1
        L_0x0026:
            r8 = 0
            if (r0 != 0) goto L_0x009f
            X.BzJ r0 = X.C24322BzJ.AUDIO
            java.util.HashMap r5 = r9.A06(r0)
            java.util.HashMap r6 = r10.A06(r0)
            if (r5 == 0) goto L_0x009f
            if (r6 == 0) goto L_0x009f
            int r1 = r5.size()
            int r0 = r6.size()
            if (r1 != r0) goto L_0x009f
            java.util.Iterator r7 = X.C17890vO.A0k(r5)
        L_0x0045:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r7.next()
            java.lang.Object r3 = r5.get(r0)
            X.Cmm r3 = (X.C25833Cmm) r3
            java.lang.Object r2 = r6.get(r0)
            X.Cmm r2 = (X.C25833Cmm) r2
            if (r3 == 0) goto L_0x009f
            if (r2 == 0) goto L_0x009f
            java.lang.String r1 = r3.A02
            java.lang.String r0 = r2.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009f
            java.util.List r0 = r3.A04
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            java.util.List r0 = r2.A04
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009f
            java.util.List r0 = r3.A07
            java.util.ArrayList r1 = X.C17880vN.A10(r0)
            java.util.List r0 = r2.A07
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009f
            X.BzJ r1 = r3.A01
            X.BzJ r0 = r2.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x009f
            long r3 = r3.A00
            long r1 = r2.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0045
        L_0x009f:
            return r8
        L_0x00a0:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CAK.A00(X.CrM, X.CrM):boolean");
    }
}
