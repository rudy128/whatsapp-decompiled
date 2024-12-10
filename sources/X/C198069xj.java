package X;

/* renamed from: X.9xj  reason: invalid class name and case insensitive filesystem */
public class C198069xj {
    public final Integer A00;
    public final String A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0110, code lost:
        if (r8.isEmpty() != false) goto L_0x0112;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C171618s0 r17, java.io.File r18) {
        /*
            int r0 = X.C223819r.A07
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ IOException -> 0x003a }
            r1 = r18
            r0.<init>(r1)     // Catch:{ IOException -> 0x003a }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x003a }
            r2.<init>(r0)     // Catch:{ IOException -> 0x003a }
            r2.readLine()     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0030 }
        L_0x001a:
            if (r1 == 0) goto L_0x002c
            java.lang.String r0 = "\u0000"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x002c
            r8.addFirst(r1)     // Catch:{ all -> 0x0030 }
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0030 }
            goto L_0x001a
        L_0x002c:
            r2.close()     // Catch:{ IOException -> 0x003a }
            goto L_0x003a
        L_0x0030:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x003a }
        L_0x0039:
            throw r1     // Catch:{ IOException -> 0x003a }
        L_0x003a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.util.Iterator r16 = r8.iterator()
            r15 = 0
            r4 = 0
            r11 = r4
            r6 = r4
            r3 = r4
            r14 = 0
        L_0x0049:
            boolean r0 = r16.hasNext()
            java.lang.String r2 = "Calling"
            java.lang.String r7 = "App"
            if (r0 == 0) goto L_0x00ec
            java.lang.Object r13 = r16.next()
            java.lang.String r13 = (java.lang.String) r13
            r12 = 1
            if (r4 != 0) goto L_0x0065
            java.lang.String r0 = "AppInit End"
            boolean r0 = X.C42171xk.A00(r13, r0)
            if (r0 == 0) goto L_0x0065
            r15 = 1
        L_0x0065:
            java.lang.String r0 = "Calling End"
            boolean r0 = X.C42171xk.A00(r13, r0)
            if (r0 == 0) goto L_0x0077
            if (r4 != 0) goto L_0x0076
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x0076
            r4 = r11
        L_0x0076:
            r14 = 1
        L_0x0077:
            java.lang.String r0 = "Calling Resume"
            boolean r0 = X.C42171xk.A00(r13, r0)
            if (r0 == 0) goto L_0x0087
            if (r6 != 0) goto L_0x0087
            r0 = r14 ^ 1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
        L_0x0087:
            if (r4 != 0) goto L_0x00ce
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            r10 = 0
            if (r0 != 0) goto L_0x00c1
            java.lang.String r0 = " backgrounded"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = " Resume"
            boolean r0 = r13.endsWith(r0)
            if (r0 != 0) goto L_0x00a8
            java.lang.String r0 = " visible"
            boolean r0 = r13.endsWith(r0)
            if (r0 == 0) goto L_0x00c1
        L_0x00a8:
            java.lang.String r9 = r13.trim()
            java.lang.String r1 = " "
            r0 = 2
            java.lang.String[] r9 = r9.split(r1, r0)
            int r0 = r9.length
            if (r0 <= r12) goto L_0x00c1
            r1 = 0
            r0 = r9[r1]
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00c1
            r10 = r9[r1]
        L_0x00c1:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L_0x00ce
            boolean r0 = r7.equals(r10)
            if (r0 == 0) goto L_0x00d8
            r11 = r10
        L_0x00ce:
            r5.append(r13)
            java.lang.String r0 = ":"
            r5.append(r0)
            goto L_0x0049
        L_0x00d8:
            boolean r0 = r7.equals(r11)
            if (r0 == 0) goto L_0x00e7
            boolean r0 = r2.equals(r10)
            if (r0 != 0) goto L_0x00e5
            r10 = r11
        L_0x00e5:
            r4 = r10
            goto L_0x00ce
        L_0x00e7:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            goto L_0x00e5
        L_0x00ec:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00f9
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x00f9
            r4 = r11
        L_0x00f9:
            boolean r0 = r7.equals(r11)
            r1 = 2
            if (r0 == 0) goto L_0x0104
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x0104:
            java.lang.String r0 = "AppInit"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0141
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0117
        L_0x0112:
            r0 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x0117:
            boolean r0 = r7.equals(r4)
            if (r0 == 0) goto L_0x013f
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x013f
        L_0x0125:
            java.lang.String r0 = r5.toString()
            X.9xj r1 = new X.9xj
            r1.<init>(r3, r0, r2)
            java.lang.String r0 = r1.A02
            r2 = r17
            r2.A05 = r0
            java.lang.String r0 = r1.A01
            r2.A0A = r0
            java.lang.Integer r0 = r1.A00
            r2.A00 = r0
            r2.A01 = r0
            return
        L_0x013f:
            r2 = r4
            goto L_0x0125
        L_0x0141:
            if (r15 == 0) goto L_0x0112
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r4 = r7
            goto L_0x0117
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C198069xj.A00(X.8s0, java.io.File):void");
    }

    public C198069xj(Integer num, String str, String str2) {
        this.A02 = str;
        this.A01 = str2;
        this.A00 = num;
    }
}
