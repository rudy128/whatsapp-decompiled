package X;

import android.view.Choreographer;
import android.view.View;

/* renamed from: X.0Za  reason: invalid class name and case insensitive filesystem */
public final class C06620Za implements Runnable, AnonymousClass0t3, Choreographer.FrameCallback, C15720r5 {
    public static long A0A;
    public boolean A00;
    public long A01;
    public long A02;
    public boolean A03;
    public final View A04;
    public final C06970a9 A05 = C06970a9.A02(new AnonymousClass0V7[16]);
    public final Choreographer A06 = Choreographer.getInstance();
    public final AnonymousClass0Jo A07;
    public final AnonymousClass0H3 A08;
    public final AnonymousClass0NO A09;

    public void Bkh() {
    }

    public void Bux() {
        this.A03 = false;
        this.A08.A00 = null;
        this.A04.removeCallbacks(this);
        this.A06.removeFrameCallback(this);
    }

    public void C2z() {
        this.A08.A00 = this;
        this.A03 = true;
    }

    public void doFrame(long j) {
        if (this.A03) {
            this.A04.post(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fb, code lost:
        if (r15 != false) goto L_0x00fd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r19 = this;
            r9 = r19
            X.0a9 r10 = r9.A05
            int r0 = r10.A00
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r8 = 0
            if (r0 != 0) goto L_0x0103
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x0103
            boolean r0 = r9.A03
            if (r0 == 0) goto L_0x0103
            android.view.View r1 = r9.A04
            int r0 = r1.getWindowVisibility()
            if (r0 != 0) goto L_0x0103
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r1.getDrawingTime()
            long r17 = r2.toNanos(r0)
            long r0 = A0A
            long r17 = r17 + r0
            long r1 = java.lang.System.nanoTime()
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            boolean r16 = X.AnonymousClass000.A1R(r0)
            r15 = 0
        L_0x0036:
            int r0 = r10.A00
            if (r0 == 0) goto L_0x00fb
            if (r15 != 0) goto L_0x00fd
            java.lang.Object[] r0 = r10.A01
            r5 = r0[r8]
            X.0V7 r5 = (X.AnonymousClass0V7) r5
            X.0Jo r12 = r9.A07
            X.0vk r0 = r12.A01()
            java.lang.Object r14 = r0.invoke()
            X.0si r14 = (X.C16610si) r14
            boolean r0 = r5.A01
            if (r0 != 0) goto L_0x00f1
            r0 = r14
            X.0V1 r0 = (X.AnonymousClass0V1) r0
            X.0V2 r13 = r0.A01
            X.0OO r0 = r13.A00
            int r0 = r0.A00
            int r11 = r5.A02
            if (r11 >= r0) goto L_0x00f1
            X.0t7 r0 = r5.A00
            if (r0 != 0) goto L_0x00a4
            java.lang.String r0 = "compose:lazylist:prefetch:compose"
            android.os.Trace.beginSection(r0)
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00f6 }
            long r3 = r9.A01     // Catch:{ all -> 0x00f6 }
            long r1 = r6 + r3
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x0076
            if (r16 == 0) goto L_0x00b8
        L_0x0076:
            java.lang.Object r2 = r14.BTi(r11)     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r13.A00(r11)     // Catch:{ all -> 0x00f6 }
            X.1OS r1 = r12.A02(r2, r0, r11)     // Catch:{ all -> 0x00f6 }
            X.0NO r0 = r9.A09     // Catch:{ all -> 0x00f6 }
            X.0t7 r0 = r0.A00(r2, r1)     // Catch:{ all -> 0x00f6 }
            r5.A00 = r0     // Catch:{ all -> 0x00f6 }
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00f6 }
            long r4 = r4 - r6
            long r2 = r9.A01     // Catch:{ all -> 0x00f6 }
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00a1
            r0 = 4
            long r2 = r2 / r0
            r0 = 3
            long r2 = r2 * r0
            r0 = 4
            long r4 = r4 / r0
            long r4 = r4 + r2
        L_0x00a1:
            r9.A01 = r4     // Catch:{ all -> 0x00f6 }
            goto L_0x00ea
        L_0x00a4:
            java.lang.String r0 = "compose:lazylist:prefetch:measure"
            android.os.Trace.beginSection(r0)
            long r6 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00f6 }
            long r3 = r9.A02     // Catch:{ all -> 0x00f6 }
            long r1 = r6 + r3
            int r0 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x00ba
            if (r16 == 0) goto L_0x00b8
            goto L_0x00ba
        L_0x00b8:
            r15 = 1
            goto L_0x00ec
        L_0x00ba:
            X.0t7 r4 = r5.A00     // Catch:{ all -> 0x00f6 }
            X.C18070vi.A0b(r4)     // Catch:{ all -> 0x00f6 }
            int r3 = r4.BX9()     // Catch:{ all -> 0x00f6 }
            r2 = 0
        L_0x00c4:
            if (r2 >= r3) goto L_0x00ce
            long r0 = r5.A03     // Catch:{ all -> 0x00f6 }
            r4.CCJ(r2, r0)     // Catch:{ all -> 0x00f6 }
            int r2 = r2 + 1
            goto L_0x00c4
        L_0x00ce:
            long r4 = java.lang.System.nanoTime()     // Catch:{ all -> 0x00f6 }
            long r4 = r4 - r6
            long r2 = r9.A02     // Catch:{ all -> 0x00f6 }
            r6 = 0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x00e5
            r0 = 4
            long r2 = r2 / r0
            r0 = 3
            long r2 = r2 * r0
            r0 = 4
            long r4 = r4 / r0
            long r4 = r4 + r2
        L_0x00e5:
            r9.A02 = r4     // Catch:{ all -> 0x00f6 }
            r10.A06(r8)     // Catch:{ all -> 0x00f6 }
        L_0x00ea:
            r16 = 0
        L_0x00ec:
            android.os.Trace.endSection()
            goto L_0x0036
        L_0x00f1:
            r10.A06(r8)
            goto L_0x0036
        L_0x00f6:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L_0x00fb:
            if (r15 == 0) goto L_0x0103
        L_0x00fd:
            android.view.Choreographer r0 = r9.A06
            r0.postFrameCallback(r9)
            return
        L_0x0103:
            r9.A00 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06620Za.run():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        if (r1 >= 30.0f) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C06620Za(android.view.View r6, X.AnonymousClass0Jo r7, X.AnonymousClass0H3 r8, X.AnonymousClass0NO r9) {
        /*
            r5 = this;
            r5.<init>()
            r5.A08 = r8
            r5.A09 = r9
            r5.A07 = r7
            r5.A04 = r6
            r0 = 16
            X.0V7[] r0 = new X.AnonymousClass0V7[r0]
            X.0a9 r0 = X.C06970a9.A02(r0)
            r5.A05 = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r5.A06 = r0
            long r3 = A0A
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0040
            android.view.Display r1 = r6.getDisplay()
            boolean r0 = r6.isInEditMode()
            if (r0 != 0) goto L_0x0041
            if (r1 == 0) goto L_0x0041
            float r1 = r1.getRefreshRate()
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0041
        L_0x0039:
            r0 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r0 = r0 / r1
            long r0 = (long) r0
            A0A = r0
        L_0x0040:
            return
        L_0x0041:
            r1 = 1114636288(0x42700000, float:60.0)
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06620Za.<init>(android.view.View, X.0Jo, X.0H3, X.0NO):void");
    }
}
