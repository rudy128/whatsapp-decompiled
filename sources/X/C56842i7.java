package X;

/* renamed from: X.2i7  reason: invalid class name and case insensitive filesystem */
public final class C56842i7 {
    public final AnonymousClass1Cd A00;

    public C56842i7(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C20956AcA A00(long r6) {
        /*
            r5 = this;
            X.1Cd r0 = r5.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0043 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r2 = "SELECT show_mm_disclosure FROM data_sharing_disclosure_metadata WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r6)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "GET_DATA_SHARING_DISCLOSURE_METADATA_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r3 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0043 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x003c }
            r2 = 0
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "show_mm_disclosure"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003c }
            boolean r1 = X.AnonymousClass24X.A01(r3, r0)     // Catch:{ all -> 0x003c }
            X.AcA r0 = new X.AcA     // Catch:{ all -> 0x003c }
            r0.<init>(r2, r2, r1)     // Catch:{ all -> 0x003c }
            r3.close()     // Catch:{ all -> 0x0043 }
            r4.close()
            return r0
        L_0x0035:
            r3.close()     // Catch:{ all -> 0x0043 }
            r4.close()
            return r2
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56842i7.A00(long):X.AcA");
    }
}
