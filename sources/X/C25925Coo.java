package X;

import android.util.SparseArray;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Coo  reason: case insensitive filesystem */
public abstract class C25925Coo {
    public static final SparseArray A00 = BE6.A0Q();
    public static final Object A01 = C17880vN.A0p();
    public static final AtomicInteger A02 = BE7.A0v();

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0023, code lost:
        X.C25913CoX.A00((X.DOZ) null, "BloksDataStorage", "Casting error when retrieving data", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(java.lang.Class r5, java.lang.Integer r6) {
        /*
            r4 = 0
            if (r6 != 0) goto L_0x0004
            return r4
        L_0x0004:
            java.lang.Object r3 = A01     // Catch:{ ClassCastException -> 0x0022 }
            monitor-enter(r3)     // Catch:{ ClassCastException -> 0x0022 }
            android.util.SparseArray r2 = A00     // Catch:{ all -> 0x001f }
            int r1 = r6.intValue()     // Catch:{ all -> 0x001f }
            int r0 = r2.indexOfKey(r1)     // Catch:{ all -> 0x001f }
            if (r0 >= 0) goto L_0x0015
            r0 = r4
            goto L_0x001d
        L_0x0015:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x001f }
            java.lang.Object r0 = r5.cast(r0)     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r3)     // Catch:{ ClassCastException -> 0x0022 }
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ ClassCastException -> 0x0022 }
            throw r0     // Catch:{ ClassCastException -> 0x0022 }
        L_0x0022:
            r2 = move-exception
            java.lang.String r1 = "BloksDataStorage"
            java.lang.String r0 = "Casting error when retrieving data"
            X.C25913CoX.A00(r4, r1, r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25925Coo.A01(java.lang.Class, java.lang.Integer):java.lang.Object");
    }

    public static final int A00(Object obj) {
        int incrementAndGet = A02.incrementAndGet();
        synchronized (A01) {
            A00.append(incrementAndGet, obj);
        }
        return incrementAndGet;
    }
}
