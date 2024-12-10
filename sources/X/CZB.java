package X;

import java.util.Map;

public class CZB {
    public final int A00;
    public final int A01;
    public final CRH A02;
    public final boolean A03;
    public final Map A04;
    public volatile boolean A05 = false;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        android.opengl.GLES20.glDeleteTextures(1, new int[]{r4.A00}, 0);
        r0 = X.C26076Crq.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r0 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        r2 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        if (r2 == null) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r2.A01.remove(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        r2 = X.C25533ChV.A02.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r2.A01.remove(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0040, code lost:
        return r4.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000e, code lost:
        if (r4.A03 != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.A05     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0008
            monitor-exit(r4)     // Catch:{ all -> 0x0041 }
            r0 = 0
            return r0
        L_0x0008:
            r3 = 1
            r4.A05 = r3     // Catch:{ all -> 0x0041 }
            monitor-exit(r4)     // Catch:{ all -> 0x0041 }
            boolean r0 = r4.A03
            if (r0 != 0) goto L_0x003e
            int[] r2 = new int[r3]
            int r1 = r4.A00
            r0 = 0
            r2[r0] = r1
            android.opengl.GLES20.glDeleteTextures(r3, r2, r0)
            X.Ct3 r0 = X.C26076Crq.A00()
            if (r0 == 0) goto L_0x002d
            X.C5D r2 = r0.A05
            if (r2 == 0) goto L_0x002d
            monitor-enter(r2)
            java.util.Map r1 = r2.A01     // Catch:{ all -> 0x003a }
            X.CRH r0 = r4.A02     // Catch:{ all -> 0x003a }
            r1.remove(r0)     // Catch:{ all -> 0x003a }
            monitor-exit(r2)
        L_0x002d:
            X.ChV r0 = X.C25533ChV.A02
            X.C5D r2 = r0.A00
            monitor-enter(r2)
            java.util.Map r1 = r2.A01     // Catch:{ all -> 0x003a }
            X.CRH r0 = r4.A02     // Catch:{ all -> 0x003a }
            r1.remove(r0)     // Catch:{ all -> 0x003a }
            goto L_0x003d
        L_0x003a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x003d:
            monitor-exit(r2)
        L_0x003e:
            boolean r0 = r4.A05
            return r0
        L_0x0041:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0041 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZB.A01():boolean");
    }

    public void A00(int i, int i2) {
        CRH crh = this.A02;
        crh.A01 = i;
        crh.A00 = i2;
    }

    /* JADX INFO: finally extract failed */
    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public CZB(X.C25008CTi r8) {
        /*
            r7 = this;
            r7.<init>()
            r4 = 0
            r7.A05 = r4
            java.util.HashMap r5 = X.C17880vN.A11()
            r3 = 0
        L_0x000b:
            android.util.SparseIntArray r2 = r8.A08
            int r0 = r2.size()
            if (r3 >= r0) goto L_0x0025
            int r0 = r2.keyAt(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r2.valueAt(r3)
            X.C17890vO.A0z(r1, r5, r0)
            int r3 = r3 + 1
            goto L_0x000b
        L_0x0025:
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r5)
            r7.A04 = r3
            int r2 = r8.A02
            r7.A01 = r2
            android.graphics.Bitmap r6 = r8.A04
            int r1 = r8.A00
            r0 = -1
            if (r1 != r0) goto L_0x0041
            r1 = 1
            int[] r0 = new int[r1]
            android.opengl.GLES20.glGenTextures(r1, r0, r4)
            r1 = r0[r4]
            r7.A00 = r1
            goto L_0x0043
        L_0x0041:
            r7.A00 = r1
        L_0x0043:
            android.opengl.GLES20.glBindTexture(r2, r1)     // Catch:{ all -> 0x00cc }
            java.util.Iterator r5 = X.AnonymousClass000.A15(r3)     // Catch:{ all -> 0x00cc }
        L_0x004a:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x00cc }
            if (r0 == 0) goto L_0x006a
            java.util.Map$Entry r3 = X.AnonymousClass000.A16(r5)     // Catch:{ all -> 0x00cc }
            int r2 = r7.A01     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r3.getKey()     // Catch:{ all -> 0x00cc }
            int r1 = X.BE6.A0F(r0)     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r3.getValue()     // Catch:{ all -> 0x00cc }
            int r0 = X.BE6.A0F(r0)     // Catch:{ all -> 0x00cc }
            android.opengl.GLES20.glTexParameteri(r2, r1, r0)     // Catch:{ all -> 0x00cc }
            goto L_0x004a
        L_0x006a:
            if (r6 == 0) goto L_0x007a
            int r0 = r7.A01     // Catch:{ all -> 0x00cc }
            android.opengl.GLUtils.texImage2D(r0, r4, r6, r4)     // Catch:{ all -> 0x00cc }
            int r3 = r6.getWidth()     // Catch:{ all -> 0x00cc }
            int r2 = r6.getHeight()     // Catch:{ all -> 0x00cc }
            goto L_0x007e
        L_0x007a:
            int r3 = r8.A03     // Catch:{ all -> 0x00cc }
            int r2 = r8.A01     // Catch:{ all -> 0x00cc }
        L_0x007e:
            int r0 = r7.A01
            android.opengl.GLES20.glBindTexture(r0, r4)
            boolean r0 = r8.A06
            r7.A03 = r0
            boolean r1 = r8.A07
            X.CRH r0 = new X.CRH
            r0.<init>(r3, r2, r1)
            r7.A02 = r0
            boolean r0 = r7.A03
            if (r0 != 0) goto L_0x00cb
            X.Ct3 r3 = X.C26076Crq.A00()
            if (r3 == 0) goto L_0x00ab
            X.C5D r2 = r3.A05
            if (r2 == 0) goto L_0x00ab
            X.ChV r1 = X.C25533ChV.A02
            monitor-enter(r1)
            java.util.Set r0 = r1.A01     // Catch:{ all -> 0x00a8 }
            boolean r0 = r0.contains(r2)     // Catch:{ all -> 0x00a8 }
            goto L_0x00b0
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00ab:
            X.ChV r0 = X.C25533ChV.A02
            X.C5D r3 = r0.A00
            goto L_0x00b5
        L_0x00b0:
            monitor-exit(r1)
            if (r0 == 0) goto L_0x00ab
            X.C5D r3 = r3.A05
        L_0x00b5:
            monitor-enter(r3)
            java.lang.ref.WeakReference r2 = X.AnonymousClass3MW.A0z(r7)     // Catch:{ all -> 0x00c8 }
            monitor-enter(r3)     // Catch:{ all -> 0x00c8 }
            java.util.Map r1 = r3.A01     // Catch:{ all -> 0x00c5 }
            X.CRH r0 = r7.A02     // Catch:{ all -> 0x00c5 }
            r1.put(r0, r2)     // Catch:{ all -> 0x00c5 }
            monitor-exit(r3)     // Catch:{ all -> 0x00c8 }
            monitor-exit(r3)
            return
        L_0x00c5:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00cb:
            return
        L_0x00cc:
            r1 = move-exception
            int r0 = r7.A01
            android.opengl.GLES20.glBindTexture(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CZB.<init>(X.CTi):void");
    }
}
