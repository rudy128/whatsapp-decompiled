package X;

/* renamed from: X.2WK  reason: invalid class name */
public abstract class AnonymousClass2WK {
    public static int A00;
    public static String A01;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.io.Reader] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005f A[SYNTHETIC, Splitter:B:35:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00() {
        /*
            java.lang.String r3 = A01
            if (r3 != 0) goto L_0x0010
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 < r0) goto L_0x0011
            java.lang.String r3 = android.app.Application.getProcessName()
        L_0x000e:
            A01 = r3
        L_0x0010:
            return r3
        L_0x0011:
            int r2 = A00
            if (r2 != 0) goto L_0x001b
            int r2 = android.os.Process.myPid()
            A00 = r2
        L_0x001b:
            r3 = 0
            if (r2 <= 0) goto L_0x000e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0052, all -> 0x0059 }
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch:{ IOException -> 0x0052, all -> 0x0059 }
            r1.append(r2)     // Catch:{ IOException -> 0x0052, all -> 0x0059 }
            java.lang.String r0 = "/cmdline"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0052, all -> 0x0059 }
            android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ IOException -> 0x0052, all -> 0x0059 }
            java.io.FileReader r0 = new java.io.FileReader     // Catch:{ all -> 0x004d }
            r0.<init>(r1)     // Catch:{ all -> 0x004d }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x004d }
            r1.<init>(r0)     // Catch:{ all -> 0x004d }
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0052, all -> 0x0059 }
            java.lang.String r0 = r1.readLine()     // Catch:{ IOException -> 0x0053, all -> 0x005b }
            X.C18210vx.A00(r0)     // Catch:{ IOException -> 0x0053, all -> 0x005b }
            java.lang.String r3 = r0.trim()     // Catch:{ IOException -> 0x0053, all -> 0x005b }
            goto L_0x0053
        L_0x004d:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r2)     // Catch:{ IOException -> 0x0052, all -> 0x0059 }
            throw r0     // Catch:{ IOException -> 0x0052, all -> 0x0059 }
        L_0x0052:
            r1 = r3
        L_0x0053:
            if (r1 == 0) goto L_0x000e
            r1.close()     // Catch:{ IOException -> 0x000e }
            goto L_0x000e
        L_0x0059:
            r0 = move-exception
            goto L_0x005d
        L_0x005b:
            r0 = move-exception
            r3 = r1
        L_0x005d:
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ IOException -> 0x0062 }
        L_0x0062:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2WK.A00():java.lang.String");
    }
}
