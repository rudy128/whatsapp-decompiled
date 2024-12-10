package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Rr  reason: invalid class name and case insensitive filesystem */
public final class C147067Rr implements Callable, C1607389s, B8D {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public final AnonymousClass181 A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass70W A06;
    public final C129086hE A07;
    public final AnonymousClass87M A08;
    public final C24421Kg A09;
    public final C24371Kb A0A;
    public final C58092k8 A0B;
    public final CountDownLatch A0C = new CountDownLatch(1);
    public final FutureTask A0D = new FutureTask(this);
    public final AtomicInteger A0E = new AtomicInteger();

    public C147067Rr(AnonymousClass181 r3, AnonymousClass11P r4, C24371Kb r5, AnonymousClass70W r6, C129086hE r7, AnonymousClass87M r8, C24421Kg r9, C58092k8 r10) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0p(r3, r9, r5);
        this.A05 = r4;
        this.A04 = r3;
        this.A09 = r9;
        this.A0A = r5;
        this.A07 = r7;
        this.A08 = r8;
        this.A06 = r6;
        this.A0B = r10;
    }

    private final void A00() {
        if (this.A0D.isCancelled()) {
            throw new CancellationException("PlainDownloadTransfer/ cancelled");
        }
    }

    public C126026c4 BJE() {
        int i = 1;
        try {
            FutureTask futureTask = this.A0D;
            futureTask.run();
            C126026c4 r1 = (C126026c4) futureTask.get();
            this.A0C.countDown();
            C18070vi.A0b(r1);
            return r1;
        } catch (InterruptedException | ExecutionException e) {
            Log.e("PlainDownloadTransfer/ exception ", e);
            this.A0C.countDown();
            return new C126026c4(new C1409173o(i));
        } catch (CancellationException e2) {
            Log.e("PlainDownloadTransfer/ exception ", e2);
            this.A0C.countDown();
            i = 13;
            return new C126026c4(new C1409173o(i));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x017e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        X.CDX.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0182, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0185, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.CDX.A00(r10, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0189, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x018c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        X.CDX.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0190, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.A88 CGA(X.C191779nA r20) {
        /*
            r19 = this;
            java.lang.String r6 = "PlainDownloadTransfer/ error downloading from mms, url: "
            java.lang.String r8 = "PlainDownloadTransfer/ download fail: "
            r3 = 0
            r11 = r20
            X.C18070vi.A0d(r11, r3)
            r5 = r19
            java.util.concurrent.FutureTask r0 = r5.A0D
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x001d
            java.lang.Integer r0 = X.C108955ca.A0i()
            X.A88 r7 = X.A88.A01(r0)
        L_0x001c:
            return r7
        L_0x001d:
            X.6hE r1 = r5.A07     // Catch:{ MalformedURLException -> 0x0258 }
            X.87r r0 = r1.A01     // Catch:{ MalformedURLException -> 0x0258 }
            java.lang.String r0 = r0.BLw(r11)     // Catch:{ MalformedURLException -> 0x0258 }
            java.net.URL r13 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0258 }
            r13.<init>(r0)     // Catch:{ MalformedURLException -> 0x0258 }
            X.70W r2 = r5.A06
            if (r2 == 0) goto L_0x0050
            r2.A0e = r13
            X.1Kb r0 = r5.A0A
            int r0 = r0.A01(r11, r3)
            r2.A02 = r0
            int r0 = r11.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A0Q = r0
            java.lang.String r0 = r11.A04
            r2.A0Z = r0
            java.lang.Integer r0 = X.C17880vN.A0i()
            r2.A0P = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.A0J = r0
        L_0x0050:
            r0 = 7
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.89t r7 = r1.A00
            r7.CR5()
            long r14 = r7.BVb()
            boolean r4 = r1.A03
            if (r4 == 0) goto L_0x0073
            r16 = 262143(0x3ffff, double:1.29516E-318)
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
            r0 = 14
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.A88 r7 = X.A88.A02(r0)
            return r7
        L_0x0073:
            r16 = -1
        L_0x0075:
            X.2k8 r1 = r5.A0B     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            r12 = 0
            if (r1 == 0) goto L_0x008a
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0E     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            int r0 = r0.getAndIncrement()     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            r1.A00 = r0     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            java.lang.String r12 = r1.A00()     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
        L_0x008a:
            X.1Kb r10 = r5.A0A     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            r18 = r3
            X.AUZ r9 = r10.A02(r11, r12, r13, r14, r16, r18)     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            X.C18070vi.A0b(r9)     // Catch:{ all -> 0x018a }
            if (r2 == 0) goto L_0x00bc
            r2.A08()     // Catch:{ all -> 0x018a }
            java.lang.Boolean r0 = r9.A00     // Catch:{ all -> 0x018a }
            r2.A0I = r0     // Catch:{ all -> 0x018a }
            java.net.HttpURLConnection r1 = r9.A01     // Catch:{ all -> 0x018a }
            int r0 = r1.getResponseCode()     // Catch:{ all -> 0x018a }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x018a }
            r2.A0W = r0     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "x-fb-application-protocol"
            java.lang.String r0 = r1.getHeaderField(r0)     // Catch:{ all -> 0x018a }
            r2.A0c = r0     // Catch:{ all -> 0x018a }
            int r0 = r1.getContentLength()     // Catch:{ all -> 0x018a }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x018a }
            r2.A0V = r0     // Catch:{ all -> 0x018a }
        L_0x00bc:
            r0 = 2
            java.lang.Integer[] r1 = new java.lang.Integer[r0]     // Catch:{ all -> 0x018a }
            r0 = 200(0xc8, float:2.8E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x018a }
            r12 = 0
            r1[r3] = r0     // Catch:{ all -> 0x018a }
            r0 = 206(0xce, float:2.89E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x018a }
            r11 = 1
            r1[r11] = r0     // Catch:{ all -> 0x018a }
            java.net.HttpURLConnection r10 = r9.A01     // Catch:{ all -> 0x018a }
            int r0 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x018a }
            boolean r0 = X.C200410p.A0U(r0, r1)     // Catch:{ all -> 0x018a }
            if (r0 != 0) goto L_0x011c
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            r0 = 416(0x1a0, float:5.83E-43)
            if (r1 != r0) goto L_0x014e
            java.lang.String r0 = "Content-Range"
            java.lang.String r4 = r10.getHeaderField(r0)     // Catch:{ all -> 0x018a }
            if (r4 == 0) goto L_0x014e
            java.lang.String r0 = "*/"
            boolean r0 = X.AnonymousClass1YF.A0Y(r4, r0, r3)     // Catch:{ all -> 0x018a }
            if (r0 != r11) goto L_0x014e
            r1 = 47
            int r0 = r4.length()     // Catch:{ all -> 0x018a }
            int r0 = r0 + -1
            int r0 = X.AnonymousClass1YF.A0B(r4, r1, r0)     // Catch:{ all -> 0x018a }
            int r0 = r0 + 1
            java.lang.String r0 = X.C108955ca.A0z(r4, r0)     // Catch:{ all -> 0x018a }
            long r4 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x018a }
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x014e
        L_0x0113:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x018a }
            X.A88 r7 = X.A88.A02(r0)     // Catch:{ all -> 0x018a }
            goto L_0x0177
        L_0x011c:
            int r0 = r10.getContentLength()     // Catch:{ all -> 0x018a }
            long r0 = (long) r0     // Catch:{ all -> 0x018a }
            long r0 = r0 + r14
            r5.A02 = r0     // Catch:{ all -> 0x018a }
            if (r2 == 0) goto L_0x012b
            r0 = 0
            r2.A0B(r14, r0)     // Catch:{ all -> 0x018a }
        L_0x012b:
            java.io.OutputStream r10 = r7.CB0(r9)     // Catch:{ all -> 0x018a }
            X.181 r1 = r5.A04     // Catch:{ all -> 0x0183 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0183 }
            X.9Hb r7 = r9.BMP(r1, r0, r0)     // Catch:{ all -> 0x0183 }
            r1 = 20
            X.7Nc r0 = new X.7Nc     // Catch:{ all -> 0x017c }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x017c }
            X.C64062u9.A0G(r0, r7, r10)     // Catch:{ all -> 0x017c }
            r7.close()     // Catch:{ all -> 0x0183 }
            r10.close()     // Catch:{ all -> 0x018a }
            if (r4 == 0) goto L_0x0113
            r12 = 14
            goto L_0x0113
        L_0x014e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x018a }
            java.lang.String r0 = "PlainDownloadTransfer/ http connection error/code: "
            r1.append(r0)     // Catch:{ all -> 0x018a }
            int r0 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            r1.append(r0)     // Catch:{ all -> 0x018a }
            X.C17890vO.A0w(r1)     // Catch:{ all -> 0x018a }
            int r1 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            r0 = 507(0x1fb, float:7.1E-43)
            if (r1 != r0) goto L_0x016b
            r11 = 12
        L_0x016b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x018a }
            int r0 = r10.getResponseCode()     // Catch:{ all -> 0x018a }
            X.A88 r7 = X.A88.A04(r1, r0, r3)     // Catch:{ all -> 0x018a }
        L_0x0177:
            r9.close()     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            goto L_0x021f
        L_0x017c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            X.CDX.A00(r7, r1)     // Catch:{ all -> 0x0183 }
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0185 }
        L_0x0185:
            r0 = move-exception
            X.CDX.A00(r10, r1)     // Catch:{ all -> 0x018a }
            throw r0     // Catch:{ all -> 0x018a }
        L_0x018a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x018c }
        L_0x018c:
            r0 = move-exception
            X.CDX.A00(r9, r1)     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
            throw r0     // Catch:{ 68O -> 0x01ef, 68P -> 0x01d9, IOException -> 0x01c3, 6Sh -> 0x01a3, Exception -> 0x0191 }
        L_0x0191:
            r0 = move-exception
            if (r2 == 0) goto L_0x0197
            X.AnonymousClass70W.A00(r2, r0, r13)     // Catch:{ all -> 0x023b }
        L_0x0197:
            com.whatsapp.util.Log.e(r8, r0)     // Catch:{ all -> 0x023b }
            java.lang.Integer r0 = X.C17880vN.A0h()     // Catch:{ all -> 0x023b }
            X.A88 r7 = X.A88.A01(r0)     // Catch:{ all -> 0x023b }
            goto L_0x021f
        L_0x01a3:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r8)     // Catch:{ all -> 0x023b }
            r1.append(r4)     // Catch:{ all -> 0x023b }
            java.lang.String r0 = ", url: "
            X.C17900vP.A0X(r13, r0, r1)     // Catch:{ all -> 0x023b }
            int r0 = r4.downloadStatus     // Catch:{ all -> 0x023b }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023b }
            boolean r12 = X.C1409173o.A02(r0)     // Catch:{ all -> 0x023b }
            r9 = -1
            X.A88 r7 = new X.A88     // Catch:{ all -> 0x023b }
            r11 = r3
            r10 = r3
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x023b }
            goto L_0x021f
        L_0x01c3:
            r1 = move-exception
            if (r2 == 0) goto L_0x01d0
            X.AnonymousClass70W.A00(r2, r1, r13)     // Catch:{ all -> 0x023b }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x023b }
            X.C108995ce.A1J(r13, r6, r0, r1)     // Catch:{ all -> 0x023b }
        L_0x01d0:
            java.lang.Integer r0 = X.C108955ca.A0f()     // Catch:{ all -> 0x023b }
            X.A88 r7 = X.A88.A00(r0)     // Catch:{ all -> 0x023b }
            goto L_0x021f
        L_0x01d9:
            r1 = move-exception
            if (r2 == 0) goto L_0x01e6
            X.AnonymousClass70W.A00(r2, r1, r13)     // Catch:{ all -> 0x023b }
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x023b }
            X.C108995ce.A1J(r13, r6, r0, r1)     // Catch:{ all -> 0x023b }
        L_0x01e6:
            java.lang.Integer r0 = X.C108955ca.A0g()     // Catch:{ all -> 0x023b }
            X.A88 r7 = X.A88.A00(r0)     // Catch:{ all -> 0x023b }
            goto L_0x021f
        L_0x01ef:
            r3 = move-exception
            if (r2 == 0) goto L_0x0200
            r2.A08()     // Catch:{ all -> 0x023b }
            X.AnonymousClass70W.A00(r2, r3, r13)     // Catch:{ all -> 0x023b }
            int r0 = r3.responseCode     // Catch:{ all -> 0x023b }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ all -> 0x023b }
            r2.A0W = r0     // Catch:{ all -> 0x023b }
        L_0x0200:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x023b }
            java.lang.String r0 = "PlainDownloadTransfer/ http error "
            r1.append(r0)     // Catch:{ all -> 0x023b }
            int r0 = r3.responseCode     // Catch:{ all -> 0x023b }
            r1.append(r0)     // Catch:{ all -> 0x023b }
            java.lang.String r0 = " downloading from mms, url: "
            X.C108995ce.A1J(r13, r0, r1, r3)     // Catch:{ all -> 0x023b }
            int r0 = r3.downloadStatus     // Catch:{ all -> 0x023b }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x023b }
            int r0 = r3.responseCode     // Catch:{ all -> 0x023b }
            X.A88 r7 = X.A88.A03(r1, r0)     // Catch:{ all -> 0x023b }
        L_0x021f:
            android.net.TrafficStats.clearThreadStatsTag()
            if (r2 == 0) goto L_0x001c
            boolean r0 = r2.A0D()
            if (r0 != 0) goto L_0x022d
            r2.A08()
        L_0x022d:
            long r5 = r2.A02()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x001c
            r2.A0A()
            return r7
        L_0x023b:
            r1 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            if (r2 == 0) goto L_0x0257
            boolean r0 = r2.A0D()
            if (r0 != 0) goto L_0x024a
            r2.A08()
        L_0x024a:
            long r5 = r2.A02()
            r3 = -1
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0257
            r2.A0A()
        L_0x0257:
            throw r1
        L_0x0258:
            java.lang.Integer r0 = X.AnonymousClass3MY.A0g()
            X.A88 r0 = X.A88.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C147067Rr.CGA(X.9nA):X.A88");
    }

    public /* bridge */ /* synthetic */ Object call() {
        int i;
        AnonymousClass70W r4 = this.A06;
        if (r4 != null) {
            r4.A0A = SystemClock.elapsedRealtime();
            r4.A03 = 0;
        }
        AnonymousClass11P r5 = this.A05;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C24421Kg r9 = this.A09;
        r9.A0D();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        C129086hE r8 = this.A07;
        long BVb = r8.A00.BVb();
        this.A01 = BVb;
        this.A03 = BVb;
        if (r4 != null) {
            r4.A0X = C108945cZ.A1B(elapsedRealtime2, elapsedRealtime);
            r4.A09 = BVb;
        }
        A00();
        C190089kM A0A2 = r9.A0A(r8.A01, 2);
        A00();
        Number number = (Number) A0A2.A00(this);
        if (r4 != null) {
            r4.A0F = (long) A0A2.A01.get();
        }
        A00();
        if (number != null) {
            i = number.intValue();
        } else {
            i = 11;
        }
        C1409173o r3 = new C1409173o(i, r8.A02, false);
        A00();
        if (r4 != null) {
            r4.A0H = r3;
            r4.A07 = SystemClock.elapsedRealtime();
            r4.A03 = 4;
            r4.A08 = AnonymousClass11P.A01(r5);
        }
        C126026c4 r2 = new C126026c4(r3);
        if (r4 != null) {
            r2.A00.A00 = r4.A07();
        }
        return r2;
    }

    public void cancel() {
        this.A0D.cancel(true);
    }

    public void BEQ() {
        try {
            cancel();
            this.A0C.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Log.e("PlainDownloadTransfer/ waitCancelFinish Cannot fully cancel after 3 seconds");
        }
    }
}
