package X;

public abstract class CB5 {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        if (r1 <= 126) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.DSN r5) {
        /*
            int r0 = r5.A01()
            java.lang.StringBuilder r4 = X.BE6.A0t(r0)
            r2 = 0
        L_0x0009:
            int r0 = r5.A01()
            if (r2 >= r0) goto L_0x0088
            r1 = r5
            X.BeL r1 = (X.C23271BeL) r1
            boolean r0 = r1 instanceof X.C23270BeK
            if (r0 == 0) goto L_0x002e
            X.BeK r1 = (X.C23270BeK) r1
            int r3 = r1.zzc
            int r0 = r2 + 1
            int r0 = r3 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x002e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            if (r2 >= 0) goto L_0x0079
            java.lang.String r0 = "Index < 0: "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r2)
            throw r0
        L_0x002e:
            byte[] r0 = r1.zza
            byte r1 = r0[r2]
            r0 = 34
            if (r1 == r0) goto L_0x0070
            r0 = 39
            if (r1 == r0) goto L_0x006d
            r0 = 92
            if (r1 == r0) goto L_0x006a
            switch(r1) {
                case 7: goto L_0x005b;
                case 8: goto L_0x005e;
                case 9: goto L_0x0061;
                case 10: goto L_0x0064;
                case 11: goto L_0x0067;
                case 12: goto L_0x0073;
                case 13: goto L_0x0058;
                default: goto L_0x0041;
            }
        L_0x0041:
            r0 = 32
            if (r1 < r0) goto L_0x0050
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto L_0x0050
        L_0x0049:
            char r0 = (char) r1
            r4.append(r0)
        L_0x004d:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0050:
            X.BEB.A1M(r4, r1)
            r0 = r1 & 7
            int r1 = r0 + 48
            goto L_0x0049
        L_0x0058:
            java.lang.String r0 = "\\r"
            goto L_0x0075
        L_0x005b:
            java.lang.String r0 = "\\a"
            goto L_0x0075
        L_0x005e:
            java.lang.String r0 = "\\b"
            goto L_0x0075
        L_0x0061:
            java.lang.String r0 = "\\t"
            goto L_0x0075
        L_0x0064:
            java.lang.String r0 = "\\n"
            goto L_0x0075
        L_0x0067:
            java.lang.String r0 = "\\v"
            goto L_0x0075
        L_0x006a:
            java.lang.String r0 = "\\\\"
            goto L_0x0075
        L_0x006d:
            java.lang.String r0 = "\\'"
            goto L_0x0075
        L_0x0070:
            java.lang.String r0 = "\\\""
            goto L_0x0075
        L_0x0073:
            java.lang.String r0 = "\\f"
        L_0x0075:
            r4.append(r0)
            goto L_0x004d
        L_0x0079:
            java.lang.String r0 = "Index > length: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r3)
            throw r0
        L_0x0088:
            java.lang.String r0 = r4.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CB5.A00(X.DSN):java.lang.String");
    }
}
