package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.73E  reason: invalid class name */
public final class AnonymousClass73E {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A04(java.util.List r22) {
        /*
            r21 = this;
            r7 = 0
            java.util.HashMap r6 = X.C17880vN.A11()
            r0 = r21
            X.1Cd r0 = r0.A00
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00ca }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x00ca }
            int r1 = r22.size()     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "SELECT * FROM status_crossposting_v3 WHERE status_message_row_id IN ("
            r2.append(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x00ca }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C108995ce.A0X(r0, r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r3 = X.C17900vP.A0B(r0, r2)     // Catch:{ all -> 0x00ca }
            java.util.ArrayList r2 = X.C29351c6.A0D(r22)     // Catch:{ all -> 0x00ca }
            java.util.Iterator r1 = r22.iterator()     // Catch:{ all -> 0x00ca }
        L_0x003a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x0044
            X.C108995ce.A1R(r2, r1)     // Catch:{ all -> 0x00ca }
            goto L_0x003a
        L_0x0044:
            java.lang.String[] r1 = X.C17890vO.A1b(r2, r7)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r4 = r4.A0A(r3, r0, r1)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "status_message_row_id"
            int r9 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "crossposting_session_id"
            int r8 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "crossposting_status_unique_id"
            int r7 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "state"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "direct_url_path"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "media_file_path"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r0 = "destination"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00c3 }
        L_0x0078:
            boolean r10 = r4.moveToNext()     // Catch:{ all -> 0x00c3 }
            if (r10 == 0) goto L_0x00bc
            long r19 = r4.getLong(r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r14 = r4.getString(r8)     // Catch:{ all -> 0x00c3 }
            java.lang.String r15 = r4.getString(r7)     // Catch:{ all -> 0x00c3 }
            java.lang.String r16 = r4.getString(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r17 = r4.getString(r2)     // Catch:{ all -> 0x00c3 }
            int r18 = r4.getInt(r3)     // Catch:{ all -> 0x00c3 }
            int r10 = r4.getInt(r0)     // Catch:{ all -> 0x00c3 }
            X.6Re r13 = X.AnonymousClass6WG.A00(r10)     // Catch:{ all -> 0x00c3 }
            X.6tf r12 = new X.6tf     // Catch:{ all -> 0x00c3 }
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00c3 }
            long r10 = r12.A01     // Catch:{ all -> 0x00c3 }
            java.lang.Long r11 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x00c3 }
            java.lang.Object r10 = r6.get(r11)     // Catch:{ all -> 0x00c3 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ all -> 0x00c3 }
            if (r10 != 0) goto L_0x00b8
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00c3 }
            r6.put(r11, r10)     // Catch:{ all -> 0x00c3 }
        L_0x00b8:
            r10.add(r12)     // Catch:{ all -> 0x00c3 }
            goto L_0x0078
        L_0x00bc:
            r4.close()     // Catch:{ all -> 0x00ca }
            r5.close()
            return r6
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73E.A04(java.util.List):java.util.HashMap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.util.List r11, java.util.List r12) {
        /*
            r10 = this;
            r7 = 0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.ArrayList r2 = X.C29351c6.A0E(r11)
            java.util.Iterator r1 = r11.iterator()
        L_0x000d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0017
            X.C108995ce.A1R(r2, r1)
            goto L_0x000d
        L_0x0017:
            r6.addAll(r2)
            java.util.ArrayList r2 = X.C29351c6.A0E(r12)
            java.util.Iterator r1 = r12.iterator()
        L_0x0022:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0038
            java.lang.Object r0 = r1.next()
            X.6Re r0 = (X.C122646Re) r0
            int r0 = r0.databaseValue
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x0022
        L_0x0038:
            r6.addAll(r2)
            X.738 r9 = r10.A03()
            X.AnonymousClass738.A02(r9)
            android.util.LongSparseArray r8 = r9.A00
            monitor-enter(r8)
            java.util.Iterator r5 = r11.iterator()     // Catch:{ all -> 0x0096 }
        L_0x0049:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0068
            long r2 = X.C17890vO.A07(r5)     // Catch:{ all -> 0x0096 }
            java.util.Iterator r4 = r12.iterator()     // Catch:{ all -> 0x0096 }
        L_0x0057:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r1 = r4.next()     // Catch:{ all -> 0x0096 }
            X.6Re r1 = (X.C122646Re) r1     // Catch:{ all -> 0x0096 }
            r0 = 0
            X.AnonymousClass738.A01(r1, r9, r0, r2)     // Catch:{ all -> 0x0096 }
            goto L_0x0057
        L_0x0068:
            monitor-exit(r8)
            X.1Cd r0 = r10.A00
            X.1au r5 = r0.A05()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x008f }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "status_crossposting_v3"
            int r1 = r11.size()     // Catch:{ all -> 0x008f }
            int r0 = r12.size()     // Catch:{ all -> 0x008f }
            java.lang.String r2 = A00(r1, r0)     // Catch:{ all -> 0x008f }
            java.lang.String[] r1 = X.C17890vO.A1b(r6, r7)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/DELETE_CROSSPOSTING_COLUMN_BY_MESSAGE_AND_DESTINATION_IDS"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x008f }
            r5.close()
            return
        L_0x008f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        L_0x0096:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73E.A06(java.util.List, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a5, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(java.util.List r14, java.util.List r15, int r16) {
        /*
            r13 = this;
            r0 = 0
            X.C18070vi.A0d(r14, r0)
            android.content.ContentValues r8 = X.C17880vN.A08()
            java.lang.String r0 = "state"
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)
            r8.put(r0, r7)
            X.738 r6 = r13.A03()
            X.AnonymousClass738.A02(r6)
            android.util.LongSparseArray r5 = r6.A00
            monitor-enter(r5)
            java.util.Iterator r4 = r14.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x001f:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x003d
            long r1 = X.C17890vO.A07(r4)     // Catch:{ all -> 0x00a6 }
            java.util.Iterator r3 = r15.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x002d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x001f
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x00a6 }
            X.6Re r0 = (X.C122646Re) r0     // Catch:{ all -> 0x00a6 }
            X.AnonymousClass738.A01(r0, r6, r7, r1)     // Catch:{ all -> 0x00a6 }
            goto L_0x002d
        L_0x003d:
            monitor-exit(r5)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.ArrayList r2 = X.C29351c6.A0E(r14)
            java.util.Iterator r1 = r14.iterator()
        L_0x004a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0054
            X.C108995ce.A1R(r2, r1)
            goto L_0x004a
        L_0x0054:
            r3.addAll(r2)
            java.util.ArrayList r2 = X.C29351c6.A0E(r15)
            java.util.Iterator r1 = r15.iterator()
        L_0x005f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r1.next()
            X.6Re r0 = (X.C122646Re) r0
            int r0 = r0.databaseValue
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.add(r0)
            goto L_0x005f
        L_0x0075:
            r3.addAll(r2)
            X.1Cd r0 = r13.A00
            X.1au r2 = r0.A05()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x009f }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x009f }
            java.lang.String r9 = "status_crossposting_v3"
            int r1 = r14.size()     // Catch:{ all -> 0x009f }
            int r0 = r15.size()     // Catch:{ all -> 0x009f }
            java.lang.String r10 = A00(r1, r0)     // Catch:{ all -> 0x009f }
            r0 = 0
            java.lang.String[] r12 = X.C17890vO.A1b(r3, r0)     // Catch:{ all -> 0x009f }
            java.lang.String r11 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x009f }
            r2.close()
            return
        L_0x009f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73E.A07(java.util.List, java.util.List, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0064, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0067, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.ContentValues r10, X.C122646Re r11, X.AnonymousClass73E r12, java.util.List r13) {
        /*
            X.1Cd r0 = r12.A00
            X.1au r2 = r0.A05()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0061 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = "status_crossposting_v3"
            int r1 = r13.size()     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "status_message_row_id IN  ("
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x0061 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C108995ce.A0X(r0, r1)     // Catch:{ all -> 0x0061 }
            r3.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = ") AND destination = ?"
            java.lang.String r7 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ all -> 0x0061 }
            java.util.ArrayList r3 = X.C29351c6.A0D(r13)     // Catch:{ all -> 0x0061 }
            java.util.Iterator r1 = r13.iterator()     // Catch:{ all -> 0x0061 }
        L_0x003a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0044
            X.C108995ce.A1R(r3, r1)     // Catch:{ all -> 0x0061 }
            goto L_0x003a
        L_0x0044:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0061 }
            java.lang.Object[] r1 = r3.toArray(r0)     // Catch:{ all -> 0x0061 }
            int r0 = r11.databaseValue     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0061 }
            java.lang.Object[] r9 = X.C200310o.A0D(r0, r1)     // Catch:{ all -> 0x0061 }
            java.lang.String[] r9 = (java.lang.String[]) r9     // Catch:{ all -> 0x0061 }
            java.lang.String r8 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r5 = r10
            r4.A02(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0061 }
            r2.close()
            return
        L_0x0061:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73E.A01(android.content.ContentValues, X.6Re, X.73E, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.ContentValues r10, X.AnonymousClass73E r11, java.util.List r12) {
        /*
            X.1Cd r0 = r11.A00
            X.1au r3 = r0.A05()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004e }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x004e }
            java.lang.String r6 = "status_crossposting_v3"
            int r1 = r12.size()     // Catch:{ all -> 0x004e }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "status_message_row_id IN  ("
            r2.append(r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x004e }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = ","
            java.lang.String r0 = X.C108995ce.A0X(r0, r1)     // Catch:{ all -> 0x004e }
            java.lang.String r7 = X.C17900vP.A0B(r0, r2)     // Catch:{ all -> 0x004e }
            java.util.ArrayList r2 = X.C29351c6.A0D(r12)     // Catch:{ all -> 0x004e }
            java.util.Iterator r1 = r12.iterator()     // Catch:{ all -> 0x004e }
        L_0x0035:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x003f
            X.C108995ce.A1R(r2, r1)     // Catch:{ all -> 0x004e }
            goto L_0x0035
        L_0x003f:
            r0 = 0
            java.lang.String[] r9 = X.C17890vO.A1b(r2, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r8 = "[WAFFLE] WaffleStatusCrosspostingStore/UPDATE_CROSSPOSTING_COLUMN_BY_MESSAGE_ROW_IDS"
            r5 = r10
            r4.A02(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x004e }
            r3.close()
            return
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73E.A02(android.content.ContentValues, X.73E, java.util.List):void");
    }

    public final AnonymousClass738 A03() {
        AnonymousClass00H r1 = this.A01;
        AnonymousClass738.A02((AnonymousClass738) r1.get());
        return (AnonymousClass738) C18070vi.A0E(r1);
    }

    public AnonymousClass73E(AnonymousClass1Cd r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final String A00(int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("status_message_row_id IN  (");
        List nCopies = Collections.nCopies(i, "?");
        C18070vi.A0X(nCopies);
        A10.append(C29431cG.A0g(",", "", "", nCopies, (C22821Di) null));
        A10.append(") AND destination IN (");
        List nCopies2 = Collections.nCopies(i2, "?");
        C18070vi.A0X(nCopies2);
        return C17900vP.A0B(C29431cG.A0g(",", "", "", nCopies2, (C22821Di) null), A10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r9, java.util.List r10, int r11, long r12) {
        /*
            r8 = this;
            java.util.Iterator r7 = r10.iterator()
        L_0x0004:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x006d
            java.lang.Object r3 = r7.next()
            X.6Re r3 = (X.C122646Re) r3
            java.lang.String r6 = "destination"
            r5 = 4
            X.C18070vi.A0d(r3, r5)
            android.content.ContentValues r4 = X.C17880vN.A08()
            int r0 = (int) r12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "status_message_row_id"
            r4.put(r0, r1)
            java.lang.String r0 = "state"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r4.put(r0, r2)
            int r0 = r3.databaseValue
            X.C17880vN.A18(r4, r6, r0)
            if (r9 == 0) goto L_0x003f
            int r0 = r9.length()
            if (r0 == 0) goto L_0x003f
            java.lang.String r0 = "crossposting_session_id"
            r4.put(r0, r9)
        L_0x003f:
            X.738 r0 = r8.A03()
            X.AnonymousClass738.A02(r0)
            android.util.LongSparseArray r1 = r0.A00
            monitor-enter(r1)
            X.AnonymousClass738.A01(r3, r0, r2, r12)     // Catch:{ all -> 0x006a }
            monitor-exit(r1)
            X.1Cd r0 = r8.A00
            X.1au r3 = r0.A05()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0063 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0063 }
            java.lang.String r1 = "status_crossposting_v3"
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/INSERT_CROSSPOSTING_RECORDS"
            r2.A09(r1, r0, r4, r5)     // Catch:{ all -> 0x0063 }
            r3.close()
            goto L_0x0004
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x006a:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73E.A05(java.lang.String, java.util.List, int, long):void");
    }
}
