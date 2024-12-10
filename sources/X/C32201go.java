package X;

/* renamed from: X.1go  reason: invalid class name and case insensitive filesystem */
public final class C32201go implements C26181Rd, C218917u {
    public C32301gy A00;
    public C59582mX A01;
    public boolean A02;
    public boolean A03;
    public final AnonymousClass11P A04;
    public final AnonymousClass10I A05;

    public C32201go(AnonymousClass11P r2, AnonymousClass10I r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A04 = r2;
        this.A05 = r3;
    }

    public static final synchronized void A00(C32201go r1) {
        synchronized (r1) {
            if (!r1.A02) {
                r1.A01(false);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (r14 == false) goto L_0x003a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(boolean r14) {
        /*
            r13 = this;
            r6 = r13
            monitor-enter(r6)
            r0 = 1
            r13.A02 = r0     // Catch:{ all -> 0x0044 }
            boolean r0 = r13.A03     // Catch:{ all -> 0x0044 }
            r13.A03 = r14     // Catch:{ all -> 0x0044 }
            X.1gy r8 = r13.A00     // Catch:{ all -> 0x0044 }
            X.2mX r5 = r13.A01     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0038
            if (r14 != 0) goto L_0x0042
            if (r8 == 0) goto L_0x003a
            if (r5 == 0) goto L_0x003a
            long r3 = r5.A00     // Catch:{ all -> 0x0044 }
            r0 = 20000(0x4e20, double:9.8813E-320)
            long r3 = r3 + r0
            X.11P r0 = r13.A04     // Catch:{ all -> 0x0044 }
            long r1 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x0044 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003a
            X.205 r9 = r5.A01     // Catch:{ all -> 0x0044 }
            boolean r12 = r5.A03     // Catch:{ all -> 0x0044 }
            boolean r11 = r5.A02     // Catch:{ all -> 0x0044 }
            X.1gx r0 = r8.A00     // Catch:{ all -> 0x0044 }
            X.10I r0 = r0.A0H     // Catch:{ all -> 0x0044 }
            r10 = 7
            X.3Cj r7 = new X.3Cj     // Catch:{ all -> 0x0044 }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x0044 }
            r0.CGF(r7)     // Catch:{ all -> 0x0044 }
            goto L_0x003a
        L_0x0038:
            if (r14 != 0) goto L_0x0042
        L_0x003a:
            r0 = 0
            r13.A01 = r0     // Catch:{ all -> 0x0040 }
            r13.A00 = r0     // Catch:{ all -> 0x0040 }
            goto L_0x0042
        L_0x0040:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r6)
            return
        L_0x0044:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32201go.A01(boolean):void");
    }

    public void BvR() {
        boolean z;
        synchronized (this) {
            this.A02 = false;
            z = this.A03;
        }
        if (z) {
            this.A05.CGv(new C21425Ajs((Object) this, 12), 10000);
        }
    }

    public /* synthetic */ void BvS() {
    }

    public /* synthetic */ void BvT() {
    }

    public /* synthetic */ void BvU() {
    }

    public /* synthetic */ void BvV() {
    }

    public /* synthetic */ void BzQ(Integer num, Integer num2) {
    }

    public /* synthetic */ void BzR() {
    }

    public void BzP() {
        A00(this);
    }
}
