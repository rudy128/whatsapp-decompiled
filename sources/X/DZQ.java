package X;

import java.math.BigInteger;
import java.security.cert.CRLSelector;

public class DZQ implements C28673EDp {
    public final CRLSelector A00;
    public final boolean A01;
    public final BigInteger A02;
    public final boolean A03;
    public final byte[] A04;

    public Object clone() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (java.util.Arrays.equals(r1, r0) == false) goto L_0x0051;
     */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bj5(java.security.cert.CRL r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof java.security.cert.X509CRL
            if (r0 == 0) goto L_0x0052
            r4 = r7
            java.security.cert.X509CRL r4 = (java.security.cert.X509CRL) r4
            r5 = 0
            X.1C0 r0 = X.C28314DxM.A0C     // Catch:{ Exception -> 0x0051 }
            java.lang.String r0 = r0.A01     // Catch:{ Exception -> 0x0051 }
            byte[] r0 = r4.getExtensionValue(r0)     // Catch:{ Exception -> 0x0051 }
            if (r0 == 0) goto L_0x001b
            byte[] r0 = X.C28342Dxo.A05(r0)     // Catch:{ Exception -> 0x0051 }
            X.Dxj r1 = X.C28337Dxj.A02(r0)     // Catch:{ Exception -> 0x0051 }
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            boolean r0 = r6.A01
            if (r0 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0038
            return r5
        L_0x0023:
            if (r1 == 0) goto L_0x0038
            java.math.BigInteger r3 = r6.A02
            if (r3 == 0) goto L_0x0038
            r2 = 1
            byte[] r1 = r1.A00
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2, r1)
            int r0 = r0.compareTo(r3)
            if (r0 != r2) goto L_0x0038
            return r5
        L_0x0038:
            boolean r0 = r6.A03
            if (r0 == 0) goto L_0x0052
            X.1C0 r0 = X.C28314DxM.A0K
            java.lang.String r0 = r0.A01
            byte[] r1 = r4.getExtensionValue(r0)
            byte[] r0 = r6.A04
            if (r0 != 0) goto L_0x004b
            if (r1 == 0) goto L_0x0052
            return r5
        L_0x004b:
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 != 0) goto L_0x0052
        L_0x0051:
            return r5
        L_0x0052:
            java.security.cert.CRLSelector r0 = r6.A00
            boolean r0 = r0.match(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DZQ.Bj5(java.security.cert.CRL):boolean");
    }

    public DZQ(C24981CSg cSg) {
        this.A00 = cSg.A04;
        this.A01 = cSg.A01;
        this.A02 = cSg.A00;
        this.A04 = cSg.A03;
        this.A03 = cSg.A02;
    }
}
