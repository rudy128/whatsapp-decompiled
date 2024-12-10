package X;

/* renamed from: X.DxG  reason: case insensitive filesystem */
public class C28308DxG extends AnonymousClass1By {
    public C28339Dxl A00;

    public AnonymousClass1Bz CP9() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.DxG, java.lang.Object] */
    public static C28308DxG A01(Object obj) {
        if (obj instanceof C28308DxG) {
            return (C28308DxG) obj;
        }
        if (obj == null) {
            return null;
        }
        C28339Dxl A05 = C28339Dxl.A05(obj);
        ? obj2 = new Object();
        obj2.A00 = A05;
        return obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.Dwt[]} */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.Dwt, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.DyD, X.DyB] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C28285Dwt[] A0D() {
        /*
            r10 = this;
            X.Dxl r9 = r10.A00
            int r0 = r9.A0K()
            X.Dwt[] r8 = new X.C28285Dwt[r0]
            r7 = 0
        L_0x0009:
            int r0 = r9.A0K()
            if (r7 == r0) goto L_0x0089
            X.1Bx r6 = r9.A0M(r7)
            if (r6 == 0) goto L_0x0066
            boolean r0 = r6 instanceof X.C28285Dwt
            if (r0 != 0) goto L_0x0066
            boolean r0 = r6 instanceof X.C28339Dxl
            if (r0 == 0) goto L_0x007e
            X.Dxl r6 = (X.C28339Dxl) r6
            X.Dwt r5 = new X.Dwt
            r5.<init>()
            r4 = 0
            r3 = 0
        L_0x0026:
            int r0 = r6.A0K()
            if (r3 == r0) goto L_0x0065
            X.1Bx r0 = r6.A0M(r3)
            X.Dxn r2 = X.C28341Dxn.A03(r0)
            int r1 = r2.A00
            r0 = 1
            if (r1 == 0) goto L_0x005e
            if (r1 == r0) goto L_0x004c
            r0 = 2
            if (r1 != r0) goto L_0x006b
            X.Dxl r1 = X.C28339Dxl.A06(r2, r4)
            X.DxP r0 = new X.DxP
            r0.<init>((X.C28339Dxl) r1)
            r5.A01 = r0
        L_0x0049:
            int r3 = r3 + 1
            goto L_0x0026
        L_0x004c:
            X.Dwd r0 = X.C28269Dwd.A03(r2)
            byte[] r2 = r0.A0K()
            int r1 = r0.A00
            X.DyB r0 = new X.DyB
            r0.<init>(r2, r1)
            r5.A02 = r0
            goto L_0x0049
        L_0x005e:
            X.DxT r0 = X.C28321DxT.A01(r2)
            r5.A00 = r0
            goto L_0x0049
        L_0x0065:
            r6 = r5
        L_0x0066:
            r8[r7] = r6
            int r7 = r7 + 1
            goto L_0x0009
        L_0x006b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown tag encountered in structure: "
            r1.append(r0)
            int r0 = r2.A00
            r1.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0j(r1)
            throw r0
        L_0x007e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Invalid DistributionPoint: "
            java.lang.IllegalArgumentException r0 = X.BEB.A0T(r6, r0, r1)
            throw r0
        L_0x0089:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28308DxG.A0D():X.Dwt[]");
    }

    public String toString() {
        StringBuffer A0s = BE6.A0s();
        String str = AnonymousClass1Bo.A00;
        A0s.append("CRLDistPoint:");
        A0s.append(str);
        C28285Dwt[] A0D = A0D();
        for (int i = 0; i != A0D.length; i++) {
            A0s.append("    ");
            A0s.append(A0D[i]);
            A0s.append(str);
        }
        return A0s.toString();
    }
}
