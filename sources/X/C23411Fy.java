package X;

/* renamed from: X.1Fy  reason: invalid class name and case insensitive filesystem */
public abstract class C23411Fy {
    public int A00;
    public C27601Ws[] A01;
    public int A02;
    public AnonymousClass3JQ A03;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C27601Ws A08() {
        /*
            r11 = this;
            monitor-enter(r11)
            X.1Ws[] r0 = r11.A01     // Catch:{ all -> 0x0095 }
            if (r0 != 0) goto L_0x0069
            boolean r0 = r11 instanceof X.AnonymousClass1G7     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0065
            r0 = 2
            X.1Wt[] r0 = new X.C27611Wt[r0]     // Catch:{ all -> 0x0095 }
        L_0x000c:
            r11.A01 = r0     // Catch:{ all -> 0x0095 }
        L_0x000e:
            int r9 = r11.A02     // Catch:{ all -> 0x0095 }
        L_0x0010:
            r5 = r0[r9]     // Catch:{ all -> 0x0095 }
            if (r5 != 0) goto L_0x001f
            boolean r1 = r11 instanceof X.AnonymousClass1G7     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x005f
            X.1Wt r5 = new X.1Wt     // Catch:{ all -> 0x0095 }
            r5.<init>()     // Catch:{ all -> 0x0095 }
        L_0x001d:
            r0[r9] = r5     // Catch:{ all -> 0x0095 }
        L_0x001f:
            int r9 = r9 + 1
            int r1 = r0.length     // Catch:{ all -> 0x0095 }
            if (r9 < r1) goto L_0x0025
            r9 = 0
        L_0x0025:
            r10 = r11
            boolean r1 = r5 instanceof X.C27611Wt     // Catch:{ all -> 0x0095 }
            if (r1 == 0) goto L_0x0045
            r1 = r5
            X.1Wt r1 = (X.C27611Wt) r1     // Catch:{ all -> 0x0095 }
            java.util.concurrent.atomic.AtomicReference r2 = r1.A00     // Catch:{ all -> 0x0095 }
            java.lang.Object r1 = r2.get()     // Catch:{ all -> 0x0095 }
            if (r1 != 0) goto L_0x0010
            X.1I8 r0 = X.C34071js.A00     // Catch:{ all -> 0x0095 }
            r2.set(r0)     // Catch:{ all -> 0x0095 }
        L_0x003a:
            r11.A02 = r9     // Catch:{ all -> 0x0095 }
            int r0 = r11.A00     // Catch:{ all -> 0x0095 }
            int r0 = r0 + 1
            r11.A00 = r0     // Catch:{ all -> 0x0095 }
            X.3JQ r1 = r11.A03     // Catch:{ all -> 0x0095 }
            goto L_0x007a
        L_0x0045:
            r8 = r5
            X.3JR r8 = (X.AnonymousClass3JR) r8     // Catch:{ all -> 0x0095 }
            X.1Ph r10 = (X.C25701Ph) r10     // Catch:{ all -> 0x0095 }
            long r6 = r8.A00     // Catch:{ all -> 0x0095 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0010
            long r3 = r10.A03     // Catch:{ all -> 0x0095 }
            long r1 = r10.A02     // Catch:{ all -> 0x0095 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005c
            r10.A02 = r3     // Catch:{ all -> 0x0095 }
        L_0x005c:
            r8.A00 = r3     // Catch:{ all -> 0x0095 }
            goto L_0x003a
        L_0x005f:
            X.3JR r5 = new X.3JR     // Catch:{ all -> 0x0095 }
            r5.<init>()     // Catch:{ all -> 0x0095 }
            goto L_0x001d
        L_0x0065:
            r0 = 2
            X.3JR[] r0 = new X.AnonymousClass3JR[r0]     // Catch:{ all -> 0x0095 }
            goto L_0x000c
        L_0x0069:
            int r2 = r11.A00     // Catch:{ all -> 0x0095 }
            int r1 = r0.length     // Catch:{ all -> 0x0095 }
            if (r2 < r1) goto L_0x000e
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x0095 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0095 }
            X.1Ws[] r0 = (X.C27601Ws[]) r0     // Catch:{ all -> 0x0095 }
            goto L_0x000c
        L_0x007a:
            monitor-exit(r11)
            if (r1 == 0) goto L_0x0094
            monitor-enter(r1)
            java.lang.Object r0 = X.AnonymousClass3JQ.A00(r1)     // Catch:{ all -> 0x0090 }
            int r0 = X.AnonymousClass000.A0M(r0)     // Catch:{ all -> 0x0090 }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0090 }
            r1.CPw(r0)     // Catch:{ all -> 0x0090 }
            goto L_0x0093
        L_0x0090:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0093:
            monitor-exit(r1)
        L_0x0094:
            return r5
        L_0x0095:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23411Fy.A08():X.1Ws");
    }

    public final void A09(C27601Ws r8) {
        AnonymousClass3JQ r4;
        int i;
        C30391dr[] r3;
        synchronized (this) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            r4 = this.A03;
            if (i2 == 0) {
                this.A02 = 0;
            }
            C18070vi.A0z(r8, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            if (r8 instanceof C27611Wt) {
                ((C27611Wt) r8).A00.set((Object) null);
                r3 = AnonymousClass2WA.A00;
            } else {
                AnonymousClass3JR r82 = (AnonymousClass3JR) r8;
                long j = r82.A00;
                r82.A00 = -1;
                r82.A01 = null;
                r3 = ((C25701Ph) this).A0A(j);
            }
        }
        for (C30391dr r1 : r3) {
            if (r1 != null) {
                r1.resumeWith(C27621Wu.A00);
            }
        }
        if (r4 != null) {
            synchronized (r4) {
                r4.CPw(Integer.valueOf(AnonymousClass000.A0M(AnonymousClass3JQ.A00(r4)) - 1));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.3JQ, X.1Ph] */
    public final AnonymousClass3JQ BZq() {
        AnonymousClass3JQ r4;
        synchronized (this) {
            AnonymousClass3JQ r42 = this.A03;
            r4 = r42;
            if (r42 == null) {
                int i = this.A00;
                ? r43 = new C25701Ph(C25691Pg.DROP_OLDEST, 1, Integer.MAX_VALUE);
                r43.CPw(Integer.valueOf(i));
                this.A03 = r43;
                r4 = r43;
            }
        }
        return r4;
    }
}
