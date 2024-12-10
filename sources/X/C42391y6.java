package X;

/* renamed from: X.1y6  reason: invalid class name and case insensitive filesystem */
public final class C42391y6 {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;

    public C42391y6(AnonymousClass1LW r2, AnonymousClass1Cd r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b8, code lost:
        if (java.lang.Long.valueOf(r0) != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00fc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0100, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0103, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A00(X.AnonymousClass25H r19, X.AnonymousClass1BI r20) {
        /*
            r18 = this;
            r9 = 0
            r10 = r20
            X.C18070vi.A0d(r10, r9)
            r8 = 1
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1 = r18
            X.1Cd r0 = r1.A01
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00fd }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x00fd }
            java.lang.String r6 = "\n        SELECT\n          _id,\n          chat_row_id,\n          quoted_message_row_id,\n          timestamp,\n          message_type,\n          text,\n          composition_type,\n          lookup_tables,\n          last_seen_timestamp\n        FROM composition\n        WHERE chat_row_id = ?\n        AND composition_type = ?\n        "
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00fd }
            X.1LW r3 = r1.A00     // Catch:{ all -> 0x00fd }
            long r0 = r3.A09(r10)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00fd }
            r2[r9] = r0     // Catch:{ all -> 0x00fd }
            r0 = r19
            int r0 = r0.value     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00fd }
            r2[r8] = r0     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "GET_COMPOSITION_MESSAGE"
            android.database.Cursor r2 = r7.A0A(r6, r0, r2)     // Catch:{ all -> 0x00fd }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x00f6 }
        L_0x003d:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00ef
            java.lang.String r0 = "chat_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x00f6 }
            X.1BI r10 = r3.A0B(r0)     // Catch:{ all -> 0x00f6 }
            if (r10 == 0) goto L_0x003d
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            int r14 = r2.getInt(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "text"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x00f6 }
            r11 = 0
            if (r0 == 0) goto L_0x006d
            r12 = r11
            goto L_0x0071
        L_0x006d:
            java.lang.String r12 = r2.getString(r1)     // Catch:{ all -> 0x00f6 }
        L_0x0071:
            java.lang.String r0 = "timestamp"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            long r16 = r2.getLong(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "quoted_message_row_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x00f6 }
            if (r0 != 0) goto L_0x0090
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.Long r11 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00f6 }
        L_0x0090:
            java.lang.String r0 = "composition_type"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            int r7 = r2.getInt(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "lookup_tables"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            int r15 = r2.getInt(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "last_seen_timestamp"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            boolean r0 = r2.isNull(r1)     // Catch:{ all -> 0x00f6 }
            if (r0 != 0) goto L_0x00ec
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x00f6 }
            java.lang.Long r6 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00f6 }
            if (r6 == 0) goto L_0x00ec
        L_0x00ba:
            X.0z2 r6 = X.AnonymousClass25H.A00     // Catch:{ all -> 0x00f6 }
            java.util.Iterator r8 = r6.iterator()     // Catch:{ all -> 0x00f6 }
        L_0x00c0:
            boolean r6 = r8.hasNext()     // Catch:{ all -> 0x00f6 }
            if (r6 == 0) goto L_0x00ea
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00f6 }
            r6 = r9
            X.25H r6 = (X.AnonymousClass25H) r6     // Catch:{ all -> 0x00f6 }
            int r6 = r6.value     // Catch:{ all -> 0x00f6 }
            if (r6 != r7) goto L_0x00c0
        L_0x00d1:
            X.25H r9 = (X.AnonymousClass25H) r9     // Catch:{ all -> 0x00f6 }
            if (r9 != 0) goto L_0x00d7
            X.25H r9 = X.AnonymousClass25H.UNKNOWN     // Catch:{ all -> 0x00f6 }
        L_0x00d7:
            X.2Qp r8 = X.C49472Qp.TEXT     // Catch:{ all -> 0x00f6 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x00f6 }
            r13.<init>()     // Catch:{ all -> 0x00f6 }
            X.2Dr r7 = new X.2Dr     // Catch:{ all -> 0x00f6 }
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00f6 }
            r7.A00 = r0     // Catch:{ all -> 0x00f6 }
            r5.add(r7)     // Catch:{ all -> 0x00f6 }
            goto L_0x003d
        L_0x00ea:
            r9 = 0
            goto L_0x00d1
        L_0x00ec:
            r0 = 0
            goto L_0x00ba
        L_0x00ef:
            r2.close()     // Catch:{ all -> 0x00fd }
            r4.close()
            return r5
        L_0x00f6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00fd }
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C42391y6.A00(X.25H, X.1BI):java.util.ArrayList");
    }
}
