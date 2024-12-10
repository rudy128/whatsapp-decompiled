package X;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.0yH  reason: invalid class name and case insensitive filesystem */
public class C19480yH {
    public int A00;
    public int A01 = 0;
    public String A02;
    public String A03;
    public final Context A04;

    public static synchronized void A02(C19480yH r2) {
        synchronized (r2) {
            PackageInfo A002 = A00(r2, r2.A04.getPackageName());
            if (A002 != null) {
                r2.A03 = Integer.toString(A002.versionCode);
                r2.A02 = A002.versionName;
            }
        }
    }

    public synchronized String A03() {
        if (this.A03 == null) {
            A02(this);
        }
        return this.A03;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r0.size() > 0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04() {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            int r0 = r7.A01     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0069
            android.content.Context r0 = r7.A04     // Catch:{ all -> 0x0071 }
            android.content.pm.PackageManager r5 = r0.getPackageManager()     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = "com.google.android.c2dm.permission.SEND"
            java.lang.String r4 = "com.google.android.gms"
            int r1 = r5.checkPermission(r0, r4)     // Catch:{ all -> 0x0071 }
            r0 = -1
            r3 = 0
            if (r1 != r0) goto L_0x0020
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r0 = "Google Play services missing or without correct permission."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0071 }
            goto L_0x006b
        L_0x0020:
            boolean r0 = X.C25333Cde.A00()     // Catch:{ all -> 0x0071 }
            r2 = 1
            if (r0 != 0) goto L_0x0040
            java.lang.String r1 = "com.google.android.c2dm.intent.REGISTER"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0071 }
            r0.<init>(r1)     // Catch:{ all -> 0x0071 }
            r0.setPackage(r4)     // Catch:{ all -> 0x0071 }
            java.util.List r0 = r5.queryIntentServices(r0, r3)     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0040
            int r0 = r0.size()     // Catch:{ all -> 0x0071 }
            if (r0 <= 0) goto L_0x0040
        L_0x003d:
            r7.A01 = r2     // Catch:{ all -> 0x0071 }
            goto L_0x0069
        L_0x0040:
            java.lang.String r1 = "com.google.iid.TOKEN_REQUEST"
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0071 }
            r0.<init>(r1)     // Catch:{ all -> 0x0071 }
            r0.setPackage(r4)     // Catch:{ all -> 0x0071 }
            java.util.List r0 = r5.queryBroadcastReceivers(r0, r3)     // Catch:{ all -> 0x0071 }
            r3 = 2
            if (r0 == 0) goto L_0x005a
            int r0 = r0.size()     // Catch:{ all -> 0x0071 }
            if (r0 <= 0) goto L_0x005a
            r7.A01 = r3     // Catch:{ all -> 0x0071 }
            goto L_0x006b
        L_0x005a:
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r0 = "Failed to resolve IID implementation package, falling back"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0071 }
            boolean r0 = X.C25333Cde.A00()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x003d
            r7.A01 = r3     // Catch:{ all -> 0x0071 }
        L_0x0069:
            monitor-exit(r6)
            goto L_0x006f
        L_0x006b:
            monitor-exit(r6)
            r0 = 0
            if (r3 == 0) goto L_0x0070
        L_0x006f:
            r0 = 1
        L_0x0070:
            return r0
        L_0x0071:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19480yH.A04():boolean");
    }

    public static PackageInfo A00(C19480yH r1, String str) {
        try {
            return r1.A04.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to find package ");
            sb.append(e);
            Log.w("FirebaseMessaging", sb.toString());
            return null;
        }
    }

    public C19480yH(Context context) {
        this.A04 = context;
    }

    public static String A01(C18220vy r3) {
        C18220vy.A02(r3);
        C18230vz r1 = r3.A01;
        String str = r1.A02;
        if (str != null) {
            return str;
        }
        C18220vy.A02(r3);
        String str2 = r1.A01;
        if (str2.startsWith("1:")) {
            String[] split = str2.split(":");
            if (split.length >= 2) {
                str2 = split[1];
                if (str2.isEmpty()) {
                    return null;
                }
            }
            return null;
        }
        return str2;
    }
}
