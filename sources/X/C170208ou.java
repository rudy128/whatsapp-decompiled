package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.8ou  reason: invalid class name and case insensitive filesystem */
public class C170208ou extends C24801Ls {
    public final AnonymousClass1CO A00;
    public final AnonymousClass00H A01;

    public C170208ou(Context context, AnonymousClass190 r8, AnonymousClass1Cb r9, AnonymousClass1CO r10, AnonymousClass00H r11) {
        super(context, r8, r9, "migration_prefetcher.db", 1);
        this.A00 = r10;
        this.A01 = r11;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE prefetched_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, prefetched_file_path TEXT UNIQUE, file_size INTEGER, required INTEGER, prefetched INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON prefetched_files (remote_file_path)");
        sQLiteDatabase.execSQL("CREATE TABLE encrypted_files(_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_file_path TEXT UNIQUE NOT NULL, enc_iv TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS remote_file_path_index ON encrypted_files (remote_file_path)");
        sQLiteDatabase.execSQL("CREATE TABLE properties(_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE NOT NULL, value TEXT)");
    }

    public C23141Ev A09() {
        try {
            String databaseName = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A01.get(), this.A00, databaseName);
        } catch (SQLiteException e) {
            Log.e("Failed to open writable file prefetcher db.", e);
            String databaseName2 = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A01.get(), this.A00, databaseName2);
        }
    }
}
