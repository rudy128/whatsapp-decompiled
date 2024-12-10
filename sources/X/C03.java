package X;

public enum C03 {
    ;
    
    public final C24335BzW collection;
    public final Class elementType;
    public final int id;
    public final C24364Bzz javaType;
    public final boolean primitiveScalar;

    /* access modifiers changed from: public */
    static {
        for (int i = 0; i < values().length; i++) {
        }
    }

    public static C03 A00(C24335BzW bzW, C24364Bzz bzz, String str, int i) {
        return new C03(bzW, bzz, str, i, i);
    }

    /* access modifiers changed from: public */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        r1 = r8.ordinal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C03(java.lang.String r9, int r10, int r11) {
        /*
            r6 = this;
            r6.<init>(r9, r10)
            r6.id = r11
            r6.collection = r7
            r6.javaType = r8
            X.CBo r0 = X.C24610CBo.$redex_init_class
            int r5 = r7.ordinal()
            r1 = 1
            r4 = 9
            r3 = 1
            r0 = 3
            r2 = 7
            if (r5 == r0) goto L_0x0030
            if (r5 == r1) goto L_0x0030
            r0 = 0
        L_0x001a:
            r6.elementType = r0
            X.BzW r0 = X.C24335BzW.A03
            if (r7 != r0) goto L_0x002e
            int r1 = r8.ordinal()
            if (r1 == r2) goto L_0x002e
            if (r1 == r4) goto L_0x002e
            r0 = 6
            if (r1 == r0) goto L_0x002e
        L_0x002b:
            r6.primitiveScalar = r3
            return
        L_0x002e:
            r3 = 0
            goto L_0x002b
        L_0x0030:
            java.lang.Class r0 = r8.boxedType
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03.<init>(X.BzW, X.Bzz, java.lang.String, int, int):void");
    }
}
