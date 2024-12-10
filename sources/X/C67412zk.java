package X;

/* renamed from: X.2zk  reason: invalid class name and case insensitive filesystem */
public final class C67412zk implements AnonymousClass1L0 {
    public final AnonymousClass1WI A00;
    public final AnonymousClass1WJ A01;
    public final C18030ve A02;
    public final AnonymousClass18K A03;

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqh() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqi() {
        /*
            r7 = this;
            X.0ve r2 = r7.A02
            r1 = 2321(0x911, float:3.252E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0089
            java.lang.String r0 = "PollStatsLoggerDailyCron/sendPollDailyActionsLogging()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1WI r4 = r7.A00
            X.1at r3 = r4.get()
            X.1WJ r6 = r7.A01     // Catch:{ all -> 0x0082 }
            r5 = 0
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ Exception -> 0x005e }
            X.1Ev r2 = r0.A02     // Catch:{ Exception -> 0x005e }
            java.lang.String r1 = "SELECT poll_id, poll_votes, poll_votes_changed, poll_vote_deletes, option_count, users_participated, poll_creation_ds, group_size_bucket, is_a_group_flag FROM poll_event_logging"
            java.lang.String r0 = "get_poll_action_counts"
            android.database.Cursor r5 = r2.A0A(r1, r0, r5)     // Catch:{ Exception -> 0x005e }
            r1 = 3
            X.31b r0 = new X.31b     // Catch:{ Exception -> 0x005e }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x005e }
            X.Akw r2 = new X.Akw     // Catch:{ Exception -> 0x005e }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x005e }
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x003f
            r2.close()     // Catch:{ all -> 0x0082 }
            r3.close()
            return
        L_0x003f:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0057 }
            X.2Gq r1 = (X.C46982Gq) r1     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x003f
            X.18K r0 = r7.A03     // Catch:{ all -> 0x0057 }
            r0.CC4(r1)     // Catch:{ all -> 0x0057 }
            goto L_0x003f
        L_0x0053:
            r2.close()     // Catch:{ all -> 0x0082 }
            goto L_0x006f
        L_0x0057:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0082 }
            throw r0     // Catch:{ all -> 0x0082 }
        L_0x005e:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "PollDailyActionLoggingStore/getWamPollsDailyStats: "
            r1.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0082 }
            X.C17890vO.A19(r1, r0)     // Catch:{ all -> 0x0082 }
        L_0x006f:
            r3.close()
            X.1Ev r0 = r4.Bbw()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "poll_event_logging"
            java.lang.String r1 = "DROP TABLE IF EXISTS poll_event_logging"
            java.lang.String r0 = "CREATE TABLE poll_event_logging(poll_id INTEGER PRIMARY KEY, poll_votes INTEGER NOT NULL DEFAULT 0, poll_votes_changed INTEGER NOT NULL DEFAULT 0, poll_vote_deletes INTEGER NOT NULL DEFAULT 0,option_count INTEGER NOT NULL DEFAULT 0, users_participated INTEGER NOT NULL DEFAULT 0, poll_creation_ds INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, is_a_group_flag INTEGER NOT NULL DEFAULT 0)"
            X.AnonymousClass1WI.A02(r3, r4, r2, r1, r0)
            return
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67412zk.Bqi():void");
    }

    public C67412zk(AnonymousClass1WI r1, AnonymousClass1WJ r2, C18030ve r3, AnonymousClass18K r4) {
        C18070vi.A0s(r3, r4, r1, r2);
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
    }
}
