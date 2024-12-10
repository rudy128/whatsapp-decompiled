package X;

/* renamed from: X.2if  reason: invalid class name and case insensitive filesystem */
public final class C57182if {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C29691ci r7) {
        /*
            r6 = this;
            X.2lr r2 = r7.A0d
            if (r2 == 0) goto L_0x004b
            android.content.ContentValues r5 = X.C17880vN.A08()
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "ephemeral_trigger"
            r5.put(r0, r1)
            java.lang.Boolean r1 = r2.A01
            if (r1 == 0) goto L_0x001c
            java.lang.String r0 = "ephemeral_initiated_by_me"
            r5.put(r0, r1)
        L_0x001c:
            X.1LW r1 = r6.A00
            X.1BI r0 = r7.A0u
            long r0 = r1.A09(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "chat_row_id"
            r5.put(r0, r1)
            X.1Cd r0 = r6.A01
            X.1au r4 = r0.A05()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0041 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "chat_ephemeral"
            java.lang.String r1 = "INSERT_OR_UPDATE_EPEHEMERAL_CHATS_SQL"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x0041 }
            goto L_0x0048
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0048:
            r4.close()
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57182if.A00(X.1ci):void");
    }

    public C57182if(AnonymousClass1LW r1, AnonymousClass1Cd r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
