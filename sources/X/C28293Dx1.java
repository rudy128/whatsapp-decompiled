package X;

/* renamed from: X.Dx1  reason: case insensitive filesystem */
public class C28293Dx1 extends AnonymousClass1By {
    public C28296Dx4[] A00;
    public C28296Dx4[] A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.Dx4[]} */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.Dx4, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C28296Dx4[] A01(X.C28339Dxl r9) {
        /*
            int r5 = r9.A0K()
            X.Dx4[] r4 = new X.C28296Dx4[r5]
            r3 = 0
        L_0x0007:
            if (r3 == r5) goto L_0x009c
            X.1Bx r1 = r9.A0M(r3)
            java.math.BigInteger r0 = X.C28296Dx4.A03
            if (r1 != 0) goto L_0x0017
            r1 = 0
        L_0x0012:
            r4[r3] = r1
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0017:
            boolean r0 = r1 instanceof X.C28296Dx4
            if (r0 != 0) goto L_0x0012
            X.Dxl r8 = X.C28339Dxl.A05(r1)
            X.Dx4 r1 = new X.Dx4
            r1.<init>()
            r0 = 0
            X.1Bx r0 = r8.A0M(r0)
            X.DxU r0 = X.C28322DxU.A01(r0)
            r1.A02 = r0
            int r2 = r8.A0K()
            r6 = 1
            if (r2 == r6) goto L_0x0012
            r7 = 2
            if (r2 == r7) goto L_0x0065
            r0 = 3
            if (r2 != r0) goto L_0x0097
            X.1Bx r0 = r8.A0M(r6)
            X.Dxn r0 = X.C28341Dxn.A03(r0)
            int r2 = r0.A00
            if (r2 != 0) goto L_0x008c
            X.Dxj r0 = X.C28337Dxj.A03(r0)
            r1.A01 = r0
            X.1Bx r0 = r8.A0M(r7)
            X.Dxn r0 = X.C28341Dxn.A03(r0)
            int r2 = r0.A00
            if (r2 == r6) goto L_0x007e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Bad tag number for 'maximum': "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x0065:
            X.1Bx r0 = r8.A0M(r6)
            X.Dxn r0 = X.C28341Dxn.A03(r0)
            int r2 = r0.A00
            if (r2 == 0) goto L_0x0085
            if (r2 == r6) goto L_0x007e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Bad tag number: "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x007e:
            X.Dxj r0 = X.C28337Dxj.A03(r0)
            r1.A00 = r0
            goto L_0x0012
        L_0x0085:
            X.Dxj r0 = X.C28337Dxj.A03(r0)
            r1.A01 = r0
            goto L_0x0012
        L_0x008c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Bad tag number for 'minimum': "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r2)
            throw r0
        L_0x0097:
            java.lang.IllegalArgumentException r0 = X.C28339Dxl.A02(r8)
            throw r0
        L_0x009c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28293Dx1.A01(X.Dxl):X.Dx4[]");
    }

    public AnonymousClass1Bz CP9() {
        C26135Csy A0t = BE8.A0t();
        C28296Dx4[] dx4Arr = this.A01;
        if (dx4Arr != null) {
            C28341Dxn.A07(new C28357Dy3((AnonymousClass1Bx[]) dx4Arr), A0t, false);
        }
        C28296Dx4[] dx4Arr2 = this.A00;
        if (dx4Arr2 != null) {
            C28341Dxn.A05(new C28357Dy3((AnonymousClass1Bx[]) dx4Arr2), A0t);
        }
        return new C28357Dy3(A0t);
    }
}
