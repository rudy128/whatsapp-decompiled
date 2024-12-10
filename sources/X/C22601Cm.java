package X;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Cm  reason: invalid class name and case insensitive filesystem */
public class C22601Cm extends SQLiteOpenHelper implements C22591Cl {
    public static final String[] A0E = {"messages", "messages_fts", "messages_links", "quoted_message_order", "quoted_message_product", "messages_quotes", "messages_vcards", "messages_vcards_jids", "pay_transactions", "messages_quotes_payment_invite_legacy", "message_quoted_ui_elements_reply_legacy", "message_quoted_group_invite_legacy", "receipts", "group_participants", "chat_list", "conversion_tuples", "status_list", "group_participants_history", "message_add_on_orphan", "username_index", "upper_username_index", "message_system_broadcast_list_entry_point"};
    public C23141Ev A00;
    public Boolean A01;
    public Integer A02;
    public boolean A03;
    public final AnonymousClass190 A04;
    public final C22561Ci A05;
    public final C22551Ch A06;
    public final AnonymousClass1CP A07;
    public final AnonymousClass1CO A08;
    public final AnonymousClass10W A09;
    public final AnonymousClass00H A0A = new C18150vq((Object) null, new C70943Dc(this, 6));
    public final File A0B;
    public final Object A0C = new Object();
    public final AnonymousClass00H A0D;

    public C22601Cm(Context context, AnonymousClass190 r5, C22561Ci r6, C22551Ch r7, AnonymousClass1CP r8, AnonymousClass1CO r9, AnonymousClass1CT r10, File file, Set set) {
        super(context, "msgstore.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.A04 = r5;
        this.A08 = r9;
        this.A07 = r8;
        this.A05 = r6;
        this.A0B = file;
        this.A06 = r7;
        this.A0D = r10.A00;
        this.A09 = new AnonymousClass10W(new C18150vq(set, (C18140vp) null));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.2dt, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.whatsapp.util.Log.e("DatabaseHelper/verifyBackup/restoreIndexes - database error.", r9);
        r8.A01 = false;
        r8.A02 = false;
        r4 = r11.A04;
        r1 = new java.lang.StringBuilder();
        r1.append("DatabaseHelper/verifyBackup/restoreIndexes: ");
        r1.append(r9.getMessage());
        r4.A0G("MessagesDBHelper/backupRestoreFailed", r1.toString(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        com.whatsapp.util.Log.e("DatabaseHelper/verifyBackup - unknown error.", r4);
        r8.A02 = false;
        r3 = r11.A04;
        r1 = new java.lang.StringBuilder();
        r1.append("DatabaseHelper/verifyBackup/genericException: ");
        r1.append(r4.getMessage());
        r3.A0G("MessagesDBHelper/backupRestoreFailed", r1.toString(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7.A00(r6);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d A[ExcHandler: Exception (r4v1 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:9:0x0013] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized X.C54282dt A00(X.C22601Cm r11) {
        /*
            monitor-enter(r11)
            X.2dt r8 = new X.2dt     // Catch:{ all -> 0x00d9 }
            r8.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r0 = "DatabaseHelper/verifyBackup - initialize backup verification."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00d9 }
            X.1Ch r7 = r11.A06     // Catch:{ all -> 0x00d9 }
            monitor-enter(r7)     // Catch:{ all -> 0x00d9 }
            boolean r6 = r7.A00     // Catch:{ all -> 0x00d6 }
            monitor-exit(r7)     // Catch:{ all -> 0x00d9 }
            r2 = 0
            r5 = 1
            X.1Ev r10 = r11.Bbw()     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            java.lang.String r0 = "DatabaseHelper/verifyBackup - force re-create missing indexes."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            java.lang.String r0 = "DatabaseHelper/verifyBackup/restoreIndexes"
            X.1Ez r9 = new X.1Ez     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            r9.<init>((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            r7.A00(r5)     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            X.00H r0 = r11.A0A     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            java.lang.Object r0 = r0.get()     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            X.1F2 r0 = (X.AnonymousClass1F2) r0     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            X.1F6 r0 = A01(r11, r0)     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            java.lang.String r4 = "DatabaseHelper"
            r0.A03(r10, r4)     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            java.lang.String r3 = "MessagesDBHelper_CreateAsyncIndexes"
            r0 = 1
            X.C28341Zz.A02(r10, r3, r4, r0)     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            java.lang.String r0 = "MessagesDBHelper_CreateAsyncIndexesFailedAttempts"
            X.C28341Zz.A01(r10, r0)     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            long r0 = r9.A02()     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r3
            r8.A00 = r0     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            r8.A01 = r5     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            r8.A02 = r5     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            java.lang.String r0 = "DatabaseHelper/verifyBackup - database is valid and ready to be used."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x0056, Exception -> 0x007d }
            goto L_0x00cc
        L_0x0056:
            r9 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup/restoreIndexes - database error."
            com.whatsapp.util.Log.e(r0, r9)     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            r8.A01 = r2     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            r8.A02 = r2     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            X.190 r4 = r11.A04     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            java.lang.String r3 = "MessagesDBHelper/backupRestoreFailed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            java.lang.String r0 = "DatabaseHelper/verifyBackup/restoreIndexes: "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            java.lang.String r0 = r9.getMessage()     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            r1.append(r0)     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            r4.A0G(r3, r0, r5)     // Catch:{ SQLiteException -> 0x00a2, Exception -> 0x007d }
            goto L_0x00cc
        L_0x007d:
            r4 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup - unknown error."
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x00d1 }
            r8.A02 = r2     // Catch:{ all -> 0x00d1 }
            X.190 r3 = r11.A04     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "MessagesDBHelper/backupRestoreFailed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d1 }
            r1.<init>()     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "DatabaseHelper/verifyBackup/genericException: "
            r1.append(r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x00d1 }
            r1.append(r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d1 }
            r3.A0G(r2, r0, r5)     // Catch:{ all -> 0x00d1 }
            goto L_0x00cc
        L_0x00a2:
            r4 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup - database error."
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x00d1 }
            boolean r0 = r4 instanceof android.database.sqlite.SQLiteConstraintException     // Catch:{ all -> 0x00d1 }
            if (r0 == 0) goto L_0x00ae
            r8.A01 = r2     // Catch:{ all -> 0x00d1 }
        L_0x00ae:
            r8.A02 = r2     // Catch:{ all -> 0x00d1 }
            X.190 r3 = r11.A04     // Catch:{ all -> 0x00d1 }
            java.lang.String r2 = "MessagesDBHelper/backupRestoreFailed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d1 }
            r1.<init>()     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "DatabaseHelper/verifyBackup/writableLoggableDatabase: "
            r1.append(r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x00d1 }
            r1.append(r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d1 }
            r3.A0G(r2, r0, r5)     // Catch:{ all -> 0x00d1 }
        L_0x00cc:
            r7.A00(r6)     // Catch:{ all -> 0x00d9 }
            monitor-exit(r11)
            return r8
        L_0x00d1:
            r0 = move-exception
            r7.A00(r6)     // Catch:{ all -> 0x00d9 }
            goto L_0x00d8
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r0     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22601Cm.A00(X.1Cm):X.2dt");
    }

    public static String A02(AnonymousClass1F2 r3) {
        return String.valueOf(Arrays.hashCode(new Object[]{"Consumer-ef7c58ceb40f006462adce3bdcda5eda", Integer.valueOf(r3.hashCode())}));
    }

    public synchronized C23141Ev BXw() {
        return Bbw();
    }

    /* JADX WARNING: type inference failed for: r1v90, types: [android.database.sqlite.SQLiteFullException, android.database.sqlite.SQLiteException] */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0122, code lost:
        if (r10 != false) goto L_0x0124;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C23141Ev Bbw() {
        /*
            r11 = this;
            r7 = r11
            monitor-enter(r7)     // Catch:{ all -> 0x0513 }
            boolean r0 = r11.A03     // Catch:{ all -> 0x0510 }
            if (r0 != 0) goto L_0x050a
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0016
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0016
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            goto L_0x048f
        L_0x0016:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0510 }
            r1.<init>()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "databasehelper/open-existing-db"
            r1.append(r0)     // Catch:{ all -> 0x0510 }
            java.io.File r4 = r11.A0B     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r4.getAbsolutePath()     // Catch:{ all -> 0x0510 }
            r1.append(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0510 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            boolean r0 = r4.exists()     // Catch:{ all -> 0x0510 }
            r10 = 0
            if (r0 != 0) goto L_0x0065
            java.lang.String r0 = "databasehelper/open-existing-db/no-file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0510 }
            r1.<init>()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "Message store missing, no message store file"
            r1.append(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0510 }
            r1.append(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteCantOpenDatabaseException r0 = new android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x0510 }
            r0.<init>(r1)     // Catch:{ all -> 0x0510 }
            A03(r0, r11)     // Catch:{ all -> 0x0510 }
        L_0x0059:
            r11.close()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "Unable to open writable db: failed to open db"
            android.database.sqlite.SQLiteException r4 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0510 }
            r4.<init>(r0)     // Catch:{ all -> 0x0510 }
            goto L_0x050f
        L_0x0065:
            r9 = 0
            r5 = -1
            r8 = 0
        L_0x0068:
            r2 = 0
            java.lang.String r1 = r4.getAbsolutePath()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r6 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r2, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            X.C17960vV.A07(r6)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            java.lang.String r3 = r11.getDatabaseName()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            X.1CO r1 = r11.A08     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            X.1CP r0 = r11.A07     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            X.1Ev r0 = X.AnonymousClass1Eu.A03(r6, r0, r1, r3)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            r11.A00 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            X.C17960vV.A07(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            X.C23141Ev.A01(r2)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            int r5 = r0.getVersion()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            r1.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            java.lang.String r0 = "databasehelper/open-existing-db/version "
            r1.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            r1.append(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c8, SQLiteException -> 0x00a6 }
            goto L_0x00cf
        L_0x00a6:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0510 }
            r1.<init>()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "databasehelper/open-existing-db/nodb/sqlerror"
            r1.append(r0)     // Catch:{ all -> 0x0510 }
            if (r9 != 0) goto L_0x00b4
            goto L_0x00b7
        L_0x00b4:
            java.lang.String r0 = " "
            goto L_0x00b9
        L_0x00b7:
            java.lang.String r0 = "/will-retry "
        L_0x00b9:
            r1.append(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0510 }
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ all -> 0x0510 }
            if (r9 <= 0) goto L_0x00c6
            goto L_0x00d7
        L_0x00c6:
            r8 = 1
            goto L_0x00d1
        L_0x00c8:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/open-existing-db/corrupt"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0510 }
            r5 = -1
        L_0x00cf:
            if (r8 == 0) goto L_0x00df
        L_0x00d1:
            int r0 = r9 + 1
            if (r9 != 0) goto L_0x00df
            r9 = r0
            goto L_0x0068
        L_0x00d7:
            java.lang.String r0 = "databasehelper/open-existing-db/stack"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            X.C22781De.A01()     // Catch:{ all -> 0x0510 }
        L_0x00df:
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x00e7
            if (r5 <= 0) goto L_0x00e7
            r10 = 1
            goto L_0x0104
        L_0x00e7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0510 }
            r1.<init>()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "Can't open message store file "
            r1.append(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x0510 }
            r1.append(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteCantOpenDatabaseException r0 = new android.database.sqlite.SQLiteCantOpenDatabaseException     // Catch:{ all -> 0x0510 }
            r0.<init>(r1)     // Catch:{ all -> 0x0510 }
            A03(r0, r11)     // Catch:{ all -> 0x0510 }
        L_0x0104:
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0122
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            boolean r0 = r0.isReadOnly()     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0115
            java.lang.String r0 = "databasehelper/open-existing-db/ is read only"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
        L_0x0115:
            if (r10 != 0) goto L_0x0124
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            r0.close()     // Catch:{ all -> 0x0510 }
            r11.A00 = r2     // Catch:{ all -> 0x0510 }
            goto L_0x0059
        L_0x0122:
            if (r10 == 0) goto L_0x0059
        L_0x0124:
            java.lang.String r1 = "databasehelper/canQueryDb"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0510 }
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x04ed
            X.1Ez r3 = new X.1Ez     // Catch:{ all -> 0x0510 }
            r3.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0510 }
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            android.database.sqlite.SQLiteDatabase r1 = r0.A00     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            java.lang.String r0 = "SELECT EXISTS (SELECT 1 FROM message LIMIT 1)"
            android.database.sqlite.SQLiteStatement r0 = r1.compileStatement(r0)     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            long r4 = r0.simpleQueryForLong()     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r4 = 0
            if (r0 < 0) goto L_0x0148
            r4 = 1
        L_0x0148:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            r2.<init>()     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            java.lang.String r0 = "databasehelper/canQueryDb "
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            r2.append(r4)     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            java.lang.String r0 = " | time spent:"
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            long r0 = r3.A02()     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            r2.append(r0)     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDoneException -> 0x01b7, SQLiteFullException -> 0x01b1, SQLiteDatabaseCorruptException -> 0x017f, SQLiteException -> 0x016b }
            if (r4 == 0) goto L_0x01a5
            goto L_0x01cf
        L_0x016b:
            r2 = move-exception
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "file is encrypted"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x017e
            java.lang.String r0 = "databasehelper/canQueryDb/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            goto L_0x0185
        L_0x017e:
            throw r2     // Catch:{ all -> 0x0510 }
        L_0x017f:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/canQueryDb/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0510 }
        L_0x0185:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0510 }
            r2.<init>()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "databasehelper/canQueryDb/nocursor | time spent:"
            r2.append(r0)     // Catch:{ all -> 0x0510 }
            long r0 = r3.A02()     // Catch:{ all -> 0x0510 }
            r2.append(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0510 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "databasehelper/canQueryDb/deletedb"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            r11.A0A()     // Catch:{ all -> 0x0510 }
        L_0x01a5:
            r11.close()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "Unable to open writable db: failed to query db"
            android.database.sqlite.SQLiteException r4 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0510 }
            r4.<init>(r0)     // Catch:{ all -> 0x0510 }
            goto L_0x050f
        L_0x01b1:
            r1 = move-exception
            A03(r1, r11)     // Catch:{ all -> 0x0510 }
            goto L_0x0509
        L_0x01b7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0510 }
            r2.<init>()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "databasehelper/canQueryDb/noRow | time spent:"
            r2.append(r0)     // Catch:{ all -> 0x0510 }
            long r0 = r3.A02()     // Catch:{ all -> 0x0510 }
            r2.append(r0)     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0510 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
        L_0x01cf:
            X.1Ch r4 = r11.A06     // Catch:{ all -> 0x0510 }
            boolean r0 = r4.A03     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x01db
            java.lang.String r0 = "databasehelper/canUpdateDb skip"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            goto L_0x0229
        L_0x01db:
            java.lang.String r0 = "databasehelper/canUpdateDb"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            X.1Ez r3 = new X.1Ez     // Catch:{ all -> 0x0510 }
            r3.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0510 }
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            if (r0 == 0) goto L_0x04b3
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            r0.beginTransaction()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            X.1Ev r2 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            java.lang.String r1 = "UPDATE message SET receipt_server_timestamp = -1 WHERE _id = 1"
            java.lang.String r0 = "DB_HELPER_CAN_UPDATE_DB"
            r2.A0E(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            r0.setTransactionSuccessful()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            java.lang.String r0 = "databasehelper/canUpdateDb | time spent:"
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            long r0 = r3.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0229
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0229
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            r0.endTransaction()     // Catch:{ all -> 0x0510 }
        L_0x0229:
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            if (r0 == 0) goto L_0x0498
            java.lang.String r0 = "databasehelper/prepareWritableDatabase"
            X.1Ez r5 = new X.1Ez     // Catch:{ SQLiteException -> 0x04a0 }
            r5.<init>((java.lang.String) r0)     // Catch:{ SQLiteException -> 0x04a0 }
            X.00H r6 = r11.A0A     // Catch:{ SQLiteException -> 0x04a0 }
            java.lang.Object r0 = r6.get()     // Catch:{ SQLiteException -> 0x04a0 }
            X.1F2 r0 = (X.AnonymousClass1F2) r0     // Catch:{ SQLiteException -> 0x04a0 }
            X.1F6 r2 = A01(r11, r0)     // Catch:{ SQLiteException -> 0x04a0 }
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            java.lang.String r3 = "msgtore_db_schema_version"
            boolean r0 = r11.A0B(r0, r3)     // Catch:{ SQLiteException -> 0x04a0 }
            if (r0 != 0) goto L_0x046b
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            r11.A06(r0, r2)     // Catch:{ SQLiteException -> 0x04a0 }
            r5.A01()     // Catch:{ SQLiteException -> 0x04a0 }
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            r11.A09(r0)     // Catch:{ SQLiteException -> 0x04a0 }
            r5.A01()     // Catch:{ SQLiteException -> 0x04a0 }
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            r11.A08(r0)     // Catch:{ SQLiteException -> 0x04a0 }
            r5.A01()     // Catch:{ SQLiteException -> 0x04a0 }
            X.1Ev r1 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            java.lang.Object r0 = r6.get()     // Catch:{ SQLiteException -> 0x04a0 }
            X.1F2 r0 = (X.AnonymousClass1F2) r0     // Catch:{ SQLiteException -> 0x04a0 }
            r11.A05(r1, r0, r2)     // Catch:{ SQLiteException -> 0x04a0 }
            r5.A01()     // Catch:{ SQLiteException -> 0x04a0 }
            java.lang.Object r0 = r6.get()     // Catch:{ SQLiteException -> 0x04a0 }
            X.1F2 r0 = (X.AnonymousClass1F2) r0     // Catch:{ SQLiteException -> 0x04a0 }
            java.lang.String r2 = A02(r0)     // Catch:{ SQLiteException -> 0x04a0 }
            X.1Ev r1 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            java.lang.String r0 = "DatabaseHelper"
            X.C28341Zz.A03(r1, r3, r2, r0)     // Catch:{ SQLiteException -> 0x04a0 }
            r5.A01()     // Catch:{ SQLiteException -> 0x04a0 }
            X.1Ev r5 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            r0 = 78
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ SQLiteException -> 0x04a0 }
            java.lang.String r0 = "links_ready"
            r2 = 0
            r3[r2] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 1
            java.lang.String r0 = "location_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 2
            java.lang.String r0 = "revoked_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 3
            java.lang.String r0 = "main_message_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 4
            java.lang.String r0 = "mention_message_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 5
            java.lang.String r0 = "new_vcards_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 6
            java.lang.String r0 = "receipt_user_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 7
            java.lang.String r0 = "system_message_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 8
            java.lang.String r0 = "quoted_message_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 9
            java.lang.String r0 = "thumbnail_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 10
            java.lang.String r0 = "text_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 11
            java.lang.String r0 = "future_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 12
            java.lang.String r0 = "send_count_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 13
            java.lang.String r0 = "labeled_jids_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 14
            java.lang.String r0 = "frequent_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 15
            java.lang.String r0 = "participant_user_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 16
            java.lang.String r0 = "receipt_device_migration_complete"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 17
            java.lang.String r0 = "new_pay_transaction_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 18
            java.lang.String r0 = "quoted_order_message_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 19
            java.lang.String r0 = "quoted_order_message_v2_migration_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 20
            java.lang.String r0 = "quoted_ui_elements_reply_message_migration_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 21
            java.lang.String r0 = "links_index_start"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 22
            java.lang.String r0 = "jid_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 23
            java.lang.String r0 = "jid_map_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 24
            java.lang.String r0 = "chat_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 25
            java.lang.String r0 = "call_log_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 26
            java.lang.String r0 = "missed_calls_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 27
            java.lang.String r0 = "media_message_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 28
            java.lang.String r0 = "media_message_fixer_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 29
            java.lang.String r0 = "migration_completed"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 30
            java.lang.String r0 = "status_list_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 31
            java.lang.String r0 = "blank_me_jid_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 32
            java.lang.String r0 = "broadcast_me_jid_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 33
            java.lang.String r0 = "write_to_old_schema_disabled"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 34
            java.lang.String r0 = "vcards_index_start"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 35
            java.lang.String r0 = "vcards_ready"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 36
            java.lang.String r0 = "migration_message_main_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 37
            java.lang.String r0 = "migration_message_main_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 38
            java.lang.String r0 = "quoted_ui_elements_reply_message_start_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 39
            java.lang.String r0 = "quoted_ui_elements_reply_message_retry_count"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 40
            java.lang.String r0 = "migration_chat_store_retry_count"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 41
            java.lang.String r0 = "migration_chat_store_start_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 42
            java.lang.String r0 = "migration_jid_store_retry_count"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 43
            java.lang.String r0 = "migration_jid_store_start_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r0 = 44
            java.lang.String r1 = "payment_transaction"
            r3[r0] = r1     // Catch:{ SQLiteException -> 0x04a0 }
            r0 = 45
            r3[r0] = r1     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 46
            java.lang.String r0 = "migration_pay_transaction_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 47
            java.lang.String r0 = "migration_pay_transaction_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 48
            java.lang.String r0 = "migration_message_send_count_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 49
            java.lang.String r0 = "migration_message_send_count_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 50
            java.lang.String r0 = "migration_message_media_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 51
            java.lang.String r0 = "migration_message_media_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 52
            java.lang.String r0 = "migration_participant_user_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 53
            java.lang.String r0 = "migration_participant_user_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 54
            java.lang.String r0 = "migration_broadcast_me_jid_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 55
            java.lang.String r0 = "migration_broadcast_me_jid_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 56
            java.lang.String r0 = "migration_message_location_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 57
            java.lang.String r0 = "migration_message_location_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 58
            java.lang.String r0 = "migration_receipt_device_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 59
            java.lang.String r0 = "migration_receipt_device_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 60
            java.lang.String r0 = "migration_message_mention_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 61
            java.lang.String r0 = "migration_message_mention_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 62
            java.lang.String r0 = "migration_missed_calls_log_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 63
            java.lang.String r0 = "migration_missed_calls_log_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 64
            java.lang.String r0 = "migration_message_system_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 65
            java.lang.String r0 = "migration_message_system_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 66
            java.lang.String r0 = "migration_message_revoked_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 67
            java.lang.String r0 = "migration_message_revoked_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 68
            java.lang.String r0 = "migration_frequent_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 69
            java.lang.String r0 = "migration_frequent_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 70
            java.lang.String r0 = "migration_message_future_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 71
            java.lang.String r0 = "migration_message_future_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 72
            java.lang.String r0 = "migration_vcard_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 73
            java.lang.String r0 = "migration_vcard_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 74
            java.lang.String r0 = "migration_message_text_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 75
            java.lang.String r0 = "migration_message_text_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 76
            java.lang.String r0 = "migration_receipt_index"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 77
            java.lang.String r0 = "migration_receipt_retry"
            r3[r1] = r0     // Catch:{ SQLiteException -> 0x04a0 }
            r1 = 78
        L_0x045e:
            r0 = r3[r2]     // Catch:{ SQLiteException -> 0x04a0 }
            X.C28341Zz.A01(r5, r0)     // Catch:{ SQLiteException -> 0x04a0 }
            int r2 = r2 + 1
            if (r2 < r1) goto L_0x045e
            r0 = 0
            r4.A00(r0)     // Catch:{ SQLiteException -> 0x04a0 }
        L_0x046b:
            X.1Ev r2 = r11.A00     // Catch:{ SQLiteException -> 0x04a0 }
            X.10W r0 = r11.A09     // Catch:{ SQLiteException -> 0x04a0 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ SQLiteException -> 0x04a0 }
        L_0x0473:
            boolean r0 = r1.hasNext()     // Catch:{ SQLiteException -> 0x04a0 }
            if (r0 == 0) goto L_0x0483
            java.lang.Object r0 = r1.next()     // Catch:{ SQLiteException -> 0x04a0 }
            X.1Ce r0 = (X.AnonymousClass1Ce) r0     // Catch:{ SQLiteException -> 0x04a0 }
            r0.Bqw(r2)     // Catch:{ SQLiteException -> 0x04a0 }
            goto L_0x0473
        L_0x0483:
            X.1Ev r0 = r11.A00     // Catch:{ SQLiteException -> 0x0491 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ SQLiteException -> 0x0491 }
            r11.onOpen(r0)     // Catch:{ SQLiteException -> 0x0491 }
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0510 }
        L_0x048f:
            monitor-exit(r7)     // Catch:{ all -> 0x0513 }
            return r0
        L_0x0491:
            r4 = move-exception
            java.lang.String r0 = "msgstore/getWritableLoggableDatabase/onopen"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x0510 }
            goto L_0x050f
        L_0x0498:
            java.lang.String r1 = "databasehelper/prepareWritableDatabase/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLiteException -> 0x04a0 }
            r0.<init>(r1)     // Catch:{ SQLiteException -> 0x04a0 }
            throw r0     // Catch:{ SQLiteException -> 0x04a0 }
        L_0x04a0:
            r4 = move-exception
            java.lang.String r0 = "msgstore/getWritableLoggableDatabase/prepare"
            com.whatsapp.util.Log.e(r0, r4)     // Catch:{ all -> 0x0510 }
            X.190 r3 = r11.A04     // Catch:{ all -> 0x0510 }
            java.lang.String r2 = "msgstore-prepare-failure"
            java.lang.String r1 = r4.getMessage()     // Catch:{ all -> 0x0510 }
            r0 = 1
            r3.A0G(r2, r1, r0)     // Catch:{ all -> 0x0510 }
            goto L_0x050f
        L_0x04b3:
            java.lang.String r1 = "databasehelper/canUpdateDb/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            r0.<init>(r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x04c6, SQLiteFullException -> 0x04bd, SQLiteException -> 0x04bb }
        L_0x04bb:
            r0 = move-exception
            goto L_0x04c2
        L_0x04bd:
            r0 = move-exception
            A03(r0, r11)     // Catch:{ all -> 0x04f5 }
            goto L_0x04c5
        L_0x04c2:
            A03(r0, r11)     // Catch:{ all -> 0x04f5 }
        L_0x04c5:
            throw r0     // Catch:{ all -> 0x04f5 }
        L_0x04c6:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/canUpdateDb/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x04f5 }
            r11.A0A()     // Catch:{ all -> 0x04f5 }
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x04e2
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x04e2
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            r0.endTransaction()     // Catch:{ all -> 0x0510 }
        L_0x04e2:
            r11.close()     // Catch:{ all -> 0x0510 }
            java.lang.String r0 = "Unable to open writable db: failed to update db"
            android.database.sqlite.SQLiteException r4 = new android.database.sqlite.SQLiteException     // Catch:{ all -> 0x0510 }
            r4.<init>(r0)     // Catch:{ all -> 0x0510 }
            goto L_0x050f
        L_0x04ed:
            java.lang.String r0 = "databasehelper/canQueryDb/database is not initialized"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0510 }
            r1.<init>(r0)     // Catch:{ all -> 0x0510 }
            goto L_0x0509
        L_0x04f5:
            r1 = move-exception
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0509
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            boolean r0 = r0.inTransaction()     // Catch:{ all -> 0x0510 }
            if (r0 == 0) goto L_0x0509
            X.1Ev r0 = r11.A00     // Catch:{ all -> 0x0510 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0510 }
            r0.endTransaction()     // Catch:{ all -> 0x0510 }
        L_0x0509:
            throw r1     // Catch:{ all -> 0x0510 }
        L_0x050a:
            X.3ET r4 = new X.3ET     // Catch:{ all -> 0x0510 }
            r4.<init>()     // Catch:{ all -> 0x0510 }
        L_0x050f:
            throw r4     // Catch:{ all -> 0x0510 }
        L_0x0510:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0513 }
            throw r0     // Catch:{ all -> 0x0513 }
        L_0x0513:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22601Cm.Bbw():X.1Ev");
    }

    public synchronized void close() {
        C23141Ev r0 = this.A00;
        if (r0 != null && r0.A00.isOpen()) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/close, ");
            sb.append(this.A00.A00);
            Log.i(sb.toString());
            this.A00.A00.close();
        }
        this.A00 = null;
        this.A02 = null;
    }

    @Deprecated
    public synchronized SQLiteDatabase getReadableDatabase() {
        C17960vV.A0F(false, "Use getReadableLoggableDatabase instead");
        return BXw().A00;
    }

    @Deprecated
    public synchronized SQLiteDatabase getWritableDatabase() {
        C17960vV.A0F(false, "Use getWritableLoggableDatabase instead");
        return Bbw().A00;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (this) {
            String databaseName = getDatabaseName();
            C23141Ev A032 = AnonymousClass1Eu.A03(sQLiteDatabase, this.A07, this.A08, databaseName);
            AnonymousClass00H r7 = this.A0A;
            AnonymousClass1F6 A012 = A01(this, (AnonymousClass1F2) r7.get());
            try {
                C64232uR r0 = new C64232uR(this, atomicBoolean, 0);
                SQLiteDatabase sQLiteDatabase2 = A032.A00;
                sQLiteDatabase2.beginTransactionWithListener(r0);
                Log.i("msgstore/create");
                A012.A05(A032, "DatabaseHelper");
                if (TextUtils.isEmpty(C28331Zy.A00(A032, "table", "props"))) {
                    A032.A0E("CREATE TABLE props (_id INTEGER PRIMARY KEY AUTOINCREMENT, key TEXT UNIQUE, value TEXT)", "CREATE_PROPS_TABLE");
                }
                C28341Zz.A02(A032, "fts_ready", "DatabaseHelper", 5);
                C28341Zz.A01(A032, "message_streaming_sidecar_timestamp");
                Log.i("DatabaseHelper/using migrated DB");
                C28341Zz.A02(A032, "drop_deprecated_tables_status", "DatabaseHelper", 1);
                A06(A032, A012);
                A09(A032);
                A012.A04(A032, "DatabaseHelper");
                A05(A032, (AnonymousClass1F2) r7.get(), A012);
                C28341Zz.A03(A032, "msgtore_db_schema_version", A02((AnonymousClass1F2) r7.get()), "DatabaseHelper");
                sQLiteDatabase2.setTransactionSuccessful();
                this.A06.A00(false);
                Iterator it = this.A09.iterator();
                while (it.hasNext()) {
                    ((AnonymousClass1Ce) it.next()).Bqu();
                }
                sQLiteDatabase2.endTransaction();
                this.A00 = A032;
            } catch (Throwable th) {
                A032.A00.endTransaction();
                throw th;
            }
        }
    }

    public static AnonymousClass1F6 A01(C22601Cm r3, AnonymousClass1F2 r4) {
        AnonymousClass1F6 r2 = new AnonymousClass1F6();
        for (AnonymousClass12T r0 : (Set) r3.A0D.get()) {
            r0.BLt(r2);
            r0.BLp(r4, r2);
            r0.BLv(r2);
        }
        return r2;
    }

    public static void A03(SQLiteException sQLiteException, C22601Cm r3) {
        Iterator it = r3.A09.iterator();
        while (it.hasNext()) {
            ((AnonymousClass1Ce) it.next()).Bqv(sQLiteException);
        }
    }

    private void A05(C23141Ev r6, AnonymousClass1F2 r7, AnonymousClass1F6 r8) {
        if (!A0B(r6, "msgtore_db_schema_indexes_version")) {
            synchronized (this) {
                r8.A03(r6, "DatabaseHelper");
                C28341Zz.A02(r6, "MessagesDBHelper_CreateAsyncIndexes", "DatabaseHelper", 1);
                C28341Zz.A01(r6, "MessagesDBHelper_CreateAsyncIndexesFailedAttempts");
                C28341Zz.A03(r6, "msgtore_db_schema_indexes_version", A02(r7), "DatabaseHelper");
            }
        }
    }

    private void A06(C23141Ev r5, AnonymousClass1F6 r6) {
        AnonymousClass1Ez r2 = new AnonymousClass1Ez("databasehelper/createDatabaseTables");
        r5.A00.setVersion(1);
        C28331Zy.A03(r5, "DatabaseHelper", "messages_dehydrated_hsm");
        C28331Zy.A03(r5, "DatabaseHelper", "labeled_jids");
        r5.A0E("DROP INDEX IF EXISTS message_view_once_index", "DROP_DEPRECATED_INDEX");
        r5.A0E("DROP TABLE IF EXISTS message_view_once", "DROP_DEPRECATED_TABLE");
        C28331Zy.A02(r5, "MessagesDBHelper", "jid_key_index");
        C28331Zy.A02(r5, "MessagesDBHelper", "message_comment_parent_message_row_id_index");
        C28331Zy.A02(r5, "MessagesDBHelper", "labels_index");
        C28331Zy.A03(r5, "MessageViewOnceTable", "message_quoted_view_once_media");
        C28331Zy.A03(r5, "MessageViewOnceTable", "message_quoted_view_once_media_legacy");
        r6.A02(r5);
        String[] strArr = C209514c.A01;
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", 1L);
        contentValues.put("chat_row_id", -1);
        contentValues.put("from_me", 0);
        contentValues.put("key_id", "-1");
        r5.A05("message", "INSERT_TABLE_MESSAGE_FIRST_MESSAGE", contentValues);
        r2.A02();
    }

    public void A07(C28791au r8) {
        if (this.A00 != null) {
            C41851xA BD0 = r8.BD0();
            try {
                String str = AnonymousClass138.A00[0];
                StringBuilder sb = new StringBuilder();
                sb.append("message_fts");
                sb.append(str);
                String obj = sb.toString();
                C28331Zy.A03(this.A00, "DatabaseHelper", obj);
                String lowerCase = String.format("%s_bd_for_%s_trigger", new Object[]{"message", obj}).toLowerCase(Locale.getDefault());
                C23141Ev r2 = this.A00;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DROP TRIGGER IF EXISTS ");
                sb2.append(lowerCase);
                r2.A0E(sb2.toString(), "DROP_OLD_FTS_TABLES_TRIGGERS");
                BD0.A00();
                BD0.close();
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        } else {
            throw new IllegalStateException("databasehelper/dropOldFtsTables/database is not initialized");
        }
    }

    public void A08(C23141Ev r3) {
        A01(this, (AnonymousClass1F2) this.A0A.get()).A04(r3, "DatabaseHelper");
    }

    @Deprecated
    public void A09(C23141Ev r4) {
        SQLiteDatabase sQLiteDatabase = r4.A00;
        sQLiteDatabase.beginTransaction();
        try {
            r4.A0E("DROP VIEW IF EXISTS available_messages_view", "DROP_DEPRECATED_AVAILABLE_MESSAGES_VIEW");
            r4.A0E("DROP VIEW IF EXISTS message_view", "DROP_VIEW_MESSAGE");
            r4.A0E("DROP VIEW IF EXISTS available_message_view", "DROP_VIEW_AVAILABLE_MESSAGE");
            r4.A0E("DROP VIEW IF EXISTS deleted_messages_view", "DROP_VIEW_DELETED_MESSAGES");
            r4.A0E("DROP VIEW IF EXISTS deleted_messages_ids_view", "DROP_VIEW_DELETED_MESSAGES_IDS");
            r4.A0E("CREATE VIEW available_message_view AS  SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, translated_text, starred, lookup_tables, message_add_on_flags, view_mode, expire_timestamp, keep_in_chat FROM message LEFT JOIN deleted_chat_job AS job ON job.chat_row_id = message.chat_row_id LEFT JOIN message_ephemeral AS message_ephemeral ON message._id = message_ephemeral.message_row_id WHERE  IFNULL(NOT((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%'))), 0)", "CREATE_AVAILABLE_MESSAGE_VIEW_FROM_V2");
            r4.A0E("CREATE VIEW IF NOT EXISTS deleted_messages_view AS   SELECT message._id AS _id, message.sort_id AS sort_id, message.chat_row_id AS chat_row_id, from_me, key_id, sender_jid_row_id, status, broadcast, recipient_count, participant_hash, origination_flags, origin, timestamp, received_timestamp, receipt_server_timestamp, message_type, text_data, translated_text, starred, lookup_tables, message_add_on_flags, view_mode, ((((job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%') AND (job.delete_files_singular_delete== 1)) OR ((job.deleted_messages_remove_files == 1) AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)))) OR ((job.deleted_categories_remove_files == 1) AND ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808))))))) as remove_files FROM  deleted_chat_job AS job JOIN message AS message  ON job.chat_row_id = message.chat_row_id   WHERE  IFNULL((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%')), 0) ORDER BY message._id", "CREATE_DELETED_MESSAGES_VIEW_FROM_V2");
            r4.A0E("CREATE VIEW IF NOT EXISTS deleted_messages_ids_view AS  SELECT message._id, message.sort_id, message.chat_row_id, message.message_type FROM deleted_chat_job AS job  JOIN message AS message  ON job.chat_row_id = message.chat_row_id WHERE  IFNULL((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_starred_message_row_id, -9223372036854775808)) OR ( (job.deleted_message_categories IS NOT NULL) AND (job.deleted_message_categories LIKE '%\"' || message.message_type || '\"%') AND ((IFNULL(message.starred, 0) = 0 AND message.sort_id <= IFNULL(job.deleted_categories_message_row_id, -9223372036854775808)) OR (IFNULL(message.starred, 0) = 1 AND message.sort_id <= IFNULL(job.deleted_categories_starred_message_row_id, -9223372036854775808)))) OR ((job.singular_message_delete_rows_id IS NOT NULL) AND (job.singular_message_delete_rows_id LIKE '%\"' || message._id || '\"%')), 0)", "CREATE_DELETED_MESSAGES_IDS_VIEW_FROM_V2");
            r4.A0E("DROP VIEW IF EXISTS chat_view", "DROP_VIEW_CHAT");
            r4.A0E(C28811aw.A00, "CREATE_CHAT_VIEW_FROM_CHAT_TABLE");
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public boolean A0A() {
        File file = this.A0B;
        return file.delete() & AnonymousClass1Eu.A07(file, "databasehelper");
    }

    public boolean A0B(C23141Ev r3, String str) {
        boolean z;
        C22551Ch r1 = this.A06;
        synchronized (r1) {
            z = r1.A00;
        }
        if (z) {
            return false;
        }
        String str2 = "";
        if (!TextUtils.isEmpty(C28331Zy.A00(r3, "table", "props"))) {
            str2 = C28341Zz.A00(r3, str, str2);
        }
        return A02((AnonymousClass1F2) this.A0A.get()).equals(str2);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore/upgrade version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        Log.i(sb.toString());
        onCreate(sQLiteDatabase);
    }

    public static void A04(C23141Ev r7) {
        Cursor A0A2;
        ArrayList arrayList = new ArrayList();
        try {
            A0A2 = r7.A0A("SELECT name FROM sqlite_master WHERE type = ?", "SELECT_SQL_FROM_SQLITE_MASTER_BY_TYPE_AND_NAME", new String[]{"trigger"});
            while (A0A2.moveToNext()) {
                arrayList.add(A0A2.getString(A0A2.getColumnIndexOrThrow(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)));
            }
            A0A2.close();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("BaseDatabaseTable/getAllDatabaseElementsByType,  type = '");
            sb.append("trigger");
            sb.append("'");
            Log.e(sb.toString(), e);
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DROP TRIGGER IF EXISTS ");
                sb2.append(str);
                r7.A0E(sb2.toString(), AnonymousClass2TU.A00("DatabaseHelper/deleteDatabaseTriggers", "dropTriggerIfExistsWithoutStatement", AnonymousClass001.A1H("DROP_", str, C18070vi.A0K(str))));
            } catch (SQLiteException e2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Failed to delete trigger '");
                sb3.append(str);
                sb3.append("', skip it");
                Log.e(sb3.toString(), e2);
            }
        }
        return;
        throw th;
    }

    public C22561Ci BVq() {
        return this.A05;
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        Cursor rawQuery;
        sQLiteDatabase.getVersion();
        sQLiteDatabase.execSQL("PRAGMA synchronous=NORMAL;");
        try {
            rawQuery = sQLiteDatabase.rawQuery("PRAGMA secure_delete=1", (String[]) null);
            while (rawQuery.moveToNext()) {
                rawQuery.getInt(0);
            }
            rawQuery.close();
            return;
        } catch (SQLiteDiskIOException e) {
            Log.e("msgstore/enable_secure_delete", e);
            return;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }
}
