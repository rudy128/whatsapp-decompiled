package X;

/* renamed from: X.9Bm  reason: invalid class name and case insensitive filesystem */
public class C178019Bm extends C201010v {
    public boolean A00;
    public boolean A01;
    public final long A02;
    public final C52942bj A03;
    public final AnonymousClass11C A04;
    public final Object A05 = C17880vN.A0p();
    public final /* synthetic */ C22501Ai A06;

    /* JADX WARNING: type inference failed for: r5v4, types: [X.9Zr, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:28|29|30|31|32) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0020, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0020, code lost:
        r5 = r5;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            r3 = 0
        L_0x0001:
            r9 = 0
            X.1Ai r4 = r10.A06     // Catch:{ RuntimeException -> 0x00bb }
            X.11C r0 = r10.A04     // Catch:{ RuntimeException -> 0x00bb }
            android.app.ActivityManager r0 = r0.A04()     // Catch:{ RuntimeException -> 0x00bb }
            X.C17960vV.A07(r0)     // Catch:{ RuntimeException -> 0x00bb }
            java.util.List r0 = r0.getProcessesInErrorState()     // Catch:{ RuntimeException -> 0x00bb }
            r5 = 0
            if (r0 == 0) goto L_0x0047
            int r8 = android.os.Process.myUid()     // Catch:{ RuntimeException -> 0x00bb }
            int r7 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x00bb }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ RuntimeException -> 0x00bb }
        L_0x0020:
            boolean r0 = r6.hasNext()     // Catch:{ RuntimeException -> 0x00bb }
            if (r0 == 0) goto L_0x0047
            java.lang.Object r2 = r6.next()     // Catch:{ RuntimeException -> 0x00bb }
            android.app.ActivityManager$ProcessErrorStateInfo r2 = (android.app.ActivityManager.ProcessErrorStateInfo) r2     // Catch:{ RuntimeException -> 0x00bb }
            int r1 = r2.condition     // Catch:{ RuntimeException -> 0x00bb }
            r0 = 2
            if (r1 != r0) goto L_0x0020
            int r0 = r2.uid     // Catch:{ RuntimeException -> 0x00bb }
            if (r0 != r8) goto L_0x0020
            int r0 = r2.pid     // Catch:{ RuntimeException -> 0x00bb }
            if (r0 != r7) goto L_0x0020
            X.9Zr r5 = new X.9Zr     // Catch:{ RuntimeException -> 0x00bb }
            r5.<init>()     // Catch:{ RuntimeException -> 0x00bb }
            java.lang.String r0 = r2.shortMsg     // Catch:{ RuntimeException -> 0x00bb }
            r5.A00 = r0     // Catch:{ RuntimeException -> 0x00bb }
            java.lang.String r0 = r2.tag     // Catch:{ RuntimeException -> 0x00bb }
            r5.A01 = r0     // Catch:{ RuntimeException -> 0x00bb }
            goto L_0x0020
        L_0x0047:
            boolean r0 = r10.A00     // Catch:{ RuntimeException -> 0x00bb }
            if (r0 == 0) goto L_0x0067
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ RuntimeException -> 0x00bb }
            java.lang.String r0 = "ProcessANRErrorMonitor/Starting process monitor checks for process "
            r1.append(r0)     // Catch:{ RuntimeException -> 0x00bb }
            int r0 = android.os.Process.myPid()     // Catch:{ RuntimeException -> 0x00bb }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ RuntimeException -> 0x00bb }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x00bb }
            r10.A00 = r9     // Catch:{ RuntimeException -> 0x00bb }
            X.2bj r1 = r10.A03     // Catch:{ RuntimeException -> 0x00bb }
            r0 = 0
            X.C22501Ai.A00(r4, r1, r0, r0, r9)     // Catch:{ RuntimeException -> 0x00bb }
        L_0x0067:
            if (r5 != 0) goto L_0x0098
            int r3 = r3 + 1
            r0 = 120(0x78, float:1.68E-43)
            if (r3 < r0) goto L_0x007c
            X.2bj r2 = r10.A03
            r1 = 2
            r0 = 0
            X.C22501Ai.A00(r4, r2, r0, r0, r1)
            java.lang.String r0 = "ProcessANRErrorMonitor/Stopping checks because of MAX_NUMBER_BEFORE_ERROR"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x007c:
            java.lang.Object r2 = r10.A05
            monitor-enter(r2)
            boolean r0 = r10.A01     // Catch:{ all -> 0x0095 }
            if (r0 != 0) goto L_0x008a
            r0 = 500(0x1f4, double:2.47E-321)
            r2.wait(r0)     // Catch:{ InterruptedException -> 0x0088 }
        L_0x0088:
            boolean r0 = r10.A01     // Catch:{ all -> 0x0095 }
        L_0x008a:
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            if (r0 == 0) goto L_0x0001
            X.2bj r2 = r10.A03
            r1 = 3
            r0 = 0
            X.C22501Ai.A00(r4, r2, r0, r0, r1)
            return
        L_0x0095:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0095 }
            throw r0
        L_0x0098:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ProcessANRErrorMonitor/ANR detected Short msg: "
            r1.append(r0)
            java.lang.String r0 = r5.A00
            r1.append(r0)
            java.lang.String r0 = " Tag: "
            r1.append(r0)
            java.lang.String r0 = r5.A01
            X.C17890vO.A1B(r1, r0)
            X.2bj r3 = r10.A03
            java.lang.String r2 = r5.A00
            java.lang.String r1 = r5.A01
            r0 = 1
            X.C22501Ai.A00(r4, r3, r2, r1, r0)
            return
        L_0x00bb:
            r1 = move-exception
            r1.printStackTrace()
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x00d1
            X.1Ai r3 = r10.A06
            X.2bj r2 = r10.A03
            r1 = 4
            r0 = 0
            X.C22501Ai.A00(r3, r2, r0, r0, r1)
            return
        L_0x00d1:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C178019Bm.run():void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C178019Bm(C22501Ai r2, C52942bj r3, AnonymousClass11C r4, long j) {
        super("ProcessAnrErrorMonitorThread");
        this.A06 = r2;
        this.A03 = r3;
        this.A02 = j;
        this.A00 = true;
        this.A04 = r4;
    }
}
