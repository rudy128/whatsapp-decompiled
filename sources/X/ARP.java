package X;

public final class ARP implements AnonymousClass1LV {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1Cd A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass1DL A04;

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(X.C195749tq r8) {
        /*
            r7 = this;
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.205 r3 = r8.A05
            X.1Cd r0 = r7.A01
            X.1au r6 = r0.A05()
            r0 = 12
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00b7 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b7 }
            X.1BI r1 = r3.A00     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x0022
            X.1LW r0 = r7.A00     // Catch:{ all -> 0x00b7 }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "chat_row_id"
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00b7 }
        L_0x0022:
            java.lang.String r1 = "from_me"
            boolean r0 = r3.A02     // Catch:{ all -> 0x00b7 }
            X.AnonymousClass8BT.A13(r4, r1, r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r3.A01     // Catch:{ all -> 0x00b7 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00b7 }
            com.whatsapp.jid.Jid r1 = r8.A04     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x003f
            X.1DL r0 = r7.A04     // Catch:{ all -> 0x00b7 }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "sender_jid_row_id"
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00b7 }
        L_0x003f:
            X.205 r2 = r8.A06     // Catch:{ all -> 0x00b7 }
            if (r2 == 0) goto L_0x0060
            java.lang.String r1 = "parent_key_id"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x00b7 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "parent_from_me"
            boolean r0 = r2.A02     // Catch:{ all -> 0x00b7 }
            X.AnonymousClass8BT.A13(r4, r1, r0)     // Catch:{ all -> 0x00b7 }
            X.1BI r1 = r2.A00     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x0060
            X.1LW r0 = r7.A00     // Catch:{ all -> 0x00b7 }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "parent_chat_row_id"
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00b7 }
        L_0x0060:
            com.whatsapp.jid.Jid r1 = r8.A03     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x006f
            X.1DL r0 = r7.A04     // Catch:{ all -> 0x00b7 }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "parent_sender_jid_row_id"
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00b7 }
        L_0x006f:
            java.lang.String r2 = "timestamp"
            long r0 = r8.A02     // Catch:{ all -> 0x00b7 }
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x00b7 }
            byte[] r1 = r8.A08     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x00ac
            java.lang.String r0 = "orphan_message_data"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b7 }
        L_0x007f:
            java.lang.String r1 = "orphan_message_type"
            int r0 = r8.A01     // Catch:{ all -> 0x00b7 }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x00b7 }
            byte[] r1 = r8.A09     // Catch:{ all -> 0x00b7 }
            if (r1 == 0) goto L_0x008f
            java.lang.String r0 = "orphan_message_stanza_data"
            r4.put(r0, r1)     // Catch:{ all -> 0x00b7 }
        L_0x008f:
            java.lang.String r1 = "orphan_message_reason"
            int r0 = r8.A00     // Catch:{ all -> 0x00b7 }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x00b7 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b7 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00b7 }
            java.lang.String r2 = "message_orphan"
            java.lang.String r1 = "MessageOrphanStore/insertMessageOrphan"
            r0 = 5
            long r4 = r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x00b7 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 6
            if (r1 <= 0) goto L_0x00b3
            goto L_0x00b2
        L_0x00ac:
            java.lang.String r0 = "MessageOrphanStore/insertMessageOrphan/orphanMessageData is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00b7 }
            goto L_0x007f
        L_0x00b2:
            r0 = 4
        L_0x00b3:
            r6.close()
            return r0
        L_0x00b7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARP.A01(X.9tq):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003b, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A02(int r7, int r8, long r9) {
        /*
            r6 = this;
            X.1Cd r0 = r6.A01
            X.1at r3 = r0.get()
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x0038 }
            r5 = 0
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0038 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = X.C182299Tv.A00     // Catch:{ all -> 0x0038 }
            java.lang.String[] r1 = X.AnonymousClass8BR.A1b()     // Catch:{ all -> 0x0038 }
            X.C17880vN.A1S(r1, r7, r5)     // Catch:{ all -> 0x0038 }
            r0 = 1
            X.C17880vN.A1V(r1, r0, r9)     // Catch:{ all -> 0x0038 }
            r0 = 2
            X.C17880vN.A1S(r1, r8, r0)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "MessageOrphanStore/getMessageOrphansByMessageType"
            android.database.Cursor r2 = X.C18070vi.A04(r4, r2, r0, r1)     // Catch:{ all -> 0x0038 }
            java.util.ArrayList r0 = r6.A00(r2, r7)     // Catch:{ all -> 0x0031 }
            r2.close()     // Catch:{ all -> 0x0038 }
            r3.close()
            return r0
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARP.A02(int, int, long):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0041, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CBp(X.C171598ry r5) {
        /*
            r4 = this;
            X.1Cd r0 = r4.A01
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003e }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x003e }
            java.lang.String r0 = X.C182299Tv.A00     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "SELECT COUNT(1) as orphan_count FROM message_orphan"
            java.lang.String r0 = "MessageOrphanStore/getMessageOrphanCount"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x003e }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "orphan_count"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x0037 }
            r2.close()     // Catch:{ all -> 0x003e }
            r3.close()
            if (r0 <= 0) goto L_0x0036
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r5.A08 = r0
            return
        L_0x0030:
            r2.close()     // Catch:{ all -> 0x003e }
            r3.close()
        L_0x0036:
            return
        L_0x0037:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARP.CBp(X.8ry):void");
    }

    public ARP(AnonymousClass1LW r1, AnonymousClass1DL r2, AnonymousClass1Cd r3, C18030ve r4, AnonymousClass00H r5) {
        C18070vi.A0w(r4, r2, r1, r3, r5);
        this.A02 = r4;
        this.A04 = r2;
        this.A00 = r1;
        this.A01 = r3;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c9, code lost:
        if (r3.getInt(r20.intValue()) != 1) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0094, code lost:
        if (r3.getInt(r23.intValue()) != 1) goto L_0x0096;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A00(android.database.Cursor r38, int r39) {
        /*
            r37 = this;
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.HashMap r1 = X.C17880vN.A11()
            java.lang.String[] r0 = X.C208113o.A00
            r3 = r38
            X.AnonymousClass1Eu.A04(r3, r1, r0)
            java.lang.String r0 = "_id"
            java.lang.Object r0 = r1.get(r0)
            X.C17960vV.A07(r0)
            int r8 = X.AnonymousClass8BU.A03(r0)
            java.lang.String r0 = "chat_row_id"
            java.lang.Number r24 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "from_me"
            java.lang.Number r23 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "key_id"
            java.lang.Object r0 = r1.get(r0)
            X.C17960vV.A07(r0)
            int r7 = X.AnonymousClass8BU.A03(r0)
            java.lang.String r0 = "sender_jid_row_id"
            java.lang.Number r22 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "parent_chat_row_id"
            java.lang.Number r21 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "parent_from_me"
            java.lang.Number r20 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "parent_key_id"
            java.lang.Number r19 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "parent_sender_jid_row_id"
            java.lang.Number r18 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "timestamp"
            java.lang.Number r17 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "orphan_message_data"
            java.lang.Number r16 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "orphan_message_stanza_data"
            java.lang.Number r15 = X.C108945cZ.A1D(r0, r1)
            java.lang.String r0 = "orphan_message_reason"
            java.lang.Number r14 = X.C108945cZ.A1D(r0, r1)
        L_0x006b:
            boolean r0 = r3.moveToNext()
            if (r0 == 0) goto L_0x013e
            long r12 = r3.getLong(r8)
            if (r24 == 0) goto L_0x013b
            int r0 = r24.intValue()
            int r0 = r3.getInt(r0)
        L_0x007f:
            r9 = r37
            X.1LW r10 = r9.A00
            long r0 = (long) r0
            X.1BI r6 = r10.A0B(r0)
            r1 = 1
            if (r23 == 0) goto L_0x0096
            int r0 = r23.intValue()
            int r0 = r3.getInt(r0)
            r4 = 1
            if (r0 == r1) goto L_0x0097
        L_0x0096:
            r4 = 0
        L_0x0097:
            java.lang.String r5 = X.AnonymousClass8BS.A0c(r3, r7)
            if (r22 == 0) goto L_0x0138
            int r0 = r22.intValue()
            int r0 = r3.getInt(r0)
        L_0x00a5:
            X.1DL r9 = r9.A04
            long r0 = (long) r0
            com.whatsapp.jid.Jid r26 = r9.A0B(r0)
            if (r19 == 0) goto L_0x0135
            if (r21 == 0) goto L_0x0133
            int r0 = r21.intValue()
            int r0 = r3.getInt(r0)
        L_0x00b8:
            long r0 = (long) r0
            X.1BI r11 = r10.A0B(r0)
            if (r20 == 0) goto L_0x00cb
            int r0 = r20.intValue()
            int r10 = r3.getInt(r0)
            r0 = 1
            r1 = 1
            if (r10 == r0) goto L_0x00cc
        L_0x00cb:
            r1 = 0
        L_0x00cc:
            int r0 = r19.intValue()
            java.lang.String r0 = X.AnonymousClass8BS.A0c(r3, r0)
            X.205 r29 = X.AnonymousClass205.A01(r11, r0, r1)
        L_0x00d8:
            if (r18 == 0) goto L_0x0131
            int r0 = r18.intValue()
            int r0 = r3.getInt(r0)
        L_0x00e2:
            long r0 = (long) r0
            com.whatsapp.jid.Jid r27 = r9.A0B(r0)
            if (r17 == 0) goto L_0x012e
            int r0 = r17.intValue()
            long r35 = r3.getLong(r0)
        L_0x00f1:
            if (r16 == 0) goto L_0x012b
            int r0 = r16.intValue()
            byte[] r31 = r3.getBlob(r0)
        L_0x00fb:
            if (r15 == 0) goto L_0x0128
            int r0 = r15.intValue()
            byte[] r32 = r3.getBlob(r0)
        L_0x0105:
            if (r14 == 0) goto L_0x0125
            int r0 = r14.intValue()
            int r34 = r3.getInt(r0)
        L_0x010f:
            java.lang.Long r30 = java.lang.Long.valueOf(r12)
            X.205 r28 = X.AnonymousClass205.A01(r6, r5, r4)
            X.9tq r0 = new X.9tq
            r33 = r39
            r25 = r0
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r2.add(r0)
            goto L_0x006b
        L_0x0125:
            r34 = 0
            goto L_0x010f
        L_0x0128:
            r32 = 0
            goto L_0x0105
        L_0x012b:
            r31 = 0
            goto L_0x00fb
        L_0x012e:
            r35 = 0
            goto L_0x00f1
        L_0x0131:
            r0 = -1
            goto L_0x00e2
        L_0x0133:
            r0 = -1
            goto L_0x00b8
        L_0x0135:
            r29 = 0
            goto L_0x00d8
        L_0x0138:
            r0 = -1
            goto L_0x00a5
        L_0x013b:
            r0 = -1
            goto L_0x007f
        L_0x013e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARP.A00(android.database.Cursor, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0071, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A03(X.AnonymousClass205 r10, int r11, int r12, long r13) {
        /*
            r9 = this;
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            X.1Cd r0 = r9.A01
            X.1at r3 = r0.get()
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x006e }
            r6 = 0
            r7 = 4
            X.1BI r1 = r10.A00     // Catch:{ all -> 0x006e }
            if (r1 != 0) goto L_0x0019
            java.lang.String r0 = "MessageOrphanStore/getMessageOrphansByMessageTypeForParentKey/chatJid is null; invalid parent key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x006e }
            goto L_0x0055
        L_0x0019:
            X.1LW r0 = r9.A00     // Catch:{ all -> 0x006e }
            long r0 = r0.A09(r1)     // Catch:{ all -> 0x006e }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006e }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x006e }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x006e }
            java.lang.String r4 = X.C182299Tv.A01     // Catch:{ all -> 0x006e }
            r0 = 6
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006e }
            X.C17880vN.A1S(r2, r11, r6)     // Catch:{ all -> 0x006e }
            r0 = 1
            X.C17880vN.A1V(r2, r0, r13)     // Catch:{ all -> 0x006e }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x006e }
            boolean r0 = r10.A02     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0052
            java.lang.String r1 = "1"
        L_0x003d:
            r0 = 3
            r2[r0] = r1     // Catch:{ all -> 0x006e }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x006e }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x006e }
            r2[r7] = r0     // Catch:{ all -> 0x006e }
            r0 = 5
            X.C17880vN.A1S(r2, r12, r0)     // Catch:{ all -> 0x006e }
            java.lang.String r0 = "MessageOrphanStore/getMessageOrphansByMessageTypeForParentKey"
            android.database.Cursor r2 = r5.A0A(r4, r0, r2)     // Catch:{ all -> 0x006e }
            goto L_0x0056
        L_0x0052:
            java.lang.String r1 = "0"
            goto L_0x003d
        L_0x0055:
            r2 = 0
        L_0x0056:
            if (r2 != 0) goto L_0x005c
            r3.close()
            return r8
        L_0x005c:
            java.util.ArrayList r0 = r9.A00(r2, r11)     // Catch:{ all -> 0x0067 }
            r2.close()     // Catch:{ all -> 0x006e }
            r3.close()
            return r0
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARP.A03(X.205, int, int, long):java.util.ArrayList");
    }
}
