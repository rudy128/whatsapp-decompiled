package X;

/* renamed from: X.5jv  reason: invalid class name and case insensitive filesystem */
public class C111565jv extends C40411uf {
    public final int A00;

    public C111565jv(int i) {
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v8 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A01(java.lang.Object r8, java.lang.Object r9) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x0032;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x000d;
                case 5: goto L_0x0083;
                case 6: goto L_0x00e6;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.C18070vi.A0h(r8, r9)
            boolean r0 = r8.equals(r9)
            return r0
        L_0x000d:
            boolean r0 = r8.equals(r9)
            return r0
        L_0x0012:
            X.6fu r8 = (X.C128386fu) r8
            X.6fu r9 = (X.C128386fu) r9
            X.C18070vi.A0h(r8, r9)
            java.lang.String r1 = r8.A01
            java.lang.String r0 = r9.A01
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0113
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r9.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0113
            boolean r1 = r8.A00
            boolean r0 = r9.A00
            goto L_0x007a
        L_0x0032:
            X.6lH r8 = (X.C131546lH) r8
            X.6lH r9 = (X.C131546lH) r9
            X.C18070vi.A0h(r8, r9)
            boolean r0 = r8 instanceof X.C117525zw
            r2 = 0
            if (r0 == 0) goto L_0x0051
            X.5zw r8 = (X.C117525zw) r8
            int[] r1 = r8.A04
            boolean r0 = r9 instanceof X.C117525zw
            if (r0 == 0) goto L_0x004c
            X.5zw r9 = (X.C117525zw) r9
            if (r9 == 0) goto L_0x004c
            int[] r2 = r9.A04
        L_0x004c:
            boolean r0 = java.util.Arrays.equals(r1, r2)
            return r0
        L_0x0051:
            boolean r0 = r8 instanceof X.C117535zx
            if (r0 == 0) goto L_0x0068
            X.5zx r8 = (X.C117535zx) r8
            int[][] r1 = r8.A04
            boolean r0 = r9 instanceof X.C117535zx
            if (r0 == 0) goto L_0x0063
            X.5zx r9 = (X.C117535zx) r9
            if (r9 == 0) goto L_0x0063
            int[][] r2 = r9.A04
        L_0x0063:
            boolean r0 = X.C200210n.A03(r1, r2)
            return r0
        L_0x0068:
            boolean r0 = r8 instanceof X.C117515zv
            if (r0 == 0) goto L_0x007e
            boolean r0 = r9 instanceof X.C117515zv
            if (r0 == 0) goto L_0x0113
            X.5zv r9 = (X.C117515zv) r9
            if (r9 == 0) goto L_0x0113
            X.5zv r8 = (X.C117515zv) r8
            int r1 = r8.A00
            int r0 = r9.A00
        L_0x007a:
            if (r1 != r0) goto L_0x0113
            goto L_0x0111
        L_0x007e:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x0083:
            X.6tS r8 = (X.C136216tS) r8
            X.6tS r9 = (X.C136216tS) r9
            X.C18070vi.A0h(r8, r9)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = r9.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0113
            int r1 = r8.A00
            int r0 = r9.A00
            if (r1 != r0) goto L_0x0113
            java.util.List r2 = r8.A04
            r6 = 0
            if (r2 == 0) goto L_0x00e4
            int r0 = r2.size()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x00a7:
            java.util.List r5 = r9.A04
            if (r5 == 0) goto L_0x00e2
            int r0 = r5.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x00b3:
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0113
            if (r2 == 0) goto L_0x0111
            java.util.Iterator r4 = r2.iterator()
            r3 = 0
        L_0x00c0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r2 = r4.next()
            int r1 = r3 + 1
            if (r3 >= 0) goto L_0x00d2
            X.AnonymousClass1ZU.A0B()
            throw r6
        L_0x00d2:
            if (r5 == 0) goto L_0x00e0
            java.lang.Object r0 = r5.get(r3)
        L_0x00d8:
            boolean r0 = X.C18070vi.A18(r2, r0)
            if (r0 == 0) goto L_0x0113
            r3 = r1
            goto L_0x00c0
        L_0x00e0:
            r0 = r6
            goto L_0x00d8
        L_0x00e2:
            r0 = r6
            goto L_0x00b3
        L_0x00e4:
            r1 = r6
            goto L_0x00a7
        L_0x00e6:
            X.6cI r8 = (X.C126166cI) r8
            X.6cI r9 = (X.C126166cI) r9
            X.C18070vi.A0h(r8, r9)
            boolean r0 = r8 instanceof X.AnonymousClass6BW
            if (r0 == 0) goto L_0x0115
            boolean r0 = r9 instanceof X.AnonymousClass6BW
            if (r0 == 0) goto L_0x0115
            X.6BW r8 = (X.AnonymousClass6BW) r8
            X.6sq r3 = r8.A00
            X.6BW r9 = (X.AnonymousClass6BW) r9
            X.6sq r2 = r9.A00
            java.lang.String r1 = r3.A03
            java.lang.String r0 = r2.A03
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0113
            X.6rD r1 = r3.A00
            X.6rD r0 = r2.A00
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0113
        L_0x0111:
            r0 = 1
            return r0
        L_0x0113:
            r0 = 0
            return r0
        L_0x0115:
            boolean r0 = X.C18070vi.A14(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111565jv.A01(java.lang.Object, java.lang.Object):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: int[]} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ boolean A02(java.lang.Object r6, java.lang.Object r7) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x005c;
                case 2: goto L_0x00e7;
                case 3: goto L_0x002e;
                case 4: goto L_0x00f7;
                case 5: goto L_0x0104;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.6cI r6 = (X.C126166cI) r6
            X.6cI r7 = (X.C126166cI) r7
            X.C18070vi.A0h(r6, r7)
            boolean r0 = r6 instanceof X.AnonymousClass6BW
            if (r0 == 0) goto L_0x0025
            boolean r0 = r7 instanceof X.AnonymousClass6BW
            if (r0 == 0) goto L_0x0025
            X.6BW r6 = (X.AnonymousClass6BW) r6
            X.6sq r0 = r6.A00
            java.lang.String r1 = r0.A02
            X.6BW r7 = (X.AnonymousClass6BW) r7
            X.6sq r0 = r7.A00
            java.lang.String r0 = r0.A02
        L_0x0020:
            boolean r4 = X.C18070vi.A18(r1, r0)
        L_0x0024:
            return r4
        L_0x0025:
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r0 = r7.getClass()
            goto L_0x0020
        L_0x002e:
            X.77c r6 = (X.C1418277c) r6
            X.77c r7 = (X.C1418277c) r7
            r3 = 0
            boolean r2 = X.C18070vi.A17(r6, r7)
            java.lang.Integer r1 = r6.A01
            java.lang.Integer r0 = r7.A01
            r4 = 0
            if (r1 != r0) goto L_0x0024
            int r0 = r1.intValue()
            if (r0 == r2) goto L_0x004f
            if (r0 != r3) goto L_0x0024
            java.lang.String r1 = r6.A09
            java.lang.String r0 = r7.A09
        L_0x004a:
            boolean r4 = X.C18070vi.A18(r1, r0)
            return r4
        L_0x004f:
            java.lang.String r1 = r6.A03
            java.lang.String r0 = r7.A03
            goto L_0x004a
        L_0x0054:
            X.C18070vi.A0h(r6, r7)
            boolean r4 = r6.equals(r7)
            return r4
        L_0x005c:
            X.6lH r6 = (X.C131546lH) r6
            X.6lH r7 = (X.C131546lH) r7
            X.C18070vi.A0h(r6, r7)
            boolean r0 = r6 instanceof X.C117525zw
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0090
            X.6sg r0 = r6.A00()
            java.lang.String r1 = r0.A02
            X.6sg r0 = r7.A00()
            java.lang.String r0 = r0.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00e0
            X.5zw r6 = (X.C117525zw) r6
            int[] r1 = r6.A03
            boolean r0 = r7 instanceof X.C117525zw
            if (r0 == 0) goto L_0x0089
            X.5zw r7 = (X.C117525zw) r7
            if (r7 == 0) goto L_0x0089
            int[] r2 = r7.A03
        L_0x0089:
            boolean r0 = java.util.Arrays.equals(r1, r2)
        L_0x008d:
            if (r0 == 0) goto L_0x00e0
            return r4
        L_0x0090:
            boolean r0 = r6 instanceof X.C117535zx
            if (r0 == 0) goto L_0x00b9
            X.6sg r0 = r6.A00()
            java.lang.String r1 = r0.A02
            X.6sg r0 = r7.A00()
            java.lang.String r0 = r0.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00e0
            X.5zx r6 = (X.C117535zx) r6
            int[][] r1 = r6.A03
            boolean r0 = r7 instanceof X.C117535zx
            if (r0 == 0) goto L_0x00b4
            X.5zx r7 = (X.C117535zx) r7
            if (r7 == 0) goto L_0x00b4
            int[][] r2 = r7.A03
        L_0x00b4:
            boolean r0 = X.C200210n.A03(r1, r2)
            goto L_0x008d
        L_0x00b9:
            boolean r0 = r6 instanceof X.C117515zv
            if (r0 == 0) goto L_0x00e2
            X.6sg r0 = r6.A00()
            java.lang.String r1 = r0.A02
            X.6sg r0 = r7.A00()
            java.lang.String r0 = r0.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00e0
            boolean r0 = r7 instanceof X.C117515zv
            if (r0 == 0) goto L_0x00e0
            X.5zv r7 = (X.C117515zv) r7
            if (r7 == 0) goto L_0x00e0
            X.5zv r6 = (X.C117515zv) r6
            int r1 = r6.A00
            int r0 = r7.A00
            if (r1 != r0) goto L_0x00e0
            return r4
        L_0x00e0:
            r4 = 0
            return r4
        L_0x00e2:
            X.3EW r0 = X.AnonymousClass3MW.A14()
            throw r0
        L_0x00e7:
            X.6sg r6 = (X.C135736sg) r6
            X.6sg r7 = (X.C135736sg) r7
            X.C18070vi.A0h(r6, r7)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = r7.A02
            boolean r4 = X.C18070vi.A18(r1, r0)
            return r4
        L_0x00f7:
            X.1E7 r6 = (X.AnonymousClass1E7) r6
            X.1E7 r7 = (X.AnonymousClass1E7) r7
            X.1BI r1 = r6.A0J
            X.1BI r0 = r7.A0J
            boolean r4 = r1.equals(r0)
            return r4
        L_0x0104:
            X.6tS r6 = (X.C136216tS) r6
            X.6tS r7 = (X.C136216tS) r7
            X.C18070vi.A0h(r6, r7)
            java.lang.String r1 = r6.A02
            java.lang.String r0 = r7.A02
            boolean r4 = X.C18070vi.A18(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111565jv.A02(java.lang.Object, java.lang.Object):boolean");
    }
}
