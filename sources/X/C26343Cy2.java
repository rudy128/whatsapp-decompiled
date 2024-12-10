package X;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cy2  reason: case insensitive filesystem */
public class C26343Cy2 implements SurfaceTexture.OnFrameAvailableListener {
    public static final long A07 = TimeUnit.MILLISECONDS.toNanos(10000);
    public int A00 = 0;
    public long A01 = 0;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final SurfaceTexture A05;
    public final Object A06 = C17880vN.A0p();

    public void A00() {
        C27224Da3 da3;
        if (!this.A02) {
            long nanoTime = System.nanoTime();
            long j = A07 + nanoTime;
            Object obj = this.A06;
            synchronized (obj) {
                while (!this.A04) {
                    if (nanoTime < j) {
                        try {
                            obj.wait(10000);
                            nanoTime = System.nanoTime();
                        } catch (InterruptedException e) {
                            AnonymousClass8BS.A0x();
                            da3 = new C27224Da3((Throwable) e);
                        }
                    } else {
                        da3 = new C27224Da3("Surface frame wait timed out");
                        throw da3;
                    }
                }
                this.A04 = false;
                this.A00 = 0;
            }
            C26058CrU.A01("before updateTexImage");
            this.A05.updateTexImage();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        r2 = r4.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r4.A03 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        r4.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r4.A04 = true;
        r2.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0040, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r4.A04 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004d, code lost:
        throw new X.C27224Da3("mFrameAvailable already set, frame could be dropped");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onFrameAvailable(android.graphics.SurfaceTexture r5) {
        /*
            r4 = this;
            java.lang.Class<X.Cy2> r3 = X.C26343Cy2.class
            java.lang.String r2 = "new frame available"
            X.EAY r1 = X.C26294Cx6.A01
            r0 = 2
            boolean r0 = r1.BfN(r0)
            if (r0 == 0) goto L_0x0016
            X.EAY r1 = X.C26294Cx6.A01
            java.lang.String r0 = r3.getSimpleName()
            r1.CRf(r0, r2)
        L_0x0016:
            boolean r0 = r4.A02
            r2 = 1
            monitor-enter(r4)
            if (r0 == 0) goto L_0x0027
            long r0 = r4.A01     // Catch:{ all -> 0x0024 }
            long r0 = r0 + r2
            r4.A01 = r0     // Catch:{ all -> 0x0024 }
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            return
        L_0x0024:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r0
        L_0x0027:
            long r0 = r4.A01     // Catch:{ all -> 0x0052 }
            long r0 = r0 + r2
            r4.A01 = r0     // Catch:{ all -> 0x0052 }
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            java.lang.Object r2 = r4.A06
            monitor-enter(r2)
            boolean r0 = r4.A03     // Catch:{ all -> 0x004f }
            r1 = 1
            if (r0 == 0) goto L_0x0042
            int r0 = r4.A00     // Catch:{ all -> 0x004f }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x004f }
        L_0x003b:
            r4.A04 = r1     // Catch:{ all -> 0x004f }
            r2.notifyAll()     // Catch:{ all -> 0x004f }
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            goto L_0x004e
        L_0x0042:
            boolean r0 = r4.A04     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x003b
            java.lang.String r1 = "mFrameAvailable already set, frame could be dropped"
            X.Da3 r0 = new X.Da3     // Catch:{ all -> 0x004f }
            r0.<init>((java.lang.String) r1)     // Catch:{ all -> 0x004f }
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004e:
            return
        L_0x004f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004f }
            throw r0
        L_0x0052:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0052 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26343Cy2.onFrameAvailable(android.graphics.SurfaceTexture):void");
    }

    public C26343Cy2(SurfaceTexture surfaceTexture) {
        this.A05 = surfaceTexture;
    }
}
