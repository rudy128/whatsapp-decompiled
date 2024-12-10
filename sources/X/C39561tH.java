package X;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.1tH  reason: invalid class name and case insensitive filesystem */
public class C39561tH extends C24801Ls {
    public final AnonymousClass118 A00;
    public final AnonymousClass10W A01 = new AnonymousClass10W(C18150vq.A00());
    public final String A02;
    public final AnonymousClass1CP A03;
    public final AnonymousClass1CO A04;

    public synchronized C23141Ev A09() {
        C23141Ev r0;
        try {
            String databaseName = getDatabaseName();
            r0 = AnonymousClass1Eu.A03(A04(), this.A03, this.A04, databaseName);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w("chat-settings-store/corrupt/removing", e);
            A08();
            String databaseName2 = getDatabaseName();
            r0 = AnonymousClass1Eu.A03(super.A04(), this.A03, this.A04, databaseName2);
        } catch (SQLiteException e2) {
            e = e2;
            if (e.toString().contains("file is encrypted")) {
                Log.w("chat-settings-store/encrypted/removing", e);
                A08();
                String databaseName3 = getDatabaseName();
                r0 = AnonymousClass1Eu.A03(super.A04(), this.A03, this.A04, databaseName3);
            }
            throw e;
        } catch (StackOverflowError e3) {
            e = e3;
            Log.w("chat-settings-store/stackoverflowerror", e);
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            int i = 0;
            while (i < length) {
                if (stackTrace[i].getMethodName().equals("onCorruption")) {
                    Log.w("chat-settings-store/stackoverflowerror/corrupt/removing");
                    A08();
                    String databaseName4 = getDatabaseName();
                    r0 = AnonymousClass1Eu.A03(super.A04(), this.A03, this.A04, databaseName4);
                } else {
                    i++;
                }
            }
            throw e;
        }
        return r0;
    }

    public C39561tH(AnonymousClass190 r9, AnonymousClass118 r10, AnonymousClass1Cb r11, AnonymousClass1CP r12, AnonymousClass1CO r13, String str) {
        super(r10.A00, r9, r11, str, 1);
        this.A02 = str;
        this.A00 = r10;
        this.A04 = r13;
        this.A03 = r12;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.i("chat-settings-store/create");
        C28331Zy.A01(sQLiteDatabase, "settings");
        sQLiteDatabase.execSQL("CREATE TABLE settings (_id INTEGER PRIMARY KEY AUTOINCREMENT,jid TEXT,deleted INTEGER,mute_end INTEGER,muted_notifications BOOLEAN,use_custom_notifications BOOLEAN,message_tone TEXT,message_vibrate INTEGER,message_popup INTEGER,message_light INTEGER,call_tone TEXT,call_vibrate INTEGER,status_muted INTEGER,pinned BOOLEAN,pinned_time INTEGER,low_pri_notifications BOOLEAN,media_visibility INTEGER,mute_reactions INTEGER,wallpaper_light_type TEXT,wallpaper_light_value TEXT,wallpaper_dark_type TEXT,wallpaper_dark_value TEXT,wallpaper_dark_opacity INTEGER,notifications_auto_muted INTEGER NOT NULL DEFAULT 0,push_recording_button_mode INTEGER,call_mute_end_time INTEGER,auto_delete_media INTEGER, transcription_locale INTEGER,enable_auto_message_translations INTEGER NOT NULL DEFAULT 0,source_lang TEXT,target_lang TEXT,snooze_end_time INTEGER,theme_id TEXT,notification_activity_level INTEGER,notification_activity_banner_state INTEGER,last_chat_entry_timestamp_millis INTEGER,theme_bundle_id TEXT);");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS jid_index ON settings(jid);");
        sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS settings_snooze_index ON settings(snooze_end_time);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("chat-settings-store/downgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        super.onOpen(sQLiteDatabase2);
        String databaseName = getDatabaseName();
        C23141Ev A032 = AnonymousClass1Eu.A03(sQLiteDatabase2, this.A03, this.A04, databaseName);
        String A002 = C28331Zy.A00(A032, "table", "settings");
        if (!TextUtils.isEmpty(A002)) {
            C28331Zy.A04(A032, A002, "settings", "status_muted", "INTEGER", "ChatSettingsDatabaseHelper");
            C23141Ev r10 = A032;
            String str = A002;
            String str2 = "settings";
            String str3 = "ChatSettingsDatabaseHelper";
            C28331Zy.A04(r10, str, str2, "pinned", "BOOLEAN", str3);
            C28331Zy.A04(A032, A002, "settings", "pinned_time", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(r10, str, str2, "low_pri_notifications", "BOOLEAN", str3);
            C28331Zy.A04(A032, A002, "settings", "media_visibility", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(A032, A002, "settings", "mute_reactions", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(r10, str, str2, "notifications_auto_muted", "INTEGER NOT NULL DEFAULT 0", str3);
            C28331Zy.A04(A032, A002, "settings", "push_recording_button_mode", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(A032, A002, "settings", "call_mute_end_time", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(A032, A002, "settings", "auto_delete_media", "INTEGER", "ChatSettingsDatabaseHelper");
            C23141Ev r15 = A032;
            String str4 = A002;
            String str5 = "settings";
            String str6 = "ChatSettingsDatabaseHelper";
            C28331Zy.A04(r15, str4, str5, "wallpaper_light_type", "TEXT", str6);
            C28331Zy.A04(r15, str4, str5, "wallpaper_light_value", "TEXT", str6);
            C28331Zy.A04(r15, str4, str5, "wallpaper_dark_type", "TEXT", str6);
            C28331Zy.A04(r15, str4, str5, "wallpaper_dark_value", "TEXT", str6);
            C28331Zy.A04(A032, A002, "settings", "wallpaper_dark_opacity", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(A032, A002, "settings", "transcription_locale", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(r10, str, str2, "enable_auto_message_translations", "INTEGER NOT NULL DEFAULT 0", "ChatSettingsDatabaseHelper");
            C23141Ev r152 = A032;
            C28331Zy.A04(r152, str4, str5, "source_lang", "TEXT", str6);
            C28331Zy.A04(r152, str4, str5, "target_lang", "TEXT", str6);
            C28331Zy.A04(r152, str4, str5, "theme_id", "TEXT", str6);
            C28331Zy.A04(A032, A002, "settings", "notification_activity_level", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(A032, A002, "settings", "notification_activity_banner_state", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(A032, A002, "settings", "last_chat_entry_timestamp_millis", "INTEGER", "ChatSettingsDatabaseHelper");
            C28331Zy.A04(r152, str4, str5, "theme_bundle_id", "TEXT", str6);
            if (!C28331Zy.A05(A002, "snooze_end_time", "INTEGER")) {
                try {
                    SQLiteDatabase sQLiteDatabase3 = A032.A00;
                    sQLiteDatabase3.beginTransaction();
                    C28331Zy.A04(A032, A002, "settings", "snooze_end_time", "INTEGER", "ChatSettingsDatabaseHelper");
                    A032.A0E("CREATE INDEX IF NOT EXISTS settings_snooze_index ON settings(snooze_end_time);", "ChatSettingsDBHelper/createSnoozeIndex");
                    sQLiteDatabase3.setTransactionSuccessful();
                } catch (Exception e) {
                    Log.e("chat-settings-store/addSnoozeEndTimeColumn failed", e);
                } catch (Throwable th) {
                    A032.A00.endTransaction();
                    throw th;
                }
                A032.A00.endTransaction();
            }
        }
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1Ce) it.next()).Bqw(A032);
        }
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("chat-settings-store/upgrade from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public void A08() {
        super.A08();
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1Ce) it.next()).Bqv(new SQLiteDatabaseCorruptException("ChatSettingsDatabaseHelper/database is corrupted."));
        }
    }
}
