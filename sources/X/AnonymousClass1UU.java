package X;

import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.LinkedList;

/* renamed from: X.1UU  reason: invalid class name */
public class AnonymousClass1UU {
    public static final int[] A01 = {0, 0, 0, 2000, 5000, SearchActionVerificationClientService.NOTIFICATION_ID, 20000, 40000, 80000, 160000};
    public LinkedList A00;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        return 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long A00() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.LinkedList r8 = r9.A00     // Catch:{ all -> 0x0043 }
            int r3 = r8.size()     // Catch:{ all -> 0x0043 }
        L_0x0007:
            int r3 = r3 + -1
            if (r3 < 0) goto L_0x003f
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0043 }
            java.lang.Object r0 = r8.get(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0043 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0043 }
            long r6 = r6 - r0
            int[] r2 = A01     // Catch:{ all -> 0x0043 }
            int r1 = r3 + 1
            r0 = 9
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0043 }
            r0 = r2[r0]     // Catch:{ all -> 0x0043 }
            long r4 = (long) r0     // Catch:{ all -> 0x0043 }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x0007
            if (r3 <= 0) goto L_0x003f
            java.lang.Object r0 = r8.get(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0043 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x0043 }
            long r2 = r2 + r4
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0043 }
            long r2 = r2 - r0
            monitor-exit(r9)
            return r2
        L_0x003f:
            monitor-exit(r9)
            r0 = 0
            return r0
        L_0x0043:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1UU.A00():long");
    }

    public AnonymousClass1UU() {
        synchronized (this) {
            this.A00 = new LinkedList();
        }
    }
}
