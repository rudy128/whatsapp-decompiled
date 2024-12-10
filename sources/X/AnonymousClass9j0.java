package X;

/* renamed from: X.9j0  reason: invalid class name */
public final class AnonymousClass9j0 {
    public C171148rF A00;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009c, code lost:
        if (r3 > 0.75f) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ab, code lost:
        if (r3 > Float.MAX_VALUE) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.app.Activity r11, X.C192929pG r12, X.AnonymousClass18K r13) {
        /*
            r10 = this;
            r0 = 1
            int r4 = X.C72453Mb.A0G(r13, r11, r0)
            X.8rF r2 = new X.8rF
            r2.<init>()
            X.BDd r8 = X.AnonymousClass9QW.A00(r12)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            if (r8 == 0) goto L_0x0068
            X.AHa r8 = (X.C20344AHa) r8
            X.9zM r7 = r8.A01
            X.9zM r0 = X.C199059zM.A01
            boolean r1 = X.C18070vi.A18(r7, r0)
            r0 = r9
            if (r1 == 0) goto L_0x0026
            r0 = r3
        L_0x0026:
            r2.A04 = r0
            X.1Zh r6 = r8.A00
            int r5 = r6.A02
            int r0 = r6.A01
            int r5 = r5 - r0
            int r1 = r6.A00
            int r0 = r6.A03
            int r1 = r1 - r0
            if (r5 <= r1) goto L_0x010a
            X.9zL r6 = X.C199049zL.A01
        L_0x0038:
            X.9zL r5 = X.C199049zL.A01
            boolean r1 = X.C18070vi.A18(r6, r5)
            r0 = r9
            if (r1 == 0) goto L_0x0042
            r0 = r3
        L_0x0042:
            r2.A03 = r0
            X.9zN r1 = r8.A02
            X.9zN r0 = X.C199069zN.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x005e
            X.9zN r0 = X.C199069zN.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0068
            X.9zM r0 = X.C199059zM.A02
            boolean r0 = X.C18070vi.A18(r7, r0)
            if (r0 == 0) goto L_0x0068
        L_0x005e:
            boolean r1 = X.C18070vi.A18(r6, r5)
            r0 = r9
            if (r1 == 0) goto L_0x0066
            r0 = r3
        L_0x0066:
            r2.A02 = r0
        L_0x0068:
            boolean r0 = X.AnonymousClass112.A02()
            if (r0 == 0) goto L_0x0078
            boolean r0 = r11.isInMultiWindowMode()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
        L_0x0078:
            int r0 = X.C72453Mb.A08(r11)
            if (r0 == r4) goto L_0x007f
            r3 = r9
        L_0x007f:
            r2.A05 = r3
            android.content.Context r0 = X.AnonymousClass8BS.A02(r11)
            X.1Jq r0 = X.AnonymousClass1IP.A02(r0)
            if (r0 == 0) goto L_0x00b4
            int r1 = r0.A01
            int r0 = r0.A02
            float r3 = (float) r0
            float r0 = (float) r1
            float r3 = r3 / r0
            r0 = 0
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
            r0 = 1061158912(0x3f400000, float:0.75)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 1
            if (r0 <= 0) goto L_0x00ae
        L_0x009e:
            r0 = 1068121457(0x3faa3d71, float:1.33)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00ad
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            r1 = 3
            if (r0 <= 0) goto L_0x00ae
        L_0x00ad:
            r1 = 2
        L_0x00ae:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r2.A01 = r0
        L_0x00b4:
            X.8rF r4 = r10.A00
            r3 = 0
            java.lang.Integer r1 = r2.A02
            if (r4 == 0) goto L_0x0108
            java.lang.Integer r0 = r4.A02
        L_0x00bd:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x010e
            java.lang.Integer r1 = r2.A05
            if (r4 == 0) goto L_0x0106
            java.lang.Integer r0 = r4.A05
        L_0x00c9:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x010e
            java.lang.Integer r1 = r2.A01
            if (r4 == 0) goto L_0x0104
            java.lang.Integer r0 = r4.A01
        L_0x00d5:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x010e
            java.lang.Integer r1 = r2.A03
            if (r4 == 0) goto L_0x0102
            java.lang.Integer r0 = r4.A03
        L_0x00e1:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x010e
            java.lang.Integer r1 = r2.A04
            if (r4 == 0) goto L_0x0100
            java.lang.Integer r0 = r4.A04
        L_0x00ed:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x010e
            java.lang.Boolean r0 = r2.A00
            if (r4 == 0) goto L_0x00f9
            java.lang.Boolean r3 = r4.A00
        L_0x00f9:
            boolean r0 = X.C18070vi.A18(r0, r3)
            if (r0 == 0) goto L_0x010e
            return
        L_0x0100:
            r0 = r3
            goto L_0x00ed
        L_0x0102:
            r0 = r3
            goto L_0x00e1
        L_0x0104:
            r0 = r3
            goto L_0x00d5
        L_0x0106:
            r0 = r3
            goto L_0x00c9
        L_0x0108:
            r0 = r3
            goto L_0x00bd
        L_0x010a:
            X.9zL r6 = X.C199049zL.A02
            goto L_0x0038
        L_0x010e:
            r10.A00 = r2
            r13.CC7(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9j0.A00(android.app.Activity, X.9pG, X.18K):void");
    }
}
