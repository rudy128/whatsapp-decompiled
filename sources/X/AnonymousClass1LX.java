package X;

/* renamed from: X.1LX  reason: invalid class name */
public class AnonymousClass1LX {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass1LW A02;
    public final C22611Cn A03;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0023, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
        r4.A03.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C29691ci r5) {
        /*
            r4 = this;
            X.1LW r3 = r4.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0022, Error | RuntimeException -> 0x001d }
            monitor-enter(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0022, Error | RuntimeException -> 0x001d }
            r0 = 2
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch:{ all -> 0x001a }
            r2.<init>(r0)     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "spam_detection"
            int r0 = r5.A06     // Catch:{ all -> 0x001a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x001a }
            r2.put(r1, r0)     // Catch:{ all -> 0x001a }
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0022, Error | RuntimeException -> 0x001d }
            r3.A05(r2, r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0022, Error | RuntimeException -> 0x001d }
            return
        L_0x001a:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0022, Error | RuntimeException -> 0x001d }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0022, Error | RuntimeException -> 0x001d }
        L_0x001d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0022:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r4.A03
            r0.A03()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1LX.A00(X.1ci):void");
    }

    public AnonymousClass1LX(AnonymousClass1LW r1, AnonymousClass1CJ r2, C22611Cn r3, AnonymousClass00H r4) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r4;
        this.A03 = r3;
    }
}
