package X;

import android.database.Cursor;
import android.database.CursorWrapper;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.8CF  reason: invalid class name */
public final class AnonymousClass8CF extends CursorWrapper {
    public final Map A00 = C17880vN.A11();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8CF(Cursor cursor) {
        super(cursor);
        C18070vi.A0d(cursor, 1);
    }

    public int getColumnIndex(String str) {
        C18070vi.A0d(str, 0);
        Map map = this.A00;
        Number A1E = C108945cZ.A1E(str, map);
        if (A1E != null) {
            return A1E.intValue();
        }
        int columnIndex = super.getColumnIndex(str);
        C17880vN.A1P(str, map, columnIndex);
        return columnIndex;
    }

    public int getColumnIndexOrThrow(String str) {
        String str2;
        C18070vi.A0d(str, 0);
        int columnIndex = getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            str2 = Arrays.toString(getColumnNames());
            C18070vi.A0X(str2);
        } catch (Exception unused) {
            str2 = "";
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("column '");
        A10.append(str);
        A10.append("' does not exist. Available columns: ");
        throw AnonymousClass001.A12(str2, A10);
    }
}
