package X;

import android.content.ContentValues;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.73Q  reason: invalid class name */
public final class AnonymousClass73Q {
    public final AnonymousClass00H A00;
    public final AnonymousClass190 A01;

    public static final ArrayList A01(AnonymousClass73Q r4, int i) {
        if (i == 0) {
            return A03(r4, "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_pack_type, is_created_by_me, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)", "getInstalledStickerPacks/QUERY", (String[]) null);
        }
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        }
        String[] strArr = new String[1];
        C17880vN.A1S(strArr, i2, 0);
        return A03(r4, "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_pack_type, is_created_by_me, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id) WHERE installed_is_avatar_pack = ?", "getInstalledStickerPacks/QUERY", strArr);
    }

    public static final ArrayList A02(AnonymousClass73Q r3, String str) {
        String[] A1b;
        String str2;
        if (str == null) {
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_pack_type, is_created_by_me, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id)";
            A1b = null;
        } else {
            A1b = C108975cc.A1b(str);
            str2 = "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_pack_type, is_created_by_me, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM installed_sticker_packs LEFT JOIN downloadable_sticker_packs ON (installed_id = id) WHERE installed_id= ?";
        }
        return A03(r3, str2, "getInstalledStickerPacks/QUERY", A1b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00ac, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.AnonymousClass725 r8) {
        /*
            r7 = this;
            X.00H r0 = r7.A00
            X.1au r3 = X.C108985cd.A0S(r0)
            X.1xA r4 = r3.BD0()     // Catch:{ all -> 0x00ad }
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a6 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00a6 }
            X.C18070vi.A0X(r6)     // Catch:{ all -> 0x00a6 }
            android.content.ContentValues r5 = X.C17880vN.A08()     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_id"
            java.lang.String r0 = r8.A0H     // Catch:{ all -> 0x00a6 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_name"
            java.lang.String r0 = r8.A04     // Catch:{ all -> 0x00a6 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_description"
            java.lang.String r0 = r8.A0D     // Catch:{ all -> 0x00a6 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_publisher"
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x00a6 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            long r0 = r8.A02     // Catch:{ all -> 0x00a6 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "installed_size"
            r5.put(r0, r1)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_image_data_hash"
            java.lang.String r0 = r8.A0I     // Catch:{ all -> 0x00a6 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = r8.A0M     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_tray_image_id"
            if (r0 == 0) goto L_0x004d
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
        L_0x004d:
            java.lang.String r0 = r8.A05     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0054
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
        L_0x0054:
            java.lang.String r1 = "installed_tray_image_preview_id"
            java.lang.String r0 = r8.A0N     // Catch:{ all -> 0x00a6 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_animated_pack"
            boolean r0 = r8.A0O     // Catch:{ all -> 0x00a6 }
            X.C50072Ta.A00(r5, r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_is_avatar_pack"
            boolean r0 = r8.A0S     // Catch:{ all -> 0x00a6 }
            X.C50072Ta.A00(r5, r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_lottie_pack"
            boolean r0 = r8.A0X     // Catch:{ all -> 0x00a6 }
            X.C50072Ta.A00(r5, r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "is_created_by_me"
            boolean r0 = r8.A0T     // Catch:{ all -> 0x00a6 }
            X.C50072Ta.A00(r5, r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_pack_type"
            boolean r0 = r8.A0W     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x009c
            java.lang.String r0 = "third_party"
        L_0x007f:
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_empty_favorites_avatar_template_id"
            java.lang.String r0 = r8.A0E     // Catch:{ all -> 0x00a6 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "installed_empty_recents_avatar_template_id"
            java.lang.String r0 = r8.A0F     // Catch:{ all -> 0x00a6 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00a6 }
            r2 = 5
            java.lang.String r1 = "insertStickerPackToInstalledTable/INSERT_INSTALLED_STICKER_PACK"
            java.lang.String r0 = "installed_sticker_packs"
            r6.A09(r0, r1, r5, r2)     // Catch:{ all -> 0x00a6 }
            r4.A00()     // Catch:{ all -> 0x00a6 }
            goto L_0x009f
        L_0x009c:
            java.lang.String r0 = "first_party"
            goto L_0x007f
        L_0x009f:
            r4.close()     // Catch:{ all -> 0x00ad }
            r3.close()
            return
        L_0x00a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73Q.A04(X.725):void");
    }

    public AnonymousClass73Q(AnonymousClass190 r1, AnonymousClass00H r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    public static final ContentValues A00(AnonymousClass725 r3) {
        ContentValues A08 = C17880vN.A08();
        A08.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.A0H);
        A08.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r3.A04);
        A08.put("description", r3.A0D);
        A08.put("publisher", r3.A0K);
        A08.put("size", Long.valueOf(r3.A02));
        A08.put("tray_image_id", r3.A0M);
        A08.put("tray_image_preview_id", r3.A0N);
        A08.put("image_data_hash", r3.A0I);
        List list = r3.A06;
        C18070vi.A0X(list);
        if (AnonymousClass000.A1a(list)) {
            List list2 = r3.A06;
            C18070vi.A0X(list2);
            A08.put("preview_image_id_array", C108995ce.A0X(",", list2));
        }
        C50072Ta.A00(A08, "animated_pack", r3.A0O);
        C50072Ta.A00(A08, "lottie_pack", r3.A0X);
        return A08;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.6oW, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x020c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0210, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0213, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0217, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0105 A[ADDED_TO_REGION, Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x011d A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01f7 A[Catch:{ all -> 0x020c }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01fc A[Catch:{ all -> 0x020c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.ArrayList A03(X.AnonymousClass73Q r37, java.lang.String r38, java.lang.String r39, java.lang.String[] r40) {
        /*
            java.util.ArrayList r11 = X.AnonymousClass000.A13()
            r0 = r37
            X.00H r0 = r0.A00     // Catch:{ IllegalArgumentException -> 0x0218 }
            X.1at r10 = X.C108975cc.A0F(r0)     // Catch:{ IllegalArgumentException -> 0x0218 }
            r0 = r10
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0211 }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x0211 }
            r3 = r38
            r2 = r39
            r1 = r40
            android.database.Cursor r9 = r0.A0A(r3, r2, r1)     // Catch:{ all -> 0x0211 }
            X.C18070vi.A0b(r9)     // Catch:{ all -> 0x020a }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "id"
            int r36 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "name"
            int r35 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "publisher"
            int r34 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "description"
            int r33 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "size"
            int r32 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "tray_image_id"
            int r8 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "tray_image_preview_id"
            int r31 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "preview_image_id_array"
            int r30 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "image_data_hash"
            int r29 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "animated_pack"
            int r28 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "lottie_pack"
            int r27 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_id"
            int r26 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_name"
            int r25 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_publisher"
            int r24 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_description"
            int r23 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_size"
            int r7 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_image_data_hash"
            int r6 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_tray_image_id"
            int r5 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_tray_image_preview_id"
            int r22 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_animated_pack"
            int r21 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_is_avatar_pack"
            int r20 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_lottie_pack"
            int r19 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_pack_type"
            int r18 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "is_created_by_me"
            int r17 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_empty_recents_avatar_template_id"
            int r15 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "installed_empty_favorites_avatar_template_id"
            int r14 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x020a }
        L_0x00be:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x0203
            X.6oW r4 = new X.6oW     // Catch:{ all -> 0x020a }
            r4.<init>()     // Catch:{ all -> 0x020a }
            r0 = r36
            java.lang.String r2 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r0 = r35
            java.lang.String r1 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r0 = r34
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r3 = r26
            java.lang.String r13 = r9.getString(r3)     // Catch:{ all -> 0x020a }
            r3 = r25
            java.lang.String r12 = r9.getString(r3)     // Catch:{ all -> 0x020a }
            r3 = r24
            java.lang.String r3 = r9.getString(r3)     // Catch:{ all -> 0x020a }
            if (r2 == 0) goto L_0x00f5
            int r16 = r2.length()     // Catch:{ all -> 0x020a }
            if (r16 != 0) goto L_0x00fe
        L_0x00f5:
            if (r13 == 0) goto L_0x0101
            int r16 = r13.length()     // Catch:{ all -> 0x020a }
            if (r16 != 0) goto L_0x00fe
            goto L_0x0101
        L_0x00fe:
            r16 = 0
            goto L_0x0103
        L_0x0101:
            r16 = 1
        L_0x0103:
            if (r16 != 0) goto L_0x01f4
            if (r1 == 0) goto L_0x010d
            int r16 = r1.length()     // Catch:{ all -> 0x020a }
            if (r16 != 0) goto L_0x0116
        L_0x010d:
            if (r12 == 0) goto L_0x0119
            int r16 = r12.length()     // Catch:{ all -> 0x020a }
            if (r16 != 0) goto L_0x0116
            goto L_0x0119
        L_0x0116:
            r16 = 0
            goto L_0x011b
        L_0x0119:
            r16 = 1
        L_0x011b:
            if (r16 != 0) goto L_0x01f4
            r4.A0E = r2     // Catch:{ all -> 0x020a }
            r4.A0G = r1     // Catch:{ all -> 0x020a }
            r4.A0I = r0     // Catch:{ all -> 0x020a }
            r0 = r33
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r4.A03 = r0     // Catch:{ all -> 0x020a }
            r0 = r32
            int r0 = r9.getInt(r0)     // Catch:{ all -> 0x020a }
            long r0 = (long) r0     // Catch:{ all -> 0x020a }
            r4.A01 = r0     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r9.getString(r8)     // Catch:{ all -> 0x020a }
            r4.A0L = r0     // Catch:{ all -> 0x020a }
            r0 = r29
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r4.A0F = r0     // Catch:{ all -> 0x020a }
            r0 = r31
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r4.A0M = r0     // Catch:{ all -> 0x020a }
            r0 = r28
            boolean r0 = X.AnonymousClass24X.A01(r9, r0)     // Catch:{ all -> 0x020a }
            r4.A0P = r0     // Catch:{ all -> 0x020a }
            r0 = r27
            boolean r0 = X.AnonymousClass24X.A01(r9, r0)     // Catch:{ all -> 0x020a }
            r4.A0X = r0     // Catch:{ all -> 0x020a }
            r0 = r30
            java.lang.String r1 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r2 = 1
            if (r1 == 0) goto L_0x016f
            int r0 = r1.length()     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x016f
            java.util.List r0 = X.C108985cd.A0s(r1, r2)     // Catch:{ all -> 0x020a }
            r4.A0N = r0     // Catch:{ all -> 0x020a }
        L_0x016f:
            r0 = r18
            java.lang.String r1 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            java.lang.String r0 = "third_party"
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x020a }
            if (r0 == 0) goto L_0x0198
            r4.A0Z = r2     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r9.getString(r6)     // Catch:{ all -> 0x020a }
            r4.A0F = r0     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r9.getString(r8)     // Catch:{ all -> 0x020a }
            r4.A0L = r0     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r9.getString(r5)     // Catch:{ all -> 0x020a }
            r4.A0K = r0     // Catch:{ all -> 0x020a }
            int r0 = r9.getInt(r7)     // Catch:{ all -> 0x020a }
            long r0 = (long) r0     // Catch:{ all -> 0x020a }
            r4.A01 = r0     // Catch:{ all -> 0x020a }
        L_0x0198:
            r4.A05 = r13     // Catch:{ all -> 0x020a }
            r4.A07 = r12     // Catch:{ all -> 0x020a }
            r0 = r23
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r4.A04 = r0     // Catch:{ all -> 0x020a }
            r4.A08 = r3     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r9.getString(r6)     // Catch:{ all -> 0x020a }
            r4.A06 = r0     // Catch:{ all -> 0x020a }
            int r0 = r9.getInt(r7)     // Catch:{ all -> 0x020a }
            long r0 = (long) r0     // Catch:{ all -> 0x020a }
            r4.A00 = r0     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r9.getString(r5)     // Catch:{ all -> 0x020a }
            r4.A09 = r0     // Catch:{ all -> 0x020a }
            r0 = r22
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x020a }
            r4.A0A = r0     // Catch:{ all -> 0x020a }
            r0 = r21
            boolean r0 = X.AnonymousClass24X.A01(r9, r0)     // Catch:{ all -> 0x020a }
            r4.A0R = r0     // Catch:{ all -> 0x020a }
            r0 = r20
            boolean r0 = X.AnonymousClass24X.A01(r9, r0)     // Catch:{ all -> 0x020a }
            r4.A0S = r0     // Catch:{ all -> 0x020a }
            r0 = r19
            boolean r0 = X.AnonymousClass24X.A01(r9, r0)     // Catch:{ all -> 0x020a }
            r4.A0U = r0     // Catch:{ all -> 0x020a }
            r0 = r17
            boolean r0 = X.AnonymousClass24X.A01(r9, r0)     // Catch:{ all -> 0x020a }
            r4.A0T = r0     // Catch:{ all -> 0x020a }
            r4.A0W = r2     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r9.getString(r14)     // Catch:{ all -> 0x020a }
            r4.A0B = r0     // Catch:{ all -> 0x020a }
            java.lang.String r0 = r9.getString(r15)     // Catch:{ all -> 0x020a }
            r4.A0C = r0     // Catch:{ all -> 0x020a }
            X.725 r0 = r4.A00()     // Catch:{ all -> 0x020a }
            goto L_0x01f5
        L_0x01f4:
            r0 = 0
        L_0x01f5:
            if (r0 == 0) goto L_0x01fc
            r11.add(r0)     // Catch:{ all -> 0x020a }
            goto L_0x00be
        L_0x01fc:
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDBTable/sticker pack is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x020a }
            goto L_0x00be
        L_0x0203:
            r9.close()     // Catch:{ all -> 0x0211 }
            r10.close()     // Catch:{ IllegalArgumentException -> 0x0218 }
            return r11
        L_0x020a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x020c }
        L_0x020c:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ all -> 0x0211 }
            throw r0     // Catch:{ all -> 0x0211 }
        L_0x0211:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0213 }
        L_0x0213:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ IllegalArgumentException -> 0x0218 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0218 }
        L_0x0218:
            r3 = move-exception
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDBTable/exception"
            com.whatsapp.util.Log.e(r0, r3)
            r0 = r37
            X.190 r2 = r0.A01
            java.lang.String r1 = r3.getMessage()
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDBTable/"
            r2.A0E(r0, r1, r3)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73Q.A03(X.73Q, java.lang.String, java.lang.String, java.lang.String[]):java.util.ArrayList");
    }
}
