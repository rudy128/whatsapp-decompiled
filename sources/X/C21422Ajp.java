package X;

/* renamed from: X.Ajp  reason: case insensitive filesystem */
public class C21422Ajp implements Runnable {
    public final int A00;

    public C21422Ajp(int i) {
        this.A00 = i;
    }

    public static void A00(Object[] objArr, int i, int i2) {
        objArr[i2] = new C21422Ajp(i);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void run() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0006;
                case 1: goto L_0x010d;
                case 2: goto L_0x0112;
                case 3: goto L_0x0116;
                case 4: goto L_0x011a;
                case 5: goto L_0x011e;
                case 6: goto L_0x0122;
                case 7: goto L_0x0126;
                case 46: goto L_0x012a;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.util.concurrent.BlockingQueue r0 = X.C22797BPk.A03     // Catch:{ InterruptedException -> 0x0006 }
            java.lang.Object r3 = r0.take()     // Catch:{ InterruptedException -> 0x0006 }
            X.C5Q r3 = (X.C5Q) r3     // Catch:{ InterruptedException -> 0x0006 }
            r2 = 0
            java.lang.String r0 = r3.A01     // Catch:{ IOException -> 0x00de, all -> 0x010b }
            if (r0 != 0) goto L_0x001d
            X.Ct1 r1 = X.C26138Ct1.A09     // Catch:{ IOException -> 0x00de, all -> 0x010b }
            monitor-enter(r1)     // Catch:{ IOException -> 0x00de, all -> 0x010b }
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x00f2
        L_0x0019:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0019 }
            goto L_0x00dd
        L_0x001d:
            X.AiJ r6 = X.C22797BPk.A05     // Catch:{ IOException -> 0x00de, all -> 0x010b }
            java.lang.String r7 = r3.A01     // Catch:{ IOException -> 0x00de, all -> 0x010b }
            monitor-enter(r6)     // Catch:{ IOException -> 0x00de, all -> 0x010b }
            java.io.Writer r0 = r6.A03     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x00d4
            X.C21334AiJ.A06(r7)     // Catch:{ all -> 0x00db }
            java.util.LinkedHashMap r0 = r6.A09     // Catch:{ all -> 0x00db }
            java.lang.Object r1 = r0.get(r7)     // Catch:{ all -> 0x00db }
            X.9of r1 = (X.C192599of) r1     // Catch:{ all -> 0x00db }
            if (r1 != 0) goto L_0x005f
            X.9of r1 = new X.9of     // Catch:{ all -> 0x00db }
            r1.<init>(r6, r7)     // Catch:{ all -> 0x00db }
            r0.put(r7, r1)     // Catch:{ all -> 0x00db }
        L_0x003b:
            X.9mF r5 = new X.9mF     // Catch:{ all -> 0x00db }
            r5.<init>(r1, r6)     // Catch:{ all -> 0x00db }
            r1.A00 = r5     // Catch:{ all -> 0x00db }
            java.io.Writer r4 = r6.A03     // Catch:{ all -> 0x00db }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x00db }
            java.lang.String r0 = "DIRTY "
            r1.append(r0)     // Catch:{ all -> 0x00db }
            r1.append(r7)     // Catch:{ all -> 0x00db }
            r0 = 10
            java.lang.String r0 = X.C17890vO.A0c(r1, r0)     // Catch:{ all -> 0x00db }
            r4.write(r0)     // Catch:{ all -> 0x00db }
            java.io.Writer r0 = r6.A03     // Catch:{ all -> 0x00db }
            r0.flush()     // Catch:{ all -> 0x00db }
            goto L_0x0064
        L_0x005f:
            X.9mF r0 = r1.A00     // Catch:{ all -> 0x00db }
            if (r0 == 0) goto L_0x003b
            goto L_0x00d2
        L_0x0064:
            monitor-exit(r6)     // Catch:{ IOException -> 0x00de, all -> 0x010b }
            r7 = 0
            X.AiJ r6 = r5.A04     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            int r4 = r6.A05     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            if (r7 >= r4) goto L_0x00bc
            monitor-enter(r6)     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            X.9of r8 = r5.A02     // Catch:{ all -> 0x00b9 }
            X.9mF r0 = r8.A00     // Catch:{ all -> 0x00b9 }
            if (r0 != r5) goto L_0x00b3
            boolean r0 = r8.A01     // Catch:{ all -> 0x00b9 }
            if (r0 != 0) goto L_0x007c
            boolean[] r1 = r5.A03     // Catch:{ all -> 0x00b9 }
            r0 = 1
            r1[r7] = r0     // Catch:{ all -> 0x00b9 }
        L_0x007c:
            java.io.File r1 = r8.A01()     // Catch:{ all -> 0x00b9 }
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r1)     // Catch:{ FileNotFoundException -> 0x0085 }
            goto L_0x008e
        L_0x0085:
            java.io.File r0 = r6.A06     // Catch:{ all -> 0x00b9 }
            r0.mkdirs()     // Catch:{ all -> 0x00b9 }
            java.io.FileOutputStream r0 = X.C108945cZ.A19(r1)     // Catch:{ FileNotFoundException -> 0x0094 }
        L_0x008e:
            X.9HT r4 = new X.9HT     // Catch:{ all -> 0x00b9 }
            r4.<init>(r5, r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x0096
        L_0x0094:
            java.io.OutputStream r4 = X.C21334AiJ.A0E     // Catch:{ all -> 0x00b9 }
        L_0x0096:
            monitor-exit(r6)     // Catch:{ all -> 0x00b9 }
            r2 = r4
            byte[] r1 = r3.A02     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            int r0 = r3.A00     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            r4.write(r1, r7, r0)     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            boolean r0 = r5.A01     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            r1 = 1
            if (r0 == 0) goto L_0x00af
            X.C21334AiJ.A01(r5, r6, r7)     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            java.lang.String r0 = r8.A02     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            r6.A08(r0)     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
        L_0x00ac:
            r5.A00 = r1     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            goto L_0x00ef
        L_0x00af:
            X.C21334AiJ.A01(r5, r6, r1)     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            goto L_0x00ac
        L_0x00b3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00b9 }
            r0.<init>()     // Catch:{ all -> 0x00b9 }
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b9 }
            goto L_0x00ce
        L_0x00bc:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            java.lang.String r0 = "Expected index "
            r1.append(r0)     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            r1.append(r7)     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
            java.lang.String r0 = " to be greater than 0 and less than the maximum value count of "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A13(r0, r1, r4)     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
        L_0x00ce:
            throw r0     // Catch:{ IOException -> 0x00cf, all -> 0x00f7 }
        L_0x00cf:
            r4 = r2
            r2 = r5
            goto L_0x00df
        L_0x00d2:
            monitor-exit(r6)     // Catch:{ IOException -> 0x00de, all -> 0x010b }
            goto L_0x00f2
        L_0x00d4:
            java.lang.String r0 = "cache is closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x00db }
            throw r0     // Catch:{ all -> 0x00db }
        L_0x00db:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ IOException -> 0x00de, all -> 0x010b }
        L_0x00dd:
            throw r0     // Catch:{ IOException -> 0x00de, all -> 0x010b }
        L_0x00de:
            r4 = r2
        L_0x00df:
            X.Ct1 r0 = X.C26138Ct1.A0B     // Catch:{ all -> 0x00fb }
            r0.A02()     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x00ed
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x00ed
            r2.A00()     // Catch:{ IOException -> 0x00ed }
        L_0x00ed:
            if (r4 == 0) goto L_0x00f2
        L_0x00ef:
            r4.close()     // Catch:{ IOException -> 0x00f2 }
        L_0x00f2:
            X.DAI.A01(r3)
            goto L_0x0006
        L_0x00f7:
            r1 = move-exception
            r4 = r2
            r2 = r5
            goto L_0x00fe
        L_0x00fb:
            r1 = move-exception
            if (r2 == 0) goto L_0x0105
        L_0x00fe:
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0105
            r2.A00()     // Catch:{ IOException -> 0x0105 }
        L_0x0105:
            if (r4 == 0) goto L_0x010c
            r4.close()     // Catch:{ IOException -> 0x010c }
            throw r1
        L_0x010b:
            r1 = move-exception
        L_0x010c:
            throw r1
        L_0x010d:
            r0 = 1
            X.C25927Coq.A00(r0)
            return
        L_0x0112:
            com.whatsapp.util.Log.rotate()
            return
        L_0x0116:
            com.whatsapp.voipcalling.Voip.acceptVideoUpgrade()
            return
        L_0x011a:
            com.whatsapp.voipcalling.Voip.requestVideoUpgrade()
            return
        L_0x011e:
            com.whatsapp.voipcalling.Voip.turnCameraOn()
            return
        L_0x0122:
            com.whatsapp.voipcalling.Voip.turnCameraOff()
            return
        L_0x0126:
            com.whatsapp.voipcalling.Voip.groupCallBufferProcessMessages()
            return
        L_0x012a:
            java.util.List r0 = X.C42011xT.A0I
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21422Ajp.run():void");
    }
}
