package X;

import android.database.Cursor;
import java.util.ArrayList;

/* renamed from: X.6uZ  reason: invalid class name and case insensitive filesystem */
public final class C136886uZ {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0024, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        X.CDX.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(java.lang.String r7) {
        /*
            r6 = this;
            r1 = 0
            X.00H r0 = r6.A01
            X.1au r5 = X.C108985cd.A0S(r0)
            java.lang.String r4 = "sticker_pack_id LIKE ?"
            java.lang.String[] r3 = X.C17880vN.A1a(r7, r1)     // Catch:{ all -> 0x001e }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x001e }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x001e }
            java.lang.String r1 = "stickers"
            java.lang.String r0 = "deleteAllStickersOfStickerPack/DELETE_STICKER"
            int r0 = r2.A04(r1, r4, r0, r3)     // Catch:{ all -> 0x001e }
            r5.close()
            return r0
        L_0x001e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136886uZ.A00(java.lang.String):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0039, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C1418377d A01(java.lang.String r8) {
        /*
            r7 = this;
            r6 = 0
            r5 = 0
            X.00H r0 = r7.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
            X.1at r4 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x003e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x003e }
            java.lang.String r2 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM stickers WHERE avatar_template_id = ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r8, r6)     // Catch:{ all -> 0x003e }
            java.lang.String r0 = "getByPackId/QUERY_STICKER"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x003e }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0037 }
            java.util.ArrayList r1 = r7.A02(r2)     // Catch:{ all -> 0x0037 }
            boolean r0 = X.C17880vN.A1X(r1)     // Catch:{ all -> 0x0037 }
            if (r0 == 0) goto L_0x002d
            java.lang.Object r0 = r1.get(r6)     // Catch:{ all -> 0x0037 }
            X.77d r0 = (X.C1418377d) r0     // Catch:{ all -> 0x0037 }
            goto L_0x002e
        L_0x002d:
            r0 = r5
        L_0x002e:
            if (r2 == 0) goto L_0x0033
            r2.close()     // Catch:{ all -> 0x003e }
        L_0x0033:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
            return r0
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
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getByPackId"
            com.whatsapp.util.Log.e(r0, r1)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136886uZ.A01(java.lang.String):X.77d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A03(java.lang.String r6) {
        /*
            r5 = this;
            r1 = 0
            X.00H r0 = r5.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
            X.1at r4 = X.C108975cc.A0F(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002f }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x002f }
            java.lang.String r2 = "SELECT plain_file_hash, encrypted_file_hash, media_key, mime_type, height, width, sticker_pack_id, file_path, url, file_size, direct_path, emojis, hash_of_image_part, is_avatar, avatar_template_id, is_fun_sticker, is_lottie, accessibility_text FROM stickers WHERE sticker_pack_id = ?"
            java.lang.String[] r1 = X.C17880vN.A1a(r6, r1)     // Catch:{ all -> 0x002f }
            java.lang.String r0 = "getByPackId/QUERY_STICKER"
            android.database.Cursor r2 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x002f }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0028 }
            java.util.ArrayList r0 = r5.A02(r2)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0024
            r2.close()     // Catch:{ all -> 0x002f }
        L_0x0024:
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
            return r0
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x002f }
            throw r0     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0036 }
        L_0x0036:
            r1 = move-exception
            java.lang.String r0 = "StickerDBTableHelper/getByPackId"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136886uZ.A03(java.lang.String):java.util.ArrayList");
    }

    public final ArrayList A02(Cursor cursor) {
        Cursor cursor2 = cursor;
        ArrayList A0s = C72463Mc.A0s(cursor2);
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("plain_file_hash");
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("encrypted_file_hash");
        int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow("media_key");
        int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow("mime_type");
        int columnIndexOrThrow5 = cursor2.getColumnIndexOrThrow("height");
        int columnIndexOrThrow6 = cursor2.getColumnIndexOrThrow("width");
        int columnIndexOrThrow7 = cursor2.getColumnIndexOrThrow("sticker_pack_id");
        int columnIndexOrThrow8 = cursor2.getColumnIndexOrThrow("file_path");
        int columnIndexOrThrow9 = cursor2.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow10 = cursor2.getColumnIndexOrThrow("url");
        int columnIndexOrThrow11 = cursor2.getColumnIndexOrThrow("direct_path");
        int columnIndexOrThrow12 = cursor2.getColumnIndexOrThrow("emojis");
        int columnIndexOrThrow13 = cursor2.getColumnIndexOrThrow("hash_of_image_part");
        int columnIndexOrThrow14 = cursor2.getColumnIndexOrThrow("is_avatar");
        int columnIndexOrThrow15 = cursor2.getColumnIndexOrThrow("avatar_template_id");
        int columnIndexOrThrow16 = cursor2.getColumnIndexOrThrow("is_fun_sticker");
        int columnIndexOrThrow17 = cursor2.getColumnIndexOrThrow("is_lottie");
        int columnIndexOrThrow18 = cursor2.getColumnIndexOrThrow("accessibility_text");
        while (cursor2.moveToNext()) {
            C1418377d A0a = C108985cd.A0a();
            A0a.A0F = cursor2.getString(columnIndexOrThrow);
            A0a.A0A = cursor2.getString(columnIndexOrThrow2);
            A0a.A0D = cursor2.getString(columnIndexOrThrow3);
            A0a.A0E = cursor2.getString(columnIndexOrThrow4);
            A0a.A02 = cursor2.getInt(columnIndexOrThrow5);
            A0a.A03 = cursor2.getInt(columnIndexOrThrow6);
            A0a.A0H = cursor2.getString(columnIndexOrThrow7);
            A0a.A0B = cursor2.getString(columnIndexOrThrow8);
            A0a.A01 = 1;
            A0a.A00 = cursor2.getInt(columnIndexOrThrow9);
            A0a.A0I = cursor2.getString(columnIndexOrThrow10);
            A0a.A08 = cursor2.getString(columnIndexOrThrow11);
            A0a.A09 = cursor2.getString(columnIndexOrThrow12);
            A0a.A0C = cursor2.getString(columnIndexOrThrow13);
            A0a.A0N = AnonymousClass24X.A01(cursor2, columnIndexOrThrow14);
            A0a.A07 = cursor2.getString(columnIndexOrThrow15);
            A0a.A0J = AnonymousClass24X.A01(cursor2, columnIndexOrThrow16);
            A0a.A0Q = AnonymousClass24X.A01(cursor2, columnIndexOrThrow17);
            A0a.A06 = cursor2.getString(columnIndexOrThrow18);
            AnonymousClass70H.A00(A0a, this.A00);
            A0s.add(A0a);
        }
        return A0s;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00dd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.util.List r9) {
        /*
            r8 = this;
            X.00H r0 = r8.A01
            X.1au r3 = X.C108985cd.A0S(r0)
            X.1xA r4 = r3.BD0()     // Catch:{ all -> 0x00d7 }
            java.util.Iterator r7 = r9.iterator()     // Catch:{ all -> 0x00d0 }
        L_0x000e:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00c6
            X.77d r2 = X.C108945cZ.A0x(r7)     // Catch:{ all -> 0x00d0 }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00d0 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00d0 }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x00d0 }
            android.content.ContentValues r5 = X.C17880vN.A08()     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "plain_file_hash"
            java.lang.String r0 = r2.A0F     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "encrypted_file_hash"
            java.lang.String r0 = r2.A0A     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "media_key"
            java.lang.String r0 = r2.A0D     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "mime_type"
            java.lang.String r0 = r2.A0E     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            int r0 = r2.A02     // Catch:{ all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "height"
            r5.put(r0, r1)     // Catch:{ all -> 0x00d0 }
            int r0 = r2.A03     // Catch:{ all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "width"
            r5.put(r0, r1)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "sticker_pack_id"
            java.lang.String r0 = r2.A0H     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "file_path"
            java.lang.String r0 = r2.A0B     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            int r0 = r2.A00     // Catch:{ all -> 0x00d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "file_size"
            r5.put(r0, r1)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "url"
            java.lang.String r0 = r2.A0I     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "direct_path"
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "emojis"
            java.lang.String r0 = r2.A09     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "hash_of_image_part"
            java.lang.String r0 = r2.A0C     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            boolean r0 = r2.A0N     // Catch:{ all -> 0x00d0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "is_avatar"
            r5.put(r0, r1)     // Catch:{ all -> 0x00d0 }
            boolean r0 = r2.A0J     // Catch:{ all -> 0x00d0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "is_fun_sticker"
            r5.put(r0, r1)     // Catch:{ all -> 0x00d0 }
            boolean r0 = r2.A02()     // Catch:{ all -> 0x00d0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "is_lottie"
            r5.put(r0, r1)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "avatar_template_id"
            java.lang.String r0 = r2.A07     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "accessibility_text"
            java.lang.String r0 = r2.A06     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            r2 = 5
            java.lang.String r1 = "insertStickerToDB/INSERT_STICKER"
            java.lang.String r0 = "stickers"
            r6.A09(r0, r1, r5, r2)     // Catch:{ all -> 0x00d0 }
            goto L_0x000e
        L_0x00c6:
            r4.A00()     // Catch:{ all -> 0x00d0 }
            r4.close()     // Catch:{ all -> 0x00d7 }
            r3.close()
            return
        L_0x00d0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C136886uZ.A04(java.util.List):void");
    }

    public C136886uZ(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
