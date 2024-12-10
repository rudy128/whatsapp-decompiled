package X;

public final class A8N {
    public double A00;
    public Integer A01;
    public final int A02;
    public final int A03;

    public static final boolean A03(double d, double d2) {
        return C108975cc.A19((Math.abs(d - d2) > 1.0E-11d ? 1 : (Math.abs(d - d2) == 1.0E-11d ? 0 : -1)));
    }

    public A8N(Integer num, int i, int i2) {
        this.A02 = i;
        this.A03 = i2;
        this.A01 = num;
        this.A00 = 0.0d;
    }

    public static final int A00(double d, double d2) {
        if (Math.abs(d - d2) < 1.0E-11d) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        if (r0 == 0.0d) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007e, code lost:
        if (A03(r0, r2) != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        if (A00(r0, r2) > 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        if (r4 >= 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        if (A00(r0, r2) < 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        if (A00(r0, r2) <= 0) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r0 == 0.0d) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a1, code lost:
        r4 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r0 == 0.0d) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00aa, code lost:
        if (r2 != 0.0d) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double A04(X.A92 r11, java.util.ArrayList r12, int r13) {
        /*
            r10 = this;
            r5 = 18
            int r4 = r10.A02
            java.lang.String r9 = "Object has operation field set to "
            r1 = 19
            r0 = -1
            int r3 = r10.A03
            if (r4 != r0) goto L_0x0026
            if (r3 != r0) goto L_0x0132
            java.lang.Integer r2 = r10.A01
            int r0 = r2.intValue()
            if (r0 == r1) goto L_0x0115
            if (r0 != r5) goto L_0x0120
            java.lang.Object r0 = X.AnonymousClass8BS.A0Z(r12, r13)
            double r0 = X.AnonymousClass8BR.A00(r0)
            r10.A00 = r0
        L_0x0023:
            double r0 = r10.A00
            return r0
        L_0x0026:
            r2 = -1
            X.A8N r0 = r11.A0C(r4)
            double r0 = r0.A04(r11, r12, r4)
            if (r3 != r2) goto L_0x0046
            java.lang.Integer r4 = r10.A01
            int r3 = r4.intValue()
            r2 = 0
            if (r3 != r2) goto L_0x0160
            r4 = 0
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0042
        L_0x0040:
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0042:
            r10.A00 = r4
            goto L_0x0117
        L_0x0046:
            X.A8N r2 = r11.A0C(r3)
            double r2 = r2.A04(r11, r12, r3)
            java.lang.Integer r8 = r10.A01
            int r7 = r8.intValue()
            java.lang.String r6 = "Division by zero found. rightValue="
            r4 = 0
            switch(r7) {
                case 1: goto L_0x009d;
                case 2: goto L_0x00a4;
                case 3: goto L_0x007a;
                case 4: goto L_0x006d;
                case 5: goto L_0x0081;
                case 6: goto L_0x0088;
                case 7: goto L_0x008f;
                case 8: goto L_0x0096;
                case 9: goto L_0x00ad;
                case 10: goto L_0x00b0;
                case 11: goto L_0x00b3;
                case 12: goto L_0x00c6;
                case 13: goto L_0x00b6;
                case 14: goto L_0x00bb;
                case 15: goto L_0x00d0;
                case 16: goto L_0x00c0;
                case 17: goto L_0x010b;
                default: goto L_0x005b;
            }
        L_0x005b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)
            java.lang.String r0 = A02(r8)
            r1.append(r0)
            java.lang.String r0 = " which is not defined for two operands!"
            X.AmV r0 = X.C21581AmV.A00(r0, r1)
            throw r0
        L_0x006d:
            double r0 = r0 - r2
            double r2 = java.lang.Math.abs(r0)
            r0 = 4442235333156365461(0x3da5fd7fe1796495, double:1.0E-11)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            goto L_0x008c
        L_0x007a:
            boolean r0 = A03(r0, r2)
            if (r0 == 0) goto L_0x00a1
            goto L_0x0040
        L_0x0081:
            int r0 = A00(r0, r2)
            if (r0 <= 0) goto L_0x00a1
            goto L_0x0040
        L_0x0088:
            int r4 = A00(r0, r2)
        L_0x008c:
            if (r4 < 0) goto L_0x00a1
            goto L_0x0040
        L_0x008f:
            int r0 = A00(r0, r2)
            if (r0 >= 0) goto L_0x00a1
            goto L_0x0040
        L_0x0096:
            int r0 = A00(r0, r2)
            if (r0 > 0) goto L_0x00a1
            goto L_0x0040
        L_0x009d:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x00a8
        L_0x00a1:
            r4 = 0
            goto L_0x0042
        L_0x00a4:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0040
        L_0x00a8:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            goto L_0x00a1
        L_0x00ad:
            double r4 = r0 + r2
            goto L_0x0042
        L_0x00b0:
            double r4 = r0 - r2
            goto L_0x0042
        L_0x00b3:
            double r4 = r0 * r2
            goto L_0x0042
        L_0x00b6:
            double r4 = java.lang.Math.min(r0, r2)
            goto L_0x0042
        L_0x00bb:
            double r4 = java.lang.Math.max(r0, r2)
            goto L_0x0042
        L_0x00c0:
            double r4 = java.lang.Math.pow(r0, r2)
            goto L_0x0042
        L_0x00c6:
            boolean r4 = A03(r2, r4)
            if (r4 != 0) goto L_0x0172
            double r4 = r0 / r2
            goto L_0x0042
        L_0x00d0:
            boolean r6 = A03(r0, r4)
            if (r6 != 0) goto L_0x01b3
            int r6 = A00(r0, r4)
            if (r6 < 0) goto L_0x01a5
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            boolean r6 = A03(r0, r6)
            if (r6 != 0) goto L_0x0197
            boolean r6 = A03(r2, r4)
            if (r6 != 0) goto L_0x0189
            int r4 = A00(r2, r4)
            if (r4 < 0) goto L_0x017b
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0107
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0107
            double r4 = java.lang.Math.log(r2)
            double r0 = java.lang.Math.log(r0)
            double r4 = r4 / r0
            goto L_0x0042
        L_0x0107:
            r4 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x0042
        L_0x010b:
            boolean r4 = A03(r2, r4)
            if (r4 != 0) goto L_0x01c1
            double r4 = r0 % r2
            goto L_0x0042
        L_0x0115:
            double r4 = r10.A00
        L_0x0117:
            java.lang.Double r0 = java.lang.Double.valueOf(r4)
            r12.set(r13, r0)
            goto L_0x0023
        L_0x0120:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)
            java.lang.String r0 = A02(r2)
            r1.append(r0)
            java.lang.String r0 = " which is not defined for zero operands!"
            X.AmV r0 = X.C21581AmV.A00(r0, r1)
            throw r0
        L_0x0132:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Object has incorrect fields, can not represent an actual operation node. leftChildIndex="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", rightChildIndex="
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = ", operation="
            r2.append(r0)
            java.lang.Integer r0 = r10.A01
            java.lang.String r0 = A02(r0)
            r2.append(r0)
            java.lang.String r0 = ", value="
            r2.append(r0)
            double r0 = r10.A00
            X.AmV r0 = A01(r2, r0)
            throw r0
        L_0x0160:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r9)
            java.lang.String r0 = A02(r4)
            r1.append(r0)
            java.lang.String r0 = " which is not defined for one operand!"
            X.AmV r0 = X.C21581AmV.A00(r0, r1)
            throw r0
        L_0x0172:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r6)
            X.AmV r0 = A01(r0, r2)
            throw r0
        L_0x017b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "x of log is negative. rightValue="
            r1.append(r0)
            X.AmV r0 = A01(r1, r2)
            throw r0
        L_0x0189:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "x of log is zero. rightValue="
            r1.append(r0)
            X.AmV r0 = A01(r1, r2)
            throw r0
        L_0x0197:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Base of log is one. leftValue="
            r3.append(r2)
            X.AmV r0 = A01(r3, r0)
            throw r0
        L_0x01a5:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Base of log is negative. leftValue="
            r3.append(r2)
            X.AmV r0 = A01(r3, r0)
            throw r0
        L_0x01b3:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "Base of log is zero. leftValue="
            r3.append(r2)
            X.AmV r0 = A01(r3, r0)
            throw r0
        L_0x01c1:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A11(r6)
            X.AmV r0 = A01(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A8N.A04(X.A92, java.util.ArrayList, int):double");
    }

    public static C21581AmV A01(StringBuilder sb, double d) {
        sb.append(d);
        return new C21581AmV(sb.toString());
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "NOT";
            case 1:
                return "AND";
            case 2:
                return "OR";
            case 3:
                return "EQ";
            case 4:
                return "NE";
            case 5:
                return "GT";
            case 6:
                return "GE";
            case 7:
                return "LT";
            case 8:
                return "LE";
            case 9:
                return "ADD";
            case 10:
                return "SUB";
            case 11:
                return "MUL";
            case 12:
                return "DIV";
            case 13:
                return "MIN";
            case 14:
                return "MAX";
            case 15:
                return "LOG";
            case 16:
                return "POW";
            case 17:
                return "MOD";
            case 18:
                return "VALUE";
            default:
                return "CONSTANT";
        }
    }

    public A8N(double d) {
        Integer num = AnonymousClass00R.A0B;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = num;
        this.A00 = d;
    }

    public A8N(int i, Integer num) {
        this.A02 = i;
        this.A03 = -1;
        this.A01 = num;
        this.A00 = 0.0d;
    }

    public A8N() {
        Integer num = AnonymousClass00R.A0A;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = num;
        this.A00 = 0.0d;
    }
}
