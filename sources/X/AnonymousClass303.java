package X;

/* renamed from: X.303  reason: invalid class name */
public final class AnonymousClass303 implements C72113Kr {
    public final AnonymousClass1WI A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r7 = this;
            X.1WI r4 = r7.A00     // Catch:{ SQLiteException -> 0x0074 }
            X.1at r3 = r4.get()     // Catch:{ SQLiteException -> 0x0074 }
            X.00H r0 = r7.A02     // Catch:{ all -> 0x006d }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x006d }
            X.2aI r6 = (X.C52052aI) r6     // Catch:{ all -> 0x006d }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x006d }
            r5 = 0
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ Exception -> 0x0049 }
            X.1Ev r2 = r0.A02     // Catch:{ Exception -> 0x0049 }
            java.lang.String r1 = "\n          SELECT\n            comment_parent_group_id, \n            comment_space_id, \n            comments, \n            comment_deletes, \n            accumulated_comments, \n            group_size_bucket,\n            cag_message_sent_ds \n          FROM comments_event_logging\n        "
            java.lang.String r0 = "get_comment_action_counts"
            android.database.Cursor r5 = X.C18070vi.A04(r2, r1, r0, r5)     // Catch:{ Exception -> 0x0049 }
            r1 = 0
            X.31b r0 = new X.31b     // Catch:{ Exception -> 0x0049 }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0049 }
            X.Akw r2 = new X.Akw     // Catch:{ Exception -> 0x0049 }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x0049 }
        L_0x002a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0042 }
            X.2GR r1 = (X.AnonymousClass2GR) r1     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x002a
            X.18K r0 = r7.A01     // Catch:{ all -> 0x0042 }
            r0.CC4(r1)     // Catch:{ all -> 0x0042 }
            goto L_0x002a
        L_0x003e:
            r2.close()     // Catch:{ all -> 0x006d }
            goto L_0x005a
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x0049:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "CommentDailyActionLoggingStore/getWamCommentsDailyStats: "
            r1.append(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x006d }
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x006d }
        L_0x005a:
            r3.close()     // Catch:{ SQLiteException -> 0x0074 }
            X.1Ev r0 = r4.Bbw()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "DROP TABLE IF EXISTS comments_event_logging"
            java.lang.String r1 = "CREATE TABLE comments_event_logging (comment_space_id TEXT PRIMARY KEY, comment_parent_group_id TEXT NOT NULL, comments INTEGER NOT NULL DEFAULT 0, comment_deletes INTEGER NOT NULL DEFAULT 0, accumulated_comments INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, cag_message_sent_ds INTEGER NOT NULL DEFAULT 0)"
            java.lang.String r0 = "comments_event_logging"
            X.AnonymousClass1WI.A02(r3, r4, r0, r2, r1)
            return
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ SQLiteException -> 0x0074 }
            throw r0     // Catch:{ SQLiteException -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            java.lang.String r0 = "CommentsDailyEventLoggerDailyCron/failed to send comments daily actions"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass303.Bqf():void");
    }

    public AnonymousClass303(AnonymousClass1WI r1, AnonymousClass18K r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
