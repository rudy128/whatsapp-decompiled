package X;

/* renamed from: X.1IN  reason: invalid class name */
public abstract class AnonymousClass1IN {
    public static final AnonymousClass1IR A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0105, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        X.C25359CeJ.A01(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x010e, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0111, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0182, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r7 = X.C29431cG.A0t(java.util.ServiceLoader.load(r6, r5));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:82:0x0183 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0116 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008f A[Catch:{ all -> 0x0183 }] */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch:{ SecurityException -> 0x000b }
            if (r0 == 0) goto L_0x000b
            java.lang.Boolean.parseBoolean(r0)
        L_0x000b:
            r2 = 0
            java.lang.Class<kotlinx.coroutines.android.AndroidDispatcherFactory> r6 = kotlinx.coroutines.android.AndroidDispatcherFactory.class
            r0 = 2
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x005c }
            r7.<init>(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "kotlinx.coroutines.android.AndroidDispatcherFactory"
            r3 = 0
            r5 = 1
            r4 = 0
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0038 }
            java.lang.Class r1 = java.lang.Class.forName(r1, r5, r0)     // Catch:{ ClassNotFoundException -> 0x0038 }
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0038 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0038 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0038 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0038 }
            java.lang.Object r0 = r6.cast(r0)     // Catch:{ ClassNotFoundException -> 0x0038 }
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch:{ ClassNotFoundException -> 0x0038 }
            if (r0 == 0) goto L_0x0038
            r7.add(r0)     // Catch:{ all -> 0x005c }
        L_0x0038:
            java.lang.String r1 = "kotlinx.coroutines.test.internal.TestMainDispatcherFactory"
            java.lang.ClassLoader r0 = r6.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Class r1 = java.lang.Class.forName(r1, r5, r0)     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r0)     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Object r0 = r6.cast(r0)     // Catch:{ ClassNotFoundException -> 0x0055 }
            kotlinx.coroutines.android.AndroidDispatcherFactory r0 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r0     // Catch:{ ClassNotFoundException -> 0x0055 }
            r3 = r0
        L_0x0055:
            if (r3 == 0) goto L_0x018b
            r7.add(r3)     // Catch:{ all -> 0x005c }
            goto L_0x018b
        L_0x005c:
            java.lang.ClassLoader r5 = r6.getClassLoader()     // Catch:{ all -> 0x01bf }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "META-INF/services/"
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r6.getName()     // Catch:{ all -> 0x0183 }
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            java.util.Enumeration r0 = r5.getResources(r0)     // Catch:{ all -> 0x0183 }
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch:{ all -> 0x0183 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0183 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0183 }
            r7.<init>()     // Catch:{ all -> 0x0183 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0183 }
        L_0x0089:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x0116
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0183 }
            java.net.URL r1 = (java.net.URL) r1     // Catch:{ all -> 0x0183 }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "jar"
            r8 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r4, r0, r8)     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "jar:file:"
            java.lang.String r3 = X.AnonymousClass1YF.A0N(r4, r0, r4)     // Catch:{ all -> 0x0183 }
            r0 = 33
            int r1 = X.AnonymousClass1YF.A0C(r3, r0, r8, r8)     // Catch:{ all -> 0x0183 }
            r0 = -1
            if (r1 == r0) goto L_0x00b8
            java.lang.String r3 = r3.substring(r8, r1)     // Catch:{ all -> 0x0183 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0183 }
        L_0x00b8:
            java.lang.String r0 = "!/"
            java.lang.String r1 = X.AnonymousClass1YF.A0N(r4, r0, r4)     // Catch:{ all -> 0x0183 }
            java.util.jar.JarFile r4 = new java.util.jar.JarFile     // Catch:{ all -> 0x0183 }
            r4.<init>(r3, r8)     // Catch:{ all -> 0x0183 }
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0103 }
            r0.<init>(r1)     // Catch:{ all -> 0x0103 }
            java.io.InputStream r3 = r4.getInputStream(r0)     // Catch:{ all -> 0x0103 }
            java.lang.String r1 = "UTF-8"
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0103 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0103 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0103 }
            r3.<init>(r0)     // Catch:{ all -> 0x0103 }
            java.util.List r0 = A00(r3)     // Catch:{ all -> 0x00fc }
            r3.close()     // Catch:{ all -> 0x0103 }
            r4.close()     // Catch:{ all -> 0x0183 }
            goto L_0x00f8
        L_0x00e3:
            java.io.InputStream r1 = r1.openStream()     // Catch:{ all -> 0x0183 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0183 }
            r0.<init>(r1)     // Catch:{ all -> 0x0183 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0183 }
            r3.<init>(r0)     // Catch:{ all -> 0x0183 }
            java.util.List r0 = A00(r3)     // Catch:{ all -> 0x010f }
            r3.close()     // Catch:{ all -> 0x0183 }
        L_0x00f8:
            X.C29401cD.A0J(r0, r7)     // Catch:{ all -> 0x0183 }
            goto L_0x0089
        L_0x00fc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0103 }
            throw r0     // Catch:{ all -> 0x0103 }
        L_0x0103:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0105 }
        L_0x0105:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x010a }
            goto L_0x0182
        L_0x010a:
            r0 = move-exception
            X.C25359CeJ.A01(r3, r0)     // Catch:{ all -> 0x0183 }
            throw r3     // Catch:{ all -> 0x0183 }
        L_0x010f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0111 }
        L_0x0111:
            r1 = move-exception
            X.CDX.A00(r3, r0)     // Catch:{ all -> 0x0183 }
            goto L_0x0182
        L_0x0116:
            java.util.Set r1 = X.C29431cG.A12(r7)     // Catch:{ all -> 0x0183 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0183 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x015c
            r0 = 10
            int r0 = X.C29351c6.A0C(r1, r0)     // Catch:{ all -> 0x0183 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0183 }
            r7.<init>(r0)     // Catch:{ all -> 0x0183 }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x0183 }
        L_0x0131:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x018b
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x0183 }
            r4 = 0
            java.lang.Class r3 = java.lang.Class.forName(r0, r4, r5)     // Catch:{ all -> 0x0183 }
            boolean r0 = r6.isAssignableFrom(r3)     // Catch:{ all -> 0x0183 }
            if (r0 == 0) goto L_0x0164
            java.lang.Class[] r0 = new java.lang.Class[r4]     // Catch:{ all -> 0x0183 }
            java.lang.reflect.Constructor r1 = r3.getDeclaredConstructor(r0)     // Catch:{ all -> 0x0183 }
            java.lang.Object[] r0 = new java.lang.Object[r4]     // Catch:{ all -> 0x0183 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ all -> 0x0183 }
            java.lang.Object r0 = r6.cast(r0)     // Catch:{ all -> 0x0183 }
            r7.add(r0)     // Catch:{ all -> 0x0183 }
            goto L_0x0131
        L_0x015c:
            java.lang.String r0 = "No providers were loaded with FastServiceLoader"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0183 }
            r1.<init>(r0)     // Catch:{ all -> 0x0183 }
            goto L_0x0182
        L_0x0164:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0183 }
            r1.<init>()     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = "Expected service of class "
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            r1.append(r6)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = ", but found "
            r1.append(r0)     // Catch:{ all -> 0x0183 }
            r1.append(r3)     // Catch:{ all -> 0x0183 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0183 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0183 }
            r1.<init>(r0)     // Catch:{ all -> 0x0183 }
        L_0x0182:
            throw r1     // Catch:{ all -> 0x0183 }
        L_0x0183:
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r6, r5)     // Catch:{ all -> 0x01bf }
            java.util.List r7 = X.C29431cG.A0t(r0)     // Catch:{ all -> 0x01bf }
        L_0x018b:
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x01bf }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 == 0) goto L_0x019f
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x01bf }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x01a4
        L_0x019f:
            kotlinx.coroutines.android.AndroidDispatcherFactory r2 = (kotlinx.coroutines.android.AndroidDispatcherFactory) r2     // Catch:{ all -> 0x01bf }
            if (r2 == 0) goto L_0x01b7
            goto L_0x01ae
        L_0x01a4:
            r1.next()     // Catch:{ all -> 0x01bf }
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x01bf }
            if (r0 != 0) goto L_0x01a4
            goto L_0x019f
        L_0x01ae:
            X.1IR r0 = r2.createDispatcher(r7)     // Catch:{ all -> 0x01b5 }
            A00 = r0
            return
        L_0x01b5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01b7:
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x01bf }
            r0.<init>(r1)     // Catch:{ all -> 0x01bf }
            throw r0     // Catch:{ all -> 0x01bf }
        L_0x01bf:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IN.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0057, code lost:
        if (r0 <= 0) goto L_0x0005;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0059, code lost:
        r4.add(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A00(java.io.BufferedReader r5) {
        /*
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
        L_0x0005:
            java.lang.String r2 = r5.readLine()
            if (r2 != 0) goto L_0x0010
            java.util.List r0 = X.C29431cG.A0t(r4)
            return r0
        L_0x0010:
            java.lang.String r0 = "#"
            r3 = 0
            int r1 = X.AnonymousClass1YF.A0F(r2, r0, r3, r3)
            r0 = -1
            if (r1 == r0) goto L_0x0021
            java.lang.String r2 = r2.substring(r3, r1)
            X.C18070vi.A0X(r2)
        L_0x0021:
            java.lang.CharSequence r0 = X.AnonymousClass1YF.A0G(r2)
            java.lang.String r2 = r0.toString()
        L_0x0029:
            int r0 = r2.length()
            if (r3 >= r0) goto L_0x0057
            char r1 = r2.charAt(r3)
            r0 = 46
            if (r1 == r0) goto L_0x0054
            boolean r0 = java.lang.Character.isJavaIdentifierPart(r1)
            if (r0 != 0) goto L_0x0054
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Illegal service provider class name: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0054:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0057:
            if (r0 <= 0) goto L_0x0005
            r4.add(r2)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1IN.A00(java.io.BufferedReader):java.util.List");
    }
}
