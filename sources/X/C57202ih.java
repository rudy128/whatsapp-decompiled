package X;

/* renamed from: X.2ih  reason: invalid class name and case insensitive filesystem */
public class C57202ih {
    public final AnonymousClass1DL A00;
    public final AnonymousClass1Cd A01;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A00(X.AnonymousClass22O r22) {
        /*
            r21 = this;
            r5 = r22
            long r1 = r5.A0x
            r19 = -1
            int r0 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x0170
            r4 = 0
            r3 = r21
            X.1Cd r6 = r3.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169, Error | RuntimeException -> 0x0164 }
            X.1au r18 = r6.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169, Error | RuntimeException -> 0x0164 }
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x015a }
            java.util.ArrayList r0 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x015a }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x015a }
        L_0x001d:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x0156
            java.lang.Object r16 = r17.next()     // Catch:{ all -> 0x015a }
            r2 = r16
            X.9Bw r2 = (X.C178119Bw) r2     // Catch:{ all -> 0x015a }
            monitor-enter(r16)     // Catch:{ all -> 0x015a }
            boolean r0 = r2.A04()     // Catch:{ all -> 0x014c }
            int r7 = r2.A01     // Catch:{ all -> 0x014c }
            monitor-exit(r16)     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x001d
            android.content.ContentValues r9 = X.C17880vN.A08()     // Catch:{ all -> 0x015a }
            long r10 = r2.A01()     // Catch:{ all -> 0x015a }
            int r0 = (r10 > r19 ? 1 : (r10 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x004a
            java.lang.String r8 = "_id"
            long r0 = r2.A01()     // Catch:{ all -> 0x015a }
            X.C17880vN.A19(r9, r8, r0)     // Catch:{ all -> 0x015a }
        L_0x004a:
            X.AnonymousClass206.A04(r9, r5)     // Catch:{ all -> 0x015a }
            java.lang.String r8 = "timestamp"
            long r0 = r2.A01     // Catch:{ all -> 0x015a }
            X.C17880vN.A19(r9, r8, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "video_call"
            boolean r0 = r2.A0J     // Catch:{ all -> 0x015a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x015a }
            r9.put(r1, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r8 = "group_jid_row_id"
            com.whatsapp.jid.GroupJid r0 = r2.A0C     // Catch:{ all -> 0x015a }
            if (r0 == 0) goto L_0x00a5
            X.1DL r1 = r3.A00     // Catch:{ all -> 0x015a }
            com.whatsapp.jid.GroupJid r0 = r2.A0C     // Catch:{ all -> 0x015a }
            long r0 = r1.A09(r0)     // Catch:{ all -> 0x015a }
        L_0x006f:
            X.C17880vN.A19(r9, r8, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "is_joinable_group_call"
            boolean r0 = r2.A0I     // Catch:{ all -> 0x015a }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x015a }
            r9.put(r1, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "is_dnd_mode_on"
            X.9Il r0 = r2.A0A()     // Catch:{ all -> 0x015a }
            int r0 = r0.databaseValue     // Catch:{ all -> 0x015a }
            X.C17880vN.A18(r9, r1, r0)     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "offer_silence_reason"
            X.C178119Bw.A00(r2)     // Catch:{ all -> 0x015a }
            int r0 = r2.A09     // Catch:{ all -> 0x015a }
            X.C17880vN.A18(r9, r1, r0)     // Catch:{ all -> 0x015a }
            r0 = r18
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x015a }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x015a }
            java.lang.String r1 = "missed_call_logs"
            java.lang.String r0 = "insertOrUpdateCallLog/REPLACE_MISSED_CALL_LOGS"
            long r0 = r8.A07(r1, r0, r9)     // Catch:{ all -> 0x015a }
            r2.A03(r0)     // Catch:{ all -> 0x015a }
            monitor-enter(r16)     // Catch:{ all -> 0x015a }
            goto L_0x00a8
        L_0x00a5:
            r0 = 0
            goto L_0x006f
        L_0x00a8:
            int r0 = r2.A01     // Catch:{ all -> 0x014c }
            if (r7 != r0) goto L_0x00b2
            r2.A02 = r4     // Catch:{ all -> 0x014c }
            int r0 = r0 + 1
            r2.A01 = r0     // Catch:{ all -> 0x014c }
        L_0x00b2:
            monitor-exit(r16)     // Catch:{ all -> 0x015a }
            long r7 = r2.A01()     // Catch:{ all -> 0x015a }
            int r0 = (r7 > r19 ? 1 : (r7 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x014f
            X.1au r15 = r6.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x013f, Error | RuntimeException -> 0x0147 }
            java.util.ArrayList r0 = r2.A0B()     // Catch:{ all -> 0x0135 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0135 }
        L_0x00c7:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x012e
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x0135 }
            r7 = r13
            X.9Bv r7 = (X.C178109Bv) r7     // Catch:{ all -> 0x0135 }
            monitor-enter(r13)     // Catch:{ all -> 0x0135 }
            boolean r0 = r7.A04()     // Catch:{ all -> 0x012b }
            int r8 = r7.A01     // Catch:{ all -> 0x012b }
            monitor-exit(r13)     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x00c7
            android.content.ContentValues r10 = X.C17880vN.A08()     // Catch:{ all -> 0x0135 }
            java.lang.String r9 = "call_logs_row_id"
            long r0 = r2.A01()     // Catch:{ all -> 0x0135 }
            X.C17880vN.A19(r10, r9, r0)     // Catch:{ all -> 0x0135 }
            long r11 = r7.A01()     // Catch:{ all -> 0x0135 }
            int r0 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r0 == 0) goto L_0x00fc
            java.lang.String r9 = "_id"
            long r0 = r7.A01()     // Catch:{ all -> 0x0135 }
            X.C17880vN.A19(r10, r9, r0)     // Catch:{ all -> 0x0135 }
        L_0x00fc:
            java.lang.String r1 = "jid"
            com.whatsapp.jid.UserJid r0 = r7.A00     // Catch:{ all -> 0x0135 }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x0135 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = "call_result"
            int r0 = r7.A01     // Catch:{ all -> 0x0135 }
            X.C17880vN.A18(r10, r1, r0)     // Catch:{ all -> 0x0135 }
            r0 = r15
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0135 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = "missed_call_log_participant"
            java.lang.String r0 = "insertOrUpdateCallLogParticipants/REPLACE_MISSED_CALL_LOG_PARTICIPANTS"
            long r0 = r9.A07(r1, r0, r10)     // Catch:{ all -> 0x0135 }
            r7.A03(r0)     // Catch:{ all -> 0x0135 }
            monitor-enter(r13)     // Catch:{ all -> 0x0135 }
            int r0 = r7.A01     // Catch:{ all -> 0x012b }
            if (r8 != r0) goto L_0x0129
            r7.A02 = r4     // Catch:{ all -> 0x012b }
            int r0 = r0 + 1
            r7.A01 = r0     // Catch:{ all -> 0x012b }
        L_0x0129:
            monitor-exit(r13)     // Catch:{ all -> 0x0135 }
            goto L_0x00c7
        L_0x012b:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0135 }
            throw r0     // Catch:{ all -> 0x0135 }
        L_0x012e:
            monitor-enter(r16)     // Catch:{ all -> 0x0135 }
            monitor-exit(r16)     // Catch:{ all -> 0x0135 }
            r15.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x013f, Error | RuntimeException -> 0x0147 }
            goto L_0x001d
        L_0x0135:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x013a }
            goto L_0x013e
        L_0x013a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x013f, Error | RuntimeException -> 0x0147 }
        L_0x013e:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x013f, Error | RuntimeException -> 0x0147 }
        L_0x013f:
            r1 = move-exception
            java.lang.String r0 = "MissedCallLogStore/insertOfUpdateCallLogParticipants"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x015a }
            goto L_0x001d
        L_0x0147:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x015a }
            goto L_0x0155
        L_0x014c:
            r0 = move-exception
            monitor-exit(r16)     // Catch:{ all -> 0x015a }
            goto L_0x0155
        L_0x014f:
            java.lang.String r0 = "CallLog row_id is not set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)     // Catch:{ all -> 0x015a }
        L_0x0155:
            throw r0     // Catch:{ all -> 0x015a }
        L_0x0156:
            r18.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169, Error | RuntimeException -> 0x0164 }
            return
        L_0x015a:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x015f }
            goto L_0x0163
        L_0x015f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169, Error | RuntimeException -> 0x0164 }
        L_0x0163:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169, Error | RuntimeException -> 0x0164 }
        L_0x0164:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            throw r0
        L_0x0169:
            r1 = move-exception
            java.lang.String r0 = "MissedCallLogStore/insertOfUpdateCallLogs"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0170:
            java.lang.String r0 = "message.row_id is not set"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57202ih.A00(X.22O):void");
    }

    public C57202ih(AnonymousClass1DL r1, AnonymousClass1Cd r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
