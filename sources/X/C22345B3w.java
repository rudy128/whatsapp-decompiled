package X;

/* renamed from: X.B3w  reason: case insensitive filesystem */
public class C22345B3w extends C28260DuL {
    public C22345B3w() {
        super((CWO) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009d, code lost:
        if (r0 == null) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A03(java.lang.Object r9) {
        /*
            r8 = this;
            java.util.TreeMap r0 = X.A86.A00
            r2 = 0
            if (r9 == 0) goto L_0x0016
            boolean r0 = r9 instanceof java.util.Date
            if (r0 != 0) goto L_0x01d3
            boolean r0 = r9 instanceof java.lang.Number
            if (r0 == 0) goto L_0x0017
            long r0 = X.C17880vN.A05(r9)
            java.util.Date r2 = new java.util.Date
            r2.<init>(r0)
        L_0x0016:
            return r2
        L_0x0017:
            boolean r0 = r9 instanceof java.lang.String
            if (r0 == 0) goto L_0x01bc
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r1 = "p.m."
            java.lang.String r0 = "pm"
            java.lang.String r3 = r9.replace(r1, r0)
            java.lang.String r1 = "a.m."
            java.lang.String r0 = "am"
            java.lang.String r1 = r3.replace(r1, r0)
            java.lang.String r0 = " -/:,.+年月日曜時分秒"
            java.util.StringTokenizer r3 = new java.util.StringTokenizer
            r3.<init>(r1, r0)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = r3.nextToken()
            int r1 = r6.length()
            r0 = 4
            r7 = 0
            if (r1 != r0) goto L_0x00b6
            boolean r0 = X.AnonymousClass8BU.A1Y(r6, r7)
            if (r0 == 0) goto L_0x00b6
            java.util.GregorianCalendar r4 = X.A86.A03()
            int r1 = java.lang.Integer.parseInt(r6)
            r0 = 1
            r4.set(r0, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = r3.nextToken()
            java.lang.Integer r0 = X.A86.A00(r0)
            int r0 = r0.intValue()
            r6 = 2
            r4.set(r6, r0)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01b6
            java.lang.String r5 = r3.nextToken()
            boolean r0 = X.AnonymousClass8BU.A1Y(r5, r7)
            if (r0 == 0) goto L_0x01b6
            int r0 = r5.length()
            r2 = 5
            if (r0 != r2) goto L_0x00ae
            char r1 = r5.charAt(r6)
            r0 = 84
            if (r1 != r0) goto L_0x00ae
            java.lang.String r0 = r5.substring(r7, r6)
            int r0 = java.lang.Integer.parseInt(r0)
            r4.set(r2, r0)
            r0 = 3
            java.lang.String r0 = r5.substring(r0)
            if (r0 != 0) goto L_0x00a9
        L_0x009f:
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = r3.nextToken()
        L_0x00a9:
            java.util.Date r9 = X.A86.A02(r0, r4, r3)
            return r9
        L_0x00ae:
            int r0 = java.lang.Integer.parseInt(r5)
            r4.set(r2, r0)
            goto L_0x009f
        L_0x00b6:
            java.util.TreeMap r0 = X.A86.A00
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L_0x00c8
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x0016
            java.lang.String r6 = r3.nextToken()
        L_0x00c8:
            java.util.TreeMap r1 = X.A86.A01
            boolean r0 = r1.containsKey(r6)
            if (r0 == 0) goto L_0x0140
            java.util.GregorianCalendar r5 = X.A86.A03()
            java.lang.Number r0 = X.C108945cZ.A1D(r6, r1)
            if (r0 == 0) goto L_0x019f
            int r0 = r0.intValue()
            r6 = 2
            r5.set(r6, r0)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01bb
            java.lang.String r0 = r3.nextToken()
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 5
            r5.set(r0, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01bb
            java.lang.String r4 = r3.nextToken()
            char r0 = r4.charAt(r7)
            boolean r0 = java.lang.Character.isLetter(r0)
            if (r0 == 0) goto L_0x0112
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01bb
            java.lang.String r4 = r3.nextToken()
        L_0x0112:
            int r1 = r4.length()
            r0 = 4
            if (r1 != r0) goto L_0x0139
            r2 = 1
            int r1 = java.lang.Integer.parseInt(r4)
            r0 = 100
            if (r1 >= r0) goto L_0x0128
            r0 = 30
            if (r1 <= r0) goto L_0x0136
            int r1 = r1 + 2000
        L_0x0128:
            r5.set(r2, r1)
        L_0x012b:
            boolean r0 = r3.hasMoreTokens()
            if (r0 != 0) goto L_0x0196
            java.util.Date r9 = r5.getTime()
            return r9
        L_0x0136:
            int r1 = r1 + 1900
            goto L_0x0128
        L_0x0139:
            if (r1 != r6) goto L_0x012b
            java.util.Date r9 = X.A86.A02(r4, r5, r3)
            return r9
        L_0x0140:
            boolean r0 = X.AnonymousClass8BU.A1Y(r6, r7)
            if (r0 == 0) goto L_0x0016
            java.util.GregorianCalendar r4 = X.A86.A03()
            int r1 = java.lang.Integer.parseInt(r6)
            r0 = 5
            r4.set(r0, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01bb
            java.lang.String r0 = r3.nextToken()
            java.lang.Integer r0 = X.A86.A00(r0)
            int r1 = r0.intValue()
            r0 = 2
            r4.set(r0, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01bb
            java.lang.String r0 = r3.nextToken()
            r2 = 1
            int r1 = java.lang.Integer.parseInt(r0)
            r0 = 100
            if (r1 >= r0) goto L_0x0181
            r0 = 30
            if (r1 <= r0) goto L_0x0193
            int r1 = r1 + 2000
        L_0x0181:
            r4.set(r2, r1)
            boolean r0 = r3.hasMoreTokens()
            if (r0 == 0) goto L_0x01b6
            java.lang.String r0 = r3.nextToken()
            java.util.Date r9 = X.A86.A02(r0, r4, r3)
            return r9
        L_0x0193:
            int r1 = r1 + 1900
            goto L_0x0181
        L_0x0196:
            java.lang.String r0 = r3.nextToken()
            java.util.Date r9 = X.A86.A02(r0, r5, r3)
            return r9
        L_0x019f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "can not parse "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " as month"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01b6:
            java.util.Date r9 = r4.getTime()
            return r9
        L_0x01bb:
            return r2
        L_0x01bc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Primitive: Can not convert "
            r1.append(r0)
            X.AnonymousClass8BW.A1M(r9, r1)
            java.lang.String r0 = " to int"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x01d3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22345B3w.A03(java.lang.Object):java.lang.Object");
    }
}
