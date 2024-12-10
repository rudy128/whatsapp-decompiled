package X;

import android.database.Cursor;

/* renamed from: X.24X  reason: invalid class name */
public abstract class AnonymousClass24X {
    public static final boolean A01(Cursor cursor, int i) {
        if (i == -1 || cursor.isNull(i) || cursor.getInt(i) != 1) {
            return false;
        }
        return true;
    }

    public static final Integer A00(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i));
    }
}
