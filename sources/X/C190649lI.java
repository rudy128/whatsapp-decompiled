package X;

/* renamed from: X.9lI  reason: invalid class name and case insensitive filesystem */
public final class C190649lI {
    public final AnonymousClass121 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C29681ch r7, com.whatsapp.jid.UserJid r8) {
        /*
            r6 = this;
            X.00H r0 = r6.A02
            java.lang.Object r5 = r0.get()
            X.2jF r5 = (X.C57542jF) r5
            r4 = 0
            r2 = 1
            java.lang.String[] r3 = X.C17880vN.A1Z()
            X.1DL r0 = r5.A01
            long r0 = r0.A09(r7)
            X.C17880vN.A1V(r3, r4, r0)
            X.1LW r0 = r5.A00
            X.AnonymousClass1LW.A03(r0, r8, r3, r2)
            X.1Cd r0 = r5.A02
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006b }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x006b }
            java.lang.String r1 = "\n        SELECT invite.message_row_id AS message_row_id \n        FROM message_newsletter_admin_invite invite\n        JOIN available_message_view message  \n        WHERE \n          invite.message_row_id = message._id AND\n          invite.newsletter_jid_row_id = ? AND \n          message.chat_row_id = ? AND \n          message.message_type = 94 AND\n          invite.expiration != 0 \n        ORDER BY message.sort_id DESC\n        "
            java.lang.String r0 = "GET_LAST_SENT_NEWSLETTER_ADMIN_INVITE_MESSAGE_BY_NEWSLETTER_AND_INVITEE_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x006b }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "message_row_id"
            long r3 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x0064 }
            r2.close()     // Catch:{ all -> 0x006b }
            r5.close()
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0063
            X.00H r0 = r6.A01
            X.206 r2 = X.AnonymousClass1W2.A02(r0, r3)
            X.24N r2 = (X.AnonymousClass24N) r2
            if (r2 == 0) goto L_0x0063
            r0 = 0
            r2.A00 = r0
            X.121 r1 = r6.A00
            r0 = 21
            r1.CQx(r2, r0)
            return
        L_0x005d:
            r2.close()     // Catch:{ all -> 0x006b }
            r5.close()
        L_0x0063:
            return
        L_0x0064:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190649lI.A00(X.1ch, com.whatsapp.jid.UserJid):void");
    }

    public C190649lI(AnonymousClass121 r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
