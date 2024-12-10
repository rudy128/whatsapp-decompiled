package X;

/* renamed from: X.1Tl  reason: invalid class name and case insensitive filesystem */
public final class C26781Tl {
    public final C26771Tk A00;

    public C26781Tl(C26771Tk r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            java.lang.String r1 = X.C63942tw.A04(r7)
            if (r1 == 0) goto L_0x004b
            X.1Tk r0 = r6.A00
            java.lang.String r5 = "ContactsCreatedWithinWaStore/addContactCreatedWithinWaId"
            X.1Lt r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
            X.1au r4 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
            r0 = 1
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch:{ all -> 0x002f }
            r3.<init>(r0)     // Catch:{ all -> 0x002f }
            java.lang.String r0 = "_id"
            r3.put(r0, r1)     // Catch:{ all -> 0x002f }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002f }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "wa_contacts_created_within_wa"
            r0 = 4
            r2.A09(r1, r5, r3, r0)     // Catch:{ all -> 0x002f }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
            return
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
        L_0x0036:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "ContactsCreatedWithinWaStore/Failed to insert "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26781Tl.A00(java.lang.String):void");
    }
}
