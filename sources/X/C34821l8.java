package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

/* renamed from: X.1l8  reason: invalid class name and case insensitive filesystem */
public final class C34821l8 {
    public final C25551Oq A00;
    public final C34831l9 A01;
    public final AnonymousClass11Q A02;

    public C34821l8(AnonymousClass11Q r3, C25551Oq r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        this.A00 = r4;
        this.A02 = r3;
        this.A01 = new C34831l9(r4, 1);
    }

    public static final C56152gz A00(Cursor cursor) {
        String str;
        Cursor cursor2 = cursor;
        C18070vi.A0d(cursor2, 0);
        int columnIndexOrThrow = cursor2.getColumnIndexOrThrow("local_path");
        byte[] bArr = null;
        if (!cursor2.isNull(columnIndexOrThrow)) {
            str = cursor2.getString(columnIndexOrThrow);
        } else {
            str = null;
        }
        byte[] blob = cursor2.getBlob(cursor2.getColumnIndexOrThrow("media_key"));
        if (blob != null && blob.length == 0) {
            blob = null;
        }
        String string = cursor2.getString(cursor2.getColumnIndexOrThrow("media_hash"));
        if (string == null || string.length() == 0) {
            string = null;
        }
        String string2 = cursor2.getString(cursor2.getColumnIndexOrThrow("direct_path"));
        if (string2 == null || string2.length() == 0) {
            string2 = null;
        }
        String string3 = cursor2.getString(cursor2.getColumnIndexOrThrow("media_enc_hash"));
        if (string3 == null || string3.length() == 0) {
            string3 = null;
        }
        int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow("inline_payload");
        if (!cursor2.isNull(columnIndexOrThrow2)) {
            bArr = cursor2.getBlob(columnIndexOrThrow2);
        }
        int i = cursor2.getInt(cursor2.getColumnIndexOrThrow("sync_type"));
        long j = cursor2.getLong(cursor2.getColumnIndexOrThrow("file_size"));
        int i2 = cursor2.getInt(cursor2.getColumnIndexOrThrow("chunk_order"));
        String string4 = cursor2.getString(cursor2.getColumnIndexOrThrow("message_id"));
        C18070vi.A0X(string4);
        return new C56152gz(str, string, string2, string3, string4, cursor2.getString(cursor2.getColumnIndexOrThrow("enc_handle")), blob, bArr, i, i2, j, cursor2.getLong(cursor2.getColumnIndexOrThrow("start_time")));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        X.CDX.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 0
            X.1Oq r0 = r6.A00
            X.1au r4 = r0.A06()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x001c }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x001c }
            java.lang.String r2 = "DELETE FROM history_sync_companion WHERE message_id=?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x001c }
            r1[r5] = r7     // Catch:{ all -> 0x001c }
            java.lang.String r0 = "HistorySyncCompanionStore.DELETE_CHUNK_BY_ID"
            r3.A0F(r2, r0, r1)     // Catch:{ all -> 0x001c }
            r4.close()
            return
        L_0x001c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001e }
        L_0x001e:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34821l8.A03(java.lang.String):void");
    }

    public static final void A01(C60042nI r3, C56152gz r4) {
        SQLiteStatement sQLiteStatement = r3.A00;
        sQLiteStatement.clearBindings();
        sQLiteStatement.bindString(1, r4.A09);
        sQLiteStatement.bindLong(2, (long) r4.A01);
        sQLiteStatement.bindLong(3, (long) r4.A00);
        byte[] bArr = r4.A0B;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sQLiteStatement.bindBlob(4, bArr);
        String str = r4.A08;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sQLiteStatement.bindString(5, str);
        String str3 = r4.A07;
        if (str3 == null) {
            str3 = str2;
        }
        sQLiteStatement.bindString(6, str3);
        String str4 = r4.A04;
        if (str4 != null) {
            str2 = str4;
        }
        sQLiteStatement.bindString(8, str2);
        sQLiteStatement.bindLong(7, r4.A02);
        sQLiteStatement.bindNull(9);
        sQLiteStatement.bindLong(10, r4.A03);
        byte[] bArr2 = r4.A0A;
        if (bArr2 == null) {
            sQLiteStatement.bindNull(11);
        } else {
            sQLiteStatement.bindBlob(11, bArr2);
        }
        String str5 = r4.A05;
        if (str5 == null) {
            sQLiteStatement.bindNull(12);
        } else {
            sQLiteStatement.bindString(12, str5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008c, code lost:
        if (r2 != null) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a9, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ac, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C56152gz A02() {
        /*
            r8 = this;
            java.lang.String r7 = "0"
            X.1Oq r4 = r8.A00
            X.1at r3 = r4.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00a6 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x00a6 }
            java.lang.String r5 = X.C50962Wl.A01     // Catch:{ all -> 0x00a6 }
            r0 = 5
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00a6 }
            r0 = 0
            r2[r0] = r7     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "1"
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "4"
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x00a6 }
            java.lang.String r1 = "5"
            r0 = 3
            r2[r0] = r1     // Catch:{ all -> 0x00a6 }
            r0 = 4
            r2[r0] = r7     // Catch:{ all -> 0x00a6 }
            java.lang.String r0 = "HistorySyncCompanionStore.SELECT_CHUNKS_BY_SYNC_TYPE_AND_CHUNK_ORDER"
            android.database.Cursor r2 = r6.A0A(r5, r0, r2)     // Catch:{ all -> 0x00a6 }
            r1 = 0
            if (r2 == 0) goto L_0x0045
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003a
            X.2gz r1 = A00(r2)     // Catch:{ all -> 0x003e }
        L_0x003a:
            r2.close()     // Catch:{ all -> 0x00a6 }
            goto L_0x0045
        L_0x003e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x00a6 }
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x0045:
            r3.close()
            if (r1 != 0) goto L_0x00a5
            X.11Q r0 = r8.A02
            org.json.JSONObject r7 = r0.A02()
            r6 = 0
            if (r7 != 0) goto L_0x0054
            return r6
        L_0x0054:
            X.1at r3 = r4.get()
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ JSONException -> 0x009c }
            X.1Ev r5 = r0.A02     // Catch:{ JSONException -> 0x009c }
            java.lang.String r4 = X.C50962Wl.A02     // Catch:{ JSONException -> 0x009c }
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ JSONException -> 0x009c }
            java.lang.String r0 = "sync_type"
            java.lang.String r1 = r7.getString(r0)     // Catch:{ JSONException -> 0x009c }
            r0 = 0
            r2[r0] = r1     // Catch:{ JSONException -> 0x009c }
            java.lang.String r0 = "chunk_order"
            java.lang.String r1 = r7.getString(r0)     // Catch:{ JSONException -> 0x009c }
            r0 = 1
            r2[r0] = r1     // Catch:{ JSONException -> 0x009c }
            java.lang.String r0 = "HistorySyncCompanionStore.SELECT_CHUNK_BY_SYNC_TYPE_AND_CHUNK_ORDER"
            android.database.Cursor r2 = r5.A0A(r4, r0, r2)     // Catch:{ JSONException -> 0x009c }
            if (r2 == 0) goto L_0x0085
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0095 }
            if (r0 != 0) goto L_0x0085
            r1 = r6
            goto L_0x008e
        L_0x0085:
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0095 }
            X.2gz r1 = A00(r2)     // Catch:{ all -> 0x0095 }
            if (r2 == 0) goto L_0x0091
        L_0x008e:
            r2.close()     // Catch:{ JSONException -> 0x009c }
        L_0x0091:
            r3.close()
            return r1
        L_0x0095:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ JSONException -> 0x009c }
            throw r0     // Catch:{ JSONException -> 0x009c }
        L_0x009c:
            java.lang.String r0 = "HistorySyncCompanionStore/ Could not read history sync state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00a6 }
            r3.close()
            return r6
        L_0x00a5:
            return r1
        L_0x00a6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34821l8.A02():X.2gz");
    }
}
