package X;

/* renamed from: X.1cw  reason: invalid class name and case insensitive filesystem */
public final class C29831cw {
    public int A00;
    public int A01;
    public final AnonymousClass190 A02;
    public final Object A03 = new Object();

    public C29831cw(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A02 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent A00(android.content.Context r8, android.content.BroadcastReceiver r9, android.content.IntentFilter r10, java.lang.String r11, android.os.Handler r12, boolean r13) {
        /*
            r7 = this;
            r0 = 0
            r1 = r8
            X.C18070vi.A0d(r8, r0)
            r3 = r10
            r10.getAction(r0)
            boolean r0 = X.AnonymousClass112.A0A()     // Catch:{ IllegalStateException -> 0x0033 }
            r2 = r9
            r4 = r11
            r5 = r12
            if (r0 == 0) goto L_0x001d
            com.whatsapp.core.RuntimeReceiverCompat$Api34Utils r0 = com.whatsapp.core.RuntimeReceiverCompat$Api34Utils.INSTANCE     // Catch:{ IllegalStateException -> 0x0033 }
            r6 = r13
            android.content.Intent r2 = r0.registerReceiver(r1, r2, r3, r4, r5, r6)     // Catch:{ IllegalStateException -> 0x0033 }
        L_0x0019:
            java.lang.Object r1 = r7.A03     // Catch:{ IllegalStateException -> 0x0033 }
            monitor-enter(r1)     // Catch:{ IllegalStateException -> 0x0033 }
            goto L_0x0022
        L_0x001d:
            android.content.Intent r2 = r8.registerReceiver(r9, r10, r11, r12)     // Catch:{ IllegalStateException -> 0x0033 }
            goto L_0x0019
        L_0x0022:
            int r0 = r7.A01     // Catch:{ all -> 0x0030 }
            int r0 = r0 + 1
            r7.A01 = r0     // Catch:{ all -> 0x0030 }
            int r0 = r7.A00     // Catch:{ all -> 0x0030 }
            int r0 = r0 + 1
            r7.A00 = r0     // Catch:{ all -> 0x0030 }
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x0033 }
            return r2
        L_0x0030:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x0033 }
            throw r0     // Catch:{ IllegalStateException -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29831cw.A00(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, java.lang.String, android.os.Handler, boolean):android.content.Intent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent A01(android.content.Context r4, android.content.BroadcastReceiver r5, android.content.IntentFilter r6, boolean r7) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r6.getAction(r0)
            boolean r0 = X.AnonymousClass112.A0A()     // Catch:{ IllegalStateException -> 0x002d }
            if (r0 == 0) goto L_0x0017
            com.whatsapp.core.RuntimeReceiverCompat$Api34Utils r0 = com.whatsapp.core.RuntimeReceiverCompat$Api34Utils.INSTANCE     // Catch:{ IllegalStateException -> 0x002d }
            android.content.Intent r2 = r0.registerReceiver(r4, r5, r6, r7)     // Catch:{ IllegalStateException -> 0x002d }
        L_0x0013:
            java.lang.Object r1 = r3.A03     // Catch:{ IllegalStateException -> 0x002d }
            monitor-enter(r1)     // Catch:{ IllegalStateException -> 0x002d }
            goto L_0x001c
        L_0x0017:
            android.content.Intent r2 = r4.registerReceiver(r5, r6)     // Catch:{ IllegalStateException -> 0x002d }
            goto L_0x0013
        L_0x001c:
            int r0 = r3.A01     // Catch:{ all -> 0x002a }
            int r0 = r0 + 1
            r3.A01 = r0     // Catch:{ all -> 0x002a }
            int r0 = r3.A00     // Catch:{ all -> 0x002a }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x002a }
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x002d }
            return r2
        L_0x002a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x002d }
            throw r0     // Catch:{ IllegalStateException -> 0x002d }
        L_0x002d:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29831cw.A01(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter, boolean):android.content.Intent");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0015, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        if (X.AnonymousClass112.A02() != false) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        com.whatsapp.core.RuntimeReceiverCompat$Api24Utils.INSTANCE.logCriticalEventIfDeadSystemExceptionOrThrow(r3.A02, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.BroadcastReceiver r4, android.content.Context r5) {
        /*
            r3 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            r5.unregisterReceiver(r4)     // Catch:{ IllegalArgumentException -> 0x0023, RuntimeException -> 0x0015 }
            java.lang.Object r1 = r3.A03     // Catch:{ IllegalArgumentException -> 0x0023, RuntimeException -> 0x0015 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x0023, RuntimeException -> 0x0015 }
            int r0 = r3.A00     // Catch:{ all -> 0x0012 }
            int r0 = r0 + -1
            r3.A00 = r0     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)     // Catch:{ IllegalArgumentException -> 0x0023, RuntimeException -> 0x0015 }
            return
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ IllegalArgumentException -> 0x0023, RuntimeException -> 0x0015 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0023, RuntimeException -> 0x0015 }
        L_0x0015:
            r2 = move-exception
            boolean r0 = X.AnonymousClass112.A02()
            if (r0 == 0) goto L_0x0024
            com.whatsapp.core.RuntimeReceiverCompat$Api24Utils r1 = com.whatsapp.core.RuntimeReceiverCompat$Api24Utils.INSTANCE
            X.190 r0 = r3.A02
            r1.logCriticalEventIfDeadSystemExceptionOrThrow(r0, r2)
        L_0x0023:
            return
        L_0x0024:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29831cw.A02(android.content.BroadcastReceiver, android.content.Context):void");
    }
}
