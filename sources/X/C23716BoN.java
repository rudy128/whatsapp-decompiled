package X;

/* renamed from: X.BoN  reason: case insensitive filesystem */
public final class C23716BoN extends DFL {
    public static final int[] A00 = {135, 134, 153};

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r3 <= r4) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (X.DFL.A00(r14, 153) != null) goto L_0x00b0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J() {
        /*
            r14 = this;
            java.lang.ThreadLocal r6 = X.C24724CHl.A02
            java.lang.Object r5 = r6.get()
            java.lang.Integer r0 = X.C17880vN.A0i()
            r6.set(r0)
            int[] r13 = A00     // Catch:{ all -> 0x01ef }
            r11 = 3
            r10 = 0
        L_0x0011:
            r9 = r13[r10]     // Catch:{ all -> 0x01ef }
            java.lang.Object r8 = X.DFL.A00(r14, r9)     // Catch:{ all -> 0x01ef }
            boolean r0 = r8 instanceof java.lang.String     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0042
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x01ef }
            X.E9O r0 = r14.A01     // Catch:{ all -> 0x01ef }
            r3 = 0
            if (r0 == 0) goto L_0x0040
            X.CMY r2 = new X.CMY     // Catch:{ all -> 0x01ef }
            r2.<init>(r0)     // Catch:{ all -> 0x01ef }
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x01ef }
            X.BE7.A11(r9, r0)     // Catch:{ all -> 0x01ef }
            X.E9O r1 = r2.A01     // Catch:{ all -> 0x01ef }
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x01ef }
            X.D8I r2 = new X.D8I     // Catch:{ all -> 0x01ef }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x01ef }
        L_0x0035:
            int r1 = r14.A04     // Catch:{ all -> 0x01ef }
            X.DNu r0 = new X.DNu     // Catch:{ all -> 0x01ef }
            r0.<init>(r2, r8, r3, r1)     // Catch:{ all -> 0x01ef }
            r14.A0H(r9, r0)     // Catch:{ all -> 0x01ef }
            goto L_0x009b
        L_0x0040:
            r2 = r3
            goto L_0x0035
        L_0x0042:
            boolean r0 = r8 instanceof java.util.List     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x009b
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x01ef }
            java.util.ArrayList r7 = X.AnonymousClass000.A14(r8)     // Catch:{ all -> 0x01ef }
            int r1 = r8.size()     // Catch:{ all -> 0x01ef }
            r0 = 0
            X.1Oc r0 = X.C28851b7.A08(r0, r1)     // Catch:{ all -> 0x01ef }
            X.1Oa r0 = X.C28851b7.A07(r0)     // Catch:{ all -> 0x01ef }
            int r4 = r0.A00     // Catch:{ all -> 0x01ef }
            int r3 = r0.A01     // Catch:{ all -> 0x01ef }
            int r2 = r0.A02     // Catch:{ all -> 0x01ef }
            if (r2 <= 0) goto L_0x0064
            if (r4 <= r3) goto L_0x0068
            goto L_0x0098
        L_0x0064:
            if (r2 >= 0) goto L_0x0098
            if (r3 > r4) goto L_0x0098
        L_0x0068:
            int r0 = r4 + 1
            java.lang.Object r12 = r8.get(r0)     // Catch:{ all -> 0x01ef }
            if (r12 == 0) goto L_0x0094
            java.lang.Object r1 = r8.get(r4)     // Catch:{ all -> 0x01ef }
            boolean r0 = r1 instanceof java.lang.Integer     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0089
            int r1 = X.AnonymousClass000.A0M(r1)     // Catch:{ all -> 0x01ef }
        L_0x007c:
            X.E8A r0 = X.CC0.A00(r14, r12, r1)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0094
            X.C17890vO.A1D(r7, r1)     // Catch:{ all -> 0x01ef }
            r7.add(r0)     // Catch:{ all -> 0x01ef }
            goto L_0x0094
        L_0x0089:
            boolean r0 = r1 instanceof java.lang.String     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0094
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x01ef }
            int r1 = X.CCB.A00(r1)     // Catch:{ all -> 0x01ef }
            goto L_0x007c
        L_0x0094:
            if (r4 == r3) goto L_0x0098
            int r4 = r4 + r2
            goto L_0x0068
        L_0x0098:
            r14.A0H(r9, r7)     // Catch:{ all -> 0x01ef }
        L_0x009b:
            int r10 = r10 + 1
            if (r10 < r11) goto L_0x0011
            r0 = 135(0x87, float:1.89E-43)
            java.lang.Object r0 = X.DFL.A00(r14, r0)     // Catch:{ all -> 0x01ef }
            if (r0 != 0) goto L_0x00b0
            r0 = 153(0x99, float:2.14E-43)
            java.lang.Object r1 = X.DFL.A00(r14, r0)     // Catch:{ all -> 0x01ef }
            r0 = 0
            if (r1 == 0) goto L_0x00b1
        L_0x00b0:
            r0 = 1
        L_0x00b1:
            r7 = 1
            if (r0 != 0) goto L_0x00d2
            X.Cke r0 = X.C25995CqB.A01()     // Catch:{ all -> 0x01ef }
            int r4 = r14.A05     // Catch:{ all -> 0x01ef }
            int[] r3 = r0.A01(r4)     // Catch:{ all -> 0x01ef }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x01ef }
            int r2 = r3.length     // Catch:{ all -> 0x01ef }
            r1 = 0
            goto L_0x00d9
        L_0x00c4:
            r0 = r3[r1]     // Catch:{ all -> 0x01ef }
            X.DFL r0 = r14.A09(r0)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x00d7
            int r0 = r0.A00     // Catch:{ all -> 0x01ef }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00d7
        L_0x00d2:
            int r0 = r14.A00     // Catch:{ all -> 0x01ef }
            if (r7 == 0) goto L_0x0110
            goto L_0x010d
        L_0x00d7:
            int r1 = r1 + 1
        L_0x00d9:
            if (r1 >= r2) goto L_0x00dc
            goto L_0x00c4
        L_0x00dc:
            X.Cke r0 = X.C25995CqB.A01()     // Catch:{ all -> 0x01ef }
            int[] r4 = r0.A00(r4)     // Catch:{ all -> 0x01ef }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x01ef }
            int r3 = r4.length     // Catch:{ all -> 0x01ef }
            r2 = 0
        L_0x00e9:
            if (r2 >= r3) goto L_0x010b
            r0 = r4[r2]     // Catch:{ all -> 0x01ef }
            java.util.List r0 = r14.A0F(r0)     // Catch:{ all -> 0x01ef }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x01ef }
        L_0x00f5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0108
            X.DFL r0 = X.BE6.A0d(r1)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x00f5
            int r0 = r0.A00     // Catch:{ all -> 0x01ef }
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00f5
            goto L_0x00d2
        L_0x0108:
            int r2 = r2 + 1
            goto L_0x00e9
        L_0x010b:
            r7 = 0
            goto L_0x00d2
        L_0x010d:
            r0 = r0 | 1
            goto L_0x0112
        L_0x0110:
            r0 = r0 & -2
        L_0x0112:
            r14.A00 = r0     // Catch:{ all -> 0x01ef }
            java.util.HashSet r8 = X.C17880vN.A12()     // Catch:{ all -> 0x01ef }
            X.C25995CqB.A00()     // Catch:{ all -> 0x01ef }
            int r3 = r14.A05     // Catch:{ all -> 0x01ef }
            r0 = 13326(0x340e, float:1.8674E-41)
            if (r3 == r0) goto L_0x0125
            r0 = 13336(0x3418, float:1.8688E-41)
            if (r3 != r0) goto L_0x012a
        L_0x0125:
            int r0 = r14.A04     // Catch:{ all -> 0x01ef }
            X.C17890vO.A1D(r8, r0)     // Catch:{ all -> 0x01ef }
        L_0x012a:
            X.Cke r0 = X.C25995CqB.A01()     // Catch:{ all -> 0x01ef }
            int[] r7 = r0.A01(r3)     // Catch:{ all -> 0x01ef }
            X.C18070vi.A0b(r7)     // Catch:{ all -> 0x01ef }
            int r4 = r7.length     // Catch:{ all -> 0x01ef }
            r9 = 0
            r2 = 0
        L_0x0138:
            if (r2 >= r4) goto L_0x0159
            r0 = r7[r2]     // Catch:{ all -> 0x01ef }
            X.DFL r0 = r14.A09(r0)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0156
            java.util.Set r1 = r0.A03     // Catch:{ all -> 0x01ef }
            if (r1 != 0) goto L_0x014a
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x01ef }
        L_0x014a:
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x01ef }
            boolean r0 = X.C108945cZ.A1U(r1)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0156
            r8.addAll(r1)     // Catch:{ all -> 0x01ef }
        L_0x0156:
            int r2 = r2 + 1
            goto L_0x0138
        L_0x0159:
            X.Cke r0 = X.C25995CqB.A01()     // Catch:{ all -> 0x01ef }
            int[] r7 = r0.A00(r3)     // Catch:{ all -> 0x01ef }
            X.C18070vi.A0b(r7)     // Catch:{ all -> 0x01ef }
            int r4 = r7.length     // Catch:{ all -> 0x01ef }
        L_0x0165:
            if (r9 >= r4) goto L_0x0195
            r0 = r7[r9]     // Catch:{ all -> 0x01ef }
            java.util.List r0 = r14.A0F(r0)     // Catch:{ all -> 0x01ef }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01ef }
        L_0x0171:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0192
            X.DFL r0 = X.BE6.A0d(r2)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0171
            java.util.Set r1 = r0.A03     // Catch:{ all -> 0x01ef }
            if (r1 != 0) goto L_0x0185
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x01ef }
        L_0x0185:
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x01ef }
            boolean r0 = X.C108945cZ.A1U(r1)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0171
            r8.addAll(r1)     // Catch:{ all -> 0x01ef }
            goto L_0x0171
        L_0x0192:
            int r9 = r9 + 1
            goto L_0x0165
        L_0x0195:
            r1 = r8
            boolean r0 = r8.isEmpty()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x019d
            r1 = 0
        L_0x019d:
            r14.A03 = r1     // Catch:{ all -> 0x01ef }
            boolean r1 = X.C17880vN.A1X(r8)     // Catch:{ all -> 0x01ef }
            int r0 = r14.A00     // Catch:{ all -> 0x01ef }
            if (r1 == 0) goto L_0x01aa
            r0 = r0 | 2
            goto L_0x01ac
        L_0x01aa:
            r0 = r0 & -3
        L_0x01ac:
            r14.A00 = r0     // Catch:{ all -> 0x01ef }
            X.Cke r0 = X.C25995CqB.A01()     // Catch:{ all -> 0x01ef }
            int[] r7 = r0.A00(r3)     // Catch:{ all -> 0x01ef }
            X.C18070vi.A0b(r7)     // Catch:{ all -> 0x01ef }
            int r4 = r7.length     // Catch:{ all -> 0x01ef }
            r3 = 0
        L_0x01bb:
            if (r3 >= r4) goto L_0x01df
            r0 = r7[r3]     // Catch:{ all -> 0x01ef }
            java.util.List r0 = r14.A0F(r0)     // Catch:{ all -> 0x01ef }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01ef }
        L_0x01c7:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x01da
            X.DFL r0 = X.BE6.A0d(r2)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x01c7
            int r1 = r0.A05     // Catch:{ all -> 0x01ef }
            r0 = 16851(0x41d3, float:2.3613E-41)
            if (r1 != r0) goto L_0x01c7
            goto L_0x01dd
        L_0x01da:
            int r3 = r3 + 1
            goto L_0x01bb
        L_0x01dd:
            r1 = 1
            goto L_0x01e0
        L_0x01df:
            r1 = 0
        L_0x01e0:
            int r0 = r14.A00     // Catch:{ all -> 0x01ef }
            if (r1 == 0) goto L_0x01e7
            r0 = r0 | 4
            goto L_0x01e9
        L_0x01e7:
            r0 = r0 & -5
        L_0x01e9:
            r14.A00 = r0     // Catch:{ all -> 0x01ef }
            r6.set(r5)
            return
        L_0x01ef:
            r0 = move-exception
            r6.set(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23716BoN.A0J():void");
    }
}
