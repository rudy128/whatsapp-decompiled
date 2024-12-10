package X;

import java.util.HashMap;
import java.util.Map;

/* renamed from: X.165  reason: invalid class name */
public class AnonymousClass165 {
    public final Map A00 = new HashMap();

    public synchronized void A00(int i, int i2) {
        Map map = (Map) this.A00.get(Integer.valueOf(i));
        if (map != null) {
            Integer valueOf = Integer.valueOf(i2);
            Integer num = (Integer) map.get(valueOf);
            if (num != null) {
                map.put(valueOf, Integer.valueOf(num.intValue() + 1));
            }
        }
    }

    public synchronized void A01(int i, int i2, int i3) {
        Map map = (Map) this.A00.get(Integer.valueOf(i));
        if (map != null) {
            Integer valueOf = Integer.valueOf(i2);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, Integer.valueOf(i3));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A02(int r3, int r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.Map r1 = r2.A00     // Catch:{ all -> 0x0021 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0021 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0021 }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ all -> 0x0021 }
            if (r1 == 0) goto L_0x001e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0021 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0021 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r2)
            r0 = 1
            return r0
        L_0x001e:
            monitor-exit(r2)
            r0 = 0
            return r0
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass165.A02(int, int):boolean");
    }
}
