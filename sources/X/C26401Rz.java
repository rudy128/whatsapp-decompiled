package X;

/* renamed from: X.1Rz  reason: invalid class name and case insensitive filesystem */
public final class C26401Rz {
    public final C25551Oq A00;

    public C26401Rz(C25551Oq r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashSet A00() {
        /*
            r6 = this;
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            X.1Oq r0 = r6.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "SELECT DISTINCT collection_name FROM missing_keys"
            java.lang.String r1 = "SyncdMissingKeysTable.COLLECTIONS_WAITING_FOR_KEY"
            r0 = 0
            android.database.Cursor r2 = r3.A0A(r2, r1, r0)     // Catch:{ all -> 0x003e }
        L_0x0019:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "collection_name"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0037 }
            java.lang.String r0 = r2.getString(r0)     // Catch:{ all -> 0x0037 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0037 }
            r5.add(r0)     // Catch:{ all -> 0x0037 }
            goto L_0x0019
        L_0x0030:
            r2.close()     // Catch:{ all -> 0x003e }
            r4.close()
            return r5
        L_0x0037:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26401Rz.A00():java.util.LinkedHashSet");
    }
}
