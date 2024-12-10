package X;

/* renamed from: X.397  reason: invalid class name */
public final class AnonymousClass397 implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass397(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            r1 = 0
            X.C18070vi.A0d(r10, r1)
            X.00H r0 = r9.A00
            java.lang.Object r0 = r0.get()
            X.2az r0 = (X.C52482az) r0
            X.24P r10 = (X.AnonymousClass24P) r10
            X.C18070vi.A0d(r10, r1)
            X.1Cd r0 = r0.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0063 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "SELECT _id, option_sha256, option_name, vote_total FROM message_poll_option WHERE message_row_id = ?"
            java.lang.String[] r1 = X.AnonymousClass206.A09(r10)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "GET_MESSAGE_POLL_OPTION_SQL"
            android.database.Cursor r8 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0063 }
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "option_name"
            int r5 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005c }
            java.lang.String r0 = "vote_total"
            int r4 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005c }
        L_0x0039:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x005c }
            if (r0 == 0) goto L_0x0053
            java.lang.String r3 = r8.getString(r5)     // Catch:{ all -> 0x005c }
            long r1 = r8.getLong(r4)     // Catch:{ all -> 0x005c }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x005c }
            X.2lq r0 = new X.2lq     // Catch:{ all -> 0x005c }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x005c }
            r7.add(r0)     // Catch:{ all -> 0x005c }
            goto L_0x0039
        L_0x0053:
            r8.close()     // Catch:{ all -> 0x0063 }
            r6.close()
            r10.A01 = r7
            return
        L_0x005c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0063 }
            throw r0     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass397.BL9(X.206):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdY(X.AnonymousClass206 r9) {
        /*
            r8 = this;
            r1 = 0
            X.C18070vi.A0d(r9, r1)
            X.00H r0 = r8.A00
            java.lang.Object r0 = r0.get()
            X.2az r0 = (X.C52482az) r0
            X.24P r9 = (X.AnonymousClass24P) r9
            X.C18070vi.A0d(r9, r1)
            X.1Cd r0 = r0.A00
            X.1au r5 = r0.A05()
            X.1xA r6 = r5.BD0()     // Catch:{ all -> 0x0070 }
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x0069 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0069 }
        L_0x0021:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0069 }
            if (r0 == 0) goto L_0x005f
            java.lang.Object r4 = r7.next()     // Catch:{ all -> 0x0069 }
            X.2lq r4 = (X.C59152lq) r4     // Catch:{ all -> 0x0069 }
            r0 = 5
            android.content.ContentValues r3 = X.C17880vN.A09(r0)     // Catch:{ all -> 0x0069 }
            X.AnonymousClass206.A04(r3, r9)     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "option_name"
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x0069 }
            r3.put(r1, r0)     // Catch:{ all -> 0x0069 }
            java.lang.String r2 = "vote_total"
            long r0 = r4.A00     // Catch:{ all -> 0x0069 }
            X.C17880vN.A19(r3, r2, r0)     // Catch:{ all -> 0x0069 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0069 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0069 }
            java.lang.String r1 = "message_poll_option"
            java.lang.String r0 = "PollResultSnapshotMessageStore/insertPollResultSnapshotInfoForMessage"
            long r3 = r2.A05(r1, r0, r3)     // Catch:{ all -> 0x0069 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0021
            java.lang.String r1 = "PollResultSnapshotMessageStore/insertPollResultSnapshotInfoForMessage the row was not inserted"
            android.database.SQLException r0 = new android.database.SQLException     // Catch:{ all -> 0x0069 }
            r0.<init>(r1)     // Catch:{ all -> 0x0069 }
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x005f:
            r6.A00()     // Catch:{ all -> 0x0069 }
            r6.close()     // Catch:{ all -> 0x0070 }
            r5.close()
            return
        L_0x0069:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006b }
        L_0x006b:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0070 }
            throw r0     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0072 }
        L_0x0072:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass397.BdY(X.206):void");
    }

    public void CQL(AnonymousClass206 r1) {
    }
}
