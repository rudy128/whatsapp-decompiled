package X;

import java.util.Random;

/* renamed from: X.1NV  reason: invalid class name */
public final class AnonymousClass1NV {
    public int A00;
    public boolean A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final Random A05;

    public AnonymousClass1NV(Random random, long j, long j2, long j3) {
        C18070vi.A0d(random, 1);
        this.A05 = random;
        this.A03 = j;
        this.A04 = j2;
        this.A02 = j3;
    }

    public final synchronized int A00() {
        return this.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.Long A01() {
        /*
            r8 = this;
            monitor-enter(r8)
            int r5 = r8.A00     // Catch:{ all -> 0x0048 }
            long r3 = (long) r5     // Catch:{ all -> 0x0048 }
            long r1 = r8.A03     // Catch:{ all -> 0x0048 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x000d
            monitor-exit(r8)
            r0 = 0
            return r0
        L_0x000d:
            r7 = 1
            int r2 = r5 + 1
            r8.A00 = r2     // Catch:{ all -> 0x0048 }
            boolean r0 = r8.A01     // Catch:{ all -> 0x0048 }
            if (r0 != 0) goto L_0x0040
            long r5 = r8.A02     // Catch:{ all -> 0x0048 }
            r0 = 50
            if (r2 <= r0) goto L_0x001e
            r2 = 50
        L_0x001e:
            r0 = 1
            long r0 = r0 << r2
            long r5 = r5 * r0
            r0 = 2
            long r3 = r5 / r0
            java.util.Random r0 = r8.A05     // Catch:{ all -> 0x0048 }
            long r0 = r0.nextLong()     // Catch:{ all -> 0x0048 }
            long r0 = r0 % r5
            long r0 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0048 }
            long r3 = r3 + r0
            long r1 = r8.A04     // Catch:{ all -> 0x0048 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003b
            r8.A01 = r7     // Catch:{ all -> 0x0048 }
            r3 = r1
        L_0x003b:
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0040:
            long r0 = r8.A04     // Catch:{ all -> 0x0048 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r8)
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NV.A01():java.lang.Long");
    }

    public final synchronized void A02() {
        this.A00 = 0;
    }
}
