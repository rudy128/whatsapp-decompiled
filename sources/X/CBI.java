package X;

public abstract class CBI {
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0051, code lost:
        if (r1 <= 126) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(X.DSO r6) {
        /*
            int r0 = r6.A01()
            java.lang.StringBuilder r3 = X.BE6.A0t(r0)
            r2 = 0
        L_0x0009:
            int r0 = r6.A01()
            if (r2 >= r0) goto L_0x0098
            r5 = r6
            X.BhH r5 = (X.C23452BhH) r5
            boolean r0 = r5 instanceof X.C23451BhG
            if (r0 == 0) goto L_0x0030
            X.BhG r5 = (X.C23451BhG) r5
            int r4 = r5.zzd
            int r0 = r2 + 1
            int r0 = r4 - r0
            r0 = r0 | r2
            if (r0 >= 0) goto L_0x0035
            if (r2 >= 0) goto L_0x0083
            r0 = 22
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "Index < 0: "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r2)
            throw r0
        L_0x0030:
            byte[] r0 = r5.zzb
            byte r1 = r0[r2]
            goto L_0x003c
        L_0x0035:
            byte[] r1 = r5.zzb
            int r0 = r5.zzc
            int r0 = r0 + r2
            byte r1 = r1[r0]
        L_0x003c:
            r0 = 34
            if (r1 == r0) goto L_0x007a
            r0 = 39
            if (r1 == r0) goto L_0x0077
            r0 = 92
            if (r1 == r0) goto L_0x0074
            switch(r1) {
                case 7: goto L_0x0065;
                case 8: goto L_0x0068;
                case 9: goto L_0x006b;
                case 10: goto L_0x006e;
                case 11: goto L_0x0071;
                case 12: goto L_0x007d;
                case 13: goto L_0x0062;
                default: goto L_0x004b;
            }
        L_0x004b:
            r0 = 32
            if (r1 < r0) goto L_0x005a
            r0 = 126(0x7e, float:1.77E-43)
            if (r1 > r0) goto L_0x005a
        L_0x0053:
            char r0 = (char) r1
            r3.append(r0)
        L_0x0057:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x005a:
            X.BEB.A1M(r3, r1)
            r0 = r1 & 7
            int r1 = r0 + 48
            goto L_0x0053
        L_0x0062:
            java.lang.String r0 = "\\r"
            goto L_0x007f
        L_0x0065:
            java.lang.String r0 = "\\a"
            goto L_0x007f
        L_0x0068:
            java.lang.String r0 = "\\b"
            goto L_0x007f
        L_0x006b:
            java.lang.String r0 = "\\t"
            goto L_0x007f
        L_0x006e:
            java.lang.String r0 = "\\n"
            goto L_0x007f
        L_0x0071:
            java.lang.String r0 = "\\v"
            goto L_0x007f
        L_0x0074:
            java.lang.String r0 = "\\\\"
            goto L_0x007f
        L_0x0077:
            java.lang.String r0 = "\\'"
            goto L_0x007f
        L_0x007a:
            java.lang.String r0 = "\\\""
            goto L_0x007f
        L_0x007d:
            java.lang.String r0 = "\\f"
        L_0x007f:
            r3.append(r0)
            goto L_0x0057
        L_0x0083:
            r0 = 40
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "Index > length: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", "
            java.lang.ArrayIndexOutOfBoundsException r0 = X.BEA.A0Z(r0, r1, r4)
            throw r0
        L_0x0098:
            java.lang.String r0 = r3.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CBI.A00(X.DSO):java.lang.String");
    }
}
