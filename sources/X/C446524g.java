package X;

/* renamed from: X.24g  reason: invalid class name and case insensitive filesystem */
public final class C446524g extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass20Z this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C446524g(AnonymousClass20Z r2) {
        super(0);
        this.this$0 = r2;
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
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r12 = this;
            X.20Z r0 = r12.this$0
            X.20Y r2 = r0.A00
            X.20E r4 = r0.A03
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            monitor-enter(r2)
            boolean r0 = r2.A00     // Catch:{ all -> 0x0152 }
            if (r0 != 0) goto L_0x011e
            X.19T r8 = r2.A01     // Catch:{ all -> 0x0152 }
            r7 = 314514774(0x12bf1d56, float:1.20610265E-27)
            r8.markerStart(r7)     // Catch:{ all -> 0x0152 }
            X.20a r0 = X.C435620a.A00     // Catch:{ all -> 0x0152 }
            r0.A00(r8, r7)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "get_regs"
            r8.markerPoint(r7, r0)     // Catch:{ all -> 0x0152 }
            X.0vp r0 = r2.A03     // Catch:{ all -> 0x0152 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x0152 }
            java.util.Set r5 = (java.util.Set) r5     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "config_regs"
            r8.markerPoint(r7, r0)     // Catch:{ all -> 0x0152 }
            X.C18070vi.A0b(r5)     // Catch:{ all -> 0x0152 }
            java.util.Iterator r3 = r5.iterator()     // Catch:{ all -> 0x0152 }
        L_0x0035:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r1 = r3.next()     // Catch:{ all -> 0x0152 }
            X.2kr r1 = (X.C58542kr) r1     // Catch:{ all -> 0x0152 }
            monitor-enter(r1)     // Catch:{ all -> 0x0152 }
            boolean r0 = r1.A00     // Catch:{ all -> 0x010f }
            if (r0 != 0) goto L_0x004c
            r1.A00()     // Catch:{ all -> 0x010f }
            r0 = 1
            r1.A00 = r0     // Catch:{ all -> 0x010f }
        L_0x004c:
            monitor-exit(r1)     // Catch:{ all -> 0x0152 }
            goto L_0x0035
        L_0x004e:
            java.lang.String r0 = "process_regs"
            r8.markerPoint(r7, r0)     // Catch:{ all -> 0x0152 }
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0152 }
            r9.<init>()     // Catch:{ all -> 0x0152 }
            java.util.Iterator r11 = r5.iterator()     // Catch:{ all -> 0x0152 }
        L_0x005c:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x0112
            java.lang.Object r1 = r11.next()     // Catch:{ all -> 0x0152 }
            r5 = r1
            X.2kr r5 = (X.C58542kr) r5     // Catch:{ all -> 0x0152 }
            monitor-enter(r1)     // Catch:{ all -> 0x0152 }
            monitor-enter(r1)     // Catch:{ all -> 0x010f }
            boolean r0 = r5.A00     // Catch:{ all -> 0x010c }
            if (r0 != 0) goto L_0x0075
            r5.A00()     // Catch:{ all -> 0x010c }
            r0 = 1
            r5.A00 = r0     // Catch:{ all -> 0x010c }
        L_0x0075:
            monitor-exit(r1)     // Catch:{ all -> 0x010f }
            java.util.List r0 = r5.A01     // Catch:{ all -> 0x010f }
            monitor-exit(r1)     // Catch:{ all -> 0x0152 }
            java.util.Iterator r10 = r0.iterator()     // Catch:{ all -> 0x0152 }
        L_0x007d:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x0152 }
            X.2I3 r0 = (X.AnonymousClass2I3) r0     // Catch:{ all -> 0x0152 }
            X.2I0 r0 = r0.A02     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x00d6
            X.20E r6 = r0.A01     // Catch:{ all -> 0x0152 }
            if (r6 == 0) goto L_0x00d9
            X.0vp r3 = r0.A00     // Catch:{ all -> 0x0152 }
            if (r3 == 0) goto L_0x00d3
            java.util.Map r1 = r2.A02     // Catch:{ all -> 0x0152 }
            boolean r0 = r1.containsKey(r6)     // Catch:{ all -> 0x0152 }
            if (r0 == 0) goto L_0x00be
            java.lang.Object r4 = r9.get(r6)     // Catch:{ all -> 0x0152 }
            X.20E r4 = (X.AnonymousClass20E) r4     // Catch:{ all -> 0x0152 }
            X.20F r6 = (X.AnonymousClass20F) r6     // Catch:{ all -> 0x0152 }
            java.lang.Class r0 = r6.A00     // Catch:{ all -> 0x0152 }
            java.lang.String r1 = X.C60662oP.A00(r0)     // Catch:{ all -> 0x0152 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0152 }
            r3.<init>()     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = "Duplicate registration of subsystem interface "
            r3.append(r0)     // Catch:{ all -> 0x0152 }
            r3.append(r1)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = ". Originally registered by "
            r3.append(r0)     // Catch:{ all -> 0x0152 }
            goto L_0x00ce
        L_0x00be:
            r1.put(r6, r3)     // Catch:{ all -> 0x0152 }
            java.lang.Class r1 = r5.getClass()     // Catch:{ all -> 0x0152 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0152 }
            r0.<init>(r1)     // Catch:{ all -> 0x0152 }
            r9.put(r6, r0)     // Catch:{ all -> 0x0152 }
            goto L_0x007d
        L_0x00ce:
            if (r4 == 0) goto L_0x00d1
            goto L_0x00e0
        L_0x00d1:
            r0 = 0
            goto L_0x00e8
        L_0x00d3:
            java.lang.String r0 = "defaultImplementation"
            goto L_0x00db
        L_0x00d6:
            java.lang.String r0 = "integrationPointBuilder"
            goto L_0x00db
        L_0x00d9:
            java.lang.String r0 = "integrationInterface"
        L_0x00db:
            X.C18070vi.A11(r0)     // Catch:{ all -> 0x0152 }
            r1 = 0
            goto L_0x010b
        L_0x00e0:
            X.20F r4 = (X.AnonymousClass20F) r4     // Catch:{ all -> 0x0152 }
            java.lang.Class r0 = r4.A00     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = X.C60662oP.A00(r0)     // Catch:{ all -> 0x0152 }
        L_0x00e8:
            r3.append(r0)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = ". Duplicate registered by "
            r3.append(r0)     // Catch:{ all -> 0x0152 }
            java.lang.Class r1 = r5.getClass()     // Catch:{ all -> 0x0152 }
            X.20F r0 = new X.20F     // Catch:{ all -> 0x0152 }
            r0.<init>(r1)     // Catch:{ all -> 0x0152 }
            java.lang.Class r0 = r0.A00     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = X.C60662oP.A00(r0)     // Catch:{ all -> 0x0152 }
            r3.append(r0)     // Catch:{ all -> 0x0152 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0152 }
            X.3Ee r1 = new X.3Ee     // Catch:{ all -> 0x0152 }
            r1.<init>(r0)     // Catch:{ all -> 0x0152 }
        L_0x010b:
            throw r1     // Catch:{ all -> 0x0152 }
        L_0x010c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x010f }
            throw r0     // Catch:{ all -> 0x010f }
        L_0x010f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0152 }
            throw r0     // Catch:{ all -> 0x0152 }
        L_0x0112:
            java.lang.String r0 = "init_complete"
            r8.markerPoint(r7, r0)     // Catch:{ all -> 0x0152 }
            r0 = 1
            r2.A00 = r0     // Catch:{ all -> 0x0152 }
            r0 = 2
            r8.markerEnd(r7, r0)     // Catch:{ all -> 0x0152 }
        L_0x011e:
            monitor-exit(r2)
            java.util.Map r0 = r2.A02
            java.lang.Object r0 = r0.get(r4)
            X.0vp r0 = (X.C18140vp) r0
            if (r0 == 0) goto L_0x012e
            java.lang.Object r0 = r0.get()
            return r0
        L_0x012e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Subsystem "
            r1.append(r0)
            X.20F r4 = (X.AnonymousClass20F) r4
            java.lang.Class r0 = r4.A00
            java.lang.String r0 = X.C60662oP.A00(r0)
            r1.append(r0)
            java.lang.String r0 = " was not registered."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            X.3Ef r0 = new X.3Ef
            r0.<init>(r1)
            throw r0
        L_0x0152:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C446524g.invoke():java.lang.Object");
    }
}
