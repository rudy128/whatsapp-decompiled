package X;

/* renamed from: X.Dx8  reason: case insensitive filesystem */
public class C28300Dx8 extends AnonymousClass1By {
    public C28337Dxj A00;
    public C28337Dxj A01;
    public C28339Dxl A02;
    public C28269Dwd A03;
    public C28269Dwd A04;
    public C28324DxW A05;
    public C28324DxW A06;
    public C28292Dx0 A07;
    public C28309DxH A08;
    public C28294Dx2 A09;
    public C28323DxV A0A;
    public C28323DxV A0B;

    /* JADX WARNING: type inference failed for: r4v0, types: [X.Dx8, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C28300Dx8 A01(java.lang.Object r8) {
        /*
            boolean r0 = r8 instanceof X.C28300Dx8
            if (r0 == 0) goto L_0x0007
            X.Dx8 r8 = (X.C28300Dx8) r8
            return r8
        L_0x0007:
            if (r8 == 0) goto L_0x0125
            X.Dxl r5 = X.C28339Dxl.A05(r8)
            X.Dx8 r4 = new X.Dx8
            r4.<init>()
            r4.A02 = r5
            r6 = 0
            X.1Bx r0 = r5.A0M(r6)
            boolean r2 = r0 instanceof X.C28341Dxn
            r0 = 0
            r3 = 1
            if (r2 == 0) goto L_0x00c8
            X.1Bx r2 = r5.A0M(r6)
            X.Dxn r2 = (X.C28341Dxn) r2
            X.1Bz r2 = X.C28341Dxn.A02(r2)
            X.Dxj r2 = X.C28337Dxj.A02(r2)
            r4.A01 = r2
            r7 = 0
        L_0x0031:
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0L(r0)
            if (r0 == 0) goto L_0x00a6
            r2 = 1
        L_0x003c:
            r8 = 0
        L_0x003d:
            int r0 = r7 + 1
            X.1Bx r0 = r5.A0M(r0)
            X.Dxj r0 = X.C28337Dxj.A02(r0)
            r4.A00 = r0
            int r0 = r7 + 2
            X.1Bx r0 = r5.A0M(r0)
            X.Dx0 r0 = X.C28292Dx0.A01(r0)
            r4.A07 = r0
            int r0 = r7 + 3
            X.1Bx r0 = r5.A0M(r0)
            X.DxW r0 = X.C28324DxW.A01(r0)
            r4.A05 = r0
            int r0 = r7 + 4
            X.1Bx r1 = r5.A0M(r0)
            X.Dxl r1 = (X.C28339Dxl) r1
            X.1Bx r0 = r1.A0M(r6)
            X.DxV r0 = X.C28323DxV.A01(r0)
            r4.A0B = r0
            X.1Bx r0 = r1.A0M(r3)
            X.DxV r0 = X.C28323DxV.A01(r0)
            r4.A0A = r0
            int r0 = r7 + 5
            X.1Bx r0 = r5.A0M(r0)
            X.DxW r0 = X.C28324DxW.A01(r0)
            r4.A06 = r0
            int r7 = r7 + 6
            X.1Bx r0 = r5.A0M(r7)
            X.Dx2 r0 = X.C28294Dx2.A01(r0)
            r4.A09 = r0
            int r6 = r5.A0K()
            int r6 = r6 - r7
            int r6 = r6 - r3
            if (r6 == 0) goto L_0x011d
            if (r2 == 0) goto L_0x00d2
            java.lang.String r0 = "version 1 certificate contains extra data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x00a6:
            X.Dxj r2 = r4.A01
            r0 = 1
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0L(r0)
            if (r0 == 0) goto L_0x00b7
            r2 = 0
            r8 = 1
            goto L_0x003d
        L_0x00b7:
            X.Dxj r2 = r4.A01
            r0 = 2
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            boolean r0 = r2.A0L(r0)
            if (r0 == 0) goto L_0x011e
            r2 = 0
            goto L_0x003c
        L_0x00c8:
            X.Dxj r2 = new X.Dxj
            r2.<init>((long) r0)
            r4.A01 = r2
            r7 = -1
            goto L_0x0031
        L_0x00d2:
            if (r6 <= 0) goto L_0x011d
            int r0 = r7 + r6
            X.1Bx r2 = r5.A0M(r0)
            X.Dxn r2 = (X.C28341Dxn) r2
            int r1 = r2.A00
            if (r1 == r3) goto L_0x00fc
            r0 = 2
            if (r1 == r0) goto L_0x00f5
            r0 = 3
            if (r1 != r0) goto L_0x010a
            if (r8 != 0) goto L_0x0103
            X.Dxl r0 = X.C28339Dxl.A06(r2, r3)
            X.DxH r0 = X.C28309DxH.A02(r0)
            r4.A08 = r0
        L_0x00f2:
            int r6 = r6 + -1
            goto L_0x00d2
        L_0x00f5:
            X.Dwd r0 = X.C28269Dwd.A03(r2)
            r4.A04 = r0
            goto L_0x00f2
        L_0x00fc:
            X.Dwd r0 = X.C28269Dwd.A03(r2)
            r4.A03 = r0
            goto L_0x00f2
        L_0x0103:
            java.lang.String r0 = "version 2 certificate cannot contain extensions"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x010a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown tag encountered in structure: "
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r1)
            throw r0
        L_0x011d:
            return r4
        L_0x011e:
            java.lang.String r0 = "version number not recognised"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0125:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28300Dx8.A01(java.lang.Object):X.Dx8");
    }

    public AnonymousClass1Bz CP9() {
        if (C25917Cob.A00("org.spongycastle.x509.allow_non-der_tbscert") == null || C25917Cob.A01("org.spongycastle.x509.allow_non-der_tbscert")) {
            return this.A02;
        }
        C26135Csy csy = new C26135Csy();
        C28337Dxj dxj = this.A01;
        if (!dxj.A0L(CI5.A02)) {
            C28341Dxn.A04(dxj, csy);
        }
        csy.A02(this.A00);
        csy.A02(this.A07);
        csy.A02(this.A05);
        C26135Csy csy2 = new C26135Csy(2);
        csy2.A02(this.A0B);
        csy.A02(C28339Dxl.A07(this.A0A, csy2));
        AnonymousClass1Bx r0 = this.A06;
        if (r0 == null) {
            r0 = new C28357Dy3();
        }
        csy.A02(r0);
        csy.A02(this.A09);
        C28269Dwd dwd = this.A03;
        if (dwd != null) {
            C28341Dxn.A05(dwd, csy);
        }
        C28269Dwd dwd2 = this.A04;
        if (dwd2 != null) {
            C28341Dxn.A06(dwd2, csy, 2, false);
        }
        C28309DxH dxH = this.A08;
        if (dxH != null) {
            C28341Dxn.A06(dxH, csy, 3, true);
        }
        return new C28357Dy3(csy);
    }
}
