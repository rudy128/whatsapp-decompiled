package X;

/* renamed from: X.2kd  reason: invalid class name and case insensitive filesystem */
public final class C58402kd {
    public final C24811Lt A00;
    public final AnonymousClass11P A01;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(com.whatsapp.jid.UserJid r9) {
        /*
            r8 = this;
            r7 = 0
            if (r9 == 0) goto L_0x0046
            java.lang.String[] r3 = X.C17880vN.A1Y()
            X.C17880vN.A1J(r9, r3, r7)
            X.1Lt r0 = r8.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "SELECT EXISTS ( SELECT 1 FROM recently_accepted_deeplink_invites WHERE user_jid = ?) AS user_exists"
            java.lang.String r0 = "invite_accepted_exists"
            android.database.Cursor r5 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x003c }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "user_exists"
            long r3 = X.C17890vO.A06(r5, r0)     // Catch:{ all -> 0x0035 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0031
            r7 = 1
        L_0x0031:
            r5.close()     // Catch:{ all -> 0x003c }
            goto L_0x0043
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        L_0x0043:
            r6.close()
        L_0x0046:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58402kd.A01(com.whatsapp.jid.UserJid):boolean");
    }

    public C58402kd(AnonymousClass11P r1, C24811Lt r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00() {
        /*
            r7 = this;
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r1 = r2.toSeconds(r0)
            r3 = 604800(0x93a80, double:2.98811E-318)
            long r1 = r1 - r3
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r0]
            r3 = 0
            java.lang.String r0 = "clicked_invite_link"
            r6[r3] = r0
            r0 = 1
            X.C17880vN.A1V(r6, r0, r1)
            r1 = 2
            java.lang.String r0 = "5"
            r6[r1] = r0
            X.1Lt r0 = r7.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0066 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "SELECT user_jid FROM recently_accepted_deeplink_invites WHERE invite_receiver_reason = ? AND invite_accepted_time>? ORDER BY invite_accepted_time DESC LIMIT ?;"
            java.lang.String r0 = "GET_RECENTLY_ACCEPTED_INVITES_CLICKED_LINK"
            android.database.Cursor r3 = r2.A0A(r1, r0, r6)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "user_jid"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005f }
        L_0x003d:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0058
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 11T -> 0x0051 }
            java.lang.String r0 = r3.getString(r2)     // Catch:{ 11T -> 0x0051 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A03(r0)     // Catch:{ 11T -> 0x0051 }
            r5.add(r0)     // Catch:{ 11T -> 0x0051 }
            goto L_0x003d
        L_0x0051:
            r1 = move-exception
            java.lang.String r0 = "RecentlyAcceptedInvitesStore/invalid user jid"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x005f }
            goto L_0x003d
        L_0x0058:
            r3.close()     // Catch:{ all -> 0x0066 }
            r4.close()
            return r5
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58402kd.A00():java.util.ArrayList");
    }
}
