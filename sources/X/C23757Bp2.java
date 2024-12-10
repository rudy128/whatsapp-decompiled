package X;

import java.math.BigDecimal;

/* renamed from: X.Bp2  reason: case insensitive filesystem */
public class C23757Bp2 extends C25836Cmq {
    public static C23757Bp2 A01 = new C23757Bp2((BigDecimal) null);
    public final BigDecimal A00;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        r2 = ((X.C25836Cmq) r5).A04();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0022
            boolean r0 = r5 instanceof X.C23757Bp2
            r1 = 0
            if (r0 != 0) goto L_0x000d
            boolean r0 = r5 instanceof X.C23755Bp0
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            return r1
        L_0x000d:
            X.Cmq r5 = (X.C25836Cmq) r5
            X.Bp2 r2 = r5.A04()
            X.Bp2 r0 = A01
            if (r2 == r0) goto L_0x000c
            java.math.BigDecimal r1 = r4.A00
            java.math.BigDecimal r0 = r2.A00
            int r0 = r1.compareTo(r0)
            if (r0 == 0) goto L_0x0022
            r3 = 0
        L_0x0022:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23757Bp2.equals(java.lang.Object):boolean");
    }

    public String toString() {
        return this.A00.toString();
    }

    public C23757Bp2(CharSequence charSequence) {
        this.A00 = new BigDecimal(charSequence.toString());
    }

    public C23757Bp2(BigDecimal bigDecimal) {
        this.A00 = bigDecimal;
    }
}
