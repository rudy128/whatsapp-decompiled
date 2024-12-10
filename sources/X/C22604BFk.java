package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: X.BFk  reason: case insensitive filesystem */
public abstract class C22604BFk extends Binder implements IInterface {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public boolean A00(android.os.Parcel r7, int r8) {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r6 instanceof X.C23417Bgi
            if (r0 == 0) goto L_0x002c
            r1 = r6
            X.Bgi r1 = (X.C23417Bgi) r1
            r0 = 2
            if (r8 != r0) goto L_0x0164
            android.os.Parcelable$Creator r0 = X.C23128Bbh.CREATOR
            android.os.Parcelable r0 = X.BEA.A0M(r7, r0)
            X.Bbh r0 = (X.C23128Bbh) r0
            X.C25909CoN.A00(r7)
            int r0 = r0.A00
            com.google.android.gms.common.api.Status r3 = X.C23021BZx.A00(r0)
            int r0 = r3.A00
            if (r0 > 0) goto L_0x004f
            X.E7v r1 = r1.A00
            X.DI9 r0 = new X.DI9
            r0.<init>(r3)
            r1.CKS(r0)
        L_0x002a:
            r0 = 1
            return r0
        L_0x002c:
            boolean r0 = r6 instanceof X.C23416Bgh
            if (r0 == 0) goto L_0x0055
            r2 = r6
            X.Bgh r2 = (X.C23416Bgh) r2
            r0 = 2
            if (r8 != r0) goto L_0x0164
            int r0 = r7.readInt()
            X.C25909CoN.A00(r7)
            com.google.android.gms.common.api.Status r3 = X.C23021BZx.A00(r0)
            int r0 = r3.A00
            boolean r1 = X.C108975cc.A1A(r0)
            X.E7v r0 = r2.A00
            if (r1 == 0) goto L_0x0051
            r0.CKS(r3)
            goto L_0x002a
        L_0x004f:
            X.E7v r0 = r1.A00
        L_0x0051:
            r0.CIq(r3)
            goto L_0x002a
        L_0x0055:
            boolean r0 = r6 instanceof X.C23415Bgg
            if (r0 == 0) goto L_0x00d3
            r3 = r6
            X.Bgg r3 = (X.C23415Bgg) r3
            r0 = 2
            if (r8 == r0) goto L_0x00a8
            r0 = 3
            if (r8 == r0) goto L_0x0089
            r0 = 4
            if (r8 == r0) goto L_0x0080
            r0 = 5
            if (r8 != r0) goto L_0x0164
            android.os.Parcelable$Creator r0 = X.C23184Bce.CREATOR
            android.os.Parcelable r0 = X.BEA.A0M(r7, r0)
            X.Bce r0 = (X.C23184Bce) r0
            X.C25909CoN.A00(r7)
            monitor-enter(r5)
            X.Bgo r1 = new X.Bgo     // Catch:{ all -> 0x0166 }
            r1.<init>(r0)     // Catch:{ all -> 0x0166 }
            X.CWD r0 = r3.A00     // Catch:{ all -> 0x0166 }
            r0.A00(r1)     // Catch:{ all -> 0x0166 }
            goto L_0x0161
        L_0x0080:
            android.os.Parcelable$Creator r0 = X.C23124Bbd.CREATOR
            X.BEA.A0M(r7, r0)
            X.C25909CoN.A00(r7)
            goto L_0x002a
        L_0x0089:
            android.os.Parcelable$Creator r0 = X.C23182Bcc.CREATOR
            android.os.Parcelable r2 = X.BEA.A0M(r7, r0)
            X.Bcc r2 = (X.C23182Bcc) r2
            X.C25909CoN.A00(r7)
            monitor-enter(r5)
            java.util.Set r1 = r3.A01     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0166 }
            r1.remove(r0)     // Catch:{ all -> 0x0166 }
            X.Bgp r1 = new X.Bgp     // Catch:{ all -> 0x0166 }
            r1.<init>(r2)     // Catch:{ all -> 0x0166 }
            X.CWD r0 = r3.A00     // Catch:{ all -> 0x0166 }
            r0.A00(r1)     // Catch:{ all -> 0x0166 }
            goto L_0x0161
        L_0x00a8:
            android.os.Parcelable$Creator r0 = X.C23189Bcj.CREATOR
            android.os.Parcelable r2 = X.BEA.A0M(r7, r0)
            X.Bcj r2 = (X.C23189Bcj) r2
            X.C25909CoN.A00(r7)
            monitor-enter(r5)
            android.bluetooth.BluetoothDevice r0 = r2.A00     // Catch:{ all -> 0x0166 }
            if (r0 == 0) goto L_0x00c4
            java.lang.String r1 = r2.A01     // Catch:{ all -> 0x0166 }
            if (r1 == 0) goto L_0x00cb
            java.lang.String r0 = "__UNRECOGNIZED_BLUETOOTH_DEVICE__"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0166 }
            if (r0 != 0) goto L_0x00cb
        L_0x00c4:
            java.util.Set r1 = r3.A01     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x0166 }
            r1.add(r0)     // Catch:{ all -> 0x0166 }
        L_0x00cb:
            X.CWD r1 = r3.A00     // Catch:{ all -> 0x0166 }
            X.5qL r0 = new X.5qL     // Catch:{ all -> 0x0166 }
            r0.<init>(r2)     // Catch:{ all -> 0x0166 }
            goto L_0x0140
        L_0x00d3:
            r4 = r6
            X.Bge r4 = (X.C23413Bge) r4
            r0 = 2
            if (r8 == r0) goto L_0x0144
            r0 = 3
            if (r8 == r0) goto L_0x0117
            r0 = 4
            if (r8 == r0) goto L_0x00f9
            r0 = 5
            if (r8 != r0) goto L_0x0164
            android.os.Parcelable$Creator r0 = X.C23186Bcg.CREATOR
            android.os.Parcelable r0 = X.BEA.A0M(r7, r0)
            X.Bcg r0 = (X.C23186Bcg) r0
            X.C25909CoN.A00(r7)
            X.Bgl r1 = new X.Bgl
            r1.<init>(r0)
            X.CWD r0 = r4.A00
            r0.A00(r1)
            goto L_0x002a
        L_0x00f9:
            android.os.Parcelable$Creator r0 = X.C23183Bcd.CREATOR
            android.os.Parcelable r2 = X.BEA.A0M(r7, r0)
            X.Bcd r2 = (X.C23183Bcd) r2
            X.C25909CoN.A00(r7)
            monitor-enter(r5)
            java.util.Set r1 = r4.A02     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0166 }
            r1.remove(r0)     // Catch:{ all -> 0x0166 }
            X.Bgk r1 = new X.Bgk     // Catch:{ all -> 0x0166 }
            r1.<init>(r2)     // Catch:{ all -> 0x0166 }
            X.CWD r0 = r4.A00     // Catch:{ all -> 0x0166 }
            r0.A00(r1)     // Catch:{ all -> 0x0166 }
            goto L_0x0161
        L_0x0117:
            android.os.Parcelable$Creator r0 = X.C23187Bch.CREATOR
            android.os.Parcelable r3 = X.BEA.A0M(r7, r0)
            X.Bch r3 = (X.C23187Bch) r3
            X.C25909CoN.A00(r7)
            monitor-enter(r5)
            java.util.Set r0 = r4.A01     // Catch:{ all -> 0x0166 }
            java.lang.String r1 = r3.A01     // Catch:{ all -> 0x0166 }
            r0.remove(r1)     // Catch:{ all -> 0x0166 }
            int r0 = r3.A00     // Catch:{ all -> 0x0166 }
            com.google.android.gms.common.api.Status r2 = X.C23021BZx.A00(r0)     // Catch:{ all -> 0x0166 }
            int r0 = r2.A00     // Catch:{ all -> 0x0166 }
            if (r0 > 0) goto L_0x0139
            java.util.Set r0 = r4.A02     // Catch:{ all -> 0x0166 }
            r0.add(r1)     // Catch:{ all -> 0x0166 }
        L_0x0139:
            X.CWD r1 = r4.A00     // Catch:{ all -> 0x0166 }
            X.Bgs r0 = new X.Bgs     // Catch:{ all -> 0x0166 }
            r0.<init>(r2, r3)     // Catch:{ all -> 0x0166 }
        L_0x0140:
            r1.A00(r0)     // Catch:{ all -> 0x0166 }
            goto L_0x0161
        L_0x0144:
            android.os.Parcelable$Creator r0 = X.C23190Bck.CREATOR
            android.os.Parcelable r2 = X.BEA.A0M(r7, r0)
            X.Bck r2 = (X.C23190Bck) r2
            X.C25909CoN.A00(r7)
            monitor-enter(r5)
            java.util.Set r1 = r4.A01     // Catch:{ all -> 0x0166 }
            java.lang.String r0 = r2.A00     // Catch:{ all -> 0x0166 }
            r1.add(r0)     // Catch:{ all -> 0x0166 }
            X.Bgj r1 = new X.Bgj     // Catch:{ all -> 0x0166 }
            r1.<init>(r2)     // Catch:{ all -> 0x0166 }
            X.CWD r0 = r4.A00     // Catch:{ all -> 0x0166 }
            r0.A00(r1)     // Catch:{ all -> 0x0166 }
        L_0x0161:
            monitor-exit(r5)
            goto L_0x002a
        L_0x0164:
            r0 = 0
            return r0
        L_0x0166:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22604BFk.A00(android.os.Parcel, int):boolean");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            BE7.A16(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return A00(parcel, i);
    }
}
