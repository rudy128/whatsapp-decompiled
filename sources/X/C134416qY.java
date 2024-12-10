package X;

/* renamed from: X.6qY  reason: invalid class name and case insensitive filesystem */
public final class C134416qY {
    public final AnonymousClass00H A00;

    public C134416qY(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0022, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.lang.String r7) {
        /*
            r6 = this;
            r1 = 0
            X.C18070vi.A0d(r7, r1)
            X.00H r0 = r6.A00
            X.1au r5 = X.C108985cd.A0S(r0)
            java.lang.String r4 = "pack_id = ?"
            java.lang.String[] r3 = X.C17880vN.A1a(r7, r1)     // Catch:{ all -> 0x0020 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0020 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0020 }
            java.lang.String r1 = "unseen_sticker_packs"
            java.lang.String r0 = "markPackAsSeen/DELETE_UNSEEN_STICKER_PACK"
            r2.A04(r1, r4, r0, r3)     // Catch:{ all -> 0x0020 }
            r5.close()
            return
        L_0x0020:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0022 }
        L_0x0022:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134416qY.A01(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.00H r0 = r6.A00
            X.1au r5 = X.C108985cd.A0S(r0)
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x0024 }
            java.lang.String r0 = "pack_id"
            r4.put(r0, r7)     // Catch:{ all -> 0x0024 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0024 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = "unseen_sticker_packs"
            java.lang.String r1 = "markPackAsUnseen/INSERT_UNSEEN_STICKER_PACK"
            r0 = 5
            r3.A09(r2, r1, r4, r0)     // Catch:{ all -> 0x0024 }
            r5.close()
            return
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134416qY.A02(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashSet A00() {
        /*
            r5 = this;
            java.util.LinkedHashSet r4 = X.C17880vN.A14()
            X.00H r0 = r5.A00
            X.1at r3 = X.C108975cc.A0F(r0)
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003c }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x003c }
            java.lang.String r1 = "SELECT pack_id FROM unseen_sticker_packs"
            java.lang.String r0 = "getUnseenStickerPackIds/QUERY_UNSEEN_STICKER_PACK"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "pack_id"
            int r1 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0035 }
        L_0x001d:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r2.getString(r1)     // Catch:{ all -> 0x0035 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x0035 }
            r4.add(r0)     // Catch:{ all -> 0x0035 }
            goto L_0x001d
        L_0x002e:
            r2.close()     // Catch:{ all -> 0x003c }
            r3.close()
            return r4
        L_0x0035:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C134416qY.A00():java.util.LinkedHashSet");
    }
}
