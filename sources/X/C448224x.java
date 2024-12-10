package X;

/* renamed from: X.24x  reason: invalid class name and case insensitive filesystem */
public final class C448224x implements C447624r {
    public final AnonymousClass00H A00;

    public C448224x(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a8, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ab, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r9, X.C49702Rn r10) {
        /*
            r8 = this;
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            r0 = 256(0x100, double:1.265E-321)
            boolean r0 = r9.A11(r0)
            if (r0 == 0) goto L_0x00ac
            X.00H r0 = r8.A00
            java.lang.Object r0 = r0.get()
            X.1Qz r0 = (X.C26141Qz) r0
            r7 = 0
            X.1Cd r0 = r0.A04
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a5 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00a5 }
            java.lang.String r5 = "SELECT duration, expire_timestamp, keep_in_chat, ephemeral_trigger, ephemeral_initiated_by_me FROM message_ephemeral WHERE message_row_id = ?"
            r4 = 1
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ all -> 0x00a5 }
            long r0 = r9.A0x     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00a5 }
            r3[r7] = r0     // Catch:{ all -> 0x00a5 }
            java.lang.String r0 = "GET_EPHEMERAL_MESSAGE_FOR_ROW_ID_SQL"
            android.database.Cursor r3 = r6.A0A(r5, r0, r3)     // Catch:{ all -> 0x00a5 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x009e }
            if (r0 == 0) goto L_0x0087
            java.lang.String r0 = "duration"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009e }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x009e }
            r9.A0Z(r0)     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "expire_timestamp"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009e }
            long r0 = r3.getLong(r0)     // Catch:{ all -> 0x009e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x009e }
            r9.A0U = r0     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "keep_in_chat"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009e }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x009e }
            r9.A07 = r0     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "ephemeral_trigger"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009e }
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x009e }
            r9.A04 = r0     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "ephemeral_initiated_by_me"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009e }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x0087
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x009e }
            if (r0 != 0) goto L_0x0081
            r4 = 0
        L_0x0081:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x009e }
            r9.A0Q = r0     // Catch:{ all -> 0x009e }
        L_0x0087:
            r3.close()     // Catch:{ all -> 0x00a5 }
            r2.close()
            if (r10 == 0) goto L_0x00ac
            java.lang.Class<X.24x> r1 = X.C448224x.class
            X.20F r0 = new X.20F
            r0.<init>(r1)
            java.lang.String r1 = "onProcessorExecuted"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x009e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a0 }
        L_0x00a0:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C448224x.CCZ(X.206, X.2Rn):void");
    }
}
