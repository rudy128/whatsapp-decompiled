package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.00z  reason: invalid class name and case insensitive filesystem */
public class C002100z {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public final AnonymousClass011 A06;
    public final AnonymousClass010 A07;

    public int A03(Object obj) {
        return 1;
    }

    public final Object A04(Object obj) {
        C18070vi.A0d(obj, 0);
        synchronized (this.A06) {
            Object obj2 = this.A07.A00.get(obj);
            if (obj2 != null) {
                this.A01++;
                return obj2;
            }
            this.A03++;
            return null;
        }
    }

    public final Object A05(Object obj) {
        Object A002;
        C18070vi.A0d(obj, 0);
        synchronized (this.A06) {
            A002 = this.A07.A00(obj);
            if (A002 != null) {
                this.A05 -= A00(obj, A002);
            }
        }
        if (A002 != null) {
            A09(false, obj, A002, (Object) null);
        }
        return A002;
    }

    public final void A08(Object obj, Object obj2) {
        Object put;
        C18070vi.A0d(obj, 0);
        C18070vi.A0d(obj2, 1);
        synchronized (this.A06) {
            this.A04++;
            this.A05 += A00(obj, obj2);
            put = this.A07.A00.put(obj, obj2);
            if (put != null) {
                this.A05 -= A00(obj, put);
            }
        }
        if (put != null) {
            A09(false, obj, put, obj2);
        }
        A07(this.A02);
    }

    public void A09(boolean z, Object obj, Object obj2, Object obj3) {
    }

    public final int A01() {
        int i;
        synchronized (this.A06) {
            i = this.A02;
        }
        return i;
    }

    public final int A02() {
        int i;
        synchronized (this.A06) {
            i = this.A05;
        }
        return i;
    }

    public final LinkedHashMap A06() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.A06) {
            for (Map.Entry entry : this.A07.A01()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(int r7) {
        /*
            r6 = this;
        L_0x0000:
            X.011 r4 = r6.A06
            monitor-enter(r4)
            int r2 = r6.A05     // Catch:{ all -> 0x0052 }
            if (r2 < 0) goto L_0x004a
            X.010 r5 = r6.A07     // Catch:{ all -> 0x0052 }
            java.util.LinkedHashMap r1 = r5.A00     // Catch:{ all -> 0x0052 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0013
            if (r2 != 0) goto L_0x004a
        L_0x0013:
            if (r2 <= r7) goto L_0x0048
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0048
            java.util.Set r0 = r5.A01()     // Catch:{ all -> 0x0052 }
            java.lang.Object r0 = X.C29431cG.A0Y(r0)     // Catch:{ all -> 0x0052 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0048
            java.lang.Object r3 = r0.getKey()     // Catch:{ all -> 0x0052 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x0052 }
            r5.A00(r3)     // Catch:{ all -> 0x0052 }
            int r1 = r6.A05     // Catch:{ all -> 0x0052 }
            int r0 = r6.A00(r3, r2)     // Catch:{ all -> 0x0052 }
            int r1 = r1 - r0
            r6.A05 = r1     // Catch:{ all -> 0x0052 }
            int r0 = r6.A00     // Catch:{ all -> 0x0052 }
            r1 = 1
            int r0 = r0 + 1
            r6.A00 = r0     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)
            r0 = 0
            r6.A09(r1, r3, r2, r0)
            goto L_0x0000
        L_0x0048:
            monitor-exit(r4)
            return
        L_0x004a:
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0052 }
            r0.<init>(r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C002100z.A07(int):void");
    }

    public String toString() {
        String obj;
        synchronized (this.A06) {
            int i = this.A01;
            int i2 = this.A03;
            int i3 = i2 + i;
            int i4 = 0;
            if (i3 != 0) {
                i4 = (i * 100) / i3;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("LruCache[maxSize=");
            sb.append(this.A02);
            sb.append(",hits=");
            sb.append(i);
            sb.append(",misses=");
            sb.append(i2);
            sb.append(",hitRate=");
            sb.append(i4);
            sb.append("%]");
            obj = sb.toString();
        }
        return obj;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.011, java.lang.Object] */
    public C002100z(int i) {
        this.A02 = i;
        if (i > 0) {
            this.A07 = new AnonymousClass010(0);
            this.A06 = new Object();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final int A00(Object obj, Object obj2) {
        int A032 = A03(obj2);
        if (A032 >= 0) {
            return A032;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Negative size: ");
        sb.append(obj);
        sb.append('=');
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }
}
