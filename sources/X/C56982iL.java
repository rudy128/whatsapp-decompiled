package X;

/* renamed from: X.2iL  reason: invalid class name and case insensitive filesystem */
public final class C56982iL {
    public final AnonymousClass1Cd A00;

    public C56982iL(AnonymousClass1Cd r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cd, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C441522i r11) {
        /*
            r10 = this;
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            X.1Cd r0 = r10.A00
            X.1au r2 = r0.A05()
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x00ca }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00c3 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x00c3 }
            java.lang.String r7 = "message_sticker_pack"
            long r0 = r11.A0x     // Catch:{ all -> 0x00c3 }
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x00c3 }
            java.lang.String r4 = "message_row_id"
            X.C17880vN.A19(r6, r4, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "sticker_pack_id"
            java.lang.String r0 = r11.A06     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "pack_name"
            java.lang.String r0 = r11.A03     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "pack_description"
            java.lang.String r0 = r11.A04     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "publisher"
            java.lang.String r0 = r11.A05     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "image_data_hash"
            java.lang.String r0 = r11.A02     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "tray_icon_file_name"
            java.lang.String r0 = r11.A07     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "sticker_pack_size"
            java.lang.Long r0 = r11.A01     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "sticker_pack_origin"
            java.lang.Integer r0 = r11.A00     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "StickerPackMessageStore/insertOrUpdateStickerPackMessage"
            r0 = 3
            long r8 = r5.A09(r7, r1, r6, r0)     // Catch:{ all -> 0x00c3 }
            r6 = -1
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00b9
            java.util.List r0 = r11.A08     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00b9
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x00c3 }
        L_0x0071:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x00c3 }
            X.6tY r8 = (X.C136276tY) r8     // Catch:{ all -> 0x00c3 }
            java.lang.String r7 = "message_sticker_pack_stickers"
            long r0 = r11.A0x     // Catch:{ all -> 0x00c3 }
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x00c3 }
            X.C17880vN.A19(r6, r4, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "file_name"
            java.lang.String r0 = r8.A04     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "emojis"
            java.lang.String r0 = r8.A03     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "accessibility_label"
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "is_animated"
            java.lang.Boolean r0 = r8.A00     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "is_lottie"
            java.lang.Boolean r0 = r8.A01     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "mimetype"
            java.lang.String r0 = r8.A05     // Catch:{ all -> 0x00c3 }
            r6.put(r1, r0)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = "StickerPackMessageStore/insertOrUpdateStickerPackStickers"
            r0 = 5
            r5.A09(r7, r1, r6, r0)     // Catch:{ all -> 0x00c3 }
            goto L_0x0071
        L_0x00b9:
            r3.A00()     // Catch:{ all -> 0x00c3 }
            r3.close()     // Catch:{ all -> 0x00ca }
            r2.close()
            return
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56982iL.A00(X.22i):void");
    }
}
