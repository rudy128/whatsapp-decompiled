package X;

public final class CUv {
    public final EAn A00;

    public CUv(EAn eAn) {
        C18070vi.A0d(eAn, 1);
        this.A00 = eAn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C24470C5k r5) {
        /*
            r4 = this;
            X.EAn r1 = r4.A00
            X.D7F r1 = (X.D7F) r1
            java.util.concurrent.locks.ReentrantLock r3 = X.D7F.A06
            r3.lock()
            X.CMR r0 = r1.A03     // Catch:{ all -> 0x0037 }
            X.016 r2 = r0.A00     // Catch:{ all -> 0x0037 }
            boolean r0 = r2.contains(r5)     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.contains(r5)     // Catch:{ all -> 0x0037 }
            if (r0 != 0) goto L_0x001c
            r2.add(r5)     // Catch:{ all -> 0x0037 }
        L_0x001c:
            X.E8S r1 = r1.A00     // Catch:{ all -> 0x0037 }
            if (r1 == 0) goto L_0x0033
            r3.lock()     // Catch:{ all -> 0x0037 }
            java.util.Set r0 = X.C29431cG.A12(r2)     // Catch:{ all -> 0x002e }
            r3.unlock()     // Catch:{ all -> 0x0037 }
            r1.CKW(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            r3.unlock()     // Catch:{ all -> 0x0037 }
            throw r0     // Catch:{ all -> 0x0037 }
        L_0x0033:
            r3.unlock()
            return
        L_0x0037:
            r0 = move-exception
            r3.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CUv.A00(X.C5k):void");
    }
}
