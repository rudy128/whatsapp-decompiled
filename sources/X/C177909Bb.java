package X;

import android.content.Context;

/* renamed from: X.9Bb  reason: invalid class name and case insensitive filesystem */
public class C177909Bb extends A34 {
    public final int A00;
    public final long A01;
    public final Context A02;
    public final AnonymousClass11S A03;
    public final C27341Vs A04;
    public final AnonymousClass1NP A05;
    public final AnonymousClass1RW A06;
    public final AnonymousClass11C A07;
    public final A1Q A08;
    public final C175228yM A09;
    public final C27431Wb A0A;
    public final AnonymousClass1Cd A0B;
    public final C171828sL A0C;
    public final C57372iy A0D;
    public final AnonymousClass1O1 A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass11P A0G;

    /* JADX WARNING: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r16) {
        /*
            r15 = this;
            X.11S r0 = r15.A03
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            java.lang.Integer r11 = X.C17880vN.A0l()
            if (r0 == 0) goto L_0x025a
            X.1Cd r0 = r15.A0B
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x025a
            X.A1Q r3 = r15.A08
            int r8 = r15.A00
            r9 = 1
            if (r8 == 0) goto L_0x0102
            X.1NT r5 = r3.A04
            r2 = 0
            X.C18070vi.A0d(r5, r2)
            boolean r0 = r5.A04()
            if (r0 == 0) goto L_0x004e
            X.9JN r4 = X.AnonymousClass9JN.CRYPT15
        L_0x002b:
            X.1Wb r10 = r3.A0C
            java.util.List r1 = r10.A0N(r9)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0102
            java.lang.Object r2 = r1.get(r2)
            java.io.File r2 = (java.io.File) r2
            java.lang.String r0 = r2.getName()
            X.9JN r0 = X.AnonymousClass9QI.A00(r0)
            if (r0 == 0) goto L_0x0102
            int r0 = r0.version
            int r1 = r4.version
            if (r0 != r1) goto L_0x0102
            goto L_0x0051
        L_0x004e:
            X.9JN r4 = X.AnonymousClass9JN.CRYPT14
            goto L_0x002b
        L_0x0051:
            X.9JN r0 = X.AnonymousClass9JN.CRYPT14     // Catch:{ SecurityException -> 0x0102 }
            int r0 = r0.version     // Catch:{ SecurityException -> 0x0102 }
            if (r1 > r0) goto L_0x006c
            X.118 r0 = r3.A08     // Catch:{ SecurityException -> 0x0102 }
            android.content.Context r0 = r0.A00     // Catch:{ SecurityException -> 0x0102 }
            java.io.File r0 = X.AnonymousClass8BX.A0T(r0)     // Catch:{ SecurityException -> 0x0102 }
            long r4 = r0.lastModified()     // Catch:{ SecurityException -> 0x0102 }
        L_0x0063:
            long r1 = r2.lastModified()     // Catch:{ SecurityException -> 0x0102 }
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0102
            goto L_0x007f
        L_0x006c:
            X.1NO r0 = r5.A02     // Catch:{ SecurityException -> 0x0102 }
            X.118 r0 = r0.A00     // Catch:{ SecurityException -> 0x0102 }
            java.io.File r1 = X.AnonymousClass8BR.A0t(r0)     // Catch:{ SecurityException -> 0x0102 }
            java.lang.String r0 = "encrypted_backup.key"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)     // Catch:{ SecurityException -> 0x0102 }
            long r4 = r0.lastModified()     // Catch:{ SecurityException -> 0x0102 }
            goto L_0x0063
        L_0x007f:
            X.0ve r2 = r3.A0D
            r0 = 3190(0xc76, float:4.47E-42)
            long r6 = X.AnonymousClass8BR.A05(r2, r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r6 = r6 * r0
            r0 = 5005(0x138d, float:7.013E-42)
            long r4 = X.AnonymousClass8BR.A05(r2, r0)
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r4 = r4 * r0
            long r6 = r6 + r4
            java.util.List r1 = r10.A0N(r9)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0102
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Object r0 = X.C108955ca.A0p(r1)
            java.io.File r0 = (java.io.File) r0
            long r0 = r0.lastModified()
            long r4 = r4 - r0
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0102
            r1 = 3189(0xc75, float:4.469E-42)
            X.0vf r0 = X.C18040vf.A02
            int r6 = X.C18020vd.A00(r0, r2, r1)
            X.2tR r0 = r3.A05
            X.1Cd r0 = r0.A00     // Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
            X.1at r7 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
            r0 = r7
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x00f8 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = "SELECT count(*) as count FROM backup_changes"
            java.lang.String r0 = "BackupChangesStore/COUNT_MODIFICATIONS"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x00f8 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x00ec }
            if (r0 == 0) goto L_0x00e3
            java.lang.String r0 = "count"
            long r4 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x00ec }
            r2.close()     // Catch:{ all -> 0x00f8 }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
            goto L_0x010d
        L_0x00e3:
            r2.close()     // Catch:{ all -> 0x00f8 }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
            r4 = -1
            goto L_0x010d
        L_0x00ec:
            r1 = move-exception
            if (r2 == 0) goto L_0x00f7
            r2.close()     // Catch:{ all -> 0x00f3 }
            goto L_0x00f7
        L_0x00f3:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00f8 }
        L_0x00f7:
            throw r1     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x00fd }
            goto L_0x0101
        L_0x00fd:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
        L_0x0101:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0106 }
        L_0x0102:
            r3.A0T = r9
        L_0x0104:
            r4 = 1
            goto L_0x0120
        L_0x0106:
            java.lang.String r0 = "BackupChangesStore/corrupt db"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = -1
        L_0x010d:
            long r1 = (long) r6
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x013f
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x013f
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r4 = 0
            if (r0 == 0) goto L_0x0120
            r4 = 2
            r3.A0T = r4
        L_0x0120:
            if (r4 == 0) goto L_0x025a
            X.11C r0 = r15.A07
            android.os.PowerManager r1 = r0.A0G()
            r7 = 1
            if (r1 != 0) goto L_0x0138
            java.lang.String r0 = "BackupAsyncTask/backup PowerManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r6 = 0
        L_0x0131:
            java.lang.String r14 = "BackupAsyncTask/backup/local/wl/release"
            java.lang.String r5 = "BackupAsyncTask/backup/local/wl/releasing "
            if (r6 == 0) goto L_0x0146
            goto L_0x0143
        L_0x0138:
            java.lang.String r0 = "backupdb"
            android.os.PowerManager$WakeLock r6 = X.C181789Rv.A00(r1, r0, r9)
            goto L_0x0131
        L_0x013f:
            r0 = 3
            r3.A0T = r0
            goto L_0x0104
        L_0x0143:
            r6.acquire()     // Catch:{ Exception -> 0x0226 }
        L_0x0146:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/wl/acquire "
            X.C17900vP.A0Y(r6, r0, r1)     // Catch:{ Exception -> 0x0226 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0226 }
            android.content.Context r2 = r15.A02     // Catch:{ Exception -> 0x0226 }
            X.1Vs r1 = r15.A04     // Catch:{ Exception -> 0x0226 }
            X.2iy r0 = r15.A0D     // Catch:{ Exception -> 0x0226 }
            X.A85.A03(r2, r1, r0)     // Catch:{ Exception -> 0x0226 }
            java.util.ArrayList r3 = X.AnonymousClass000.A13()     // Catch:{ Exception -> 0x0226 }
            X.00H r0 = r15.A0F     // Catch:{ Exception -> 0x0226 }
            java.util.Iterator r11 = X.C17890vO.A0h(r0)     // Catch:{ Exception -> 0x0226 }
        L_0x0166:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x0226 }
            if (r0 == 0) goto L_0x01a0
            java.lang.Object r2 = r11.next()     // Catch:{ Exception -> 0x0226 }
            X.1NZ r2 = (X.AnonymousClass1NZ) r2     // Catch:{ Exception -> 0x0226 }
            java.lang.String r10 = r2.A0M()     // Catch:{ Exception -> 0x0226 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/"
            X.C17900vP.A0f(r0, r10, r1)     // Catch:{ Exception -> 0x0226 }
            X.8sL r0 = r15.A0C     // Catch:{ Exception -> 0x0226 }
            X.A26 r2 = r2.A0F(r0)     // Catch:{ Exception -> 0x0226 }
            r3.add(r2)     // Catch:{ Exception -> 0x0226 }
            int r0 = r2.A01     // Catch:{ Exception -> 0x0226 }
            if (r0 == r9) goto L_0x0196
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/result "
            X.C17900vP.A0Y(r2, r0, r1)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0166
        L_0x0196:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/failed-to-generate-backup "
            X.C17900vP.A0e(r0, r10, r1)     // Catch:{ Exception -> 0x0226 }
            goto L_0x0166
        L_0x01a0:
            X.1NP r0 = r15.A05     // Catch:{ Exception -> 0x0226 }
            android.content.SharedPreferences$Editor r9 = X.AnonymousClass8BT.A04(r0)     // Catch:{ Exception -> 0x0226 }
            java.util.Iterator r11 = r3.iterator()     // Catch:{ Exception -> 0x0226 }
        L_0x01aa:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x0226 }
            if (r0 == 0) goto L_0x01ef
            java.lang.Object r10 = r11.next()     // Catch:{ Exception -> 0x0226 }
            X.A26 r10 = (X.A26) r10     // Catch:{ Exception -> 0x0226 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r3 = r10.A05     // Catch:{ Exception -> 0x0226 }
            r1.append(r3)     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = "_backup_status"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x0226 }
            int r0 = r10.A01     // Catch:{ Exception -> 0x0226 }
            r9.putInt(r1, r0)     // Catch:{ Exception -> 0x0226 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r3)     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = "_backup_size"
            java.lang.String r2 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x0226 }
            long r0 = r10.A02     // Catch:{ Exception -> 0x0226 }
            r9.putLong(r2, r0)     // Catch:{ Exception -> 0x0226 }
            java.lang.Long r0 = r10.A04     // Catch:{ Exception -> 0x0226 }
            if (r0 == 0) goto L_0x01aa
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0226 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A11(r3)     // Catch:{ Exception -> 0x0226 }
            java.lang.String r2 = "_backup_media_size"
            java.lang.String r2 = X.AnonymousClass000.A0y(r2, r3)     // Catch:{ Exception -> 0x0226 }
            r9.putLong(r2, r0)     // Catch:{ Exception -> 0x0226 }
            goto L_0x01aa
        L_0x01ef:
            r9.apply()     // Catch:{ Exception -> 0x0226 }
            X.1Wb r3 = r15.A0A     // Catch:{ Exception -> 0x0226 }
            r0 = 0
            X.AMK r2 = new X.AMK     // Catch:{ Exception -> 0x0226 }
            r2.<init>(r15, r0)     // Catch:{ Exception -> 0x0226 }
            r1 = 29
            X.3Bq r0 = new X.3Bq     // Catch:{ Exception -> 0x0226 }
            r0.<init>(r15, r1)     // Catch:{ Exception -> 0x0226 }
            int r7 = r3.A0F(r2, r0, r4, r8)     // Catch:{ Exception -> 0x0226 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0226 }
            java.lang.String r0 = "BackupAsyncTask/backup/local/msgstore/result/"
            X.C17900vP.A0j(r0, r1, r7)     // Catch:{ Exception -> 0x0226 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0226 }
            long r3 = r15.A01     // Catch:{ Exception -> 0x0226 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x022c
            long r8 = r8 - r12
            long r3 = r3 - r8
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x022c
            if (r7 != 0) goto L_0x022c
            android.os.SystemClock.sleep(r3)     // Catch:{ Exception -> 0x0226 }
            goto L_0x022c
        L_0x0226:
            r1 = move-exception
            java.lang.String r0 = "BackupAsyncTask/backup/local/error"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0249 }
        L_0x022c:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0Y(r6, r5, r0)
            if (r6 == 0) goto L_0x023b
            r6.release()
            com.whatsapp.util.Log.i((java.lang.String) r14)
        L_0x023b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BackupAsyncTask/backup/local/result = "
            X.C17900vP.A0j(r0, r1, r7)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            return r11
        L_0x0249:
            r1 = move-exception
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            X.C17900vP.A0Y(r6, r5, r0)
            if (r6 == 0) goto L_0x0259
            r6.release()
            com.whatsapp.util.Log.i((java.lang.String) r14)
        L_0x0259:
            throw r1
        L_0x025a:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177909Bb.A0G(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        if (r1.isFinishing() == false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "BackupAsyncTask/backup/done "
            X.C17900vP.A0Y(r4, r0, r1)
            X.1RW r0 = r3.A06
            X.1RX r1 = r0.A00()
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x0033
            X.BCs r1 = r1.A00()
        L_0x0019:
            r1.Bqx()
        L_0x001c:
            X.8yM r2 = r3.A09
            if (r4 == 0) goto L_0x0031
            int r1 = r4.intValue()
        L_0x0024:
            r0 = 3
            X.C20736AWr.A00(r2, r1, r0)
            X.1O1 r2 = r3.A0E
            java.lang.String r1 = "db_backup"
            r0 = 0
            r2.A01(r1, r0)
            return
        L_0x0031:
            r1 = 1
            goto L_0x0024
        L_0x0033:
            X.BCs r1 = r1.A00
            if (r1 == 0) goto L_0x001c
            boolean r0 = r1.isFinishing()
            if (r0 != 0) goto L_0x001c
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C177909Bb.A0H(java.lang.Object):void");
    }

    public /* bridge */ /* synthetic */ void A0I(Object[] objArr) {
        Integer[] numArr = (Integer[]) objArr;
        if (numArr != null) {
            C20736AWr.A00(this.A09, numArr[0].intValue(), 4);
        }
    }

    public C177909Bb(Context context, AnonymousClass11S r4, C27341Vs r5, AnonymousClass1NP r6, AnonymousClass1RW r7, AnonymousClass11C r8, AnonymousClass11P r9, A1Q a1q, C175228yM r11, C27431Wb r12, AnonymousClass1Cd r13, C171828sL r14, C57372iy r15, AnonymousClass1O1 r16, AnonymousClass00H r17, int i, long j) {
        this.A08 = a1q;
        this.A00 = i;
        this.A0G = r9;
        this.A02 = context;
        this.A03 = r4;
        this.A01 = j;
        this.A0F = r17;
        this.A07 = r8;
        this.A0C = r14;
        this.A04 = r5;
        this.A0A = r12;
        this.A0B = r13;
        this.A09 = r11;
        this.A0E = r16;
        this.A05 = r6;
        this.A0D = r15;
        this.A06 = r7;
    }
}
