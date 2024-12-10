package X;

/* renamed from: X.70h  reason: invalid class name and case insensitive filesystem */
public final class C1401870h {
    public static final int A00(int i) {
        if (i != -1) {
            switch (i) {
                case 127995:
                    return 2131889732;
                case 127996:
                    return 2131889735;
                case 127997:
                    return 2131889733;
                case 127998:
                    return 2131889734;
                case 127999:
                    return 2131889731;
                default:
                    throw AnonymousClass001.A13("Invalid skin tone: ", AnonymousClass000.A10(), i);
            }
        } else {
            throw AnonymousClass001.A13("Invalid skin tone: ", AnonymousClass000.A10(), i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        if (r9 == -1) goto L_0x0008;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A01(android.content.Context r6, int[] r7, int r8, int r9) {
        /*
            r5 = 0
            r4 = 1
            r1 = -1
            if (r8 == r1) goto L_0x0008
            r0 = 0
            if (r9 != r1) goto L_0x0009
        L_0x0008:
            r0 = 1
        L_0x0009:
            X.C17960vV.A0D(r0)
            java.lang.String r3 = X.C137176v2.A01(r7)
            r0 = 2
            if (r8 == r1) goto L_0x002a
            r2 = 2131889736(0x7f120e48, float:1.9414144E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            int r0 = A00(r8)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r0 = X.C17880vN.A0q(r6, r0, r1, r4, r2)
        L_0x0026:
            X.C18070vi.A0X(r0)
            return r0
        L_0x002a:
            if (r9 == r1) goto L_0x0043
            r2 = 2131889737(0x7f120e49, float:1.9414146E38)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            int r0 = A00(r9)
            java.lang.String r0 = r6.getString(r0)
            java.lang.String r0 = X.C17880vN.A0q(r6, r0, r1, r4, r2)
            X.C18070vi.A0b(r0)
            return r0
        L_0x0043:
            r0 = 2131889738(0x7f120e4a, float:1.9414148E38)
            java.lang.String r0 = r6.getString(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1401870h.A01(android.content.Context, int[], int, int):java.lang.String");
    }
}
