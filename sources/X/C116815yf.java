package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: X.5yf  reason: invalid class name and case insensitive filesystem */
public class C116815yf extends C24801Ls implements AutoCloseable {
    public final AnonymousClass190 A00;
    public final AnonymousClass1CO A01;
    public final AnonymousClass00H A02;

    public C116815yf(AnonymousClass190 r7, AnonymousClass118 r8, AnonymousClass1Cb r9, AnonymousClass1CO r10, AnonymousClass00H r11) {
        super(r8.A00, r7, r9, "stickers.db", 47);
        this.A00 = r7;
        this.A01 = r10;
        this.A02 = r11;
    }

    private void A01(SQLiteDatabase sQLiteDatabase) {
        C28331Zy.A01(sQLiteDatabase, "downloadable_sticker_packs");
        C28331Zy.A01(sQLiteDatabase, "stickers");
        C28331Zy.A01(sQLiteDatabase, "installed_sticker_packs");
        C28331Zy.A01(sQLiteDatabase, "starred_stickers");
        C28331Zy.A01(sQLiteDatabase, "sticker_pack_order");
        C28331Zy.A01(sQLiteDatabase, "recent_stickers");
        C28331Zy.A01(sQLiteDatabase, "unseen_sticker_packs");
        C28331Zy.A01(sQLiteDatabase, "third_party_whitelist_packs");
        C28331Zy.A01(sQLiteDatabase, "new_sticker_packs");
        C28331Zy.A01(sQLiteDatabase, "third_party_sticker_emoji_mapping");
        C28331Zy.A01(sQLiteDatabase, "avatar_sticker_search_dictionary");
        C28331Zy.A01(sQLiteDatabase, "sticker_md_upload");
    }

    public static void A02(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_is_avatar_index ON stickers (is_avatar)");
        } catch (SQLiteException e) {
            C17960vV.A09("StickerDBHelper/addStickerIsAvatarColumnIndex", e);
        }
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, accessibility_text TEXT, PRIMARY KEY(plain_file_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
        sQLiteDatabase.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, installed_pack_type TEXT, is_created_by_me INTEGER, PRIMARY KEY(installed_id))");
        sQLiteDatabase.execSQL("CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avatar INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , accessibility_text TEXT , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , accessibility_text TEXT , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
        sQLiteDatabase.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
        sQLiteDatabase.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))");
        sQLiteDatabase.execSQL("CREATE TABLE avatar_sticker_search_dictionary (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, sticker_id TEXT NOT NULL, tag TEXT NOT NULL, weight INTEGER NOT NULL DEFAULT 0)");
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_avatar_template_id_index ON stickers (avatar_template_id)");
        } catch (SQLiteException e) {
            C17960vV.A09("StickerDBHelper/addStickerIsAvatarColumnIndex", e);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)");
        } catch (SQLiteException e2) {
            C17960vV.A09("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e2);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_avatar_template_index ON recent_stickers (avatar_template_id)");
        } catch (SQLiteException e3) {
            C17960vV.A09("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e3);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS starred_sticker_is_avatar_index ON starred_stickers (is_avatar)");
        } catch (SQLiteException e4) {
            C17960vV.A09("StickersDBHelper/addStarredStickerAvocadoColumnIndex", e4);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS starred_sticker_avatar_template_id_index ON starred_stickers (avatar_template_id)");
        } catch (SQLiteException e5) {
            C17960vV.A09("StickersDBHelper/addRecentStickerAvocadoColumnIndex", e5);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS installed_sticker_packs_avatar_pack_index ON installed_sticker_packs (installed_is_avatar_pack)");
        } catch (SQLiteException e6) {
            C17960vV.A09("StickerDBHelper/addInstalledIsAvatarStickerPackColumnIndex", e6);
        }
        try {
            sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS sticker_pack_id_index ON stickers (sticker_pack_id)");
        } catch (SQLiteException e7) {
            C17960vV.A09("StickerDBHelper/addStickerPackIdIndex", e7);
        }
        A02(sQLiteDatabase);
        try {
            sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS avatar_sticker_search_index ON avatar_sticker_search_dictionary (tag, sticker_id)");
        } catch (SQLiteException e8) {
            C17960vV.A09("StickerDBHelper/addAvatarStickerSearchIndex", e8);
        }
    }

    public C23141Ev A09() {
        String databaseName = getDatabaseName();
        return AnonymousClass1Eu.A03(super.A04(), (AnonymousClass1CP) this.A02.get(), this.A01, databaseName);
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StickerDBHelper/onDowngrade/oldVersion:");
        A10.append(i);
        C17900vP.A0j(", newVersion:", A10, i2);
        A01(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0400, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0401, code lost:
        if (r12 != null) goto L_0x0403;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0406, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x009f, code lost:
        X.C28331Zy.A01(r11, "unseen_sticker_packs");
        r11.execSQL("CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0407, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0408, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x040b, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00a9, code lost:
        X.C28331Zy.A01(r11, "third_party_whitelist_packs");
        r11.execSQL("CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b1, code lost:
        X.C28331Zy.A01(r11, "installed_sticker_packs");
        r11.execSQL("CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, installed_pack_type TEXT, is_created_by_me INTEGER, PRIMARY KEY(installed_id))");
        X.C28331Zy.A01(r11, "stickers");
        r11.execSQL("CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, accessibility_text TEXT, PRIMARY KEY(plain_file_hash))");
        X.C28331Zy.A01(r11, "downloadable_sticker_packs");
        r11.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00c7, code lost:
        X.C63452t6.A02(r11, "third_party_whitelist_packs", "sticker_pack_name", "TEXT");
        X.C63452t6.A02(r11, "third_party_whitelist_packs", "sticker_pack_publisher", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00d1, code lost:
        X.C28331Zy.A01(r11, "new_sticker_packs");
        r11.execSQL("CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00db, code lost:
        X.C63452t6.A02(r11, "stickers", "direct_path", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00e0, code lost:
        X.C63452t6.A02(r11, "recent_stickers", "hash_of_image_part", "TEXT");
        X.C63452t6.A02(r11, "starred_stickers", "hash_of_image_part", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00e6, code lost:
        X.C63452t6.A02(r11, "third_party_whitelist_packs", "sticker_pack_image_data_hash", "TEXT");
        X.C63452t6.A02(r11, "third_party_whitelist_packs", "avoid_cache", "INTEGER");
        X.C63452t6.A02(r11, "third_party_whitelist_packs", "is_animated_pack", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00f5, code lost:
        X.C63452t6.A02(r11, "downloadable_sticker_packs", "animated_pack", "INTEGER");
        X.C63452t6.A02(r11, "installed_sticker_packs", "installed_animated_pack", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ff, code lost:
        X.C63452t6.A02(r11, "recent_stickers", "url", "TEXT");
        X.C63452t6.A02(r11, "recent_stickers", "enc_hash", "TEXT");
        X.C63452t6.A02(r11, "recent_stickers", "direct_path", "TEXT");
        X.C63452t6.A02(r11, "recent_stickers", "mimetype", "TEXT");
        X.C63452t6.A02(r11, "recent_stickers", "media_key", "TEXT");
        X.C63452t6.A02(r11, "recent_stickers", "file_size", "INTEGER");
        X.C63452t6.A02(r11, "recent_stickers", "width", "INTEGER");
        X.C63452t6.A02(r11, "recent_stickers", "height", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0127, code lost:
        r14 = new java.lang.String[]{"urlTEXT", "enc_hashTEXT", "direct_pathTEXT", "mimetypeTEXT", "media_keyTEXT", "file_sizeINTEGER", "widthINTEGER", "heightINTEGER"};
        r13 = X.C17880vN.A13();
        r13.put("plaintext_hash", "TEXT NOT NULL");
        r13.put("entry_weight", "FLOAT NOT NULL");
        r13.put("hash_of_image_part", "TEXT");
        r13.put("url", "TEXT");
        r13.put("enc_hash", "TEXT");
        r13.put("direct_path", "TEXT");
        r13.put("mimetype", "TEXT");
        r13.put("media_key", "TEXT");
        r13.put("file_size", "INTEGER");
        r13.put("width", "INTEGER");
        r13.put("height", "INTEGER");
        r1 = X.AnonymousClass000.A10();
        r1.append("SELECT * FROM ");
        r1.append("recent_stickers");
        r12 = r11.rawQuery(X.AnonymousClass000.A0y(" LIMIT 0", r1), (java.lang.String[]) null);
        r15 = 0;
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0 = r14[r15];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x01b8, code lost:
        if (r16 != false) goto L_0x01c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x01ba, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01c1, code lost:
        if (r12.getColumnIndex(r0) == -1) goto L_0x01c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x01c3, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01c5, code lost:
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01c9, code lost:
        if (r15 < 8) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x01cb, code lost:
        if (r16 == false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01cd, code lost:
        r16 = r13.keySet();
        r15 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x01d9, code lost:
        if (r15.hasNext() == false) goto L_0x01fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x01db, code lost:
        r1 = X.C17880vN.A0v(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x01e4, code lost:
        if (r12.getColumnIndex(r1) != -1) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01e6, code lost:
        r17.A00.A0G("StickersDBHelper/removeUndesiredColumns", X.AnonymousClass001.A1H(" table migration failed due to non-existent desired column ", r1, X.AnonymousClass000.A11("recent_stickers")), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x01fc, code lost:
        r1 = X.AnonymousClass000.A0y("_temp", X.AnonymousClass000.A11("recent_stickers"));
        r19 = android.text.TextUtils.join(",", r13.keySet());
        r17 = X.AnonymousClass000.A13();
        r16 = r16.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x021c, code lost:
        if (r16.hasNext() == false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x021e, code lost:
        r15 = X.C17880vN.A0v(r16);
        r14 = X.AnonymousClass000.A11(r15);
        r14.append(" ");
        r17.add(X.AnonymousClass000.A0y(X.C108945cZ.A1G(r15, r13), r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0239, code lost:
        r18 = android.text.TextUtils.join(", ", r17);
        r17 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x024b, code lost:
        if (r13.containsKey("plaintext_hash") == false) goto L_0x025e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x024d, code lost:
        r15 = X.AnonymousClass000.A10();
        X.C17890vO.A10(", PRIMARY KEY(", "plaintext_hash", ")", r15);
        r17 = r15.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x025e, code lost:
        r14 = X.AnonymousClass000.A10();
        X.C17900vP.A0c("CREATE TEMPORARY TABLE ", r1, " (", r18, r14);
        r11.execSQL(X.AnonymousClass000.A0y(")", r14));
        r0 = X.AnonymousClass000.A10();
        X.C17900vP.A0c("INSERT INTO ", r1, " SELECT ", r19, r0);
        r11.execSQL(X.AnonymousClass001.A1H(" FROM ", "recent_stickers", r0));
        r11.execSQL(X.C17900vP.A0A("DROP TABLE ", "recent_stickers"));
        r14 = X.AnonymousClass000.A10();
        X.C17900vP.A0c("CREATE TABLE ", "recent_stickers", " (", r18, r14);
        r11.execSQL(X.AnonymousClass001.A1H(r17, ")", r14));
        r14 = X.AnonymousClass000.A10();
        X.C17900vP.A0c("INSERT INTO ", "recent_stickers", " SELECT ", r19, r14);
        r11.execSQL(X.AnonymousClass001.A1H(" FROM ", r1, r14));
        r11.execSQL(X.C17900vP.A0A("DROP TABLE ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x02ca, code lost:
        if (r12 == null) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x02cc, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x02cf, code lost:
        X.C63452t6.A02(r11, "starred_stickers", "url", "TEXT");
        X.C63452t6.A02(r11, "starred_stickers", "enc_hash", "TEXT");
        X.C63452t6.A02(r11, "starred_stickers", "direct_path", "TEXT");
        X.C63452t6.A02(r11, "starred_stickers", "mimetype", "TEXT");
        X.C63452t6.A02(r11, "starred_stickers", "media_key", "TEXT");
        X.C63452t6.A02(r11, "starred_stickers", "file_size", "INTEGER");
        X.C63452t6.A02(r11, "starred_stickers", "width", "INTEGER");
        X.C63452t6.A02(r11, "starred_stickers", "height", "INTEGER");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x02f7, code lost:
        X.C63452t6.A02(r11, "stickers", "emojis", "TEXT");
        X.C63452t6.A02(r11, "recent_stickers", "emojis", "TEXT");
        X.C63452t6.A02(r11, "recent_stickers", "is_first_party", "INTEGER");
        X.C63452t6.A02(r11, "starred_stickers", "emojis", "TEXT");
        X.C63452t6.A02(r11, "starred_stickers", "is_first_party", "INTEGER");
        X.C28331Zy.A01(r11, "third_party_sticker_emoji_mapping");
        r11.execSQL("CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0314, code lost:
        X.C63452t6.A02(r11, "stickers", "hash_of_image_part", "TEXT");
        X.C63452t6.A02(r11, "third_party_sticker_emoji_mapping", "hash_of_image_part", "TEXT");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x031c, code lost:
        X.C63452t6.A02(r11, "recent_stickers", "is_avocado", "INTEGER NOT NULL DEFAULT 0");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r11.execSQL("CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0327, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0328, code lost:
        X.C17960vV.A09("StickersDBHelper/addRecentStickerAvocadoColumnIndex", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0081, code lost:
        X.C28331Zy.A01(r11, "downloadable_sticker_packs");
        r11.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
        X.C28331Zy.A01(r11, "sticker_pack_order");
        r11.execSQL("CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0091, code lost:
        X.C28331Zy.A01(r11, "recent_stickers");
        r11.execSQL("CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , accessibility_text TEXT , PRIMARY KEY(plaintext_hash))");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0099, code lost:
        X.C28331Zy.A01(r11, "downloadable_sticker_packs");
        r11.execSQL("CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r36, int r37, int r38) {
        /*
            r35 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "StickersDBHelper/onUpgrade/old version:"
            r1.append(r0)
            r14 = r37
            r1.append(r14)
            java.lang.String r0 = ", new version: "
            r1.append(r0)
            r13 = r38
            r1.append(r13)
            java.lang.String r0 = ", stacktrace:"
            r1.append(r0)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            X.C17890vO.A1A(r1, r0)
            java.lang.String r34 = "avatar_template_id"
            java.lang.String r33 = "height"
            java.lang.String r32 = "width"
            java.lang.String r31 = "file_size"
            java.lang.String r30 = "media_key"
            java.lang.String r29 = "mimetype"
            java.lang.String r28 = "enc_hash"
            java.lang.String r27 = "url"
            java.lang.String r12 = "CREATE TABLE downloadable_sticker_packs (id TEXT NOT NULL, name TEXT, publisher TEXT, description TEXT, size INTEGER NOT NULL, tray_image_id TEXT, tray_image_preview_id TEXT, preview_image_id_array TEXT, image_data_hash TEXT NOT NULL, animated_pack INTEGER NOT NULL, lottie_pack INTEGER, PRIMARY KEY(id))"
            java.lang.String r26 = "direct_path"
            java.lang.String r10 = "hash_of_image_part"
            java.lang.String r9 = "downloadable_sticker_packs"
            java.lang.String r8 = "INTEGER NOT NULL DEFAULT 0"
            java.lang.String r1 = "third_party_whitelist_packs"
            java.lang.String r7 = "installed_sticker_packs"
            java.lang.String r6 = "stickers"
            java.lang.String r5 = "starred_stickers"
            java.lang.String r4 = "recent_stickers"
            java.lang.String r3 = "INTEGER"
            java.lang.String r2 = "TEXT"
            r17 = r35
            r11 = r36
            switch(r37) {
                case 1: goto L_0x0070;
                case 2: goto L_0x0070;
                case 3: goto L_0x0070;
                case 4: goto L_0x0070;
                case 5: goto L_0x0070;
                case 6: goto L_0x0079;
                case 7: goto L_0x0081;
                case 8: goto L_0x0091;
                case 9: goto L_0x0099;
                case 10: goto L_0x009f;
                case 11: goto L_0x00a9;
                case 12: goto L_0x00b1;
                case 13: goto L_0x00c7;
                case 14: goto L_0x00d1;
                case 15: goto L_0x00db;
                case 16: goto L_0x00e0;
                case 17: goto L_0x00e6;
                case 18: goto L_0x00e6;
                case 19: goto L_0x00f5;
                case 20: goto L_0x00ff;
                case 21: goto L_0x00ff;
                case 22: goto L_0x0127;
                case 23: goto L_0x02cf;
                case 24: goto L_0x02f7;
                case 25: goto L_0x0314;
                case 26: goto L_0x031c;
                case 27: goto L_0x031c;
                case 28: goto L_0x032d;
                case 29: goto L_0x033e;
                case 30: goto L_0x034f;
                case 31: goto L_0x0357;
                case 32: goto L_0x035c;
                case 33: goto L_0x0361;
                case 34: goto L_0x0366;
                case 35: goto L_0x0377;
                case 36: goto L_0x0388;
                case 37: goto L_0x0394;
                case 38: goto L_0x03a0;
                case 39: goto L_0x03aa;
                case 40: goto L_0x03ad;
                case 41: goto L_0x03c3;
                case 42: goto L_0x03ca;
                case 43: goto L_0x03d5;
                case 44: goto L_0x03e0;
                case 45: goto L_0x03ea;
                case 46: goto L_0x03f5;
                default: goto L_0x0058;
            }
        L_0x0058:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unknown upgrade from "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r0 = " to "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r13)
            android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
            r0.<init>(r1)
            throw r0
        L_0x0070:
            r0 = r17
            r0.A01(r11)
            r0.onCreate(r11)
            return
        L_0x0079:
            X.C28331Zy.A01(r11, r5)
            java.lang.String r0 = "CREATE TABLE starred_stickers (plaintext_hash TEXT  NOT NULL , timestamp LONG , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avatar INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , accessibility_text TEXT , PRIMARY KEY(plaintext_hash))"
            r11.execSQL(r0)
        L_0x0081:
            X.C28331Zy.A01(r11, r9)
            r11.execSQL(r12)
            java.lang.String r0 = "sticker_pack_order"
            X.C28331Zy.A01(r11, r0)
            java.lang.String r0 = "CREATE TABLE sticker_pack_order (sticker_pack_id TEXT PRIMARY KEY NOT NULL, pack_order INTEGER NOT NULL)"
            r11.execSQL(r0)
        L_0x0091:
            X.C28331Zy.A01(r11, r4)
            java.lang.String r0 = "CREATE TABLE recent_stickers (plaintext_hash TEXT  NOT NULL , entry_weight FLOAT  NOT NULL , hash_of_image_part TEXT , url TEXT , enc_hash TEXT , direct_path TEXT , mimetype TEXT , media_key TEXT , file_size INTEGER , width INTEGER , height INTEGER , emojis TEXT , is_first_party INTEGER , is_avocado INTEGER  NOT NULL  DEFAULT 0 , last_sticker_sent_ts INTEGER  NOT NULL  DEFAULT 0 , avatar_template_id TEXT , is_fun_sticker INTEGER  , is_lottie INTEGER  , accessibility_text TEXT , PRIMARY KEY(plaintext_hash))"
            r11.execSQL(r0)
        L_0x0099:
            X.C28331Zy.A01(r11, r9)
            r11.execSQL(r12)
        L_0x009f:
            java.lang.String r0 = "unseen_sticker_packs"
            X.C28331Zy.A01(r11, r0)
            java.lang.String r0 = "CREATE TABLE unseen_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)"
            r11.execSQL(r0)
        L_0x00a9:
            X.C28331Zy.A01(r11, r1)
            java.lang.String r0 = "CREATE TABLE third_party_whitelist_packs (authority TEXT NOT NULL, sticker_pack_id TEXT NOT NULL, sticker_pack_name TEXT, sticker_pack_publisher TEXT, sticker_pack_image_data_hash TEXT, avoid_cache INTEGER, is_animated_pack INTEGER, PRIMARY KEY (authority,sticker_pack_id))"
            r11.execSQL(r0)
        L_0x00b1:
            X.C28331Zy.A01(r11, r7)
            java.lang.String r0 = "CREATE TABLE installed_sticker_packs (installed_id TEXT NOT NULL, installed_name TEXT, installed_publisher TEXT, installed_description TEXT, installed_size INTEGER NOT NULL, installed_image_data_hash TEXT NOT NULL, installed_tray_image_id TEXT NOT NULL, installed_tray_image_preview_id TEXT, installed_animated_pack INTEGER NOT NULL, installed_is_avatar_pack INTEGER NOT NULL DEFAULT 0, installed_empty_favorites_avatar_template_id TEXT, installed_empty_recents_avatar_template_id TEXT, installed_lottie_pack INTEGER, installed_pack_type TEXT, is_created_by_me INTEGER, PRIMARY KEY(installed_id))"
            r11.execSQL(r0)
            X.C28331Zy.A01(r11, r6)
            java.lang.String r0 = "CREATE TABLE stickers (plain_file_hash TEXT NOT NULL, encrypted_file_hash TEXT, media_key TEXT, mime_type TEXT, height INTEGER NOT NULL, width INTEGER NOT NULL, sticker_pack_id TEXT, file_path TEXT, url TEXT, file_size INTEGER, direct_path TEXT, emojis TEXT, hash_of_image_part TEXT, is_avatar INTEGER NOT NULL DEFAULT 0, avatar_template_id TEXT, is_fun_sticker INTEGER, is_lottie INTEGER, accessibility_text TEXT, PRIMARY KEY(plain_file_hash))"
            r11.execSQL(r0)
            X.C28331Zy.A01(r11, r9)
            r11.execSQL(r12)
        L_0x00c7:
            java.lang.String r0 = "sticker_pack_name"
            X.C63452t6.A02(r11, r1, r0, r2)
            java.lang.String r0 = "sticker_pack_publisher"
            X.C63452t6.A02(r11, r1, r0, r2)
        L_0x00d1:
            java.lang.String r0 = "new_sticker_packs"
            X.C28331Zy.A01(r11, r0)
            java.lang.String r0 = "CREATE TABLE new_sticker_packs (pack_id TEXT PRIMARY KEY NOT NULL)"
            r11.execSQL(r0)
        L_0x00db:
            r0 = r26
            X.C63452t6.A02(r11, r6, r0, r2)
        L_0x00e0:
            X.C63452t6.A02(r11, r4, r10, r2)
            X.C63452t6.A02(r11, r5, r10, r2)
        L_0x00e6:
            java.lang.String r0 = "sticker_pack_image_data_hash"
            X.C63452t6.A02(r11, r1, r0, r2)
            java.lang.String r0 = "avoid_cache"
            X.C63452t6.A02(r11, r1, r0, r3)
            java.lang.String r0 = "is_animated_pack"
            X.C63452t6.A02(r11, r1, r0, r3)
        L_0x00f5:
            java.lang.String r0 = "animated_pack"
            X.C63452t6.A02(r11, r9, r0, r3)
            java.lang.String r0 = "installed_animated_pack"
            X.C63452t6.A02(r11, r7, r0, r3)
        L_0x00ff:
            r0 = r27
            X.C63452t6.A02(r11, r4, r0, r2)
            r0 = r28
            X.C63452t6.A02(r11, r4, r0, r2)
            r0 = r26
            X.C63452t6.A02(r11, r4, r0, r2)
            r0 = r29
            X.C63452t6.A02(r11, r4, r0, r2)
            r0 = r30
            X.C63452t6.A02(r11, r4, r0, r2)
            r0 = r31
            X.C63452t6.A02(r11, r4, r0, r3)
            r0 = r32
            X.C63452t6.A02(r11, r4, r0, r3)
            r0 = r33
            X.C63452t6.A02(r11, r4, r0, r3)
        L_0x0127:
            r0 = 8
            java.lang.String[] r14 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "urlTEXT"
            r14[r1] = r0
            r1 = 1
            java.lang.String r0 = "enc_hashTEXT"
            r14[r1] = r0
            r1 = 2
            java.lang.String r0 = "direct_pathTEXT"
            r14[r1] = r0
            r1 = 3
            java.lang.String r0 = "mimetypeTEXT"
            r14[r1] = r0
            r1 = 4
            java.lang.String r0 = "media_keyTEXT"
            r14[r1] = r0
            r1 = 5
            java.lang.String r0 = "file_sizeINTEGER"
            r14[r1] = r0
            r1 = 6
            java.lang.String r0 = "widthINTEGER"
            r14[r1] = r0
            r1 = 7
            java.lang.String r0 = "heightINTEGER"
            r14[r1] = r0
            java.util.LinkedHashMap r13 = X.C17880vN.A13()
            java.lang.String r25 = "plaintext_hash"
            java.lang.String r1 = "TEXT NOT NULL"
            r0 = r25
            r13.put(r0, r1)
            java.lang.String r1 = "entry_weight"
            java.lang.String r0 = "FLOAT NOT NULL"
            r13.put(r1, r0)
            r13.put(r10, r2)
            r0 = r27
            r13.put(r0, r2)
            r0 = r28
            r13.put(r0, r2)
            r0 = r26
            r13.put(r0, r2)
            r0 = r29
            r13.put(r0, r2)
            r0 = r30
            r13.put(r0, r2)
            r0 = r31
            r13.put(r0, r3)
            r0 = r32
            r13.put(r0, r3)
            r0 = r33
            r13.put(r0, r3)
            java.lang.String r24 = "DROP TABLE "
            java.lang.String r23 = " FROM "
            java.lang.String r22 = " SELECT "
            java.lang.String r21 = "INSERT INTO "
            java.lang.String r20 = " ("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "SELECT * FROM "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " LIMIT 0"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            r0 = 0
            android.database.Cursor r12 = r11.rawQuery(r1, r0)
            r15 = 0
            r16 = 0
        L_0x01b6:
            r0 = r14[r15]     // Catch:{ all -> 0x0400 }
            if (r16 != 0) goto L_0x01c3
            int r1 = r12.getColumnIndex(r0)     // Catch:{ all -> 0x0400 }
            r0 = -1
            r16 = 0
            if (r1 == r0) goto L_0x01c5
        L_0x01c3:
            r16 = 1
        L_0x01c5:
            int r15 = r15 + 1
            r0 = 8
            if (r15 < r0) goto L_0x01b6
            if (r16 == 0) goto L_0x02ca
            java.util.Set r16 = r13.keySet()     // Catch:{ all -> 0x0400 }
            java.util.Iterator r15 = r16.iterator()     // Catch:{ all -> 0x0400 }
        L_0x01d5:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0400 }
            if (r0 == 0) goto L_0x01fc
            java.lang.String r1 = X.C17880vN.A0v(r15)     // Catch:{ all -> 0x0400 }
            int r14 = r12.getColumnIndex(r1)     // Catch:{ all -> 0x0400 }
            r0 = -1
            if (r14 != r0) goto L_0x01d5
            r0 = r17
            X.190 r14 = r0.A00     // Catch:{ all -> 0x0400 }
            java.lang.String r13 = "StickersDBHelper/removeUndesiredColumns"
            java.lang.StringBuilder r15 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0400 }
            java.lang.String r0 = " table migration failed due to non-existent desired column "
            java.lang.String r1 = X.AnonymousClass001.A1H(r0, r1, r15)     // Catch:{ all -> 0x0400 }
            r0 = 1
            r14.A0G(r13, r1, r0)     // Catch:{ all -> 0x0400 }
            goto L_0x02cc
        L_0x01fc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r4)     // Catch:{ all -> 0x0400 }
            java.lang.String r0 = "_temp"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0400 }
            java.lang.String r14 = ","
            java.util.Set r0 = r13.keySet()     // Catch:{ all -> 0x0400 }
            java.lang.String r19 = android.text.TextUtils.join(r14, r0)     // Catch:{ all -> 0x0400 }
            java.util.ArrayList r17 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0400 }
            java.util.Iterator r16 = r16.iterator()     // Catch:{ all -> 0x0400 }
        L_0x0218:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x0400 }
            if (r0 == 0) goto L_0x0239
            java.lang.String r15 = X.C17880vN.A0v(r16)     // Catch:{ all -> 0x0400 }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A11(r15)     // Catch:{ all -> 0x0400 }
            java.lang.String r0 = " "
            r14.append(r0)     // Catch:{ all -> 0x0400 }
            java.lang.String r0 = X.C108945cZ.A1G(r15, r13)     // Catch:{ all -> 0x0400 }
            java.lang.String r14 = X.AnonymousClass000.A0y(r0, r14)     // Catch:{ all -> 0x0400 }
            r0 = r17
            r0.add(r14)     // Catch:{ all -> 0x0400 }
            goto L_0x0218
        L_0x0239:
            java.lang.String r14 = ", "
            r0 = r17
            java.lang.String r18 = android.text.TextUtils.join(r14, r0)     // Catch:{ all -> 0x0400 }
            java.lang.String r17 = ""
            java.lang.String r16 = ")"
            r0 = r25
            boolean r0 = r13.containsKey(r0)     // Catch:{ all -> 0x0400 }
            if (r0 == 0) goto L_0x025e
            java.lang.StringBuilder r15 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0400 }
            java.lang.String r14 = ", PRIMARY KEY("
            r13 = r16
            r0 = r25
            X.C17890vO.A10(r14, r0, r13, r15)     // Catch:{ all -> 0x0400 }
            java.lang.String r17 = r15.toString()     // Catch:{ all -> 0x0400 }
        L_0x025e:
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0400 }
            java.lang.String r15 = "CREATE TEMPORARY TABLE "
            r13 = r20
            r0 = r18
            X.C17900vP.A0c(r15, r1, r13, r0, r14)     // Catch:{ all -> 0x0400 }
            r0 = r16
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r14)     // Catch:{ all -> 0x0400 }
            r11.execSQL(r0)     // Catch:{ all -> 0x0400 }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0400 }
            r15 = r21
            r14 = r22
            r13 = r19
            X.C17900vP.A0c(r15, r1, r14, r13, r0)     // Catch:{ all -> 0x0400 }
            r13 = r23
            java.lang.String r0 = X.AnonymousClass001.A1H(r13, r4, r0)     // Catch:{ all -> 0x0400 }
            r11.execSQL(r0)     // Catch:{ all -> 0x0400 }
            r0 = r24
            java.lang.String r0 = X.C17900vP.A0A(r0, r4)     // Catch:{ all -> 0x0400 }
            r11.execSQL(r0)     // Catch:{ all -> 0x0400 }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0400 }
            java.lang.String r15 = "CREATE TABLE "
            r13 = r20
            r0 = r18
            X.C17900vP.A0c(r15, r4, r13, r0, r14)     // Catch:{ all -> 0x0400 }
            r13 = r17
            r0 = r16
            java.lang.String r0 = X.AnonymousClass001.A1H(r13, r0, r14)     // Catch:{ all -> 0x0400 }
            r11.execSQL(r0)     // Catch:{ all -> 0x0400 }
            java.lang.StringBuilder r14 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0400 }
            r15 = r21
            r13 = r22
            r0 = r19
            X.C17900vP.A0c(r15, r4, r13, r0, r14)     // Catch:{ all -> 0x0400 }
            r0 = r23
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r1, r14)     // Catch:{ all -> 0x0400 }
            r11.execSQL(r0)     // Catch:{ all -> 0x0400 }
            r0 = r24
            java.lang.String r0 = X.C17900vP.A0A(r0, r1)     // Catch:{ all -> 0x0400 }
            r11.execSQL(r0)     // Catch:{ all -> 0x0400 }
        L_0x02ca:
            if (r12 == 0) goto L_0x02cf
        L_0x02cc:
            r12.close()
        L_0x02cf:
            r0 = r27
            X.C63452t6.A02(r11, r5, r0, r2)
            r0 = r28
            X.C63452t6.A02(r11, r5, r0, r2)
            r0 = r26
            X.C63452t6.A02(r11, r5, r0, r2)
            r0 = r29
            X.C63452t6.A02(r11, r5, r0, r2)
            r0 = r30
            X.C63452t6.A02(r11, r5, r0, r2)
            r0 = r31
            X.C63452t6.A02(r11, r5, r0, r3)
            r0 = r32
            X.C63452t6.A02(r11, r5, r0, r3)
            r0 = r33
            X.C63452t6.A02(r11, r5, r0, r3)
        L_0x02f7:
            java.lang.String r1 = "emojis"
            X.C63452t6.A02(r11, r6, r1, r2)
            X.C63452t6.A02(r11, r4, r1, r2)
            java.lang.String r0 = "is_first_party"
            X.C63452t6.A02(r11, r4, r0, r3)
            X.C63452t6.A02(r11, r5, r1, r2)
            X.C63452t6.A02(r11, r5, r0, r3)
            java.lang.String r0 = "third_party_sticker_emoji_mapping"
            X.C28331Zy.A01(r11, r0)
            java.lang.String r0 = "CREATE TABLE third_party_sticker_emoji_mapping (plaintext_hash TEXT  NOT NULL , authority TEXT  NOT NULL , sticker_pack_id TEXT  NOT NULL , emojis TEXT , hash_of_image_part TEXT , PRIMARY KEY(plaintext_hash))"
            r11.execSQL(r0)
        L_0x0314:
            X.C63452t6.A02(r11, r6, r10, r2)
            java.lang.String r0 = "third_party_sticker_emoji_mapping"
            X.C63452t6.A02(r11, r0, r10, r2)
        L_0x031c:
            java.lang.String r0 = "is_avocado"
            X.C63452t6.A02(r11, r4, r0, r8)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS recent_sticker_is_avocado_index ON recent_stickers (is_avocado)"
            r11.execSQL(r0)     // Catch:{ SQLiteException -> 0x0327 }
            goto L_0x032d
        L_0x0327:
            r1 = move-exception
            java.lang.String r0 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C17960vV.A09(r0, r1)
        L_0x032d:
            java.lang.String r0 = "is_avatar"
            X.C63452t6.A02(r11, r5, r0, r8)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS starred_sticker_is_avatar_index ON starred_stickers (is_avatar)"
            r11.execSQL(r0)     // Catch:{ SQLiteException -> 0x0338 }
            goto L_0x033e
        L_0x0338:
            r1 = move-exception
            java.lang.String r0 = "StickersDBHelper/addStarredStickerAvocadoColumnIndex"
            X.C17960vV.A09(r0, r1)
        L_0x033e:
            java.lang.String r0 = "installed_is_avatar_pack"
            X.C63452t6.A02(r11, r7, r0, r8)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS installed_sticker_packs_avatar_pack_index ON installed_sticker_packs (installed_is_avatar_pack)"
            r11.execSQL(r0)     // Catch:{ SQLiteException -> 0x0349 }
            goto L_0x034f
        L_0x0349:
            r1 = move-exception
            java.lang.String r0 = "StickerDBHelper/addInstalledIsAvatarStickerPackColumnIndex"
            X.C17960vV.A09(r0, r1)
        L_0x034f:
            java.lang.String r0 = "is_avatar"
            X.C63452t6.A02(r11, r6, r0, r8)
            A02(r11)
        L_0x0357:
            java.lang.String r0 = "last_sticker_sent_ts"
            X.C63452t6.A02(r11, r4, r0, r8)
        L_0x035c:
            java.lang.String r0 = "sticker_md_upload"
            X.C28331Zy.A01(r11, r0)
        L_0x0361:
            r0 = r34
            X.C63452t6.A02(r11, r6, r0, r2)
        L_0x0366:
            r0 = r34
            X.C63452t6.A02(r11, r4, r0, r2)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS recent_sticker_avatar_template_index ON recent_stickers (avatar_template_id)"
            r11.execSQL(r0)     // Catch:{ SQLiteException -> 0x0371 }
            goto L_0x0377
        L_0x0371:
            r1 = move-exception
            java.lang.String r0 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C17960vV.A09(r0, r1)
        L_0x0377:
            r0 = r34
            X.C63452t6.A02(r11, r5, r0, r2)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS starred_sticker_avatar_template_id_index ON starred_stickers (avatar_template_id)"
            r11.execSQL(r0)     // Catch:{ SQLiteException -> 0x0382 }
            goto L_0x0388
        L_0x0382:
            r1 = move-exception
            java.lang.String r0 = "StickersDBHelper/addRecentStickerAvocadoColumnIndex"
            X.C17960vV.A09(r0, r1)
        L_0x0388:
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS sticker_avatar_template_id_index ON stickers (avatar_template_id)"
            r11.execSQL(r0)     // Catch:{ SQLiteException -> 0x038e }
            goto L_0x0394
        L_0x038e:
            r1 = move-exception
            java.lang.String r0 = "StickerDBHelper/addStickerIsAvatarColumnIndex"
            X.C17960vV.A09(r0, r1)
        L_0x0394:
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS sticker_pack_id_index ON stickers (sticker_pack_id)"
            r11.execSQL(r0)     // Catch:{ SQLiteException -> 0x039a }
            goto L_0x03a0
        L_0x039a:
            r1 = move-exception
            java.lang.String r0 = "StickerDBHelper/addStickerPackIdIndex"
            X.C17960vV.A09(r0, r1)
        L_0x03a0:
            java.lang.String r0 = "installed_empty_recents_avatar_template_id"
            X.C63452t6.A02(r11, r7, r0, r2)
            java.lang.String r0 = "installed_empty_favorites_avatar_template_id"
            X.C63452t6.A02(r11, r7, r0, r2)
        L_0x03aa:
            A02(r11)
        L_0x03ad:
            java.lang.String r0 = "avatar_sticker_search_dictionary"
            X.C28331Zy.A01(r11, r0)
            java.lang.String r0 = "CREATE TABLE avatar_sticker_search_dictionary (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, sticker_id TEXT NOT NULL, tag TEXT NOT NULL, weight INTEGER NOT NULL DEFAULT 0)"
            r11.execSQL(r0)
            java.lang.String r0 = "CREATE UNIQUE INDEX IF NOT EXISTS avatar_sticker_search_index ON avatar_sticker_search_dictionary (tag, sticker_id)"
            r11.execSQL(r0)     // Catch:{ SQLiteException -> 0x03bd }
            goto L_0x03c3
        L_0x03bd:
            r1 = move-exception
            java.lang.String r0 = "StickerDBHelper/addAvatarStickerSearchIndex"
            X.C17960vV.A09(r0, r1)
        L_0x03c3:
            java.lang.String r1 = "avatar_sticker_search_dictionary"
            java.lang.String r0 = "weight"
            X.C63452t6.A02(r11, r1, r0, r8)
        L_0x03ca:
            java.lang.String r0 = "is_fun_sticker"
            X.C63452t6.A02(r11, r6, r0, r3)
            X.C63452t6.A02(r11, r5, r0, r3)
            X.C63452t6.A02(r11, r4, r0, r3)
        L_0x03d5:
            java.lang.String r0 = "is_lottie"
            X.C63452t6.A02(r11, r6, r0, r3)
            X.C63452t6.A02(r11, r5, r0, r3)
            X.C63452t6.A02(r11, r4, r0, r3)
        L_0x03e0:
            java.lang.String r0 = "lottie_pack"
            X.C63452t6.A02(r11, r9, r0, r3)
            java.lang.String r0 = "installed_lottie_pack"
            X.C63452t6.A02(r11, r7, r0, r3)
        L_0x03ea:
            java.lang.String r0 = "accessibility_text"
            X.C63452t6.A02(r11, r6, r0, r2)
            X.C63452t6.A02(r11, r5, r0, r2)
            X.C63452t6.A02(r11, r4, r0, r2)
        L_0x03f5:
            java.lang.String r0 = "installed_pack_type"
            X.C63452t6.A02(r11, r7, r0, r2)
            java.lang.String r0 = "is_created_by_me"
            X.C63452t6.A02(r11, r7, r0, r3)
            return
        L_0x0400:
            r1 = move-exception
            if (r12 == 0) goto L_0x040b
            r12.close()     // Catch:{ all -> 0x0407 }
            throw r1
        L_0x0407:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
        L_0x040b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C116815yf.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }
}
