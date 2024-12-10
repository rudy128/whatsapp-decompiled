package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1Cd  reason: invalid class name */
public class AnonymousClass1Cd implements C18140vp {
    public final AnonymousClass11S A00;
    public final AnonymousClass11U A01;
    public final C22601Cm A02;
    public final File A03;
    public final ReentrantReadWriteLock.WriteLock A04;
    public final ReentrantReadWriteLock A05;
    public final AnonymousClass1Cb A06;
    public volatile boolean A07;
    public volatile boolean A08;

    public AnonymousClass1Cd(AnonymousClass11S r7, AnonymousClass11O r8, AnonymousClass1CU r9, AnonymousClass1Cb r10, AnonymousClass1CL r11, AnonymousClass1CN r12, AnonymousClass1CM r13, AnonymousClass00H r14) {
        Context context = r12.A00.A00;
        C18070vi.A0X(context);
        File databasePath = context.getDatabasePath("msgstore.db");
        C18070vi.A0b(databasePath);
        this.A03 = databasePath;
        this.A02 = (C22601Cm) r9.CCq(Collections.singleton(new AnonymousClass1Cf(r8, r11, this, r13, r14)));
        this.A00 = r7;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.A05 = reentrantReadWriteLock;
        this.A04 = reentrantReadWriteLock.writeLock();
        this.A06 = r10;
        this.A01 = new AnonymousClass11U();
    }

    public static void A01(AnonymousClass1Cd r2) {
        C22601Cm r0 = r2.A02;
        r0.close();
        boolean A0A = r0.A0A();
        StringBuilder sb = new StringBuilder();
        sb.append("msgstore-manager/deletedb/result/");
        sb.append(A0A);
        Log.i(sb.toString());
    }

    public static void A02(AnonymousClass1Cd r6) {
        Log.i("msgstore-manager/setup");
        C17960vV.A0D(r6.A04.isHeldByCurrentThread());
        synchronized (r6) {
            C22601Cm r5 = r6.A02;
            try {
                File file = r5.A0B;
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                r5.A0A();
                C64062u9.A0J(file, "msgstore/create-db/list ");
                SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase.CursorFactory) null, 805306384);
                C17960vV.A07(openDatabase);
                r5.onCreate(openDatabase);
                C64062u9.A0J(file, "msgstore/create-db/done/list ");
                r5.Bbw();
                r6.A08 = true;
            } catch (Throwable th) {
                C64062u9.A0J(r5.A0B, "msgstore/create-db/done/list ");
                throw th;
            }
        }
    }

    /* renamed from: A04 */
    public C28781at get() {
        AnonymousClass1Cb r2 = this.A06;
        A06();
        ReentrantReadWriteLock.ReadLock readLock = this.A05.readLock();
        A06();
        return r2.A00(this.A02, readLock);
    }

    public C28791au A05() {
        AnonymousClass1Cb r2 = this.A06;
        A06();
        ReentrantReadWriteLock.ReadLock readLock = this.A05.readLock();
        A06();
        return r2.A01(this.A02, readLock);
    }

    public void A06() {
        AnonymousClass11U r2 = this.A01;
        if (r2.A06()) {
            r2.A04(new AnonymousClass3DB(this, 2));
            if (r2.A05()) {
                A09((AnonymousClass1DQ) null, true);
            }
            r2.A00();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002c, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        A06();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00db, code lost:
        return r5.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(X.AnonymousClass1DQ r6, boolean r7) {
        /*
            r5 = this;
            java.lang.String r0 = "msgstore-manager/checkhealth"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r3 = r5.A04
            r3.lock()
            monitor-enter(r5)
            if (r7 == 0) goto L_0x0030
            X.11U r4 = r5.A01     // Catch:{ all -> 0x00dc }
            monitor-enter(r4)     // Catch:{ all -> 0x00dc }
            int r2 = r4.A00     // Catch:{ all -> 0x002d }
            r1 = 3
            r0 = 0
            if (r2 <= r1) goto L_0x0017
            r0 = 1
        L_0x0017:
            monitor-exit(r4)     // Catch:{ all -> 0x00dc }
            if (r0 == 0) goto L_0x0030
            boolean r1 = r5.A08     // Catch:{ all -> 0x00dc }
            r3.unlock()     // Catch:{ all -> 0x00ef }
            r4.A01()     // Catch:{ all -> 0x00ef }
            boolean r0 = r5.A08     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x002b
            if (r6 == 0) goto L_0x002b
            r6.CCj()     // Catch:{ all -> 0x00ef }
        L_0x002b:
            monitor-exit(r5)     // Catch:{ all -> 0x00ef }
            return r1
        L_0x002d:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00dc }
            throw r0     // Catch:{ all -> 0x00dc }
        L_0x0030:
            boolean r0 = r5.A08     // Catch:{ all -> 0x00dc }
            if (r0 != 0) goto L_0x00c4
            java.lang.Boolean r0 = X.C17960vV.A01     // Catch:{ all -> 0x00dc }
            X.11U r0 = r5.A01     // Catch:{ all -> 0x00dc }
            r0.A03()     // Catch:{ all -> 0x00dc }
            java.io.File r4 = r5.A03     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00dc }
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "-journal"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00dc }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00dc }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00dc }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "msgstore-manager/checkhealth/journal/delete "
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            r1.append(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00dc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = r4.getParent()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r4.getName()     // Catch:{ all -> 0x00dc }
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = ".back"
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00dc }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x00dc }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00dc }
            boolean r2 = r0.delete()     // Catch:{ all -> 0x00dc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00dc }
            r1.<init>()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "msgstore-manager/checkhealth/back/delete "
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            r1.append(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00dc }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00dc }
            X.1Cm r0 = r5.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bb, SQLiteException -> 0x00b4 }
            r0.Bbw()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bb, SQLiteException -> 0x00b4 }
            r0 = 1
            r5.A08 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bb, SQLiteException -> 0x00b4 }
            r5.A07 = r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00bb, SQLiteException -> 0x00b4 }
            goto L_0x00c4
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/checkhealth no db"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00dc }
            goto L_0x00c4
        L_0x00bb:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/checkhealth "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00dc }
            A01(r5)     // Catch:{ all -> 0x00dc }
        L_0x00c4:
            r3.unlock()     // Catch:{ all -> 0x00ef }
            X.11U r0 = r5.A01     // Catch:{ all -> 0x00ef }
            r0.A01()     // Catch:{ all -> 0x00ef }
            boolean r0 = r5.A08     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00d5
            if (r6 == 0) goto L_0x00d5
            r6.CCj()     // Catch:{ all -> 0x00ef }
        L_0x00d5:
            monitor-exit(r5)     // Catch:{ all -> 0x00ef }
            r5.A06()
            boolean r1 = r5.A08
            return r1
        L_0x00dc:
            r1 = move-exception
            r3.unlock()     // Catch:{ all -> 0x00ef }
            X.11U r0 = r5.A01     // Catch:{ all -> 0x00ef }
            r0.A01()     // Catch:{ all -> 0x00ef }
            boolean r0 = r5.A08     // Catch:{ all -> 0x00ef }
            if (r0 == 0) goto L_0x00ee
            if (r6 == 0) goto L_0x00ee
            r6.CCj()     // Catch:{ all -> 0x00ef }
        L_0x00ee:
            throw r1     // Catch:{ all -> 0x00ef }
        L_0x00ef:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ef }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Cd.A09(X.1DQ, boolean):boolean");
    }

    public static C28791au A00(AnonymousClass00H r0) {
        return ((AnonymousClass1Cd) r0.get()).A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        if (r1.toString().contains("file is encrypted") != false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b1, code lost:
        com.whatsapp.util.Log.w("databasehelper/getInitialMessageCount/encrypted-file-error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b9, code lost:
        com.whatsapp.util.Log.w("databasehelper/getInitialMessageCount/dbcorrupt", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8 A[Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }, ExcHandler: SQLiteDatabaseCorruptException (r1v5 'e' android.database.sqlite.SQLiteDatabaseCorruptException A[CUSTOM_DECLARE, Catch:{ all -> 0x00db }]), Splitter:B:12:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00c8 A[Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A03() {
        /*
            r10 = this;
            r10.A06()
            boolean r0 = r10.A08
            if (r0 != 0) goto L_0x0009
            r0 = 0
            return r0
        L_0x0009:
            r10.A06()
            X.1Cm r4 = r10.A02
            X.1at r9 = r10.get()
            java.lang.Object r3 = r4.A0C     // Catch:{ all -> 0x00db }
            monitor-enter(r3)     // Catch:{ all -> 0x00db }
            java.lang.Integer r1 = r4.A02     // Catch:{ all -> 0x00d8 }
            if (r1 != 0) goto L_0x00cf
            r0 = r9
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00d8 }
            X.1Ev r7 = r0.A02     // Catch:{ all -> 0x00d8 }
            java.lang.String r5 = "file is encrypted"
            java.lang.String r0 = "databasehelper/getInitialMessageCount"
            X.1Ez r6 = new X.1Ez     // Catch:{ all -> 0x00d8 }
            r6.<init>((java.lang.String) r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "SELECT COUNT(*) as count FROM message"
            java.lang.String r1 = "GET_MESSAGES_COUNT"
            r0 = 0
            android.database.Cursor r8 = r7.A0A(r2, r1, r0)     // Catch:{ SQLiteFullException -> 0x00a1, SQLiteException -> 0x0078, SQLiteDatabaseCorruptException -> 0x00b8 }
            java.lang.String r0 = "count"
            int r1 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006c }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0068
            int r7 = r8.getInt(r1)     // Catch:{ all -> 0x006c }
            if (r7 <= 0) goto L_0x0044
            int r7 = r7 + -1
        L_0x0044:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r2.<init>()     // Catch:{ all -> 0x006c }
            java.lang.String r0 = "databasehelper/getInitialMessageCount "
            r2.append(r0)     // Catch:{ all -> 0x006c }
            r2.append(r7)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = " | time spent:"
            r2.append(r0)     // Catch:{ all -> 0x006c }
            long r0 = r6.A02()     // Catch:{ all -> 0x006c }
            r2.append(r0)     // Catch:{ all -> 0x006c }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x006c }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x006c }
            r8.close()     // Catch:{ SQLiteFullException -> 0x00a1, SQLiteException -> 0x0078, SQLiteDatabaseCorruptException -> 0x00b8 }
            goto L_0x00bf
        L_0x0068:
            r8.close()     // Catch:{ SQLiteFullException -> 0x00a1, SQLiteException -> 0x0078, SQLiteDatabaseCorruptException -> 0x00b8 }
            goto L_0x0088
        L_0x006c:
            r1 = move-exception
            if (r8 == 0) goto L_0x0077
            r8.close()     // Catch:{ all -> 0x0073 }
            goto L_0x0077
        L_0x0073:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteFullException -> 0x00a1, SQLiteException -> 0x0078, SQLiteDatabaseCorruptException -> 0x00b8 }
        L_0x0077:
            throw r1     // Catch:{ SQLiteFullException -> 0x00a1, SQLiteException -> 0x0078, SQLiteDatabaseCorruptException -> 0x00b8 }
        L_0x0078:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            boolean r0 = r0.contains(r5)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = "databasehelper/getInitialMessageCount/cursor/encrypted-file-error"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
        L_0x0088:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            r2.<init>()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            java.lang.String r0 = "databasehelper/getInitialMessageCount/nocursor | time spent:"
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            long r0 = r6.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            r2.append(r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            java.lang.String r0 = r2.toString()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
            goto L_0x00be
        L_0x00a1:
            r1 = move-exception
            X.C22601Cm.A03(r1, r4)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
        L_0x00a5:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00b8, SQLiteException -> 0x00a6 }
        L_0x00a6:
            r1 = move-exception
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00d8 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x00d8 }
            if (r0 == 0) goto L_0x00b7
            java.lang.String r0 = "databasehelper/getInitialMessageCount/encrypted-file-error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00d8 }
            goto L_0x00be
        L_0x00b7:
            throw r1     // Catch:{ all -> 0x00d8 }
        L_0x00b8:
            r1 = move-exception
            java.lang.String r0 = "databasehelper/getInitialMessageCount/dbcorrupt"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x00d8 }
        L_0x00be:
            r7 = 0
        L_0x00bf:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00d8 }
            r4.A02 = r1     // Catch:{ all -> 0x00d8 }
            r0 = 1
            if (r7 > r0) goto L_0x00c9
            r0 = 0
        L_0x00c9:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r4.A01 = r0     // Catch:{ all -> 0x00d8 }
        L_0x00cf:
            int r0 = r1.intValue()     // Catch:{ all -> 0x00d8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00d8 }
            r9.close()
            return r0
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00d8 }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x00e0 }
            throw r1
        L_0x00e0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Cd.A03():int");
    }

    public boolean A07() {
        return this.A07;
    }

    public boolean A08() {
        A06();
        return this.A08;
    }
}
