package X;

import java.util.Collection;

/* renamed from: X.6Lo  reason: invalid class name and case insensitive filesystem */
public class C121806Lo extends A34 {
    public final AnonymousClass87H A00;
    public final C130206j3 A01;
    public final boolean A02 = true;
    public final /* synthetic */ C129276hX A03;

    public C121806Lo(AnonymousClass87H r2, C129276hX r3, C130206j3 r4) {
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:70:0x021c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0220, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0223, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0227, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r42) {
        /*
            r41 = this;
            r2 = r42
            java.lang.String[] r2 = (java.lang.String[]) r2
            X.C17960vV.A07(r2)
            int r0 = r2.length
            r1 = 0
            boolean r0 = X.C17890vO.A1R(r0)
            X.C17960vV.A0C(r0)
            r0 = r41
            X.6j3 r4 = r0.A01
            r3 = r2[r1]
            boolean r2 = r0.A02
            X.C18070vi.A0d(r3, r1)
            java.lang.String r0 = "StickerContextualSuggestionStore fetchMatchingStickersByTextFromDb"
            X.1Ez r6 = new X.1Ez
            r6.<init>((java.lang.String) r0)
            X.7IU r1 = r4.A02
            r0 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r14 = r1.A01(r3, r0, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Found and parsed emojis:"
            X.C17890vO.A14(r0, r1, r14)
            java.lang.String r0 = r1.toString()
            r6.A03(r0)
            r3 = 1
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0044
            X.0wS r0 = X.C18460wS.A00
            return r0
        L_0x0044:
            java.util.LinkedHashSet r5 = X.C17880vN.A14()
            java.lang.String r0 = "Start search for stickers"
            r6.A03(r0)
            int r1 = r14.size()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SELECT plaintext_hash, from_third_party_pack_db, sticker_pack_identifier, mime_type, hash_of_image_part FROM (SELECT plaintext_hash as plaintext_hash, emojis as emojis, 10001 as primary_ordering, entry_weight as secondary_ordering, hash_of_image_part as hash_of_image_part, mimetype as mime_type, '' as sticker_pack_identifier, 0 as from_third_party_pack_db FROM recent_stickers UNION SELECT plaintext_hash as plaintext_hash, emojis as emojis, 10000 as primary_ordering, timestamp as secondary_ordering, hash_of_image_part as hash_of_image_part, mimetype as mime_type, '' as sticker_pack_identifier, 0 as from_third_party_pack_db FROM starred_stickers UNION SELECT plain_file_hash as plaintext_hash, emojis as emojis, sticker_pack_order.pack_order as primary_ordering, 0 as secondary_ordering, hash_of_image_part as hash_of_image_part, mime_type as mime_type, sticker_pack_order.sticker_pack_id as sticker_pack_identifier, 0 as from_third_party_pack_db FROM stickers LEFT JOIN sticker_pack_order ON sticker_pack_order.sticker_pack_id=stickers.sticker_pack_id UNION SELECT plaintext_hash as plaintext_hash, emojis as emojis, sticker_pack_order.pack_order as primary_ordering, 0 as secondary_ordering, hash_of_image_part as hash_of_image_part, 'image/webp' as mime_type, (third_party_sticker_emoji_mapping.authority || ' ' || third_party_sticker_emoji_mapping.sticker_pack_id) as sticker_pack_identifier, 1 as from_third_party_pack_db FROM third_party_sticker_emoji_mapping LEFT JOIN sticker_pack_order ON sticker_pack_order.sticker_pack_id=(third_party_sticker_emoji_mapping.authority || ' ' || third_party_sticker_emoji_mapping.sticker_pack_id) LEFT JOIN third_party_whitelist_packs ON third_party_sticker_emoji_mapping.sticker_pack_id=third_party_whitelist_packs.sticker_pack_id WHERE avoid_cache = 0 ) WHERE emojis LIKE "
            r2.append(r0)
            java.lang.String r0 = "?"
            java.util.List r1 = java.util.Collections.nCopies(r1, r0)
            java.lang.String r0 = " OR emojis LIKE "
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            r2.append(r0)
            java.lang.String r0 = " GROUP BY "
            r2.append(r0)
            java.lang.String r9 = "plaintext_hash"
            r2.append(r9)
            java.lang.String r0 = " ORDER BY primary_ordering DESC, secondary_ordering DESC "
            r2.append(r0)
            java.lang.String r0 = " LIMIT 500"
            java.lang.String r13 = X.AnonymousClass000.A0y(r0, r2)
            X.C18070vi.A0X(r13)
            X.00H r0 = r4.A05     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228 }
            X.1at r2 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228 }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0221 }
            X.1Ev r12 = r0.A02     // Catch:{ all -> 0x0221 }
            int r11 = r14.size()     // Catch:{ all -> 0x0221 }
            java.lang.String[] r10 = new java.lang.String[r11]     // Catch:{ all -> 0x0221 }
            r8 = 0
        L_0x0093:
            if (r8 >= r11) goto L_0x00ae
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0221 }
            r1 = 37
            r7.append(r1)     // Catch:{ all -> 0x0221 }
            java.lang.Object r0 = r14.get(r8)     // Catch:{ all -> 0x0221 }
            r7.append(r0)     // Catch:{ all -> 0x0221 }
            java.lang.String r0 = X.C17890vO.A0c(r7, r1)     // Catch:{ all -> 0x0221 }
            r10[r8] = r0     // Catch:{ all -> 0x0221 }
            int r8 = r8 + 1
            goto L_0x0093
        L_0x00ae:
            java.lang.String r0 = "DISTINCT_SYMBOL_FROM_STICKER_SUGGESTION_SEARCH_TAG"
            android.database.Cursor r7 = r12.A0A(r13, r0, r10)     // Catch:{ all -> 0x0221 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "Found stickers:"
            r1.append(r0)     // Catch:{ all -> 0x021a }
            int r0 = r7.getCount()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x021a }
            r6.A03(r0)     // Catch:{ all -> 0x021a }
            int r0 = r7.getCount()     // Catch:{ all -> 0x021a }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x021a }
            r8.<init>(r0)     // Catch:{ all -> 0x021a }
        L_0x00d1:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01f8
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "Sticker #"
            r1.append(r0)     // Catch:{ all -> 0x021a }
            int r0 = r7.getPosition()     // Catch:{ all -> 0x021a }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x021a }
            r6.A03(r0)     // Catch:{ all -> 0x021a }
            java.lang.String r12 = X.C17890vO.A0S(r7, r9)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "from_third_party_pack_db"
            int r0 = X.C17890vO.A01(r7, r0)     // Catch:{ all -> 0x021a }
            boolean r14 = X.AnonymousClass000.A1O(r0)
            java.lang.String r0 = "sticker_pack_identifier"
            java.lang.String r1 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "hash_of_image_part"
            java.lang.String r11 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "mime_type"
            java.lang.String r10 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x021a }
            boolean r0 = r8.contains(r11)     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x00d1
            boolean r0 = X.AnonymousClass1EG.A0H(r11)     // Catch:{ all -> 0x021a }
            if (r0 != 0) goto L_0x011d
            X.C18070vi.A0b(r11)     // Catch:{ all -> 0x021a }
            r8.add(r11)     // Catch:{ all -> 0x021a }
        L_0x011d:
            r16 = 0
            r11 = 0
            X.77d r15 = new X.77d     // Catch:{ all -> 0x021a }
            r18 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r23 = r16
            r24 = r16
            r25 = r16
            r26 = r16
            r27 = r16
            r28 = r16
            r29 = r16
            r31 = r11
            r32 = r11
            r33 = r11
            r34 = r11
            r35 = r11
            r36 = r11
            r37 = r11
            r38 = r11
            r39 = r11
            r40 = r11
            r17 = r16
            r30 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x021a }
            r15.A0F = r12     // Catch:{ all -> 0x021a }
            r15.A0E = r10     // Catch:{ all -> 0x021a }
            java.lang.String r0 = "application/was"
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x021a }
            r15.A0Q = r0     // Catch:{ all -> 0x021a }
            X.1Ns r0 = r4.A01     // Catch:{ all -> 0x021a }
            java.io.File r13 = r0.A04(r12, r10)     // Catch:{ all -> 0x021a }
            boolean r0 = r13.exists()     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x018d
            java.lang.String r0 = "Sticker file stored internally"
            r6.A03(r0)     // Catch:{ all -> 0x021a }
            X.C108945cZ.A1O(r15, r13)     // Catch:{ all -> 0x021a }
            r15.A01 = r3     // Catch:{ all -> 0x021a }
            X.00H r1 = r4.A04     // Catch:{ all -> 0x021a }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x021a }
            X.70H r0 = (X.AnonymousClass70H) r0     // Catch:{ all -> 0x021a }
            X.73B r0 = r0.A02(r13, r10)     // Catch:{ all -> 0x021a }
            r15.A04 = r0     // Catch:{ all -> 0x021a }
            X.AnonymousClass70H.A00(r15, r1)     // Catch:{ all -> 0x021a }
            r5.add(r15)     // Catch:{ all -> 0x021a }
            goto L_0x00d1
        L_0x018d:
            java.lang.String r0 = "Sticker file not managed internally"
            r6.A03(r0)     // Catch:{ all -> 0x021a }
            if (r14 == 0) goto L_0x00d1
            if (r1 == 0) goto L_0x00d1
            int r0 = r1.length()     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x00d1
            java.lang.String r0 = " "
            boolean r0 = X.AnonymousClass1YF.A0Y(r1, r0, r11)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x00d1
            android.util.Pair r0 = X.C137416vQ.A00(r1)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x00d1
            android.util.Pair r13 = X.C137416vQ.A00(r1)     // Catch:{ all -> 0x021a }
            X.C17960vV.A07(r13)     // Catch:{ all -> 0x021a }
            X.C18070vi.A0X(r13)     // Catch:{ all -> 0x021a }
            X.72s r10 = r4.A03     // Catch:{ all -> 0x021a }
            java.lang.Object r1 = r13.first     // Catch:{ all -> 0x021a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x021a }
            java.lang.Object r0 = r13.second     // Catch:{ all -> 0x021a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x021a }
            monitor-enter(r10)     // Catch:{ all -> 0x021a }
            java.io.File r0 = X.C1407272s.A00(r10, r1, r0)     // Catch:{ all -> 0x01f5 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x01f5 }
            monitor-exit(r10)     // Catch:{ all -> 0x021a }
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r1 = r13.first     // Catch:{ all -> 0x021a }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x021a }
            java.lang.Object r0 = r13.second     // Catch:{ all -> 0x021a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x021a }
            monitor-enter(r10)     // Catch:{ all -> 0x021a }
            java.util.List r1 = X.C1407272s.A01(r10, r1, r0, r12)     // Catch:{ all -> 0x01f5 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x01f5 }
            if (r0 != 0) goto L_0x01e5
            java.lang.Object r0 = r1.get(r11)     // Catch:{ all -> 0x01f5 }
            X.77d r0 = (X.C1418377d) r0     // Catch:{ all -> 0x01f5 }
            monitor-exit(r10)     // Catch:{ all -> 0x021a }
            goto L_0x01e7
        L_0x01e5:
            monitor-exit(r10)     // Catch:{ all -> 0x021a }
            r0 = 0
        L_0x01e7:
            if (r0 == 0) goto L_0x00d1
            r5.add(r0)     // Catch:{ all -> 0x021a }
            goto L_0x00d1
        L_0x01ee:
            java.lang.String r0 = "File not in cache, skipping"
            r6.A03(r0)     // Catch:{ all -> 0x021a }
            goto L_0x00d1
        L_0x01f5:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x021a }
            throw r0     // Catch:{ all -> 0x021a }
        L_0x01f8:
            r7.close()     // Catch:{ all -> 0x0221 }
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Finished parsing stickers: "
            r1.append(r0)
            int r0 = r5.size()
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)
            r6.A03(r0)
            r6.A02()
            java.util.List r0 = X.C29431cG.A0t(r5)
            return r0
        L_0x021a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x021c }
        L_0x021c:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0221 }
            throw r0     // Catch:{ all -> 0x0221 }
        L_0x0221:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0223 }
        L_0x0223:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0228 }
        L_0x0228:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.190 r2 = r4.A00
            java.lang.String r1 = "StickerContextualSuggestionStore/fetchMatchingStickersByEmojisFromDb"
            java.lang.String r0 = r0.getMessage()
            r2.A0G(r1, r0, r3)
            X.0wS r0 = X.C18460wS.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121806Lo.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        Collection collection = (Collection) obj;
        C129276hX r1 = this.A03;
        if (r1.A00 == this) {
            r1.A00 = null;
        }
        if (!C108945cZ.A1T(this)) {
            this.A00.C3o(collection);
        }
    }
}
