package X;

/* renamed from: X.2lK  reason: invalid class name and case insensitive filesystem */
public final class C58832lK {
    public final C24811Lt A00;

    public C58832lK(C24811Lt r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.lang.String r7) {
        /*
            r6 = this;
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            r5 = 0
            X.1Lt r0 = r6.A00     // Catch:{ all -> 0x003f }
            X.1at r4 = r0.get()     // Catch:{ all -> 0x003f }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0038 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "SELECT prop_value FROM wa_newsletter_props WHERE prop_name = ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r7, r1)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "WADB_SELECT_NEWSLETTER_PROPS_VALUE_BY_NAME"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0038 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = "prop_value"
            java.lang.String r0 = X.C17890vO.A0S(r2, r0)     // Catch:{ all -> 0x0031 }
            goto L_0x002a
        L_0x0029:
            r0 = r5
        L_0x002a:
            r2.close()     // Catch:{ all -> 0x0038 }
            r4.close()     // Catch:{ all -> 0x003f }
            return r0
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x003f }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58832lK.A00(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0027, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r7) {
        /*
            r6 = this;
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            X.1Lt r0 = r6.A00
            X.1au r5 = r0.A06()
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0021 }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x0021 }
            java.lang.String r3 = "wa_newsletter_props"
            java.lang.String r2 = "prop_name = ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r7, r1)     // Catch:{ all -> 0x0021 }
            java.lang.String r0 = "WADB_DELETE_NEWSLETTER_PROP"
            r4.A04(r3, r2, r0, r1)     // Catch:{ all -> 0x0021 }
            r5.close()
            return
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58832lK.A01(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        X.CDX.A00(r3, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            r0 = 0
            X.C18070vi.A0d(r6, r0)
            android.content.ContentValues r4 = X.C17890vO.A08()
            java.lang.String r0 = "prop_name"
            r4.put(r0, r6)
            java.lang.String r0 = "prop_value"
            r4.put(r0, r7)
            X.1Lt r0 = r5.A00
            X.1au r3 = r0.A06()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0029 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "wa_newsletter_props"
            java.lang.String r0 = "WADB_UPSERT_NEWSLETTER_PROPS_STRING"
            r2.A08(r1, r0, r4)     // Catch:{ all -> 0x0029 }
            r3.close()
            return
        L_0x0029:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C58832lK.A02(java.lang.String, java.lang.String):void");
    }
}
