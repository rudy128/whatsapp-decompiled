package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.8ot  reason: invalid class name and case insensitive filesystem */
public class C170198ot extends C24801Ls {
    public final AnonymousClass1CO A00;
    public final AnonymousClass00H A01;

    public C170198ot(Context context, AnonymousClass190 r8, AnonymousClass1Cb r9, AnonymousClass1CO r10, AnonymousClass00H r11) {
        super(context, r8, r9, "migration_export_metadata.db", 1);
        this.A00 = r10;
        this.A01 = r11;
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE exported_files_metadata(_id INTEGER PRIMARY KEY AUTOINCREMENT, local_path TEXT NOT NULL, exported_path TEXT UNIQUE NOT NULL, file_size INTEGER, required INTEGER, encryption_iv TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS exported_files_metadata_local_path_index ON exported_files_metadata (local_path)");
    }

    public C23141Ev A09() {
        try {
            String databaseName = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A01.get(), this.A00, databaseName);
        } catch (SQLiteException e) {
            Log.e("Failed to open writable export metadata db.", e);
            String databaseName2 = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A01.get(), this.A00, databaseName2);
        }
    }
}
