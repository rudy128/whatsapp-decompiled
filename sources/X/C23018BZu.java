package X;

import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.Parcel;

/* renamed from: X.BZu  reason: case insensitive filesystem */
public final class C23018BZu extends C23023BZz {
    public final C24975CSa A00;
    public final E25 A01;
    public final String A02 = "locationServices";

    public final int BUx() {
        return 11717000;
    }

    public C23018BZu(Context context, Looper looper, EDW edw, EDX edx, CTL ctl) {
        super(context, looper, edw, edx, ctl, 23);
        C26937DJs dJs = new C26937DJs(this);
        this.A01 = dJs;
        this.A00 = new C24975CSa(context, dJs);
    }

    public final Location A0B(String str) {
        C23191Bcl[] bclArr;
        Parcel A002;
        C23082Bax bax = this.A0Q;
        if (bax == null) {
            bclArr = null;
        } else {
            bclArr = bax.A03;
        }
        C23191Bcl bcl = CI9.A02;
        if (bclArr != null) {
            int length = bclArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (!C25332Cdd.A01(bclArr[i], bcl)) {
                    i++;
                } else if (i >= 0) {
                    C23018BZu bZu = ((C26937DJs) this.A00.A00).A00;
                    bZu.A06();
                    C26397Cyx cyx = (C26397Cyx) ((ECI) bZu.A04());
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(cyx.A00);
                    obtain.writeString(str);
                    A002 = cyx.A00(80, obtain);
                }
            }
        }
        C23018BZu bZu2 = ((C26937DJs) this.A00.A00).A00;
        bZu2.A06();
        C26397Cyx cyx2 = (C26397Cyx) ((ECI) bZu2.A04());
        Parcel obtain2 = Parcel.obtain();
        obtain2.writeInterfaceToken(cyx2.A00);
        A002 = cyx2.A00(7, obtain2);
        Location location = (Location) BEA.A0M(A002, Location.CREATOR);
        A002.recycle();
        return location;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void BIn() {
        /*
            r12 = this;
            X.CSa r3 = r12.A00
            monitor-enter(r3)
            boolean r0 = r12.isConnected()     // Catch:{ all -> 0x009a }
            if (r0 == 0) goto L_0x0095
            java.util.Map r2 = r3.A01     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.C17890vO.A0l(r2)     // Catch:{ all -> 0x008a }
        L_0x0010:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x008a }
            r6 = 0
            if (r0 == 0) goto L_0x0038
            java.lang.Object r7 = r1.next()     // Catch:{ all -> 0x008a }
            X.Bg7 r7 = (X.C23380Bg7) r7     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x0010
            X.E25 r0 = r3.A00     // Catch:{ all -> 0x008a }
            X.DJs r0 = (X.C26937DJs) r0     // Catch:{ all -> 0x008a }
            X.BZu r0 = r0.A00     // Catch:{ all -> 0x008a }
            android.os.IInterface r0 = r0.A04()     // Catch:{ all -> 0x008a }
            X.ECI r0 = (X.ECI) r0     // Catch:{ all -> 0x008a }
            r11 = 2
            X.Bb6 r5 = new X.Bb6     // Catch:{ all -> 0x008a }
            r9 = r6
            r10 = r6
            r8 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x008a }
            r0.CTj(r5)     // Catch:{ all -> 0x008a }
            goto L_0x0010
        L_0x0038:
            r2.clear()     // Catch:{ all -> 0x008a }
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
            java.util.Map r2 = r3.A03     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.C17890vO.A0l(r2)     // Catch:{ all -> 0x0087 }
        L_0x0043:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0087 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r8 = r1.next()     // Catch:{ all -> 0x0087 }
            X.Bg6 r8 = (X.C23379Bg6) r8     // Catch:{ all -> 0x0087 }
            if (r8 == 0) goto L_0x0043
            X.E25 r0 = r3.A00     // Catch:{ all -> 0x0087 }
            X.DJs r0 = (X.C26937DJs) r0     // Catch:{ all -> 0x0087 }
            X.BZu r0 = r0.A00     // Catch:{ all -> 0x0087 }
            android.os.IInterface r0 = r0.A04()     // Catch:{ all -> 0x0087 }
            X.ECI r0 = (X.ECI) r0     // Catch:{ all -> 0x0087 }
            r11 = 2
            X.Bb6 r5 = new X.Bb6     // Catch:{ all -> 0x0087 }
            r9 = r6
            r10 = r6
            r7 = r6
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0087 }
            r0.CTj(r5)     // Catch:{ all -> 0x0087 }
            goto L_0x0043
        L_0x006a:
            r2.clear()     // Catch:{ all -> 0x0087 }
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            java.util.Map r2 = r3.A02     // Catch:{ Exception -> 0x008d }
            monitor-enter(r2)     // Catch:{ Exception -> 0x008d }
            java.util.Iterator r1 = X.C17890vO.A0l(r2)     // Catch:{ all -> 0x0084 }
        L_0x0075:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x007f
            r1.next()     // Catch:{ all -> 0x0084 }
            goto L_0x0075
        L_0x007f:
            r2.clear()     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0084:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            goto L_0x008c
        L_0x0087:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0087 }
            goto L_0x008c
        L_0x008a:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x008a }
        L_0x008c:
            throw r0     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            r2 = move-exception
            java.lang.String r1 = "LocationClientImpl"
            java.lang.String r0 = "Client disconnected before listeners could be cleaned up"
            android.util.Log.e(r1, r0, r2)     // Catch:{ all -> 0x009a }
        L_0x0095:
            super.BIn()     // Catch:{ all -> 0x009a }
            monitor-exit(r3)     // Catch:{ all -> 0x009a }
            return
        L_0x009a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x009a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23018BZu.BIn():void");
    }
}
