package X;

/* renamed from: X.7jo  reason: invalid class name and case insensitive filesystem */
public final class C149907jo extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C133526ou this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149907jo(C133526ou r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            java.lang.String r0 = "[WAFFLE] StatusCrosspostingUnsentSessionManager/initializing unsentCrosspostStatusSessionCache lazy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6ou r0 = r13.this$0
            X.00H r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.73E r0 = (X.AnonymousClass73E) r0
            java.util.LinkedHashMap r7 = X.C17880vN.A13()
            X.1Cd r0 = r0.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x009c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x009c }
            java.lang.String r1 = "SELECT status_message_row_id,crossposting_session_id, destination FROM status_crossposting_v3 WHERE state IN (1, 7)"
            java.lang.String r0 = "[WAFFLE] WaffleStatusCrosspostingStore/SELECT_UNSENT_CROSSPOST_UNSENT_SESSIONS"
            android.database.Cursor r8 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x009c }
            java.lang.String r0 = "status_message_row_id"
            int r10 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "crossposting_session_id"
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0095 }
            java.lang.String r0 = "destination"
            int r5 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0095 }
        L_0x0038:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0080
            long r2 = r8.getLong(r10)     // Catch:{ all -> 0x0095 }
            java.lang.String r12 = r8.getString(r9)     // Catch:{ all -> 0x0095 }
            int r11 = r8.getInt(r5)     // Catch:{ all -> 0x0095 }
            if (r12 == 0) goto L_0x0079
            int r0 = r12.length()     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r4 = r7.get(r12)     // Catch:{ all -> 0x0095 }
            if (r4 != 0) goto L_0x0068
            java.util.LinkedHashSet r1 = X.C17880vN.A14()     // Catch:{ all -> 0x0095 }
            java.util.HashSet r0 = X.C17880vN.A12()     // Catch:{ all -> 0x0095 }
            X.6qu r4 = new X.6qu     // Catch:{ all -> 0x0095 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x0095 }
            r7.put(r12, r4)     // Catch:{ all -> 0x0095 }
        L_0x0068:
            X.6qu r4 = (X.C134636qu) r4     // Catch:{ all -> 0x0095 }
            java.util.LinkedHashSet r0 = r4.A00     // Catch:{ all -> 0x0095 }
            X.C17880vN.A1R(r0, r2)     // Catch:{ all -> 0x0095 }
            java.util.Set r1 = r4.A01     // Catch:{ all -> 0x0095 }
            X.6Re r0 = X.AnonymousClass6WG.A00(r11)     // Catch:{ all -> 0x0095 }
            r1.add(r0)     // Catch:{ all -> 0x0095 }
            goto L_0x0038
        L_0x0079:
            java.lang.String r1 = "[WAFFLE] WaffleStatusCrosspostingStore//found empty session id during offline retry"
            r0 = 0
            X.C17960vV.A0F(r0, r1)     // Catch:{ all -> 0x0095 }
            goto L_0x0038
        L_0x0080:
            r8.close()     // Catch:{ all -> 0x009c }
            r6.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "[WAFFLE] StatusCrosspostingUnsentSessionManager/initializing result: "
            X.C17900vP.A0Y(r7, r0, r1)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r7)
            return r0
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x009c }
            throw r0     // Catch:{ all -> 0x009c }
        L_0x009c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C149907jo.invoke():java.lang.Object");
    }
}
