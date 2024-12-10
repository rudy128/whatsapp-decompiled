package X;

import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

/* renamed from: X.9iF  reason: invalid class name and case insensitive filesystem */
public abstract class C188939iF {
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e9, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ec, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.BE3 r11, int r12, int r13) {
        /*
            r10 = this;
            r4 = r10
            X.8Ja r4 = (X.C162118Ja) r4
            X.9hl r0 = r4.A00
            if (r0 == 0) goto L_0x00ed
            X.9id r7 = r0.A01
            r8 = r12
            if (r12 != r13) goto L_0x001f
            X.0wS r5 = X.C18460wS.A00
        L_0x000e:
            X.A6D r4 = r4.A01
            r6 = 0
            X.DcQ r3 = X.AnonymousClass1ZT.A01()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            r0 = r11
            X.AHQ r0 = (X.AHQ) r0
            android.database.Cursor r2 = X.AHY.A00(r0, r1)
            goto L_0x007a
        L_0x001f:
            boolean r9 = X.C108975cc.A1D(r13, r12)
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
        L_0x0027:
            if (r9 == 0) goto L_0x0077
            if (r8 >= r13) goto L_0x000e
        L_0x002b:
            java.util.Map r0 = r7.A00
            java.lang.Object r6 = X.AnonymousClass000.A0w(r0, r8)
            java.util.TreeMap r6 = (java.util.TreeMap) r6
            if (r6 == 0) goto L_0x00ed
            if (r9 == 0) goto L_0x0072
            java.util.NavigableSet r0 = r6.descendingKeySet()
        L_0x003b:
            java.util.Iterator r3 = r0.iterator()
        L_0x003f:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r2 = r3.next()
            java.lang.Number r2 = (java.lang.Number) r2
            if (r9 == 0) goto L_0x0066
            int r0 = r8 + 1
            X.C18070vi.A0V(r2)
            int r1 = r2.intValue()
            if (r0 > r1) goto L_0x003f
            if (r1 > r13) goto L_0x003f
        L_0x005a:
            java.lang.Object r0 = r6.get(r2)
            X.C18070vi.A0b(r0)
            r5.add(r0)
            r8 = r1
            goto L_0x0027
        L_0x0066:
            X.C18070vi.A0V(r2)
            int r1 = r2.intValue()
            if (r13 > r1) goto L_0x003f
            if (r1 >= r8) goto L_0x003f
            goto L_0x005a
        L_0x0072:
            java.util.Set r0 = r6.keySet()
            goto L_0x003b
        L_0x0077:
            if (r8 <= r13) goto L_0x000e
            goto L_0x002b
        L_0x007a:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0088
            java.lang.String r0 = r2.getString(r6)     // Catch:{ all -> 0x00e6 }
            r3.add(r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x007a
        L_0x0088:
            r2.close()
            X.DcQ r0 = X.AnonymousClass1ZT.A02(r3)
            java.util.Iterator r3 = r0.iterator()
        L_0x0093:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.String r2 = X.C17880vN.A0v(r3)
            X.C18070vi.A0V(r2)
            java.lang.String r0 = "room_fts_content_sync_"
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r0, r6)
            if (r0 == 0) goto L_0x0093
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DROP TRIGGER IF EXISTS "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            r11.BKj(r0)
            goto L_0x0093
        L_0x00b6:
            java.util.Iterator r1 = r5.iterator()
        L_0x00ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r1.next()
            X.9zO r0 = (X.C199079zO) r0
            r0.A01(r11)
            goto L_0x00ba
        L_0x00ca:
            X.9ZT r2 = r4.A03(r11)
            boolean r0 = r2.A01
            if (r0 == 0) goto L_0x00d6
            X.C162118Ja.A00(r11)
            return
        L_0x00d6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Migration didn't properly handle: "
            r1.append(r0)
            java.lang.String r0 = r2.A00
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x00e6:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            X.CDX.A00(r2, r1)
            throw r0
        L_0x00ed:
            X.9hl r1 = r4.A00
            if (r1 == 0) goto L_0x013d
            if (r12 <= r13) goto L_0x0131
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x0131
        L_0x00f7:
            X.A6D r4 = r4.A01
            java.lang.String r0 = "DROP TABLE IF EXISTS `Dependency`"
            r11.BKj(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkSpec`"
            r11.BKj(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkTag`"
            r11.BKj(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `SystemIdInfo`"
            r11.BKj(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkName`"
            r11.BKj(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `WorkProgress`"
            r11.BKj(r0)
            java.lang.String r0 = "DROP TABLE IF EXISTS `Preference`"
            r11.BKj(r0)
            androidx.work.impl.WorkDatabase_Impl r3 = r4.A00
            java.util.List r0 = r3.A01
            if (r0 == 0) goto L_0x0158
            int r2 = r0.size()
            r1 = 0
        L_0x0127:
            if (r1 >= r2) goto L_0x0158
            java.util.List r0 = r3.A01
            r0.get(r1)
            int r1 = r1 + 1
            goto L_0x0127
        L_0x0131:
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x00f7
            java.util.Set r0 = r1.A08
            boolean r0 = X.C108965cb.A1b(r0, r12)
            if (r0 != 0) goto L_0x00f7
        L_0x013d:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "A migration from "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)
            throw r0
        L_0x0158:
            r4.A04(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C188939iF.A02(X.BE3, int, int):void");
    }

    public static final void A01(String str) {
        if (str == null || !str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                int i2 = length;
                if (!z) {
                    i2 = i;
                }
                boolean A0u = C109005cf.A0u(str, i2);
                if (z) {
                    if (!A0u) {
                        break;
                    }
                    length--;
                } else if (!A0u) {
                    z = true;
                } else {
                    i++;
                }
            }
            if (C108985cd.A0g(length, i, str).length() != 0) {
                Log.w("SupportSQLite", AnonymousClass001.A1H("deleting the database file: ", str, AnonymousClass000.A10()));
                try {
                    SQLiteDatabase.deleteDatabase(C108945cZ.A17(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }
}
