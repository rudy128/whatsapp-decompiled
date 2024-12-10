package X;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;

/* renamed from: X.0z6  reason: invalid class name and case insensitive filesystem */
public class C19840z6 {
    public final SharedPreferences A00;

    public static String A01(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|");
        sb.append("*");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0052, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Error creating file in no backup dir: ");
        r1.append(r2.getMessage());
        android.util.Log.d("FirebaseMessaging", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C19840z6(android.content.Context r6) {
        /*
            r5 = this;
            r5.<init>()
            java.lang.String r1 = "com.google.android.gms.appid"
            r0 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r1, r0)
            r5.A00 = r0
            java.lang.String r4 = "com.google.android.gms.appid-no-backup"
            r2 = r5
            java.lang.String r3 = "FirebaseMessaging"
            java.io.File r0 = A00(r6)
            java.io.File r1 = new java.io.File
            r1.<init>(r0, r4)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x006a
            boolean r0 = r1.createNewFile()     // Catch:{ IOException -> 0x004a }
            if (r0 == 0) goto L_0x006a
            monitor-enter(r2)     // Catch:{ IOException -> 0x004a }
            android.content.SharedPreferences r1 = r5.A00     // Catch:{ all -> 0x0047 }
            java.util.Map r0 = r1.getAll()     // Catch:{ all -> 0x0047 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0047 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x004a }
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = "App restored, clearing state"
            android.util.Log.i(r3, r0)     // Catch:{ IOException -> 0x004a }
            monitor-enter(r2)     // Catch:{ IOException -> 0x004a }
            android.content.SharedPreferences$Editor r0 = r1.edit()     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences$Editor r0 = r0.clear()     // Catch:{ all -> 0x0047 }
            r0.commit()     // Catch:{ all -> 0x0047 }
            monitor-exit(r2)     // Catch:{ IOException -> 0x004a }
            return
        L_0x0047:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ IOException -> 0x004a }
            throw r0     // Catch:{ IOException -> 0x004a }
        L_0x004a:
            r2 = move-exception
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x006a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error creating file in no backup dir: "
            r1.append(r0)
            java.lang.String r0 = r2.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r3, r0)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19840z6.<init>(android.content.Context):void");
    }

    public static File A00(Context context) {
        return context.getNoBackupFilesDir();
    }
}
