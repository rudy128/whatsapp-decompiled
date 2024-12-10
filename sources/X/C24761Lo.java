package X;

/* renamed from: X.1Lo  reason: invalid class name and case insensitive filesystem */
public final class C24761Lo {
    public final AnonymousClass00H A00;

    public C24761Lo(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0127, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x012a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012b, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.Collection r19) {
        /*
            r18 = this;
            r9 = 0
            r5 = r19
            X.C18070vi.A0d(r5, r9)
            r0 = r18
            X.00H r0 = r0.A00
            java.lang.Object r8 = r0.get()
            X.2Q6 r8 = (X.AnonymousClass2Q6) r8
            r0 = 1
            X.1Ez r3 = new X.1Ez
            r3.<init>((boolean) r0)
            r3.A04()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.1Lt r0 = r8.A00
            X.1au r4 = r0.A06()
            X.1xA r6 = r4.BD0()     // Catch:{ all -> 0x0128 }
            java.util.Iterator r17 = r5.iterator()     // Catch:{ all -> 0x0121 }
            r1 = 0
        L_0x002d:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r12 = r17.next()     // Catch:{ all -> 0x0121 }
            int r16 = r1 + 1
            if (r1 >= 0) goto L_0x0040
            X.AnonymousClass1ZU.A0B()     // Catch:{ all -> 0x0121 }
        L_0x003e:
            r0 = 0
            throw r0     // Catch:{ all -> 0x0121 }
        L_0x0040:
            X.1E7 r12 = (X.AnonymousClass1E7) r12     // Catch:{ all -> 0x0121 }
            X.C18070vi.A0d(r12, r9)     // Catch:{ all -> 0x0121 }
            boolean r0 = r12.A0B()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00e3
            X.1BI r11 = r12.A0J     // Catch:{ all -> 0x0121 }
            boolean r0 = X.C22971Dz.A0d(r11)     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00e3
            r7.add(r12)     // Catch:{ all -> 0x0121 }
            X.2lf r0 = r12.A0H     // Catch:{ all -> 0x0121 }
            if (r0 != 0) goto L_0x005d
            r0 = 0
            goto L_0x005f
        L_0x005d:
            long r0 = r0.A00     // Catch:{ all -> 0x0121 }
        L_0x005f:
            java.lang.String r2 = "null cannot be cast to non-null type com.whatsapp.jid.UserJid"
            X.C18070vi.A0z(r11, r2)     // Catch:{ all -> 0x0121 }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x0121 }
            r2 = 1
            X.C18070vi.A0d(r11, r2)     // Catch:{ all -> 0x0121 }
            r13 = 1
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0071
            goto L_0x0083
        L_0x0071:
            java.lang.String r2 = "AB_TABLE_UPDATE_QUERY_CONTACT_BY_ID"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0121 }
            r1[r9] = r0     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "SELECT _id, company, display_name, family_name, given_name, is_contact_synced, is_starred, is_whatsapp_user, jid, nickname, number, phone_label, phone_type, raw_contact_id, sort_name, sync_policy, title FROM wa_address_book WHERE jid = ?"
            android.database.Cursor r1 = X.C24861Ly.A03(r4, r0, r2, r1)     // Catch:{ all -> 0x0121 }
            goto L_0x0094
        L_0x0083:
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0121 }
            r2[r9] = r0     // Catch:{ all -> 0x0121 }
            java.lang.String r1 = "AB_TABLE_QUERY_CONTACT_BY_RAW_CONTACT_ID"
            java.lang.String r0 = "SELECT _id, company, display_name, family_name, given_name, is_contact_synced, is_starred, is_whatsapp_user, jid, nickname, number, phone_label, phone_type, raw_contact_id, sort_name, sync_policy, title FROM wa_address_book WHERE raw_contact_id = ?"
            android.database.Cursor r1 = X.C24861Ly.A03(r4, r0, r1, r2)     // Catch:{ all -> 0x0121 }
        L_0x0094:
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0121 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00b2
            X.0vb r0 = r8.A00     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00db
            X.1E7 r15 = X.C42651yW.A01(r1, r0)     // Catch:{ all -> 0x0121 }
        L_0x00a5:
            java.lang.String r10 = "wa_address_book"
            if (r15 != 0) goto L_0x00b4
            android.content.ContentValues r0 = r8.A0I(r12, r11)     // Catch:{ all -> 0x0121 }
            X.C24861Ly.A00(r0, r4, r10)     // Catch:{ all -> 0x0121 }
            goto L_0x00e3
        L_0x00b2:
            r15 = 0
            goto L_0x00a5
        L_0x00b4:
            X.2lf r0 = r12.A0H     // Catch:{ all -> 0x0121 }
            if (r0 == 0) goto L_0x00e3
            long r0 = r0.A00     // Catch:{ all -> 0x0121 }
            r13 = 0
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 > 0) goto L_0x00c6
            r13 = -5
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x00e3
        L_0x00c6:
            android.content.ContentValues r2 = r8.A0I(r12, r11)     // Catch:{ all -> 0x0121 }
            long r0 = r15.A0J()     // Catch:{ all -> 0x0121 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "_id"
            r2.put(r0, r1)     // Catch:{ all -> 0x0121 }
            X.C24861Ly.A05(r2, r4, r10)     // Catch:{ all -> 0x0121 }
            goto L_0x00e3
        L_0x00db:
            java.lang.String r0 = "whatsAppLocale"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x0121 }
            goto L_0x003e
        L_0x00e3:
            r1 = r16
            goto L_0x002d
        L_0x00e7:
            r6.A00()     // Catch:{ all -> 0x0121 }
            r6.close()     // Catch:{ all -> 0x0128 }
            r4.close()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "AddressBookStore/updateOrAddContacts "
            r2.append(r0)
            int r0 = r7.size()
            r2.append(r0)
            java.lang.String r0 = " out of "
            r2.append(r0)
            int r0 = r5.size()
            r2.append(r0)
            java.lang.String r0 = " | time: "
            r2.append(r0)
            long r0 = r3.A01()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0121:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0128 }
            throw r0     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012a }
        L_0x012a:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24761Lo.A01(java.util.Collection):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00cd, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.List r20, java.util.List r21, java.util.List r22, java.util.Map r23, boolean r24) {
        /*
            r19 = this;
            r0 = 0
            r1 = r20
            X.C18070vi.A0d(r1, r0)
            r0 = 1
            r3 = r21
            X.C18070vi.A0d(r3, r0)
            r0 = 2
            r2 = r22
            X.C18070vi.A0d(r2, r0)
            r0 = 3
            r10 = r23
            X.C18070vi.A0d(r10, r0)
            r0 = r19
            X.00H r0 = r0.A00
            java.lang.Object r7 = r0.get()
            X.2Q6 r7 = (X.AnonymousClass2Q6) r7
            r17 = 0
            r11 = 1
            X.1Lt r0 = r7.A00
            X.1au r9 = r0.A06()
            X.1xA r4 = r9.BD0()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "AddressBookStore/updateContactsWithUsyncResults"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x0038:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00c3 }
            r12 = r24
            if (r0 == 0) goto L_0x004a
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x00c3 }
            X.1E7 r8 = (X.AnonymousClass1E7) r8     // Catch:{ all -> 0x00c3 }
            r7.A0J(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c3 }
            goto L_0x0038
        L_0x004a:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x004e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r14 = r1.next()     // Catch:{ all -> 0x00c3 }
            X.1E7 r14 = (X.AnonymousClass1E7) r14     // Catch:{ all -> 0x00c3 }
            r13 = r7
            r15 = r9
            r16 = r10
            r18 = r12
            r13.A0J(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x00c3 }
            goto L_0x004e
        L_0x0064:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r1.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "AddressBookStore/deleteSoftDeletedContactsFromTable "
            r1.append(r0)     // Catch:{ all -> 0x00c3 }
            int r0 = r2.size()     // Catch:{ all -> 0x00c3 }
            r1.append(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00c3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c3 }
            java.util.Iterator r8 = r2.iterator()     // Catch:{ all -> 0x00c3 }
            r1 = 0
        L_0x0082:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00a5
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00c3 }
            X.1E7 r0 = (X.AnonymousClass1E7) r0     // Catch:{ all -> 0x00c3 }
            java.lang.String[] r7 = new java.lang.String[r11]     // Catch:{ all -> 0x00c3 }
            long r5 = r0.A0J()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00c3 }
            r7[r17] = r0     // Catch:{ all -> 0x00c3 }
            java.lang.String r3 = "wa_address_book"
            java.lang.String r0 = "_id = ?"
            long r5 = X.C24861Ly.A02(r9, r3, r0, r7)     // Catch:{ all -> 0x00c3 }
            long r1 = r1 + r5
            goto L_0x0082
        L_0x00a5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r3.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "AddressBookStore/deleteSoftDeletedContactsFromTable deleted contacts count: "
            r3.append(r0)     // Catch:{ all -> 0x00c3 }
            r3.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00c3 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00c3 }
            r4.A00()     // Catch:{ all -> 0x00c3 }
            r4.close()     // Catch:{ all -> 0x00ca }
            r9.close()
            return
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.CDX.A00(r9, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24761Lo.A02(java.util.List, java.util.List, java.util.List, java.util.Map, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        X.CDX.A00(r2, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass1E7 r4) {
        /*
            r3 = this;
            X.00H r0 = r3.A00
            java.lang.Object r0 = r0.get()
            X.1Ly r0 = (X.C24861Ly) r0
            X.1Lt r0 = r0.A00
            X.1au r2 = r0.A06()
            android.content.ContentValues r0 = X.AnonymousClass2Q6.A06(r4)     // Catch:{ all -> 0x001c }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x001c }
            X.AnonymousClass2Q6.A07(r0, r4, r2)     // Catch:{ all -> 0x001c }
            r2.close()
            return
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24761Lo.A00(X.1E7):void");
    }
}
