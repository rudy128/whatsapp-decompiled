package X;

import android.database.Cursor;
import java.util.LinkedList;

/* renamed from: X.702  reason: invalid class name */
public class AnonymousClass702 {
    public final AnonymousClass00H A00;

    public AnonymousClass702(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r7 = 0
            boolean r6 = X.C18070vi.A17(r9, r10)
            X.00H r0 = r8.A00
            X.1at r4 = X.C108975cc.A0F(r0)
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0045 }
            X.1Ev r5 = r0.A02     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "SELECT COUNT(*) AS count FROM third_party_whitelist_packs WHERE authority= ? AND sticker_pack_id= ?"
            java.lang.String[] r2 = X.C17880vN.A1Z()     // Catch:{ all -> 0x0045 }
            r1 = 0
            r2[r7] = r9     // Catch:{ all -> 0x0045 }
            r2[r6] = r10     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = "checkExistence/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            android.database.Cursor r2 = r5.A0A(r3, r0, r2)     // Catch:{ all -> 0x0045 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = "count"
            int r0 = X.C17890vO.A01(r2, r0)     // Catch:{ all -> 0x003e }
            if (r0 <= 0) goto L_0x0030
            r1 = 1
        L_0x0030:
            r2.close()     // Catch:{ all -> 0x0045 }
            r4.close()
            return r1
        L_0x0037:
            r2.close()     // Catch:{ all -> 0x0045 }
            r4.close()
            return r7
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0045 }
            throw r0     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0047 }
        L_0x0047:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass702.A04(java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0051, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.AnonymousClass725 r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            java.lang.String r1 = "authority"
            X.00H r0 = r7.A00
            X.1au r4 = X.C108985cd.A0S(r0)
            android.content.ContentValues r6 = X.C17880vN.A08()     // Catch:{ all -> 0x004e }
            r6.put(r1, r9)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "sticker_pack_id"
            r6.put(r0, r10)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "sticker_pack_name"
            java.lang.String r0 = r8.A04     // Catch:{ all -> 0x004e }
            r6.put(r1, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "sticker_pack_publisher"
            java.lang.String r0 = r8.A0K     // Catch:{ all -> 0x004e }
            r6.put(r1, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r0 = "sticker_pack_image_data_hash"
            java.lang.String r5 = r8.A0I     // Catch:{ all -> 0x004e }
            r6.put(r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "avoid_cache"
            boolean r0 = r8.A0P     // Catch:{ all -> 0x004e }
            X.C50072Ta.A00(r6, r1, r0)     // Catch:{ all -> 0x004e }
            java.lang.String r1 = "is_animated_pack"
            boolean r0 = r8.A0Q     // Catch:{ all -> 0x004e }
            X.C50072Ta.A00(r6, r1, r0)     // Catch:{ all -> 0x004e }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x004e }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "third_party_whitelist_packs"
            java.lang.String r1 = "whitelistPack/INSERT_THIRD_PARTY_WHITELIST_PACKS"
            r0 = 5
            r3.A09(r2, r1, r6, r0)     // Catch:{ all -> 0x004e }
            long r0 = r8.A02     // Catch:{ all -> 0x004e }
            r8.A01 = r0     // Catch:{ all -> 0x004e }
            r8.A03 = r5     // Catch:{ all -> 0x004e }
            r4.close()
            return
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass702.A03(X.725, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6oW, java.lang.Object] */
    public static final AnonymousClass725 A00(Cursor cursor, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        String string = cursor.getString(i3);
        String str = "";
        if (string == null) {
            string = str;
        }
        String string2 = cursor.getString(i4);
        if (string2 != null) {
            str = string2;
        }
        ? obj = new Object();
        obj.A0E = C137416vQ.A01(cursor.getString(i), cursor.getString(i2));
        obj.A0G = string;
        obj.A0I = str;
        obj.A0O = new LinkedList();
        obj.A0N = new LinkedList();
        obj.A0Z = true;
        if (i5 > 0) {
            String string3 = cursor.getString(i5);
            obj.A06 = string3;
            obj.A0F = string3;
        }
        if (i6 > 0) {
            obj.A0Q = AnonymousClass24X.A01(cursor, i6);
        }
        if (i7 > 0) {
            boolean A01 = AnonymousClass24X.A01(cursor, i7);
            obj.A0R = A01;
            obj.A0P = A01;
        }
        return new AnonymousClass725(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0063, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A01() {
        /*
            r11 = this;
            java.util.ArrayList r1 = X.AnonymousClass000.A13()
            X.00H r0 = r11.A00
            X.1at r2 = X.C108975cc.A0F(r0)
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x005d }
            X.1Ev r4 = r0.A02     // Catch:{ all -> 0x005d }
            java.lang.String r3 = "SELECT authority, sticker_pack_id, sticker_pack_name, sticker_pack_publisher, sticker_pack_image_data_hash, avoid_cache, is_animated_pack FROM third_party_whitelist_packs"
            java.lang.String r0 = "getCachedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            android.database.Cursor r3 = X.C23141Ev.A00(r4, r3, r0)     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "authority"
            int r4 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "sticker_pack_id"
            int r5 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "sticker_pack_name"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "sticker_pack_publisher"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "sticker_pack_image_data_hash"
            int r8 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "avoid_cache"
            int r9 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = "is_animated_pack"
            int r10 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0056 }
        L_0x0041:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x004f
            X.725 r0 = A00(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0056 }
            r1.add(r0)     // Catch:{ all -> 0x0056 }
            goto L_0x0041
        L_0x004f:
            r3.close()     // Catch:{ all -> 0x005d }
            r2.close()
            return r1
        L_0x0056:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x005d }
            throw r0     // Catch:{ all -> 0x005d }
        L_0x005d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass702.A01():java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList A02() {
        /*
            r7 = this;
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            X.00H r0 = r7.A00
            X.1at r5 = X.C108975cc.A0F(r0)
            r0 = r5
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0043 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = "SELECT authority, sticker_pack_id FROM third_party_whitelist_packs"
            java.lang.String r0 = "getWhitelistedPacks/QUERY_THIRD_PARTY_WHITELIST_PACKS"
            android.database.Cursor r4 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "authority"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = "sticker_pack_id"
            int r2 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003c }
        L_0x0023:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x003c }
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = r4.getString(r3)     // Catch:{ all -> 0x003c }
            java.lang.String r0 = r4.getString(r2)     // Catch:{ all -> 0x003c }
            X.C108965cb.A1Q(r1, r0, r6)     // Catch:{ all -> 0x003c }
            goto L_0x0023
        L_0x0035:
            r4.close()     // Catch:{ all -> 0x0043 }
            r5.close()
            return r6
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.CDX.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass702.A02():java.util.ArrayList");
    }
}
