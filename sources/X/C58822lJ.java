package X;

/* renamed from: X.2lJ  reason: invalid class name and case insensitive filesystem */
public final class C58822lJ {
    public final C24811Lt A00;

    public C58822lJ(C24811Lt r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d1, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00(X.AnonymousClass1EC r27) {
        /*
            r26 = this;
            r5 = 0
            r0 = r26
            X.1Lt r0 = r0.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ce }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x00ce }
            java.lang.String r2 = "SELECT group_jid, parent_group_jid, subject, description, creator_jid, request_creation_time, participant_count, is_existing_group, is_hidden_subgroup FROM member_suggested_groups_v2 WHERE parent_group_jid = ? ORDER BY request_creation_time DESC "
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00ce }
            r0 = r27
            X.C17880vN.A1J(r0, r1, r5)     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "GET_GROUP_SUGGESTIONS_BY_PARENT_GROUP_JID"
            android.database.Cursor r2 = r4.A0A(r2, r0, r1)     // Catch:{ all -> 0x00ce }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "group_jid"
            int r13 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "parent_group_jid"
            int r12 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "subject"
            int r11 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "description"
            int r10 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "creator_jid"
            int r9 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "request_creation_time"
            int r8 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "participant_count"
            int r7 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "is_existing_group"
            int r4 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            java.lang.String r0 = "is_hidden_subgroup"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c7 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x00c7 }
            java.util.ArrayList r0 = X.C17880vN.A0z(r0)     // Catch:{ all -> 0x00c7 }
            r5 = -1
            r2.moveToPosition(r5)     // Catch:{ all -> 0x00c7 }
            boolean r5 = r2.isBeforeFirst()     // Catch:{ all -> 0x00c7 }
            if (r5 == 0) goto L_0x0072
            boolean r5 = r2.moveToFirst()     // Catch:{ all -> 0x00c7 }
            if (r5 != 0) goto L_0x0072
            goto L_0x00c0
        L_0x0072:
            boolean r5 = r2.isAfterLast()     // Catch:{ all -> 0x00c7 }
            if (r5 == 0) goto L_0x0079
            goto L_0x00c0
        L_0x0079:
            android.os.Parcelable$Creator r5 = X.AnonymousClass1EC.CREATOR     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = r2.getString(r12)     // Catch:{ all -> 0x00c7 }
            X.1EC r15 = X.C42941yz.A01(r5)     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = r2.getString(r13)     // Catch:{ all -> 0x00c7 }
            X.1EC r16 = X.C42941yz.A01(r5)     // Catch:{ all -> 0x00c7 }
            java.lang.String r18 = r2.getString(r11)     // Catch:{ all -> 0x00c7 }
            java.lang.String r19 = r2.getString(r10)     // Catch:{ all -> 0x00c7 }
            X.1Dw r5 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x00c7 }
            java.lang.String r5 = r2.getString(r9)     // Catch:{ all -> 0x00c7 }
            com.whatsapp.jid.UserJid r17 = X.C22941Dw.A03(r5)     // Catch:{ all -> 0x00c7 }
            long r20 = r2.getLong(r8)     // Catch:{ all -> 0x00c7 }
            long r22 = r2.getLong(r7)     // Catch:{ all -> 0x00c7 }
            int r6 = r2.getInt(r4)     // Catch:{ all -> 0x00c7 }
            r5 = 1
            boolean r24 = X.AnonymousClass000.A1T(r6, r5)
            boolean r25 = X.AnonymousClass24X.A01(r2, r1)     // Catch:{ all -> 0x00c7 }
            X.2mu r14 = new X.2mu     // Catch:{ all -> 0x00c7 }
            r14.<init>(r15, r16, r17, r18, r19, r20, r22, r24, r25)     // Catch:{ all -> 0x00c7 }
            r0.add(r14)     // Catch:{ all -> 0x00c7 }
            boolean r5 = r2.moveToNext()     // Catch:{ all -> 0x00c7 }
            if (r5 != 0) goto L_0x0079
        L_0x00c0:
            r2.close()     // Catch:{ all -> 0x00ce }
            r3.close()
            return r0
        L_0x00c7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c9 }
        L_0x00c9:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00ce }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00ce:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58822lJ.A00(X.1EC):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0065, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass1EC r13, java.lang.Iterable r14) {
        /*
            r12 = this;
            r8 = 0
            X.1Lt r0 = r12.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x006d }
            X.1au r5 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006d }
            X.1xA r6 = r5.BD0()     // Catch:{ all -> 0x0066 }
            java.util.Iterator r11 = r14.iterator()     // Catch:{ all -> 0x005f }
        L_0x000f:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x005f }
            X.2m5 r0 = (X.C59302m5) r0     // Catch:{ all -> 0x005f }
            X.1EC r10 = r0.A00     // Catch:{ all -> 0x005f }
            com.whatsapp.jid.UserJid r9 = r0.A01     // Catch:{ all -> 0x005f }
            r7 = 1
            r1 = 2
            java.lang.String r4 = "member_suggested_groups_v2"
            if (r9 == 0) goto L_0x003e
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005f }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x005f }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x005f }
            X.C17880vN.A1J(r13, r2, r8)     // Catch:{ all -> 0x005f }
            X.C17880vN.A1J(r10, r2, r7)     // Catch:{ all -> 0x005f }
            X.C17880vN.A1J(r9, r2, r1)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID_AND_CREATOR"
            java.lang.String r0 = "parent_group_jid = ?  AND group_jid = ?  AND creator_jid = ?"
        L_0x003a:
            r3.A04(r4, r0, r1, r2)     // Catch:{ all -> 0x005f }
            goto L_0x000f
        L_0x003e:
            java.lang.String r0 = "deleteSubgroupSuggestionHelper/Deprecated sql DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID is used, possibly revoke with no creator"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x005f }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005f }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x005f }
            java.lang.String[] r2 = new java.lang.String[r1]     // Catch:{ all -> 0x005f }
            X.C17880vN.A1J(r13, r2, r8)     // Catch:{ all -> 0x005f }
            X.C17880vN.A1J(r10, r2, r7)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "DELETE_GROUP_SUGGESTIONS_BY_PARENT_AND_GROUP_JID"
            java.lang.String r0 = "parent_group_jid = ?  AND group_jid = ?"
            goto L_0x003a
        L_0x0055:
            r6.A00()     // Catch:{ all -> 0x005f }
            r6.close()     // Catch:{ all -> 0x0066 }
            r5.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x006d }
            return
        L_0x005f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x006d }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x006d }
        L_0x006d:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58822lJ.A01(X.1EC, java.lang.Iterable):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.Iterable r11) {
        /*
            r10 = this;
            X.1Lt r0 = r10.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            X.1au r4 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x009f }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x0098 }
        L_0x000e:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x008e
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x0098 }
            X.2mu r3 = (X.C59802mu) r3     // Catch:{ all -> 0x0098 }
            r0 = 8
            android.content.ContentValues r6 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x0098 }
            X.1EC r0 = r3.A02     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "group_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x0098 }
            X.1EC r0 = r3.A03     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "parent_group_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "subject"
            java.lang.String r0 = r3.A06     // Catch:{ all -> 0x0098 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = "description"
            java.lang.String r0 = r3.A05     // Catch:{ all -> 0x0098 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0098 }
            com.whatsapp.jid.UserJid r0 = r3.A04     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "creator_jid"
            r6.put(r0, r1)     // Catch:{ all -> 0x0098 }
            long r0 = r3.A00     // Catch:{ all -> 0x0098 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "request_creation_time"
            r6.put(r0, r1)     // Catch:{ all -> 0x0098 }
            long r1 = r3.A01     // Catch:{ all -> 0x0098 }
            r7 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "participant_count"
            r6.put(r0, r1)     // Catch:{ all -> 0x0098 }
        L_0x006c:
            boolean r0 = r3.A07     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0079
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = "is_existing_group"
            r6.put(r0, r1)     // Catch:{ all -> 0x0098 }
        L_0x0079:
            java.lang.String r1 = "is_hidden_subgroup"
            boolean r0 = r3.A08     // Catch:{ all -> 0x0098 }
            X.C50072Ta.A00(r6, r1, r0)     // Catch:{ all -> 0x0098 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0098 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0098 }
            r2 = 5
            java.lang.String r1 = "member_suggested_groups_v2.insert"
            java.lang.String r0 = "member_suggested_groups_v2"
            r3.A09(r0, r1, r6, r2)     // Catch:{ all -> 0x0098 }
            goto L_0x000e
        L_0x008e:
            r5.A00()     // Catch:{ all -> 0x0098 }
            r5.close()     // Catch:{ all -> 0x009f }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            return
        L_0x0098:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x009f }
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58822lJ.A02(java.lang.Iterable):void");
    }
}
