package X;

public abstract class C6L {
    public BG4 A00;
    public String A01;

    public final C6B A03() {
        BG4 bg4 = this.A00;
        if (bg4 == null) {
            return null;
        }
        return bg4.A0C[bg4.A00].A00;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public java.lang.String toString() {
        /*
            r8 = this;
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            java.io.PrintWriter r4 = new java.io.PrintWriter
            r4.<init>(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r8.A01
            r1.append(r0)
            java.lang.String r0 = ":"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r4.println(r0)
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = " total records="
            r2.append(r0)
            X.BG4 r0 = r8.A00
            if (r0 != 0) goto L_0x0088
            r0 = 0
        L_0x002a:
            java.lang.String r0 = X.C17880vN.A0t(r2, r0)
            r4.println(r0)
            r6 = 0
        L_0x0032:
            X.BG4 r0 = r8.A00
            if (r0 != 0) goto L_0x007d
            r0 = 0
        L_0x0037:
            if (r6 >= r0) goto L_0x0095
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = " rec["
            r7.append(r0)
            r7.append(r6)
            java.lang.String r0 = "]: "
            r7.append(r0)
            X.BG4 r0 = r8.A00
            if (r0 == 0) goto L_0x0064
            X.COy r3 = r0.A05
            monitor-enter(r3)
            int r2 = r3.A01     // Catch:{ all -> 0x0092 }
            int r2 = r2 + r6
            r0 = 20
            if (r2 < r0) goto L_0x0059
            int r2 = r2 - r0
        L_0x0059:
            monitor-enter(r3)     // Catch:{ all -> 0x0092 }
            java.util.Vector r1 = r3.A02     // Catch:{ all -> 0x008f }
            int r0 = r1.size()     // Catch:{ all -> 0x008f }
            monitor-exit(r3)     // Catch:{ all -> 0x0092 }
            if (r2 < r0) goto L_0x0075
            monitor-exit(r3)
        L_0x0064:
            r0 = 0
        L_0x0065:
            X.AnonymousClass8BS.A1D(r0, r7)
            java.lang.String r0 = r7.toString()
            r4.println(r0)
            r4.flush()
            int r6 = r6 + 1
            goto L_0x0032
        L_0x0075:
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x0092 }
            X.C68 r0 = (X.C68) r0     // Catch:{ all -> 0x0092 }
            monitor-exit(r3)
            goto L_0x0065
        L_0x007d:
            X.COy r1 = r0.A05
            monitor-enter(r1)
            java.util.Vector r0 = r1.A02     // Catch:{ all -> 0x00b8 }
            int r0 = r0.size()     // Catch:{ all -> 0x00b8 }
            monitor-exit(r1)
            goto L_0x0037
        L_0x0088:
            X.COy r1 = r0.A05
            monitor-enter(r1)
            int r0 = r1.A00     // Catch:{ all -> 0x00b8 }
            monitor-exit(r1)
            goto L_0x002a
        L_0x008f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0092 }
            throw r0     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0095:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "curState="
            r1.append(r0)
            X.C6B r0 = r8.A03()
            java.lang.String r0 = r0.A00()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r4.println(r0)
            r4.flush()
            r4.close()
            java.lang.String r0 = r5.toString()
            return r0
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6L.toString():java.lang.String");
    }
}
