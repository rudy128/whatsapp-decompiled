package X;

/* renamed from: X.Ber  reason: case insensitive filesystem */
public class C23303Ber extends C23304Bes {
    public final byte[] zzfp;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r7 = (X.DSP) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r1 = 1
            if (r9 == r8) goto L_0x0094
            boolean r0 = r9 instanceof X.DSP
            r5 = 0
            if (r0 == 0) goto L_0x0025
            int r3 = r8.A02()
            r7 = r9
            X.DSP r7 = (X.DSP) r7
            int r2 = r7.A02()
            if (r3 != r2) goto L_0x0025
            if (r3 == 0) goto L_0x0094
            boolean r0 = r9 instanceof X.C23303Ber
            if (r0 == 0) goto L_0x008f
            int r1 = r8.zzfk
            int r0 = r7.zzfk
            if (r1 == 0) goto L_0x0026
            if (r0 == 0) goto L_0x0026
            if (r1 == r0) goto L_0x0026
        L_0x0025:
            return r5
        L_0x0026:
            if (r3 > r2) goto L_0x0081
            boolean r0 = r7 instanceof X.C23303Ber
            X.Ber r7 = (X.C23303Ber) r7
            if (r0 == 0) goto L_0x004c
            byte[] r6 = r8.zzfp
            byte[] r5 = r7.zzfp
            int r4 = r8.A04()
            int r3 = r3 + r4
            int r2 = r7.A04()
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
            int r0 = r7.A02()
            int r2 = X.DSP.A00(r5, r3, r0)
            if (r2 != 0) goto L_0x0075
            X.DSP r4 = X.DSP.A00
        L_0x0058:
            int r0 = r8.A02()
            int r3 = X.DSP.A00(r5, r3, r0)
            if (r3 != 0) goto L_0x0069
            X.DSP r2 = X.DSP.A00
        L_0x0064:
            boolean r0 = r4.equals(r2)
            return r0
        L_0x0069:
            byte[] r1 = r8.zzfp
            int r0 = r8.A04()
            X.Beq r2 = new X.Beq
            r2.<init>(r1, r0, r3)
            goto L_0x0064
        L_0x0075:
            byte[] r1 = r7.zzfp
            int r0 = r7.A04()
            X.Beq r4 = new X.Beq
            r4.<init>(r1, r0, r2)
            goto L_0x0058
        L_0x0081:
            r0 = 40
            java.lang.StringBuilder r0 = X.BE6.A0t(r0)
            X.BE9.A1K(r0, r3)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r0)
            throw r0
        L_0x008f:
            boolean r0 = r9.equals(r8)
            return r0
        L_0x0094:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23303Ber.equals(java.lang.Object):boolean");
    }

    public int A04() {
        if (this instanceof C23302Beq) {
            return ((C23302Beq) this).zzfm;
        }
        return 0;
    }

    public C23303Ber(byte[] bArr) {
        this.zzfp = bArr;
    }
}
