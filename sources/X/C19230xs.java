package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.0xs  reason: invalid class name and case insensitive filesystem */
public final class C19230xs extends SQLiteOpenHelper {
    public static final String A02;
    public static final C19240xt A03;
    public static final C19240xt A04;
    public static final C19240xt A05;
    public static final C19240xt A06;
    public static final C19240xt A07;
    public static final List A08;
    public boolean A00 = false;
    public final int A01;

    public C19230xs(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.A01 = i;
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.A00 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO global_log_event_state VALUES (");
        sb.append(System.currentTimeMillis());
        sb.append(")");
        A02 = sb.toString();
        C65352wG r9 = new C65352wG(0);
        A03 = r9;
        C65352wG r7 = new C65352wG(1);
        A04 = r7;
        C65352wG r5 = new C65352wG(2);
        A05 = r5;
        C65352wG r3 = new C65352wG(3);
        A06 = r3;
        C65352wG r1 = new C65352wG(4);
        A07 = r1;
        A08 = Arrays.asList(new C19240xt[]{r9, r7, r5, r3, r1});
    }

    public static void A00(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        String str;
        List list = A08;
        if (i2 > list.size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Migration from ");
            sb.append(i);
            sb.append(" to ");
            sb.append(i2);
            sb.append(" was requested, but cannot be performed. Only ");
            sb.append(list.size());
            sb.append(" migrations are provided");
            throw new IllegalArgumentException(sb.toString());
        }
        while (i < i2) {
            switch (((C65352wG) ((C19240xt) list.get(i))).A00) {
                case 0:
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    str = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
                    break;
                case 1:
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    str = "DROP INDEX contexts_backend_priority";
                    break;
                case 2:
                    str = "ALTER TABLE events ADD COLUMN payload_encoding TEXT";
                    break;
                case 3:
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    str = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
                    break;
                default:
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    str = A02;
                    break;
            }
            sQLiteDatabase.execSQL(str);
            i++;
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.A01;
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, 0, i);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, 0, i2);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, i, i2);
    }
}
