package X;

/* renamed from: X.1WN  reason: invalid class name */
public final class AnonymousClass1WN {
    public final AnonymousClass1Cd A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public AnonymousClass1WN(AnonymousClass1Cd r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass206 r10) {
        /*
            r9 = this;
            r6 = r10
            X.215 r6 = (X.AnonymousClass215) r6
            long r4 = r10.A0x
            X.1Cd r0 = r9.A00
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004c }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x004c }
            java.lang.String r7 = "SELECT state FROM message_view_once_media WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004c }
            java.lang.String r1 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x004c }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "GET_VIEW_ONCE_STATE_BY_MESSAGE_ROW_ID_SQL"
            android.database.Cursor r2 = r8.A0A(r7, r0, r2)     // Catch:{ all -> 0x004c }
            java.lang.String r0 = "state"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0045 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x003a
            int r0 = r2.getInt(r1)     // Catch:{ all -> 0x0045 }
            r2.close()     // Catch:{ all -> 0x004c }
            r3.close()
            goto L_0x0041
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x004c }
            r3.close()
            r0 = 2
        L_0x0041:
            r6.CLQ(r0)
            return
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x004c }
            throw r0     // Catch:{ all -> 0x004c }
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WN.A01(X.206):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass1WN r7, int r8, long r9) {
        /*
            X.1Cd r0 = r7.A00     // Catch:{ Exception -> 0x0038 }
            X.1au r2 = r0.A05()     // Catch:{ Exception -> 0x0038 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0031 }
            r4.<init>()     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = "state"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0031 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0031 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0031 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0031 }
            java.lang.String r5 = "message_view_once_media"
            java.lang.String r6 = "message_row_id = ?"
            r0 = 1
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0031 }
            r0 = 0
            r8[r0] = r1     // Catch:{ all -> 0x0031 }
            java.lang.String r7 = "UPDATE_VIEW_ONCE_SQL"
            r3.A02(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0031 }
            r2.close()     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ Exception -> 0x0038 }
            throw r0     // Catch:{ Exception -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            java.lang.String r0 = "ViewOnceMessageStore/updateInsert failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WN.A00(X.1WN, int, long):void");
    }

    public final void A03(AnonymousClass206 r4) {
        if (r4 instanceof AnonymousClass215) {
            int A0D = r4.A0D();
            if (A0D == 9 || A0D == 10 || A0D == 8) {
                AnonymousClass215 r0 = (AnonymousClass215) r4;
                r0.CLQ(1);
                A00(this, r0.Bbc(), r4.A0x);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.AnonymousClass206 r8) {
        /*
            r7 = this;
            X.C17960vV.A01()
            boolean r0 = r8 instanceof X.AnonymousClass215
            X.C17960vV.A0D(r0)
            long r2 = r8.A0x
            X.215 r8 = (X.AnonymousClass215) r8
            int r6 = r8.Bbc()
            X.1Cd r0 = r7.A00     // Catch:{ Exception -> 0x0046 }
            X.1au r5 = r0.A05()     // Catch:{ Exception -> 0x0046 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x003f }
            r4.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x003f }
            r4.put(r1, r0)     // Catch:{ all -> 0x003f }
            java.lang.String r1 = "state"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x003f }
            r4.put(r1, r0)     // Catch:{ all -> 0x003f }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003f }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "message_view_once_media"
            java.lang.String r1 = "INSERT_VIEW_ONCE_SQL"
            r0 = 5
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x003f }
            r5.close()     // Catch:{ Exception -> 0x0046 }
            return
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ Exception -> 0x0046 }
            throw r0     // Catch:{ Exception -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            java.lang.String r0 = "ViewOnceMessageStore/updateInsert failed"
            com.whatsapp.util.Log.e(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1WN.A02(X.206):void");
    }
}
