package X;

/* renamed from: X.8Qj  reason: invalid class name */
public class AnonymousClass8Qj extends A8B {
    public static final A2W A01 = C196409v0.A00();
    public final A2W A00;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00aa, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent A00(android.content.Context r10, android.content.Intent r11, X.AnonymousClass8Qj r12, java.util.List r13) {
        /*
            r6 = 0
            X.BA8 r4 = r12.A01
            X.C196399uz.A01(r10, r11, r4)
            java.util.ArrayList r3 = X.AnonymousClass000.A14(r13)
            java.util.Iterator r9 = r13.iterator()
        L_0x000e:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r7 = r9.next()
            android.content.pm.ComponentInfo r7 = (android.content.pm.ComponentInfo) r7
            android.content.pm.ApplicationInfo r0 = r7.applicationInfo
            if (r0 == 0) goto L_0x000e
            java.lang.String r8 = r0.packageName
            X.A2W r1 = r12.A00     // Catch:{ SecurityException -> 0x002f }
            int r0 = r0.uid     // Catch:{ SecurityException -> 0x002f }
            boolean r0 = r1.A01(r10, r0)     // Catch:{ SecurityException -> 0x002f }
            if (r0 != 0) goto L_0x0047
            X.9xA r0 = r12.A00     // Catch:{ SecurityException -> 0x002f }
            monitor-enter(r0)     // Catch:{ SecurityException -> 0x002f }
            monitor-exit(r0)     // Catch:{ SecurityException -> 0x002f }
            goto L_0x000e
        L_0x002f:
            r5 = move-exception
            java.lang.String r2 = "FamilyIntentScope"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unexpected exception in checking trusted app for "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r8, r1)
            r4.CFI(r2, r0, r5)
            boolean r0 = r12.A0C()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x000e
        L_0x0047:
            r3.add(r7)
            goto L_0x000e
        L_0x004b:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0059
            java.lang.String r1 = "FamilyIntentScope"
            java.lang.String r0 = "No matching packages available."
            r4.CFI(r1, r0, r6)
            return r6
        L_0x0059:
            r1 = 1
            X.Ako r0 = new X.Ako
            r0.<init>()
            java.util.Collections.sort(r3, r0)
            java.lang.Object r5 = X.AnonymousClass8BS.A0Y(r3)
            android.content.pm.PackageItemInfo r5 = (android.content.pm.PackageItemInfo) r5
            int r0 = r3.size()
            if (r0 <= r1) goto L_0x00c4
            java.util.Iterator r7 = r3.iterator()
        L_0x0072:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r6 = r7.next()
            android.content.pm.PackageItemInfo r6 = (android.content.pm.PackageItemInfo) r6
            java.lang.String r2 = r6.packageName     // Catch:{ SecurityException -> 0x00ab }
            java.lang.String r0 = r10.getPackageName()     // Catch:{ SecurityException -> 0x00ab }
            X.9oY r0 = X.C20084A6l.A01(r10, r0)     // Catch:{ SecurityException -> 0x00ab }
            android.content.pm.ApplicationInfo r1 = r0.A00     // Catch:{ SecurityException -> 0x00ab }
            if (r1 == 0) goto L_0x009b
            X.9oY r0 = X.C20084A6l.A01(r10, r2)     // Catch:{ SecurityException -> 0x00ab }
            android.content.pm.ApplicationInfo r0 = r0.A00     // Catch:{ SecurityException -> 0x00ab }
            if (r0 == 0) goto L_0x00a5
            boolean r0 = X.C20084A6l.A03(r10, r1, r0)     // Catch:{ SecurityException -> 0x00ab }
            r0 = r0 ^ 1
            goto L_0x00c1
        L_0x009b:
            java.lang.String r0 = r10.getPackageName()     // Catch:{ SecurityException -> 0x00ab }
            X.AmY r1 = new X.AmY     // Catch:{ SecurityException -> 0x00ab }
            r1.<init>(r0)     // Catch:{ SecurityException -> 0x00ab }
            goto L_0x00aa
        L_0x00a5:
            X.AmY r1 = new X.AmY     // Catch:{ SecurityException -> 0x00ab }
            r1.<init>(r2)     // Catch:{ SecurityException -> 0x00ab }
        L_0x00aa:
            throw r1     // Catch:{ SecurityException -> 0x00ab }
        L_0x00ab:
            r3 = move-exception
            java.lang.String r2 = "FamilyIntentScope"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Error verifying the signature for "
            r1.append(r0)
            java.lang.String r0 = r6.packageName
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r4.CFI(r2, r0, r3)
            goto L_0x0072
        L_0x00c1:
            if (r0 == 0) goto L_0x0072
            r5 = r6
        L_0x00c4:
            X.A8B.A06(r11, r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8Qj.A00(android.content.Context, android.content.Intent, X.8Qj, java.util.List):android.content.Intent");
    }

    public AnonymousClass8Qj(C197729xA r1, BA8 ba8, A2W a2w) {
        super(r1, ba8);
        this.A00 = a2w;
    }
}
