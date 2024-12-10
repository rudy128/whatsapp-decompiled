package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AkR  reason: case insensitive filesystem */
public class C21460AkR implements Runnable {
    public static final String A04 = A5Z.A01("ForceStopRunnable");
    public static final long A05 = TimeUnit.DAYS.toMillis(3650);
    public int A00 = 0;
    public final Context A01;
    public final A7W A02;
    public final AnonymousClass9UN A03;

    public static void A01(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        }
        Intent A0A = C17880vN.A0A();
        A0A.setComponent(new ComponentName(context, ForceStopRunnable$BroadcastReceiver.class));
        A0A.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, A0A, i);
        long currentTimeMillis = System.currentTimeMillis() + A05;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b3, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r1 = r15.A00 + 1;
        r15.A00 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02bb, code lost:
        if (r1 >= 3) goto L_0x02bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02be, code lost:
        X.A5Z.A00().A07(r4, X.C17890vO.A0a("Retrying after ", X.AnonymousClass000.A10(), ((long) r1) * 300), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:?, code lost:
        java.lang.Thread.sleep(((long) r15.A00) * 300);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02e0, code lost:
        if (X.C18380wJ.A00(r2) != false) goto L_0x02e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02e2, code lost:
        r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02e4, code lost:
        X.A5Z.A00().A08(r4, r1, r8);
        r0 = new java.lang.IllegalStateException(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f1, code lost:
        r1 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0031, code lost:
        if (r3 == false) goto L_0x0033;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0037 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02b3 A[ExcHandler: SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException (r8v0 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:39:0x0141] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037 A[LOOP:0: B:8:0x0037->B:129:0x0037, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r15 = this;
            X.A7W r10 = r15.A02     // Catch:{ all -> 0x0304 }
            X.00I r9 = r10.A02     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = r9.A07     // Catch:{ all -> 0x0304 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0304 }
            if (r0 == 0) goto L_0x0018
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ all -> 0x0304 }
            java.lang.String r4 = A04     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = "The default process name was not specified."
            r1.A03(r4, r0)     // Catch:{ all -> 0x0304 }
            goto L_0x0037
        L_0x0018:
            android.content.Context r0 = r15.A01     // Catch:{ all -> 0x0304 }
            boolean r3 = X.C197049w4.A00(r0, r9)     // Catch:{ all -> 0x0304 }
            X.A5Z r2 = X.A5Z.A00()     // Catch:{ all -> 0x0304 }
            java.lang.String r4 = A04     // Catch:{ all -> 0x0304 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = "Is default app process = "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r3)     // Catch:{ all -> 0x0304 }
            r2.A03(r4, r0)     // Catch:{ all -> 0x0304 }
            if (r3 != 0) goto L_0x0037
        L_0x0033:
            r10.A05()
            return
        L_0x0037:
            android.content.Context r2 = r15.A01     // Catch:{ SQLiteException -> 0x02f4 }
            r0 = 0
            X.C18070vi.A0d(r2, r0)     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r5 = "androidx.work.workdb"
            java.io.File r3 = r2.getDatabasePath(r5)     // Catch:{ SQLiteException -> 0x02f4 }
            X.C18070vi.A0X(r3)     // Catch:{ SQLiteException -> 0x02f4 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x02f4 }
            r0 = 23
            if (r1 < r0) goto L_0x0138
            boolean r0 = r3.exists()     // Catch:{ SQLiteException -> 0x02f4 }
            if (r0 == 0) goto L_0x0138
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r3 = X.C182239Tp.A00     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = "Migrating WorkDatabase to the no-backup directory"
            r1.A03(r3, r0)     // Catch:{ SQLiteException -> 0x02f4 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteException -> 0x02f4 }
            r0 = 23
            if (r1 < r0) goto L_0x00b4
            java.io.File r11 = r2.getDatabasePath(r5)     // Catch:{ SQLiteException -> 0x02f4 }
            X.C18070vi.A0X(r11)     // Catch:{ SQLiteException -> 0x02f4 }
            java.io.File r8 = X.AnonymousClass9OE.A00(r2)     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String[] r14 = X.C182239Tp.A01     // Catch:{ SQLiteException -> 0x02f4 }
            r0 = 3
            r7 = 3
            int r1 = X.C200610r.A03(r0)     // Catch:{ SQLiteException -> 0x02f4 }
            r0 = 16
            if (r1 >= r0) goto L_0x007c
            r1 = 16
        L_0x007c:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ SQLiteException -> 0x02f4 }
            r6.<init>(r1)     // Catch:{ SQLiteException -> 0x02f4 }
            r5 = 0
        L_0x0082:
            r13 = r14[r5]     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = r11.getPath()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r13, r1)     // Catch:{ SQLiteException -> 0x02f4 }
            java.io.File r12 = X.C108945cZ.A17(r0)     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = r8.getPath()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r13, r1)     // Catch:{ SQLiteException -> 0x02f4 }
            java.io.File r0 = X.C108945cZ.A17(r0)     // Catch:{ SQLiteException -> 0x02f4 }
            X.1D6 r0 = X.AnonymousClass1D6.A01(r12, r0)     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.Object r1 = r0.first     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.Object r0 = r0.second     // Catch:{ SQLiteException -> 0x02f4 }
            r6.put(r1, r0)     // Catch:{ SQLiteException -> 0x02f4 }
            int r5 = r5 + 1
            if (r5 < r7) goto L_0x0082
            goto L_0x00b9
        L_0x00b4:
            X.1CQ r0 = X.AnonymousClass1D7.A0I()     // Catch:{ SQLiteException -> 0x02f4 }
            goto L_0x00c1
        L_0x00b9:
            X.1D6 r0 = X.AnonymousClass1D6.A01(r11, r8)     // Catch:{ SQLiteException -> 0x02f4 }
            java.util.Map r0 = X.AnonymousClass1D7.A0G(r6, r0)     // Catch:{ SQLiteException -> 0x02f4 }
        L_0x00c1:
            java.util.Iterator r8 = X.AnonymousClass000.A15(r0)     // Catch:{ SQLiteException -> 0x02f4 }
        L_0x00c5:
            boolean r0 = r8.hasNext()     // Catch:{ SQLiteException -> 0x02f4 }
            if (r0 == 0) goto L_0x0138
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r8)     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.Object r7 = r0.getKey()     // Catch:{ SQLiteException -> 0x02f4 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.Object r5 = r0.getValue()     // Catch:{ SQLiteException -> 0x02f4 }
            java.io.File r5 = (java.io.File) r5     // Catch:{ SQLiteException -> 0x02f4 }
            boolean r0 = r7.exists()     // Catch:{ SQLiteException -> 0x02f4 }
            if (r0 == 0) goto L_0x00c5
            boolean r0 = r5.exists()     // Catch:{ SQLiteException -> 0x02f4 }
            if (r0 == 0) goto L_0x00f8
            X.A5Z r6 = X.A5Z.A00()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = "Over-writing contents of "
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)     // Catch:{ SQLiteException -> 0x02f4 }
            r6.A06(r3, r0)     // Catch:{ SQLiteException -> 0x02f4 }
        L_0x00f8:
            boolean r0 = r7.renameTo(r5)     // Catch:{ SQLiteException -> 0x02f4 }
            if (r0 == 0) goto L_0x011e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = "Migrated "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02f4 }
            r1.append(r7)     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = "to "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02f4 }
            r1.append(r5)     // Catch:{ SQLiteException -> 0x02f4 }
        L_0x0112:
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x02f4 }
            X.A5Z r0 = X.A5Z.A00()     // Catch:{ SQLiteException -> 0x02f4 }
            r0.A03(r3, r1)     // Catch:{ SQLiteException -> 0x02f4 }
            goto L_0x00c5
        L_0x011e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = "Renaming "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02f4 }
            r1.append(r7)     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = " to "
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02f4 }
            r1.append(r5)     // Catch:{ SQLiteException -> 0x02f4 }
            java.lang.String r0 = " failed"
            r1.append(r0)     // Catch:{ SQLiteException -> 0x02f4 }
            goto L_0x0112
        L_0x0138:
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = "Performing cleanup operations."
            r1.A03(r4, r0)     // Catch:{ all -> 0x0304 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r0 = 23
            r13 = 0
            if (r1 < r0) goto L_0x015c
            androidx.work.impl.WorkDatabase r0 = r10.A04     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            boolean r12 = X.C20354AHk.A04(r2, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
        L_0x014e:
            androidx.work.impl.WorkDatabase r3 = r10.A04     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            X.BD8 r8 = r3.A0E()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            X.B6e r7 = r3.A0D()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r3.A07()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            goto L_0x015e
        L_0x015c:
            r12 = 0
            goto L_0x014e
        L_0x015e:
            java.util.ArrayList r1 = r8.BYR()     // Catch:{ all -> 0x02ae }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x02ae }
            r11 = 0
            if (r0 != 0) goto L_0x018c
            r11 = 1
            java.util.Iterator r6 = r1.iterator()     // Catch:{ all -> 0x02ae }
        L_0x016e:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x02ae }
            if (r0 == 0) goto L_0x018c
            java.lang.Object r1 = r6.next()     // Catch:{ all -> 0x02ae }
            X.A2t r1 = (X.A2t) r1     // Catch:{ all -> 0x02ae }
            java.lang.Integer r0 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x02ae }
            java.lang.String r5 = r1.A0M     // Catch:{ all -> 0x02ae }
            r8.CKr(r0, r5)     // Catch:{ all -> 0x02ae }
            r0 = -512(0xfffffffffffffe00, float:NaN)
            r8.CKt(r5, r0)     // Catch:{ all -> 0x02ae }
            r0 = -1
            r8.Biq(r5, r0)     // Catch:{ all -> 0x02ae }
            goto L_0x016e
        L_0x018c:
            X.AHu r7 = (X.C20364AHu) r7     // Catch:{ all -> 0x02ae }
            X.A6c r6 = r7.A01     // Catch:{ all -> 0x02ae }
            r6.A06()     // Catch:{ all -> 0x02ae }
            X.A0m r5 = r7.A02     // Catch:{ all -> 0x02ae }
            X.BDc r1 = r5.A01()     // Catch:{ all -> 0x02ae }
            r6.A07()     // Catch:{ all -> 0x02ae }
            X.AHW.A00(r6, r1)     // Catch:{ all -> 0x02a6 }
            X.C20076A6c.A02(r6)     // Catch:{ all -> 0x02ae }
            r5.A02(r1)     // Catch:{ all -> 0x02ae }
            r3.A08()     // Catch:{ all -> 0x02ae }
            X.C20076A6c.A02(r3)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            if (r11 != 0) goto L_0x01af
            if (r12 == 0) goto L_0x01b0
        L_0x01af:
            r13 = 1
        L_0x01b0:
            X.9UN r0 = r10.A05     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            androidx.work.impl.WorkDatabase r8 = r0.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            X.BA2 r0 = r8.A0A()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.String r7 = "reschedule_needed"
            java.lang.Long r0 = r0.BUG(r7)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            if (r0 == 0) goto L_0x01e8
            long r11 = r0.longValue()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r5 = 1
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01e8
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.String r0 = "Rescheduling Workers."
            r1.A03(r4, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r10.A06()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.Long r0 = X.C17890vO.A0L()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            X.9po r5 = new X.9po     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r5.<init>(r7, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
        L_0x01df:
            X.BA2 r0 = r8.A0A()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r0.Bdd(r5)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            goto L_0x0033
        L_0x01e8:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r0 = 31
            r6 = 536870912(0x20000000, float:1.0842022E-19)
            if (r1 < r0) goto L_0x01f2
            r6 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x01f2:
            android.content.Intent r5 = X.C17880vN.A0A()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r1 = androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver.class
            android.content.ComponentName r0 = new android.content.ComponentName     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r5.setComponent(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.String r0 = "ACTION_FORCE_STOP_RESCHEDULE"
            r5.setAction(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r0 = -1
            android.app.PendingIntent r6 = android.app.PendingIntent.getBroadcast(r2, r0, r5, r6)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r0 = 30
            r5 = 0
            if (r1 < r0) goto L_0x0263
            if (r6 == 0) goto L_0x0216
            r6.cancel()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
        L_0x0216:
            java.lang.String r0 = "activity"
            java.lang.Object r1 = r2.getSystemService(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r0 = 0
            java.util.List r8 = r1.getHistoricalProcessExitReasons(r0, r5, r5)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            if (r8 == 0) goto L_0x0294
            boolean r0 = r8.isEmpty()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            if (r0 != 0) goto L_0x0294
            X.9UN r0 = r15.A03     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            androidx.work.impl.WorkDatabase r0 = r0.A00     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            X.BA2 r1 = r0.A0A()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.String r0 = "last_force_stop_ms"
            java.lang.Long r0 = r1.BUG(r0)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            if (r0 == 0) goto L_0x0240
            long r11 = r0.longValue()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            goto L_0x0242
        L_0x0240:
            r11 = 0
        L_0x0242:
            r7 = 0
        L_0x0243:
            int r0 = r8.size()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            if (r7 >= r0) goto L_0x0294
            java.lang.Object r5 = r8.get(r7)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            android.app.ApplicationExitInfo r5 = (android.app.ApplicationExitInfo) r5     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            int r1 = r5.getReason()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r0 = 10
            if (r1 != r0) goto L_0x0260
            long r5 = r5.getTimestamp()     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x0260
            goto L_0x0273
        L_0x0260:
            int r7 = r7 + 1
            goto L_0x0243
        L_0x0263:
            if (r6 != 0) goto L_0x0294
            A01(r2)     // Catch:{ IllegalArgumentException | SecurityException -> 0x0269, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3, SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            goto L_0x0273
        L_0x0269:
            r3 = move-exception
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.String r0 = "Ignoring exception"
            r1.A0A(r4, r0, r3)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
        L_0x0273:
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.String r0 = "Application was force-stopped, rescheduling."
            r1.A03(r4, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r10.A06()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            X.9UN r3 = r15.A03     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.String r1 = "last_force_stop_ms"
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            X.9po r5 = new X.9po     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            r5.<init>(r1, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            androidx.work.impl.WorkDatabase r8 = r3.A00     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            goto L_0x01df
        L_0x0294:
            if (r13 == 0) goto L_0x0033
            X.A5Z r1 = X.A5Z.A00()     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.lang.String r0 = "Found unfinished work, scheduling it."
            r1.A03(r4, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            java.util.List r0 = r10.A07     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            X.C20066A5p.A01(r9, r3, r0)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            goto L_0x0033
        L_0x02a6:
            r0 = move-exception
            X.C20076A6c.A02(r6)     // Catch:{ all -> 0x02ae }
            r5.A02(r1)     // Catch:{ all -> 0x02ae }
            throw r0     // Catch:{ all -> 0x02ae }
        L_0x02ae:
            r0 = move-exception
            X.C20076A6c.A02(r3)     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
            throw r0     // Catch:{ SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteTableLockedException -> 0x02b3 }
        L_0x02b3:
            r8 = move-exception
            int r0 = r15.A00     // Catch:{ all -> 0x0304 }
            int r1 = r0 + 1
            r15.A00 = r1     // Catch:{ all -> 0x0304 }
            r0 = 3
            if (r1 < r0) goto L_0x02be
            goto L_0x02dc
        L_0x02be:
            long r2 = (long) r1     // Catch:{ all -> 0x0304 }
            r6 = 300(0x12c, double:1.48E-321)
            long r2 = r2 * r6
            X.A5Z r5 = X.A5Z.A00()     // Catch:{ all -> 0x0304 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0304 }
            java.lang.String r0 = "Retrying after "
            java.lang.String r0 = X.C17890vO.A0a(r0, r1, r2)     // Catch:{ all -> 0x0304 }
            r5.A07(r4, r0, r8)     // Catch:{ all -> 0x0304 }
            int r0 = r15.A00     // Catch:{ all -> 0x0304 }
            long r0 = (long) r0     // Catch:{ all -> 0x0304 }
            long r0 = r0 * r6
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0037 }
            goto L_0x0037
        L_0x02dc:
            boolean r0 = X.C18380wJ.A00(r2)     // Catch:{ all -> 0x0304 }
            if (r0 == 0) goto L_0x02f1
            java.lang.String r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
        L_0x02e4:
            X.A5Z r0 = X.A5Z.A00()     // Catch:{ all -> 0x0304 }
            r0.A08(r4, r1, r8)     // Catch:{ all -> 0x0304 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0304 }
            r0.<init>(r1, r8)     // Catch:{ all -> 0x0304 }
            goto L_0x0303
        L_0x02f1:
            java.lang.String r1 = "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"
            goto L_0x02e4
        L_0x02f4:
            r2 = move-exception
            java.lang.String r1 = "Unexpected SQLite exception during migrations"
            X.A5Z r0 = X.A5Z.A00()     // Catch:{ all -> 0x0304 }
            r0.A04(r4, r1)     // Catch:{ all -> 0x0304 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0304 }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x0304 }
        L_0x0303:
            throw r0     // Catch:{ all -> 0x0304 }
        L_0x0304:
            r1 = move-exception
            X.A7W r0 = r15.A02
            r0.A05()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21460AkR.run():void");
    }

    public C21460AkR(Context context, A7W a7w) {
        this.A01 = context.getApplicationContext();
        this.A02 = a7w;
        this.A03 = a7w.A05;
    }

    public static final File A00(Context context) {
        File noBackupFilesDir = context.getNoBackupFilesDir();
        C18070vi.A0X(noBackupFilesDir);
        return noBackupFilesDir;
    }
}
