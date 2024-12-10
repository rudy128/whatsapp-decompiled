package X;

/* renamed from: X.2jA  reason: invalid class name and case insensitive filesystem */
public final class C57492jA {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1Cd A02;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(X.AnonymousClass1BI r7) {
        /*
            r6 = this;
            r3 = 0
            X.1LW r0 = r6.A00
            long r1 = r0.A09(r7)
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]
            X.C17880vN.A1V(r5, r3, r1)
            r1 = 1
            java.lang.String r0 = "147"
            r5[r1] = r0
            java.lang.String r0 = "155"
            r4 = 2
            r5[r4] = r0
            X.1Cd r0 = r6.A02
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006d }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x006d }
            java.lang.String r0 = X.C50932Wi.A04     // Catch:{ all -> 0x006d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "SELECT _id FROM message_system JOIN message ON message._id = message_system.message_row_id WHERE chat_row_id = ? AND message_type = 7 AND "
            r1.append(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "action_type IN "
            r1.append(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r4)     // Catch:{ all -> 0x006d }
            r1.append(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = " ORDER BY sort_id ASC"
            r1.append(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = " LIMIT 1"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "GET_LAST_SYSTEM_MESSAGE_ID_FOR_WABAI_EDUCATION_MESSAGE"
            android.database.Cursor r2 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x006d }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x005d
            java.lang.String r0 = "_id"
            long r0 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x0066 }
            r2.close()     // Catch:{ all -> 0x006d }
            r3.close()
            return r0
        L_0x005d:
            r2.close()     // Catch:{ all -> 0x006d }
            r3.close()
            r0 = -1
            return r0
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57492jA.A00(X.1BI):long");
    }

    public C57492jA(AnonymousClass1LW r1, AnonymousClass1CJ r2, AnonymousClass1Cd r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
