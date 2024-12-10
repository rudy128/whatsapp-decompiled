package X;

/* renamed from: X.2k1  reason: invalid class name and case insensitive filesystem */
public final class C58022k1 {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1LW A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r2 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00da, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass1BI r10) {
        /*
            r9 = this;
            r5 = 0
            X.C18070vi.A0d(r10, r5)
            boolean r0 = X.C22971Dz.A0d(r10)
            if (r0 == 0) goto L_0x00df
            X.1M9 r2 = r9.A00
            X.1E7 r0 = r2.A0E(r10)
            if (r0 == 0) goto L_0x00df
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00df
            X.00H r4 = r9.A05
            java.lang.Object r0 = r4.get()
            X.2nQ r0 = (X.C60122nQ) r0
            int r1 = r0.A00(r10)
            X.00H r0 = r9.A06
            java.lang.Object r0 = r0.get()
            X.72A r0 = (X.AnonymousClass72A) r0
            boolean r0 = r0.A03(r1)
            if (r0 != 0) goto L_0x00df
            r8 = r9
            monitor-enter(r8)
            X.1E7 r3 = r2.A0E(r10)     // Catch:{ all -> 0x00db }
            if (r3 == 0) goto L_0x00de
            boolean r0 = r3.A0D()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x0053
            X.0ve r2 = r9.A02     // Catch:{ all -> 0x00db }
            r1 = 4873(0x1309, float:6.829E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00db }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x00db }
            if (r0 != 0) goto L_0x0053
            java.lang.String r0 = "WabaiUtilsImpl/sendWelcomeMessageIfNotRequested 1p, abprop disabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00db }
            goto L_0x00de
        L_0x0053:
            boolean r0 = r3.A0E()     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x006b
            X.0ve r2 = r9.A02     // Catch:{ all -> 0x00db }
            r1 = 5587(0x15d3, float:7.829E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x00db }
            boolean r0 = X.C18020vd.A05(r0, r2, r1)     // Catch:{ all -> 0x00db }
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "WabaiUtilsImpl/sendWelcomeMessageIfNotRequested 3p, abprop disabled."
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00db }
            goto L_0x00de
        L_0x006b:
            X.00H r0 = r9.A03     // Catch:{ all -> 0x00db }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x00db }
            X.2hw r2 = (X.C56732hw) r2     // Catch:{ all -> 0x00db }
            X.1LW r0 = r9.A01     // Catch:{ all -> 0x00db }
            long r0 = r0.A09(r10)     // Catch:{ all -> 0x00db }
            X.1Cd r2 = r2.A00     // Catch:{ all -> 0x00db }
            X.1at r3 = r2.get()     // Catch:{ all -> 0x00db }
            r2 = r3
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x00d4 }
            X.1Ev r7 = r2.A02     // Catch:{ all -> 0x00d4 }
            java.lang.String r6 = "SELECT welcome_request_message_sent FROM bot_chat_info WHERE chat_row_id = ?"
            java.lang.String[] r2 = X.C17880vN.A1Y()     // Catch:{ all -> 0x00d4 }
            X.C17880vN.A1V(r2, r5, r0)     // Catch:{ all -> 0x00d4 }
            java.lang.String r0 = "BotChatInfoStoreGET_IS_WELCOME_REQUEST_MESSAGE_SENT"
            android.database.Cursor r2 = r7.A0A(r6, r0, r2)     // Catch:{ all -> 0x00d4 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00a0
            r2.close()     // Catch:{ all -> 0x00d4 }
            r3.close()     // Catch:{ all -> 0x00db }
            goto L_0x00b2
        L_0x00a0:
            java.lang.String r0 = "welcome_request_message_sent"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00cd }
            boolean r0 = X.AnonymousClass24X.A01(r2, r0)     // Catch:{ all -> 0x00cd }
            r2.close()     // Catch:{ all -> 0x00d4 }
            r3.close()     // Catch:{ all -> 0x00db }
            goto L_0x00b3
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00de
            X.00H r0 = r9.A04     // Catch:{ all -> 0x00db }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00db }
            X.9oI r0 = (X.C192379oI) r0     // Catch:{ all -> 0x00db }
            r0.A00(r10, r5)     // Catch:{ all -> 0x00db }
            java.lang.Object r0 = r4.get()     // Catch:{ all -> 0x00db }
            X.2nQ r0 = (X.C60122nQ) r0     // Catch:{ all -> 0x00db }
            r0.A01(r10, r1)     // Catch:{ all -> 0x00db }
            goto L_0x00de
        L_0x00cd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x00de:
            monitor-exit(r8)
        L_0x00df:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58022k1.A00(X.1BI):void");
    }

    public C58022k1(AnonymousClass1M9 r1, AnonymousClass1LW r2, C18030ve r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r2, r1, r4, r5);
        C18070vi.A0l(r6, r7);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A05 = r4;
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r7;
    }
}
