package X;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;

/* renamed from: X.18b  reason: invalid class name and case insensitive filesystem */
public class C219618b implements SSLSessionContext {
    public C219518a A00;
    public final Map A01;
    public volatile int A02;
    public volatile long A03;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public synchronized javax.net.ssl.SSLSession getSession(byte[] r13) {
        /*
            r12 = this;
            monitor-enter(r12)
            X.2kx r6 = new X.2kx     // Catch:{ all -> 0x00cc }
            r6.<init>(r12, r13)     // Catch:{ all -> 0x00cc }
            java.util.Map r2 = r12.A01     // Catch:{ 18c -> 0x00b0 }
            monitor-enter(r2)     // Catch:{ 18c -> 0x00b0 }
            java.lang.Object r5 = r2.get(r6)     // Catch:{ all -> 0x00ad }
            X.DWS r5 = (X.DWS) r5     // Catch:{ all -> 0x00ad }
            if (r5 != 0) goto L_0x005a
            X.18a r5 = r12.A00     // Catch:{ all -> 0x00ad }
            if (r5 == 0) goto L_0x00ab
            monitor-enter(r5)     // Catch:{ all -> 0x00ad }
            java.io.File r0 = X.C219518a.A01(r5)     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x001f
            monitor-exit(r5)     // Catch:{ all -> 0x00ad }
            goto L_0x00ab
        L_0x001f:
            java.io.File r3 = X.C219518a.A01(r5)     // Catch:{ all -> 0x0036 }
            r0 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r13, r0)     // Catch:{ all -> 0x0036 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0036 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x0036 }
            com.whatsapp.watls13.WtPersistentSession r4 = X.C219518a.A00(r0)     // Catch:{ all -> 0x0036 }
            monitor-exit(r5)     // Catch:{ all -> 0x00ad }
            if (r4 == 0) goto L_0x00ab
            goto L_0x0039
        L_0x0036:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x0039:
            java.lang.String r3 = r4.A02     // Catch:{ all -> 0x00ad }
            int r1 = r4.A00     // Catch:{ all -> 0x00ad }
            java.lang.String r0 = r4.A01     // Catch:{ all -> 0x00ad }
            X.DWS r5 = new X.DWS     // Catch:{ all -> 0x00ad }
            r5.<init>(r12, r3, r0, r1)     // Catch:{ all -> 0x00ad }
            java.util.Map r0 = r4.A04     // Catch:{ all -> 0x00ad }
            r5.A03 = r0     // Catch:{ all -> 0x00ad }
            java.util.LinkedHashSet r0 = r4.A03     // Catch:{ all -> 0x00ad }
            r5.A02 = r0     // Catch:{ all -> 0x00ad }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ad }
            r5.A00 = r0     // Catch:{ all -> 0x00ad }
            X.2kx r0 = new X.2kx     // Catch:{ all -> 0x00ad }
            r0.<init>(r12, r13)     // Catch:{ all -> 0x00ad }
            r2.put(r0, r5)     // Catch:{ all -> 0x00ad }
        L_0x005a:
            boolean r0 = r5.isValid()     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x009f
            java.lang.String r7 = r5.getPeerHost()     // Catch:{ all -> 0x00ad }
            int r11 = r5.getPeerPort()     // Catch:{ all -> 0x00ad }
            java.lang.String r8 = r5.getCipherSuite()     // Catch:{ all -> 0x00ad }
            X.DWS r4 = new X.DWS     // Catch:{ all -> 0x00ad }
            r4.<init>(r12, r7, r8, r11)     // Catch:{ all -> 0x00ad }
            com.whatsapp.net.tls13.WtCachedPsk r3 = r5.A00()     // Catch:{ all -> 0x00ad }
            java.util.Map r1 = r5.A03     // Catch:{ all -> 0x00ad }
            byte r0 = r3.certsID     // Catch:{ all -> 0x00ad }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x00ad }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00ad }
            java.security.cert.Certificate[] r0 = (java.security.cert.Certificate[]) r0     // Catch:{ all -> 0x00ad }
            if (r0 == 0) goto L_0x008a
            r4.A01 = r3     // Catch:{ all -> 0x00ad }
            r4.A02(r0)     // Catch:{ all -> 0x00ad }
        L_0x008a:
            X.18a r1 = r12.A00     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x009c
            byte[] r0 = r6.A01     // Catch:{ all -> 0x00ad }
            java.util.LinkedHashSet r9 = r5.A02     // Catch:{ all -> 0x00ad }
            java.util.Map r10 = r5.A03     // Catch:{ all -> 0x00ad }
            com.whatsapp.watls13.WtPersistentSession r6 = new com.whatsapp.watls13.WtPersistentSession     // Catch:{ all -> 0x00ad }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ all -> 0x00ad }
            r1.A02(r6, r0)     // Catch:{ all -> 0x00ad }
        L_0x009c:
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            monitor-exit(r12)
            return r4
        L_0x009f:
            r2.remove(r6)     // Catch:{ all -> 0x00ad }
            X.18a r1 = r12.A00     // Catch:{ all -> 0x00ad }
            if (r1 == 0) goto L_0x00ab
            byte[] r0 = r6.A01     // Catch:{ all -> 0x00ad }
            r1.A03(r0)     // Catch:{ all -> 0x00ad }
        L_0x00ab:
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            goto L_0x00c9
        L_0x00ad:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00ad }
            throw r0     // Catch:{ 18c -> 0x00b0 }
        L_0x00b0:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
            r1.<init>()     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = "Encountered Exception "
            r1.append(r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00cc }
            r1.append(r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00cc }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00cc }
        L_0x00c9:
            monitor-exit(r12)
            r4 = 0
            return r4
        L_0x00cc:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C219618b.getSession(byte[]):javax.net.ssl.SSLSession");
    }

    public Enumeration getIds() {
        SSLSession[] sSLSessionArr;
        Map map = this.A01;
        synchronized (map) {
            sSLSessionArr = (SSLSession[]) map.values().toArray(new SSLSession[0]);
        }
        return new AnonymousClass3D5(this, Arrays.asList(sSLSessionArr).iterator());
    }

    public int getSessionTimeout() {
        return (int) this.A03;
    }

    public void setSessionCacheSize(int i) {
        if (i >= 0) {
            this.A02 = i;
            return;
        }
        throw new IllegalArgumentException("Cache size < 0");
    }

    public void setSessionTimeout(int i) {
        if (i >= 0) {
            this.A03 = (long) i;
            Map map = this.A01;
            synchronized (map) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    SSLSession sSLSession = (SSLSession) it.next();
                    if (!sSLSession.isValid()) {
                        it.remove();
                        C219518a r1 = this.A00;
                        if (r1 != null) {
                            r1.A03(sSLSession.getId());
                        }
                    }
                }
            }
            return;
        }
        throw new IllegalArgumentException("Timeout < 0");
    }

    public C219618b(C219518a r3) {
        this.A02 = 64;
        this.A01 = new C219818d(this);
        this.A03 = 172800;
        this.A00 = r3;
    }

    public int getSessionCacheSize() {
        return this.A02;
    }

    public C219618b() {
    }
}
