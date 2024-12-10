package X;

/* renamed from: X.2jc  reason: invalid class name and case insensitive filesystem */
public final class C57772jc {
    public final C24681Lg A00;
    public final C25931Qe A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass22M r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.00H r0 = r6.A04
            java.lang.Object r2 = r0.get()
            X.2hx r2 = (X.C56742hx) r2
            X.25F r0 = r7.A00
            X.229 r1 = r0.A02
            X.AiT r1 = (X.C21340AiT) r1
            if (r1 != 0) goto L_0x001a
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateMessageCallLog call log is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x001a:
            X.1Cd r0 = r2.A00
            X.1au r5 = r0.A05()
            android.content.ContentValues r4 = X.C17890vO.A08()     // Catch:{ all -> 0x0052 }
            X.AnonymousClass206.A04(r4, r7)     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "call_log_row_id"
            long r0 = r1.A00     // Catch:{ all -> 0x0052 }
            X.C17880vN.A19(r4, r2, r0)     // Catch:{ all -> 0x0052 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0052 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "message_call_log"
            java.lang.String r1 = "INSERT_OR_UPDATE_CALL_LOG_MESSAGE"
            r0 = 5
            long r3 = r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x0052 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateMessageCallLog/insert error, rowId="
            X.AnonymousClass206.A06(r7, r0, r1)     // Catch:{ all -> 0x0052 }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x0052 }
        L_0x004e:
            r5.close()
            return
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C57772jc.A00(X.22M):void");
    }

    public C57772jc(C24681Lg r1, C25931Qe r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r3, r4, r5, r2);
        this.A00 = r1;
        this.A04 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r2;
    }
}
