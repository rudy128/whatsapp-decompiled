package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;

/* renamed from: X.1MP  reason: invalid class name */
public class AnonymousClass1MP extends C24801Ls {
    public final AnonymousClass1CP A00;
    public final AnonymousClass1CO A01;

    public AnonymousClass1MP(Context context, AnonymousClass190 r8, AnonymousClass1Cb r9, AnonymousClass1CP r10, AnonymousClass1CO r11) {
        super(context, r8, r9, "companion_devices.db", 18);
        this.A01 = r11;
        this.A00 = r10;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C28331Zy.A01(sQLiteDatabase, "devices");
        sQLiteDatabase.execSQL("CREATE TABLE devices (_id INTEGER PRIMARY KEY AUTOINCREMENT,device_id TEXT,device_os TEXT,platform_type INTEGER,last_active INTEGER,login_time INTEGER,logout_time INTEGER NOT NULL DEFAULT 0,adv_key_index INTEGER NOT NULL DEFAULT 0,full_sync_required INTEGER NOT NULL DEFAULT 0,place_name TEXT,nickname TEXT,support_bot_user_agent_chat_history INTEGER NOT NULL DEFAULT 0,support_cag_reactions_and_polls_history INTEGER NOT NULL DEFAULT 0,support_recent_sync_chunk_message_tuning INTEGER NOT NULL DEFAULT 0,support_hosted_group_msg INTEGER NOT NULL DEFAULT 0,support_fbid_bot_chat_history INTEGER NOT NULL DEFAULT 0,support_biz_hosted_msg INTEGER,support_call_log_history INTEGER,inline_initial_hist_sync_payload_enabled INTEGER,full_sync_days_limit INTEGER,full_sync_size_mb_limit INTEGER,storage_quota_mb INTEGER,recent_sync_days_limit INTEGER,companion_meta_nonce TEXT,support_add_on_history_sync_migration INTEGER NOT NULL DEFAULT 0,support_message_association INTEGER NOT NULL DEFAULT 0);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS companion_device_jid_index ON devices(device_id);");
        C28331Zy.A01(sQLiteDatabase, "devices_history");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("CompanionDeviceDbHelper/downgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0046, code lost:
        r4.execSQL("DROP TABLE IF EXISTS devices_history");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        r4.execSQL("ALTER TABLE devices ADD nickname TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        X.C63452t6.A02(r4, "devices", "support_bot_user_agent_chat_history", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        X.C63452t6.A02(r4, "devices", "support_cag_reactions_and_polls_history", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0064, code lost:
        X.C63452t6.A02(r4, "devices", "support_recent_sync_chunk_message_tuning", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        X.C63452t6.A02(r4, "devices", "support_hosted_group_msg", "INTEGER NOT NULL DEFAULT 0");
        X.C63452t6.A02(r4, "devices", "support_fbid_bot_chat_history", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        X.C63452t6.A02(r4, "devices", "support_biz_hosted_msg", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0088, code lost:
        X.C63452t6.A02(r4, "devices", "support_call_log_history", "INTEGER");
        X.C63452t6.A02(r4, "devices", "inline_initial_hist_sync_payload_enabled", "INTEGER");
        X.C63452t6.A02(r4, "devices", "full_sync_days_limit", "INTEGER");
        X.C63452t6.A02(r4, "devices", "full_sync_size_mb_limit", "INTEGER");
        X.C63452t6.A02(r4, "devices", "storage_quota_mb", "INTEGER");
        X.C63452t6.A02(r4, "devices", "recent_sync_days_limit", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ac, code lost:
        X.C63452t6.A02(r4, "devices", "companion_meta_nonce", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b5, code lost:
        X.C63452t6.A02(r4, "devices", "support_add_on_history_sync_migration", "INTEGER NOT NULL DEFAULT 0");
        X.C63452t6.A02(r4, "devices", "support_message_association", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002d, code lost:
        r4.execSQL("ALTER TABLE devices ADD login_time INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        r4.execSQL("ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r4.execSQL("ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003c, code lost:
        r4.execSQL("ALTER TABLE devices ADD place_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0041, code lost:
        r4.execSQL("ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r4, int r5, int r6) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "CompanionDeviceDbHelper/upgrade from "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " to "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            switch(r5) {
                case 1: goto L_0x0028;
                case 2: goto L_0x002d;
                case 3: goto L_0x0032;
                case 4: goto L_0x0037;
                case 5: goto L_0x003c;
                case 6: goto L_0x0041;
                case 7: goto L_0x0046;
                case 8: goto L_0x0046;
                case 9: goto L_0x004b;
                case 10: goto L_0x0050;
                case 11: goto L_0x005a;
                case 12: goto L_0x0064;
                case 13: goto L_0x006e;
                case 14: goto L_0x007e;
                case 15: goto L_0x0088;
                case 16: goto L_0x00ac;
                case 17: goto L_0x00b5;
                default: goto L_0x001f;
            }
        L_0x001f:
            java.lang.String r0 = "CompanionDeviceDbHelper/upgrade unknown old version"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3.onCreate(r4)
            return
        L_0x0028:
            java.lang.String r0 = "ALTER TABLE devices ADD platform_type INTEGER"
            r4.execSQL(r0)
        L_0x002d:
            java.lang.String r0 = "ALTER TABLE devices ADD login_time INTEGER"
            r4.execSQL(r0)
        L_0x0032:
            java.lang.String r0 = "ALTER TABLE devices ADD adv_key_index INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x0037:
            java.lang.String r0 = "ALTER TABLE devices ADD full_sync_required INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x003c:
            java.lang.String r0 = "ALTER TABLE devices ADD place_name TEXT"
            r4.execSQL(r0)
        L_0x0041:
            java.lang.String r0 = "ALTER TABLE devices ADD logout_time INTEGER NOT NULL DEFAULT 0"
            r4.execSQL(r0)
        L_0x0046:
            java.lang.String r0 = "DROP TABLE IF EXISTS devices_history"
            r4.execSQL(r0)
        L_0x004b:
            java.lang.String r0 = "ALTER TABLE devices ADD nickname TEXT"
            r4.execSQL(r0)
        L_0x0050:
            java.lang.String r2 = "support_bot_user_agent_chat_history"
            java.lang.String r1 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r0 = "devices"
            X.C63452t6.A02(r4, r0, r2, r1)
        L_0x005a:
            java.lang.String r2 = "support_cag_reactions_and_polls_history"
            java.lang.String r1 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r0 = "devices"
            X.C63452t6.A02(r4, r0, r2, r1)
        L_0x0064:
            java.lang.String r2 = "support_recent_sync_chunk_message_tuning"
            java.lang.String r1 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r0 = "devices"
            X.C63452t6.A02(r4, r0, r2, r1)
        L_0x006e:
            java.lang.String r2 = "devices"
            java.lang.String r0 = "support_hosted_group_msg"
            java.lang.String r1 = "INTEGER NOT NULL DEFAULT 0"
            X.C63452t6.A02(r4, r2, r0, r1)
            java.lang.String r0 = "support_fbid_bot_chat_history"
            X.C63452t6.A02(r4, r2, r0, r1)
        L_0x007e:
            java.lang.String r2 = "support_biz_hosted_msg"
            java.lang.String r1 = "INTEGER"
            java.lang.String r0 = "devices"
            X.C63452t6.A02(r4, r0, r2, r1)
        L_0x0088:
            java.lang.String r2 = "devices"
            java.lang.String r0 = "support_call_log_history"
            java.lang.String r1 = "INTEGER"
            X.C63452t6.A02(r4, r2, r0, r1)
            java.lang.String r0 = "inline_initial_hist_sync_payload_enabled"
            X.C63452t6.A02(r4, r2, r0, r1)
            java.lang.String r0 = "full_sync_days_limit"
            X.C63452t6.A02(r4, r2, r0, r1)
            java.lang.String r0 = "full_sync_size_mb_limit"
            X.C63452t6.A02(r4, r2, r0, r1)
            java.lang.String r0 = "storage_quota_mb"
            X.C63452t6.A02(r4, r2, r0, r1)
            java.lang.String r0 = "recent_sync_days_limit"
            X.C63452t6.A02(r4, r2, r0, r1)
        L_0x00ac:
            java.lang.String r2 = "companion_meta_nonce"
            java.lang.String r1 = "TEXT"
            java.lang.String r0 = "devices"
            X.C63452t6.A02(r4, r0, r2, r1)
        L_0x00b5:
            java.lang.String r2 = "devices"
            java.lang.String r0 = "support_add_on_history_sync_migration"
            java.lang.String r1 = "INTEGER NOT NULL DEFAULT 0"
            X.C63452t6.A02(r4, r2, r0, r1)
            java.lang.String r0 = "support_message_association"
            X.C63452t6.A02(r4, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1MP.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public C23141Ev A09() {
        String databaseName = getDatabaseName();
        return AnonymousClass1Eu.A03(super.A04(), this.A00, this.A01, databaseName);
    }
}
