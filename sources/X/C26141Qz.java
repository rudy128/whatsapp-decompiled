package X;

import android.content.ContentValues;

/* renamed from: X.1Qz  reason: invalid class name and case insensitive filesystem */
public final class C26141Qz {
    public static final int[] A0E = {0, 1, 3, 2, 20, 9, 66, 23};
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1LW A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1MZ A03;
    public final AnonymousClass1Cd A04;
    public final AnonymousClass1NK A05;
    public final C26121Qx A06;
    public final AnonymousClass1PS A07;
    public final C26131Qy A08;
    public final C18030ve A09;
    public final AnonymousClass18K A0A;
    public final C25241Nl A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;

    public C26141Qz(AnonymousClass1M9 r2, AnonymousClass1LW r3, AnonymousClass1CJ r4, AnonymousClass1MZ r5, AnonymousClass1Cd r6, AnonymousClass1NK r7, C26121Qx r8, AnonymousClass1PS r9, C26131Qy r10, C18030ve r11, AnonymousClass18K r12, C25241Nl r13, AnonymousClass00H r14, AnonymousClass00H r15) {
        C18070vi.A0d(r11, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r7, 4);
        C18070vi.A0d(r12, 5);
        C18070vi.A0d(r2, 6);
        C18070vi.A0d(r13, 7);
        C18070vi.A0d(r14, 8);
        C18070vi.A0d(r6, 9);
        C18070vi.A0d(r8, 10);
        C18070vi.A0d(r5, 11);
        C18070vi.A0d(r15, 12);
        C18070vi.A0d(r10, 13);
        C18070vi.A0d(r9, 14);
        this.A09 = r11;
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r7;
        this.A0A = r12;
        this.A00 = r2;
        this.A0B = r13;
        this.A0D = r14;
        this.A04 = r6;
        this.A06 = r8;
        this.A03 = r5;
        this.A0C = r15;
        this.A08 = r10;
        this.A07 = r9;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.2lb] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.C59002lb A02(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            r0 = 0
            X.2lb r5 = new X.2lb
            r5.<init>()
            r5.A01 = r0
            r5.A00 = r6
            X.1Cd r0 = r7.A04
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0050 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "SELECT no_of_retries_sent_already, last_sync_response_sent_timestamp FROM message_ephemeral_sync_response WHERE chat_jid = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0050 }
            r1[r6] = r8     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "GET_SYNC_RESPONSE_INFO_FOR_CHAT_JID"
            android.database.Cursor r3 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0050 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0042
            java.lang.String r0 = "last_sync_response_sent_timestamp"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "no_of_retries_sent_already"
            int r2 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0049 }
            long r0 = r3.getLong(r1)     // Catch:{ all -> 0x0049 }
            r5.A01 = r0     // Catch:{ all -> 0x0049 }
            int r0 = r3.getInt(r2)     // Catch:{ all -> 0x0049 }
            r5.A00 = r0     // Catch:{ all -> 0x0049 }
        L_0x0042:
            r3.close()     // Catch:{ all -> 0x0050 }
            r4.close()
            return r5
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0050 }
            throw r0     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Qz.A02(java.lang.String):X.2lb");
    }

    public final int A03(String str) {
        int i;
        C18070vi.A0d(str, 0);
        C59002lb r0 = (C59002lb) ((C52132aQ) this.A0C.get()).A00.get(str);
        if (r0 != null && (i = r0.A00) != -1) {
            return i;
        }
        C59002lb A022 = A02(str);
        A06(A022, str);
        return A022.A00;
    }

    public final long A04(String str) {
        C18070vi.A0d(str, 0);
        C59002lb r0 = (C59002lb) ((C52132aQ) this.A0C.get()).A00.get(str);
        if (r0 != null) {
            long j = r0.A01;
            if (j != -1) {
                return j;
            }
        }
        C59002lb A022 = A02(str);
        A06(A022, str);
        return A022.A01;
    }

    public final void A07(AnonymousClass1BI r6, int i) {
        ContentValues contentValues;
        C18070vi.A0d(r6, 1);
        C29691ci A002 = AnonymousClass1CJ.A00(this.A02, r6);
        if (A002 != null) {
            A002.A02 = i;
            AnonymousClass1LW r3 = this.A01;
            synchronized (A002) {
                contentValues = new ContentValues();
                contentValues.put("ephemeral_displayed_exemptions", Integer.valueOf(A002.A02));
            }
            r3.A05(contentValues, A002);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            r6 = 0
            int r1 = r8.A05
            r0 = 0
            if (r1 <= 0) goto L_0x0007
            r0 = 1
        L_0x0007:
            X.C17960vV.A0D(r0)
            X.1Cd r0 = r7.A04
            X.1au r5 = r0.A05()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0036 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "UPDATE message_ephemeral SET keep_in_chat=?  WHERE message_row_id =? "
            r0 = 2
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0036 }
            int r0 = r8.A0C()     // Catch:{ all -> 0x0036 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0036 }
            r2[r6] = r0     // Catch:{ all -> 0x0036 }
            long r0 = r8.A0x     // Catch:{ all -> 0x0036 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0036 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = "KEEP_IN_CHAT_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL"
            r4.A0F(r3, r0, r2)     // Catch:{ all -> 0x0036 }
            r5.close()
            return
        L_0x0036:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Qz.A09(X.206):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0058, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0A(java.lang.String r14, long r15, int r17) {
        /*
            r13 = this;
            r10 = 0
            r8 = r14
            X.C18070vi.A0d(r14, r10)
            r7 = r13
            X.1Cd r0 = r13.A04
            X.1au r4 = r0.A05()
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x0055 }
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x004e }
            r6.<init>()     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "chat_jid"
            r6.put(r0, r14)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "last_sync_response_sent_timestamp"
            r11 = r15
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x004e }
            r6.put(r1, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "no_of_retries_sent_already"
            r9 = r17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x004e }
            r6.put(r1, r0)     // Catch:{ all -> 0x004e }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "message_ephemeral_sync_response"
            java.lang.String r1 = "UPDATE_EPHEMERAL_SYNC_RESPONSE_FOR_CHAT_JID_SQL"
            r0 = 5
            r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x004e }
            r5.A00()     // Catch:{ all -> 0x004e }
            X.3C9 r6 = new X.3C9     // Catch:{ all -> 0x004e }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x004e }
            r4.BJ7(r6)     // Catch:{ all -> 0x004e }
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
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Qz.A0A(java.lang.String, long, int):void");
    }

    private final ContentValues A01(AnonymousClass206 r5) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("duration", Integer.valueOf(r5.A05));
        Long l = r5.A0U;
        C17960vV.A07(l);
        contentValues.put("expire_timestamp", l);
        if (C18020vd.A05(C18040vf.A02, this.A09, 5309)) {
            contentValues.put("ephemeral_trigger", Integer.valueOf(r5.A04));
            Boolean bool = r5.A0Q;
            if (bool != null) {
                contentValues.put("ephemeral_initiated_by_me", bool);
            }
        }
        return contentValues;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r11.A09, 7141) != false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (r0 != null) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C29721cl A05(X.AnonymousClass206 r12, long r13) {
        /*
            r11 = this;
            X.205 r3 = r12.A0v
            boolean r5 = r3.A02
            if (r5 != 0) goto L_0x0019
            boolean r0 = r12 instanceof X.C442622t
            if (r0 == 0) goto L_0x0019
            r0 = r12
            X.22t r0 = (X.C442622t) r0
            int r4 = r0.A00
            long r2 = r0.A01
        L_0x0011:
            int r1 = r12.A00
            X.1cl r0 = new X.1cl
            r0.<init>(r4, r2, r1)
            return r0
        L_0x0019:
            r4 = r11
            monitor-enter(r4)
            X.00H r0 = r11.A0D     // Catch:{ all -> 0x0135 }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x0135 }
            X.1ht r2 = (X.C32871ht) r2     // Catch:{ all -> 0x0135 }
            java.lang.Class<X.20s> r1 = X.C437320s.class
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0135 }
            r0.<init>(r1)     // Catch:{ all -> 0x0135 }
            X.20Z r1 = r2.A00(r0)     // Catch:{ all -> 0x0135 }
            int r0 = r12.A0u     // Catch:{ all -> 0x0135 }
            X.20A r0 = r1.A00(r0)     // Catch:{ all -> 0x0135 }
            X.20s r0 = (X.C437320s) r0     // Catch:{ all -> 0x0135 }
            monitor-exit(r4)
            boolean r0 = r0.Bee()
            if (r5 == 0) goto L_0x010e
            if (r0 == 0) goto L_0x008b
            boolean r0 = r12.A19
            if (r0 != 0) goto L_0x008b
            boolean r0 = r12 instanceof X.C442822v
            if (r0 != 0) goto L_0x008b
            boolean r0 = r12 instanceof X.C442622t
            if (r0 != 0) goto L_0x008b
            X.1BI r6 = r3.A00
            boolean r0 = X.C22971Dz.A0e(r6)
            r7 = 0
            r5 = 1
            if (r0 == 0) goto L_0x00a9
            X.1M9 r1 = r11.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.ChatJid"
            X.C18070vi.A0z(r6, r0)
            X.1E7 r0 = r1.A0E(r6)
            if (r0 == 0) goto L_0x008b
            int r0 = r0.A04
            if (r0 <= 0) goto L_0x008b
            r12.A0Z(r0)
            X.0ve r2 = r11.A09
            r1 = 7141(0x1be5, float:1.0007E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x008b
        L_0x0075:
            X.1CJ r0 = r11.A02
            X.1ci r0 = r0.A0A(r6)
            if (r0 == 0) goto L_0x008b
            X.2lr r1 = r0.A0d
            if (r1 == 0) goto L_0x008b
            int r0 = r1.A00
            r12.A04 = r0
            java.lang.Boolean r0 = r1.A01
            if (r0 == 0) goto L_0x008b
        L_0x0089:
            r12.A0Q = r0
        L_0x008b:
            int r0 = r12.A05
            if (r0 <= 0) goto L_0x009a
            long r2 = (long) r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r13 = r13 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r13)
            r12.A0U = r0
        L_0x009a:
            java.lang.Long r0 = r12.A0T
            if (r0 == 0) goto L_0x00a6
            long r2 = r0.longValue()
        L_0x00a2:
            int r4 = r12.A05
            goto L_0x0011
        L_0x00a6:
            r2 = 0
            goto L_0x00a2
        L_0x00a9:
            boolean r0 = X.C22971Dz.A0d(r6)
            if (r0 == 0) goto L_0x008b
            X.1CJ r0 = r11.A02
            X.1ci r0 = r0.A0A(r6)
            if (r0 == 0) goto L_0x00e3
            X.1cl r4 = r0.A0e
            r3 = 2
            if (r4 == 0) goto L_0x008b
            int r10 = r4.expiration
            if (r10 > 0) goto L_0x00c8
            long r0 = r4.ephemeralSettingTimestamp
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x008b
        L_0x00c8:
            r12.A0Z(r10)
            long r0 = r4.ephemeralSettingTimestamp
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A0h(r0)
            int r0 = r4.disappearingMessagesInitiator
            if (r0 == r5) goto L_0x00e0
            if (r0 == r3) goto L_0x00dd
            r12.A00 = r7
            goto L_0x0075
        L_0x00dd:
            r12.A00 = r3
            goto L_0x0075
        L_0x00e0:
            r12.A00 = r5
            goto L_0x0075
        L_0x00e3:
            X.1PS r1 = r11.A07
            com.whatsapp.jid.UserJid r0 = r1.A03(r6)
            if (r0 == 0) goto L_0x008b
            int r4 = r1.A01(r0)
            long r2 = r1.A02(r0)
            boolean r0 = r0.equals(r6)
            r1 = r0 ^ 1
            if (r1 != 0) goto L_0x00fc
            r5 = 2
        L_0x00fc:
            r12.A0Z(r4)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r12.A0h(r0)
            r12.A00 = r5
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x0089
        L_0x010e:
            int r1 = r12.A05
            if (r1 <= 0) goto L_0x008b
            X.1Qy r0 = r11.A08
            boolean r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x008b
            X.1CJ r2 = r11.A02
            X.1M9 r1 = r11.A00
            X.1BI r0 = r3.A00
            X.C17960vV.A07(r0)
            int r0 = X.C43391zj.A00(r1, r2, r0)
            r12.A0Z(r0)
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r12.A0h(r0)
            goto L_0x008b
        L_0x0135:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Qz.A05(X.206, long):X.1cl");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C59002lb r4, java.lang.String r5) {
        /*
            r3 = this;
            X.1Cd r0 = r3.A04
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0033 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0033 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0033 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x001e
            r1 = 24
            X.AkY r0 = new X.AkY     // Catch:{ all -> 0x0033 }
            r0.<init>(r3, r4, r5, r1)     // Catch:{ all -> 0x0033 }
            r2.BJ7(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x002f
        L_0x001e:
            X.00H r0 = r3.A0C     // Catch:{ all -> 0x0033 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0033 }
            X.2aQ r1 = (X.C52132aQ) r1     // Catch:{ all -> 0x0033 }
            r0 = 1
            X.C18070vi.A0d(r4, r0)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00     // Catch:{ all -> 0x0033 }
            r0.put(r5, r4)     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r2.close()
            return
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Qz.A06(X.2lb, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(X.AnonymousClass206 r6) {
        /*
            r5 = this;
            X.1Cd r0 = r5.A04
            X.1au r4 = r0.A05()
            android.content.ContentValues r3 = r5.A01(r6)     // Catch:{ all -> 0x0025 }
            java.lang.String r2 = "message_row_id"
            long r0 = r6.A0x     // Catch:{ all -> 0x0025 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0025 }
            r3.put(r2, r0)     // Catch:{ all -> 0x0025 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0025 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0025 }
            java.lang.String r1 = "message_ephemeral"
            java.lang.String r0 = "INSERT_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL"
            r2.A05(r1, r0, r3)     // Catch:{ all -> 0x0025 }
            r4.close()
            return
        L_0x0025:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26141Qz.A08(X.206):void");
    }

    public static final int A00(C26141Qz r6, C28791au r7, AnonymousClass206 r8) {
        return ((C28801av) r7).A02.A02(r6.A01(r8), "message_ephemeral", "message_row_id = ?", "updateEphemeralMessage/UPDATE_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL", new String[]{String.valueOf(r8.A0x)});
    }
}
