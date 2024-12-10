package X;

import android.os.PowerManager;
import com.whatsapp.media.WamediaManager;
import java.util.Arrays;
import java.util.Map;

/* renamed from: X.Bu6  reason: case insensitive filesystem */
public final class C24020Bu6 extends C27086DTl {
    public final PowerManager.WakeLock A00;
    public final AnonymousClass190 A01;
    public final C218617r A02;
    public final AnonymousClass1NM A03;
    public final AnonymousClass196 A04;
    public final AnonymousClass1ST A05;
    public final C18030ve A06;
    public final AnonymousClass18K A07;
    public final C25351Nw A08;
    public final WamediaManager A09;
    public final C24016Bu2 A0A;
    public final C127416eK A0B;
    public final C26431Sc A0C;
    public final CT1 A0D;
    public final AnonymousClass1NL A0E;
    public final C26521Sl A0F;
    public final AnonymousClass1SO A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0057, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.CX7 A00(X.CX7 r10, X.AnonymousClass21V r11, java.io.File r12) {
        /*
            r9 = this;
            r8 = 0
            if (r11 == 0) goto L_0x0015
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x0015
            X.2rc r0 = r11.A02
            if (r0 == 0) goto L_0x0016
            java.io.File r0 = r0.A0G
            if (r0 == 0) goto L_0x0016
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0016
        L_0x0015:
            return r8
        L_0x0016:
            X.2rc r0 = r11.A02     // Catch:{ IOException -> 0x00c5 }
            if (r0 == 0) goto L_0x0023
            java.io.File r1 = r0.A0G     // Catch:{ IOException -> 0x00c5 }
            if (r1 == 0) goto L_0x0023
            X.1NL r0 = r9.A0E     // Catch:{ IOException -> 0x00c5 }
            X.C64062u9.A0E(r0, r1, r12)     // Catch:{ IOException -> 0x00c5 }
        L_0x0023:
            java.lang.String r1 = r11.A05     // Catch:{ IOException -> 0x00c5 }
            java.lang.String r0 = X.C1402370n.A00(r12)     // Catch:{ IOException -> 0x00c5 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ IOException -> 0x00c5 }
            if (r0 != 0) goto L_0x0033
            X.C64062u9.A0Q(r12)     // Catch:{ IOException -> 0x00c5 }
            return r8
        L_0x0033:
            X.Bu2 r3 = r9.A0A     // Catch:{ IOException -> 0x00c5 }
            boolean r4 = r3.A06     // Catch:{ IOException -> 0x00c5 }
            X.205 r0 = r11.A0v     // Catch:{ IOException -> 0x00c5 }
            X.1BI r0 = r0.A00     // Catch:{ IOException -> 0x00c5 }
            boolean r0 = X.C22971Dz.A0a(r0)     // Catch:{ IOException -> 0x00c5 }
            if (r4 != r0) goto L_0x0059
            X.1Nw r1 = r9.A08     // Catch:{ IOException -> 0x00c5 }
            X.C17960vV.A07(r11)     // Catch:{ IOException -> 0x00c5 }
            X.25F r0 = X.C50332Ua.A00(r11)     // Catch:{ IOException -> 0x00c5 }
            r1.Bhl(r0)     // Catch:{ IOException -> 0x00c5 }
            X.36u r0 = r11.A0O()     // Catch:{ IOException -> 0x00c5 }
            if (r0 == 0) goto L_0x0059
            byte[] r2 = r0.A01()     // Catch:{ IOException -> 0x00c5 }
            if (r2 != 0) goto L_0x006d
        L_0x0059:
            if (r4 == 0) goto L_0x005c
            goto L_0x0061
        L_0x005c:
            r2 = 30
            r1 = 72
            goto L_0x0067
        L_0x0061:
            X.6eK r0 = r9.A0B     // Catch:{ IOException -> 0x00c5 }
            int r2 = r0.A00     // Catch:{ IOException -> 0x00c5 }
            int r1 = r0.A01     // Catch:{ IOException -> 0x00c5 }
        L_0x0067:
            r0 = r4 ^ 1
            byte[] r2 = X.C26521Sl.A0g(r12, r2, r1, r0)     // Catch:{ IOException -> 0x00c5 }
        L_0x006d:
            android.util.Pair r7 = X.C26511Sk.A0A(r12)     // Catch:{ IOException -> 0x00c5 }
            android.util.Pair r6 = X.C26511Sk.A0D(r12)     // Catch:{ IOException -> 0x00c5 }
            X.C18070vi.A0X(r6)     // Catch:{ IOException -> 0x00c5 }
            X.70S r4 = r3.A01     // Catch:{ IOException -> 0x00c5 }
            r5 = 0
            int r0 = r11.A0D     // Catch:{ IOException -> 0x00c5 }
            X.64V r3 = r4.A01     // Catch:{ IOException -> 0x00c5 }
            X.C27086DTl.A06(r4, r3, r12, r0)     // Catch:{ IOException -> 0x00c5 }
            long r0 = X.C26521Sl.A02(r12)     // Catch:{ IOException -> 0x00c5 }
            long r0 = X.C17880vN.A04(r0)     // Catch:{ IOException -> 0x00c5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00c5 }
            r3.A0F = r0     // Catch:{ IOException -> 0x00c5 }
            X.C27086DTl.A05(r6, r4)     // Catch:{ IOException -> 0x00c5 }
            int r0 = X.C108965cb.A01(r7)     // Catch:{ IOException -> 0x00c5 }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ IOException -> 0x00c5 }
            r3.A0H = r0     // Catch:{ IOException -> 0x00c5 }
            int r0 = X.C108965cb.A00(r7)     // Catch:{ IOException -> 0x00c5 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x00c5 }
            long r0 = X.C17880vN.A04(r0)     // Catch:{ IOException -> 0x00c5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00c5 }
            r3.A0E = r0     // Catch:{ IOException -> 0x00c5 }
            if (r2 == 0) goto L_0x00af
            int r5 = r2.length     // Catch:{ IOException -> 0x00c5 }
        L_0x00af:
            long r0 = (long) r5     // Catch:{ IOException -> 0x00c5 }
            r4.A06(r0)     // Catch:{ IOException -> 0x00c5 }
            r1 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x00c5 }
            r3.A05 = r0     // Catch:{ IOException -> 0x00c5 }
            int r0 = r11.A0D     // Catch:{ IOException -> 0x00c5 }
            r10.A00 = r0     // Catch:{ IOException -> 0x00c5 }
            r10.A01 = r12     // Catch:{ IOException -> 0x00c5 }
            r10.A05 = r2     // Catch:{ IOException -> 0x00c5 }
            r10.A04 = r1     // Catch:{ IOException -> 0x00c5 }
            return r10
        L_0x00c5:
            r1 = move-exception
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/attemptReuseExistingVideo"
            com.whatsapp.util.Log.e(r0, r1)
            X.C64062u9.A0Q(r12)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24020Bu6.A00(X.CX7, X.21V, java.io.File):X.CX7");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24020Bu6(PowerManager.WakeLock wakeLock, AnonymousClass190 r5, C218617r r6, AnonymousClass1NM r7, AnonymousClass196 r8, AnonymousClass1ST r9, C18030ve r10, AnonymousClass18K r11, C25351Nw r12, WamediaManager wamediaManager, C24016Bu2 bu2, C26431Sc r15, CT1 ct1, AnonymousClass1NL r17, C26521Sl r18, AnonymousClass1SO r19) {
        super(bu2);
        CT1 ct12 = ct1;
        C18070vi.A0d(ct12, 13);
        C18070vi.A0d(bu2, 16);
        this.A06 = r10;
        this.A01 = r5;
        this.A02 = r6;
        this.A07 = r11;
        this.A0F = r18;
        this.A0C = r15;
        this.A09 = wamediaManager;
        this.A04 = r8;
        this.A05 = r9;
        this.A03 = r7;
        this.A0G = r19;
        this.A0E = r17;
        this.A0D = ct12;
        this.A08 = r12;
        this.A00 = wakeLock;
        this.A0A = bu2;
        this.A0B = new C127416eK((int) (r10.A0E(8216) * 100.0f), (int) r10.A0E(8217));
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.CX7, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a1, code lost:
        if (r18 != 0) goto L_0x02a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02b0, code lost:
        if (r1 != false) goto L_0x02b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0325, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x039c, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:?, code lost:
        r4.A09.uploadMp4FailureLogs(r7, r9, "remove dolby audio track fail", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x04cc, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x04cf, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x04d0, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04d3, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04d4, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04d6, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04d7, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04d9, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04da, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04dc, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04dd, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04df, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04e0, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x04e2, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x04e3, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x04e9, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x04ea, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x04ed, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x04ee, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x04f1, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x04f2, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x04fc, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0505, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x050e, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x051b, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0524, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x052d, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0536, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x053f, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0548, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x05ac, code lost:
        A01(r2, r5, 2131889993);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x05b0, code lost:
        A01(r2, r5, 2131889959);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x05b8, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x05c0, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x05c9, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x05d1, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x05da, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x05e2, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x05eb, code lost:
        if (r6 == null) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x05ee, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x05ef, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x05ff, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0605, code lost:
        com.whatsapp.VideoFrameConverter.setLogFilePath(r15);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x0326 */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0334 A[Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0336 A[Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0493 A[ADDED_TO_REGION, Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x04a7 A[Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04cc A[ExcHandler: IOException (e java.io.IOException), PHI: r15 
      PHI: (r15v46 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x04cf A[ExcHandler: all (th java.lang.Throwable), Splitter:B:52:0x0184] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x04d3 A[ExcHandler: C2Z (e X.C2Z), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x04d6 A[ExcHandler: C1l (e X.C1l), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x04d9 A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04dc A[ExcHandler: InterruptedException (e java.lang.InterruptedException), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04df A[ExcHandler: 1Sd (e X.1Sd), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x04e2 A[ExcHandler: 2RS (e X.2RS), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04e9 A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x04ed A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04f1 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:16:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x04fc A[ExcHandler: C2Z (e X.C2Z), PHI: r15 
      PHI: (r15v45 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x050e A[ExcHandler: C1l (e X.C1l), PHI: r15 
      PHI: (r15v44 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x051b A[ExcHandler: ExecutionException (e java.util.concurrent.ExecutionException), PHI: r15 
      PHI: (r15v43 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x0524  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x052d A[ExcHandler: InterruptedException (e java.lang.InterruptedException), PHI: r15 
      PHI: (r15v42 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x053f A[ExcHandler: 1Sd (e X.1Sd), PHI: r15 
      PHI: (r15v41 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0548  */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x05ac A[Catch:{ all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x05b0 A[Catch:{ all -> 0x05ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x05c0 A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), PHI: r15 
      PHI: (r15v40 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05c9  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x05d1 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), PHI: r15 
      PHI: (r15v39 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x05e2 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), PHI: r15 
      PHI: (r15v38 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x05ee A[ExcHandler: all (th java.lang.Throwable), PHI: r15 
      PHI: (r15v37 java.lang.String) = (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v48 java.lang.String), (r15v50 java.lang.String) binds: [B:209:0x0447, B:213:0x0455, B:206:0x0432, B:176:0x0391, B:179:0x039d, B:177:?, B:171:0x0373] A[DONT_GENERATE, DONT_INLINE], Splitter:B:171:0x0373] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x05ff  */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0605  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0622  */
    /* JADX WARNING: Removed duplicated region for block: B:384:0x06be  */
    /* JADX WARNING: Removed duplicated region for block: B:387:0x06c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C55362fe A07() {
        /*
            r47 = this;
            r4 = r47
            X.Bu2 r3 = r4.A0A
            java.io.File r0 = r3.A04
            r37 = r0
            X.DRK.A04(r37)     // Catch:{ IOException -> 0x000c }
            goto L_0x000f
        L_0x000c:
            r45 = 0
            goto L_0x0011
        L_0x000f:
            r45 = 1
        L_0x0011:
            java.io.File r7 = r3.A06
            long r22 = r37.length()
            long r0 = r3.A00
            r20 = r0
            long r0 = r3.A01
            r18 = r0
            X.CmO r0 = r3.A02
            r46 = r0
            boolean r0 = r0.A08
            r26 = r0
            r2 = 0
            if (r0 == 0) goto L_0x0057
            X.1Sc r11 = r4.A0C
            X.0ve r2 = r11.A03
            r0 = 12852(0x3234, float:1.801E-41)
            X.0vf r1 = X.C18040vf.A02
            int r6 = X.C18020vd.A00(r1, r2, r0)
            r0 = 596(0x254, float:8.35E-43)
            int r5 = X.C18020vd.A00(r1, r2, r0)
            int r0 = X.C26431Sc.A01(r11, r6)
            long r0 = X.C17890vO.A03(r0)
            int r2 = (int) r0
            X.2mD r9 = new X.2mD
            r9.<init>(r5, r6, r2)
        L_0x004a:
            X.C18070vi.A0b(r9)
            X.70S r2 = r3.A01
            X.CX7 r8 = new X.CX7
            r8.<init>()
            r16 = 0
            goto L_0x006b
        L_0x0057:
            boolean r0 = r3.A07
            X.1Sc r11 = r4.A0C
            if (r0 == 0) goto L_0x0062
            X.2mD r9 = r11.A0B()
            goto L_0x004a
        L_0x0062:
            boolean r1 = r3.A06
            boolean r0 = r3.A09
            X.2mD r9 = r11.A0C(r1, r2, r0)
            goto L_0x004a
        L_0x006b:
            X.CT1 r0 = r4.A0D     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            int r1 = r9.A02     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            r39 = r1
            int r15 = r9.A01     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            X.190 r14 = r4.A01     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            X.118 r13 = r0.A01     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            X.0ve r12 = r0.A02     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            X.10I r10 = r0.A05     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            X.1Sc r5 = r0.A04     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            com.whatsapp.media.WamediaManager r1 = r0.A03     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            X.1NM r0 = r0.A00     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            X.DPW r6 = new X.DPW     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            r27 = r6
            r28 = r14
            r29 = r2
            r30 = r0
            r31 = r13
            r32 = r12
            r33 = r1
            r34 = r5
            r35 = r46
            r36 = r10
            r38 = r7
            r40 = r15
            r41 = r20
            r43 = r18
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r43, r45)     // Catch:{ IllegalStateException -> 0x05de, IllegalArgumentException -> 0x05cd, FileNotFoundException -> 0x05bc, IOException -> 0x0591, 2RS -> 0x054d, 1Sd -> 0x053b, InterruptedException -> 0x0529, ExecutionException -> 0x0517, C1l -> 0x050a, C2Z -> 0x04f8, all -> 0x04f5 }
            r3.A00(r6)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.73s r0 = r3.A03     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r34 = 0
            if (r0 == 0) goto L_0x00af
            r34 = 1
            r6.A03 = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x00af:
            r0 = r46
            X.6rN r0 = r0.A03     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            boolean r33 = X.AnonymousClass000.A1W(r0)
            android.util.Pair r1 = X.C26511Sk.A0A(r37)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            int r0 = X.C108965cb.A01(r1)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.Long r0 = X.C17880vN.A0n(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.64V r5 = r2.A01     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r5.A0U = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            int r0 = X.C108965cb.A00(r1)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            long r0 = (long) r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            long r0 = X.C17880vN.A04(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r5.A0R = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.Long r0 = java.lang.Long.valueOf(r22)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r5.A0W = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r25 = 3
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r5.A07 = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            boolean r0 = r3.A06     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r32 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r32)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r5.A01 = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r34 == 0) goto L_0x00f7
            java.util.HashSet r1 = r2.A02     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r0 = "doodle"
            r1.add(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x00f7:
            java.lang.Long r0 = X.C17880vN.A0n(r39)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r5.A0Z = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r2.A00()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.0ve r0 = r4.A06     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r35 = r0
            r10 = 7987(0x1f33, float:1.1192E-41)
            X.0vf r31 = X.C18040vf.A02     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r1 = r31
            boolean r0 = X.C18020vd.A05(r1, r0, r10)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x0184
            if (r26 != 0) goto L_0x0184
            X.CVS r15 = new X.CVS     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r15.<init>()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r0 = r37.getAbsolutePath()     // Catch:{ Exception -> 0x0165 }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x0165 }
            android.media.MediaExtractor r14 = r15.A00     // Catch:{ Exception -> 0x0165 }
            r14.setDataSource(r0)     // Catch:{ Exception -> 0x0165 }
            int r24 = r14.getTrackCount()     // Catch:{ Exception -> 0x0165 }
            r13 = 0
        L_0x0128:
            r0 = r24
            if (r13 >= r0) goto L_0x0184
            android.media.MediaFormat r12 = r14.getTrackFormat(r13)     // Catch:{ Exception -> 0x0165 }
            X.C18070vi.A0X(r12)     // Catch:{ Exception -> 0x0165 }
            java.lang.String r0 = "mime"
            java.lang.String r10 = r12.getString(r0)     // Catch:{ Exception -> 0x0165 }
            if (r10 == 0) goto L_0x0157
            java.lang.String r1 = "audio/"
            r0 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r10, r1, r0)     // Catch:{ Exception -> 0x0165 }
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = "sample-rate"
            boolean r1 = r12.containsKey(r0)     // Catch:{ Exception -> 0x0165 }
            if (r1 == 0) goto L_0x0157
            int r1 = r12.getInteger(r0)     // Catch:{ Exception -> 0x0165 }
            if (r1 == 0) goto L_0x015a
            r0 = 96000(0x17700, float:1.34525E-40)
            if (r1 > r0) goto L_0x015a
        L_0x0157:
            int r13 = r13 + 1
            goto L_0x0128
        L_0x015a:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/sample rate zero"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0165 }
            X.Bw7 r0 = new X.Bw7     // Catch:{ Exception -> 0x0165 }
            r0.<init>()     // Catch:{ Exception -> 0x0165 }
            throw r0     // Catch:{ Exception -> 0x0165 }
        L_0x0165:
            r1 = move-exception
            r0 = 2131889959(0x7f120f27, float:1.9414596E38)
            r4.A01(r2, r1, r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            android.media.MediaExtractor r0 = r15.A00     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0.release()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0 = 0
            r8.A04 = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            android.os.PowerManager$WakeLock r0 = r4.A00
            X.C27086DTl.A04(r0)
            X.196 r0 = r4.A04
            r0.A01()
            goto L_0x0687
        L_0x0184:
            boolean r0 = r3.A08     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r30 = r0
            if (r0 == 0) goto L_0x0191
            java.lang.String r1 = "muted"
            java.util.HashSet r0 = r2.A02     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0.add(r1)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x0191:
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x01a0
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a0
            java.lang.String r1 = "trim"
            java.util.HashSet r0 = r2.A02     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0.add(r1)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x01a0:
            r10 = 2
            X.DPU r0 = new X.DPU     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0.<init>(r4, r10)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r6.A02 = r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.196 r0 = r4.A04     // Catch:{ Exception -> 0x01b6 }
            java.io.File r0 = r0.A00()     // Catch:{ Exception -> 0x01b6 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x01b6 }
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)     // Catch:{ Exception -> 0x01b6 }
            goto L_0x01bc
        L_0x01b6:
            r1 = move-exception
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/Unable to create crash in video sentinel file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x01bc:
            X.1Sl r0 = r4.A0F     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            com.whatsapp.media.WamediaManager r12 = r0.A04     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.71x r13 = new X.71x     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r1 = r26
            r0 = r37
            r13.<init>(r12, r0, r1)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r45 != 0) goto L_0x01e1
            boolean r0 = X.AnonymousClass112.A01()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x020d
            boolean r0 = X.CDR.A00(r13)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x01d5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            boolean r0 = r0.booleanValue()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            int r25 = X.AnonymousClass000.A09(r0)
        L_0x01e1:
            r0 = r25
            r2.A03(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r2.A07(r13)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            android.os.PowerManager$WakeLock r0 = r4.A00     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r29 = r0
            if (r0 == 0) goto L_0x01f2
            r29.acquire()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x01f2:
            boolean r0 = r37.exists()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x04b4
            r12 = 8393(0x20c9, float:1.1761E-41)
            r1 = r31
            r0 = r35
            boolean r0 = X.C18020vd.A05(r1, r0, r12)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x0240
            r15 = 0
            java.lang.String r0 = "MediaMetadataUtils/isVideoCapturedBySmartglasses"
            X.5dc r14 = new X.5dc     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r14.<init>(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            goto L_0x020f
        L_0x020d:
            r0 = 0
            goto L_0x01d5
        L_0x020f:
            r12 = 0
            r0 = r37
            r14.A00(r0)     // Catch:{ Exception -> 0x022f }
            r0 = 4
            java.lang.String r1 = r14.extractMetadata(r0)     // Catch:{ Exception -> 0x022f }
            java.lang.String r0 = "Meta View"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x022f }
            if (r0 != 0) goto L_0x022a
            java.lang.String r0 = "Facebook View"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x022f }
            if (r0 == 0) goto L_0x0235
        L_0x022a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)     // Catch:{ Exception -> 0x022f }
            goto L_0x0235
        L_0x022f:
            r1 = move-exception
            java.lang.String r0 = "MediaMetadataUtils/wasVideoCapturedBySmartglasses"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x023b }
        L_0x0235:
            r14.close()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r8.A02 = r12     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            goto L_0x0240
        L_0x023b:
            r0 = move-exception
            r14.close()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            throw r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x0240:
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x0252
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x024f
            long r0 = r13.A03     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            int r12 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x024f
            goto L_0x0252
        L_0x024f:
            r28 = 0
            goto L_0x0254
        L_0x0252:
            r28 = 1
        L_0x0254:
            int r14 = r13.A02     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            int r12 = r13.A00     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r14 == 0) goto L_0x04ad
            if (r12 == 0) goto L_0x04ad
            r1 = r14
            if (r14 >= r12) goto L_0x0260
            r1 = r12
        L_0x0260:
            r0 = r39
            if (r0 <= r1) goto L_0x0266
            r39 = r1
        L_0x0266:
            r0 = r39
            android.util.Pair r1 = X.C26431Sc.A03(r14, r12, r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.Object r0 = r1.first     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r27 = r0
            r0 = r27
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r27 = r0
            java.lang.Object r0 = r1.second     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r26 = r0
            r0 = r26
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r26 = r0
            boolean r12 = r3.A0A     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            long r0 = r13.A03     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r24 = r0
            long r13 = X.C17880vN.A04(r24)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0 = r22
            android.util.Pair r11 = r11.A0A(r0, r13)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r13 = 5178(0x143a, float:7.256E-42)
            r1 = r31
            r0 = r35
            boolean r14 = X.C18020vd.A05(r1, r0, r13)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x02a3
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            r13 = 1
            if (r0 == 0) goto L_0x02a4
        L_0x02a3:
            r13 = 0
        L_0x02a4:
            if (r12 != 0) goto L_0x02b2
            java.lang.Object r0 = r11.first     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.C18070vi.A0W(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            boolean r1 = X.AnonymousClass000.A1Y(r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0 = 0
            if (r1 == 0) goto L_0x02b3
        L_0x02b2:
            r0 = 1
        L_0x02b3:
            if (r13 == 0) goto L_0x0371
            if (r34 != 0) goto L_0x0371
            if (r33 != 0) goto L_0x0371
            if (r0 == 0) goto L_0x0371
            if (r14 != 0) goto L_0x0371
            java.lang.String r0 = "mediatranscodequeue/attemptToDedupeVideo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r13 = X.C1402370n.A00(r37)     // Catch:{ IOException -> 0x0325, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            boolean r0 = r3.A07     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x02dc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r13)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r0 = "-hd"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            byte[] r0 = X.C108975cc.A1O(r0)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r13 = android.util.Base64.encodeToString(r0, r10)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x02dc:
            if (r30 == 0) goto L_0x02f0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r13)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r0 = "-mute"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            byte[] r0 = X.C108975cc.A1O(r0)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r13 = android.util.Base64.encodeToString(r0, r10)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x02f0:
            r0 = r46
            boolean r0 = r0.A07     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x031b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r13)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0 = 45
            r1.append(r0)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0 = r46
            int r0 = r0.A01     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r1.append(r0)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0 = 45
            r1.append(r0)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            r0 = r46
            int r0 = r0.A00     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            byte[] r0 = X.C108975cc.A1O(r0)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r13 = android.util.Base64.encodeToString(r0, r10)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x031b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.lang.String r0 = "mediatranscodequeue/computedHash="
            X.C17900vP.A0f(r0, r13, r1)     // Catch:{ IOException -> 0x0326, IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            goto L_0x0326
        L_0x0325:
            r13 = 0
        L_0x0326:
            X.1ST r1 = r4.A05     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.21V r0 = r1.A0B(r13)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x0336
            X.CX7 r0 = r4.A00(r8, r0, r7)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x0336
            goto L_0x0690
        L_0x0336:
            if (r13 == 0) goto L_0x036f
            r0 = 3
            java.util.ArrayList r0 = r1.A0E(r13, r0)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.util.ArrayList r10 = X.AnonymousClass000.A13()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x0345:
            boolean r0 = r14.hasNext()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x0357
            java.lang.Object r1 = r14.next()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            boolean r0 = r1 instanceof X.AnonymousClass21Y     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x0345
            r10.add(r1)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            goto L_0x0345
        L_0x0357:
            java.util.Iterator r1 = r10.iterator()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
        L_0x035b:
            boolean r0 = r1.hasNext()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x036f
            java.lang.Object r0 = r1.next()     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.21Y r0 = (X.AnonymousClass21Y) r0     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            X.CX7 r0 = r4.A00(r8, r0, r7)     // Catch:{ IllegalStateException -> 0x04f1, IllegalArgumentException -> 0x04ed, FileNotFoundException -> 0x04e9, IOException -> 0x04e5, 2RS -> 0x04e2, 1Sd -> 0x04df, InterruptedException -> 0x04dc, ExecutionException -> 0x04d9, C1l -> 0x04d6, C2Z -> 0x04d3, all -> 0x04cf }
            if (r0 == 0) goto L_0x035b
            goto L_0x0690
        L_0x036f:
            r15 = 0
            goto L_0x0373
        L_0x0371:
            r15 = 0
            goto L_0x0375
        L_0x0373:
            r8.A03 = r13     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x0375:
            X.1SO r0 = r4.A0G     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            X.1SP r1 = X.AnonymousClass1SO.A04(r37)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            int r10 = r1.A00     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r1 = 8
            if (r10 != r1) goto L_0x03a7
            java.lang.String r1 = "mediatranscodequeue/needs dolby EAC3 Audio track removal"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            X.1NM r10 = r4.A03     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r1 = r37
            java.io.File r10 = r10.A01(r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            X.C18070vi.A0X(r10)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            com.whatsapp.media.WamediaManager r13 = r4.A09     // Catch:{ 2RS -> 0x039c, IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r13.removeDolbyEAC3Track(r1, r10)     // Catch:{ 2RS -> 0x039c, IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r6.A04 = r10     // Catch:{ 2RS -> 0x039c, IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            X.DPW.A01(r6)     // Catch:{ 2RS -> 0x039c, IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            goto L_0x03a9
        L_0x039c:
            r9 = move-exception
            com.whatsapp.media.WamediaManager r5 = r4.A09     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.lang.String r1 = "remove dolby audio track fail"
            r0 = 0
            r5.uploadMp4FailureLogs(r7, r9, r1, r0)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            goto L_0x0469
        L_0x03a7:
            r10 = r37
        L_0x03a9:
            if (r28 == 0) goto L_0x03b7
            int r10 = X.AnonymousClass3MY.A03(r27)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            int r11 = X.AnonymousClass3MY.A03(r26)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            long r24 = r18 - r20
            goto L_0x0472
        L_0x03b7:
            java.lang.Object r1 = r11.first     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            boolean r1 = X.AnonymousClass000.A1Y(r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            if (r1 != 0) goto L_0x03ea
            if (r12 != 0) goto L_0x03ea
            if (r33 != 0) goto L_0x03ea
            java.lang.String r1 = "mediatranscodequeue/copy/not-need-transcode"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.lang.String r1 = "NotNeedTranscode"
            java.util.HashSet r9 = r2.A03     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r9.add(r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.lang.Object r1 = r11.second     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.util.Iterator r11 = r1.iterator()     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x03d7:
            boolean r1 = r11.hasNext()     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            if (r1 == 0) goto L_0x043c
            java.lang.Object r1 = r11.next()     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            X.C18070vi.A0X(r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r9.add(r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            goto L_0x03d7
        L_0x03ea:
            r14 = 228(0xe4, float:3.2E-43)
            r13 = r31
            r1 = r35
            boolean r1 = X.C18020vd.A05(r13, r1, r14)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            if (r1 == 0) goto L_0x046a
            if (r34 != 0) goto L_0x046a
            if (r33 != 0) goto L_0x046a
            java.lang.Object r1 = r11.first     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            X.C18070vi.A0W(r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            boolean r1 = X.AnonymousClass000.A1Y(r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            if (r1 == 0) goto L_0x046a
            if (r12 != 0) goto L_0x046a
            int r34 = X.AnonymousClass3MY.A03(r27)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            int r35 = X.AnonymousClass3MY.A03(r26)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.lang.String r11 = "ProcessVideoTask/processVideo/mediatranscodequeue/transcodeVideoWithFallback/exception"
            java.lang.Integer r1 = X.C17880vN.A0h()     // Catch:{ 1Se | 2RS | IOException -> 0x0431 }
            r5.A09 = r1     // Catch:{ 1Se | 2RS | IOException -> 0x0431 }
            r1 = r30
            r6.A06 = r1     // Catch:{ 1Se | 2RS | IOException -> 0x0431 }
            int r1 = r9.A00     // Catch:{ 1Se | 2RS | IOException -> 0x0431 }
            r36 = 9
            if (r32 == 0) goto L_0x0423
            r36 = 6
        L_0x0423:
            r37 = r24
            r33 = r1
            float r1 = X.C26431Sc.A00(r33, r34, r35, r36, r37)     // Catch:{ 1Se | 2RS | IOException -> 0x0431 }
            r6.A00 = r1     // Catch:{ 1Se | 2RS | IOException -> 0x0431 }
            r6.A04()     // Catch:{ 1Se | 2RS | IOException -> 0x0431 }
            goto L_0x048f
        L_0x0431:
            r1 = move-exception
            com.whatsapp.util.Log.e(r11, r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.lang.String r9 = "Fallback"
            java.util.HashSet r1 = r2.A03     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r1.add(r9)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x043c:
            java.lang.Integer r1 = X.C17880vN.A0j()     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r5.A09 = r1     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            X.17r r1 = r4.A02     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r1.A0i(r10, r7)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            com.whatsapp.media.WamediaManager r1 = r4.A09     // Catch:{ 2RS -> 0x0453, IOException -> 0x0463 }
            r1.checkAndRepair(r7)     // Catch:{ 2RS -> 0x0453, IOException -> 0x0463 }
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()     // Catch:{ 2RS -> 0x0453, IOException -> 0x0463 }
            r5.A02 = r1     // Catch:{ 2RS -> 0x0453, IOException -> 0x0463 }
            goto L_0x048f
        L_0x0453:
            r9 = move-exception
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r5.A02 = r0     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            com.whatsapp.media.WamediaManager r5 = r4.A09     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.lang.String r0 = "only repair on upload"
            r5.uploadMp4FailureLogs(r7, r9, r0, r1)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            goto L_0x0469
        L_0x0463:
            r9 = move-exception
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/repair/io-exception/"
            com.whatsapp.util.Log.e(r0, r9)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x0469:
            throw r9     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x046a:
            int r10 = X.AnonymousClass3MY.A03(r27)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            int r11 = X.AnonymousClass3MY.A03(r26)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x0472:
            java.lang.Integer r1 = X.C17880vN.A0h()     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r5.A09 = r1     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r1 = r30
            r6.A06 = r1     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            int r1 = r9.A00     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r12 = 9
            if (r32 == 0) goto L_0x0483
            r12 = 6
        L_0x0483:
            r13 = r24
            r9 = r1
            float r1 = X.C26431Sc.A00(r9, r10, r11, r12, r13)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r6.A00 = r1     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r6.A04()     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x048f:
            boolean r1 = r6.A0S     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            if (r1 != 0) goto L_0x04a7
            if (r30 == 0) goto L_0x049e
            boolean r1 = r6.A0T     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            if (r1 != 0) goto L_0x049e
            com.whatsapp.media.WamediaManager r1 = r4.A09     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r1.removeAudioTracks(r7)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x049e:
            boolean r0 = r0.A0G(r7)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            if (r0 == 0) goto L_0x04c2
            r1 = 1
            goto L_0x0615
        L_0x04a7:
            java.lang.String r0 = "Cancel"
            r5.A0g = r0     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            goto L_0x0614
        L_0x04ad:
            r15 = 0
            X.Bw9 r1 = new X.Bw9     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            goto L_0x04c8
        L_0x04b4:
            r15 = 0
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            java.lang.String r0 = "transcode input file does not exist"
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            r1.<init>(r0)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
            goto L_0x04c8
        L_0x04c2:
            java.lang.String r0 = "video was not transcoded correctly"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x04c8:
            throw r1     // Catch:{ IllegalStateException -> 0x05e2, IllegalArgumentException -> 0x05d1, FileNotFoundException -> 0x05c0, IOException -> 0x04cc, 2RS -> 0x04c9, 1Sd -> 0x053f, InterruptedException -> 0x052d, ExecutionException -> 0x051b, C1l -> 0x050e, C2Z -> 0x04fc, all -> 0x05ee }
        L_0x04c9:
            r5 = move-exception
            goto L_0x0550
        L_0x04cc:
            r5 = move-exception
            goto L_0x0594
        L_0x04cf:
            r1 = move-exception
            r15 = 0
            goto L_0x05ef
        L_0x04d3:
            r1 = move-exception
            r15 = 0
            goto L_0x04fd
        L_0x04d6:
            r1 = move-exception
            r15 = 0
            goto L_0x050f
        L_0x04d9:
            r1 = move-exception
            r15 = 0
            goto L_0x051c
        L_0x04dc:
            r1 = move-exception
            r15 = 0
            goto L_0x052e
        L_0x04df:
            r1 = move-exception
            r15 = 0
            goto L_0x0540
        L_0x04e2:
            r5 = move-exception
            r15 = 0
            goto L_0x0550
        L_0x04e5:
            r5 = move-exception
            r15 = 0
            goto L_0x0594
        L_0x04e9:
            r1 = move-exception
            r15 = 0
            goto L_0x05c1
        L_0x04ed:
            r1 = move-exception
            r15 = 0
            goto L_0x05d2
        L_0x04f1:
            r1 = move-exception
            r15 = 0
            goto L_0x05e3
        L_0x04f5:
            r1 = move-exception
            goto L_0x05f2
        L_0x04f8:
            r1 = move-exception
            r15 = 0
            r6 = r15
            goto L_0x04fd
        L_0x04fc:
            r1 = move-exception
        L_0x04fd:
            r0 = 2131889959(0x7f120f27, float:1.9414596E38)
            r4.A01(r2, r1, r0)     // Catch:{ all -> 0x05ea }
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x050a:
            r1 = move-exception
            r15 = 0
            r6 = r15
            goto L_0x050f
        L_0x050e:
            r1 = move-exception
        L_0x050f:
            r0 = 2131889959(0x7f120f27, float:1.9414596E38)
            r4.A01(r2, r1, r0)     // Catch:{ all -> 0x05ea }
            goto L_0x0603
        L_0x0517:
            r1 = move-exception
            r15 = 0
            r6 = r15
            goto L_0x051c
        L_0x051b:
            r1 = move-exception
        L_0x051c:
            r0 = 2131889959(0x7f120f27, float:1.9414596E38)
            r4.A01(r2, r1, r0)     // Catch:{ all -> 0x05ea }
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x0529:
            r1 = move-exception
            r15 = 0
            r6 = r15
            goto L_0x052e
        L_0x052d:
            r1 = move-exception
        L_0x052e:
            r0 = 2131889959(0x7f120f27, float:1.9414596E38)
            r4.A01(r2, r1, r0)     // Catch:{ all -> 0x05ea }
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x053b:
            r1 = move-exception
            r15 = 0
            r6 = r15
            goto L_0x0540
        L_0x053f:
            r1 = move-exception
        L_0x0540:
            r0 = 2131889959(0x7f120f27, float:1.9414596E38)
            r4.A01(r2, r1, r0)     // Catch:{ all -> 0x05ea }
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x054d:
            r5 = move-exception
            r15 = 0
            r6 = r15
        L_0x0550:
            java.lang.String r0 = "ProcessVideoTask/processVideo/mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r5)     // Catch:{ all -> 0x05ea }
            X.8s0 r1 = new X.8s0     // Catch:{ all -> 0x05ea }
            r1.<init>()     // Catch:{ all -> 0x05ea }
            java.lang.Integer r0 = X.C17880vN.A0l()     // Catch:{ all -> 0x05ea }
            r1.A02 = r0     // Catch:{ all -> 0x05ea }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x05ea }
            r1.A09 = r0     // Catch:{ all -> 0x05ea }
            X.18K r0 = r4.A07     // Catch:{ all -> 0x05ea }
            r0.CC7(r1)     // Catch:{ all -> 0x05ea }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05ea }
            java.lang.String r0 = "Mp4OpsFail ("
            r1.append(r0)     // Catch:{ all -> 0x05ea }
            int r0 = r5.errorCode     // Catch:{ all -> 0x05ea }
            java.lang.String r1 = X.AnonymousClass001.A1L(r1, r0)     // Catch:{ all -> 0x05ea }
            X.64V r0 = r2.A01     // Catch:{ all -> 0x05ea }
            r0.A0g = r1     // Catch:{ all -> 0x05ea }
            java.lang.String r0 = r5.detailMessage     // Catch:{ all -> 0x05ea }
            r2.A08(r0)     // Catch:{ all -> 0x05ea }
            r1 = 2131889959(0x7f120f27, float:1.9414596E38)
            X.E6h r0 = r3.A05     // Catch:{ all -> 0x05ea }
            r0.BJ0(r1)     // Catch:{ all -> 0x05ea }
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x0591:
            r5 = move-exception
            r15 = 0
            r6 = r15
        L_0x0594:
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x05ea }
            if (r0 == 0) goto L_0x05b0
            java.lang.String r1 = r5.getMessage()     // Catch:{ all -> 0x05ea }
            if (r1 == 0) goto L_0x05b0
            java.lang.String r0 = "No space"
            boolean r9 = X.AnonymousClass1YF.A0V(r1, r0)     // Catch:{ all -> 0x05ea }
            r1 = 1
            r0 = 2131889993(0x7f120f49, float:1.9414665E38)
            if (r9 != r1) goto L_0x05b0
            r4.A01(r2, r5, r0)     // Catch:{ all -> 0x05ea }
            goto L_0x05b6
        L_0x05b0:
            r0 = 2131889959(0x7f120f27, float:1.9414596E38)
            r4.A01(r2, r5, r0)     // Catch:{ all -> 0x05ea }
        L_0x05b6:
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x05bc:
            r1 = move-exception
            r15 = 0
            r6 = r15
            goto L_0x05c1
        L_0x05c0:
            r1 = move-exception
        L_0x05c1:
            r0 = 2131889982(0x7f120f3e, float:1.9414643E38)
            r4.A01(r2, r1, r0)     // Catch:{ all -> 0x05ea }
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x05cd:
            r1 = move-exception
            r15 = 0
            r6 = r15
            goto L_0x05d2
        L_0x05d1:
            r1 = move-exception
        L_0x05d2:
            r0 = 2131890007(0x7f120f57, float:1.9414694E38)
            r4.A01(r2, r1, r0)     // Catch:{ all -> 0x05ea }
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x05de:
            r1 = move-exception
            r15 = 0
            r6 = r15
            goto L_0x05e3
        L_0x05e2:
            r1 = move-exception
        L_0x05e3:
            r0 = 2131890007(0x7f120f57, float:1.9414694E38)
            r4.A01(r2, r1, r0)     // Catch:{ all -> 0x05ea }
            goto L_0x05fd
        L_0x05ea:
            r1 = move-exception
            if (r6 == 0) goto L_0x05f2
            goto L_0x05ef
        L_0x05ee:
            r1 = move-exception
        L_0x05ef:
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
        L_0x05f2:
            android.os.PowerManager$WakeLock r0 = r4.A00
            X.C27086DTl.A04(r0)
            X.196 r0 = r4.A04
            r0.A01()
            throw r1
        L_0x05fd:
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            goto L_0x0608
        L_0x0603:
            if (r6 == 0) goto L_0x0608
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
        L_0x0608:
            android.os.PowerManager$WakeLock r0 = r4.A00
            X.C27086DTl.A04(r0)
            X.196 r0 = r4.A04
            r0.A01()
        L_0x0612:
            r0 = 0
            goto L_0x0685
        L_0x0614:
            r1 = 0
        L_0x0615:
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            X.C27086DTl.A04(r29)
            X.196 r0 = r4.A04
            r0.A01()
            if (r1 == 0) goto L_0x0612
            if (r32 == 0) goto L_0x068b
            X.6eK r0 = r4.A0B
            int r6 = r0.A00
            int r1 = r0.A01
        L_0x062a:
            r0 = r32 ^ 1
            byte[] r9 = X.C26521Sl.A0g(r7, r6, r1, r0)
            int r0 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x063b
            if (r9 != 0) goto L_0x063b
            java.lang.String r0 = "mediatranscodequeue/could not get video thumb"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x063b:
            int r6 = X.C26511Sk.A03(r7)
            android.util.Pair r12 = X.C26511Sk.A0A(r7)
            android.util.Pair r1 = X.C26511Sk.A0D(r7)
            X.C18070vi.A0X(r1)
            X.C27086DTl.A06(r2, r5, r7, r6)
            long r10 = X.C26521Sl.A02(r7)
            long r10 = X.C17880vN.A04(r10)
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r5.A0F = r0
            X.C27086DTl.A05(r1, r2)
            int r0 = X.C108965cb.A01(r12)
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r5.A0H = r0
            int r0 = X.C108965cb.A00(r12)
            long r0 = (long) r0
            long r0 = X.C17880vN.A04(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0E = r0
            if (r9 == 0) goto L_0x0689
            int r0 = r9.length
        L_0x067a:
            long r0 = (long) r0
            r2.A06(r0)
            r8.A00 = r6
            r8.A01 = r7
            r8.A05 = r9
            r0 = 1
        L_0x0685:
            r8.A04 = r0
        L_0x0687:
            r0 = r8
            goto L_0x069c
        L_0x0689:
            r0 = 0
            goto L_0x067a
        L_0x068b:
            r6 = 30
            r1 = 72
            goto L_0x062a
        L_0x0690:
            r1 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r1)
            X.C27086DTl.A04(r29)
            X.196 r1 = r4.A04
            r1.A01()
        L_0x069c:
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x06ba
            X.0ve r6 = r4.A06
            r1 = 12261(0x2fe5, float:1.7181E-41)
            X.0vf r5 = X.C18040vf.A02
            int r12 = X.C18020vd.A00(r5, r6, r1)
            if (r12 < 0) goto L_0x06ba
            X.190 r1 = r4.A01
            int r8 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x06ca
            int r8 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r8 > 0) goto L_0x06ca
            boolean r8 = r3.A08
            if (r8 != 0) goto L_0x06ca
        L_0x06ba:
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x06c6
            r2.A02()
        L_0x06c1:
            X.Bu3 r0 = r0.A00()
            return r0
        L_0x06c6:
            r2.A01()
            goto L_0x06c1
        L_0x06ca:
            X.1D6 r11 = X.C26521Sl.A0X(r7)
            boolean r8 = r3.A08
            boolean r7 = r3.A05
            r9 = r1
            r10 = r3
            r13 = r20
            r15 = r18
            r17 = r8
            r18 = r7
            boolean r1 = X.C26521Sl.A0b(r9, r10, r11, r12, r13, r15, r17, r18)
            if (r1 != 0) goto L_0x06ba
            r1 = 12260(0x2fe4, float:1.718E-41)
            boolean r1 = X.C18020vd.A05(r5, r6, r1)
            if (r1 == 0) goto L_0x06ba
            r1 = 0
            r0.A04 = r1
            X.CXH r1 = r4.A00
            r3 = 2131890007(0x7f120f57, float:1.9414694E38)
            X.E6h r1 = r1.A05
            r1.BJ0(r3)
            goto L_0x06ba
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24020Bu6.A07():X.2fe");
    }

    private final void A01(AnonymousClass70S r6, Exception exc, int i) {
        String str;
        String A002 = C25359CeJ.A00(exc);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("message = ");
        AnonymousClass8BS.A1I(A10, exc);
        StringBuilder A11 = AnonymousClass000.A11(C17890vO.A0c(A10, 10));
        A11.append("Trace: ");
        String arrays = Arrays.toString(exc.getStackTrace());
        C18070vi.A0X(arrays);
        StringBuilder A112 = AnonymousClass000.A11(AnonymousClass8BW.A0l(arrays, A11, 10));
        A112.append("cause = ");
        A112.append(exc.getCause());
        StringBuilder A113 = AnonymousClass000.A11(C17890vO.A0c(A112, 10));
        A113.append("cause trace = ");
        Throwable cause = exc.getCause();
        if (cause != null) {
            str = C25359CeJ.A00(cause);
        } else {
            str = null;
        }
        StringBuilder A114 = AnonymousClass000.A11(AnonymousClass8BW.A0l(str, A113, 10));
        A114.append("full trace = ");
        String A0l = AnonymousClass8BW.A0l(A002, A114, 10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("ProcessVideoTask/processVideo/mediatranscodequeue/");
        Class<?> cls = exc.getClass();
        Map map = AnonymousClass20F.A03;
        C18070vi.A0d(cls, 1);
        C108985cd.A1M(C60662oP.A01(cls), A102, exc);
        C171618s0 r1 = new C171618s0();
        r1.A02 = C17880vN.A0l();
        r1.A09 = exc.toString();
        this.A07.CC7(r1);
        r6.A01.A0g = cls.getName();
        r6.A08(A0l);
        this.A01.A0G("ProcessVideoTask/handleException", A0l, true);
        this.A0A.A05.BJ0(i);
    }
}
