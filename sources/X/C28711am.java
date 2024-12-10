package X;

import android.net.Uri;

/* renamed from: X.1am  reason: invalid class name and case insensitive filesystem */
public class C28711am extends C28611ac {
    public static final Uri A00 = Uri.parse("content://com.transsion.hilauncher.unreadprovider");
    public static final Uri A01 = Uri.parse("content://com.transsion.XOSLauncher.unreadprovider");

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List A01(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r1 < r0) goto L_0x0060
            android.content.pm.PackageManager r2 = r8.getPackageManager()
            r6 = 0
            if (r2 == 0) goto L_0x004a
            java.lang.String r0 = "android.intent.action.MAIN"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            java.lang.String r0 = "android.intent.category.HOME"
            r1.addCategory(r0)
            android.content.pm.ResolveInfo r0 = r2.resolveActivity(r1, r6)     // Catch:{ NameNotFoundException -> 0x004c }
            if (r0 == 0) goto L_0x004a
            android.content.pm.ActivityInfo r0 = r0.activityInfo     // Catch:{ NameNotFoundException -> 0x004c }
            java.lang.String r1 = r0.packageName     // Catch:{ NameNotFoundException -> 0x004c }
            r0 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r0 = r2.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x004c }
            android.content.pm.PermissionInfo[] r5 = r0.permissions     // Catch:{ NameNotFoundException -> 0x004c }
            int r4 = r5.length     // Catch:{ NameNotFoundException -> 0x004c }
            r3 = 0
        L_0x002d:
            if (r3 >= r4) goto L_0x0048
            r2 = r5[r3]     // Catch:{ NameNotFoundException -> 0x004c }
            java.lang.String r1 = "com.transsion.hilauncher.permission.CHANGE_BADGE"
            java.lang.String r0 = r2.name     // Catch:{ NameNotFoundException -> 0x004c }
            boolean r0 = r1.equals(r0)     // Catch:{ NameNotFoundException -> 0x004c }
            if (r0 != 0) goto L_0x004a
            java.lang.String r1 = "com.transsion.XOSLauncher.permission.CHANGE_BADGE"
            java.lang.String r0 = r2.name     // Catch:{ NameNotFoundException -> 0x004c }
            boolean r0 = r1.equals(r0)     // Catch:{ NameNotFoundException -> 0x004c }
            if (r0 != 0) goto L_0x004a
            int r3 = r3 + 1
            goto L_0x002d
        L_0x0048:
            r0 = 1
            goto L_0x004d
        L_0x004a:
            r0 = 0
            goto L_0x004d
        L_0x004c:
            r0 = 0
        L_0x004d:
            if (r0 == 0) goto L_0x0060
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]
            java.lang.String r0 = "com.transsion.XOSLauncher"
            r2[r6] = r0
            r1 = 1
            java.lang.String r0 = "com.transsion.hilauncher"
            r2[r1] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            return r0
        L_0x0060:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28711am.A01(android.content.Context):java.util.List");
    }
}
