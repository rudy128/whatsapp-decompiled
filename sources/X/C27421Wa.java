package X;

/* renamed from: X.1Wa  reason: invalid class name and case insensitive filesystem */
public class C27421Wa {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03e8, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x071e, code lost:
        if (r6 == null) goto L_0x0723;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0411 A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0430 A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0449 A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x047b A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0561 A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x060f A[Catch:{ all -> 0x0755, all -> 0x075a, JSONException -> 0x075f }, LOOP:8: B:180:0x0609->B:182:0x060f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0640 A[Catch:{ all -> 0x0755, all -> 0x075a, JSONException -> 0x075f }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0669 A[Catch:{ all -> 0x0755, all -> 0x075a, JSONException -> 0x075f }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x06bd A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x074c A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x011a A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012a A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0140 A[Catch:{ IOException -> 0x07d1, all -> 0x07df }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(android.os.CancellationSignal r52, X.C72053Kl r53, X.AnonymousClass2HF r54, java.io.File r55, long r56) {
        /*
            r51 = this;
            r3 = r51
            X.2go r2 = new X.2go     // Catch:{ IOException -> 0x07d1 }
            r2.<init>()     // Catch:{ IOException -> 0x07d1 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x07d1 }
            r2.A00 = r0     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "android"
            r2.A06 = r0     // Catch:{ IOException -> 0x07d1 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x07d1 }
            r2.A07 = r0     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "consumer"
            r2.A03 = r0     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "2.24.24.78"
            r2.A04 = r0     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "1.0"
            r2.A05 = r0     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/exporting sequences"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x07d1 }
            X.00H r0 = r3.A06     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r1 = r0.get()     // Catch:{ IOException -> 0x07d1 }
            X.2pE r1 = (X.C61162pE) r1     // Catch:{ IOException -> 0x07d1 }
            X.00H r0 = r3.A09     // Catch:{ IOException -> 0x07d1 }
            r48 = r0
            java.lang.Object r11 = r48.get()     // Catch:{ IOException -> 0x07d1 }
            X.9nj r11 = (X.C192059nj) r11     // Catch:{ IOException -> 0x07d1 }
            X.00H r0 = r3.A02     // Catch:{ IOException -> 0x07d1 }
            r47 = r0
            java.lang.Object r7 = r47.get()     // Catch:{ IOException -> 0x07d1 }
            X.9uW r7 = (X.C196139uW) r7     // Catch:{ IOException -> 0x07d1 }
            r50 = r52
            boolean r0 = r50.isCanceled()     // Catch:{ IOException -> 0x07d1 }
            if (r0 == 0) goto L_0x0051
            r8 = 0
            goto L_0x00ea
        L_0x0051:
            java.lang.String r0 = "sequences"
            X.2C0 r10 = new X.2C0     // Catch:{ IOException -> 0x07d1 }
            r10.<init>(r0)     // Catch:{ IOException -> 0x07d1 }
            java.util.HashMap r1 = X.C61162pE.A00(r1)     // Catch:{ IOException -> 0x07d1 }
            int r0 = r1.size()     // Catch:{ IOException -> 0x07d1 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ IOException -> 0x07d1 }
            r9.<init>(r0)     // Catch:{ IOException -> 0x07d1 }
            java.util.Set r0 = r1.entrySet()     // Catch:{ IOException -> 0x07d1 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ IOException -> 0x07d1 }
        L_0x006e:
            boolean r0 = r6.hasNext()     // Catch:{ IOException -> 0x07d1 }
            if (r0 == 0) goto L_0x0096
            java.lang.Object r0 = r6.next()     // Catch:{ IOException -> 0x07d1 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ IOException -> 0x07d1 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x07d1 }
            r1.<init>()     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "name"
            r1.put(r0, r5)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "value"
            r1.put(r0, r4)     // Catch:{ IOException -> 0x07d1 }
            r9.add(r1)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x006e
        L_0x0096:
            java.lang.String r8 = "sequences.json"
            java.io.File r6 = r11.A00(r8)     // Catch:{ IOException -> 0x07d1 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ JSONException -> 0x00cf }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x00cf }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00c5 }
            r4.<init>(r5)     // Catch:{ all -> 0x00c5 }
            org.json.JSONObject r1 = r10.A01(r9)     // Catch:{ all -> 0x00bb }
            r0 = 4
            java.lang.String r0 = r1.toString(r0)     // Catch:{ all -> 0x00bb }
            r4.write(r0)     // Catch:{ all -> 0x00bb }
            r4.close()     // Catch:{ all -> 0x00c5 }
            r5.close()     // Catch:{ JSONException -> 0x00cf }
            r0 = 1
            goto L_0x00d8
        L_0x00bb:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x00c0 }
            goto L_0x00c4
        L_0x00c0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00c5 }
        L_0x00c4:
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00ca }
            goto L_0x00ce
        L_0x00ca:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ JSONException -> 0x00cf }
        L_0x00ce:
            throw r1     // Catch:{ JSONException -> 0x00cf }
        L_0x00cf:
            r1 = move-exception
            java.lang.String r0 = "SequencesHandler/Failed to write deleted message IDs to JSON"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x07d1 }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x00e9
        L_0x00d8:
            long r6 = r7.A02(r6, r8, r0)     // Catch:{ IOException -> 0x07d1 }
            r4 = 0
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ea
            java.lang.String r0 = "SequencesHandler/Failed to register sequences file in metadata manager."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x07d1 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x07d1 }
        L_0x00e9:
            throw r2     // Catch:{ IOException -> 0x07d1 }
        L_0x00ea:
            r2.A08 = r8     // Catch:{ IOException -> 0x07d1 }
            r0 = 20
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x07d1 }
            r49 = r53
            r0 = r49
            r0.BE3(r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/exporting messages"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x07d1 }
            X.00H r0 = r3.A0A     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r5 = r0.get()     // Catch:{ IOException -> 0x07d1 }
            X.2eY r5 = (X.C54692eY) r5     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r15 = r48.get()     // Catch:{ IOException -> 0x07d1 }
            X.9nj r15 = (X.C192059nj) r15     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r14 = r47.get()     // Catch:{ IOException -> 0x07d1 }
            X.9uW r14 = (X.C196139uW) r14     // Catch:{ IOException -> 0x07d1 }
            boolean r0 = r50.isCanceled()     // Catch:{ IOException -> 0x07d1 }
            r27 = r56
            if (r0 == 0) goto L_0x0140
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Operation cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x07d1 }
        L_0x011f:
            X.1T7 r8 = r5.A03     // Catch:{ IOException -> 0x07d1 }
            java.util.HashSet r6 = r8.A06     // Catch:{ IOException -> 0x07d1 }
            boolean r0 = r6.isEmpty()     // Catch:{ IOException -> 0x07d1 }
            r7 = 0
            if (r0 != 0) goto L_0x0404
            java.lang.String r4 = r6.toString()     // Catch:{ IOException -> 0x07d1 }
            int r1 = r4.length()     // Catch:{ IOException -> 0x07d1 }
            r0 = 1
            int r1 = r1 - r0
            java.lang.String r1 = r4.substring(r0, r1)     // Catch:{ IOException -> 0x07d1 }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x07d1 }
            if (r0 != 0) goto L_0x0404
            goto L_0x0403
        L_0x0140:
            java.lang.String r10 = "messages.bin"
            java.io.File r4 = r15.A00(r10)     // Catch:{ IOException -> 0x07d1 }
            r1 = 1
            long r6 = r14.A02(r4, r10, r1)     // Catch:{ IOException -> 0x07d1 }
            r21 = 0
            int r0 = (r6 > r21 ? 1 : (r6 == r21 ? 0 : -1))
            if (r0 < 0) goto L_0x07a7
            X.2tR r0 = r5.A00     // Catch:{ IOException -> 0x0798 }
            r46 = r0
            X.1Cd r0 = r5.A02     // Catch:{ IOException -> 0x0798 }
            r45 = r0
            java.io.FileOutputStream r26 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0798 }
            r0 = r26
            r0.<init>(r4)     // Catch:{ IOException -> 0x0798 }
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ all -> 0x078e }
            r25.<init>()     // Catch:{ all -> 0x078e }
            r0 = r46
            X.1Cd r0 = r0.A00     // Catch:{ all -> 0x078e }
            X.1at r8 = r0.get()     // Catch:{ all -> 0x078e }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0784 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x0784 }
            java.lang.String r6 = "SELECT table_row_id FROM backup_changes WHERE table_name = 'message' AND _id <= ? ORDER BY table_row_id DESC LIMIT 1"
            java.lang.String[] r4 = new java.lang.String[r1]     // Catch:{ all -> 0x0784 }
            java.lang.String r1 = java.lang.String.valueOf(r27)     // Catch:{ all -> 0x0784 }
            r0 = 0
            r4[r0] = r1     // Catch:{ all -> 0x0784 }
            java.lang.String r0 = "BackupChangesStore/FETCH_LAST_MESSAGE_ROW_ID"
            android.database.Cursor r4 = r7.A0A(r6, r0, r4)     // Catch:{ all -> 0x0784 }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0778 }
            if (r0 == 0) goto L_0x03ec
            java.lang.String r0 = "table_row_id"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0778 }
            long r23 = r4.getLong(r0)     // Catch:{ all -> 0x0778 }
            r4.close()     // Catch:{ all -> 0x0784 }
            r8.close()     // Catch:{ all -> 0x078e }
            r39 = 1
            r4 = 0
        L_0x019d:
            int r0 = (r39 > r23 ? 1 : (r39 == r23 ? 0 : -1))
            if (r0 >= 0) goto L_0x03f2
            r50.throwIfCanceled()     // Catch:{ all -> 0x078e }
            X.2bp r9 = new X.2bp     // Catch:{ all -> 0x078e }
            r9.<init>()     // Catch:{ all -> 0x078e }
            long r18 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x078e }
            r0 = 5000(0x1388, float:7.006E-42)
            java.lang.String r38 = "message"
            r43 = 5000(0x1388, double:2.4703E-320)
            r37 = r46
            r41 = r27
            X.2bo r1 = r37.A06(r38, r39, r41, r43)     // Catch:{ all -> 0x078e }
            java.util.List r6 = r1.A01     // Catch:{ all -> 0x078e }
            int r1 = r6.size()     // Catch:{ all -> 0x078e }
            if (r1 == 0) goto L_0x03f2
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x078e }
            r1.<init>(r6)     // Catch:{ all -> 0x078e }
            java.util.Collections.sort(r1)     // Catch:{ all -> 0x078e }
            r7 = 0
            int r6 = (r39 > r21 ? 1 : (r39 == r21 ? 0 : -1))
            if (r6 <= 0) goto L_0x01e1
            java.lang.Long r6 = java.lang.Long.valueOf(r39)     // Catch:{ all -> 0x078e }
            int r6 = java.util.Collections.binarySearch(r1, r6)     // Catch:{ all -> 0x078e }
            if (r6 >= 0) goto L_0x01de
            int r6 = -r6
            int r6 = r6 + -1
            goto L_0x01e2
        L_0x01de:
            int r6 = r6 + 1
            goto L_0x01e2
        L_0x01e1:
            r6 = 0
        L_0x01e2:
            int r8 = r1.size()     // Catch:{ all -> 0x078e }
            if (r6 >= r8) goto L_0x03f2
            int r8 = r1.size()     // Catch:{ all -> 0x078e }
            int r8 = r8 - r6
            r11 = 100
            int r0 = java.lang.Math.min(r11, r0)     // Catch:{ all -> 0x078e }
            int r11 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x078e }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x078e }
            r8.<init>(r11)     // Catch:{ all -> 0x078e }
        L_0x01fc:
            int r0 = r1.size()     // Catch:{ all -> 0x078e }
            if (r6 >= r0) goto L_0x0221
            int r0 = r8.size()     // Catch:{ all -> 0x078e }
            if (r0 >= r11) goto L_0x0221
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x078e }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x078e }
            long r16 = r0.longValue()     // Catch:{ all -> 0x078e }
            int r12 = (r23 > r21 ? 1 : (r23 == r21 ? 0 : -1))
            if (r12 < 0) goto L_0x021b
            int r12 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r12 <= 0) goto L_0x021b
            goto L_0x0221
        L_0x021b:
            r8.add(r0)     // Catch:{ all -> 0x078e }
            int r6 = r6 + 1
            goto L_0x01fc
        L_0x0221:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x078e }
            r1.<init>()     // Catch:{ all -> 0x078e }
            java.lang.String r0 = "   SELECT "
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = X.C209514c.A00     // Catch:{ all -> 0x078e }
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = ", "
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = "chat_row_id"
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = " FROM "
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = "available_message_view"
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = " WHERE "
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = "(_id IN "
            r1.append(r0)     // Catch:{ all -> 0x078e }
            int r0 = r8.size()     // Catch:{ all -> 0x078e }
            java.lang.String r0 = X.AnonymousClass1H2.A00(r0)     // Catch:{ all -> 0x078e }
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = " AND (expire_timestamp IS NULL OR expire_timestamp >= ? OR keep_in_chat = 1) "
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = " ORDER BY "
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r0 = "_id ASC"
            r1.append(r0)     // Catch:{ all -> 0x078e }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x078e }
            int r1 = r8.size()     // Catch:{ all -> 0x078e }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x078e }
            r0.<init>(r1)     // Catch:{ all -> 0x078e }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x078e }
        L_0x027e:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x078e }
            if (r1 == 0) goto L_0x0290
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x078e }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x078e }
            r0.add(r1)     // Catch:{ all -> 0x078e }
            goto L_0x027e
        L_0x0290:
            java.lang.String r1 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x078e }
            r0.add(r1)     // Catch:{ all -> 0x078e }
            X.0yx r1 = new X.0yx     // Catch:{ all -> 0x078e }
            r1.<init>(r6, r0)     // Catch:{ all -> 0x078e }
            java.lang.Object r6 = r1.A00     // Catch:{ all -> 0x078e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x078e }
            java.lang.Object r1 = r1.A01     // Catch:{ all -> 0x078e }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x078e }
            java.lang.String[] r0 = new java.lang.String[r7]     // Catch:{ all -> 0x078e }
            java.lang.Object[] r7 = r1.toArray(r0)     // Catch:{ all -> 0x078e }
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch:{ all -> 0x078e }
            X.1at r11 = r45.get()     // Catch:{ all -> 0x078e }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0773 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0773 }
            java.lang.String r0 = "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL"
            android.database.Cursor r8 = r1.A0A(r6, r0, r7)     // Catch:{ all -> 0x0773 }
            r11.close()     // Catch:{ all -> 0x078e }
            if (r8 == 0) goto L_0x03f2
            int r0 = r8.getCount()     // Catch:{ all -> 0x076e }
            long r6 = (long) r0     // Catch:{ all -> 0x076e }
            r9.A01 = r6     // Catch:{ all -> 0x076e }
            X.2fz r11 = r2.A02     // Catch:{ all -> 0x076e }
            long r0 = r11.A02     // Catch:{ all -> 0x076e }
            long r0 = r0 + r6
            r11.A02 = r0     // Catch:{ all -> 0x076e }
            boolean r0 = r8.moveToLast()     // Catch:{ all -> 0x076e }
            if (r0 == 0) goto L_0x03e8
            java.lang.String r0 = "_id"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x076e }
            long r39 = r8.getLong(r0)     // Catch:{ all -> 0x076e }
            r8.moveToFirst()     // Catch:{ all -> 0x076e }
            r0 = -1
            r8.move(r0)     // Catch:{ all -> 0x076e }
            java.lang.Integer r30 = X.AnonymousClass00R.A0C     // Catch:{ all -> 0x076e }
            r32 = 1
            r31 = 0
            X.9te r20 = new X.9te     // Catch:{ all -> 0x076e }
            r34 = r32
            r35 = r32
            r37 = r31
            r38 = r31
            r29 = r20
            r33 = r32
            r36 = r31
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x076e }
            X.1T7 r12 = r5.A03     // Catch:{ all -> 0x076e }
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ all -> 0x076e }
            r19.<init>()     // Catch:{ all -> 0x076e }
            X.1Mx r1 = r12.A01     // Catch:{ all -> 0x076e }
            X.1My r0 = r1.A01     // Catch:{ all -> 0x076e }
            java.util.HashMap r18 = r0.A0I()     // Catch:{ all -> 0x076e }
            java.util.HashMap r17 = r1.A08()     // Catch:{ all -> 0x076e }
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch:{ all -> 0x076e }
            r11.<init>()     // Catch:{ all -> 0x076e }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x076e }
            r7.<init>()     // Catch:{ all -> 0x076e }
        L_0x031b:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x076e }
            if (r0 == 0) goto L_0x0380
            X.00H r0 = r12.A04     // Catch:{ all -> 0x076e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x076e }
            X.1W6 r0 = (X.AnonymousClass1W6) r0     // Catch:{ all -> 0x076e }
            X.206 r6 = r0.A01(r8)     // Catch:{ all -> 0x076e }
            if (r6 == 0) goto L_0x031b
            r12.A05(r6, r7)     // Catch:{ all -> 0x076e }
            X.1Q8 r0 = r12.A02     // Catch:{ all -> 0x076e }
            X.205 r13 = r6.A0v     // Catch:{ all -> 0x076e }
            r0.A01(r13)     // Catch:{ all -> 0x076e }
            long r0 = r6.A0I     // Catch:{ all -> 0x076e }
            int r16 = (r0 > r21 ? 1 : (r0 == r21 ? 0 : -1))
            if (r16 < 0) goto L_0x0380
            X.1BI r13 = r13.A00     // Catch:{ all -> 0x076e }
            if (r13 == 0) goto L_0x031b
            boolean r0 = r6 instanceof X.AnonymousClass22M     // Catch:{ all -> 0x076e }
            if (r0 != 0) goto L_0x031b
            boolean r0 = r6 instanceof X.C439821r     // Catch:{ all -> 0x076e }
            if (r0 != 0) goto L_0x031b
            X.AnonymousClass1T7.A00(r6)     // Catch:{ all -> 0x076e }
            java.lang.Object r0 = r11.get(r13)     // Catch:{ all -> 0x076e }
            X.2Ay r0 = (X.C45662Ay) r0     // Catch:{ all -> 0x076e }
            if (r0 != 0) goto L_0x0361
            r1 = r18
            r0 = r17
            X.2Ay r0 = r12.A01(r13, r1, r0)     // Catch:{ all -> 0x076e }
            r11.put(r13, r0)     // Catch:{ all -> 0x076e }
        L_0x0361:
            r1 = r20
            boolean r0 = r12.A06(r1, r0, r6)     // Catch:{ all -> 0x076e }
            if (r0 != 0) goto L_0x031b
            boolean r0 = r6 instanceof X.C436420i     // Catch:{ all -> 0x076e }
            if (r0 == 0) goto L_0x037b
            java.util.HashSet r0 = r12.A05     // Catch:{ all -> 0x076e }
            X.20i r6 = (X.C436420i) r6     // Catch:{ all -> 0x076e }
            int r1 = r6.A00     // Catch:{ all -> 0x076e }
        L_0x0373:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x076e }
            r0.add(r1)     // Catch:{ all -> 0x076e }
            goto L_0x031b
        L_0x037b:
            java.util.HashSet r0 = r12.A06     // Catch:{ all -> 0x076e }
            int r1 = r6.A0u     // Catch:{ all -> 0x076e }
            goto L_0x0373
        L_0x0380:
            java.util.ArrayList r1 = r12.A02(r7)     // Catch:{ all -> 0x076e }
            r0 = r19
            r0.addAll(r1)     // Catch:{ all -> 0x076e }
            int r0 = r11.size()     // Catch:{ all -> 0x076e }
            if (r0 == 0) goto L_0x03e8
            X.8cQ r0 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ all -> 0x076e }
            X.Bmt r6 = r0.A0N()     // Catch:{ all -> 0x076e }
            X.8X2 r6 = (X.AnonymousClass8X2) r6     // Catch:{ all -> 0x076e }
            X.9KV r0 = X.AnonymousClass9KV.FULL     // Catch:{ all -> 0x076e }
            r6.A0K(r0)     // Catch:{ all -> 0x076e }
            java.util.Set r0 = r11.entrySet()     // Catch:{ all -> 0x076e }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ all -> 0x076e }
        L_0x03a4:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x076e }
            if (r0 == 0) goto L_0x03cc
            java.lang.Object r0 = r11.next()     // Catch:{ all -> 0x076e }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x076e }
            r50.throwIfCanceled()     // Catch:{ all -> 0x076e }
            java.lang.Object r7 = r0.getKey()     // Catch:{ all -> 0x076e }
            X.1BI r7 = (X.AnonymousClass1BI) r7     // Catch:{ all -> 0x076e }
            java.lang.Object r1 = r0.getValue()     // Catch:{ all -> 0x076e }
            X.2Ay r1 = (X.C45662Ay) r1     // Catch:{ all -> 0x076e }
            boolean r0 = r7 instanceof X.AnonymousClass1E9     // Catch:{ all -> 0x076e }
            if (r0 == 0) goto L_0x03c8
            X.1E9 r7 = (X.AnonymousClass1E9) r7     // Catch:{ all -> 0x076e }
            r12.A04(r7, r1)     // Catch:{ all -> 0x076e }
        L_0x03c8:
            r6.A0I(r1)     // Catch:{ all -> 0x076e }
            goto L_0x03a4
        L_0x03cc:
            r6.A0G(r4)     // Catch:{ all -> 0x076e }
            X.Bm6 r1 = r6.A0C()     // Catch:{ all -> 0x076e }
            X.8cQ r1 = (X.C166148cQ) r1     // Catch:{ all -> 0x076e }
            r0 = r26
            r1.A0L(r0)     // Catch:{ all -> 0x076e }
            r9.A00 = r4     // Catch:{ all -> 0x076e }
            r0 = r25
            r0.add(r9)     // Catch:{ all -> 0x076e }
            int r4 = r4 + 1
            r8.close()     // Catch:{ all -> 0x078e }
            goto L_0x019d
        L_0x03e8:
            r8.close()     // Catch:{ all -> 0x078e }
            goto L_0x03f2
        L_0x03ec:
            r4.close()     // Catch:{ all -> 0x0784 }
            r8.close()     // Catch:{ all -> 0x078e }
        L_0x03f2:
            r26.close()     // Catch:{ IOException -> 0x0798 }
            X.2fz r1 = r2.A02     // Catch:{ IOException -> 0x0798 }
            r1.A03 = r10     // Catch:{ IOException -> 0x0798 }
            r0 = r25
            r1.A05 = r0     // Catch:{ IOException -> 0x0798 }
            java.lang.String r0 = "protobuf"
            r1.A04 = r0     // Catch:{ IOException -> 0x0798 }
            goto L_0x011f
        L_0x0403:
            r7 = r1
        L_0x0404:
            r9 = r54
            r9.A0E = r7     // Catch:{ IOException -> 0x07d1 }
            java.util.HashSet r7 = r8.A05     // Catch:{ IOException -> 0x07d1 }
            boolean r0 = r7.isEmpty()     // Catch:{ IOException -> 0x07d1 }
            r8 = 0
            if (r0 != 0) goto L_0x0426
            java.lang.String r4 = r7.toString()     // Catch:{ IOException -> 0x07d1 }
            int r1 = r4.length()     // Catch:{ IOException -> 0x07d1 }
            r0 = 1
            int r1 = r1 - r0
            java.lang.String r1 = r4.substring(r0, r1)     // Catch:{ IOException -> 0x07d1 }
            boolean r0 = r1.isEmpty()     // Catch:{ IOException -> 0x07d1 }
            if (r0 != 0) goto L_0x0426
            r8 = r1
        L_0x0426:
            r9.A0D = r8     // Catch:{ IOException -> 0x07d1 }
            X.2ZX r4 = r2.A01     // Catch:{ IOException -> 0x07d1 }
            boolean r0 = r50.isCanceled()     // Catch:{ IOException -> 0x07d1 }
            if (r0 == 0) goto L_0x0561
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Operation cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x07d1 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ IOException -> 0x07d1 }
            r1.<init>()     // Catch:{ IOException -> 0x07d1 }
        L_0x043a:
            java.util.List r0 = r4.A00     // Catch:{ IOException -> 0x07d1 }
            r0.addAll(r1)     // Catch:{ IOException -> 0x07d1 }
            X.2fz r0 = r2.A02     // Catch:{ IOException -> 0x07d1 }
            java.util.List r0 = r0.A05     // Catch:{ IOException -> 0x07d1 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x07d1 }
            if (r0 <= 0) goto L_0x0453
            X.2fz r4 = r2.A02     // Catch:{ IOException -> 0x07d1 }
            X.2tR r0 = r5.A00     // Catch:{ IOException -> 0x07d1 }
            long r0 = r0.A03()     // Catch:{ IOException -> 0x07d1 }
            r4.A00 = r0     // Catch:{ IOException -> 0x07d1 }
        L_0x0453:
            r6.clear()     // Catch:{ IOException -> 0x07d1 }
            r7.clear()     // Catch:{ IOException -> 0x07d1 }
            r0 = 40
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x07d1 }
            r0 = r49
            r0.BE3(r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/exporting entities"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x07d1 }
            X.00H r0 = r3.A08     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r0 = r0.get()     // Catch:{ IOException -> 0x07d1 }
            java.util.Set r0 = (java.util.Set) r0     // Catch:{ IOException -> 0x07d1 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ IOException -> 0x07d1 }
        L_0x0475:
            boolean r0 = r15.hasNext()     // Catch:{ IOException -> 0x07d1 }
            if (r0 == 0) goto L_0x0575
            java.lang.Object r4 = r15.next()     // Catch:{ IOException -> 0x07d1 }
            X.16Z r4 = (X.AnonymousClass16Z) r4     // Catch:{ IOException -> 0x07d1 }
            java.util.List r0 = r4.A01     // Catch:{ IOException -> 0x07d1 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ IOException -> 0x07d1 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ IOException -> 0x07d1 }
        L_0x048b:
            boolean r0 = r14.hasNext()     // Catch:{ IOException -> 0x07d1 }
            if (r0 == 0) goto L_0x0558
            java.lang.Object r5 = r14.next()     // Catch:{ IOException -> 0x07d1 }
            X.2q3 r5 = (X.C61662q3) r5     // Catch:{ IOException -> 0x07d1 }
            X.00H r0 = r3.A01     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r6 = r0.get()     // Catch:{ IOException -> 0x07d1 }
            X.2ZV r6 = (X.AnonymousClass2ZV) r6     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r11 = r48.get()     // Catch:{ IOException -> 0x07d1 }
            X.9nj r11 = (X.C192059nj) r11     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r10 = r47.get()     // Catch:{ IOException -> 0x07d1 }
            X.9uW r10 = (X.C196139uW) r10     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r1 = r5.A03     // Catch:{ IOException -> 0x07d1 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x07d1 }
            r7.<init>()     // Catch:{ IOException -> 0x07d1 }
            r7.append(r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "_deleted_%d.json"
            r7.append(r0)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r21 = r7.toString()     // Catch:{ IOException -> 0x07d1 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x07d1 }
            r0.<init>()     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r12 = "EntityTableProcessor/"
            r0.append(r12)     // Catch:{ IOException -> 0x07d1 }
            r0.append(r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r7 = "/"
            r0.append(r7)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r20 = r0.toString()     // Catch:{ IOException -> 0x07d1 }
            X.2C2 r8 = new X.2C2     // Catch:{ IOException -> 0x07d1 }
            r19 = r10
            r22 = r1
            r23 = r27
            r16 = r8
            r17 = r6
            r18 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x07d1 }
            r0 = r50
            java.util.List r0 = r8.A00(r0)     // Catch:{ IOException -> 0x07d1 }
            java.util.List r9 = r5.A04     // Catch:{ IOException -> 0x07d1 }
            r9.addAll(r0)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r8 = r5.A02     // Catch:{ IOException -> 0x07d1 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x07d1 }
            r13.<init>()     // Catch:{ IOException -> 0x07d1 }
            r13.append(r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "_modified_%d.json"
            r13.append(r0)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r24 = r13.toString()     // Catch:{ IOException -> 0x07d1 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x07d1 }
            r0.<init>()     // Catch:{ IOException -> 0x07d1 }
            r0.append(r12)     // Catch:{ IOException -> 0x07d1 }
            r0.append(r1)     // Catch:{ IOException -> 0x07d1 }
            r0.append(r7)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r23 = r0.toString()     // Catch:{ IOException -> 0x07d1 }
            X.2C0 r0 = new X.2C0     // Catch:{ IOException -> 0x07d1 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x07d1 }
            X.2C3 r7 = new X.2C3     // Catch:{ IOException -> 0x07d1 }
            r17 = r7
            r18 = r50
            r19 = r6
            r20 = r0
            r21 = r11
            r22 = r10
            r25 = r1
            r26 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ IOException -> 0x07d1 }
            r0 = r50
            java.util.List r0 = r7.A00(r0)     // Catch:{ IOException -> 0x07d1 }
            java.util.List r7 = r5.A05     // Catch:{ IOException -> 0x07d1 }
            r7.addAll(r0)     // Catch:{ IOException -> 0x07d1 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r9)     // Catch:{ IOException -> 0x07d1 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x07d1 }
            if (r0 > 0) goto L_0x054e
            java.util.List r0 = java.util.Collections.unmodifiableList(r7)     // Catch:{ IOException -> 0x07d1 }
            int r0 = r0.size()     // Catch:{ IOException -> 0x07d1 }
            if (r0 <= 0) goto L_0x048b
        L_0x054e:
            X.2tR r0 = r6.A00     // Catch:{ IOException -> 0x07d1 }
            long r0 = r0.A04(r1, r8)     // Catch:{ IOException -> 0x07d1 }
            r5.A00 = r0     // Catch:{ IOException -> 0x07d1 }
            goto L_0x048b
        L_0x0558:
            java.util.Map r1 = r2.A09     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = r4.A00     // Catch:{ IOException -> 0x07d1 }
            r1.put(r0, r4)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x0475
        L_0x0561:
            X.2C1 r1 = new X.2C1     // Catch:{ IOException -> 0x07d1 }
            r8 = r1
            r9 = r5
            r10 = r2
            r11 = r15
            r12 = r14
            r13 = r27
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ IOException -> 0x07d1 }
            r0 = r50
            java.util.List r1 = r1.A00(r0)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x043a
        L_0x0575:
            r0 = 80
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x07d1 }
            r0 = r49
            r0.BE3(r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r0 = r48.get()     // Catch:{ IOException -> 0x07d1 }
            X.9nj r0 = (X.C192059nj) r0     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r7 = r47.get()     // Catch:{ IOException -> 0x07d1 }
            X.9uW r7 = (X.C196139uW) r7     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r10 = "header"
            java.io.File r6 = r0.A00(r10)     // Catch:{ IOException -> 0x07d1 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ JSONException -> 0x075f }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x075f }
            r8 = 4
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ all -> 0x0755 }
            r4.<init>()     // Catch:{ all -> 0x0755 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x0755 }
            r9.<init>()     // Catch:{ all -> 0x0755 }
            java.lang.String r11 = "creation_date"
            long r0 = r2.A00     // Catch:{ all -> 0x0755 }
            r9.put(r11, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "os"
            java.lang.String r0 = r2.A06     // Catch:{ all -> 0x0755 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "os_version"
            java.lang.String r0 = r2.A07     // Catch:{ all -> 0x0755 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "app_name"
            java.lang.String r0 = r2.A03     // Catch:{ all -> 0x0755 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "app_version"
            java.lang.String r0 = r2.A04     // Catch:{ all -> 0x0755 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "format_version"
            java.lang.String r0 = r2.A05     // Catch:{ all -> 0x0755 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0755 }
            r4.put(r10, r9)     // Catch:{ all -> 0x0755 }
            X.2fz r10 = r2.A02     // Catch:{ all -> 0x0755 }
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ all -> 0x0755 }
            r9.<init>()     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "filename"
            java.lang.String r0 = r10.A03     // Catch:{ all -> 0x0755 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "format"
            java.lang.String r0 = r10.A04     // Catch:{ all -> 0x0755 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r11 = "messages_count_on_backup"
            long r0 = r10.A00     // Catch:{ all -> 0x0755 }
            r9.put(r11, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r11 = "messages_updated"
            long r0 = r10.A02     // Catch:{ all -> 0x0755 }
            r9.put(r11, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r11 = "messages_deleted"
            long r0 = r10.A01     // Catch:{ all -> 0x0755 }
            r9.put(r11, r0)     // Catch:{ all -> 0x0755 }
            org.json.JSONArray r13 = new org.json.JSONArray     // Catch:{ all -> 0x0755 }
            r13.<init>()     // Catch:{ all -> 0x0755 }
            java.lang.String r0 = "chunks"
            r9.put(r0, r13)     // Catch:{ all -> 0x0755 }
            java.util.List r0 = r10.A05     // Catch:{ all -> 0x0755 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x0755 }
        L_0x0609:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x0755 }
            if (r0 == 0) goto L_0x062c
            java.lang.Object r12 = r14.next()     // Catch:{ all -> 0x0755 }
            X.2bp r12 = (X.C53002bp) r12     // Catch:{ all -> 0x0755 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x0755 }
            r11.<init>()     // Catch:{ all -> 0x0755 }
            java.lang.String r1 = "chunk_number"
            int r0 = r12.A00     // Catch:{ all -> 0x0755 }
            r11.put(r1, r0)     // Catch:{ all -> 0x0755 }
            java.lang.String r10 = "messages_count"
            long r0 = r12.A01     // Catch:{ all -> 0x0755 }
            r11.put(r10, r0)     // Catch:{ all -> 0x0755 }
            r13.put(r11)     // Catch:{ all -> 0x0755 }
            goto L_0x0609
        L_0x062c:
            java.lang.String r0 = "added_messages"
            r4.put(r0, r9)     // Catch:{ all -> 0x0755 }
            X.2ZX r0 = r2.A01     // Catch:{ all -> 0x0755 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x0755 }
            r10.<init>()     // Catch:{ all -> 0x0755 }
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x0755 }
            int r0 = r1.size()     // Catch:{ all -> 0x0755 }
            if (r0 <= 0) goto L_0x065c
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ all -> 0x0755 }
            r9.<init>()     // Catch:{ all -> 0x0755 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0755 }
        L_0x0649:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0755 }
            if (r0 == 0) goto L_0x0657
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0755 }
            r9.put(r0)     // Catch:{ all -> 0x0755 }
            goto L_0x0649
        L_0x0657:
            java.lang.String r0 = "deleted_message_ids_files"
            r10.put(r0, r9)     // Catch:{ all -> 0x0755 }
        L_0x065c:
            java.lang.String r0 = "deleted_messages"
            r4.put(r0, r10)     // Catch:{ all -> 0x0755 }
            java.util.Map r1 = r2.A09     // Catch:{ all -> 0x0755 }
            int r0 = r1.size()     // Catch:{ all -> 0x0755 }
            if (r0 <= 0) goto L_0x06a0
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x0755 }
            r10.<init>()     // Catch:{ all -> 0x0755 }
            java.lang.String r0 = "entities"
            r4.put(r0, r10)     // Catch:{ all -> 0x0755 }
            java.util.Collection r0 = r1.values()     // Catch:{ all -> 0x0755 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0755 }
        L_0x067b:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0755 }
            if (r0 == 0) goto L_0x06a0
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0755 }
            X.16Z r0 = (X.AnonymousClass16Z) r0     // Catch:{ all -> 0x0755 }
            java.lang.String r2 = r0.A00     // Catch:{ all -> 0x0755 }
            X.2Bx r1 = new X.2Bx     // Catch:{ all -> 0x0755 }
            r1.<init>(r2)     // Catch:{ all -> 0x0755 }
            java.util.List r0 = r0.A01     // Catch:{ all -> 0x0755 }
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)     // Catch:{ all -> 0x0755 }
            org.json.JSONObject r0 = r1.A01(r0)     // Catch:{ all -> 0x0755 }
            org.json.JSONArray r0 = r0.getJSONArray(r2)     // Catch:{ all -> 0x0755 }
            r10.put(r2, r0)     // Catch:{ all -> 0x0755 }
            goto L_0x067b
        L_0x06a0:
            java.lang.String r1 = r4.toString(r8)     // Catch:{ all -> 0x0755 }
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ all -> 0x0755 }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x0755 }
            r5.write(r0)     // Catch:{ all -> 0x0755 }
            r5.close()     // Catch:{ JSONException -> 0x075f }
            java.lang.String r1 = "header.json"
            r0 = 1
            long r4 = r7.A02(r6, r1, r0)     // Catch:{ IOException -> 0x07d1 }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x074c
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x07d1 }
            r0 = r55
            r1.<init>(r0)     // Catch:{ IOException -> 0x07d1 }
            java.util.zip.ZipOutputStream r7 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x0740 }
            r7.<init>(r1)     // Catch:{ all -> 0x0740 }
            java.lang.Object r0 = r47.get()     // Catch:{ all -> 0x0736 }
            X.9uW r0 = (X.C196139uW) r0     // Catch:{ all -> 0x0736 }
            X.Akw r9 = r0.A03()     // Catch:{ all -> 0x0736 }
        L_0x06d3:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x072c }
            if (r0 == 0) goto L_0x0724
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x072c }
            X.9gH r0 = (X.C187729gH) r0     // Catch:{ all -> 0x072c }
            if (r0 == 0) goto L_0x06d3
            java.io.File r4 = r0.A02     // Catch:{ all -> 0x072c }
            java.lang.String r8 = r0.A04     // Catch:{ all -> 0x072c }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x072c }
            if (r0 == 0) goto L_0x06d3
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r2 = new byte[r0]     // Catch:{ all -> 0x072c }
            r6 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ all -> 0x071d }
            r5.<init>(r4)     // Catch:{ all -> 0x071d }
            java.util.zip.ZipEntry r4 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x0713 }
            r4.<init>(r8)     // Catch:{ all -> 0x0713 }
            r7.putNextEntry(r4)     // Catch:{ all -> 0x0710 }
            X.00H r0 = r3.A05     // Catch:{ all -> 0x0710 }
            r0.get()     // Catch:{ all -> 0x0710 }
            r0 = r50
            X.C20048A4r.A01(r0, r5, r7, r2)     // Catch:{ all -> 0x0710 }
            r5.close()     // Catch:{ all -> 0x070e }
            r7.closeEntry()     // Catch:{ all -> 0x072c }
            goto L_0x06d3
        L_0x070e:
            r0 = move-exception
            goto L_0x0720
        L_0x0710:
            r2 = move-exception
            r6 = r4
            goto L_0x0714
        L_0x0713:
            r2 = move-exception
        L_0x0714:
            r5.close()     // Catch:{ all -> 0x0718 }
            goto L_0x071c
        L_0x0718:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x071d }
        L_0x071c:
            throw r2     // Catch:{ all -> 0x071d }
        L_0x071d:
            r0 = move-exception
            if (r6 == 0) goto L_0x0723
        L_0x0720:
            r7.closeEntry()     // Catch:{ all -> 0x072c }
        L_0x0723:
            throw r0     // Catch:{ all -> 0x072c }
        L_0x0724:
            r9.close()     // Catch:{ all -> 0x0736 }
            r7.close()     // Catch:{ all -> 0x0740 }
            goto L_0x07b0
        L_0x072c:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x0731 }
            goto L_0x0735
        L_0x0731:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x0736 }
        L_0x0735:
            throw r2     // Catch:{ all -> 0x0736 }
        L_0x0736:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x073b }
            goto L_0x073f
        L_0x073b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x0740 }
        L_0x073f:
            throw r2     // Catch:{ all -> 0x0740 }
        L_0x0740:
            r2 = move-exception
            r1.close()     // Catch:{ all -> 0x0746 }
            goto L_0x00e9
        L_0x0746:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x00e9
        L_0x074c:
            java.lang.String r0 = "Failed to export metadata file."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x07d1 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x00e9
        L_0x0755:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x075a }
            goto L_0x075e
        L_0x075a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ JSONException -> 0x075f }
        L_0x075e:
            throw r1     // Catch:{ JSONException -> 0x075f }
        L_0x075f:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to write header file."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to write header file"
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x07d1 }
            r2.<init>(r0, r1)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x00e9
        L_0x076e:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0789 }
            goto L_0x078d
        L_0x0773:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0789 }
            goto L_0x078d
        L_0x0778:
            r1 = move-exception
            if (r4 == 0) goto L_0x0783
            r4.close()     // Catch:{ all -> 0x077f }
            goto L_0x0783
        L_0x077f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0784 }
        L_0x0783:
            throw r1     // Catch:{ all -> 0x0784 }
        L_0x0784:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0789 }
            goto L_0x078d
        L_0x0789:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x078e }
        L_0x078d:
            throw r1     // Catch:{ all -> 0x078e }
        L_0x078e:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x0793 }
            goto L_0x0797
        L_0x0793:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ IOException -> 0x0798 }
        L_0x0797:
            throw r1     // Catch:{ IOException -> 0x0798 }
        L_0x0798:
            r1 = move-exception
            java.lang.String r0 = "IncrementalBackup/MessagesExporter/Failed to export and assemble data."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.String r0 = "Failed to export messages data."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x07d1 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x00e9
        L_0x07a7:
            java.lang.String r0 = "Failed to export messages file."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ IOException -> 0x07d1 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x07d1 }
            goto L_0x00e9
        L_0x07b0:
            r1.close()     // Catch:{ IOException -> 0x07d1 }
            r0 = 100
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x07d1 }
            r0 = r49
            r0.BE3(r1)     // Catch:{ IOException -> 0x07d1 }
            java.lang.Object r0 = r47.get()
            X.9uW r0 = (X.C196139uW) r0
            r0.A04()
            java.lang.Object r0 = r48.get()
            X.9nj r0 = (X.C192059nj) r0
            r0.A01()
            return
        L_0x07d1:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreIncrementalBackup/Failed to export and assemble data."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07df }
            java.lang.String r1 = "Failed to export backup data."
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x07df }
            r0.<init>(r1)     // Catch:{ all -> 0x07df }
            throw r0     // Catch:{ all -> 0x07df }
        L_0x07df:
            r1 = move-exception
            X.00H r0 = r3.A02
            java.lang.Object r0 = r0.get()
            X.9uW r0 = (X.C196139uW) r0
            r0.A04()
            X.00H r0 = r3.A09
            java.lang.Object r0 = r0.get()
            X.9nj r0 = (X.C192059nj) r0
            r0.A01()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27421Wa.A00(android.os.CancellationSignal, X.3Kl, X.2HF, java.io.File, long):void");
    }

    public C27421Wa(AnonymousClass11P r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11) {
        this.A07 = r1;
        this.A08 = r2;
        this.A0A = r3;
        this.A04 = r4;
        this.A06 = r5;
        this.A09 = r6;
        this.A03 = r7;
        this.A00 = r8;
        this.A05 = r9;
        this.A01 = r10;
        this.A02 = r11;
    }
}
