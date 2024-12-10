package X;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: X.1Zz  reason: invalid class name and case insensitive filesystem */
public abstract class C28341Zz {
    public static String A00(C23141Ev r3, String str, String str2) {
        Cursor A0A = r3.A0A("SELECT value FROM props WHERE key = ?", "SELECT_PROPS_VALUE_BY_KEY", new String[]{str});
        try {
            if (A0A.moveToNext()) {
                String string = A0A.getString(A0A.getColumnIndexOrThrow("value"));
                A0A.close();
                return string;
            }
            A0A.close();
            return str2;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public static void A01(C23141Ev r3, String str) {
        r3.A0F("DELETE FROM props WHERE key = ?", "DELETE_PROPS", new String[]{str});
    }

    public static void A02(C23141Ev r3, String str, String str2, long j) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        contentValues.put("value", Long.valueOf(j));
        r3.A08("props", AnonymousClass2TU.A00(str2, "setProp", "REPLACE_PROPS_LONG"), contentValues);
    }

    public static void A03(C23141Ev r3, String str, String str2, String str3) {
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("key", str);
        contentValues.put("value", str2);
        r3.A08("props", AnonymousClass2TU.A00(str3, "setProp", "REPLACE_PROPS_STRING"), contentValues);
    }
}
