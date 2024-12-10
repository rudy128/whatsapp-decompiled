package X;

import android.database.Cursor;
import java.io.File;

/* renamed from: X.9vY  reason: invalid class name and case insensitive filesystem */
public final class C196729vY {
    public static final C187729gH A00(Cursor cursor) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow("_id");
        int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("local_path");
        int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("exported_path");
        int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("required");
        int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("file_size");
        int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("encryption_iv");
        long j = cursor.getLong(columnIndexOrThrow);
        String string = cursor.getString(columnIndexOrThrow2);
        String string2 = cursor.getString(columnIndexOrThrow3);
        int i = cursor.getInt(columnIndexOrThrow4);
        long j2 = cursor.getLong(columnIndexOrThrow5);
        String string3 = cursor.getString(columnIndexOrThrow6);
        C17960vV.A07(string);
        C17960vV.A07(string2);
        C17960vV.A07(string3);
        File A17 = C108945cZ.A17(string);
        C18070vi.A0b(string2);
        boolean A1O = AnonymousClass000.A1O(i);
        C18070vi.A0b(string3);
        return new C187729gH(A17, string2, string3, j, j2, A1O);
    }
}
