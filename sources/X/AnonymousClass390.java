package X;

/* renamed from: X.390  reason: invalid class name */
public final class AnonymousClass390 implements C447124m, C447224n, C447324o, C436720l {
    public final AnonymousClass00H A00;

    public AnonymousClass390(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BL9(X.AnonymousClass206 r9) {
        /*
            r8 = this;
            r1 = 0
            X.C18070vi.A0d(r9, r1)
            X.00H r0 = r8.A00
            java.lang.Object r0 = r0.get()
            X.2iC r0 = (X.C56892iC) r0
            X.24J r9 = (X.AnonymousClass24J) r9
            X.C18070vi.A0d(r9, r1)
            java.lang.String[] r3 = X.AnonymousClass206.A09(r9)
            X.1Cd r0 = r0.A00
            X.1at r6 = r0.get()
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0060 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "SELECT message_row_id, placeholder_type FROM message_fixed_content_placeholder WHERE message_row_id = ?"
            java.lang.String r0 = "GET_PLACEHOLDER_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r7 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0060 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0052
            java.lang.String r0 = "placeholder_type"
            int r5 = X.C17890vO.A01(r7, r0)     // Catch:{ all -> 0x0059 }
            r0 = 2
            java.lang.Integer[] r4 = X.AnonymousClass00R.A00(r0)     // Catch:{ all -> 0x0059 }
            int r3 = r4.length     // Catch:{ all -> 0x0059 }
            r2 = 0
        L_0x003b:
            if (r2 >= r3) goto L_0x004f
            r1 = r4[r2]     // Catch:{ all -> 0x0059 }
            int r0 = r1.intValue()     // Catch:{ all -> 0x0059 }
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0049:
            r0 = 1
        L_0x004a:
            if (r0 == r5) goto L_0x0050
            int r2 = r2 + 1
            goto L_0x003b
        L_0x004f:
            r1 = 0
        L_0x0050:
            r9.A00 = r1     // Catch:{ all -> 0x0059 }
        L_0x0052:
            r7.close()     // Catch:{ all -> 0x0060 }
            r6.close()
            return
        L_0x0059:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005b }
        L_0x005b:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass390.BL9(X.206):void");
    }

    public void BdY(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C56892iC) this.A00.get()).A00((AnonymousClass24J) r2);
    }

    public void CQL(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        ((C56892iC) this.A00.get()).A00((AnonymousClass24J) r2);
    }
}
