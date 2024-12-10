package X;

/* renamed from: X.2hp  reason: invalid class name and case insensitive filesystem */
public final class C56662hp {
    public final AnonymousClass11C A00;

    public C56662hp(AnonymousClass11C r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r12, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A00() {
        /*
            r13 = this;
            java.util.HashMap r3 = X.C17880vN.A11()
            android.net.Uri r0 = android.provider.ContactsContract.Data.CONTENT_URI
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri r8 = r0.build()
            X.11C r0 = r13.A00     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            X.11B r7 = r0.A0O()     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            java.lang.String r2 = "mimetype"
            java.lang.String r4 = "raw_contact_id"
            r12 = 0
            if (r7 == 0) goto L_0x0048
            r5 = 2
            java.lang.String[] r9 = new java.lang.String[r5]     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            r6 = 0
            r9[r6] = r4     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            r1 = 1
            r9[r1] = r2     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            java.lang.String r10 = "mimetype in (?,?,?,?,?)"
            r0 = 5
            java.lang.String[] r11 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            java.lang.String r0 = "vnd.android.cursor.item/name"
            r11[r6] = r0     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            r11[r1] = r0     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            r11[r5] = r0     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            r0 = 3
            r11[r0] = r1     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            java.lang.String r1 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            r0 = 4
            r11[r0] = r1     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            android.database.Cursor r12 = r7.A03(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
        L_0x0048:
            if (r12 != 0) goto L_0x0050
            java.lang.String r0 = "AndroidContactsMimeTypesHelper/failed/null hasDataUriCursorRow cursor"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d3 }
            return r3
        L_0x0050:
            int r5 = r12.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x00d3 }
            int r4 = r12.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x00d3 }
        L_0x0058:
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00cf
            long r0 = r12.getLong(r5)     // Catch:{ all -> 0x00d3 }
            java.lang.String r2 = r12.getString(r4)     // Catch:{ all -> 0x00d3 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x00d3 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d3 }
            boolean r0 = r3.containsKey(r1)     // Catch:{ all -> 0x00d3 }
            if (r0 != 0) goto L_0x007a
            java.util.HashSet r0 = X.C17880vN.A12()     // Catch:{ all -> 0x00d3 }
            r3.put(r1, r0)     // Catch:{ all -> 0x00d3 }
        L_0x007a:
            java.lang.Object r1 = r3.get(r1)     // Catch:{ all -> 0x00d3 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x00d3 }
            if (r1 == 0) goto L_0x0058
            java.lang.String r0 = "vnd.android.cursor.item/name"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x008d
            r0 = 0
            goto L_0x00b8
        L_0x008d:
            java.lang.String r0 = "vnd.android.cursor.item/phone_v2"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x0098
            r0 = 1
            goto L_0x00b8
        L_0x0098:
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.profile"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00a3
            r0 = 2
            goto L_0x00b8
        L_0x00a3:
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.voip.call"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00ae
            r0 = 3
            goto L_0x00b8
        L_0x00ae:
            java.lang.String r0 = "vnd.android.cursor.item/vnd.com.whatsapp.video.call"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x00d3 }
            if (r0 == 0) goto L_0x00c0
            r0 = 4
        L_0x00b8:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x00d3 }
            r1.add(r0)     // Catch:{ all -> 0x00d3 }
            goto L_0x0058
        L_0x00c0:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00d3 }
            java.lang.String r0 = "no code found for "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x00d3 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00d3 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00cf:
            r12.close()     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            return r3
        L_0x00d3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            X.CDX.A00(r12, r1)     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
            throw r0     // Catch:{ Exception -> 0x00ef, OutOfMemoryError -> 0x00da }
        L_0x00da:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "AndroidContactsMimeTypesHelper/too-many-rows/size/"
            r1.append(r0)
            int r0 = r3.size()
            r1.append(r0)
            X.C17890vO.A0w(r1)
            throw r2
        L_0x00ef:
            r1 = move-exception
            java.lang.String r0 = "AndroidContactsMimeTypesHelper/failed/null hasDataUriCursorRow error"
            com.whatsapp.util.Log.e(r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56662hp.A00():java.util.HashMap");
    }
}
