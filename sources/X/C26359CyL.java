package X;

import android.media.ImageReader;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Trace;

/* renamed from: X.CyL  reason: case insensitive filesystem */
public class C26359CyL implements ImageReader.OnImageAvailableListener {
    public int A00;
    public int A01;
    public int A02;
    public ImageReader A03;
    public C25742ClC A04;
    public boolean A05;
    public boolean A06;
    public final ConditionVariable A07 = new ConditionVariable();
    public final Handler A08;
    public final Runnable A09 = C27082DTh.A00(this, 0);
    public final Runnable A0A = C27082DTh.A00(this, 1);
    public final Runnable A0B = C27082DTh.A00(this, 2);
    public final CPK A0C = new Object();
    public final C24855CMy A0D;
    public final CN2 A0E = new CN2(new CJT(this));
    public final CPK[] A0F = new CPK[1];
    public volatile boolean A0G;

    public static void A00(C26359CyL cyL) {
        if (cyL.A03 == null && cyL.A02 > 0 && cyL.A01 > 0) {
            Trace.beginSection("AddImageReader");
            ImageReader newInstance = ImageReader.newInstance(cyL.A02, cyL.A01, 1, 1);
            cyL.A03 = newInstance;
            newInstance.setOnImageAvailableListener(cyL, (Handler) null);
            C25742ClC clC = new C25742ClC(cyL.A03.getSurface(), true);
            cyL.A04 = clC;
            clC.A08 = true;
            C24855CMy cMy = cyL.A0D;
            C25742ClC clC2 = cyL.A04;
            C18070vi.A0d(clC2, 0);
            cMy.A00 = clC2;
            C25742ClC clC3 = cMy.A00;
            cMy.A00 = null;
            if (clC3 != null) {
                C26779DDj dDj = cMy.A01;
                DDn dDn = dDj.A07;
                dDn.A01(dDn.A01, new DE3((C28656ECq) null, dDj.A06, clC3));
            }
            Trace.endSection();
        }
    }

    public static void A01(C26359CyL cyL) {
        Trace.beginSection("RemoveImageReader");
        C25742ClC clC = cyL.A04;
        if (clC != null) {
            C24855CMy cMy = cyL.A0D;
            cMy.A00 = clC;
            C25742ClC clC2 = cMy.A00;
            cMy.A00 = null;
            if (clC2 != null) {
                cMy.A01.A07.A03(clC2);
            }
            cyL.A04 = null;
        }
        ImageReader imageReader = cyL.A03;
        if (imageReader != null) {
            imageReader.close();
            cyL.A03 = null;
        }
        Trace.endSection();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d4, code lost:
        if (r16 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onImageAvailable(android.media.ImageReader r18) {
        /*
            r17 = this;
            r6 = r17
            boolean r0 = r6.A0G
            if (r0 == 0) goto L_0x00ef
            r5 = 0
            java.lang.String r0 = "OnImageAvailable"
            android.os.Trace.beginSection(r0)
            r4 = 0
            android.media.Image r16 = r18.acquireNextImage()     // Catch:{ all -> 0x00c2 }
            if (r16 != 0) goto L_0x0015
            goto L_0x00e4
        L_0x0015:
            X.CN2 r1 = r6.A0E     // Catch:{ all -> 0x00c6 }
            java.util.concurrent.ConcurrentLinkedQueue r0 = r1.A00     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r0.poll()     // Catch:{ all -> 0x00c6 }
            X.DB3 r3 = (X.DB3) r3     // Catch:{ all -> 0x00c6 }
            if (r3 != 0) goto L_0x002c
            X.CX6 r0 = new X.CX6     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            X.DB3 r3 = new X.DB3     // Catch:{ all -> 0x00c6 }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x003c
        L_0x002c:
            java.util.concurrent.atomic.AtomicInteger r1 = r3.A02     // Catch:{ all -> 0x00c6 }
            r0 = 1
            boolean r0 = r1.compareAndSet(r5, r0)     // Catch:{ all -> 0x00c6 }
            if (r0 != 0) goto L_0x003c
            java.lang.String r0 = "Can only reset a previously released reference."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00c6 }
            throw r0     // Catch:{ all -> 0x00c6 }
        L_0x003c:
            java.lang.Object r14 = r3.get()     // Catch:{ all -> 0x00c7 }
            X.CX6 r14 = (X.CX6) r14     // Catch:{ all -> 0x00c7 }
            android.media.Image$Plane[] r1 = r16.getPlanes()     // Catch:{ all -> 0x00c7 }
            if (r1 == 0) goto L_0x00b9
            int r0 = r1.length     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00b9
            r0 = r1[r5]     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00b9
            X.CPK r7 = r6.A0C     // Catch:{ all -> 0x00c7 }
            java.nio.ByteBuffer r2 = r0.getBuffer()     // Catch:{ all -> 0x00c7 }
            int r1 = r0.getPixelStride()     // Catch:{ all -> 0x00c7 }
            int r0 = r0.getRowStride()     // Catch:{ all -> 0x00c7 }
            r7.A02 = r2     // Catch:{ all -> 0x00c7 }
            r7.A00 = r1     // Catch:{ all -> 0x00c7 }
            r7.A01 = r0     // Catch:{ all -> 0x00c7 }
            X.CPK[] r13 = r6.A0F     // Catch:{ all -> 0x00c7 }
            r13[r5] = r7     // Catch:{ all -> 0x00c7 }
            long r1 = r16.getTimestamp()     // Catch:{ all -> 0x00c7 }
            int r12 = r16.getWidth()     // Catch:{ all -> 0x00c7 }
            int r11 = r16.getHeight()     // Catch:{ all -> 0x00c7 }
            int r10 = r6.A00     // Catch:{ all -> 0x00c7 }
            r9 = 1
            X.CPK[] r0 = r14.A05     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0090
            r8 = 0
        L_0x007b:
            X.CPK[] r15 = r14.A05     // Catch:{ all -> 0x00c7 }
            int r0 = r15.length     // Catch:{ all -> 0x00c7 }
            if (r8 >= r0) goto L_0x0090
            r0 = r15[r8]     // Catch:{ all -> 0x00c7 }
            java.nio.ByteBuffer r0 = r0.A02     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x008d
            r0 = r15[r8]     // Catch:{ all -> 0x00c7 }
            java.nio.ByteBuffer r0 = r0.A02     // Catch:{ all -> 0x00c7 }
            r0.clear()     // Catch:{ all -> 0x00c7 }
        L_0x008d:
            int r8 = r8 + 1
            goto L_0x007b
        L_0x0090:
            r14.A05 = r13     // Catch:{ all -> 0x00c7 }
            r14.A02 = r9     // Catch:{ all -> 0x00c7 }
            r14.A04 = r1     // Catch:{ all -> 0x00c7 }
            r14.A03 = r12     // Catch:{ all -> 0x00c7 }
            r14.A01 = r11     // Catch:{ all -> 0x00c7 }
            r14.A00 = r10     // Catch:{ all -> 0x00c7 }
            boolean r0 = r6.A0G     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00d7
            X.CMy r0 = r6.A0D     // Catch:{ all -> 0x00c7 }
            X.DDj r0 = r0.A01     // Catch:{ all -> 0x00c7 }
            X.CJU r0 = r0.A05     // Catch:{ all -> 0x00c7 }
            X.DDv r2 = r0.A00     // Catch:{ all -> 0x00c7 }
            X.DGh r1 = r2.A0N     // Catch:{ all -> 0x00c7 }
            r1.A00 = r3     // Catch:{ all -> 0x00c7 }
            X.DGn r0 = r2.A0J     // Catch:{ all -> 0x00c7 }
            r0.CCm(r1, r4)     // Catch:{ all -> 0x00c7 }
            android.os.ConditionVariable r0 = r2.A0I     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x00d7
            r0.open()     // Catch:{ all -> 0x00c7 }
            goto L_0x00d7
        L_0x00b9:
            X.CPK r0 = r6.A0C
            r0.A02 = r4
            r0.A00 = r5
            r0.A01 = r5
            goto L_0x00dd
        L_0x00c2:
            r16 = r4
            r3 = r4
            goto L_0x00c7
        L_0x00c6:
            r3 = r4
        L_0x00c7:
            X.CPK r0 = r6.A0C
            r0.A02 = r4
            r0.A00 = r5
            r0.A01 = r5
            if (r3 == 0) goto L_0x00d4
            r3.release()
        L_0x00d4:
            if (r16 == 0) goto L_0x00ec
            goto L_0x00e0
        L_0x00d7:
            r7.A02 = r4
            r7.A00 = r5
            r7.A01 = r5
        L_0x00dd:
            r3.release()
        L_0x00e0:
            r16.close()
            goto L_0x00ec
        L_0x00e4:
            X.CPK r0 = r6.A0C
            r0.A02 = r4
            r0.A00 = r5
            r0.A01 = r5
        L_0x00ec:
            android.os.Trace.endSection()
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26359CyL.onImageAvailable(android.media.ImageReader):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.CPK, java.lang.Object] */
    public C26359CyL(Handler handler, C24855CMy cMy, boolean z, boolean z2) {
        this.A0D = cMy;
        this.A08 = handler;
        this.A05 = z;
        this.A06 = z2;
    }
}
