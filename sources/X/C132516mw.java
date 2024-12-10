package X;

import com.whatsapp.media.WamediaManager;

/* renamed from: X.6mw  reason: invalid class name and case insensitive filesystem */
public final class C132516mw {
    public final C18030ve A00;
    public final WamediaManager A01;
    public final AnonymousClass00H A02;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final X.C1405471x A00(java.io.File r9) {
        /*
            r8 = this;
            r5 = 0
            X.C18070vi.A0d(r9, r5)
            X.0ve r1 = r8.A00
            r0 = 9018(0x233a, float:1.2637E-41)
            X.0vf r7 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r7, r1, r0)
            if (r0 == 0) goto L_0x0077
            X.00H r0 = r8.A02
            java.lang.Object r6 = r0.get()
            X.6Kz r6 = (X.C121656Kz) r6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = r9.getAbsolutePath()
            r2.append(r0)
            long r0 = r9.lastModified()
            java.lang.String r1 = X.C17880vN.A0u(r2, r0)
            java.util.Map r4 = r6.A02
            java.lang.Object r3 = r4.get(r1)
            X.71x r3 = (X.C1405471x) r3
            if (r3 == 0) goto L_0x003d
            monitor-enter(r4)
            r4.remove(r1)     // Catch:{ all -> 0x0074 }
            r4.put(r1, r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x003d:
            com.whatsapp.media.WamediaManager r0 = r6.A01
            X.71x r3 = new X.71x
            r3.<init>(r0, r9)
            monitor-enter(r4)
            r4.put(r1, r3)     // Catch:{ all -> 0x0074 }
            int r2 = r4.size()     // Catch:{ all -> 0x0074 }
            X.0ve r1 = r6.A00     // Catch:{ all -> 0x0074 }
            r0 = 9019(0x233b, float:1.2638E-41)
            int r0 = X.C18020vd.A00(r7, r1, r0)     // Catch:{ all -> 0x0074 }
            int r2 = r2 - r0
            java.util.Set r0 = r4.keySet()     // Catch:{ all -> 0x0074 }
            if (r2 >= r5) goto L_0x005c
            r2 = 0
        L_0x005c:
            java.util.List r0 = X.C29431cG.A0v(r0, r2)     // Catch:{ all -> 0x0074 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0074 }
        L_0x0064:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0072
            java.lang.String r0 = X.C17880vN.A0v(r1)     // Catch:{ all -> 0x0074 }
            r4.remove(r0)     // Catch:{ all -> 0x0074 }
            goto L_0x0064
        L_0x0072:
            monitor-exit(r4)
            return r3
        L_0x0074:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x0077:
            com.whatsapp.media.WamediaManager r1 = r8.A01
            X.71x r0 = new X.71x
            r0.<init>(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C132516mw.A00(java.io.File):X.71x");
    }

    public C132516mw(C18030ve r1, WamediaManager wamediaManager, AnonymousClass00H r3) {
        C18070vi.A0o(r1, wamediaManager, r3);
        this.A00 = r1;
        this.A01 = wamediaManager;
        this.A02 = r3;
    }
}
