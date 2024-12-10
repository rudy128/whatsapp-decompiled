package X;

/* renamed from: X.2qT  reason: invalid class name and case insensitive filesystem */
public final class C61902qT {
    public final AnonymousClass1Cd A00;

    public C61902qT(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.database.Cursor A00(X.C61902qT r4, long r5) {
        /*
            X.1Cd r0 = r4.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x001b }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x001b }
            java.lang.String r2 = "SELECT message_template_id, message_hsm_tag FROM template_messages_metadata WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C17900vP.A0t(r5)     // Catch:{ all -> 0x001b }
            java.lang.String r0 = "GET_METADATA_BY_MESSAGE_ID"
            android.database.Cursor r0 = X.C18070vi.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x001b }
            r4.close()
            return r0
        L_0x001b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001d }
        L_0x001d:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61902qT.A00(X.2qT, long):android.database.Cursor");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass206 r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            X.1Cd r0 = r6.A00
            X.1au r5 = r0.A05()
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x002a }
            X.AnonymousClass206.A04(r4, r7)     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "message_template_id"
            r4.put(r0, r8)     // Catch:{ all -> 0x002a }
            java.lang.String r0 = "message_hsm_tag"
            r4.put(r0, r9)     // Catch:{ all -> 0x002a }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002a }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "template_messages_metadata"
            java.lang.String r1 = "storeMetadata/INSERT_TEMPLATE_MESSAGES_METADATA"
            r0 = 5
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x002a }
            r5.close()
            return
        L_0x002a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61902qT.A01(X.206, java.lang.String, java.lang.String):void");
    }
}
