package X;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;

public class A4T {
    public static final String A02 = A5Z.A01("SystemJobInfoConverter");
    public final ComponentName A00;
    public final E0T A01;

    public static JobInfo.TriggerContentUri A00(C192149nt r3) {
        return new JobInfo.TriggerContentUri(r3.A00, r3.A01 ? 1 : 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ad, code lost:
        if (r6 >= 24) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        if (r6 >= 26) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.job.JobInfo A01(X.A2t r12, int r13) {
        /*
            r11 = this;
            X.A6e r8 = r12.A0B
            android.os.PersistableBundle r4 = new android.os.PersistableBundle
            r4.<init>()
            java.lang.String r1 = "EXTRA_WORK_SPEC_ID"
            java.lang.String r0 = r12.A0M
            r4.putString(r1, r0)
            java.lang.String r1 = "EXTRA_WORK_SPEC_GENERATION"
            int r0 = r12.A0K
            r4.putInt(r1, r0)
            java.lang.String r6 = "EXTRA_IS_PERIODIC"
            long r0 = r12.A06
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1O(r5)
            r4.putBoolean(r6, r0)
            android.content.ComponentName r0 = r11.A00
            android.app.job.JobInfo$Builder r1 = new android.app.job.JobInfo$Builder
            r1.<init>(r13, r0)
            boolean r0 = r8.A02
            android.app.job.JobInfo$Builder r0 = r1.setRequiresCharging(r0)
            boolean r5 = r8.A03
            android.app.job.JobInfo$Builder r0 = r0.setRequiresDeviceIdle(r5)
            android.app.job.JobInfo$Builder r7 = r0.setExtras(r4)
            java.lang.Integer r10 = r8.A00
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto L_0x00b0
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r10 != r0) goto L_0x00b0
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r0 = 25
            android.net.NetworkRequest$Builder r0 = r1.addCapability(r0)
            android.net.NetworkRequest r0 = r0.build()
            r7.setRequiredNetwork(r0)
        L_0x0059:
            r9 = 0
            r10 = 1
            if (r5 != 0) goto L_0x006a
            java.lang.Integer r1 = r12.A0E
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r4 = 1
            if (r1 != r0) goto L_0x0065
            r4 = 0
        L_0x0065:
            long r0 = r12.A03
            r7.setBackoffCriteria(r0, r4)
        L_0x006a:
            long r0 = r12.A00()
            long r4 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            long r4 = java.lang.Math.max(r0, r2)
            r0 = 28
            if (r6 <= r0) goto L_0x00a8
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x00a8
            boolean r0 = r12.A0J
            if (r0 != 0) goto L_0x0086
            r7.setImportantWhileForeground(r10)
        L_0x0086:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L_0x00f8
            java.util.Set r0 = r8.A02()
            java.util.Iterator r1 = r0.iterator()
        L_0x0094:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r0 = r1.next()
            X.9nt r0 = (X.C192149nt) r0
            android.app.job.JobInfo$TriggerContentUri r0 = A00(r0)
            r7.addTriggerContentUri(r0)
            goto L_0x0094
        L_0x00a8:
            r7.setMinimumLatency(r4)
            r0 = 24
            if (r6 < r0) goto L_0x00f8
            goto L_0x0086
        L_0x00b0:
            int r9 = r10.intValue()
            r4 = 1
            r0 = 0
            r1 = 0
            if (r9 == r0) goto L_0x00c8
            r1 = 2
            if (r9 == r4) goto L_0x00e8
            r0 = 3
            if (r9 == r1) goto L_0x00c8
            r1 = 4
            if (r9 == r0) goto L_0x00cc
            if (r9 != r1) goto L_0x00d2
            r0 = 26
            if (r6 < r0) goto L_0x00d2
        L_0x00c8:
            r7.setRequiredNetworkType(r1)
            goto L_0x0059
        L_0x00cc:
            r0 = 24
            if (r6 < r0) goto L_0x00d2
            r1 = 3
            goto L_0x00c8
        L_0x00d2:
            X.A5Z r9 = X.A5Z.A00()
            java.lang.String r4 = A02
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "API version too low. Cannot convert network type value "
            r1.append(r0)
            java.lang.String r0 = X.AnonymousClass9OD.A00(r10)
            X.AnonymousClass8BW.A16(r9, r0, r4, r1)
        L_0x00e8:
            r1 = 1
            goto L_0x00c8
        L_0x00ea:
            long r0 = r8.A01()
            r7.setTriggerContentUpdateDelay(r0)
            long r0 = r8.A00()
            r7.setTriggerContentMaxDelay(r0)
        L_0x00f8:
            r7.setPersisted(r9)
            r0 = 26
            if (r6 < r0) goto L_0x0109
            boolean r0 = r8.A01
            r7.setRequiresBatteryNotLow(r0)
            boolean r0 = r8.A04
            r7.setRequiresStorageNotLow(r0)
        L_0x0109:
            int r0 = r12.A02
            boolean r1 = X.AnonymousClass000.A1R(r0)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0114
            r9 = 1
        L_0x0114:
            r0 = 31
            if (r6 < r0) goto L_0x0123
            boolean r0 = r12.A0J
            if (r0 == 0) goto L_0x0123
            if (r1 != 0) goto L_0x0123
            if (r9 != 0) goto L_0x0123
            r7.setExpedited(r10)
        L_0x0123:
            android.app.job.JobInfo r0 = r7.build()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A4T.A01(X.A2t, int):android.app.job.JobInfo");
    }

    public A4T(Context context, E0T e0t) {
        this.A01 = e0t;
        this.A00 = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
