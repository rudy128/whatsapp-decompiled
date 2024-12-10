package X;

/* renamed from: X.1ab  reason: invalid class name and case insensitive filesystem */
public class C28601ab {
    public C28611ac A00;
    public final C28611ac A01 = new Object();
    public final C28611ac A02;
    public final C28611ac[] A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: X.1ac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v33, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v34, resolved type: X.1ac} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: X.1ac} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized X.C28611ac A00(android.content.Context r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            X.1ac r0 = r7.A00     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x00c7
            java.lang.String r1 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "Xiaomi"
            boolean r0 = r1.equalsIgnoreCase(r0)     // Catch:{ all -> 0x00c9 }
            if (r0 == 0) goto L_0x003a
            X.1ag r0 = new X.1ag     // Catch:{ all -> 0x00c9 }
            r0.<init>()     // Catch:{ all -> 0x00c9 }
        L_0x0014:
            r7.A00 = r0     // Catch:{ all -> 0x00c9 }
        L_0x0016:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r2.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "badger/getbadger "
            r2.append(r0)     // Catch:{ all -> 0x00c9 }
            X.1ac[] r0 = r7.A03     // Catch:{ all -> 0x00c9 }
            java.util.List r1 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x00c9 }
            X.1ac r0 = r7.A00     // Catch:{ all -> 0x00c9 }
            int r0 = r1.indexOf(r0)     // Catch:{ all -> 0x00c9 }
            r2.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00c9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c9 }
            X.1ac r0 = r7.A00     // Catch:{ all -> 0x00c9 }
            goto L_0x00c7
        L_0x003a:
            java.lang.String r0 = "android.intent.action.MAIN"
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x00a1 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = "android.intent.category.HOME"
            r2.addCategory(r0)     // Catch:{ Exception -> 0x00a1 }
            android.content.pm.PackageManager r1 = r8.getPackageManager()     // Catch:{ Exception -> 0x00a1 }
            r0 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r1.queryIntentActivities(r2, r0)     // Catch:{ Exception -> 0x00a1 }
            if (r0 == 0) goto L_0x009b
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x00a1 }
        L_0x0056:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x00a1 }
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x00a1 }
            android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0     // Catch:{ Exception -> 0x00a1 }
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r5 = r0.packageName     // Catch:{ Exception -> 0x00a1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a1 }
            r1.<init>()     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = "badger/homepackage/"
            r1.append(r0)     // Catch:{ Exception -> 0x00a1 }
            r1.append(r5)     // Catch:{ Exception -> 0x00a1 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x00a1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x00a1 }
            X.1ac[] r4 = r7.A03     // Catch:{ Exception -> 0x00a1 }
            r3 = 9
            r2 = 0
        L_0x007f:
            r1 = r4[r2]     // Catch:{ Exception -> 0x00a1 }
            android.content.Context r0 = r8.getApplicationContext()     // Catch:{ Exception -> 0x00a1 }
            java.util.List r0 = r1.A01(r0)     // Catch:{ Exception -> 0x00a1 }
            boolean r0 = r0.contains(r5)     // Catch:{ Exception -> 0x00a1 }
            if (r0 == 0) goto L_0x0096
            r7.A00 = r1     // Catch:{ Exception -> 0x00a1 }
        L_0x0091:
            X.1ac r0 = r7.A00     // Catch:{ Exception -> 0x00a1 }
            if (r0 == 0) goto L_0x0056
            goto L_0x00ba
        L_0x0096:
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0091
            goto L_0x007f
        L_0x009b:
            java.lang.String r0 = "badger/nohome"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x00a1 }
            goto L_0x00ba
        L_0x00a1:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c9 }
            r1.<init>()     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "badger/getbadger "
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x00c9 }
            r1.append(r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c9 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00c9 }
        L_0x00ba:
            X.1ac r0 = r7.A00     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "badger/getbadger/notfound/default"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c9 }
            X.1ac r0 = r7.A02     // Catch:{ all -> 0x00c9 }
            goto L_0x0014
        L_0x00c7:
            monitor-exit(r7)
            return r0
        L_0x00c9:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28601ab.A00(android.content.Context):X.1ac");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.1ac[]} */
    /* JADX WARNING: type inference failed for: r0v0, types: [X.1ac, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.1ac, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28601ab(X.C18030ve r5) {
        /*
            r4 = this;
            r4.<init>()
            X.1ad r0 = new X.1ad
            r0.<init>()
            r4.A01 = r0
            X.1ae r3 = new X.1ae
            r3.<init>()
            r4.A02 = r3
            r0 = 9
            X.1ac[] r2 = new X.C28611ac[r0]
            X.1af r1 = new X.1af
            r1.<init>()
            r0 = 0
            r2[r0] = r1
            X.1ag r1 = new X.1ag
            r1.<init>()
            r0 = 1
            r2[r0] = r1
            X.1ah r1 = new X.1ah
            r1.<init>()
            r0 = 2
            r2[r0] = r1
            X.1ai r1 = new X.1ai
            r1.<init>()
            r0 = 3
            r2[r0] = r1
            X.1aj r1 = new X.1aj
            r1.<init>()
            r0 = 4
            r2[r0] = r1
            X.1ak r1 = new X.1ak
            r1.<init>(r5)
            r0 = 5
            r2[r0] = r1
            X.1al r1 = new X.1al
            r1.<init>(r5)
            r0 = 6
            r2[r0] = r1
            X.1am r1 = new X.1am
            r1.<init>()
            r0 = 7
            r2[r0] = r1
            r0 = 8
            r2[r0] = r3
            r4.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28601ab.<init>(X.0ve):void");
    }
}
