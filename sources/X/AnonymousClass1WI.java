package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.1WI  reason: invalid class name */
public class AnonymousClass1WI extends C24801Ls {
    public final AnonymousClass1CO A00;
    public final AnonymousClass00H A01;

    public AnonymousClass1WI(AnonymousClass190 r7, AnonymousClass118 r8, AnonymousClass1Cb r9, AnonymousClass1CO r10, AnonymousClass00H r11) {
        super(r8.A00, r7, r9, "daily_metrics.db", 7);
        this.A00 = r10;
        this.A01 = r11;
    }

    private void A01(SQLiteDatabase sQLiteDatabase) {
        Log.i("DailyMetricsDbHelper/createDB");
        A02(sQLiteDatabase, this, "community_home_action_logging", "DROP TABLE IF EXISTS community_home_action_logging", "CREATE TABLE community_home_action_logging(jid_row_id INTEGER PRIMARY KEY, home_view_count INTEGER NOT NULL DEFAULT 0, home_group_navigation_count INTEGER NOT NULL DEFAULT 0, home_group_discovery_count INTEGER NOT NULL DEFAULT 0, home_group_join_count INTEGER NOT NULL DEFAULT 0)");
        A02(sQLiteDatabase, this, "poll_event_logging", "DROP TABLE IF EXISTS poll_event_logging", "CREATE TABLE poll_event_logging(poll_id INTEGER PRIMARY KEY, poll_votes INTEGER NOT NULL DEFAULT 0, poll_votes_changed INTEGER NOT NULL DEFAULT 0, poll_vote_deletes INTEGER NOT NULL DEFAULT 0,option_count INTEGER NOT NULL DEFAULT 0, users_participated INTEGER NOT NULL DEFAULT 0, poll_creation_ds INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, is_a_group_flag INTEGER NOT NULL DEFAULT 0)");
        A02(sQLiteDatabase, this, "pnh_daily_event_logging", "DROP TABLE IF EXISTS pnh_daily_event_logging", "CREATE TABLE pnh_daily_event_logging(community_id TEXT NOT NULL, type_of_subgroup INTEGER NOT NULL, reaction_open_tray_count INTEGER NOT NULL DEFAULT 0, reaction_delete_count INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_chat INTEGER NOT NULL DEFAULT 0, pnh_indicator_clicks_info_screen INTEGER NOT NULL DEFAULT 0, PRIMARY KEY (community_id, type_of_subgroup))");
        A02(sQLiteDatabase, this, "comments_event_logging", "DROP TABLE IF EXISTS comments_event_logging", "CREATE TABLE comments_event_logging (comment_space_id TEXT PRIMARY KEY, comment_parent_group_id TEXT NOT NULL, comments INTEGER NOT NULL DEFAULT 0, comment_deletes INTEGER NOT NULL DEFAULT 0, accumulated_comments INTEGER NOT NULL DEFAULT 0, group_size_bucket INTEGER NOT NULL DEFAULT 0, cag_message_sent_ds INTEGER NOT NULL DEFAULT 0)");
        A02(sQLiteDatabase, this, "snapl_payload", "DROP TABLE IF EXISTS snapl_payload", "CREATE TABLE IF NOT EXISTS snapl_payload(id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, payload_json TEXT NOT NULL )");
    }

    public C23141Ev A09() {
        Log.i("DailyMetricsDbHelper/initDatabase");
        try {
            String databaseName = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A01.get(), this.A00, databaseName);
        } catch (SQLiteException e) {
            Log.e("failed to open writable daily metrics store", e);
            String databaseName2 = getDatabaseName();
            return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A01.get(), this.A00, databaseName2);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("DailyMetricsDbHelper/onCreate; version=7");
        A01(sQLiteDatabase);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("DailyMetricsDbHelper/downgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Log.i("DailyMetricsDbHelper/onUpgrade");
        A01(sQLiteDatabase);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase, AnonymousClass1WI r4, String str, String str2, String str3) {
        try {
            sQLiteDatabase.execSQL(str2);
            sQLiteDatabase.execSQL(str3);
        } catch (SQLiteException e) {
            AnonymousClass190 r2 = r4.A06;
            StringBuilder sb = new StringBuilder();
            sb.append("Issue recreating ");
            sb.append(str);
            sb.append(" table");
            r2.A0E("DailyMetricsDbHelper/recreateActionTable", sb.toString(), e);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DailyMetricsDbHelper/failed to recreate ");
            sb2.append(str);
            sb2.append(" logging table");
            Log.e(sb2.toString(), e);
        }
    }
}
