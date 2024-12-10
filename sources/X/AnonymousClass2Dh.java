package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.2Dh  reason: invalid class name */
public class AnonymousClass2Dh extends C24801Ls {
    public final Context A00;
    public final AnonymousClass1CP A01;
    public final AnonymousClass1CO A02;

    public AnonymousClass2Dh(Context context, AnonymousClass190 r8, AnonymousClass1Cb r9, AnonymousClass1CP r10, AnonymousClass1CO r11) {
        super(context, r8, r9, "hsmpacks.db", 2);
        this.A00 = context;
        this.A02 = r11;
        this.A01 = r10;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C28331Zy.A01(sQLiteDatabase, "packs");
        sQLiteDatabase.execSQL("\n        CREATE TABLE IF NOT EXISTS packs\n        (\n            _id INTEGER PRIMARY KEY AUTOINCREMENT,\n            lg TEXT NOT NULL,\n            lc TEXT NOT NULL,\n            hash TEXT NOT NULL,\n            namespace TEXT NOT NULL,\n            timestamp INTEGER NOT NULL,\n            data BLOB NOT NULL\n        )\n        ");
        sQLiteDatabase.execSQL("\n        CREATE UNIQUE INDEX IF NOT EXISTS pack_index ON packs (\n            lg,\n            lc,\n            namespace\n        )\n        ");
    }

    public C23141Ev A09() {
        try {
            String databaseName = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), this.A01, this.A02, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open pack store", e);
            A08();
            String databaseName2 = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), this.A01, this.A02, databaseName2);
        }
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("language-pack-store/downgrade from ");
        A10.append(i);
        C17900vP.A0j(" to ", A10, i2);
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("language-pack-store/upgrade from ");
        A10.append(i);
        C17900vP.A0j(" to ", A10, i2);
        if (i != 1) {
            Log.e("language-pack-store/upgrade unknown old version");
        }
        onCreate(sQLiteDatabase);
    }
}
