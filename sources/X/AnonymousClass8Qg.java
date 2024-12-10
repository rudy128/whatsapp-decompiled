package X;

/* renamed from: X.8Qg  reason: invalid class name */
public abstract class AnonymousClass8Qg extends A8B {
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0049  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.content.Context r11, android.content.Intent r12, X.AnonymousClass8Qg r13, java.util.List r14) {
        /*
            java.util.ArrayList r2 = X.AnonymousClass000.A14(r14)
            java.util.Iterator r10 = r14.iterator()
        L_0x0008:
            boolean r0 = r10.hasNext()
            java.lang.String r4 = "DifferentKeyIntentScope"
            r3 = 0
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r7 = r10.next()
            android.content.pm.ComponentInfo r7 = (android.content.pm.ComponentInfo) r7
            boolean r0 = r13 instanceof X.AnonymousClass8Ql
            if (r0 == 0) goto L_0x0073
            r9 = r13
            X.8Ql r9 = (X.AnonymousClass8Ql) r9
            android.content.pm.ApplicationInfo r0 = r7.applicationInfo
            java.lang.String r8 = "ThirdPartyIntentScope"
            if (r0 != 0) goto L_0x0068
            X.BA8 r9 = r9.A01
            java.lang.String r0 = "Null application info."
        L_0x0028:
            r9.CFI(r8, r0, r3)
            r0 = 0
        L_0x002c:
            if (r0 != 0) goto L_0x0049
            X.9xA r0 = r13.A00
            monitor-enter(r0)
            monitor-exit(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Removed non-external/third-party component: "
        L_0x0038:
            r1.append(r0)
            java.lang.String r0 = X.A8B.A03(r12)
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.BA8 r0 = r13.A01
            r0.CFI(r4, r1, r3)
            goto L_0x0008
        L_0x0049:
            android.content.pm.ApplicationInfo r0 = r7.applicationInfo
            if (r0 == 0) goto L_0x0064
            java.lang.String r1 = r0.className
            java.lang.String r0 = "com.android.internal.app.ResolverActivity"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0064
            X.9xA r0 = r13.A00
            monitor-enter(r0)
            monitor-exit(r0)
            monitor-enter(r0)
            monitor-exit(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Removed potentially dangerous resolver: "
            goto L_0x0038
        L_0x0064:
            r2.add(r7)
            goto L_0x0008
        L_0x0068:
            X.A2W r1 = r9.A00     // Catch:{ SecurityException -> 0x00a0 }
            int r0 = r0.uid     // Catch:{ SecurityException -> 0x00a0 }
            boolean r0 = r1.A01(r11, r0)     // Catch:{ SecurityException -> 0x00a0 }
            r0 = r0 ^ 1
            goto L_0x002c
        L_0x0073:
            android.content.pm.ApplicationInfo r6 = r11.getApplicationInfo()
            android.content.pm.ApplicationInfo r5 = r7.applicationInfo
            java.lang.String r8 = "ExternalIntentScope"
            if (r6 == 0) goto L_0x00bd
            if (r5 == 0) goto L_0x00bd
            boolean r0 = X.C20084A6l.A03(r11, r6, r5)     // Catch:{ SecurityException -> 0x0086 }
            r0 = r0 ^ 1
            goto L_0x002c
        L_0x0086:
            r6 = move-exception
            X.BA8 r5 = r13.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected exception in verifying signature for: "
            r1.append(r0)
            java.lang.String r0 = r7.packageName
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r5.CFI(r8, r0, r6)
            boolean r0 = r13.A0C()
            goto L_0x00b9
        L_0x00a0:
            r6 = move-exception
            X.BA8 r5 = r9.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected exception in checking trusted app for "
            r1.append(r0)
            java.lang.String r0 = r7.packageName
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r5.CFI(r8, r0, r6)
            boolean r0 = r9.A0C()
        L_0x00b9:
            r0 = r0 ^ 1
            goto L_0x002c
        L_0x00bd:
            X.BA8 r9 = r13.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Null app info, current app: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", target app: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)
            goto L_0x0028
        L_0x00d3:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x011b
            android.content.pm.ApplicationInfo r0 = r11.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            r0 = 30
            java.lang.String r1 = "No matching different-signature components for: "
            if (r2 < r0) goto L_0x0109
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0109
            X.BA8 r2 = r13.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = X.A8B.A03(r12)
            r1.append(r0)
            java.lang.String r0 = " on API 30+ device. Intent target is not in any PackageFinder aware app, so it's probably a non-FB app. Attempting to proceed."
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r2.CFI(r4, r0, r3)
            X.9xA r0 = r13.A00
            monitor-enter(r0)
            monitor-exit(r0)
            X.C180889Oi.A00(r12, r2)
            return r12
        L_0x0109:
            X.BA8 r2 = r13.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            java.lang.String r0 = X.A8B.A03(r12)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r2.CFI(r4, r0, r3)
            return r3
        L_0x011b:
            int r1 = r2.size()
            int r0 = r14.size()
            if (r1 == r0) goto L_0x015f
            int r1 = r2.size()
            r0 = 1
            if (r1 <= r0) goto L_0x0156
            java.util.ArrayList r3 = X.AnonymousClass000.A14(r2)
            java.util.Iterator r2 = r2.iterator()
        L_0x0134:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r2.next()
            android.content.pm.PackageItemInfo r0 = (android.content.pm.PackageItemInfo) r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r12)
            X.A8B.A06(r1, r0)
            java.lang.String r0 = r0.packageName
            r1.setPackage(r0)
            r3.add(r1)
            goto L_0x0134
        L_0x0151:
            android.content.Intent r12 = X.A8B.A02(r3)
            goto L_0x015f
        L_0x0156:
            java.lang.Object r0 = X.AnonymousClass8BS.A0Y(r2)
            android.content.pm.PackageItemInfo r0 = (android.content.pm.PackageItemInfo) r0
            X.A8B.A06(r12, r0)
        L_0x015f:
            X.BA8 r1 = r13.A01
            X.9xA r0 = r13.A00
            monitor-enter(r0)
            monitor-exit(r0)
            X.C180889Oi.A00(r12, r1)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Qg.A00(android.content.Context, android.content.Intent, X.8Qg, java.util.List):android.content.Intent");
    }
}
