package X;

/* renamed from: X.9nb  reason: invalid class name and case insensitive filesystem */
public final class C192009nb {
    public final AnonymousClass2Dj A00;

    public C192009nb(AnonymousClass2Dj r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0032, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(java.lang.String r6, java.lang.String r7, long r8) {
        /*
            r5 = this;
            r0 = 4
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>(r0)
            java.lang.String r0 = "account_name"
            r4.put(r0, r6)
            java.lang.String r0 = "jid_user"
            r4.put(r0, r7)
            java.lang.String r0 = "update_time"
            X.C17880vN.A19(r4, r0, r8)
            X.2Dj r0 = r5.A00
            X.1au r3 = r0.A06()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x002c }
            java.lang.String r1 = "backups"
            java.lang.String r0 = "BACKUP_STORE_INSERT_BACKUP"
            long r0 = r2.A05(r1, r0, r4)     // Catch:{ all -> 0x002c }
            r3.close()
            return r0
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192009nb.A00(java.lang.String, java.lang.String, long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C194799sJ A01(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r1 = 1
            X.2Dj r0 = r11.A00
            X.1at r2 = r0.get()
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0058 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0058 }
            java.lang.String r3 = "SELECT\n             id,\n             account_name,\n             jid_user,\n             update_time\n           FROM backups\n           WHERE\n             account_name = ?\n             AND jid_user = ?"
            r0 = 2
            java.lang.String[] r1 = X.C17880vN.A1b(r12, r13, r0, r1)     // Catch:{ all -> 0x0058 }
            java.lang.String r0 = "GET_BACKUP_BY_ACCOUNT_AND_JID"
            android.database.Cursor r3 = r4.A0A(r3, r0, r1)     // Catch:{ all -> 0x0058 }
            boolean r1 = r3.moveToNext()     // Catch:{ all -> 0x0051 }
            r0 = 0
            if (r1 != 0) goto L_0x0027
            r3.close()     // Catch:{ all -> 0x0058 }
            r2.close()
            return r0
        L_0x0027:
            java.lang.String r0 = "id"
            long r5 = X.C17890vO.A06(r3, r0)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "account_name"
            java.lang.String r7 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x0051 }
            X.C18070vi.A0X(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "jid_user"
            java.lang.String r10 = X.C17890vO.A0S(r3, r0)     // Catch:{ all -> 0x0051 }
            X.C18070vi.A0X(r10)     // Catch:{ all -> 0x0051 }
            java.lang.String r0 = "update_time"
            long r8 = X.C17890vO.A06(r3, r0)     // Catch:{ all -> 0x0051 }
            X.9sJ r4 = new X.9sJ     // Catch:{ all -> 0x0051 }
            r4.<init>(r5, r7, r8, r10)     // Catch:{ all -> 0x0051 }
            r3.close()     // Catch:{ all -> 0x0058 }
            r2.close()
            return r4
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0058 }
            throw r0     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005a }
        L_0x005a:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C192009nb.A01(java.lang.String, java.lang.String):X.9sJ");
    }
}
