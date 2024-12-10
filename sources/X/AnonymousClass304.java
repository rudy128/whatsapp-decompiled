package X;

/* renamed from: X.304  reason: invalid class name */
public final class AnonymousClass304 implements C72113Kr {
    public final AnonymousClass1WI A00;
    public final C56882iB A01;
    public final AnonymousClass18K A02;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r7 = this;
            X.1WI r4 = r7.A00     // Catch:{ SQLiteException -> 0x00b2 }
            X.1at r3 = r4.get()     // Catch:{ SQLiteException -> 0x00b2 }
            X.2iB r6 = r7.A01     // Catch:{ all -> 0x00ab }
            r5 = 0
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ Exception -> 0x0089 }
            X.1Ev r2 = r0.A02     // Catch:{ Exception -> 0x0089 }
            java.lang.String r1 = "SELECT community_id, type_of_subgroup, reaction_open_tray_count, reaction_delete_count, pnh_indicator_clicks_chat, pnh_indicator_clicks_info_screen FROM pnh_daily_event_logging"
            java.lang.String r0 = "get_pnh_daily_action_counts"
            android.database.Cursor r5 = r2.A0A(r1, r0, r5)     // Catch:{ Exception -> 0x0089 }
            r1 = 2
            X.31b r0 = new X.31b     // Catch:{ Exception -> 0x0089 }
            r0.<init>(r6, r1)     // Catch:{ Exception -> 0x0089 }
            X.Akw r2 = new X.Akw     // Catch:{ Exception -> 0x0089 }
            r2.<init>(r5, r0)     // Catch:{ Exception -> 0x0089 }
        L_0x0021:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x007e
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0082 }
            X.2GH r1 = (X.AnonymousClass2GH) r1     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0021
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "\n                  PnhDailyEventLoggerDailyCron/sendPnhDailyActionLogging\n                  /community id = "
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r1.A05     // Catch:{ all -> 0x0082 }
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "\n                  /type of group = "
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.Integer r0 = r1.A00     // Catch:{ all -> 0x0082 }
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "\n                  /pnh click in chat = "
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.Long r0 = r1.A01     // Catch:{ all -> 0x0082 }
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "\n                  /pnh click in cag info = "
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.Long r0 = r1.A02     // Catch:{ all -> 0x0082 }
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "\n                  /reaction delete count = "
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.Long r0 = r1.A03     // Catch:{ all -> 0x0082 }
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "\n                  /reaction open tray count = "
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.Long r0 = r1.A04     // Catch:{ all -> 0x0082 }
            r5.append(r0)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "\n                  "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r5)     // Catch:{ all -> 0x0082 }
            X.AnonymousClass1Y7.A01(r0)     // Catch:{ all -> 0x0082 }
            X.18K r0 = r7.A02     // Catch:{ all -> 0x0082 }
            r0.CC4(r1)     // Catch:{ all -> 0x0082 }
            goto L_0x0021
        L_0x007e:
            r2.close()     // Catch:{ all -> 0x00ab }
            goto L_0x0093
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00ab }
            throw r0     // Catch:{ all -> 0x00ab }
        L_0x0089:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "PollDailyActionLoggingStore/getWamPnhDaily failure: "
            X.C17900vP.A0X(r2, r0, r1)     // Catch:{ all -> 0x00ab }
        L_0x0093:
            r3.close()     // Catch:{ SQLiteException -> 0x00b2 }
            java.lang.String r0 = "DailyMetricsDbHelper/recreating pnh_daily_event_logging table"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ev r0 = r4.Bbw()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "pnh_daily_event_logging"
            java.lang.String r1 = "DROP TABLE IF EXISTS pnh_daily_event_logging"
            java.lang.String r0 = "CREATE TABLE pnh_daily_event_logging(community_id TEXT NOT NULL, type_of_subgroup INTEGER NOT NULL, reaction_open_tray_count INTEGER NOT NULL DEFAULT 0, reaction_delete_count INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_chat INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_info_screen INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (community_id, type_of_subgroup))"
            X.AnonymousClass1WI.A02(r3, r4, r2, r1, r0)
            return
        L_0x00ab:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ SQLiteException -> 0x00b2 }
            throw r0     // Catch:{ SQLiteException -> 0x00b2 }
        L_0x00b2:
            r1 = move-exception
            java.lang.String r0 = "PnhDailyEventLoggerDailyCron/failed to send pnh daily actions"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass304.Bqf():void");
    }

    public AnonymousClass304(AnonymousClass1WI r1, C56882iB r2, AnonymousClass18K r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
