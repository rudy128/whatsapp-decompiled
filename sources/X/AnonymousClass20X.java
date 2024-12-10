package X;

import java.util.Map;

/* renamed from: X.20X  reason: invalid class name */
public final class AnonymousClass20X {
    public AnonymousClass24T A00;
    public Map[] A01;
    public boolean A02;
    public final AnonymousClass19T A03;
    public final C18140vp A04;

    public AnonymousClass20X(AnonymousClass19T r2, C18140vp r3) {
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
        this.A03 = r2;
        this.A04 = r3;
    }

    public final C18140vp A00(AnonymousClass20E r3, int i) {
        String str;
        C18070vi.A0d(r3, 0);
        A01();
        AnonymousClass24T r1 = this.A00;
        if (r1 == null) {
            str = "metadata";
        } else if (i > r1.A00) {
            return null;
        } else {
            Map[] mapArr = this.A01;
            if (mapArr == null) {
                str = "integrationPointsFast";
            } else {
                Map map = mapArr[i];
                if (map != null) {
                    return (C18140vp) map.get(r3);
                }
                return null;
            }
        }
        C18070vi.A11(str);
        throw null;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void A01() {
        /*
            r13 = this;
            r12 = r13
            monitor-enter(r12)
            boolean r0 = r13.A02     // Catch:{ all -> 0x0184 }
            if (r0 != 0) goto L_0x0182
            X.19T r5 = r13.A03     // Catch:{ all -> 0x0184 }
            r4 = 314515949(0x12bf21ed, float:1.2062158E-27)
            r5.markerStart(r4)     // Catch:{ all -> 0x0184 }
            X.20a r0 = X.C435620a.A00     // Catch:{ all -> 0x0184 }
            r0.A00(r5, r4)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "get_regs"
            r5.markerPoint(r4, r0)     // Catch:{ all -> 0x0184 }
            X.0vp r0 = r13.A04     // Catch:{ all -> 0x0184 }
            java.lang.Object r6 = r0.get()     // Catch:{ all -> 0x0184 }
            java.util.Set r6 = (java.util.Set) r6     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "config_regs"
            r5.markerPoint(r4, r0)     // Catch:{ all -> 0x0184 }
            X.C18070vi.A0b(r6)     // Catch:{ all -> 0x0184 }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0184 }
        L_0x002c:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0184 }
            X.20c r2 = (X.C435820c) r2     // Catch:{ all -> 0x0184 }
            monitor-enter(r2)     // Catch:{ all -> 0x0184 }
            boolean r0 = r2.A00     // Catch:{ all -> 0x0134 }
            if (r0 != 0) goto L_0x0043
            r2.A08()     // Catch:{ all -> 0x0134 }
            r0 = 1
            r2.A00 = r0     // Catch:{ all -> 0x0134 }
        L_0x0043:
            monitor-exit(r2)     // Catch:{ all -> 0x0184 }
            goto L_0x002c
        L_0x0045:
            java.lang.String r0 = "process_regs"
            r5.markerPoint(r4, r0)     // Catch:{ all -> 0x0184 }
            X.24T r7 = new X.24T     // Catch:{ all -> 0x0184 }
            r7.<init>()     // Catch:{ all -> 0x0184 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0184 }
            r3.<init>()     // Catch:{ all -> 0x0184 }
            java.util.Iterator r11 = r6.iterator()     // Catch:{ all -> 0x0184 }
        L_0x0058:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x0137
            java.lang.Object r2 = r11.next()     // Catch:{ all -> 0x0184 }
            r1 = r2
            X.20c r1 = (X.C435820c) r1     // Catch:{ all -> 0x0184 }
            monitor-enter(r2)     // Catch:{ all -> 0x0184 }
            monitor-enter(r2)     // Catch:{ all -> 0x0134 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x0131 }
            if (r0 != 0) goto L_0x0071
            r1.A08()     // Catch:{ all -> 0x0131 }
            r0 = 1
            r1.A00 = r0     // Catch:{ all -> 0x0131 }
        L_0x0071:
            monitor-exit(r2)     // Catch:{ all -> 0x0134 }
            java.util.List r0 = r1.A02     // Catch:{ all -> 0x0134 }
            monitor-exit(r2)     // Catch:{ all -> 0x0184 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0184 }
        L_0x0079:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x0058
            java.lang.Object r6 = r10.next()     // Catch:{ all -> 0x0184 }
            X.20f r6 = (X.C436120f) r6     // Catch:{ all -> 0x0184 }
            java.lang.Integer r8 = r6.A05     // Catch:{ all -> 0x0184 }
            X.20E r2 = r6.A06     // Catch:{ all -> 0x0184 }
            if (r2 == 0) goto L_0x00eb
            if (r8 == 0) goto L_0x00f5
            java.util.ArrayList r1 = r7.A01     // Catch:{ all -> 0x0184 }
            X.1D6 r0 = new X.1D6     // Catch:{ all -> 0x0184 }
            r0.<init>(r8, r2)     // Catch:{ all -> 0x0184 }
            r1.add(r0)     // Catch:{ all -> 0x0184 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0184 }
            int r0 = r7.A00     // Catch:{ all -> 0x0184 }
            if (r8 <= r0) goto L_0x00a1
            r7.A00 = r8     // Catch:{ all -> 0x0184 }
        L_0x00a1:
            X.20j r9 = r6.A03     // Catch:{ all -> 0x0184 }
            if (r9 == 0) goto L_0x00ee
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0184 }
            r6.<init>()     // Catch:{ all -> 0x0184 }
            java.util.List r0 = r9.A01     // Catch:{ all -> 0x0184 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0184 }
        L_0x00b0:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x00c4
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0184 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x0184 }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0184 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0184 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0184 }
            goto L_0x00b0
        L_0x00c4:
            java.util.List r0 = r9.A00     // Catch:{ all -> 0x0184 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0184 }
        L_0x00ca:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0184 }
            X.1D6 r0 = (X.AnonymousClass1D6) r0     // Catch:{ all -> 0x0184 }
            java.lang.Object r1 = r0.first     // Catch:{ all -> 0x0184 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x0184 }
            r6.put(r1, r0)     // Catch:{ all -> 0x0184 }
            goto L_0x00ca
        L_0x00de:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0184 }
            X.1D6 r0 = new X.1D6     // Catch:{ all -> 0x0184 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0184 }
            r3.add(r0)     // Catch:{ all -> 0x0184 }
            goto L_0x0079
        L_0x00eb:
            java.lang.String r0 = "messageClass"
            goto L_0x00f0
        L_0x00ee:
            java.lang.String r0 = "integrationPointsBuilder"
        L_0x00f0:
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x0184 }
            r1 = 0
            goto L_0x0130
        L_0x00f5:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0184 }
            r2.<init>()     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = "Configuration error in builder="
            r2.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.Class r1 = r6.getClass()     // Catch:{ all -> 0x0184 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0184 }
            r0.<init>(r1)     // Catch:{ all -> 0x0184 }
            java.lang.Class r0 = r0.A00     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = X.C60662oP.A00(r0)     // Catch:{ all -> 0x0184 }
            r2.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = ", message type="
            r2.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.Integer r0 = r6.A05     // Catch:{ all -> 0x0184 }
            r2.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = ",, message class="
            r2.append(r0)     // Catch:{ all -> 0x0184 }
            X.20E r0 = r6.A06     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x00eb
            r2.append(r0)     // Catch:{ all -> 0x0184 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0184 }
            X.3Ee r1 = new X.3Ee     // Catch:{ all -> 0x0184 }
            r1.<init>(r0)     // Catch:{ all -> 0x0184 }
        L_0x0130:
            throw r1     // Catch:{ all -> 0x0184 }
        L_0x0131:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0134 }
            throw r0     // Catch:{ all -> 0x0134 }
        L_0x0134:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0184 }
            throw r0     // Catch:{ all -> 0x0184 }
        L_0x0137:
            java.lang.String r0 = "init_state"
            r5.markerPoint(r4, r0)     // Catch:{ all -> 0x0184 }
            r13.A00 = r7     // Catch:{ all -> 0x0184 }
            r6 = 0
            int r0 = r7.A00     // Catch:{ all -> 0x0184 }
            int r2 = r0 + 1
            java.util.Map[] r1 = new java.util.Map[r2]     // Catch:{ all -> 0x0184 }
            r0 = 0
        L_0x0146:
            if (r0 >= r2) goto L_0x014d
            r1[r0] = r6     // Catch:{ all -> 0x0184 }
            int r0 = r0 + 1
            goto L_0x0146
        L_0x014d:
            r13.A01 = r1     // Catch:{ all -> 0x0184 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0184 }
        L_0x0153:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0184 }
            if (r0 == 0) goto L_0x0176
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0184 }
            X.1D6 r1 = (X.AnonymousClass1D6) r1     // Catch:{ all -> 0x0184 }
            java.lang.Object r0 = r1.first     // Catch:{ all -> 0x0184 }
            java.lang.Number r0 = (java.lang.Number) r0     // Catch:{ all -> 0x0184 }
            int r2 = r0.intValue()     // Catch:{ all -> 0x0184 }
            java.lang.Object r1 = r1.second     // Catch:{ all -> 0x0184 }
            java.util.Map[] r0 = r13.A01     // Catch:{ all -> 0x0184 }
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "integrationPointsFast"
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x0184 }
            throw r6     // Catch:{ all -> 0x0184 }
        L_0x0173:
            r0[r2] = r1     // Catch:{ all -> 0x0184 }
            goto L_0x0153
        L_0x0176:
            java.lang.String r0 = "init_complete"
            r5.markerPoint(r4, r0)     // Catch:{ all -> 0x0184 }
            r0 = 1
            r13.A02 = r0     // Catch:{ all -> 0x0184 }
            r0 = 2
            r5.markerEnd(r4, r0)     // Catch:{ all -> 0x0184 }
        L_0x0182:
            monitor-exit(r12)
            return
        L_0x0184:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass20X.A01():void");
    }
}
