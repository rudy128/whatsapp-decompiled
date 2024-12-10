package X;

/* renamed from: X.CcD  reason: case insensitive filesystem */
public abstract class C25268CcD {
    public boolean A00 = false;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void A04() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.A00     // Catch:{ all -> 0x007c }
            if (r0 != 0) goto L_0x007a
            r2 = 1
            r3.A00 = r2     // Catch:{ all -> 0x007c }
            r1 = r3
            boolean r0 = r3 instanceof X.C22849BSb     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x003c
            X.BSb r1 = (X.C22849BSb) r1     // Catch:{ Exception -> 0x0076 }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "MultiplexProducer#onCancellation"
            X.C26212Cuq.A03(r0)     // Catch:{ all -> 0x0071 }
        L_0x001a:
            X.CwE r2 = r1.A00     // Catch:{ all -> 0x0071 }
            monitor-enter(r2)     // Catch:{ all -> 0x0071 }
            X.BSb r0 = r2.A03     // Catch:{ all -> 0x0039 }
            if (r0 == r1) goto L_0x0023
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            goto L_0x0035
        L_0x0023:
            r1 = 0
            r2.A03 = r1     // Catch:{ all -> 0x0039 }
            r2.A02 = r1     // Catch:{ all -> 0x0039 }
            java.io.Closeable r0 = r2.A04     // Catch:{ all -> 0x0039 }
            X.C26269CwE.A05(r0)     // Catch:{ all -> 0x0039 }
            r2.A04 = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET     // Catch:{ all -> 0x0071 }
            X.C26269CwE.A04(r0, r2)     // Catch:{ all -> 0x0071 }
        L_0x0035:
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x0076 }
            goto L_0x007a
        L_0x0039:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0039 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x003c:
            boolean r0 = r3 instanceof X.C22848BSa     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x0060
            X.BSa r1 = (X.C22848BSa) r1     // Catch:{ Exception -> 0x0076 }
            boolean r0 = r1 instanceof X.BSX     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x0051
            X.BSX r1 = (X.BSX) r1     // Catch:{ Exception -> 0x0076 }
            X.CcD r0 = r1.A00     // Catch:{ Exception -> 0x0076 }
            r0.A04()     // Catch:{ Exception -> 0x0076 }
            X.BSX.A00(r1)     // Catch:{ Exception -> 0x0076 }
            goto L_0x007a
        L_0x0051:
            boolean r0 = r1 instanceof X.BSZ     // Catch:{ Exception -> 0x0076 }
            if (r0 == 0) goto L_0x005a
            X.BSZ r1 = (X.BSZ) r1     // Catch:{ Exception -> 0x0076 }
            X.BSZ.A03(r1, r2)     // Catch:{ Exception -> 0x0076 }
        L_0x005a:
            X.CcD r0 = r1.A00     // Catch:{ Exception -> 0x0076 }
            r0.A04()     // Catch:{ Exception -> 0x0076 }
            goto L_0x007a
        L_0x0060:
            X.BSN r1 = (X.BSN) r1     // Catch:{ Exception -> 0x0076 }
            X.BRM r1 = r1.A00     // Catch:{ Exception -> 0x0076 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0076 }
            boolean r0 = r1.A05     // Catch:{ all -> 0x006c }
            X.C26208Cuj.A05(r0)     // Catch:{ all -> 0x006e }
            monitor-exit(r1)     // Catch:{ Exception -> 0x0076 }
            goto L_0x007a
        L_0x006c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x006e }
        L_0x006e:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x0076 }
            goto L_0x0075
        L_0x0071:
            r0 = move-exception
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x0076 }
        L_0x0075:
            throw r0     // Catch:{ Exception -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            r3.A06(r0)     // Catch:{ all -> 0x007c }
        L_0x007a:
            monitor-exit(r3)
            return
        L_0x007c:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25268CcD.A04():void");
    }

    public synchronized void A05(float f) {
        if (!this.A00) {
            try {
                A09(f);
            } catch (Exception e) {
                A06(e);
            }
        }
        return;
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized void A08(java.lang.Throwable r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.A00     // Catch:{ all -> 0x00cd }
            if (r0 != 0) goto L_0x00cb
            r1 = 1
            r8.A00 = r1     // Catch:{ all -> 0x00cd }
            r3 = r8
            boolean r0 = r8 instanceof X.C22849BSb     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x007c
            X.BSb r3 = (X.C22849BSb) r3     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x001a
            java.lang.String r0 = "MultiplexProducer#onFailure"
            X.C26212Cuq.A03(r0)     // Catch:{ all -> 0x0077 }
        L_0x001a:
            X.CwE r5 = r3.A00     // Catch:{ all -> 0x0077 }
            monitor-enter(r5)     // Catch:{ all -> 0x0077 }
            X.BSb r0 = r5.A03     // Catch:{ all -> 0x0074 }
            if (r0 == r3) goto L_0x0023
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
            goto L_0x0070
        L_0x0023:
            java.util.concurrent.CopyOnWriteArraySet r0 = r5.A06     // Catch:{ all -> 0x0074 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x0074 }
            r0.clear()     // Catch:{ all -> 0x0074 }
            X.DDF r6 = r5.A07     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r5.A05     // Catch:{ all -> 0x0074 }
            r6.A00(r5, r0)     // Catch:{ all -> 0x0074 }
            java.io.Closeable r0 = r5.A04     // Catch:{ all -> 0x0074 }
            X.C26269CwE.A05(r0)     // Catch:{ all -> 0x0074 }
            r4 = 0
            r5.A04 = r4     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
        L_0x003c:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0070
            java.lang.Object r3 = r7.next()     // Catch:{ all -> 0x0077 }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x0077 }
            monitor-enter(r3)     // Catch:{ all -> 0x0077 }
            java.lang.Object r2 = r3.second     // Catch:{ all -> 0x006d }
            X.ECs r2 = (X.ECs) r2     // Catch:{ all -> 0x006d }
            r0 = r2
            X.DDI r0 = (X.DDI) r0     // Catch:{ all -> 0x006d }
            X.E9w r1 = r0.A05     // Catch:{ all -> 0x006d }
            java.lang.String r0 = r6.A02     // Catch:{ all -> 0x006d }
            r1.C1p(r2, r0, r9, r4)     // Catch:{ all -> 0x006d }
            X.DDI r0 = r5.A02     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0064
            java.lang.Object r1 = r3.second     // Catch:{ all -> 0x006d }
            X.ECs r1 = (X.ECs) r1     // Catch:{ all -> 0x006d }
            java.util.Map r0 = r0.A0B     // Catch:{ all -> 0x006d }
            r1.CD3(r0)     // Catch:{ all -> 0x006d }
        L_0x0064:
            java.lang.Object r0 = r3.first     // Catch:{ all -> 0x006d }
            X.CcD r0 = (X.C25268CcD) r0     // Catch:{ all -> 0x006d }
            r0.A08(r9)     // Catch:{ all -> 0x006d }
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            goto L_0x003c
        L_0x006d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0076
        L_0x0070:
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00cb
        L_0x0074:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
        L_0x0076:
            throw r0     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x00c7 }
            throw r0     // Catch:{ Exception -> 0x00c7 }
        L_0x007c:
            boolean r0 = r8 instanceof X.C22848BSa     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00bb
            X.BSa r3 = (X.C22848BSa) r3     // Catch:{ Exception -> 0x00c7 }
            boolean r0 = r3 instanceof X.BSX     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x0091
            X.BSX r3 = (X.BSX) r3     // Catch:{ Exception -> 0x00c7 }
            X.CcD r0 = r3.A00     // Catch:{ Exception -> 0x00c7 }
            r0.A08(r9)     // Catch:{ Exception -> 0x00c7 }
            X.BSX.A00(r3)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00cb
        L_0x0091:
            boolean r0 = r3 instanceof X.BSZ     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00a4
            X.BSZ r3 = (X.BSZ) r3     // Catch:{ Exception -> 0x00c7 }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ Exception -> 0x00c7 }
            X.BSZ.A03(r3, r1)     // Catch:{ Exception -> 0x00c7 }
        L_0x009e:
            X.CcD r0 = r3.A00     // Catch:{ Exception -> 0x00c7 }
            r0.A08(r9)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00cb
        L_0x00a4:
            boolean r0 = r3 instanceof X.BST     // Catch:{ Exception -> 0x00c7 }
            if (r0 == 0) goto L_0x00b6
            X.BST r3 = (X.BST) r3     // Catch:{ Exception -> 0x00c7 }
            X.DD4 r0 = r3.A01     // Catch:{ Exception -> 0x00c7 }
            X.E4W r2 = r0.A00     // Catch:{ Exception -> 0x00c7 }
            X.CcD r1 = r3.A00     // Catch:{ Exception -> 0x00c7 }
            X.ECs r0 = r3.A00     // Catch:{ Exception -> 0x00c7 }
            r2.CCn(r1, r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00cb
        L_0x00b6:
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x009e
        L_0x00bb:
            X.BSN r3 = (X.BSN) r3     // Catch:{ Exception -> 0x00c7 }
            r0 = 0
            X.C18070vi.A0d(r9, r0)     // Catch:{ Exception -> 0x00c7 }
            X.BRM r0 = r3.A00     // Catch:{ Exception -> 0x00c7 }
            X.BRM.A00(r0, r9)     // Catch:{ Exception -> 0x00c7 }
            goto L_0x00cb
        L_0x00c7:
            r0 = move-exception
            r8.A06(r0)     // Catch:{ all -> 0x00cd }
        L_0x00cb:
            monitor-exit(r8)
            return
        L_0x00cd:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25268CcD.A08(java.lang.Throwable):void");
    }

    public abstract void A09(float f);

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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:262:0x03d5=Splitter:B:262:0x03d5, B:56:0x00b6=Splitter:B:56:0x00b6, B:170:0x0217=Splitter:B:170:0x0217, B:213:0x02f9=Splitter:B:213:0x02f9, B:347:0x04fa=Splitter:B:347:0x04fa, B:294:0x045c=Splitter:B:294:0x045c} */
    public synchronized void A07(java.lang.Object r18, int r19) {
        /*
            r17 = this;
            r7 = r18
            r4 = r17
            monitor-enter(r4)
            boolean r0 = r4.A00     // Catch:{ all -> 0x0582 }
            if (r0 != 0) goto L_0x0580
            r6 = r19
            boolean r0 = X.BE9.A1Q(r6)
            r4.A00 = r0     // Catch:{ all -> 0x0582 }
            boolean r0 = r4 instanceof X.C22849BSb     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x00c4
            r1 = r4
            X.BSb r1 = (X.C22849BSb) r1     // Catch:{ Exception -> 0x057c }
            java.io.Closeable r7 = (java.io.Closeable) r7     // Catch:{ Exception -> 0x057c }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = "MultiplexProducer#onNewResult"
            X.C26212Cuq.A03(r0)     // Catch:{ all -> 0x00be }
        L_0x0025:
            X.CwE r9 = r1.A00     // Catch:{ all -> 0x00be }
            monitor-enter(r9)     // Catch:{ all -> 0x00be }
            X.BSb r0 = r9.A03     // Catch:{ all -> 0x00bb }
            if (r0 == r1) goto L_0x002f
            monitor-exit(r9)     // Catch:{ all -> 0x00bb }
            goto L_0x00b6
        L_0x002f:
            java.io.Closeable r0 = r9.A04     // Catch:{ all -> 0x00bb }
            X.C26269CwE.A05(r0)     // Catch:{ all -> 0x00bb }
            r10 = 0
            r9.A04 = r10     // Catch:{ all -> 0x00bb }
            java.util.concurrent.CopyOnWriteArraySet r1 = r9.A06     // Catch:{ all -> 0x00bb }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ all -> 0x00bb }
            int r11 = r1.size()     // Catch:{ all -> 0x00bb }
            r0 = 1
            r8 = r19 & 1
            if (r8 != r0) goto L_0x0052
            r1.clear()     // Catch:{ all -> 0x00bb }
            X.DDF r5 = r9.A07     // Catch:{ all -> 0x00bb }
            java.lang.Object r0 = r9.A05     // Catch:{ all -> 0x00bb }
            r5.A00(r9, r0)     // Catch:{ all -> 0x00bb }
        L_0x0050:
            monitor-exit(r9)     // Catch:{ all -> 0x00bb }
            goto L_0x0072
        L_0x0052:
            X.DDF r5 = r9.A07     // Catch:{ all -> 0x00bb }
            boolean r0 = r5 instanceof X.C22861BSp     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0066
            r0 = r7
            X.DRJ r0 = (X.DRJ) r0     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0070
            X.DRJ r0 = r0.A07()     // Catch:{ all -> 0x00bb }
        L_0x0061:
            r9.A04 = r0     // Catch:{ all -> 0x00bb }
            r9.A01 = r6     // Catch:{ all -> 0x00bb }
            goto L_0x0050
        L_0x0066:
            r0 = r7
            X.DRN r0 = (X.DRN) r0     // Catch:{ all -> 0x00bb }
            if (r0 == 0) goto L_0x0070
            X.DRN r0 = r0.A04()     // Catch:{ all -> 0x00bb }
            goto L_0x0061
        L_0x0070:
            r0 = 0
            goto L_0x0061
        L_0x0072:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x00be }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x00be }
            monitor-enter(r3)     // Catch:{ all -> 0x00be }
            r0 = 1
            if (r8 != r0) goto L_0x00aa
            java.lang.Object r2 = r3.second     // Catch:{ all -> 0x00b3 }
            X.ECs r2 = (X.ECs) r2     // Catch:{ all -> 0x00b3 }
            r0 = r2
            X.DDI r0 = (X.DDI) r0     // Catch:{ all -> 0x00b3 }
            X.E9w r1 = r0.A05     // Catch:{ all -> 0x00b3 }
            java.lang.String r0 = r5.A02     // Catch:{ all -> 0x00b3 }
            r1.C1q(r2, r0, r10)     // Catch:{ all -> 0x00b3 }
            X.DDI r0 = r9.A02     // Catch:{ all -> 0x00b3 }
            if (r0 == 0) goto L_0x009d
            java.lang.Object r1 = r3.second     // Catch:{ all -> 0x00b3 }
            X.ECs r1 = (X.ECs) r1     // Catch:{ all -> 0x00b3 }
            java.util.Map r0 = r0.A0B     // Catch:{ all -> 0x00b3 }
            r1.CD3(r0)     // Catch:{ all -> 0x00b3 }
        L_0x009d:
            java.lang.Object r2 = r3.second     // Catch:{ all -> 0x00b3 }
            X.ECs r2 = (X.ECs) r2     // Catch:{ all -> 0x00b3 }
            java.lang.String r1 = r5.A01     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00b3 }
            r2.CD2(r1, r0)     // Catch:{ all -> 0x00b3 }
        L_0x00aa:
            java.lang.Object r0 = r3.first     // Catch:{ all -> 0x00b3 }
            X.CcD r0 = (X.C25268CcD) r0     // Catch:{ all -> 0x00b3 }
            r0.A07(r7, r6)     // Catch:{ all -> 0x00b3 }
            monitor-exit(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x0072
        L_0x00b3:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00b3 }
            goto L_0x00bd
        L_0x00b6:
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x00bb:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x00bb }
        L_0x00bd:
            throw r0     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x057c }
            goto L_0x0507
        L_0x00c4:
            boolean r0 = r4 instanceof X.BSX     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x00da
            r2 = r4
            X.BSX r2 = (X.BSX) r2     // Catch:{ Exception -> 0x057c }
            X.CcD r0 = r2.A00     // Catch:{ Exception -> 0x057c }
            r0.A07(r7, r6)     // Catch:{ Exception -> 0x057c }
            r1 = 1
            r0 = r19 & 1
            if (r0 != r1) goto L_0x0580
            X.BSX.A00(r2)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x00da:
            boolean r0 = r4 instanceof X.BSS     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x00ee
            r2 = r4
            X.BSa r2 = (X.C22848BSa) r2     // Catch:{ Exception -> 0x057c }
            r1 = 1
            r0 = r19 & 1
            if (r0 != r1) goto L_0x0580
            X.CcD r1 = r2.A00     // Catch:{ Exception -> 0x057c }
            r0 = 0
            r1.A07(r0, r6)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x00ee:
            boolean r0 = r4 instanceof X.BSY     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0173
            r2 = r4
            X.BSY r2 = (X.BSY) r2     // Catch:{ Exception -> 0x057c }
            X.DRJ r7 = (X.DRJ) r7     // Catch:{ Exception -> 0x057c }
            boolean r0 = r2.A00     // Catch:{ Exception -> 0x057c }
            if (r0 != 0) goto L_0x0580
            boolean r10 = X.BE9.A1Q(r6)     // Catch:{ Exception -> 0x057c }
            if (r7 != 0) goto L_0x010c
            if (r10 == 0) goto L_0x0580
            X.CcD r2 = r2.A00     // Catch:{ Exception -> 0x057c }
            r1 = 0
            r0 = 1
            r2.A07(r1, r0)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x010c:
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            X.Clu r8 = r7.A07     // Catch:{ Exception -> 0x057c }
            X.ECs r5 = r2.A02     // Catch:{ Exception -> 0x057c }
            r0 = r5
            X.DDI r0 = (X.DDI) r0     // Catch:{ Exception -> 0x057c }
            X.Cbv r3 = r0.A07     // Catch:{ Exception -> 0x057c }
            X.E4X r1 = r2.A03     // Catch:{ Exception -> 0x057c }
            boolean r0 = r2.A04     // Catch:{ Exception -> 0x057c }
            X.E97 r9 = r1.createImageTranscoder(r8, r0)     // Catch:{ Exception -> 0x057c }
            X.C26208Cuj.A01(r9)     // Catch:{ Exception -> 0x057c }
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            X.Clu r1 = r7.A07     // Catch:{ Exception -> 0x057c }
            X.Clu r0 = X.C25783Clu.A02     // Catch:{ Exception -> 0x057c }
            if (r1 != r0) goto L_0x012f
            com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.UNSET     // Catch:{ Exception -> 0x057c }
            goto L_0x016b
        L_0x012f:
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            X.Clu r0 = r7.A07     // Catch:{ Exception -> 0x057c }
            boolean r0 = r9.BEH(r0)     // Catch:{ Exception -> 0x057c }
            if (r0 != 0) goto L_0x013d
            com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.NO     // Catch:{ Exception -> 0x057c }
            goto L_0x016b
        L_0x013d:
            X.Clx r1 = r3.A06     // Catch:{ Exception -> 0x057c }
            boolean r0 = r1.A01     // Catch:{ Exception -> 0x057c }
            if (r0 != 0) goto L_0x015f
            int r0 = X.C25903CoF.A01(r1, r7)     // Catch:{ Exception -> 0x057c }
            if (r0 != 0) goto L_0x0166
            int r1 = r1.A00     // Catch:{ Exception -> 0x057c }
            r0 = -2
            if (r1 == r0) goto L_0x015c
            X.3Ej r1 = X.C25903CoF.A00     // Catch:{ Exception -> 0x057c }
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            int r0 = r7.A00     // Catch:{ Exception -> 0x057c }
            boolean r0 = X.C108965cb.A1Z(r1, r0)     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x015f
            goto L_0x0166
        L_0x015c:
            r0 = 0
            r7.A00 = r0     // Catch:{ Exception -> 0x057c }
        L_0x015f:
            boolean r1 = r9.BEA(r7)     // Catch:{ Exception -> 0x057c }
            r0 = 0
            if (r1 == 0) goto L_0x0167
        L_0x0166:
            r0 = 1
        L_0x0167:
            com.facebook.common.util.TriState r1 = com.facebook.common.util.TriState.valueOf((boolean) r0)     // Catch:{ Exception -> 0x057c }
        L_0x016b:
            if (r10 != 0) goto L_0x052d
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.UNSET     // Catch:{ Exception -> 0x057c }
            if (r1 != r0) goto L_0x052d
            goto L_0x0580
        L_0x0173:
            boolean r0 = r4 instanceof X.BSR     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x019e
            r2 = r4
            X.BSa r2 = (X.C22848BSa) r2     // Catch:{ Exception -> 0x057c }
            X.DRJ r7 = (X.DRJ) r7     // Catch:{ Exception -> 0x057c }
            r1 = 0
            if (r7 == 0) goto L_0x018d
            boolean r0 = r7.A0A()     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x018d
            X.DRN r0 = r7.A0B     // Catch:{ all -> 0x0199 }
            if (r0 == 0) goto L_0x018d
            X.DRN r1 = r0.A04()     // Catch:{ all -> 0x0199 }
        L_0x018d:
            X.CcD r0 = r2.A00     // Catch:{ all -> 0x0199 }
            r0.A07(r1, r6)     // Catch:{ all -> 0x0199 }
            if (r1 == 0) goto L_0x0580
            r1.close()     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x0199:
            r0 = move-exception
            if (r1 == 0) goto L_0x0507
            goto L_0x0504
        L_0x019e:
            boolean r0 = r4 instanceof X.BSW     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0222
            r3 = r4
            X.BSW r3 = (X.BSW) r3     // Catch:{ Exception -> 0x057c }
            X.DRJ r7 = (X.DRJ) r7     // Catch:{ Exception -> 0x057c }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x021c }
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = "EncodedMemoryCacheProducer#onNewResultImpl"
            X.C26212Cuq.A03(r0)     // Catch:{ all -> 0x021c }
        L_0x01b2:
            r1 = 1
            r0 = r19 & 1
            if (r0 != r1) goto L_0x0212
            if (r7 == 0) goto L_0x0212
            r0 = r19 & 10
            if (r0 != 0) goto L_0x0212
            X.DRJ.A03(r7)     // Catch:{ all -> 0x021c }
            X.Clu r1 = r7.A07     // Catch:{ all -> 0x021c }
            X.Clu r0 = X.C25783Clu.A02     // Catch:{ all -> 0x021c }
            if (r1 == r0) goto L_0x0212
            X.DRN r0 = r7.A0B     // Catch:{ all -> 0x021c }
            if (r0 == 0) goto L_0x020c
            X.DRN r2 = r0.A04()     // Catch:{ all -> 0x021c }
            if (r2 == 0) goto L_0x020c
            boolean r0 = r3.A02     // Catch:{ all -> 0x0203 }
            if (r0 == 0) goto L_0x01dd
            X.E7Y r1 = r3.A01     // Catch:{ all -> 0x0203 }
            X.E8e r0 = r3.A00     // Catch:{ all -> 0x0203 }
            X.DRN r1 = r1.BDi(r2, r0)     // Catch:{ all -> 0x0203 }
            goto L_0x01de
        L_0x01dd:
            r1 = 0
        L_0x01de:
            r2.close()     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x020c
            X.DRJ r2 = new X.DRJ     // Catch:{ all -> 0x0201 }
            r2.<init>(r1)     // Catch:{ all -> 0x0201 }
            r2.A09(r7)     // Catch:{ all -> 0x0201 }
            r1.close()     // Catch:{ all -> 0x021c }
            X.CcD r1 = r3.A00     // Catch:{ all -> 0x01fc }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A05(r0)     // Catch:{ all -> 0x01fc }
            r1.A07(r2, r6)     // Catch:{ all -> 0x01fc }
            r2.close()     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x01fc:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x021c }
            goto L_0x020b
        L_0x0201:
            r0 = move-exception
            goto L_0x0208
        L_0x0203:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x021c }
            goto L_0x020b
        L_0x0208:
            r1.close()     // Catch:{ all -> 0x021c }
        L_0x020b:
            throw r0     // Catch:{ all -> 0x021c }
        L_0x020c:
            X.CcD r0 = r3.A00     // Catch:{ all -> 0x021c }
            r0.A07(r7, r6)     // Catch:{ all -> 0x021c }
            goto L_0x0217
        L_0x0212:
            X.CcD r0 = r3.A00     // Catch:{ all -> 0x021c }
            r0.A07(r7, r6)     // Catch:{ all -> 0x021c }
        L_0x0217:
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x021c:
            r0 = move-exception
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x057c }
            goto L_0x0507
        L_0x0222:
            boolean r0 = r4 instanceof X.BSV     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0320
            r10 = r4
            X.BSV r10 = (X.BSV) r10     // Catch:{ Exception -> 0x057c }
            X.DRJ r7 = (X.DRJ) r7     // Catch:{ Exception -> 0x057c }
            X.ECs r9 = r10.A01     // Catch:{ Exception -> 0x057c }
            r2 = r9
            X.DDI r2 = (X.DDI) r2     // Catch:{ Exception -> 0x057c }
            X.E9w r8 = r2.A05     // Catch:{ Exception -> 0x057c }
            java.lang.String r5 = "DiskCacheWriteProducer"
            r8.C1r(r9, r5)     // Catch:{ Exception -> 0x057c }
            boolean r0 = X.BE9.A1Q(r6)     // Catch:{ Exception -> 0x057c }
            r0 = r0 ^ 1
            r3 = 0
            if (r0 != 0) goto L_0x0319
            if (r7 == 0) goto L_0x0319
            r0 = r19 & 10
            if (r0 != 0) goto L_0x0319
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            X.Clu r1 = r7.A07     // Catch:{ Exception -> 0x057c }
            X.Clu r0 = X.C25783Clu.A02     // Catch:{ Exception -> 0x057c }
            if (r1 == r0) goto L_0x0319
            X.Cbv r11 = r2.A07     // Catch:{ Exception -> 0x057c }
            android.net.Uri r0 = r11.A03     // Catch:{ Exception -> 0x057c }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x057c }
            X.DAK r14 = new X.DAK     // Catch:{ Exception -> 0x057c }
            r14.<init>(r0)     // Catch:{ Exception -> 0x057c }
            X.E4K r0 = r10.A00     // Catch:{ Exception -> 0x057c }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x057c }
            X.CSp r1 = (X.C24989CSp) r1     // Catch:{ Exception -> 0x057c }
            X.0vl r0 = r1.A04     // Catch:{ Exception -> 0x057c }
            r0.getValue()     // Catch:{ Exception -> 0x057c }
            X.0vl r0 = r1.A02     // Catch:{ Exception -> 0x057c }
            java.lang.Object r2 = r0.getValue()     // Catch:{ Exception -> 0x057c }
            X.CkB r2 = (X.C25680CkB) r2     // Catch:{ Exception -> 0x057c }
            X.0vl r0 = r1.A00     // Catch:{ Exception -> 0x057c }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x057c }
            X.C18070vi.A0X(r0)     // Catch:{ Exception -> 0x057c }
            X.ByE r1 = r11.A07     // Catch:{ Exception -> 0x057c }
            X.ByE r0 = X.C24256ByE.DEFAULT     // Catch:{ Exception -> 0x057c }
            if (r1 != r0) goto L_0x02f9
            if (r2 == 0) goto L_0x02f9
            r16 = 0
            r15 = 1
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ Exception -> 0x057c }
            java.lang.String r13 = "Failed to schedule disk-cache write for %s"
            java.lang.String r1 = "Check failed."
            if (r0 != 0) goto L_0x02c2
            boolean r0 = r7.A0A()     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x02bc
            X.ClX r12 = r2.A02     // Catch:{ Exception -> 0x057c }
            r12.A02(r14, r7)     // Catch:{ Exception -> 0x057c }
            X.DRJ r11 = r7.A07()     // Catch:{ Exception -> 0x057c }
            java.util.concurrent.Executor r1 = r2.A04     // Catch:{ Exception -> 0x02a9 }
            X.DTg r0 = new X.DTg     // Catch:{ Exception -> 0x02a9 }
            r0.<init>((X.C28573E8e) r14, (X.C25680CkB) r2, (X.DRJ) r11)     // Catch:{ Exception -> 0x02a9 }
            r1.execute(r0)     // Catch:{ Exception -> 0x02a9 }
            goto L_0x0319
        L_0x02a9:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ Exception -> 0x057c }
            java.lang.String r0 = r14.A00     // Catch:{ Exception -> 0x057c }
            r1[r16] = r0     // Catch:{ Exception -> 0x057c }
            X.C26265CwA.A07(r13, r2, r1)     // Catch:{ Exception -> 0x057c }
            r12.A03(r14, r7)     // Catch:{ Exception -> 0x057c }
            if (r11 == 0) goto L_0x0319
            r11.close()     // Catch:{ Exception -> 0x057c }
            goto L_0x0319
        L_0x02bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)     // Catch:{ Exception -> 0x057c }
            goto L_0x0507
        L_0x02c2:
            java.lang.String r0 = "BufferedDiskCache#put"
            X.C26212Cuq.A03(r0)     // Catch:{ Exception -> 0x057c }
            boolean r0 = r7.A0A()     // Catch:{ all -> 0x03da }
            if (r0 == 0) goto L_0x02f4
            X.ClX r12 = r2.A02     // Catch:{ all -> 0x03da }
            r12.A02(r14, r7)     // Catch:{ all -> 0x03da }
            X.DRJ r11 = r7.A07()     // Catch:{ all -> 0x03da }
            java.util.concurrent.Executor r1 = r2.A04     // Catch:{ Exception -> 0x02e1 }
            X.DTg r0 = new X.DTg     // Catch:{ Exception -> 0x02e1 }
            r0.<init>((X.C28573E8e) r14, (X.C25680CkB) r2, (X.DRJ) r11)     // Catch:{ Exception -> 0x02e1 }
            r1.execute(r0)     // Catch:{ Exception -> 0x02e1 }
            goto L_0x0316
        L_0x02e1:
            r2 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r15]     // Catch:{ all -> 0x03da }
            java.lang.String r0 = r14.A00     // Catch:{ all -> 0x03da }
            r1[r16] = r0     // Catch:{ all -> 0x03da }
            X.C26265CwA.A07(r13, r2, r1)     // Catch:{ all -> 0x03da }
            r12.A03(r14, r7)     // Catch:{ all -> 0x03da }
            if (r11 == 0) goto L_0x0316
            r11.close()     // Catch:{ all -> 0x03da }
            goto L_0x0316
        L_0x02f4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r1)     // Catch:{ all -> 0x03da }
            throw r0     // Catch:{ all -> 0x03da }
        L_0x02f9:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x057c }
            java.lang.String r0 = "Got no disk cache for CacheChoice: "
            r1.append(r0)     // Catch:{ Exception -> 0x057c }
            java.lang.Integer r0 = X.C17880vN.A0h()     // Catch:{ Exception -> 0x057c }
            X.AnonymousClass8BS.A1D(r0, r1)     // Catch:{ Exception -> 0x057c }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x057c }
            X.C1P r0 = new X.C1P     // Catch:{ Exception -> 0x057c }
            r0.<init>(r1)     // Catch:{ Exception -> 0x057c }
            r8.C1p(r9, r5, r0, r3)     // Catch:{ Exception -> 0x057c }
            goto L_0x031c
        L_0x0316:
            X.C26212Cuq.A01()     // Catch:{ Exception -> 0x057c }
        L_0x0319:
            r8.C1q(r9, r5, r3)     // Catch:{ Exception -> 0x057c }
        L_0x031c:
            X.CcD r0 = r10.A00     // Catch:{ Exception -> 0x057c }
            goto L_0x0559
        L_0x0320:
            boolean r0 = r4 instanceof X.BSZ     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x03e0
            r3 = r4
            X.BSZ r3 = (X.BSZ) r3     // Catch:{ Exception -> 0x057c }
            X.DRJ r7 = (X.DRJ) r7     // Catch:{ Exception -> 0x057c }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ Exception -> 0x057c }
            java.lang.String r5 = "Encoded image is null."
            java.lang.String r8 = "Encoded image is not valid."
            java.lang.Boolean r1 = X.AnonymousClass000.A0i()     // Catch:{ Exception -> 0x057c }
            java.lang.String r9 = "cached_value_found"
            if (r0 != 0) goto L_0x0386
            r2 = 1
            r0 = r19 & 1
            if (r0 != r2) goto L_0x0365
            if (r7 != 0) goto L_0x0341
            goto L_0x034d
        L_0x0341:
            boolean r0 = r7.A0A()     // Catch:{ Exception -> 0x057c }
            if (r0 != 0) goto L_0x0366
            X.C1y r1 = new X.C1y     // Catch:{ Exception -> 0x057c }
            r1.<init>(r8)     // Catch:{ Exception -> 0x057c }
            goto L_0x035b
        L_0x034d:
            X.ECs r0 = r3.A04     // Catch:{ Exception -> 0x057c }
            java.lang.Object r0 = r0.BRU(r9)     // Catch:{ Exception -> 0x057c }
            X.C18070vi.A18(r0, r1)     // Catch:{ Exception -> 0x057c }
            X.C1y r1 = new X.C1y     // Catch:{ Exception -> 0x057c }
            r1.<init>(r5)     // Catch:{ Exception -> 0x057c }
        L_0x035b:
            X.BSZ.A03(r3, r2)     // Catch:{ Exception -> 0x057c }
            X.CcD r0 = r3.A00     // Catch:{ Exception -> 0x057c }
            r0.A08(r1)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x0365:
            r2 = 0
        L_0x0366:
            boolean r0 = r3.A0A(r7, r6)     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0580
            r1 = 4
            r0 = r19 & 4
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)     // Catch:{ Exception -> 0x057c }
            if (r2 != 0) goto L_0x037f
            if (r0 != 0) goto L_0x037f
            X.ECs r0 = r3.A04     // Catch:{ Exception -> 0x057c }
            boolean r0 = r0.BfB()     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0580
        L_0x037f:
            X.Cqi r0 = r3.A03     // Catch:{ Exception -> 0x057c }
            r0.A03()     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x0386:
            java.lang.String r0 = "DecodeProducer#onNewResultImpl"
            X.C26212Cuq.A03(r0)     // Catch:{ Exception -> 0x057c }
            r2 = 1
            r0 = r19 & 1
            if (r0 != r2) goto L_0x03b6
            if (r7 != 0) goto L_0x0393
            goto L_0x039f
        L_0x0393:
            boolean r0 = r7.A0A()     // Catch:{ all -> 0x03da }
            if (r0 != 0) goto L_0x03b7
            X.C1y r1 = new X.C1y     // Catch:{ all -> 0x03da }
            r1.<init>(r8)     // Catch:{ all -> 0x03da }
            goto L_0x03ad
        L_0x039f:
            X.ECs r0 = r3.A04     // Catch:{ all -> 0x03da }
            java.lang.Object r0 = r0.BRU(r9)     // Catch:{ all -> 0x03da }
            X.C18070vi.A18(r0, r1)     // Catch:{ all -> 0x03da }
            X.C1y r1 = new X.C1y     // Catch:{ all -> 0x03da }
            r1.<init>(r5)     // Catch:{ all -> 0x03da }
        L_0x03ad:
            X.BSZ.A03(r3, r2)     // Catch:{ all -> 0x03da }
            X.CcD r0 = r3.A00     // Catch:{ all -> 0x03da }
            r0.A08(r1)     // Catch:{ all -> 0x03da }
            goto L_0x03d5
        L_0x03b6:
            r2 = 0
        L_0x03b7:
            boolean r0 = r3.A0A(r7, r6)     // Catch:{ all -> 0x03da }
            if (r0 == 0) goto L_0x03d5
            r1 = 4
            r0 = r19 & 4
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)     // Catch:{ Exception -> 0x057c }
            if (r2 != 0) goto L_0x03d0
            if (r0 != 0) goto L_0x03d0
            X.ECs r0 = r3.A04     // Catch:{ all -> 0x03da }
            boolean r0 = r0.BfB()     // Catch:{ all -> 0x03da }
            if (r0 == 0) goto L_0x03d5
        L_0x03d0:
            X.Cqi r0 = r3.A03     // Catch:{ all -> 0x03da }
            r0.A03()     // Catch:{ all -> 0x03da }
        L_0x03d5:
            X.C26212Cuq.A01()     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x03da:
            r0 = move-exception
            X.C26212Cuq.A01()     // Catch:{ Exception -> 0x057c }
            goto L_0x0507
        L_0x03e0:
            boolean r0 = r4 instanceof X.BST     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0448
            r5 = r4
            X.BST r5 = (X.BST) r5     // Catch:{ Exception -> 0x057c }
            X.DRJ r7 = (X.DRJ) r7     // Catch:{ Exception -> 0x057c }
            X.ECs r3 = r5.A00     // Catch:{ Exception -> 0x057c }
            boolean r9 = X.BE9.A1Q(r6)     // Catch:{ Exception -> 0x057c }
            if (r7 == 0) goto L_0x0436
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            int r1 = r7.A02     // Catch:{ Exception -> 0x057c }
            r0 = 90
            if (r1 == r0) goto L_0x0409
            r0 = 270(0x10e, float:3.78E-43)
            if (r1 == r0) goto L_0x0409
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            int r0 = r7.A05     // Catch:{ Exception -> 0x057c }
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            int r8 = r7.A01     // Catch:{ Exception -> 0x057c }
            goto L_0x0413
        L_0x0409:
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            int r0 = r7.A01     // Catch:{ Exception -> 0x057c }
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            int r8 = r7.A05     // Catch:{ Exception -> 0x057c }
        L_0x0413:
            float r0 = (float) r0     // Catch:{ Exception -> 0x057c }
            r2 = 1068149419(0x3faaaaab, float:1.3333334)
            float r0 = r0 * r2
            int r0 = (int) r0     // Catch:{ Exception -> 0x057c }
            float r1 = (float) r0     // Catch:{ Exception -> 0x057c }
            r0 = 1157627904(0x45000000, float:2048.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0436
            float r0 = (float) r8     // Catch:{ Exception -> 0x057c }
            float r0 = r0 * r2
            int r1 = (int) r0     // Catch:{ Exception -> 0x057c }
            r0 = 2048(0x800, float:2.87E-42)
            if (r1 < r0) goto L_0x0436
            if (r9 == 0) goto L_0x042d
            X.CcD r0 = r5.A00     // Catch:{ Exception -> 0x057c }
            goto L_0x0559
        L_0x042d:
            r1 = r19 & -2
            X.CcD r0 = r5.A00     // Catch:{ Exception -> 0x057c }
            r0.A07(r7, r1)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x0436:
            if (r9 == 0) goto L_0x0580
            if (r7 == 0) goto L_0x043d
            r7.close()     // Catch:{ Exception -> 0x057c }
        L_0x043d:
            X.DD4 r0 = r5.A01     // Catch:{ Exception -> 0x057c }
            X.E4W r1 = r0.A00     // Catch:{ Exception -> 0x057c }
            X.CcD r0 = r5.A00     // Catch:{ Exception -> 0x057c }
            r1.CCn(r0, r3)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x0448:
            boolean r0 = r4 instanceof X.BSU     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0508
            r2 = r4
            X.BSU r2 = (X.BSU) r2     // Catch:{ Exception -> 0x057c }
            X.DRN r7 = (X.DRN) r7     // Catch:{ Exception -> 0x057c }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x045c
            java.lang.String r0 = "BitmapMemoryCacheProducer#onNewResultImpl"
            X.C26212Cuq.A03(r0)     // Catch:{ all -> 0x04ff }
        L_0x045c:
            boolean r9 = X.BE9.A1Q(r6)     // Catch:{ Exception -> 0x057c }
            r3 = 0
            if (r7 != 0) goto L_0x046c
            if (r9 == 0) goto L_0x04fa
            X.CcD r0 = r2.A00     // Catch:{ all -> 0x04ff }
            r0.A07(r3, r6)     // Catch:{ all -> 0x04ff }
            goto L_0x04fa
        L_0x046c:
            java.lang.Object r0 = r7.A05()     // Catch:{ all -> 0x04ff }
            X.EDo r0 = (X.C28672EDo) r0     // Catch:{ all -> 0x04ff }
            boolean r0 = r0 instanceof X.BSC     // Catch:{ all -> 0x04ff }
            if (r0 != 0) goto L_0x04f5
            r1 = 8
            r0 = r19 & 8
            if (r0 == r1) goto L_0x04f5
            if (r9 != 0) goto L_0x04c5
            X.DD8 r0 = r2.A01     // Catch:{ all -> 0x04ff }
            X.E7Y r1 = r0.A00     // Catch:{ all -> 0x04ff }
            X.E8e r0 = r2.A00     // Catch:{ all -> 0x04ff }
            X.DRN r8 = r1.BMF(r0)     // Catch:{ all -> 0x04ff }
            if (r8 == 0) goto L_0x04c5
            java.lang.Object r1 = r7.A05()     // Catch:{ all -> 0x04c0 }
            X.EDo r1 = (X.C28672EDo) r1     // Catch:{ all -> 0x04c0 }
            boolean r0 = r1 instanceof X.BSF     // Catch:{ all -> 0x04c0 }
            if (r0 == 0) goto L_0x04b4
            X.BSF r1 = (X.BSF) r1     // Catch:{ all -> 0x04c0 }
            X.CYh r5 = r1.A01     // Catch:{ all -> 0x04c0 }
        L_0x0498:
            java.lang.Object r1 = r8.A05()     // Catch:{ all -> 0x04c0 }
            X.EDo r1 = (X.C28672EDo) r1     // Catch:{ all -> 0x04c0 }
            boolean r0 = r1 instanceof X.BSF     // Catch:{ all -> 0x04c0 }
            if (r0 == 0) goto L_0x04b1
            X.BSF r1 = (X.BSF) r1     // Catch:{ all -> 0x04c0 }
            X.CYh r1 = r1.A01     // Catch:{ all -> 0x04c0 }
        L_0x04a6:
            boolean r0 = r1.A01     // Catch:{ all -> 0x04c0 }
            if (r0 != 0) goto L_0x04b7
            int r1 = r1.A00     // Catch:{ all -> 0x04c0 }
            int r0 = r5.A00     // Catch:{ all -> 0x04c0 }
            if (r1 >= r0) goto L_0x04b7
            goto L_0x04c2
        L_0x04b1:
            X.CYh r1 = X.C25112CYh.A03     // Catch:{ all -> 0x04c0 }
            goto L_0x04a6
        L_0x04b4:
            X.CYh r5 = X.C25112CYh.A03     // Catch:{ all -> 0x04c0 }
            goto L_0x0498
        L_0x04b7:
            X.CcD r0 = r2.A00     // Catch:{ all -> 0x04c0 }
            r0.A07(r8, r6)     // Catch:{ all -> 0x04c0 }
            r8.close()     // Catch:{ all -> 0x04ff }
            goto L_0x04fa
        L_0x04c0:
            r0 = move-exception
            goto L_0x04f1
        L_0x04c2:
            r8.close()     // Catch:{ all -> 0x04ff }
        L_0x04c5:
            boolean r0 = r2.A02     // Catch:{ all -> 0x04ff }
            if (r0 == 0) goto L_0x04d3
            X.DD8 r0 = r2.A01     // Catch:{ all -> 0x04ff }
            X.E7Y r1 = r0.A00     // Catch:{ all -> 0x04ff }
            X.E8e r0 = r2.A00     // Catch:{ all -> 0x04ff }
            X.DRN r3 = r1.BDi(r7, r0)     // Catch:{ all -> 0x04ff }
        L_0x04d3:
            if (r9 == 0) goto L_0x04dc
            X.CcD r1 = r2.A00     // Catch:{ all -> 0x04ea }
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A05(r0)     // Catch:{ all -> 0x04ea }
        L_0x04dc:
            X.CcD r0 = r2.A00     // Catch:{ all -> 0x04ea }
            if (r3 == 0) goto L_0x04e1
            r7 = r3
        L_0x04e1:
            r0.A07(r7, r6)     // Catch:{ all -> 0x04ea }
            if (r3 == 0) goto L_0x04fa
            r3.close()     // Catch:{ all -> 0x04ff }
            goto L_0x04fa
        L_0x04ea:
            r0 = move-exception
            if (r3 == 0) goto L_0x04f4
            r3.close()     // Catch:{ all -> 0x04ff }
            goto L_0x04f4
        L_0x04f1:
            r8.close()     // Catch:{ all -> 0x04ff }
        L_0x04f4:
            throw r0     // Catch:{ all -> 0x04ff }
        L_0x04f5:
            X.CcD r0 = r2.A00     // Catch:{ all -> 0x04ff }
            r0.A07(r7, r6)     // Catch:{ all -> 0x04ff }
        L_0x04fa:
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x04ff:
            r0 = move-exception
            X.C26212Cuq.A00()     // Catch:{ Exception -> 0x057c }
            goto L_0x0507
        L_0x0504:
            r1.close()     // Catch:{ Exception -> 0x057c }
        L_0x0507:
            throw r0     // Catch:{ Exception -> 0x057c }
        L_0x0508:
            boolean r0 = r4 instanceof X.BSQ     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0571
            r1 = r4
            X.BSa r1 = (X.C22848BSa) r1     // Catch:{ Exception -> 0x057c }
            X.DRJ r7 = (X.DRJ) r7     // Catch:{ Exception -> 0x057c }
            if (r7 != 0) goto L_0x051a
            X.CcD r1 = r1.A00     // Catch:{ Exception -> 0x057c }
            r0 = 0
            r1.A07(r0, r6)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x051a:
            int r0 = r7.A02     // Catch:{ Exception -> 0x057c }
            if (r0 < 0) goto L_0x0529
            int r0 = r7.A05     // Catch:{ Exception -> 0x057c }
            if (r0 < 0) goto L_0x0529
            int r0 = r7.A01     // Catch:{ Exception -> 0x057c }
            if (r0 < 0) goto L_0x0529
        L_0x0526:
            X.CcD r0 = r1.A00     // Catch:{ Exception -> 0x057c }
            goto L_0x0559
        L_0x0529:
            X.DRJ.A02(r7)     // Catch:{ Exception -> 0x057c }
            goto L_0x0526
        L_0x052d:
            com.facebook.common.util.TriState r0 = com.facebook.common.util.TriState.YES     // Catch:{ Exception -> 0x057c }
            if (r1 == r0) goto L_0x055d
            X.Clu r0 = X.CIN.A06     // Catch:{ Exception -> 0x057c }
            if (r8 == r0) goto L_0x0539
            X.Clu r0 = X.CIN.A04     // Catch:{ Exception -> 0x057c }
            if (r8 != r0) goto L_0x0557
        L_0x0539:
            X.Clx r0 = r3.A06     // Catch:{ Exception -> 0x057c }
            boolean r0 = r0.A01     // Catch:{ Exception -> 0x057c }
            if (r0 != 0) goto L_0x0557
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            int r0 = r7.A02     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0557
            X.DRJ.A03(r7)     // Catch:{ Exception -> 0x057c }
            int r1 = r7.A02     // Catch:{ Exception -> 0x057c }
            r0 = -1
            if (r1 == r0) goto L_0x0557
            r0 = 0
            X.DRJ r7 = r7.A07()     // Catch:{ Exception -> 0x057c }
            if (r7 == 0) goto L_0x0557
            r7.A02 = r0     // Catch:{ Exception -> 0x057c }
        L_0x0557:
            X.CcD r0 = r2.A00     // Catch:{ Exception -> 0x057c }
        L_0x0559:
            r0.A07(r7, r6)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x055d:
            X.Cqi r1 = r2.A01     // Catch:{ Exception -> 0x057c }
            boolean r0 = r1.A04(r7, r6)     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0580
            if (r10 != 0) goto L_0x056d
            boolean r0 = r5.BfB()     // Catch:{ Exception -> 0x057c }
            if (r0 == 0) goto L_0x0580
        L_0x056d:
            r1.A03()     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x0571:
            r0 = r4
            X.BSN r0 = (X.BSN) r0     // Catch:{ Exception -> 0x057c }
            X.BRM r1 = r0.A00     // Catch:{ Exception -> 0x057c }
            X.BSc r0 = r1.A01     // Catch:{ Exception -> 0x057c }
            r1.A0A(r0, r7, r6)     // Catch:{ Exception -> 0x057c }
            goto L_0x0580
        L_0x057c:
            r0 = move-exception
            r4.A06(r0)     // Catch:{ all -> 0x0582 }
        L_0x0580:
            monitor-exit(r4)
            return
        L_0x0582:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25268CcD.A07(java.lang.Object, int):void");
    }

    public void A06(Exception exc) {
        Class<?> cls = getClass();
        EAY eay = C26265CwA.A00;
        if (eay.BfN(6)) {
            eay.CSY(cls.getSimpleName(), "unhandled exception", exc);
        }
    }
}
