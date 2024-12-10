package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.2tR  reason: invalid class name and case insensitive filesystem */
public class C63632tR {
    public final AnonymousClass1Cd A00;
    public final AnonymousClass00H A01 = C221618v.A00(C204712g.class);

    public static boolean A02(ContentValues contentValues, Object obj, String str) {
        if (obj == null) {
            contentValues.putNull(str);
            return true;
        } else if (obj instanceof String) {
            contentValues.put(str, (String) obj);
            return true;
        } else if (obj instanceof Byte) {
            contentValues.put(str, (Byte) obj);
            return true;
        } else if (obj instanceof Short) {
            contentValues.put(str, (Short) obj);
            return true;
        } else if (obj instanceof Integer) {
            contentValues.put(str, (Integer) obj);
            return true;
        } else if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
            return true;
        } else if (obj instanceof Float) {
            contentValues.put(str, (Float) obj);
            return true;
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
            return true;
        } else if (obj instanceof Boolean) {
            contentValues.put(str, (Boolean) obj);
            return true;
        } else if (!(obj instanceof byte[])) {
            return false;
        } else {
            contentValues.put(str, (byte[]) obj);
            return true;
        }
    }

    public long A03() {
        Cursor A002;
        C28781at A04 = this.A00.get();
        try {
            A002 = C23141Ev.A00(((C28801av) A04).A02, "SELECT COUNT(*) as count FROM available_message_view", "GET_MESSAGES_COUNT_EXCLUDE_DELETED_SQL");
            A002.moveToNext();
            long A06 = C17890vO.A06(A002, "count");
            A002.close();
            A04.close();
            return A06;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public long A04(String str, String str2) {
        Cursor A002;
        C28781at A04 = this.A00.get();
        try {
            C23141Ev r2 = ((C28801av) A04).A02;
            Object[] objArr = new Object[2];
            AnonymousClass001.A1Q(str2, str, objArr);
            A002 = C23141Ev.A00(r2, String.format("SELECT COUNT(%s) AS count FROM %s", objArr), "GET_NUMBER_OF_ROWS");
            A002.moveToNext();
            long A06 = C17890vO.A06(A002, "count");
            A002.close();
            A04.close();
            return A06;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C52992bo A05(String str, long j, long j2, long j3) {
        String[] strArr;
        String str2;
        String str3;
        Cursor A0A;
        if (j2 >= 0) {
            strArr = new String[4];
            strArr[0] = str;
            C17880vN.A1V(strArr, 1, j);
            C17880vN.A1V(strArr, 2, j2);
            C17880vN.A1V(strArr, 3, j3);
            str2 = "SELECT DISTINCT table_row_id FROM backup_changes WHERE (operation = 'DELETE') AND (table_name = ?) AND (table_row_id > ?) AND (_id <= ?) ORDER BY table_row_id ASC LIMIT ?";
            str3 = "BackupChangesStore/SELECT_DELETED_IDS_V2";
        } else {
            strArr = new String[3];
            strArr[0] = str;
            C17880vN.A1V(strArr, 1, j);
            C17880vN.A1V(strArr, 2, j3);
            str2 = "SELECT DISTINCT table_row_id FROM backup_changes WHERE (operation = 'DELETE') AND (table_name = ?) AND (table_row_id > ?) ORDER BY table_row_id ASC LIMIT ?";
            str3 = "BackupChangesStore/SELECT_DELETED_IDS";
        }
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A(str2, str3, strArr);
            C52992bo A002 = A00(A0A, j);
            if (A0A != null) {
                A0A.close();
            }
            A04.close();
            return A002;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public C52992bo A06(String str, long j, long j2, long j3) {
        String[] strArr;
        String str2;
        String str3;
        Cursor A0A;
        if (j2 != -1) {
            strArr = new String[4];
            strArr[0] = str;
            C17880vN.A1V(strArr, 1, j);
            C17880vN.A1V(strArr, 2, j2);
            C17880vN.A1V(strArr, 3, j3);
            str2 = "SELECT table_row_id FROM backup_changes WHERE ((operation = 'INSERT') OR (operation = 'UPDATE')) AND (table_name = ?) AND (table_row_id > ?) AND (_id <= ?) ORDER BY table_row_id ASC LIMIT ?";
            str3 = "BackupChangesStore/SELECT_UPDATED_IDS_V2";
        } else {
            strArr = new String[3];
            strArr[0] = str;
            C17880vN.A1V(strArr, 1, j);
            C17880vN.A1V(strArr, 2, j3);
            str2 = "SELECT DISTINCT table_row_id FROM backup_changes WHERE ((operation = 'INSERT') OR (operation = 'UPDATE')) AND (table_name = ?) AND (table_row_id > ?) ORDER BY table_row_id ASC LIMIT ?";
            str3 = "BackupChangesStore/SELECT_UPDATED_IDS";
        }
        C28781at A04 = this.A00.get();
        try {
            A0A = ((C28801av) A04).A02.A0A(str2, str3, strArr);
            C52992bo A002 = A00(A0A, j);
            if (A0A != null) {
                A0A.close();
            }
            A04.close();
            return A002;
        } catch (Throwable th) {
            try {
                A04.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A07() {
        C28791au A05 = this.A00.A05();
        try {
            ((C28801av) A05).A02.A04("backup_changes", (String) null, "BackupChangesStore/DELETE_BACKUP_CHANGES", (String[]) null);
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public void A08(String str, long j) {
        C28791au A05 = this.A00.A05();
        try {
            ContentValues A08 = C17880vN.A08();
            A08.put("operation", "DELETE");
            A08.put("table_name", str);
            C17880vN.A19(A08, "table_row_id", j);
            ((C28801av) A05).A02.A05("backup_changes", "BackupChangesStore/INSERT_DELETED_ENTITY_ID", A08);
            A05.close();
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public C63632tR(AnonymousClass1Cd r2) {
        this.A00 = r2;
    }

    public static C52992bo A00(Cursor cursor, long j) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("table_row_id");
        ArrayList A0z = C17880vN.A0z(cursor.getCount());
        while (cursor.moveToNext()) {
            C17880vN.A1R(A0z, (long) cursor.getInt(columnIndexOrThrow));
        }
        if (!A0z.isEmpty()) {
            j = C17880vN.A05(A0z.get(A0z.size() - 1));
        }
        return new C52992bo(A0z, j);
    }

    public static HashMap A01(Cursor cursor, String[] strArr) {
        Object A0M;
        HashMap A11 = C17880vN.A11();
        for (int i = 0; i < strArr.length; i++) {
            if (!cursor.isNull(i)) {
                int type = cursor.getType(i);
                if (type == 1) {
                    A0M = C17890vO.A0M(cursor, i);
                } else if (type == 2) {
                    A0M = Double.valueOf(cursor.getDouble(i));
                } else if (type == 3) {
                    A0M = cursor.getString(i);
                } else if (type == 4) {
                    A0M = cursor.getBlob(i);
                }
                A11.put(strArr[i], A0M);
            }
        }
        return A11;
    }
}
