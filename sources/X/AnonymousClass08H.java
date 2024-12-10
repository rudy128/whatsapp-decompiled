package X;

import androidx.compose.runtime.snapshots.Snapshot;

/* renamed from: X.08H  reason: invalid class name */
public final class AnonymousClass08H extends AnonymousClass08M {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass08H(X.C06400Ye r6, int r7) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C05200Qx.A08
            monitor-enter(r4)
            java.util.List r3 = X.C05200Qx.A02     // Catch:{ all -> 0x0023 }
            r2 = 0
            int r1 = r3.size()     // Catch:{ all -> 0x0023 }
            r0 = 1
            if (r1 != r0) goto L_0x001b
            java.lang.Object r1 = r3.get(r2)     // Catch:{ all -> 0x0023 }
        L_0x0011:
            X.1Di r1 = (X.C22821Di) r1     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x001d
            X.0is r1 = new X.0is     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            goto L_0x001d
        L_0x001b:
            r1 = 0
            goto L_0x0011
        L_0x001d:
            monitor-exit(r4)
            r0 = 0
            r5.<init>(r6, r0, r1, r7)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08H.<init>(X.0Ye, int):void");
    }

    public Snapshot A09(C22821Di r2) {
        return C05200Qx.A05(new C10780it(r2));
    }

    public void A0D() {
        synchronized (C05200Qx.A08) {
            int i = this.A01;
            if (i >= 0) {
                C05200Qx.A0T(i);
                this.A01 = -1;
            }
        }
    }

    public AnonymousClass08M A0M(C22821Di r2, C22821Di r3) {
        return (AnonymousClass08M) C05200Qx.A05(new C11030jN(r2, r3));
    }

    public C01980Ce A0N() {
        throw AnonymousClass000.A0n("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }

    public /* bridge */ /* synthetic */ void A0F() {
        C04120Lx.A00();
        throw null;
    }

    public /* bridge */ /* synthetic */ void A0G() {
        C04120Lx.A00();
        throw null;
    }

    public void A0H() {
        C05200Qx.A0R();
    }
}
