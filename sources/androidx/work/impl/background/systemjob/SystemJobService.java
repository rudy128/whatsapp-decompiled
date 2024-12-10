package androidx.work.impl.background.systemjob;

import X.A5Z;
import X.A7W;
import X.AnonymousClass000;
import X.AnonymousClass8BW;
import X.AnonymousClass8BX;
import X.AnonymousClass9OH;
import X.AnonymousClass9UL;
import X.AnonymousClass9u6;
import X.C17880vN;
import X.C193279pp;
import X.C20356AHm;
import X.C20359AHp;
import X.C22398B6b;
import X.C22399B6c;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import java.util.Map;

public class SystemJobService extends JobService implements C22398B6b {
    public static final String A04 = A5Z.A01("SystemJobService");
    public C22399B6c A00;
    public A7W A01;
    public final AnonymousClass9u6 A02 = new AnonymousClass9u6();
    public final Map A03 = C17880vN.A11();

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r3 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        if (r3 < 24) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0065, code lost:
        r6 = new X.C185329cP();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006e, code lost:
        if (X.C196359uv.A00(r9) == null) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        r6.A02 = java.util.Arrays.asList(X.C196359uv.A00(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007e, code lost:
        if (X.C196359uv.A01(r9) == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0080, code lost:
        r6.A01 = java.util.Arrays.asList(X.C196359uv.A01(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r3 < 28) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        r6.A00 = X.AnonymousClass9OG.A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        r4 = r8.A00;
        r3 = r8.A02.A01(r2);
        r4 = (X.C20356AHm) r4;
        X.C18070vi.A0d(r3, 0);
        r4.A01.BKq(new X.C27081DTg(r3, r4.A00, r6, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00af, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b0, code lost:
        r6 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            X.A7W r0 = r8.A01
            r5 = 1
            r1 = 0
            if (r0 != 0) goto L_0x0015
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = A04
            java.lang.String r0 = "WorkManager is not initialized; requesting retry."
            r3.A03(r2, r0)
            r8.jobFinished(r9, r5)
            return r1
        L_0x0015:
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r2 = r9.getExtras()     // Catch:{ NullPointerException -> 0x00b5 }
            if (r2 == 0) goto L_0x00b5
            boolean r0 = r2.containsKey(r3)     // Catch:{ NullPointerException -> 0x00b5 }
            if (r0 == 0) goto L_0x00b5
            java.lang.String r3 = r2.getString(r3)     // Catch:{ NullPointerException -> 0x00b5 }
            java.lang.String r0 = "EXTRA_WORK_SPEC_GENERATION"
            int r0 = r2.getInt(r0)     // Catch:{ NullPointerException -> 0x00b5 }
            X.9pp r2 = new X.9pp     // Catch:{ NullPointerException -> 0x00b5 }
            r2.<init>(r3, r0)     // Catch:{ NullPointerException -> 0x00b5 }
            java.util.Map r7 = r8.A03
            monitor-enter(r7)
            boolean r0 = r7.containsKey(r2)     // Catch:{ all -> 0x00b2 }
            if (r0 == 0) goto L_0x004c
            X.A5Z r5 = X.A5Z.A00()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = A04     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "Job is already being executed by SystemJobService: "
            X.AnonymousClass8BX.A12(r5, r2, r0, r4, r3)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r7)     // Catch:{ all -> 0x00b2 }
            return r1
        L_0x004c:
            X.A5Z r6 = X.A5Z.A00()     // Catch:{ all -> 0x00b2 }
            java.lang.String r4 = A04     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = "onStartJob for "
            X.AnonymousClass8BX.A12(r6, r2, r0, r4, r3)     // Catch:{ all -> 0x00b2 }
            r7.put(r2, r9)     // Catch:{ all -> 0x00b2 }
            monitor-exit(r7)     // Catch:{ all -> 0x00b2 }
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 24
            if (r3 < r0) goto L_0x00b0
            X.9cP r6 = new X.9cP
            r6.<init>()
            android.net.Uri[] r0 = X.C196359uv.A00(r9)
            if (r0 == 0) goto L_0x007a
            android.net.Uri[] r0 = X.C196359uv.A00(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r6.A02 = r0
        L_0x007a:
            java.lang.String[] r0 = X.C196359uv.A01(r9)
            if (r0 == 0) goto L_0x008a
            java.lang.String[] r0 = X.C196359uv.A01(r9)
            java.util.List r0 = java.util.Arrays.asList(r0)
            r6.A01 = r0
        L_0x008a:
            r0 = 28
            if (r3 < r0) goto L_0x0094
            android.net.Network r0 = X.AnonymousClass9OG.A00(r9)
            r6.A00 = r0
        L_0x0094:
            X.B6c r4 = r8.A00
            X.9u6 r0 = r8.A02
            X.9UL r3 = r0.A01(r2)
            X.AHm r4 = (X.C20356AHm) r4
            X.C18070vi.A0d(r3, r1)
            X.AHp r2 = r4.A00
            r0 = 10
            X.DTg r1 = new X.DTg
            r1.<init>(r3, r2, r6, r0)
            X.3Kb r0 = r4.A01
            r0.BKq(r1)
            return r5
        L_0x00b0:
            r6 = 0
            goto L_0x0094
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00b2 }
            throw r0
        L_0x00b5:
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = A04
            java.lang.String r0 = "WorkSpec id not found!"
            r3.A04(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        int i;
        if (this.A01 == null) {
            A5Z.A00().A03(A04, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras != null && extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                C193279pp r4 = new C193279pp(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
                AnonymousClass8BX.A12(A5Z.A00(), r4, "onStopJob for ", A04, AnonymousClass000.A10());
                Map map = this.A03;
                synchronized (map) {
                    map.remove(r4);
                }
                AnonymousClass9UL A002 = this.A02.A00(r4);
                if (A002 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        i = AnonymousClass9OH.A00(jobParameters);
                    } else {
                        i = -512;
                    }
                    this.A00.COf(A002, i);
                }
                C20359AHp aHp = this.A01.A03;
                String str = r4.A01;
                synchronized (aHp.A09) {
                    contains = aHp.A07.contains(str);
                }
                return !contains;
            }
        } catch (NullPointerException unused) {
        }
        A5Z.A00().A04(A04, "WorkSpec id not found!");
        return false;
    }

    public void BtY(C193279pp r5, boolean z) {
        JobParameters jobParameters;
        A5Z A002 = A5Z.A00();
        String str = A04;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append(r5.A01);
        AnonymousClass8BW.A16(A002, " executed on JobScheduler", str, A10);
        Map map = this.A03;
        synchronized (map) {
            jobParameters = (JobParameters) map.remove(r5);
        }
        this.A02.A00(r5);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            A7W A002 = A7W.A00(getApplicationContext());
            this.A01 = A002;
            C20359AHp aHp = A002.A03;
            this.A00 = new C20356AHm(aHp, A002.A06);
            aHp.A02(this);
        } catch (IllegalStateException e) {
            if (Application.class.equals(getApplication().getClass())) {
                A5Z.A00().A06(A04, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        A7W a7w = this.A01;
        if (a7w != null) {
            a7w.A03.A03(this);
        }
    }
}
