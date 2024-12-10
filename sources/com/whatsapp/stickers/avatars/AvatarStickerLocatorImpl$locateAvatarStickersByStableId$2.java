package com.whatsapp.stickers.avatars;

import X.AnonymousClass1OS;
import X.C130616jj;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2", f = "AvatarStickerLocatorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $stableIds;
    public int label;
    public final /* synthetic */ C130616jj this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2(C130616jj r2, List list, C30391dr r4) {
        super(2, r4);
        this.$stableIds = list;
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2(this.this$0, this.$stableIds, r5);
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.1IU] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01ef, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01f3, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01fa, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0249, code lost:
        if (r3 != null) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0098, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0128, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x012c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0133, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r3 = r17
            int r0 = r3.label
            if (r0 != 0) goto L_0x02d9
            X.C30691eM.A01(r18)
            java.util.List r0 = r3.$stableIds
            java.util.ArrayList r4 = X.C29351c6.A0E(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0013:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r1.next()
            X.6zL r0 = (X.C139726zL) r0
            java.lang.String r0 = r0.A00
            r4.add(r0)
            goto L_0x0013
        L_0x0025:
            X.6jj r0 = r3.this$0
            X.00H r0 = r0.A06
            java.lang.Object r7 = r0.get()
            X.6uZ r7 = (X.C136886uZ) r7
            java.lang.String r6 = "StickerDBTableHelper/getByStableIds"
            r0 = 0
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r4.toArray(r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r0 = new X.23b
            r0.<init>(r2, r1)
            java.util.Iterator r11 = r0.iterator()
        L_0x0047:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r10 = r11.next()
            java.lang.String[] r10 = (java.lang.String[]) r10
            X.00H r0 = r7.A01     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0099 }
            X.1at r8 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0099 }
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0092 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0092 }
            int r0 = r10.length     // Catch:{ all -> 0x0092 }
            java.lang.String r2 = X.AnonymousClass1H2.A00(r0)     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x0092 }
            java.lang.String r0 = "getByStableIds/QUERY_STICKER"
            android.database.Cursor r2 = r9.A0A(r1, r0, r10)     // Catch:{ all -> 0x0092 }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x008b }
            java.util.ArrayList r0 = r7.A02(r2)     // Catch:{ all -> 0x008b }
            r5.addAll(r0)     // Catch:{ all -> 0x008b }
            if (r2 == 0) goto L_0x0087
            r2.close()     // Catch:{ all -> 0x0092 }
        L_0x0087:
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0099 }
            goto L_0x0047
        L_0x008b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008d }
        L_0x008d:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0094 }
        L_0x0094:
            r0 = move-exception
            X.CDX.A00(r8, r1)     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0099 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException | NullPointerException -> 0x0099 }
        L_0x0099:
            r0 = move-exception
            com.whatsapp.util.Log.e(r6, r0)
            goto L_0x0047
        L_0x009e:
            int r0 = X.C72483Me.A07(r5)
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>(r0)
            java.util.Iterator r2 = r5.iterator()
        L_0x00ab:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00be
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.77d r0 = (X.C1418377d) r0
            java.lang.String r0 = r0.A07
            r9.put(r0, r1)
            goto L_0x00ab
        L_0x00be:
            X.6jj r0 = r3.this$0
            X.00H r0 = r0.A04
            java.lang.Object r6 = r0.get()
            X.6zY r6 = (X.C139856zY) r6
            r0 = 0
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r4.toArray(r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r0 = new X.23b
            r0.<init>(r2, r1)
            java.util.Iterator r11 = r0.iterator()
        L_0x00de:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x013b
            java.lang.Object r10 = r11.next()
            java.lang.String[] r10 = (java.lang.String[]) r10
            X.00H r0 = r6.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0134 }
            X.1at r7 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0134 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x012d }
            X.1Ev r8 = r0.A02     // Catch:{ all -> 0x012d }
            int r0 = r10.length     // Catch:{ all -> 0x012d }
            java.lang.String r2 = X.AnonymousClass1H2.A00(r0)     // Catch:{ all -> 0x012d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "SELECT plaintext_hash, hash_of_image_part, timestamp, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM starred_stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r2, r1)     // Catch:{ all -> 0x012d }
            java.lang.String r0 = "getStarredStickersByStableIds/QUERY_STICKER"
            android.database.Cursor r2 = r8.A0A(r1, r0, r10)     // Catch:{ all -> 0x012d }
        L_0x010f:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x011f
            X.6uA r0 = X.C139856zY.A00(r2)     // Catch:{ all -> 0x0126 }
            if (r0 == 0) goto L_0x010f
            r5.add(r0)     // Catch:{ all -> 0x0126 }
            goto L_0x010f
        L_0x011f:
            r2.close()     // Catch:{ all -> 0x012d }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0134 }
            goto L_0x00de
        L_0x0126:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0128 }
        L_0x0128:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x012d }
            throw r0     // Catch:{ all -> 0x012d }
        L_0x012d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x012f }
        L_0x012f:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0134 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0134 }
        L_0x0134:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getStarredStickersByStableIds"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00de
        L_0x013b:
            X.6jj r7 = r3.this$0
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            java.util.Iterator r5 = r5.iterator()
        L_0x0145:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0165
            java.lang.Object r2 = r5.next()
            X.6uA r2 = (X.C136656uA) r2
            X.00H r0 = r7.A05
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.70H r1 = (X.AnonymousClass70H) r1
            X.1Ns r0 = r7.A01
            X.77d r0 = X.C124166Xh.A00(r0, r1, r2)
            if (r0 == 0) goto L_0x0145
            r6.add(r0)
            goto L_0x0145
        L_0x0165:
            int r0 = X.C72483Me.A07(r6)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>(r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x0172:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0185
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.77d r0 = (X.C1418377d) r0
            java.lang.String r0 = r0.A07
            r8.put(r0, r1)
            goto L_0x0172
        L_0x0185:
            X.6jj r0 = r3.this$0
            X.6yy r5 = r0.A03
            r0 = 0
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r4 = r4.toArray(r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r0 = new X.23b
            r0.<init>(r4, r1)
            java.util.Iterator r11 = r0.iterator()
        L_0x019f:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0202
            java.lang.Object r10 = r11.next()
            java.lang.String[] r10 = (java.lang.String[]) r10
            X.00H r0 = r5.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x01fb }
            X.1at r6 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01fb }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x01f4 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x01f4 }
            int r0 = r10.length     // Catch:{ all -> 0x01f4 }
            java.lang.String r4 = X.AnonymousClass1H2.A00(r0)     // Catch:{ all -> 0x01f4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = "SELECT plaintext_hash, entry_weight, hash_of_image_part, url, enc_hash, direct_path, mimetype, media_key, file_size, width, height, emojis, is_first_party, is_avocado, last_sticker_sent_ts, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM recent_stickers WHERE "
            r1.append(r0)     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = "avatar_template_id IN "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r4, r1)     // Catch:{ all -> 0x01f4 }
            java.lang.String r0 = "getStarredStickersByStableIds/QUERY_STICKER"
            android.database.Cursor r4 = r7.A0A(r1, r0, r10)     // Catch:{ all -> 0x01f4 }
        L_0x01d0:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x01ed }
            if (r0 == 0) goto L_0x01e6
            X.00H r0 = r5.A00     // Catch:{ all -> 0x01ed }
            java.lang.Object r0 = X.C18070vi.A0E(r0)     // Catch:{ all -> 0x01ed }
            X.70H r0 = (X.AnonymousClass70H) r0     // Catch:{ all -> 0x01ed }
            X.77d r0 = X.C139516yy.A00(r4, r0)     // Catch:{ all -> 0x01ed }
            r2.add(r0)     // Catch:{ all -> 0x01ed }
            goto L_0x01d0
        L_0x01e6:
            r4.close()     // Catch:{ all -> 0x01f4 }
            r6.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x01fb }
            goto L_0x019f
        L_0x01ed:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01ef }
        L_0x01ef:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x01f4 }
            throw r0     // Catch:{ all -> 0x01f4 }
        L_0x01f4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x01f6 }
        L_0x01f6:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x01fb }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x01fb }
        L_0x01fb:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getStarredStickersByStableIds"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x019f
        L_0x0202:
            int r0 = X.C72483Me.A07(r2)
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x020f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.77d r0 = (X.C1418377d) r0
            java.lang.String r0 = r0.A07
            r7.put(r0, r1)
            goto L_0x020f
        L_0x0222:
            java.util.List r0 = r3.$stableIds
            X.6jj r6 = r3.this$0
            java.util.ArrayList r5 = X.C29351c6.A0E(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x022e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02d8
            java.lang.Object r4 = r16.next()
            X.6zL r4 = (X.C139726zL) r4
            java.lang.String r15 = r4.A00
            boolean r0 = r9.containsKey(r15)
            r1 = 0
            if (r0 == 0) goto L_0x0254
            java.lang.Object r3 = r9.get(r15)
        L_0x0247:
            X.77d r3 = (X.C1418377d) r3
            if (r3 == 0) goto L_0x026a
        L_0x024b:
            X.6E0 r0 = new X.6E0
            r0.<init>(r3)
        L_0x0250:
            r5.add(r0)
            goto L_0x022e
        L_0x0254:
            boolean r0 = r8.containsKey(r15)
            if (r0 == 0) goto L_0x025f
            java.lang.Object r3 = r8.get(r15)
            goto L_0x0247
        L_0x025f:
            boolean r0 = r7.containsKey(r15)
            if (r0 == 0) goto L_0x026a
            java.lang.Object r3 = r7.get(r15)
            goto L_0x0247
        L_0x026a:
            X.6uS r0 = r6.A02
            java.io.File r13 = r0.A00(r4, r1)
            X.00H r0 = r6.A05
            java.lang.Object r14 = X.C18070vi.A0E(r0)
            X.70H r14 = (X.AnonymousClass70H) r14
            r12 = 1
            X.C18070vi.A0d(r14, r12)
            r3 = 0
            boolean r0 = r13.exists()     // Catch:{ all -> 0x02b8 }
            r10 = 0
            if (r0 == 0) goto L_0x02cf
            long r1 = r13.length()     // Catch:{ all -> 0x02b8 }
            int r0 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x02cf
            java.lang.String r11 = X.C1402370n.A00(r13)     // Catch:{ all -> 0x02b8 }
            X.C18070vi.A0X(r11)     // Catch:{ all -> 0x02b8 }
            X.77d r10 = X.C108985cd.A0a()     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "meta-avatar"
            r10.A0H = r0     // Catch:{ all -> 0x02b8 }
            r10.A07 = r15     // Catch:{ all -> 0x02b8 }
            r14.A05(r10)     // Catch:{ all -> 0x02b8 }
            java.lang.String r0 = "image/webp"
            r10.A0E = r0     // Catch:{ all -> 0x02b8 }
            int r0 = (int) r1     // Catch:{ all -> 0x02b8 }
            r10.A00 = r0     // Catch:{ all -> 0x02b8 }
            X.C108945cZ.A1O(r10, r13)     // Catch:{ all -> 0x02b8 }
            r10.A0F = r11     // Catch:{ all -> 0x02b8 }
            r10.A0C = r11     // Catch:{ all -> 0x02b8 }
            r10.A0N = r12     // Catch:{ all -> 0x02b8 }
            r0 = 512(0x200, float:7.175E-43)
            r10.A02 = r0     // Catch:{ all -> 0x02b8 }
            r10.A03 = r0     // Catch:{ all -> 0x02b8 }
            goto L_0x02bd
        L_0x02b8:
            r0 = move-exception
            X.1IU r10 = X.C108945cZ.A1J(r0)
        L_0x02bd:
            java.lang.Throwable r1 = X.C30671eK.A00(r10)
            if (r1 == 0) goto L_0x02c8
            java.lang.String r0 = "AvatarStickerUtils/unable to recreate Avatar sticker from file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02c8:
            boolean r0 = r10 instanceof X.AnonymousClass1IU
            if (r0 != 0) goto L_0x02cd
            r3 = r10
        L_0x02cd:
            X.77d r3 = (X.C1418377d) r3
        L_0x02cf:
            if (r3 != 0) goto L_0x024b
            X.6E1 r0 = new X.6E1
            r0.<init>(r4)
            goto L_0x0250
        L_0x02d8:
            return r5
        L_0x02d9:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.avatars.AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarStickerLocatorImpl$locateAvatarStickersByStableId$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
