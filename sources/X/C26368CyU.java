package X;

import android.os.Handler;

/* renamed from: X.CyU  reason: case insensitive filesystem */
public final /* synthetic */ class C26368CyU implements Handler.Callback {
    public final /* synthetic */ C26341Cxy A00;

    public /* synthetic */ C26368CyU(C26341Cxy cxy) {
        this.A00 = cxy;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r2 = r7.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r2.getBoolean("unsupported", false) == false) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r3.A01(new X.C1U("Not supported by GmsCore", (java.lang.Throwable) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        r3.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r7) {
        /*
            r6 = this;
            java.lang.String r5 = "MessengerIpcClient"
            int r4 = r7.arg1
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r5, r0)
            if (r0 == 0) goto L_0x0018
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Received response to request: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)
            android.util.Log.d(r5, r0)
        L_0x0018:
            X.Cxy r2 = r6.A00
            monitor-enter(r2)
            android.util.SparseArray r0 = r2.A03     // Catch:{ all -> 0x0059 }
            java.lang.Object r3 = r0.get(r4)     // Catch:{ all -> 0x0059 }
            X.Cc5 r3 = (X.C25264Cc5) r3     // Catch:{ all -> 0x0059 }
            if (r3 != 0) goto L_0x0034
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = "Received response for unknown request: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r4)     // Catch:{ all -> 0x0059 }
            android.util.Log.w(r5, r0)     // Catch:{ all -> 0x0059 }
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            goto L_0x0053
        L_0x0034:
            r0.remove(r4)     // Catch:{ all -> 0x0059 }
            r2.A00()     // Catch:{ all -> 0x0059 }
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            android.os.Bundle r2 = r7.getData()
            java.lang.String r1 = "unsupported"
            r0 = 0
            boolean r0 = r2.getBoolean(r1, r0)
            if (r0 == 0) goto L_0x0055
            java.lang.String r2 = "Not supported by GmsCore"
            r1 = 0
            X.C1U r0 = new X.C1U
            r0.<init>(r2, r1)
            r3.A01(r0)
        L_0x0053:
            r0 = 1
            return r0
        L_0x0055:
            r3.A00(r2)
            goto L_0x0053
        L_0x0059:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0059 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26368CyU.handleMessage(android.os.Message):boolean");
    }
}
