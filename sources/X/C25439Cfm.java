package X;

/* renamed from: X.Cfm  reason: case insensitive filesystem */
public abstract class C25439Cfm {
    public static final Object A00 = C17880vN.A0p();
    public static volatile DRR A01 = C23265BeF.A00;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0064, code lost:
        if ("com.google.android.gms".equals(r0.packageName) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.content.Context r8, android.net.Uri r9) {
        /*
            java.lang.String r7 = "com.google.android.gms.phenotype"
            java.lang.String r1 = r9.getAuthority()
            boolean r0 = r7.equals(r1)
            r5 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r2 = java.lang.String.valueOf(r1)
            java.lang.String r1 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            java.lang.String r0 = "PhenotypeClientHelper"
            X.BE7.A1K(r2, r1, r0)
            return r5
        L_0x0019:
            X.DRR r0 = A01
            boolean r0 = r0 instanceof X.C23264BeE
            if (r0 != 0) goto L_0x0085
            java.lang.Object r6 = A00
            monitor-enter(r6)
            X.DRR r0 = A01     // Catch:{ all -> 0x0082 }
            boolean r0 = r0 instanceof X.C23264BeE     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x003f
            X.DRR r1 = A01     // Catch:{ all -> 0x0082 }
            boolean r0 = r1 instanceof X.C23264BeE     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0038
            X.BeE r1 = (X.C23264BeE) r1     // Catch:{ all -> 0x0082 }
            java.lang.Object r0 = r1.zza     // Catch:{ all -> 0x0082 }
            boolean r0 = X.AnonymousClass000.A1Y(r0)     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            return r0
        L_0x0038:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x003f:
            java.lang.String r4 = "com.google.android.gms"
            java.lang.String r0 = r8.getPackageName()     // Catch:{ all -> 0x0082 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0066
            android.content.pm.PackageManager r3 = r8.getPackageManager()     // Catch:{ all -> 0x0082 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0082 }
            r1 = 29
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            if (r2 >= r1) goto L_0x0058
            r0 = 0
        L_0x0058:
            android.content.pm.ProviderInfo r0 = r3.resolveContentProvider(r7, r0)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0075
            java.lang.String r0 = r0.packageName     // Catch:{ all -> 0x0082 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0075
        L_0x0066:
            android.content.pm.PackageManager r0 = r8.getPackageManager()     // Catch:{ all -> 0x0082 }
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0075 }
            int r0 = r0.flags     // Catch:{ all -> 0x0082 }
            r0 = r0 & 129(0x81, float:1.81E-43)
            if (r0 == 0) goto L_0x0075
            r5 = 1
        L_0x0075:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0082 }
            X.BeE r0 = new X.BeE     // Catch:{ all -> 0x0082 }
            r0.<init>(r1)     // Catch:{ all -> 0x0082 }
            A01 = r0     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            goto L_0x0085
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0082 }
            throw r0
        L_0x0085:
            X.DRR r1 = A01
            boolean r0 = r1 instanceof X.C23264BeE
            if (r0 == 0) goto L_0x0094
            X.BeE r1 = (X.C23264BeE) r1
            java.lang.Object r0 = r1.zza
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            return r0
        L_0x0094:
            java.lang.String r0 = "Optional.get() cannot be called on an absent value"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25439Cfm.A00(android.content.Context, android.net.Uri):boolean");
    }
}
