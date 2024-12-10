package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.2Dg  reason: invalid class name */
public final class AnonymousClass2Dg extends C24801Ls {
    public final AnonymousClass1CP A00;
    public final AnonymousClass1CO A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2Dg(AnonymousClass190 r7, AnonymousClass118 r8, AnonymousClass1Cb r9, AnonymousClass1CP r10, AnonymousClass1CO r11) {
        super(r8.A00, r7, r9, "emojidictionary.db", 1);
        C18070vi.A0d(r8, 1);
        C18070vi.A0p(r7, r11, r10);
        this.A01 = r11;
        this.A00 = r10;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C18070vi.A0d(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("CREATE TABLE emoji_search_tag (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, type INTEGER NOT NULL, symbol TEXT NOT NULL, tag TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS emoji_search_pack_index ON emoji_search_tag (type, symbol, tag)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C18070vi.A0d(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C18070vi.A0d(sQLiteDatabase, 0);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emoji_search_tag");
        onCreate(sQLiteDatabase);
    }

    public C23141Ev A09() {
        String databaseName = getDatabaseName();
        return AnonymousClass1Eu.A03(super.A04(), this.A00, this.A01, databaseName);
    }
}
