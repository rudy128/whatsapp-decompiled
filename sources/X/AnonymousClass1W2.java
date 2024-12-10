package X;

import java.util.Map;

/* renamed from: X.1W2  reason: invalid class name */
public final class AnonymousClass1W2 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1LY A03;
    public final AnonymousClass1N3 A04;
    public final AnonymousClass1Q7 A05;
    public final AnonymousClass1Cd A06;
    public final AnonymousClass11P A07;
    public final AnonymousClass00H A08;
    public final Map A09;

    public AnonymousClass1W2(AnonymousClass190 r2, AnonymousClass11P r3, AnonymousClass1LW r4, AnonymousClass1CJ r5, AnonymousClass1LY r6, AnonymousClass1N3 r7, AnonymousClass1Q6 r8, AnonymousClass1Cd r9, AnonymousClass00H r10) {
        C18070vi.A0d(r8, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r2, 4);
        C18070vi.A0d(r5, 5);
        C18070vi.A0d(r7, 6);
        C18070vi.A0d(r6, 7);
        C18070vi.A0d(r9, 8);
        C18070vi.A0d(r10, 9);
        this.A07 = r3;
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r5;
        this.A04 = r7;
        this.A03 = r6;
        this.A06 = r9;
        this.A08 = r10;
        AnonymousClass1Q7 r0 = r8.A01;
        C18070vi.A0X(r0);
        this.A05 = r0;
        Map map = r8.A02;
        C18070vi.A0X(map);
        this.A09 = map;
    }

    /* JADX WARNING: type inference failed for: r0v422, types: [com.whatsapp.data.ProfilePhotoChange, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01b5, code lost:
        if (r2 > r0) goto L_0x01b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01cb, code lost:
        if (r2 > r0) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0d1b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0d1f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0d20, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0d21, code lost:
        if (r9 != null) goto L_0x0d23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0d2e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01e1, code lost:
        if (r2 > r0) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01f7, code lost:
        if (r2 <= r0) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01fd, code lost:
        if (r7.A0V(r6, r5) == false) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01ff, code lost:
        if (r35 == false) goto L_0x0cba;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:350:0x098a, B:498:0x0d15] */
    /* JADX WARNING: Removed duplicated region for block: B:454:0x0c5f  */
    /* JADX WARNING: Removed duplicated region for block: B:457:0x0c68  */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0cac  */
    /* JADX WARNING: Removed duplicated region for block: B:463:0x0cbc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 A04(android.database.Cursor r33, X.AnonymousClass1BI r34, boolean r35, boolean r36) {
        /*
            r32 = this;
            r1 = 0
            r2 = 1
            r3 = r33
            int r0 = r3.getColumnCount()
            r31 = r32
            if (r0 != r2) goto L_0x0017
            long r1 = r3.getLong(r1)
            r0 = r31
            X.206 r0 = r0.A03(r1)
            return r0
        L_0x0017:
            java.lang.String r0 = "key_id"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r5 = r3.getString(r0)
            java.lang.String r0 = "from_me"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            r1 = 1
            if (r0 == r2) goto L_0x002f
            r1 = 0
        L_0x002f:
            r4 = r34
            if (r5 == 0) goto L_0x0cc2
            java.lang.String r0 = "-1"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0cc2
            X.205 r17 = new X.205
            r0 = r17
            r0.<init>(r4, r5, r1)
        L_0x0042:
            r16 = 0
            if (r17 != 0) goto L_0x005b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "FMessageDatabaseRetrieverImpl/getMessage/can't read key; jid="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x005a:
            return r16
        L_0x005b:
            if (r36 == 0) goto L_0x0068
            r1 = r17
            r0 = r31
            X.206 r0 = A00(r1, r0)
            if (r0 == 0) goto L_0x0068
            return r0
        L_0x0068:
            r0 = r31
            X.1N3 r0 = r0.A04
            r30 = r0
            java.lang.String r22 = "message_type"
            r0 = r22
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            byte r5 = (byte) r0
            java.lang.String r21 = "timestamp"
            r0 = r21
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            java.lang.String r23 = "status"
            r4 = r23
            int r4 = r3.getColumnIndexOrThrow(r4)
            int r6 = r3.getInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            if (r5 != 0) goto L_0x027c
            if (r4 == 0) goto L_0x00a0
            r4 = 6
            if (r6 == r4) goto L_0x027f
        L_0x00a0:
            r4 = r30
            X.00H r4 = r4.A06
            java.lang.Object r6 = r4.get()
            X.207 r6 = (X.AnonymousClass207) r6
            r4 = r17
            X.206 r4 = r6.A00(r4, r5, r0)
        L_0x00b0:
            if (r4 == 0) goto L_0x0c57
            r0 = r30
            X.1DL r5 = r0.A02
            java.lang.String r0 = "_id"
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            r4.A0x = r0
            java.lang.String r0 = "sort_id"
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            r4.A0y = r0
            r0 = r23
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            r4.A0a(r0)
            java.lang.String r0 = "broadcast"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r1 = r3.getInt(r0)
            r6 = 0
            r0 = 0
            if (r1 <= 0) goto L_0x00eb
            r0 = 1
        L_0x00eb:
            r4.A0l = r0
            java.lang.String r0 = "recipient_count"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            r4.A0A = r0
            java.lang.String r0 = "participant_hash"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r3.getString(r0)
            r4.A0f = r0
            java.lang.String r0 = "origination_flags"
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            r4.A0b(r0)
            java.lang.String r0 = "origin"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            r4.A09 = r0
            java.lang.String r0 = "received_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            r4.A0G = r0
            java.lang.String r0 = "receipt_server_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            r4.A0H = r0
            java.lang.String r0 = "starred"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            if (r0 != r2) goto L_0x0144
            r6 = 1
        L_0x0144:
            r4.A0q = r6
            java.lang.String r0 = "lookup_tables"
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            r4.A11 = r0
            java.lang.String r0 = "message_add_on_flags"
            int r0 = r3.getColumnIndexOrThrow(r0)
            int r0 = r3.getInt(r0)
            r4.A0W(r0)
            java.lang.Class<X.1BI> r2 = X.AnonymousClass1BI.class
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)
            long r0 = r3.getLong(r0)
            com.whatsapp.jid.Jid r0 = r5.A0E(r2, r0)
            X.1BI r0 = (X.AnonymousClass1BI) r0
            r4.A0d(r0)
            java.lang.String r0 = "text_data"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r3.getString(r0)
            r4.A0j(r0)
            java.lang.String r0 = "translated_text"
            int r0 = r3.getColumnIndexOrThrow(r0)
            java.lang.String r0 = r3.getString(r0)
            r4.A0k(r0)
            X.205 r0 = r4.A0v
            X.1BI r6 = r0.A00
            X.C17960vV.A07(r6)
            X.C18070vi.A0X(r6)
            int r5 = r4.A0u
            r0 = 8
            if (r5 == r0) goto L_0x01cd
            boolean r0 = r4.A0q
            if (r0 != 0) goto L_0x01b7
            long r2 = r4.A0y
            r0 = r31
            X.1CJ r0 = r0.A02
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r6)
            if (r0 != 0) goto L_0x0278
            r0 = -9223372036854775808
        L_0x01b3:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x01ff
        L_0x01b7:
            boolean r0 = r4.A0q
            if (r0 == 0) goto L_0x01cd
            long r2 = r4.A0y
            r0 = r31
            X.1CJ r0 = r0.A02
            X.1ci r0 = X.AnonymousClass1CJ.A00(r0, r6)
            if (r0 != 0) goto L_0x0274
            r0 = -9223372036854775808
        L_0x01c9:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x01ff
        L_0x01cd:
            boolean r0 = r4.A0q
            if (r0 != 0) goto L_0x01e3
            long r2 = r4.A0y
            r0 = r31
            X.1CJ r7 = r0.A02
            X.1ci r0 = X.AnonymousClass1CJ.A00(r7, r6)
            if (r0 != 0) goto L_0x0270
            r0 = -9223372036854775808
        L_0x01df:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x01f9
        L_0x01e3:
            boolean r0 = r4.A0q
            if (r0 == 0) goto L_0x0201
            long r2 = r4.A0y
            r0 = r31
            X.1CJ r7 = r0.A02
            X.1ci r0 = X.AnonymousClass1CJ.A00(r7, r6)
            if (r0 != 0) goto L_0x026d
            r0 = -9223372036854775808
        L_0x01f5:
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x0201
        L_0x01f9:
            boolean r0 = r7.A0V(r6, r5)
            if (r0 == 0) goto L_0x0201
        L_0x01ff:
            if (r35 == 0) goto L_0x0cba
        L_0x0201:
            r0 = r31
            X.00H r0 = r0.A08
            java.lang.Object r3 = r0.get()
            X.24k r3 = (X.C446924k) r3
            X.0vl r1 = r3.A0B
            java.lang.Object r0 = r1.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            boolean r0 = r0.A02(r5)
            if (r0 == 0) goto L_0x0caf
            java.lang.Object r0 = r1.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            X.20A r0 = r0.A00(r5)
            boolean r0 = r0 instanceof X.C447224n
            if (r0 == 0) goto L_0x0caf
            long r6 = android.os.SystemClock.uptimeMillis()
            r0 = 1
            r4.A14(r0)
            java.lang.Object r0 = r1.getValue()
            X.20Z r0 = (X.AnonymousClass20Z) r0
            X.20A r1 = r0.A00(r5)
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.subsystem.database.retrieval.FMessageDatabaseReader"
            X.C18070vi.A0z(r1, r0)
            X.24n r1 = (X.C447224n) r1
            r1.BL9(r4)
            java.lang.Class r1 = r1.getClass()
            X.20F r0 = new X.20F
            r0.<init>(r1)
            X.00H r0 = r3.A08
            java.lang.Object r0 = r0.get()
            X.C18070vi.A0X(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x025b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0c42
            java.lang.Object r1 = r2.next()
            X.24q r1 = (X.C447524q) r1
            r0 = r16
            r1.CCZ(r4, r0)
            goto L_0x025b
        L_0x026d:
            long r0 = r0.A0G
            goto L_0x01f5
        L_0x0270:
            long r0 = r0.A0F
            goto L_0x01df
        L_0x0274:
            long r0 = r0.A0I
            goto L_0x01c9
        L_0x0278:
            long r0 = r0.A0H
            goto L_0x01b3
        L_0x027c:
            r4 = 7
            if (r5 != r4) goto L_0x00a0
        L_0x027f:
            r4 = r30
            X.1N2 r7 = r4.A04
            java.lang.String r4 = "_id"
            int r4 = r3.getColumnIndexOrThrow(r4)
            long r5 = r3.getLong(r4)
            X.1Cd r8 = r7.A03
            X.1at r20 = r8.get()
            r4 = r20
            X.1av r4 = (X.C28801av) r4     // Catch:{ all -> 0x0d4d }
            X.1Ev r11 = r4.A02     // Catch:{ all -> 0x0d4d }
            java.lang.String r10 = "SELECT action_type FROM message_system WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x0d4d }
            java.lang.String r12 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x0d4d }
            r4 = 0
            r9[r4] = r12     // Catch:{ all -> 0x0d4d }
            java.lang.String r4 = "GET_SYSTEM_MESSAGE"
            android.database.Cursor r18 = r11.A0A(r10, r4, r9)     // Catch:{ all -> 0x0d4d }
            boolean r4 = r18.moveToFirst()     // Catch:{ all -> 0x0d41 }
            if (r4 != 0) goto L_0x02b2
            goto L_0x0c51
        L_0x02b2:
            java.lang.String r4 = "action_type"
            r9 = r18
            int r4 = r9.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x0d41 }
            int r9 = r9.getInt(r4)     // Catch:{ all -> 0x0d41 }
            X.00H r4 = r7.A08     // Catch:{ all -> 0x0d41 }
            java.lang.Object r4 = r4.get()     // Catch:{ all -> 0x0d41 }
            X.9kl r4 = (X.C190329kl) r4     // Catch:{ all -> 0x0d41 }
            r10 = r17
            X.20i r4 = r4.A00(r10, r9, r0)     // Catch:{ all -> 0x0d41 }
            r4.A14(r2)     // Catch:{ all -> 0x0d41 }
            r4.A0x = r5     // Catch:{ all -> 0x0d41 }
            java.lang.String r12 = "remote_message_from_me"
            java.lang.String r5 = "new_photo_id"
            X.1at r19 = r8.get()     // Catch:{ all -> 0x0d41 }
            boolean r0 = r4 instanceof X.AnonymousClass98A     // Catch:{ all -> 0x0d37 }
            java.lang.String r8 = "GET_SYSTEM_MESSAGE_VALUE_CHANGE"
            r6 = 0
            if (r0 == 0) goto L_0x030e
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String r10 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r9[r6] = r0     // Catch:{ all -> 0x0d37 }
            android.database.Cursor r9 = r11.A0A(r10, r8, r9)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0cf8 }
            if (r0 == 0) goto L_0x030b
            r1 = r4
            X.98A r1 = (X.AnonymousClass98A) r1     // Catch:{ all -> 0x0cf8 }
            java.lang.String r0 = "old_data"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cf8 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0cf8 }
            r1.A01 = r0     // Catch:{ all -> 0x0cf8 }
        L_0x030b:
            r9.close()     // Catch:{ all -> 0x0d37 }
        L_0x030e:
            boolean r0 = r4 instanceof X.AnonymousClass2MT     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0340
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String r10 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r9[r6] = r0     // Catch:{ all -> 0x0d37 }
            android.database.Cursor r9 = r11.A0A(r10, r8, r9)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0cf8 }
            if (r0 == 0) goto L_0x033d
            r1 = r4
            X.2MT r1 = (X.AnonymousClass2MT) r1     // Catch:{ all -> 0x0cf8 }
            java.lang.String r0 = "old_data"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cf8 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0cf8 }
            r1.A00 = r0     // Catch:{ all -> 0x0cf8 }
        L_0x033d:
            r9.close()     // Catch:{ all -> 0x0d37 }
        L_0x0340:
            boolean r0 = r4 instanceof X.AnonymousClass989     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0374
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String r10 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r9[r6] = r0     // Catch:{ all -> 0x0d37 }
            android.database.Cursor r9 = r11.A0A(r10, r8, r9)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0cf8 }
            if (r0 == 0) goto L_0x0371
            java.lang.String r0 = "old_data"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cf8 }
            java.lang.String r1 = r9.getString(r0)     // Catch:{ all -> 0x0cf8 }
            if (r1 == 0) goto L_0x0371
            r0 = r4
            X.989 r0 = (X.AnonymousClass989) r0     // Catch:{ all -> 0x0cf8 }
            r0.A00 = r1     // Catch:{ all -> 0x0cf8 }
        L_0x0371:
            r9.close()     // Catch:{ all -> 0x0d37 }
        L_0x0374:
            boolean r0 = r4 instanceof X.AnonymousClass2MB     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x03a6
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String r10 = "SELECT old_data FROM message_system_value_change WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r9[r6] = r0     // Catch:{ all -> 0x0d37 }
            android.database.Cursor r9 = r11.A0A(r10, r8, r9)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0cf8 }
            if (r0 == 0) goto L_0x03a3
            r1 = r4
            X.2MB r1 = (X.AnonymousClass2MB) r1     // Catch:{ all -> 0x0cf8 }
            java.lang.String r0 = "old_data"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cf8 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0cf8 }
            r1.A00 = r0     // Catch:{ all -> 0x0cf8 }
        L_0x03a3:
            r9.close()     // Catch:{ all -> 0x0d37 }
        L_0x03a6:
            boolean r0 = r4 instanceof X.C48392Mh     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0420
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String r10 = "SELECT is_me_joined FROM message_system_group WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r9[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_GROUP"
            android.database.Cursor r9 = r8.A0A(r10, r0, r9)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0cf8 }
            if (r0 == 0) goto L_0x03d7
            r1 = r4
            X.2Mh r1 = (X.C48392Mh) r1     // Catch:{ all -> 0x0cf8 }
            java.lang.String r0 = "is_me_joined"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cf8 }
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0cf8 }
            r1.A00 = r0     // Catch:{ all -> 0x0cf8 }
        L_0x03d7:
            r9.close()     // Catch:{ all -> 0x0d37 }
            java.lang.String r10 = "SELECT user_jid_row_id FROM message_system_chat_participant WHERE message_row_id = ?"
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r9[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_CHAT_PATRICIPANTS"
            android.database.Cursor r9 = r8.A0A(r10, r0, r9)     // Catch:{ all -> 0x0d37 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0cf8 }
            r10.<init>()     // Catch:{ all -> 0x0cf8 }
        L_0x03f1:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0cf8 }
            if (r0 == 0) goto L_0x0414
            java.lang.String r0 = "user_jid_row_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cf8 }
            long r0 = r9.getLong(r0)     // Catch:{ all -> 0x0cf8 }
            X.1DL r8 = r7.A02     // Catch:{ all -> 0x0cf8 }
            com.whatsapp.jid.Jid r1 = r8.A0B(r0)     // Catch:{ all -> 0x0cf8 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0cf8 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x0cf8 }
            if (r0 == 0) goto L_0x03f1
            r10.add(r0)     // Catch:{ all -> 0x0cf8 }
            goto L_0x03f1
        L_0x0414:
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x0cf8 }
            if (r0 != 0) goto L_0x041d
            r4.A0m(r10)     // Catch:{ all -> 0x0cf8 }
        L_0x041d:
            r9.close()     // Catch:{ all -> 0x0d37 }
        L_0x0420:
            boolean r0 = r4 instanceof X.AnonymousClass2MP     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0480
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String r9 = "SELECT new_photo_id, old_photo, new_photo FROM message_system_photo_change WHERE message_row_id = ?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r8[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PHOTO_CHANGE"
            android.database.Cursor r9 = r10.A0A(r9, r0, r8)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0cf8 }
            if (r0 == 0) goto L_0x047d
            r1 = r4
            X.2MP r1 = (X.AnonymousClass2MP) r1     // Catch:{ all -> 0x0cf8 }
            int r0 = r9.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0cf8 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0cf8 }
            r1.A19(r0)     // Catch:{ all -> 0x0cf8 }
            com.whatsapp.data.ProfilePhotoChange r0 = new com.whatsapp.data.ProfilePhotoChange     // Catch:{ all -> 0x0cf8 }
            r0.<init>()     // Catch:{ all -> 0x0cf8 }
            int r5 = r9.getColumnIndexOrThrow(r5)     // Catch:{ NumberFormatException -> 0x0463 }
            java.lang.String r5 = r9.getString(r5)     // Catch:{ NumberFormatException -> 0x0463 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0463 }
            r0.newPhotoId = r5     // Catch:{ NumberFormatException -> 0x0463 }
        L_0x0463:
            java.lang.String r5 = "new_photo"
            int r5 = r9.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0cf8 }
            byte[] r5 = r9.getBlob(r5)     // Catch:{ all -> 0x0cf8 }
            r0.newPhoto = r5     // Catch:{ all -> 0x0cf8 }
            java.lang.String r5 = "old_photo"
            int r5 = r9.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x0cf8 }
            byte[] r5 = r9.getBlob(r5)     // Catch:{ all -> 0x0cf8 }
            r0.oldPhoto = r5     // Catch:{ all -> 0x0cf8 }
            r1.A00 = r0     // Catch:{ all -> 0x0cf8 }
        L_0x047d:
            r9.close()     // Catch:{ all -> 0x0d37 }
        L_0x0480:
            boolean r0 = r4 instanceof X.AnonymousClass2MN     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x04fd
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String r8 = "SELECT old_jid_row_id, new_jid_row_id FROM message_system_number_change WHERE message_row_id = ?"
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_NUMBER_CHANGE"
            android.database.Cursor r5 = r9.A0A(r8, r0, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0cff }
            if (r0 == 0) goto L_0x04fa
            r9 = r4
            X.2MN r9 = (X.AnonymousClass2MN) r9     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "old_jid_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0cff }
            X.190 r8 = r7.A00     // Catch:{ all -> 0x0cff }
            r9.A02 = r8     // Catch:{ all -> 0x0cff }
            X.1DL r8 = r7.A02     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.Jid r1 = r8.A0B(r0)     // Catch:{ all -> 0x0cff }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x0cff }
            if (r0 == 0) goto L_0x04f0
            r9.A01 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "new_jid_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.Jid r0 = r8.A0B(r0)     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.UserJid r1 = X.C22941Dw.A01(r0)     // Catch:{ all -> 0x0cff }
            boolean r0 = r1 instanceof X.AnonymousClass1E2     // Catch:{ all -> 0x0cff }
            if (r0 == 0) goto L_0x04e9
            X.1Ln r0 = r7.A05     // Catch:{ all -> 0x0cff }
            X.1E2 r1 = (X.AnonymousClass1E2) r1     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.PhoneUserJid r1 = r0.A0D(r1)     // Catch:{ all -> 0x0cff }
            if (r1 != 0) goto L_0x04ec
            java.lang.String r0 = "SystemMessageStore/fillMessageAdditionalTables/LID -> PN mapping unknown"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0cff }
            goto L_0x04f0
        L_0x04e9:
            if (r1 != 0) goto L_0x04ec
            goto L_0x04f0
        L_0x04ec:
            r9.A18(r1)     // Catch:{ all -> 0x0cff }
            goto L_0x04fa
        L_0x04f0:
            r5.close()     // Catch:{ all -> 0x0d37 }
            r19.close()     // Catch:{ all -> 0x0d41 }
            r4 = r16
            goto L_0x0c3a
        L_0x04fa:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x04fd:
            boolean r0 = r4 instanceof X.AnonymousClass2MH     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0654
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String r8 = "SELECT sender_jid_row_id, receiver_jid_row_id, amount_with_symbol, remote_message_sender_jid_row_id, remote_message_from_me, remote_message_key FROM message_payment WHERE message_row_id = ?"
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PAYMENT"
            android.database.Cursor r5 = r10.A0A(r8, r0, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0cff }
            if (r0 == 0) goto L_0x0590
            r9 = r4
            X.2MH r9 = (X.AnonymousClass2MH) r9     // Catch:{ all -> 0x0cff }
            X.1DL r8 = r7.A02     // Catch:{ all -> 0x0cff }
            java.lang.Class<com.whatsapp.jid.UserJid> r11 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "sender_jid_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.Jid r0 = r8.A0E(r11, r0)     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0cff }
            r9.A01 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "receiver_jid_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.Jid r0 = r8.A0E(r11, r0)     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0cff }
            r9.A00 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "amount_with_symbol"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r9.A03 = r0     // Catch:{ all -> 0x0cff }
            int r0 = r5.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x0cff }
            boolean r0 = r5.isNull(r0)     // Catch:{ all -> 0x0cff }
            if (r0 != 0) goto L_0x0590
            java.lang.Class<X.1BI> r11 = X.AnonymousClass1BI.class
            java.lang.String r0 = "remote_message_sender_jid_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0cff }
            com.whatsapp.jid.Jid r8 = r8.A0E(r11, r0)     // Catch:{ all -> 0x0cff }
            X.1BI r8 = (X.AnonymousClass1BI) r8     // Catch:{ all -> 0x0cff }
            int r0 = r5.getColumnIndexOrThrow(r12)     // Catch:{ all -> 0x0cff }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0cff }
            r11 = 0
            if (r0 != r2) goto L_0x057f
            r11 = 1
        L_0x057f:
            java.lang.String r0 = "remote_message_key"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r1 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            X.205 r0 = new X.205     // Catch:{ all -> 0x0cff }
            r0.<init>(r8, r1, r11)     // Catch:{ all -> 0x0cff }
            r9.A02 = r0     // Catch:{ all -> 0x0cff }
        L_0x0590:
            r5.close()     // Catch:{ all -> 0x0d37 }
            boolean r0 = r4 instanceof X.C48402Mi     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x05f3
            java.lang.String r8 = "SELECT web_stub , amount , transfer_date , payment_sender_name , expiration FROM message_payment_transaction_reminder WHERE message_row_id = ?"
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_TRANSACTION_REMINDER"
            android.database.Cursor r5 = r10.A0A(r8, r0, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0cff }
            if (r0 == 0) goto L_0x05f0
            r1 = r4
            X.2Mi r1 = (X.C48402Mi) r1     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "web_stub"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A02 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "amount"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A01 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "transfer_date"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A04 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "payment_sender_name"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A03 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "expiration"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0cff }
            r1.A00 = r0     // Catch:{ all -> 0x0cff }
        L_0x05f0:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x05f3:
            boolean r0 = r4 instanceof X.C48412Mj     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0654
            java.lang.String r8 = "SELECT transaction_info, transaction_data, init_timestamp, update_timestamp, amount_data FROM message_payment_status_update WHERE message_row_id  = ?"
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r4.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_TRANSACTION_STATUS_UPDATE"
            android.database.Cursor r5 = r10.A0A(r8, r0, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0cff }
            if (r0 == 0) goto L_0x0651
            r1 = r4
            X.2Mj r1 = (X.C48412Mj) r1     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "transaction_info"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A03 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "transaction_data"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A01 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "init_timestamp"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A02 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "update_timestamp"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A04 = r0     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = "amount_data"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0cff }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0cff }
            r1.A00 = r0     // Catch:{ all -> 0x0cff }
        L_0x0651:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0654:
            boolean r0 = r4 instanceof X.C1771897p     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0694
            r8 = r4
            X.97p r8 = (X.C1771897p) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_DEVICE_CHANGE"
            java.lang.String r0 = "SELECT device_added_count, device_removed_count FROM message_system_device_change WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x0691
            java.lang.String r0 = "device_added_count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "device_removed_count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            r8.A01 = r0     // Catch:{ all -> 0x0d27 }
        L_0x0691:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0694:
            boolean r0 = r4 instanceof X.AnonymousClass2MC     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x06c8
            r8 = r4
            X.2MC r8 = (X.AnonymousClass2MC) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_INITIAL_PRIVACY_PROVIDER"
            java.lang.String r0 = "SELECT privacy_provider, verified_biz_name, biz_state_id FROM message_system_initial_privacy_provider WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x06c5
            java.lang.String r0 = "biz_state_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
        L_0x06c5:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x06c8:
            boolean r0 = r4 instanceof X.AnonymousClass2MI     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0700
            r10 = r4
            X.2MI r10 = (X.AnonymousClass2MI) r10     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            r8 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r10.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_BLOCK_CONTACT"
            java.lang.String r0 = "SELECT is_blocked FROM message_system_block_contact WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x06fd
            java.lang.String r0 = "is_blocked"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            if (r0 == r2) goto L_0x06fb
            r8 = 0
        L_0x06fb:
            r10.A00 = r8     // Catch:{ all -> 0x0d27 }
        L_0x06fd:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0700:
            boolean r0 = r4 instanceof X.AnonymousClass2MK     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0740
            r8 = r4
            X.2MK r8 = (X.AnonymousClass2MK) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_BIZ_OPT_OUT"
            java.lang.String r0 = "SELECT biz_opt_out_category , biz_opt_out_action FROM message_system_opt_out WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x073d
            java.lang.String r0 = "biz_opt_out_category"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            r8.A01 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "biz_opt_out_action"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
        L_0x073d:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0740:
            boolean r0 = r4 instanceof X.C1772297t     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0781
            r8 = r4
            X.97t r8 = (X.C1772297t) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_BIZ_CALLBACK_ENABLED"
            java.lang.String r0 = "SELECT callback_expiry_timestamp,outgoing_failed_call_id FROM message_system_biz_callback_enabled WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x077e
            java.lang.String r0 = "callback_expiry_timestamp"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            long r0 = (long) r0     // Catch:{ all -> 0x0d27 }
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "outgoing_failed_call_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            r8.A01 = r0     // Catch:{ all -> 0x0d27 }
        L_0x077e:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0781:
            boolean r0 = r4 instanceof X.C1772197s     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x07c2
            r8 = r4
            X.97s r8 = (X.C1772197s) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_BIZ_CALLBACK_DISABLED"
            java.lang.String r0 = "SELECT callback_expiry_timestamp,outgoing_failed_call_id FROM message_system_biz_callback_disabled WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x07bf
            java.lang.String r0 = "callback_expiry_timestamp"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            long r0 = (long) r0     // Catch:{ all -> 0x0d27 }
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "outgoing_failed_call_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            r8.A01 = r0     // Catch:{ all -> 0x0d27 }
        L_0x07bf:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x07c2:
            boolean r0 = r4 instanceof X.AnonymousClass2MJ     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x07f7
            r8 = r4
            X.2MJ r8 = (X.AnonymousClass2MJ) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_EPHEMERAL_SETTING_NOT_APPLIED"
            java.lang.String r0 = "SELECT setting_duration FROM message_system_ephemeral_setting_not_applied WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x07f4
            java.lang.String r0 = "setting_duration"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
        L_0x07f4:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x07f7:
            boolean r0 = r4 instanceof X.AnonymousClass2MD     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0837
            r8 = r4
            X.2MD r8 = (X.AnonymousClass2MD) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_BUSINESS_STATE_FOR_MESSAGE_ROW_ID"
            java.lang.String r0 = "SELECT message_row_id, privacy_message_type, business_name FROM message_system_business_state WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x0834
            java.lang.String r0 = "privacy_message_type"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "business_name"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            r8.A01 = r0     // Catch:{ all -> 0x0d27 }
        L_0x0834:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0837:
            boolean r0 = r4 instanceof X.AnonymousClass2ME     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0886
            X.1N1 r0 = r7.A04     // Catch:{ all -> 0x0d37 }
            r11 = r4
            X.2ME r11 = (X.AnonymousClass2ME) r11     // Catch:{ all -> 0x0d37 }
            X.1Cd r0 = r0.A00     // Catch:{ all -> 0x0d37 }
            X.1at r12 = r0.get()     // Catch:{ all -> 0x0d37 }
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d14 }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x0d14 }
            java.lang.String r9 = "SELECT service, invite_used FROM message_system_payment_invite_setup WHERE message_row_id =?"
            r8 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d14 }
            long r0 = r11.A0x     // Catch:{ all -> 0x0d14 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d14 }
            r5[r6] = r0     // Catch:{ all -> 0x0d14 }
            java.lang.String r0 = "GET_SYSTEM_MESSAGE_PAYMENT_INVITE_SETUP"
            android.database.Cursor r1 = r10.A0A(r9, r0, r5)     // Catch:{ all -> 0x0d14 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0d08 }
            if (r0 == 0) goto L_0x0880
            java.lang.String r0 = "service"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d08 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0d08 }
            r11.A00 = r0     // Catch:{ all -> 0x0d08 }
            java.lang.String r0 = "invite_used"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d08 }
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0d08 }
            if (r0 == r2) goto L_0x087e
            r8 = 0
        L_0x087e:
            r11.A01 = r8     // Catch:{ all -> 0x0d08 }
        L_0x0880:
            r1.close()     // Catch:{ all -> 0x0d14 }
            r12.close()     // Catch:{ all -> 0x0d37 }
        L_0x0886:
            boolean r0 = r4 instanceof X.AnonymousClass2MX     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x08c3
            X.00H r0 = r7.A07     // Catch:{ all -> 0x0d37 }
            r0.get()     // Catch:{ all -> 0x0d37 }
            r9 = r4
            X.2MX r9 = (X.AnonymousClass2MX) r9     // Catch:{ all -> 0x0d37 }
            X.C18070vi.A0d(r9, r2)     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r9.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_GROUP_AUTO_RESTRICT"
            java.lang.String r0 = "SELECT threshold FROM message_system_group_auto_restrict WHERE message_row_id = ?"
            android.database.Cursor r8 = r8.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0d19 }
            if (r0 == 0) goto L_0x08c0
            java.lang.String r0 = "threshold"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d19 }
            int r0 = r8.getInt(r0)     // Catch:{ all -> 0x0d19 }
            r9.A00 = r0     // Catch:{ all -> 0x0d19 }
        L_0x08c0:
            r8.close()     // Catch:{ all -> 0x0d37 }
        L_0x08c3:
            boolean r0 = r4 instanceof X.AnonymousClass2MQ     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x090e
            X.00H r0 = r7.A06     // Catch:{ all -> 0x0d37 }
            r0.get()     // Catch:{ all -> 0x0d37 }
            r5 = r4
            X.2MQ r5 = (X.AnonymousClass2MQ) r5     // Catch:{ all -> 0x0d37 }
            X.C18070vi.A0d(r5, r2)     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r5.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0d37 }
            r8[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_EVENT_UPDATED"
            java.lang.String r0 = "SELECT event_message_row_id, event_name FROM message_system_event_updates WHERE message_row_id = ?"
            android.database.Cursor r8 = r9.A0A(r0, r1, r8)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0d19 }
            if (r0 == 0) goto L_0x090b
            java.lang.String r0 = "event_message_row_id"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d19 }
            long r0 = r8.getLong(r0)     // Catch:{ all -> 0x0d19 }
            r5.A00 = r0     // Catch:{ all -> 0x0d19 }
            java.lang.String r0 = "event_name"
            int r0 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d19 }
            java.lang.String r0 = r8.getString(r0)     // Catch:{ all -> 0x0d19 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0d19 }
            r5.A01 = r0     // Catch:{ all -> 0x0d19 }
        L_0x090b:
            r8.close()     // Catch:{ all -> 0x0d37 }
        L_0x090e:
            boolean r0 = r4 instanceof X.AnonymousClass2MM     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x096b
            r10 = r4
            X.2MM r10 = (X.AnonymousClass2MM) r10     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0d37 }
            r9 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r10.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r8 = 0
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_LINKED_GROUP_CALL"
            java.lang.String r0 = "SELECT call_id, is_video_call, call_type FROM message_system_linked_group_call WHERE message_row_id = ?"
            android.database.Cursor r5 = r11.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x0968
            java.lang.String r0 = "call_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            r10.A01 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "is_video_call"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            boolean r1 = r5.isNull(r0)     // Catch:{ all -> 0x0d27 }
            if (r1 != 0) goto L_0x0956
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            if (r0 == r2) goto L_0x0954
            r9 = 0
        L_0x0954:
            r10.A02 = r9     // Catch:{ all -> 0x0d27 }
        L_0x0956:
            java.lang.String r0 = "call_type"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            boolean r1 = r5.isNull(r0)     // Catch:{ all -> 0x0d27 }
            if (r1 != 0) goto L_0x0966
            int r8 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
        L_0x0966:
            r10.A00 = r8     // Catch:{ all -> 0x0d27 }
        L_0x0968:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x096b:
            boolean r0 = r4 instanceof X.AnonymousClass2MW     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x09d0
            r5 = r4
            X.2MW r5 = (X.AnonymousClass2MW) r5     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r5.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r8[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_MESSAGE_SYSTEM_COMMUNITY_LINK_CHANGED"
            java.lang.String r0 = "SELECT old_group_type, new_group_type, linked_parent_group_jid_row_id FROM message_system_community_link_changed WHERE message_row_id = ?"
            android.database.Cursor r9 = r9.A0A(r0, r1, r8)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0d20 }
            if (r0 == 0) goto L_0x09cd
            java.lang.String r0 = "old_group_type"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d20 }
            boolean r1 = r9.isNull(r0)     // Catch:{ all -> 0x0d20 }
            if (r1 == 0) goto L_0x099e
            r0 = 0
            goto L_0x09a6
        L_0x099e:
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0d20 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0d20 }
        L_0x09a6:
            r5.A02 = r0     // Catch:{ all -> 0x0d20 }
            java.lang.String r0 = "new_group_type"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d20 }
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0d20 }
            r5.A00 = r0     // Catch:{ all -> 0x0d20 }
            java.lang.String r0 = "linked_parent_group_jid_row_id"
            int r0 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d20 }
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0d20 }
            X.1DL r8 = r7.A02     // Catch:{ all -> 0x0d20 }
            long r0 = (long) r0     // Catch:{ all -> 0x0d20 }
            com.whatsapp.jid.Jid r1 = r8.A0B(r0)     // Catch:{ all -> 0x0d20 }
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR     // Catch:{ all -> 0x0d20 }
            X.1EC r0 = X.C42941yz.A00(r1)     // Catch:{ all -> 0x0d20 }
            r5.A01 = r0     // Catch:{ all -> 0x0d20 }
        L_0x09cd:
            r9.close()     // Catch:{ all -> 0x0d37 }
        L_0x09d0:
            boolean r0 = r4 instanceof X.AnonymousClass2MU     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0a04
            r8 = r4
            X.2MU r8 = (X.AnonymousClass2MU) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_MESSAGE_SYSTEM_GROUP_WITH_PARENT"
            java.lang.String r0 = "SELECT linked_parent_group_name FROM message_system_group_with_parent WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x0a01
            java.lang.String r0 = "linked_parent_group_name"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
        L_0x0a01:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0a04:
            boolean r0 = r4 instanceof X.AnonymousClass98B     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0a89
            r8 = r4
            X.98B r8 = (X.AnonymousClass98B) r8     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SUBGROUPS_BY_MSG_ROW_ID"
            java.lang.String r0 = "SELECT subgroup_raw_jid, subgroup_subject, parent_group_jid_row_id FROM message_system_sibling_group_link_change WHERE message_row_id = ?"
            android.database.Cursor r5 = r9.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ all -> 0x0d27 }
            r9.<init>()     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "subgroup_raw_jid"
            int r12 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "subgroup_subject"
            int r11 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "parent_group_jid_row_id"
            int r10 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            r0 = 0
        L_0x0a3d:
            boolean r1 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r1 == 0) goto L_0x0a73
            java.lang.String r1 = r5.getString(r12)     // Catch:{ all -> 0x0d27 }
            X.1yz r0 = X.AnonymousClass1EC.A01     // Catch:{ all -> 0x0d27 }
            X.1EC r25 = r0.A02(r1)     // Catch:{ all -> 0x0d27 }
            java.lang.String r26 = r5.getString(r11)     // Catch:{ all -> 0x0d27 }
            if (r26 != 0) goto L_0x0a55
            java.lang.String r26 = ""
        L_0x0a55:
            r28 = 0
            r27 = 2
            X.A2B r0 = new X.A2B     // Catch:{ all -> 0x0d27 }
            r24 = r0
            r24.<init>(r25, r26, r27, r28)     // Catch:{ all -> 0x0d27 }
            r9.add(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r10)     // Catch:{ all -> 0x0d27 }
            X.1DL r13 = r7.A02     // Catch:{ all -> 0x0d27 }
            long r0 = (long) r0     // Catch:{ all -> 0x0d27 }
            com.whatsapp.jid.Jid r0 = r13.A0B(r0)     // Catch:{ all -> 0x0d27 }
            X.1EC r0 = X.C42941yz.A00(r0)     // Catch:{ all -> 0x0d27 }
            goto L_0x0a3d
        L_0x0a73:
            r8.A01 = r0     // Catch:{ all -> 0x0d27 }
            int r0 = r9.size()     // Catch:{ all -> 0x0d27 }
            if (r0 >= 0) goto L_0x0a7c
            r0 = 0
        L_0x0a7c:
            r8.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.util.Set r0 = r8.A03     // Catch:{ all -> 0x0d27 }
            r0.clear()     // Catch:{ all -> 0x0d27 }
            r0.addAll(r9)     // Catch:{ all -> 0x0d27 }
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0a89:
            boolean r0 = r4 instanceof X.C48382Mg     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0b15
            r11 = r4
            X.2Mg r11 = (X.C48382Mg) r11     // Catch:{ all -> 0x0d37 }
            java.lang.String r10 = "SystemMessageStore/fillMessageSystemWithGroupNodes/no jid found"
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r11.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_ALL_GROUP_NODES_BY_MSG_ROW_ID"
            java.lang.String r0 = "SELECT group_jid_row_id, group_subject, group_node_type, version FROM message_system_with_group_nodes WHERE message_row_id = ?"
            android.database.Cursor r9 = r8.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0d20 }
            r8.<init>()     // Catch:{ all -> 0x0d20 }
            java.lang.String r0 = "group_jid_row_id"
            int r25 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d20 }
            java.lang.String r0 = "group_subject"
            int r24 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d20 }
            java.lang.String r0 = "group_node_type"
            int r15 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d20 }
            java.lang.String r0 = "version"
            int r5 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d20 }
        L_0x0ac8:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0d20 }
            if (r0 == 0) goto L_0x0b0f
            r0 = r25
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x0d20 }
            X.1DL r12 = r7.A02     // Catch:{ all -> 0x0d20 }
            long r0 = (long) r0     // Catch:{ all -> 0x0d20 }
            com.whatsapp.jid.Jid r1 = r12.A0B(r0)     // Catch:{ all -> 0x0d20 }
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR     // Catch:{ all -> 0x0d20 }
            X.1EC r13 = X.C42941yz.A00(r1)     // Catch:{ all -> 0x0d20 }
            r0 = r24
            java.lang.String r14 = r9.getString(r0)     // Catch:{ all -> 0x0d20 }
            int r12 = r9.getInt(r15)     // Catch:{ all -> 0x0d20 }
            boolean r0 = r9.isNull(r5)     // Catch:{ all -> 0x0d20 }
            if (r0 == 0) goto L_0x0af2
            goto L_0x0af7
        L_0x0af2:
            int r1 = r9.getInt(r5)     // Catch:{ all -> 0x0d20 }
            goto L_0x0af8
        L_0x0af7:
            r1 = 0
        L_0x0af8:
            if (r13 == 0) goto L_0x0b03
            X.2md r0 = new X.2md     // Catch:{ all -> 0x0d20 }
            r0.<init>(r13, r14, r12, r1)     // Catch:{ all -> 0x0d20 }
            r8.add(r0)     // Catch:{ all -> 0x0d20 }
            goto L_0x0ac8
        L_0x0b03:
            X.C17960vV.A0F(r6, r10)     // Catch:{ all -> 0x0d20 }
            X.190 r1 = r7.A00     // Catch:{ all -> 0x0d20 }
            java.lang.String r0 = "wa-community-event"
            r1.A0G(r0, r10, r2)     // Catch:{ all -> 0x0d20 }
            goto L_0x0ac8
        L_0x0b0f:
            r11.A1D(r8)     // Catch:{ all -> 0x0d20 }
            r9.close()     // Catch:{ all -> 0x0d37 }
        L_0x0b15:
            boolean r0 = r4 instanceof X.AnonymousClass2ML     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0b59
            r9 = r4
            X.2ML r9 = (X.AnonymousClass2ML) r9     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0d37 }
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r9.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_CHAT_ASSIGNMENT"
            java.lang.String r0 = "SELECT agent_name, is_unassigned_chat FROM message_system_chat_assignment WHERE message_row_id = ?"
            android.database.Cursor r5 = r8.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x0b56
            java.lang.String r0 = "agent_name"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            r9.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "is_unassigned_chat"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            int r0 = r5.getInt(r0)     // Catch:{ all -> 0x0d27 }
            if (r0 == r2) goto L_0x0b54
            r7 = 0
        L_0x0b54:
            r9.A01 = r7     // Catch:{ all -> 0x0d27 }
        L_0x0b56:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0b59:
            boolean r0 = r4 instanceof X.AnonymousClass2MO     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0ba5
            r7 = r4
            X.2MO r7 = (X.AnonymousClass2MO) r7     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r7.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_SCHEDULED_CALL_START"
            java.lang.String r0 = "SELECT creation_message_row_id, call_title, call_timestamp_ms FROM message_system_scheduled_call_start WHERE message_row_id = ?"
            android.database.Cursor r5 = r8.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x0ba2
            java.lang.String r0 = "creation_message_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0d27 }
            r7.A01 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "call_timestamp_ms"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0d27 }
            r7.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "call_title"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            r7.A02 = r0     // Catch:{ all -> 0x0d27 }
        L_0x0ba2:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0ba5:
            boolean r0 = r4 instanceof X.AnonymousClass2MG     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0bf4
            r7 = r4
            X.2MG r7 = (X.AnonymousClass2MG) r7     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r7.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_REMINDER_SETUP"
            java.lang.String r0 = "SELECT original_message_row_id, reminder_content, reminder_timestamp_ms FROM message_system_reminder_setup WHERE message_row_id = ?"
            android.database.Cursor r5 = r8.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x0bf1
            java.lang.String r0 = "original_message_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0d27 }
            r7.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "reminder_timestamp_ms"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0d27 }
            r7.A01 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "reminder_content"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            X.C18070vi.A0d(r0, r6)     // Catch:{ all -> 0x0d27 }
            r7.A02 = r0     // Catch:{ all -> 0x0d27 }
        L_0x0bf1:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0bf4:
            boolean r0 = r4 instanceof X.AnonymousClass2MF     // Catch:{ all -> 0x0d37 }
            if (r0 == 0) goto L_0x0c37
            r7 = r4
            X.2MF r7 = (X.AnonymousClass2MF) r7     // Catch:{ all -> 0x0d37 }
            r0 = r19
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0d37 }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x0d37 }
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch:{ all -> 0x0d37 }
            long r0 = r7.A0x     // Catch:{ all -> 0x0d37 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0d37 }
            r5[r6] = r0     // Catch:{ all -> 0x0d37 }
            java.lang.String r1 = "GET_SYSTEM_MESSAGE_REMINDER_SENT"
            java.lang.String r0 = "SELECT original_message_row_id, original_reminder_content FROM message_system_reminder_sent WHERE message_row_id = ?"
            android.database.Cursor r5 = r8.A0A(r0, r1, r5)     // Catch:{ all -> 0x0d37 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0d27 }
            if (r0 == 0) goto L_0x0c34
            java.lang.String r0 = "original_message_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            long r0 = r5.getLong(r0)     // Catch:{ all -> 0x0d27 }
            r7.A00 = r0     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = "original_reminder_content"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d27 }
            java.lang.String r0 = r5.getString(r0)     // Catch:{ all -> 0x0d27 }
            X.C18070vi.A0d(r0, r6)     // Catch:{ all -> 0x0d27 }
            r7.A01 = r0     // Catch:{ all -> 0x0d27 }
        L_0x0c34:
            r5.close()     // Catch:{ all -> 0x0d37 }
        L_0x0c37:
            r19.close()     // Catch:{ all -> 0x0d41 }
        L_0x0c3a:
            r18.close()     // Catch:{ all -> 0x0d4d }
            r20.close()
            goto L_0x00b0
        L_0x0c42:
            X.1LY r5 = r3.A01
            long r1 = android.os.SystemClock.uptimeMillis()
            long r1 = r1 - r6
            X.0vt r3 = r3.A03
            java.lang.String r0 = "CachedMessageStore/fillMessageFromExtraTables"
            r5.A00(r3, r0, r1)
            goto L_0x0cb8
        L_0x0c51:
            r18.close()     // Catch:{ all -> 0x0d4d }
            r20.close()
        L_0x0c57:
            r0 = r22
            int r4 = r3.getColumnIndex(r0)
            if (r4 >= 0) goto L_0x0c60
            r4 = -1
        L_0x0c60:
            r0 = r21
            int r0 = r3.getColumnIndex(r0)
            if (r0 < 0) goto L_0x0cac
            long r0 = r3.getLong(r0)
            java.lang.String r6 = "yyyy-MM-dd"
            java.util.Locale r3 = java.util.Locale.US
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            r5.<init>(r6, r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r0)
            java.lang.String r6 = r5.format(r3)
        L_0x0c7f:
            java.lang.String r5 = "FMessageDatabaseRetrieverImpl/getMessage/message is null"
            r0 = r31
            X.190 r3 = r0.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "key="
            r1.append(r0)
            r0 = r17
            r1.append(r0)
            java.lang.String r0 = ", date="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", type="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            r3.A0G(r5, r0, r2)
            goto L_0x0cba
        L_0x0cac:
            r6 = r16
            goto L_0x0c7f
        L_0x0caf:
            java.lang.String r2 = "fill"
            java.lang.String r1 = "fmessage-database-reading-not-supported"
            java.lang.String r0 = "message cannot be read from the database"
            X.C446924k.A00(r4, r3, r0, r2, r1)
        L_0x0cb8:
            r16 = r4
        L_0x0cba:
            if (r36 == 0) goto L_0x005a
            r0 = r31
            X.1Q7 r2 = r0.A05
            monitor-enter(r2)
            goto L_0x0cda
        L_0x0cc2:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MainMessageStore/getMessage/id is null or no messages for jid="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r17 = 0
            goto L_0x0042
        L_0x0cda:
            r1 = r17
            X.206 r1 = A00(r1, r0)     // Catch:{ all -> 0x0cf5 }
            r0 = 0
            if (r1 == 0) goto L_0x0ce4
            goto L_0x0cf1
        L_0x0ce4:
            if (r16 == 0) goto L_0x0cee
            r0 = r16
            X.205 r1 = r0.A0v     // Catch:{ all -> 0x0cf5 }
            r2.A01(r0, r1)     // Catch:{ all -> 0x0cf5 }
            goto L_0x0cf3
        L_0x0cee:
            r16 = r0
            goto L_0x0cf3
        L_0x0cf1:
            r16 = r1
        L_0x0cf3:
            monitor-exit(r2)
            return r16
        L_0x0cf5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0cf8:
            r1 = move-exception
            if (r9 == 0) goto L_0x0d36
            r9.close()     // Catch:{ all -> 0x0d06 }
            goto L_0x0d36
        L_0x0cff:
            r1 = move-exception
            if (r5 == 0) goto L_0x0d36
            r5.close()     // Catch:{ all -> 0x0d06 }
            goto L_0x0d36
        L_0x0d06:
            r0 = move-exception
            goto L_0x0d33
        L_0x0d08:
            r2 = move-exception
            if (r1 == 0) goto L_0x0d13
            r1.close()     // Catch:{ all -> 0x0d0f }
            goto L_0x0d13
        L_0x0d0f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x0d14 }
        L_0x0d13:
            throw r2     // Catch:{ all -> 0x0d14 }
        L_0x0d14:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x0d2e }
            goto L_0x0d36
        L_0x0d19:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0d1b }
        L_0x0d1b:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0d37 }
            throw r0     // Catch:{ all -> 0x0d37 }
        L_0x0d20:
            r1 = move-exception
            if (r9 == 0) goto L_0x0d36
            r9.close()     // Catch:{ all -> 0x0d2e }
            goto L_0x0d36
        L_0x0d27:
            r1 = move-exception
            if (r5 == 0) goto L_0x0d36
            r5.close()     // Catch:{ all -> 0x0d2e }
            goto L_0x0d36
        L_0x0d2e:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0d37 }
            goto L_0x0d36
        L_0x0d33:
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0d37 }
        L_0x0d36:
            throw r1     // Catch:{ all -> 0x0d37 }
        L_0x0d37:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0d3c }
            goto L_0x0d40
        L_0x0d3c:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0d41 }
        L_0x0d40:
            throw r1     // Catch:{ all -> 0x0d41 }
        L_0x0d41:
            r1 = move-exception
            if (r18 == 0) goto L_0x0d4c
            r18.close()     // Catch:{ all -> 0x0d48 }
            goto L_0x0d4c
        L_0x0d48:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0d4d }
        L_0x0d4c:
            throw r1     // Catch:{ all -> 0x0d4d }
        L_0x0d4d:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0d52 }
            throw r1
        L_0x0d52:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W2.A04(android.database.Cursor, X.1BI, boolean, boolean):X.206");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006e, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0071, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 A05(X.AnonymousClass205 r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0073
            X.1BI r3 = r11.A00
            if (r3 == 0) goto L_0x0073
            X.206 r9 = A00(r11, r10)
            if (r9 != 0) goto L_0x0072
            X.1Cd r0 = r10.A06
            X.1at r4 = r0.get()
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x006b }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006b }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x006b }
            java.lang.String r5 = X.C50932Wi.A02     // Catch:{ all -> 0x006b }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006b }
            X.1LW r0 = r10.A01     // Catch:{ all -> 0x006b }
            long r0 = r0.A09(r3)     // Catch:{ all -> 0x006b }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006b }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x006b }
            boolean r0 = r11.A02     // Catch:{ all -> 0x006b }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006b }
            r2[r1] = r0     // Catch:{ all -> 0x006b }
            java.lang.String r1 = r11.A01     // Catch:{ all -> 0x006b }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x006b }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x006b }
            java.lang.String r0 = "GET_MESSAGE_BY_KEY_SQL"
            android.database.Cursor r2 = r6.A0A(r5, r0, r2)     // Catch:{ all -> 0x006b }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x0051
            r1 = 0
            r0 = 1
            X.206 r9 = r10.A04(r2, r3, r1, r0)     // Catch:{ all -> 0x0064 }
        L_0x0051:
            r2.close()     // Catch:{ all -> 0x006b }
            X.1LY r3 = r10.A03     // Catch:{ all -> 0x006b }
            java.lang.String r2 = "CachedMessageStore/getMessage/key"
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x006b }
            long r0 = r0 - r7
            r3.A01(r2, r0)     // Catch:{ all -> 0x006b }
            r4.close()
            return r9
        L_0x0064:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006b }
            throw r0     // Catch:{ all -> 0x006b }
        L_0x006b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006d }
        L_0x006d:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0072:
            return r9
        L_0x0073:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W2.A05(X.205):X.206");
    }

    public static final AnonymousClass206 A00(AnonymousClass205 r2, AnonymousClass1W2 r3) {
        C29691ci A0A;
        AnonymousClass206 A002 = r3.A05.A00(r2);
        if (A002 == null && ((A0A = r3.A02.A0A(r2.A00)) == null || (A002 = A0A.A0g) == null || !r2.equals(A002.A0v))) {
            return (AnonymousClass206) r3.A09.get(r2);
        }
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0055, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0060, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass206 A03(long r10) {
        /*
            r9 = this;
            java.lang.String r4 = "CachedMessageStore/getMessage/rowId"
            long r7 = android.os.SystemClock.uptimeMillis()
            X.1Cd r0 = r9.A06     // Catch:{ all -> 0x0061 }
            X.1at r5 = r0.get()     // Catch:{ all -> 0x0061 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005a }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x005a }
            java.lang.String r3 = X.AnonymousClass203.A0B     // Catch:{ all -> 0x005a }
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x005a }
            java.lang.String r1 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x005a }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x005a }
            java.lang.String r0 = "GET_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r6 = r6.A0A(r3, r0, r2)     // Catch:{ all -> 0x005a }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "chat_row_id"
            int r0 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0053 }
            long r1 = r6.getLong(r0)     // Catch:{ all -> 0x0053 }
            X.1LW r0 = r9.A01     // Catch:{ all -> 0x0053 }
            X.1BI r2 = r0.A0B(r1)     // Catch:{ all -> 0x0053 }
            if (r2 == 0) goto L_0x0042
            r1 = 0
            r0 = 1
            X.206 r3 = r9.A04(r6, r2, r1, r0)     // Catch:{ all -> 0x0053 }
        L_0x0042:
            r6.close()     // Catch:{ all -> 0x005a }
            r5.close()     // Catch:{ all -> 0x0061 }
            X.1LY r2 = r9.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r7
            r2.A01(r4, r0)
            return r3
        L_0x0053:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x005a }
            throw r0     // Catch:{ all -> 0x005a }
        L_0x005a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0061 }
            throw r0     // Catch:{ all -> 0x0061 }
        L_0x0061:
            r3 = move-exception
            X.1LY r2 = r9.A03
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r7
            r2.A01(r4, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1W2.A03(long):X.206");
    }

    public static AnonymousClass206 A01(AnonymousClass205 r1, AnonymousClass00H r2) {
        return ((AnonymousClass1W6) r2.get()).A01.A05(r1);
    }

    public static AnonymousClass206 A02(AnonymousClass00H r0, long j) {
        return ((AnonymousClass1W6) r0.get()).A01.A03(j);
    }
}
