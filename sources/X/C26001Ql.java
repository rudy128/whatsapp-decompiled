package X;

/* renamed from: X.1Ql  reason: invalid class name and case insensitive filesystem */
public final class C26001Ql {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public C26001Ql(AnonymousClass1Cd r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A02 = r3;
        this.A00 = r2;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            r6 = 0
            X.C18070vi.A0d(r8, r6)
            X.1Cd r0 = r7.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0047 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0047 }
            java.lang.String r4 = "\n          SELECT COUNT(*) as reply_count\n          FROM message_comment\n          WHERE parent_message_row_id = ?\n        "
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0047 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0047 }
            r2[r6] = r0     // Catch:{ all -> 0x0047 }
            java.lang.String r0 = "SELECT_COMMENT_COUNT_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r2 = r5.A0A(r4, r0, r2)     // Catch:{ all -> 0x0047 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "reply_count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0040 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0040 }
            r2.close()     // Catch:{ all -> 0x0047 }
            r3.close()
            return r0
        L_0x0039:
            r2.close()     // Catch:{ all -> 0x0047 }
            r3.close()
            return r6
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0047 }
            throw r0     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26001Ql.A00(X.206):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        X.CDX.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0075, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0076, code lost:
        X.CDX.A00(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(java.util.List r9, int r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r7 = r9.iterator()
        L_0x000d:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007a
            java.lang.Object r1 = r7.next()
            X.206 r1 = (X.AnonymousClass206) r1
            r0 = 16
            boolean r0 = r1.A0z(r0)
            if (r0 == 0) goto L_0x000d
            long r1 = r1.A0x
            X.1Cd r0 = r8.A00
            X.1at r5 = r0.get()
            X.C18070vi.A0b(r5)     // Catch:{ all -> 0x0073 }
            r6 = 0
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0073 }
            r3[r6] = r0     // Catch:{ all -> 0x0073 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0073 }
            r3[r1] = r0     // Catch:{ all -> 0x0073 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0073 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0073 }
            java.lang.String r1 = X.C50862Wb.A01     // Catch:{ all -> 0x0073 }
            java.lang.String r0 = "SELECT_COMMENTS_FOR_PARENT_MESSAGE_QUERY_ID"
            android.database.Cursor r2 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0073 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0073 }
            r5.close()
        L_0x0050:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0068
            X.00H r0 = r8.A02     // Catch:{ all -> 0x006c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x006c }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x006c }
            X.206 r0 = r0.A01(r2)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0050
            r4.add(r0)     // Catch:{ all -> 0x006c }
            goto L_0x0050
        L_0x0068:
            r2.close()
            goto L_0x000d
        L_0x006c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r1 = move-exception
            X.CDX.A00(r2, r0)
            throw r1
        L_0x0073:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            X.CDX.A00(r5, r0)
            throw r1
        L_0x007a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26001Ql.A01(java.util.List, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            X.36k r0 = X.C60472o5.A00(r8)
            r4 = -1
            if (r0 == 0) goto L_0x0016
            java.lang.Long r3 = r0.A02()
            if (r3 == 0) goto L_0x0017
            long r1 = r3.longValue()
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0017
        L_0x0016:
            return
        L_0x0017:
            X.1Cd r0 = r7.A00
            X.1au r4 = r0.A05()
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x0055 }
            r0 = 2
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x004e }
            r6.<init>(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "message_row_id"
            long r0 = r8.A0x     // Catch:{ all -> 0x004e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004e }
            r6.put(r2, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "parent_message_row_id"
            r6.put(r0, r3)     // Catch:{ all -> 0x004e }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "message_comment"
            java.lang.String r1 = "insertIntoCommentsTable/INSERT_COMMENT_MESSAGES"
            r0 = 4
            r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x004e }
            r5.A00()     // Catch:{ all -> 0x004e }
            r5.close()     // Catch:{ all -> 0x0055 }
            r4.close()
            return
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26001Ql.A02(X.206):void");
    }
}
