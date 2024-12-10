package X;

/* renamed from: X.398  reason: invalid class name */
public final class AnonymousClass398 implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass398(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0101, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0109, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x010c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0113, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0116, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0117, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011a, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r14) {
        /*
            r13 = this;
            r5 = 0
            X.C18070vi.A0d(r14, r5)
            X.00H r0 = r13.A00
            java.lang.Object r0 = r0.get()
            X.2mH r0 = (X.C59422mH) r0
            X.22H r14 = (X.AnonymousClass22H) r14
            X.C18070vi.A0d(r14, r5)
            X.1Cd r7 = r0.A01
            X.1at r3 = r7.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0114 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0114 }
            java.lang.String r4 = "SELECT selectable_options_count, invalid_state, poll_logging_id, poll_type, correct_option_id FROM message_poll WHERE message_row_id = ?"
            r6 = 1
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x0114 }
            long r0 = r14.A0x     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0114 }
            r11 = 0
            r2[r5] = r0     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "GET_MESSAGE_POLL_SQL"
            android.database.Cursor r4 = r8.A0A(r4, r0, r2)     // Catch:{ all -> 0x0114 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x010d }
            if (r0 == 0) goto L_0x007c
            java.lang.String r0 = "selectable_options_count"
            int r9 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "invalid_state"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "poll_logging_id"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "poll_type"
            int r8 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "correct_option_id"
            int r10 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x010d }
            int r0 = r4.getInt(r9)     // Catch:{ all -> 0x010d }
            r14.A02 = r0     // Catch:{ all -> 0x010d }
            int r0 = r4.getInt(r2)     // Catch:{ all -> 0x010d }
            r14.A00 = r0     // Catch:{ all -> 0x010d }
            long r0 = r4.getLong(r1)     // Catch:{ all -> 0x010d }
            r14.A04 = r0     // Catch:{ all -> 0x010d }
            r1 = 0
            long r8 = X.AnonymousClass1Eu.A02(r4, r8, r1)     // Catch:{ all -> 0x010d }
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0072
            r11 = 1
        L_0x0072:
            r14.A01 = r11     // Catch:{ all -> 0x010d }
            if (r11 != r6) goto L_0x007c
            long r0 = X.AnonymousClass1Eu.A02(r4, r10, r1)     // Catch:{ all -> 0x010d }
            r14.A03 = r0     // Catch:{ all -> 0x010d }
        L_0x007c:
            r4.close()     // Catch:{ all -> 0x0114 }
            r3.close()
            X.1at r7 = r7.get()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0106 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0106 }
            java.lang.String r3 = "SELECT _id, option_sha256, option_name, vote_total FROM message_poll_option WHERE message_row_id = ?"
            java.lang.String[] r2 = new java.lang.String[r6]     // Catch:{ all -> 0x0106 }
            long r0 = r14.A0x     // Catch:{ all -> 0x0106 }
            X.C17880vN.A1V(r2, r5, r0)     // Catch:{ all -> 0x0106 }
            java.lang.String r0 = "GET_MESSAGE_POLL_OPTION_SQL"
            android.database.Cursor r9 = r4.A0A(r3, r0, r2)     // Catch:{ all -> 0x0106 }
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x00a7
            r9.close()     // Catch:{ all -> 0x0106 }
            r7.close()
            return
        L_0x00a7:
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "_id"
            int r11 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "option_name"
            int r8 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "option_sha256"
            int r6 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "vote_total"
            int r5 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ff }
        L_0x00c4:
            long r3 = r9.getLong(r11)     // Catch:{ all -> 0x00ff }
            java.lang.String r2 = r9.getString(r8)     // Catch:{ all -> 0x00ff }
            java.lang.String r1 = r9.getString(r6)     // Catch:{ all -> 0x00ff }
            int r0 = r9.getInt(r5)     // Catch:{ all -> 0x00ff }
            X.A18 r12 = new X.A18     // Catch:{ all -> 0x00ff }
            r12.<init>(r2, r1)     // Catch:{ all -> 0x00ff }
            r12.A01 = r3     // Catch:{ all -> 0x00ff }
            r12.A00 = r0     // Catch:{ all -> 0x00ff }
            long r1 = r14.A03     // Catch:{ all -> 0x00ff }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r12.A03 = r0     // Catch:{ all -> 0x00ff }
            r10.add(r12)     // Catch:{ all -> 0x00ff }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x00c4
            r9.close()     // Catch:{ all -> 0x0106 }
            r7.close()
            java.util.List r0 = r14.A07
            r0.clear()
            r0.addAll(r10)
            return
        L_0x00ff:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0101 }
        L_0x0101:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x0106 }
            throw r0     // Catch:{ all -> 0x0106 }
        L_0x0106:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0108 }
        L_0x0108:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        L_0x010d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010f }
        L_0x010f:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0114 }
            throw r0     // Catch:{ all -> 0x0114 }
        L_0x0114:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0116 }
        L_0x0116:
            r1 = move-exception
            X.CDX.A00(r3, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass398.BL9(X.206):void");
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C59422mH) this.A00.get()).A01((AnonymousClass22H) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C59422mH) this.A00.get()).A01((AnonymousClass22H) r2);
    }
}
