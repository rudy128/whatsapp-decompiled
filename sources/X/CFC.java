package X;

public abstract class CFC {
    public static final C3o A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: X.BhB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: X.BhB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.BhB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.BhB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v24, resolved type: X.BhB} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r2 = 0
            java.lang.String r0 = "android.os.Build$VERSION"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0023 }
            java.lang.String r0 = "SDK_INT"
            java.lang.reflect.Field r0 = r1.getField(r0)     // Catch:{ Exception -> 0x0023 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ Exception -> 0x0023 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0023 }
            if (r0 == 0) goto L_0x002e
            int r1 = r0.intValue()     // Catch:{ all -> 0x0044 }
            r0 = 19
            if (r1 < r0) goto L_0x002e
            X.BhA r0 = new X.BhA     // Catch:{ all -> 0x0044 }
            r0.<init>()     // Catch:{ all -> 0x0044 }
            goto L_0x0070
        L_0x0023:
            r2 = move-exception
            java.io.PrintStream r1 = java.lang.System.err     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception."
            r1.println(r0)     // Catch:{ all -> 0x0044 }
            r2.printStackTrace(r1)     // Catch:{ all -> 0x0044 }
        L_0x002e:
            java.lang.String r0 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic"
            boolean r0 = java.lang.Boolean.getBoolean(r0)     // Catch:{ all -> 0x0044 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003e
            X.BhB r0 = new X.BhB     // Catch:{ all -> 0x0044 }
            r0.<init>()     // Catch:{ all -> 0x0044 }
            goto L_0x0070
        L_0x003e:
            X.Bh9 r0 = new X.Bh9     // Catch:{ all -> 0x0044 }
            r0.<init>()     // Catch:{ all -> 0x0044 }
            goto L_0x0070
        L_0x0044:
            r4 = move-exception
            java.io.PrintStream r3 = java.lang.System.err
            java.lang.Class<X.Bh9> r0 = X.C23444Bh9.class
            java.lang.String r2 = r0.getName()
            int r0 = X.BE8.A0C(r2)
            int r0 = r0 + 133
            java.lang.StringBuilder r1 = X.BE6.A0t(r0)
            java.lang.String r0 = "An error has occurred when initializing the try-with-resources desuguring strategy. The default strategy "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "will be used. The error is: "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r3.println(r0)
            r4.printStackTrace(r3)
            X.Bh9 r0 = new X.Bh9
            r0.<init>()
        L_0x0070:
            A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CFC.<clinit>():void");
    }
}
