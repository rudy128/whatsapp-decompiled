package X;

import android.database.DatabaseErrorHandler;

public final /* synthetic */ class AA4 implements DatabaseErrorHandler {
    public final /* synthetic */ C188939iF A00;
    public final /* synthetic */ C180549Mz A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r1.hasNext() != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r0 = ((android.util.Pair) r1.next()).second;
        X.C18070vi.A0W(r0);
        X.C188939iF.A01((java.lang.String) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r0 = r1.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if (r0 != null) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        X.C188939iF.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0033 A[ExcHandler: all (r2v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v7 java.util.List) = (r0v6 java.util.List), (r0v14 java.util.List), (r0v14 java.util.List) binds: [B:3:0x002d, B:5:0x002f, B:6:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:3:0x002d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            X.9Mz r1 = r3.A01
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            X.C18070vi.A0Y(r4)
            X.AHQ r2 = X.AnonymousClass9OC.A00(r4, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Corruption reported by sqlite on database: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".path"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.e(r0, r1)
            android.database.sqlite.SQLiteDatabase r1 = r2.A00
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x0078
            r0 = 0
            java.util.List r0 = r2.A01     // Catch:{ SQLiteException -> 0x002f, all -> 0x0033 }
        L_0x002f:
            r2.close()     // Catch:{ IOException -> 0x005b, all -> 0x0033 }
            goto L_0x005b
        L_0x0033:
            r2 = move-exception
            if (r0 == 0) goto L_0x0051
            java.util.Iterator r1 = r0.iterator()
        L_0x003a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.C18070vi.A0W(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.C188939iF.A01(r0)
            goto L_0x003a
        L_0x0051:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x005a
            X.C188939iF.A01(r0)
        L_0x005a:
            throw r2
        L_0x005b:
            if (r0 == 0) goto L_0x0078
            java.util.Iterator r1 = r0.iterator()
        L_0x0061:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.C18070vi.A0W(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.C188939iF.A01(r0)
            goto L_0x0061
        L_0x0078:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x0081
            X.C188939iF.A01(r0)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AA4.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }

    public /* synthetic */ AA4(C188939iF r1, C180549Mz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
