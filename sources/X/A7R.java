package X;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class A7R {
    public CancellationSignal A00;
    public CountDownLatch A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass11C A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final C203911y A06;
    public final A8U A07;
    public final C20006A2w A08;
    public final C196129uV A09;
    public final C196169uZ A0A;
    public final C192059nj A0B;
    public final AW7 A0C;
    public final C47882Ki A0D;
    public final C186039dY A0E;
    public final C196139uW A0F;
    public final C33841jT A0G;
    public final AnonymousClass1Ez A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final List A0K = AnonymousClass000.A13();
    public final AnonymousClass11P A0L;
    public final C184639bH A0M;
    public final AnonymousClass00H A0N;

    public static synchronized long A00(A7R a7r) {
        long A012;
        synchronized (a7r) {
            A012 = a7r.A0H.A01();
        }
        return A012;
    }

    public static synchronized void A02(A7R a7r) {
        synchronized (a7r) {
            a7r.A0H.A02();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r1 == false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A09() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x000f }
            if (r0 == 0) goto L_0x000c
            boolean r1 = r0.isCanceled()     // Catch:{ all -> 0x000f }
            r0 = 1
            if (r1 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            monitor-exit(r2)
            return r0
        L_0x000f:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7R.A09():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0075, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0078, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C171498ro A01(X.A7R r12, int r13) {
        /*
            X.9uV r3 = r12.A09
            java.lang.String r1 = r3.A02()
            X.8ro r10 = new X.8ro
            r10.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r10.A05 = r0
            r10.A09 = r1
            java.lang.Integer r0 = X.C17880vN.A0h()
            r10.A03 = r0
            r0 = 10
            r4 = 1000(0x3e8, double:4.94E-321)
            if (r0 != r13) goto L_0x007d
            long r0 = A00(r12)
            long r0 = r0 / r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A07 = r0
            X.00H r0 = r12.A0I
            java.lang.Object r11 = r0.get()
            X.1a6 r11 = (X.AnonymousClass1a6) r11
            X.00H r0 = r12.A0N
            java.lang.Object r0 = r0.get()
            X.1Ro r0 = (X.C26291Ro) r0
            java.lang.Long r8 = r0.A00()
            X.9uW r0 = r12.A0F
            long r6 = r0.A00()
            X.1at r3 = X.C19961A0s.A00(r0)
            r0 = r3
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0076 }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x0076 }
            java.lang.String r1 = "SELECT  SUM(f.file_size) AS media_size FROM exported_files_metadata AS f WHERE f.required = 0"
            java.lang.String r0 = "XPM_EXPORT_TOTAL_MEDIA_SIZE"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x0076 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x0060
            r2.close()     // Catch:{ all -> 0x0076 }
            goto L_0x00e5
        L_0x0060:
            java.lang.String r0 = "media_size"
            long r4 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x006f }
            r2.close()     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x00ec
            r3.close()
            goto L_0x00ec
        L_0x006f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r0 = move-exception
            X.CDX.A00(r3, r1)
            throw r0
        L_0x007d:
            r0 = 8
            if (r0 != r13) goto L_0x00b2
            X.00H r0 = r12.A0J
            long r1 = X.AnonymousClass8BV.A05(r0)
            X.00H r0 = r12.A0I
            java.lang.Object r0 = r0.get()
            X.1a6 r0 = (X.AnonymousClass1a6) r0
            long r0 = r0.A00(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A06 = r0
            long r0 = A00(r12)
            long r0 = r0 / r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A07 = r0
            X.AW7 r0 = r12.A0C
            int r0 = r0.A00
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r10.A08 = r0
            r3.A03()
            return r10
        L_0x00b2:
            r0 = 3
            if (r0 != r13) goto L_0x0124
            X.00H r0 = r12.A0I
            java.lang.Object r6 = r0.get()
            X.1a6 r6 = (X.AnonymousClass1a6) r6
            X.00H r0 = r12.A0N
            java.lang.Object r0 = r0.get()
            X.1Ro r0 = (X.C26291Ro) r0
            java.lang.Long r1 = r0.A00()
            X.00H r0 = r12.A0J
            long r4 = X.AnonymousClass8BV.A05(r0)
            if (r1 == 0) goto L_0x00e0
            long r0 = r1.longValue()
            long r2 = r6.A00(r0)
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A00 = r0
        L_0x00e0:
            long r0 = r6.A00(r4)
            goto L_0x011d
        L_0x00e5:
            if (r3 == 0) goto L_0x00ea
            r3.close()
        L_0x00ea:
            r4 = 0
        L_0x00ec:
            X.00H r0 = r12.A0J
            long r2 = X.AnonymousClass8BV.A05(r0)
            if (r8 == 0) goto L_0x0103
            long r0 = r8.longValue()
            long r8 = r11.A00(r0)
            double r0 = (double) r8
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A00 = r0
        L_0x0103:
            long r6 = r11.A00(r6)
            double r0 = (double) r6
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A02 = r0
            long r4 = r11.A00(r4)
            double r0 = (double) r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r10.A01 = r0
            long r0 = r11.A00(r2)
        L_0x011d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A06 = r0
            return r10
        L_0x0124:
            long r0 = A00(r12)
            long r0 = r0 / r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r10.A07 = r0
            X.AW7 r0 = r12.A0C
            int r0 = r0.A00
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r10.A08 = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7R.A01(X.A7R, int):X.8ro");
    }

    public static void A03(A7R a7r, int i) {
        if (8 != i || C17880vN.A0r(C17880vN.A0B(a7r.A09.A01), "/export/logging/funnelId") != null) {
            a7r.A05.CC4(A01(a7r, i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0081, code lost:
        if (r7 == false) goto L_0x009a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r10 = this;
            java.lang.String r1 = "ExportFlowManager/cancelExport()"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            boolean r0 = r10.A09()
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "ExportFlowManager/cancelExport() already in progress"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0011:
            X.1Ez r6 = new X.1Ez
            r6.<init>((java.lang.String) r1)
            monitor-enter(r10)
            android.os.CancellationSignal r0 = r10.A00     // Catch:{ all -> 0x00fb }
            r5 = 0
            if (r0 != 0) goto L_0x0027
            java.util.concurrent.CountDownLatch r0 = r10.A01     // Catch:{ all -> 0x00fb }
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "ExportFlowManager/cancellationSignal or exportCompleted is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fb }
            r0 = 1
            goto L_0x0032
        L_0x0027:
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00fb }
            android.os.CancellationSignal r0 = r10.A00     // Catch:{ all -> 0x00fb }
            r0.cancel()     // Catch:{ all -> 0x00fb }
        L_0x0031:
            r0 = 0
        L_0x0032:
            monitor-exit(r10)     // Catch:{ all -> 0x00fb }
            r4 = 8
            if (r0 == 0) goto L_0x0041
            A03(r10, r4)
            A02(r10)
            r10.A07()
            return
        L_0x0041:
            r8 = 1000(0x3e8, double:4.94E-321)
            X.2Ki r3 = r10.A0D     // Catch:{ InterruptedException -> 0x0072, all -> 0x00d8 }
            r0 = 35
            X.C20735AWq.A00(r3, r0)     // Catch:{ InterruptedException -> 0x0072, all -> 0x00d8 }
            monitor-enter(r10)     // Catch:{ InterruptedException -> 0x0072, all -> 0x00d8 }
            java.util.concurrent.CountDownLatch r7 = r10.A01     // Catch:{ all -> 0x006f }
            monitor-exit(r10)     // Catch:{ all -> 0x006f }
            if (r7 == 0) goto L_0x009a
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0072, all -> 0x00d8 }
            r0 = 300000(0x493e0, double:1.482197E-318)
            boolean r7 = r7.await(r0, r2)     // Catch:{ InterruptedException -> 0x0072, all -> 0x00d8 }
            if (r7 == 0) goto L_0x0061
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x006d }
            goto L_0x0083
        L_0x0061:
            r1 = 2
            r0 = 10
            X.C20736AWr.A00(r3, r1, r0)     // Catch:{ InterruptedException -> 0x006d }
            java.lang.String r0 = "ExportFlowManager/cancelExport()/cancellationSignal.failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ InterruptedException -> 0x006d }
            goto L_0x009a
        L_0x006d:
            r2 = move-exception
            goto L_0x0074
        L_0x006f:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ InterruptedException -> 0x0072, all -> 0x00d8 }
        L_0x0072:
            r2 = move-exception
            r7 = 0
        L_0x0074:
            X.2Ki r3 = r10.A0D     // Catch:{ all -> 0x00bc }
            r1 = 2
            r0 = 10
            X.C20736AWr.A00(r3, r1, r0)     // Catch:{ all -> 0x00bc }
            java.lang.String r0 = "ExportFlowManager/cancelExport()/InterruptedException"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00bc }
            if (r7 == 0) goto L_0x009a
        L_0x0083:
            r10.A07()
        L_0x0086:
            r6.A02()
            A03(r10, r4)
            A02(r10)
            r0 = 32
            X.C20735AWq.A00(r3, r0)
            X.AW7 r0 = r10.A0C
            r3.unregisterObserver(r0)
            return
        L_0x009a:
            long r0 = r6.A01()
            long r0 = r0 / r8
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportFlowManager/reset() was not called since cancellation did not succeed after "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " seconds"
            X.C17890vO.A19(r1, r0)
            X.190 r1 = r10.A02
            java.lang.String r0 = "xpm-export-cancel-failed"
            r1.A0G(r0, r2, r5)
            goto L_0x0086
        L_0x00bc:
            r3 = move-exception
            if (r7 == 0) goto L_0x00d9
            r10.A07()
        L_0x00c2:
            r6.A02()
            A03(r10, r4)
            A02(r10)
            X.2Ki r1 = r10.A0D
            r0 = 32
            X.C20735AWq.A00(r1, r0)
            X.AW7 r0 = r10.A0C
            r1.unregisterObserver(r0)
            throw r3
        L_0x00d8:
            r3 = move-exception
        L_0x00d9:
            long r0 = r6.A01()
            long r0 = r0 / r8
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExportFlowManager/reset() was not called since cancellation did not succeed after "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = " seconds"
            X.C17890vO.A19(r1, r0)
            X.190 r1 = r10.A02
            java.lang.String r0 = "xpm-export-cancel-failed"
            r1.A0G(r0, r2, r5)
            goto L_0x00c2
        L_0x00fb:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00fb }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A7R.A04():void");
    }

    public void A05() {
        this.A08.A02();
        A04();
        this.A06.A03(true);
        Log.i("ExportFlowManager/cancelExportFlowAndClearData/complete");
        AnonymousClass00H r2 = this.A09.A01;
        C17880vN.A1B(AnonymousClass8BV.A06(r2), "/export/start_time");
        C17880vN.A1B(AnonymousClass8BV.A06(r2), "/export/provider_closed/timestamp");
        C33841jT r3 = this.A0G;
        if (r3.A0D.A00.getInt("registration_state", 1) == 11) {
            r3.A0A();
        }
        Log.i("ExportFlowManager/disableExportProviderAndClearMigrationFlags/complete/success");
    }

    public void A06() {
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A04, 843);
        C184639bH r0 = this.A0M;
        PackageManager packageManager = r0.A01;
        ComponentName componentName = r0.A00;
        if (A052 != C17890vO.A1R(packageManager.getComponentEnabledSetting(componentName))) {
            packageManager.setComponentEnabledSetting(componentName, AnonymousClass000.A1O(A052 ? 1 : 0) ? 1 : 0, 1);
        }
    }

    public void A07() {
        Log.i("ExportFlowManager/reset()");
        C17880vN.A1B(AnonymousClass8BV.A06(this.A09.A01).remove("/export/enc/active/owner").remove("/export/enc/active/version").remove("/export/enc/active/account_hash").remove("/export/enc/active/server_salt").remove("/export/enc/active/last_fetch_time"), "/export/enc/active/seed");
        this.A0F.A04();
        this.A0B.A01();
    }

    public boolean A08() {
        if (this.A08.A05() || C17880vN.A0B(this.A09.A01).getLong("/export/start_time", 0) > 0) {
            return true;
        }
        return false;
    }

    public A7R(AnonymousClass190 r3, AnonymousClass11C r4, AnonymousClass11P r5, C18030ve r6, AnonymousClass18K r7, C203911y r8, A8U a8u, C184639bH r10, C20006A2w a2w, C196129uV r12, C196169uZ r13, C192059nj r14, C47882Ki r15, C186039dY r16, C196139uW r17, C33841jT r18, AnonymousClass00H r19, AnonymousClass00H r20, AnonymousClass00H r21) {
        this.A0L = r5;
        this.A04 = r6;
        this.A02 = r3;
        this.A05 = r7;
        this.A09 = r12;
        this.A03 = r4;
        this.A07 = a8u;
        this.A0J = r19;
        this.A0B = r14;
        this.A06 = r8;
        this.A0G = r18;
        this.A0E = r16;
        this.A0F = r17;
        this.A0A = r13;
        this.A0M = r10;
        this.A0D = r15;
        this.A0I = r20;
        this.A0N = r21;
        this.A08 = a2w;
        AnonymousClass1Ez r0 = new AnonymousClass1Ez("ExportFlowManager/duration");
        this.A0H = r0;
        r0.A02();
        AW7 aw7 = new AW7(this);
        this.A0C = aw7;
        r15.registerObserver(aw7);
    }
}
