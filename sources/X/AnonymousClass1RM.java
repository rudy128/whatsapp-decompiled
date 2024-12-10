package X;

import android.database.sqlite.SQLiteDatabase;

/* renamed from: X.1RM  reason: invalid class name */
public class AnonymousClass1RM extends C24801Ls {
    public final AnonymousClass1CO A00;
    public final AnonymousClass00H A01;

    public AnonymousClass1RM(AnonymousClass190 r7, AnonymousClass118 r8, AnonymousClass1Cb r9, AnonymousClass1CO r10, AnonymousClass00H r11) {
        super(r8.A00, r7, r9, "media.db", 28);
        this.A00 = r10;
        this.A01 = r11;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        C28331Zy.A01(sQLiteDatabase, "media_job");
        C28331Zy.A01(sQLiteDatabase, "media_experiments");
        C28331Zy.A01(sQLiteDatabase, "web_upload_media_data_store");
        C28331Zy.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C28331Zy.A01(sQLiteDatabase, "express_path_download_data");
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE draft_voice_note_metadata (chat_jid TEXT PRIMARY KEY NOT NULL, page_number INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE express_path_download_data (enc_file_hash TEXT PRIMARY KEY NOT NULL, ep_saved_time_ms INTEGER, ep_saved_bytes INTEGER, download_state INTEGER, last_update_time TIMESTAMP, enc_file_restored BOOLEAN DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS enc_file_hash_index ON express_path_download_data (enc_file_hash)");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C28331Zy.A01(sQLiteDatabase, "media_job");
        C28331Zy.A01(sQLiteDatabase, "media_experiments");
        C28331Zy.A01(sQLiteDatabase, "web_upload_media_key_store");
        C28331Zy.A01(sQLiteDatabase, "web_upload_media_data_store");
        C28331Zy.A01(sQLiteDatabase, "shared_media_ids");
        C28331Zy.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C28331Zy.A01(sQLiteDatabase, "express_path_download_data");
        onCreate(sQLiteDatabase);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C28331Zy.A01(sQLiteDatabase, "media_job");
        C28331Zy.A01(sQLiteDatabase, "media_experiments");
        C28331Zy.A01(sQLiteDatabase, "web_upload_media_data_store");
        C28331Zy.A01(sQLiteDatabase, "shared_media_ids");
        C28331Zy.A01(sQLiteDatabase, "draft_voice_note_metadata");
        C28331Zy.A01(sQLiteDatabase, "express_path_download_data");
        if (i < 16) {
            C28331Zy.A01(sQLiteDatabase, "web_upload_media_key_store");
        }
        sQLiteDatabase.execSQL("CREATE TABLE media_job (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,uuid TEXT NOT NULL, job_type INTEGER, create_time TIMESTAMP, transfer_start_time TIMESTAMP, last_update_time TIMESTAMP, user_initiated_attempt_count INTEGER, overall_cumulative_time TIMESTAMP, overall_cumulative_user_visible_time TIMESTAMP, streaming_playback_count INTEGER, media_key_reuse_type INTEGER, doodle_id TEXT, transferred_bytes INTEGER,reupload_attempt_count INTEGER,last_reupload_attempt_timestamp TIMESTAMP,last_reupload_success_timestamp TIMESTAMP)");
        sQLiteDatabase.execSQL("CREATE TABLE shared_media_ids (item_uuid TEXT PRIMARY KEY NOT NULL, file_name TEXT NOT NULL, mime_type TEXT NOT NULL, display_name TEXT, expiration_timestamp INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE draft_voice_note_metadata (chat_jid TEXT PRIMARY KEY NOT NULL, page_number INTEGER)");
        sQLiteDatabase.execSQL("CREATE TABLE express_path_download_data (enc_file_hash TEXT PRIMARY KEY NOT NULL, ep_saved_time_ms INTEGER, ep_saved_bytes INTEGER, download_state INTEGER, last_update_time TIMESTAMP, enc_file_restored BOOLEAN DEFAULT 0)");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS enc_file_hash_index ON express_path_download_data (enc_file_hash)");
    }

    public C23141Ev A09() {
        String databaseName = getDatabaseName();
        return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A01.get(), this.A00, databaseName);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
    }
}
