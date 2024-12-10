package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1Zy  reason: invalid class name and case insensitive filesystem */
public abstract class C28331Zy {
    public static String A00(C23141Ev r4, String str, String str2) {
        Cursor A0A;
        String str3 = "";
        try {
            A0A = r4.A0A("SELECT sql FROM sqlite_master WHERE type = ? AND name = ?", "SELECT_SQL_FROM_SQLITE_MASTER_BY_TYPE_AND_NAME", new String[]{str, str2});
            if (A0A.moveToNext()) {
                str3 = A0A.getString(A0A.getColumnIndexOrThrow("sql"));
            }
            A0A.close();
            return str3;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("BaseDatabaseTable/getSqlFor view = ");
            sb.append(str2);
            Log.e(sb.toString(), e);
            return str3;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public static void A02(C23141Ev r4, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("SharedDBQueryExecutor/dropIndex/attempting to drop index: ");
        sb.append(str2);
        Log.i(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append("DROP INDEX IF EXISTS ");
        sb2.append(str2);
        r4.A0E(sb2.toString(), AnonymousClass2TU.A00(str, "dropIndexIfExistsWithoutStatement", AnonymousClass001.A1H("DROP_", str2, C18070vi.A0K(str2))));
    }

    public static void A01(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL(C25071Mt.A02(str));
    }

    public static void A03(C23141Ev r4, String str, String str2) {
        r4.A0E(C25071Mt.A02(str2), AnonymousClass2TU.A00(str, "dropLoggableDatabaseTables", AnonymousClass001.A1H("DROP_", str2, C18070vi.A0K(str2))));
    }

    public static void A04(C23141Ev r5, String str, String str2, String str3, String str4, String str5) {
        String trim = str3.trim();
        String trim2 = str4.trim();
        if (!A05(str, trim, trim2)) {
            if (trim2.contains(" NOT NULL") && !trim2.contains(" DEFAULT ")) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot add not null without default value ");
                sb.append(str2);
                sb.append(".");
                sb.append(trim);
                C17960vV.A0F(false, sb.toString());
                trim2 = trim2.replace(" NOT NULL", "");
            }
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ALTER TABLE ");
                sb2.append(str2);
                sb2.append(" ADD ");
                sb2.append(trim);
                sb2.append(" ");
                sb2.append(trim2);
                String obj = sb2.toString();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str5);
                sb3.append("/addColumnIfNotExists/ALTER_TABLE");
                r5.A0E(obj, sb3.toString());
            } catch (SQLiteException e) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("databasehelper/addColumnIfNotExists/alter_table ");
                sb4.append(trim);
                Log.w(sb4.toString(), e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0051, code lost:
        if (r1.contains(r0.toString()) != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r6 = r9.trim()
            java.lang.String r1 = r10.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r1.toUpperCase(r0)
            java.lang.String r4 = "\\s+"
            java.lang.String r7 = " "
            java.lang.String r1 = r8.replaceAll(r4, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = ","
            r0.append(r3)
            r0.append(r6)
            r0.append(r7)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.contains(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0053
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r8.replaceAll(r4, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0054
        L_0x0053:
            return r2
        L_0x0054:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "[(,]\\s*(`*)"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "(`*)(\\s+)"
            r1.append(r0)
            java.lang.String r0 = "(\\\\s+)"
            java.lang.String r0 = r5.replaceAll(r4, r0)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r0 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r1, r0)
            java.util.regex.Matcher r0 = r0.matcher(r8)
            boolean r0 = r0.find()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28331Zy.A05(java.lang.String, java.lang.String, java.lang.String):boolean");
    }
}
