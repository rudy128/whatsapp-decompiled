package X;

public final class Cf1 {
    public static volatile DRR A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:67|68) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        throw r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.DRR A00(android.content.Context r14) {
        /*
            java.lang.Class<X.Cf1> r13 = X.Cf1.class
            monitor-enter(r13)
            X.DRR r1 = A00     // Catch:{ all -> 0x0152 }
            if (r1 != 0) goto L_0x0150
            java.lang.String r2 = android.os.Build.TYPE     // Catch:{ all -> 0x0152 }
            java.lang.String r1 = android.os.Build.TAGS     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "eng"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0152 }
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = "userdebug"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x014c
        L_0x001b:
            java.lang.String r0 = "dev-keys"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0152 }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "test-keys"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x014c
        L_0x002b:
            boolean r0 = X.C26087Cs5.A00()     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x003b
            boolean r0 = r14.isDeviceProtectedStorage()     // Catch:{ all -> 0x0152 }
            if (r0 != 0) goto L_0x003b
            android.content.Context r14 = r14.createDeviceProtectedStorageContext()     // Catch:{ all -> 0x0152 }
        L_0x003b:
            android.os.StrictMode$ThreadPolicy r12 = android.os.StrictMode.allowThreadDiskReads()     // Catch:{ all -> 0x0152 }
            android.os.StrictMode.allowThreadDiskWrites()     // Catch:{ all -> 0x0147 }
            r5 = 0
            java.lang.String r0 = "phenotype_hermetic"
            java.io.File r1 = r14.getDir(r0, r5)     // Catch:{ RuntimeException -> 0x0050 }
            java.lang.String r0 = "overrides.txt"
            java.io.File r2 = X.C17880vN.A0e(r1, r0)     // Catch:{ RuntimeException -> 0x0050 }
            goto L_0x005b
        L_0x0050:
            r2 = move-exception
            java.lang.String r1 = "HermeticFileOverrides"
            java.lang.String r0 = "no data dir"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x0147 }
            X.BeF r1 = X.C23265BeF.A00     // Catch:{ all -> 0x0147 }
            goto L_0x0066
        L_0x005b:
            boolean r0 = r2.exists()     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x006f
            X.BeE r1 = new X.BeE     // Catch:{ all -> 0x0147 }
            r1.<init>(r2)     // Catch:{ all -> 0x0147 }
        L_0x0066:
            boolean r0 = r1 instanceof X.C23264BeE     // Catch:{ all -> 0x0147 }
            if (r0 == 0) goto L_0x0141
            X.BeE r1 = (X.C23264BeE) r1     // Catch:{ all -> 0x0147 }
            java.lang.Object r9 = r1.zza     // Catch:{ all -> 0x0147 }
            goto L_0x0072
        L_0x006f:
            X.BeF r1 = X.C23265BeF.A00     // Catch:{ all -> 0x0147 }
            goto L_0x0066
        L_0x0072:
            r0 = r9
            java.io.File r0 = (java.io.File) r0     // Catch:{ IOException -> 0x013b }
            java.io.FileInputStream r1 = X.C108945cZ.A18(r0)     // Catch:{ IOException -> 0x013b }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x013b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x013b }
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ IOException -> 0x013b }
            r7.<init>(r0)     // Catch:{ IOException -> 0x013b }
            r6 = 1
            X.00O r8 = new X.00O     // Catch:{ all -> 0x0121 }
            r8.<init>(r5)     // Catch:{ all -> 0x0121 }
            java.util.HashMap r10 = X.C17880vN.A11()     // Catch:{ all -> 0x0121 }
        L_0x008d:
            java.lang.String r3 = r7.readLine()     // Catch:{ all -> 0x0121 }
            if (r3 == 0) goto L_0x00f8
            java.lang.String r0 = " "
            r1 = 3
            java.lang.String[] r2 = r3.split(r0, r1)     // Catch:{ all -> 0x0121 }
            int r0 = r2.length     // Catch:{ all -> 0x0121 }
            if (r0 == r1) goto L_0x00ad
            java.lang.String r2 = "HermeticFileOverrides"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Invalid: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r3, r1)     // Catch:{ all -> 0x0121 }
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x0121 }
            goto L_0x008d
        L_0x00ad:
            r0 = r2[r5]     // Catch:{ all -> 0x0121 }
            java.lang.String r11 = new java.lang.String     // Catch:{ all -> 0x0121 }
            r11.<init>(r0)     // Catch:{ all -> 0x0121 }
            r1 = r2[r6]     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0121 }
            r0.<init>(r1)     // Catch:{ all -> 0x0121 }
            java.lang.String r4 = android.net.Uri.decode(r0)     // Catch:{ all -> 0x0121 }
            r1 = 2
            r0 = r2[r1]     // Catch:{ all -> 0x0121 }
            java.lang.String r3 = X.C108945cZ.A1G(r0, r10)     // Catch:{ all -> 0x0121 }
            if (r3 != 0) goto L_0x00e0
            r0 = r2[r1]     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = new java.lang.String     // Catch:{ all -> 0x0121 }
            r2.<init>(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r3 = android.net.Uri.decode(r2)     // Catch:{ all -> 0x0121 }
            int r1 = r3.length()     // Catch:{ all -> 0x0121 }
            r0 = 1024(0x400, float:1.435E-42)
            if (r1 < r0) goto L_0x00dd
            if (r3 != r2) goto L_0x00e0
        L_0x00dd:
            r10.put(r2, r3)     // Catch:{ all -> 0x0121 }
        L_0x00e0:
            boolean r0 = r8.containsKey(r11)     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x00ee
            X.00O r0 = new X.00O     // Catch:{ all -> 0x0121 }
            r0.<init>(r5)     // Catch:{ all -> 0x0121 }
            r8.put(r11, r0)     // Catch:{ all -> 0x0121 }
        L_0x00ee:
            java.lang.Object r0 = r8.get(r11)     // Catch:{ all -> 0x0121 }
            X.00O r0 = (X.AnonymousClass00O) r0     // Catch:{ all -> 0x0121 }
            r0.put(r4, r3)     // Catch:{ all -> 0x0121 }
            goto L_0x008d
        L_0x00f8:
            java.lang.String r4 = "HermeticFileOverrides"
            java.lang.String r3 = r9.toString()     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = r14.getPackageName()     // Catch:{ all -> 0x0121 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "Parsed "
            r1.append(r0)     // Catch:{ all -> 0x0121 }
            r1.append(r3)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = " for Android package "
            X.BEA.A1N(r0, r2, r4, r1)     // Catch:{ all -> 0x0121 }
            X.CLI r0 = new X.CLI     // Catch:{ all -> 0x0121 }
            r0.<init>(r8)     // Catch:{ all -> 0x0121 }
            r7.close()     // Catch:{ IOException -> 0x013b }
            X.BeE r1 = new X.BeE     // Catch:{ all -> 0x0147 }
            r1.<init>(r0)     // Catch:{ all -> 0x0147 }
            goto L_0x0143
        L_0x0121:
            r4 = move-exception
            r7.close()     // Catch:{ all -> 0x0126 }
            goto L_0x013a
        L_0x0126:
            r3 = move-exception
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r1 = "addSuppressed"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x013a }
            r0[r5] = r2     // Catch:{ Exception -> 0x013a }
            java.lang.reflect.Method r1 = r2.getDeclaredMethod(r1, r0)     // Catch:{ Exception -> 0x013a }
            java.lang.Object[] r0 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x013a }
            r0[r5] = r3     // Catch:{ Exception -> 0x013a }
            r1.invoke(r4, r0)     // Catch:{ Exception -> 0x013a }
        L_0x013a:
            throw r4     // Catch:{ IOException -> 0x013b }
        L_0x013b:
            r0 = move-exception
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0x(r0)     // Catch:{ all -> 0x0147 }
            throw r0     // Catch:{ all -> 0x0147 }
        L_0x0141:
            X.BeF r1 = X.C23265BeF.A00     // Catch:{ all -> 0x0147 }
        L_0x0143:
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x0152 }
            goto L_0x014e
        L_0x0147:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r12)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x014c:
            X.BeF r1 = X.C23265BeF.A00     // Catch:{ all -> 0x0152 }
        L_0x014e:
            A00 = r1     // Catch:{ all -> 0x0152 }
        L_0x0150:
            monitor-exit(r13)     // Catch:{ all -> 0x0152 }
            return r1
        L_0x0152:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0152 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cf1.A00(android.content.Context):X.DRR");
    }
}
