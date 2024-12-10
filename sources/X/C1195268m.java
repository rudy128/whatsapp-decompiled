package X;

import com.whatsapp.media.download.ExpressPathGarbageCollectWorker;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.68m  reason: invalid class name and case insensitive filesystem */
public final class C1195268m extends C1195468o implements BC9 {
    public AnonymousClass64W A00;
    public AnonymousClass21V A01;
    public Runnable A02;
    public final int A03;
    public final C18030ve A04;
    public final AnonymousClass18K A05;
    public final AnonymousClass1SK A06;
    public final AnonymousClass1RN A07;
    public final C33581j3 A08;
    public final AnonymousClass68q A09;
    public final C26551So A0A;
    public final C443823f A0B;
    public final AnonymousClass10I A0C;
    public final AnonymousClass1TI A0D = new C145917Nc(this, 19);
    public final JniBridge A0E;
    public final AnonymousClass19K A0F;
    public final File A0G;
    public final AnonymousClass1KB A0H;
    public final AnonymousClass11P A0I;
    public final AnonymousClass11Z A0J;
    public final C24681Lg A0K;
    public final AtomicBoolean A0L = new AtomicBoolean(true);

    /* JADX WARNING: type inference failed for: r2v1, types: [X.68q, X.70W] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C1195268m(X.AnonymousClass1KB r25, X.AnonymousClass181 r26, X.AnonymousClass11P r27, X.AnonymousClass11Z r28, X.C24681Lg r29, X.C18030ve r30, X.AnonymousClass18K r31, X.C24371Kb r32, X.AnonymousClass1SK r33, X.AnonymousClass1RN r34, X.C33581j3 r35, X.C26551So r36, X.C443823f r37, X.C24421Kg r38, X.AnonymousClass10I r39, com.whatsapp.wamsys.JniBridge r40, X.AnonymousClass19K r41, java.io.File r42, int r43) {
        /*
            r24 = this;
            r4 = 1
            r13 = r27
            X.C18070vi.A0d(r13, r4)
            r6 = r38
            r16 = r26
            r14 = r25
            r0 = r16
            X.C18070vi.A0p(r0, r6, r14)
            r0 = 5
            r11 = r30
            X.C18070vi.A0d(r11, r0)
            r0 = 7
            r5 = r39
            X.C18070vi.A0d(r5, r0)
            r2 = r40
            r10 = r31
            X.C72473Md.A1K(r10, r2)
            r12 = r29
            r1 = r41
            r15 = r28
            r9 = r32
            r8 = r33
            X.C18070vi.A0y(r15, r1, r8, r12, r9)
            r0 = 16
            r7 = r35
            X.C18070vi.A0d(r7, r0)
            java.util.concurrent.Executor r0 = r14.A05
            r3 = r24
            r23 = r0
            r22 = r6
            r21 = r9
            r20 = r11
            r19 = r15
            r18 = r13
            r17 = r16
            r16 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r3.A0I = r13
            r3.A0H = r14
            r3.A04 = r11
            r6 = r36
            r3.A0A = r6
            r3.A0C = r5
            r0 = r42
            r3.A0G = r0
            r3.A05 = r10
            r3.A0E = r2
            r3.A0J = r15
            r3.A0F = r1
            r3.A06 = r8
            r3.A0K = r12
            r3.A08 = r7
            r0 = r37
            r3.A0B = r0
            r0 = r43
            r3.A03 = r0
            r0 = r34
            r3.A07 = r0
            X.68q r2 = new X.68q
            r2.<init>(r6, r4)
            r0 = -1
            r2.A01 = r0
            r2.A00 = r0
            r3.A09 = r2
            r1 = 19
            X.7Nc r0 = new X.7Nc
            r0.<init>(r3, r1)
            r3.A0D = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r4)
            r3.A0L = r0
            r3.BB6(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195268m.<init>(X.1KB, X.181, X.11P, X.11Z, X.1Lg, X.0ve, X.18K, X.1Kb, X.1SK, X.1RN, X.1j3, X.1So, X.23f, X.1Kg, X.10I, com.whatsapp.wamsys.JniBridge, X.19K, java.io.File, int):void");
    }

    public void BsD(C1409173o r4, C136996uk r5) {
        C18070vi.A0d(r4, 0);
        Log.i("ExpressPathDownload/download completed");
        Runnable runnable = this.A02;
        if (runnable != null) {
            this.A0C.CEz(runnable);
        }
        A00(r4, false);
    }

    private final void A00(C1409173o r7, boolean z) {
        AnonymousClass64W r0 = r7.A00;
        if (r0 == null) {
            r0 = this.A09.A07();
        }
        this.A00 = r0;
        AnonymousClass7RA.A00(this.A0C, this, 32);
        C32361h4 r2 = this.A08.A04;
        AnonymousClass1TI r1 = this.A0D;
        C18070vi.A0d(r1, 0);
        r2.A00.A02(r1);
        C196269uj r5 = new C196269uj(ExpressPathGarbageCollectWorker.class);
        C192939pH r3 = new C192939pH();
        String absolutePath = this.A0G.getAbsolutePath();
        Map map = r3.A00;
        map.put("file_path", absolutePath);
        C443823f r4 = this.A0B;
        map.put("end_hash", r4.A01);
        r5.A04(r3.A00());
        r5.A02(5, TimeUnit.MINUTES);
        A7W a7w = (A7W) this.A0F.get();
        String str = r4.A01;
        C17960vV.A07(str);
        a7w.A07((C162248Jv) r5.A00(), AnonymousClass00R.A01, str);
        this.A0L.set(false);
        AnonymousClass64W r12 = this.A00;
        if (r12 != null) {
            if (z) {
                r12.A0L = 16;
            }
            r12.A06 = AnonymousClass000.A0i();
            r12.A0I = C17880vN.A0k();
            this.A05.CC7(r12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x010f, code lost:
        if (r0 != null) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0111, code lost:
        r0 = r15.A09.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0117, code lost:
        r15.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x011e, code lost:
        return new X.C126026c4(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0060, code lost:
        if (r0 == null) goto L_0x0111;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C126026c4 A03() {
        /*
            r15 = this;
            java.io.File r1 = r15.A0G     // Catch:{ IOException -> 0x00f6 }
            boolean r0 = r1.exists()     // Catch:{ IOException -> 0x00f6 }
            if (r0 != 0) goto L_0x000b
            r1.createNewFile()     // Catch:{ IOException -> 0x00f6 }
        L_0x000b:
            X.11Z r0 = r15.A0J
            long r6 = r0.A01()
            long r4 = r0.A03()
            X.23f r10 = r15.A0B
            long r2 = r10.A00
            double r0 = (double) r2
            r2 = 4625196817309499392(0x4030000000000000, double:16.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.floor(r0)
            double r0 = r0 * r2
            double r0 = r0 + r2
            r2 = 4621819117588971520(0x4024000000000000, double:10.0)
            double r0 = r0 + r2
            long r8 = (long) r0
            X.0ve r1 = r15.A04
            r0 = 1291(0x50b, float:1.809E-42)
            long r2 = X.C108995ce.A07(r1, r0)
            r0 = 32000000(0x1e84800, double:1.58101007E-316)
            long r2 = java.lang.Math.max(r0, r2)
            r0 = 2
            long r0 = r0 * r8
            long r8 = r0 + r2
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0064
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "ExpressPathDownload/nospace total: "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = " free: "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r2 = " need: "
            X.C17900vP.A0l(r2, r3, r0)
            r0 = 4
            X.73o r1 = new X.73o
            r1.<init>(r0)
            X.64W r0 = r1.A00
            if (r0 != 0) goto L_0x0117
            goto L_0x0111
        L_0x0064:
            X.6c4 r14 = super.A03()
            java.lang.String r13 = r10.A01
            if (r13 == 0) goto L_0x00f5
            X.1RN r4 = r15.A07
            X.68q r3 = r15.A09
            long r5 = r3.A0A
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x008c
            r0 = 0
        L_0x007a:
            long r5 = r3.A00
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0084
            long r5 = r3.A06()
        L_0x0084:
            X.11P r2 = r15.A0I
            long r2 = X.AnonymousClass11P.A01(r2)
            monitor-enter(r4)
            goto L_0x0099
        L_0x008c:
            long r0 = r3.A01
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x0097
            long r0 = r3.A04()
            goto L_0x007a
        L_0x0097:
            long r0 = r0 - r5
            goto L_0x007a
        L_0x0099:
            X.C17960vV.A00()     // Catch:{ all -> 0x00f1 }
            X.11P r10 = r4.A00     // Catch:{ all -> 0x00f1 }
            X.AnonymousClass11P.A01(r10)     // Catch:{ all -> 0x00f1 }
            X.1RM r7 = r4.A01     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e6, Error | RuntimeException -> 0x00e4 }
            X.1au r12 = r7.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e6, Error | RuntimeException -> 0x00e4 }
            r7 = r12
            X.1av r7 = (X.C28801av) r7     // Catch:{ all -> 0x00da }
            X.1Ev r9 = r7.A02     // Catch:{ all -> 0x00da }
            java.lang.String r8 = "express_path_download_data"
            android.content.ContentValues r7 = X.C17880vN.A08()     // Catch:{ all -> 0x00da }
            java.lang.String r11 = "enc_file_hash"
            r7.put(r11, r13)     // Catch:{ all -> 0x00da }
            java.lang.String r11 = "ep_saved_time_ms"
            X.C17880vN.A19(r7, r11, r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "ep_saved_bytes"
            X.C17880vN.A19(r7, r0, r5)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = "last_update_time"
            X.C17880vN.A19(r7, r0, r2)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "enc_file_restored"
            r0 = 0
            X.C17880vN.A19(r7, r2, r0)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = "ExpressPathDownloadDataStore/insert"
            r0 = 4
            r9.A09(r8, r1, r7, r0)     // Catch:{ all -> 0x00da }
            X.AnonymousClass11P.A01(r10)     // Catch:{ all -> 0x00da }
            r12.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e6, Error | RuntimeException -> 0x00e4 }
            goto L_0x00f4
        L_0x00da:
            r1 = move-exception
            r12.close()     // Catch:{ all -> 0x00df }
            goto L_0x00e3
        L_0x00df:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e6, Error | RuntimeException -> 0x00e4 }
        L_0x00e3:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00e6, Error | RuntimeException -> 0x00e4 }
        L_0x00e4:
            r1 = move-exception
            goto L_0x00ed
        L_0x00e6:
            r1 = move-exception
            java.lang.String r0 = "ExpressPathDownloadDataStore/insert"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f0
        L_0x00ed:
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x00f1 }
        L_0x00f0:
            throw r1     // Catch:{ all -> 0x00f1 }
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x00f4:
            monitor-exit(r4)
        L_0x00f5:
            return r14
        L_0x00f6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ExpressPathDownload/download error when create new file "
            r1.append(r0)
            X.23f r0 = r15.A0B
            java.lang.String r0 = r0.A01
            X.C17890vO.A19(r1, r0)
            r0 = 9
            X.73o r1 = new X.73o
            r1.<init>(r0)
            X.64W r0 = r1.A00
            if (r0 != 0) goto L_0x0117
        L_0x0111:
            X.68q r0 = r15.A09
            X.64W r0 = r0.A07()
        L_0x0117:
            r15.A00 = r0
            X.6c4 r0 = new X.6c4
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1195268m.A03():X.6c4");
    }

    public void BsC(boolean z) {
        Log.i("ExpressPathDownload/download canceled");
        AnonymousClass7RA.A00(this.A0C, this, 33);
        A00(new C1409173o(24), true);
    }

    public void BsA(long j) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("ExpressPathDownload/download in progress ");
        A10.append(j);
        Log.i(C17890vO.A0c(A10, ' '));
        AnonymousClass21V r6 = this.A01;
        if (r6 != null) {
            C62572rc A0M = AnonymousClass3Ma.A0M(r6);
            long j2 = r6.A01;
            long j3 = 0;
            if (j2 != 0) {
                j3 = (100 * j) / j2;
            }
            A0M.A0C = j3;
            A0M.A09 = j;
            A0M.A0f = true;
            this.A0K.A02(r6, 8);
        }
    }
}
