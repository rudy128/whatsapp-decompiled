package X;

/* renamed from: X.6YO  reason: invalid class name */
public abstract class AnonymousClass6YO {
    public static final C1604488n A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: X.7Au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v18, resolved type: org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.7Au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: X.7Au} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            r0 = 28
            if (r1 < r0) goto L_0x0023
            java.lang.ClassLoader r1 = X.AnonymousClass6VP.A00()     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
        L_0x000a:
            java.lang.String r0 = "org.chromium.support_lib_glue.SupportLibReflectionUtil"
            r3 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0, r3, r1)     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            java.lang.String r1 = "createWebViewProviderFactory"
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r1, r0)     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            java.lang.Object r4 = r2.invoke(r1, r0)     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            java.lang.reflect.InvocationHandler r4 = (java.lang.reflect.InvocationHandler) r4     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            goto L_0x0064
        L_0x0023:
            java.lang.Class<android.webkit.WebView> r3 = android.webkit.WebView.class
            java.lang.String r2 = "getFactory"
            r1 = 0
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0042, IllegalAccessException -> 0x0050 }
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r2, r0)     // Catch:{ NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0042, IllegalAccessException -> 0x0050 }
            r0 = 1
            r2.setAccessible(r0)     // Catch:{ NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0042, IllegalAccessException -> 0x0050 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0042, IllegalAccessException -> 0x0050 }
            r0 = 0
            java.lang.Object r0 = r2.invoke(r0, r1)     // Catch:{ NoSuchMethodException -> 0x0049, InvocationTargetException -> 0x0042, IllegalAccessException -> 0x0050 }
            java.lang.Class r0 = r0.getClass()     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            java.lang.ClassLoader r1 = r0.getClassLoader()     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            goto L_0x000a
        L_0x0042:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            r1.<init>(r0)     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            goto L_0x0056
        L_0x0049:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            r1.<init>(r0)     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            goto L_0x0056
        L_0x0050:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
            r1.<init>(r0)     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
        L_0x0056:
            throw r1     // Catch:{ IllegalAccessException -> 0x008f, InvocationTargetException -> 0x0088, ClassNotFoundException -> 0x005e, NoSuchMethodException -> 0x0057 }
        L_0x0057:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x005e:
            X.7Av r0 = new X.7Av
            r0.<init>()
            goto L_0x0070
        L_0x0064:
            java.lang.Class<org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface> r3 = org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface.class
            if (r4 != 0) goto L_0x0073
            r1 = 0
        L_0x0069:
            org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface r1 = (org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface) r1
            X.7Au r0 = new X.7Au
            r0.<init>(r1)
        L_0x0070:
            A00 = r0
            return
        L_0x0073:
            java.lang.Class<X.6YL> r0 = X.AnonymousClass6YL.class
            java.lang.ClassLoader r2 = r0.getClassLoader()
            r0 = 1
            java.lang.Class[] r1 = new java.lang.Class[r0]
            r0 = 0
            r1[r0] = r3
            java.lang.Object r0 = java.lang.reflect.Proxy.newProxyInstance(r2, r1, r4)
            java.lang.Object r1 = r3.cast(r0)
            goto L_0x0069
        L_0x0088:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x008f:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6YO.<clinit>():void");
    }
}
