package X;

/* renamed from: X.6Xn  reason: invalid class name and case insensitive filesystem */
public abstract class C124226Xn {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0080, code lost:
        if (r0 != false) goto L_0x0082;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C139866zZ A00(X.C29621ca r7) {
        /*
            java.lang.String r0 = "tos"
            X.1ca r4 = r7.A0K(r0)
            if (r4 != 0) goto L_0x0013
            r2 = 864000000(0x337f9800, double:4.26872718E-315)
            X.0wS r1 = X.C18460wS.A00
            X.6zZ r0 = new X.6zZ
            r0.<init>(r1, r2)
            return r0
        L_0x0013:
            java.lang.String r0 = "refresh"
            java.lang.String r0 = X.C29621ca.A02(r4, r0)     // Catch:{ all -> 0x002c }
            if (r0 != 0) goto L_0x001d
            java.lang.String r0 = ""
        L_0x001d:
            long r1 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x002c }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x002c }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x002c }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x002c }
            goto L_0x0031
        L_0x002c:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x0031:
            r0 = 864000000(0x337f9800, double:4.26872718E-315)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x003d
            r2 = r1
        L_0x003d:
            long r2 = X.C17880vN.A05(r2)
            java.lang.String r0 = "notice"
            java.util.List r0 = r4.A0R(r0)
            java.util.ArrayList r7 = X.C108965cb.A0t(r0)
            java.util.Iterator r6 = r0.iterator()
        L_0x004f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r5 = r6.next()
            X.1ca r5 = (X.C29621ca) r5
            X.C18070vi.A0b(r5)
            java.lang.String r0 = "id"
            r1 = 0
            java.lang.String r4 = r5.A0Q(r0, r1)
            if (r4 == 0) goto L_0x004f
            boolean r0 = X.AnonymousClass1YF.A0T(r4)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "state"
            java.lang.String r1 = r5.A0Q(r0, r1)
            if (r1 == 0) goto L_0x0082
            boolean r0 = X.AnonymousClass1YF.A0T(r1)
            if (r0 != 0) goto L_0x0082
            boolean r0 = java.lang.Boolean.parseBoolean(r1)
            r1 = 2
            if (r0 == 0) goto L_0x0083
        L_0x0082:
            r1 = 1
        L_0x0083:
            X.6rV r0 = new X.6rV
            r0.<init>(r4, r1)
            r7.add(r0)
            goto L_0x004f
        L_0x008c:
            X.6zZ r0 = new X.6zZ
            r0.<init>(r7, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C124226Xn.A00(X.1ca):X.6zZ");
    }
}
