package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.1Wb  reason: invalid class name and case insensitive filesystem */
public class C27431Wb {
    public int A00 = 3;
    public File A01;
    public File A02;
    public final AnonymousClass1DT A03;
    public final AnonymousClass1KB A04;
    public final C27421Wa A05;
    public final C27411Vz A06;
    public final AnonymousClass1L7 A07;
    public final AnonymousClass1NM A08;
    public final AnonymousClass11P A09;
    public final AnonymousClass118 A0A;
    public final C219217x A0B;
    public final C19830z4 A0C;
    public final C27351Vt A0D;
    public final AnonymousClass1ST A0E;
    public final C26291Ro A0F;
    public final AnonymousClass1CL A0G;
    public final C22611Cn A0H;
    public final AnonymousClass1Cd A0I;
    public final AnonymousClass1WZ A0J;
    public final AnonymousClass1QV A0K;
    public final AnonymousClass1DN A0L;
    public final AnonymousClass1DK A0M;
    public final AnonymousClass1CO A0N;
    public final C18030ve A0O;
    public final AnonymousClass18K A0P;
    public final C219317y A0Q;
    public final C27401Vy A0R;
    public final AnonymousClass1NR A0S;
    public final C27321Vq A0T;
    public final AnonymousClass10I A0U;
    public final C26301Rp A0V;
    public final AnonymousClass00H A0W;
    public final AnonymousClass00H A0X;
    public final AnonymousClass00H A0Y;
    public final AnonymousClass00H A0Z;
    public final AnonymousClass00H A0a;
    public final AnonymousClass00H A0b;
    public final AnonymousClass00H A0c;
    public final AnonymousClass00H A0d;
    public final AnonymousClass00H A0e;
    public final Set A0f = new HashSet();
    public final AnonymousClass195 A0g;
    public final AnonymousClass1NT A0h;
    public final AnonymousClass1WP A0i;
    public final AnonymousClass1QB A0j;
    public final AnonymousClass1W1 A0k;
    public final C27331Vr A0l;
    public final Object A0m = new Object();

    public static int A00(File file) {
        Cursor rawQuery;
        try {
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 536870928);
            try {
                rawQuery = openDatabase.rawQuery("SELECT COUNT(*) as count FROM message", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.moveToNext()) {
                        int i = rawQuery.getInt(rawQuery.getColumnIndexOrThrow("count")) - 1;
                        rawQuery.close();
                        openDatabase.close();
                        return i;
                    }
                    rawQuery.close();
                }
                openDatabase.close();
                return -1;
            } catch (Throwable th) {
                if (openDatabase != null) {
                    openDatabase.close();
                }
                throw th;
            }
            throw th;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore/getMessageCountInDb error while trying to retrieve messages count in ");
            sb.append(file.getAbsolutePath());
            Log.e(sb.toString(), e);
            return -1;
        } catch (Throwable th2) {
            AnonymousClass0DT.A00(th, th2);
        }
    }

    public static void A08(C27431Wb r4, C22681Cu r5, int i, long j) {
        boolean z = false;
        if (i == 2) {
            z = true;
        }
        ((C203911y) r4.A0d.get()).A03(true);
        if (z) {
            Log.i("MessageStoreBackup/lock never held for incremental backups");
            return;
        }
        Log.i("MessageStoreBackup/unlocking DB after executing a full backup");
        r4.A03.A0E(false);
        AnonymousClass1Cd r0 = r4.A0I;
        r0.A06();
        r0.A04.unlock();
        r5.A00 = Long.valueOf(SystemClock.uptimeMillis() - j);
        r4.A0P.CC7(r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0B(java.io.File r6) {
        /*
            r5 = 0
            java.lang.String r0 = "MessageStoreIntegrityChecker/isDatabaseIntegrityOk"
            X.1Ez r4 = new X.1Ez
            r4.<init>((java.lang.String) r0)
            boolean r0 = r6.exists()     // Catch:{ Exception -> 0x004d }
            if (r0 == 0) goto L_0x0053
            java.lang.String r2 = r6.getAbsolutePath()     // Catch:{ Exception -> 0x004d }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r1, r0)     // Catch:{ Exception -> 0x004d }
            java.lang.String r0 = "PRAGMA integrity_check"
            java.lang.String r2 = android.database.DatabaseUtils.stringForQuery(r3, r0, r1)     // Catch:{ all -> 0x0046 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x0046 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0046 }
            r1.<init>()     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "msgstore/fieldstat/isdatabaseintegrityok "
            r1.append(r0)     // Catch:{ all -> 0x0046 }
            r1.append(r2)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0046 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "ok"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch:{ all -> 0x0046 }
            if (r3 == 0) goto L_0x0042
            r3.close()     // Catch:{ Exception -> 0x004d }
        L_0x0042:
            r4.A02()
            return r0
        L_0x0046:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ Exception -> 0x004d }
            throw r0     // Catch:{ Exception -> 0x004d }
        L_0x004d:
            r1 = move-exception
            java.lang.String r0 = "msgstore/fieldstat/isdatabaseintegrityok/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0057 }
        L_0x0053:
            r4.A02()
            return r5
        L_0x0057:
            r0 = move-exception
            r4.A02()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27431Wb.A0B(java.io.File):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, java.util.Comparator] */
    public ArrayList A0L() {
        AnonymousClass9JN[] A042 = AnonymousClass9JN.A04(AnonymousClass9JN.A01(), AnonymousClass9JN.A00());
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = A042.length;
            if (i < length) {
                arrayList.addAll(A0M(A042[(length - i) - 1], 3, false));
                i++;
            } else {
                Collections.sort(arrayList, new Object());
                return arrayList;
            }
        }
    }

    public void A0O(C23141Ev r10, AnonymousClass2HF r11, int i) {
        StringBuilder sb;
        String str;
        Cursor rawQuery;
        AnonymousClass1Ez r5 = new AnonymousClass1Ez(false);
        boolean z = true;
        switch (i) {
            case 1:
                Log.i("MessageStoreBackup/deleteUnnecessaryDataForBackup/deleteMediaThumbnails/start");
                r5.A04();
                SQLiteDatabase sQLiteDatabase = r10.A00;
                try {
                    String str2 = AnonymousClass2WO.A00;
                    rawQuery = sQLiteDatabase.rawQuery(str2, (String[]) null);
                    boolean z2 = false;
                    if (rawQuery.getCount() > 0) {
                        z2 = true;
                    }
                    rawQuery.close();
                    if (z2) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("message_row_id IN (");
                            sb2.append(str2);
                            sb2.append(")");
                            sQLiteDatabase.delete("message_thumbnail", sb2.toString(), (String[]) null);
                        } catch (SQLException e) {
                            Log.e("ThumbnailHelper/deleteMediaThumbnails failed with exception", e);
                            z = false;
                        }
                    }
                } catch (Exception e2) {
                    Log.e((Throwable) e2);
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                    break;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("MessageStoreBackup/deleteUnnecessaryDataForBackup/deleteMediaThumbnails/end. Time elapsed: ");
                sb3.append(r5.A02());
                sb3.append(" ms; Success = ");
                sb3.append(z);
                Log.i(sb3.toString());
                r11.A02 = Boolean.valueOf(z);
                if (!z) {
                    throw new SQLException("MessageStoreBackup/deleteUnnecessaryDataForBackup/deleteMediaThumbnails/failed");
                }
                return;
            case 2:
                Log.i("MessageStoreBackup/deleteUnnecessaryDataForBackup/dropFtsTables/start");
                r5.A04();
                C28341Zz.A01(r10, "msgtore_db_schema_version");
                C28341Zz.A01(r10, "msgtore_db_schema_indexes_version");
                C28341Zz.A01(r10, "migration_fts_index");
                C28341Zz.A01(r10, "migration_fts_retry");
                C28341Zz.A01(r10, "fts_index_start");
                C28341Zz.A03(r10, "fts_ready", String.valueOf(0), "FtsMessageStore");
                C28341Zz.A01(r10, "msgtore_db_schema_version");
                ArrayList arrayList = new ArrayList();
                arrayList.add("messages_fts");
                String[] strArr = AnonymousClass138.A00;
                C18070vi.A0Z(strArr);
                ArrayList arrayList2 = new ArrayList(new AnonymousClass1ZV(strArr, false));
                arrayList2.add("v2");
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    String str3 = (String) it.next();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append("message_fts");
                    sb4.append(str3);
                    arrayList.add(sb4.toString());
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("message_fts");
                    sb5.append(str3);
                    sb5.append("_content");
                    arrayList.add(sb5.toString());
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append("message_fts");
                    sb6.append(str3);
                    sb6.append("_docsize");
                    arrayList.add(sb6.toString());
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append("message_fts");
                    sb7.append(str3);
                    sb7.append("_segdir");
                    arrayList.add(sb7.toString());
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append("message_fts");
                    sb8.append(str3);
                    sb8.append("_segments");
                    arrayList.add(sb8.toString());
                    StringBuilder sb9 = new StringBuilder();
                    sb9.append("message_fts");
                    sb9.append(str3);
                    sb9.append("_stat");
                    arrayList.add(sb9.toString());
                }
                arrayList.add("message_newsletter_fts");
                arrayList.add("message_newsletter_fts_content");
                arrayList.add("message_newsletter_fts_docsize");
                arrayList.add("message_newsletter_fts_segdir");
                arrayList.add("message_newsletter_fts_segments");
                arrayList.add("message_newsletter_fts_stat");
                Iterator it2 = arrayList.iterator();
                boolean z3 = true;
                while (it2.hasNext()) {
                    String str4 = (String) it2.next();
                    try {
                        C28331Zy.A03(r10, "DatabaseUtils", str4);
                    } catch (SQLException e3) {
                        StringBuilder sb10 = new StringBuilder();
                        sb10.append("DatabaseUtils/dropTables/failed to drop table: ");
                        sb10.append(str4);
                        Log.e(sb10.toString(), e3);
                        z3 = false;
                    }
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append("MessageStoreBackup/deleteUnnecessaryDataForBackup/dropFtsTables/end. Time elapsed: ");
                sb11.append(r5.A02());
                sb11.append(" ms; Success = ");
                sb11.append(z3);
                Log.i(sb11.toString());
                r11.A00 = true;
                if (!z3) {
                    throw new SQLException("MessageStoreBackup/deleteUnnecessaryDataForBackup/dropFtsTables/failed");
                }
                return;
            case 3:
                Log.i("MessageStoreBackup/deleteUnnecessaryDataForBackup/dropIndices/start");
                r5.A04();
                AnonymousClass1Cd r0 = this.A0I;
                r0.A06();
                C22601Cm r1 = r0.A02;
                try {
                    AnonymousClass1F6 A012 = C22601Cm.A01(r1, (AnonymousClass1F2) r1.A0A.get());
                    for (String A022 : A012.A01.keySet()) {
                        C28331Zy.A02(r10, "DatabaseHelper", A022);
                    }
                    for (String A023 : A012.A00.keySet()) {
                        C28331Zy.A02(r10, "DatabaseHelper", A023);
                    }
                    C28341Zz.A01(r10, "msgtore_db_schema_indexes_version");
                } catch (SQLException e4) {
                    Log.e("DatabaseHelper/dropIndexes failed to drop all of the indexes", e4);
                    z = false;
                }
                StringBuilder sb12 = new StringBuilder();
                sb12.append("MessageStoreBackup/deleteUnnecessaryDataForBackup/dropIndices/end. Time elapsed: ");
                sb12.append(r5.A02());
                sb12.append(" ms; Success = ");
                sb12.append(z);
                Log.i(sb12.toString());
                r11.A01 = Boolean.valueOf(z);
                if (!z) {
                    throw new SQLException("MessageStoreBackup/deleteUnnecessaryDataForBackup/dropIndices/failed");
                }
                return;
            case 4:
                Log.i("MessageStoreBackup/deleteUnnecessaryDataForBackup/deleteTriggers/start");
                r5.A04();
                this.A0I.A06();
                C22601Cm.A04(r10);
                sb = new StringBuilder();
                str = "MessageStoreBackup/deleteUnnecessaryDataForBackup/deleteTriggers/end. Time elapsed: ";
                break;
            case 5:
                Log.i("MessageStoreBackup/deleteUnnecessaryDataForBackup/deleteTables/start");
                r5.A04();
                C28331Zy.A03(r10, "MessageStoreBackup", "status_crossposting");
                C28331Zy.A03(r10, "MessageStoreBackup", "newsletter_message_enforcements");
                C28331Zy.A03(r10, "MessageStoreBackup", "reporting_info_content");
                C28331Zy.A03(r10, "MessageStoreBackup", "message_translation_request");
                sb = new StringBuilder();
                str = "MessageStoreBackup/deleteUnnecessaryDataForBackup/deleteTables/end. Time elapsed: ";
                break;
            case 6:
                Log.i("MessageStoreBackup/deleteUnnecessaryDataForBackup/vacuumDb/start");
                r5.A04();
                try {
                    r10.A0E("VACUUM", AnonymousClass2TU.A00("MessageStoreBackup", "vacuumDb", "vacuum"));
                } catch (SQLException e5) {
                    Log.e("SharedDBQueryExecutor/vacuumDb/failed to vacuum", e5);
                    z = false;
                }
                StringBuilder sb13 = new StringBuilder();
                sb13.append("MessageStoreBackup/deleteUnnecessaryDataForBackup/vacuumDb/end. Time elapsed: ");
                sb13.append(r5.A02());
                sb13.append(" ms; Success = ");
                sb13.append(z);
                Log.i(sb13.toString());
                r11.A03 = Boolean.valueOf(z);
                if (!z) {
                    throw new SQLException("MessageStoreBackup/deleteUnnecessaryDataForBackup/vacuumDb/failed");
                }
                return;
            default:
                return;
        }
        sb.append(str);
        sb.append(r5.A02());
        sb.append(" ms; Success = ");
        sb.append(true);
        Log.i(sb.toString());
        return;
        throw th;
    }

    private File A02() {
        File file;
        synchronized (this.A0m) {
            file = this.A01;
            if (file == null) {
                file = this.A0A.A00.getDatabasePath("msgstore.db-backup");
                this.A01 = file;
            }
        }
        return file;
    }

    public static File A03(C27431Wb r6, File file, long j) {
        AnonymousClass00H r5 = r6.A0e;
        if (((AnonymousClass11Z) r5.get()).A02() < 3 * j) {
            Log.i("MessageStoreBackup/backup/prepare/db/not enough internal storage to make db copy");
            return file;
        }
        try {
            C219317y r2 = r6.A0Q;
            File A012 = r2.A00.A01("");
            if (!C64062u9.A0P(r2, file, A012)) {
                Log.i("MessageStoreBackup/backup/prepare/db/failed to copy");
                return file;
            } else if (((AnonymousClass11Z) r5.get()).A01() < j * 2) {
                Log.i("MessageStoreBackup/backup/prepare/db/not enough external storage to use db copy");
                A012.delete();
                return file;
            } else {
                Log.i("MessageStoreBackup/backup/prepare/db/let's use db copy");
                return A012;
            }
        } catch (IOException e) {
            Log.w("MessageStoreBackup/backup/prepare/db/source failed", e);
            return file;
        }
    }

    private String A04(AnonymousClass9JN r3, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore-increment-(\\d+)");
        sb.append(A05(r3, z));
        return sb.toString();
    }

    public static String A05(AnonymousClass9JN r4, boolean z) {
        String obj;
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (z) {
            obj = str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(-(\\d{4})-(\\d{2})-(\\d{2})");
            sb2.append(Pattern.quote("."));
            sb2.append("(\\d+)");
            sb2.append(")?");
            obj = sb2.toString();
        }
        sb.append(obj);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(".db");
        if (r4 != AnonymousClass9JN.UNENCRYPTED) {
            str = A3K.A01(r4);
        }
        sb3.append(str);
        sb.append(Pattern.quote(sb3.toString()));
        return sb.toString();
    }

    private ArrayList A06() {
        ArrayList arrayList = new ArrayList();
        AnonymousClass1NP r4 = (AnonymousClass1NP) this.A0a.get();
        String string = r4.A07().getString("backup_cleanup_stages_to_skip", (String) null);
        if (string == null) {
            string = ((SharedPreferences) r4.A00.A00.get()).getString("backup_cleanup_stages_to_skip", (String) null);
        }
        if (!TextUtils.isEmpty(string)) {
            boolean z = false;
            for (String trim : string.split(",")) {
                try {
                    int parseInt = Integer.parseInt(trim.trim());
                    switch (parseInt) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            arrayList.add(Integer.valueOf(parseInt));
                            break;
                        default:
                            z = false;
                            break;
                    }
                } catch (NumberFormatException unused) {
                    z = true;
                }
            }
            if (z) {
                A0A(arrayList);
            }
        }
        return arrayList;
    }

    private void A07() {
        AnonymousClass1Cd r3 = this.A0I;
        r3.A06();
        File file = r3.A03;
        if (file.exists()) {
            r3.A06();
            if (!file.delete()) {
                Log.w("MessageStoreBackup/copybackuptodb/failed to delete db before copying from backup up.");
            }
        }
        File A022 = A02();
        if (A022.exists()) {
            C219317y r0 = this.A0Q;
            r3.A06();
            C64062u9.A0P(r0, A022, file);
            return;
        }
        Log.w("MessageStoreBackup/copybackuptodb/no backup db to copy.");
    }

    private void A09(AnonymousClass2HF r5) {
        String obj;
        Integer num = r5.A06;
        if (num == null) {
            obj = null;
        } else {
            obj = num.toString();
        }
        Integer num2 = 0;
        if (!num2.equals(r5.A06)) {
            StringBuilder sb = new StringBuilder();
            sb.append(obj);
            sb.append(";reason=");
            sb.append(r5.A0C);
            obj = sb.toString();
        }
        ((AnonymousClass1NP) this.A0a.get()).A07().edit().putString("msg_backup_result", obj).putLong("msg_backup_timestamp", System.currentTimeMillis()).apply();
    }

    public int A0D() {
        AnonymousClass1Cd r0 = this.A0I;
        r0.A06();
        long length = r0.A03.length();
        long A012 = ((AnonymousClass11Z) this.A0e.get()).A01();
        if (A012 > 7 * length) {
            return 7;
        }
        int max = Math.max((int) (A012 / length), 2);
        StringBuilder sb = new StringBuilder();
        sb.append("MessageStoreBackup/backup/backupexpirationInDays not enough space to store full backup history, saving backups only for ");
        sb.append(max);
        sb.append(" days");
        Log.i(sb.toString());
        return max;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0547, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:?, code lost:
        X.AnonymousClass0DT.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x054c, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x054d, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x054f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0550, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0570, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0571, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x059b, code lost:
        X.C64062u9.A0Q(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05bb, code lost:
        X.C64062u9.A0Q(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x09db, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("CoreBackupUtils/deleteExpiredBackups/failed parsing the date from the msgstore db backup file ");
        r1.append(r15.getName());
        r1.append(". Exception: ");
        r1.append(r12);
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:376:0x0ac2, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("MessageStoreBackup/backupDatabase/failed ");
        r1.append(r3);
        ((X.C57372iy) r37.get()).A00(r1.toString(), 4);
        r7.A0C = r3.toString();
        X.C64062u9.A0Q(r32);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x0b14, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0b15, code lost:
        r0 = r0.A02();
        java.lang.String.format(java.util.Locale.ENGLISH, "MessageStoreBackup backupDatabase time spent: %.2f seconds", new java.lang.Object[]{java.lang.Float.valueOf(((float) r0) / 1000.0f)});
        r3 = new java.lang.StringBuilder();
        r3.append("MessageStoreBackup/backupDatabase | time spent: ");
        r3.append(r0);
        com.whatsapp.util.Log.i(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0b40, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0b43, code lost:
        if (r2 != 0) goto L_0x0b45;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x054c A[ExcHandler: all (th java.lang.Throwable), Splitter:B:145:0x0372] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x059b A[Catch:{ all -> 0x0b83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05bb A[Catch:{ all -> 0x0b83 }] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x08af A[Catch:{ all -> 0x088a, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x08b8 A[Catch:{ all -> 0x088a, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0ac2 A[ExcHandler: UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException (r3v14 'e' java.lang.Object A[CUSTOM_DECLARE]), Splitter:B:244:0x0601] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x0bbc A[Catch:{ SQLiteException -> 0x0bce, all -> 0x0c7c }] */
    /* JADX WARNING: Removed duplicated region for block: B:416:0x0c48  */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x0c56  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:223:0x0552=Splitter:B:223:0x0552, B:229:0x0573=Splitter:B:229:0x0573} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:372:0x0a92=Splitter:B:372:0x0a92, B:199:0x0504=Splitter:B:199:0x0504, B:237:0x05b6=Splitter:B:237:0x05b6, B:365:0x0a38=Splitter:B:365:0x0a38, B:379:0x0ae8=Splitter:B:379:0x0ae8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0F(X.C72053Kl r42, java.lang.Runnable r43, int r44, int r45) {
        /*
            r41 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/backupdb backupTypeToCreate="
            r1.append(r0)
            r39 = r44
            r0 = r39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = r41
            X.118 r0 = r8.A0A
            android.content.Context r0 = r0.A00
            r38 = r0
            X.00H r0 = r8.A0Z
            r37 = r0
            java.lang.Object r5 = r37.get()
            X.2iy r5 = (X.C57372iy) r5
            r6 = 0
            r0 = r38
            X.C18070vi.A0d(r0, r6)
            r0 = 1
            X.C18070vi.A0d(r5, r0)
            java.lang.String r0 = "checkaccounthashvalidity"
            r5.A00(r0, r6)
            X.9ku r7 = X.A85.A01(r38)     // Catch:{ Exception -> 0x008b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "checkaccounthashvalidity/null-check: backup key is null = "
            r1.append(r0)
            r0 = 0
            if (r7 != 0) goto L_0x004b
            r0 = 1
        L_0x004b:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4 = 2
            r5.A00(r0, r4)
            if (r7 == 0) goto L_0x0089
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "checkaccounthashvalidity/google id salt is null = "
            r3.append(r0)
            X.9mJ r0 = r7.A00
            byte[] r2 = r0.A02
            r0 = 0
            if (r2 != 0) goto L_0x006a
            r0 = 1
        L_0x006a:
            r3.append(r0)
            java.lang.String r0 = " hashedGoogleId is null = "
            r3.append(r0)
            byte[] r1 = r7.A02
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            r5.A00(r0, r4)
            if (r2 == 0) goto L_0x0089
            byte[] r0 = X.A8L.A05(r2)
            boolean r0 = java.util.Arrays.equals(r0, r1)
            goto L_0x00a2
        L_0x0089:
            r0 = 0
            goto L_0x00a2
        L_0x008b:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "checkaccounthashvalidity/error = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0 = 3
            r5.A00(r1, r0)
            r0 = 0
        L_0x00a2:
            r2 = 2
            if (r0 != 0) goto L_0x00b2
            java.lang.Object r1 = r37.get()
            X.2iy r1 = (X.C57372iy) r1
            java.lang.String r0 = "MessageStoreBackup/backupdb/check/invalid"
            r1.A00(r0, r2)
            r0 = 3
            return r0
        L_0x00b2:
            X.1WP r5 = r8.A0i
            r4 = 1
            X.1WV r3 = r5.A07
            r0 = 0
            X.AnonymousClass1WP.A00(r5, r3, r0, r4)
            X.1Cd r0 = r8.A0I
            r36 = r0
            X.1au r3 = r36.A05()
            X.1xA r4 = r3.BD0()     // Catch:{ all -> 0x0ca6 }
            r36.A06()     // Catch:{ all -> 0x0c9c }
            X.1Cm r0 = r0.A02     // Catch:{ all -> 0x0c9c }
            r20 = r0
            X.1Ev r0 = r0.A00     // Catch:{ all -> 0x0c9c }
            if (r0 == 0) goto L_0x0c94
            java.lang.String r0 = "databasehelper/cleanBeforeBackup"
            X.1Ez r1 = new X.1Ez     // Catch:{ all -> 0x0c9c }
            r1.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0c9c }
            r0 = r20
            r0.A07(r3)     // Catch:{ all -> 0x0c9c }
            r1.A02()     // Catch:{ all -> 0x0c9c }
            r4.A00()     // Catch:{ all -> 0x0c9c }
            r4.close()     // Catch:{ all -> 0x0ca6 }
            r3.close()
            java.lang.String r0 = "MessageStoreBackup/backupdb/ephemeral purge is done and starting backup now"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2HF r7 = new X.2HF
            r7.<init>()
            java.lang.Boolean r0 = X.C17970vW.A03
            r6 = 1
            r0 = r45
            if (r0 != r6) goto L_0x0109
            X.195 r0 = r8.A0g
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "MessageStoreBackup/backup/skipping message backup since app is in foreground"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 4
            return r0
        L_0x0109:
            X.1Cu r21 = new X.1Cu
            r21.<init>()
            r0 = r39
            if (r0 != r2) goto L_0x0182
            java.lang.String r1 = "MessageStoreBackup/IncrementalBkpLockTimer"
        L_0x0114:
            r0 = r21
            r0.A02 = r1
            long r18 = android.os.SystemClock.uptimeMillis()
            r0 = r39
            if (r0 != r2) goto L_0x0133
            java.lang.String r0 = "MessageStoreBackup/skip locking DB for incremental backups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0125:
            X.00H r0 = r8.A0d
            java.lang.Object r1 = r0.get()
            X.11y r1 = (X.C203911y) r1
            r0 = 0
            r1.A03(r0)
            r3 = 0
            goto L_0x0185
        L_0x0133:
            java.lang.String r0 = "MessageStoreBackup/locking DB for full backups"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ve r3 = r8.A0O
            r1 = 3968(0xf80, float:5.56E-42)
            X.0vf r0 = X.C18040vf.A02
            int r3 = X.C18020vd.A00(r0, r3, r1)
            if (r3 > 0) goto L_0x0146
            r3 = 15000(0x3a98, float:2.102E-41)
        L_0x0146:
            r36.A06()
            r0 = r36
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r0.A04
        L_0x014d:
            X.1DT r1 = r8.A03     // Catch:{ InterruptedException -> 0x016d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ InterruptedException -> 0x016d }
            r1.A0E(r0)     // Catch:{ InterruptedException -> 0x016d }
            r0 = r36
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.A05     // Catch:{ InterruptedException -> 0x016d }
            r0.isWriteLocked()     // Catch:{ InterruptedException -> 0x016d }
            r0.getReadLockCount()     // Catch:{ InterruptedException -> 0x016d }
            r0.getReadHoldCount()     // Catch:{ InterruptedException -> 0x016d }
            long r0 = (long) r3     // Catch:{ InterruptedException -> 0x016d }
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x016d }
            boolean r0 = r4.tryLock(r0, r5)     // Catch:{ InterruptedException -> 0x016d }
            if (r0 == 0) goto L_0x0172
            goto L_0x0125
        L_0x016d:
            java.lang.String r0 = "MessageStoreBackup/lockMessageStoreDb interrupted while waiting for lock"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0172:
            X.1DT r1 = r8.A03
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A0E(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            android.os.SystemClock.sleep(r0)
            goto L_0x014d
        L_0x0182:
            java.lang.String r1 = "MessageStoreBackup/FullBkpLockTimer"
            goto L_0x0114
        L_0x0185:
            r36.A06()     // Catch:{ Exception -> 0x01b6 }
            X.1Ev r4 = r20.BXw()     // Catch:{ Exception -> 0x01b6 }
            java.lang.String r1 = "select sqlite_version() AS sqlite_version"
            java.lang.String r0 = "GET_SQLITE_VERSION"
            X.26f r4 = r4.A0C(r3, r1, r0, r3)     // Catch:{ Exception -> 0x01b6 }
            java.lang.String r1 = ""
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x01ac }
            if (r0 == 0) goto L_0x01a8
            java.lang.String r0 = "sqlite_version"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x01ac }
            java.lang.String r1 = r4.getString(r0)     // Catch:{ all -> 0x01ac }
        L_0x01a8:
            r4.close()     // Catch:{ Exception -> 0x01b6 }
            goto L_0x01bd
        L_0x01ac:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01b1 }
            goto L_0x01b5
        L_0x01b1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x01b6 }
        L_0x01b5:
            throw r1     // Catch:{ Exception -> 0x01b6 }
        L_0x01b6:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backup/errors/failed to query sqlite version"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = r3
        L_0x01bd:
            r7.A0F = r1
            r1 = 1
            r30 = r43
            r0 = r39
            if (r0 == r2) goto L_0x0261
            r1 = 0
            r36.A06()     // Catch:{ all -> 0x0c7c }
            r0 = r36
            java.io.File r2 = r0.A03     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = "MessageStoreBackup/backupdb/beforeclose/list "
            X.C64062u9.A0J(r2, r0)     // Catch:{ all -> 0x0c7c }
            r36.A06()     // Catch:{ all -> 0x0c7c }
            monitor-enter(r20)     // Catch:{ all -> 0x0c7c }
            r0 = r20
            X.1Ev r0 = r0.A00     // Catch:{ all -> 0x025e }
            r10 = 1
            if (r0 == 0) goto L_0x0244
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x025e }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0244
            r0 = r20
            X.1Ev r0 = r0.A00     // Catch:{ all -> 0x025e }
            android.database.sqlite.SQLiteDatabase r4 = r0.A00     // Catch:{ all -> 0x025e }
            boolean r0 = r4.isWriteAheadLoggingEnabled()     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0244
            java.lang.String r0 = "PRAGMA wal_checkpoint(FULL);"
            android.database.Cursor r3 = r4.rawQuery(r0, r3)     // Catch:{ all -> 0x025e }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0238 }
            if (r0 == 0) goto L_0x0234
            int r4 = r3.getInt(r1)     // Catch:{ all -> 0x0238 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0238 }
            r5.<init>()     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = "msgstore/wal_checkpoint: "
            r5.append(r0)     // Catch:{ all -> 0x0238 }
            r5.append(r4)     // Catch:{ all -> 0x0238 }
            java.lang.String r9 = " "
            r5.append(r9)     // Catch:{ all -> 0x0238 }
            int r0 = r3.getInt(r6)     // Catch:{ all -> 0x0238 }
            r5.append(r0)     // Catch:{ all -> 0x0238 }
            r5.append(r9)     // Catch:{ all -> 0x0238 }
            r0 = 2
            int r0 = r3.getInt(r0)     // Catch:{ all -> 0x0238 }
            r5.append(r0)     // Catch:{ all -> 0x0238 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0238 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0238 }
            if (r4 == 0) goto L_0x0230
            r10 = 0
        L_0x0230:
            r3.close()     // Catch:{ all -> 0x025e }
            goto L_0x0244
        L_0x0234:
            r3.close()     // Catch:{ all -> 0x025e }
            goto L_0x0256
        L_0x0238:
            r1 = move-exception
            if (r3 == 0) goto L_0x0243
            r3.close()     // Catch:{ all -> 0x023f }
            goto L_0x0243
        L_0x023f:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x025e }
        L_0x0243:
            throw r1     // Catch:{ all -> 0x025e }
        L_0x0244:
            monitor-exit(r20)     // Catch:{ all -> 0x0c7c }
            if (r10 == 0) goto L_0x0257
            r36.A06()     // Catch:{ all -> 0x0c7c }
            r20.close()     // Catch:{ all -> 0x0c7c }
            r36.A06()     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = "MessageStoreBackup/backupdb/afterclose/list "
            X.C64062u9.A0J(r2, r0)     // Catch:{ all -> 0x0c7c }
            goto L_0x026b
        L_0x0256:
            monitor-exit(r20)     // Catch:{ all -> 0x0c7c }
        L_0x0257:
            java.lang.String r0 = "MessageStoreBackup/backup/wal checkpoint failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0c7c }
            goto L_0x0c31
        L_0x025e:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0c7c }
            throw r0     // Catch:{ all -> 0x0c7c }
        L_0x0261:
            java.lang.String r0 = "MessageStoreBackup/skip closing DB and wal checkpoint for Incremental backups"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c7c }
            if (r43 == 0) goto L_0x026b
            r30.run()     // Catch:{ all -> 0x0c7c }
        L_0x026b:
            X.1NT r2 = r8.A0h     // Catch:{ all -> 0x0c7c }
            r0 = 0
            X.C18070vi.A0d(r2, r0)     // Catch:{ all -> 0x0c7c }
            boolean r0 = r2.A04()     // Catch:{ all -> 0x0c7c }
            if (r0 == 0) goto L_0x027a
            X.9JN r5 = X.AnonymousClass9JN.CRYPT15     // Catch:{ all -> 0x0c7c }
            goto L_0x027c
        L_0x027a:
            X.9JN r5 = X.AnonymousClass9JN.CRYPT14     // Catch:{ all -> 0x0c7c }
        L_0x027c:
            X.3CJ r27 = new X.3CJ     // Catch:{ Exception -> 0x0ba3 }
            r28 = r8
            r29 = r21
            r31 = r39
            r32 = r18
            r34 = r1
            r27.<init>(r28, r29, r30, r31, r32, r34)     // Catch:{ Exception -> 0x0ba3 }
            java.lang.String r0 = "MessageStoreBackup/dodbbackup/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0ba3 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch:{ Exception -> 0x0ba3 }
            r7.A06 = r2     // Catch:{ Exception -> 0x0ba3 }
            r33 = 2
            r1 = r39
            r0 = r33
            if (r1 != r0) goto L_0x02a2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r33)     // Catch:{ Exception -> 0x0ba3 }
        L_0x02a2:
            r7.A05 = r2     // Catch:{ Exception -> 0x0ba3 }
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0ba3 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            X.1NM r0 = r8.A08     // Catch:{ all -> 0x0b83 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x0b83 }
            if (r0 == 0) goto L_0x02c8
            java.lang.Object r2 = r37.get()     // Catch:{ all -> 0x0b83 }
            X.2iy r2 = (X.C57372iy) r2     // Catch:{ all -> 0x0b83 }
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/skip no media or read-only media"
            r0 = r33
            r2.A00(r1, r0)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "no/read-only media"
        L_0x02c4:
            r7.A0C = r0     // Catch:{ all -> 0x0b83 }
            goto L_0x0b41
        L_0x02c8:
            r36.A06()     // Catch:{ all -> 0x0b83 }
            r0 = r36
            java.io.File r10 = r0.A03     // Catch:{ all -> 0x0b83 }
            boolean r0 = r10.exists()     // Catch:{ all -> 0x0b83 }
            r22 = 4
            if (r0 != 0) goto L_0x02f9
            java.lang.Object r2 = r37.get()     // Catch:{ all -> 0x0b83 }
            X.2iy r2 = (X.C57372iy) r2     // Catch:{ all -> 0x0b83 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r1.<init>()     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/skip/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x0b83 }
            r36.A06()     // Catch:{ all -> 0x0b83 }
            r1.append(r10)     // Catch:{ all -> 0x0b83 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0b83 }
            r0 = r22
            r2.A00(r1, r0)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "db file not found"
            goto L_0x02c4
        L_0x02f9:
            java.io.File r1 = r8.A0J(r5)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "backupDatabase"
            boolean r0 = A0C(r1, r0)     // Catch:{ all -> 0x0b83 }
            if (r0 == 0) goto L_0x0b41
            X.0ve r14 = r8.A0O     // Catch:{ all -> 0x0b83 }
            r0 = 4329(0x10e9, float:6.066E-42)
            X.0vf r13 = X.C18040vf.A02     // Catch:{ all -> 0x0b83 }
            boolean r0 = X.C18020vd.A05(r13, r14, r0)     // Catch:{ all -> 0x0b83 }
            if (r0 == 0) goto L_0x0345
            X.1Ro r0 = r8.A0F     // Catch:{ all -> 0x0b83 }
            X.1Cd r0 = r0.A00     // Catch:{ all -> 0x0b83 }
            r0.A06()     // Catch:{ all -> 0x0b83 }
            java.io.File r0 = r0.A03     // Catch:{ all -> 0x0b83 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0b83 }
            boolean r0 = A0B(r0)     // Catch:{ all -> 0x0b83 }
            if (r0 != 0) goto L_0x0345
            java.lang.Object r2 = r37.get()     // Catch:{ all -> 0x0b83 }
            X.2iy r2 = (X.C57372iy) r2     // Catch:{ all -> 0x0b83 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r1.<init>()     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/skip/database corrupted "
            r1.append(r0)     // Catch:{ all -> 0x0b83 }
            r36.A06()     // Catch:{ all -> 0x0b83 }
            r1.append(r10)     // Catch:{ all -> 0x0b83 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0b83 }
            r0 = r22
            r2.A00(r1, r0)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "db corrupted"
            goto L_0x02c4
        L_0x0345:
            r40 = r42
            r0 = r39
            if (r0 == r6) goto L_0x05d4
            java.lang.String r12 = "MessageStoreBackup/createIncrementalBackup/failed "
            java.lang.String r11 = "MessageStoreBackup createIncrementalBackup time spent: %.2f seconds"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r1.<init>()     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/"
            r1.append(r0)     // Catch:{ all -> 0x0b83 }
            r1.append(r5)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b83 }
            X.1Ez r13 = new X.1Ez     // Catch:{ all -> 0x0b83 }
            r13.<init>((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            int r0 = r5.version     // Catch:{ all -> 0x0b83 }
            long r0 = (long) r0     // Catch:{ all -> 0x0b83 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0b83 }
            r7.A07 = r0     // Catch:{ all -> 0x0b83 }
            r23 = 1148846080(0x447a0000, float:1000.0)
            r3 = 0
            r2 = 1
            X.1Wa r4 = r8.A05     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            X.00H r14 = r4.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.lang.Object r0 = r14.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            X.2tR r0 = (X.C63632tR) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            X.1Cd r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            X.1at r15 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            r0 = r15
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0542 }
            X.1Ev r10 = r0.A02     // Catch:{ all -> 0x0542 }
            java.lang.String r9 = "SELECT _id FROM backup_changes ORDER BY _id DESC  LIMIT 1"
            java.lang.String r1 = "BackupChangesStore/FETCH_LAST_ID"
            r0 = 0
            android.database.Cursor r0 = r10.A0A(r9, r1, r0)     // Catch:{ all -> 0x0542 }
            boolean r1 = r0.moveToNext()     // Catch:{ all -> 0x0536 }
            if (r1 != 0) goto L_0x03a0
            java.lang.String r1 = "BackupChangesStore//failed to fetch ID of last row"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0536 }
            r0.close()     // Catch:{ all -> 0x0542 }
            goto L_0x04f8
        L_0x03a0:
            java.lang.String r1 = "_id"
            int r1 = r0.getColumnIndexOrThrow(r1)     // Catch:{ all -> 0x0536 }
            long r34 = r0.getLong(r1)     // Catch:{ all -> 0x0536 }
            r0.close()     // Catch:{ all -> 0x0542 }
            r15.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            r9 = -1
            int r0 = (r34 > r9 ? 1 : (r34 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x04fb
            r0 = r33
            java.util.ArrayList r1 = r8.A0M(r5, r0, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.lang.String r9 = r8.A04(r5, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            X.Akl r0 = new X.Akl     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            r0.<init>(r9, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.util.Collections.sort(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            int r0 = r1.size()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            if (r0 <= 0) goto L_0x0418
            java.lang.Object r0 = r1.get(r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.io.File r0 = (java.io.File) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.lang.String r0 = r0.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            boolean r0 = r0.matches(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            if (r0 == 0) goto L_0x0418
            java.lang.Object r0 = r1.get(r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.io.File r0 = (java.io.File) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.lang.String r1 = r0.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.lang.String r0 = "$1"
            java.lang.String r0 = r1.replaceAll(r9, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            int r0 = r0 + 1
            java.lang.String r10 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
        L_0x03f8:
            java.lang.String r0 = "\\Q"
            java.lang.String r1 = ""
            java.lang.String r9 = r9.replace(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.lang.String r0 = "\\E"
            java.lang.String r9 = r9.replace(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.lang.String r0 = "(\\d+)"
            java.lang.String r9 = r9.replace(r0, r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            X.1L7 r0 = r8.A07     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.io.File r0 = r0.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.io.File r10 = new java.io.File     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            r10.<init>(r0, r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            goto L_0x041b
        L_0x0418:
            java.lang.String r10 = "1"
            goto L_0x03f8
        L_0x041b:
            X.00H r0 = r8.A0Y     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            java.lang.Object r9 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            X.9mv r9 = (X.C191639mv) r9     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            X.00H r0 = r8.A0X     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            X.A0e r0 = (X.C19947A0e) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            X.A5N r5 = r9.A00(r0, r5, r10, r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            r9 = 0
            r0 = r38
            boolean r0 = r5.A0A(r0, r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            if (r0 != 0) goto L_0x0441
            java.lang.String r0 = "failed to prepare for backup"
            r7.A0C = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            X.C64062u9.A0Q(r10)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            goto L_0x0504
        L_0x0441:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            r2.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/to "
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            java.lang.String r0 = r10.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            X.17y r0 = r8.A0Q     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            X.17z r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            java.io.File r9 = r0.A01(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f6, IOException -> 0x04f4, all -> 0x054c }
            android.os.CancellationSignal r30 = new android.os.CancellationSignal     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r30.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r3 = 10
            r2 = 80
            X.2xp r1 = new X.2xp     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r0 = r40
            r1.<init>(r0, r3, r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r29 = r4
            r31 = r1
            r32 = r7
            r33 = r9
            r29.A00(r30, r31, r32, r33, r34)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r3 = 90
            r2 = 100
            X.2xp r1 = new X.2xp     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r1.<init>(r0, r3, r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r5.A08(r1, r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            java.lang.String r0 = "MessageStoreIncrementalBackup/cleaning tracked changes V2"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            java.lang.Object r0 = r14.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            X.2tR r0 = (X.C63632tR) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            X.1Cd r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            X.1au r14 = r0.A05()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r0 = r14
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x04e5 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x04e5 }
            java.lang.String r2 = "backup_changes"
            java.lang.String r1 = "_id <= ?"
            java.lang.String[] r0 = new java.lang.String[r6]     // Catch:{ all -> 0x04e5 }
            java.lang.String r5 = java.lang.String.valueOf(r34)     // Catch:{ all -> 0x04e5 }
            r4 = 0
            r0[r4] = r5     // Catch:{ all -> 0x04e5 }
            java.lang.String r4 = "BackupChangesStore/DELETE_BACKUP_CHANGES_V2"
            r3.A04(r2, r1, r4, r0)     // Catch:{ all -> 0x04e5 }
            r14.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            long r4 = r9.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            long r2 = r10.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            java.lang.String r0 = "MessageStoreBackup/createIncrementalBackup/file/size: "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r1.append(r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r7.A09 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x0519
            double r0 = (double) r4     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            double r4 = (double) r2     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            double r0 = r0 / r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            r7.A04 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
            goto L_0x0519
        L_0x04e5:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x04ea }
            goto L_0x04ee
        L_0x04ea:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
        L_0x04ee:
            throw r1     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x04f1, IOException -> 0x04ef }
        L_0x04ef:
            r2 = move-exception
            goto L_0x0552
        L_0x04f1:
            r2 = move-exception
            goto L_0x0573
        L_0x04f4:
            r2 = move-exception
            goto L_0x0551
        L_0x04f6:
            r2 = move-exception
            goto L_0x0572
        L_0x04f8:
            r15.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
        L_0x04fb:
            java.lang.String r0 = "MessageStoreBackup/null last ID. Failing incremental Backup"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
            java.lang.String r0 = "failed to fetch lastID for incremental backup"
            r7.A0C = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
        L_0x0504:
            r27.run()     // Catch:{ all -> 0x0b83 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            long r0 = r13.A02()     // Catch:{ all -> 0x0b83 }
            float r9 = (float) r0     // Catch:{ all -> 0x0b83 }
            float r9 = r9 / r23
            java.lang.Float r0 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x0b83 }
            r4[r3] = r0     // Catch:{ all -> 0x0b83 }
            goto L_0x0531
        L_0x0519:
            r27.run()     // Catch:{ all -> 0x0b83 }
            X.C64062u9.A0Q(r9)     // Catch:{ all -> 0x0b83 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            long r0 = r13.A02()     // Catch:{ all -> 0x0b83 }
            float r2 = (float) r0     // Catch:{ all -> 0x0b83 }
            float r2 = r2 / r23
            java.lang.Float r0 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0b83 }
            r2 = 0
            r4[r2] = r0     // Catch:{ all -> 0x0b83 }
        L_0x0531:
            java.lang.String.format(r5, r11, r4)     // Catch:{ all -> 0x0b83 }
            goto L_0x0b43
        L_0x0536:
            r1 = move-exception
            if (r0 == 0) goto L_0x0541
            r0.close()     // Catch:{ all -> 0x053d }
            goto L_0x0541
        L_0x053d:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0542 }
        L_0x0541:
            throw r1     // Catch:{ all -> 0x0542 }
        L_0x0542:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0547 }
            goto L_0x054b
        L_0x0547:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
        L_0x054b:
            throw r1     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0570, IOException -> 0x054f, all -> 0x054c }
        L_0x054c:
            r5 = move-exception
            r9 = 0
            goto L_0x05b6
        L_0x054f:
            r2 = move-exception
            r10 = 0
        L_0x0551:
            r9 = 0
        L_0x0552:
            java.lang.Object r1 = r37.get()     // Catch:{ all -> 0x05b5 }
            X.2iy r1 = (X.C57372iy) r1     // Catch:{ all -> 0x05b5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05b5 }
            r0.<init>()     // Catch:{ all -> 0x05b5 }
            r0.append(r12)     // Catch:{ all -> 0x05b5 }
            r0.append(r2)     // Catch:{ all -> 0x05b5 }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x05b5 }
            r0 = r22
            r1.A00(r3, r0)     // Catch:{ all -> 0x05b5 }
            X.C64062u9.A0Q(r10)     // Catch:{ all -> 0x05b5 }
            throw r2     // Catch:{ all -> 0x05b5 }
        L_0x0570:
            r2 = move-exception
            r10 = 0
        L_0x0572:
            r9 = 0
        L_0x0573:
            java.lang.Object r1 = r37.get()     // Catch:{ all -> 0x05b5 }
            X.2iy r1 = (X.C57372iy) r1     // Catch:{ all -> 0x05b5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05b5 }
            r0.<init>()     // Catch:{ all -> 0x05b5 }
            r0.append(r12)     // Catch:{ all -> 0x05b5 }
            r0.append(r2)     // Catch:{ all -> 0x05b5 }
            java.lang.String r3 = r0.toString()     // Catch:{ all -> 0x05b5 }
            r0 = r22
            r1.A00(r3, r0)     // Catch:{ all -> 0x05b5 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x05b5 }
            r7.A0C = r0     // Catch:{ all -> 0x05b5 }
            X.C64062u9.A0Q(r10)     // Catch:{ all -> 0x05b5 }
            r27.run()     // Catch:{ all -> 0x0b83 }
            if (r9 == 0) goto L_0x059e
            X.C64062u9.A0Q(r9)     // Catch:{ all -> 0x0b83 }
        L_0x059e:
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            long r0 = r13.A02()     // Catch:{ all -> 0x0b83 }
            float r4 = (float) r0     // Catch:{ all -> 0x0b83 }
            float r4 = r4 / r23
            java.lang.Float r1 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0b83 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0b83 }
            java.lang.String.format(r3, r11, r2)     // Catch:{ all -> 0x0b83 }
            goto L_0x0b41
        L_0x05b5:
            r5 = move-exception
        L_0x05b6:
            r27.run()     // Catch:{ all -> 0x0b83 }
            if (r9 == 0) goto L_0x05be
            X.C64062u9.A0Q(r9)     // Catch:{ all -> 0x0b83 }
        L_0x05be:
            java.util.Locale r3 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            long r0 = r13.A02()     // Catch:{ all -> 0x0b83 }
            float r4 = (float) r0     // Catch:{ all -> 0x0b83 }
            float r4 = r4 / r23
            java.lang.Float r1 = java.lang.Float.valueOf(r4)     // Catch:{ all -> 0x0b83 }
            r0 = 0
            r2[r0] = r1     // Catch:{ all -> 0x0b83 }
            java.lang.String.format(r3, r11, r2)     // Catch:{ all -> 0x0b83 }
            throw r5     // Catch:{ all -> 0x0b83 }
        L_0x05d4:
            java.lang.String r23 = "MessageStoreBackup/backupDatabase | time spent: "
            java.lang.String r24 = "MessageStoreBackup backupDatabase time spent: %.2f seconds"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r1.<init>()     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/full/"
            r1.append(r0)     // Catch:{ all -> 0x0b83 }
            r1.append(r5)     // Catch:{ all -> 0x0b83 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0b83 }
            X.1Ez r30 = new X.1Ez     // Catch:{ all -> 0x0b83 }
            r0 = r30
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0b83 }
            r8.A0P(r6)     // Catch:{ all -> 0x0b83 }
            int r0 = r5.version     // Catch:{ all -> 0x0b83 }
            long r0 = (long) r0     // Catch:{ all -> 0x0b83 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0b83 }
            r7.A07 = r0     // Catch:{ all -> 0x0b83 }
            java.io.File r32 = r8.A0J(r5)     // Catch:{ all -> 0x0b83 }
            r4 = 0
            r36.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r11 = r10.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r7.A09 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/size "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.append(r11)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r36.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.io.File r9 = A03(r8, r10, r11)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.00H r0 = r8.A0e     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.Object r0 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r2 = r0.A01()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r25 = 2
            long r0 = r11 * r25
            int r15 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r15 >= 0) goto L_0x0667
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r11.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r5 = "MessageStoreBackup/backupDatabase/not enough space to do backup: needed "
            r11.append(r5)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r11.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = ", available "
            r11.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r11.append(r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r11.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r36.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            boolean r0 = r10.equals(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 != 0) goto L_0x0a92
            r9.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            goto L_0x0a92
        L_0x0667:
            r36.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            boolean r0 = r10.equals(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 != 0) goto L_0x0678
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/unlocking db"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r27.run()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
        L_0x0678:
            r36.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            boolean r0 = r10.equals(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 != 0) goto L_0x088f
            boolean r0 = r9.setWritable(r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 == 0) goto L_0x088f
            long r26 = r9.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r1 = r9.getAbsolutePath()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r0 = 0
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openOrCreateDatabase(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r3 = "backup"
            X.1CO r1 = r8.A0N     // Catch:{ all -> 0x0883 }
            X.00H r0 = r8.A0b     // Catch:{ all -> 0x0883 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0883 }
            X.1CP r0 = (X.AnonymousClass1CP) r0     // Catch:{ all -> 0x0883 }
            X.1Ev r31 = X.AnonymousClass1Eu.A03(r2, r0, r1, r3)     // Catch:{ all -> 0x0883 }
            r0 = r31
            r8.A0O(r0, r7, r6)     // Catch:{ all -> 0x0883 }
            X.00H r0 = r8.A0c     // Catch:{ all -> 0x0883 }
            java.lang.Object r3 = r0.get()     // Catch:{ all -> 0x0883 }
            X.1Qp r3 = (X.C26041Qp) r3     // Catch:{ all -> 0x0883 }
            X.C18070vi.A0d(r2, r4)     // Catch:{ all -> 0x0883 }
            android.content.ContentValues r15 = new android.content.ContentValues     // Catch:{ all -> 0x06d0 }
            r15.<init>()     // Catch:{ all -> 0x06d0 }
            java.lang.String r0 = "reporting_token_content"
            r1 = 0
            r15.put(r0, r1)     // Catch:{ all -> 0x06d0 }
            java.lang.String r0 = "version"
            r15.put(r0, r1)     // Catch:{ all -> 0x06d0 }
            java.lang.String r0 = "reporting_token"
            int r0 = r2.update(r0, r15, r1, r1)     // Catch:{ all -> 0x06d0 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x06d0 }
            goto L_0x06d6
        L_0x06d0:
            r0 = move-exception
            X.1IU r1 = new X.1IU     // Catch:{ all -> 0x0883 }
            r1.<init>(r0)     // Catch:{ all -> 0x0883 }
        L_0x06d6:
            java.lang.Throwable r15 = X.C30671eK.A00(r1)     // Catch:{ all -> 0x0883 }
            if (r15 == 0) goto L_0x06e6
            X.1Qo r3 = r3.A00     // Catch:{ all -> 0x0883 }
            X.8oI r1 = X.AnonymousClass8oI.A09     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = "updateDataBeforeBackup"
            r3.A01(r1, r0, r15)     // Catch:{ all -> 0x0883 }
        L_0x06e6:
            long r0 = r9.length()     // Catch:{ all -> 0x0883 }
            r28 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r28
            int r3 = (int) r0     // Catch:{ all -> 0x0883 }
            r15 = 3075(0xc03, float:4.309E-42)
            int r0 = X.C18020vd.A00(r13, r14, r15)     // Catch:{ all -> 0x0883 }
            if (r3 <= r0) goto L_0x071f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0883 }
            r1.<init>()     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/skip DB cleanup as originalDBSize: "
            r1.append(r0)     // Catch:{ all -> 0x0883 }
            r1.append(r3)     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = "MB exceeds threshold limit: "
            r1.append(r0)     // Catch:{ all -> 0x0883 }
            int r0 = X.C18020vd.A00(r13, r14, r15)     // Catch:{ all -> 0x0883 }
            r1.append(r0)     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = "MB"
            r1.append(r0)     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0883 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0883 }
            goto L_0x0860
        L_0x071f:
            r1 = 5
            java.lang.Integer[] r0 = new java.lang.Integer[r1]     // Catch:{ all -> 0x0883 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r33)     // Catch:{ all -> 0x0883 }
            r0[r4] = r3     // Catch:{ all -> 0x0883 }
            r13 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0883 }
            r0[r6] = r3     // Catch:{ all -> 0x0883 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x0883 }
            r0[r33] = r3     // Catch:{ all -> 0x0883 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0883 }
            r0[r13] = r1     // Catch:{ all -> 0x0883 }
            r1 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0883 }
            r0[r22] = r1     // Catch:{ all -> 0x0883 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x0883 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0883 }
            r1.<init>(r0)     // Catch:{ all -> 0x0883 }
            java.util.ArrayList r0 = r8.A06()     // Catch:{ all -> 0x0883 }
            r1.removeAll(r0)     // Catch:{ all -> 0x0883 }
            java.util.Iterator r25 = r1.iterator()     // Catch:{ all -> 0x0883 }
        L_0x0756:
            boolean r0 = r25.hasNext()     // Catch:{ all -> 0x0883 }
            if (r0 == 0) goto L_0x0820
            java.lang.Object r15 = r25.next()     // Catch:{ all -> 0x0883 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x0883 }
            int r14 = r15.intValue()     // Catch:{ all -> 0x0883 }
            r36.A06()     // Catch:{ all -> 0x0883 }
            java.io.File r1 = r10.getParentFile()     // Catch:{ all -> 0x0883 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0883 }
            r3.<init>()     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = "cleanup-"
            r3.append(r0)     // Catch:{ all -> 0x0883 }
            r3.append(r14)     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = ".lock"
            r3.append(r0)     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0883 }
            java.io.File r13 = new java.io.File     // Catch:{ all -> 0x0883 }
            r13.<init>(r1, r0)     // Catch:{ all -> 0x0883 }
            boolean r0 = r13.createNewFile()     // Catch:{ IOException -> 0x07c6 }
            if (r0 == 0) goto L_0x0797
            r0 = r31
            r8.A0O(r0, r7, r14)     // Catch:{ SQLException -> 0x07f6 }
            X.C64062u9.A0Q(r13)     // Catch:{ all -> 0x0883 }
            goto L_0x0756
        L_0x0797:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x07c6 }
            r1.<init>()     // Catch:{ IOException -> 0x07c6 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/lock file exists "
            r1.append(r0)     // Catch:{ IOException -> 0x07c6 }
            r1.append(r13)     // Catch:{ IOException -> 0x07c6 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x07c6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x07c6 }
            boolean r0 = r13.delete()     // Catch:{ IOException -> 0x07c6 }
            if (r0 != 0) goto L_0x07db
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x07c6 }
            r1.<init>()     // Catch:{ IOException -> 0x07c6 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/failed to delete lock file "
            r1.append(r0)     // Catch:{ IOException -> 0x07c6 }
            r1.append(r13)     // Catch:{ IOException -> 0x07c6 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x07c6 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x07c6 }
            goto L_0x07db
        L_0x07c6:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0883 }
            r1.<init>()     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/failed to create lock file "
            r1.append(r0)     // Catch:{ all -> 0x0883 }
            r1.append(r13)     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0883 }
            com.whatsapp.util.Log.w(r0, r3)     // Catch:{ all -> 0x0883 }
        L_0x07db:
            X.00H r0 = r8.A0W     // Catch:{ all -> 0x0883 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0883 }
            X.9uB r1 = (X.C195939uB) r1     // Catch:{ all -> 0x0883 }
            java.lang.String r0 = java.lang.Integer.toString(r14)     // Catch:{ all -> 0x0883 }
            r1.A02(r0)     // Catch:{ all -> 0x0883 }
            java.util.ArrayList r0 = r8.A06()     // Catch:{ all -> 0x0883 }
            r0.add(r15)     // Catch:{ all -> 0x0883 }
            r8.A0A(r0)     // Catch:{ all -> 0x0883 }
            goto L_0x0756
        L_0x07f6:
            r3 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x081b }
            r1.<init>()     // Catch:{ all -> 0x081b }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/failed as cleanup stage #"
            r1.append(r0)     // Catch:{ all -> 0x081b }
            r1.append(r14)     // Catch:{ all -> 0x081b }
            java.lang.String r0 = "; repeat process with excluding this stage."
            r1.append(r0)     // Catch:{ all -> 0x081b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x081b }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ all -> 0x081b }
            java.util.ArrayList r0 = r8.A06()     // Catch:{ all -> 0x081b }
            r0.add(r15)     // Catch:{ all -> 0x081b }
            r8.A0A(r0)     // Catch:{ all -> 0x081b }
            throw r3     // Catch:{ all -> 0x081b }
        L_0x081b:
            r0 = move-exception
            X.C64062u9.A0Q(r13)     // Catch:{ all -> 0x0883 }
            throw r0     // Catch:{ all -> 0x0883 }
        L_0x0820:
            r2.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r2 = r9.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r13 = 100
            long r0 = r2 * r13
            long r0 = r0 / r26
            long r13 = r13 - r0
            java.lang.Long r14 = java.lang.Long.valueOf(r13)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r7.A0A = r14     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r13.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = "MessageStoreBackup/deleteUnnecessaryDataForBackup/original size "
            r13.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r0 = r26
            r13.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = " cleaned size "
            r13.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r13.append(r2)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = ", saved "
            r13.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r13.append(r14)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = "%"
            r13.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r13.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            goto L_0x0863
        L_0x0860:
            r2.close()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
        L_0x0863:
            java.lang.Boolean r0 = r7.A01     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 == 0) goto L_0x086d
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 != 0) goto L_0x0881
        L_0x086d:
            java.lang.Boolean r0 = r7.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 == 0) goto L_0x0877
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 != 0) goto L_0x0881
        L_0x0877:
            java.lang.Boolean r0 = r7.A03     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 == 0) goto L_0x088f
            boolean r0 = r0.booleanValue()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 == 0) goto L_0x088f
        L_0x0881:
            r3 = 1
            goto L_0x0890
        L_0x0883:
            r1 = move-exception
            if (r2 == 0) goto L_0x088e
            r2.close()     // Catch:{ all -> 0x088a }
            goto L_0x088e
        L_0x088a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
        L_0x088e:
            throw r1     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
        L_0x088f:
            r3 = 0
        L_0x0890:
            X.00H r0 = r8.A0Y     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.Object r2 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.9mv r2 = (X.C191639mv) r2     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.00H r0 = r8.A0X     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.Object r1 = r0.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.A0e r1 = (X.C19947A0e) r1     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r0 = r32
            X.A5N r5 = r2.A00(r1, r5, r0, r3)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1 = 0
            r0 = r38
            boolean r0 = r5.A0A(r0, r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 != 0) goto L_0x08b8
            java.lang.String r0 = "failed to prepare for backup"
            r7.A0C = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.C64062u9.A0Q(r32)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            goto L_0x0ae8
        L_0x08b8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/to "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r32.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r0 = r40
            r5.A08(r0, r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r36.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            boolean r0 = r10.equals(r9)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 != 0) goto L_0x08e1
            r9.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
        L_0x08e1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/file-closed size="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r0 = r32.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = " modification time = "
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r0 = r32.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r2 = r32.length()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r9 = 0
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0918
            double r0 = (double) r11     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            double r9 = (double) r2     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            double r0 = r0 / r9
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r7.A04 = r0     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
        L_0x0918:
            X.9jz r0 = r5.A06()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            int r0 = r0.A00     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 == r6) goto L_0x095f
            X.C64062u9.A0Q(r32)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.Object r2 = r37.get()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.2iy r2 = (X.C57372iy) r2     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r1 = "MessageStoreBackup/backupDatabase/integrity-check/not-successful"
            r0 = r33
            r2.A00(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r0 = r30.A02()     // Catch:{ all -> 0x0b83 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            float r2 = (float) r0     // Catch:{ all -> 0x0b83 }
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r9
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0b83 }
            r3[r4] = r2     // Catch:{ all -> 0x0b83 }
            r2 = r24
            java.lang.String.format(r5, r2, r3)     // Catch:{ all -> 0x0b83 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r3.<init>()     // Catch:{ all -> 0x0b83 }
            r2 = r23
            r3.append(r2)     // Catch:{ all -> 0x0b83 }
            r3.append(r0)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0b83 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            r2 = 3
            r0 = 3
            goto L_0x0b49
        L_0x095f:
            int r9 = r8.A0D()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.11P r1 = r8.A09     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.1L7 r0 = r8.A07     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.C18070vi.A0d(r1, r4)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.C18070vi.A0d(r0, r6)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.io.File r2 = r0.A04()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1 = 3
            X.AiL r0 = new X.AiL     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r0.<init>(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.io.File[] r5 = r2.listFiles(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r5 == 0) goto L_0x0a01
            int r3 = r5.length     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r3 == 0) goto L_0x0a01
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.util.Date r2 = new java.util.Date     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r2.<init>(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r1 = "yyyy-MM-dd"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r11.<init>(r1, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r10 = 0
        L_0x0994:
            r15 = r5[r10]     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r1 = r15.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.C18070vi.A0X(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r13 = "^.*((\\d{4})-(\\d{2})-(\\d{2})).*$"
            X.1wr r0 = new X.1wr     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r0.<init>((java.lang.String) r13)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            boolean r0 = r0.A03(r1)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 == 0) goto L_0x09fc
            java.lang.String r12 = r15.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.C18070vi.A0X(r12)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            X.1wr r1 = new X.1wr     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.<init>((java.lang.String) r13)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = "$1"
            java.lang.String r0 = r1.A00(r12, r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.util.Date r0 = r11.parse(r0)     // Catch:{ ParseException -> 0x09db, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2 }
            if (r0 == 0) goto L_0x09fc
            long r13 = r2.getTime()     // Catch:{ ParseException -> 0x09db, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2 }
            long r0 = r0.getTime()     // Catch:{ ParseException -> 0x09db, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2 }
            long r13 = r13 - r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r13 = r13 / r0
            long r0 = (long) r9     // Catch:{ ParseException -> 0x09db, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2 }
            int r12 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x09fc
            X.C64062u9.A0Q(r15)     // Catch:{ ParseException -> 0x09db, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2 }
            r15.getAbsolutePath()     // Catch:{ ParseException -> 0x09db, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2 }
            goto L_0x09fc
        L_0x09db:
            r12 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = "CoreBackupUtils/deleteExpiredBackups/failed parsing the date from the msgstore db backup file "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r15.getName()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = ". Exception: "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.append(r12)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
        L_0x09fc:
            int r10 = r10 + 1
            if (r10 >= r3) goto L_0x0a01
            goto L_0x0994
        L_0x0a01:
            java.io.File r5 = r8.A0H()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            boolean r0 = r5.exists()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            if (r0 == 0) goto L_0x0a38
            r5.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r0 = r5.lastModified()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            long r10 = r10 - r0
            long r0 = (long) r9     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r2
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0a38
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.<init>()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = "MessageStoreBackup/backup/basefile_delete "
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            boolean r0 = r5.delete()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            r1.append(r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            java.lang.String r0 = r1.toString()     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ UnsupportedEncodingException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0ac2, IOException -> 0x0a77 }
        L_0x0a38:
            long r0 = r30.A02()     // Catch:{ all -> 0x0b83 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            float r9 = (float) r0     // Catch:{ all -> 0x0b83 }
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r2
            java.lang.Float r2 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x0b83 }
            r3[r4] = r2     // Catch:{ all -> 0x0b83 }
            r2 = r24
            java.lang.String.format(r5, r2, r3)     // Catch:{ all -> 0x0b83 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r3.<init>()     // Catch:{ all -> 0x0b83 }
            r2 = r23
            r3.append(r2)     // Catch:{ all -> 0x0b83 }
            r3.append(r0)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0b83 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            X.1Wa r1 = r8.A05     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "MessageStoreIncrementalBackup/cleaning tracked changes V1"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            X.00H r0 = r1.A00     // Catch:{ all -> 0x0b83 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0b83 }
            X.2tR r0 = (X.C63632tR) r0     // Catch:{ all -> 0x0b83 }
            r0.A07()     // Catch:{ all -> 0x0b83 }
            goto L_0x0b47
        L_0x0a77:
            r3 = move-exception
            X.C64062u9.A0Q(r32)     // Catch:{ all -> 0x0b14 }
            X.00H r0 = r8.A0e     // Catch:{ all -> 0x0b14 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0b14 }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ all -> 0x0b14 }
            long r9 = r0.A01()     // Catch:{ all -> 0x0b14 }
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0ac1
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/out-of-space"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0b14 }
        L_0x0a92:
            long r0 = r30.A02()     // Catch:{ all -> 0x0b83 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            float r9 = (float) r0     // Catch:{ all -> 0x0b83 }
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r2
            java.lang.Float r2 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x0b83 }
            r3[r4] = r2     // Catch:{ all -> 0x0b83 }
            r2 = r24
            java.lang.String.format(r5, r2, r3)     // Catch:{ all -> 0x0b83 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r3.<init>()     // Catch:{ all -> 0x0b83 }
            r2 = r23
            r3.append(r2)     // Catch:{ all -> 0x0b83 }
            r3.append(r0)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0b83 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            r2 = 2
            r0 = 2
            goto L_0x0b49
        L_0x0ac1:
            throw r3     // Catch:{ all -> 0x0b14 }
        L_0x0ac2:
            r3 = move-exception
            java.lang.Object r2 = r37.get()     // Catch:{ all -> 0x0b14 }
            X.2iy r2 = (X.C57372iy) r2     // Catch:{ all -> 0x0b14 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b14 }
            r1.<init>()     // Catch:{ all -> 0x0b14 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/failed "
            r1.append(r0)     // Catch:{ all -> 0x0b14 }
            r1.append(r3)     // Catch:{ all -> 0x0b14 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0b14 }
            r0 = r22
            r2.A00(r1, r0)     // Catch:{ all -> 0x0b14 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0b14 }
            r7.A0C = r0     // Catch:{ all -> 0x0b14 }
            X.C64062u9.A0Q(r32)     // Catch:{ all -> 0x0b14 }
        L_0x0ae8:
            long r0 = r30.A02()     // Catch:{ all -> 0x0b83 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            float r9 = (float) r0     // Catch:{ all -> 0x0b83 }
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r2
            java.lang.Float r2 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x0b83 }
            r3[r4] = r2     // Catch:{ all -> 0x0b83 }
            r2 = r24
            java.lang.String.format(r5, r2, r3)     // Catch:{ all -> 0x0b83 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r3.<init>()     // Catch:{ all -> 0x0b83 }
            r2 = r23
            r3.append(r2)     // Catch:{ all -> 0x0b83 }
            r3.append(r0)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0b83 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            goto L_0x0b41
        L_0x0b14:
            r10 = move-exception
            long r0 = r30.A02()     // Catch:{ all -> 0x0b83 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0b83 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0b83 }
            float r9 = (float) r0     // Catch:{ all -> 0x0b83 }
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r2
            java.lang.Float r2 = java.lang.Float.valueOf(r9)     // Catch:{ all -> 0x0b83 }
            r3[r4] = r2     // Catch:{ all -> 0x0b83 }
            r2 = r24
            java.lang.String.format(r5, r2, r3)     // Catch:{ all -> 0x0b83 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r3.<init>()     // Catch:{ all -> 0x0b83 }
            r2 = r23
            r3.append(r2)     // Catch:{ all -> 0x0b83 }
            r3.append(r0)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0b83 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            throw r10     // Catch:{ all -> 0x0b83 }
        L_0x0b41:
            r2 = 1
            goto L_0x0b45
        L_0x0b43:
            if (r2 == 0) goto L_0x0b48
        L_0x0b45:
            r0 = 1
            goto L_0x0b49
        L_0x0b47:
            r2 = 0
        L_0x0b48:
            r0 = 0
        L_0x0b49:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0b83 }
            r7.A06 = r0     // Catch:{ all -> 0x0b83 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0b83 }
            r1.<init>()     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = "MessageStoreBackup/dodbbackup/result = "
            r1.append(r0)     // Catch:{ all -> 0x0b83 }
            r1.append(r2)     // Catch:{ all -> 0x0b83 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0b83 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0b83 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0ba3 }
            long r0 = r0 - r16
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0ba3 }
            r7.A0B = r0     // Catch:{ Exception -> 0x0ba3 }
            X.00H r0 = r8.A0e     // Catch:{ Exception -> 0x0ba3 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0ba3 }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ Exception -> 0x0ba3 }
            long r0 = r0.A02()     // Catch:{ Exception -> 0x0ba3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0ba3 }
            r7.A08 = r0     // Catch:{ Exception -> 0x0ba3 }
            r6 = r2
            goto L_0x0baf
        L_0x0b83:
            r2 = move-exception
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0ba3 }
            long r0 = r0 - r16
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0ba3 }
            r7.A0B = r0     // Catch:{ Exception -> 0x0ba3 }
            X.00H r0 = r8.A0e     // Catch:{ Exception -> 0x0ba3 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0ba3 }
            X.11Z r0 = (X.AnonymousClass11Z) r0     // Catch:{ Exception -> 0x0ba3 }
            long r0 = r0.A02()     // Catch:{ Exception -> 0x0ba3 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0ba3 }
            r7.A08 = r0     // Catch:{ Exception -> 0x0ba3 }
            throw r2     // Catch:{ Exception -> 0x0ba3 }
        L_0x0ba3:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/backup/error "
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c7c }
            r7.A0C = r0     // Catch:{ all -> 0x0c7c }
        L_0x0baf:
            r36.A06()     // Catch:{ all -> 0x0c7c }
            r0 = r36
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r0.A04     // Catch:{ all -> 0x0c7c }
            boolean r0 = r1.isHeldByCurrentThread()     // Catch:{ all -> 0x0c7c }
            if (r0 == 0) goto L_0x0c48
            java.lang.String r0 = "MessageStoreBackup/backupdb/callreset"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c7c }
            r36.A06()     // Catch:{ SQLiteException -> 0x0bce }
            r20.Bbw()     // Catch:{ SQLiteException -> 0x0bce }
            X.1QV r0 = r8.A0K     // Catch:{ SQLiteException -> 0x0bce }
            r0.A01()     // Catch:{ SQLiteException -> 0x0bce }
            goto L_0x0c4d
        L_0x0bce:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/backupdb/failed-to-get-database/cannot-generate-fts-or-links"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0c7c }
            java.lang.Long r0 = r7.A07     // Catch:{ all -> 0x0c7c }
            if (r0 == 0) goto L_0x0c2f
            int r0 = r0.intValue()     // Catch:{ all -> 0x0c7c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0c7c }
        L_0x0be0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c7c }
            r1.<init>()     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = "MessageStoreBackup/backup/log-chat-db-backup-event overall-result: "
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.Integer r0 = r7.A06     // Catch:{ all -> 0x0c7c }
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = " database-backup-version: "
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            r1.append(r2)     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = " compression-ratio: "
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.Double r0 = r7.A04     // Catch:{ all -> 0x0c7c }
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = " backup-file-size: "
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.Long r0 = r7.A09     // Catch:{ all -> 0x0c7c }
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = " time: "
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.Long r0 = r7.A0B     // Catch:{ all -> 0x0c7c }
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = " free-disk-space: "
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.Long r0 = r7.A08     // Catch:{ all -> 0x0c7c }
            r1.append(r0)     // Catch:{ all -> 0x0c7c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0c7c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c7c }
            r8.A09(r7)     // Catch:{ all -> 0x0c7c }
            X.18K r0 = r8.A0P     // Catch:{ all -> 0x0c7c }
            r0.CC7(r7)     // Catch:{ all -> 0x0c7c }
            goto L_0x0c31
        L_0x0c2f:
            r2 = 0
            goto L_0x0be0
        L_0x0c31:
            r36.A06()
            r0 = r36
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A04
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0c47
            r3 = r21
            r2 = r39
            r0 = r18
            A08(r8, r3, r2, r0)
        L_0x0c47:
            return r6
        L_0x0c48:
            java.lang.String r0 = "MessageStoreBackup/backupdb/db lock not held by current thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0c7c }
        L_0x0c4d:
            r36.A06()
            boolean r0 = r1.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0c5f
            r3 = r21
            r2 = r39
            r0 = r18
            A08(r8, r3, r2, r0)
        L_0x0c5f:
            r8.A09(r7)
            X.18K r0 = r8.A0P
            r0.CC7(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/backupdb/result = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r6
        L_0x0c7c:
            r4 = move-exception
            r36.A06()
            r0 = r36
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.A04
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 == 0) goto L_0x0c93
            r3 = r21
            r2 = r39
            r0 = r18
            A08(r8, r3, r2, r0)
        L_0x0c93:
            throw r4
        L_0x0c94:
            java.lang.String r1 = "databasehelper/cleanBeforeBackup/database is not initialized"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0c9c }
            r0.<init>(r1)     // Catch:{ all -> 0x0c9c }
            throw r0     // Catch:{ all -> 0x0c9c }
        L_0x0c9c:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0ca1 }
            goto L_0x0ca5
        L_0x0ca1:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0ca6 }
        L_0x0ca5:
            throw r1     // Catch:{ all -> 0x0ca6 }
        L_0x0ca6:
            r4 = move-exception
            r3.close()     // Catch:{ all -> 0x0cab }
            throw r4
        L_0x0cab:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r4, r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27431Wb.A0F(X.3Kl, java.lang.Runnable, int, int):int");
    }

    public File A0H() {
        File file;
        synchronized (this.A0m) {
            file = this.A02;
            if (file == null) {
                file = new File(this.A07.A04(), "msgstore.db");
                this.A02 = file;
            }
        }
        return file;
    }

    public File A0I() {
        if (!this.A07.A0C()) {
            String externalStorageState = Environment.getExternalStorageState();
            C219217x r1 = this.A0B;
            if ((!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) || (!r1.A08() && r1.A04(AnonymousClass73I.A04()) != 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("MessageStoreBackup/verifyExternalMediaReadable/media_unavailable ");
                sb.append(externalStorageState);
                Log.e(sb.toString());
                throw new IOException("External media is not readable");
            }
        }
        ArrayList A012 = A8L.A01(A0H(), A3K.A02(AnonymousClass9JN.A01()));
        int size = A012.size();
        while (true) {
            size--;
            if (size < 0) {
                return null;
            }
            File file = (File) A012.get(size);
            if (file.length() > 0 && !file.getName().contains("-increment-")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("MessageStoreBackup/lastbackupfile/file ");
                sb2.append(file.getName());
                sb2.append(" size=");
                sb2.append(file.length());
                Log.i(sb2.toString());
                return file;
            }
        }
    }

    public File A0J(AnonymousClass9JN r5) {
        if (r5 == AnonymousClass9JN.UNENCRYPTED) {
            return A0H();
        }
        File A042 = this.A07.A04();
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore.db");
        sb.append(A3K.A01(r5));
        return new File(A042, sb.toString());
    }

    public ArrayList A0M(AnonymousClass9JN r8, int i, boolean z) {
        String obj;
        ArrayList arrayList = new ArrayList();
        File A042 = this.A07.A04();
        if (i == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("msgstore");
            sb.append(A05(r8, z));
            obj = sb.toString();
        } else if (i != 2) {
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("msgstore");
            sb3.append(A05(r8, z));
            sb2.append(sb3.toString());
            sb2.append("|");
            sb2.append(A04(r8, z));
            obj = sb2.toString();
        } else {
            obj = A04(r8, z);
        }
        Pattern compile = Pattern.compile(obj);
        File[] listFiles = A042.listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (compile.matcher(file.getName()).matches()) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    private void A0A(List list) {
        SharedPreferences.Editor putString;
        if (list.size() > 0) {
            putString = ((AnonymousClass1NP) this.A0a.get()).A07().edit().putString("backup_cleanup_stages_to_skip", TextUtils.join(",", list));
        } else {
            AnonymousClass00H r4 = this.A0a;
            AnonymousClass1NP r3 = (AnonymousClass1NP) r4.get();
            String string = r3.A07().getString("backup_cleanup_stages_to_skip", (String) null);
            if (string == null) {
                string = ((SharedPreferences) r3.A00.A00.get()).getString("backup_cleanup_stages_to_skip", (String) null);
            }
            if (!TextUtils.isEmpty(string)) {
                putString = ((AnonymousClass1NP) r4.get()).A07().edit().putString("backup_cleanup_stages_to_skip", (String) null);
            } else {
                return;
            }
        }
        putString.apply();
    }

    public static boolean A0C(File file, String str) {
        File parentFile = file.getParentFile();
        C17960vV.A07(parentFile);
        if (parentFile.exists()) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("MessageStoreBackup/");
        sb.append(str);
        sb.append("/createdir");
        Log.i(sb.toString());
        if (parentFile.mkdirs()) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("MessageStoreBackup/");
        sb2.append(str);
        sb2.append("/createdir failed");
        Log.w(sb2.toString());
        return false;
    }

    public int A0E() {
        for (AnonymousClass9JN r0 : AnonymousClass9JN.values()) {
            A3K.A01(r0);
            A0J(r0);
        }
        return A8L.A01(A0H(), A3K.A02(AnonymousClass9JN.A01())).size();
    }

    public long A0G() {
        File file;
        ArrayList A0L2 = A0L();
        if (A0L2.isEmpty() || (file = (File) A0L2.get(A0L2.size() - 1)) == null) {
            return 0;
        }
        return file.lastModified();
    }

    public ArrayList A0K() {
        int indexOf;
        ArrayList A0L2 = A0L();
        if (A0L2.size() <= 1) {
            return A0L2;
        }
        String name = ((File) A0L2.get(A0L2.size() - 1)).getName();
        Pattern compile = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
        Matcher matcher = compile.matcher(name);
        boolean find = matcher.find();
        if (find) {
            indexOf = matcher.start();
        } else {
            indexOf = name.indexOf(".");
        }
        String substring = name.substring(indexOf);
        ArrayList arrayList = new ArrayList();
        Iterator it = A0L2.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file.getName().endsWith(substring) && find == compile.matcher(file.getName()).find()) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public List A0N(int i) {
        AnonymousClass9JN[] A042 = AnonymousClass9JN.A04(AnonymousClass9JN.A01(), AnonymousClass9JN.A00());
        int i2 = 0;
        while (true) {
            int length = A042.length;
            if (i2 >= length) {
                return Collections.emptyList();
            }
            ArrayList A0M2 = A0M(A042[(length - i2) - 1], i, true);
            if (!A0M2.isEmpty()) {
                return A0M2;
            }
            i2++;
        }
    }

    public void A0P(boolean z) {
        for (AnonymousClass9JN r6 : AnonymousClass9JN.values()) {
            ArrayList A0M2 = A0M(r6, 1, true);
            A0M2.addAll(A0M(r6, 2, true));
            Iterator it = A0M2.iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                if (file.exists()) {
                    if (z && System.currentTimeMillis() - file.lastModified() >= ((long) A0D()) * 86400000) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("MessageStoreBackup/backup/too_old ");
                        sb.append(new Date(file.lastModified()));
                        Log.i(sb.toString());
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("MessageStoreBackup/backup/delete ");
                        sb2.append(file.getName());
                        sb2.append(" ");
                        sb2.append(file.delete());
                        Log.i(sb2.toString());
                    } else if (file.exists()) {
                        try {
                            String A002 = C60412nz.A00(file, "", new Date());
                            C18070vi.A0X(A002);
                            file.renameTo(new File(file.getParentFile(), A002));
                        } catch (SecurityException unused) {
                        }
                    }
                }
            }
        }
    }

    public boolean A0Q() {
        File file;
        AnonymousClass9JN[] r2;
        ArrayList A0L2 = A0L();
        if (A0L2.isEmpty() || (file = (File) A0L2.get(A0L2.size() - 1)) == null) {
            return false;
        }
        synchronized (AnonymousClass9JN.class) {
            r2 = new AnonymousClass9JN[]{AnonymousClass9JN.CRYPT15};
        }
        if (Arrays.asList(r2).contains(AnonymousClass9QI.A00(file.getName()))) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v33, types: [X.1DT, X.1DS] */
    public C27431Wb(AnonymousClass195 r5, AnonymousClass1KB r6, AnonymousClass1NT r7, C27421Wa r8, C27411Vz r9, AnonymousClass1L7 r10, AnonymousClass1NM r11, AnonymousClass11P r12, AnonymousClass118 r13, C219217x r14, C19830z4 r15, C27351Vt r16, AnonymousClass1WP r17, AnonymousClass1QB r18, AnonymousClass1ST r19, C26291Ro r20, AnonymousClass1CL r21, C22611Cn r22, AnonymousClass1Cd r23, AnonymousClass1WZ r24, AnonymousClass1W1 r25, AnonymousClass1QV r26, AnonymousClass1DN r27, AnonymousClass1DK r28, AnonymousClass1CO r29, C18030ve r30, AnonymousClass18K r31, C219317y r32, C27331Vr r33, C27401Vy r34, AnonymousClass1NR r35, C27321Vq r36, AnonymousClass10I r37, C26301Rp r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, AnonymousClass00H r45, AnonymousClass00H r46) {
        Boolean bool = C17960vV.A01;
        this.A0A = r13;
        this.A09 = r12;
        C18030ve r1 = r30;
        this.A0O = r1;
        this.A04 = r6;
        this.A0U = r37;
        this.A0P = r31;
        this.A07 = r10;
        this.A0e = r39;
        this.A0N = r29;
        this.A0T = r36;
        this.A0V = r38;
        this.A0Y = r42;
        this.A0j = r18;
        this.A0l = r33;
        this.A0D = r16;
        this.A0h = r7;
        this.A0E = r19;
        this.A08 = r11;
        AnonymousClass1DK r3 = r28;
        this.A0M = r3;
        this.A0K = r26;
        this.A0R = r34;
        this.A0G = r21;
        this.A0d = r40;
        this.A0W = r41;
        this.A0I = r23;
        this.A0c = r46;
        this.A0B = r14;
        this.A0C = r15;
        this.A06 = r9;
        this.A0b = r44;
        this.A0i = r17;
        this.A0a = r43;
        this.A0Z = r45;
        this.A0L = r27;
        this.A0g = r5;
        this.A0J = r24;
        this.A0S = r35;
        this.A0F = r20;
        this.A0k = r25;
        this.A0H = r22;
        this.A05 = r8;
        this.A0Q = r32;
        this.A03 = new AnonymousClass1DS();
        this.A0X = new C18150vq((Object) null, new C70953Dd(r1, r3, 1));
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 1262 */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03f5, code lost:
        if (r3 != 0) goto L_0x03f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0461, code lost:
        if (r6.A01.size() != 0) goto L_0x0463;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0c42, code lost:
        if (r0 == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0d93, code lost:
        if (r10.A02 == false) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0242, code lost:
        if (r0 == false) goto L_0x0244;
     */
    /* JADX WARNING: Removed duplicated region for block: B:1010:0x1b19 A[Catch:{ all -> 0x1bc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1016:0x1b44 A[Catch:{ Exception -> 0x1c02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1018:0x1b61 A[SYNTHETIC, Splitter:B:1018:0x1b61] */
    /* JADX WARNING: Removed duplicated region for block: B:1029:0x1b96 A[Catch:{ Exception -> 0x1c02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1032:0x1bc1 A[Catch:{ Exception -> 0x1c02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1039:0x1be1 A[Catch:{ Exception -> 0x1c02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1041:0x1bfc A[Catch:{ Exception -> 0x1c02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1047:0x1c27  */
    /* JADX WARNING: Removed duplicated region for block: B:1050:0x1c38  */
    /* JADX WARNING: Removed duplicated region for block: B:1053:0x1ceb  */
    /* JADX WARNING: Removed duplicated region for block: B:1059:0x1d48  */
    /* JADX WARNING: Removed duplicated region for block: B:1061:0x1d58  */
    /* JADX WARNING: Removed duplicated region for block: B:1062:0x1d5b  */
    /* JADX WARNING: Removed duplicated region for block: B:1063:0x1d5e  */
    /* JADX WARNING: Removed duplicated region for block: B:1064:0x1d61  */
    /* JADX WARNING: Removed duplicated region for block: B:1065:0x1d64  */
    /* JADX WARNING: Removed duplicated region for block: B:1066:0x1d67  */
    /* JADX WARNING: Removed duplicated region for block: B:1067:0x1d83  */
    /* JADX WARNING: Removed duplicated region for block: B:1068:0x1d8e  */
    /* JADX WARNING: Removed duplicated region for block: B:1069:0x1d99  */
    /* JADX WARNING: Removed duplicated region for block: B:1152:0x0576 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0546  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0556 A[LOOP:3: B:194:0x049e->B:229:0x0556, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x0586  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05b6  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x0db4 A[Catch:{ Exception -> 0x1c02 }] */
    /* JADX WARNING: Removed duplicated region for block: B:571:0x108e A[Catch:{ all -> 0x1ab4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:783:0x15cd A[Catch:{ all -> 0x1ab4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:788:0x164f A[Catch:{ all -> 0x1ab4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:794:0x16ad A[Catch:{ all -> 0x1ab4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:844:0x1820 A[Catch:{ all -> 0x1ab4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:866:0x1894 A[Catch:{ all -> 0x1ab4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:996:0x1af2 A[Catch:{ all -> 0x1bc2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:997:0x1af3 A[Catch:{ all -> 0x1bc2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C192039nf A01(X.C27431Wb r76, X.B9V r77, java.util.List r78, int r79) {
        /*
            r21 = 2
            r0 = r21
            boolean[] r0 = new boolean[r0]
            r39 = r0
            r0 = {1, 0} // fill-array
            r17 = 0
            r33 = 0
            r30 = 0
            r29 = 0
            r28 = 0
            r27 = 0
        L_0x0017:
            java.lang.String r49 = "MessageStoreBackup/restore/"
            r14 = r76
            r1 = r27
            r0 = r21
            if (r1 >= r0) goto L_0x1ddd
            boolean r32 = r39[r27]
            int r0 = r78.size()
            int r26 = r0 + -1
        L_0x0029:
            if (r26 < 0) goto L_0x1dbb
            if (r17 != 0) goto L_0x1dbb
            if (r29 != 0) goto L_0x1dbb
            r1 = r78
            r0 = r26
            java.lang.Object r37 = r1.get(r0)
            r0 = r37
            java.io.File r0 = (java.io.File) r0
            r37 = r0
            java.lang.String r1 = r37.getName()
            java.lang.String r0 = "-increment-"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x007d
            java.lang.String r3 = r37.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = ".crypt"
            r1.append(r0)
            X.9JN r2 = X.AnonymousClass9JN.UNENCRYPTED
            int r0 = r2.version
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r0 = r3.endsWith(r0)
            if (r0 != 0) goto L_0x0080
            X.00H r0 = r14.A0X
            java.lang.Object r1 = r0.get()
            X.A0e r1 = (X.C19947A0e) r1
            r0 = r37
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0080
            java.lang.String r0 = "MessageStoreBackup/restore/backup-not-supported"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x007d:
            int r26 = r26 + -1
            goto L_0x0029
        L_0x0080:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r49
            r1.append(r0)
            if (r32 == 0) goto L_0x1db7
            java.lang.String r0 = "repair-enabled"
        L_0x008e:
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            java.lang.String r0 = r37.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.1Ez r48 = new X.1Ez
            r1 = r48
            r1.<init>((java.lang.String) r0)
            int r0 = r78.size()
            long r0 = (long) r0
            r74 = r0
            r0 = r26
            long r0 = (long) r0
            r72 = r0
            r5 = 0
            boolean r0 = r37.exists()
            if (r0 != 0) goto L_0x00ef
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore-db-backup-file/does-not-exist "
            r1.append(r0)
            java.lang.String r0 = r37.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00d3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure "
        L_0x00da:
            r1.append(r0)
            java.lang.String r0 = r37.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x00eb:
            r48.A02()
            goto L_0x007d
        L_0x00ef:
            java.lang.String r0 = "MessageStoreBackup/restore/chatdb"
            X.1Ez r47 = new X.1Ez
            r1 = r47
            r1.<init>((java.lang.String) r0)
            java.lang.String r3 = r37.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/copy "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = " size: "
            r4.append(r0)
            long r0 = r37.length()
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.ArrayList r46 = new java.util.ArrayList
            r46.<init>()
            java.lang.String r1 = r37.getName()
            X.9JN r8 = X.AnonymousClass9QI.A00(r1)
            if (r8 == 0) goto L_0x018c
            java.lang.String r0 = "(\\d{4})-(\\d{2})-(\\d{2})"
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r0 = r7.matcher(r1)
            boolean r6 = r0.find()
            if (r6 == 0) goto L_0x0177
            int r0 = r0.start()
        L_0x013f:
            java.lang.String r4 = r1.substring(r0)
            r0 = r21
            java.util.ArrayList r0 = r14.A0M(r8, r0, r5)
            java.util.Iterator r9 = r0.iterator()
        L_0x014d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x017e
            java.lang.Object r1 = r9.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.String r0 = r1.getName()
            boolean r0 = r0.endsWith(r4)
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = r1.getName()
            java.util.regex.Matcher r0 = r7.matcher(r0)
            boolean r0 = r0.find()
            if (r6 != r0) goto L_0x014d
            r0 = r46
            r0.add(r1)
            goto L_0x014d
        L_0x0177:
            java.lang.String r0 = "."
            int r0 = r1.indexOf(r0)
            goto L_0x013f
        L_0x017e:
            java.lang.String r0 = r14.A04(r8, r5)
            X.Akl r1 = new X.Akl
            r1.<init>(r0, r5)
            r0 = r46
            java.util.Collections.sort(r0, r1)
        L_0x018c:
            int r0 = r46.size()
            r18 = 1
            int r0 = r0 + 1
            r55 = r79
            int r25 = r79 / r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup allotment for msgstore.db is "
            r1.append(r0)
            r0 = r25
            r1.append(r0)
            java.lang.String r45 = ", base is "
            r0 = r45
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.9JN r24 = X.AnonymousClass9QI.A00(r3)
            X.2HQ r4 = new X.2HQ
            r4.<init>()
            if (r24 == 0) goto L_0x01d3
            r0 = r24
            int r0 = r0.version
            long r0 = (long) r0
        L_0x01c8:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0E = r0
            r61 = r77
            if (r24 == 0) goto L_0x031f
            goto L_0x01d6
        L_0x01d3:
            r0 = 0
            goto L_0x01c8
        L_0x01d6:
            X.00H r0 = r14.A0Y     // Catch:{ Exception -> 0x0d97 }
            java.lang.Object r2 = r0.get()     // Catch:{ Exception -> 0x0d97 }
            X.9mv r2 = (X.C191639mv) r2     // Catch:{ Exception -> 0x0d97 }
            X.00H r0 = r14.A0X     // Catch:{ Exception -> 0x0d97 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0d97 }
            X.A0e r1 = (X.C19947A0e) r1     // Catch:{ Exception -> 0x0d97 }
            r3 = r24
            r0 = r37
            X.A5N r6 = r2.A00(r1, r3, r0, r5)     // Catch:{ Exception -> 0x0d97 }
            r3 = 5
            X.118 r7 = r14.A0A     // Catch:{ IOException -> 0x02ab }
            X.1Cd r0 = r14.A0I     // Catch:{ IOException -> 0x02ab }
            r35 = r0
            r35.A06()     // Catch:{ IOException -> 0x02ab }
            java.io.File r12 = r0.A03     // Catch:{ IOException -> 0x02ab }
            r59 = r6
            r60 = r7
            r62 = r12
            r63 = r5
            r64 = r25
            r65 = r18
            X.9jz r2 = r59.A07(r60, r61, r62, r63, r64, r65)     // Catch:{ IOException -> 0x02ab }
            java.lang.String r1 = r2.A01     // Catch:{ IOException -> 0x02ab }
            if (r1 == 0) goto L_0x0213
            java.util.Set r0 = r14.A0f     // Catch:{ IOException -> 0x02ab }
            r0.add(r1)     // Catch:{ IOException -> 0x02ab }
        L_0x0213:
            int r0 = r2.A00     // Catch:{ IOException -> 0x02ab }
            r1 = r18
            if (r0 != r1) goto L_0x0258
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)     // Catch:{ IOException -> 0x02ab }
            r4.A03 = r0     // Catch:{ IOException -> 0x02ab }
            r4.A02 = r0     // Catch:{ IOException -> 0x02ab }
            boolean r0 = r6 instanceof X.C167348fs     // Catch:{ IOException -> 0x02ab }
            if (r0 == 0) goto L_0x024b
            X.8fs r6 = (X.C167348fs) r6     // Catch:{ IOException -> 0x02ab }
            X.9nv r1 = r6.A00     // Catch:{ IOException -> 0x02ab }
            if (r1 == 0) goto L_0x0244
            X.8ce r0 = r1.A00()     // Catch:{ IOException -> 0x02ab }
            if (r0 == 0) goto L_0x0244
            X.8ce r0 = r1.A00()     // Catch:{ IOException -> 0x02ab }
            int r0 = r0.bitField1_     // Catch:{ IOException -> 0x02ab }
            r0 = r0 & 64
            if (r0 == 0) goto L_0x0244
            X.8ce r0 = r1.A00()     // Catch:{ IOException -> 0x02ab }
            boolean r0 = r0.cleanedDb_     // Catch:{ IOException -> 0x02ab }
            r1 = 1
            if (r0 != 0) goto L_0x0245
        L_0x0244:
            r1 = 0
        L_0x0245:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x02ab }
            r4.A00 = r0     // Catch:{ IOException -> 0x02ab }
        L_0x024b:
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/success"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x02ab }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x0d97 }
            r4.A0A = r0     // Catch:{ Exception -> 0x0d97 }
            goto L_0x035c
        L_0x0258:
            r2 = 2
            if (r0 != r2) goto L_0x026d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x02ab }
            r4.A03 = r0     // Catch:{ IOException -> 0x02ab }
            r4.A02 = r0     // Catch:{ IOException -> 0x02ab }
            java.lang.String r0 = "Integrity Check failed"
            r4.A0M = r0     // Catch:{ IOException -> 0x02ab }
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x02ab }
            goto L_0x0285
        L_0x026d:
            r2 = 4
            if (r0 != r2) goto L_0x028d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)     // Catch:{ IOException -> 0x02ab }
            r4.A03 = r0     // Catch:{ IOException -> 0x02ab }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x02ab }
            r4.A02 = r0     // Catch:{ IOException -> 0x02ab }
            java.lang.String r0 = "JID mismatch"
            r4.A0M = r0     // Catch:{ IOException -> 0x02ab }
            java.lang.String r0 = "MessageStoreBackup/restore/file-integrity-check/failed_jid_mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x02ab }
        L_0x0285:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x0d97 }
            r4.A0A = r0     // Catch:{ Exception -> 0x0d97 }
            goto L_0x0da6
        L_0x028d:
            if (r0 != r3) goto L_0x0294
            java.lang.String r0 = "Backup prefix is null"
            r4.A0M = r0     // Catch:{ IOException -> 0x02ab }
            goto L_0x02ef
        L_0x0294:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x02ab }
            r2.<init>()     // Catch:{ IOException -> 0x02ab }
            java.lang.String r1 = "Unexpected integrity check result "
            r2.append(r1)     // Catch:{ IOException -> 0x02ab }
            r2.append(r0)     // Catch:{ IOException -> 0x02ab }
            java.lang.String r1 = r2.toString()     // Catch:{ IOException -> 0x02ab }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x02ab }
            r0.<init>(r1)     // Catch:{ IOException -> 0x02ab }
            throw r0     // Catch:{ IOException -> 0x02ab }
        L_0x02ab:
            r2 = move-exception
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0317 }
            r4.A0M = r0     // Catch:{ all -> 0x0317 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x02d1
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0317 }
            java.lang.String r0 = "unknown format"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x02d1
        L_0x02c5:
            java.lang.String r0 = "MessageStoreBackup/restore/error/decrypting-failure"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0317 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x0317 }
            r4.A02 = r0     // Catch:{ all -> 0x0317 }
            goto L_0x02ef
        L_0x02d1:
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x02e0
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ all -> 0x0317 }
            boolean r0 = r0 instanceof java.util.zip.DataFormatException     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x02e0
            goto L_0x02c5
        L_0x02e0:
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x02f7
            java.lang.Throwable r0 = r2.getCause()     // Catch:{ all -> 0x0317 }
            boolean r0 = r0 instanceof javax.crypto.AEADBadTagException     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x02f7
            goto L_0x02c5
        L_0x02ef:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x0d97 }
            r4.A0A = r0     // Catch:{ Exception -> 0x0d97 }
            goto L_0x037f
        L_0x02f7:
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x0316
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x0317 }
            java.lang.String r0 = "ENOSPC"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0317 }
            if (r0 == 0) goto L_0x0316
            java.lang.String r0 = "MessageStoreBackup/restore/error/no-space-left"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0317 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x0d97 }
            r4.A0A = r0     // Catch:{ Exception -> 0x0d97 }
            goto L_0x0da5
        L_0x0316:
            throw r2     // Catch:{ all -> 0x0317 }
        L_0x0317:
            r1 = move-exception
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)     // Catch:{ Exception -> 0x0d97 }
            r4.A0A = r0     // Catch:{ Exception -> 0x0d97 }
            throw r1     // Catch:{ Exception -> 0x0d97 }
        L_0x031f:
            X.00H r0 = r14.A0Y     // Catch:{ Exception -> 0x0d97 }
            java.lang.Object r3 = r0.get()     // Catch:{ Exception -> 0x0d97 }
            X.9mv r3 = (X.C191639mv) r3     // Catch:{ Exception -> 0x0d97 }
            X.00H r0 = r14.A0X     // Catch:{ Exception -> 0x0d97 }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x0d97 }
            X.A0e r1 = (X.C19947A0e) r1     // Catch:{ Exception -> 0x0d97 }
            r0 = r37
            X.A5N r50 = r3.A00(r1, r2, r0, r5)     // Catch:{ Exception -> 0x0d97 }
            X.118 r7 = r14.A0A     // Catch:{ 0vo | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0355 }
            X.1Cd r0 = r14.A0I     // Catch:{ 0vo | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0355 }
            r35 = r0
            r35.A06()     // Catch:{ 0vo | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0355 }
            java.io.File r12 = r0.A03     // Catch:{ 0vo | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0355 }
            r56 = r5
            r52 = r61
            r51 = r7
            r53 = r12
            r54 = r5
            X.9jz r0 = r50.A07(r51, r52, r53, r54, r55, r56)     // Catch:{ 0vo | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0355 }
            int r0 = r0.A00     // Catch:{ 0vo | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0355 }
            r1 = r18
            if (r0 != r1) goto L_0x037f
            goto L_0x035c
        L_0x0355:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restore/plaintext error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0d97 }
            goto L_0x037f
        L_0x035c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r32)
            r4.A01 = r0
            r35.A06()
            boolean r0 = r12.exists()
            if (r0 != 0) goto L_0x0382
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/check-restored-db/missing-file "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x037f:
            r2 = 3
            goto L_0x0da6
        L_0x0382:
            java.lang.String r3 = "MessageStoreBackup/integritycheck/corrupt-db-was-deleted/restore-from-backup-copy"
            r6 = 0
            java.lang.String r2 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x03c9 }
            X.2uQ r1 = new X.2uQ     // Catch:{ Exception -> 0x03c9 }
            r1.<init>(r12)     // Catch:{ Exception -> 0x03c9 }
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r6, r0, r1)     // Catch:{ Exception -> 0x03c9 }
            X.2sV r1 = X.C63452t6.A00(r2)     // Catch:{ all -> 0x03bd }
            boolean r0 = r1.A03     // Catch:{ all -> 0x03bd }
            if (r0 != 0) goto L_0x03b7
            if (r2 == 0) goto L_0x03a2
            r2.close()     // Catch:{ Exception -> 0x03c9 }
        L_0x03a2:
            boolean r0 = r12.exists()
            if (r0 != 0) goto L_0x03af
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r14.A07()
            goto L_0x03db
        L_0x03af:
            java.io.File r0 = r14.A02()
            X.C64062u9.A0Q(r0)
            goto L_0x03db
        L_0x03b7:
            if (r2 == 0) goto L_0x03e5
            r2.close()     // Catch:{ Exception -> 0x03c9 }
            goto L_0x03e5
        L_0x03bd:
            r1 = move-exception
            if (r2 == 0) goto L_0x03c8
            r2.close()     // Catch:{ all -> 0x03c4 }
            goto L_0x03c8
        L_0x03c4:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x03c9 }
        L_0x03c8:
            throw r1     // Catch:{ Exception -> 0x03c9 }
        L_0x03c9:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/integritycheck/error "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x1dc7 }
            boolean r0 = r12.exists()
            if (r0 != 0) goto L_0x03dd
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r14.A07()
        L_0x03db:
            r3 = -1
            goto L_0x03f7
        L_0x03dd:
            java.io.File r0 = r14.A02()
            X.C64062u9.A0Q(r0)
            goto L_0x03db
        L_0x03e5:
            boolean r0 = r12.exists()
            if (r0 != 0) goto L_0x0448
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r14.A07()
        L_0x03f1:
            r6 = r1
            int r3 = r1.A00
            r0 = 1
            if (r3 == 0) goto L_0x03f8
        L_0x03f7:
            r0 = 0
        L_0x03f8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A06 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/errors/count "
            r2.append(r0)
            r2.append(r3)
            if (r6 == 0) goto L_0x0445
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = " index="
            r1.append(r0)
            java.util.Map r0 = r6.A02
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " other="
            r1.append(r0)
            java.util.List r0 = r6.A01
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L_0x0432:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r3 == 0) goto L_0x0c46
            if (r32 != 0) goto L_0x0450
            X.C64062u9.A0Q(r12)
            goto L_0x037f
        L_0x0445:
            java.lang.String r0 = ""
            goto L_0x0432
        L_0x0448:
            java.io.File r0 = r14.A02()
            X.C64062u9.A0Q(r0)
            goto L_0x03f1
        L_0x0450:
            if (r6 == 0) goto L_0x0463
            java.util.Map r0 = r6.A02
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0463
            java.util.List r0 = r6.A01
            int r0 = r0.size()
            r1 = 1
            if (r0 == 0) goto L_0x0464
        L_0x0463:
            r1 = 0
        L_0x0464:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r4.A08 = r0
            if (r1 == 0) goto L_0x05b9
            java.io.File r1 = r14.A02()
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0481
            boolean r0 = r1.delete()
            if (r0 != 0) goto L_0x0481
            java.lang.String r0 = "MessageStoreBackup/copydbtobackup/failed to delete backup file before copying from db."
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x0481:
            r35.A06()
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x056f
            X.17y r0 = r14.A0Q
            r35.A06()
            X.C64062u9.A0P(r0, r12, r1)
        L_0x0492:
            java.util.Map r0 = r6.A02
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r11 = r0.iterator()
            r9 = 0
            r8 = 0
        L_0x049e:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0576
            java.lang.Object r6 = r11.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r2 = r6.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "MessageStoreBackup/reindex"
            X.1Ez r10 = new X.1Ez
            r10.<init>((java.lang.String) r0)
            r35.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0509, SQLiteConstraintException -> 0x050d, SQLiteFullException -> 0x0503, SQLiteException -> 0x0514 }
            java.lang.String r3 = r12.getAbsolutePath()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0509, SQLiteConstraintException -> 0x050d, SQLiteFullException -> 0x0503, SQLiteException -> 0x0514 }
            r1 = 0
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r3 = android.database.sqlite.SQLiteDatabase.openDatabase(r3, r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0509, SQLiteConstraintException -> 0x050d, SQLiteFullException -> 0x0503, SQLiteException -> 0x0514 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f7 }
            r1.<init>()     // Catch:{ all -> 0x04f7 }
            java.lang.String r0 = "REINDEX "
            r1.append(r0)     // Catch:{ all -> 0x04f7 }
            r1.append(r2)     // Catch:{ all -> 0x04f7 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04f7 }
            r3.execSQL(r0)     // Catch:{ all -> 0x04f7 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f7 }
            r2.<init>()     // Catch:{ all -> 0x04f7 }
            java.lang.String r0 = "MessageStoreBackup/reindex | time spent:"
            r2.append(r0)     // Catch:{ all -> 0x04f7 }
            long r0 = r10.A02()     // Catch:{ all -> 0x04f7 }
            r2.append(r0)     // Catch:{ all -> 0x04f7 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x04f7 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04f7 }
            r3.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0509, SQLiteConstraintException -> 0x050d, SQLiteFullException -> 0x0503, SQLiteException -> 0x0514 }
            r2 = 1
            goto L_0x0531
        L_0x04f7:
            r0 = move-exception
            if (r3 == 0) goto L_0x0502
            r3.close()     // Catch:{ all -> 0x04fe }
            goto L_0x0502
        L_0x04fe:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0509, SQLiteConstraintException -> 0x050d, SQLiteFullException -> 0x0503, SQLiteException -> 0x0514 }
        L_0x0502:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x0509, SQLiteConstraintException -> 0x050d, SQLiteFullException -> 0x0503, SQLiteException -> 0x0514 }
        L_0x0503:
            X.1CL r0 = r14.A0G
            r0.A00(r5)
            goto L_0x0530
        L_0x0509:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/reindex/dbcorrupt"
            goto L_0x0510
        L_0x050d:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/reindex/constraintexception "
        L_0x0510:
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0530
        L_0x0514:
            r3 = move-exception
            android.content.Context r2 = r7.A00
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "unable to open"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x055d
            X.1Vq r1 = r14.A0T
            r0 = 2131890019(0x7f120f63, float:1.9414718E38)
        L_0x0529:
            java.lang.String r0 = r2.getString(r0)
            r1.A00(r0)
        L_0x0530:
            r2 = 0
        L_0x0531:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/reindex/key: "
            r1.append(r0)
            java.lang.Object r0 = r6.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            if (r2 == 0) goto L_0x055a
            java.lang.String r0 = " ok"
        L_0x0548:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r9 = r9 + 1
            if (r2 == 0) goto L_0x0576
            int r8 = r8 + 1
            goto L_0x049e
        L_0x055a:
            java.lang.String r0 = " failed"
            goto L_0x0548
        L_0x055d:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = "attempt to write a readonly database"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0530
            X.1Vq r1 = r14.A0T
            r0 = 2131890020(0x7f120f64, float:1.941472E38)
            goto L_0x0529
        L_0x056f:
            java.lang.String r0 = "MessageStoreBackup/copydbtobackup/no db to backup."
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0492
        L_0x0576:
            boolean r2 = A0B(r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/reindexresult/dbintegrity "
            r1.append(r0)
            if (r2 == 0) goto L_0x05d1
            java.lang.String r0 = "ok"
        L_0x0588:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/reindexresult/reindexed "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r4.A05 = r0
            if (r2 != 0) goto L_0x0c46
            r14.A07()
        L_0x05b9:
            r0 = 0
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.util.concurrent.atomic.AtomicReference r13 = new java.util.concurrent.atomic.AtomicReference
            r13.<init>(r0)
            android.content.Context r0 = r7.A00
            r34 = r0
            X.00H r0 = r14.A0e
            java.lang.Object r6 = r0.get()
            X.11Z r6 = (X.AnonymousClass11Z) r6
            goto L_0x05d4
        L_0x05d1:
            java.lang.String r0 = "failed"
            goto L_0x0588
        L_0x05d4:
            java.lang.String r0 = "sqlite"
            java.lang.System.loadLibrary(r0)     // Catch:{ UnsatisfiedLinkError -> 0x0c09 }
            boolean r0 = r12.exists()
            if (r0 != 0) goto L_0x05f8
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r0 = r18
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r12.getAbsolutePath()
            r0[r5] = r2
            java.lang.String r2 = "sqlite-repair/recover-database original database (%s) does not exist."
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0c0f
        L_0x05f8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r12.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = "_new"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.io.File r22 = new java.io.File
            r0 = r22
            r0.<init>(r1)
            X.C64062u9.A0Q(r22)
            r2 = 2
            long r0 = r12.length()
            long r0 = r0 * r2
            long r7 = r6.A02()
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0637
            r2 = r34
            android.content.Intent r3 = X.AnonymousClass1LU.A0K(r2, r0)
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            android.content.Intent r3 = r3.setFlags(r2)
            r2 = r34
            r2.startActivity(r3)
        L_0x0637:
            long r7 = r6.A02()
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0648
            r6.A02()
            r2 = 200(0xc8, double:9.9E-322)
            android.os.SystemClock.sleep(r2)
            goto L_0x0637
        L_0x0648:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bf2 }
            r2.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = "sqlite-repair/recover-database dbFile is "
            r2.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            r2.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = " (Size: "
            r2.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            long r0 = r12.length()     // Catch:{ Exception -> 0x0bf2 }
            r2.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = ")"
            r2.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r2.toString()     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            java.io.File r1 = r34.getFilesDir()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = "tmp_db_dump_schema"
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0bf2 }
            r10.<init>(r1, r0)     // Catch:{ Exception -> 0x0bf2 }
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0bf2 }
            r0 = r18
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            r1[r5] = r0     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r31 = ".read %s"
            r0 = r31
            java.lang.String r9 = java.lang.String.format(r2, r0, r1)     // Catch:{ Exception -> 0x0bf2 }
            X.C64062u9.A0Q(r10)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r2 = r12.getAbsolutePath()     // Catch:{ all -> 0x0be8 }
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = ".schema"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r2, r1, r0)     // Catch:{ all -> 0x0be8 }
            r19 = 0
            if (r0 == 0) goto L_0x06d2
            java.lang.String r0 = "sqlite-repair/copy-schema/failed \".schema\""
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0be8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0be8 }
            r1.<init>()     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = "sqlite-repair/copy-schema/result of command \".schema\" is \""
            r1.append(r0)     // Catch:{ all -> 0x0be8 }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0be8 }
            r0.<init>(r10)     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = X.AnonymousClass1EY.A00(r0)     // Catch:{ all -> 0x0be8 }
            r1.append(r0)     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = "\""
            r1.append(r0)     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0be8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0be8 }
            goto L_0x07e9
        L_0x06d2:
            java.lang.String r0 = "sqlite-repair/copy-schema/success \".schema\""
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0be8 }
            java.lang.String r8 = "ROLLBACK;"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0be8 }
            r1.<init>()     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ all -> 0x0be8 }
            r1.append(r0)     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = ".tmp"
            r1.append(r0)     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0be8 }
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0be8 }
            r7.<init>(r0)     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0be8 }
            boolean r0 = X.C64062u9.A0Q(r7)     // Catch:{ all -> 0x0be8 }
            if (r0 == 0) goto L_0x07db
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0be8 }
            r1.<init>(r10)     // Catch:{ all -> 0x0be8 }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ all -> 0x0be8 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0be8 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0be8 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ all -> 0x0be8 }
            r6.<init>(r0)     // Catch:{ all -> 0x0be8 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0796 }
            r1.<init>(r7)     // Catch:{ all -> 0x0796 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0796 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0796 }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ all -> 0x0796 }
            r3.<init>(r0)     // Catch:{ all -> 0x0796 }
            java.lang.String r2 = r6.readLine()     // Catch:{ all -> 0x078c }
        L_0x0724:
            if (r2 == 0) goto L_0x0788
            java.lang.String r11 = r6.readLine()     // Catch:{ all -> 0x078c }
            if (r11 != 0) goto L_0x0759
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x078c }
            java.lang.String r0 = r2.toUpperCase(r0)     // Catch:{ all -> 0x078c }
            boolean r0 = r0.contains(r8)     // Catch:{ all -> 0x078c }
            if (r0 == 0) goto L_0x0759
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x078c }
            r1.<init>()     // Catch:{ all -> 0x078c }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump replacing following statement with 'commit transaction': "
            r1.append(r0)     // Catch:{ all -> 0x078c }
            r1.append(r2)     // Catch:{ all -> 0x078c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x078c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x078c }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x078c }
            java.lang.String r1 = r2.toUpperCase(r0)     // Catch:{ all -> 0x078c }
            java.lang.String r0 = "COMMIT TRANSACTION;"
            java.lang.String r2 = r1.replace(r8, r0)     // Catch:{ all -> 0x078c }
        L_0x0759:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x078c }
            java.lang.String r1 = r2.toUpperCase(r0)     // Catch:{ all -> 0x078c }
            java.lang.String r0 = "CREATE TABLE 'MESSAGES_FTS_"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x078c }
            if (r0 == 0) goto L_0x077e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x078c }
            r1.<init>()     // Catch:{ all -> 0x078c }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump creation of virtual table messages_fts will take care of this, ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x078c }
            r1.append(r2)     // Catch:{ all -> 0x078c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x078c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x078c }
            java.lang.String r2 = ""
        L_0x077e:
            r3.write(r2)     // Catch:{ all -> 0x078c }
            java.lang.String r0 = "\n"
            r3.write(r0)     // Catch:{ all -> 0x078c }
            r2 = r11
            goto L_0x0724
        L_0x0788:
            r3.close()     // Catch:{ all -> 0x0796 }
            goto L_0x07a0
        L_0x078c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0791 }
            goto L_0x0795
        L_0x0791:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ all -> 0x0796 }
        L_0x0795:
            throw r0     // Catch:{ all -> 0x0796 }
        L_0x0796:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x079b }
            goto L_0x079f
        L_0x079b:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ all -> 0x0be8 }
        L_0x079f:
            throw r0     // Catch:{ all -> 0x0be8 }
        L_0x07a0:
            r6.close()     // Catch:{ all -> 0x0be8 }
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0be8 }
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ all -> 0x0be8 }
            r1[r5] = r0     // Catch:{ all -> 0x0be8 }
            long r15 = r10.length()     // Catch:{ all -> 0x0be8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0be8 }
            r1[r18] = r0     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = r7.getAbsolutePath()     // Catch:{ all -> 0x0be8 }
            r1[r21] = r0     // Catch:{ all -> 0x0be8 }
            long r15 = r7.length()     // Catch:{ all -> 0x0be8 }
            java.lang.Long r3 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0be8 }
            r0 = 3
            r1[r0] = r3     // Catch:{ all -> 0x0be8 }
            r0 = 4
            r1[r0] = r10     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = "sqlite-repair/clean-schema-dump deleting %s (size %d), renaming %s (size:%d) -> %s"
            java.lang.String.format(r2, r0, r1)     // Catch:{ all -> 0x0be8 }
            boolean r0 = r10.delete()     // Catch:{ all -> 0x0be8 }
            if (r0 == 0) goto L_0x07db
            r7.renameTo(r10)     // Catch:{ all -> 0x0be8 }
        L_0x07db:
            java.lang.String r1 = r22.getAbsolutePath()     // Catch:{ all -> 0x0be8 }
            java.lang.String r0 = "/dev/null"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r1, r0, r9)     // Catch:{ all -> 0x0be8 }
            if (r0 != 0) goto L_0x07e9
            r19 = 1
        L_0x07e9:
            X.C64062u9.A0Q(r10)     // Catch:{ Exception -> 0x0bf2 }
            if (r19 == 0) goto L_0x0c0f
            java.io.File r1 = r34.getFilesDir()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r23 = "tmp_db_dump_table"
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0bf2 }
            r0 = r23
            r2.<init>(r1, r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r3 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r1 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = ".tables"
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r3, r1, r0)     // Catch:{ Exception -> 0x0bf2 }
            if (r0 == 0) goto L_0x0829
            java.lang.String r0 = "sqlite-repair/get-tables/failed \".tables\""
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
        L_0x0812:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bf2 }
            r1.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = "sqlite-repair/recover-database/failed-to-get-tables "
            r1.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            r1.append(r12)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            goto L_0x0c0f
        L_0x0829:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bf2 }
            r3.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = "sqlite-repair/get-tables/success \".tables\" dump size:"
            r3.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            long r0 = r2.length()     // Catch:{ Exception -> 0x0bf2 }
            r3.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x0bf2 }
            r9.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0bf2 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r1 = X.AnonymousClass1EY.A00(r6)     // Catch:{ all -> 0x0bde }
            java.lang.String r0 = "[\\t\\n\\r, ]"
            java.lang.String[] r3 = android.text.TextUtils.split(r1, r0)     // Catch:{ all -> 0x0bde }
            int r2 = r3.length     // Catch:{ all -> 0x0bde }
            r1 = 0
        L_0x0858:
            if (r1 >= r2) goto L_0x086c
            r0 = r3[r1]     // Catch:{ all -> 0x0bde }
            java.lang.String r0 = r0.trim()     // Catch:{ all -> 0x0bde }
            int r7 = r0.length()     // Catch:{ all -> 0x0bde }
            if (r7 <= 0) goto L_0x0869
            r9.add(r0)     // Catch:{ all -> 0x0bde }
        L_0x0869:
            int r1 = r1 + 1
            goto L_0x0858
        L_0x086c:
            r6.close()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bf2 }
            r1.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = "sqlite-repair/get-tables/ "
            r1.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r9)     // Catch:{ Exception -> 0x0bf2 }
            r1.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            int r0 = r9.size()     // Catch:{ Exception -> 0x0bf2 }
            if (r0 == 0) goto L_0x0812
            r8 = 0
        L_0x0891:
            int r0 = r9.size()     // Catch:{ Exception -> 0x0bf2 }
            if (r8 >= r0) goto L_0x0af1
            java.util.Locale r7 = java.util.Locale.ENGLISH     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r1 = "sqlite-repair/recover-database/reading-table %d/%d: %s"
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0bf2 }
            int r2 = r8 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0bf2 }
            r0[r5] = r2     // Catch:{ Exception -> 0x0bf2 }
            int r2 = r9.size()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0bf2 }
            r0[r18] = r2     // Catch:{ Exception -> 0x0bf2 }
            int r2 = r9.size()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0bf2 }
            r0[r21] = r2     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = java.lang.String.format(r7, r1, r0)     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.Object r2 = r9.get(r8)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x0bf2 }
            java.io.File r1 = r34.getFilesDir()     // Catch:{ Exception -> 0x0bf2 }
            java.io.File r6 = new java.io.File     // Catch:{ Exception -> 0x0bf2 }
            r0 = r23
            r6.<init>(r1, r0)     // Catch:{ Exception -> 0x0bf2 }
            X.C64062u9.A0Q(r6)     // Catch:{ Exception -> 0x0bf2 }
            r0 = r18
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ all -> 0x0bed }
            r0[r5] = r2     // Catch:{ all -> 0x0bed }
            java.lang.String r1 = ".dump %s"
            java.lang.String r1 = java.lang.String.format(r7, r1, r0)     // Catch:{ all -> 0x0bed }
            java.lang.String r2 = r12.getAbsolutePath()     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0bed }
            int r0 = com.whatsapp.SqliteShell.executeMetaCommand(r2, r0, r1)     // Catch:{ all -> 0x0bed }
            if (r0 == 0) goto L_0x0ab3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bed }
            r2.<init>()     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = "sqlite-repair/recover-database-table/failed \""
            r2.append(r0)     // Catch:{ all -> 0x0bed }
            r2.append(r1)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = "\""
            r2.append(r0)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0bed }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0bed }
        L_0x090a:
            java.lang.String r11 = "ROLLBACK;"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bed }
            r1.<init>()     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0bed }
            r1.append(r0)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = ".tmp"
            r1.append(r0)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0bed }
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x0bed }
            r10.<init>(r0)     // Catch:{ all -> 0x0bed }
            boolean r0 = r10.exists()     // Catch:{ all -> 0x0bed }
            if (r0 == 0) goto L_0x0977
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bed }
            r1.<init>()     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file deleting "
            r1.append(r0)     // Catch:{ all -> 0x0bed }
            r1.append(r10)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0bed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0bed }
            boolean r0 = r10.delete()     // Catch:{ all -> 0x0bed }
            if (r0 != 0) goto L_0x0977
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bed }
            r1.<init>()     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file failed to delete "
            r1.append(r0)     // Catch:{ all -> 0x0bed }
            r1.append(r10)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0bed }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0bed }
        L_0x095c:
            java.lang.String r3 = r22.getAbsolutePath()     // Catch:{ all -> 0x0bed }
            java.lang.String r2 = "/dev/null"
            r0 = r18
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0bed }
            r1[r5] = r0     // Catch:{ all -> 0x0bed }
            r0 = r31
            java.lang.String r0 = java.lang.String.format(r7, r0, r1)     // Catch:{ all -> 0x0bed }
            com.whatsapp.SqliteShell.executeMetaCommand(r3, r2, r0)     // Catch:{ all -> 0x0bed }
            goto L_0x0ad6
        L_0x0977:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bed }
            r1.<init>()     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file "
            r1.append(r0)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0bed }
            r1.append(r0)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0bed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0bed }
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x0bed }
            r0.<init>(r6)     // Catch:{ all -> 0x0bed }
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1     // Catch:{ all -> 0x0bed }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0bed }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0bed }
            java.io.BufferedReader r20 = new java.io.BufferedReader     // Catch:{ all -> 0x0bed }
            r0 = r20
            r0.<init>(r1)     // Catch:{ all -> 0x0bed }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x0ae7 }
            r1.<init>(r10)     // Catch:{ all -> 0x0ae7 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0ae7 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0ae7 }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ all -> 0x0ae7 }
            r3.<init>(r0)     // Catch:{ all -> 0x0ae7 }
            java.lang.String r2 = r20.readLine()     // Catch:{ all -> 0x0add }
            r19 = 1
        L_0x09b8:
            if (r2 == 0) goto L_0x0a75
            java.lang.String r16 = r20.readLine()     // Catch:{ all -> 0x0add }
            if (r16 != 0) goto L_0x09ed
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0add }
            java.lang.String r0 = r2.toUpperCase(r0)     // Catch:{ all -> 0x0add }
            boolean r0 = r0.contains(r11)     // Catch:{ all -> 0x0add }
            if (r0 == 0) goto L_0x09ed
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0add }
            r1.<init>()     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file replacing following statement with 'commit transaction': "
            r1.append(r0)     // Catch:{ all -> 0x0add }
            r1.append(r2)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0add }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0add }
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0add }
            java.lang.String r1 = r2.toUpperCase(r0)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "COMMIT TRANSACTION;"
            java.lang.String r2 = r1.replace(r11, r0)     // Catch:{ all -> 0x0add }
        L_0x09ed:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0add }
            java.lang.String r15 = r2.toUpperCase(r0)     // Catch:{ all -> 0x0add }
            java.lang.String r1 = "\""
            java.lang.String r0 = "'"
            java.lang.String r1 = r15.replace(r1, r0)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "CREATE TABLE 'MESSAGES_FTS_"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0add }
            java.lang.String r15 = ""
            if (r0 == 0) goto L_0x0a1b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0add }
            r1.<init>()     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file creation of virtual table messages_fts will take care of this, ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x0add }
            r1.append(r2)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0add }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0add }
            r2 = r15
        L_0x0a1b:
            if (r19 == 0) goto L_0x0a43
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0add }
            java.lang.String r1 = r2.toUpperCase(r0)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "CREATE TABLE "
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0add }
            if (r0 == 0) goto L_0x0a41
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0add }
            r1.<init>()     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file transaction started, ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x0add }
            r1.append(r2)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0add }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0add }
            r2 = r15
        L_0x0a41:
            r19 = 0
        L_0x0a43:
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0add }
            java.lang.String r1 = r2.toUpperCase(r0)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "INSERT INTO SQLITE_MASTER"
            boolean r0 = r1.startsWith(r0)     // Catch:{ all -> 0x0add }
            if (r0 == 0) goto L_0x0a6f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0add }
            r1.<init>()     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file ignoring: "
            r1.append(r0)     // Catch:{ all -> 0x0add }
            r1.append(r2)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0add }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0add }
        L_0x0a66:
            r3.write(r15)     // Catch:{ all -> 0x0add }
            java.lang.String r0 = "\n"
            r3.write(r0)     // Catch:{ all -> 0x0add }
            goto L_0x0a71
        L_0x0a6f:
            r15 = r2
            goto L_0x0a66
        L_0x0a71:
            r2 = r16
            goto L_0x09b8
        L_0x0a75:
            r3.close()     // Catch:{ all -> 0x0ae7 }
            r20.close()     // Catch:{ all -> 0x0bed }
            r0 = 5
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r6.getAbsolutePath()     // Catch:{ all -> 0x0bed }
            r1[r5] = r0     // Catch:{ all -> 0x0bed }
            long r2 = r6.length()     // Catch:{ all -> 0x0bed }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0bed }
            r1[r18] = r0     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ all -> 0x0bed }
            r1[r21] = r0     // Catch:{ all -> 0x0bed }
            long r2 = r10.length()     // Catch:{ all -> 0x0bed }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0bed }
            r0 = 3
            r1[r0] = r2     // Catch:{ all -> 0x0bed }
            r0 = 4
            r1[r0] = r6     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = "sqlite-repair/cleanup-per-table-dump-file deleting %s (size %d), renaming %s (size:%d) -> %s"
            java.lang.String.format(r7, r0, r1)     // Catch:{ all -> 0x0bed }
            boolean r0 = r6.delete()     // Catch:{ all -> 0x0bed }
            if (r0 == 0) goto L_0x095c
            r10.renameTo(r6)     // Catch:{ all -> 0x0bed }
            goto L_0x095c
        L_0x0ab3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bed }
            r2.<init>()     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = "sqlite-repair/recover-database-table/success \""
            r2.append(r0)     // Catch:{ all -> 0x0bed }
            r2.append(r1)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = "\" dump size:"
            r2.append(r0)     // Catch:{ all -> 0x0bed }
            long r0 = r6.length()     // Catch:{ all -> 0x0bed }
            r2.append(r0)     // Catch:{ all -> 0x0bed }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0bed }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0bed }
            goto L_0x090a
        L_0x0ad6:
            X.C64062u9.A0Q(r6)     // Catch:{ Exception -> 0x0bf2 }
            int r8 = r8 + 1
            goto L_0x0891
        L_0x0add:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0ae2 }
            goto L_0x0ae6
        L_0x0ae2:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ all -> 0x0ae7 }
        L_0x0ae6:
            throw r0     // Catch:{ all -> 0x0ae7 }
        L_0x0ae7:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x0aec }
            goto L_0x0af0
        L_0x0aec:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0bed }
        L_0x0af0:
            throw r1     // Catch:{ all -> 0x0bed }
        L_0x0af1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bf2 }
            r1.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = "sqlite-repair/set-db-version "
            r1.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r22.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            r1.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r2 = r22.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            r1 = 0
            r0 = 536870928(0x20000010, float:1.0842042E-19)
            android.database.sqlite.SQLiteDatabase r1 = android.database.sqlite.SQLiteDatabase.openDatabase(r2, r1, r0)     // Catch:{ Exception -> 0x0bf2 }
            r0 = r18
            r1.setVersion(r0)     // Catch:{ all -> 0x0bd7 }
            r1.close()     // Catch:{ Exception -> 0x0bf2 }
            int r0 = A00(r12)     // Catch:{ Exception -> 0x0bf2 }
            long r8 = (long) r0     // Catch:{ Exception -> 0x0bf2 }
            int r0 = A00(r22)     // Catch:{ Exception -> 0x0bf2 }
            long r2 = (long) r0     // Catch:{ Exception -> 0x0bf2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bf2 }
            r0.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r1 = "sqlite-repair/check-restored-db/orig number of messages \""
            r0.append(r1)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r1 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            r0.append(r1)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r6 = "\" is "
            r0.append(r6)     // Catch:{ Exception -> 0x0bf2 }
            r0.append(r8)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bf2 }
            r1.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = "sqlite-repair/check-restored-db/restored number of messages \""
            r1.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r22.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            r1.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            r1.append(r6)     // Catch:{ Exception -> 0x0bf2 }
            r1.append(r2)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0bf2 }
            r15.<init>()     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = "sqlite-repair/check-restored-db/ratio "
            r15.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            double r6 = (double) r2     // Catch:{ Exception -> 0x0bf2 }
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r0 = r6 * r19
            double r10 = (double) r8     // Catch:{ Exception -> 0x0bf2 }
            double r0 = r0 / r10
            r15.append(r0)     // Catch:{ Exception -> 0x0bf2 }
            java.lang.String r0 = r15.toString()     // Catch:{ Exception -> 0x0bf2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0bf2 }
            A0B(r12)     // Catch:{ Exception -> 0x0bf2 }
            r22.getAbsolutePath()     // Catch:{ Exception -> 0x0bf2 }
            A0B(r22)     // Catch:{ Exception -> 0x0bf2 }
            r0 = 0
            r15 = 0
            int r1 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r1 >= 0) goto L_0x0b9e
            r1 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ Exception -> 0x0bf2 }
            r13.set(r1)     // Catch:{ Exception -> 0x0bf2 }
            goto L_0x0c10
        L_0x0b9e:
            int r1 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r1 > 0) goto L_0x0bb3
            int r1 = (r2 > r15 ? 1 : (r2 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0bb3
            r1 = 4636807660098813952(0x4059400000000000, double:101.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ Exception -> 0x0bf2 }
            r13.set(r1)     // Catch:{ Exception -> 0x0bf2 }
            goto L_0x0bb5
        L_0x0bb3:
            r8 = 0
            goto L_0x0bb6
        L_0x0bb5:
            r8 = 1
        L_0x0bb6:
            double r6 = r6 / r10
            r2 = 4599075939470750515(0x3fd3333333333333, double:0.3)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 < 0) goto L_0x0bc1
            goto L_0x0bc4
        L_0x0bc1:
            if (r8 == 0) goto L_0x0c10
            goto L_0x0bcd
        L_0x0bc4:
            double r6 = r6 * r19
            java.lang.Double r1 = java.lang.Double.valueOf(r6)     // Catch:{ Exception -> 0x0bf2 }
            r13.set(r1)     // Catch:{ Exception -> 0x0bf2 }
        L_0x0bcd:
            r1 = r22
            boolean r1 = r1.renameTo(r12)     // Catch:{ Exception -> 0x0bf2 }
            if (r1 == 0) goto L_0x0c10
            r0 = 1
            goto L_0x0c10
        L_0x0bd7:
            r0 = move-exception
            if (r1 == 0) goto L_0x0bf1
            r1.close()     // Catch:{ all -> 0x0be3 }
            goto L_0x0bf1
        L_0x0bde:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0be3 }
            goto L_0x0bf1
        L_0x0be3:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r0, r1)     // Catch:{ Exception -> 0x0bf2 }
            goto L_0x0bf1
        L_0x0be8:
            r0 = move-exception
            X.C64062u9.A0Q(r10)     // Catch:{ Exception -> 0x0bf2 }
            goto L_0x0bf1
        L_0x0bed:
            r0 = move-exception
            X.C64062u9.A0Q(r6)     // Catch:{ Exception -> 0x0bf2 }
        L_0x0bf1:
            throw r0     // Catch:{ Exception -> 0x0bf2 }
        L_0x0bf2:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Error while restoring dbFile "
            r1.append(r0)
            java.lang.String r0 = r12.getAbsolutePath()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0c0c
        L_0x0c09:
            r2 = move-exception
            java.lang.String r0 = "libsqlite is not present on device, cannot perform dump and restore."
        L_0x0c0c:
            com.whatsapp.util.Log.e(r0, r2)
        L_0x0c0f:
            r0 = 0
        L_0x0c10:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = "MessageStoreBackup/restore/dumpAndRestoreResult/"
            r2.append(r1)
            r2.append(r0)
            java.lang.String r1 = " recovery %age: "
            r2.append(r1)
            r2.append(r13)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r4.A07 = r1
            java.lang.Object r1 = r13.get()
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r4.A0F = r1
            if (r0 != 0) goto L_0x0c46
            goto L_0x037f
        L_0x0c46:
            r35.A06()
            r0 = r35
            X.1Cm r12 = r0.A02
            monitor-enter(r12)
            X.2dt r10 = X.C22601Cm.A00(r12)     // Catch:{ all -> 0x1dbf }
            boolean r0 = r10.A02     // Catch:{ all -> 0x1dbf }
            if (r0 != 0) goto L_0x0d7c
            boolean r0 = r10.A01     // Catch:{ all -> 0x1dbf }
            if (r0 != 0) goto L_0x0d7c
            X.1Ev r0 = r12.A00     // Catch:{ all -> 0x1dbf }
            if (r0 == 0) goto L_0x0d7c
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x1dbf }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x1dbf }
            if (r0 == 0) goto L_0x0d7c
            X.1Ev r0 = r12.A00     // Catch:{ Exception -> 0x0d58 }
            X.C22601Cm.A04(r0)     // Catch:{ Exception -> 0x0d58 }
            X.1Ev r0 = r12.A00     // Catch:{ Exception -> 0x0d58 }
            X.2cR r11 = new X.2cR     // Catch:{ Exception -> 0x0d58 }
            r11.<init>(r0)     // Catch:{ Exception -> 0x0d58 }
            X.0vl r0 = r11.A01     // Catch:{ Exception -> 0x0d58 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x0d58 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x0d58 }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ Exception -> 0x0d58 }
        L_0x0c7e:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x0d58 }
            if (r0 == 0) goto L_0x0d50
            java.lang.Object r0 = r16.next()     // Catch:{ Exception -> 0x0d58 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ Exception -> 0x0d58 }
            java.lang.Object r9 = r0.first     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0d58 }
            java.lang.Object r1 = r0.second     // Catch:{ Exception -> 0x0d58 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x0d58 }
            X.C18070vi.A0d(r9, r5)     // Catch:{ Exception -> 0x0d58 }
            r0 = r18
            X.C18070vi.A0d(r1, r0)     // Catch:{ Exception -> 0x0d58 }
            X.1Ev r8 = r11.A00     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C28331Zy.A00(r8, r0, r9)     // Catch:{ Exception -> 0x0d58 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0d58 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x0d58 }
            if (r0 == 0) goto L_0x0c7e
            java.lang.String r0 = ", "
            r7 = 0
            java.lang.String r6 = ""
            java.lang.String r3 = X.C29431cG.A0g(r0, r6, r6, r1, r7)     // Catch:{ Exception -> 0x0d58 }
            r0 = 10
            int r0 = X.C29351c6.A0C(r1, r0)     // Catch:{ Exception -> 0x0d58 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Exception -> 0x0d58 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0d58 }
            java.util.Iterator r15 = r1.iterator()     // Catch:{ Exception -> 0x0d58 }
        L_0x0cc4:
            boolean r0 = r15.hasNext()     // Catch:{ Exception -> 0x0d58 }
            if (r0 == 0) goto L_0x0cf2
            java.lang.Object r13 = r15.next()     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Exception -> 0x0d58 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d58 }
            r1.<init>()     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = " (source."
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r13)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = " = groups."
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r13)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = ") "
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0d58 }
            r2.add(r0)     // Catch:{ Exception -> 0x0d58 }
            goto L_0x0cc4
        L_0x0cf2:
            java.lang.String r0 = " AND "
            java.lang.String r2 = X.C29431cG.A0g(r0, r6, r6, r2, r7)     // Catch:{ Exception -> 0x0d58 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d58 }
            r1.<init>()     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = "\n         DELETE FROM "
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r9)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = " \n         WHERE rowid IN \n         (\n            SELECT source.rowid\n            FROM "
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r9)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = " AS source\n            JOIN \n            ( SELECT rowid, "
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r3)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = "\n              FROM "
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r9)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = "\n              GROUP BY "
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r3)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = "\n              HAVING COUNT(*) > 1\n            ) as groups\n           ON "
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r2)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = " \n           AND (source.rowid <> groups.rowid)\n         )\n       "
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r2 = X.AnonymousClass1Y7.A01(r0)     // Catch:{ Exception -> 0x0d58 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0d58 }
            r1.<init>()     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = "DuplicatesRemover\\removeDuplicates\\"
            r1.append(r0)     // Catch:{ Exception -> 0x0d58 }
            r1.append(r9)     // Catch:{ Exception -> 0x0d58 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0d58 }
            r8.A0E(r2, r0)     // Catch:{ Exception -> 0x0d58 }
            goto L_0x0c7e
        L_0x0d50:
            r12.close()     // Catch:{ Exception -> 0x0d58 }
            X.2dt r10 = X.C22601Cm.A00(r12)     // Catch:{ Exception -> 0x0d58 }
            goto L_0x0d7c
        L_0x0d58:
            r6 = move-exception
            java.lang.String r0 = "DatabaseHelper/verifyBackup - duplicates remover error."
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x1dbf }
            X.190 r3 = r12.A04     // Catch:{ all -> 0x1dbf }
            java.lang.String r2 = "MessagesDBHelper/backupRestoreFailed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x1dbf }
            r1.<init>()     // Catch:{ all -> 0x1dbf }
            java.lang.String r0 = "DatabaseHelper/verifyBackup/removeDuplicates: "
            r1.append(r0)     // Catch:{ all -> 0x1dbf }
            java.lang.String r0 = r6.getMessage()     // Catch:{ all -> 0x1dbf }
            r1.append(r0)     // Catch:{ all -> 0x1dbf }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x1dbf }
            r1 = r18
            r3.A0G(r2, r0, r1)     // Catch:{ all -> 0x1dbf }
        L_0x0d7c:
            r12.close()     // Catch:{ all -> 0x1dc4 }
            monitor-exit(r12)
            boolean r0 = r10.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A09 = r0
            long r0 = r10.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0K = r0
            boolean r0 = r10.A02
            r2 = 1
            if (r0 != 0) goto L_0x0da6
            goto L_0x037f
        L_0x0d97:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackup/restore/error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = r1.toString()
            r4.A0M = r0
            r2 = 3
            goto L_0x0da6
        L_0x0da5:
            r2 = 5
        L_0x0da6:
            r22 = 1000(0x3e8, double:4.94E-321)
            if (r24 == 0) goto L_0x1c0f
            r0 = r18
            if (r2 != r0) goto L_0x1c0f
            int r0 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            if (r0 <= 0) goto L_0x1bfc
            java.lang.String r1 = "MessageStoreBackup/restore/increments"
            X.1Ez r43 = new X.1Ez     // Catch:{ Exception -> 0x1c02 }
            r0 = r43
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x1c02 }
            int r20 = r79 - r25
            java.lang.String r44 = "MessageStoreBackup/failed to restore increment number: "
            int r0 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            java.lang.Boolean r40 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x1c02 }
            if (r0 <= 0) goto L_0x0dd2
            int r0 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            int r20 = r20 / r0
            goto L_0x0dd4
        L_0x0dd2:
            r20 = 0
        L_0x0dd4:
            java.util.Iterator r36 = r46.iterator()     // Catch:{ all -> 0x1bc4 }
            r0 = 1
        L_0x0dda:
            boolean r2 = r36.hasNext()     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1b7a
            java.lang.Object r3 = r36.next()     // Catch:{ all -> 0x1bc2 }
            java.io.File r3 = (java.io.File) r3     // Catch:{ all -> 0x1bc2 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x1bc2 }
            r6.<init>()     // Catch:{ all -> 0x1bc2 }
            java.lang.String r2 = "MessageStoreBackup allotment for increment: "
            r6.append(r2)     // Catch:{ all -> 0x1bc2 }
            java.lang.String r2 = r3.getName()     // Catch:{ all -> 0x1bc2 }
            r6.append(r2)     // Catch:{ all -> 0x1bc2 }
            java.lang.String r2 = " is "
            r6.append(r2)     // Catch:{ all -> 0x1bc2 }
            r2 = r20
            r6.append(r2)     // Catch:{ all -> 0x1bc2 }
            r2 = r45
            r6.append(r2)     // Catch:{ all -> 0x1bc2 }
            r2 = r25
            r6.append(r2)     // Catch:{ all -> 0x1bc2 }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x1bc2 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1bc2 }
            X.00H r2 = r14.A0Y     // Catch:{ all -> 0x1bc2 }
            java.lang.Object r6 = r2.get()     // Catch:{ all -> 0x1bc2 }
            X.9mv r6 = (X.C191639mv) r6     // Catch:{ all -> 0x1bc2 }
            X.00H r2 = r14.A0X     // Catch:{ all -> 0x1bc2 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x1bc2 }
            X.A0e r2 = (X.C19947A0e) r2     // Catch:{ all -> 0x1bc2 }
            r7 = r24
            X.A5N r6 = r6.A00(r2, r7, r3, r5)     // Catch:{ all -> 0x1bc2 }
            X.17y r2 = r14.A0Q     // Catch:{ IOException -> 0x1ad4 }
            java.lang.String r3 = r3.getName()     // Catch:{ IOException -> 0x1ad4 }
            java.io.File r3 = r2.A00(r3)     // Catch:{ IOException -> 0x1ad4 }
            X.118 r2 = r14.A0A     // Catch:{ IOException -> 0x1ad4 }
            r19 = 5
            r8 = r61
            r7 = r2
            r9 = r3
            r10 = r25
            r11 = r20
            r12 = r18
            X.9jz r7 = r6.A07(r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x1ad2 }
            java.lang.String r2 = r7.A01     // Catch:{ IOException -> 0x1ad2 }
            if (r2 == 0) goto L_0x0e4f
            java.util.Set r6 = r14.A0f     // Catch:{ IOException -> 0x1ad2 }
            java.lang.String r2 = r7.A01     // Catch:{ IOException -> 0x1ad2 }
            r6.add(r2)     // Catch:{ IOException -> 0x1ad2 }
        L_0x0e4f:
            int r2 = r7.A00     // Catch:{ IOException -> 0x1ad2 }
            r38 = r2
            if (r2 == r12) goto L_0x0e57
            goto L_0x195b
        L_0x0e57:
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/success"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ IOException -> 0x1ad0 }
            X.1Wa r2 = r14.A05     // Catch:{ IOException -> 0x1ad0 }
            r71 = r2
            android.os.CancellationSignal r35 = new android.os.CancellationSignal     // Catch:{ IOException -> 0x1ad0 }
            r35.<init>()     // Catch:{ IOException -> 0x1ad0 }
            boolean r2 = r3.exists()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x12d4
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ IOException -> 0x1a58 }
            r8.<init>(r3)     // Catch:{ IOException -> 0x1a58 }
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x1a4e }
            r7.<init>(r8)     // Catch:{ all -> 0x1a4e }
            r2 = 131072(0x20000, float:1.83671E-40)
            byte[] r6 = new byte[r2]     // Catch:{ all -> 0x1a44 }
            java.util.zip.ZipEntry r9 = r7.getNextEntry()     // Catch:{ all -> 0x1a44 }
        L_0x0e7d:
            if (r9 == 0) goto L_0x0ead
            r35.throwIfCanceled()     // Catch:{ all -> 0x1a44 }
            r2 = r71
            X.00H r2 = r2.A03     // Catch:{ all -> 0x1a44 }
            java.lang.Object r3 = r2.get()     // Catch:{ all -> 0x1a44 }
            X.9pW r3 = (X.C193089pW) r3     // Catch:{ all -> 0x1a44 }
            java.lang.String r2 = r9.getName()     // Catch:{ all -> 0x1a44 }
            java.io.File r2 = r3.A00(r2)     // Catch:{ all -> 0x1a44 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x1a44 }
            r3.<init>(r2)     // Catch:{ all -> 0x1a44 }
            r2 = r71
            X.00H r2 = r2.A05     // Catch:{ all -> 0x1a17 }
            r2.get()     // Catch:{ all -> 0x1a17 }
            r2 = r35
            X.C20048A4r.A01(r2, r7, r3, r6)     // Catch:{ all -> 0x1a17 }
            r3.close()     // Catch:{ all -> 0x1a44 }
            java.util.zip.ZipEntry r9 = r7.getNextEntry()     // Catch:{ all -> 0x1a44 }
            goto L_0x0e7d
        L_0x0ead:
            r7.close()     // Catch:{ all -> 0x1a4e }
            r8.close()     // Catch:{ IOException -> 0x1a58 }
            r2 = r71
            X.00H r2 = r2.A03     // Catch:{ all -> 0x1ab4 }
            r70 = r2
            java.lang.Object r3 = r70.get()     // Catch:{ all -> 0x1ab4 }
            X.9pW r3 = (X.C193089pW) r3     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "header.json"
            java.io.File r2 = r3.A01(r2)     // Catch:{ all -> 0x1ab4 }
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x12cb, JSONException -> 0x12c2 }
            r9.<init>(r2)     // Catch:{ IOException -> 0x12cb, JSONException -> 0x12c2 }
            org.json.JSONObject r7 = X.AnonymousClass1EY.A01(r9)     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "header"
            org.json.JSONObject r6 = r7.getJSONObject(r2)     // Catch:{ all -> 0x12b8 }
            X.2go r34 = new X.2go     // Catch:{ all -> 0x12b8 }
            r34.<init>()     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "creation_date"
            long r2 = r6.getLong(r2)     // Catch:{ all -> 0x12b8 }
            r8 = r34
            r8.A00 = r2     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "os"
            java.lang.String r3 = r6.getString(r2)     // Catch:{ all -> 0x12b8 }
            r8.A06 = r3     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "os_version"
            java.lang.String r3 = r6.getString(r2)     // Catch:{ all -> 0x12b8 }
            r8.A07 = r3     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "app_name"
            java.lang.String r3 = r6.getString(r2)     // Catch:{ all -> 0x12b8 }
            r8.A03 = r3     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "app_version"
            java.lang.String r3 = r6.getString(r2)     // Catch:{ all -> 0x12b8 }
            r8.A04 = r3     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "format_version"
            java.lang.String r3 = r6.getString(r2)     // Catch:{ all -> 0x12b8 }
            r8.A05 = r3     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "added_messages"
            boolean r3 = r7.has(r2)     // Catch:{ all -> 0x12b8 }
            if (r3 == 0) goto L_0x0f86
            org.json.JSONObject r8 = r7.getJSONObject(r2)     // Catch:{ all -> 0x12b8 }
            X.2fz r6 = new X.2fz     // Catch:{ all -> 0x12b8 }
            r6.<init>()     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "filename"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x12b8 }
            r6.A03 = r2     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "format"
            java.lang.String r2 = r8.getString(r2)     // Catch:{ all -> 0x12b8 }
            r6.A04 = r2     // Catch:{ all -> 0x12b8 }
            java.lang.String r10 = "messages_count_on_backup"
            r2 = 0
            long r2 = r8.optLong(r10, r2)     // Catch:{ all -> 0x12b8 }
            r6.A00 = r2     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "messages_updated"
            r10 = 0
            int r2 = r8.optInt(r2, r5)     // Catch:{ all -> 0x12b8 }
            long r2 = (long) r2     // Catch:{ all -> 0x12b8 }
            r6.A02 = r2     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "messages_deleted"
            int r2 = r8.optInt(r2, r5)     // Catch:{ all -> 0x12b8 }
            long r2 = (long) r2     // Catch:{ all -> 0x12b8 }
            r6.A01 = r2     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "chunks"
            boolean r3 = r8.has(r2)     // Catch:{ all -> 0x12b8 }
            if (r3 == 0) goto L_0x0f82
            org.json.JSONArray r12 = r8.getJSONArray(r2)     // Catch:{ all -> 0x12b8 }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x12b8 }
            r11.<init>()     // Catch:{ all -> 0x12b8 }
        L_0x0f5a:
            int r2 = r12.length()     // Catch:{ all -> 0x12b8 }
            if (r10 >= r2) goto L_0x0f80
            org.json.JSONObject r3 = r12.getJSONObject(r10)     // Catch:{ all -> 0x12b8 }
            X.2bp r8 = new X.2bp     // Catch:{ all -> 0x12b8 }
            r8.<init>()     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "chunk_number"
            int r2 = r3.getInt(r2)     // Catch:{ all -> 0x12b8 }
            r8.A00 = r2     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "messages_count"
            int r2 = r3.getInt(r2)     // Catch:{ all -> 0x12b8 }
            long r2 = (long) r2     // Catch:{ all -> 0x12b8 }
            r8.A01 = r2     // Catch:{ all -> 0x12b8 }
            r11.add(r8)     // Catch:{ all -> 0x12b8 }
            int r10 = r10 + 1
            goto L_0x0f5a
        L_0x0f80:
            r6.A05 = r11     // Catch:{ all -> 0x12b8 }
        L_0x0f82:
            r2 = r34
            r2.A02 = r6     // Catch:{ all -> 0x12b8 }
        L_0x0f86:
            java.lang.String r2 = "deleted_messages"
            boolean r3 = r7.has(r2)     // Catch:{ all -> 0x12b8 }
            if (r3 == 0) goto L_0x0fc7
            org.json.JSONObject r3 = r7.getJSONObject(r2)     // Catch:{ all -> 0x12b8 }
            X.2ZX r11 = new X.2ZX     // Catch:{ all -> 0x12b8 }
            r11.<init>()     // Catch:{ all -> 0x12b8 }
            java.lang.String r2 = "deleted_message_ids_files"
            boolean r6 = r3.has(r2)     // Catch:{ all -> 0x12b8 }
            if (r6 == 0) goto L_0x0fc3
            org.json.JSONArray r10 = r3.getJSONArray(r2)     // Catch:{ all -> 0x12b8 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x12b8 }
            r8.<init>()     // Catch:{ all -> 0x12b8 }
            if (r10 == 0) goto L_0x0fbe
            int r6 = r10.length()     // Catch:{ all -> 0x12b8 }
            r3 = 0
        L_0x0faf:
            if (r3 >= r6) goto L_0x0fbe
            java.lang.String r2 = r10.getString(r3)     // Catch:{ all -> 0x12b8 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x12b8 }
            r8.add(r2)     // Catch:{ all -> 0x12b8 }
            int r3 = r3 + 1
            goto L_0x0faf
        L_0x0fbe:
            java.util.List r2 = r11.A00     // Catch:{ all -> 0x12b8 }
            r2.addAll(r8)     // Catch:{ all -> 0x12b8 }
        L_0x0fc3:
            r2 = r34
            r2.A01 = r11     // Catch:{ all -> 0x12b8 }
        L_0x0fc7:
            java.lang.String r2 = "entities"
            boolean r3 = r7.has(r2)     // Catch:{ all -> 0x12b8 }
            if (r3 == 0) goto L_0x1002
            org.json.JSONObject r11 = r7.getJSONObject(r2)     // Catch:{ all -> 0x12b8 }
            org.json.JSONArray r10 = r11.names()     // Catch:{ all -> 0x12b8 }
            if (r10 == 0) goto L_0x1002
            int r2 = r10.length()     // Catch:{ all -> 0x12b8 }
            if (r2 <= 0) goto L_0x1002
            r8 = 0
        L_0x0fe0:
            int r2 = r10.length()     // Catch:{ all -> 0x12b8 }
            if (r8 >= r2) goto L_0x1002
            java.lang.String r6 = r10.getString(r8)     // Catch:{ all -> 0x12b8 }
            X.2Bx r2 = new X.2Bx     // Catch:{ all -> 0x12b8 }
            r2.<init>(r6)     // Catch:{ all -> 0x12b8 }
            java.util.ArrayList r2 = r2.A00(r11)     // Catch:{ all -> 0x12b8 }
            X.16Z r3 = new X.16Z     // Catch:{ all -> 0x12b8 }
            r3.<init>(r6, r2)     // Catch:{ all -> 0x12b8 }
            r2 = r34
            java.util.Map r2 = r2.A09     // Catch:{ all -> 0x12b8 }
            r2.put(r6, r3)     // Catch:{ all -> 0x12b8 }
            int r8 = r8 + 1
            goto L_0x0fe0
        L_0x1002:
            java.lang.String r31 = "sequences"
            r2 = r31
            boolean r2 = r7.has(r2)     // Catch:{ all -> 0x12b8 }
            if (r2 == 0) goto L_0x1017
            r2 = r31
            java.lang.String r3 = r7.getString(r2)     // Catch:{ all -> 0x12b8 }
            r2 = r34
            r2.A08 = r3     // Catch:{ all -> 0x12b8 }
        L_0x1017:
            r9.close()     // Catch:{ IOException -> 0x12cb, JSONException -> 0x12c2 }
            r2 = r71
            X.00H r2 = r2.A04     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r7 = r2.get()     // Catch:{ all -> 0x1ab4 }
            X.2gn r7 = (X.C56032gn) r7     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r8 = r70.get()     // Catch:{ all -> 0x1ab4 }
            X.9pW r8 = (X.C193089pW) r8     // Catch:{ all -> 0x1ab4 }
            X.2fy r6 = r7.A02     // Catch:{ all -> 0x1ab4 }
            r2 = 0
            r6.A04 = r2     // Catch:{ all -> 0x1ab4 }
            r6.A02 = r2     // Catch:{ all -> 0x1ab4 }
            r6.A05 = r2     // Catch:{ all -> 0x1ab4 }
            r6.A03 = r2     // Catch:{ all -> 0x1ab4 }
            r6.A00 = r2     // Catch:{ all -> 0x1ab4 }
            r6.A01 = r2     // Catch:{ all -> 0x1ab4 }
            X.2Bv r3 = new X.2Bv     // Catch:{ all -> 0x1ab4 }
            r3.<init>(r7)     // Catch:{ all -> 0x1ab4 }
            r2 = r34
            X.2ZX r2 = r2.A01     // Catch:{ all -> 0x1ab4 }
            java.util.List r2 = r2.A00     // Catch:{ all -> 0x1ab4 }
            java.util.List r9 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x1ab4 }
            r2 = r35
            r3.A00(r2, r8, r9)     // Catch:{ all -> 0x1ab4 }
            X.2tR r2 = r7.A01     // Catch:{ all -> 0x1ab4 }
            r64 = r2
            X.1Cd r2 = r2.A00     // Catch:{ all -> 0x1ab4 }
            r63 = r2
            X.1au r10 = r63.A05()     // Catch:{ all -> 0x1ab4 }
            r2 = r10
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x1a3f }
            X.1Ev r9 = r2.A02     // Catch:{ all -> 0x1a3f }
            java.lang.String r3 = "DELETE FROM message WHERE _id IN (SELECT table_row_id FROM backup_changes WHERE ((table_name = 'message') AND (operation = 'DELETE')))"
            java.lang.String r2 = "BackupChangesStore/DELETE_MARKED_MESSAGES"
            r9.A0E(r3, r2)     // Catch:{ all -> 0x1a3f }
            r10.close()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r57 = "Failed to parse serialized messages file."
            java.lang.String r56 = "IncrementalBackup/MessagesImporter/Failed to parse serialized messages file."
            r2 = r34
            X.2fz r2 = r2.A02     // Catch:{ all -> 0x1ab4 }
            r62 = r2
            java.lang.String r2 = r2.A03     // Catch:{ all -> 0x1ab4 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x109e
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/There are no message file to import."
        L_0x107d:
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
        L_0x1080:
            r2 = r34
            X.2fz r2 = r2.A02     // Catch:{ all -> 0x1ab4 }
            java.util.List r2 = r2.A05     // Catch:{ all -> 0x1ab4 }
            int r2 = r2.size()     // Catch:{ all -> 0x1ab4 }
            r41 = 0
            if (r2 <= 0) goto L_0x1571
            long r8 = r64.A03()     // Catch:{ all -> 0x1ab4 }
            r2 = r34
            X.2fz r2 = r2.A02     // Catch:{ all -> 0x1ab4 }
            long r2 = r2.A00     // Catch:{ all -> 0x1ab4 }
            int r10 = (r2 > r41 ? 1 : (r2 == r41 ? 0 : -1))
            if (r10 <= 0) goto L_0x1571
            goto L_0x12b2
        L_0x109e:
            java.lang.String r3 = "protobuf"
            r2 = r62
            java.lang.String r2 = r2.A04     // Catch:{ all -> 0x1ab4 }
            boolean r2 = r3.equalsIgnoreCase(r2)     // Catch:{ all -> 0x1ab4 }
            if (r2 != 0) goto L_0x10ad
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Messages file is not in expected protobuf format, skip importing messages."
            goto L_0x107d
        L_0x10ad:
            r2 = r62
            java.util.List r2 = r2.A05     // Catch:{ all -> 0x1ab4 }
            int r2 = r2.size()     // Catch:{ all -> 0x1ab4 }
            if (r2 != 0) goto L_0x10bd
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Messages chunks are not specified."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            goto L_0x1080
        L_0x10bd:
            r2 = r62
            java.lang.String r2 = r2.A03     // Catch:{ all -> 0x1ab4 }
            java.io.File r3 = r8.A01(r2)     // Catch:{ all -> 0x1ab4 }
            java.io.FileInputStream r55 = new java.io.FileInputStream     // Catch:{ all -> 0x1ab4 }
            r2 = r55
            r2.<init>(r3)     // Catch:{ all -> 0x1ab4 }
            r54 = 0
        L_0x10ce:
            r2 = r62
            java.util.List r2 = r2.A05     // Catch:{ all -> 0x1a3a }
            int r3 = r2.size()     // Catch:{ all -> 0x1a3a }
            r2 = r54
            if (r2 >= r3) goto L_0x12ad
            X.8cQ r3 = X.C166148cQ.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x1a2c }
            r2 = r55
            X.Bm6 r11 = X.C23577Bm6.A04(r3, r2)     // Catch:{ IOException -> 0x1a2c }
            X.8cQ r11 = (X.C166148cQ) r11     // Catch:{ IOException -> 0x1a2c }
            if (r11 == 0) goto L_0x1a21
            r53 = 0
        L_0x10e8:
            X.EE9 r2 = r11.conversations_     // Catch:{ all -> 0x1a3a }
            int r3 = r2.size()     // Catch:{ all -> 0x1a3a }
            r2 = r53
            if (r2 >= r3) goto L_0x12a9
            X.EE9 r3 = r11.conversations_     // Catch:{ all -> 0x1a3a }
            java.lang.Object r8 = r3.get(r2)     // Catch:{ all -> 0x1a3a }
            X.8cf r8 = (X.C166298cf) r8     // Catch:{ all -> 0x1a3a }
            java.lang.String r3 = r8.id_     // Catch:{ all -> 0x1a3a }
            X.1Dv r2 = X.AnonymousClass1BI.A00     // Catch:{ all -> 0x1a3a }
            X.1BI r2 = r2.A02(r3)     // Catch:{ all -> 0x1a3a }
            if (r2 == 0) goto L_0x12a5
            X.EE9 r2 = r8.messages_     // Catch:{ all -> 0x1a3a }
            java.util.Iterator r52 = r2.iterator()     // Catch:{ all -> 0x1a3a }
        L_0x110a:
            boolean r2 = r52.hasNext()     // Catch:{ all -> 0x1a3a }
            if (r2 == 0) goto L_0x12a5
            java.lang.Object r10 = r52.next()     // Catch:{ all -> 0x1a3a }
            X.8Zr r10 = (X.C164658Zr) r10     // Catch:{ all -> 0x1a3a }
            r35.throwIfCanceled()     // Catch:{ all -> 0x1a3a }
            if (r10 != 0) goto L_0x1121
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Conversation message is null."
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1a3a }
            goto L_0x110a
        L_0x1121:
            X.8co r9 = r10.message_     // Catch:{ all -> 0x1a3a }
            if (r9 != 0) goto L_0x1127
            X.8co r9 = X.C166388co.DEFAULT_INSTANCE     // Catch:{ all -> 0x1a3a }
        L_0x1127:
            java.lang.Integer r2 = X.AnonymousClass00R.A0C     // Catch:{ Exception -> 0x1260 }
            X.9pU r3 = new X.9pU     // Catch:{ Exception -> 0x1260 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x1260 }
            X.00H r2 = r7.A09     // Catch:{ Exception -> 0x1260 }
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x1260 }
            X.9p6 r2 = (X.C192859p6) r2     // Catch:{ Exception -> 0x1260 }
            X.206 r8 = r2.A01(r3, r9)     // Catch:{ Exception -> 0x1260 }
            int r2 = r10.bitField0_     // Catch:{ all -> 0x1a3a }
            r2 = r2 & 2
            if (r2 == 0) goto L_0x1144
            long r2 = r10.msgOrderId_     // Catch:{ all -> 0x1a3a }
            r8.A0x = r2     // Catch:{ all -> 0x1a3a }
        L_0x1144:
            X.8co r9 = r10.message_     // Catch:{ all -> 0x1a3a }
            if (r9 != 0) goto L_0x114a
            X.8co r9 = X.C166388co.DEFAULT_INSTANCE     // Catch:{ all -> 0x1a3a }
        L_0x114a:
            java.lang.String r42 = "incremental-backup-msg-importer-insert-failed"
            int r2 = r8.A05     // Catch:{ Exception -> 0x1240 }
            if (r2 <= 0) goto L_0x1157
            X.1Qz r10 = r7.A06     // Catch:{ Exception -> 0x1240 }
            long r2 = r8.A0I     // Catch:{ Exception -> 0x1240 }
            r10.A05(r8, r2)     // Catch:{ Exception -> 0x1240 }
        L_0x1157:
            r2 = 16777216(0x1000000, double:8.289046E-317)
            boolean r2 = r8.A11(r2)     // Catch:{ Exception -> 0x1240 }
            if (r2 == 0) goto L_0x1165
            X.1ln r2 = r7.A03     // Catch:{ Exception -> 0x1240 }
            r2.CBs(r9, r8)     // Catch:{ Exception -> 0x1240 }
        L_0x1165:
            X.00H r2 = r7.A08     // Catch:{ Exception -> 0x1240 }
            r60 = r2
            java.lang.Object r2 = r60.get()     // Catch:{ Exception -> 0x1240 }
            X.1W6 r2 = (X.AnonymousClass1W6) r2     // Catch:{ Exception -> 0x1240 }
            X.205 r10 = r8.A0v     // Catch:{ Exception -> 0x1240 }
            X.1W2 r2 = r2.A01     // Catch:{ Exception -> 0x1240 }
            X.206 r9 = r2.A05(r10)     // Catch:{ Exception -> 0x1240 }
            r50 = 1
            if (r9 == 0) goto L_0x11e9
            long r2 = r9.A0x     // Catch:{ Exception -> 0x1240 }
            r8.A0x = r2     // Catch:{ Exception -> 0x1240 }
            long r2 = r9.A0y     // Catch:{ Exception -> 0x1240 }
            r8.A0y = r2     // Catch:{ Exception -> 0x1240 }
            int r3 = r9.A0E()     // Catch:{ Exception -> 0x1240 }
            r41 = 1
            r2 = r18
            if (r3 != r2) goto L_0x1196
            X.122 r3 = r7.A05     // Catch:{ Exception -> 0x1240 }
            java.util.Set r2 = java.util.Collections.singleton(r9)     // Catch:{ Exception -> 0x1240 }
            r3.A0V(r2, r5)     // Catch:{ Exception -> 0x1240 }
        L_0x1196:
            long r2 = r8.A0x     // Catch:{ Exception -> 0x1240 }
            r58 = r2
            X.1au r16 = r63.A05()     // Catch:{ Exception -> 0x1240 }
            r2 = r16
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x11df }
            X.1Ev r2 = r2.A02     // Catch:{ all -> 0x11df }
            r13 = r2
            java.lang.String r12 = "message"
            java.lang.String r3 = "_id = ?"
            r2 = r18
            java.lang.String[] r15 = new java.lang.String[r2]     // Catch:{ all -> 0x11df }
            java.lang.String r2 = java.lang.String.valueOf(r58)     // Catch:{ all -> 0x11df }
            r15[r5] = r2     // Catch:{ all -> 0x11df }
            java.lang.String r2 = "BackupChangesStore/DELETE_CONFLICTING_MESSAGE"
            r13.A04(r12, r3, r2, r15)     // Catch:{ all -> 0x11df }
            r16.close()     // Catch:{ Exception -> 0x1240 }
            X.1Q8 r2 = r7.A04     // Catch:{ Exception -> 0x1240 }
            r2.A01(r10)     // Catch:{ Exception -> 0x1240 }
            java.lang.Object r2 = r60.get()     // Catch:{ Exception -> 0x1240 }
            X.1W6 r2 = (X.AnonymousClass1W6) r2     // Catch:{ Exception -> 0x1240 }
            X.1W2 r2 = r2.A01     // Catch:{ Exception -> 0x1240 }
            X.206 r2 = r2.A05(r10)     // Catch:{ Exception -> 0x1240 }
            if (r2 == 0) goto L_0x11eb
            long r2 = r6.A03     // Catch:{ Exception -> 0x1240 }
            long r2 = r2 + r50
            r6.A03 = r2     // Catch:{ Exception -> 0x1240 }
            X.190 r8 = r7.A00     // Catch:{ Exception -> 0x1240 }
            java.lang.String r3 = "incremental-backup-msg-importer-update-failed"
            java.lang.String r2 = "Failed to delete old fMessage."
            r8.A0G(r3, r2, r5)     // Catch:{ Exception -> 0x1240 }
            goto L_0x110a
        L_0x11df:
            r3 = move-exception
            r16.close()     // Catch:{ all -> 0x11e4 }
            goto L_0x11e8
        L_0x11e4:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ Exception -> 0x1240 }
        L_0x11e8:
            throw r3     // Catch:{ Exception -> 0x1240 }
        L_0x11e9:
            r41 = 0
        L_0x11eb:
            java.lang.Object r2 = r60.get()     // Catch:{ all -> 0x122f }
            X.1W6 r2 = (X.AnonymousClass1W6) r2     // Catch:{ all -> 0x122f }
            r2.A04(r8)     // Catch:{ all -> 0x122f }
            X.1WM r2 = r7.A07     // Catch:{ all -> 0x122f }
            r2.A0I(r8)     // Catch:{ all -> 0x122f }
            X.1Q8 r2 = r7.A04     // Catch:{ Exception -> 0x1240 }
            r2.A01(r10)     // Catch:{ Exception -> 0x1240 }
            java.lang.Object r2 = r60.get()     // Catch:{ Exception -> 0x1240 }
            X.1W6 r2 = (X.AnonymousClass1W6) r2     // Catch:{ Exception -> 0x1240 }
            X.1W2 r2 = r2.A01     // Catch:{ Exception -> 0x1240 }
            X.206 r2 = r2.A05(r10)     // Catch:{ Exception -> 0x1240 }
            if (r2 != 0) goto L_0x121d
            long r2 = r6.A02     // Catch:{ Exception -> 0x1240 }
            long r2 = r2 + r50
            r6.A02 = r2     // Catch:{ Exception -> 0x1240 }
            X.190 r8 = r7.A00     // Catch:{ Exception -> 0x1240 }
            java.lang.String r3 = "Failed to insert new fMessage."
            r2 = r42
            r8.A0G(r2, r3, r5)     // Catch:{ Exception -> 0x1240 }
            goto L_0x110a
        L_0x121d:
            if (r41 == 0) goto L_0x1227
            long r2 = r6.A05     // Catch:{ Exception -> 0x1240 }
            long r2 = r2 + r50
            r6.A05 = r2     // Catch:{ Exception -> 0x1240 }
            goto L_0x110a
        L_0x1227:
            long r2 = r6.A04     // Catch:{ Exception -> 0x1240 }
            long r2 = r2 + r50
            r6.A04 = r2     // Catch:{ Exception -> 0x1240 }
            goto L_0x110a
        L_0x122f:
            r8 = move-exception
            if (r9 == 0) goto L_0x1239
            long r2 = r6.A03     // Catch:{ Exception -> 0x1240 }
            long r2 = r2 + r50
            r6.A03 = r2     // Catch:{ Exception -> 0x1240 }
            goto L_0x123f
        L_0x1239:
            long r2 = r6.A02     // Catch:{ Exception -> 0x1240 }
            long r2 = r2 + r50
            r6.A02 = r2     // Catch:{ Exception -> 0x1240 }
        L_0x123f:
            throw r8     // Catch:{ Exception -> 0x1240 }
        L_0x1240:
            r9 = move-exception
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Failed to insert fMessage."
            com.whatsapp.util.Log.e(r2, r9)     // Catch:{ all -> 0x1a3a }
            X.190 r8 = r7.A00     // Catch:{ all -> 0x1a3a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1a3a }
            r3.<init>()     // Catch:{ all -> 0x1a3a }
            java.lang.String r2 = "Failed to insert fMessage: "
            r3.append(r2)     // Catch:{ all -> 0x1a3a }
            r3.append(r9)     // Catch:{ all -> 0x1a3a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x1a3a }
            r2 = r42
            r8.A0E(r2, r3, r9)     // Catch:{ all -> 0x1a3a }
            goto L_0x110a
        L_0x1260:
            r10 = move-exception
            java.lang.String r3 = "Failed to parse message from WMI."
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x1a3a }
            r2 = 4
            java.lang.Object[] r3 = X.AnonymousClass000.A1b(r3, r2)     // Catch:{ all -> 0x1a3a }
            X.8cq r2 = r9.key_     // Catch:{ all -> 0x1a3a }
            if (r2 != 0) goto L_0x1270
            X.8cq r2 = X.C166408cq.DEFAULT_INSTANCE     // Catch:{ all -> 0x1a3a }
        L_0x1270:
            java.lang.String r2 = r2.id_     // Catch:{ all -> 0x1a3a }
            r3[r18] = r2     // Catch:{ all -> 0x1a3a }
            X.9Ke r2 = r9.A0R()     // Catch:{ all -> 0x1a3a }
            r3[r21] = r2     // Catch:{ all -> 0x1a3a }
            X.EE9 r2 = r9.messageStubParameters_     // Catch:{ all -> 0x1a3a }
            int r2 = r2.size()     // Catch:{ all -> 0x1a3a }
            X.C17890vO.A1G(r3, r2)     // Catch:{ all -> 0x1a3a }
            java.lang.String r2 = "%s; key=%s, stub_type=%s, params=%d"
            java.lang.String r2 = java.lang.String.format(r8, r2, r3)     // Catch:{ all -> 0x1a3a }
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x1a3a }
            java.lang.String r3 = "IncrementalBackup/MessagesImporter/"
            X.C17900vP.A0h(r3, r2, r8, r10)     // Catch:{ all -> 0x1a3a }
            java.lang.String r9 = "incremental-backup-importer-parsing-failed"
            X.190 r8 = r7.A00     // Catch:{ all -> 0x1a3a }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r2)     // Catch:{ all -> 0x1a3a }
            java.lang.String r2 = "; ex="
            java.lang.String r2 = X.AnonymousClass001.A1E(r10, r2, r3)     // Catch:{ all -> 0x1a3a }
            r8.A0E(r9, r2, r10)     // Catch:{ all -> 0x1a3a }
            goto L_0x110a
        L_0x12a5:
            int r53 = r53 + 1
            goto L_0x10e8
        L_0x12a9:
            int r54 = r54 + 1
            goto L_0x10ce
        L_0x12ad:
            r55.close()     // Catch:{ all -> 0x1ab4 }
            goto L_0x1080
        L_0x12b2:
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x1571
            goto L_0x153d
        L_0x12b8:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x12bd }
            goto L_0x12c1
        L_0x12bd:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ IOException -> 0x12cb, JSONException -> 0x12c2 }
        L_0x12c1:
            throw r2     // Catch:{ IOException -> 0x12cb, JSONException -> 0x12c2 }
        L_0x12c2:
            r5 = move-exception
            java.lang.String r3 = "Unable to process header JSON file."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x1ab4 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x1ab4 }
            goto L_0x132e
        L_0x12cb:
            r5 = move-exception
            java.lang.String r3 = "Unable to locate header metadata file in messages archive."
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x1ab4 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x1ab4 }
            goto L_0x132e
        L_0x12d4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r5.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "Unable to locate input data file '"
            r5.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r3.getAbsolutePath()     // Catch:{ all -> 0x1ab4 }
            r5.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "'."
            r5.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x1ab4 }
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException     // Catch:{ all -> 0x1ab4 }
            r2.<init>(r3)     // Catch:{ all -> 0x1ab4 }
            goto L_0x132e
        L_0x12f4:
            r2 = r41
            boolean r2 = X.C63632tR.A02(r2, r12, r13)     // Catch:{ all -> 0x1ab4 }
            if (r2 != 0) goto L_0x1345
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r3.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "BackupChangesStore/Error while inserting values into table '"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "'. Unsupported type '"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.Class r2 = r12.getClass()     // Catch:{ all -> 0x1ab4 }
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "' for field '"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r13)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x1ab4 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x1ab4 }
            r2.<init>(r3)     // Catch:{ all -> 0x1ab4 }
        L_0x132e:
            throw r2     // Catch:{ all -> 0x1ab4 }
        L_0x132f:
            r16.close()     // Catch:{ all -> 0x1ab4 }
            int r12 = r6.size()     // Catch:{ all -> 0x1ab4 }
            android.content.ContentValues r41 = new android.content.ContentValues     // Catch:{ all -> 0x1ab4 }
            r2 = r41
            r2.<init>(r12)     // Catch:{ all -> 0x1ab4 }
            java.util.Set r2 = r6.entrySet()     // Catch:{ all -> 0x1ab4 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ all -> 0x1ab4 }
        L_0x1345:
            boolean r2 = r16.hasNext()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x1395
            java.lang.Object r2 = r16.next()     // Catch:{ all -> 0x1ab4 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r13 = r2.getKey()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r12 = r2.getValue()     // Catch:{ all -> 0x1ab4 }
            boolean r2 = r13.equalsIgnoreCase(r10)     // Catch:{ all -> 0x1ab4 }
            if (r2 != 0) goto L_0x1345
            boolean r2 = r13.equalsIgnoreCase(r3)     // Catch:{ all -> 0x1ab4 }
            if (r2 != 0) goto L_0x1345
            r2 = r42
            java.lang.Object r15 = r2.get(r13)     // Catch:{ all -> 0x1ab4 }
            if (r15 != 0) goto L_0x1372
            if (r12 != 0) goto L_0x12f4
            goto L_0x1345
        L_0x1372:
            if (r12 == 0) goto L_0x12f4
            boolean r2 = r15 instanceof byte[]     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x1386
            boolean r2 = r12 instanceof byte[]     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x1386
            byte[] r15 = (byte[]) r15     // Catch:{ all -> 0x1ab4 }
            r2 = r12
            byte[] r2 = (byte[]) r2     // Catch:{ all -> 0x1ab4 }
            boolean r2 = java.util.Arrays.equals(r15, r2)     // Catch:{ all -> 0x1ab4 }
            goto L_0x1392
        L_0x1386:
            java.lang.String r2 = r15.toString()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r15 = r12.toString()     // Catch:{ all -> 0x1ab4 }
            boolean r2 = r2.equals(r15)     // Catch:{ all -> 0x1ab4 }
        L_0x1392:
            if (r2 == 0) goto L_0x12f4
            goto L_0x1345
        L_0x1395:
            int r2 = r41.size()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x1419
            X.1au r16 = r69.A05()     // Catch:{ all -> 0x1ab4 }
            r2 = r16
            X.1av r2 = (X.C28801av) r2     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            X.1Ev r12 = r2.A02     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            r13.<init>()     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            r13.append(r3)     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            r2 = r50
            r13.append(r2)     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            java.lang.String r65 = r13.toString()     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            r2 = r18
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            java.lang.String r13 = r51.toString()     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            r2[r5] = r13     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            java.lang.String r66 = "BackupChangesStore/INCREMENTAL_BACKUP_UPDATE_ROW"
            r62 = r12
            r63 = r41
            r64 = r8
            r67 = r2
            r68 = r19
            int r2 = r62.A03(r63, r64, r65, r66, r67, r68)     // Catch:{ SQLiteConstraintException -> 0x13d6 }
            if (r2 <= 0) goto L_0x14bf
            r16.close()     // Catch:{ all -> 0x1ab4 }
            goto L_0x1419
        L_0x13d6:
            r13 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x1a78 }
            r12.<init>()     // Catch:{ all -> 0x1a78 }
            java.lang.String r2 = "BackupChangesStore/Partial update error, table = "
            r12.append(r2)     // Catch:{ all -> 0x1a78 }
            r12.append(r8)     // Catch:{ all -> 0x1a78 }
            java.lang.String r2 = ", pkField = "
            r12.append(r2)     // Catch:{ all -> 0x1a78 }
            r12.append(r3)     // Catch:{ all -> 0x1a78 }
            java.lang.String r2 = ", pkValue = "
            r12.append(r2)     // Catch:{ all -> 0x1a78 }
            r2 = r51
            r12.append(r2)     // Catch:{ all -> 0x1a78 }
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x1a78 }
            com.whatsapp.util.Log.e(r2, r13)     // Catch:{ all -> 0x1a78 }
            goto L_0x14bf
        L_0x13ff:
            int r2 = r54.size()     // Catch:{ all -> 0x1ab4 }
            if (r7 >= r2) goto L_0x1714
            int r3 = r54.size()     // Catch:{ all -> 0x1ab4 }
            int r2 = r7 + 100
            int r3 = java.lang.Math.min(r3, r2)     // Catch:{ all -> 0x1ab4 }
            r2 = r54
            java.util.List r53 = r2.subList(r7, r3)     // Catch:{ all -> 0x1ab4 }
            java.util.Iterator r52 = r53.iterator()     // Catch:{ all -> 0x1ab4 }
        L_0x1419:
            boolean r2 = r52.hasNext()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x1536
            java.lang.Object r6 = r52.next()     // Catch:{ all -> 0x1ab4 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x1ab4 }
            X.2tR r2 = r11.A00     // Catch:{ all -> 0x1ab4 }
            r3 = r57
            java.lang.Object r12 = r6.get(r10)     // Catch:{ all -> 0x1ab4 }
            if (r12 == 0) goto L_0x1a98
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x1ab4 }
            X.1Cd r2 = r2.A00     // Catch:{ all -> 0x1ab4 }
            r69 = r2
            X.1at r41 = r69.get()     // Catch:{ all -> 0x1ab4 }
            r2 = r41
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x1a89 }
            X.1Ev r2 = r2.A02     // Catch:{ all -> 0x1a89 }
            r42 = r2
            java.lang.String r15 = "SELECT table_row_id FROM backup_changes WHERE (operation = 'DELETE') AND (table_name = ?) AND (table_row_id = ?) LIMIT 1"
            r2 = r21
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ all -> 0x1a89 }
            r16 = 0
            r13[r5] = r8     // Catch:{ all -> 0x1a89 }
            r13[r18] = r12     // Catch:{ all -> 0x1a89 }
            java.lang.String r12 = "BackupChangesStore/SELECT_SINGLE_DELETED_ID"
            r2 = r42
            android.database.Cursor r12 = r2.A0A(r15, r12, r13)     // Catch:{ all -> 0x1a89 }
            int r2 = r12.getCount()     // Catch:{ all -> 0x1a7d }
            if (r2 <= 0) goto L_0x145f
            r16 = 1
        L_0x145f:
            r12.close()     // Catch:{ all -> 0x1a89 }
            r41.close()     // Catch:{ all -> 0x1ab4 }
            if (r16 != 0) goto L_0x1419
            if (r57 != 0) goto L_0x146a
            r3 = r10
        L_0x146a:
            java.lang.Object r51 = r6.get(r3)     // Catch:{ all -> 0x1ab4 }
            if (r51 == 0) goto L_0x17ab
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r12.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "SELECT *  FROM "
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            r12.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = " WHERE "
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            r12.append(r3)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r50 = " = ?"
            r2 = r50
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r41 = r12.toString()     // Catch:{ all -> 0x1ab4 }
            X.1at r16 = r69.get()     // Catch:{ all -> 0x1ab4 }
            r2 = r16
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x1a78 }
            X.1Ev r15 = r2.A02     // Catch:{ all -> 0x1a78 }
            r2 = r18
            java.lang.String[] r13 = new java.lang.String[r2]     // Catch:{ all -> 0x1a78 }
            java.lang.String r2 = r51.toString()     // Catch:{ all -> 0x1a78 }
            r13[r5] = r2     // Catch:{ all -> 0x1a78 }
            java.lang.String r12 = "BackupChangesStore/INCREMENTAL_BACKUP_QUERY_ROW_BEFORE_UPDATE"
            r2 = r41
            android.database.Cursor r12 = r15.A0A(r2, r12, r13)     // Catch:{ all -> 0x1a78 }
            java.lang.String[] r2 = r12.getColumnNames()     // Catch:{ all -> 0x1a6c }
            boolean r13 = r12.moveToNext()     // Catch:{ all -> 0x1a6c }
            if (r13 == 0) goto L_0x14bc
            java.util.HashMap r42 = X.C63632tR.A01(r12, r2)     // Catch:{ all -> 0x1a6c }
            goto L_0x17a6
        L_0x14bc:
            r12.close()     // Catch:{ all -> 0x1a78 }
        L_0x14bf:
            r16.close()     // Catch:{ all -> 0x1ab4 }
            X.1au r41 = r69.A05()     // Catch:{ all -> 0x1ab4 }
            int r2 = r6.size()     // Catch:{ all -> 0x1a89 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x1a89 }
            r12.<init>(r2)     // Catch:{ all -> 0x1a89 }
            java.util.Set r2 = r6.entrySet()     // Catch:{ all -> 0x1a89 }
            java.util.Iterator r13 = r2.iterator()     // Catch:{ all -> 0x1a89 }
        L_0x14d7:
            boolean r2 = r13.hasNext()     // Catch:{ all -> 0x1a89 }
            if (r2 == 0) goto L_0x1526
            java.lang.Object r2 = r13.next()     // Catch:{ all -> 0x1a89 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x1a89 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ all -> 0x1a89 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x1a89 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x1a89 }
            boolean r6 = X.C63632tR.A02(r12, r2, r3)     // Catch:{ all -> 0x1a89 }
            if (r6 != 0) goto L_0x14d7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x1a89 }
            r6.<init>()     // Catch:{ all -> 0x1a89 }
            java.lang.String r5 = "BackupChangesStore/Error while inserting values into table '"
            r6.append(r5)     // Catch:{ all -> 0x1a89 }
            r6.append(r8)     // Catch:{ all -> 0x1a89 }
            java.lang.String r5 = "'. Unsupported type '"
            r6.append(r5)     // Catch:{ all -> 0x1a89 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x1a89 }
            r6.append(r2)     // Catch:{ all -> 0x1a89 }
            java.lang.String r2 = "' for field '"
            r6.append(r2)     // Catch:{ all -> 0x1a89 }
            r6.append(r3)     // Catch:{ all -> 0x1a89 }
            java.lang.String r2 = "'"
            r6.append(r2)     // Catch:{ all -> 0x1a89 }
            java.lang.String r3 = r6.toString()     // Catch:{ all -> 0x1a89 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x1a89 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x1a89 }
            r2.<init>(r3)     // Catch:{ all -> 0x1a89 }
            throw r2     // Catch:{ all -> 0x1a89 }
        L_0x1526:
            r2 = r41
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x1a89 }
            X.1Ev r3 = r2.A02     // Catch:{ all -> 0x1a89 }
            java.lang.String r2 = "BackupChangesStore/INCREMENTAL_BACKUP_INSERT_ROW"
            r3.A05(r8, r2, r12)     // Catch:{ all -> 0x1a89 }
            r41.close()     // Catch:{ all -> 0x1ab4 }
            goto L_0x1419
        L_0x1536:
            int r2 = r53.size()     // Catch:{ all -> 0x1ab4 }
            int r7 = r7 + r2
            goto L_0x13ff
        L_0x153d:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r11.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r10 = "Expected: "
            r11.append(r10)     // Catch:{ all -> 0x1ab4 }
            r11.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = " Actual: "
            r11.append(r2)     // Catch:{ all -> 0x1ab4 }
            r11.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x1ab4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r3.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Number of messages restored doesn't match to number of messages before backup. "
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            X.190 r3 = r7.A00     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "incremental-backup-importer-count-mismatch"
            r3.A0G(r2, r8, r5)     // Catch:{ all -> 0x1ab4 }
        L_0x1571:
            long r2 = r6.A02     // Catch:{ all -> 0x1ab4 }
            int r8 = (r2 > r41 ? 1 : (r2 == r41 ? 0 : -1))
            if (r8 > 0) goto L_0x1583
            long r8 = r6.A03     // Catch:{ all -> 0x1ab4 }
            int r10 = (r8 > r41 ? 1 : (r8 == r41 ? 0 : -1))
            if (r10 > 0) goto L_0x1583
            long r8 = r6.A01     // Catch:{ all -> 0x1ab4 }
            int r10 = (r8 > r41 ? 1 : (r8 == r41 ? 0 : -1))
            if (r10 <= 0) goto L_0x15c3
        L_0x1583:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r8.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r9 = "failedToInsertMessages: "
            r8.append(r9)     // Catch:{ all -> 0x1ab4 }
            r8.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = ", failedToUpdateMessages: "
            r8.append(r2)     // Catch:{ all -> 0x1ab4 }
            long r2 = r6.A03     // Catch:{ all -> 0x1ab4 }
            r8.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = ", failedToDeleteMessages: "
            r8.append(r2)     // Catch:{ all -> 0x1ab4 }
            long r2 = r6.A01     // Catch:{ all -> 0x1ab4 }
            r8.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x1ab4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r3.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Total number of errors during messages restore: "
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            X.190 r3 = r7.A00     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "incremental-backup-importer-import-issues"
            r3.A0G(r2, r8, r5)     // Catch:{ all -> 0x1ab4 }
        L_0x15c3:
            r2 = r34
            X.2fz r2 = r2.A02     // Catch:{ all -> 0x1ab4 }
            long r2 = r2.A02     // Catch:{ all -> 0x1ab4 }
            int r8 = (r2 > r41 ? 1 : (r2 == r41 ? 0 : -1))
            if (r8 <= 0) goto L_0x1645
            long r15 = r6.A04     // Catch:{ all -> 0x1ab4 }
            long r10 = r6.A05     // Catch:{ all -> 0x1ab4 }
            long r8 = r15 + r10
            int r12 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r12 == 0) goto L_0x1645
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r12.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r13 = "IncrementalBackup/MessagesImporter/Number of messages restored doesn't match to number of messages in backup. Archive contains "
            r12.append(r13)     // Catch:{ all -> 0x1ab4 }
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = " messages, but the number of restored messages is "
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            r12.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = ". \nDetailed stats: \nNumber of messages inserted: "
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            r2 = r15
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "\nNumber of messages updated: "
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            r12.append(r10)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r12.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            X.190 r13 = r7.A00     // Catch:{ all -> 0x1ab4 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r12.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "Archive msg:"
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            r2 = r34
            X.2fz r2 = r2.A02     // Catch:{ all -> 0x1ab4 }
            long r2 = r2.A02     // Catch:{ all -> 0x1ab4 }
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = ", restored:"
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            long r8 = r6.A04     // Catch:{ all -> 0x1ab4 }
            long r2 = r6.A05     // Catch:{ all -> 0x1ab4 }
            long r10 = r8 + r2
            r12.append(r10)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r10 = "(inserted:"
            r12.append(r10)     // Catch:{ all -> 0x1ab4 }
            r12.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r8 = ", updated:"
            r12.append(r8)     // Catch:{ all -> 0x1ab4 }
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = ")"
            r12.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r3 = r12.toString()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "incremental-backup-importer-import-mismatch"
            r13.A0G(r2, r3, r5)     // Catch:{ all -> 0x1ab4 }
        L_0x1645:
            r2 = r34
            X.2fz r2 = r2.A02     // Catch:{ all -> 0x1ab4 }
            long r2 = r2.A01     // Catch:{ all -> 0x1ab4 }
            int r8 = (r2 > r41 ? 1 : (r2 == r41 ? 0 : -1))
            if (r8 <= 0) goto L_0x1698
            long r8 = r6.A00     // Catch:{ all -> 0x1ab4 }
            int r10 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r10 == 0) goto L_0x1698
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r10.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r11 = "Archive contain "
            r10.append(r11)     // Catch:{ all -> 0x1ab4 }
            r10.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = " messages to be deleted, but there number of deleted messages is "
            r10.append(r2)     // Catch:{ all -> 0x1ab4 }
            r10.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = ", failed to delete "
            r10.append(r2)     // Catch:{ all -> 0x1ab4 }
            long r2 = r6.A01     // Catch:{ all -> 0x1ab4 }
            r10.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = " messages."
            r10.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x1ab4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r3.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "IncrementalBackup/MessagesImporter/Number of deleted messages  doesn't match to number of deleted messages in backup. "
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r6)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            X.190 r3 = r7.A00     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "incremental-backup-importer-import-delete-mismatch"
            r3.A0G(r2, r6, r5)     // Catch:{ all -> 0x1ab4 }
        L_0x1698:
            r64.A07()     // Catch:{ all -> 0x1ab4 }
            r2 = r34
            java.util.Map r2 = r2.A09     // Catch:{ all -> 0x1ab4 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x1ab4 }
            java.util.Iterator r60 = r2.iterator()     // Catch:{ all -> 0x1ab4 }
        L_0x16a7:
            boolean r2 = r60.hasNext()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x180a
            java.lang.Object r2 = r60.next()     // Catch:{ all -> 0x1ab4 }
            X.16Z r2 = (X.AnonymousClass16Z) r2     // Catch:{ all -> 0x1ab4 }
            java.util.List r2 = r2.A01     // Catch:{ all -> 0x1ab4 }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x1ab4 }
            java.util.Iterator r59 = r2.iterator()     // Catch:{ all -> 0x1ab4 }
        L_0x16bd:
            boolean r2 = r59.hasNext()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x16a7
            java.lang.Object r9 = r59.next()     // Catch:{ all -> 0x1ab4 }
            X.2q3 r9 = (X.C61662q3) r9     // Catch:{ all -> 0x1ab4 }
            r2 = r71
            X.00H r2 = r2.A01     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r11 = r2.get()     // Catch:{ all -> 0x1ab4 }
            X.2ZV r11 = (X.AnonymousClass2ZV) r11     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r58 = r70.get()     // Catch:{ all -> 0x1ab4 }
            r2 = r58
            X.9pW r2 = (X.C193089pW) r2     // Catch:{ all -> 0x1ab4 }
            r58 = r2
            java.lang.String r8 = r9.A03     // Catch:{ all -> 0x1ab4 }
            java.lang.String r10 = r9.A02     // Catch:{ all -> 0x1ab4 }
            java.util.List r2 = r9.A04     // Catch:{ all -> 0x1ab4 }
            java.util.List r7 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x1ab4 }
            int r2 = r7.size()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x16f9
            X.2Bw r6 = new X.2Bw     // Catch:{ all -> 0x1ab4 }
            r6.<init>(r11, r8, r10)     // Catch:{ all -> 0x1ab4 }
            r3 = r35
            r2 = r58
            r6.A00(r3, r2, r7)     // Catch:{ all -> 0x1ab4 }
        L_0x16f9:
            java.lang.String r2 = r9.A01     // Catch:{ all -> 0x1ab4 }
            r57 = r2
            java.util.List r2 = r9.A05     // Catch:{ all -> 0x1ab4 }
            java.util.List r3 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x1ab4 }
            int r2 = r3.size()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x176b
            X.2C0 r56 = new X.2C0     // Catch:{ all -> 0x1ab4 }
            r2 = r56
            r2.<init>(r8)     // Catch:{ all -> 0x1ab4 }
            java.util.Iterator r55 = r3.iterator()     // Catch:{ all -> 0x1ab4 }
        L_0x1714:
            boolean r2 = r55.hasNext()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x176b
            java.lang.Object r12 = r55.next()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x1ab4 }
            boolean r2 = r35.isCanceled()     // Catch:{ all -> 0x1ab4 }
            if (r2 != 0) goto L_0x176b
            r2 = r58
            java.io.File r2 = r2.A01(r12)     // Catch:{ all -> 0x1ab4 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r7 = "EntityTableProcessor/Failed to parse input file '"
            if (r3 != 0) goto L_0x174c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r2.<init>()     // Catch:{ all -> 0x1ab4 }
            r2.append(r7)     // Catch:{ all -> 0x1ab4 }
            r2.append(r12)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r3 = "'. File doesn't exist."
            r2.append(r3)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            goto L_0x1714
        L_0x174c:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ JSONException -> 0x17d2 }
            r6.<init>(r2)     // Catch:{ JSONException -> 0x17d2 }
            org.json.JSONObject r3 = X.AnonymousClass1EY.A01(r6)     // Catch:{ all -> 0x17c8 }
            r2 = r56
            java.util.ArrayList r54 = r2.A00(r3)     // Catch:{ all -> 0x17c8 }
            r6.close()     // Catch:{ JSONException -> 0x17d2 }
            int r2 = r54.size()     // Catch:{ all -> 0x1ab4 }
            if (r2 <= 0) goto L_0x1714
            boolean r2 = r35.isCanceled()     // Catch:{ all -> 0x1ab4 }
            if (r2 != 0) goto L_0x1714
            goto L_0x17a3
        L_0x176b:
            X.2tR r2 = r11.A00     // Catch:{ all -> 0x1ab4 }
            long r6 = r2.A04(r8, r10)     // Catch:{ all -> 0x1ab4 }
            long r2 = r9.A00     // Catch:{ all -> 0x1ab4 }
            r10 = 0
            int r9 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x16bd
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 == 0) goto L_0x16bd
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r10.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r9 = "EntityTableProcessor/Number of entities ("
            r10.append(r9)     // Catch:{ all -> 0x1ab4 }
            r10.append(r8)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r8 = ") restored doesn't match to number of entities before backup. Expected: "
            r10.append(r8)     // Catch:{ all -> 0x1ab4 }
            r10.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "; Actual: "
            r10.append(r2)     // Catch:{ all -> 0x1ab4 }
            r10.append(r6)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            goto L_0x16bd
        L_0x17a3:
            r7 = 0
            goto L_0x13ff
        L_0x17a6:
            r12.close()     // Catch:{ all -> 0x1a78 }
            goto L_0x132f
        L_0x17ab:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r5.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "BackupChangesStore/Unspecified value for PK field '"
            r5.append(r2)     // Catch:{ all -> 0x1ab4 }
            r5.append(r3)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "'"
            r5.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x1ab4 }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x1ab4 }
            r2.<init>(r3)     // Catch:{ all -> 0x1ab4 }
            goto L_0x132e
        L_0x17c8:
            r2 = move-exception
            r6.close()     // Catch:{ all -> 0x17cd }
            goto L_0x17d1
        L_0x17cd:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ JSONException -> 0x17d2 }
        L_0x17d1:
            throw r2     // Catch:{ JSONException -> 0x17d2 }
        L_0x17d2:
            r3 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r2.<init>()     // Catch:{ all -> 0x1ab4 }
            r2.append(r7)     // Catch:{ all -> 0x1ab4 }
            r2.append(r12)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r5 = "'.\n"
            r2.append(r5)     // Catch:{ all -> 0x1ab4 }
            r2.append(r3)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r5.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "Failed to parse input file '"
            r5.append(r2)     // Catch:{ all -> 0x1ab4 }
            r5.append(r12)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "'."
            r5.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x1ab4 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x1ab4 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x1ab4 }
            goto L_0x132e
        L_0x180a:
            r2 = r71
            X.00H r2 = r2.A06     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r12 = r2.get()     // Catch:{ all -> 0x1ab4 }
            X.2pE r12 = (X.C61162pE) r12     // Catch:{ all -> 0x1ab4 }
            r2 = r34
            java.lang.String r7 = r2.A08     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r3 = r70.get()     // Catch:{ all -> 0x1ab4 }
            X.9pW r3 = (X.C193089pW) r3     // Catch:{ all -> 0x1ab4 }
            if (r7 == 0) goto L_0x193e
            X.2C0 r6 = new X.2C0     // Catch:{ all -> 0x1ab4 }
            r2 = r31
            r6.<init>(r2)     // Catch:{ all -> 0x1ab4 }
            boolean r2 = r35.isCanceled()     // Catch:{ all -> 0x1ab4 }
            if (r2 != 0) goto L_0x193e
            java.io.File r2 = r3.A01(r7)     // Catch:{ all -> 0x1ab4 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ JSONException -> 0x184c }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x184c }
            org.json.JSONObject r2 = X.AnonymousClass1EY.A01(r3)     // Catch:{ all -> 0x1842 }
            java.util.ArrayList r2 = r6.A00(r2)     // Catch:{ all -> 0x1842 }
            r3.close()     // Catch:{ JSONException -> 0x184c }
            goto L_0x1886
        L_0x1842:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x1847 }
            goto L_0x184b
        L_0x1847:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ JSONException -> 0x184c }
        L_0x184b:
            throw r2     // Catch:{ JSONException -> 0x184c }
        L_0x184c:
            r5 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r3.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "SequencesHandler/Failed to parse input file '"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r7)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "'.\n"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r5)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1ab4 }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r3.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "Failed to parse input file '"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r7)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "'."
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x1ab4 }
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x1ab4 }
            r2.<init>(r3, r5)     // Catch:{ all -> 0x1ab4 }
            goto L_0x132e
        L_0x1886:
            java.util.HashMap r13 = X.C61162pE.A00(r12)     // Catch:{ all -> 0x1ab4 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ all -> 0x1ab4 }
        L_0x188e:
            boolean r2 = r16.hasNext()     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x193e
            java.lang.Object r3 = r16.next()     // Catch:{ all -> 0x1ab4 }
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ all -> 0x1ab4 }
            java.lang.String r11 = "name"
            java.lang.Object r10 = r3.get(r11)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "value"
            java.lang.Object r3 = r3.get(r2)     // Catch:{ all -> 0x1ab4 }
            boolean r2 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x1ab4 }
            r7 = 0
            if (r2 == 0) goto L_0x18b7
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x1ab4 }
            int r2 = r3.intValue()     // Catch:{ all -> 0x1ab4 }
            long r2 = (long) r2     // Catch:{ all -> 0x1ab4 }
            goto L_0x18c4
        L_0x18b7:
            boolean r2 = r3 instanceof java.lang.Long     // Catch:{ all -> 0x1ab4 }
            if (r2 == 0) goto L_0x18c2
            java.lang.Long r3 = (java.lang.Long) r3     // Catch:{ all -> 0x1ab4 }
            long r2 = r3.longValue()     // Catch:{ all -> 0x1ab4 }
            goto L_0x18c4
        L_0x18c2:
            r2 = 0
        L_0x18c4:
            if (r10 == 0) goto L_0x188e
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x188e
            java.lang.Object r6 = r13.get(r10)     // Catch:{ all -> 0x1ab4 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x1ab4 }
            if (r6 == 0) goto L_0x18da
            long r7 = r6.longValue()     // Catch:{ all -> 0x1ab4 }
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x188e
        L_0x18da:
            X.1Cd r6 = r12.A00     // Catch:{ all -> 0x1ab4 }
            X.1au r15 = r6.A05()     // Catch:{ all -> 0x1ab4 }
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x1a8e }
            r9.<init>()     // Catch:{ all -> 0x1a8e }
            java.lang.String r7 = "seq"
            java.lang.Long r6 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x1a8e }
            r9.put(r7, r6)     // Catch:{ all -> 0x1a8e }
            r6 = r15
            X.1av r6 = (X.C28801av) r6     // Catch:{ all -> 0x1a8e }
            X.1Ev r8 = r6.A02     // Catch:{ all -> 0x1a8e }
            java.lang.String r7 = "SQLITE_SEQUENCE"
            java.lang.String r53 = "name = ?"
            r6 = r18
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x1a8e }
            r6[r5] = r10     // Catch:{ all -> 0x1a8e }
            java.lang.String r54 = "SequencesHandler/UPDATE_SEQUENCE"
            r50 = r8
            r51 = r9
            r52 = r7
            r55 = r6
            int r6 = r50.A02(r51, r52, r53, r54, r55)     // Catch:{ all -> 0x1a8e }
            if (r6 > 0) goto L_0x1939
            r9.put(r11, r10)     // Catch:{ all -> 0x1a8e }
            java.lang.String r6 = "SequencesHandler/INSERT_SEQUENCE"
            long r9 = r8.A05(r7, r6, r9)     // Catch:{ all -> 0x1a8e }
            r7 = 0
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 >= 0) goto L_0x1939
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x1a8e }
            r7.<init>()     // Catch:{ all -> 0x1a8e }
            java.lang.String r6 = "SequencesHandler/Failed to update / insert sequence with name = '"
            r7.append(r6)     // Catch:{ all -> 0x1a8e }
            r7.append(r2)     // Catch:{ all -> 0x1a8e }
            java.lang.String r6 = "' and value = "
            r7.append(r6)     // Catch:{ all -> 0x1a8e }
            r7.append(r2)     // Catch:{ all -> 0x1a8e }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x1a8e }
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ all -> 0x1a8e }
        L_0x1939:
            r15.close()     // Catch:{ all -> 0x1ab4 }
            goto L_0x188e
        L_0x193e:
            r2 = r71
            X.00H r2 = r2.A00     // Catch:{ IOException -> 0x1ad0 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x1ad0 }
            X.2tR r2 = (X.C63632tR) r2     // Catch:{ IOException -> 0x1ad0 }
            r2.A07()     // Catch:{ IOException -> 0x1ad0 }
            java.lang.Object r2 = r70.get()     // Catch:{ IOException -> 0x1ad0 }
            X.9pW r2 = (X.C193089pW) r2     // Catch:{ IOException -> 0x1ad0 }
            r2.A02()     // Catch:{ IOException -> 0x1ad0 }
            int r25 = r25 + r20
            r2 = 1
            long r0 = r0 + r2
            goto L_0x0dda
        L_0x195b:
            r3 = r21
            if (r2 == r3) goto L_0x19d0
            r3 = 4
            if (r2 == r3) goto L_0x1985
            r3 = r19
            if (r2 != r3) goto L_0x196c
            java.lang.String r2 = "Increment Backup prefix is null"
            r4.A0M = r2     // Catch:{ IOException -> 0x1ad0 }
            goto L_0x1b2a
        L_0x196c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x1ad0 }
            r3.<init>()     // Catch:{ IOException -> 0x1ad0 }
            java.lang.String r2 = "Unexpected integrity check result "
            r3.append(r2)     // Catch:{ IOException -> 0x1ad0 }
            r2 = r38
            r3.append(r2)     // Catch:{ IOException -> 0x1ad0 }
            java.lang.String r3 = r3.toString()     // Catch:{ IOException -> 0x1ad0 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x1ad0 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x1ad0 }
            throw r2     // Catch:{ IOException -> 0x1ad0 }
        L_0x1985:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r18)     // Catch:{ IOException -> 0x1ad0 }
            r4.A03 = r2     // Catch:{ IOException -> 0x1ad0 }
            r2 = r40
            r4.A02 = r2     // Catch:{ IOException -> 0x1ad0 }
            java.lang.String r2 = "Increment JID mismatch"
            r4.A0M = r2     // Catch:{ IOException -> 0x1ad0 }
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/failed_jid_mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ IOException -> 0x1ad0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x1c02 }
            r4.A0A = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1c02 }
            r4.A0I = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x19cc
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x1c02 }
            r4.A0H = r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1c02 }
            r3.<init>()     // Catch:{ Exception -> 0x1c02 }
            r2 = r44
            r3.append(r2)     // Catch:{ Exception -> 0x1c02 }
            r3.append(r0)     // Catch:{ Exception -> 0x1c02 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x1c02 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x1c02 }
        L_0x19cc:
            r19 = 4
            goto L_0x1bb0
        L_0x19d0:
            r2 = r40
            r4.A03 = r2     // Catch:{ IOException -> 0x1ad0 }
            r4.A02 = r2     // Catch:{ IOException -> 0x1ad0 }
            java.lang.String r2 = "Increment Integrity Check failed"
            r4.A0M = r2     // Catch:{ IOException -> 0x1ad0 }
            java.lang.String r2 = "MessageStoreBackup/restore/file-integrity-check/failed"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ IOException -> 0x1ad0 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x1c02 }
            r4.A0A = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1c02 }
            r4.A0I = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x1a13
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x1c02 }
            r4.A0H = r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1c02 }
            r3.<init>()     // Catch:{ Exception -> 0x1c02 }
            r2 = r44
            r3.append(r2)     // Catch:{ Exception -> 0x1c02 }
            r3.append(r0)     // Catch:{ Exception -> 0x1c02 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x1c02 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x1c02 }
        L_0x1a13:
            r19 = 2
            goto L_0x1bb0
        L_0x1a17:
            r2 = move-exception
            r3.close()     // Catch:{ all -> 0x1a1c }
            goto L_0x1a20
        L_0x1a1c:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ all -> 0x1a44 }
        L_0x1a20:
            throw r2     // Catch:{ all -> 0x1a44 }
        L_0x1a21:
            com.whatsapp.util.Log.e((java.lang.String) r56)     // Catch:{ all -> 0x1a3a }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x1a3a }
            r2 = r57
            r3.<init>(r2)     // Catch:{ all -> 0x1a3a }
            goto L_0x1a39
        L_0x1a2c:
            r5 = move-exception
            r2 = r56
            com.whatsapp.util.Log.e(r2, r5)     // Catch:{ all -> 0x1a3a }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x1a3a }
            r2 = r57
            r3.<init>(r2, r5)     // Catch:{ all -> 0x1a3a }
        L_0x1a39:
            throw r3     // Catch:{ all -> 0x1a3a }
        L_0x1a3a:
            r3 = move-exception
            r55.close()     // Catch:{ all -> 0x1a93 }
            goto L_0x1ab3
        L_0x1a3f:
            r3 = move-exception
            r10.close()     // Catch:{ all -> 0x1a93 }
            goto L_0x1ab3
        L_0x1a44:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x1a49 }
            goto L_0x1a4d
        L_0x1a49:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ all -> 0x1a4e }
        L_0x1a4d:
            throw r2     // Catch:{ all -> 0x1a4e }
        L_0x1a4e:
            r2 = move-exception
            r8.close()     // Catch:{ all -> 0x1a53 }
            goto L_0x1a57
        L_0x1a53:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ IOException -> 0x1a58 }
        L_0x1a57:
            throw r2     // Catch:{ IOException -> 0x1a58 }
        L_0x1a58:
            r3 = move-exception
            java.lang.String r2 = "MessageStoreIncrementalBackup/Failed to unpack files from archive."
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ all -> 0x1ab4 }
            r2 = r71
            X.00H r2 = r2.A03     // Catch:{ all -> 0x1ab4 }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x1ab4 }
            X.9pW r2 = (X.C193089pW) r2     // Catch:{ all -> 0x1ab4 }
            r2.A02()     // Catch:{ all -> 0x1ab4 }
            goto L_0x1ab3
        L_0x1a6c:
            r2 = move-exception
            if (r12 == 0) goto L_0x1a77
            r12.close()     // Catch:{ all -> 0x1a73 }
            goto L_0x1a77
        L_0x1a73:
            r3 = move-exception
            X.AnonymousClass0DT.A00(r2, r3)     // Catch:{ all -> 0x1a78 }
        L_0x1a77:
            throw r2     // Catch:{ all -> 0x1a78 }
        L_0x1a78:
            r3 = move-exception
            r16.close()     // Catch:{ all -> 0x1a93 }
            goto L_0x1ab3
        L_0x1a7d:
            r3 = move-exception
            if (r12 == 0) goto L_0x1a88
            r12.close()     // Catch:{ all -> 0x1a84 }
            goto L_0x1a88
        L_0x1a84:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ all -> 0x1a89 }
        L_0x1a88:
            throw r3     // Catch:{ all -> 0x1a89 }
        L_0x1a89:
            r3 = move-exception
            r41.close()     // Catch:{ all -> 0x1a93 }
            goto L_0x1ab3
        L_0x1a8e:
            r3 = move-exception
            r15.close()     // Catch:{ all -> 0x1a93 }
            goto L_0x1ab3
        L_0x1a93:
            r2 = move-exception
            X.AnonymousClass0DT.A00(r3, r2)     // Catch:{ all -> 0x1ab4 }
            goto L_0x1ab3
        L_0x1a98:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x1ab4 }
            r3.<init>()     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "BackupChangesStore/Unspecified value for Id field '"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            r3.append(r10)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = "'"
            r3.append(r2)     // Catch:{ all -> 0x1ab4 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x1ab4 }
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x1ab4 }
            r3.<init>(r2)     // Catch:{ all -> 0x1ab4 }
        L_0x1ab3:
            throw r3     // Catch:{ all -> 0x1ab4 }
        L_0x1ab4:
            r3 = move-exception
            r2 = r71
            X.00H r2 = r2.A00     // Catch:{ IOException -> 0x1ad0 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x1ad0 }
            X.2tR r2 = (X.C63632tR) r2     // Catch:{ IOException -> 0x1ad0 }
            r2.A07()     // Catch:{ IOException -> 0x1ad0 }
            r2 = r71
            X.00H r2 = r2.A03     // Catch:{ IOException -> 0x1ad0 }
            java.lang.Object r2 = r2.get()     // Catch:{ IOException -> 0x1ad0 }
            X.9pW r2 = (X.C193089pW) r2     // Catch:{ IOException -> 0x1ad0 }
            r2.A02()     // Catch:{ IOException -> 0x1ad0 }
            throw r3     // Catch:{ IOException -> 0x1ad0 }
        L_0x1ad0:
            r5 = move-exception
            goto L_0x1ad9
        L_0x1ad2:
            r5 = move-exception
            goto L_0x1ad7
        L_0x1ad4:
            r5 = move-exception
            r19 = 5
        L_0x1ad7:
            r38 = 3
        L_0x1ad9:
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x1bc2 }
            r4.A0M = r2     // Catch:{ all -> 0x1bc2 }
            java.lang.String r2 = r5.getMessage()     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1af3
            java.lang.String r3 = r5.getMessage()     // Catch:{ all -> 0x1bc2 }
            java.lang.String r2 = "unknown format"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1af3
            goto L_0x1b10
        L_0x1af3:
            java.lang.Throwable r2 = r5.getCause()     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1b02
            java.lang.Throwable r2 = r5.getCause()     // Catch:{ all -> 0x1bc2 }
            boolean r2 = r2 instanceof java.util.zip.DataFormatException     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1b02
            goto L_0x1b10
        L_0x1b02:
            java.lang.Throwable r2 = r5.getCause()     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1b12
            java.lang.Throwable r2 = r5.getCause()     // Catch:{ all -> 0x1bc2 }
            boolean r2 = r2 instanceof javax.crypto.AEADBadTagException     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1b12
        L_0x1b10:
            r6 = 1
            goto L_0x1b13
        L_0x1b12:
            r6 = 0
        L_0x1b13:
            r2 = r38
            r3 = r18
            if (r2 != r3) goto L_0x1b61
            if (r6 == 0) goto L_0x1b25
            java.lang.String r2 = "MessageStoreBackup/restore/error/decrypting-failure"
            com.whatsapp.util.Log.e(r2, r5)     // Catch:{ all -> 0x1bc2 }
            r2 = r40
            r4.A02 = r2     // Catch:{ all -> 0x1bc2 }
            goto L_0x1b2a
        L_0x1b25:
            java.lang.String r2 = "MessageStoreBackup/restore/error/IOException-during-incremental-message-restore"
            com.whatsapp.util.Log.e(r2, r5)     // Catch:{ all -> 0x1bc2 }
        L_0x1b2a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x1c02 }
            r4.A0A = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1c02 }
            r4.A0I = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x1b5e
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x1c02 }
            r4.A0H = r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1c02 }
            r3.<init>()     // Catch:{ Exception -> 0x1c02 }
            r2 = r44
            r3.append(r2)     // Catch:{ Exception -> 0x1c02 }
            r3.append(r0)     // Catch:{ Exception -> 0x1c02 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x1c02 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x1c02 }
        L_0x1b5e:
            r19 = 3
            goto L_0x1bb0
        L_0x1b61:
            java.lang.String r2 = r5.getMessage()     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1b79
            java.lang.String r3 = r5.getMessage()     // Catch:{ all -> 0x1bc2 }
            java.lang.String r2 = "ENOSPC"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x1bc2 }
            if (r2 == 0) goto L_0x1b79
            java.lang.String r2 = "MessageStoreBackup/restore/error/no-space-left"
            com.whatsapp.util.Log.e(r2, r5)     // Catch:{ all -> 0x1bc2 }
            goto L_0x1b7c
        L_0x1b79:
            throw r5     // Catch:{ all -> 0x1bc2 }
        L_0x1b7a:
            r19 = 1
        L_0x1b7c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x1c02 }
            r4.A0A = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1c02 }
            r4.A0I = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x1bb0
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x1c02 }
            r4.A0H = r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1c02 }
            r3.<init>()     // Catch:{ Exception -> 0x1c02 }
            r2 = r44
            r3.append(r2)     // Catch:{ Exception -> 0x1c02 }
            r3.append(r0)     // Catch:{ Exception -> 0x1c02 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x1c02 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x1c02 }
        L_0x1bb0:
            long r0 = r43.A02()     // Catch:{ Exception -> 0x1c02 }
            long r0 = r0 / r22
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x1c02 }
            r4.A0J = r0     // Catch:{ Exception -> 0x1c02 }
            r2 = 1
            r0 = r19
            if (r0 == r2) goto L_0x1c0f
            goto L_0x1c0e
        L_0x1bc2:
            r6 = move-exception
            goto L_0x1bc7
        L_0x1bc4:
            r6 = move-exception
            r0 = 1
        L_0x1bc7:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r21)     // Catch:{ Exception -> 0x1c02 }
            r4.A0A = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ Exception -> 0x1c02 }
            r4.A0I = r2     // Catch:{ Exception -> 0x1c02 }
            int r2 = r46.size()     // Catch:{ Exception -> 0x1c02 }
            long r2 = (long) r2     // Catch:{ Exception -> 0x1c02 }
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 > 0) goto L_0x1bfb
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x1c02 }
            r4.A0H = r2     // Catch:{ Exception -> 0x1c02 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x1c02 }
            r3.<init>()     // Catch:{ Exception -> 0x1c02 }
            r2 = r44
            r3.append(r2)     // Catch:{ Exception -> 0x1c02 }
            r3.append(r0)     // Catch:{ Exception -> 0x1c02 }
            java.lang.String r0 = r3.toString()     // Catch:{ Exception -> 0x1c02 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x1c02 }
        L_0x1bfb:
            throw r6     // Catch:{ Exception -> 0x1c02 }
        L_0x1bfc:
            java.lang.String r0 = "MessageStoreBackup/restore/no increments for restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x1c02 }
            goto L_0x1c0f
        L_0x1c02:
            r1 = move-exception
            java.lang.String r0 = "MessageStoreBackupincrement/restore/error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r0 = r1.toString()
            r4.A0M = r0
        L_0x1c0e:
            r2 = 6
        L_0x1c0f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/result/"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = r18
            if (r2 == r0) goto L_0x1c29
            r18 = 0
        L_0x1c29:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r18)
            r4.A04 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r74)
            r4.A0L = r0
            switch(r2) {
                case 1: goto L_0x1d58;
                case 2: goto L_0x1d5b;
                case 3: goto L_0x1d64;
                case 4: goto L_0x1d5e;
                case 5: goto L_0x1d61;
                default: goto L_0x1c38;
            }
        L_0x1c38:
            r0 = 6
        L_0x1c39:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0C = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r72)
            r4.A0D = r0
            int r0 = r14.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0B = r0
            X.00H r3 = r14.A0a
            java.lang.Object r1 = r3.get()
            X.1NP r1 = (X.AnonymousClass1NP) r1
            r0 = 512(0x200, float:7.175E-43)
            r1.A0B(r0)
            long r0 = r47.A02()
            long r0 = r0 / r22
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.A0G = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/log-chat-db-restore-event overall-result: "
            r1.append(r0)
            java.lang.Boolean r0 = r4.A04
            r1.append(r0)
            java.lang.String r0 = " database-backup-version: "
            r1.append(r0)
            java.lang.Long r0 = r4.A0E
            r1.append(r0)
            java.lang.String r0 = " file-integrity-check: "
            r1.append(r0)
            java.lang.Boolean r0 = r4.A03
            r1.append(r0)
            java.lang.String r0 = " jid-correct: "
            r1.append(r0)
            java.lang.Boolean r0 = r4.A02
            r1.append(r0)
            java.lang.String r0 = " database-repair-enabled: "
            r1.append(r0)
            java.lang.Boolean r0 = r4.A01
            r1.append(r0)
            java.lang.String r0 = " sqlite-integrity-check: "
            r1.append(r0)
            java.lang.Boolean r0 = r4.A06
            r1.append(r0)
            java.lang.String r0 = " has-only-index-errors: "
            r1.append(r0)
            java.lang.Boolean r0 = r4.A08
            r1.append(r0)
            java.lang.String r0 = " dump-and-restore-result: "
            r1.append(r0)
            java.lang.Boolean r0 = r4.A07
            r1.append(r0)
            java.lang.String r0 = " dump-and-restore-recovery-percentage: "
            r1.append(r0)
            java.lang.Long r0 = r4.A0F
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.18K r0 = r14.A0P
            r0.CC7(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "success="
            r1.append(r0)
            java.lang.Boolean r0 = r4.A04
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            java.lang.Boolean r1 = r4.A04
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r1 == r0) goto L_0x1d24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = ";details="
            r0.append(r1)
            java.lang.Integer r1 = r4.A0C
            if (r1 != 0) goto L_0x1d53
            r1 = 0
        L_0x1cfd:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ";idx-restored="
            r1.append(r0)
            java.lang.Boolean r0 = r4.A09
            r1.append(r0)
            java.lang.String r0 = ";failed-inc-idx="
            r1.append(r0)
            java.lang.Long r0 = r4.A0H
            r1.append(r0)
            java.lang.String r5 = r1.toString()
        L_0x1d24:
            java.lang.Object r0 = r3.get()
            X.1NP r0 = (X.AnonymousClass1NP) r0
            android.content.SharedPreferences r0 = r0.A07()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "msg_restore_result"
            android.content.SharedPreferences$Editor r4 = r1.putString(r0, r5)
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "msg_restore_timestamp"
            android.content.SharedPreferences$Editor r0 = r4.putLong(r3, r0)
            r0.apply()
            switch(r2) {
                case 1: goto L_0x1d99;
                case 2: goto L_0x1d8e;
                case 3: goto L_0x00d3;
                case 4: goto L_0x1d83;
                case 5: goto L_0x1d67;
                default: goto L_0x1d48;
            }
        L_0x1d48:
            java.lang.String r0 = "MessageStoreBackup/restore/increment/failed"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r17 = 1
            r28 = 0
            goto L_0x00eb
        L_0x1d53:
            java.lang.String r1 = r1.toString()
            goto L_0x1cfd
        L_0x1d58:
            r0 = 1
            goto L_0x1c39
        L_0x1d5b:
            r0 = 2
            goto L_0x1c39
        L_0x1d5e:
            r0 = 4
            goto L_0x1c39
        L_0x1d61:
            r0 = 5
            goto L_0x1c39
        L_0x1d64:
            r0 = 3
            goto L_0x1c39
        L_0x1d67:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure/out-of-space "
            r1.append(r0)
            java.lang.String r0 = r37.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r29 = 1
            goto L_0x00eb
        L_0x1d83:
            int r30 = r30 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure/jid-mismatch "
            goto L_0x00da
        L_0x1d8e:
            int r33 = r33 + 1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/failure/file-integrity "
            goto L_0x00da
        L_0x1d99:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "MessageStoreBackup/restore/success "
            r1.append(r0)
            java.lang.String r0 = r37.getName()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r17 = 1
            r28 = 1
            goto L_0x00eb
        L_0x1db7:
            java.lang.String r0 = "repair-disabled"
            goto L_0x008e
        L_0x1dbb:
            int r27 = r27 + 1
            goto L_0x0017
        L_0x1dbf:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x1dc4 }
            throw r0     // Catch:{ all -> 0x1dc4 }
        L_0x1dc4:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x1dc7:
            r1 = move-exception
            boolean r0 = r12.exists()
            if (r0 != 0) goto L_0x1dd5
            com.whatsapp.util.Log.i((java.lang.String) r3)
            r14.A07()
            throw r1
        L_0x1dd5:
            java.io.File r0 = r14.A02()
            X.C64062u9.A0Q(r0)
            throw r1
        L_0x1ddd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = r49
            r1.append(r0)
            if (r17 == 0) goto L_0x1e4c
            java.lang.String r0 = "success"
        L_0x1dec:
            r1.append(r0)
            java.lang.String r0 = " num-backup-files-attempts: "
            r1.append(r0)
            r0 = r21
            r1.append(r0)
            java.lang.String r0 = " num-integrity-failure: "
            r1.append(r0)
            r0 = r33
            r1.append(r0)
            java.lang.String r0 = " num-jid-mismatch: "
            r1.append(r0)
            r0 = r30
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r17 == 0) goto L_0x1e21
            r1 = 21
            if (r28 == 0) goto L_0x1e1b
            r1 = 1
        L_0x1e1b:
            X.9nf r0 = new X.9nf
            r0.<init>(r1)
            return r0
        L_0x1e21:
            X.1WZ r0 = r14.A0J
            r0.A01()
            X.1Cn r0 = r14.A0H
            r0.A02()
            if (r29 == 0) goto L_0x1e34
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/out-of-space"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 5
            goto L_0x1e1b
        L_0x1e34:
            if (r30 <= 0) goto L_0x1e3d
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/some-failures-are-jid-mismatch"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 3
            goto L_0x1e1b
        L_0x1e3d:
            r1 = r33
            r0 = r21
            if (r1 != r0) goto L_0x1e4a
            java.lang.String r0 = "MessageStoreBackup/restore/nothing-restored/all-failures-are-file-integrity-issues"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 4
            goto L_0x1e1b
        L_0x1e4a:
            r1 = 0
            goto L_0x1e1b
        L_0x1e4c:
            java.lang.String r0 = "failed"
            goto L_0x1dec
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27431Wb.A01(X.1Wb, X.B9V, java.util.List, int):X.9nf");
    }
}
