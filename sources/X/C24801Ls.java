package X;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.1Ls  reason: invalid class name and case insensitive filesystem */
public abstract class C24801Ls extends SQLiteOpenHelper implements C18140vp, C22591Cl {
    public static volatile C24831Lv A07;
    public C23141Ev A00;
    public final C22561Ci A01;
    public final ReentrantReadWriteLock A02;
    public final Context A03;
    public final C24831Lv A04;
    public final AnonymousClass1Cb A05;
    public final AnonymousClass190 A06;

    public C23141Ev A09() {
        C27111Ut r2 = (C27111Ut) this;
        try {
            return C27111Ut.A01(r2);
        } catch (SQLiteDatabaseCorruptException e) {
            Log.w("LocationDbHelper/getReadableDatabase/Locations database is corrupt. Removing...", e);
            r2.A08();
            return C27111Ut.A01(r2);
        } catch (SQLiteException e2) {
            e = e2;
            String obj = e.toString();
            if (obj.contains("file is encrypted")) {
                Log.w("LocationDbHelper/getReadableDatabase/Locations database is encrypted. Removing...", e);
                r2.A08();
                return C27111Ut.A01(r2);
            }
            if (obj.contains("upgrade read-only database")) {
                Log.w("LocationDbHelper/getReadableDatabase/Client actually opened database as read-only and can't upgrade. Switching to writable...", e);
                return C27111Ut.A01(r2);
            }
            throw e;
        } catch (StackOverflowError e3) {
            e = e3;
            Log.w("LocationDbHelper/getReadableDatabase/StackOverflowError during db init check");
            for (StackTraceElement methodName : e.getStackTrace()) {
                if (methodName.getMethodName().equals("onCorruption")) {
                    Log.w("LocationDbHelper/getReadableDatabase/Locations database is corrupt. Found via StackOverflowError. Removing...");
                    r2.A08();
                    return C27111Ut.A01(r2);
                }
            }
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.1F1] */
    /* JADX WARNING: type inference failed for: r8v2, types: [java.lang.Object, X.1F1] */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized X.C23141Ev Bbw() {
        /*
            r13 = this;
            r12 = r13
            boolean r0 = r13 instanceof X.C24811Lt
            if (r0 == 0) goto L_0x011f
            r5 = r13
            X.1Lt r5 = (X.C24811Lt) r5
            monitor-enter(r12)
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0019
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0253 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0019
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0253 }
            goto L_0x0251
        L_0x0019:
            X.C22781De.A03()     // Catch:{ all -> 0x0253 }
            X.1Ev r0 = r5.A09()     // Catch:{ all -> 0x0237 }
            r5.A00 = r0     // Catch:{ all -> 0x0237 }
            java.lang.String r6 = "WaDatabaseHelper"
            java.lang.String r0 = "creating contacts database version 95"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0237 }
            X.1Ev r8 = r5.A00     // Catch:{ all -> 0x0237 }
            r1 = 0
            if (r8 == 0) goto L_0x002f
            r1 = 1
        L_0x002f:
            java.lang.String r0 = "WaDatabaseHelperprepareWritableDatabase/database is not initialized"
            X.C17960vV.A0H(r1, r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r9 = "wa_db_schema_version"
            X.11O r0 = r5.A01     // Catch:{ all -> 0x0237 }
            android.content.SharedPreferences r4 = r0.A00     // Catch:{ all -> 0x0237 }
            java.lang.String r3 = "force_wadb_check"
            r0 = 0
            boolean r0 = r4.getBoolean(r3, r0)     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x008a
            java.lang.String r1 = "wa_props"
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C28331Zy.A00(r8, r0, r1)     // Catch:{ all -> 0x0237 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r7 = ""
            if (r0 != 0) goto L_0x0080
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0237 }
            r0 = 0
            r2[r0] = r9     // Catch:{ all -> 0x0237 }
            java.lang.String r1 = "WADB_SELECT_PROPS_VALUE_BY_NAME"
            java.lang.String r0 = "SELECT prop_value FROM wa_props WHERE prop_name = ?"
            android.database.Cursor r2 = r8.A0A(r0, r1, r2)     // Catch:{ all -> 0x0237 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "prop_value"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r7 = r2.getString(r0)     // Catch:{ all -> 0x0075 }
            goto L_0x007d
        L_0x0075:
            r1 = move-exception
            if (r2 == 0) goto L_0x0236
            r2.close()     // Catch:{ all -> 0x0232 }
            goto L_0x0236
        L_0x007d:
            r2.close()     // Catch:{ all -> 0x0237 }
        L_0x0080:
            java.lang.String r0 = "ConsumerRelease-a57e79967fd57aa08a5d22f0369c7c5d"
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x008a
            goto L_0x010e
        L_0x008a:
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0237 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0237 }
            r0.beginTransaction()     // Catch:{ all -> 0x0237 }
            X.31a r8 = new X.31a     // Catch:{ all -> 0x0115 }
            r8.<init>()     // Catch:{ all -> 0x0115 }
            X.1F6 r2 = new X.1F6     // Catch:{ all -> 0x0115 }
            r2.<init>()     // Catch:{ all -> 0x0115 }
            X.1CT r0 = r5.A03     // Catch:{ all -> 0x0115 }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x0115 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0115 }
            java.util.Set r7 = (java.util.Set) r7     // Catch:{ all -> 0x0115 }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0115 }
        L_0x00a9:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x00b9
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0115 }
            X.12T r0 = (X.AnonymousClass12T) r0     // Catch:{ all -> 0x0115 }
            r0.BLt(r2)     // Catch:{ all -> 0x0115 }
            goto L_0x00a9
        L_0x00b9:
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0115 }
            r2.A02(r0)     // Catch:{ all -> 0x0115 }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0115 }
        L_0x00c2:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0115 }
            X.12T r0 = (X.AnonymousClass12T) r0     // Catch:{ all -> 0x0115 }
            r0.BLp(r8, r2)     // Catch:{ all -> 0x0115 }
            goto L_0x00c2
        L_0x00d2:
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0115 }
            r2.A03(r0, r6)     // Catch:{ all -> 0x0115 }
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0115 }
        L_0x00db:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0115 }
            if (r0 == 0) goto L_0x00eb
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0115 }
            X.12T r0 = (X.AnonymousClass12T) r0     // Catch:{ all -> 0x0115 }
            r0.BLv(r2)     // Catch:{ all -> 0x0115 }
            goto L_0x00db
        L_0x00eb:
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0115 }
            r2.A04(r0, r6)     // Catch:{ all -> 0x0115 }
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0115 }
            X.AnonymousClass31X.A00(r0)     // Catch:{ all -> 0x0115 }
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0115 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0115 }
            r0.setTransactionSuccessful()     // Catch:{ all -> 0x0115 }
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x0115 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch:{ all -> 0x0115 }
            r0.apply()     // Catch:{ all -> 0x0115 }
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0237 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0237 }
            r0.endTransaction()     // Catch:{ all -> 0x0237 }
        L_0x010e:
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0237 }
            X.C22781De.A03()     // Catch:{ all -> 0x0253 }
            goto L_0x0251
        L_0x0115:
            r1 = move-exception
            X.1Ev r0 = r5.A00     // Catch:{ all -> 0x0237 }
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0237 }
            r0.endTransaction()     // Catch:{ all -> 0x0237 }
            goto L_0x0236
        L_0x011f:
            boolean r0 = r13 instanceof X.AnonymousClass2Dj
            if (r0 == 0) goto L_0x023c
            r6 = r13
            X.2Dj r6 = (X.AnonymousClass2Dj) r6
            monitor-enter(r12)
            X.1Ev r1 = r6.A00     // Catch:{ all -> 0x0253 }
            if (r1 == 0) goto L_0x0133
            android.database.sqlite.SQLiteDatabase r0 = r1.A00     // Catch:{ all -> 0x0253 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0253 }
            goto L_0x0214
        L_0x0133:
            X.C22781De.A03()     // Catch:{ all -> 0x0253 }
            X.1Ev r0 = r6.A09()     // Catch:{ all -> 0x0237 }
            r6.A00 = r0     // Catch:{ all -> 0x0237 }
            java.lang.String r8 = "BackupDbHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0237 }
            r1.<init>()     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = "creating backup database version "
            r1.append(r0)     // Catch:{ all -> 0x0237 }
            r0 = 1
            r1.append(r0)     // Catch:{ all -> 0x0237 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0237 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0237 }
            X.1Ev r7 = r6.A00     // Catch:{ all -> 0x0237 }
            r1 = 0
            if (r7 == 0) goto L_0x0159
            r1 = 1
        L_0x0159:
            java.lang.String r0 = "BackupDbHelperprepareWritableDatabase/database is not initialized"
            X.C17960vV.A0H(r1, r0)     // Catch:{ all -> 0x0237 }
            if (r7 == 0) goto L_0x022a
            java.lang.String r5 = "wa_db_schema_version"
            r1 = 0
            X.11O r0 = r6.A00     // Catch:{ all -> 0x0237 }
            android.content.SharedPreferences r4 = r0.A00     // Catch:{ all -> 0x0237 }
            java.lang.String r3 = "force_backup_check"
            boolean r0 = r4.getBoolean(r3, r1)     // Catch:{ all -> 0x0237 }
            if (r0 != 0) goto L_0x0195
            java.lang.String r1 = "backup_props"
            java.lang.String r0 = "table"
            java.lang.String r0 = X.C28331Zy.A00(r7, r0, r1)     // Catch:{ all -> 0x0237 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x0237 }
            int r0 = r0.length()     // Catch:{ all -> 0x0237 }
            java.lang.String r1 = ""
            if (r0 <= 0) goto L_0x0188
            java.lang.String r1 = X.C60352ns.A00(r7, r5, r1)     // Catch:{ all -> 0x0237 }
        L_0x0188:
            java.lang.String r0 = "ConsumerRelease-6f007f19e8ad28d6fdadc4404c800a7b"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0237 }
            if (r0 == 0) goto L_0x0195
        L_0x0190:
            X.1Ev r1 = r6.A00     // Catch:{ all -> 0x0237 }
            if (r1 == 0) goto L_0x0218
            goto L_0x0210
        L_0x0195:
            X.C22781De.A03()     // Catch:{ all -> 0x0237 }
            android.database.sqlite.SQLiteDatabase r2 = r7.A00     // Catch:{ all -> 0x0225 }
            r2.beginTransaction()     // Catch:{ all -> 0x0225 }
            X.31Z r11 = new X.31Z     // Catch:{ all -> 0x0220 }
            r11.<init>()     // Catch:{ all -> 0x0220 }
            X.1F6 r9 = new X.1F6     // Catch:{ all -> 0x0220 }
            r9.<init>()     // Catch:{ all -> 0x0220 }
            X.1CT r0 = r6.A02     // Catch:{ all -> 0x0220 }
            X.00H r0 = r0.A00     // Catch:{ all -> 0x0220 }
            java.lang.Object r10 = r0.get()     // Catch:{ all -> 0x0220 }
            java.util.Set r10 = (java.util.Set) r10     // Catch:{ all -> 0x0220 }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x0220 }
        L_0x01b5:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x01c5
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0220 }
            X.12T r0 = (X.AnonymousClass12T) r0     // Catch:{ all -> 0x0220 }
            r0.BLt(r9)     // Catch:{ all -> 0x0220 }
            goto L_0x01b5
        L_0x01c5:
            r9.A02(r7)     // Catch:{ all -> 0x0220 }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x0220 }
        L_0x01cc:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x01dc
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0220 }
            X.12T r0 = (X.AnonymousClass12T) r0     // Catch:{ all -> 0x0220 }
            r0.BLp(r11, r9)     // Catch:{ all -> 0x0220 }
            goto L_0x01cc
        L_0x01dc:
            r9.A03(r7, r8)     // Catch:{ all -> 0x0220 }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ all -> 0x0220 }
        L_0x01e3:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0220 }
            if (r0 == 0) goto L_0x01f3
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0220 }
            X.12T r0 = (X.AnonymousClass12T) r0     // Catch:{ all -> 0x0220 }
            r0.BLv(r9)     // Catch:{ all -> 0x0220 }
            goto L_0x01e3
        L_0x01f3:
            r9.A04(r7, r8)     // Catch:{ all -> 0x0220 }
            java.lang.String r0 = "ConsumerRelease-6f007f19e8ad28d6fdadc4404c800a7b"
            X.C60352ns.A01(r7, r5, r0, r8)     // Catch:{ all -> 0x0220 }
            r2.setTransactionSuccessful()     // Catch:{ all -> 0x0220 }
            android.content.SharedPreferences$Editor r0 = r4.edit()     // Catch:{ all -> 0x0220 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r3)     // Catch:{ all -> 0x0220 }
            r0.apply()     // Catch:{ all -> 0x0220 }
            r2.endTransaction()     // Catch:{ all -> 0x0225 }
            X.C22781De.A03()     // Catch:{ all -> 0x0237 }
            goto L_0x0190
        L_0x0210:
            X.C22781De.A03()     // Catch:{ all -> 0x0253 }
            goto L_0x0216
        L_0x0214:
            if (r0 == 0) goto L_0x0133
        L_0x0216:
            monitor-exit(r12)
            return r1
        L_0x0218:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0237 }
            r1.<init>(r0)     // Catch:{ all -> 0x0237 }
            goto L_0x0236
        L_0x0220:
            r0 = move-exception
            r2.endTransaction()     // Catch:{ all -> 0x0225 }
            throw r0     // Catch:{ all -> 0x0225 }
        L_0x0225:
            r1 = move-exception
            X.C22781De.A03()     // Catch:{ all -> 0x0237 }
            goto L_0x0236
        L_0x022a:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0237 }
            r1.<init>(r0)     // Catch:{ all -> 0x0237 }
            goto L_0x0236
        L_0x0232:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0237 }
        L_0x0236:
            throw r1     // Catch:{ all -> 0x0237 }
        L_0x0237:
            r0 = move-exception
            X.C22781De.A03()     // Catch:{ all -> 0x0253 }
            throw r0     // Catch:{ all -> 0x0253 }
        L_0x023c:
            monitor-enter(r12)
            X.1Ev r0 = r13.A00     // Catch:{ all -> 0x0253 }
            if (r0 == 0) goto L_0x0249
            android.database.sqlite.SQLiteDatabase r0 = r0.A00     // Catch:{ all -> 0x0253 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0253 }
            if (r0 != 0) goto L_0x024f
        L_0x0249:
            X.1Ev r0 = r13.A09()     // Catch:{ all -> 0x0253 }
            r13.A00 = r0     // Catch:{ all -> 0x0253 }
        L_0x024f:
            X.1Ev r0 = r13.A00     // Catch:{ all -> 0x0253 }
        L_0x0251:
            monitor-exit(r12)
            return r0
        L_0x0253:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24801Ls.Bbw():X.1Ev");
    }

    @Deprecated
    public synchronized SQLiteDatabase getReadableDatabase() {
        C17960vV.A0F(false, "Use getReadableLoggableDatabase instead");
        return Bbw().A00;
    }

    @Deprecated
    public synchronized SQLiteDatabase getWritableDatabase() {
        C17960vV.A0F(false, "Use getWritableLoggableDatabase instead");
        return Bbw().A00;
    }

    public C24801Ls(Context context, AnonymousClass190 r10, AnonymousClass1Cb r11, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i, new C24821Lu(r10, str));
        this.A03 = context;
        this.A06 = r10;
        if (A07 == null) {
            synchronized (C24801Ls.class) {
                if (A07 == null) {
                    Boolean bool = C17970vW.A03;
                    A07 = new C24831Lv(r10);
                }
            }
        }
        this.A04 = A07;
        this.A05 = r11;
        this.A02 = new ReentrantReadWriteLock();
        this.A01 = new C22561Ci(str);
        setWriteAheadLoggingEnabled(true);
    }

    public static C28781at A00(C24861Ly r0) {
        return r0.A00.get();
    }

    /* renamed from: A05 */
    public C28781at get() {
        return this.A05.A00(this, this.A02.readLock());
    }

    public C28791au A06() {
        return this.A05.A01(this, this.A02.readLock());
    }

    public boolean A07() {
        Cursor rawQuery;
        C28791au A062 = A06();
        try {
            SQLiteDatabase sQLiteDatabase = ((C28801av) A062).A02.A00;
            boolean z = true;
            if (sQLiteDatabase.isWriteAheadLoggingEnabled()) {
                rawQuery = sQLiteDatabase.rawQuery("PRAGMA wal_checkpoint(FULL);", (String[]) null);
                if (rawQuery != null) {
                    if (rawQuery.moveToFirst()) {
                        int i = rawQuery.getInt(0);
                        StringBuilder sb = new StringBuilder();
                        sb.append("BaseSQLiteOpenHelper/wal_checkpoint: ");
                        sb.append(i);
                        sb.append(" ");
                        sb.append(rawQuery.getInt(1));
                        sb.append(" ");
                        sb.append(rawQuery.getInt(2));
                        Log.i(sb.toString());
                        if (i != 0) {
                            z = false;
                        }
                        rawQuery.close();
                    } else {
                        rawQuery.close();
                    }
                }
                A062.close();
                return false;
            }
            A062.close();
            return z;
        } catch (Throwable th) {
            try {
                A062.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public void A08() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.A02;
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        boolean z = true;
        if (reentrantReadWriteLock.getReadHoldCount() <= 0) {
            z = false;
            writeLock.lock();
        } else {
            try {
                Log.w("BaseSQLiteOpenHelper/deleteDatabaseFiles current thread is holding the read lock so deleting db w/o write lock.");
            } catch (Throwable th) {
                if (1 == 0) {
                    writeLock.unlock();
                }
                throw th;
            }
        }
        close();
        String databaseName = getDatabaseName();
        StringBuilder sb = new StringBuilder();
        sb.append("BaseSQLiteOpenHelper/deleteDatabaseFiles for ");
        sb.append(databaseName);
        Log.i(sb.toString());
        if (databaseName != null) {
            File databasePath = this.A03.getDatabasePath(databaseName);
            if (!databasePath.delete()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("BaseSQLiteOpenHelper/failed to delete ");
                sb2.append(databaseName);
                sb2.append(" db");
                Log.w(sb2.toString());
            }
            AnonymousClass1Eu.A07(databasePath, "BaseSQLiteOpenHelper");
        }
        if (!z) {
            writeLock.unlock();
        }
    }

    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        Boolean bool = C17960vV.A01;
        super.onOpen(sQLiteDatabase);
        C24831Lv r1 = this.A04;
        String databaseName = getDatabaseName();
        if (!r1.A01.add(databaseName)) {
            r1.A00.A0E("db-already-created", databaseName, new Throwable());
        }
    }

    public SQLiteDatabase A04() {
        return super.getWritableDatabase();
    }

    public C22561Ci BVq() {
        return this.A01;
    }

    public C23141Ev BXw() {
        return Bbw();
    }

    public void close() {
        super.close();
        C24831Lv r0 = this.A04;
        r0.A01.remove(getDatabaseName());
    }
}
