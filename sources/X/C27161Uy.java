package X;

/* renamed from: X.1Uy  reason: invalid class name and case insensitive filesystem */
public final class C27161Uy {
    public final AnonymousClass1DL A00;
    public final C24811Lt A01;

    public C27161Uy(AnonymousClass1DL r2, C24811Lt r3) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Integer A00(com.whatsapp.jid.GroupJid r8) {
        /*
            r7 = this;
            r6 = 0
            X.C18070vi.A0d(r8, r6)
            X.1Lt r0 = r7.A01
            X.1at r3 = r0.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0049 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r4 = "SELECT member_count FROM group_membership_count WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            X.1DL r0 = r7.A00     // Catch:{ all -> 0x0049 }
            long r0 = r0.A09(r8)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0049 }
            r2[r6] = r0     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "GET_GROUP_MEMBER_COUNT"
            android.database.Cursor r2 = r5.A0A(r4, r0, r2)     // Catch:{ all -> 0x0049 }
            boolean r1 = r2.moveToNext()     // Catch:{ all -> 0x0042 }
            r0 = 0
            if (r1 == 0) goto L_0x003b
            java.lang.String r0 = "member_count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0042 }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x0042 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0042 }
        L_0x003b:
            r2.close()     // Catch:{ all -> 0x0049 }
            r3.close()
            return r0
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27161Uy.A00(com.whatsapp.jid.GroupJid):java.lang.Integer");
    }
}
