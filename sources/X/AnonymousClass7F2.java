package X;

/* renamed from: X.7F2  reason: invalid class name */
public final class AnonymousClass7F2 implements C72113Kr {
    public final C18030ve A00;
    public final AnonymousClass18K A01;
    public final AnonymousClass00H A02;

    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Object, X.6sc] */
    /* JADX WARNING: type inference failed for: r8v4, types: [java.lang.Object, X.6sc] */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a8, code lost:
        X.CDX.A00(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01ab, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01b2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b5, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b6, code lost:
        X.CDX.A00(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01b9, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bqf() {
        /*
            r30 = this;
            r11 = r30
            X.0ve r2 = r11.A00
            r1 = 7143(0x1be7, float:1.001E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0063
            X.00H r0 = r11.A02
            java.lang.Object r9 = r0.get()
            X.6hw r9 = (X.C129526hw) r9
            X.1NK r4 = r9.A03
            X.11P r0 = r9.A00
            long r2 = X.AnonymousClass11P.A01(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            long r4 = r4.A02(r2)
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0064
            X.6sc r8 = new X.6sc
            r8.<init>()
            r8.A00 = r0
            r8.A02 = r0
            r8.A01 = r0
            r8.A03 = r0
        L_0x0039:
            X.630 r2 = new X.630
            r2.<init>()
            long r0 = r8.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A00 = r0
            long r0 = r8.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A02 = r0
            long r0 = r8.A03
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
            long r0 = r8.A01
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A03 = r0
            X.18K r0 = r11.A01
            r0.CC7(r2)
        L_0x0063:
            return
        L_0x0064:
            r3 = 90
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            X.1Cd r2 = r9.A02
            r29 = r2
            X.1at r7 = r29.get()
            r2 = r7
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x01b3 }
            X.1Ev r12 = r2.A02     // Catch:{ all -> 0x01b3 }
            java.lang.String r8 = "SELECT DISTINCT(chat_row_id) AS chat_row_id FROM message WHERE _id > ? AND message_type = ? LIMIT 100"
            java.lang.String[] r6 = X.C17880vN.A1Z()     // Catch:{ all -> 0x01b3 }
            X.C17890vO.A1J(r6, r4)     // Catch:{ all -> 0x01b3 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x01b3 }
            r2 = 1
            r6[r2] = r3     // Catch:{ all -> 0x01b3 }
            java.lang.String r2 = "GET_CHAT_ROW_IDS_HAVING_CALL_LOG_MESSAGE_AFTER_ROW_ID_SQL"
            android.database.Cursor r8 = r12.A0A(r8, r2, r6)     // Catch:{ all -> 0x01b3 }
            java.lang.String r2 = "chat_row_id"
            int r6 = r8.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x01ac }
        L_0x0093:
            boolean r2 = r8.moveToNext()     // Catch:{ all -> 0x01ac }
            if (r2 == 0) goto L_0x00a1
            long r2 = r8.getLong(r6)     // Catch:{ all -> 0x01ac }
            X.C17880vN.A1R(r10, r2)     // Catch:{ all -> 0x01ac }
            goto L_0x0093
        L_0x00a1:
            r8.close()     // Catch:{ all -> 0x01b3 }
            r7.close()
            X.6sc r8 = new X.6sc
            r8.<init>()
            r8.A00 = r0
            r8.A02 = r0
            r8.A01 = r0
            r8.A03 = r0
            java.util.Iterator r28 = r10.iterator()
        L_0x00b8:
            boolean r2 = r28.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r28.next()
            java.lang.Number r2 = (java.lang.Number) r2
            X.1LW r6 = r9.A01
            X.C18070vi.A0b(r2)
            long r2 = r2.longValue()
            X.1BI r6 = r6.A0B(r2)
            boolean r27 = X.C22971Dz.A0e(r6)
            X.C129526hw.A05 = r4
            X.C129526hw.A06 = r0
            r0 = 108(0x6c, float:1.51E-43)
            X.C129526hw.A04 = r0
            r12 = 1
            r26 = 1
        L_0x00e0:
            X.1at r10 = r29.get()
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01a5 }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x01a5 }
            java.lang.String r7 = "SELECT _id, message_type ,timestamp FROM message WHERE _id > ? AND chat_row_id = ? AND message_type NOT IN (7) ORDER BY sort_id ASC LIMIT ?"
            r0 = 3
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x01a5 }
            long r0 = X.C129526hw.A05     // Catch:{ all -> 0x01a5 }
            X.C17890vO.A1J(r6, r0)     // Catch:{ all -> 0x01a5 }
            X.C17880vN.A1V(r6, r12, r2)     // Catch:{ all -> 0x01a5 }
            java.lang.String r1 = "1000"
            r0 = 2
            r6[r0] = r1     // Catch:{ all -> 0x01a5 }
            java.lang.String r0 = "GET_MESSAGES_AFTER_ROW_ID_FOR_CHATS_HAVING_CALL_LOG_MESSAGES"
            android.database.Cursor r7 = r13.A0A(r7, r0, r6)     // Catch:{ all -> 0x01a5 }
            int r1 = r7.getCount()     // Catch:{ all -> 0x019e }
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r0) goto L_0x010b
            r26 = 0
        L_0x010b:
            r15 = 90
            java.lang.String r0 = "_id"
            int r14 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "timestamp"
            int r13 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "message_type"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x019e }
            r24 = 0
            r22 = 0
        L_0x0123:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x0158
            int r1 = r7.getInt(r6)     // Catch:{ all -> 0x019e }
            long r18 = r7.getLong(r14)     // Catch:{ all -> 0x019e }
            long r20 = r7.getLong(r13)     // Catch:{ all -> 0x019e }
            long r16 = X.C129526hw.A05     // Catch:{ all -> 0x019e }
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x013d
            r16 = r18
        L_0x013d:
            X.C129526hw.A05 = r16     // Catch:{ all -> 0x019e }
            r18 = 1
            if (r1 != r15) goto L_0x0145
            long r24 = r24 + r18
        L_0x0145:
            long r16 = X.C129526hw.A06     // Catch:{ all -> 0x019e }
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0153
            if (r1 == r15) goto L_0x0151
            int r0 = X.C129526hw.A04     // Catch:{ all -> 0x019e }
            if (r0 != r15) goto L_0x0153
        L_0x0151:
            long r22 = r22 + r18
        L_0x0153:
            X.C129526hw.A06 = r20     // Catch:{ all -> 0x019e }
            X.C129526hw.A04 = r1     // Catch:{ all -> 0x019e }
            goto L_0x0123
        L_0x0158:
            java.lang.Long r1 = java.lang.Long.valueOf(r24)     // Catch:{ all -> 0x019e }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x019e }
            X.1D6 r6 = X.AnonymousClass1D6.A01(r1, r0)     // Catch:{ all -> 0x019e }
            long r0 = r8.A02     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r6.first     // Catch:{ all -> 0x019e }
            long r13 = X.C17880vN.A05(r13)     // Catch:{ all -> 0x019e }
            long r0 = r0 + r13
            r8.A02 = r0     // Catch:{ all -> 0x019e }
            long r0 = r8.A00     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r6.second     // Catch:{ all -> 0x019e }
            long r13 = X.C17880vN.A05(r13)     // Catch:{ all -> 0x019e }
            long r0 = r0 + r13
            r8.A00 = r0     // Catch:{ all -> 0x019e }
            if (r27 == 0) goto L_0x0192
            long r0 = r8.A03     // Catch:{ all -> 0x019e }
            java.lang.Object r13 = r6.first     // Catch:{ all -> 0x019e }
            long r13 = X.C17880vN.A05(r13)     // Catch:{ all -> 0x019e }
            long r0 = r0 + r13
            r8.A03 = r0     // Catch:{ all -> 0x019e }
            long r0 = r8.A01     // Catch:{ all -> 0x019e }
            java.lang.Object r6 = r6.second     // Catch:{ all -> 0x019e }
            long r13 = X.C17880vN.A05(r6)     // Catch:{ all -> 0x019e }
            long r0 = r0 + r13
            r8.A01 = r0     // Catch:{ all -> 0x019e }
        L_0x0192:
            r7.close()     // Catch:{ all -> 0x01a5 }
            r10.close()
            r0 = 0
            if (r26 == 0) goto L_0x00b8
            goto L_0x00e0
        L_0x019e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01a0 }
        L_0x01a0:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x01a5 }
            throw r0     // Catch:{ all -> 0x01a5 }
        L_0x01a5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01a7 }
        L_0x01a7:
            r1 = move-exception
            X.CDX.A00(r10, r0)
            throw r1
        L_0x01ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ae }
        L_0x01ae:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x01b3 }
            throw r0     // Catch:{ all -> 0x01b3 }
        L_0x01b3:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x01b5 }
        L_0x01b5:
            r1 = move-exception
            X.CDX.A00(r7, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7F2.Bqf():void");
    }

    public AnonymousClass7F2(C18030ve r1, AnonymousClass18K r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
