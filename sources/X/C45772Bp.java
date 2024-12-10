package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.whatsapp.util.Log;
import java.util.Calendar;

/* renamed from: X.2Bp  reason: invalid class name and case insensitive filesystem */
public class C45772Bp extends C195879u4 {
    public final C57752ja A00;
    public final AnonymousClass11C A01;
    public final C19830z4 A02;
    public final C53252cE A03;
    public final AnonymousClass1Q5 A04;
    public final Context A05;
    public final C61452pi A06;
    public final AnonymousClass1R8 A07;
    public final C18030ve A08;
    public final AnonymousClass00H A09;

    private void A00() {
        AlarmManager A052 = this.A01.A05();
        if (A052 == null) {
            Log.w("DailyCronAction/dailyCatchupCron; AlarmManager is null");
            return;
        }
        PendingIntent A032 = A03("com.whatsapp.action.DAILY_CATCHUP_CRON", 536870912);
        if (!A02()) {
            long currentTimeMillis = System.currentTimeMillis();
            C19830z4 r10 = this.A02;
            AnonymousClass00H r9 = r10.A00;
            long j = C17880vN.A0B(r9).getLong("next_daily_cron_catchup", 0);
            long j2 = j - currentTimeMillis;
            if (A032 == null || j2 <= 0 || j2 >= 900000) {
                long j3 = currentTimeMillis + 900000;
                this.A07.A00(A03("com.whatsapp.action.DAILY_CATCHUP_CRON", 0), 1, j3);
                C17880vN.A1D(C19830z4.A00(r10), "next_daily_cron_catchup", j3);
                A87.A02(j3);
                A87.A02(C17880vN.A0B(r9).getLong("last_daily_cron", 0));
                return;
            }
            A87.A02(j);
        } else if (A032 != null) {
            A052.cancel(A032);
            A032.cancel();
        }
    }

    private boolean A02() {
        long j = C17890vO.A0B(this.A02).getLong("last_daily_cron", 0);
        Calendar instance = Calendar.getInstance();
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis();
        long j2 = 86400000 + timeInMillis;
        if (j >= timeInMillis && j < j2) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis <= 0 || currentTimeMillis >= 21600000) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c1, code lost:
        r2 = r11.length();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(android.content.Intent r21) {
        /*
            r20 = this;
            java.lang.String r5 = "daily_cron"
            r4 = 0
            r7 = r20
            X.00H r8 = r7.A09     // Catch:{ all -> 0x0184 }
            java.lang.Object r0 = r8.get()     // Catch:{ all -> 0x0184 }
            X.1O1 r0 = (X.AnonymousClass1O1) r0     // Catch:{ all -> 0x0184 }
            r2 = 1
            r0.A01(r5, r2)     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "DailyCronAction/dailyCron intent="
            r3 = r21
            X.C17900vP.A0Y(r3, r0, r1)     // Catch:{ all -> 0x0184 }
            X.11C r0 = r7.A01     // Catch:{ all -> 0x0184 }
            android.os.PowerManager r1 = r0.A0G()     // Catch:{ all -> 0x0184 }
            if (r1 != 0) goto L_0x002b
            java.lang.String r0 = "DailyCronAction/dailyCron pm=null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0184 }
            r6 = 0
            goto L_0x003a
        L_0x002b:
            java.lang.String r0 = "DailyCronAction#dailyCron"
            android.os.PowerManager$WakeLock r6 = X.C181789Rv.A00(r1, r0, r2)     // Catch:{ all -> 0x0184 }
            r6.setReferenceCounted(r4)     // Catch:{ all -> 0x0184 }
            r0 = 600000(0x927c0, double:2.964394E-318)
            r6.acquire(r0)     // Catch:{ all -> 0x0184 }
        L_0x003a:
            r7.A01()     // Catch:{ all -> 0x017a }
            boolean r0 = r7.A02()     // Catch:{ all -> 0x017a }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "DailyCronAction/dailyCron; too frequent, skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x017a }
            goto L_0x0163
        L_0x004a:
            X.1Q5 r2 = r7.A04     // Catch:{ all -> 0x017a }
            java.lang.String r1 = "daily-cron"
            r0 = 0
            X.2jm r19 = r2.A00(r0, r1)     // Catch:{ all -> 0x017a }
            boolean r0 = com.whatsapp.util.Log.rotate()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x005c
            com.whatsapp.util.Log.compress()     // Catch:{ all -> 0x0175 }
        L_0x005c:
            java.io.File r3 = com.whatsapp.util.Log.logFile     // Catch:{ all -> 0x0175 }
            java.lang.String r2 = ".gz"
            r3.getAbsolutePath()     // Catch:{ all -> 0x0175 }
            java.lang.String r1 = "yyyy-MM-dd"
            java.util.Locale r0 = java.util.Locale.US     // Catch:{ all -> 0x0175 }
            java.text.SimpleDateFormat r13 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0175 }
            r13.<init>(r1, r0)     // Catch:{ all -> 0x0175 }
            java.util.Date r18 = new java.util.Date     // Catch:{ all -> 0x0175 }
            r18.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r17 = r13.toPattern()     // Catch:{ all -> 0x0175 }
            java.lang.String r1 = r3.getName()     // Catch:{ all -> 0x0175 }
            r0 = 46
            int r0 = r1.indexOf(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r0 = r1.substring(r0)     // Catch:{ all -> 0x0175 }
            java.lang.String r12 = X.C17900vP.A0A(r0, r2)     // Catch:{ all -> 0x0175 }
            java.lang.String r2 = r3.getName()     // Catch:{ all -> 0x0175 }
            java.util.Date r0 = new java.util.Date     // Catch:{ all -> 0x0175 }
            r0.<init>()     // Catch:{ all -> 0x0175 }
            java.lang.String r1 = X.C60412nz.A01(r2, r0)     // Catch:{ all -> 0x0175 }
            r0 = 46
            int r0 = r2.indexOf(r0)     // Catch:{ all -> 0x0175 }
            int r0 = r0 + 1
            java.lang.String r11 = r1.substring(r4, r0)     // Catch:{ all -> 0x0175 }
            r10 = 0
            java.io.File r0 = r3.getParentFile()     // Catch:{ all -> 0x0175 }
            java.io.File[] r9 = r0.listFiles()     // Catch:{ all -> 0x0175 }
            if (r9 == 0) goto L_0x0102
            int r3 = r9.length     // Catch:{ all -> 0x0175 }
        L_0x00ad:
            if (r10 >= r3) goto L_0x0102
            r16 = r9[r10]     // Catch:{ all -> 0x0175 }
            java.lang.String r14 = r16.getName()     // Catch:{ all -> 0x0175 }
            boolean r0 = r14.startsWith(r11)     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x00ff
            boolean r0 = r14.endsWith(r12)     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x00ff
            int r2 = r11.length()     // Catch:{ all -> 0x0175 }
            int r0 = r17.length()     // Catch:{ all -> 0x0175 }
            int r1 = r2 + r0
            int r0 = r14.length()     // Catch:{ all -> 0x0175 }
            if (r1 > r0) goto L_0x00ff
            java.lang.String r0 = r14.substring(r2, r1)     // Catch:{ all -> 0x0175 }
            java.util.Date r0 = r13.parse(r0)     // Catch:{ SecurityException | ParseException -> 0x00ff }
            long r14 = r18.getTime()     // Catch:{ SecurityException | ParseException -> 0x00ff }
            long r0 = r0.getTime()     // Catch:{ SecurityException | ParseException -> 0x00ff }
            long r14 = r14 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ SecurityException | ParseException -> 0x00ff }
            r0 = 1
            long r0 = r2.toMillis(r0)     // Catch:{ SecurityException | ParseException -> 0x00ff }
            long r14 = r14 / r0
            long r14 = java.lang.Math.abs(r14)     // Catch:{ SecurityException | ParseException -> 0x00ff }
            r1 = 3
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x00f9
            r16.getAbsolutePath()     // Catch:{ SecurityException | ParseException -> 0x00ff }
            goto L_0x00ff
        L_0x00f9:
            r16.getAbsolutePath()     // Catch:{ SecurityException | ParseException -> 0x00ff }
            r16.delete()     // Catch:{ SecurityException | ParseException -> 0x00ff }
        L_0x00ff:
            int r10 = r10 + 1
            goto L_0x00ad
        L_0x0102:
            X.2ja r12 = r7.A00     // Catch:{ all -> 0x0175 }
            r0 = 604800000(0x240c8400, double:2.988109026E-315)
            X.0z4 r11 = r12.A01     // Catch:{ all -> 0x0175 }
            java.lang.String r3 = "phoneid_last_sync_timestamp"
            boolean r0 = r11.A2b(r3, r0)     // Catch:{ all -> 0x0175 }
            if (r0 != 0) goto L_0x011d
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0175 }
            long r1 = r11.A0W(r3)     // Catch:{ all -> 0x0175 }
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0123
        L_0x011d:
            r12.A00()     // Catch:{ all -> 0x0175 }
            r11.A1i(r3)     // Catch:{ all -> 0x0175 }
        L_0x0123:
            X.2cE r1 = r7.A03     // Catch:{ all -> 0x0175 }
            X.1Cd r0 = r1.A00     // Catch:{ all -> 0x0175 }
            r0.A06()     // Catch:{ all -> 0x0175 }
            boolean r2 = r0.A08     // Catch:{ all -> 0x0175 }
            if (r2 != 0) goto L_0x0133
            java.lang.String r0 = "DailyCronExecutor/executeDailyCron: messageStore not ready, skipping crons that need it."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0175 }
        L_0x0133:
            X.00H r0 = r1.A01     // Catch:{ all -> 0x0175 }
            java.util.Iterator r1 = X.C17890vO.A0h(r0)     // Catch:{ all -> 0x0175 }
        L_0x0139:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0175 }
            if (r0 == 0) goto L_0x0151
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0175 }
            X.1L0 r0 = (X.AnonymousClass1L0) r0     // Catch:{ all -> 0x0175 }
            r0.Bqh()     // Catch:{ all -> 0x0175 }
            if (r2 == 0) goto L_0x0139
            r0.Bqg()     // Catch:{ all -> 0x0175 }
            r0.Bqi()     // Catch:{ all -> 0x0175 }
            goto L_0x0139
        L_0x0151:
            r19.A00()     // Catch:{ all -> 0x017a }
            X.0z4 r0 = r7.A02     // Catch:{ all -> 0x017a }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x017a }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)     // Catch:{ all -> 0x017a }
            java.lang.String r0 = "last_daily_cron"
            X.C17880vN.A1D(r1, r0, r2)     // Catch:{ all -> 0x017a }
        L_0x0163:
            r7.A00()     // Catch:{ all -> 0x0184 }
            if (r6 == 0) goto L_0x016b
            r6.release()     // Catch:{ all -> 0x0184 }
        L_0x016b:
            java.lang.Object r0 = r8.get()
            X.1O1 r0 = (X.AnonymousClass1O1) r0
            r0.A01(r5, r4)
            return
        L_0x0175:
            r0 = move-exception
            r19.A00()     // Catch:{ all -> 0x017a }
            throw r0     // Catch:{ all -> 0x017a }
        L_0x017a:
            r0 = move-exception
            r7.A00()     // Catch:{ all -> 0x0184 }
            if (r6 == 0) goto L_0x0183
            r6.release()     // Catch:{ all -> 0x0184 }
        L_0x0183:
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r1 = move-exception
            X.00H r0 = r7.A09
            java.lang.Object r0 = r0.get()
            X.1O1 r0 = (X.AnonymousClass1O1) r0
            r0.A01(r5, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45772Bp.A05(android.content.Intent):void");
    }

    public C45772Bp(Context context, C57752ja r2, C61452pi r3, AnonymousClass1R8 r4, AnonymousClass11C r5, C19830z4 r6, C53252cE r7, C18030ve r8, AnonymousClass1Q5 r9, AnonymousClass00H r10) {
        super(context);
        this.A05 = context;
        this.A08 = r8;
        this.A07 = r4;
        this.A01 = r5;
        this.A04 = r9;
        this.A03 = r7;
        this.A02 = r6;
        this.A06 = r3;
        this.A00 = r2;
        this.A09 = r10;
    }

    private void A01() {
        Calendar instance = Calendar.getInstance();
        instance.add(5, 1);
        instance.set(14, 0);
        instance.set(13, 0);
        instance.set(12, 0);
        instance.set(11, 0);
        long timeInMillis = instance.getTimeInMillis() + C61452pi.A00(this.A06, 5528, 5529);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DailyCronAction/setupDailyCronAlarm; alarmTimeMillis=");
        C17890vO.A1A(A10, A87.A02(timeInMillis));
        if (!this.A07.A00(A03("com.whatsapp.action.DAILY_CRON", 134217728), 0, timeInMillis)) {
            Log.w("DailyCronAction/setupDailyCronAlarm AlarmManager is null");
        }
    }

    public void A04() {
        A01();
        A00();
    }

    public boolean A06(Intent intent) {
        String action = intent.getAction();
        if ("com.whatsapp.action.DAILY_CRON".equals(action) || "com.whatsapp.action.DAILY_CATCHUP_CRON".equals(action)) {
            return true;
        }
        return false;
    }
}
