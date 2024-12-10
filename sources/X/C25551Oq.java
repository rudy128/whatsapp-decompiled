package X;

import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1Oq  reason: invalid class name and case insensitive filesystem */
public class C25551Oq extends C24801Ls {
    public final AnonymousClass1CO A00;
    public final AnonymousClass10W A01;
    public final AnonymousClass00H A02;

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE syncd_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, collection_name TEXT NOT NULL, are_dependencies_missing BOOLEAN NOT NULL, mutation_mac BLOB, device_id INTEGER NOT NULL DEFAULT 0, epoch INTEGER NOT NULL DEFAULT 0, chat_jid TEXT, mutation_name TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE collection_versions (collection_name TEXT PRIMARY KEY, version INTEGER NOT NULL, lt_hash BLOB, dirty_version INTEGER NOT NULL DEFAULT -1 ) ");
        sQLiteDatabase.execSQL("CREATE TABLE pending_mutations(_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, mutation_index TEXT UNIQUE NOT NULL, mutation_value BLOB, mutation_version INTEGER NOT NULL, operation BLOB NOT NULL, is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1, collection_name TEXT, device_id INTEGER, epoch INTEGER, are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0, mutation_name TEXT NOT NULL DEFAULT '', chat_jid TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE peer_messages(_id INTEGER PRIMARY KEY AUTOINCREMENT,message_type INTEGER NOT NULL, key_remote_jid TEXT NOT NULL, key_from_me INTEGER, key_id TEXT NOT NULL, device_id TEXT, timestamp INTEGER, data TEXT, acked BOOLEAN )");
        sQLiteDatabase.execSQL("CREATE TABLE msg_history_sync(_id INTEGER PRIMARY KEY AUTOINCREMENT, device_id TEXT NOT NULL, sync_type INTEGER NOT NULL, last_processed_msg_row_id INTEGER, oldest_msg_row_id INTEGER, sent_msgs_count INTEGER, chunk_order INTEGER, sent_bytes INTEGER, last_chunk_timestamp INTEGER, status INTEGER, peer_msg_row_id INTEGER, oldest_message_to_sync_row_id INTEGER, session_id TEXT, md_reg_attempt_id TEXT, size_limit_bytes INTEGER, full_history_on_demand_request_id TEXT )");
        sQLiteDatabase.execSQL("CREATE TABLE crypto_info (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, key_data BLOB NOT NULL, timestamp INTEGER NOT NULL, fingerprint BLOB NOT NULL, stale_timestamp INTEGER NOT NULL DEFAULT 0, PRIMARY KEY ( device_id , epoch ) )");
        sQLiteDatabase.execSQL("CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )");
        sQLiteDatabase.execSQL("CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
        sQLiteDatabase.execSQL("CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB, enc_handle TEXT )");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)");
        sQLiteDatabase.execSQL("CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) ");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS placeholder_retry_message (message_row_id INTEGER PRIMARY KEY NOT NULL, peer_message_row_id INTEGER NOT NULL, timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS placeholder_retry_timestamp_index ON placeholder_retry_message (timestamp)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS placeholder_retry_peer_msg_index ON placeholder_retry_message (peer_message_row_id)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("sync-db-helper/onDowngrade oldVersion:");
        sb.append(i);
        sb.append(", newVersion:");
        sb.append(i2);
        Log.i(sb.toString());
        A0A(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0097, code lost:
        r5.execSQL(X.AnonymousClass2WP.A01);
        r5.execSQL(X.AnonymousClass2WP.A00);
        X.C28331Zy.A01(r5, "fanout_backfill_messages");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a6, code lost:
        r5.execSQL("ALTER TABLE collection_versions ADD lt_hash BLOB");
        r5.execSQL("ALTER TABLE syncd_mutations ADD mutation_mac BLOB");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00b0, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00b5, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ba, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD collection_name TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00bf, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD device_id INTEGER");
        r5.execSQL("ALTER TABLE pending_mutations ADD epoch INTEGER");
        r5.execSQL("ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0");
        r5.execSQL("ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00d3, code lost:
        r5.execSQL("ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00d8, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00dd, code lost:
        r5.execSQL("ALTER TABLE syncd_mutations ADD chat_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00e2, code lost:
        r5.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ec, code lost:
        r5.execSQL("ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00f1, code lost:
        r5.execSQL("ALTER TABLE peer_messages ADD acked BOOLEAN ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00f6, code lost:
        X.C28331Zy.A01(r5, "encrypted_mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00fb, code lost:
        r5.execSQL("ALTER TABLE syncd_mutations ADD mutation_name TEXT");
        r5.execSQL("ALTER TABLE pending_mutations ADD mutation_name TEXT NOT NULL DEFAULT ''");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0105, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD session_id TEXT");
        r5.execSQL("ALTER TABLE msg_history_sync ADD md_reg_attempt_id TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x010f, code lost:
        r5.execSQL("ALTER TABLE pending_mutations ADD chat_jid TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0114, code lost:
        r5.execSQL("CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB, enc_handle TEXT )");
        r5.execSQL("CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x011e, code lost:
        r5.execSQL("CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) ");
        r5.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x012d, code lost:
        r5.execSQL("ALTER TABLE msg_history_sync ADD size_limit_bytes INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0134, code lost:
        if (r6 < 44) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x013b, code lost:
        r5.execSQL("CREATE TABLE IF NOT EXISTS placeholder_retry_message (message_row_id INTEGER PRIMARY KEY NOT NULL, peer_message_row_id INTEGER NOT NULL, timestamp INTEGER NOT NULL)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS placeholder_retry_timestamp_index ON placeholder_retry_message (timestamp)");
        r5.execSQL("CREATE INDEX IF NOT EXISTS placeholder_retry_peer_msg_index ON placeholder_retry_message (peer_message_row_id)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x014a, code lost:
        X.C63452t6.A02(r5, "msg_history_sync", "full_history_on_demand_request_id", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0153, code lost:
        X.C63452t6.A02(r5, "history_sync_companion", "enc_handle", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x015e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003e, code lost:
        r3 = r4.A01.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
        if (r3.hasNext() == false) goto L_0x015e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x004a, code lost:
        r2 = (X.C53402cT) r3.next();
        r1 = new java.lang.StringBuilder();
        r1.append("sync-db-observer/onDbReset(");
        r1.append(r6);
        r1.append(", ");
        r1.append(r7);
        r1.append(')');
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0074, code lost:
        if (r6 >= 43) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0076, code lost:
        if (43 > r7) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0078, code lost:
        r2.A00.A01(new com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sync-db-helper/onUpgrade oldVersion:"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r2 = ", newVersion:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            switch(r6) {
                case 23: goto L_0x0083;
                case 24: goto L_0x0097;
                case 25: goto L_0x00a6;
                case 26: goto L_0x00b0;
                case 27: goto L_0x00b5;
                case 28: goto L_0x00ba;
                case 29: goto L_0x00bf;
                case 30: goto L_0x00d3;
                case 31: goto L_0x00d8;
                case 32: goto L_0x00dd;
                case 33: goto L_0x00e2;
                case 34: goto L_0x00ec;
                case 35: goto L_0x00f1;
                case 36: goto L_0x00f6;
                case 37: goto L_0x00fb;
                case 38: goto L_0x0105;
                case 39: goto L_0x0105;
                case 40: goto L_0x0105;
                case 41: goto L_0x010f;
                case 42: goto L_0x0114;
                case 43: goto L_0x0114;
                case 44: goto L_0x011e;
                case 45: goto L_0x011e;
                case 46: goto L_0x012d;
                case 47: goto L_0x0136;
                case 48: goto L_0x013b;
                case 49: goto L_0x014a;
                case 50: goto L_0x0153;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sync-db-helper/onUpgrade unknown oldVersion:"
            r1.append(r0)
            r1.append(r6)
            r1.append(r2)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r4.A0A(r5)
        L_0x003e:
            X.10W r0 = r4.A01
            java.util.Iterator r3 = r0.iterator()
        L_0x0044:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x015e
            java.lang.Object r2 = r3.next()
            X.2cT r2 = (X.C53402cT) r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "sync-db-observer/onDbReset("
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r7)
            r0 = 41
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 43
            if (r6 >= r0) goto L_0x0044
            if (r0 > r7) goto L_0x0044
            X.1Mm r1 = r2.A00
            com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob r0 = new com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob
            r0.<init>()
            r1.A01(r0)
            goto L_0x0044
        L_0x0083:
            java.lang.String r0 = "DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger"
            r5.execSQL(r0)
            java.lang.String r0 = "missing_keys"
            X.C28331Zy.A01(r5, r0)
            java.lang.String r0 = "CREATE TABLE missing_keys (device_id INTEGER NOT NULL, epoch INTEGER NOT NULL, collection_name TEXT NOT NULL, PRIMARY KEY ( device_id , epoch , collection_name ) )"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE TRIGGER crypto_info_bi_for_missing_keys_trigger AFTER INSERT ON crypto_info BEGIN DELETE FROM missing_keys WHERE device_id=new.device_id AND epoch=new.epoch; END"
            r5.execSQL(r0)
        L_0x0097:
            java.lang.String r0 = X.AnonymousClass2WP.A01
            r5.execSQL(r0)
            java.lang.String r0 = X.AnonymousClass2WP.A00
            r5.execSQL(r0)
            java.lang.String r0 = "fanout_backfill_messages"
            X.C28331Zy.A01(r5, r0)
        L_0x00a6:
            java.lang.String r0 = "ALTER TABLE collection_versions ADD lt_hash BLOB"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD mutation_mac BLOB"
            r5.execSQL(r0)
        L_0x00b0:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD oldest_message_to_sync_row_id INTEGER"
            r5.execSQL(r0)
        L_0x00b5:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD is_ready_to_sync BOOLEAN NOT NULL DEFAULT 1"
            r5.execSQL(r0)
        L_0x00ba:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD collection_name TEXT"
            r5.execSQL(r0)
        L_0x00bf:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD device_id INTEGER"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD epoch INTEGER"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD device_id INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD epoch INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00d3:
            java.lang.String r0 = "ALTER TABLE crypto_info ADD stale_timestamp INTEGER NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00d8:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD are_dependencies_missing BOOLEAN NOT NULL DEFAULT 0"
            r5.execSQL(r0)
        L_0x00dd:
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD chat_jid TEXT"
            r5.execSQL(r0)
        L_0x00e2:
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_index ON syncd_mutations (are_dependencies_missing)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS syncd_mutations_active_mutations_chat_jid_index ON syncd_mutations (chat_jid, are_dependencies_missing)"
            r5.execSQL(r0)
        L_0x00ec:
            java.lang.String r0 = "ALTER TABLE collection_versions ADD dirty_version INTEGER NOT NULL DEFAULT -1"
            r5.execSQL(r0)
        L_0x00f1:
            java.lang.String r0 = "ALTER TABLE peer_messages ADD acked BOOLEAN "
            r5.execSQL(r0)
        L_0x00f6:
            java.lang.String r0 = "encrypted_mutations"
            X.C28331Zy.A01(r5, r0)
        L_0x00fb:
            java.lang.String r0 = "ALTER TABLE syncd_mutations ADD mutation_name TEXT"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD mutation_name TEXT NOT NULL DEFAULT ''"
            r5.execSQL(r0)
        L_0x0105:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD session_id TEXT"
            r5.execSQL(r0)
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD md_reg_attempt_id TEXT"
            r5.execSQL(r0)
        L_0x010f:
            java.lang.String r0 = "ALTER TABLE pending_mutations ADD chat_jid TEXT"
            r5.execSQL(r0)
        L_0x0114:
            java.lang.String r0 = "CREATE TABLE history_sync_companion (message_id TEXT PRIMARY KEY NOT NULL, sync_type INTEGER NOT NULL, chunk_order INTEGER NOT NULL, media_key BLOB, media_hash TEXT NOT NULL, media_enc_hash TEXT NOT NULL, file_size INTEGER NOT NULL, direct_path TEXT NOT NULL, local_path TEXT, start_time INTEGER, inline_payload BLOB, enc_handle TEXT )"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS history_sync_companion_index ON history_sync_companion (sync_type,chunk_order)"
            r5.execSQL(r0)
        L_0x011e:
            java.lang.String r0 = "CREATE TABLE rmr_response_error (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, file_key TEXT NOT NULL, rmr_source INTEGER NOT NULL, failure_count INTEGER NOT NULL, response_device_id INTEGER NOT NULL, last_fetch_timestamp INTEGER NOT NULL  ) "
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source ON rmr_response_error (file_key, rmr_source)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS rmr_response_error_file_key_rmr_source_device_id ON rmr_response_error (file_key, rmr_source, response_device_id)"
            r5.execSQL(r0)
        L_0x012d:
            java.lang.String r0 = "ALTER TABLE msg_history_sync ADD size_limit_bytes INTEGER"
            r5.execSQL(r0)
            r0 = 44
            if (r6 < r0) goto L_0x013b
        L_0x0136:
            java.lang.String r0 = "ALTER TABLE history_sync_companion ADD inline_payload BLOB"
            r5.execSQL(r0)
        L_0x013b:
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS placeholder_retry_message (message_row_id INTEGER PRIMARY KEY NOT NULL, peer_message_row_id INTEGER NOT NULL, timestamp INTEGER NOT NULL)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS placeholder_retry_timestamp_index ON placeholder_retry_message (timestamp)"
            r5.execSQL(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS placeholder_retry_peer_msg_index ON placeholder_retry_message (peer_message_row_id)"
            r5.execSQL(r0)
        L_0x014a:
            java.lang.String r2 = "full_history_on_demand_request_id"
            java.lang.String r1 = "TEXT"
            java.lang.String r0 = "msg_history_sync"
            X.C63452t6.A02(r5, r0, r2, r1)
        L_0x0153:
            java.lang.String r2 = "enc_handle"
            java.lang.String r1 = "TEXT"
            java.lang.String r0 = "history_sync_companion"
            X.C63452t6.A02(r5, r0, r2, r1)
            goto L_0x003e
        L_0x015e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25551Oq.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    public C25551Oq(AnonymousClass190 r8, AnonymousClass118 r9, AnonymousClass1Cb r10, AnonymousClass1CO r11, AnonymousClass00H r12, AnonymousClass00H r13) {
        super(r9.A00, r8, r10, "sync.db", 51);
        this.A00 = r11;
        this.A02 = r12;
        this.A01 = new AnonymousClass10W(r13);
    }

    public C23141Ev A09() {
        String databaseName = getDatabaseName();
        return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A02.get(), this.A00, databaseName);
    }

    public void A0A(SQLiteDatabase sQLiteDatabase) {
        Log.i("sync-db-helper/reset");
        C28331Zy.A01(sQLiteDatabase, "syncd_mutations");
        C28331Zy.A01(sQLiteDatabase, "collection_versions");
        C28331Zy.A01(sQLiteDatabase, "pending_mutations");
        C28331Zy.A01(sQLiteDatabase, "peer_messages");
        C28331Zy.A01(sQLiteDatabase, "msg_history_sync");
        C28331Zy.A01(sQLiteDatabase, "crypto_info");
        sQLiteDatabase.execSQL(AnonymousClass2WP.A01);
        sQLiteDatabase.execSQL(AnonymousClass2WP.A00);
        C28331Zy.A01(sQLiteDatabase, "fanout_backfill_messages");
        sQLiteDatabase.execSQL("DROP TRIGGER IF EXISTS crypto_info_bi_for_missing_keys_trigger");
        C28331Zy.A01(sQLiteDatabase, "missing_keys");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS syncd_mutations_active_mutations_chat_jid_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS history_sync_companion_index");
        C28331Zy.A01(sQLiteDatabase, "history_sync_companion");
        C28331Zy.A01(sQLiteDatabase, "rmr_response_error");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS rmr_response_error_file_key_rmr_source");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS rmr_response_error_file_key_rmr_source_device_id");
        C28331Zy.A01(sQLiteDatabase, "placeholder_retry_message");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS placeholder_retry_timestamp_index");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS placeholder_retry_peer_msg_index");
        onCreate(sQLiteDatabase);
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            Log.i("sync-db-observer/onDbReset");
            ((C53402cT) it.next()).A01.A03(5);
        }
    }
}
