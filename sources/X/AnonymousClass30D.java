package X;

/* renamed from: X.30D  reason: invalid class name */
public final class AnonymousClass30D implements C72113Kr {
    public final AnonymousClass190 A00;
    public final AnonymousClass1WI A01;
    public final C34471kX A02;
    public final C34491kZ A03;
    public final AnonymousClass18K A04;

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0061, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0068, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r24 = this;
            java.lang.String r0 = "CommunityEventLoggerDailyCron/sendCommunityHomeActionLogging()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14 = r24
            X.1WI r4 = r14.A01     // Catch:{ SQLiteException -> 0x0069 }
            X.1at r5 = r4.get()     // Catch:{ SQLiteException -> 0x0069 }
            X.1kZ r6 = r14.A03     // Catch:{ all -> 0x0062 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0062 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0062 }
            r2 = 0
            java.lang.String r1 = "get_community_action_counts"
            java.lang.String r0 = "SELECT jid_row_id, home_view_count, home_group_navigation_count, home_group_discovery_count, home_group_join_count FROM community_home_action_logging"
            android.database.Cursor r2 = r3.A0A(r0, r1, r2)     // Catch:{ all -> 0x0062 }
            r1 = 1
            X.31b r0 = new X.31b     // Catch:{ all -> 0x0062 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0062 }
            X.Akw r3 = new X.Akw     // Catch:{ all -> 0x0062 }
            r3.<init>(r2, r0)     // Catch:{ all -> 0x0062 }
            r2 = 0
        L_0x0029:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x005b }
            if (r0 == 0) goto L_0x003e
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x005b }
            X.2Fz r1 = (X.C46812Fz) r1     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0029
            X.18K r0 = r14.A04     // Catch:{ all -> 0x005b }
            r0.CC4(r1)     // Catch:{ all -> 0x005b }
            r2 = 1
            goto L_0x0029
        L_0x003e:
            r3.close()     // Catch:{ all -> 0x0062 }
            r5.close()     // Catch:{ SQLiteException -> 0x0069 }
            if (r2 == 0) goto L_0x0078
            java.lang.String r0 = "DailyMetricsDbHelper/recreating community table"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Ev r0 = r4.Bbw()
            android.database.sqlite.SQLiteDatabase r3 = r0.A00
            java.lang.String r2 = "DROP TABLE IF EXISTS community_home_action_logging"
            java.lang.String r1 = "CREATE TABLE community_home_action_logging(jid_row_id INTEGER PRIMARY KEY, home_view_count INTEGER NOT NULL DEFAULT 0, home_group_navigation_count INTEGER NOT NULL DEFAULT 0, home_group_discovery_count INTEGER NOT NULL DEFAULT 0, home_group_join_count INTEGER NOT NULL DEFAULT 0)"
            java.lang.String r0 = "community_home_action_logging"
            X.AnonymousClass1WI.A02(r3, r4, r0, r2, r1)
            goto L_0x0078
        L_0x005b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005d }
        L_0x005d:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0062 }
            throw r0     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0064 }
        L_0x0064:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ SQLiteException -> 0x0069 }
            throw r0     // Catch:{ SQLiteException -> 0x0069 }
        L_0x0069:
            r3 = move-exception
            X.190 r2 = r14.A00
            java.lang.String r1 = "Issue sending community action logs"
            java.lang.String r0 = "CommunityEventLoggerDailyCron/send"
            r2.A0E(r0, r1, r3)
            java.lang.String r0 = "CommunityEventLoggerDailyCron/failed to send home actions"
            com.whatsapp.util.Log.e(r0, r3)
        L_0x0078:
            X.1kX r0 = r14.A02
            r23 = r0
            android.content.SharedPreferences r0 = X.C34471kX.A00(r23)
            java.lang.String r13 = "community_tab_no_action_view"
            r12 = 0
            int r2 = r0.getInt(r13, r12)
            android.content.SharedPreferences r0 = X.C34471kX.A00(r23)
            java.lang.String r11 = "community_tab_daily_views"
            int r1 = r0.getInt(r11, r12)
            android.content.SharedPreferences r0 = X.C34471kX.A00(r23)
            java.lang.String r10 = "community_tab_views_via_context_menu"
            int r0 = r0.getInt(r10, r12)
            int r1 = r1 + r0
            int r0 = java.lang.Math.min(r2, r1)
            long r0 = (long) r0
            r21 = r0
            android.content.SharedPreferences r0 = X.C34471kX.A00(r23)
            java.lang.String r9 = "community_tab_group_navigation"
            r8 = 0
            int r0 = r0.getInt(r9, r12)
            long r15 = (long) r0
            android.content.SharedPreferences r0 = X.C34471kX.A00(r23)
            int r0 = r0.getInt(r11, r12)
            long r6 = (long) r0
            android.content.SharedPreferences r0 = X.C34471kX.A00(r23)
            java.lang.String r5 = "community_tab_to_home_views"
            int r0 = r0.getInt(r5, r12)
            long r3 = (long) r0
            android.content.SharedPreferences r0 = X.C34471kX.A00(r23)
            int r0 = r0.getInt(r10, r12)
            long r1 = (long) r0
            r0 = 5
            long[] r0 = new long[r0]
            r0[r12] = r21
            r12 = 1
            r0[r12] = r15
            r12 = 2
            r0[r12] = r6
            r12 = 3
            r0[r12] = r3
            r12 = 4
            r0[r12] = r1
        L_0x00dd:
            r19 = r0[r8]
            r17 = 0
            int r12 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r12 == 0) goto L_0x0166
            X.2G0 r8 = new X.2G0
            r8.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r21)
            r8.A00 = r0
            java.lang.Long r12 = java.lang.Long.valueOf(r15)
            r8.A01 = r12
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r8.A03 = r6
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r8.A02 = r3
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r8.A04 = r1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r2 = "\n                  CommunityEventLoggerDailyCron/sendCommunityTabLogging\n                  /no action views = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "\n                  /navigation = "
            r1.append(r0)
            java.lang.Long r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = "\n                  / view count = "
            r1.append(r0)
            java.lang.Long r0 = r8.A03
            r1.append(r0)
            java.lang.String r0 = "\n                  / tab to home = "
            r1.append(r0)
            java.lang.Long r0 = r8.A02
            r1.append(r0)
            java.lang.String r0 = "\n                  / view count from context menu = "
            r1.append(r0)
            java.lang.Long r0 = r8.A04
            r1.append(r0)
            java.lang.String r0 = "\n                  "
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.AnonymousClass1Y7.A01(r0)
            X.18K r0 = r14.A04
            r0.CC4(r8)
            android.content.SharedPreferences r0 = X.C34471kX.A00(r23)
            android.content.SharedPreferences$Editor r0 = X.C17890vO.A09(r0, r11)
            android.content.SharedPreferences$Editor r0 = r0.remove(r10)
            android.content.SharedPreferences$Editor r0 = r0.remove(r5)
            android.content.SharedPreferences$Editor r0 = r0.remove(r9)
            android.content.SharedPreferences$Editor r0 = r0.remove(r13)
            r0.commit()
        L_0x0165:
            return
        L_0x0166:
            int r8 = r8 + 1
            r12 = 5
            if (r8 >= r12) goto L_0x0165
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30D.Bqf():void");
    }

    public AnonymousClass30D(AnonymousClass190 r1, AnonymousClass1WI r2, C34471kX r3, C34491kZ r4, AnonymousClass18K r5) {
        C18070vi.A0w(r1, r5, r2, r3, r4);
        this.A00 = r1;
        this.A04 = r5;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
