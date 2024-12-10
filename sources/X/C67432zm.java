package X;

/* renamed from: X.2zm  reason: invalid class name and case insensitive filesystem */
public final class C67432zm implements AnonymousClass1L0 {
    public final AnonymousClass1Cd A00;
    public final C18030ve A01;
    public final AnonymousClass11P A02;
    public final C63032sO A03;
    public final AnonymousClass18K A04;

    public /* synthetic */ void Bqh() {
    }

    public /* synthetic */ void Bqi() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0307, code lost:
        if (java.lang.Integer.parseInt(X.C28341Zz.A00(r7, "chat_hidden_column_update_version", java.lang.String.valueOf(0))) != 1) goto L_0x0309;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:?, code lost:
        r6 = r2.BD0();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:?, code lost:
        r7.A0E("CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)", "chat/createAsyncIndex/chat_hidden_index");
        r8 = X.C17880vN.A08();
        r8.put("hidden", 0);
        r7.A02(r8, "chat", "hidden IS NULL", "DatabaseHelper/updateNullHidden/hidden", (java.lang.String[]) null);
        X.C28341Zz.A02(r7, "chat_hidden_column_update_version", "DBMaintenanceDailyCron", 1);
        r6.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x033d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0341, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0213, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x0309 */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02f2 A[Catch:{ Exception -> 0x01e9 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqg() {
        /*
            r24 = this;
            java.lang.String r22 = "chat_hidden_column_update_version"
            r1 = r24
            X.1Cd r0 = r1.A00
            r23 = r0
            r23.A06()
            java.io.File r2 = r0.A03
            java.lang.String r0 = "msgstore/open-existing-db/list "
            X.C64062u9.A0J(r2, r0)
            long r16 = android.os.SystemClock.uptimeMillis()
            r23.A06()
            r0 = r23
            X.1Cm r13 = r0.A02
            X.C18070vi.A0X(r13)
            X.0ve r4 = r1.A01
            r0 = 1065(0x429, float:1.492E-42)
            X.0vf r5 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r5, r4, r0)
            if (r0 == 0) goto L_0x005c
            X.1au r2 = r23.A05()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0360 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0360 }
            java.lang.String[] r10 = X.C22601Cm.A0E     // Catch:{ all -> 0x0360 }
            r8 = 22
            r7 = 0
            r6 = 0
        L_0x003b:
            r3 = r10[r7]     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C28331Zy.A00(r9, r0, r3)     // Catch:{ all -> 0x0360 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0360 }
            if (r0 != 0) goto L_0x0050
            java.lang.String r0 = "MessageDBAsync/removeDeprecatedTables"
            X.C28331Zy.A03(r9, r0, r3)     // Catch:{ all -> 0x0360 }
            r6 = 1
        L_0x0050:
            int r7 = r7 + 1
            if (r7 < r8) goto L_0x003b
            if (r6 == 0) goto L_0x0059
            r13.A08(r9)     // Catch:{ all -> 0x0360 }
        L_0x0059:
            r2.close()
        L_0x005c:
            r0 = 12321(0x3021, float:1.7265E-41)
            boolean r0 = X.C18020vd.A05(r5, r4, r0)
            if (r0 == 0) goto L_0x021c
            X.1au r2 = r23.A05()
            X.2sO r12 = r1.A03     // Catch:{ all -> 0x0360 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0360 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0360 }
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x0360 }
            X.00H r0 = r13.A0A     // Catch:{ all -> 0x0360 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0360 }
            X.1F2 r0 = (X.AnonymousClass1F2) r0     // Catch:{ all -> 0x0360 }
            X.1F6 r14 = X.C22601Cm.A01(r13, r0)     // Catch:{ all -> 0x0360 }
            java.lang.String r21 = "DBMaintenanceDailyCron"
            r0 = 12319(0x301f, float:1.7263E-41)
            boolean r20 = X.C18020vd.A05(r5, r4, r0)     // Catch:{ all -> 0x0360 }
            r10 = 0
            java.util.ArrayList r19 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0360 }
            java.lang.String[] r6 = new java.lang.String[r10]     // Catch:{ all -> 0x0360 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r21)     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "/SELECT_INDEXES"
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "SELECT name,sql FROM sqlite_master WHERE type='index'"
            android.database.Cursor r9 = r11.A0A(r0, r3, r6)     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "name"
            int r8 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0211 }
            java.lang.String r0 = "sql"
            int r7 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0211 }
        L_0x00aa:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x0101
            java.lang.String r18 = r9.getString(r7)     // Catch:{ all -> 0x0211 }
            java.lang.String r6 = r9.getString(r8)     // Catch:{ all -> 0x0211 }
            if (r18 == 0) goto L_0x00aa
            int r0 = r18.length()     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x00aa
            if (r6 == 0) goto L_0x00aa
            int r0 = r6.length()     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x00aa
            java.util.Map r0 = r14.A01     // Catch:{ all -> 0x0211 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0211 }
            java.lang.String r3 = X.C17880vN.A0s(r6, r0)     // Catch:{ all -> 0x0211 }
            if (r3 == 0) goto L_0x00da
            int r0 = r3.length()     // Catch:{ all -> 0x0211 }
            if (r0 != 0) goto L_0x00e6
        L_0x00da:
            java.util.Map r0 = r14.A00     // Catch:{ all -> 0x0211 }
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch:{ all -> 0x0211 }
            java.lang.String r3 = X.C17880vN.A0s(r6, r0)     // Catch:{ all -> 0x0211 }
            if (r3 == 0) goto L_0x00fb
        L_0x00e6:
            int r0 = r3.length()     // Catch:{ all -> 0x0211 }
            if (r0 == 0) goto L_0x00fb
            java.lang.String r15 = X.C63032sO.A00(r3)     // Catch:{ all -> 0x0211 }
            java.lang.String r3 = X.C63032sO.A00(r18)     // Catch:{ all -> 0x0211 }
            r0 = 1
            boolean r0 = X.AnonymousClass1YE.A09(r15, r3, r0)     // Catch:{ all -> 0x0211 }
            if (r0 != 0) goto L_0x00aa
        L_0x00fb:
            r0 = r19
            r0.add(r6)     // Catch:{ all -> 0x0211 }
            goto L_0x00aa
        L_0x0101:
            r9.close()     // Catch:{ all -> 0x0360 }
            java.util.ArrayList r0 = X.C29351c6.A0D(r19)     // Catch:{ all -> 0x0360 }
            java.util.Iterator r7 = r19.iterator()     // Catch:{ all -> 0x0360 }
        L_0x010c:
            boolean r3 = r7.hasNext()     // Catch:{ all -> 0x0360 }
            if (r3 == 0) goto L_0x0123
            java.lang.String r6 = X.C17880vN.A0v(r7)     // Catch:{ all -> 0x0360 }
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ all -> 0x0360 }
            java.lang.String r3 = r6.toLowerCase(r3)     // Catch:{ all -> 0x0360 }
            X.C18070vi.A0X(r3)     // Catch:{ all -> 0x0360 }
            r0.add(r3)     // Catch:{ all -> 0x0360 }
            goto L_0x010c
        L_0x0123:
            r3 = 0
            java.lang.String r7 = "schema-maintainer/previous-run-build-id"
            java.lang.String r3 = X.C28341Zz.A00(r11, r7, r3)     // Catch:{ all -> 0x0360 }
            if (r3 != 0) goto L_0x012e
            java.lang.String r3 = "0"
        L_0x012e:
            long r14 = java.lang.Long.parseLong(r3)     // Catch:{ all -> 0x0360 }
            r8 = 670735092(0x27fa9af4, double:3.313871664E-315)
            int r3 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x014c
            java.lang.String r3 = "schema-maintainer/previous-deleted-indexes"
            X.C28341Zz.A01(r11, r3)     // Catch:{ all -> 0x0360 }
            java.lang.String r3 = "schema-maintainer/previous-failed-indexes"
            X.C28341Zz.A01(r11, r3)     // Catch:{ all -> 0x0360 }
            java.lang.String r6 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0360 }
            java.lang.String r3 = "schema-maintainer/dropExtraIndexes"
            X.C28341Zz.A03(r11, r7, r6, r3)     // Catch:{ all -> 0x0360 }
        L_0x014c:
            java.lang.String r14 = "schema-maintainer/previous-deleted-indexes"
            java.util.List r9 = X.C63032sO.A01(r11, r14)     // Catch:{ all -> 0x0360 }
            java.lang.String r8 = "schema-maintainer/previous-failed-indexes"
            java.util.List r7 = X.C63032sO.A01(r11, r8)     // Catch:{ all -> 0x0360 }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0360 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ all -> 0x0360 }
        L_0x0160:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r18.next()     // Catch:{ all -> 0x0360 }
            boolean r3 = r9.contains(r0)     // Catch:{ all -> 0x0360 }
            r15 = r3 ^ 1
            boolean r3 = r7.contains(r0)     // Catch:{ all -> 0x0360 }
            r3 = r3 ^ 1
            r3 = r3 & r15
            if (r3 == 0) goto L_0x0160
            r6.add(r0)     // Catch:{ all -> 0x0360 }
            goto L_0x0160
        L_0x017d:
            X.0ve r15 = r12.A01     // Catch:{ all -> 0x0360 }
            r3 = 12320(0x3020, float:1.7264E-41)
            int r0 = X.C18020vd.A00(r5, r15, r3)     // Catch:{ all -> 0x0360 }
            if (r0 <= 0) goto L_0x01b4
            int r0 = r6.size()     // Catch:{ all -> 0x0360 }
            int r3 = X.C18020vd.A00(r5, r15, r3)     // Catch:{ all -> 0x0360 }
            if (r0 < r3) goto L_0x01b4
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "Attempt to delete large number of extra indexes: "
            r15.append(r0)     // Catch:{ all -> 0x0360 }
            java.util.TreeSet r5 = new java.util.TreeSet     // Catch:{ all -> 0x0360 }
            r5.<init>()     // Catch:{ all -> 0x0360 }
            X.C29431cG.A17(r6, r5)     // Catch:{ all -> 0x0360 }
            r3 = 0
            java.lang.String r0 = ", "
            java.lang.String r0 = X.C29431cG.A0h(r0, r5, r3)     // Catch:{ all -> 0x0360 }
            java.lang.String r5 = X.AnonymousClass000.A0y(r0, r15)     // Catch:{ all -> 0x0360 }
            X.190 r3 = r12.A00     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "schema-maintainer/dropExtraIndexes/manyIndexesToDrop"
            r3.A0G(r0, r5, r10)     // Catch:{ all -> 0x0360 }
        L_0x01b4:
            java.util.ArrayList r5 = X.C29431cG.A0m(r9)     // Catch:{ all -> 0x0360 }
            java.util.ArrayList r7 = X.C29431cG.A0m(r7)     // Catch:{ all -> 0x0360 }
            java.util.Iterator r9 = r6.iterator()     // Catch:{ all -> 0x0360 }
        L_0x01c0:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x0219
            java.lang.String r3 = X.C17880vN.A0v(r9)     // Catch:{ all -> 0x0360 }
            if (r20 == 0) goto L_0x01c0
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r21)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = "/dropExtraIndexes"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r6)     // Catch:{ Exception -> 0x01e9 }
            X.C28331Zy.A02(r11, r0, r3)     // Catch:{ Exception -> 0x01e9 }
            r5.add(r3)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r6 = ","
            r0 = 0
            java.lang.String r6 = X.C29431cG.A0h(r6, r5, r0)     // Catch:{ Exception -> 0x01e9 }
            java.lang.String r0 = "schema-maintainer/dropExtraIndexes"
            X.C28341Zz.A03(r11, r14, r6, r0)     // Catch:{ Exception -> 0x01e9 }
            goto L_0x01c0
        L_0x01e9:
            r0 = move-exception
            r7.add(r3)     // Catch:{ all -> 0x0360 }
            java.lang.String r6 = ","
            r3 = 0
            java.lang.String r6 = X.C29431cG.A0h(r6, r7, r3)     // Catch:{ all -> 0x0360 }
            java.lang.String r3 = "schema-maintainer/dropExtraIndexes"
            X.C28341Zz.A03(r11, r8, r6, r3)     // Catch:{ all -> 0x0360 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A11(r21)     // Catch:{ all -> 0x0360 }
            java.lang.String r3 = "/schema-maintainer/dropExtraIndexes/error"
            r6.append(r3)     // Catch:{ all -> 0x0360 }
            X.C17880vN.A1M(r6, r0)     // Catch:{ all -> 0x0360 }
            X.190 r6 = r12.A00     // Catch:{ all -> 0x0360 }
            java.lang.String r3 = "schema-maintainer/dropExtraIndexes/error"
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0360 }
            r6.A0G(r3, r0, r10)     // Catch:{ all -> 0x0360 }
            goto L_0x01c0
        L_0x0211:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0213 }
        L_0x0213:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x0360 }
            goto L_0x0341
        L_0x0219:
            r2.close()
        L_0x021c:
            X.1au r2 = r23.A05()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0360 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0360 }
            X.00H r0 = r13.A0A     // Catch:{ all -> 0x0360 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0360 }
            X.1F2 r0 = (X.AnonymousClass1F2) r0     // Catch:{ all -> 0x0360 }
            X.1F6 r14 = X.C22601Cm.A01(r13, r0)     // Catch:{ all -> 0x0360 }
            java.lang.String r11 = "MessagesDBHelper_CreateAsyncIndexes"
            r0 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ NumberFormatException -> 0x0244 }
            java.lang.String r0 = X.C28341Zz.A00(r12, r11, r0)     // Catch:{ NumberFormatException -> 0x0244 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0244 }
            if (r0 != 0) goto L_0x0244
            goto L_0x02e1
        L_0x0244:
            java.lang.String r10 = "MessagesDBHelper_CreateAsyncIndexesFailedAttempts"
            r5 = 0
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ NumberFormatException -> 0x0254 }
            java.lang.String r0 = X.C28341Zz.A00(r12, r10, r0)     // Catch:{ NumberFormatException -> 0x0254 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0254 }
            goto L_0x0255
        L_0x0254:
            r0 = 0
        L_0x0255:
            int r9 = r0 + 1
            long r7 = (long) r9     // Catch:{ all -> 0x0360 }
            java.lang.String r6 = "DatabaseHelper"
            X.C28341Zz.A02(r12, r10, r6, r7)     // Catch:{ all -> 0x0360 }
            r8 = 20
            r3 = 0
            java.lang.String r0 = "DatabaseHelper/createDatabaseIndexesAsync; failed to create async indexes"
            java.lang.String r7 = "0"
            if (r9 < r8) goto L_0x0272
            X.C28341Zz.A03(r12, r11, r7, r6)     // Catch:{ all -> 0x0360 }
            X.C28341Zz.A01(r12, r10)     // Catch:{ all -> 0x0360 }
            X.190 r6 = r13.A04     // Catch:{ all -> 0x0360 }
            r6.A0G(r0, r3, r5)     // Catch:{ all -> 0x0360 }
            goto L_0x02e1
        L_0x0272:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r6)     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "/createAsyncIndexes"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ all -> 0x0360 }
            java.util.Map r3 = r14.A00     // Catch:{ all -> 0x0360 }
            boolean r0 = X.AnonymousClass1F6.A00(r12, r14, r0, r3, r5)     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x028b
            X.C28341Zz.A03(r12, r11, r7, r6)     // Catch:{ all -> 0x0360 }
            X.C28341Zz.A01(r12, r10)     // Catch:{ all -> 0x0360 }
            goto L_0x02e1
        L_0x028b:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0360 }
            java.util.Set r0 = r3.keySet()     // Catch:{ all -> 0x0360 }
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)     // Catch:{ all -> 0x0360 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0360 }
        L_0x029b:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x02b5
            java.lang.String r3 = X.C17880vN.A0v(r8)     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "index"
            java.lang.String r0 = X.C28331Zy.A00(r12, r0, r3)     // Catch:{ all -> 0x0360 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x029b
            r5.add(r3)     // Catch:{ all -> 0x0360 }
            goto L_0x029b
        L_0x02b5:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x02c7
            X.C28341Zz.A03(r12, r11, r7, r6)     // Catch:{ all -> 0x0360 }
            X.C28341Zz.A01(r12, r10)     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "DatabaseHelper/createDatabaseIndexesAsync; all indexes are created."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0360 }
            goto L_0x02e1
        L_0x02c7:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = "DatabaseHelper/createDatabaseIndexesAsync; failed to create async indexes, attempt #"
            r3.append(r0)     // Catch:{ all -> 0x0360 }
            r3.append(r9)     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = ". Missing indexes: "
            r3.append(r0)     // Catch:{ all -> 0x0360 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r5)     // Catch:{ all -> 0x0360 }
            X.C17890vO.A19(r3, r0)     // Catch:{ all -> 0x0360 }
        L_0x02e1:
            r2.close()
            X.1au r2 = r23.A05()
            X.0vf r3 = X.C18040vf.A01     // Catch:{ all -> 0x0360 }
            r0 = 3910(0xf46, float:5.479E-42)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)     // Catch:{ all -> 0x0360 }
            if (r0 == 0) goto L_0x0342
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0360 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0360 }
            r4 = 0
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ NumberFormatException -> 0x0309 }
            r0 = r22
            java.lang.String r0 = X.C28341Zz.A00(r7, r0, r3)     // Catch:{ NumberFormatException -> 0x0309 }
            int r3 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0309 }
            r0 = 1
            if (r3 == r0) goto L_0x0342
        L_0x0309:
            X.1xA r6 = r2.BD0()     // Catch:{ all -> 0x0360 }
            java.lang.String r3 = "CREATE INDEX IF NOT EXISTS chat_hidden_index ON chat (hidden)"
            java.lang.String r0 = "chat/createAsyncIndex/chat_hidden_index"
            r7.A0E(r3, r0)     // Catch:{ all -> 0x033b }
            android.content.ContentValues r8 = X.C17880vN.A08()     // Catch:{ all -> 0x033b }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x033b }
            java.lang.String r0 = "hidden"
            r8.put(r0, r3)     // Catch:{ all -> 0x033b }
            r12 = 0
            java.lang.String r11 = "DatabaseHelper/updateNullHidden/hidden"
            java.lang.String r9 = "chat"
            java.lang.String r10 = "hidden IS NULL"
            r7.A02(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x033b }
            java.lang.String r5 = "DBMaintenanceDailyCron"
            r3 = 1
            r0 = r22
            X.C28341Zz.A02(r7, r0, r5, r3)     // Catch:{ all -> 0x033b }
            r6.A00()     // Catch:{ all -> 0x033b }
            r6.close()     // Catch:{ all -> 0x0360 }
            goto L_0x0342
        L_0x033b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x033d }
        L_0x033d:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x0360 }
        L_0x0341:
            throw r0     // Catch:{ all -> 0x0360 }
        L_0x0342:
            r2.close()
            X.1Cu r4 = new X.1Cu
            r4.<init>()
            long r2 = android.os.SystemClock.uptimeMillis()
            long r2 = r2 - r16
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A00 = r0
            java.lang.String r0 = "DBMaintenanceDailyCron"
            r4.A02 = r0
            X.18K r0 = r1.A04
            r0.CC7(r4)
            return
        L_0x0360:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0362 }
        L_0x0362:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67432zm.Bqg():void");
    }

    public C67432zm(AnonymousClass11P r1, AnonymousClass1Cd r2, C63032sO r3, C18030ve r4, AnonymousClass18K r5) {
        C18070vi.A0s(r1, r4, r5, r2);
        this.A02 = r1;
        this.A01 = r4;
        this.A04 = r5;
        this.A00 = r2;
        this.A03 = r3;
    }
}
