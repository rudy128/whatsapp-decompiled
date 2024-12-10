package X;

import android.os.ConditionVariable;
import com.whatsapp.util.Log;
import java.util.Locale;

public class ARA implements BCU {
    public boolean A00 = false;
    public final C171828sL A01;
    public final ConditionVariable A02;
    public final /* synthetic */ A1Q A03;

    public ARA(ConditionVariable conditionVariable, A1Q a1q, C171828sL r4) {
        this.A03 = a1q;
        this.A02 = conditionVariable;
        this.A01 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a8, code lost:
        if (r1.intValue() != 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        if (X.AnonymousClass8BV.A02(r0.A0I) != 0) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BlD(int r14) {
        /*
            r13 = this;
            X.A1Q r0 = r13.A03
            X.8yM r1 = r0.A0B
            r1.unregisterObserver(r13)
            boolean r3 = r0.A01
            r2 = 0
            if (r14 != 0) goto L_0x0029
            X.118 r1 = r0.A08
            android.content.Context r1 = r1.A00
            boolean r1 = X.C41361wE.A09(r1)
            if (r1 == 0) goto L_0x0029
            X.11S r1 = r0.A03
            boolean r1 = r1.A0N()
            if (r1 != 0) goto L_0x0029
            if (r3 == 0) goto L_0x0136
            X.00H r1 = r0.A0I
            int r1 = X.AnonymousClass8BV.A02(r1)
            if (r1 == 0) goto L_0x0029
        L_0x0028:
            r2 = 1
        L_0x0029:
            r3 = 1
            if (r2 == 0) goto L_0x0133
            boolean r1 = r0.A01
            if (r1 == 0) goto L_0x0114
            r9 = 1
        L_0x0032:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "local/backup/gdrive/random-wait-time-in-secs/"
            X.C17900vP.A0m(r1, r2, r9)
            X.0ve r8 = r0.A0D
            X.00H r1 = X.C20134A8u.A00
            r2 = 603(0x25b, float:8.45E-43)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r8, r2)
            if (r1 == 0) goto L_0x00cd
            X.19K r1 = r0.A0H
            X.A7W r4 = X.AnonymousClass8BR.A0D(r1)
            X.1NT r6 = r0.A04
            X.0z4 r7 = r0.A09
            X.00H r1 = r0.A0I
            X.1NP r5 = X.AnonymousClass8BS.A0A(r1)
            boolean r11 = r0.A01
            X.C20134A8u.A05(r4, r5, r6, r7, r8, r9, r11)
            r5 = 1
        L_0x005f:
            r2 = 0
            r0.A01 = r2
            boolean r1 = r13.A00
            if (r1 == 0) goto L_0x006d
            X.1KB r1 = r0.A02
            r1.A04()
            r13.A00 = r2
        L_0x006d:
            r4 = 3
            if (r14 != r4) goto L_0x00c7
            X.118 r1 = r0.A08
            android.content.Context r1 = r1.A00
            X.A85.A02(r1)
        L_0x0077:
            android.os.ConditionVariable r1 = r13.A02
            if (r1 == 0) goto L_0x007e
            r1.open()
        L_0x007e:
            int r1 = r0.A0T
            if (r1 == r3) goto L_0x008b
            int r2 = r0.A0T
            r1 = 2
            if (r2 == r1) goto L_0x008b
            int r1 = r0.A0T
            if (r1 != r4) goto L_0x00c6
        L_0x008b:
            X.8sL r3 = r13.A01
            int r1 = r0.A0T
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.A04 = r1
            int r1 = X.A8L.A00(r14)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.A08 = r1
            java.lang.Integer r1 = r3.A09
            if (r1 == 0) goto L_0x00aa
            int r1 = r1.intValue()
            r2 = 1
            if (r1 == 0) goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            X.00H r1 = r0.A0I
            X.1NP r1 = X.AnonymousClass8BS.A0A(r1)
            int r1 = X.C20134A8u.A00(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.A02 = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            r3.A00 = r1
            X.18K r0 = r0.A0E
            r0.CC7(r3)
        L_0x00c6:
            return
        L_0x00c7:
            r1 = 4
            if (r14 != r1) goto L_0x0077
            r0.A00 = r3
            goto L_0x0077
        L_0x00cd:
            boolean r2 = r0.A01
            X.00H r1 = r0.A0J
            r1.get()
            X.118 r1 = r0.A08
            android.content.Context r6 = r1.A00
            java.lang.String r1 = "action_backup"
            android.content.Intent r5 = X.AnonymousClass1LU.A1M(r6, r1)
            if (r2 == 0) goto L_0x0111
            java.lang.String r2 = "user_initiated"
        L_0x00e2:
            java.lang.String r1 = "backup_mode"
            r5.putExtra(r1, r2)
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            r1 = 0
            if (r4 < r2) goto L_0x010c
            android.app.PendingIntent r7 = X.C1408573i.A02(r6, r5)
        L_0x00f2:
            X.1R8 r6 = r0.A06
            long r1 = android.os.SystemClock.elapsedRealtime()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r4
            long r1 = r1 + r9
            r5 = 2
            X.1R9 r4 = r6.A00
            boolean r5 = r4.A01(r7, r5, r1)
            if (r5 != 0) goto L_0x005f
            java.lang.String r1 = "LocalBackupManager/runLocalBackup/onAfterBackup AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            goto L_0x005f
        L_0x010c:
            android.app.PendingIntent r7 = X.C1408573i.A03(r6, r5, r1)
            goto L_0x00f2
        L_0x0111:
            java.lang.String r2 = "automated"
            goto L_0x00e2
        L_0x0114:
            java.util.Random r6 = new java.util.Random
            r6.<init>()
            X.0ve r2 = r0.A0D
            r1 = 0
            X.C18070vi.A0d(r2, r1)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MINUTES
            r1 = 956(0x3bc, float:1.34E-42)
            long r1 = X.AnonymousClass8BR.A05(r2, r1)
            long r4 = r4.toSeconds(r1)
            int r1 = (int) r4
            int r1 = r6.nextInt(r1)
            long r9 = (long) r1
            goto L_0x0032
        L_0x0133:
            r5 = 0
            goto L_0x005f
        L_0x0136:
            X.0ve r6 = r0.A0D
            X.0z4 r3 = r0.A09
            X.00H r1 = r0.A0I
            X.1NP r5 = X.AnonymousClass8BS.A0A(r1)
            X.00H r1 = X.C20134A8u.A00
            long r7 = java.lang.System.currentTimeMillis()
            int r4 = r5.A03()
            java.lang.String r1 = r3.A0f()
            long r9 = r3.A0U(r1)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0169
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "gdrive-util/should-backup/last-backup-timestamp-is-in-future/"
            r3.append(r1)
            r3.append(r9)
            java.lang.String r1 = " , ignoring it"
            X.C17890vO.A1A(r3, r1)
            r9 = -1
        L_0x0169:
            if (r4 == 0) goto L_0x0199
            r3 = 1
            if (r4 == r3) goto L_0x0028
            r1 = 2
            if (r4 == r1) goto L_0x018d
            r1 = 3
            if (r4 == r1) goto L_0x019c
            r1 = 4
            if (r4 == r1) goto L_0x018a
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r1 = "gdrive-util/should-backup frequency has unexpected value: "
            r3.append(r1)
            r3.append(r4)
            java.lang.String r1 = ", no auto backups will be performed."
            X.C17890vO.A19(r3, r1)
            goto L_0x0029
        L_0x018a:
            java.lang.String r1 = "gdrive-util/should-backup/frequency/manual"
            goto L_0x01b9
        L_0x018d:
            r11 = 604800000(0x240c8400, double:2.988109026E-315)
            boolean r1 = X.C20134A8u.A08(r5, r6, r7, r9, r11)
            if (r1 != 0) goto L_0x0028
            java.lang.String r1 = "gdrive-util/should-backup/frequency/weekly its not 7 days since the last successful backup."
            goto L_0x01b9
        L_0x0199:
            java.lang.String r1 = "gdrive-util/should-backup/frequency/none"
            goto L_0x01b9
        L_0x019c:
            r11 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            boolean r1 = X.C20134A8u.A08(r5, r6, r7, r9, r11)
            if (r1 != 0) goto L_0x0028
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = new java.lang.Object[r3]
            long r7 = r7 - r9
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r7 = r7 / r3
            X.AnonymousClass3MX.A1S(r5, r2, r7)
            java.lang.String r1 = "gdrive-util/should-backup/frequency/monthly its only %d days since the last successful backup."
            java.lang.String r1 = java.lang.String.format(r6, r1, r5)
        L_0x01b9:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ARA.BlD(int):void");
    }

    public void BmT() {
        A1Q a1q = this.A03;
        a1q.A00 = false;
        a1q.A02.A07(2131886815, 2131886813);
        this.A00 = true;
    }

    public void Bqa() {
        Log.i("app/backup/critical part completed");
        this.A03.A02.A0J(new C70573Bq(this, 33));
    }

    public void C24(int i) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[1];
        boolean A1b = C72453Mb.A1b(objArr, i);
        String format = String.format(locale, "app/backup/progress/%d%%", objArr);
        int i2 = 5;
        if (i % 10 == 0) {
            i2 = 3;
        }
        Log.log(i2, format);
        if (this.A00) {
            A1Q a1q = this.A03;
            AnonymousClass1KB r4 = a1q.A02;
            String A0q = C17880vN.A0q(a1q.A08.A00, AnonymousClass8BX.A0Z(a1q.A0A, i), new Object[1], A1b ? 1 : 0, 2131886814);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("app/progress-spinner/update-message dt=");
            C17900vP.A0b(r4.A00, A10);
            AnonymousClass1KB.A01(r4, "updateProgressSpinnerMessage");
            C54062dX r0 = r4.A01;
            if (r0 != null) {
                r0.A00 = A0q;
            } else {
                Log.w("app/progress-spinner/update-message no progress data");
            }
            AnonymousClass1FR r02 = r4.A00;
            if (r02 != null) {
                r02.CRG(A0q);
            }
            Log.i("app/progress-spinner/update-message done");
        }
    }
}
