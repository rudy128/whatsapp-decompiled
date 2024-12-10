package X;

import android.os.Handler;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.9wr  reason: invalid class name and case insensitive filesystem */
public abstract class C197539wr {
    public static final Handler A00 = C17890vO.A0D();
    public static final Field A01;
    public static final Field A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0012, code lost:
        if (r2 == 27) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(android.app.Activity r11) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r8 = 1
            if (r2 < r0) goto L_0x000b
            r11.recreate()
            return r8
        L_0x000b:
            r0 = 26
            if (r2 == r0) goto L_0x0014
            r1 = 27
            r0 = 0
            if (r2 != r1) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            r7 = 0
            if (r0 == 0) goto L_0x001d
            java.lang.reflect.Method r0 = A05
            if (r0 != 0) goto L_0x001d
        L_0x001c:
            return r7
        L_0x001d:
            java.lang.reflect.Method r0 = A03
            if (r0 != 0) goto L_0x0026
            java.lang.reflect.Method r0 = A04
            if (r0 != 0) goto L_0x0026
            return r7
        L_0x0026:
            java.lang.reflect.Field r0 = A02     // Catch:{ all -> 0x0090 }
            java.lang.Object r1 = r0.get(r11)     // Catch:{ all -> 0x0090 }
            if (r1 == 0) goto L_0x001c
            java.lang.reflect.Field r0 = A01     // Catch:{ all -> 0x0090 }
            java.lang.Object r10 = r0.get(r11)     // Catch:{ all -> 0x0090 }
            if (r10 == 0) goto L_0x001c
            android.app.Application r6 = r11.getApplication()     // Catch:{ all -> 0x0090 }
            X.A9G r5 = new X.A9G     // Catch:{ all -> 0x0090 }
            r5.<init>(r11)     // Catch:{ all -> 0x0090 }
            r6.registerActivityLifecycleCallbacks(r5)     // Catch:{ all -> 0x0090 }
            android.os.Handler r4 = A00     // Catch:{ all -> 0x0090 }
            X.Akc r0 = new X.Akc     // Catch:{ all -> 0x0090 }
            r0.<init>((java.lang.Object) r5, (java.lang.Object) r1, (int) r7)     // Catch:{ all -> 0x0090 }
            r4.post(r0)     // Catch:{ all -> 0x0090 }
            r0 = 26
            if (r2 == r0) goto L_0x0058
            r0 = 27
            if (r2 == r0) goto L_0x0058
            r11.recreate()     // Catch:{ all -> 0x0086 }
            goto L_0x007d
        L_0x0058:
            java.lang.reflect.Method r9 = A05     // Catch:{ all -> 0x0086 }
            r0 = 9
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x0086 }
            r3[r7] = r1     // Catch:{ all -> 0x0086 }
            r2 = 0
            r3[r8] = r2     // Catch:{ all -> 0x0086 }
            r0 = 2
            r3[r0] = r2     // Catch:{ all -> 0x0086 }
            X.C17890vO.A1G(r3, r7)     // Catch:{ all -> 0x0086 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0086 }
            X.C72453Mb.A1T(r1, r2, r3)     // Catch:{ all -> 0x0086 }
            r0 = 6
            r3[r0] = r2     // Catch:{ all -> 0x0086 }
            r0 = 7
            r3[r0] = r1     // Catch:{ all -> 0x0086 }
            r0 = 8
            r3[r0] = r1     // Catch:{ all -> 0x0086 }
            r9.invoke(r10, r3)     // Catch:{ all -> 0x0086 }
        L_0x007d:
            X.Akc r0 = new X.Akc     // Catch:{ all -> 0x0090 }
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r5, (int) r8)     // Catch:{ all -> 0x0090 }
            r4.post(r0)     // Catch:{ all -> 0x0090 }
            return r8
        L_0x0086:
            r1 = move-exception
            X.Akc r0 = new X.Akc     // Catch:{ all -> 0x0090 }
            r0.<init>((java.lang.Object) r6, (java.lang.Object) r5, (int) r8)     // Catch:{ all -> 0x0090 }
            r4.post(r0)     // Catch:{ all -> 0x0090 }
            throw r1     // Catch:{ all -> 0x0090 }
        L_0x0090:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197539wr.A00(android.app.Activity):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r2 == 27) goto L_0x0076;
     */
    static {
        /*
            android.os.Handler r0 = X.C17890vO.A0D()
            A00 = r0
            java.lang.String r0 = "android.app.ActivityThread"
            java.lang.Class r5 = java.lang.Class.forName(r0)     // Catch:{ all -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mMainThread"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x001b }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            A01 = r1
            java.lang.Class<android.app.Activity> r1 = android.app.Activity.class
            java.lang.String r0 = "mToken"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x002b }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r1 = 0
        L_0x002c:
            A02 = r1
            r6 = 0
            if (r5 == 0) goto L_0x004d
            java.lang.String r4 = "performStopActivity"
            r0 = 3
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch:{ all -> 0x004d }
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r0 = 0
            r3[r0] = r1     // Catch:{ all -> 0x004d }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x004d }
            r2 = 1
            r3[r2] = r0     // Catch:{ all -> 0x004d }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0 = 2
            r3[r0] = r1     // Catch:{ all -> 0x004d }
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r4, r3)     // Catch:{ all -> 0x004d }
            r0.setAccessible(r2)     // Catch:{ all -> 0x004d }
            r6 = r0
        L_0x004d:
            A04 = r6
            r4 = 0
            if (r5 == 0) goto L_0x0069
            java.lang.String r3 = "performStopActivity"
            r0 = 2
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x0069 }
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0069 }
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x0069 }
            r1 = 1
            r2[r1] = r0     // Catch:{ all -> 0x0069 }
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r3, r2)     // Catch:{ all -> 0x0069 }
            r0.setAccessible(r1)     // Catch:{ all -> 0x0069 }
            r4 = r0
        L_0x0069:
            A03 = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 == r0) goto L_0x0076
            r1 = 27
            r0 = 0
            if (r2 != r1) goto L_0x0077
        L_0x0076:
            r0 = 1
        L_0x0077:
            r7 = 0
            if (r0 == 0) goto L_0x00b0
            if (r5 == 0) goto L_0x00b0
            java.lang.String r6 = "requestRelaunchActivity"
            r0 = 9
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ all -> 0x00b0 }
            java.lang.Class<android.os.IBinder> r1 = android.os.IBinder.class
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x00b0 }
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r3 = 1
            r4[r3] = r1     // Catch:{ all -> 0x00b0 }
            r0 = 2
            r4[r0] = r1     // Catch:{ all -> 0x00b0 }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00b0 }
            r0 = 3
            r4[r0] = r1     // Catch:{ all -> 0x00b0 }
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x00b0 }
            r0 = 4
            r4[r0] = r2     // Catch:{ all -> 0x00b0 }
            java.lang.Class<android.content.res.Configuration> r1 = android.content.res.Configuration.class
            r0 = 5
            r4[r0] = r1     // Catch:{ all -> 0x00b0 }
            r0 = 6
            r4[r0] = r1     // Catch:{ all -> 0x00b0 }
            r0 = 7
            r4[r0] = r2     // Catch:{ all -> 0x00b0 }
            r0 = 8
            r4[r0] = r2     // Catch:{ all -> 0x00b0 }
            java.lang.reflect.Method r0 = r5.getDeclaredMethod(r6, r4)     // Catch:{ all -> 0x00b0 }
            r0.setAccessible(r3)     // Catch:{ all -> 0x00b0 }
            r7 = r0
        L_0x00b0:
            A05 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C197539wr.<clinit>():void");
    }
}
