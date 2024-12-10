package X;

import java.lang.ref.WeakReference;

/* renamed from: X.49f  reason: invalid class name and case insensitive filesystem */
public abstract class C826549f extends A34 {
    public final C42621yT A00 = new Object();
    public final AnonymousClass1KB A01;
    public final C57172ie A02;
    public final AnonymousClass4MY A03;
    public final AnonymousClass6n9 A04;
    public final AnonymousClass1ST A05;
    public final C28521aN A06;
    public final C88194Yr A07;
    public final C88124Yk A08;
    public final AnonymousClass1BI A09;
    public final AnonymousClass1QO A0A;
    public final AnonymousClass1QS A0B;
    public final WeakReference A0C;

    public void A0E() {
        this.A00.A01();
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        if (this instanceof C76763oB) {
            return ((C76763oB) this).A0J((Void[]) objArr);
        }
        return A0J((Void[]) objArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:131:0x020c, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0379, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        X.CDX.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x037e, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0381, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0384, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0385, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0388, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x013e, code lost:
        r9 = (X.AnonymousClass21V) r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Void A0J(java.lang.Void... r15) {
        /*
            r14 = this;
            X.8CU r6 = r14.A02
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x00da
            X.1ST r4 = r14.A05
            X.1BI r2 = r14.A09
            r3 = 1
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediamsgstore/getMediaMessagesCount "
            X.C17900vP.A0Y(r2, r0, r1)
            r10 = 0
            X.1Ez r8 = new X.1Ez
            r8.<init>((boolean) r10)
            java.lang.String r0 = "mediamsgstore/getMediaMessagesCount/"
            r8.A05(r0)
            java.lang.String r9 = X.C51012Wq.A09
            java.lang.String[] r7 = new java.lang.String[r3]
            X.1LW r0 = r4.A02
            long r0 = r0.A09(r2)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5 = 0
            r7[r10] = r0
            X.1Cd r0 = r4.A08     // Catch:{ SQLiteDiskIOException -> 0x00a0 }
            X.1at r10 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x00a0 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0096 }
            X.1Ev r1 = r0.A02     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID"
            android.database.Cursor r7 = r1.A0A(r9, r0, r7)     // Catch:{ all -> 0x0096 }
        L_0x0043:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0083
            boolean r0 = r6.isCancelled()     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0083
            X.00H r0 = r4.A0C     // Catch:{ all -> 0x008a }
            X.206 r9 = X.C72463Mc.A0h(r7, r2, r0)     // Catch:{ all -> 0x008a }
            boolean r0 = r9 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0043
            r0 = r9
            X.21V r0 = (X.AnonymousClass21V) r0     // Catch:{ all -> 0x008a }
            X.2rc r1 = r0.A02     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0043
            X.205 r0 = r9.A0v     // Catch:{ all -> 0x008a }
            boolean r0 = r0.A02     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x006a
            boolean r0 = r1.A0V     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0043
        L_0x006a:
            java.io.File r0 = r1.A0G     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0043
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x008a }
            boolean r0 = X.C72473Md.A1Q(r0)     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0043
            int r5 = r5 + 1
            if (r5 <= r3) goto L_0x0043
            r7.close()     // Catch:{ all -> 0x0096 }
            r10.close()     // Catch:{ SQLiteDiskIOException -> 0x00a0 }
            goto L_0x00c8
        L_0x0083:
            r7.close()     // Catch:{ all -> 0x0096 }
            r10.close()     // Catch:{ SQLiteDiskIOException -> 0x00a0 }
            goto L_0x00a7
        L_0x008a:
            r1 = move-exception
            if (r7 == 0) goto L_0x0095
            r7.close()     // Catch:{ all -> 0x0091 }
            goto L_0x0095
        L_0x0091:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0096 }
        L_0x0095:
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r1 = move-exception
            r10.close()     // Catch:{ all -> 0x009b }
            goto L_0x009f
        L_0x009b:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDiskIOException -> 0x00a0 }
        L_0x009f:
            throw r1     // Catch:{ SQLiteDiskIOException -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            X.1CL r0 = r4.A06
            r0.A00(r3)
            throw r1
        L_0x00a7:
            r8.A02()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediamsgstore/getMediaMessagesCount count:"
            X.C17900vP.A0j(r0, r1, r5)
            if (r5 > 0) goto L_0x00c8
            X.6n9 r0 = r14.A04
            X.1yT r1 = r14.A00
            int r0 = r0.A00(r1, r2)
            if (r0 > 0) goto L_0x00c8
            X.2ie r0 = r14.A02
            int r0 = r0.A00(r1, r2)
            if (r0 > 0) goto L_0x00c8
            r3 = 0
        L_0x00c8:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x00da
            X.1KB r2 = r14.A01
            r1 = 26
            X.7RK r0 = new X.7RK
            r0.<init>((int) r1, (java.lang.Object) r14, (boolean) r3)
            r2.A0J(r0)
        L_0x00da:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x01a8
            X.1ST r4 = r14.A05
            X.1BI r8 = r14.A09
            r7 = 12
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediamsgstore/getMediaMessages "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = " limit:"
            X.C17900vP.A0j(r0, r1, r7)
            r12 = 0
            X.1Ez r1 = new X.1Ez
            r1.<init>((boolean) r12)
            java.lang.String r0 = "mediamsgstore/getMediaMessages/"
            r1.A05(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            X.1LW r0 = r4.A02
            long r9 = r0.A09(r8)
            java.lang.String r13 = java.lang.String.valueOf(r9)
            java.lang.String r10 = X.C51012Wq.A09
            java.lang.String r9 = "GET_MEDIA_MESSAGES_SQL_ORDER_BY_SORT_ID"
            r2 = 1
            X.1Cd r0 = r4.A08     // Catch:{ SQLiteDiskIOException -> 0x0182 }
            X.1at r11 = r0.get()     // Catch:{ SQLiteDiskIOException -> 0x0182 }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0178 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0178 }
            java.lang.String[] r0 = new java.lang.String[r2]     // Catch:{ all -> 0x0178 }
            r0[r12] = r13     // Catch:{ all -> 0x0178 }
            android.database.Cursor r5 = r5.A0A(r10, r9, r0)     // Catch:{ all -> 0x0178 }
        L_0x0128:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0165
            boolean r0 = r6.isCancelled()     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x0165
            X.00H r0 = r4.A0C     // Catch:{ all -> 0x016c }
            X.206 r9 = X.C72463Mc.A0h(r5, r8, r0)     // Catch:{ all -> 0x016c }
            boolean r0 = r9 instanceof X.AnonymousClass21V     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0128
            X.21V r9 = (X.AnonymousClass21V) r9     // Catch:{ all -> 0x016c }
            X.2rc r10 = r9.A02     // Catch:{ all -> 0x016c }
            if (r10 == 0) goto L_0x0128
            X.205 r0 = r9.A0v     // Catch:{ all -> 0x016c }
            boolean r0 = r0.A02     // Catch:{ all -> 0x016c }
            if (r0 != 0) goto L_0x014e
            boolean r0 = r10.A0V     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0128
        L_0x014e:
            java.io.File r0 = r10.A0G     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0128
            android.net.Uri r0 = android.net.Uri.fromFile(r0)     // Catch:{ all -> 0x016c }
            boolean r0 = X.C72473Md.A1Q(r0)     // Catch:{ all -> 0x016c }
            if (r0 == 0) goto L_0x0128
            r3.add(r9)     // Catch:{ all -> 0x016c }
            int r0 = r3.size()     // Catch:{ all -> 0x016c }
            if (r0 < r7) goto L_0x0128
        L_0x0165:
            r5.close()     // Catch:{ all -> 0x0178 }
            r11.close()     // Catch:{ SQLiteDiskIOException -> 0x0182 }
            goto L_0x0189
        L_0x016c:
            r1 = move-exception
            if (r5 == 0) goto L_0x0177
            r5.close()     // Catch:{ all -> 0x0173 }
            goto L_0x0177
        L_0x0173:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0178 }
        L_0x0177:
            throw r1     // Catch:{ all -> 0x0178 }
        L_0x0178:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x017d }
            goto L_0x0181
        L_0x017d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDiskIOException -> 0x0182 }
        L_0x0181:
            throw r1     // Catch:{ SQLiteDiskIOException -> 0x0182 }
        L_0x0182:
            r1 = move-exception
            X.1CL r0 = r4.A06
            r0.A00(r2)
            throw r1
        L_0x0189:
            r1.A02()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "mediamsgstore/getMediaMessages size:"
            r1.append(r0)
            int r0 = r3.size()
            X.C17900vP.A0o(r1, r0)
            X.1KB r2 = r14.A01
            r1 = 27
            X.7RL r0 = new X.7RL
            r0.<init>(r14, r3, r1)
            r2.A0J(r0)
        L_0x01a8:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x01c1
            X.1aN r1 = r14.A06
            X.1BI r0 = r14.A09
            long r2 = r1.A02(r0)
            X.1KB r4 = r14.A01
            r1 = 6
            X.7Ph r0 = new X.7Ph
            r0.<init>(r14, r2, r1)
            r4.A0J(r0)
        L_0x01c1:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x021d
            X.4MY r8 = r14.A03
            X.1BI r5 = r14.A09
            r7 = 0
            X.C18070vi.A0d(r5, r7)
            X.1Cd r0 = r8.A01
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0382 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0382 }
            java.lang.String r2 = "SELECT COUNT(*) as count FROM available_message_view WHERE chat_row_id = ? AND (message_type != '8') AND _id IN (SELECT message_row_id FROM message_ephemeral WHERE keep_in_chat = 1)"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0382 }
            X.1LW r0 = r8.A00     // Catch:{ all -> 0x0382 }
            X.AnonymousClass1LW.A03(r0, r5, r1, r7)     // Catch:{ all -> 0x0382 }
            java.lang.String r0 = "GET_KEPT_MESSAGE_COUNT_FOR_JID_SQL"
            android.database.Cursor r3 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0382 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x01fb
            java.lang.String r0 = "count"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x020a }
            goto L_0x0206
        L_0x01fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "msgstore/countKeptMessages/db no message for "
            X.C17900vP.A0Y(r5, r0, r1)     // Catch:{ all -> 0x020a }
            r1 = 0
        L_0x0206:
            r3.close()     // Catch:{ all -> 0x0382 }
            goto L_0x020f
        L_0x020a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x020c }
        L_0x020c:
            r2 = move-exception
            goto L_0x037e
        L_0x020f:
            r4.close()
            X.1KB r4 = r14.A01
            r3 = 7
            X.7Ph r0 = new X.7Ph
            r0.<init>(r14, r1, r3)
            r4.A0J(r0)
        L_0x021d:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x0256
            X.1QO r1 = r14.A0A
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 != 0) goto L_0x0232
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0256
        L_0x0232:
            X.1QS r0 = r14.A0B
            X.AnonymousClass1QS.A00(r0)
            X.1QR r9 = r0.A04
            X.1BI r8 = r14.A09
            android.util.Pair r10 = X.AnonymousClass1QR.A05(r9, r8)
            r1 = 0
            if (r10 != 0) goto L_0x02cd
            X.1QE r3 = r9.A04
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactionsForChat/null selection"
            r3.A05(r0)
        L_0x024a:
            X.1KB r4 = r14.A01
            r3 = 8
            X.7Ph r0 = new X.7Ph
            r0.<init>(r14, r1, r3)
            r4.A0J(r0)
        L_0x0256:
            boolean r0 = r6.isCancelled()
            if (r0 != 0) goto L_0x039c
            X.4Yr r6 = r14.A07
            X.1BI r3 = r14.A09
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = X.C22971Dz.A0e(r3)
            if (r0 != 0) goto L_0x02b6
            boolean r0 = X.C22971Dz.A0d(r3)
            if (r0 == 0) goto L_0x039c
            X.0ve r1 = r6.A02
            r0 = 8357(0x20a5, float:1.171E-41)
        L_0x0274:
            X.0vf r2 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r2, r1, r0)
            if (r0 == 0) goto L_0x039c
            X.4Yk r0 = r14.A08
            X.4S4 r0 = r0.A02
            X.0ve r1 = r0.A00
            r0 = 8509(0x213d, float:1.1924E-41)
            boolean r1 = X.C18020vd.A05(r2, r1, r0)
            X.00H r0 = r6.A04
            if (r1 == 0) goto L_0x0337
            java.lang.Object r5 = r0.get()
            X.2r4 r5 = (X.C62232r4) r5
            X.11P r0 = r6.A00
            long r7 = X.AnonymousClass11P.A01(r0)
            r4 = 0
            X.1LW r0 = r5.A00
            long r1 = r0.A09(r3)
            r0 = 3
            java.lang.String[] r3 = new java.lang.String[r0]
            X.C17880vN.A1V(r3, r4, r1)
            r0 = 1
            java.lang.String r1 = java.lang.String.valueOf(r7)
            r3[r0] = r1
            r0 = 2
            r3[r0] = r1
            X.1Cd r0 = r5.A02
            X.1at r4 = r0.get()
            goto L_0x0322
        L_0x02b6:
            X.1CJ r1 = r6.A01
            X.1EC r0 = X.AnonymousClass3MW.A0i(r3)
            int r1 = r1.A06(r0)
            boolean r0 = X.AnonymousClass2TI.A00(r1)
            if (r0 != 0) goto L_0x02c8
            if (r1 != 0) goto L_0x039c
        L_0x02c8:
            X.0ve r1 = r6.A02
            r0 = 5563(0x15bb, float:7.795E-42)
            goto L_0x0274
        L_0x02cd:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SELECT COUNT(*) as count FROM pay_transaction WHERE "
            r3.append(r0)
            java.lang.Object r0 = r10.first
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = X.AnonymousClass000.A0y(r0, r3)
            X.1Cd r0 = r9.A03
            X.1at r7 = r0.get()
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x03aa }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x03aa }
            java.lang.Object r3 = r10.second     // Catch:{ all -> 0x03aa }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x03aa }
            java.lang.String r0 = "COUNT_TRANSACTIONS_FOR_JID_SQL"
            android.database.Cursor r5 = r4.A0A(r5, r0, r3)     // Catch:{ all -> 0x03aa }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x039e }
            if (r0 == 0) goto L_0x0304
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x039e }
            long r1 = r5.getLong(r0)     // Catch:{ all -> 0x039e }
            goto L_0x031a
        L_0x0304:
            X.1QE r4 = r9.A04     // Catch:{ all -> 0x039e }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x039e }
            java.lang.String r0 = "PaymentTransactionStore/countAllTransactionsForChat/db no message for "
            r3.append(r0)     // Catch:{ all -> 0x039e }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x039e }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ all -> 0x039e }
            r4.A06(r0)     // Catch:{ all -> 0x039e }
        L_0x031a:
            r5.close()     // Catch:{ all -> 0x03aa }
            r7.close()
            goto L_0x024a
        L_0x0322:
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0382 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0382 }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nWHERE\n    chat_row_id = ?\n    AND\n    (start_time > ? \n      OR \n      (end_time IS NOT NULL AND end_time > ?)\n    )   \n    AND\n    is_canceled = 0\nORDER BY start_time\nASC\nLIMIT 1000"
            java.lang.String r0 = "GET_ALL_UPCOMING_AND_ONGOING_EVENTS_IN_CHAT_QUERY_ID"
            android.database.Cursor r1 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0382 }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x0377 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0377 }
            goto L_0x036e
        L_0x0337:
            java.lang.Object r8 = r0.get()
            X.2r4 r8 = (X.C62232r4) r8
            X.11P r0 = r6.A00
            long r1 = X.AnonymousClass11P.A01(r0)
            r7 = 0
            X.1LW r0 = r8.A00
            long r4 = r0.A09(r3)
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            X.C17880vN.A1V(r3, r7, r4)
            r0 = 1
            X.C17880vN.A1V(r3, r0, r1)
            X.1Cd r0 = r8.A02
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0382 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0382 }
            java.lang.String r1 = "SELECT message_row_id\nFROM message_event\nWHERE\n    chat_row_id = ?\n    AND\n    start_time > ?\n    AND\n    is_canceled = 0\nORDER BY start_time\nASC\nLIMIT 1000"
            java.lang.String r0 = "GET_ALL_UPCOMING_EVENTS_IN_CHAT_QUERY_ID"
            android.database.Cursor r1 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0382 }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x0377 }
            java.util.ArrayList r0 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0377 }
        L_0x036e:
            X.C62232r4.A00(r1, r0)     // Catch:{ all -> 0x0377 }
            if (r1 == 0) goto L_0x0389
            r1.close()     // Catch:{ all -> 0x0382 }
            goto L_0x0389
        L_0x0377:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0379 }
        L_0x0379:
            r2 = move-exception
            X.CDX.A00(r1, r0)     // Catch:{ all -> 0x0382 }
            goto L_0x0381
        L_0x037e:
            X.CDX.A00(r3, r0)     // Catch:{ all -> 0x0382 }
        L_0x0381:
            throw r2     // Catch:{ all -> 0x0382 }
        L_0x0382:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0384 }
        L_0x0384:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        L_0x0389:
            r4.close()
            java.util.ArrayList r3 = X.C88194Yr.A00(r6, r0)
            X.1KB r2 = r14.A01
            r1 = 28
            X.7RL r0 = new X.7RL
            r0.<init>(r14, r3, r1)
            r2.A0J(r0)
        L_0x039c:
            r0 = 0
            return r0
        L_0x039e:
            r1 = move-exception
            if (r5 == 0) goto L_0x03a9
            r5.close()     // Catch:{ all -> 0x03a5 }
            goto L_0x03a9
        L_0x03a5:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x03aa }
        L_0x03a9:
            throw r1     // Catch:{ all -> 0x03aa }
        L_0x03aa:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x03af }
            throw r1
        L_0x03af:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C826549f.A0J(java.lang.Void[]):java.lang.Void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.1yT] */
    public C826549f(AnonymousClass1KB r2, AnonymousClass3Ua r3, C57172ie r4, AnonymousClass4MY r5, AnonymousClass6n9 r6, AnonymousClass1ST r7, C28521aN r8, C88194Yr r9, C88124Yk r10, AnonymousClass1BI r11, AnonymousClass1QO r12, AnonymousClass1QS r13) {
        C18070vi.A0w(r2, r10, r13, r5, r6);
        C18070vi.A0x(r7, r9, r8, r4, r12);
        C18070vi.A0d(r11, 12);
        this.A01 = r2;
        this.A08 = r10;
        this.A0B = r13;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A07 = r9;
        this.A06 = r8;
        this.A02 = r4;
        this.A0A = r12;
        this.A09 = r11;
        this.A0C = AnonymousClass3MW.A0z(r3);
    }
}
