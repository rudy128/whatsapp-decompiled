package X;

/* renamed from: X.2p1  reason: invalid class name and case insensitive filesystem */
public abstract class C61042p1 {
    public static final C60672oQ A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.2oQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.2oQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.2oQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: X.2oQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.2oQ} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r1 = 0
            java.lang.String r0 = "kotlin.reflect.jvm.internal.ReflectionFactoryImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            java.lang.Object r0 = r0.newInstance()     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            X.2oQ r0 = (X.C60672oQ) r0     // Catch:{ ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException -> 0x000e }
            r1 = r0
        L_0x000e:
            if (r1 != 0) goto L_0x0015
            X.2oQ r1 = new X.2oQ
            r1.<init>()
        L_0x0015:
            A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61042p1.<clinit>():void");
    }

    public static AnonymousClass20F A00(Class cls) {
        return new AnonymousClass20F(cls);
    }
}
