package X;

/* renamed from: X.1Qu  reason: invalid class name and case insensitive filesystem */
public final class C26091Qu extends C26081Qt {
    public final AnonymousClass11S A00;
    public final AnonymousClass00H A01;
    public final C24621La A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26091Qu(AnonymousClass190 r8, AnonymousClass11S r9, AnonymousClass1DL r10, C22611Cn r11, AnonymousClass1Cd r12, C24621La r13, C26071Qs r14, AnonymousClass00H r15) {
        super(r8, r10, r11, r12, r14, 250);
        C18070vi.A0d(r10, 1);
        C18070vi.A0d(r8, 2);
        C18070vi.A0d(r12, 3);
        C18070vi.A0d(r14, 4);
        C18070vi.A0d(r11, 5);
        C18070vi.A0d(r9, 6);
        C18070vi.A0d(r15, 7);
        C18070vi.A0d(r13, 8);
        this.A00 = r9;
        this.A01 = r15;
        this.A02 = r13;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.2S4, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C56852i8 A00(X.C26091Qu r10, X.AnonymousClass205 r11, long r12) {
        /*
            X.2i8 r3 = new X.2i8
            r3.<init>()
            r1 = -1
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00a2
            r0 = 1
            java.lang.String[] r5 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r12)
            r5[r1] = r0
            X.1Cd r0 = r10.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
            X.1at r4 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0092 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0092 }
            java.lang.String r1 = "SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?"
            java.lang.String r0 = "MessageReceiptDeviceStore/`GET_DEVICE_RECEIPTS_SQL`"
            android.database.Cursor r5 = r2.A0A(r1, r0, r5)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "receipt_device_timestamp"
            int r7 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r6 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x008b }
        L_0x0034:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x008b }
            if (r0 == 0) goto L_0x0084
            long r1 = r5.getLong(r6)     // Catch:{ all -> 0x008b }
            X.1DL r9 = r10.A02     // Catch:{ all -> 0x008b }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r0 = com.whatsapp.jid.DeviceJid.class
            com.whatsapp.jid.Jid r8 = r9.A0E(r0, r1)     // Catch:{ all -> 0x008b }
            com.whatsapp.jid.DeviceJid r8 = (com.whatsapp.jid.DeviceJid) r8     // Catch:{ all -> 0x008b }
            if (r8 == 0) goto L_0x005b
            long r0 = r5.getLong(r7)     // Catch:{ all -> 0x008b }
            X.2S4 r2 = new X.2S4     // Catch:{ all -> 0x008b }
            r2.<init>()     // Catch:{ all -> 0x008b }
            r2.A00 = r0     // Catch:{ all -> 0x008b }
            java.util.concurrent.ConcurrentHashMap r0 = r3.A00     // Catch:{ all -> 0x008b }
            r0.put(r8, r2)     // Catch:{ all -> 0x008b }
            goto L_0x0034
        L_0x005b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x008b }
            r8.<init>()     // Catch:{ all -> 0x008b }
            java.lang.String r0 = "receiptsmessagestore/getmessagedevicereceipts: got a null deviceJid for key="
            r8.append(r0)     // Catch:{ all -> 0x008b }
            r8.append(r11)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = ", deviceJidRowId="
            r8.append(r0)     // Catch:{ all -> 0x008b }
            r8.append(r1)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = ", jid="
            r8.append(r0)     // Catch:{ all -> 0x008b }
            com.whatsapp.jid.Jid r0 = r9.A0B(r1)     // Catch:{ all -> 0x008b }
            r8.append(r0)     // Catch:{ all -> 0x008b }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x008b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x008b }
            goto L_0x0034
        L_0x0084:
            r5.close()     // Catch:{ all -> 0x0092 }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
            return r3
        L_0x008b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.1Cn r0 = r10.A03
            r0.A03()
        L_0x00a2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26091Qu.A00(X.1Qu, X.205, long):X.2i8");
    }
}
