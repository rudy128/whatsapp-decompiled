package X;

/* renamed from: X.2vS  reason: invalid class name and case insensitive filesystem */
public class C64862vS implements AnonymousClass1GV {
    public final /* synthetic */ String A00;

    public C64862vS(String str) {
        this.A00 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001a, code lost:
        if (r1 >= r2.size()) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        ((X.AnonymousClass1GV) r2.get(r1)).accept(r5);
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r1 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void accept(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r3 = X.C197519wp.A02
            monitor-enter(r3)
            X.00O r1 = X.C197519wp.A01     // Catch:{ all -> 0x0029 }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x0029 }
            java.lang.Object r2 = r1.get(r0)     // Catch:{ all -> 0x0029 }
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x0011
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            return
        L_0x0011:
            r1.remove(r0)     // Catch:{ all -> 0x0029 }
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            r1 = 0
        L_0x0016:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x0028
            java.lang.Object r0 = r2.get(r1)
            X.1GV r0 = (X.AnonymousClass1GV) r0
            r0.accept(r5)
            int r1 = r1 + 1
            goto L_0x0016
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64862vS.accept(java.lang.Object):void");
    }
}
