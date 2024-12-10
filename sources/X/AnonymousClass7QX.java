package X;

import java.util.List;

/* renamed from: X.7QX  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QX implements Runnable {
    public final /* synthetic */ C139276yZ A00;
    public final /* synthetic */ List A01;
    public final /* synthetic */ C18090vk A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r62 = this;
            r2 = r62
            X.6yZ r0 = r2.A00
            boolean r12 = r2.A03
            boolean r4 = r2.A04
            java.util.List r3 = r2.A01
            boolean r1 = r2.A05
            r26 = r1
            boolean r11 = r2.A06
            boolean r1 = r2.A07
            r56 = r1
            boolean r1 = r2.A08
            r57 = r1
            boolean r15 = r2.A09
            X.0vk r14 = r2.A02
            r2 = 0
            X.00H r1 = r0.A04
            r61 = r1
            java.lang.Object r1 = r61.get()
            X.1Sc r1 = (X.C26431Sc) r1
            X.2mD r28 = r1.A0C(r12, r2, r4)
            java.lang.Object r1 = r61.get()
            X.1Sc r1 = (X.C26431Sc) r1
            X.2mD r42 = r1.A0B()
            if (r4 == 0) goto L_0x01a9
            X.1So r10 = X.C26551So.A0d
        L_0x0039:
            java.util.Iterator r25 = r3.iterator()
            r24 = 0
        L_0x003f:
            boolean r1 = r25.hasNext()
            if (r1 == 0) goto L_0x01b0
            java.lang.Object r23 = r25.next()
            r9 = r23
            X.72S r9 = (X.AnonymousClass72S) r9
            java.io.File r3 = r9.A0C()
            java.io.File r2 = r9.A0C()
            X.71x r1 = r9.A07()
            if (r1 != 0) goto L_0x0077
            if (r2 == 0) goto L_0x0077
            X.00H r1 = r0.A05     // Catch:{ 1Se -> 0x0071 }
            java.lang.Object r1 = r1.get()     // Catch:{ 1Se -> 0x0071 }
            X.6mw r1 = (X.C132516mw) r1     // Catch:{ 1Se -> 0x0071 }
            X.71x r1 = r1.A00(r2)     // Catch:{ 1Se -> 0x0071 }
            monitor-enter(r23)     // Catch:{ 1Se -> 0x0071 }
            r9.A07 = r1     // Catch:{ all -> 0x006e }
            monitor-exit(r23)     // Catch:{ 1Se -> 0x0071 }
            goto L_0x0077
        L_0x006e:
            r1 = move-exception
            monitor-exit(r23)     // Catch:{ 1Se -> 0x0071 }
            throw r1     // Catch:{ 1Se -> 0x0071 }
        L_0x0071:
            r2 = move-exception
            java.lang.String r1 = "VideoMaxDurationEnforcer/getVideoMetaWithCreate"
            com.whatsapp.util.Log.e(r1, r2)
        L_0x0077:
            X.71x r1 = r9.A07()
            if (r1 == 0) goto L_0x003f
            if (r3 == 0) goto L_0x003f
            if (r12 != 0) goto L_0x0085
            r55 = 0
            if (r26 == 0) goto L_0x0087
        L_0x0085:
            r55 = 1
        L_0x0087:
            monitor-enter(r23)
            X.6rN r2 = r9.A06     // Catch:{ all -> 0x01ad }
            monitor-exit(r23)
            boolean r40 = X.AnonymousClass000.A1W(r2)
            r2 = 0
            if (r15 == 0) goto L_0x019f
            X.00H r2 = r0.A02
            java.lang.Object r5 = r2.get()
            X.71b r5 = (X.C1403571b) r5
            int r4 = r1.A02
            int r2 = r1.A00
            X.6rw r5 = r5.A02(r4, r2)
            int r2 = r5.A01
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            int r2 = r5.A00
            X.1D6 r2 = X.AnonymousClass1D6.A00(r4, r2)
            java.lang.Object r6 = r2.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Object r2 = r2.second
            java.lang.Integer r2 = (java.lang.Integer) r2
        L_0x00b6:
            java.lang.Object r4 = r61.get()
            X.1Sc r4 = (X.C26431Sc) r4
            long r7 = r1.A03
            r59 = r7
            java.lang.Object r5 = r61.get()
            X.1Sc r5 = (X.C26431Sc) r5
            boolean r39 = r5.A0F(r10, r3)
            r35 = 0
            r37 = 0
            r27 = r4
            r29 = r1
            r30 = r3
            r31 = r6
            r32 = r2
            r33 = r7
            r38 = r37
            long r53 = r27.A09(r28, r29, r30, r31, r32, r33, r35, r37, r38, r39, r40)
            r58 = r24 ^ 1
            r50 = r28
            r51 = r0
            r52 = r1
            X.1D6 r4 = X.C139276yZ.A00(r50, r51, r52, r53, r55, r56, r57, r58)
            java.lang.Object r5 = r4.first
            long r21 = X.C17880vN.A05(r5)
            java.lang.Object r4 = r4.second
            boolean r13 = X.AnonymousClass000.A1Y(r4)
            if (r24 == 0) goto L_0x00fc
            r13 = r24
        L_0x00fc:
            X.00H r4 = r0.A06
            boolean r4 = X.C139506yx.A00(r4)
            if (r4 == 0) goto L_0x019c
            java.lang.Object r4 = r61.get()
            X.1Sc r4 = (X.C26431Sc) r4
            java.lang.Object r5 = r61.get()
            X.1Sc r5 = (X.C26431Sc) r5
            boolean r53 = r5.A0F(r10, r3)
            r52 = r37
            r41 = r4
            r43 = r1
            r44 = r3
            r45 = r6
            r46 = r2
            r47 = r7
            r49 = r35
            r51 = r37
            r54 = r40
            long r32 = r41.A09(r42, r43, r44, r45, r46, r47, r49, r51, r52, r53, r54)
            r29 = r42
            r30 = r0
            r31 = r1
            r34 = r55
            r35 = r56
            r36 = r57
            X.1D6 r1 = X.C139276yZ.A00(r29, r30, r31, r32, r34, r35, r36, r37)
            java.lang.Object r1 = r1.first
            long r19 = X.C17880vN.A05(r1)
        L_0x0142:
            if (r11 == 0) goto L_0x0199
            r5 = r19
        L_0x0146:
            android.graphics.Point r1 = r9.A04()
            if (r1 == 0) goto L_0x0196
            int r2 = r1.y
            long r3 = (long) r2
            int r1 = r1.x
            long r1 = (long) r1
            long r17 = r3 - r1
            if (r11 != 0) goto L_0x0158
            r21 = r19
        L_0x0158:
            int r16 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r16 > 0) goto L_0x0164
            int r16 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r16 != 0) goto L_0x0194
            int r16 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r16 <= 0) goto L_0x0194
        L_0x0164:
            r16 = 1000(0x3e8, double:4.94E-321)
            int r3 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x016c
            r7 = 1000(0x3e8, double:4.94E-321)
        L_0x016c:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto L_0x0171
            r7 = r5
        L_0x0171:
            r5 = r7
        L_0x0172:
            android.graphics.Point r3 = new android.graphics.Point
            r3.<init>()
            int r4 = (int) r1
            r3.x = r4
            int r1 = (int) r5
            r3.y = r1
            X.1D6 r1 = X.C108975cc.A0i(r3, r13)
            java.lang.Object r2 = r1.first
            android.graphics.Point r2 = (android.graphics.Point) r2
            java.lang.Object r1 = r1.second
            boolean r1 = X.AnonymousClass000.A1Y(r1)
            if (r24 != 0) goto L_0x018f
            r24 = r1
        L_0x018f:
            r9.A0L(r2)
            monitor-enter(r23)
            goto L_0x01a2
        L_0x0194:
            r5 = r3
            goto L_0x0172
        L_0x0196:
            r1 = 0
            goto L_0x0172
        L_0x0199:
            r5 = r21
            goto L_0x0146
        L_0x019c:
            r19 = r21
            goto L_0x0142
        L_0x019f:
            r6 = r2
            goto L_0x00b6
        L_0x01a2:
            r1 = r59
            r9.A02 = r1     // Catch:{ all -> 0x01ad }
            monitor-exit(r23)
            goto L_0x003f
        L_0x01a9:
            X.1So r10 = X.C26551So.A0q
            goto L_0x0039
        L_0x01ad:
            r0 = move-exception
            monitor-exit(r23)
            throw r0
        L_0x01b0:
            X.1KB r1 = r0.A00
            r0 = 13
            X.3Br r0 = X.C108945cZ.A0X(r14, r0)
            r1.A0J(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7QX.run():void");
    }

    public /* synthetic */ AnonymousClass7QX(C139276yZ r1, List list, C18090vk r3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = list;
        this.A05 = z3;
        this.A06 = z4;
        this.A07 = z5;
        this.A08 = z6;
        this.A09 = z7;
        this.A02 = r3;
    }
}
