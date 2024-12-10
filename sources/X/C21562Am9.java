package X;

import android.content.Context;
import android.database.Cursor;

/* renamed from: X.Am9  reason: case insensitive filesystem */
public final class C21562Am9 implements BCK {
    public final C00 A00;

    public C192759ow CPl(Cursor cursor, AnonymousClass9IX r10) {
        AnonymousClass9IX r7 = r10;
        C18070vi.A0d(r10, 1);
        int columnIndex = cursor.getColumnIndex("uid");
        int columnIndex2 = cursor.getColumnIndex("access_token");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new C21582AmW("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            return null;
        }
        return new C192759ow(string, string2, "FRL", new C27320Dbr(), this.A00, r7);
    }

    public A0y CPi(Context context, Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("uid");
        int columnIndex2 = cursor.getColumnIndex("access_token");
        if (columnIndex == -1 || columnIndex2 == -1) {
            throw new C21582AmW("Column not found.");
        }
        String string = cursor.getString(columnIndex);
        String string2 = cursor.getString(columnIndex2);
        if (string == null || string2 == null) {
            return null;
        }
        return new A0y(string2, new A0x(string, (String) null, (String) null));
    }

    public A0y CPk(Context context, Cursor cursor) {
        throw new C21582AmW("LiteProvider not used in Frl");
    }

    public C21562Am9(C00 c00) {
        this.A00 = c00;
    }
}
