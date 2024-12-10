package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8gY  reason: invalid class name */
public class AnonymousClass8gY extends C36821oW {
    public C23651Hc A00;
    public C36801oU A01;
    public AnonymousClass1OZ A02;
    public boolean A03 = true;
    public boolean A04 = true;
    public boolean A05 = true;
    public AtomicBoolean A06;
    public final Object A07 = C17880vN.A0p();

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
    /* JADX WARNING: Unknown top exception splitter block from list: {B:84:0x00ae=Splitter:B:84:0x00ae, B:69:0x009f=Splitter:B:69:0x009f} */
    public synchronized boolean A01() {
        /*
            r7 = this;
            r6 = r7
            monitor-enter(r6)
            boolean r0 = r7.A00     // Catch:{ all -> 0x00ad }
            r5 = 0
            if (r0 != 0) goto L_0x00ab
            r1 = r7
            boolean r0 = r7 instanceof X.C167368g8     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0019
            X.8g8 r1 = (X.C167368g8) r1     // Catch:{ all -> 0x00af }
            com.whatsapp.backup.google.workers.GoogleEncryptedReUploadWorker r0 = r1.A00     // Catch:{ all -> 0x00af }
            X.1oU r0 = r0.A08     // Catch:{ all -> 0x00af }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0Q     // Catch:{ all -> 0x00af }
        L_0x0014:
            boolean r0 = r0.get()     // Catch:{ all -> 0x00af }
            goto L_0x001e
        L_0x0019:
            X.1oU r0 = r7.A01     // Catch:{ all -> 0x00af }
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0P     // Catch:{ all -> 0x00af }
            goto L_0x0014
        L_0x001e:
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = "google-backup-worker-task-condition/block backup is not running"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00af }
            goto L_0x00ab
        L_0x0027:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A06     // Catch:{ all -> 0x00af }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "google-backup-worker-task-condition/block backup worker is stopped"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00af }
            goto L_0x00ab
        L_0x0035:
            java.lang.Object r4 = r7.A07     // Catch:{ all -> 0x00af }
            monitor-enter(r4)     // Catch:{ all -> 0x00af }
            r0 = 1
            r7.A05 = r0     // Catch:{ all -> 0x00a8 }
            r7.A04 = r0     // Catch:{ all -> 0x00a8 }
            r7.A03 = r0     // Catch:{ all -> 0x00a8 }
            X.1oU r1 = r7.A01     // Catch:{ all -> 0x00a8 }
            boolean r0 = r1.A09     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x004c
            java.lang.String r0 = "google-backup-worker-task-condition/refreshConditions sd card is not available"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a8 }
            r7.A04 = r5     // Catch:{ all -> 0x00a8 }
        L_0x004c:
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A0T     // Catch:{ all -> 0x00a8 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x005b
            java.lang.String r0 = "google-backup-worker-task-condition/refreshConditions network is not available for backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a8 }
            r7.A03 = r5     // Catch:{ all -> 0x00a8 }
        L_0x005b:
            X.1Hc r0 = r7.A00     // Catch:{ all -> 0x00a8 }
            boolean r0 = r0.A02()     // Catch:{ all -> 0x00a8 }
            if (r0 != 0) goto L_0x006a
            java.lang.String r0 = "google-backup-worker-task-condition/refreshConditions xmpp is not connected"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00a8 }
            r7.A05 = r5     // Catch:{ all -> 0x00a8 }
        L_0x006a:
            monitor-exit(r4)     // Catch:{ all -> 0x00a8 }
            monitor-enter(r4)     // Catch:{ all -> 0x00af }
            boolean r0 = r7.A05     // Catch:{ all -> 0x00a5 }
            r3 = 1
            if (r0 != 0) goto L_0x007a
            boolean r0 = r7.A03     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x007a
            boolean r1 = r7.A04     // Catch:{ all -> 0x00a5 }
            r0 = 1
            if (r1 != 0) goto L_0x007b
        L_0x007a:
            r0 = 0
        L_0x007b:
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "google-backup-worker-task-condition/reconnectXmppIfNeeded xmpp is not connected, reconnecting"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00af }
            X.1OZ r2 = r7.A02     // Catch:{ 1oV -> 0x0092 }
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.A0E(r0)     // Catch:{ 1oV -> 0x0092 }
            monitor-enter(r4)     // Catch:{ 1oV -> 0x0092 }
            r7.A05 = r3     // Catch:{ all -> 0x008f }
            monitor-exit(r4)     // Catch:{ all -> 0x008f }
            goto L_0x009f
        L_0x008f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ 1oV -> 0x0092 }
        L_0x0092:
            java.lang.String r0 = "google-backup-worker-task-condition/reconnectXmppIfNeeded xmpp reconnect wasn't successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00af }
            monitor-enter(r4)     // Catch:{ all -> 0x00af }
            r7.A05 = r5     // Catch:{ all -> 0x009c }
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            goto L_0x009f
        L_0x009c:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x009c }
            goto L_0x00ae
        L_0x009f:
            boolean r0 = r7.A06()     // Catch:{ all -> 0x00af }
            monitor-exit(r6)
            return r0
        L_0x00a5:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a5 }
            goto L_0x00ae
        L_0x00a8:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00a8 }
            goto L_0x00ae
        L_0x00ab:
            monitor-exit(r6)
            return r5
        L_0x00ad:
            r0 = move-exception
        L_0x00ae:
            throw r0     // Catch:{ all -> 0x00af }
        L_0x00af:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8gY.A01():boolean");
    }

    public boolean A03() {
        boolean z;
        synchronized (this.A07) {
            z = this.A03;
        }
        return z;
    }

    public boolean A04() {
        boolean z;
        synchronized (this.A07) {
            z = this.A04;
        }
        return z;
    }

    public boolean A05() {
        boolean z;
        synchronized (this.A07) {
            z = this.A05;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        if (r3.A05 == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A06() {
        /*
            r3 = this;
            java.lang.Object r2 = r3.A07
            monitor-enter(r2)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A06     // Catch:{ all -> 0x001b }
            boolean r0 = r0.get()     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0018
            boolean r0 = r3.A04     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0018
            boolean r0 = r3.A03     // Catch:{ all -> 0x001b }
            if (r0 == 0) goto L_0x0018
            boolean r1 = r3.A05     // Catch:{ all -> 0x001b }
            r0 = 1
            if (r1 != 0) goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            return r0
        L_0x001b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8gY.A06():boolean");
    }

    public AnonymousClass8gY(C23651Hc r2, C36801oU r3, AnonymousClass1OZ r4, AtomicBoolean atomicBoolean) {
        this.A06 = atomicBoolean;
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    public String toString() {
        return "backup-condition-for-backup-worker";
    }
}
