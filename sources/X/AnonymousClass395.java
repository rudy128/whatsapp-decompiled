package X;

/* renamed from: X.395  reason: invalid class name */
public final class AnonymousClass395 implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass395(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            r1 = 0
            X.C18070vi.A0d(r10, r1)
            X.00H r0 = r9.A00
            java.lang.Object r5 = r0.get()
            X.2jF r5 = (X.C57542jF) r5
            X.24N r10 = (X.AnonymousClass24N) r10
            X.C18070vi.A0d(r10, r1)
            java.lang.String[] r3 = X.AnonymousClass206.A09(r10)
            X.1Cd r0 = r5.A02
            X.1at r7 = r0.get()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0066 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "SELECT newsletter_jid_row_id, newsletter_name, expiration FROM message_newsletter_admin_invite WHERE message_row_id = ? "
            java.lang.String r0 = "GET_NEWSLETTER_ADMIN_INVITE_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r8 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0066 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0058
            java.lang.String r0 = "expiration"
            long r3 = X.C17890vO.A06(r8, r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "newsletter_jid_row_id"
            long r1 = X.C17890vO.A06(r8, r0)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "newsletter_name"
            java.lang.String r6 = X.C17890vO.A0S(r8, r0)     // Catch:{ all -> 0x005f }
            X.1DL r5 = r5.A01     // Catch:{ all -> 0x005f }
            java.lang.Class<X.1ch> r0 = X.C29681ch.class
            com.whatsapp.jid.Jid r0 = r5.A0E(r0, r1)     // Catch:{ all -> 0x005f }
            X.1ch r0 = (X.C29681ch) r0     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = "NewsletterAdminInviteMessageStore/fillNewsletterAdminInviteInfo/could not fill newsletter invite data as newsletterJid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x005f }
            goto L_0x0058
        L_0x0052:
            r10.A01 = r0     // Catch:{ all -> 0x005f }
            r10.A03 = r6     // Catch:{ all -> 0x005f }
            r10.A00 = r3     // Catch:{ all -> 0x005f }
        L_0x0058:
            r8.close()     // Catch:{ all -> 0x0066 }
            r7.close()
            return
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.CDX.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass395.BL9(X.206):void");
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C57542jF) this.A00.get()).A00((AnonymousClass24N) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C57542jF) this.A00.get()).A00((AnonymousClass24N) r2);
    }
}
