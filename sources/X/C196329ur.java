package X;

import android.database.Cursor;
import android.os.Build;
import android.util.Log;

/* renamed from: X.9ur  reason: invalid class name and case insensitive filesystem */
public abstract class C196329ur {
    public static final int A00(Cursor cursor, String str) {
        int length;
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex < 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append('`');
            columnIndex = cursor.getColumnIndex(AnonymousClass8BW.A0l(str, A10, '`'));
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT > 25 || (length = str.length()) == 0) {
                    return -1;
                }
                String[] columnNames = cursor.getColumnNames();
                C18070vi.A0X(columnNames);
                String A0Z = C17890vO.A0Z(str, AnonymousClass000.A10(), '.');
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append('.');
                String A0l = AnonymousClass8BW.A0l(str, A102, '`');
                int length2 = columnNames.length;
                int i = 0;
                columnIndex = 0;
                while (i < length2) {
                    String str2 = columnNames[i];
                    int i2 = columnIndex + 1;
                    if (str2.length() >= length + 2) {
                        C18070vi.A0d(A0Z, 1);
                        if (!str2.endsWith(A0Z)) {
                            if (str2.charAt(0) == '`') {
                                C18070vi.A0d(A0l, 1);
                                if (str2.endsWith(A0l)) {
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i++;
                    columnIndex = i2;
                }
                return -1;
            }
        }
        return columnIndex;
    }

    public static final int A01(Cursor cursor, String str) {
        String str2;
        int A00 = A00(cursor, str);
        if (A00 >= 0) {
            return A00;
        }
        try {
            String[] columnNames = cursor.getColumnNames();
            C18070vi.A0X(columnNames);
            str2 = C200410p.A0I(", ", "", "", columnNames);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("column '");
        A10.append(str);
        A10.append("' does not exist. Available columns: ");
        throw AnonymousClass001.A12(str2, A10);
    }
}
