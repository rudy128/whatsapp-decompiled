package X;

/* renamed from: X.6lW  reason: invalid class name and case insensitive filesystem */
public final class C131696lW {
    public final AnonymousClass00H A00;

    public C131696lW(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0095, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int A00(java.lang.String r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            r1 = 0
            X.00H r0 = r7.A00     // Catch:{ all -> 0x00a4 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00a4 }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ all -> 0x00a4 }
            X.1au r4 = r0.A06()     // Catch:{ all -> 0x00a4 }
            X.1xA r5 = r4.BD0()     // Catch:{ all -> 0x009d }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0096 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x0096 }
            java.lang.String r2 = "SELECT pack_order FROM sticker_pack_order WHERE sticker_pack_id = ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r8, r1)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "getOrAddStickerPackOrder/QUERY_STICKER_PACK_ORDER"
            android.database.Cursor r2 = r6.A0A(r2, r0, r1)     // Catch:{ all -> 0x0096 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x008f }
            r3 = 0
            if (r0 <= 0) goto L_0x0041
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "pack_order"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x008f }
            r2.close()     // Catch:{ all -> 0x0096 }
            r5.close()     // Catch:{ all -> 0x009d }
            r4.close()     // Catch:{ all -> 0x00a4 }
            monitor-exit(r7)
            return r0
        L_0x0041:
            r2.close()     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "SELECT MAX(pack_order) as max_order FROM sticker_pack_order"
            java.lang.String r0 = "GET_MAX_ORDER_STICKER_PACK"
            android.database.Cursor r2 = r6.A0A(r1, r0, r3)     // Catch:{ all -> 0x0096 }
            int r0 = r2.getCount()     // Catch:{ all -> 0x008f }
            if (r0 <= 0) goto L_0x005f
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x005f
            java.lang.String r0 = "max_order"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x008f }
            goto L_0x006a
        L_0x005f:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "StickerPackOderDBTableHelper/getOrAddStickerPackOrder/max order is not available for sticker pack: "
            X.C17900vP.A0e(r0, r8, r1)     // Catch:{ all -> 0x008f }
            r0 = 1000(0x3e8, float:1.401E-42)
        L_0x006a:
            r2.close()     // Catch:{ all -> 0x0096 }
            int r3 = r0 + 1
            android.content.ContentValues r2 = X.C17880vN.A08()     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "sticker_pack_id"
            r2.put(r0, r8)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = "pack_order"
            X.C17880vN.A18(r2, r0, r3)     // Catch:{ all -> 0x0096 }
            java.lang.String r1 = "sticker_pack_order"
            java.lang.String r0 = "getOrAddStickerPackOrder/INSERT_STICKER_PACK_ORDER"
            r6.A06(r1, r0, r2)     // Catch:{ all -> 0x0096 }
            r5.A00()     // Catch:{ all -> 0x0096 }
            r5.close()     // Catch:{ all -> 0x009d }
            r4.close()     // Catch:{ all -> 0x00a4 }
            monitor-exit(r7)
            return r3
        L_0x008f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x009d }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009f }
        L_0x009f:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131696lW.A00(java.lang.String):int");
    }
}
