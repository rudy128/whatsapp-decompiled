package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Executor;

/* renamed from: X.1TH  reason: invalid class name */
public final class AnonymousClass1TH {
    public final AnonymousClass1TJ A00 = new AnonymousClass1TJ();
    public final AnonymousClass1SI A01;
    public final C25551Oq A02;
    public final C200710s A03;

    public AnonymousClass1TH(AnonymousClass1SI r3, C25551Oq r4, AnonymousClass10I r5) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r5, 2);
        C18070vi.A0d(r3, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = new C200710s(r5, false);
    }

    public static final void A00(C28781at r2, AnonymousClass1TH r3, DeviceJid deviceJid) {
        if (((C28801av) r2).A02.A00.inTransaction()) {
            r2.BJ7(new C70733Ch(r3, deviceJid, 26));
        } else {
            A01(r3, deviceJid);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0030, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(com.whatsapp.jid.DeviceJid r7, int r8) {
        /*
            r6 = this;
            r1 = 0
            X.C17960vV.A01()
            X.1Oq r0 = r6.A02
            X.1au r5 = r0.A06()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002d }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "DELETE FROM msg_history_sync WHERE device_id=? AND sync_type=?"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x002d }
            java.lang.String r0 = r7.getRawString()     // Catch:{ all -> 0x002d }
            r2[r1] = r0     // Catch:{ all -> 0x002d }
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x002d }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x002d }
            java.lang.String r0 = "MessageHistorySyncTable.DELETE_SYNC_STATE_BY_DEVICE_AND_TYPE"
            r4.A0F(r3, r0, r2)     // Catch:{ all -> 0x002d }
            r5.close()
            A01(r6, r7)
            return
        L_0x002d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002f }
        L_0x002f:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TH.A04(com.whatsapp.jid.DeviceJid, int):void");
    }

    public final void A05(AnonymousClass1TI r4, Executor executor) {
        C18070vi.A0d(r4, 0);
        this.A03.execute(new AnonymousClass3C4(this, r4, executor, 27));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0049, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass1TH r7, com.whatsapp.jid.DeviceJid r8) {
        /*
            X.C17960vV.A01()
            X.1Oq r0 = r7.A02
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0046 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0046 }
            java.lang.String r5 = "SELECT device_id, status FROM msg_history_sync WHERE device_id=? AND status=? LIMIT 1"
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r8.getRawString()     // Catch:{ all -> 0x0046 }
            r3 = 0
            r2[r3] = r0     // Catch:{ all -> 0x0046 }
            java.lang.String r1 = "1"
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "MessageHistorySyncTable.SELECT_SYNC_STATUS_FOR_DEVICE_ID"
            android.database.Cursor r2 = r6.A0A(r5, r0, r2)     // Catch:{ all -> 0x0046 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x003f }
            if (r0 <= 0) goto L_0x002c
            r3 = 1
        L_0x002c:
            r2.close()     // Catch:{ all -> 0x0046 }
            r4.close()
            X.10s r2 = r7.A03
            r1 = 45
            X.7RF r0 = new X.7RF
            r0.<init>(r7, r8, r1, r3)
            r2.execute(r0)
            return
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0046 }
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TH.A01(X.1TH, com.whatsapp.jid.DeviceJid):void");
    }

    /* JADX WARNING: type inference failed for: r12v2, types: [X.2SB, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x013a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x013e, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0142, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0145, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C59922n6 A02() {
        /*
            r36 = this;
            X.C17960vV.A01()
            r2 = r36
            X.1Oq r0 = r2.A02
            X.1at r5 = r0.get()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x013f }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x013f }
            java.lang.String r1 = "SELECT _id, device_id, sync_type, last_processed_msg_row_id, oldest_msg_row_id, oldest_message_to_sync_row_id, sent_msgs_count, chunk_order, sent_bytes, last_chunk_timestamp, status, peer_msg_row_id, session_id, md_reg_attempt_id, size_limit_bytes, full_history_on_demand_request_id FROM msg_history_sync WHERE status=1 OR status=3 ORDER BY sync_type ASC, chunk_order ASC, last_chunk_timestamp ASC LIMIT 1"
            java.lang.String r0 = "MessageHistorySyncTable.SELECT_SYNC_TO_PROCESS"
            r12 = 0
            android.database.Cursor r0 = r3.A0A(r1, r0, r12)     // Catch:{ all -> 0x013f }
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0138 }
            if (r1 != 0) goto L_0x0026
            r0.close()     // Catch:{ all -> 0x013f }
            r5.close()
            return r12
        L_0x0026:
            X.1E0 r3 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "device_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0138 }
            com.whatsapp.jid.DeviceJid r13 = r3.A06(r1)     // Catch:{ all -> 0x0138 }
            if (r13 != 0) goto L_0x003f
            r0.close()     // Catch:{ all -> 0x013f }
            r5.close()
            return r12
        L_0x003f:
            java.lang.String r1 = "sync_type"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            int r15 = r0.getInt(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "session_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = r0.getString(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "md_reg_attempt_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = r0.getString(r1)     // Catch:{ all -> 0x0138 }
            if (r3 == 0) goto L_0x006c
            if (r1 == 0) goto L_0x006c
            X.2SB r12 = new X.2SB     // Catch:{ all -> 0x0138 }
            r12.<init>()     // Catch:{ all -> 0x0138 }
            r12.A01 = r3     // Catch:{ all -> 0x0138 }
            r12.A00 = r1     // Catch:{ all -> 0x0138 }
        L_0x006c:
            java.lang.String r1 = "_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            long r18 = r0.getLong(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "last_processed_msg_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            long r20 = r0.getLong(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "oldest_msg_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            long r22 = r0.getLong(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "oldest_message_to_sync_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            long r24 = r0.getLong(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "sent_msgs_count"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            long r26 = r0.getLong(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "chunk_order"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            int r16 = r0.getInt(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "sent_bytes"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x0138 }
            long r8 = (long) r1     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "last_chunk_timestamp"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            int r1 = r0.getInt(r1)     // Catch:{ all -> 0x0138 }
            long r6 = (long) r1     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "status"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            int r17 = r0.getInt(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "peer_msg_row_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            long r32 = r0.getLong(r1)     // Catch:{ all -> 0x0138 }
            java.lang.String r1 = "size_limit_bytes"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0138 }
            boolean r3 = r0.isNull(r1)     // Catch:{ all -> 0x0138 }
            if (r3 != 0) goto L_0x00fc
            long r1 = r0.getLong(r1)     // Catch:{ all -> 0x0138 }
        L_0x00e6:
            java.lang.String r3 = "full_history_on_demand_request_id"
            int r3 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0138 }
            java.lang.String r14 = r0.getString(r3)     // Catch:{ all -> 0x0138 }
            X.2n6 r11 = new X.2n6     // Catch:{ all -> 0x0138 }
            r28 = r8
            r30 = r6
            r34 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r20, r22, r24, r26, r28, r30, r32, r34)     // Catch:{ all -> 0x0138 }
            goto L_0x0131
        L_0x00fc:
            X.1SI r3 = r2.A01     // Catch:{ all -> 0x0138 }
            r4 = 2
            r10 = 1000000(0xf4240, double:4.940656E-318)
            r1 = -1
            if (r15 == r4) goto L_0x0129
            r4 = 3
            if (r15 == r4) goto L_0x011e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0138 }
            r3.<init>()     // Catch:{ all -> 0x0138 }
            java.lang.String r4 = "HistorySyncUtil/getSizeLimitBytes unexpected sync type "
            r3.append(r4)     // Catch:{ all -> 0x0138 }
            r3.append(r15)     // Catch:{ all -> 0x0138 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0138 }
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ all -> 0x0138 }
            goto L_0x00e6
        L_0x011e:
            X.18O r2 = r3.A00     // Catch:{ all -> 0x0138 }
            X.18Q r1 = X.AnonymousClass18O.A0t     // Catch:{ all -> 0x0138 }
            int r1 = r2.A04(r1)     // Catch:{ all -> 0x0138 }
            long r1 = (long) r1     // Catch:{ all -> 0x0138 }
            long r1 = r1 * r10
            goto L_0x00e6
        L_0x0129:
            X.0ve r4 = r3.A01     // Catch:{ all -> 0x0138 }
            r3 = 2645(0xa55, float:3.706E-42)
            r4.A0G(r3)     // Catch:{ all -> 0x0138 }
            goto L_0x00e6
        L_0x0131:
            r0.close()     // Catch:{ all -> 0x013f }
            r5.close()
            return r11
        L_0x0138:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x013a }
        L_0x013a:
            r1 = move-exception
            X.CDX.A00(r0, r2)     // Catch:{ all -> 0x013f }
            throw r1     // Catch:{ all -> 0x013f }
        L_0x013f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TH.A02():X.2n6");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d4, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.C59922n6 r8) {
        /*
            r7 = this;
            X.C17960vV.A01()
            X.1Oq r0 = r7.A02
            X.1au r3 = r0.A06()
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00d1 }
            r5.<init>()     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "device_id"
            com.whatsapp.jid.DeviceJid r4 = r8.A0D     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = r4.getRawString()     // Catch:{ all -> 0x00d1 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "sync_type"
            int r0 = r8.A02     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "last_processed_msg_row_id"
            long r0 = r8.A04     // Catch:{ all -> 0x00d1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "oldest_msg_row_id"
            long r0 = r8.A0A     // Catch:{ all -> 0x00d1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "sent_msgs_count"
            long r0 = r8.A08     // Catch:{ all -> 0x00d1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "chunk_order"
            int r0 = r8.A00     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "sent_bytes"
            long r0 = r8.A07     // Catch:{ all -> 0x00d1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "last_chunk_timestamp"
            long r0 = r8.A03     // Catch:{ all -> 0x00d1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "status"
            int r0 = r8.A01     // Catch:{ all -> 0x00d1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "peer_msg_row_id"
            long r0 = r8.A05     // Catch:{ all -> 0x00d1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "oldest_message_to_sync_row_id"
            long r0 = r8.A0B     // Catch:{ all -> 0x00d1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            X.2SB r6 = r8.A0C     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "md_reg_attempt_id"
            java.lang.String r1 = "session_id"
            if (r6 == 0) goto L_0x009f
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x00d1 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = r6.A00     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            goto L_0x00a5
        L_0x009f:
            r5.putNull(r1)     // Catch:{ all -> 0x00d1 }
            r5.putNull(r2)     // Catch:{ all -> 0x00d1 }
        L_0x00a5:
            java.lang.String r1 = r8.A0E     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "full_history_on_demand_request_id"
            if (r1 == 0) goto L_0x00af
            r5.put(r0, r1)     // Catch:{ all -> 0x00d1 }
            goto L_0x00b2
        L_0x00af:
            r5.putNull(r0)     // Catch:{ all -> 0x00d1 }
        L_0x00b2:
            java.lang.String r2 = "size_limit_bytes"
            long r0 = r8.A09     // Catch:{ all -> 0x00d1 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d1 }
            r5.put(r2, r0)     // Catch:{ all -> 0x00d1 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00d1 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00d1 }
            java.lang.String r1 = "msg_history_sync"
            java.lang.String r0 = "MessageHistorySyncTable.INSERT_SYNC_STATE"
            r2.A05(r1, r0, r5)     // Catch:{ all -> 0x00d1 }
            A00(r3, r7, r4)     // Catch:{ all -> 0x00d1 }
            r3.close()
            return
        L_0x00d1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TH.A03(X.2n6):void");
    }
}
