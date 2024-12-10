package X;

/* renamed from: X.257  reason: invalid class name */
public final class AnonymousClass257 implements C447624r {
    public final AnonymousClass00H A00;

    public AnonymousClass257(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v25, types: [X.36a, java.lang.Object, X.229] */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b7, code lost:
        if (java.lang.Long.valueOf(r1) != null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r11, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0111, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0112, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CCZ(X.AnonymousClass206 r20, X.C49702Rn r21) {
        /*
            r19 = this;
            r0 = 0
            r14 = r20
            X.C18070vi.A0d(r14, r0)
            boolean r0 = r14.A0w()
            if (r0 == 0) goto L_0x012a
            r0 = r19
            X.00H r0 = r0.A00
            java.lang.Object r13 = r0.get()
            X.1hE r13 = (X.C32461hE) r13
            r2 = 0
            boolean r0 = r14.A0w()
            if (r0 == 0) goto L_0x0119
            X.1Cd r0 = r13.A02
            X.1at r12 = r0.get()
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x010f }
            long r0 = r14.A0x     // Catch:{ all -> 0x010f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x010f }
            r3[r2] = r0     // Catch:{ all -> 0x010f }
            r0 = r12
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x010f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x010f }
            java.lang.String r1 = "SELECT comments_count, reaction_from_me, reactions_from_me_ts, extra_newsletter_tables, extra_table_last_update_ts, view_count, is_autodelete_eligible, is_wamo_sub  FROM newsletter_message WHERE message_row_id = ?"
            java.lang.String r0 = "GET_NEWSLETTER_MESSAGE_INFO"
            android.database.Cursor r11 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x010f }
            X.C18070vi.A0b(r11)     // Catch:{ all -> 0x0108 }
            boolean r0 = r11.moveToFirst()     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x0104
            java.lang.String r0 = "comments_count"
            int r6 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "reaction_from_me"
            int r2 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "reactions_from_me_ts"
            int r3 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "extra_newsletter_tables"
            int r4 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "extra_table_last_update_ts"
            int r1 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r0 = "view_count"
            int r0 = r11.getColumnIndex(r0)     // Catch:{ all -> 0x0108 }
            java.lang.String r5 = "is_autodelete_eligible"
            int r9 = r11.getColumnIndex(r5)     // Catch:{ all -> 0x0108 }
            java.lang.String r5 = "is_wamo_sub"
            int r18 = r11.getColumnIndex(r5)     // Catch:{ all -> 0x0108 }
            boolean r5 = r11.isNull(r6)     // Catch:{ all -> 0x0108 }
            r10 = 0
            if (r5 == 0) goto L_0x007d
            goto L_0x0086
        L_0x007d:
            long r5 = r11.getLong(r6)     // Catch:{ all -> 0x0108 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0108 }
            goto L_0x0087
        L_0x0086:
            r5 = r10
        L_0x0087:
            r7 = 0
            if (r5 == 0) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r5 = 0
            goto L_0x0093
        L_0x008f:
            long r5 = r5.longValue()     // Catch:{ all -> 0x0108 }
        L_0x0093:
            java.lang.String r17 = r11.getString(r2)     // Catch:{ all -> 0x0108 }
            boolean r2 = r11.isNull(r3)     // Catch:{ all -> 0x0108 }
            if (r2 != 0) goto L_0x00a5
            long r2 = r11.getLong(r3)     // Catch:{ all -> 0x0108 }
            java.lang.Long r10 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0108 }
        L_0x00a5:
            long r3 = r11.getLong(r4)     // Catch:{ all -> 0x0108 }
            boolean r2 = r11.isNull(r1)     // Catch:{ all -> 0x0108 }
            if (r2 != 0) goto L_0x00ca
            long r1 = r11.getLong(r1)     // Catch:{ all -> 0x0108 }
            java.lang.Long r15 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0108 }
            if (r15 == 0) goto L_0x00ca
        L_0x00b9:
            boolean r15 = r11.isNull(r0)     // Catch:{ all -> 0x0108 }
            if (r15 != 0) goto L_0x00ce
            long r15 = r11.getLong(r0)     // Catch:{ all -> 0x0108 }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0108 }
            if (r0 == 0) goto L_0x00ce
            goto L_0x00cd
        L_0x00ca:
            r1 = 0
            goto L_0x00b9
        L_0x00cd:
            r7 = r15
        L_0x00ce:
            boolean r15 = X.AnonymousClass24X.A01(r11, r9)     // Catch:{ all -> 0x0108 }
            r0 = r18
            boolean r9 = X.AnonymousClass24X.A01(r11, r0)     // Catch:{ all -> 0x0108 }
            X.36a r0 = new X.36a     // Catch:{ all -> 0x0108 }
            r0.<init>()     // Catch:{ all -> 0x0108 }
            r0.A00 = r5     // Catch:{ all -> 0x0108 }
            r5 = r17
            r0.A05 = r5     // Catch:{ all -> 0x0108 }
            r0.A04 = r10     // Catch:{ all -> 0x0108 }
            r0.A01 = r3     // Catch:{ all -> 0x0108 }
            r0.A02 = r1     // Catch:{ all -> 0x0108 }
            r0.A03 = r7     // Catch:{ all -> 0x0108 }
            r0.A06 = r15     // Catch:{ all -> 0x0108 }
            r0.A07 = r9     // Catch:{ all -> 0x0108 }
            java.lang.Class<X.36a> r1 = X.C691336a.class
            X.25F r1 = r14.A0M(r1)     // Catch:{ all -> 0x0108 }
            r1.A02(r0)     // Catch:{ all -> 0x0108 }
            X.10s r2 = r13.A03     // Catch:{ all -> 0x0108 }
            r1 = 14
            X.AkP r0 = new X.AkP     // Catch:{ all -> 0x0108 }
            r0.<init>(r13, r14, r1)     // Catch:{ all -> 0x0108 }
            r2.execute(r0)     // Catch:{ all -> 0x0108 }
        L_0x0104:
            r11.close()     // Catch:{ all -> 0x010f }
            goto L_0x0116
        L_0x0108:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x010a }
        L_0x010a:
            r0 = move-exception
            X.CDX.A00(r11, r1)     // Catch:{ all -> 0x010f }
            throw r0     // Catch:{ all -> 0x010f }
        L_0x010f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0111 }
        L_0x0111:
            r0 = move-exception
            X.CDX.A00(r12, r1)
            throw r0
        L_0x0116:
            r12.close()
        L_0x0119:
            if (r21 == 0) goto L_0x012a
            java.lang.Class<X.257> r1 = X.AnonymousClass257.class
            X.20F r0 = new X.20F
            r0.<init>(r1)
            java.lang.String r1 = "onProcessorExecuted"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x012a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass257.CCZ(X.206, X.2Rn):void");
    }
}
