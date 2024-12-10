package X;

import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* renamed from: X.8fi  reason: invalid class name and case insensitive filesystem */
public abstract class C167258fi extends C21132Af0 implements Runnable, C107095Yj {
    public final AnonymousClass1TJ A00 = new AnonymousClass1TJ();
    public final CountDownLatch A01 = new CountDownLatch(1);
    public final FutureTask A02 = new C21605Amu(this, new C21490Akz(this, 5));

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        r3.flush();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r3.close();
        r3 = X.C108945cZ.A17(X.AnonymousClass001.A1H("/", r12, X.AnonymousClass000.A11(r14)));
        r0 = r3.getParentFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fa, code lost:
        if (r0 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00fc, code lost:
        X.AnonymousClass8BV.A1H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0104, code lost:
        if (r3.exists() == false) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0106, code lost:
        r8.A02(r9, 3);
        r10.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0111, code lost:
        if (r10.renameTo(r3) == false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        r8.A02(r9, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0116, code lost:
        android.net.TrafficStats.clearThreadStatsTag();
        r2 = java.lang.Boolean.TRUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0175, code lost:
        r8.A02(r9, 8);
        r10.delete();
        r1 = X.C17880vN.A0f("DynamicNetworkResourceDownloadTask/file-rename-failed");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A0E() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.C167248fh
            if (r0 == 0) goto L_0x002d
            r1 = r15
            X.8fh r1 = (X.C167248fh) r1
            X.9nD r0 = r1.A00
            java.lang.Boolean r2 = r0.A00()
            java.lang.ref.WeakReference r1 = r1.A01
        L_0x000f:
            if (r1 == 0) goto L_0x0029
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L_0x0029
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r0 = r0.equals(r2)
            java.lang.Object r1 = r1.get()
            X.B8P r1 = (X.B8P) r1
            if (r0 == 0) goto L_0x002a
            r0 = 3
        L_0x0026:
            r1.C8Q(r0)
        L_0x0029:
            return r2
        L_0x002a:
            r0 = 8
            goto L_0x0026
        L_0x002d:
            boolean r0 = r15 instanceof X.C167238fg
            if (r0 == 0) goto L_0x01a8
            r4 = r15
            X.8fg r4 = (X.C167238fg) r4
            X.9ha r2 = r4.A00
            X.0ve r6 = r2.A03
            r1 = 3005(0xbbd, float:4.211E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r1)
            if (r0 == 0) goto L_0x01a0
            java.lang.String r9 = r2.A0A
            X.118 r0 = r2.A02
            java.io.File r1 = X.AnonymousClass8BR.A0t(r0)
            java.lang.String r0 = "NetworkResource/Dynamic"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            java.lang.String r14 = r0.getAbsolutePath()
            r0 = 21
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ IOException -> 0x0186 }
            java.lang.String r12 = r2.A09     // Catch:{ IOException -> 0x0186 }
            java.lang.String r1 = "downloading-"
            java.lang.String r0 = ".tmp"
            java.io.File r10 = java.io.File.createTempFile(r1, r0)     // Catch:{ all -> 0x0184 }
            X.1Oh r8 = r2.A06     // Catch:{ all -> 0x0184 }
            int r1 = r8.A01(r9)     // Catch:{ all -> 0x0184 }
            r0 = 5
            if (r1 != r0) goto L_0x0070
            r0 = 2
            r8.A02(r9, r0)     // Catch:{ all -> 0x0184 }
        L_0x0070:
            r0 = 1
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0184 }
            r3.<init>(r10, r0)     // Catch:{ all -> 0x0184 }
            java.util.HashMap r5 = X.C17880vN.A11()     // Catch:{ all -> 0x016b }
            java.lang.String r1 = "cat"
            java.lang.String r0 = "nw_media"
            r5.put(r1, r0)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "id"
            r5.put(r0, r9)     // Catch:{ all -> 0x016b }
            X.1Km r1 = r2.A07     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "/wa/static/network_resource"
            android.net.Uri$Builder r0 = X.C88574a9.A00(r6, r1, r0)     // Catch:{ all -> 0x016b }
            java.lang.String r6 = X.C88574a9.A02(r0, r5)     // Catch:{ all -> 0x016b }
            X.1D9 r5 = r2.A04     // Catch:{ all -> 0x0169 }
            X.18j r1 = r2.A08     // Catch:{ all -> 0x0169 }
            r0 = 0
            X.AUZ r5 = r5.A05(r0, r1, r6, r0)     // Catch:{ all -> 0x0169 }
            java.net.HttpURLConnection r0 = r5.A01     // Catch:{ all -> 0x015f }
            int r7 = r0.getResponseCode()     // Catch:{ all -> 0x015f }
            r0 = 200(0xc8, float:2.8E-43)
            r13 = 22
            r11 = 0
            if (r7 != r0) goto L_0x011c
            X.181 r6 = r2.A01     // Catch:{ all -> 0x015f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x015f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x015f }
            X.9Hb r6 = r5.BMP(r6, r1, r0)     // Catch:{ all -> 0x015f }
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r7 = new byte[r0]     // Catch:{ all -> 0x0155 }
        L_0x00ba:
            int r1 = r6.read(r7)     // Catch:{ all -> 0x0155 }
            r0 = -1
            if (r1 == r0) goto L_0x00dc
            X.B8O r0 = r2.A05     // Catch:{ all -> 0x0155 }
            boolean r0 = r0.BeV()     // Catch:{ all -> 0x0155 }
            if (r0 != 0) goto L_0x00cd
            r3.write(r7, r11, r1)     // Catch:{ all -> 0x0155 }
            goto L_0x00ba
        L_0x00cd:
            r0 = 7
            r8.A02(r9, r0)     // Catch:{ all -> 0x0155 }
            r10.delete()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "DynamicNetworkResourceDownloadTask/user-canceled"
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x0155 }
            r1.<init>(r0)     // Catch:{ all -> 0x0155 }
            goto L_0x0154
        L_0x00dc:
            r3.flush()     // Catch:{ all -> 0x0155 }
            r6.close()     // Catch:{ all -> 0x015f }
            r5.close()     // Catch:{ all -> 0x0169 }
            r3.close()     // Catch:{ all -> 0x0184 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r14)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r12, r1)     // Catch:{ all -> 0x0184 }
            java.io.File r3 = X.C108945cZ.A17(r0)     // Catch:{ all -> 0x0184 }
            java.io.File r0 = r3.getParentFile()     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x00ff
            X.AnonymousClass8BV.A1H(r0)     // Catch:{ all -> 0x0184 }
        L_0x00ff:
            boolean r0 = r3.exists()     // Catch:{ all -> 0x0184 }
            r1 = 3
            if (r0 == 0) goto L_0x010d
            r8.A02(r9, r1)     // Catch:{ all -> 0x0184 }
            r10.delete()     // Catch:{ all -> 0x0184 }
            goto L_0x0116
        L_0x010d:
            boolean r0 = r10.renameTo(r3)     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x0175
            r8.A02(r9, r1)     // Catch:{ IOException -> 0x0186 }
        L_0x0116:
            android.net.TrafficStats.clearThreadStatsTag()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            goto L_0x0197
        L_0x011c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x015f }
            java.lang.String r0 = "DynamicNetworkResourceDownloadTask/ response code: "
            X.C17900vP.A0i(r0, r1, r7)     // Catch:{ all -> 0x015f }
            X.181 r6 = r2.A01     // Catch:{ all -> 0x015f }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x015f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x015f }
            X.9Hb r6 = r5.BMO(r6, r1, r0)     // Catch:{ all -> 0x015f }
            r0 = 6
            r8.A02(r9, r0)     // Catch:{ all -> 0x0155 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "DynamicNetworkResourceDownloadTask/responseCode:"
            r1.append(r0)     // Catch:{ all -> 0x0155 }
            r1.append(r7)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "; error="
            r1.append(r0)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = X.AnonymousClass1EY.A00(r6)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x0155 }
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0155 }
        L_0x0154:
            throw r1     // Catch:{ all -> 0x0155 }
        L_0x0155:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x015a }
            goto L_0x015e
        L_0x015a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x015f }
        L_0x015e:
            throw r1     // Catch:{ all -> 0x015f }
        L_0x015f:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0164 }
            goto L_0x0168
        L_0x0164:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0169 }
        L_0x0168:
            throw r1     // Catch:{ all -> 0x0169 }
        L_0x0169:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x016b }
        L_0x016b:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0170 }
            goto L_0x0183
        L_0x0170:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0184 }
            goto L_0x0183
        L_0x0175:
            r0 = 8
            r8.A02(r9, r0)     // Catch:{ all -> 0x0184 }
            r10.delete()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "DynamicNetworkResourceDownloadTask/file-rename-failed"
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ all -> 0x0184 }
        L_0x0183:
            throw r1     // Catch:{ all -> 0x0184 }
        L_0x0184:
            r0 = move-exception
            throw r0     // Catch:{ IOException -> 0x0186 }
        L_0x0186:
            r3 = move-exception
            X.190 r2 = r2.A00     // Catch:{ all -> 0x019b }
            java.lang.String r1 = "DynamicNetworkResourceDownloadTask/"
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x019b }
            r2.A0E(r1, r0, r3)     // Catch:{ all -> 0x019b }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x019b }
            android.net.TrafficStats.clearThreadStatsTag()
        L_0x0197:
            java.lang.ref.WeakReference r1 = r4.A01
            goto L_0x000f
        L_0x019b:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01a0:
            java.lang.String r1 = "DynamicNetworkResourceDownloadTask/ABProp disabled"
            java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
            r0.<init>(r1)
            throw r0
        L_0x01a8:
            r0 = r15
            X.8fd r0 = (X.C167208fd) r0
            X.A99 r1 = r0.A00
            com.whatsapp.voipcalling.CallInfo r0 = r0.A01
            X.0zA r0 = X.A99.A01(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C167258fi.A0E():java.lang.Object");
    }

    public void A0F() {
        if (this.A02.isCancelled()) {
            throw new CancellationException();
        }
    }

    public void cancel() {
        this.A02.cancel(true);
    }

    public void run() {
        Throwable e;
        Throwable e2;
        try {
            FutureTask futureTask = this.A02;
            futureTask.run();
            try {
                boolean interrupted = Thread.interrupted();
                this.A01.await();
                if (interrupted) {
                    AnonymousClass8BS.A0x();
                }
                Object obj = futureTask.get();
                C17960vV.A07(obj);
                A0B(obj);
            } catch (InterruptedException | CancellationException e3) {
                e2 = e3;
                A0C(e2);
            } catch (ExecutionException e4) {
                e2 = e4.getCause();
                A0C(e2);
            }
        } catch (Throwable th) {
            try {
                boolean interrupted2 = Thread.interrupted();
                this.A01.await();
                if (interrupted2) {
                    AnonymousClass8BS.A0x();
                }
                Object obj2 = this.A02.get();
                C17960vV.A07(obj2);
                A0B(obj2);
                throw th;
            } catch (InterruptedException | CancellationException e5) {
                e = e5;
                A0C(e);
                throw th;
            } catch (ExecutionException e6) {
                e = e6.getCause();
                A0C(e);
                throw th;
            }
        }
    }

    public void A0D() {
        super.A0D();
        this.A00.A01();
    }
}
