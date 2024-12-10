package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.2t6  reason: invalid class name and case insensitive filesystem */
public abstract class C63452t6 {
    public static C63102sV A00(SQLiteDatabase sQLiteDatabase) {
        C63102sV r1;
        C63102sV r0;
        Pattern compile = Pattern.compile("index (\\w+)$");
        HashMap A11 = C17880vN.A11();
        ArrayList A13 = AnonymousClass000.A13();
        Cursor rawQuery = sQLiteDatabase.rawQuery("PRAGMA integrity_check", (String[]) null);
        if (rawQuery != null) {
            int i = 0;
            while (true) {
                try {
                    if (rawQuery.moveToNext()) {
                        i++;
                        String string = rawQuery.getString(0);
                        int i2 = 1;
                        if (i == 1 && "ok".equalsIgnoreCase(string)) {
                            r0 = new C63102sV(A13, A11, 0);
                            break;
                        }
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("BaseSQLiteOpenHelperUtils/integritycheck/c ");
                        A10.append(i);
                        C17900vP.A0f(" ", string, A10);
                        Matcher matcher = compile.matcher(string);
                        if (matcher.find()) {
                            String group = matcher.group(1);
                            Integer num = (Integer) A11.get(group);
                            if (num != null) {
                                i2 = 1 + num.intValue();
                            }
                            C17890vO.A0z(group, A11, i2);
                        } else {
                            A13.add(string);
                        }
                    } else {
                        Iterator A0k = C17890vO.A0k(A11);
                        while (A0k.hasNext()) {
                            String A0v = C17880vN.A0v(A0k);
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("BaseSQLiteOpenHelperUtils/integritycheck/error-details/index/");
                            A102.append(A0v);
                            C17900vP.A0Y((Integer) A11.get(A0v), " cnt=", A102);
                        }
                        Iterator it = A13.iterator();
                        while (it.hasNext()) {
                            C17900vP.A0f("BaseSQLiteOpenHelperUtils/integritycheck/error-details/other/", C17880vN.A0v(it), AnonymousClass000.A10());
                        }
                        r0 = new C63102sV(A13, A11, i);
                    }
                } catch (SQLiteDatabaseCorruptException e) {
                    Log.e("BaseSQLiteOpenHelperUtils/integritycheck/c/error", e);
                    C63102sV r02 = C63102sV.A04;
                    e.getMessage();
                    r1 = new C63102sV(-3);
                    rawQuery.close();
                    return r1;
                } catch (Exception e2) {
                    Log.e("BaseSQLiteOpenHelperUtils/integritycheck/c/error", e2);
                    C63102sV r03 = C63102sV.A04;
                    e2.getMessage();
                    r1 = new C63102sV(-1);
                    rawQuery.close();
                    return r1;
                } catch (Throwable th) {
                    if (rawQuery != null) {
                        try {
                            rawQuery.close();
                            throw th;
                        } catch (Throwable th2) {
                            AnonymousClass0DT.A00(th, th2);
                            throw th;
                        }
                    }
                    throw th;
                }
            }
            rawQuery.close();
            return r0;
        }
        Log.w("BaseSQLiteOpenHelperUtils/integritycheck/query-failed");
        return C63102sV.A04;
    }

    public static String A01(SQLiteDatabase sQLiteDatabase, String str) {
        Cursor rawQuery;
        String str2 = "";
        try {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("select sql from sqlite_master where type='table' and name='");
            A10.append(str);
            rawQuery = sQLiteDatabase.rawQuery(AnonymousClass000.A0y("';", A10), (String[]) null);
            if (rawQuery != null) {
                if (rawQuery.moveToNext()) {
                    str2 = rawQuery.getString(rawQuery.getColumnIndexOrThrow("sql"));
                }
            }
            if (rawQuery != null) {
                rawQuery.close();
                return str2;
            }
        } catch (Exception e) {
            C17900vP.A0h("base-sqlite-open-helper-utils/schema ", str, AnonymousClass000.A10(), e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        return str2;
        throw th;
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3) {
        A03(sQLiteDatabase, A01(sQLiteDatabase, str), str, str2, str3);
    }

    public static void A03(SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String str4) {
        String trim = str3.trim();
        String trim2 = str4.trim();
        if (!C28331Zy.A05(str, trim, trim2)) {
            try {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("ALTER TABLE ");
                A10.append(str2);
                A10.append(" ADD ");
                A10.append(trim);
                sQLiteDatabase.execSQL(AnonymousClass001.A1H(" ", trim2, A10));
            } catch (SQLiteException e) {
                C17900vP.A0h("base-sqlite-open-helper-utils/add-column ", trim, AnonymousClass000.A10(), e);
            }
        }
    }
}
