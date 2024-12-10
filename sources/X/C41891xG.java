package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.PhoneUserJid;
import java.util.ArrayList;

/* renamed from: X.1xG  reason: invalid class name and case insensitive filesystem */
public final class C41891xG {
    public final AnonymousClass190 A00;
    public final AnonymousClass1DL A01;
    public final AnonymousClass1Cd A02;
    public final C24751Ln A03;
    public final AnonymousClass1NG A04;

    public C41891xG(AnonymousClass190 r2, AnonymousClass1DL r3, AnonymousClass1Cd r4, C24751Ln r5, AnonymousClass1NG r6) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r4, 4);
        C18070vi.A0d(r6, 5);
        this.A01 = r3;
        this.A00 = r2;
        this.A03 = r5;
        this.A02 = r4;
        this.A04 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x002d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0031, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02() {
        /*
            r5 = this;
            r3 = 0
            X.1Cd r0 = r5.A02     // Catch:{ all -> 0x0032 }
            X.1at r4 = r0.get()     // Catch:{ all -> 0x0032 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x002b }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "SELECT _id, jid_row_id, favorite_type, sort_order FROM favorite ORDER BY sort_order ASC"
            java.lang.String r0 = "FavoriteStore/FAVORITE_GET_ALL_FAVORITES"
            android.database.Cursor r2 = r2.A0A(r1, r0, r3)     // Catch:{ all -> 0x002b }
            X.C18070vi.A0b(r2)     // Catch:{ all -> 0x0024 }
            java.util.ArrayList r0 = A01(r2, r5)     // Catch:{ all -> 0x0024 }
            if (r2 == 0) goto L_0x0020
            r2.close()     // Catch:{ all -> 0x002b }
        L_0x0020:
            r4.close()     // Catch:{ all -> 0x0032 }
            return r0
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x002b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            X.CDX.A00(r4, r1)     // Catch:{ all -> 0x0032 }
            throw r0     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r2 = move-exception
            java.lang.String r0 = "FavoriteStore/getAllFavorites failed to retrieve all favorites"
            com.whatsapp.util.Log.e(r0, r2)
            X.190 r1 = r5.A00
            java.lang.String r0 = "FavoriteStore/getAllFavorites"
            r1.A0E(r0, r3, r2)
            X.0wS r0 = X.C18460wS.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41891xG.A02():java.util.List");
    }

    public static final ContentValues A00(C62482rT r7, C41891xG r8) {
        AnonymousClass1BI r2 = r7.A03;
        AnonymousClass1BI r1 = r2;
        if ((r2 instanceof AnonymousClass1E2) && r8.A04.A04()) {
            r1 = r8.A03.A0D((AnonymousClass1E1) r1);
        }
        AnonymousClass1DL r0 = r8.A01;
        if (r1 == null) {
            r1 = r2;
        }
        long A09 = r0.A09(r1);
        int i = r7.A02.value;
        int i2 = r7.A00;
        ContentValues contentValues = new ContentValues();
        contentValues.put("jid_row_id", Long.valueOf(A09));
        contentValues.put("favorite_type", Integer.valueOf(i));
        contentValues.put("sort_order", Integer.valueOf(i2));
        return contentValues;
    }

    public static final ArrayList A01(Cursor cursor, C41891xG r16) {
        C49512Qt r10;
        ArrayList arrayList = new ArrayList();
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("jid_row_id");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("favorite_type");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("sort_order");
        while (cursor.moveToNext()) {
            long j = cursor.getLong(columnIndexOrThrow);
            C41891xG r8 = r16;
            AnonymousClass1BI r11 = (AnonymousClass1BI) r8.A01.A0E(AnonymousClass1BI.class, cursor.getLong(columnIndexOrThrow2));
            if (r11 != null) {
                if ((r11 instanceof PhoneUserJid) && r8.A04.A04()) {
                    r11 = r8.A03.A0A((PhoneUserJid) r11);
                }
                int i = cursor.getInt(columnIndexOrThrow3);
                C49512Qt[] values = C49512Qt.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        r10 = C49512Qt.NONE;
                        break;
                    }
                    r10 = values[i2];
                    if (r10.value == i) {
                        break;
                    }
                    i2++;
                }
                int i3 = cursor.getInt(columnIndexOrThrow4);
                if (r11 != null) {
                    arrayList.add(new C62482rT(r10, r11, i3, j));
                }
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0095, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(java.util.List r19) {
        /*
            r18 = this;
            r4 = r18
            monitor-enter(r4)
            r0 = 0
            r6 = r19
            X.C18070vi.A0d(r6, r0)     // Catch:{ all -> 0x00d0 }
            r6.size()     // Catch:{ all -> 0x00d0 }
            r5 = 1
            X.1Cd r0 = r4.A02     // Catch:{ all -> 0x0096 }
            X.1au r2 = r0.A05()     // Catch:{ all -> 0x0096 }
            X.1xA r3 = r2.BD0()     // Catch:{ all -> 0x008f }
            r0 = r2
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0088 }
            X.1Ev r9 = r0.A02     // Catch:{ all -> 0x0088 }
            java.lang.String r7 = "SELECT MAX(sort_order) as max_order FROM favorite"
            java.lang.String r1 = "FavoriteStore/FAVORITE_GET_MAX_ORDER"
            r0 = 0
            android.database.Cursor r7 = r9.A0A(r7, r1, r0)     // Catch:{ all -> 0x0088 }
            int r0 = r7.getCount()     // Catch:{ all -> 0x0081 }
            if (r0 <= 0) goto L_0x003e
            boolean r0 = r7.moveToFirst()     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "max_order"
            int r0 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0081 }
            int r15 = r7.getInt(r0)     // Catch:{ all -> 0x0081 }
        L_0x003b:
            X.1Wu r8 = X.C27621Wu.A00     // Catch:{ all -> 0x0081 }
            goto L_0x0045
        L_0x003e:
            java.lang.String r0 = "FavoriteStore/insertFavorite/max order is not available"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0081 }
            r15 = 0
            goto L_0x003b
        L_0x0045:
            r7.close()     // Catch:{ all -> 0x0088 }
            java.util.Iterator r11 = r6.iterator()     // Catch:{ all -> 0x0088 }
        L_0x004c:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0074
            java.lang.Object r7 = r11.next()     // Catch:{ all -> 0x0088 }
            X.2rT r7 = (X.C62482rT) r7     // Catch:{ all -> 0x0088 }
            int r15 = r15 + 1
            long r0 = r7.A01     // Catch:{ all -> 0x0088 }
            X.1BI r14 = r7.A03     // Catch:{ all -> 0x0088 }
            X.2Qt r13 = r7.A02     // Catch:{ all -> 0x0088 }
            X.2rT r12 = new X.2rT     // Catch:{ all -> 0x0088 }
            r16 = r0
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x0088 }
            android.content.ContentValues r10 = A00(r12, r4)     // Catch:{ all -> 0x0088 }
            java.lang.String r7 = "favorite"
            java.lang.String r1 = "FavoriteStore/FAVORITE_INSERT"
            r0 = 5
            r9.A09(r7, r1, r10, r0)     // Catch:{ all -> 0x0088 }
            goto L_0x004c
        L_0x0074:
            r3.A00()     // Catch:{ all -> 0x0088 }
            r6.size()     // Catch:{ all -> 0x0088 }
            r3.close()     // Catch:{ all -> 0x008f }
            r2.close()     // Catch:{ all -> 0x0096 }
            goto L_0x009c
        L_0x0081:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0083 }
        L_0x0083:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0088 }
            throw r0     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.1IU r8 = new X.1IU     // Catch:{ all -> 0x00d0 }
            r8.<init>(r0)     // Catch:{ all -> 0x00d0 }
        L_0x009c:
            java.lang.Throwable r0 = X.C30671eK.A00(r8)     // Catch:{ all -> 0x00d0 }
            if (r0 == 0) goto L_0x00ce
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r1.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "FavoriteStore/insertFavorite/failed to insert favorite for :"
            r1.append(r0)     // Catch:{ all -> 0x00d0 }
            r1.append(r6)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d0 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00d0 }
            X.190 r3 = r4.A00     // Catch:{ all -> 0x00d0 }
            java.lang.String r2 = "FavoriteStore/insertAll"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d0 }
            r1.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = "insertAll "
            r1.append(r0)     // Catch:{ all -> 0x00d0 }
            r1.append(r6)     // Catch:{ all -> 0x00d0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d0 }
            r3.A0G(r2, r0, r5)     // Catch:{ all -> 0x00d0 }
        L_0x00ce:
            monitor-exit(r4)
            return
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41891xG.A03(java.util.List):void");
    }
}
