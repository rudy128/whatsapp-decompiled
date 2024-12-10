package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.0yL  reason: invalid class name and case insensitive filesystem */
public final class C19520yL {
    public int A00;
    public int A01 = 0;
    public final Context A02;

    public C19520yL(Context context) {
        this.A02 = context;
    }

    public final synchronized int A00() {
        if (this.A00 == 0) {
            try {
                PackageInfo packageInfo = C41401wK.A00(this.A02).A00.getPackageManager().getPackageInfo("com.google.android.gms", 0);
                if (packageInfo != null) {
                    this.A00 = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("Metadata", "Failed to find package ".concat(e.toString()));
            }
        }
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r0.isEmpty() == false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A01() {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.A01     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r6)
            return r0
        L_0x0007:
            android.content.Context r0 = r6.A02     // Catch:{ all -> 0x0075 }
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch:{ all -> 0x0075 }
            X.1wL r0 = X.C41401wK.A00(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x0075 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x0075 }
            int r1 = r0.checkPermission(r1, r4)     // Catch:{ all -> 0x0075 }
            r0 = -1
            r3 = 0
            if (r1 != r0) goto L_0x002c
            java.lang.String r1 = "Metadata"
            java.lang.String r0 = "Google Play services missing or without correct permission."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0075 }
            monitor-exit(r6)
            return r3
        L_0x002c:
            boolean r0 = X.C25333Cde.A00()     // Catch:{ all -> 0x0075 }
            r2 = 1
            if (r0 != 0) goto L_0x004c
            java.lang.String r1 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0075 }
            r0.<init>(r1)     // Catch:{ all -> 0x0075 }
            r0.setPackage(r4)     // Catch:{ all -> 0x0075 }
            java.util.List r0 = r5.queryIntentServices(r0, r3)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x004c
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x004c
        L_0x0049:
            r6.A01 = r2     // Catch:{ all -> 0x0075 }
            goto L_0x0073
        L_0x004c:
            java.lang.String r1 = "com.google.iid.TOKEN_REQUEST"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0075 }
            r0.<init>(r1)     // Catch:{ all -> 0x0075 }
            r0.setPackage(r4)     // Catch:{ all -> 0x0075 }
            java.util.List r0 = r5.queryBroadcastReceivers(r0, r3)     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0063
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0063
            goto L_0x0071
        L_0x0063:
            java.lang.String r1 = "Metadata"
            java.lang.String r0 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0075 }
            boolean r0 = X.C25333Cde.A00()     // Catch:{ all -> 0x0075 }
            if (r2 == r0) goto L_0x0071
            goto L_0x0049
        L_0x0071:
            r2 = 2
            goto L_0x0049
        L_0x0073:
            monitor-exit(r6)
            return r2
        L_0x0075:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19520yL.A01():int");
    }
}
