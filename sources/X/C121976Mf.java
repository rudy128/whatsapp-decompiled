package X;

/* renamed from: X.6Mf  reason: invalid class name and case insensitive filesystem */
public final class C121976Mf extends C201010v {
    public final AnonymousClass1KB A00;
    public final C18030ve A01;
    public final C26621Sv A02;
    public final C126556cv A03;
    public final AnonymousClass1T0 A04;
    public final C126566cw A05 = new C126566cw();
    public volatile boolean A06;

    public void A00() {
        this.A06 = true;
        C26661Sz r1 = this.A03.A00;
        r1.A00 = null;
        AnonymousClass1T0 r12 = r1.A04;
        synchronized (r12) {
            r12.A00 = null;
        }
        interrupt();
    }

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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r14 = this;
            r0 = 1
            android.os.Process.setThreadPriority(r0)
            r11 = 0
        L_0x0005:
            boolean r0 = r14.A06
            if (r0 != 0) goto L_0x01ad
            X.1T0 r3 = r14.A04     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            monitor-enter(r3)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            java.util.PriorityQueue r2 = r3.A01     // Catch:{ all -> 0x019f }
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0019
            r0 = 5000(0x1388, double:2.4703E-320)
            r3.wait(r0)     // Catch:{ all -> 0x019f }
        L_0x0019:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x0052
            java.lang.Object r10 = r2.remove()     // Catch:{ all -> 0x019f }
            X.7PV r10 = (X.AnonymousClass7PV) r10     // Catch:{ all -> 0x019f }
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            if (r10 == 0) goto L_0x005b
            X.6cw r4 = r14.A05     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            X.6yl r0 = r10.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            int r3 = r0.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            monitor-enter(r4)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            java.util.HashMap r2 = r4.A00     // Catch:{ all -> 0x004e }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x004e }
            boolean r0 = r2.containsKey(r1)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x004e }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x004e }
            goto L_0x004b
        L_0x0042:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x004e }
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r3, r0)     // Catch:{ all -> 0x004e }
            r2.put(r1, r0)     // Catch:{ all -> 0x004e }
        L_0x004b:
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            r11 = r0
            goto L_0x005b
        L_0x004e:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            goto L_0x01a4
        L_0x0052:
            X.6Mf r0 = r3.A00     // Catch:{ all -> 0x019f }
            if (r0 == 0) goto L_0x0059
            r0.A00()     // Catch:{ all -> 0x019f }
        L_0x0059:
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            r10 = 0
        L_0x005b:
            boolean r0 = r14.A06     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            if (r0 != 0) goto L_0x01ad
            if (r10 == 0) goto L_0x0005
            X.6yl r9 = r10.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            X.1Sv r8 = r14.A02     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            monitor-enter(r9)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            android.graphics.Bitmap r0 = r9.A01     // Catch:{ all -> 0x0196 }
            if (r0 != 0) goto L_0x0081
            int r1 = r9.A06     // Catch:{ all -> 0x0196 }
            int r0 = r9.A05     // Catch:{ all -> 0x0196 }
            android.graphics.Bitmap r0 = X.C108945cZ.A0H(r1, r0)     // Catch:{ all -> 0x0196 }
            r9.A01 = r0     // Catch:{ all -> 0x0196 }
            android.graphics.Canvas r3 = X.C108945cZ.A0I(r0)     // Catch:{ all -> 0x0196 }
            r9.A03 = r3     // Catch:{ all -> 0x0196 }
            android.graphics.Bitmap r2 = r9.A08     // Catch:{ all -> 0x0196 }
            r1 = 0
            r0 = 0
            r3.drawBitmap(r2, r0, r0, r1)     // Catch:{ all -> 0x0196 }
        L_0x0081:
            android.graphics.Bitmap r0 = r9.A01     // Catch:{ all -> 0x01a2 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x01a2 }
            android.graphics.Canvas r0 = r9.A03     // Catch:{ all -> 0x01a2 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x01a2 }
            int r2 = r9.A00     // Catch:{ all -> 0x01a2 }
            int r1 = r2 + 1
            int r0 = r9.A07     // Catch:{ all -> 0x01a2 }
            int r1 = r1 % r0
            r9.A00 = r1     // Catch:{ all -> 0x01a2 }
            com.facebook.animated.webp.WebPImage r1 = r9.A09     // Catch:{ all -> 0x01a2 }
            X.CSo r7 = r1.getFrameInfo(r2)     // Catch:{ all -> 0x01a2 }
            int r0 = r9.A00     // Catch:{ all -> 0x01a2 }
            com.facebook.animated.webp.WebPFrame r6 = r1.getFrame((int) r0)     // Catch:{ all -> 0x01a2 }
            int r0 = r9.A00     // Catch:{ all -> 0x01a2 }
            X.CSo r5 = r1.getFrameInfo(r0)     // Catch:{ all -> 0x01a2 }
            int r2 = r9.A00     // Catch:{ all -> 0x01a2 }
            if (r2 != 0) goto L_0x00ad
            android.graphics.Bitmap r1 = r9.A08     // Catch:{ all -> 0x01a2 }
            goto L_0x00d7
        L_0x00ad:
            java.lang.String r0 = r9.A0A     // Catch:{ all -> 0x01a2 }
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r0)     // Catch:{ all -> 0x01a2 }
            r1.append(r0)     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "_frame_"
            java.lang.String r3 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ all -> 0x01a2 }
            X.1Lp r0 = r8.A00     // Catch:{ all -> 0x01a2 }
            X.1ga r2 = r0.A06()     // Catch:{ all -> 0x01a2 }
            X.C18070vi.A0X(r2)     // Catch:{ all -> 0x01a2 }
            java.lang.Object r1 = r2.A0A(r3)     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x01a2 }
            if (r1 == 0) goto L_0x00d7
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x01a2 }
            if (r0 == 0) goto L_0x00d7
            r2.A0E(r3)     // Catch:{ all -> 0x01a2 }
            r1 = 0
        L_0x00d7:
            r4 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0109
            r9.A02 = r1     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r0 = r9.A01     // Catch:{ all -> 0x01a2 }
            r0.eraseColor(r3)     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r0 = r9.A02     // Catch:{ all -> 0x01a2 }
            int r2 = r0.getWidth()     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r0 = r9.A02     // Catch:{ all -> 0x01a2 }
            int r1 = r0.getHeight()     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r0 = r9.A02     // Catch:{ all -> 0x01a2 }
            boolean r0 = r0.isRecycled()     // Catch:{ all -> 0x01a2 }
            if (r2 <= 0) goto L_0x0198
            if (r1 <= 0) goto L_0x0198
            if (r0 != 0) goto L_0x0198
            android.graphics.Canvas r2 = r9.A03     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r1 = r9.A02     // Catch:{ all -> 0x01a2 }
            r0 = 0
            r2.drawBitmap(r1, r0, r0, r4)     // Catch:{ all -> 0x01a2 }
            r6.dispose()     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r2 = r9.A02     // Catch:{ all -> 0x01a2 }
            goto L_0x018c
        L_0x0109:
            r11.eraseColor(r3)     // Catch:{ all -> 0x01a2 }
            int r0 = r6.getWidth()     // Catch:{ all -> 0x01a2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01a2 }
            float r2 = r9.A04     // Catch:{ all -> 0x01a2 }
            float r0 = r0 * r2
            double r0 = (double) r0     // Catch:{ all -> 0x01a2 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x01a2 }
            int r12 = (int) r0     // Catch:{ all -> 0x01a2 }
            int r0 = r6.getHeight()     // Catch:{ all -> 0x01a2 }
            float r0 = (float) r0     // Catch:{ all -> 0x01a2 }
            float r0 = r0 * r2
            double r0 = (double) r0     // Catch:{ all -> 0x01a2 }
            double r0 = java.lang.Math.ceil(r0)     // Catch:{ all -> 0x01a2 }
            int r13 = (int) r0     // Catch:{ all -> 0x01a2 }
            r6.renderFrame(r12, r13, r11)     // Catch:{ all -> 0x01a2 }
            X.ByD r1 = r7.A04     // Catch:{ all -> 0x01a2 }
            X.ByD r0 = X.C24255ByD.A02     // Catch:{ all -> 0x01a2 }
            if (r1 != r0) goto L_0x0134
            android.graphics.Canvas r0 = r9.A03     // Catch:{ all -> 0x01a2 }
            X.C139396yl.A00(r0, r7, r9)     // Catch:{ all -> 0x01a2 }
        L_0x0134:
            java.lang.Integer r1 = r5.A05     // Catch:{ all -> 0x01a2 }
            java.lang.Integer r0 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x01a2 }
            if (r1 != r0) goto L_0x013f
            android.graphics.Canvas r0 = r9.A03     // Catch:{ all -> 0x01a2 }
            X.C139396yl.A00(r0, r5, r9)     // Catch:{ all -> 0x01a2 }
        L_0x013f:
            int r1 = r6.getXOffset()     // Catch:{ all -> 0x01a2 }
            int r0 = r6.getYOffset()     // Catch:{ all -> 0x01a2 }
            r6.dispose()     // Catch:{ all -> 0x01a2 }
            android.graphics.Canvas r5 = r9.A03     // Catch:{ all -> 0x01a2 }
            float r1 = (float) r1     // Catch:{ all -> 0x01a2 }
            float r1 = r1 * r2
            float r0 = (float) r0     // Catch:{ all -> 0x01a2 }
            float r0 = r0 * r2
            r5.drawBitmap(r11, r1, r0, r4)     // Catch:{ all -> 0x01a2 }
            android.graphics.Bitmap r1 = r9.A01     // Catch:{ OutOfMemoryError -> 0x0180 }
            android.graphics.Bitmap$Config r0 = r1.getConfig()     // Catch:{ OutOfMemoryError -> 0x0180 }
            android.graphics.Bitmap r4 = r1.copy(r0, r3)     // Catch:{ OutOfMemoryError -> 0x0180 }
            r9.A02 = r4     // Catch:{ OutOfMemoryError -> 0x0180 }
            java.lang.String r0 = r9.A0A     // Catch:{ OutOfMemoryError -> 0x0180 }
            int r2 = r9.A00     // Catch:{ OutOfMemoryError -> 0x0180 }
            X.C18070vi.A0e(r0, r3, r4)     // Catch:{ OutOfMemoryError -> 0x0180 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r0)     // Catch:{ OutOfMemoryError -> 0x0180 }
            java.lang.String r0 = "_frame_"
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r2)     // Catch:{ OutOfMemoryError -> 0x0180 }
            boolean r0 = r4.isRecycled()     // Catch:{ OutOfMemoryError -> 0x0180 }
            if (r0 != 0) goto L_0x018a
            X.1Lp r0 = r8.A00     // Catch:{ OutOfMemoryError -> 0x0180 }
            X.1ga r0 = r0.A06()     // Catch:{ OutOfMemoryError -> 0x0180 }
            r0.A0F(r1, r4)     // Catch:{ OutOfMemoryError -> 0x0180 }
            goto L_0x018a
        L_0x0180:
            r1 = move-exception
            android.graphics.Bitmap r0 = r9.A01     // Catch:{ all -> 0x01a2 }
            r9.A02 = r0     // Catch:{ all -> 0x01a2 }
            java.lang.String r0 = "AnimatedWebpRenderer/renderNextFrame/OutofMemoryError: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x01a2 }
        L_0x018a:
            android.graphics.Bitmap r2 = r9.A02     // Catch:{ all -> 0x01a2 }
        L_0x018c:
            monitor-exit(r9)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            X.1KB r1 = r14.A00     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            r0 = 27
            X.AnonymousClass7RQ.A00(r1, r10, r2, r0)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            goto L_0x0005
        L_0x0196:
            r0 = move-exception
            goto L_0x019e
        L_0x0198:
            java.lang.String r0 = "The currentFrameRenderedBitmap is invalid"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x01a2 }
        L_0x019e:
            throw r0     // Catch:{ all -> 0x01a2 }
        L_0x019f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
            goto L_0x01a4
        L_0x01a2:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
        L_0x01a4:
            throw r0     // Catch:{ InterruptedException -> 0x0005, Exception -> 0x01a5 }
        L_0x01a5:
            r1 = move-exception
            java.lang.String r0 = "StickerFramePreloader/FrameLoaderThread failed to load frame "
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0005
        L_0x01ad:
            X.6cw r4 = r14.A05
            monitor-enter(r4)
            java.util.HashMap r3 = r4.A00     // Catch:{ all -> 0x01da }
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x01da }
            r0.size()     // Catch:{ all -> 0x01da }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x01da }
        L_0x01bd:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01da }
            if (r0 == 0) goto L_0x01d5
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x01da }
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x01da }
            if (r1 == 0) goto L_0x01bd
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x01da }
            if (r0 != 0) goto L_0x01bd
            r1.recycle()     // Catch:{ all -> 0x01da }
            goto L_0x01bd
        L_0x01d5:
            r3.clear()     // Catch:{ all -> 0x01da }
            monitor-exit(r4)
            return
        L_0x01da:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121976Mf.run():void");
    }

    public C121976Mf(AnonymousClass1KB r2, C18030ve r3, C26621Sv r4, C126556cv r5, AnonymousClass1T0 r6) {
        super("StickerFramePreloader");
        this.A01 = r3;
        this.A00 = r2;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
    }
}
