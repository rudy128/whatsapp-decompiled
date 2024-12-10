package X;

/* renamed from: X.Du6  reason: case insensitive filesystem */
public class C28245Du6 extends C26156CtO {
    public int A00;
    public String A01;

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c3, code lost:
        if (r1 > r0) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A05(boolean[] r14) {
        /*
            r13 = this;
            int r2 = r13.A01
            r13.A07()
        L_0x0005:
            char r7 = r13.A00
            r0 = 48
            if (r7 < r0) goto L_0x0013
            r0 = 57
            if (r7 > r0) goto L_0x0013
            r13.A08()
            goto L_0x0005
        L_0x0013:
            r3 = 101(0x65, float:1.42E-43)
            r4 = 26
            r6 = 126(0x7e, float:1.77E-43)
            r1 = 69
            r5 = 1
            r0 = 46
            if (r7 == r0) goto L_0x0102
            if (r7 == r1) goto L_0x0113
            if (r7 == r3) goto L_0x0113
            r13.A0A()
            char r1 = r13.A00
            if (r1 < 0) goto L_0x0044
            if (r1 >= r6) goto L_0x0044
            boolean r0 = r14[r1]
            if (r0 != 0) goto L_0x0044
            if (r1 == r4) goto L_0x0044
            r13.A0C(r14)
            int r0 = r13.A01
            r13.A0E(r2, r0)
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x01e9
            X.C2P r0 = X.C26156CtO.A01(r13, r5)
            throw r0
        L_0x0044:
            int r0 = r13.A01
            r13.A0E(r2, r0)
            java.lang.String r2 = r13.A03
            int r4 = r2.length()
            r3 = 0
            char r1 = r2.charAt(r3)
            r0 = 45
            r6 = 6
            r7 = 48
            if (r1 != r0) goto L_0x0073
            r9 = 1
            r1 = 20
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x008d
            r0 = 3
            if (r4 < r0) goto L_0x008d
            char r0 = r2.charAt(r5)
            if (r0 != r7) goto L_0x008d
            int r1 = r13.A01
            X.C2P r0 = new X.C2P
            r0.<init>(r2, r1, r6)
            throw r0
        L_0x0073:
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x0088
            r0 = 2
            if (r4 < r0) goto L_0x0088
            char r0 = r2.charAt(r3)
            if (r0 != r7) goto L_0x0088
            int r1 = r13.A01
            X.C2P r0 = new X.C2P
            r0.<init>(r2, r1, r6)
            throw r0
        L_0x0088:
            r1 = 19
            r9 = 0
            r12 = 0
            goto L_0x008e
        L_0x008d:
            r12 = 1
        L_0x008e:
            r8 = 10
            if (r4 < r1) goto L_0x0097
            if (r4 > r1) goto L_0x00c5
            int r4 = r4 + -1
            r3 = 1
        L_0x0097:
            r5 = 0
        L_0x0099:
            r10 = 10
            if (r9 >= r4) goto L_0x00aa
            long r5 = r5 * r10
            int r10 = r9 + 1
            char r0 = r2.charAt(r9)
            int r0 = 48 - r0
            long r0 = (long) r0
            long r5 = r5 + r0
            r9 = r10
            goto L_0x0099
        L_0x00aa:
            if (r3 == 0) goto L_0x00d3
            r3 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00cb
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x00c5
            char r1 = r2.charAt(r9)
            r0 = 55
            if (r12 == 0) goto L_0x00c3
            r0 = 56
        L_0x00c3:
            if (r1 <= r0) goto L_0x00cb
        L_0x00c5:
            java.math.BigInteger r0 = new java.math.BigInteger
            r0.<init>(r2, r8)
            return r0
        L_0x00cb:
            long r5 = r5 * r10
            char r0 = r2.charAt(r9)
            int r7 = r7 - r0
            long r0 = (long) r7
            long r5 = r5 + r0
        L_0x00d3:
            if (r12 == 0) goto L_0x00eb
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x00e6
            r1 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00e6
            int r0 = (int) r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00e6:
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            return r0
        L_0x00eb:
            long r3 = -r5
            boolean r0 = r13.A0H
            if (r0 == 0) goto L_0x00fd
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00fd
            int r0 = (int) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x00fd:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            return r0
        L_0x0102:
            r13.A07()
        L_0x0105:
            char r7 = r13.A00
            r0 = 48
            if (r7 < r0) goto L_0x0113
            r0 = 57
            if (r7 > r0) goto L_0x0113
            r13.A08()
            goto L_0x0105
        L_0x0113:
            if (r7 == r1) goto L_0x0137
            if (r7 == r3) goto L_0x0137
            r13.A0A()
            char r1 = r13.A00
            if (r1 < 0) goto L_0x0185
            if (r1 >= r6) goto L_0x0185
            boolean r0 = r14[r1]
            if (r0 != 0) goto L_0x0185
            if (r1 == r4) goto L_0x0185
            r13.A0C(r14)
            int r0 = r13.A01
            r13.A0E(r2, r0)
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x01e9
            X.C2P r0 = X.C26156CtO.A01(r13, r5)
            throw r0
        L_0x0137:
            X.C6O r3 = r13.A06
            r3.A00(r1)
            r13.A07()
            char r1 = r13.A00
            r0 = 43
            if (r1 == r0) goto L_0x0151
            r0 = 45
            if (r1 == r0) goto L_0x0151
            r0 = 48
            if (r1 < r0) goto L_0x01d6
            r0 = 57
            if (r1 > r0) goto L_0x01d6
        L_0x0151:
            r3.A00(r1)
            r13.A07()
        L_0x0157:
            char r1 = r13.A00
            r0 = 48
            if (r1 < r0) goto L_0x0165
            r0 = 57
            if (r1 > r0) goto L_0x0165
            r13.A08()
            goto L_0x0157
        L_0x0165:
            r13.A0A()
            char r1 = r13.A00
            if (r1 < 0) goto L_0x0185
            if (r1 >= r6) goto L_0x0185
            boolean r0 = r14[r1]
            if (r0 != 0) goto L_0x0185
            if (r1 == r4) goto L_0x0185
            r13.A0C(r14)
            int r0 = r13.A01
            r13.A0E(r2, r0)
            boolean r0 = r13.A09
            if (r0 != 0) goto L_0x01e9
            X.C2P r0 = X.C26156CtO.A01(r13, r5)
            throw r0
        L_0x0185:
            int r0 = r13.A01
            r13.A0E(r2, r0)
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x0191
            r13.A06()
        L_0x0191:
            boolean r0 = r13.A0G     // Catch:{ NumberFormatException -> 0x01d1 }
            if (r0 != 0) goto L_0x01a0
            java.lang.String r0 = r13.A03     // Catch:{ NumberFormatException -> 0x01d1 }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x01d1 }
            java.lang.Float r4 = java.lang.Float.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01d1 }
            return r4
        L_0x01a0:
            java.lang.String r2 = r13.A03     // Catch:{ NumberFormatException -> 0x01d1 }
            int r1 = r2.length()     // Catch:{ NumberFormatException -> 0x01d1 }
            r0 = 18
            if (r1 <= r0) goto L_0x01c8
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x01d1 }
            r4.<init>(r2)     // Catch:{ NumberFormatException -> 0x01d1 }
            boolean r0 = r13.A0F     // Catch:{ NumberFormatException -> 0x01d1 }
            if (r0 != 0) goto L_0x01d0
            java.lang.String r3 = r13.A03     // Catch:{ NumberFormatException -> 0x01d1 }
            double r1 = java.lang.Double.parseDouble(r3)     // Catch:{ NumberFormatException -> 0x01d1 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01d1 }
            boolean r0 = r0.equals(r3)     // Catch:{ NumberFormatException -> 0x01d1 }
            if (r0 == 0) goto L_0x01d0
            java.lang.Double r4 = java.lang.Double.valueOf(r1)     // Catch:{ NumberFormatException -> 0x01d1 }
            return r4
        L_0x01c8:
            double r0 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x01d1 }
            java.lang.Double r4 = java.lang.Double.valueOf(r0)     // Catch:{ NumberFormatException -> 0x01d1 }
        L_0x01d0:
            return r4
        L_0x01d1:
            X.C2P r0 = X.C26156CtO.A01(r13, r5)
            throw r0
        L_0x01d6:
            r13.A0C(r14)
            int r0 = r13.A01
            r13.A0E(r2, r0)
            boolean r0 = r13.A09
            if (r0 == 0) goto L_0x01ec
            boolean r0 = r13.A07
            if (r0 != 0) goto L_0x01e9
            r13.A06()
        L_0x01e9:
            java.lang.String r0 = r13.A03
            return r0
        L_0x01ec:
            X.C2P r0 = X.C26156CtO.A01(r13, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28245Du6.A05(boolean[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r0 = A05(X.C26156CtO.A0K);
        r4.A02 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c4, code lost:
        r1 = r6.A03(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d5, code lost:
        r1 = r6.A03(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        r2 = new X.C2P(java.lang.Character.valueOf(r1), r4.A01, 0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0D(java.lang.String r5, X.C25769Clg r6) {
        /*
            r4 = this;
            X.CWO r0 = r6.A00
            r4.A04 = r0
            r4.A01 = r5
            int r0 = r5.length()
            r4.A00 = r0
            r0 = -1
            r4.A01 = r0
        L_0x000f:
            r4.A07()     // Catch:{ IOException -> 0x010f }
            char r1 = r4.A00     // Catch:{ IOException -> 0x010f }
            r0 = 9
            if (r1 == r0) goto L_0x000f
            r0 = 10
            if (r1 == r0) goto L_0x000f
            r3 = 1
            switch(r1) {
                case 13: goto L_0x000f;
                case 32: goto L_0x000f;
                case 34: goto L_0x0036;
                case 39: goto L_0x0036;
                case 45: goto L_0x003d;
                case 78: goto L_0x0046;
                case 91: goto L_0x0073;
                case 93: goto L_0x0102;
                case 102: goto L_0x0078;
                case 110: goto L_0x0096;
                case 116: goto L_0x00b3;
                case 123: goto L_0x00da;
                case 125: goto L_0x0102;
                default: goto L_0x0020;
            }     // Catch:{ IOException -> 0x010f }
        L_0x0020:
            switch(r1) {
                case 48: goto L_0x003d;
                case 49: goto L_0x003d;
                case 50: goto L_0x003d;
                case 51: goto L_0x003d;
                case 52: goto L_0x003d;
                case 53: goto L_0x003d;
                case 54: goto L_0x003d;
                case 55: goto L_0x003d;
                case 56: goto L_0x003d;
                case 57: goto L_0x003d;
                case 58: goto L_0x0102;
                default: goto L_0x0023;
            }     // Catch:{ IOException -> 0x010f }
        L_0x0023:
            boolean[] r0 = X.C26156CtO.A0K     // Catch:{ IOException -> 0x010f }
            r4.A0B(r0)     // Catch:{ IOException -> 0x010f }
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x010f }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = r4.A03     // Catch:{ IOException -> 0x010f }
            goto L_0x00c4
        L_0x0030:
            X.C2P r2 = X.C26156CtO.A01(r4, r3)     // Catch:{ IOException -> 0x010f }
            goto L_0x010e
        L_0x0036:
            r4.A09()     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = r4.A03     // Catch:{ IOException -> 0x010f }
            goto L_0x00c4
        L_0x003d:
            boolean[] r0 = X.C26156CtO.A0K     // Catch:{ IOException -> 0x010f }
            java.lang.Object r0 = r4.A05(r0)     // Catch:{ IOException -> 0x010f }
            r4.A02 = r0     // Catch:{ IOException -> 0x010f }
            goto L_0x00c4
        L_0x0046:
            boolean[] r0 = X.C26156CtO.A0K     // Catch:{ IOException -> 0x010f }
            r4.A0B(r0)     // Catch:{ IOException -> 0x010f }
            boolean r0 = r4.A08     // Catch:{ IOException -> 0x010f }
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "NaN"
            java.lang.String r1 = r4.A03     // Catch:{ IOException -> 0x010f }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x010f }
            if (r0 == 0) goto L_0x0060
            r0 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ IOException -> 0x010f }
            goto L_0x00c4
        L_0x0060:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x010f }
            if (r0 != 0) goto L_0x00d5
            int r0 = r4.A01     // Catch:{ IOException -> 0x010f }
            X.C2P r2 = new X.C2P     // Catch:{ IOException -> 0x010f }
            r2.<init>(r1, r0, r3)     // Catch:{ IOException -> 0x010f }
            goto L_0x010e
        L_0x006d:
            X.C2P r2 = X.C26156CtO.A01(r4, r3)     // Catch:{ IOException -> 0x010f }
            goto L_0x010e
        L_0x0073:
            java.lang.Object r1 = r4.A02(r6)     // Catch:{ IOException -> 0x010f }
            goto L_0x00de
        L_0x0078:
            boolean[] r0 = X.C26156CtO.A0K     // Catch:{ IOException -> 0x010f }
            r4.A0B(r0)     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = "false"
            java.lang.String r1 = r4.A03     // Catch:{ IOException -> 0x010f }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x010f }
            if (r0 == 0) goto L_0x008a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ IOException -> 0x010f }
            goto L_0x00c4
        L_0x008a:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x010f }
            if (r0 != 0) goto L_0x00d5
            int r0 = r4.A01     // Catch:{ IOException -> 0x010f }
            X.C2P r2 = new X.C2P     // Catch:{ IOException -> 0x010f }
            r2.<init>(r1, r0, r3)     // Catch:{ IOException -> 0x010f }
            goto L_0x010e
        L_0x0096:
            boolean[] r0 = X.C26156CtO.A0K     // Catch:{ IOException -> 0x010f }
            r4.A0B(r0)     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = "null"
            java.lang.String r1 = r4.A03     // Catch:{ IOException -> 0x010f }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x010f }
            if (r0 == 0) goto L_0x00a7
            r1 = 0
            goto L_0x00de
        L_0x00a7:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x010f }
            if (r0 != 0) goto L_0x00d5
            int r0 = r4.A01     // Catch:{ IOException -> 0x010f }
            X.C2P r2 = new X.C2P     // Catch:{ IOException -> 0x010f }
            r2.<init>(r1, r0, r3)     // Catch:{ IOException -> 0x010f }
            goto L_0x010e
        L_0x00b3:
            boolean[] r0 = X.C26156CtO.A0K     // Catch:{ IOException -> 0x010f }
            r4.A0B(r0)     // Catch:{ IOException -> 0x010f }
            java.lang.String r0 = "true"
            java.lang.String r1 = r4.A03     // Catch:{ IOException -> 0x010f }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x010f }
            if (r0 == 0) goto L_0x00c9
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x010f }
        L_0x00c4:
            java.lang.Object r1 = r6.A03(r0)     // Catch:{ IOException -> 0x010f }
            goto L_0x00de
        L_0x00c9:
            boolean r0 = r4.A09     // Catch:{ IOException -> 0x010f }
            if (r0 != 0) goto L_0x00d5
            int r0 = r4.A01     // Catch:{ IOException -> 0x010f }
            X.C2P r2 = new X.C2P     // Catch:{ IOException -> 0x010f }
            r2.<init>(r1, r0, r3)     // Catch:{ IOException -> 0x010f }
            goto L_0x010e
        L_0x00d5:
            java.lang.Object r1 = r6.A03(r1)     // Catch:{ IOException -> 0x010f }
            goto L_0x00de
        L_0x00da:
            java.lang.Object r1 = r4.A03(r6)     // Catch:{ IOException -> 0x010f }
        L_0x00de:
            boolean r0 = r4.A0B     // Catch:{ IOException -> 0x010f }
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r4.A0C     // Catch:{ IOException -> 0x010f }
            if (r0 != 0) goto L_0x00e9
            r4.A0A()     // Catch:{ IOException -> 0x010f }
        L_0x00e9:
            char r2 = r4.A00     // Catch:{ IOException -> 0x010f }
            r0 = 26
            if (r2 == r0) goto L_0x00fc
            int r1 = r4.A01     // Catch:{ IOException -> 0x010f }
            int r1 = r1 - r3
            java.lang.Character r0 = java.lang.Character.valueOf(r2)     // Catch:{ IOException -> 0x010f }
            X.C2P r2 = new X.C2P     // Catch:{ IOException -> 0x010f }
            r2.<init>(r0, r1, r3)     // Catch:{ IOException -> 0x010f }
            goto L_0x010e
        L_0x00fc:
            r0 = 0
            r4.A03 = r0
            r4.A02 = r0
            return r1
        L_0x0102:
            int r3 = r4.A01     // Catch:{ IOException -> 0x010f }
            java.lang.Character r1 = java.lang.Character.valueOf(r1)     // Catch:{ IOException -> 0x010f }
            r0 = 0
            X.C2P r2 = new X.C2P     // Catch:{ IOException -> 0x010f }
            r2.<init>(r1, r3, r0)     // Catch:{ IOException -> 0x010f }
        L_0x010e:
            throw r2     // Catch:{ IOException -> 0x010f }
        L_0x010f:
            r2 = move-exception
            int r1 = r4.A01
            X.C2P r0 = new X.C2P
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28245Du6.A0D(java.lang.String, X.Clg):java.lang.Object");
    }

    public void A0E(int i, int i2) {
        while (i < i2 - 1 && Character.isWhitespace(this.A01.charAt(i))) {
            i++;
        }
        while (i2 - 1 > i && Character.isWhitespace(this.A01.charAt(i2 - 1))) {
            i2--;
        }
        this.A03 = this.A01.substring(i, i2);
    }
}
