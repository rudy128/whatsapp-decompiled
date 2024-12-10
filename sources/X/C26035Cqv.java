package X;

import android.os.Handler;
import android.util.Log;
import java.util.UUID;

/* renamed from: X.Cqv  reason: case insensitive filesystem */
public class C26035Cqv {
    public AnonymousClass86M A00;
    public String A01 = "";
    public final C25850CnB A02;
    public volatile UUID A03;
    public volatile boolean A04;

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    private boolean A01() {
        /*
            r7 = this;
            r6 = 0
            java.util.UUID r0 = r7.A03
            if (r0 == 0) goto L_0x0042
            X.CnB r5 = r7.A02
            java.util.UUID r4 = r7.A03
            monitor-enter(r5)
            java.util.UUID r0 = r5.A01     // Catch:{ all -> 0x003e }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0013
            goto L_0x0041
        L_0x0013:
            android.os.Handler r0 = r5.A03     // Catch:{ all -> 0x003e }
            boolean r3 = r0.hasMessages(r6, r4)     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003e }
            android.os.Handler r0 = r5.A00     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002b
            boolean r0 = r0.hasMessages(r6, r4)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
            android.os.Handler r0 = r5.A00     // Catch:{ all -> 0x003e }
            r0.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003e }
            goto L_0x0039
        L_0x002b:
            java.lang.Class<X.Crs> r2 = X.C26078Crs.class
            monitor-enter(r2)     // Catch:{ all -> 0x003e }
            android.os.Handler r1 = X.C26078Crs.A00     // Catch:{ all -> 0x003b }
            boolean r0 = r1.hasMessages(r6, r4)     // Catch:{ all -> 0x003b }
            r1.removeCallbacksAndMessages(r4)     // Catch:{ all -> 0x003b }
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            r3 = r3 | r0
        L_0x0039:
            monitor-exit(r5)
            goto L_0x0043
        L_0x003b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0041:
            monitor-exit(r5)
        L_0x0042:
            r3 = 0
        L_0x0043:
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r7.A03 = r0
            X.CnB r1 = r7.A02
            java.util.UUID r0 = r7.A03
            monitor-enter(r1)
            r1.A01 = r0     // Catch:{ all -> 0x0052 }
            monitor-exit(r1)
            return r3
        L_0x0052:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26035Cqv.A01():boolean");
    }

    private void A00(String str, String str2) {
        StringBuilder A11 = AnonymousClass000.A11(str);
        A11.append(" has been evicted. ");
        A11.append(str2);
        Log.e("SessionManager", AnonymousClass000.A0y(" now owns the camera device", A11));
        int i = C26175Cts.A00;
        C26175Cts.A01(C108945cZ.A0N(str, str2), 27, 0);
        AnonymousClass86M r0 = this.A00;
        if (r0 != null) {
            C25850CnB cnB = this.A02;
            AnonymousClass7Pq r1 = new AnonymousClass7Pq(r0, str, str2, 0);
            synchronized (cnB) {
                Handler handler = cnB.A00;
                if (handler != null) {
                    handler.post(r1);
                } else {
                    C26078Crs.A00(r1);
                }
            }
            this.A00 = null;
        }
    }

    public String A02() {
        String str;
        synchronized (this.A02) {
            str = this.A01;
        }
        return str;
    }

    public UUID A03(Handler handler, String str) {
        UUID uuid;
        C25850CnB cnB = this.A02;
        synchronized (cnB) {
            if (this.A04) {
                A00(this.A01, str);
            }
            if (A01()) {
                A00(this.A01, str);
            }
            cnB.A00 = handler;
            this.A01 = str;
            this.A04 = true;
            uuid = this.A03;
        }
        return uuid;
    }

    public void A04(AnonymousClass86M r3) {
        synchronized (this.A02) {
            this.A00 = r3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A05(java.util.UUID r4) {
        /*
            r3 = this;
            X.CnB r2 = r3.A02
            monitor-enter(r2)
            r1 = 0
            if (r4 == 0) goto L_0x001f
            java.util.UUID r0 = r3.A03     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            java.util.UUID r0 = r3.A03     // Catch:{ all -> 0x0021 }
            boolean r0 = r4.equals(r0)     // Catch:{ all -> 0x0021 }
            if (r0 == 0) goto L_0x001f
            r3.A01()     // Catch:{ all -> 0x0021 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0021 }
            r3.A00 = r0     // Catch:{ all -> 0x0021 }
            r3.A04 = r1     // Catch:{ all -> 0x0021 }
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            r0 = 1
            return r0
        L_0x001f:
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            return r1
        L_0x0021:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0021 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26035Cqv.A05(java.util.UUID):boolean");
    }

    public C26035Cqv(C25850CnB cnB) {
        this.A02 = cnB;
    }
}
