package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.72N  reason: invalid class name */
public final class AnonymousClass72N {
    public final C25311Ns A00;
    public final AnonymousClass118 A01;
    public final C131696lW A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public final int A02(String str) {
        C18070vi.A0d(str, 0);
        C17960vV.A00();
        return this.A02.A00(str);
    }

    public final AnonymousClass725 A03(String str) {
        C18070vi.A0d(str, 0);
        ArrayList A032 = AnonymousClass73Q.A03(A00(this), "SELECT installed_id, installed_name, installed_size, installed_image_data_hash, installed_publisher, installed_description, installed_tray_image_id, installed_tray_image_preview_id, installed_animated_pack, installed_is_avatar_pack, installed_lottie_pack, installed_pack_type, is_created_by_me, installed_empty_favorites_avatar_template_id, installed_empty_recents_avatar_template_id, id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs LEFT JOIN installed_sticker_packs ON (id = installed_id) WHERE id= ?", "getDownloadableStickerPacks/QUERY", C17880vN.A1a(str, 0));
        if (A032.isEmpty()) {
            return null;
        }
        if (A032.size() < 2) {
            return (AnonymousClass725) A032.get(0);
        }
        throw AnonymousClass000.A0n(AnonymousClass001.A1H("StickerPackStore/getDownloadablePackById/there should only be one sticker that matches this id: ", str, AnonymousClass000.A10()));
    }

    public final AnonymousClass725 A04(String str) {
        C18070vi.A0d(str, 0);
        ArrayList A022 = AnonymousClass73Q.A02(A00(this), str);
        if (A022.isEmpty()) {
            return null;
        }
        if (A022.size() < 2) {
            AnonymousClass725 r2 = (AnonymousClass725) A022.get(0);
            if (r2 == null) {
                return r2;
            }
            ArrayList A032 = ((C136886uZ) this.A07.get()).A03(str);
            ((AnonymousClass70H) this.A09.get()).A06(A032);
            r2.A07 = A032;
            return r2;
        }
        throw AnonymousClass000.A0n(AnonymousClass001.A1H("StickerPackStore/getInstalledPackById/there should only be one sticker that matches this id: ", str, AnonymousClass000.A10()));
    }

    public AnonymousClass72N(C25311Ns r1, AnonymousClass118 r2, C131696lW r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10) {
        C18070vi.A0w(r2, r4, r5, r6, r7);
        C18070vi.A0x(r8, r9, r10, r3, r1);
        this.A01 = r2;
        this.A03 = r4;
        this.A07 = r5;
        this.A09 = r6;
        this.A05 = r7;
        this.A08 = r8;
        this.A04 = r9;
        this.A06 = r10;
        this.A02 = r3;
        this.A00 = r1;
    }

    public static AnonymousClass73Q A00(AnonymousClass72N r0) {
        C17960vV.A00();
        return (AnonymousClass73Q) r0.A05.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0084, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0085, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0088, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0040, code lost:
        if (r3 <= 0) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.AnonymousClass725 r8, X.AnonymousClass72N r9, boolean r10) {
        /*
            X.73Q r0 = A00(r9)
            java.lang.String r2 = X.AnonymousClass725.A00(r8)
            r1 = 0
            X.00H r0 = r0.A00
            X.1au r6 = X.C108985cd.A0S(r0)
            java.lang.String r5 = "installed_id LIKE ?"
            java.lang.String[] r4 = X.C17880vN.A1a(r2, r1)     // Catch:{ all -> 0x0082 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0082 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "installed_sticker_packs"
            java.lang.String r0 = "deleteInstalledStickerPack/DELETE_INSTALLED_STICKER_PACK"
            int r3 = r3.A04(r1, r5, r0, r4)     // Catch:{ all -> 0x0082 }
            r6.close()
            X.00H r0 = r9.A07
            java.lang.Object r0 = r0.get()
            X.6uZ r0 = (X.C136886uZ) r0
            int r1 = r0.A00(r2)
            X.00H r0 = r9.A08
            java.lang.Object r0 = r0.get()
            X.6qY r0 = (X.C134416qY) r0
            r0.A01(r2)
            r7 = 1
            if (r1 <= 0) goto L_0x0042
            r8 = 1
            if (r3 > 0) goto L_0x0043
        L_0x0042:
            r8 = 0
        L_0x0043:
            if (r10 != 0) goto L_0x0081
            X.6lW r6 = r9.A02
            monitor-enter(r6)
            r1 = 0
            X.00H r0 = r6.A00     // Catch:{ all -> 0x007e }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x007e }
            X.5yf r0 = (X.C116815yf) r0     // Catch:{ all -> 0x007e }
            X.1au r5 = r0.A06()     // Catch:{ all -> 0x007e }
            java.lang.String r4 = "sticker_pack_id LIKE ?"
            java.lang.String[] r3 = new java.lang.String[r7]     // Catch:{ all -> 0x0077 }
            r3[r1] = r2     // Catch:{ all -> 0x0077 }
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0077 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0077 }
            java.lang.String r1 = "sticker_pack_order"
            java.lang.String r0 = "StickerPackOrderDBTableHelper/deleteRow/DELETE_STICKER_PACK_ORDER"
            int r0 = r2.A04(r1, r4, r0, r3)     // Catch:{ all -> 0x0077 }
            r5.close()     // Catch:{ all -> 0x007e }
            monitor-exit(r6)
            boolean r0 = X.AnonymousClass000.A1R(r0)
            if (r8 == 0) goto L_0x0075
            if (r0 == 0) goto L_0x0075
            return r7
        L_0x0075:
            r7 = 0
            return r7
        L_0x0077:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x007e }
            throw r0     // Catch:{ all -> 0x007e }
        L_0x007e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0081:
            return r8
        L_0x0082:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            X.CDX.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72N.A01(X.725, X.72N, boolean):boolean");
    }

    /* JADX WARNING: type inference failed for: r8v2, types: [X.6oW, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0146, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x014a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x014d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        X.CDX.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0151, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A05() {
        /*
            r12 = this;
            X.C17960vV.A00()
            X.00H r0 = r12.A04
            java.lang.Object r0 = r0.get()
            X.6fB r0 = (X.C127936fB) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "pref_key_preview_ids"
            r4 = 0
            java.lang.String r0 = r1.getString(r0, r4)
            if (r0 == 0) goto L_0x001e
            java.util.List r4 = X.C108995ce.A0c(r0)
        L_0x001e:
            if (r4 != 0) goto L_0x0022
            r0 = 0
            return r0
        L_0x0022:
            X.4rJ r1 = X.C29431cG.A15(r4)
            int r0 = X.C200510q.A00(r1)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x0033:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0047
            java.lang.Object r0 = r2.next()
            X.9rE r0 = (X.C194139rE) r0
            java.lang.Object r1 = r0.A01
            int r0 = r0.A00
            X.C17880vN.A1P(r1, r3, r0)
            goto L_0x0033
        L_0x0047:
            X.00H r0 = r12.A05
            java.lang.Object r5 = r0.get()
            X.73Q r5 = (X.AnonymousClass73Q) r5
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r2 = r4.toArray(r0)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 975(0x3cf, float:1.366E-42)
            X.23b r0 = new X.23b
            r0.<init>(r2, r1)
            X.DcQ r4 = X.AnonymousClass1ZT.A01()
            java.util.Iterator r11 = r0.iterator()
        L_0x0069:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x015d
            java.lang.Object r8 = r11.next()
            java.lang.String[] r8 = (java.lang.String[]) r8
            int r0 = r8.length
            java.lang.String r2 = X.AnonymousClass1H2.A00(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SELECT id, name, publisher, description, size, tray_image_id, preview_image_id_array, image_data_hash, tray_image_preview_id, animated_pack, lottie_pack FROM downloadable_sticker_packs WHERE "
            r1.append(r0)
            java.lang.String r0 = "id IN "
            java.lang.String r7 = X.AnonymousClass001.A1H(r0, r2, r1)
            X.C18070vi.A0X(r7)
            java.lang.String r1 = "getDownloadablePackByIds/QUERY_STICKER_PACK_IDS"
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            X.00H r0 = r5.A00     // Catch:{ IllegalArgumentException -> 0x0152 }
            X.1at r6 = X.C108975cc.A0F(r0)     // Catch:{ IllegalArgumentException -> 0x0152 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x014b }
            X.1Ev r0 = r0.A02     // Catch:{ all -> 0x014b }
            android.database.Cursor r7 = r0.A0A(r7, r1, r8)     // Catch:{ all -> 0x014b }
        L_0x00a1:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x013d
            X.6oW r8 = new X.6oW     // Catch:{ all -> 0x0144 }
            r8.<init>()     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "id"
            java.lang.String r10 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "name"
            java.lang.String r9 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "publisher"
            java.lang.String r1 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0144 }
            if (r10 == 0) goto L_0x012e
            int r0 = r10.length()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x012e
            if (r9 == 0) goto L_0x012e
            int r0 = r9.length()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x012e
            r8.A0E = r10     // Catch:{ all -> 0x0144 }
            r8.A0G = r9     // Catch:{ all -> 0x0144 }
            r8.A0I = r1     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "description"
            java.lang.String r0 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0144 }
            r8.A03 = r0     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "size"
            int r0 = X.C17890vO.A01(r7, r0)     // Catch:{ all -> 0x0144 }
            long r0 = (long) r0     // Catch:{ all -> 0x0144 }
            r8.A01 = r0     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "tray_image_id"
            java.lang.String r0 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0144 }
            r8.A0L = r0     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "image_data_hash"
            java.lang.String r0 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0144 }
            r8.A0F = r0     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "tray_image_preview_id"
            java.lang.String r0 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0144 }
            r8.A0M = r0     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "animated_pack"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0144 }
            boolean r0 = X.AnonymousClass24X.A01(r7, r0)     // Catch:{ all -> 0x0144 }
            r8.A0P = r0     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "lottie_pack"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0144 }
            boolean r0 = X.AnonymousClass24X.A01(r7, r0)     // Catch:{ all -> 0x0144 }
            r8.A0X = r0     // Catch:{ all -> 0x0144 }
            java.lang.String r0 = "preview_image_id_array"
            java.lang.String r1 = X.C17890vO.A0S(r7, r0)     // Catch:{ all -> 0x0144 }
            if (r1 == 0) goto L_0x0129
            int r0 = r1.length()     // Catch:{ all -> 0x0144 }
            if (r0 == 0) goto L_0x0129
            java.util.List r0 = X.C108995ce.A0c(r1)     // Catch:{ all -> 0x0144 }
            r8.A0N = r0     // Catch:{ all -> 0x0144 }
        L_0x0129:
            X.725 r0 = r8.A00()     // Catch:{ all -> 0x0144 }
            goto L_0x012f
        L_0x012e:
            r0 = 0
        L_0x012f:
            if (r0 == 0) goto L_0x0136
            r2.add(r0)     // Catch:{ all -> 0x0144 }
            goto L_0x00a1
        L_0x0136:
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDBTable/sticker pack is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0144 }
            goto L_0x00a1
        L_0x013d:
            r7.close()     // Catch:{ all -> 0x014b }
            r6.close()     // Catch:{ IllegalArgumentException -> 0x0152 }
            goto L_0x0158
        L_0x0144:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0146 }
        L_0x0146:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x014b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            X.CDX.A00(r6, r1)     // Catch:{ IllegalArgumentException -> 0x0152 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0152 }
        L_0x0152:
            r1 = move-exception
            java.lang.String r0 = "StickerPackStore/readStickerPackListFromDownloadableTable/exception"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0158:
            r4.addAll(r2)
            goto L_0x0069
        L_0x015d:
            X.DcQ r2 = X.AnonymousClass1ZT.A02(r4)
            r1 = 15
            X.7Rk r0 = new X.7Rk
            r0.<init>((java.util.Map) r3, (int) r1)
            java.util.List r0 = X.C29431cG.A0y(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass72N.A05():java.util.List");
    }

    public final void A06(AnonymousClass725 r3) {
        C17960vV.A00();
        A01(r3, this, true);
        ((AnonymousClass73Q) this.A05.get()).A04(r3);
        List list = r3.A07;
        C18070vi.A0X(list);
        if (true ^ list.isEmpty()) {
            List list2 = r3.A07;
            C18070vi.A0X(list2);
            ((C136886uZ) this.A07.get()).A04(list2);
        }
        r3.A00 = this.A02.A00(AnonymousClass725.A00(r3));
    }
}
