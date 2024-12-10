package X;

/* renamed from: X.2jF  reason: invalid class name and case insensitive filesystem */
public final class C57542jF {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1DL A01;
    public final AnonymousClass1Cd A02;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004e, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass24N r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.1Cd r0 = r6.A02
            X.1au r4 = r0.A05()
            long r2 = r7.A0x     // Catch:{ all -> 0x004b }
            android.content.ContentValues r5 = X.C17880vN.A08()     // Catch:{ all -> 0x004b }
            java.lang.String r1 = "message_row_id"
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x004b }
            r5.put(r1, r0)     // Catch:{ all -> 0x004b }
            X.1ch r1 = r7.A01     // Catch:{ all -> 0x004b }
            if (r1 == 0) goto L_0x0028
            X.1DL r0 = r6.A01     // Catch:{ all -> 0x004b }
            java.lang.Long r1 = X.AnonymousClass1DL.A04(r0, r1)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "newsletter_jid_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x004b }
        L_0x0028:
            java.lang.String r1 = "newsletter_name"
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x004b }
            r5.put(r1, r0)     // Catch:{ all -> 0x004b }
            long r0 = r7.A00     // Catch:{ all -> 0x004b }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "expiration"
            r5.put(r0, r1)     // Catch:{ all -> 0x004b }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004b }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "message_newsletter_admin_invite"
            java.lang.String r1 = "INSERT_NEWSLETTER_ADMIN_INVITE_MESSAGE_SQL"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x004b }
            r4.close()
            return
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57542jF.A00(X.24N):void");
    }

    public C57542jF(AnonymousClass1LW r1, AnonymousClass1DL r2, AnonymousClass1Cd r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
