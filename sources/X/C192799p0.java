package X;

/* renamed from: X.9p0  reason: invalid class name and case insensitive filesystem */
public final class C192799p0 {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1DL A01;
    public final AnonymousClass1Cd A02;
    public final C24751Ln A03;
    public final C25001Mm A04;
    public final AnonymousClass11P A05;
    public final C18030ve A06;
    public final AnonymousClass00H A07;

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0107, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0112, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A01(X.AnonymousClass9IV r33, X.C29681ch r34) {
        /*
            r32 = this;
            r2 = 0
            r1 = 1
            r13 = r32
            X.1Cd r0 = r13.A02     // Catch:{ all -> 0x0113 }
            X.1at r8 = r0.get()     // Catch:{ all -> 0x0113 }
            java.lang.String[] r3 = X.C17880vN.A1Z()     // Catch:{ all -> 0x010c }
            X.1LW r7 = r13.A00     // Catch:{ all -> 0x010c }
            r0 = r34
            X.AnonymousClass1LW.A03(r7, r0, r3, r2)     // Catch:{ all -> 0x010c }
            r0 = r33
            int r0 = r0.value     // Catch:{ all -> 0x010c }
            X.C17880vN.A1S(r3, r0, r1)     // Catch:{ all -> 0x010c }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x010c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x010c }
            java.lang.String r1 = "SELECT * FROM newsletter_subscribers WHERE chat_row_id=? AND type_of_fetch=?"
            java.lang.String r0 = "GET_NEWSLETTER_SUBSCRIBERS_SQL"
            android.database.Cursor r6 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x010c }
            X.C18070vi.A0b(r6)     // Catch:{ all -> 0x0105 }
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "chat_row_id"
            int r21 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "jid_row_id"
            int r4 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "display_name"
            int r3 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "profile_picture_direct_path"
            int r2 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "subscription_time"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "role"
            int r20 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "type_of_fetch"
            int r19 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "fetched_time"
            int r18 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0105 }
        L_0x0060:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x00fe
            r0 = r21
            long r14 = r6.getLong(r0)     // Catch:{ all -> 0x0105 }
            boolean r0 = r6.isNull(r4)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0075
            r17 = 0
            goto L_0x0079
        L_0x0075:
            java.lang.Long r17 = X.C17890vO.A0M(r6, r4)     // Catch:{ all -> 0x0105 }
        L_0x0079:
            boolean r0 = r6.isNull(r3)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0082
            r28 = 0
            goto L_0x0086
        L_0x0082:
            java.lang.String r28 = r6.getString(r3)     // Catch:{ all -> 0x0105 }
        L_0x0086:
            boolean r0 = r6.isNull(r2)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x008f
            r29 = 0
            goto L_0x0093
        L_0x008f:
            java.lang.String r29 = r6.getString(r2)     // Catch:{ all -> 0x0105 }
        L_0x0093:
            boolean r0 = r6.isNull(r1)     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x009c
            r27 = 0
            goto L_0x00a0
        L_0x009c:
            java.lang.Long r27 = X.C17890vO.A0M(r6, r1)     // Catch:{ all -> 0x0105 }
        L_0x00a0:
            r0 = r20
            int r0 = r6.getInt(r0)     // Catch:{ all -> 0x0105 }
            X.9Ig r23 = X.AnonymousClass9QH.A00(r0)     // Catch:{ all -> 0x0105 }
            r0 = r19
            int r12 = r6.getInt(r0)     // Catch:{ all -> 0x0105 }
            X.9IV[] r11 = X.AnonymousClass9IV.values()     // Catch:{ all -> 0x0105 }
            int r10 = r11.length     // Catch:{ all -> 0x0105 }
            r9 = 0
        L_0x00b6:
            if (r9 >= r10) goto L_0x00f6
            r16 = r11[r9]     // Catch:{ all -> 0x0105 }
            r0 = r16
            int r0 = r0.value     // Catch:{ all -> 0x0105 }
            if (r0 != r12) goto L_0x00f3
            r0 = r18
            long r30 = r6.getLong(r0)     // Catch:{ all -> 0x0105 }
            X.1BI r0 = r7.A0B(r14)     // Catch:{ all -> 0x0105 }
            java.lang.String r9 = "null cannot be cast to non-null type com.whatsapp.jid.NewsletterJid"
            X.C18070vi.A0z(r0, r9)     // Catch:{ all -> 0x0105 }
            X.1ch r0 = (X.C29681ch) r0     // Catch:{ all -> 0x0105 }
            if (r17 == 0) goto L_0x00f1
            long r9 = r17.longValue()     // Catch:{ all -> 0x0105 }
            X.1DL r11 = r13.A01     // Catch:{ all -> 0x0105 }
            com.whatsapp.jid.Jid r9 = r11.A0B(r9)     // Catch:{ all -> 0x0105 }
        L_0x00dd:
            X.1E2 r9 = (X.AnonymousClass1E2) r9     // Catch:{ all -> 0x0105 }
            X.9tY r10 = new X.9tY     // Catch:{ all -> 0x0105 }
            r22 = r10
            r24 = r16
            r25 = r9
            r26 = r0
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0105 }
            r5.add(r10)     // Catch:{ all -> 0x0105 }
            goto L_0x0060
        L_0x00f1:
            r9 = 0
            goto L_0x00dd
        L_0x00f3:
            int r9 = r9 + 1
            goto L_0x00b6
        L_0x00f6:
            java.lang.String r1 = "Array contains no element matching the predicate."
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch:{ all -> 0x0105 }
            r0.<init>(r1)     // Catch:{ all -> 0x0105 }
            throw r0     // Catch:{ all -> 0x0105 }
        L_0x00fe:
            r6.close()     // Catch:{ all -> 0x010c }
            r8.close()     // Catch:{ all -> 0x0113 }
            return r5
        L_0x0105:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0107 }
        L_0x0107:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x010c }
            throw r0     // Catch:{ all -> 0x010c }
        L_0x010c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010e }
        L_0x010e:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0113 }
            throw r0     // Catch:{ all -> 0x0113 }
        L_0x0113:
            r1 = move-exception
            java.lang.String r0 = "NewsletterFollowersManager/getNewsletterFollowersFromDb/failed"
            com.whatsapp.util.Log.e(r0, r1)
            X.0wS r0 = X.C18460wS.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192799p0.A01(X.9IV, X.1ch):java.util.List");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0053, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob A00(X.AnonymousClass9IV r8, X.C29681ch r9, X.B8Q r10, boolean r11) {
        /*
            r7 = this;
            X.00H r0 = r7.A07
            boolean r0 = X.C72453Mb.A1X(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0080
            r2 = 0
            r1 = 1
            X.1Cd r0 = r7.A02     // Catch:{ all -> 0x0054 }
            X.1at r5 = r0.get()     // Catch:{ all -> 0x0054 }
            java.lang.String[] r3 = X.C17880vN.A1Z()     // Catch:{ all -> 0x004d }
            X.1LW r0 = r7.A00     // Catch:{ all -> 0x004d }
            X.AnonymousClass1LW.A03(r0, r9, r3, r2)     // Catch:{ all -> 0x004d }
            int r0 = r8.value     // Catch:{ all -> 0x004d }
            X.C17880vN.A1S(r3, r0, r1)     // Catch:{ all -> 0x004d }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004d }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x004d }
            java.lang.String r1 = "SELECT fetched_time FROM newsletter_subscribers WHERE chat_row_id=? AND type_of_fetch=? LIMIT 1"
            java.lang.String r0 = "GET_NEWSLETTER_SUBSCRIBERS_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x004d }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0039
            r2.close()     // Catch:{ all -> 0x004d }
            r5.close()     // Catch:{ all -> 0x0054 }
            goto L_0x005a
        L_0x0039:
            java.lang.String r0 = "fetched_time"
            long r3 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x0046 }
            r2.close()     // Catch:{ all -> 0x004d }
            r5.close()     // Catch:{ all -> 0x0054 }
            goto L_0x005c
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x004d }
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0054 }
            throw r0     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r1 = move-exception
            java.lang.String r0 = "NewsletterFollowersManager/getNewsletterFollowersFromDb/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005a:
            r3 = -1
        L_0x005c:
            X.0ve r2 = r7.A06
            r1 = 5217(0x1461, float:7.31E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            if (r11 != 0) goto L_0x0075
            long r0 = (long) r0
            long r3 = r3 + r0
            X.11P r0 = r7.A05
            long r1 = X.AnonymousClass11P.A01(r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            return r6
        L_0x0075:
            com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob r1 = new com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob
            r1.<init>(r8, r9, r10)
            X.1Mm r0 = r7.A04
            r0.A01(r1)
            return r1
        L_0x0080:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192799p0.A00(X.9IV, X.1ch, X.B8Q, boolean):com.whatsapp.newsletter.mex.NewsletterFollowersGraphqlJob");
    }

    public C192799p0(C25001Mm r1, AnonymousClass11P r2, AnonymousClass1LW r3, AnonymousClass1DL r4, AnonymousClass1Cd r5, C24751Ln r6, C18030ve r7, AnonymousClass00H r8) {
        C18070vi.A0w(r2, r7, r4, r3, r1);
        C18070vi.A0q(r8, r6, r5);
        this.A05 = r2;
        this.A06 = r7;
        this.A01 = r4;
        this.A00 = r3;
        this.A04 = r1;
        this.A07 = r8;
        this.A03 = r6;
        this.A02 = r5;
    }
}
