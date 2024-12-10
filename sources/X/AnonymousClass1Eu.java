package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.1Eu  reason: invalid class name */
public abstract class AnonymousClass1Eu {
    public static void A04(Cursor cursor, HashMap hashMap, String[] strArr) {
        for (String str : strArr) {
            C17960vV.A0F(!hashMap.containsKey(str), "Column is already in the map, make sure there are no columns with same name in the same query.");
            hashMap.put(str, Integer.valueOf(cursor.getColumnIndexOrThrow(str)));
        }
    }

    public static boolean A05(Cursor cursor, int i) {
        if (!cursor.isNull(i) && cursor.getInt(i) == 1) {
            return true;
        }
        return false;
    }

    public static C23141Ev A03(SQLiteDatabase sQLiteDatabase, AnonymousClass1CP r3, AnonymousClass1CO r4, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("DatabaseUtils/initDatabase/injected sql log writer/using modified LoggableSQLiteDatabase db=");
        sb.append(str);
        Log.i(sb.toString());
        if (TextUtils.isEmpty(str)) {
            str = "unspecified";
        }
        return new C23141Ev(sQLiteDatabase, r3, r4, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r1.delete() != false) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x005a, code lost:
        if (r3.delete() != false) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0068, code lost:
        if (r2.delete() != false) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(java.io.File r5, java.lang.String r6) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-wal"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r3 = new java.io.File
            r3.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-journal"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = "-shm"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r3.exists()
            r5 = 0
            if (r0 == 0) goto L_0x005c
            boolean r0 = r3.delete()
            r4 = 0
            if (r0 == 0) goto L_0x005d
        L_0x005c:
            r4 = 1
        L_0x005d:
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x006a
            boolean r0 = r2.delete()
            r3 = 0
            if (r0 == 0) goto L_0x006b
        L_0x006a:
            r3 = 1
        L_0x006b:
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0078
            boolean r0 = r1.delete()
            r2 = 0
            if (r0 == 0) goto L_0x0079
        L_0x0078:
            r2 = 1
        L_0x0079:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r0 = "deleteTemporaryFiles/journalDeleted="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "; writeAheadLogDeleted="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; sharedDeleted="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == 0) goto L_0x00a7
            if (r3 == 0) goto L_0x00a7
            if (r2 == 0) goto L_0x00a7
            r5 = 1
        L_0x00a7:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Eu.A07(java.io.File, java.lang.String):boolean");
    }

    public static int A00(Cursor cursor, int i, int i2) {
        if (cursor.isNull(i)) {
            return i2;
        }
        try {
            return cursor.getInt(i);
        } catch (IllegalStateException e) {
            Log.e("DatabaseUtils/safeGetInt/failed ", e);
            return i2;
        }
    }

    public static int A01(String str, HashMap hashMap) {
        Object obj = hashMap.get(str);
        C17960vV.A07(obj);
        return ((Number) obj).intValue();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        return r1.getLong(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        return r3;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long A02(android.database.Cursor r1, int r2, long r3) {
        /*
            boolean r0 = r1.isNull(r2)
            if (r0 == 0) goto L_0x0007
            return r3
        L_0x0007:
            long r0 = r1.getLong(r2)     // Catch:{ IllegalStateException -> 0x000c }
            return r0
        L_0x000c:
            long r0 = r1.getLong(r2)     // Catch:{ IllegalStateException -> 0x0011 }
            return r0
        L_0x0011:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Eu.A02(android.database.Cursor, int, long):long");
    }

    public static boolean A06(Cursor cursor, int i) {
        if (cursor.getLong(i) == 1) {
            return true;
        }
        return false;
    }
}
