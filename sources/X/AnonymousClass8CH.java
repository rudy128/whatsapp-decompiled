package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.locks.Lock;

/* renamed from: X.8CH  reason: invalid class name */
public final class AnonymousClass8CH extends SQLiteOpenHelper {
    public boolean A00;
    public boolean A01;
    public final Context A02;
    public final C180549Mz A03;
    public final boolean A04;
    public final C188939iF A05;
    public final C198199xx A06;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass8CH(android.content.Context r9, X.C188939iF r10, X.C180549Mz r11, java.lang.String r12, boolean r13) {
        /*
            r8 = this;
            r4 = r12
            r6 = 20
            X.AA4 r7 = new X.AA4
            r7.<init>(r10, r11)
            r5 = 0
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            r8.A02 = r9
            r8.A03 = r11
            r8.A05 = r10
            r8.A04 = r13
            if (r12 != 0) goto L_0x001c
            java.lang.String r4 = X.C108985cd.A0f()
        L_0x001c:
            java.io.File r1 = r9.getCacheDir()
            X.C18070vi.A0X(r1)
            X.9xx r0 = new X.9xx
            r0.<init>(r1, r4)
            r8.A06 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CH.<init>(android.content.Context, X.9iF, X.9Mz, java.lang.String, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|(1:4)|6|7|(4:9|10|(1:12)|13)|18|(2:22|(1:24))|25|26|27|28|29|30|31|32|56|57|(1:59)(1:60)|(3:61|62|(1:64))|65|67) */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (getDatabaseName() == null) goto L_0x000f;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.BE3 A00() {
        /*
            r8 = this;
            r7 = 1
            X.9xx r4 = r8.A06     // Catch:{ all -> 0x00da }
            boolean r0 = r8.A01     // Catch:{ all -> 0x00da }
            r6 = 0
            if (r0 != 0) goto L_0x000f
            java.lang.String r1 = r8.getDatabaseName()     // Catch:{ all -> 0x00da }
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.util.concurrent.locks.Lock r3 = r4.A02     // Catch:{ all -> 0x00da }
            r3.lock()     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x003b
            java.io.File r1 = r4.A01     // Catch:{ IOException -> 0x0030 }
            java.io.File r0 = r1.getParentFile()     // Catch:{ IOException -> 0x0030 }
            if (r0 == 0) goto L_0x0022
            r0.mkdirs()     // Catch:{ IOException -> 0x0030 }
        L_0x0022:
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r1)     // Catch:{ IOException -> 0x0030 }
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x0030 }
            r0.lock()     // Catch:{ IOException -> 0x0030 }
            r4.A00 = r0     // Catch:{ IOException -> 0x0030 }
            goto L_0x003b
        L_0x0030:
            r2 = move-exception
            r0 = 0
            r4.A00 = r0     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "Unable to grab file lock."
            java.lang.String r0 = "SupportSQLiteLock"
            android.util.Log.w(r0, r1, r2)     // Catch:{ all -> 0x00da }
        L_0x003b:
            r8.A00 = r6     // Catch:{ all -> 0x00da }
            java.lang.String r5 = r8.getDatabaseName()     // Catch:{ all -> 0x00da }
            if (r5 == 0) goto L_0x0067
            android.content.Context r0 = r8.A02     // Catch:{ all -> 0x00da }
            java.io.File r0 = r0.getDatabasePath(r5)     // Catch:{ all -> 0x00da }
            java.io.File r2 = r0.getParentFile()     // Catch:{ all -> 0x00da }
            if (r2 == 0) goto L_0x0067
            r2.mkdirs()     // Catch:{ all -> 0x00da }
            boolean r0 = r2.isDirectory()     // Catch:{ all -> 0x00da }
            if (r0 != 0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "Invalid database parent file, not a directory: "
            java.lang.String r1 = X.AnonymousClass001.A1E(r2, r0, r1)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x00da }
        L_0x0067:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ all -> 0x006f }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x006f }
            goto L_0x00b7
        L_0x006f:
            super.close()     // Catch:{ all -> 0x00da }
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0077 }
        L_0x0077:
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ all -> 0x007f }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x007f }
            goto L_0x00b7
        L_0x007f:
            r1 = move-exception
            super.close()     // Catch:{ all -> 0x00da }
            boolean r0 = r1 instanceof X.C21578AmS     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x009c
            X.AmS r1 = (X.C21578AmS) r1     // Catch:{ all -> 0x00da }
            java.lang.Throwable r2 = r1.cause     // Catch:{ all -> 0x00da }
            X.9I6 r0 = r1.callbackName     // Catch:{ all -> 0x00da }
            int r1 = r0.ordinal()     // Catch:{ all -> 0x00da }
            if (r1 == r6) goto L_0x00d8
            if (r1 == r7) goto L_0x00d8
            r0 = 2
            if (r1 == r0) goto L_0x00d8
            r0 = 3
            if (r1 == r0) goto L_0x00d8
            goto L_0x00a7
        L_0x009c:
            boolean r0 = r1 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d9
            if (r5 == 0) goto L_0x00d9
            boolean r0 = r8.A04     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d9
            goto L_0x00ab
        L_0x00a7:
            boolean r0 = r2 instanceof android.database.sqlite.SQLiteException     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d8
        L_0x00ab:
            android.content.Context r0 = r8.A02     // Catch:{ all -> 0x00da }
            r0.deleteDatabase(r5)     // Catch:{ all -> 0x00da }
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch:{ AmS -> 0x00d4 }
            X.C18070vi.A0X(r1)     // Catch:{ AmS -> 0x00d4 }
        L_0x00b7:
            boolean r0 = r8.A00     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00c3
            r8.close()     // Catch:{ all -> 0x00da }
            X.BE3 r1 = r8.A00()     // Catch:{ all -> 0x00da }
            goto L_0x00c9
        L_0x00c3:
            X.9Mz r0 = r8.A03     // Catch:{ all -> 0x00da }
            X.AHQ r1 = X.AnonymousClass9OC.A00(r1, r0)     // Catch:{ all -> 0x00da }
        L_0x00c9:
            java.nio.channels.FileChannel r0 = r4.A00     // Catch:{ IOException -> 0x00d0 }
            if (r0 == 0) goto L_0x00d0
            r0.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            r3.unlock()
            return r1
        L_0x00d4:
            r0 = move-exception
            java.lang.Throwable r0 = r0.cause     // Catch:{ all -> 0x00da }
            throw r0     // Catch:{ all -> 0x00da }
        L_0x00d8:
            throw r2     // Catch:{ all -> 0x00da }
        L_0x00d9:
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r2 = move-exception
            X.9xx r1 = r8.A06
            java.nio.channels.FileChannel r0 = r1.A00     // Catch:{ IOException -> 0x00e4 }
            if (r0 == 0) goto L_0x00e4
            r0.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x00e4:
            java.util.concurrent.locks.Lock r0 = r1.A02
            r0.unlock()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CH.A00():X.BE3");
    }

    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        C18070vi.A0d(sQLiteDatabase, 0);
        try {
            AnonymousClass9OC.A00(sQLiteDatabase, this.A03);
        } catch (Throwable th) {
            throw new C21578AmS(AnonymousClass9I6.ON_CONFIGURE, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.CDX.A00(r3, r0);
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.database.sqlite.SQLiteDatabase r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.9iF r5 = r6.A05     // Catch:{ all -> 0x0067 }
            X.9Mz r0 = r6.A03     // Catch:{ all -> 0x0067 }
            X.AHQ r4 = X.AnonymousClass9OC.A00(r7, r0)     // Catch:{ all -> 0x0067 }
            X.8Ja r5 = (X.C162118Ja) r5     // Catch:{ all -> 0x0067 }
            r1 = 0
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r3 = X.AHY.A00(r4, r0)     // Catch:{ all -> 0x0067 }
            r2 = 1
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = 0
        L_0x0024:
            r3.close()     // Catch:{ all -> 0x0067 }
            X.A6D r1 = r5.A01     // Catch:{ all -> 0x0067 }
            r1.A04(r4)     // Catch:{ all -> 0x0067 }
            if (r2 != 0) goto L_0x004e
            goto L_0x0036
        L_0x002f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            X.CDX.A00(r3, r0)     // Catch:{ all -> 0x0067 }
            goto L_0x004d
        L_0x0036:
            X.9ZT r2 = r1.A03(r4)     // Catch:{ all -> 0x0067 }
            boolean r0 = r2.A01     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x004e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r1.append(r0)     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0067 }
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ all -> 0x0067 }
        L_0x004d:
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x004e:
            X.C162118Ja.A00(r4)     // Catch:{ all -> 0x0067 }
            androidx.work.impl.WorkDatabase_Impl r3 = r1.A00     // Catch:{ all -> 0x0067 }
            java.util.List r0 = r3.A01     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0066
            int r2 = r0.size()     // Catch:{ all -> 0x0067 }
            r1 = 0
        L_0x005c:
            if (r1 >= r2) goto L_0x0066
            java.util.List r0 = r3.A01     // Catch:{ all -> 0x0067 }
            r0.get(r1)     // Catch:{ all -> 0x0067 }
            int r1 = r1 + 1
            goto L_0x005c
        L_0x0066:
            return
        L_0x0067:
            r2 = move-exception
            X.9I6 r1 = X.AnonymousClass9I6.ON_CREATE
            X.AmS r0 = new X.AmS
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CH.onCreate(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C18070vi.A0d(sQLiteDatabase, 0);
        this.A00 = true;
        try {
            ((C162118Ja) this.A05).A02(AnonymousClass9OC.A00(sQLiteDatabase, this.A03), i, i2);
        } catch (Throwable th) {
            throw new C21578AmS(AnonymousClass9I6.ON_DOWNGRADE, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.CDX.A00(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onOpen(android.database.sqlite.SQLiteDatabase r12) {
        /*
            r11 = this;
            r0 = 0
            X.C18070vi.A0d(r12, r0)
            boolean r0 = r11.A00
            if (r0 != 0) goto L_0x0127
            X.9iF r8 = r11.A05     // Catch:{ all -> 0x011e }
            X.9Mz r0 = r11.A03     // Catch:{ all -> 0x011e }
            X.AHQ r10 = X.AnonymousClass9OC.A00(r12, r0)     // Catch:{ all -> 0x011e }
            X.8Ja r8 = (X.C162118Ja) r8     // Catch:{ all -> 0x011e }
            r4 = 0
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r2 = X.AHY.A00(r10, r0)     // Catch:{ all -> 0x011e }
            r1 = 1
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0027
            int r0 = r2.getInt(r4)     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0027
            goto L_0x0028
        L_0x0027:
            r1 = 0
        L_0x0028:
            r2.close()     // Catch:{ all -> 0x011e }
            if (r1 == 0) goto L_0x0074
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            X.AHY r0 = new X.AHY     // Catch:{ all -> 0x011e }
            r0.<init>(r1)     // Catch:{ all -> 0x011e }
            android.database.Cursor r2 = r10.CD7(r0)     // Catch:{ all -> 0x011e }
            r3 = 0
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x004b
            java.lang.String r3 = r2.getString(r4)     // Catch:{ all -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r1 = move-exception
            X.CDX.A00(r2, r0)     // Catch:{ all -> 0x011e }
            goto L_0x0073
        L_0x004b:
            r2.close()     // Catch:{ all -> 0x011e }
            java.lang.String r2 = "7d73d21f1bd82c9e5268b6dcf9fde2cb"
            boolean r0 = r2.equals(r3)     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x0081
            java.lang.String r0 = "3071c8717539de5d5353f4c8cd59a032"
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x011e }
            if (r0 != 0) goto L_0x0081
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r0)     // Catch:{ all -> 0x011e }
            r1.append(r2)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = ", found: "
            r1.append(r0)     // Catch:{ all -> 0x011e }
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0o(r3, r1)     // Catch:{ all -> 0x011e }
        L_0x0073:
            throw r1     // Catch:{ all -> 0x011e }
        L_0x0074:
            X.A6D r0 = r8.A01     // Catch:{ all -> 0x011e }
            X.9ZT r2 = r0.A03(r10)     // Catch:{ all -> 0x011e }
            boolean r0 = r2.A01     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x0109
            X.C162118Ja.A00(r10)     // Catch:{ all -> 0x011e }
        L_0x0081:
            X.A6D r0 = r8.A01     // Catch:{ all -> 0x011e }
            androidx.work.impl.WorkDatabase_Impl r9 = r0.A00     // Catch:{ all -> 0x011e }
            r9.A0B = r10     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "PRAGMA foreign_keys = ON"
            r10.BKj(r0)     // Catch:{ all -> 0x011e }
            X.A2Q r3 = r9.A06     // Catch:{ all -> 0x011e }
            java.lang.Object r2 = r3.A03     // Catch:{ all -> 0x011e }
            monitor-enter(r2)     // Catch:{ all -> 0x011e }
            boolean r0 = r3.A0D     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x009d
            java.lang.String r1 = "ROOM"
            java.lang.String r0 = "Invalidation tracker is initialized twice :/."
            android.util.Log.e(r1, r0)     // Catch:{ all -> 0x0105 }
            goto L_0x00c4
        L_0x009d:
            java.lang.String r0 = "PRAGMA temp_store = MEMORY;"
            r10.BKj(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "PRAGMA recursive_triggers='ON';"
            r10.BKj(r0)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = "CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)"
            r10.BKj(r0)     // Catch:{ all -> 0x0105 }
            r3.A02(r10)     // Catch:{ all -> 0x0105 }
            java.lang.String r1 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            android.database.sqlite.SQLiteDatabase r0 = r10.A00     // Catch:{ all -> 0x0105 }
            android.database.sqlite.SQLiteStatement r1 = r0.compileStatement(r1)     // Catch:{ all -> 0x0105 }
            X.C18070vi.A0X(r1)     // Catch:{ all -> 0x0105 }
            X.8Jb r0 = new X.8Jb     // Catch:{ all -> 0x0105 }
            r0.<init>(r1)     // Catch:{ all -> 0x0105 }
            r3.A0C = r0     // Catch:{ all -> 0x0105 }
            r0 = 1
            r3.A0D = r0     // Catch:{ all -> 0x0105 }
        L_0x00c4:
            monitor-exit(r2)     // Catch:{ all -> 0x011e }
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x011e }
            if (r0 == 0) goto L_0x011a
            int r7 = r0.size()     // Catch:{ all -> 0x011e }
            r6 = 0
        L_0x00ce:
            if (r6 >= r7) goto L_0x011a
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x011e }
            r0.get(r6)     // Catch:{ all -> 0x011e }
            android.database.sqlite.SQLiteDatabase r5 = r10.A00     // Catch:{ all -> 0x011e }
            r5.beginTransaction()     // Catch:{ all -> 0x011e }
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < "
            r4.append(r0)     // Catch:{ all -> 0x00ff }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ff }
            long r0 = X.C181999Sr.A00     // Catch:{ all -> 0x00ff }
            long r2 = r2 - r0
            r4.append(r2)     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r4)     // Catch:{ all -> 0x00ff }
            r10.BKj(r0)     // Catch:{ all -> 0x00ff }
            r5.setTransactionSuccessful()     // Catch:{ all -> 0x00ff }
            r5.endTransaction()     // Catch:{ all -> 0x011e }
            int r6 = r6 + 1
            goto L_0x00ce
        L_0x00ff:
            r1 = move-exception
            r5.endTransaction()     // Catch:{ all -> 0x011e }
            goto L_0x0073
        L_0x0105:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x011e }
            goto L_0x0073
        L_0x0109:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x011e }
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r1.append(r0)     // Catch:{ all -> 0x011e }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x011e }
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ all -> 0x011e }
            goto L_0x0073
        L_0x011a:
            r0 = 0
            r8.A00 = r0     // Catch:{ all -> 0x011e }
            goto L_0x0127
        L_0x011e:
            r2 = move-exception
            X.9I6 r1 = X.AnonymousClass9I6.ON_OPEN
            X.AmS r0 = new X.AmS
            r0.<init>(r1, r2)
            throw r0
        L_0x0127:
            r0 = 1
            r11.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8CH.onOpen(android.database.sqlite.SQLiteDatabase):void");
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        C18070vi.A0d(sQLiteDatabase, 0);
        this.A00 = true;
        try {
            this.A05.A02(AnonymousClass9OC.A00(sQLiteDatabase, this.A03), i, i2);
        } catch (Throwable th) {
            throw new C21578AmS(AnonymousClass9I6.ON_UPGRADE, th);
        }
    }

    /* JADX INFO: finally extract failed */
    public void close() {
        try {
            C198199xx r4 = this.A06;
            Lock lock = r4.A02;
            lock.lock();
            super.close();
            this.A03.A00 = null;
            this.A01 = false;
            try {
                FileChannel fileChannel = r4.A00;
                if (fileChannel != null) {
                    fileChannel.close();
                }
            } catch (IOException unused) {
            }
            lock.unlock();
        } catch (Throwable th) {
            C198199xx r1 = this.A06;
            try {
                FileChannel fileChannel2 = r1.A00;
                if (fileChannel2 != null) {
                    fileChannel2.close();
                }
            } catch (IOException unused2) {
            }
            r1.A02.unlock();
            throw th;
        }
    }
}
