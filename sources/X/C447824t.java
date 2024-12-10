package X;

/* renamed from: X.24t  reason: invalid class name and case insensitive filesystem */
public final class C447824t implements C447624r {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public C447824t(AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        if (r3.size() > 0) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00ff, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0100, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0103, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r13, X.C49702Rn r14) {
        /*
            r12 = this;
            r0 = 0
            X.C18070vi.A0d(r13, r0)
            X.00H r0 = r12.A01
            java.lang.Object r0 = r0.get()
            X.1Cd r0 = (X.AnonymousClass1Cd) r0
            X.1at r2 = r0.get()
            X.205 r0 = r13.A0v     // Catch:{ all -> 0x00fd }
            X.1BI r1 = r0.A00     // Catch:{ all -> 0x00fd }
            boolean r0 = X.C22971Dz.A0N(r1)     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00f9
            boolean r0 = X.C22971Dz.A0a(r1)     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x00f9
            X.00H r0 = r12.A00     // Catch:{ all -> 0x00fd }
            java.lang.Object r4 = r0.get()     // Catch:{ all -> 0x00fd }
            X.2cH r4 = (X.C53282cH) r4     // Catch:{ all -> 0x00fd }
            boolean r0 = r13 instanceof X.C436420i     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x00e8
            java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x00fd }
            r3.<init>()     // Catch:{ all -> 0x00fd }
            X.1Cd r7 = r4.A01     // Catch:{ all -> 0x00fd }
            X.1at r11 = r7.get()     // Catch:{ all -> 0x00fd }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00de }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x00de }
            java.lang.String r8 = "SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?"
            r5 = 1
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x00de }
            long r0 = r13.A0x     // Catch:{ all -> 0x00de }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00de }
            r10 = 0
            r6[r10] = r0     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "GET_DEVICE_RECEIPTS_SQL"
            android.database.Cursor r6 = r9.A0A(r8, r0, r6)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r8 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d2 }
        L_0x0056:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0074
            X.1DL r9 = r4.A00     // Catch:{ all -> 0x00d2 }
            long r0 = r6.getLong(r8)     // Catch:{ all -> 0x00d2 }
            com.whatsapp.jid.Jid r1 = r9.A0B(r0)     // Catch:{ all -> 0x00d2 }
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x00d2 }
            com.whatsapp.jid.DeviceJid r0 = r0.A02(r1)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x0056
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x00d2 }
            r3.add(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x0056
        L_0x0074:
            r6.close()     // Catch:{ all -> 0x00de }
            r11.close()     // Catch:{ all -> 0x00fd }
            int r0 = r3.size()     // Catch:{ all -> 0x00fd }
            if (r0 > 0) goto L_0x00c9
            X.1at r11 = r7.get()     // Catch:{ all -> 0x00fd }
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00de }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x00de }
            java.lang.String r6 = "SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id = ?"
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch:{ all -> 0x00de }
            long r0 = r13.A0x     // Catch:{ all -> 0x00de }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00de }
            r5[r10] = r0     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "GET_MESSAGE_RECEIPTS_USER_SQL"
            android.database.Cursor r6 = r7.A0A(r6, r0, r5)     // Catch:{ all -> 0x00de }
            java.lang.String r0 = "receipt_user_jid_row_id"
            int r7 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00d2 }
        L_0x00a1:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00bd
            X.1DL r5 = r4.A00     // Catch:{ all -> 0x00d2 }
            long r0 = r6.getLong(r7)     // Catch:{ all -> 0x00d2 }
            com.whatsapp.jid.Jid r1 = r5.A0B(r0)     // Catch:{ all -> 0x00d2 }
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x00d2 }
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r1)     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00a1
            r3.add(r0)     // Catch:{ all -> 0x00d2 }
            goto L_0x00a1
        L_0x00bd:
            r6.close()     // Catch:{ all -> 0x00de }
            r11.close()     // Catch:{ all -> 0x00fd }
            int r0 = r3.size()     // Catch:{ all -> 0x00fd }
            if (r0 <= 0) goto L_0x00e8
        L_0x00c9:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x00fd }
            r0.<init>(r3)     // Catch:{ all -> 0x00fd }
            r13.A0m(r0)     // Catch:{ all -> 0x00fd }
            goto L_0x00e8
        L_0x00d2:
            r1 = move-exception
            if (r6 == 0) goto L_0x00dd
            r6.close()     // Catch:{ all -> 0x00d9 }
            goto L_0x00dd
        L_0x00d9:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00de }
        L_0x00dd:
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00e3 }
            goto L_0x00e7
        L_0x00e3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00fd }
        L_0x00e7:
            throw r1     // Catch:{ all -> 0x00fd }
        L_0x00e8:
            if (r14 == 0) goto L_0x00f9
            java.lang.Class<X.24t> r1 = X.C447824t.class
            X.20F r0 = new X.20F     // Catch:{ all -> 0x00fd }
            r0.<init>(r1)     // Catch:{ all -> 0x00fd }
            java.lang.String r1 = "onProcessorExecuted"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ all -> 0x00fd }
            r0.<init>(r1)     // Catch:{ all -> 0x00fd }
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00f9:
            r2.close()
            return
        L_0x00fd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ff }
        L_0x00ff:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C447824t.CCZ(X.206, X.2Rn):void");
    }
}
