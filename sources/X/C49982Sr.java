package X;

/* renamed from: X.2Sr  reason: invalid class name and case insensitive filesystem */
public abstract class C49982Sr {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r12 == 4) goto L_0x004e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047 A[Catch:{ Exception -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0069 A[Catch:{ Exception -> 0x0075 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C60022nG A00(java.lang.String r13) {
        /*
            r6 = 0
            if (r13 == 0) goto L_0x008b
            java.lang.String r1 = "\\."
            X.1wr r0 = new X.1wr     // Catch:{ Exception -> 0x0075 }
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x0075 }
            r11 = 0
            java.util.List r2 = r0.A01(r13, r11)     // Catch:{ Exception -> 0x0075 }
            boolean r0 = r2.isEmpty()     // Catch:{ Exception -> 0x0075 }
            r5 = 1
            if (r0 != 0) goto L_0x0048
            int r0 = r2.size()     // Catch:{ Exception -> 0x0075 }
            java.util.ListIterator r1 = r2.listIterator(r0)     // Catch:{ Exception -> 0x0075 }
        L_0x001e:
            boolean r0 = r1.hasPrevious()     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = r1.previous()     // Catch:{ Exception -> 0x0075 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x0075 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0075 }
            if (r0 == 0) goto L_0x001e
            int r0 = r1.nextIndex()     // Catch:{ Exception -> 0x0075 }
            int r0 = r0 + 1
            java.util.List r1 = X.C29431cG.A0v(r2, r0)     // Catch:{ Exception -> 0x0075 }
        L_0x003a:
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ Exception -> 0x0075 }
            java.lang.Object[] r4 = r1.toArray(r0)     // Catch:{ Exception -> 0x0075 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ Exception -> 0x0075 }
            int r12 = r4.length     // Catch:{ Exception -> 0x0075 }
            r3 = 4
            r2 = 3
            if (r12 == r2) goto L_0x004e
            goto L_0x004b
        L_0x0048:
            X.0wS r1 = X.C18460wS.A00     // Catch:{ Exception -> 0x0075 }
            goto L_0x003a
        L_0x004b:
            r1 = 0
            if (r12 != r3) goto L_0x004f
        L_0x004e:
            r1 = 1
        L_0x004f:
            java.lang.String r0 = "Version name must have 3 or 4 parts"
            X.C17960vV.A0G(r1, r0)     // Catch:{ Exception -> 0x0075 }
            r0 = r4[r11]     // Catch:{ Exception -> 0x0075 }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0075 }
            r0 = r4[r5]     // Catch:{ Exception -> 0x0075 }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0075 }
            r0 = 2
            r0 = r4[r0]     // Catch:{ Exception -> 0x0075 }
            int r10 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0075 }
            if (r12 != r3) goto L_0x006f
            r0 = r4[r2]     // Catch:{ Exception -> 0x0075 }
            int r11 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x0075 }
        L_0x006f:
            X.2nG r7 = new X.2nG     // Catch:{ Exception -> 0x0075 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x0075 }
            return r7
        L_0x0075:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "version/parse ["
            r1.append(r0)
            r1.append(r13)
            r0 = 93
            r1.append(r0)
            X.C17880vN.A1M(r1, r2)
        L_0x008b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49982Sr.A00(java.lang.String):X.2nG");
    }
}
