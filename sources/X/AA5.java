package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;

public final /* synthetic */ class AA5 implements SQLiteDatabase.CursorFactory {
    public final /* synthetic */ AnonymousClass20G A00;

    public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        AnonymousClass20G r1 = this.A00;
        C18070vi.A0d(r1, 0);
        return (Cursor) r1.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    public /* synthetic */ AA5(AnonymousClass20G r1) {
        this.A00 = r1;
    }
}
