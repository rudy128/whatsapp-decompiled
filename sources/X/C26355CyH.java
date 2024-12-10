package X;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;

/* renamed from: X.CyH  reason: case insensitive filesystem */
public class C26355CyH implements SensorEventListener {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;

    public C26355CyH(C145777Mo r2, C145777Mo r3) {
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.C58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: X.C58} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.C58} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public void onSensorChanged(android.hardware.SensorEvent r14) {
        /*
            r13 = this;
            int r0 = r13.A00
            if (r0 == 0) goto L_0x015a
            r7 = 0
            X.C18070vi.A0d(r14, r7)
            java.lang.Object r4 = r13.A01
            X.CWM r4 = (X.CWM) r4
            X.CWj r3 = r4.A02
            monitor-enter(r3)
            int r8 = r3.A01     // Catch:{ all -> 0x0157 }
            monitor-exit(r3)
            if (r8 != 0) goto L_0x0029
            long r0 = r14.timestamp
            r5 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r0 = r0 + r5
            r4.A00 = r0
        L_0x001c:
            X.C58 r2 = new X.C58
            r2.<init>()
        L_0x0021:
            float[] r0 = r14.values
            r0 = r0[r7]
            r2.A00 = r0
            monitor-enter(r3)
            goto L_0x0041
        L_0x0029:
            long r5 = r14.timestamp
            long r0 = r4.A00
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x003c
            r0 = 32
            if (r8 < r0) goto L_0x001c
        L_0x0035:
            java.lang.Object r2 = r3.A00()
            X.C58 r2 = (X.C58) r2
            goto L_0x0021
        L_0x003c:
            r0 = 10
            if (r8 >= r0) goto L_0x0035
            goto L_0x001c
        L_0x0041:
            monitor-enter(r3)     // Catch:{ all -> 0x0157 }
            int r0 = r3.A01     // Catch:{ all -> 0x014d }
            r10 = 32
            boolean r0 = X.AnonymousClass000.A1T(r0, r10)
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            if (r0 == 0) goto L_0x005a
            monitor-enter(r3)     // Catch:{ all -> 0x0157 }
            int r0 = r3.A01     // Catch:{ all -> 0x014d }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            if (r0 != 0) goto L_0x005a
            r3.A00()     // Catch:{ all -> 0x0157 }
        L_0x005a:
            int r1 = r3.A01     // Catch:{ all -> 0x0157 }
            java.lang.Object[] r9 = r3.A03     // Catch:{ all -> 0x0157 }
            if (r1 >= r10) goto L_0x0146
            int r0 = r3.A00     // Catch:{ all -> 0x0157 }
            r9[r0] = r2     // Catch:{ all -> 0x0157 }
            int r0 = r0 + 1
            int r0 = r0 % r10
            r3.A00 = r0     // Catch:{ all -> 0x0157 }
            int r0 = r1 + 1
            r3.A01 = r0     // Catch:{ all -> 0x0157 }
            monitor-exit(r3)
            monitor-enter(r3)
            int r8 = r3.A01     // Catch:{ all -> 0x0157 }
            monitor-exit(r3)
            r6 = 0
            r5 = 0
            r2 = 0
        L_0x0075:
            r0 = 2
            r11 = 1
            if (r6 >= r8) goto L_0x00c7
            monitor-enter(r3)
            int r0 = r3.A01     // Catch:{ all -> 0x0157 }
            if (r0 <= r6) goto L_0x0150
            int r0 = r3.A02     // Catch:{ all -> 0x0157 }
            int r0 = r0 + r6
            int r0 = r0 % r10
            r0 = r9[r0]     // Catch:{ all -> 0x0157 }
            monitor-exit(r3)
            X.C58 r0 = (X.C58) r0
            float r1 = r0.A00
            r0 = 1095806846(0x4150af7e, float:13.042845)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r12 = X.AnonymousClass000.A1R(r0)
            r0 = -1051676802(0xffffffffc150af7e, float:-13.042845)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            boolean r1 = X.C108975cc.A19(r0)
            java.lang.Integer r0 = r4.A01
            int r0 = r0.intValue()
            if (r0 == r7) goto L_0x00b5
            if (r0 == r11) goto L_0x00b0
            if (r12 != 0) goto L_0x00c0
            if (r1 != 0) goto L_0x00ad
        L_0x00a9:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r4.A01 = r0
        L_0x00ad:
            int r6 = r6 + 1
            goto L_0x0075
        L_0x00b0:
            if (r1 != 0) goto L_0x00b9
            if (r12 != 0) goto L_0x00ad
            goto L_0x00a9
        L_0x00b5:
            if (r12 != 0) goto L_0x00c0
            if (r1 == 0) goto L_0x00ad
        L_0x00b9:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            r4.A01 = r0
            int r2 = r2 + 1
            goto L_0x00ad
        L_0x00c0:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r4.A01 = r0
            int r5 = r5 + 1
            goto L_0x00ad
        L_0x00c7:
            if (r5 < r0) goto L_0x0136
            if (r2 < r0) goto L_0x0136
            r4.A00()
            java.lang.Object r0 = r13.A02
            X.1dQ r0 = (X.C30121dQ) r0
            java.lang.ref.WeakReference r0 = r0.A03
            java.lang.Object r5 = r0.get()
            android.app.Activity r5 = (android.app.Activity) r5
            boolean r0 = r5 instanceof X.AnonymousClass1FU
            if (r0 == 0) goto L_0x0140
            X.1FU r5 = (X.AnonymousClass1FU) r5
            if (r5 == 0) goto L_0x0140
            boolean r0 = r5.isFinishing()
            if (r0 != 0) goto L_0x0140
            java.util.List r1 = r5.A3W()
            boolean r0 = X.AnonymousClass000.A1a(r1)
            if (r0 == 0) goto L_0x0137
            java.util.Iterator r2 = r1.iterator()
        L_0x00f6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x013d
            java.lang.Object r1 = r2.next()
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1.A1e()
            if (r0 == 0) goto L_0x00f6
            boolean r0 = r1.A0n
            if (r0 == 0) goto L_0x00f6
            java.lang.String r3 = X.C108955ca.A0x(r1)
            X.C18070vi.A0X(r3)
        L_0x0113:
            android.net.Uri r2 = r5.A3T()
            java.lang.Class r0 = r5.getClass()
            X.20F r0 = X.AnonymousClass3MW.A15(r0)
            java.lang.Class r0 = r0.A00
            java.lang.String r1 = X.C60662oP.A00(r0)
            java.lang.String r0 = "com.whatsapp.voipcalling.VoipActivityV2"
            boolean r1 = X.C18070vi.A18(r1, r0)
            r0 = 0
            android.content.Intent r0 = X.AnonymousClass1LU.A0P(r5, r2, r0, r3, r1)
            r5.startActivity(r0)
            r4.A00()
        L_0x0136:
            return
        L_0x0137:
            java.lang.String r3 = X.BEA.A0i(r5)
            if (r3 != 0) goto L_0x0113
        L_0x013d:
            java.lang.String r3 = ""
            goto L_0x0113
        L_0x0140:
            java.lang.String r0 = "The activity is either finished or it is not a DialogActivity, so cannot show the feedback collector"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0146:
            java.lang.String r0 = "Check failed."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)     // Catch:{ all -> 0x0157 }
            goto L_0x0156
        L_0x014d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0157 }
            goto L_0x0156
        L_0x0150:
            java.lang.String r0 = "index out of bound"
            java.lang.IndexOutOfBoundsException r0 = X.BE6.A0l(r0)     // Catch:{ all -> 0x0157 }
        L_0x0156:
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x0157:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x015a:
            java.lang.Object r0 = r13.A02
            r2 = 0
            java.lang.Object r3 = r13.A01
            X.7Mo r3 = (X.C145777Mo) r3
            if (r0 == r3) goto L_0x0174
            int r0 = X.C145777Mo.A15
            X.10I r2 = r3.A0l
            r0 = 10
            X.4rn r1 = new X.4rn
            r1.<init>((java.lang.Object) r3, (int) r0)
            java.lang.String r0 = "messageaudioplayer/proximityListener"
            r2.CGS(r1, r0)
            return
        L_0x0174:
            float[] r0 = r14.values
            r1 = r0[r2]
            r0 = 1084227584(0x40a00000, float:5.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x018f
            int r0 = X.C145777Mo.A15
            android.hardware.Sensor r0 = r3.A0A
            float r0 = r0.getMaximumRange()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x018f
            r0 = 1
            r3.A0E(r0)
            return
        L_0x018f:
            r3.A0E(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26355CyH.onSensorChanged(android.hardware.SensorEvent):void");
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public C26355CyH(C30121dQ r2) {
        this.A02 = r2;
        this.A00 = 1;
        this.A01 = new CWM();
    }
}
