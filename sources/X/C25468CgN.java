package X;

import java.lang.reflect.Method;

/* renamed from: X.CgN  reason: case insensitive filesystem */
public class C25468CgN {
    public static Boolean A00;
    public static final Method A01;
    public static final Method A02;
    public static final Method A03;
    public static final Method A04;
    public static final Method A05;
    public static final Method A06;
    public static final Method A07;
    public static final Method A08;

    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008d  */
    static {
        /*
            java.lang.String r3 = "add"
            android.os.Process.myUid()
            r5 = 1
            r6 = 0
            r4 = 0
            java.lang.Class<android.os.WorkSource> r0 = android.os.WorkSource.class
            java.lang.reflect.Method r0 = X.BE9.A0v(r0, r3)     // Catch:{ Exception -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r0 = r4
        L_0x0010:
            A01 = r0
            r10 = 2
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0022 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0022 }
            r1[r6] = r0     // Catch:{ Exception -> 0x0022 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.reflect.Method r0 = X.BE6.A0x(r2, r0, r3, r1, r5)     // Catch:{ Exception -> 0x0022 }
            goto L_0x0023
        L_0x0022:
            r0 = r4
        L_0x0023:
            A02 = r0
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "size"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0030 }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x0030 }
            goto L_0x0031
        L_0x0030:
            r0 = r4
        L_0x0031:
            A03 = r0
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r0 = "get"
            java.lang.reflect.Method r0 = X.BE9.A0v(r1, r0)     // Catch:{ Exception -> 0x003c }
            goto L_0x003d
        L_0x003c:
            r0 = r4
        L_0x003d:
            A04 = r0
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            java.lang.String r0 = "getName"
            java.lang.reflect.Method r0 = X.BE9.A0v(r1, r0)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0049
        L_0x0048:
            r0 = r4
        L_0x0049:
            A05 = r0
            int r8 = android.os.Build.VERSION.SDK_INT
            r7 = 28
            boolean r0 = X.C108975cc.A1C(r8, r7)
            java.lang.String r9 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x0068
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "createWorkChain"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x0062 }
            java.lang.reflect.Method r0 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x0062 }
            goto L_0x0069
        L_0x0062:
            r1 = move-exception
            java.lang.String r0 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r9, r0, r1)
        L_0x0068:
            r0 = r4
        L_0x0069:
            A06 = r0
            if (r8 < r7) goto L_0x0088
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r3 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = "addNode"
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ Exception -> 0x0082 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ Exception -> 0x0082 }
            r1[r6] = r0     // Catch:{ Exception -> 0x0082 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.reflect.Method r0 = X.BE6.A0x(r3, r0, r2, r1, r5)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0089
        L_0x0082:
            r1 = move-exception
            java.lang.String r0 = "Missing WorkChain class"
            android.util.Log.w(r9, r0, r1)
        L_0x0088:
            r0 = r4
        L_0x0089:
            A07 = r0
            if (r8 < r7) goto L_0x009a
            java.lang.Class<android.os.WorkSource> r2 = android.os.WorkSource.class
            java.lang.String r1 = "isEmpty"
            java.lang.Class[] r0 = new java.lang.Class[r6]     // Catch:{ Exception -> 0x009a }
            java.lang.reflect.Method r4 = r2.getMethod(r1, r0)     // Catch:{ Exception -> 0x009a }
            r4.setAccessible(r5)     // Catch:{ Exception -> 0x009a }
        L_0x009a:
            A08 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25468CgN.<clinit>():void");
    }
}
