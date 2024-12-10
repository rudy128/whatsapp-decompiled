package X;

/* renamed from: X.9re  reason: invalid class name and case insensitive filesystem */
public class C194389re {
    public final C24811Lt A00;
    public final C24751Ln A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass1EC r8) {
        /*
            r7 = this;
            r6 = 0
            X.C18070vi.A0d(r8, r6)
            X.1Lt r0 = r7.A00
            X.1au r5 = r0.A06()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0023 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0023 }
            java.lang.String r3 = "non_admin_group_membership_approval_requests"
            java.lang.String r2 = "group_jid =?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0023 }
            X.C17880vN.A1J(r8, r1, r6)     // Catch:{ all -> 0x0023 }
            java.lang.String r0 = "delete_non_admin_gjr_by_group_jid"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0023 }
            r5.close()
            return
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194389re.A00(X.1EC):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00aa, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ae, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.List r12) {
        /*
            r11 = this;
            r6 = 0
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00ba
            X.1Lt r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            X.1au r4 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x00af }
            java.lang.Object r0 = r12.get(r6)     // Catch:{ all -> 0x00af }
            X.9sD r0 = (X.C194739sD) r0     // Catch:{ all -> 0x00af }
            X.1EC r8 = r0.A01     // Catch:{ all -> 0x00af }
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x00af }
            java.util.Iterator r10 = r12.iterator()     // Catch:{ all -> 0x00a8 }
        L_0x0020:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x008b
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x00a8 }
            X.9sD r3 = (X.C194739sD) r3     // Catch:{ all -> 0x00a8 }
            X.1EC r7 = r3.A01     // Catch:{ all -> 0x00a8 }
            boolean r2 = X.C18070vi.A18(r8, r7)     // Catch:{ all -> 0x00a8 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "Not all requests given to bulkInsertRequests belong to the same group. Mismatched GroupJid1 : "
            r1.append(r0)     // Catch:{ all -> 0x00a8 }
            r1.append(r8)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = ",  GroupJid2: "
            java.lang.String r0 = X.AnonymousClass001.A1E(r7, r0, r1)     // Catch:{ all -> 0x00a8 }
            X.C17960vV.A0F(r2, r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r9 = r7.getRawString()     // Catch:{ all -> 0x00a8 }
            com.whatsapp.jid.UserJid r0 = r3.A03     // Catch:{ all -> 0x00a8 }
            java.lang.String r2 = r0.getRawString()     // Catch:{ all -> 0x00a8 }
            com.whatsapp.jid.UserJid r0 = r3.A02     // Catch:{ all -> 0x00a8 }
            if (r0 == 0) goto L_0x005b
            java.lang.String r1 = r0.getRawString()     // Catch:{ all -> 0x00a8 }
            if (r1 != 0) goto L_0x005d
        L_0x005b:
            java.lang.String r1 = ""
        L_0x005d:
            r0 = 4
            android.content.ContentValues r7 = new android.content.ContentValues     // Catch:{ all -> 0x00a8 }
            r7.<init>(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "group_jid"
            r7.put(r0, r9)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "requested_for_jid"
            r7.put(r0, r2)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "requested_by_jid"
            r7.put(r0, r1)     // Catch:{ all -> 0x00a8 }
            long r0 = r3.A00     // Catch:{ all -> 0x00a8 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = "request_creation_time"
            r7.put(r0, r1)     // Catch:{ all -> 0x00a8 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a8 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00a8 }
            r2 = 5
            java.lang.String r1 = "insert_non_admin_gjr"
            java.lang.String r0 = "non_admin_group_membership_approval_requests"
            r3.A09(r0, r1, r7, r2)     // Catch:{ all -> 0x00a8 }
            goto L_0x0020
        L_0x008b:
            r5.A00()     // Catch:{ all -> 0x00a8 }
            r5.close()     // Catch:{ all -> 0x00af }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            X.00H r0 = r11.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            X.10T r2 = X.C17880vN.A0V(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            java.lang.Object r0 = r12.get(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            X.9sD r0 = (X.C194739sD) r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            X.1EC r1 = r0.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            r0 = 22
            X.C17890vO.A0r(r2, r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            return
        L_0x00a8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00af }
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194389re.A02(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass1EC r12, com.whatsapp.jid.UserJid r13) {
        /*
            r11 = this;
            java.lang.String r9 = "delete_non_admin_gjr"
            java.lang.String r8 = "requested_for_jid =? AND group_jid =?"
            java.lang.String r7 = "non_admin_group_membership_approval_requests"
            r6 = 0
            boolean r5 = X.C18070vi.A17(r12, r13)
            X.1Lt r0 = r11.A00
            X.1au r2 = r0.A06()
            X.1xA r4 = r2.BD0()     // Catch:{ all -> 0x005a }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0053 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0053 }
            r10 = 2
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x0053 }
            X.C17880vN.A1J(r13, r0, r6)     // Catch:{ all -> 0x0053 }
            X.C17880vN.A1J(r12, r0, r5)     // Catch:{ all -> 0x0053 }
            int r0 = r3.A04(r7, r8, r9, r0)     // Catch:{ all -> 0x0053 }
            if (r0 != 0) goto L_0x003c
            X.1Ln r0 = r11.A01     // Catch:{ all -> 0x0053 }
            com.whatsapp.jid.UserJid r1 = r0.A0F(r13)     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x003c
            java.lang.String[] r0 = new java.lang.String[r10]     // Catch:{ all -> 0x0053 }
            X.C17880vN.A1J(r1, r0, r6)     // Catch:{ all -> 0x0053 }
            X.C17880vN.A1J(r12, r0, r5)     // Catch:{ all -> 0x0053 }
            r3.A04(r7, r8, r9, r0)     // Catch:{ all -> 0x0053 }
        L_0x003c:
            r4.A00()     // Catch:{ all -> 0x0053 }
            X.00H r0 = r11.A02     // Catch:{ all -> 0x0053 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0053 }
            X.1ve r1 = (X.C41001ve) r1     // Catch:{ all -> 0x0053 }
            r0 = 22
            X.C17890vO.A0r(r1, r12, r0)     // Catch:{ all -> 0x0053 }
            r4.close()     // Catch:{ all -> 0x005a }
            r2.close()
            return
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C194389re.A01(X.1EC, com.whatsapp.jid.UserJid):void");
    }

    public C194389re(C24751Ln r1, C24811Lt r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A00 = r2;
        this.A01 = r1;
        this.A02 = r3;
    }
}
