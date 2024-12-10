package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;

public final class AHQ implements BE3 {
    public static final String[] A02 = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] A03 = new String[0];
    public final SQLiteDatabase A00;
    public final List A01;

    public void BKj(String str) {
        C18070vi.A0d(str, 0);
        this.A00.execSQL(str);
    }

    public Cursor CD7(BA0 ba0) {
        Cursor rawQueryWithFactory = this.A00.rawQueryWithFactory(new AA5(new C22336B3n(ba0)), ba0.BZW(), A03, (String) null);
        C18070vi.A0X(rawQueryWithFactory);
        return rawQueryWithFactory;
    }

    public void close() {
        this.A00.close();
    }

    public AHQ(SQLiteDatabase sQLiteDatabase) {
        this.A00 = sQLiteDatabase;
        this.A01 = sQLiteDatabase.getAttachedDbs();
    }
}
