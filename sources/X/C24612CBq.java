package X;

/* renamed from: X.CBq  reason: case insensitive filesystem */
public abstract class C24612CBq {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        if (r1 <= 126) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.DSQ r6) {
        /*
            int r0 = r6.A02()
            java.lang.StringBuilder r3 = X.BE6.A0t(r0)
            r2 = 0
        L_0x0009:
            int r0 = r6.A02()
            if (r2 >= r0) goto L_0x0090
            r5 = r6
            X.BmB r5 = (X.C23581BmB) r5
            boolean r0 = r5 instanceof X.C23580BmA
            if (r0 == 0) goto L_0x002e
            X.BmA r5 = (X.C23580BmA) r5
            int r4 = r5.bytesLength
            int r0 = r2 + 1
            int r0 = r4 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x0033
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r2 >= 0) goto L_0x0081
            java.lang.String r0 = "Index < 0: "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r2)
            throw r0
        L_0x002e:
            byte[] r0 = r5.bytes
            byte r1 = r0[r2]
            goto L_0x003a
        L_0x0033:
            byte[] r1 = r5.bytes
            int r0 = r5.bytesOffset
            int r0 = r0 + r2
            byte r1 = r1[r0]
        L_0x003a:
            r0 = 34
            if (r1 == r0) goto L_0x0078
            r0 = 39
            if (r1 == r0) goto L_0x0075
            r0 = 92
            if (r1 == r0) goto L_0x0072
            switch(r1) {
                case 7: goto L_0x0060;
                case 8: goto L_0x007b;
                case 9: goto L_0x006f;
                case 10: goto L_0x006c;
                case 11: goto L_0x0069;
                case 12: goto L_0x0066;
                case 13: goto L_0x0063;
                default: goto L_0x0049;
            }
        L_0x0049:
            r0 = 32
            if (r1 < r0) goto L_0x0058
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto L_0x0058
        L_0x0051:
            char r0 = (char) r1
            r3.append(r0)
        L_0x0055:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0058:
            X.BEB.A1M(r3, r1)
            r0 = r1 & 7
            int r1 = r0 + 48
            goto L_0x0051
        L_0x0060:
            java.lang.String r0 = "\\a"
            goto L_0x007d
        L_0x0063:
            java.lang.String r0 = "\\r"
            goto L_0x007d
        L_0x0066:
            java.lang.String r0 = "\\f"
            goto L_0x007d
        L_0x0069:
            java.lang.String r0 = "\\v"
            goto L_0x007d
        L_0x006c:
            java.lang.String r0 = "\\n"
            goto L_0x007d
        L_0x006f:
            java.lang.String r0 = "\\t"
            goto L_0x007d
        L_0x0072:
            java.lang.String r0 = "\\\\"
            goto L_0x007d
        L_0x0075:
            java.lang.String r0 = "\\'"
            goto L_0x007d
        L_0x0078:
            java.lang.String r0 = "\\\""
            goto L_0x007d
        L_0x007b:
            java.lang.String r0 = "\\b"
        L_0x007d:
            r3.append(r0)
            goto L_0x0055
        L_0x0081:
            java.lang.String r0 = "Index > length: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r4)
            throw r0
        L_0x0090:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24612CBq.A00(X.DSQ):java.lang.String");
    }
}
