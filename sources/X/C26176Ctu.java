package X;

import android.os.Handler;

/* renamed from: X.Ctu  reason: case insensitive filesystem */
public abstract class C26176Ctu {
    public static final C18100vl A00;
    public static final C18100vl A01;

    static {
        Integer num = AnonymousClass00R.A00;
        A00 = AnonymousClass1DF.A00(num, C27883DnK.A00);
        A01 = AnonymousClass1DF.A00(num, C27882DnJ.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0015, code lost:
        if (r2 == false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(java.util.concurrent.Future r7, int r8) {
        /*
            java.lang.String r5 = ", "
            java.lang.String r4 = "Unable to restore priority: "
            int r0 = android.os.Process.myTid()
            r6 = 1
            r3 = 0
            boolean r2 = X.AnonymousClass000.A1S(r8, r0)
            boolean r0 = r7.isDone()
            if (r0 != 0) goto L_0x0017
            r1 = 1
            if (r2 != 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = A03()
            if (r0 == 0) goto L_0x0036
            if (r1 == 0) goto L_0x0036
            int r0 = android.os.Process.myTid()
            int r1 = android.os.Process.getThreadPriority(r0)
            int r3 = android.os.Process.getThreadPriority(r8)
            r0 = r1
        L_0x002d:
            if (r1 >= r3) goto L_0x0037
            android.os.Process.setThreadPriority(r8, r0)     // Catch:{ SecurityException -> 0x0033 }
            goto L_0x0037
        L_0x0033:
            int r0 = r0 + 1
            goto L_0x002d
        L_0x0036:
            r6 = 0
        L_0x0037:
            java.lang.Object r0 = r7.get()     // Catch:{ ExecutionException -> 0x0070, InterruptedException -> 0x0066, CancellationException -> 0x0064 }
            if (r6 == 0) goto L_0x0063
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException -> 0x0052, SecurityException -> 0x0041 }
            return r0
        L_0x0041:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.BEA.A1P(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)
            throw r0
        L_0x0052:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.BEA.A1P(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)
            throw r0
        L_0x0063:
            return r0
        L_0x0064:
            r1 = move-exception
            goto L_0x0082
        L_0x0066:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x008b }
            java.lang.RuntimeException r2 = X.BE6.A0o(r0, r1)     // Catch:{ all -> 0x008b }
            goto L_0x008a
        L_0x0070:
            r1 = move-exception
            java.lang.Throwable r2 = r1.getCause()     // Catch:{ all -> 0x008b }
            boolean r0 = r2 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x008b }
            if (r0 != 0) goto L_0x008a
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x008b }
            java.lang.RuntimeException r2 = X.BE6.A0o(r0, r1)     // Catch:{ all -> 0x008b }
            goto L_0x008a
        L_0x0082:
            java.lang.String r0 = r1.getMessage()     // Catch:{ all -> 0x008b }
            java.lang.RuntimeException r2 = X.BE6.A0o(r0, r1)     // Catch:{ all -> 0x008b }
        L_0x008a:
            throw r2     // Catch:{ all -> 0x008b }
        L_0x008b:
            r0 = move-exception
            if (r6 == 0) goto L_0x00b4
            android.os.Process.setThreadPriority(r8, r3)     // Catch:{ IllegalArgumentException -> 0x00a3, SecurityException -> 0x0092 }
            throw r0
        L_0x0092:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.BEA.A1P(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)
            throw r0
        L_0x00a3:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.BEA.A1P(r4, r5, r0, r8, r3)
            java.lang.String r0 = r0.toString()
            java.lang.RuntimeException r0 = X.BE6.A0o(r0, r1)
            throw r0
        L_0x00b4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26176Ctu.A00(java.util.concurrent.Future, int):java.lang.Object");
    }

    public static final void A02(String str) {
        if (!AnonymousClass0GL.A00 && !A03()) {
            if (str == null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("This must run on the main thread; but is running on ");
                str = AnonymousClass000.A0y(Thread.currentThread().getName(), A10);
            }
            throw AnonymousClass000.A0n(str);
        }
    }

    public static final void A01(Runnable runnable) {
        if (A03()) {
            runnable.run();
        } else {
            ((Handler) A00.getValue()).post(runnable);
        }
    }

    public static final boolean A03() {
        return AnonymousClass000.A1Z(BE8.A0k(), Thread.currentThread());
    }
}
