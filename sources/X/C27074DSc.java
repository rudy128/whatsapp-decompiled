package X;

/* renamed from: X.DSc  reason: case insensitive filesystem */
public final /* synthetic */ class C27074DSc implements Runnable {
    public final /* synthetic */ C26341Cxy A00;

    public /* synthetic */ C27074DSc(C26341Cxy cxy) {
        this.A00 = cxy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (android.util.Log.isLoggable("MessengerIpcClient", 3) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        android.util.Log.d("MessengerIpcClient", "Sending ".concat(java.lang.String.valueOf(java.lang.String.valueOf(r6))));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        r1 = r2.A02;
        r0 = r6.A01;
        r5 = r4.A02;
        r4 = android.os.Message.obtain();
        r4.what = r0;
        r4.arg1 = r7;
        r4.replyTo = r1;
        r3 = X.C17880vN.A0D();
        r3.putBoolean("oneWay", r6.A03());
        r3.putString("pkg", r5.getPackageName());
        r3.putBundle("data", r6.A02);
        r4.setData(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1 = r2.A01;
        r0 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        if (r0 != null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        r0 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0088, code lost:
        if (r0 == null) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008a, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        r0.send(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        throw X.AnonymousClass000.A0n("Both messengers are null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r2.A01(r0.getMessage());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
        L_0x0000:
            X.Cxy r2 = r9.A00
            monitor-enter(r2)
            int r1 = r2.A00     // Catch:{ all -> 0x00a3 }
            r0 = 2
            if (r1 != r0) goto L_0x0013
            java.util.Queue r1 = r2.A04     // Catch:{ all -> 0x00a3 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00a3 }
            if (r0 == 0) goto L_0x0016
            r2.A00()     // Catch:{ all -> 0x00a3 }
        L_0x0013:
            monitor-exit(r2)     // Catch:{ all -> 0x00a3 }
            goto L_0x00a2
        L_0x0016:
            java.lang.Object r6 = r1.poll()     // Catch:{ all -> 0x00a3 }
            X.Cc5 r6 = (X.C25264Cc5) r6     // Catch:{ all -> 0x00a3 }
            android.util.SparseArray r0 = r2.A03     // Catch:{ all -> 0x00a3 }
            int r7 = r6.A00     // Catch:{ all -> 0x00a3 }
            r0.put(r7, r6)     // Catch:{ all -> 0x00a3 }
            X.Cpw r4 = r2.A05     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.ScheduledExecutorService r8 = r4.A03     // Catch:{ all -> 0x00a3 }
            r0 = 42
            X.DTa r5 = new X.DTa     // Catch:{ all -> 0x00a3 }
            r5.<init>(r2, r6, r0)     // Catch:{ all -> 0x00a3 }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x00a3 }
            r0 = 30
            r8.schedule(r5, r0, r3)     // Catch:{ all -> 0x00a3 }
            monitor-exit(r2)     // Catch:{ all -> 0x00a3 }
            java.lang.String r3 = "MessengerIpcClient"
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = java.lang.String.valueOf(r6)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "Sending "
            java.lang.String r0 = r0.concat(r1)
            android.util.Log.d(r3, r0)
        L_0x0050:
            android.os.Messenger r1 = r2.A02
            int r0 = r6.A01
            android.content.Context r5 = r4.A02
            android.os.Message r4 = android.os.Message.obtain()
            r4.what = r0
            r4.arg1 = r7
            r4.replyTo = r1
            android.os.Bundle r3 = X.C17880vN.A0D()
            boolean r1 = r6.A03()
            java.lang.String r0 = "oneWay"
            r3.putBoolean(r0, r1)
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "pkg"
            r3.putString(r0, r1)
            android.os.Bundle r1 = r6.A02
            java.lang.String r0 = "data"
            r3.putBundle(r0, r1)
            r4.setData(r3)
            X.CNp r1 = r2.A01     // Catch:{ RemoteException -> 0x0098 }
            android.os.Messenger r0 = r1.A00     // Catch:{ RemoteException -> 0x0098 }
            if (r0 != 0) goto L_0x008c
            X.D3G r0 = r1.A01     // Catch:{ RemoteException -> 0x0098 }
            if (r0 == 0) goto L_0x0091
            android.os.Messenger r0 = r0.A00     // Catch:{ RemoteException -> 0x0098 }
        L_0x008c:
            r0.send(r4)     // Catch:{ RemoteException -> 0x0098 }
            goto L_0x0000
        L_0x0091:
            java.lang.String r0 = "Both messengers are null"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ RemoteException -> 0x0098 }
            throw r0     // Catch:{ RemoteException -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2.A01(r0)
            goto L_0x0000
        L_0x00a2:
            return
        L_0x00a3:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00a3 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27074DSc.run():void");
    }
}
