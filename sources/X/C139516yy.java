package X;

import android.database.Cursor;

/* renamed from: X.6yy  reason: invalid class name and case insensitive filesystem */
public final class C139516yy {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final boolean A02;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C1418377d r10) {
        /*
            r9 = this;
            r1 = 0
            java.lang.String r0 = r10.A0F
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "RecentStickerDBStorage/updateSticker/sticker filehash is null, could not be updated"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x000b:
            X.00H r0 = r9.A01
            X.1au r2 = X.C108985cd.A0S(r0)
            java.lang.String r6 = "plaintext_hash = ?"
            java.lang.String[] r8 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r10.A0F     // Catch:{ all -> 0x0065 }
            r8[r1] = r0     // Catch:{ all -> 0x0065 }
            android.content.ContentValues r4 = X.C17880vN.A08()     // Catch:{ all -> 0x0065 }
            X.C109005cf.A0K(r4, r10)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "file_size"
            int r0 = r10.A00     // Catch:{ all -> 0x0065 }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "width"
            int r0 = r10.A03     // Catch:{ all -> 0x0065 }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "height"
            int r0 = r10.A02     // Catch:{ all -> 0x0065 }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "emojis"
            java.lang.String r0 = r10.A09     // Catch:{ all -> 0x0065 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "is_first_party"
            boolean r0 = r10.A0P     // Catch:{ all -> 0x0065 }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "is_lottie"
            boolean r0 = r10.A02()     // Catch:{ all -> 0x0065 }
            X.C17880vN.A18(r4, r1, r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "accessibility_text"
            java.lang.String r0 = r10.A06     // Catch:{ all -> 0x0065 }
            r4.put(r1, r0)     // Catch:{ all -> 0x0065 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0065 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r5 = "recent_stickers"
            java.lang.String r7 = "updateSticker/UPDATE_RECENT_STICKERS"
            r3.A02(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0065 }
            r2.close()
            return
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139516yy.A02(X.77d):void");
    }

    public C139516yy(AnonymousClass00H r1, AnonymousClass00H r2, boolean z) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = z;
    }

    public static final C1418377d A00(Cursor cursor, AnonymousClass70H r3) {
        C1418377d A0a = C108985cd.A0a();
        A0a.A0F = C17890vO.A0S(cursor, "plaintext_hash");
        A0a.A0I = C17890vO.A0S(cursor, "url");
        A0a.A0A = C17890vO.A0S(cursor, "enc_hash");
        A0a.A08 = C17890vO.A0S(cursor, "direct_path");
        A0a.A0E = C17890vO.A0S(cursor, "mimetype");
        A0a.A0D = C17890vO.A0S(cursor, "media_key");
        A0a.A00 = C17890vO.A01(cursor, "file_size");
        A0a.A03 = C17890vO.A01(cursor, "width");
        A0a.A02 = C17890vO.A01(cursor, "height");
        A0a.A09 = C17890vO.A0S(cursor, "emojis");
        A0a.A0P = AnonymousClass24X.A01(cursor, cursor.getColumnIndexOrThrow("is_first_party"));
        A0a.A07 = C17890vO.A0S(cursor, "avatar_template_id");
        A0a.A0J = AnonymousClass24X.A01(cursor, cursor.getColumnIndexOrThrow("is_fun_sticker"));
        A0a.A0Q = AnonymousClass24X.A01(cursor, cursor.getColumnIndexOrThrow("is_lottie"));
        A0a.A06 = C17890vO.A0S(cursor, "accessibility_text");
        r3.A05(A0a);
        return A0a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x018d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0191, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0194, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0195, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0198, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A01() {
        /*
            r54 = this;
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            java.lang.String[] r3 = X.C17880vN.A1Y()
            r10 = r54
            boolean r0 = r10.A02
            if (r0 == 0) goto L_0x001a
            java.lang.String r1 = "1"
        L_0x0010:
            r0 = 0
            r3[r0] = r1
            X.00H r0 = r10.A01
            X.1at r9 = X.C108975cc.A0F(r0)
            goto L_0x001d
        L_0x001a:
            java.lang.String r1 = "0"
            goto L_0x0010
        L_0x001d:
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0192 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0192 }
            java.lang.String r1 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM recent_stickers WHERE is_avocado = ? ORDER BY entry_weight DESC"
            java.lang.String r0 = "loadWeightedStickerIdentifiersFromDB/QUERY_RECENT_STICKER"
            android.database.Cursor r8 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x0192 }
            java.lang.String r0 = "plaintext_hash"
            int r27 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "entry_weight"
            int r26 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "hash_of_image_part"
            int r25 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "url"
            int r24 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "enc_hash"
            int r23 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "direct_path"
            int r22 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "mimetype"
            int r21 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "media_key"
            int r20 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "file_size"
            int r19 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "width"
            int r18 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "height"
            int r17 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "emojis"
            int r16 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "is_first_party"
            int r15 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "last_sticker_sent_ts"
            int r14 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "is_avocado"
            int r12 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "avatar_template_id"
            int r7 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "is_fun_sticker"
            int r6 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "is_lottie"
            int r5 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
            java.lang.String r0 = "accessibility_text"
            int r4 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x018b }
        L_0x009c:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x018b }
            if (r0 == 0) goto L_0x0184
            r0 = r27
            java.lang.String r3 = r8.getString(r0)     // Catch:{ all -> 0x018b }
            r0 = r26
            float r2 = r8.getFloat(r0)     // Catch:{ all -> 0x018b }
            r0 = r25
            java.lang.String r1 = r8.getString(r0)     // Catch:{ all -> 0x018b }
            r29 = 0
            r43 = 0
            X.77d r0 = new X.77d     // Catch:{ all -> 0x018b }
            r31 = r29
            r32 = r29
            r33 = r29
            r34 = r29
            r35 = r29
            r36 = r29
            r37 = r29
            r38 = r29
            r39 = r29
            r40 = r29
            r41 = r29
            r42 = r29
            r45 = r43
            r46 = r43
            r47 = r43
            r48 = r43
            r49 = r43
            r50 = r43
            r51 = r43
            r52 = r43
            r53 = r43
            r28 = r0
            r30 = r29
            r44 = r43
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)     // Catch:{ all -> 0x018b }
            r0.A0F = r3     // Catch:{ all -> 0x018b }
            r13 = r24
            java.lang.String r13 = r8.getString(r13)     // Catch:{ all -> 0x018b }
            r0.A0I = r13     // Catch:{ all -> 0x018b }
            r13 = r23
            java.lang.String r13 = r8.getString(r13)     // Catch:{ all -> 0x018b }
            r0.A0A = r13     // Catch:{ all -> 0x018b }
            r13 = r22
            java.lang.String r13 = r8.getString(r13)     // Catch:{ all -> 0x018b }
            r0.A08 = r13     // Catch:{ all -> 0x018b }
            r13 = r21
            java.lang.String r13 = r8.getString(r13)     // Catch:{ all -> 0x018b }
            r0.A0E = r13     // Catch:{ all -> 0x018b }
            r13 = r20
            java.lang.String r13 = r8.getString(r13)     // Catch:{ all -> 0x018b }
            r0.A0D = r13     // Catch:{ all -> 0x018b }
            r13 = r19
            int r13 = r8.getInt(r13)     // Catch:{ all -> 0x018b }
            r0.A00 = r13     // Catch:{ all -> 0x018b }
            r13 = r18
            int r13 = r8.getInt(r13)     // Catch:{ all -> 0x018b }
            r0.A03 = r13     // Catch:{ all -> 0x018b }
            r13 = r17
            int r13 = r8.getInt(r13)     // Catch:{ all -> 0x018b }
            r0.A02 = r13     // Catch:{ all -> 0x018b }
            r13 = r16
            java.lang.String r13 = r8.getString(r13)     // Catch:{ all -> 0x018b }
            r0.A09 = r13     // Catch:{ all -> 0x018b }
            boolean r13 = X.AnonymousClass24X.A01(r8, r15)     // Catch:{ all -> 0x018b }
            r0.A0P = r13     // Catch:{ all -> 0x018b }
            r0.A0C = r1     // Catch:{ all -> 0x018b }
            boolean r13 = X.AnonymousClass24X.A01(r8, r12)     // Catch:{ all -> 0x018b }
            r0.A0N = r13     // Catch:{ all -> 0x018b }
            java.lang.String r13 = r8.getString(r7)     // Catch:{ all -> 0x018b }
            r0.A07 = r13     // Catch:{ all -> 0x018b }
            boolean r13 = X.AnonymousClass24X.A01(r8, r6)     // Catch:{ all -> 0x018b }
            r0.A0J = r13     // Catch:{ all -> 0x018b }
            boolean r13 = X.AnonymousClass24X.A01(r8, r5)     // Catch:{ all -> 0x018b }
            r0.A0Q = r13     // Catch:{ all -> 0x018b }
            java.lang.String r13 = r8.getString(r4)     // Catch:{ all -> 0x018b }
            r0.A06 = r13     // Catch:{ all -> 0x018b }
            long r33 = r8.getLong(r14)     // Catch:{ all -> 0x018b }
            X.00H r13 = r10.A00     // Catch:{ all -> 0x018b }
            X.AnonymousClass70H.A00(r0, r13)     // Catch:{ all -> 0x018b }
            X.C18070vi.A0b(r3)     // Catch:{ all -> 0x018b }
            java.lang.String r13 = r0.A07     // Catch:{ all -> 0x018b }
            r32 = r13
            X.6pg r13 = new X.6pg     // Catch:{ all -> 0x018b }
            r28 = r13
            r29 = r0
            r30 = r3
            r31 = r1
            r28.<init>(r29, r30, r31, r32, r33)     // Catch:{ all -> 0x018b }
            X.7Ic r0 = new X.7Ic     // Catch:{ all -> 0x018b }
            r0.<init>(r13, r2)     // Catch:{ all -> 0x018b }
            r11.add(r0)     // Catch:{ all -> 0x018b }
            goto L_0x009c
        L_0x0184:
            r8.close()     // Catch:{ all -> 0x0192 }
            r9.close()
            return r11
        L_0x018b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x018d }
        L_0x018d:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ all -> 0x0192 }
            throw r0     // Catch:{ all -> 0x0192 }
        L_0x0192:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0194 }
        L_0x0194:
            r0 = move-exception
            X.CDX.A00(r9, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C139516yy.A01():java.util.ArrayList");
    }
}
