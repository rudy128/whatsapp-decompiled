package X;

import java.util.Set;

public class A84 {
    public static int A00 = 14;
    public static final Set A01 = C17880vN.A12();

    public static Object A00(C189009iM r2, C36821oW r3, String str) {
        int i;
        synchronized (A84.class) {
            i = A00;
        }
        return A01(r2, r3, str, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a9, code lost:
        if (r4 <= 0) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Google Drive failures/total attempts: ");
        r1.append(r4);
        r1.append("/");
        r1 = new X.C167618gg(X.C17880vN.A0t(r1, r9.A00()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A01(X.C189009iM r17, X.C36821oW r18, java.lang.String r19, int r20) {
        /*
            java.lang.String r2 = "gdrive-retry-task/execute/attempt-"
            java.util.Random r10 = new java.util.Random
            r10.<init>()
            r0 = r20
            long r11 = (long) r0
            r13 = 3600000(0x36ee80, double:1.7786363E-317)
            r0 = 1
            X.C18070vi.A0d(r10, r0)
            r15 = 1000(0x3e8, double:4.94E-321)
            X.1NV r9 = new X.1NV
            r9.<init>(r10, r11, r13, r15)
            java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00d2 }
            java.util.Set r0 = A01     // Catch:{ all -> 0x00d2 }
            monitor-enter(r0)     // Catch:{ all -> 0x00d2 }
            r0.add(r5)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b0 }
            r0.size()     // Catch:{ all -> 0x00d2 }
            r4 = 0
        L_0x0027:
            r7 = 0
            r3 = r18
            if (r18 == 0) goto L_0x003c
            boolean r0 = r3.A01()     // Catch:{ all -> 0x00d2 }
            if (r0 != 0) goto L_0x003c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "gdrive-retry-task/condition-failed/"
            X.C17900vP.A0Y(r3, r0, r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x00ac
        L_0x003c:
            r8 = r19
            int r0 = r9.A00()     // Catch:{ 8gq -> 0x0058 }
            r1 = r17
            java.lang.Object r3 = r1.A01(r0)     // Catch:{ 8gq -> 0x0058 }
            if (r3 == 0) goto L_0x0056
            if (r0 <= 0) goto L_0x009e
            java.lang.StringBuilder r1 = X.AnonymousClass8BW.A0n(r0, r2)     // Catch:{ 8gq -> 0x0058 }
            java.lang.String r0 = "/success: "
            X.C17900vP.A0f(r0, r8, r1)     // Catch:{ 8gq -> 0x0058 }
            goto L_0x009e
        L_0x0056:
            r6 = -1
            goto L_0x0062
        L_0x0058:
            r1 = move-exception
            int r4 = r4 + 1
            java.lang.String r0 = "gdrive-retry-task/execute"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00d2 }
            int r6 = r1.retryAfter     // Catch:{ all -> 0x00d2 }
        L_0x0062:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r2)     // Catch:{ all -> 0x00d2 }
            int r0 = r9.A00()     // Catch:{ all -> 0x00d2 }
            r1.append(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "/failed: "
            X.C17900vP.A0f(r0, r8, r1)     // Catch:{ all -> 0x00d2 }
            java.lang.Long r3 = r9.A01()     // Catch:{ all -> 0x00d2 }
            if (r3 == 0) goto L_0x00a9
            if (r6 <= 0) goto L_0x0085
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00d2 }
            long r0 = (long) r6     // Catch:{ all -> 0x00d2 }
            long r0 = r3.toMillis(r0)     // Catch:{ all -> 0x00d2 }
            java.lang.Long r3 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d2 }
        L_0x0085:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ InterruptedException -> 0x00a2 }
            java.lang.String r0 = "gdrive/gdrive-retry-task backoff for "
            r1.append(r0)     // Catch:{ InterruptedException -> 0x00a2 }
            r1.append(r3)     // Catch:{ InterruptedException -> 0x00a2 }
            java.lang.String r0 = " milliseconds"
            X.C17890vO.A1A(r1, r0)     // Catch:{ InterruptedException -> 0x00a2 }
            long r0 = r3.longValue()     // Catch:{ InterruptedException -> 0x00a2 }
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00a2 }
            goto L_0x0027
        L_0x009e:
            A04(r5)
            return r3
        L_0x00a2:
            r1 = move-exception
            java.lang.String r0 = "gdrive-retry-task/interrupted"
            com.whatsapp.util.Log.i(r0, r1)     // Catch:{ all -> 0x00d2 }
            goto L_0x00ac
        L_0x00a9:
            if (r4 <= 0) goto L_0x00ac
            goto L_0x00b3
        L_0x00ac:
            A04(r5)
            return r7
        L_0x00b0:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00d1
        L_0x00b3:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "Google Drive failures/total attempts: "
            r1.append(r0)     // Catch:{ all -> 0x00d2 }
            r1.append(r4)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch:{ all -> 0x00d2 }
            int r0 = r9.A00()     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x00d2 }
            X.8gg r1 = new X.8gg     // Catch:{ all -> 0x00d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x00d2 }
        L_0x00d1:
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r1 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            A04(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A84.A01(X.9iM, X.1oW, java.lang.String, int):java.lang.Object");
    }

    public static void A02() {
        Set<Thread> set = A01;
        synchronized (set) {
            for (Thread interrupt : set) {
                interrupt.interrupt();
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("gdrive-retry-task/interrupt-active-tasks/size/");
        C17900vP.A0o(A10, set.size());
    }

    public static synchronized void A03() {
        synchronized (A84.class) {
            A00 = 14;
        }
    }

    public static void A04(Thread thread) {
        Set set = A01;
        synchronized (set) {
            set.remove(thread);
        }
        set.size();
    }
}
