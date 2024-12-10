package X;

/* renamed from: X.1Y7  reason: invalid class name */
public abstract class AnonymousClass1Y7 extends AnonymousClass1Y6 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(java.lang.String r13) {
        /*
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            java.lang.String r10 = ""
            java.util.List r9 = X.AnonymousClass1YF.A0P(r13)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r9.iterator()
        L_0x0013:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.AnonymousClass1YF.A0T(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0013
            r3.add(r1)
            goto L_0x0013
        L_0x002c:
            r0 = 10
            int r0 = X.C29351c6.A0C(r3, r0)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r3.iterator()
        L_0x003b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r4 = r5.next()
            java.lang.String r4 = (java.lang.String) r4
            int r3 = r4.length()
            r2 = 0
        L_0x004c:
            r1 = -1
            if (r2 >= r3) goto L_0x005d
            char r0 = r4.charAt(r2)
            boolean r0 = X.AnonymousClass1c5.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0066
            if (r2 != r1) goto L_0x005e
        L_0x005d:
            r2 = r3
        L_0x005e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.add(r0)
            goto L_0x003b
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x004c
        L_0x0069:
            java.util.Iterator r3 = r6.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x00db
            r2 = 0
        L_0x0074:
            java.lang.Number r2 = (java.lang.Number) r2
            r8 = 0
            if (r2 == 0) goto L_0x00d9
            int r7 = r2.intValue()
        L_0x007d:
            int r6 = r13.length()
            int r1 = r10.length()
            int r0 = r9.size()
            int r0 = r0 * r1
            int r6 = r6 + r0
            if (r1 != 0) goto L_0x00d3
            X.1c7 r5 = X.AnonymousClass1c7.A00
        L_0x008f:
            X.1Di r5 = (X.C22821Di) r5
            int r0 = r9.size()
            int r4 = r0 + -1
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r3 = r9.iterator()
        L_0x00a0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r2 = r3.next()
            int r1 = r8 + 1
            if (r8 >= 0) goto L_0x00b3
            X.AnonymousClass1ZU.A0B()
            r0 = 0
            throw r0
        L_0x00b3:
            java.lang.String r2 = (java.lang.String) r2
            if (r8 == 0) goto L_0x00b9
            if (r8 != r4) goto L_0x00c1
        L_0x00b9:
            boolean r0 = X.AnonymousClass1YF.A0T(r2)
            if (r0 == 0) goto L_0x00c1
        L_0x00bf:
            r8 = r1
            goto L_0x00a0
        L_0x00c1:
            java.lang.String r0 = X.C29361c9.A0D(r2, r7)
            java.lang.Object r0 = r5.invoke(r0)
            if (r0 != 0) goto L_0x00d1
            if (r2 == 0) goto L_0x00bf
        L_0x00cd:
            r12.add(r2)
            goto L_0x00bf
        L_0x00d1:
            r2 = r0
            goto L_0x00cd
        L_0x00d3:
            X.3IW r5 = new X.3IW
            r5.<init>()
            goto L_0x008f
        L_0x00d9:
            r7 = 0
            goto L_0x007d
        L_0x00db:
            java.lang.Object r2 = r3.next()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
        L_0x00e1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r1 = r3.next()
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            int r0 = r2.compareTo(r1)
            if (r0 <= 0) goto L_0x00e1
            r2 = r1
            goto L_0x00e1
        L_0x00f5:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r6)
            java.lang.String r9 = "\n"
            r13 = 0
            r11 = r10
            X.C29431cG.A16(r8, r9, r10, r11, r12, r13)
            java.lang.String r0 = r8.toString()
            X.C18070vi.A0X(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Y7.A01(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(java.lang.String r14) {
        /*
            java.lang.String r6 = "|"
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            java.lang.String r11 = ""
            boolean r0 = X.AnonymousClass1YF.A0T(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00aa
            java.util.List r2 = X.AnonymousClass1YF.A0P(r14)
            int r5 = r14.length()
            int r1 = r11.length()
            int r0 = r2.size()
            int r0 = r0 * r1
            int r5 = r5 + r0
            if (r1 != 0) goto L_0x0090
            X.1c7 r7 = X.AnonymousClass1c7.A00
        L_0x0027:
            X.1Di r7 = (X.C22821Di) r7
            int r0 = r2.size()
            int r4 = r0 + -1
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r10 = r2.iterator()
            r1 = 0
        L_0x0039:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r3 = r10.next()
            int r9 = r1 + 1
            if (r1 >= 0) goto L_0x004c
            X.AnonymousClass1ZU.A0B()
            r1 = 0
            throw r1
        L_0x004c:
            java.lang.String r3 = (java.lang.String) r3
            if (r1 == 0) goto L_0x0052
            if (r1 != r4) goto L_0x005a
        L_0x0052:
            boolean r0 = X.AnonymousClass1YF.A0T(r3)
            if (r0 == 0) goto L_0x005a
        L_0x0058:
            r1 = r9
            goto L_0x0039
        L_0x005a:
            int r8 = r3.length()
            r2 = 0
        L_0x005f:
            r1 = -1
            if (r2 >= r8) goto L_0x0089
            char r0 = r3.charAt(r2)
            boolean r0 = X.AnonymousClass1c5.A00(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008d
            if (r2 == r1) goto L_0x0089
            boolean r0 = r3.startsWith(r6, r2)
            if (r0 == 0) goto L_0x0089
            int r0 = r6.length()
            int r2 = r2 + r0
            java.lang.String r0 = r3.substring(r2)
            X.C18070vi.A0X(r0)
            java.lang.Object r0 = r7.invoke(r0)
            if (r0 == 0) goto L_0x0089
            r3 = r0
        L_0x0089:
            r13.add(r3)
            goto L_0x0058
        L_0x008d:
            int r2 = r2 + 1
            goto L_0x005f
        L_0x0090:
            X.3IW r7 = new X.3IW
            r7.<init>()
            goto L_0x0027
        L_0x0096:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r5)
            java.lang.String r10 = "\n"
            r14 = 0
            r12 = r11
            X.C29431cG.A16(r9, r10, r11, r12, r13, r14)
            java.lang.String r0 = r9.toString()
            X.C18070vi.A0X(r0)
            return r0
        L_0x00aa:
            java.lang.String r0 = "marginPrefix must be non-blank string."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Y7.A02(java.lang.String):java.lang.String");
    }
}
