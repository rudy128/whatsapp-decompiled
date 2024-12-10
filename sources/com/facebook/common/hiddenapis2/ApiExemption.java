package com.facebook.common.hiddenapis2;

public class ApiExemption {
    public static final String[] EXEMPTIONS = {"Landroid/app/ActivityThread", "Landroid/app/ActivityTaskManager", "Landroid/net/ConnectivityManager", "Landroid/location/LocationManager", "Landroid/os/storage/StorageManager", "Landroid/app/usage/StorageStatsManager", "Landroid/accounts/AccountManager", "Landroid/content/ClipboardManager", "Landroid/media/AudioManager", "Landroid/os/BatteryManager", "Landroid/app/JobSchedulerImpl", "Landroid/media/session/MediaSessionManager", "Landroid/util/BoostFramework", "Lcom/mediatek/perfservice/", "Lcom/mediatek/powerhalmgr/", "Lcom/samsung/android/os/SemPerfManager", "Landroid/os/InputConstants", "Landroid/os/perfdebug/", "Landroid/os/Looper", "Landroid/os/Message", "Landroid/app/QueuedWork", "Landroid/os/Binder", "Landroid/webkit/WebViewFactory", "Lcom/android/webview/chromium/WebViewChromiumFactoryProvider", "Landroid/view/WindowManagerImpl", "Ldalvik/system/VMDebug"};
    public static volatile boolean sCalled;
    public static volatile boolean sResult;
    public static volatile boolean sUseUnsafeExemption;

    public static native int nativeSetHiddenApiExemptions(int i, String[] strArr);

    public static synchronized void enableUnsafeExemption() {
        synchronized (ApiExemption.class) {
            if (!sUseUnsafeExemption && !sResult) {
                sUseUnsafeExemption = true;
                if (sCalled) {
                    sCalled = false;
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:21|22|23|24|(1:26)|29|30|(1:32)|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007c A[Catch:{ all -> 0x0050 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized boolean removeRestriction_DO_NOT_USE() {
        /*
            java.lang.Class<com.facebook.common.hiddenapis2.ApiExemption> r8 = com.facebook.common.hiddenapis2.ApiExemption.class
            monitor-enter(r8)
            boolean r0 = sCalled     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x000b
            boolean r0 = sResult     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x000b:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x008e }
            r0 = 28
            if (r3 < r0) goto L_0x0076
            r0 = 29
            if (r3 > r0) goto L_0x0060
            java.lang.String[] r7 = EXEMPTIONS     // Catch:{ all -> 0x008e }
            r6 = 0
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r3 = "getDeclaredMethod"
            r2 = 2
            java.lang.Class[] r1 = new java.lang.Class[r2]     // Catch:{ all -> 0x0050 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1[r6] = r0     // Catch:{ all -> 0x0050 }
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            r5 = 1
            r1[r5] = r0     // Catch:{ all -> 0x0050 }
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r3, r1)     // Catch:{ all -> 0x0050 }
            java.lang.Class<dalvik.system.VMRuntime> r3 = dalvik.system.VMRuntime.class
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "setHiddenApiExemptions"
            r2[r6] = r0     // Catch:{ all -> 0x0050 }
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch:{ all -> 0x0050 }
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r1[r6] = r0     // Catch:{ all -> 0x0050 }
            r2[r5] = r1     // Catch:{ all -> 0x0050 }
            java.lang.Object r2 = r4.invoke(r3, r2)     // Catch:{ all -> 0x0050 }
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch:{ all -> 0x0050 }
            if (r2 == 0) goto L_0x0074
            dalvik.system.VMRuntime r1 = dalvik.system.VMRuntime.getRuntime()     // Catch:{ all -> 0x0050 }
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch:{ all -> 0x0050 }
            r0[r6] = r7     // Catch:{ all -> 0x0050 }
            r2.invoke(r1, r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0076
        L_0x0050:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "ApiExemption"
            r1.append(r0)     // Catch:{ all -> 0x008e }
            java.lang.String r0 = "/Enable api exemption failed:"
            X.C108985cd.A1M(r0, r1, r2)     // Catch:{ all -> 0x008e }
            goto L_0x0074
        L_0x0060:
            r0 = 34
            if (r3 > r0) goto L_0x0074
            java.lang.String[] r1 = EXEMPTIONS     // Catch:{ all -> 0x008e }
            r2 = 0
            java.lang.String r0 = "hiddenapis2"
            X.AnonymousClass1A8.A06(r0)     // Catch:{ all -> 0x0078 }
            int r1 = nativeSetHiddenApiExemptions(r3, r1)     // Catch:{ all -> 0x0078 }
            r0 = 1
            if (r1 != r0) goto L_0x0078
            goto L_0x0076
        L_0x0074:
            r2 = 0
            goto L_0x0085
        L_0x0076:
            r2 = 1
            goto L_0x0085
        L_0x0078:
            boolean r0 = sUseUnsafeExemption     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0085
            X.CkA r0 = new X.CkA     // Catch:{ all -> 0x008e }
            r0.<init>()     // Catch:{ all -> 0x008e }
            boolean r2 = r0.A00()     // Catch:{ all -> 0x008e }
        L_0x0085:
            sResult = r2     // Catch:{ all -> 0x008e }
            r0 = 1
            sCalled = r0     // Catch:{ all -> 0x008e }
            boolean r0 = sResult     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r8)
            return r0
        L_0x008e:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.common.hiddenapis2.ApiExemption.removeRestriction_DO_NOT_USE():boolean");
    }
}
