package X;

import android.os.Debug;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.Map;

public final class AIE implements C22550BCh {
    public static final Map A07 = C17880vN.A11();
    public long A00 = 0;
    public AnonymousClass8Ka A01;
    public Thread A02;
    public final B4V[] A03;
    public final C185339cQ A04 = new C185339cQ();
    public final AIC A05;
    public final boolean A06;

    public void BLK() {
        BLJ((Message) null);
    }

    public void CNs() {
        CNm((Message) null);
    }

    public void BLJ(Message message) {
        AnonymousClass8Ka r2 = this.A01;
        if (r2 != null) {
            r2.A04 = SystemClock.uptimeMillis();
            r2.A03 = SystemClock.currentThreadTimeMillis();
            if (this.A06) {
                AnonymousClass8Ka.A08 = null;
            }
            AnonymousClass8Ka r1 = this.A01;
            r1.A05 = true;
            this.A05.A01(r1);
            this.A01 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r5 != null) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CNm(android.os.Message r7) {
        /*
            r6 = this;
            X.9cQ r4 = r6.A04
            java.util.LinkedList r3 = r4.A00
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x001e
            java.lang.Object r5 = r3.pollLast()
            X.8Ka r5 = (X.AnonymousClass8Ka) r5
            if (r5 != 0) goto L_0x0040
        L_0x0012:
            java.util.concurrent.atomic.AtomicInteger r2 = r4.A02
            int r0 = r2.get()
            if (r0 <= 0) goto L_0x00d2
            java.util.LinkedList r1 = r4.A01
            monitor-enter(r1)
            goto L_0x0020
        L_0x001e:
            r5 = 0
            goto L_0x0012
        L_0x0020:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0039
            java.lang.Object r5 = r1.pollLast()     // Catch:{ all -> 0x003b }
            X.8Ka r5 = (X.AnonymousClass8Ka) r5     // Catch:{ all -> 0x003b }
            r3.addAll(r1)     // Catch:{ all -> 0x003b }
            r1.clear()     // Catch:{ all -> 0x003b }
            int r0 = r1.size()     // Catch:{ all -> 0x003b }
            r2.set(r0)     // Catch:{ all -> 0x003b }
        L_0x0039:
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            goto L_0x003e
        L_0x003b:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            throw r0
        L_0x003e:
            if (r5 == 0) goto L_0x00d2
        L_0x0040:
            java.lang.Thread r4 = r6.A02
            long r2 = r6.A00
            r0 = 1
            long r0 = r0 + r2
            r6.A00 = r0
            r5.A03 = r4
            r5.A01 = r2
            if (r7 != 0) goto L_0x0090
            r0 = 1
            r5.A09 = r0
        L_0x0052:
            long r0 = android.os.SystemClock.uptimeMillis()
            r5.A02 = r0
            long r0 = android.os.SystemClock.currentThreadTimeMillis()
            r5.A01 = r0
            java.lang.System.currentTimeMillis()
            r0 = 0
            r5.A00 = r0
            X.1da r0 = X.C30221da.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A00
            boolean r0 = r0.get()
            if (r0 == 0) goto L_0x008d
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
        L_0x0070:
            r5.A02 = r0
            r0 = 1
            r5.A06 = r0
            boolean r0 = r6.A06
            if (r0 == 0) goto L_0x007b
            X.AnonymousClass8Ka.A08 = r5
        L_0x007b:
            X.AIC r0 = r6.A05
            r0.A01(r5)
            r6.A01 = r5
            long r3 = r6.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x008c
            r6.A00 = r1
        L_0x008c:
            return
        L_0x008d:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0070
        L_0x0090:
            r0 = 0
            r5.A09 = r0
            int r0 = r7.what
            r5.A00 = r0
            android.os.Handler r0 = r7.getTarget()
            if (r0 == 0) goto L_0x00a7
            android.os.Handler r0 = r7.getTarget()
            java.lang.Class r0 = r0.getClass()
            r5.A08 = r0
        L_0x00a7:
            java.lang.Runnable r0 = r7.getCallback()
            if (r0 == 0) goto L_0x00b7
            java.lang.Runnable r0 = r7.getCallback()
            java.lang.Class r0 = r0.getClass()
            r5.A06 = r0
        L_0x00b7:
            java.lang.Object r0 = r7.obj
            if (r0 == 0) goto L_0x00c1
            java.lang.Class r0 = r0.getClass()
            r5.A07 = r0
        L_0x00c1:
            long r3 = r7.getWhen()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0052
            long r0 = r7.getWhen()
            r5.A05 = r0
            goto L_0x0052
        L_0x00d2:
            X.8Ka r5 = new X.8Ka
            r5.<init>(r4)
            goto L_0x0040
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AIE.CNm(android.os.Message):void");
    }

    public AIE(Looper looper, B4V[] b4vArr) {
        this.A06 = AnonymousClass000.A1Z(looper, Looper.getMainLooper());
        this.A03 = b4vArr;
        this.A05 = new AIC(b4vArr);
    }

    public void CNq(Looper looper, String str) {
        this.A02 = looper.getThread();
        C185339cQ r3 = this.A04;
        int i = 100;
        do {
            r3.A00.add(new AnonymousClass8Ka(r3));
            i--;
        } while (i >= 0);
        for (B4V b4v : this.A03) {
            if (b4v instanceof AIF) {
                AIF aif = (AIF) b4v;
                aif.A03 = str;
                C21473Ake ake = aif.A07;
                if (ake != null && !Debug.isDebuggerConnected()) {
                    ake.A00(0, false);
                }
                aif.A00 = SystemClock.uptimeMillis();
            }
        }
        AIC aic = this.A05;
        aic.A01.postDelayed(aic.A02, aic.A00);
    }
}
