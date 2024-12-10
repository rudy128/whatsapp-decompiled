package X;

import android.database.Cursor;

/* renamed from: X.6zY  reason: invalid class name and case insensitive filesystem */
public final class C139856zY {
    public final AnonymousClass00H A00;
    public final AnonymousClass190 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r7) {
        /*
            r6 = this;
            r1 = 0
            X.00H r0 = r6.A00
            X.1au r5 = X.C108985cd.A0S(r0)
            java.lang.String r4 = "plaintext_hash = ?"
            java.lang.String[] r3 = X.C17880vN.A1a(r7, r1)     // Catch:{ all -> 0x001d }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x001d }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x001d }
            java.lang.String r1 = "starred_stickers"
            java.lang.String r0 = "removeStarredStickerHash/DELETE_STARRED_STICKER"
            r2.A04(r1, r4, r0, r3)     // Catch:{ all -> 0x001d }
            r5.close()
            return
        L_0x001d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001f }
        L_0x001f:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139856zY.A03(java.lang.String):void");
    }

    public static final C136656uA A00(Cursor cursor) {
        Cursor cursor2 = cursor;
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("plaintext_hash");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("hash_of_image_part");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("timestamp");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("url");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("enc_hash");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("direct_path");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("mimetype");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("media_key");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("width");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("height");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("emojis");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("is_first_party");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("is_avatar");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("avatar_template_id");
        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("is_fun_sticker");
        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("is_lottie");
        int columnIndexOrThrow18 = cursor2.getColumnIndexOrThrow("accessibility_text");
        String string = cursor2.getString(columnIndexOrThrow);
        String string2 = cursor2.getString(columnIndexOrThrow6);
        if (string == null) {
            return null;
        }
        String string3 = cursor2.getString(columnIndexOrThrow2);
        long j = cursor2.getLong(columnIndexOrThrow3);
        String string4 = cursor2.getString(columnIndexOrThrow4);
        String string5 = cursor2.getString(columnIndexOrThrow5);
        String string6 = cursor2.getString(columnIndexOrThrow7);
        String string7 = cursor2.getString(columnIndexOrThrow8);
        int i = cursor2.getInt(columnIndexOrThrow9);
        int i2 = cursor2.getInt(columnIndexOrThrow10);
        int i3 = cursor2.getInt(columnIndexOrThrow11);
        String string8 = cursor2.getString(columnIndexOrThrow12);
        boolean A012 = AnonymousClass24X.A01(cursor2, columnIndexOrThrow13);
        boolean A013 = AnonymousClass24X.A01(cursor2, columnIndexOrThrow14);
        return new C136656uA(string, string3, string4, string5, string2, string6, string7, string8, cursor2.getString(columnIndexOrThrow15), cursor2.getString(columnIndexOrThrow18), i, i2, i3, j, A012, A013, AnonymousClass24X.A01(cursor2, columnIndexOrThrow16), AnonymousClass24X.A01(cursor2, columnIndexOrThrow17));
    }

    public C139856zY(AnonymousClass190 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0119, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        X.CDX.A00(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011d, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0120, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        X.CDX.A00(r1, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0124, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01(int r44, int r45) {
        /*
            r43 = this;
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            r6 = r45
            if (r45 != 0) goto L_0x001e
            java.lang.String r5 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM starred_stickers ORDER BY timestamp DESC LIMIT ?"
        L_0x000a:
            r4 = 2
            if (r6 != r4) goto L_0x001b
            java.lang.String r3 = "1"
        L_0x000f:
            r1 = 0
            r0 = 1
            r7 = r44
            if (r45 != 0) goto L_0x0021
            java.lang.String[] r4 = new java.lang.String[r0]
            X.C17880vN.A1S(r4, r7, r1)
            goto L_0x0028
        L_0x001b:
            java.lang.String r3 = "0"
            goto L_0x000f
        L_0x001e:
            java.lang.String r5 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM starred_stickers WHERE is_avatar = ? ORDER BY timestamp DESC LIMIT ?"
            goto L_0x000a
        L_0x0021:
            java.lang.String[] r4 = new java.lang.String[r4]
            r4[r1] = r3
            X.C17880vN.A1S(r4, r7, r0)
        L_0x0028:
            r42 = r43
            r0 = r42
            X.00H r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0125 }
            X.1at r1 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0125 }
            r0 = r1
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x011e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "getStarredStickersData/QUERY_RECENT_STARRED_STICKERS"
            android.database.Cursor r0 = r3.A0A(r5, r0, r4)     // Catch:{ all -> 0x011e }
            java.lang.String r3 = "plaintext_hash"
            int r21 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "hash_of_image_part"
            int r20 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "timestamp"
            int r19 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "url"
            int r18 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "enc_hash"
            int r17 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "direct_path"
            int r16 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "mimetype"
            int r15 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "media_key"
            int r14 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "file_size"
            int r13 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "width"
            int r12 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "height"
            int r11 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "emojis"
            int r10 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "is_first_party"
            int r9 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "is_avatar"
            int r8 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "avatar_template_id"
            int r7 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "is_fun_sticker"
            int r6 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "is_lottie"
            int r5 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r3 = "accessibility_text"
            int r4 = r0.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0117 }
        L_0x00a9:
            boolean r3 = r0.moveToNext()     // Catch:{ all -> 0x0117 }
            if (r3 == 0) goto L_0x0110
            r3 = r21
            java.lang.String r23 = r0.getString(r3)     // Catch:{ all -> 0x0117 }
            r3 = r16
            java.lang.String r27 = r0.getString(r3)     // Catch:{ all -> 0x0117 }
            if (r23 == 0) goto L_0x00a9
            r3 = r20
            java.lang.String r24 = r0.getString(r3)     // Catch:{ all -> 0x0117 }
            r3 = r19
            long r36 = r0.getLong(r3)     // Catch:{ all -> 0x0117 }
            r3 = r18
            java.lang.String r25 = r0.getString(r3)     // Catch:{ all -> 0x0117 }
            r3 = r17
            java.lang.String r26 = r0.getString(r3)     // Catch:{ all -> 0x0117 }
            java.lang.String r28 = r0.getString(r15)     // Catch:{ all -> 0x0117 }
            java.lang.String r29 = r0.getString(r14)     // Catch:{ all -> 0x0117 }
            int r33 = r0.getInt(r13)     // Catch:{ all -> 0x0117 }
            int r34 = r0.getInt(r12)     // Catch:{ all -> 0x0117 }
            int r35 = r0.getInt(r11)     // Catch:{ all -> 0x0117 }
            java.lang.String r30 = r0.getString(r10)     // Catch:{ all -> 0x0117 }
            boolean r38 = X.AnonymousClass24X.A01(r0, r9)     // Catch:{ all -> 0x0117 }
            boolean r39 = X.AnonymousClass24X.A01(r0, r8)     // Catch:{ all -> 0x0117 }
            java.lang.String r31 = r0.getString(r7)     // Catch:{ all -> 0x0117 }
            boolean r40 = X.AnonymousClass24X.A01(r0, r6)     // Catch:{ all -> 0x0117 }
            boolean r41 = X.AnonymousClass24X.A01(r0, r5)     // Catch:{ all -> 0x0117 }
            java.lang.String r32 = r0.getString(r4)     // Catch:{ all -> 0x0117 }
            X.6uA r3 = new X.6uA     // Catch:{ all -> 0x0117 }
            r22 = r3
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r38, r39, r40, r41)     // Catch:{ all -> 0x0117 }
            r2.add(r3)     // Catch:{ all -> 0x0117 }
            goto L_0x00a9
        L_0x0110:
            r0.close()     // Catch:{ all -> 0x011e }
            r1.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0125 }
            return r2
        L_0x0117:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0119 }
        L_0x0119:
            r3 = move-exception
            X.CDX.A00(r0, r4)     // Catch:{ all -> 0x011e }
            throw r3     // Catch:{ all -> 0x011e }
        L_0x011e:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r0 = move-exception
            X.CDX.A00(r1, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0125 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0125 }
        L_0x0125:
            r1 = move-exception
            java.lang.String r4 = "StarredStickerDBTableHelper.getStarredStickersData"
            com.whatsapp.util.Log.e(r4, r1)
            r0 = r42
            X.190 r3 = r0.A01
            java.lang.String r1 = r1.getMessage()
            r0 = 1
            r3.A0G(r4, r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139856zY.A01(int, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00bf, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x00bb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00bc, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C136656uA r7) {
        /*
            r6 = this;
            android.content.ContentValues r5 = X.C17880vN.A08()
            java.lang.String r1 = "plaintext_hash"
            java.lang.String r0 = r7.A0C
            r5.put(r1, r0)
            java.lang.String r1 = "hash_of_image_part"
            java.lang.String r0 = r7.A01
            r5.put(r1, r0)
            long r0 = r7.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "timestamp"
            r5.put(r0, r1)
            java.lang.String r1 = "url"
            java.lang.String r0 = r7.A0F
            r5.put(r1, r0)
            java.lang.String r1 = "enc_hash"
            java.lang.String r0 = r7.A0B
            r5.put(r1, r0)
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r7.A09
            r5.put(r1, r0)
            java.lang.String r1 = "mimetype"
            java.lang.String r0 = r7.A0E
            r5.put(r1, r0)
            java.lang.String r1 = "media_key"
            java.lang.String r0 = r7.A0D
            r5.put(r1, r0)
            int r0 = r7.A04
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "file_size"
            r5.put(r0, r1)
            int r0 = r7.A06
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "width"
            r5.put(r0, r1)
            int r0 = r7.A05
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "height"
            r5.put(r0, r1)
            java.lang.String r1 = "emojis"
            java.lang.String r0 = r7.A0A
            r5.put(r1, r0)
            boolean r0 = r7.A0H
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_first_party"
            r5.put(r0, r1)
            boolean r0 = r7.A02
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_avatar"
            r5.put(r0, r1)
            java.lang.String r1 = "avatar_template_id"
            java.lang.String r0 = r7.A00
            r5.put(r1, r0)
            boolean r0 = r7.A0G
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_fun_sticker"
            r5.put(r0, r1)
            boolean r0 = r7.A03
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_lottie"
            r5.put(r0, r1)
            java.lang.String r1 = "accessibility_text"
            java.lang.String r0 = r7.A08
            r5.put(r1, r0)
            X.00H r0 = r6.A00
            X.1au r4 = X.C108985cd.A0S(r0)
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00b9 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "starred_stickers"
            java.lang.String r1 = "addStarredStickerHash/INSERT_STARRED_STICKER"
            r0 = 5
            r3.A09(r2, r1, r5, r0)     // Catch:{ all -> 0x00b9 }
            r4.close()
            return
        L_0x00b9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139856zY.A02(X.6uA):void");
    }
}
