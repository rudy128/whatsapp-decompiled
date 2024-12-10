package X;

import android.os.CancellationSignal;

@Deprecated
/* renamed from: X.1yT  reason: invalid class name and case insensitive filesystem */
public final class C42621yT {
    public AnonymousClass3K9 A00;
    public boolean A01;
    public boolean A02;
    public Object A03;

    public Object A00() {
        Object obj;
        synchronized (this) {
            if (this.A03 == null) {
                CancellationSignal cancellationSignal = new CancellationSignal();
                this.A03 = cancellationSignal;
                if (this.A02) {
                    cancellationSignal.cancel();
                }
            }
            obj = this.A03;
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        ((X.D6H) r0).A01.A08();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r2 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        ((android.os.CancellationSignal) r2).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r3.A01 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3.A01 = false;
        notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0035, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0012, code lost:
        if (r0 == null) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A02     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            return
        L_0x0007:
            r0 = 1
            r3.A02 = r0     // Catch:{ all -> 0x003a }
            r3.A01 = r0     // Catch:{ all -> 0x003a }
            X.3K9 r0 = r3.A00     // Catch:{ all -> 0x003a }
            java.lang.Object r2 = r3.A03     // Catch:{ all -> 0x003a }
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            r1 = 0
            if (r0 == 0) goto L_0x001b
            X.D6H r0 = (X.D6H) r0     // Catch:{ all -> 0x0023 }
            X.1LG r0 = r0.A01     // Catch:{ all -> 0x0023 }
            r0.A08()     // Catch:{ all -> 0x0023 }
        L_0x001b:
            if (r2 == 0) goto L_0x002f
            android.os.CancellationSignal r2 = (android.os.CancellationSignal) r2     // Catch:{ all -> 0x0023 }
            r2.cancel()     // Catch:{ all -> 0x0023 }
            goto L_0x002f
        L_0x0023:
            r0 = move-exception
            monitor-enter(r3)
            r3.A01 = r1     // Catch:{ all -> 0x002c }
            r3.notifyAll()     // Catch:{ all -> 0x002c }
        L_0x002a:
            monitor-exit(r3)     // Catch:{ all -> 0x002c }
            goto L_0x002e
        L_0x002c:
            r0 = move-exception
            goto L_0x002a
        L_0x002e:
            throw r0
        L_0x002f:
            monitor-enter(r3)
            r3.A01 = r1     // Catch:{ all -> 0x0037 }
            r3.notifyAll()     // Catch:{ all -> 0x0037 }
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            return
        L_0x0037:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0037 }
            throw r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42621yT.A01():void");
    }

    public boolean A03() {
        boolean z;
        synchronized (this) {
            z = this.A02;
        }
        return z;
    }

    public void A02() {
        if (A03()) {
            throw new AnonymousClass1QC();
        }
    }
}
