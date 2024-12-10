package X;

import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.Callable;

public class Cy7 implements Camera.OnZoomChangeListener {
    public int A00;
    public int A01;
    public int A02;
    public Camera A03;
    public final Handler A04 = new Handler(Looper.getMainLooper(), new C26370CyW(this, 0));
    public final C25202Cav A05;
    public final C25132CZh A06 = new C25132CZh();
    public final C25850CnB A07;
    public final Callable A08 = new C27132DVt((Object) this, 7);
    public volatile int A09;
    public volatile List A0A;
    public volatile boolean A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    public void A00(int r5) {
        /*
            r4 = this;
            r3 = r4
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x007f
            int r0 = r4.A09
            if (r5 == r0) goto L_0x007f
            int r0 = r4.A01
            if (r5 > r0) goto L_0x007f
            if (r5 < 0) goto L_0x007f
            java.lang.Thread r1 = X.BE8.A0k()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            if (r0 != 0) goto L_0x0078
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x0043
            monitor-enter(r3)
            r4.A02 = r5     // Catch:{ all -> 0x0075 }
            boolean r0 = r4.A0C     // Catch:{ all -> 0x0075 }
            r1 = 1
            if (r0 == 0) goto L_0x0038
            boolean r0 = r4.A0D     // Catch:{ all -> 0x0075 }
            if (r0 != 0) goto L_0x0073
            r4.A0D = r1     // Catch:{ all -> 0x0075 }
            android.hardware.Camera r0 = r4.A03     // Catch:{ all -> 0x0075 }
            X.C28111Yx.A02(r0)     // Catch:{ all -> 0x0075 }
            r0.stopSmoothZoom()     // Catch:{ all -> 0x0075 }
            goto L_0x0073
        L_0x0038:
            r4.A0C = r1     // Catch:{ all -> 0x0075 }
            android.hardware.Camera r0 = r4.A03     // Catch:{ all -> 0x0075 }
            X.C28111Yx.A02(r0)     // Catch:{ all -> 0x0075 }
            r0.startSmoothZoom(r5)     // Catch:{ all -> 0x0075 }
            goto L_0x0073
        L_0x0043:
            X.Cav r1 = r4.A05     // Catch:{ Exception -> 0x005d }
            int r0 = r4.A00     // Catch:{ Exception -> 0x005d }
            X.BUu r1 = r1.A00(r0)     // Catch:{ Exception -> 0x005d }
            X.CKJ r0 = X.C25971Cpe.A11     // Catch:{ Exception -> 0x005d }
            X.C26128Csq.A02(r0, r1, r5)     // Catch:{ Exception -> 0x005d }
            r1.A02()     // Catch:{ Exception -> 0x005d }
            android.hardware.Camera r1 = r4.A03     // Catch:{ Exception -> 0x005d }
            X.C28111Yx.A02(r1)     // Catch:{ Exception -> 0x005d }
            r0 = 1
            r4.onZoomChange(r5, r0, r1)     // Catch:{ Exception -> 0x005d }
            return
        L_0x005d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to set zoom level to: "
            java.lang.String r0 = X.AnonymousClass001.A1I(r0, r1, r5)
            java.lang.RuntimeException r2 = X.BE6.A0o(r0, r2)
            monitor-enter(r3)
            android.os.Handler r1 = r4.A04     // Catch:{ all -> 0x0075 }
            r0 = 2
            X.C108955ca.A1F(r1, r2, r0)     // Catch:{ all -> 0x0075 }
        L_0x0073:
            monitor-exit(r3)
            return
        L_0x0075:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0078:
            java.lang.String r0 = "Attempting to zoom on the UI thread!"
            java.lang.RuntimeException r0 = X.AnonymousClass8BR.A0w(r0)
            throw r0
        L_0x007f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cy7.A00(int):void");
    }

    public synchronized void onZoomChange(int i, boolean z, Camera camera) {
        this.A09 = i;
        if (this.A0E) {
            this.A0C = !z;
            if (z) {
                this.A0D = false;
                if (this.A0B && this.A02 != i) {
                    this.A07.A07("update_zoom_level", this.A08);
                }
            }
        }
        Handler handler = this.A04;
        handler.sendMessage(handler.obtainMessage(1, i, z ? 1 : 0));
    }

    public Cy7(C25202Cav cav, C25850CnB cnB) {
        this.A05 = cav;
        this.A07 = cnB;
    }
}
