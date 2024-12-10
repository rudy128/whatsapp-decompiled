package X;

public class DY0 implements C28547E6v {
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x00e4, code lost:
        r1 = r10.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x00ea, code lost:
        if (r1 == '+') goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x00ec, code lost:
        if (r1 != '-') goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x00ee, code lost:
        r2 = r2 + 1;
        r10.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x00f3, code lost:
        if (r2 != r3) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x00f5, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x00f6, code lost:
        if (r2 >= r3) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x00f8, code lost:
        r0 = r10.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x00fc, code lost:
        if (r0 < '0') goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x00fe, code lost:
        if (r0 > '9') goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0100, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0103, code lost:
        if (r2 != r3) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0105, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00b4, code lost:
        if (r1 == '-') goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00c8, code lost:
        if (r1 == '.') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x00ca, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00cc, code lost:
        if (r2 >= r3) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x00ce, code lost:
        r1 = r10.charAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x00d2, code lost:
        if (r1 < '0') goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x00d4, code lost:
        if (r1 <= '9') goto L_0x00ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x00d6, code lost:
        if (r2 == r3) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x00da, code lost:
        if (r1 == 'E') goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x00de, code lost:
        if (r1 != 'e') goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x00e0, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x00e2, code lost:
        if (r2 == r3) goto L_0x0106;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bk7(java.lang.String r10) {
        /*
            r9 = this;
            r4 = 0
            if (r10 == 0) goto L_0x0106
            int r3 = r10.length()
            r8 = 1
            if (r3 == 0) goto L_0x004a
            java.lang.String r0 = r10.trim()
            if (r0 != r10) goto L_0x004a
            char r1 = r10.charAt(r4)
            r0 = 123(0x7b, float:1.72E-43)
            if (r1 == r0) goto L_0x004a
            r0 = 91
            if (r1 == r0) goto L_0x004a
            r0 = 44
            if (r1 == r0) goto L_0x004a
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L_0x004a
            r0 = 93
            if (r1 == r0) goto L_0x004a
            r0 = 58
            if (r1 == r0) goto L_0x004a
            r0 = 39
            if (r1 == r0) goto L_0x004a
            r0 = 34
            if (r1 == r0) goto L_0x004a
            if (r1 < 0) goto L_0x004b
            r0 = 31
            if (r1 <= r0) goto L_0x004a
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 < r0) goto L_0x004b
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L_0x004a
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r0) goto L_0x004b
            r0 = 8447(0x20ff, float:1.1837E-41)
            if (r1 > r0) goto L_0x004b
        L_0x004a:
            return r8
        L_0x004b:
            r2 = 1
        L_0x004c:
            if (r2 >= r3) goto L_0x007c
            char r1 = r10.charAt(r2)
            r0 = 125(0x7d, float:1.75E-43)
            if (r1 == r0) goto L_0x004a
            r0 = 93
            if (r1 == r0) goto L_0x004a
            r0 = 44
            if (r1 == r0) goto L_0x004a
            r0 = 58
            if (r1 == r0) goto L_0x004a
            if (r1 < 0) goto L_0x0079
            r0 = 31
            if (r1 <= r0) goto L_0x004a
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 < r0) goto L_0x0079
            r0 = 159(0x9f, float:2.23E-43)
            if (r1 <= r0) goto L_0x004a
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r1 < r0) goto L_0x0079
            r0 = 8447(0x20ff, float:1.1837E-41)
            if (r1 > r0) goto L_0x0079
            return r8
        L_0x0079:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x007c:
            r0 = 3
            if (r3 < r0) goto L_0x00a5
            char r1 = r10.charAt(r4)
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 != r0) goto L_0x0090
            java.lang.String r0 = "null"
        L_0x0089:
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x00a5
            return r8
        L_0x0090:
            r0 = 116(0x74, float:1.63E-43)
            if (r1 != r0) goto L_0x0097
            java.lang.String r0 = "true"
            goto L_0x0089
        L_0x0097:
            r0 = 102(0x66, float:1.43E-43)
            if (r1 != r0) goto L_0x009e
            java.lang.String r0 = "false"
            goto L_0x0089
        L_0x009e:
            r0 = 78
            if (r1 != r0) goto L_0x00a5
            java.lang.String r0 = "NaN"
            goto L_0x0089
        L_0x00a5:
            char r1 = r10.charAt(r4)
            r7 = 45
            r6 = 57
            r5 = 48
            if (r1 < r5) goto L_0x00b4
            if (r1 <= r6) goto L_0x00b6
            return r4
        L_0x00b4:
            if (r1 != r7) goto L_0x0106
        L_0x00b6:
            r2 = 1
        L_0x00b7:
            if (r2 >= r3) goto L_0x00c4
            char r1 = r10.charAt(r2)
            if (r1 < r5) goto L_0x00c4
            if (r1 > r6) goto L_0x00c4
            int r2 = r2 + 1
            goto L_0x00b7
        L_0x00c4:
            if (r2 == r3) goto L_0x004a
            r0 = 46
            if (r1 != r0) goto L_0x00cc
        L_0x00ca:
            int r2 = r2 + 1
        L_0x00cc:
            if (r2 >= r3) goto L_0x00d6
            char r1 = r10.charAt(r2)
            if (r1 < r5) goto L_0x00d6
            if (r1 <= r6) goto L_0x00ca
        L_0x00d6:
            if (r2 == r3) goto L_0x004a
            r0 = 69
            if (r1 == r0) goto L_0x00e0
            r0 = 101(0x65, float:1.42E-43)
            if (r1 != r0) goto L_0x00f3
        L_0x00e0:
            int r2 = r2 + 1
            if (r2 == r3) goto L_0x0106
            char r1 = r10.charAt(r2)
            r0 = 43
            if (r1 == r0) goto L_0x00ee
            if (r1 != r7) goto L_0x00f3
        L_0x00ee:
            int r2 = r2 + 1
            r10.charAt(r2)
        L_0x00f3:
            if (r2 != r3) goto L_0x00f6
            return r4
        L_0x00f6:
            if (r2 >= r3) goto L_0x0103
            char r0 = r10.charAt(r2)
            if (r0 < r5) goto L_0x0103
            if (r0 > r6) goto L_0x0103
            int r2 = r2 + 1
            goto L_0x00f6
        L_0x0103:
            if (r2 != r3) goto L_0x0106
            return r8
        L_0x0106:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DY0.Bk7(java.lang.String):boolean");
    }
}
