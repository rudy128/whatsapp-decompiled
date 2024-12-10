package X;

/* renamed from: X.7jm  reason: invalid class name and case insensitive filesystem */
public final class C149887jm extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass6p6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149887jm(AnonymousClass6p6 r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [X.6qp, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0101, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0104, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0105, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0108, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            java.lang.String r0 = "[XFAM] StatusCrosspostUnsentSessionManager/initializing unsentCrosspostStatusSessionCache lazily"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6p6 r0 = r15.this$0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.72Q r0 = (X.AnonymousClass72Q) r0
            java.util.LinkedHashMap r8 = X.C17880vN.A13()
            X.1Cd r10 = r0.A00
            X.1at r2 = r10.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0102 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0102 }
            java.lang.String r1 = "SELECT status_message_row_id, crossposting_session_id FROM status_crossposting WHERE state IN (1,7)"
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/SELECT_UNSENT_CROSSPOST"
            android.database.Cursor r5 = X.C23141Ev.A00(r3, r1, r0)     // Catch:{ all -> 0x0102 }
            java.lang.String r0 = "status_message_row_id"
            int r9 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "crossposting_session_id"
            int r7 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00fb }
        L_0x0032:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x00c3
            long r3 = r5.getLong(r9)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r5.getString(r7)     // Catch:{ all -> 0x00fb }
            if (r1 == 0) goto L_0x0056
            int r0 = r1.length()     // Catch:{ all -> 0x00fb }
            if (r0 == 0) goto L_0x0056
            java.lang.Object r1 = X.C72473Md.A0h(r1, r8)     // Catch:{ all -> 0x00fb }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00fb }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x00fb }
            r1.add(r0)     // Catch:{ all -> 0x00fb }
            goto L_0x0032
        L_0x0056:
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore//found empty session id during offline retry, record detail: "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            X.1at r6 = r10.get()     // Catch:{ all -> 0x00fb }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00bc }
            X.1Ev r13 = r0.A02     // Catch:{ all -> 0x00bc }
            r1 = 1
            java.lang.StringBuilder r12 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "SELECT * FROM status_crossposting WHERE status_message_row_id IN ("
            r12.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "?"
            java.util.List r14 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r14)     // Catch:{ all -> 0x00bc }
            r12.append(r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = ")"
            java.lang.String r12 = X.AnonymousClass000.A0y(r0, r12)     // Catch:{ all -> 0x00bc }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00bc }
            X.C17890vO.A1J(r1, r3)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r4 = r13.A0A(r12, r0, r1)     // Catch:{ all -> 0x00bc }
            r3 = 0
            r1 = r3
        L_0x0094:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x00b5 }
            if (r0 == 0) goto L_0x009f
            X.6t0 r1 = X.AnonymousClass72Q.A00(r4)     // Catch:{ all -> 0x00b5 }
            goto L_0x0094
        L_0x009f:
            r4.close()     // Catch:{ all -> 0x00bc }
            r6.close()     // Catch:{ all -> 0x00fb }
            if (r1 == 0) goto L_0x00ab
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x00fb }
        L_0x00ab:
            java.lang.String r1 = X.AnonymousClass000.A0y(r3, r11)     // Catch:{ all -> 0x00fb }
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x00fb }
            goto L_0x0032
        L_0x00b5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00bc }
            throw r0     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ all -> 0x00fb }
            throw r0     // Catch:{ all -> 0x00fb }
        L_0x00c3:
            r5.close()     // Catch:{ all -> 0x0102 }
            r2.close()
            X.6p6 r7 = r15.this$0
            java.util.Iterator r6 = X.AnonymousClass000.A15(r8)
        L_0x00cf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r6)
            java.lang.Object r5 = r0.getKey()
            java.util.concurrent.ConcurrentHashMap r4 = r7.A01
            boolean r0 = r4.contains(r5)
            if (r0 != 0) goto L_0x00cf
            r2 = 0
            r1 = 0
            X.6qp r0 = new X.6qp
            r0.<init>()
            r0.A01 = r2
            r0.A00 = r1
            r4.put(r5, r0)
            goto L_0x00cf
        L_0x00f5:
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r8)
            return r0
        L_0x00fb:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0102 }
            throw r0     // Catch:{ all -> 0x0102 }
        L_0x0102:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0104 }
        L_0x0104:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149887jm.invoke():java.lang.Object");
    }
}
