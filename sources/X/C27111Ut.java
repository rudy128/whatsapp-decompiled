package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1Ut  reason: invalid class name and case insensitive filesystem */
public class C27111Ut extends C24801Ls {
    public final AnonymousClass1CO A00;
    public final AnonymousClass00H A01;

    public C27111Ut(AnonymousClass190 r7, AnonymousClass118 r8, AnonymousClass1Cb r9, AnonymousClass1CO r10, AnonymousClass00H r11) {
        super(r8.A00, r7, r9, "location.db", 2);
        this.A00 = r10;
        this.A01 = r11;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("LocationDbHelper/onCreate; version=2");
        Log.i("LocationSharerTable/createTable/version=2");
        C28331Zy.A01(sQLiteDatabase, "location_sharer");
        sQLiteDatabase.execSQL("CREATE TABLE location_sharer (_id INTEGER PRIMARY KEY AUTOINCREMENT, remote_jid TEXT NOT NULL, from_me BOOLEAN NOT NULL, remote_resource TEXT NOT NULL, expires INTEGER NOT NULL, message_id TEXT NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        Log.i("LocationKeyDistributionTable/createTable/version=2");
        C28331Zy.A01(sQLiteDatabase, "location_key_distribution");
        sQLiteDatabase.execSQL("CREATE TABLE location_key_distribution (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, sent_to_server BOOLEAN NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_key_distribution_index ON location_key_distribution(jid)");
        Log.i("LocationCacheTable/createTable/version=2");
        C28331Zy.A01(sQLiteDatabase, "location_cache");
        sQLiteDatabase.execSQL("CREATE TABLE location_cache (_id INTEGER PRIMARY KEY AUTOINCREMENT, jid TEXT NOT NULL, latitude REAL NOT NULL, longitude REAL NOT NULL, accuracy INTEGER NOT NULL, speed REAL NOT NULL, bearing INTEGER NOT NULL, location_ts INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS user_location_index ON location_cache(jid)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationDbHelper/onDowngrade; oldVersion=");
        sb.append(i);
        sb.append("; newVersion=");
        sb.append(i2);
        Log.w(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationDbHelper/onUpgrade; oldVersion=");
        sb.append(i);
        sb.append("; newVersion=");
        sb.append(i2);
        Log.i(sb.toString());
        if (i2 != 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("LocationDbHelper/Unknown upgrade destination version: ");
            sb2.append(i);
            sb2.append(" -> ");
            sb2.append(i2);
            throw new SQLiteException(sb2.toString());
        } else if (i != 1) {
            Log.i("LocationDbHelper/onUpgrade/unknown old version");
            onCreate(sQLiteDatabase);
        } else {
            sQLiteDatabase.execSQL("DROP INDEX IF EXISTS location_sharer_index");
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS location_sharer_index ON location_sharer(remote_jid, from_me, remote_resource, message_id)");
        }
    }

    public static C23141Ev A01(C27111Ut r4) {
        String databaseName = r4.getDatabaseName();
        return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) r4.A01.get(), r4.A00, databaseName);
    }
}
