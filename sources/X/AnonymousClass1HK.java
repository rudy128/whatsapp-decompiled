package X;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.util.Log;

/* renamed from: X.1HK  reason: invalid class name */
public abstract class AnonymousClass1HK {
    public static Intent A00(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        String A01 = A01(activity);
        if (A01 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, A01);
        try {
            if (A02(componentName, activity) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(A01);
            sb.append("' in manifest");
            Log.e("NavUtils", sb.toString());
            return null;
        }
    }

    public static String A01(Activity activity) {
        try {
            return A02(activity.getComponentName(), activity);
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0019 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A02(android.content.ComponentName r5, android.content.Context r6) {
        /*
            android.content.pm.PackageManager r4 = r6.getPackageManager()
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            r1 = 640(0x280, float:8.97E-43)
            r0 = 29
            if (r3 < r0) goto L_0x001a
            r0 = 269221888(0x100c0000, float:2.7610132E-29)
        L_0x0010:
            r1 = r1 | r0
        L_0x0011:
            android.content.pm.ActivityInfo r1 = r4.getActivityInfo(r5, r1)
            java.lang.String r0 = r1.parentActivityName
            if (r0 == 0) goto L_0x001f
            return r0
        L_0x001a:
            if (r3 < r2) goto L_0x0011
            r0 = 786432(0xc0000, float:1.102026E-39)
            goto L_0x0010
        L_0x001f:
            android.os.Bundle r2 = r1.metaData
            r1 = 0
            if (r2 == 0) goto L_0x0049
            java.lang.String r0 = "android.support.PARENT_ACTIVITY"
            java.lang.String r2 = r2.getString(r0)
            if (r2 == 0) goto L_0x0049
            r0 = 0
            char r1 = r2.charAt(r0)
            r0 = 46
            if (r1 != r0) goto L_0x0048
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r6.getPackageName()
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
        L_0x0048:
            return r2
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HK.A02(android.content.ComponentName, android.content.Context):java.lang.String");
    }
}
