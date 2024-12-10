package X;

/* renamed from: X.9u7  reason: invalid class name and case insensitive filesystem */
public class C195899u7 {
    public final C24811Lt A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.AnonymousClass1EC r7) {
        /*
            r6 = this;
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            java.lang.String[] r5 = X.C17880vN.A1Y()
            java.lang.String r0 = r7.getRawString()
            r4 = 0
            r5[r1] = r0
            X.1Lt r0 = r6.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM group_membership_approval_requests WHERE group_jid = ?"
            java.lang.String r0 = "GET_GROUP_MEMBERSHIP_APPROVAL_REQUESTS_COUNT_WITH_JID_SQL"
            android.database.Cursor r2 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x003c }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "count"
            int r4 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0035 }
        L_0x002e:
            r2.close()     // Catch:{ all -> 0x003c }
            r3.close()
            return r4
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195899u7.A00(X.1EC):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        r0 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass1EC r8) {
        /*
            r7 = this;
            r6 = 0
            X.C18070vi.A0d(r8, r6)
            X.1Lt r0 = r7.A00
            X.1au r5 = r0.A06()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0031 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0031 }
            java.lang.String r3 = "group_membership_approval_requests"
            java.lang.String r2 = "group_jid =?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0031 }
            X.C17880vN.A1J(r8, r1, r6)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = "delete_membership_approval_requests_by_group_jid"
            int r0 = r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0031 }
            r5.close()
            if (r0 <= 0) goto L_0x0030
            X.00H r0 = r7.A01
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 22
            X.C17890vO.A0r(r1, r8, r0)
        L_0x0030:
            return
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195899u7.A01(X.1EC):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass1EC r10, com.whatsapp.jid.UserJid r11) {
        /*
            r9 = this;
            r8 = 0
            boolean r7 = X.C18070vi.A17(r10, r11)
            X.1Lt r0 = r9.A00
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0043 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r5 = "group_membership_approval_requests"
            java.lang.String r3 = "requester_jid =? AND group_jid =?"
            java.lang.String[] r1 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = r11.getRawString()     // Catch:{ all -> 0x0043 }
            r2 = 0
            r1[r8] = r0     // Catch:{ all -> 0x0043 }
            X.C17880vN.A1J(r10, r1, r7)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "delete_membership_approval_request"
            int r1 = r6.A04(r5, r3, r0, r1)     // Catch:{ all -> 0x0043 }
            if (r1 > r7) goto L_0x002b
            r2 = 1
        L_0x002b:
            java.lang.String r0 = "There should not be more than 1 membership approval request entries with same requester_jid + group_jid"
            X.C17960vV.A0F(r2, r0)     // Catch:{ all -> 0x0043 }
            if (r1 <= 0) goto L_0x003f
            X.00H r0 = r9.A01     // Catch:{ all -> 0x0043 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0043 }
            X.1ve r1 = (X.C41001ve) r1     // Catch:{ all -> 0x0043 }
            r0 = 22
            X.C17890vO.A0r(r1, r10, r0)     // Catch:{ all -> 0x0043 }
        L_0x003f:
            r4.close()
            return
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195899u7.A02(X.1EC, com.whatsapp.jid.UserJid):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.util.List r11) {
        /*
            r10 = this;
            r6 = 0
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x00d9
            X.1Lt r0 = r10.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            X.1au r4 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x00ce }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x00ce }
            if (r0 != 0) goto L_0x00b7
            java.lang.Object r0 = r11.get(r6)     // Catch:{ all -> 0x00ce }
            X.9tC r0 = (X.C195349tC) r0     // Catch:{ all -> 0x00ce }
            X.1EC r8 = r0.A01     // Catch:{ all -> 0x00ce }
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x00ce }
            java.util.Iterator r9 = r11.iterator()     // Catch:{ all -> 0x00b0 }
        L_0x0026:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x00a9
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x00b0 }
            X.9tC r2 = (X.C195349tC) r2     // Catch:{ all -> 0x00b0 }
            X.1EC r7 = r2.A01     // Catch:{ all -> 0x00b0 }
            boolean r3 = X.C18070vi.A18(r8, r7)     // Catch:{ all -> 0x00b0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "Not all requests given to bulkInsertGroupMembershipApprovalRequests belong to the same group. Mismatched GroupJid1 : "
            r1.append(r0)     // Catch:{ all -> 0x00b0 }
            r1.append(r8)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = ",  GroupJid2: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)     // Catch:{ all -> 0x00b0 }
            X.C17960vV.A0F(r3, r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r3 = r7.getRawString()     // Catch:{ all -> 0x00b0 }
            com.whatsapp.jid.UserJid r0 = r2.A04     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00b0 }
            r0 = 6
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00b0 }
            r7.<init>(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "group_jid"
            r7.put(r0, r3)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "requester_jid"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "request_method"
            java.lang.String r0 = r2.A05     // Catch:{ all -> 0x00b0 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00b0 }
            long r0 = r2.A00     // Catch:{ all -> 0x00b0 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00b0 }
            java.lang.String r0 = "request_creation_time"
            r7.put(r0, r1)     // Catch:{ all -> 0x00b0 }
            X.1EC r0 = r2.A02     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "parent_group_jid"
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00b0 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00b0 }
        L_0x0086:
            com.whatsapp.jid.UserJid r0 = r2.A03     // Catch:{ all -> 0x00b0 }
            java.lang.String r1 = "requested_by_jid"
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00b0 }
            r7.put(r1, r0)     // Catch:{ all -> 0x00b0 }
        L_0x0093:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b0 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00b0 }
            r2 = 5
            java.lang.String r1 = "group_membership_approval_requests.insertGroupMembershipApprovalRequest"
            java.lang.String r0 = "group_membership_approval_requests"
            r3.A09(r0, r1, r7, r2)     // Catch:{ all -> 0x00b0 }
            goto L_0x0026
        L_0x00a1:
            r7.putNull(r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x0093
        L_0x00a5:
            r7.putNull(r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x0086
        L_0x00a9:
            r5.A00()     // Catch:{ all -> 0x00b0 }
            r5.close()     // Catch:{ all -> 0x00ce }
            goto L_0x00b7
        L_0x00b0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00ce }
            throw r0     // Catch:{ all -> 0x00ce }
        L_0x00b7:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            X.00H r0 = r10.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            X.10T r2 = X.C17880vN.A0V(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            java.lang.Object r0 = r11.get(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            X.9tC r0 = (X.C195349tC) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            X.1EC r1 = r0.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            r0 = 22
            X.C17890vO.A0r(r2, r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            return
        L_0x00ce:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d0 }
        L_0x00d0:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C195899u7.A03(java.util.List):void");
    }

    public C195899u7(C24811Lt r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
