package X;

/* renamed from: X.7Qr  reason: invalid class name and case insensitive filesystem */
public class C146807Qr implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C146807Qr(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void run() {
        /*
            r102 = this;
            r6 = r102
            int r0 = r6.A00
            switch(r0) {
                case 1: goto L_0x0015;
                case 2: goto L_0x0007;
                case 3: goto L_0x002f;
                case 4: goto L_0x0b39;
                case 5: goto L_0x0b39;
                case 6: goto L_0x0007;
                case 7: goto L_0x0007;
                case 8: goto L_0x0b52;
                case 9: goto L_0x0055;
                case 10: goto L_0x0b60;
                case 11: goto L_0x0b6e;
                case 12: goto L_0x0b7a;
                case 13: goto L_0x0b8e;
                case 14: goto L_0x0079;
                case 15: goto L_0x0baa;
                case 16: goto L_0x0bbd;
                case 17: goto L_0x0baa;
                case 18: goto L_0x0baa;
                case 19: goto L_0x00a5;
                case 20: goto L_0x0c15;
                case 21: goto L_0x0c22;
                case 22: goto L_0x0c30;
                case 23: goto L_0x0c30;
                case 24: goto L_0x0c4a;
                case 25: goto L_0x0ca6;
                case 26: goto L_0x0cb2;
                case 27: goto L_0x0cbd;
                case 28: goto L_0x0cc9;
                case 29: goto L_0x0cdc;
                case 30: goto L_0x0cf0;
                case 31: goto L_0x0cfb;
                case 32: goto L_0x0d0e;
                case 33: goto L_0x00c4;
                case 34: goto L_0x0d1d;
                case 35: goto L_0x0d31;
                case 36: goto L_0x0d41;
                case 37: goto L_0x0733;
                case 38: goto L_0x0d4d;
                case 39: goto L_0x07f1;
                case 40: goto L_0x0d5a;
                case 41: goto L_0x0d6a;
                case 42: goto L_0x0922;
                case 43: goto L_0x0d76;
                case 44: goto L_0x0adf;
                case 45: goto L_0x0d82;
                case 46: goto L_0x0d93;
                case 47: goto L_0x0da3;
                case 48: goto L_0x0dad;
                case 49: goto L_0x0b17;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r6.A01
            X.1Uv r0 = (X.C27131Uv) r0
            java.lang.Object r1 = r6.A02
            X.1BI r1 = (X.AnonymousClass1BI) r1
            X.1NN r0 = r0.A0H
            r0.A02(r1)
        L_0x0014:
            return
        L_0x0015:
            java.lang.Object r2 = r6.A01
            X.1Uv r2 = (X.C27131Uv) r2
            java.lang.Object r0 = r6.A02
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r1 = r0.iterator()
        L_0x0021:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            X.1BI r0 = X.C17880vN.A0Q(r1)
            r2.A0V(r0)
            goto L_0x0021
        L_0x002f:
            java.lang.Object r3 = r6.A01
            X.1Uv r3 = (X.C27131Uv) r3
            java.lang.Object r0 = r6.A02
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            java.util.Iterator r2 = r0.iterator()
        L_0x003b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0014
            X.1BI r1 = X.C17880vN.A0Q(r2)
            if (r1 != 0) goto L_0x004d
            java.lang.String r0 = "LocationSharingManager/ContactObserver/found jid == null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x003b
        L_0x004d:
            r3.A0V(r1)
            r0 = 0
            X.C27131Uv.A08(r1, r0, r3)
            goto L_0x003b
        L_0x0055:
            java.lang.Object r3 = r6.A01
            X.1T6 r3 = (X.AnonymousClass1T6) r3
            java.lang.Object r2 = r6.A02
            X.34B r2 = (X.AnonymousClass34B) r2
            r0 = 0
            r2.A08(r0)
            X.1T5 r1 = r3.A09
            X.2kI r0 = r2.A02()
            X.1So r0 = r0.A06
            r1.A02(r2, r0)
            X.1Sg r1 = r3.A0B
            r1.A08(r2)
            X.34A r0 = r2.A02
            if (r0 == 0) goto L_0x0014
            r1.A08(r0)
            return
        L_0x0079:
            java.lang.Object r3 = r6.A01
            X.1hs r3 = (X.C32861hs) r3
            java.lang.Object r4 = r6.A02
            X.21V r4 = (X.AnonymousClass21V) r4
            X.1ho r1 = r3.A0A
            r0 = 1
            boolean r0 = r1.A06(r4, r0)
            if (r0 == 0) goto L_0x0014
            X.1KB r2 = r3.A01
            r1 = 20
            X.7Qr r0 = new X.7Qr
            r0.<init>(r3, r4, r1)
            r2.CGP(r0)
            r5 = 0
            r6 = 7
            r8 = 0
            X.10I r0 = r3.A0M
            r7 = 6
            X.3Cs r2 = new X.3Cs
            r2.<init>((java.lang.Object) r3, (java.lang.Object) r4, (java.lang.Object) r5, (int) r6, (int) r7, (boolean) r8)
            r0.CGF(r2)
            return
        L_0x00a5:
            java.lang.Object r4 = r6.A01
            X.1hs r4 = (X.C32861hs) r4
            java.lang.Object r0 = r6.A02
            X.2tS r0 = (X.C63642tS) r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A03
            java.util.Iterator r3 = X.C29431cG.A0o(r0)
        L_0x00b3:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0014
            X.206 r2 = X.C17880vN.A0Y(r3)
            X.121 r1 = r4.A03
            r0 = -1
            r1.CQx(r2, r0)
            goto L_0x00b3
        L_0x00c4:
            java.lang.Object r12 = r6.A01
            X.5ti r12 = (X.C115295ti) r12
            java.lang.Object r5 = r6.A02
            X.73o r5 = (X.C1409173o) r5
            r9 = 0
            r24 = 0
            r23 = 0
            r22 = 0
            r19 = 0
            r14 = 0
            r1 = 0
            X.6mb r3 = r12.A0O
            X.6zF r11 = r12.A0e
            X.6uk r0 = r12.A0d
            r21 = r0
            monitor-enter(r21)
            boolean r2 = r0.A0G     // Catch:{ all -> 0x0e7b }
            monitor-exit(r21)
            X.C18070vi.A0d(r11, r9)
            int r4 = r5.A01
            boolean r20 = r5.A03()
            r0 = 23
            if (r20 != 0) goto L_0x0154
            if (r4 == r0) goto L_0x0158
            r18 = 0
        L_0x00f4:
            java.lang.String r15 = r11.A0H
            if (r15 == 0) goto L_0x01bb
            X.2d7 r2 = r11.A01()
            X.7Ka r10 = r12.A0g
            boolean r7 = r11.A0Z
            X.6ug r0 = r12.A0r
            java.io.File r3 = r0.A0C
            if (r2 != 0) goto L_0x0151
            r8 = 0
        L_0x0107:
            int r2 = r11.A05
            int r5 = r12.A15
            boolean r0 = r11.A0a
            int r17 = X.C1409973w.A02(r5, r0)
            int r13 = r12.A06
            r16 = 0
            X.0vt r0 = r10.A05
            boolean r0 = r0.A01(r15)
            if (r0 == 0) goto L_0x01bb
            X.0ve r6 = r10.A02
            r5 = 11045(0x2b25, float:1.5477E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r6, r5)
            if (r0 == 0) goto L_0x01bb
            X.6m2 r6 = r10.A04
            X.6u9 r5 = r6.A00(r15)
            java.lang.Long r0 = X.C108955ca.A0m()
            r5.A0A = r0
            r5.A0D = r15
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r5.A07 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)
            r5.A02 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r5.A01 = r0
            r0 = 2
            if (r2 != r0) goto L_0x01aa
            if (r3 == 0) goto L_0x01aa
            if (r8 == 0) goto L_0x01aa
            goto L_0x0189
        L_0x0151:
            int[] r8 = r2.A01
            goto L_0x0107
        L_0x0154:
            if (r4 == r0) goto L_0x0158
            if (r2 == 0) goto L_0x015a
        L_0x0158:
            r22 = 1
        L_0x015a:
            boolean r14 = r11.A0c
            int r1 = r11.A05
            r0 = 2
            if (r1 != r0) goto L_0x0165
            if (r22 != 0) goto L_0x0165
            r24 = 1
        L_0x0165:
            X.1CJ r2 = r3.A00
            X.1BI r0 = r11.A08
            boolean r9 = r2.A0R(r0)
            boolean r0 = r11.A0b
            r19 = r0
            java.lang.String r2 = r11.A0J
            X.1So r0 = r11.A0A
            boolean r0 = X.C25291Nq.A06(r0)
            if (r0 == 0) goto L_0x0185
            if (r2 == 0) goto L_0x0185
            boolean r0 = X.C26521Sl.A0e(r2)
            if (r0 == 0) goto L_0x0185
            r23 = 1
        L_0x0185:
            r18 = 1
            goto L_0x00f4
        L_0x0189:
            X.00H r0 = r10.A0B     // Catch:{ all -> 0x019c }
            java.lang.Object r2 = r0.get()     // Catch:{ all -> 0x019c }
            X.6lc r2 = (X.C131756lc) r2     // Catch:{ all -> 0x019c }
            r0 = r8[r16]     // Catch:{ all -> 0x019c }
            boolean r0 = r2.A00(r3, r0, r7)     // Catch:{ all -> 0x019c }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x019c }
            goto L_0x01a1
        L_0x019c:
            r0 = move-exception
            X.1IU r2 = X.C108945cZ.A1J(r0)
        L_0x01a1:
            boolean r0 = r2 instanceof X.AnonymousClass1IU
            if (r0 == 0) goto L_0x01a6
            r2 = 0
        L_0x01a6:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            r5.A00 = r2
        L_0x01aa:
            java.lang.String r3 = r5.A0D
            if (r3 == 0) goto L_0x01bb
            X.0vl r0 = r6.A01
            android.content.SharedPreferences$Editor r2 = X.C17890vO.A0A(r0)
            java.lang.String r0 = r5.toString()
            X.C17880vN.A1E(r2, r3, r0)
        L_0x01bb:
            X.1hP r15 = r12.A0Z
            X.70W r0 = r12.A0k
            r101 = r0
            long r2 = r101.A05()
            double r6 = (double) r2
            int r0 = r11.A05
            r100 = r0
            int r3 = r12.A06
            r0 = 11
            if (r3 == r0) goto L_0x01e0
            r0 = 13
            if (r3 == r0) goto L_0x01f7
            switch(r3) {
                case 1: goto L_0x01ef;
                case 2: goto L_0x01f1;
                case 3: goto L_0x01f3;
                case 4: goto L_0x01f5;
                case 5: goto L_0x01e0;
                case 6: goto L_0x01e0;
                case 7: goto L_0x01e0;
                default: goto L_0x01d7;
            }
        L_0x01d7:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "MediaDownload/downloadOriginTypeToMediaOriginType/invalid downloadOriginType = "
            X.C17900vP.A0i(r0, r2, r3)
        L_0x01e0:
            r8 = 0
        L_0x01e1:
            int r0 = r12.A15
            boolean r32 = X.AnonymousClass000.A1O(r0)
            r0 = 14
            boolean r16 = X.AnonymousClass000.A1T(r4, r0)
            monitor-enter(r15)
            goto L_0x01f9
        L_0x01ef:
            r8 = 1
            goto L_0x01e1
        L_0x01f1:
            r8 = 2
            goto L_0x01e1
        L_0x01f3:
            r8 = 3
            goto L_0x01e1
        L_0x01f5:
            r8 = 4
            goto L_0x01e1
        L_0x01f7:
            r8 = 7
            goto L_0x01e1
        L_0x01f9:
            int r13 = X.C32571hP.A00(r15)     // Catch:{ all -> 0x0e78 }
            X.0ve r3 = r15.A00     // Catch:{ all -> 0x0e78 }
            r2 = 12670(0x317e, float:1.7754E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x0e78 }
            boolean r0 = X.C18020vd.A05(r0, r3, r2)     // Catch:{ all -> 0x0e78 }
            if (r0 != 0) goto L_0x0231
            long r30 = X.C32571hP.A01(r15)     // Catch:{ all -> 0x0e78 }
            X.1hO r10 = r15.A02     // Catch:{ all -> 0x0e78 }
            r26 = r10
            r27 = r100
            r28 = r13
            r29 = r8
            X.2sZ r0 = r26.A01(r27, r28, r29, r30, r32)     // Catch:{ all -> 0x0e78 }
            long r4 = r0.A00     // Catch:{ all -> 0x0e78 }
            long r2 = (long) r6     // Catch:{ all -> 0x0e78 }
            long r4 = r4 + r2
            r0.A00 = r4     // Catch:{ all -> 0x0e78 }
            if (r20 == 0) goto L_0x022a
            long r2 = r0.A02     // Catch:{ all -> 0x0e78 }
            r4 = 1
            long r2 = r2 + r4
            r0.A02 = r2     // Catch:{ all -> 0x0e78 }
        L_0x022a:
            r25 = r10
            r26 = r0
            r25.A02(r26, r27, r28, r29, r30, r32)     // Catch:{ all -> 0x0e78 }
        L_0x0231:
            if (r18 == 0) goto L_0x0695
            X.00H r0 = r15.A03     // Catch:{ all -> 0x0e78 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0e78 }
            X.6m1 r0 = (X.C132006m1) r0     // Catch:{ all -> 0x0e78 }
            X.00H r0 = r0.A01     // Catch:{ all -> 0x0e78 }
            r18 = r0
            java.lang.Object r0 = r18.get()     // Catch:{ all -> 0x0e78 }
            X.Cmh r0 = (X.C25830Cmh) r0     // Catch:{ all -> 0x0e78 }
            X.Cqo r0 = r0.A01()     // Catch:{ all -> 0x0e78 }
            r16 = 1
            r2 = 1
            if (r8 == r2) goto L_0x024f
            goto L_0x02a7
        L_0x024f:
            long r2 = r0.A0A     // Catch:{ all -> 0x0e78 }
            long r2 = r2 + r16
            r27 = 15
            r28 = 0
            r26 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r32 = r28
            r34 = r28
            r36 = r28
            r38 = r28
            r40 = r28
            r42 = r28
            r44 = r28
            r46 = r28
            r48 = r28
            r50 = r28
            r52 = r28
            r54 = r28
            r56 = r28
            r58 = r28
            r60 = r28
            r62 = r28
            r64 = r28
            r66 = r28
            r68 = r28
            r70 = r28
            r72 = r28
            r76 = r28
            r78 = r28
            r80 = r28
            r82 = r28
            r84 = r28
            r86 = r28
            r88 = r28
            r90 = r28
            r92 = r28
            r94 = r28
            r96 = r28
            r98 = r28
            r25 = r0
            r30 = r28
            r74 = r2
            X.Cqo r0 = X.C26030Cqo.A00(r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98)     // Catch:{ all -> 0x0e78 }
            goto L_0x02b0
        L_0x02a7:
            r2 = 2
            if (r8 == r2) goto L_0x0326
            r2 = 3
            if (r8 == r2) goto L_0x02ce
            r2 = 4
            if (r8 == r2) goto L_0x02ce
        L_0x02b0:
            r2 = 2
            if (r1 == r2) goto L_0x05c5
            r2 = 3
            if (r1 == r2) goto L_0x0552
            r2 = 4
            if (r1 == r2) goto L_0x04f9
            r2 = 5
            if (r1 == r2) goto L_0x04f9
            r2 = 8
            if (r1 == r2) goto L_0x048b
            r2 = 11
            if (r1 == r2) goto L_0x0432
            r2 = 16
            if (r1 == r2) goto L_0x0635
            r2 = 64
            if (r1 != r2) goto L_0x068b
            goto L_0x03da
        L_0x02ce:
            long r2 = r0.A0H     // Catch:{ all -> 0x0e78 }
            long r2 = r2 + r16
            r27 = 15
            r28 = 0
            r26 = -536870913(0xffffffffdfffffff, float:-3.6893486E19)
            r32 = r28
            r34 = r28
            r36 = r28
            r38 = r28
            r40 = r28
            r42 = r28
            r44 = r28
            r46 = r28
            r48 = r28
            r50 = r28
            r52 = r28
            r54 = r28
            r56 = r28
            r58 = r28
            r60 = r28
            r62 = r28
            r64 = r28
            r66 = r28
            r68 = r28
            r70 = r28
            r72 = r28
            r74 = r28
            r76 = r28
            r78 = r28
            r80 = r28
            r82 = r28
            r84 = r28
            r88 = r28
            r90 = r28
            r92 = r28
            r94 = r28
            r96 = r28
            r98 = r28
            r25 = r0
            r30 = r28
            r86 = r2
            X.Cqo r0 = X.C26030Cqo.A00(r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98)     // Catch:{ all -> 0x0e78 }
            goto L_0x02b0
        L_0x0326:
            if (r9 == 0) goto L_0x0381
            long r2 = r0.A0C     // Catch:{ all -> 0x0e78 }
            long r2 = r2 + r16
            r27 = 15
            r28 = 0
            r26 = -33554433(0xfffffffffdffffff, float:-4.2535293E37)
            r32 = r28
            r34 = r28
            r36 = r28
            r38 = r28
            r40 = r28
            r42 = r28
            r44 = r28
            r46 = r28
            r48 = r28
            r50 = r28
            r52 = r28
            r54 = r28
            r56 = r28
            r58 = r28
            r60 = r28
            r62 = r28
            r64 = r28
            r66 = r28
            r68 = r28
            r70 = r28
            r72 = r28
            r74 = r28
            r76 = r28
            r80 = r28
            r82 = r28
            r84 = r28
            r86 = r28
            r88 = r28
            r90 = r28
            r92 = r28
            r94 = r28
            r96 = r28
            r98 = r28
            r25 = r0
            r30 = r28
            r78 = r2
            X.Cqo r0 = X.C26030Cqo.A00(r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98)     // Catch:{ all -> 0x0e78 }
            goto L_0x02b0
        L_0x0381:
            long r2 = r0.A0F     // Catch:{ all -> 0x0e78 }
            long r2 = r2 + r16
            r27 = 15
            r28 = 0
            r26 = -134217729(0xfffffffff7ffffff, float:-1.0384593E34)
            r32 = r28
            r34 = r28
            r36 = r28
            r38 = r28
            r40 = r28
            r42 = r28
            r44 = r28
            r46 = r28
            r48 = r28
            r50 = r28
            r52 = r28
            r54 = r28
            r56 = r28
            r58 = r28
            r60 = r28
            r62 = r28
            r64 = r28
            r66 = r28
            r68 = r28
            r70 = r28
            r72 = r28
            r74 = r28
            r76 = r28
            r78 = r28
            r80 = r28
            r84 = r28
            r86 = r28
            r88 = r28
            r90 = r28
            r92 = r28
            r94 = r28
            r96 = r28
            r98 = r28
            r25 = r0
            r30 = r28
            r82 = r2
            X.Cqo r0 = X.C26030Cqo.A00(r25, r26, r27, r28, r30, r32, r34, r36, r38, r40, r42, r44, r46, r48, r50, r52, r54, r56, r58, r60, r62, r64, r66, r68, r70, r72, r74, r76, r78, r80, r82, r84, r86, r88, r90, r92, r94, r96, r98)     // Catch:{ all -> 0x0e78 }
            goto L_0x02b0
        L_0x03da:
            long r1 = r0.A0Q     // Catch:{ all -> 0x0e78 }
            long r1 = r1 + r16
            r25 = 0
            r23 = -1
            r24 = 14
            r29 = r25
            r31 = r25
            r33 = r25
            r35 = r25
            r37 = r25
            r39 = r25
            r41 = r25
            r43 = r25
            r45 = r25
            r47 = r25
            r49 = r25
            r51 = r25
            r53 = r25
            r55 = r25
            r57 = r25
            r59 = r25
            r61 = r25
            r63 = r25
            r65 = r25
            r67 = r25
            r69 = r25
            r71 = r25
            r73 = r25
            r75 = r25
            r77 = r25
            r79 = r25
            r81 = r25
            r83 = r25
            r85 = r25
            r87 = r25
            r91 = r25
            r93 = r25
            r95 = r25
            r27 = r25
            r89 = r1
            r22 = r0
            X.Cqo r0 = X.C26030Cqo.A00(r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95)     // Catch:{ all -> 0x0e78 }
            goto L_0x068b
        L_0x0432:
            long r1 = r0.A06     // Catch:{ all -> 0x0e78 }
            long r1 = r1 + r16
            r24 = 15
            r25 = 0
            r23 = -1048577(0xffffffffffefffff, float:NaN)
            r29 = r25
            r31 = r25
            r33 = r25
            r35 = r25
            r37 = r25
            r39 = r25
            r41 = r25
            r43 = r25
            r45 = r25
            r47 = r25
            r49 = r25
            r51 = r25
            r53 = r25
            r55 = r25
            r57 = r25
            r59 = r25
            r61 = r25
            r63 = r25
            r67 = r25
            r69 = r25
            r71 = r25
            r73 = r25
            r75 = r25
            r77 = r25
            r79 = r25
            r81 = r25
            r83 = r25
            r85 = r25
            r87 = r25
            r89 = r25
            r91 = r25
            r93 = r25
            r95 = r25
            r27 = r25
            r65 = r1
            r22 = r0
            X.Cqo r0 = X.C26030Cqo.A00(r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95)     // Catch:{ all -> 0x0e78 }
            goto L_0x068b
        L_0x048b:
            long r7 = r0.A09     // Catch:{ all -> 0x0e78 }
            if (r23 == 0) goto L_0x0491
            long r7 = r7 + r16
        L_0x0491:
            r1 = 111(0x6f, float:1.56E-43)
            long r5 = r0.A03     // Catch:{ all -> 0x0e78 }
            if (r13 != r1) goto L_0x0499
            long r5 = r5 + r16
        L_0x0499:
            long r3 = r0.A04     // Catch:{ all -> 0x0e78 }
            r1 = 1
            if (r13 != r1) goto L_0x04a0
            long r3 = r3 + r16
        L_0x04a0:
            long r1 = r0.A02     // Catch:{ all -> 0x0e78 }
            long r1 = r1 + r16
            r24 = 15
            r25 = 0
            r23 = -237569(0xfffffffffffc5fff, float:NaN)
            r29 = r25
            r31 = r25
            r33 = r25
            r35 = r25
            r37 = r25
            r39 = r25
            r41 = r25
            r43 = r25
            r45 = r25
            r47 = r25
            r49 = r25
            r53 = r25
            r61 = r25
            r63 = r25
            r65 = r25
            r67 = r25
            r69 = r25
            r71 = r25
            r73 = r25
            r75 = r25
            r77 = r25
            r79 = r25
            r81 = r25
            r83 = r25
            r85 = r25
            r87 = r25
            r89 = r25
            r91 = r25
            r93 = r25
            r95 = r25
            r27 = r25
            r51 = r1
            r55 = r5
            r57 = r3
            r59 = r7
            r22 = r0
            X.Cqo r0 = X.C26030Cqo.A00(r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95)     // Catch:{ all -> 0x0e78 }
            goto L_0x068b
        L_0x04f9:
            long r1 = r0.A00     // Catch:{ all -> 0x0e78 }
            long r1 = r1 + r16
            r24 = 15
            r25 = 0
            r23 = -524289(0xfffffffffff7ffff, float:NaN)
            r29 = r25
            r31 = r25
            r33 = r25
            r35 = r25
            r37 = r25
            r39 = r25
            r41 = r25
            r43 = r25
            r45 = r25
            r47 = r25
            r49 = r25
            r51 = r25
            r53 = r25
            r55 = r25
            r57 = r25
            r59 = r25
            r61 = r25
            r65 = r25
            r67 = r25
            r69 = r25
            r71 = r25
            r73 = r25
            r75 = r25
            r77 = r25
            r79 = r25
            r81 = r25
            r83 = r25
            r85 = r25
            r87 = r25
            r89 = r25
            r91 = r25
            r93 = r25
            r95 = r25
            r27 = r25
            r63 = r1
            r22 = r0
            X.Cqo r0 = X.C26030Cqo.A00(r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95)     // Catch:{ all -> 0x0e78 }
            goto L_0x068b
        L_0x0552:
            long r9 = r0.A0Z     // Catch:{ all -> 0x0e78 }
            if (r14 == 0) goto L_0x0558
            long r9 = r9 + r16
        L_0x0558:
            r1 = 111(0x6f, float:1.56E-43)
            long r7 = r0.A0V     // Catch:{ all -> 0x0e78 }
            if (r13 != r1) goto L_0x0560
            long r7 = r7 + r16
        L_0x0560:
            long r5 = r0.A0W     // Catch:{ all -> 0x0e78 }
            r1 = 1
            if (r13 != r1) goto L_0x0567
            long r5 = r5 + r16
        L_0x0567:
            long r3 = r0.A0X     // Catch:{ all -> 0x0e78 }
            if (r19 == 0) goto L_0x056d
            long r3 = r3 + r16
        L_0x056d:
            long r1 = r0.A0U     // Catch:{ all -> 0x0e78 }
            long r1 = r1 + r16
            r24 = 15
            r25 = 0
            r23 = -3969(0xfffffffffffff07f, float:NaN)
            r29 = r25
            r31 = r25
            r33 = r25
            r35 = r25
            r37 = r25
            r49 = r25
            r51 = r25
            r53 = r25
            r55 = r25
            r57 = r25
            r59 = r25
            r61 = r25
            r63 = r25
            r65 = r25
            r67 = r25
            r69 = r25
            r71 = r25
            r73 = r25
            r75 = r25
            r77 = r25
            r79 = r25
            r81 = r25
            r83 = r25
            r85 = r25
            r87 = r25
            r89 = r25
            r91 = r25
            r93 = r25
            r95 = r25
            r27 = r25
            r39 = r1
            r41 = r7
            r43 = r5
            r45 = r3
            r47 = r9
            r22 = r0
            X.Cqo r0 = X.C26030Cqo.A00(r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95)     // Catch:{ all -> 0x0e78 }
            goto L_0x068b
        L_0x05c5:
            long r9 = r0.A0N     // Catch:{ all -> 0x0e78 }
            if (r14 == 0) goto L_0x05cb
            long r9 = r9 + r16
        L_0x05cb:
            long r7 = r0.A0L     // Catch:{ all -> 0x0e78 }
            if (r22 == 0) goto L_0x05d1
            long r7 = r7 + r16
        L_0x05d1:
            long r5 = r0.A0K     // Catch:{ all -> 0x0e78 }
            if (r24 == 0) goto L_0x05d7
            long r5 = r5 + r16
        L_0x05d7:
            long r3 = r0.A0O     // Catch:{ all -> 0x0e78 }
            r1 = 1
            if (r13 != r1) goto L_0x05de
            long r3 = r3 + r16
        L_0x05de:
            long r1 = r0.A0J     // Catch:{ all -> 0x0e78 }
            long r1 = r1 + r16
            r24 = 15
            r25 = 0
            r23 = -63
            r39 = r25
            r41 = r25
            r43 = r25
            r45 = r25
            r47 = r25
            r49 = r25
            r51 = r25
            r53 = r25
            r55 = r25
            r57 = r25
            r59 = r25
            r61 = r25
            r63 = r25
            r65 = r25
            r67 = r25
            r69 = r25
            r71 = r25
            r73 = r25
            r75 = r25
            r77 = r25
            r79 = r25
            r81 = r25
            r83 = r25
            r85 = r25
            r87 = r25
            r89 = r25
            r91 = r25
            r93 = r25
            r95 = r25
            r22 = r0
            r27 = r1
            r29 = r7
            r31 = r5
            r33 = r3
            r35 = r9
            r37 = r25
            X.Cqo r0 = X.C26030Cqo.A00(r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95)     // Catch:{ all -> 0x0e78 }
            goto L_0x068b
        L_0x0635:
            long r1 = r0.A0P     // Catch:{ all -> 0x0e78 }
            long r1 = r1 + r16
            r24 = 11
            r25 = 0
            r23 = -1
            r29 = r25
            r31 = r25
            r33 = r25
            r35 = r25
            r37 = r25
            r39 = r25
            r41 = r25
            r43 = r25
            r45 = r25
            r47 = r25
            r49 = r25
            r51 = r25
            r53 = r25
            r55 = r25
            r57 = r25
            r59 = r25
            r61 = r25
            r63 = r25
            r65 = r25
            r67 = r25
            r69 = r25
            r71 = r25
            r73 = r25
            r75 = r25
            r77 = r25
            r79 = r25
            r81 = r25
            r83 = r25
            r85 = r25
            r87 = r25
            r89 = r25
            r91 = r25
            r95 = r25
            r27 = r25
            r93 = r1
            r22 = r0
            X.Cqo r0 = X.C26030Cqo.A00(r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95)     // Catch:{ all -> 0x0e78 }
        L_0x068b:
            java.lang.Object r1 = r18.get()     // Catch:{ all -> 0x0e78 }
            X.Cmh r1 = (X.C25830Cmh) r1     // Catch:{ all -> 0x0e78 }
            r1.A03(r0)     // Catch:{ all -> 0x0e78 }
            goto L_0x070e
        L_0x0695:
            if (r20 != 0) goto L_0x070e
            if (r16 != 0) goto L_0x070e
            X.00H r0 = r15.A03     // Catch:{ all -> 0x0e78 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0e78 }
            X.6m1 r0 = (X.C132006m1) r0     // Catch:{ all -> 0x0e78 }
            X.00H r1 = r0.A01     // Catch:{ all -> 0x0e78 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0e78 }
            X.Cmh r0 = (X.C25830Cmh) r0     // Catch:{ all -> 0x0e78 }
            X.Cqo r5 = r0.A01()     // Catch:{ all -> 0x0e78 }
            java.lang.Object r4 = r1.get()     // Catch:{ all -> 0x0e78 }
            X.Cmh r4 = (X.C25830Cmh) r4     // Catch:{ all -> 0x0e78 }
            long r0 = r5.A0E     // Catch:{ all -> 0x0e78 }
            r2 = 1
            long r0 = r0 + r2
            r24 = 15
            r25 = 0
            r23 = 2147483647(0x7fffffff, float:NaN)
            r29 = r25
            r31 = r25
            r33 = r25
            r35 = r25
            r37 = r25
            r39 = r25
            r41 = r25
            r43 = r25
            r45 = r25
            r47 = r25
            r49 = r25
            r51 = r25
            r53 = r25
            r55 = r25
            r57 = r25
            r59 = r25
            r61 = r25
            r63 = r25
            r65 = r25
            r67 = r25
            r69 = r25
            r71 = r25
            r73 = r25
            r75 = r25
            r77 = r25
            r79 = r25
            r81 = r25
            r83 = r25
            r85 = r25
            r89 = r25
            r91 = r25
            r93 = r25
            r95 = r25
            r27 = r25
            r87 = r0
            r22 = r5
            X.Cqo r0 = X.C26030Cqo.A00(r22, r23, r24, r25, r27, r29, r31, r33, r35, r37, r39, r41, r43, r45, r47, r49, r51, r53, r55, r57, r59, r61, r63, r65, r67, r69, r71, r73, r75, r77, r79, r81, r83, r85, r87, r89, r91, r93, r95)     // Catch:{ all -> 0x0e78 }
            r4.A03(r0)     // Catch:{ all -> 0x0e78 }
        L_0x070e:
            monitor-exit(r15)
            X.1h6 r3 = r12.A0V
            java.io.File r6 = r21.A03()
            r0 = r101
            X.73o r0 = r0.A0H
            if (r0 != 0) goto L_0x0730
            r0 = -1
        L_0x071c:
            int r1 = X.C1409973w.A00(r0)
            X.1So r7 = r11.A0A
            boolean r0 = X.C63972u0.A07(r7)
            if (r0 == 0) goto L_0x0014
            r0 = 1
            if (r1 == r0) goto L_0x0e12
            r0 = 15
            if (r1 == r0) goto L_0x0e12
            return
        L_0x0730:
            int r0 = r0.A01
            goto L_0x071c
        L_0x0733:
            java.lang.Object r3 = r6.A01
            X.6q4 r3 = (X.C134116q4) r3
            java.lang.Object r6 = r6.A02
            X.206 r6 = (X.AnonymousClass206) r6
            boolean r0 = r6 instanceof X.AnonymousClass210
            if (r0 == 0) goto L_0x07b5
            X.36w r0 = X.C60502o8.A00(r6)
            if (r0 == 0) goto L_0x07b5
        L_0x0745:
            boolean r0 = X.C22971Dz.A0g(r6)
            r4 = 0
            if (r0 == 0) goto L_0x0764
            boolean r0 = r6 instanceof X.C438421d
            if (r0 == 0) goto L_0x0764
            r1 = r6
            X.21V r1 = (X.AnonymousClass21V) r1
            X.36v r0 = r1.A17()
            if (r0 == 0) goto L_0x0764
            X.36v r0 = r1.A17()
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0764
            r4 = 1
        L_0x0764:
            X.0ve r2 = r3.A00
            r1 = 8123(0x1fbb, float:1.1383E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.protocol.message.FMessageMedia"
            if (r4 == 0) goto L_0x079a
            if (r0 == 0) goto L_0x079a
        L_0x0774:
            X.C18070vi.A0z(r6, r1)
            X.21V r6 = (X.AnonymousClass21V) r6
            X.1hB r4 = r3.A01
            X.1Lc r1 = r3.A02
            X.00H r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            boolean r0 = r0.A0O()
            boolean r0 = r1.A0A(r0)
            r7 = 3
            if (r0 == 0) goto L_0x0791
            r7 = 4
        L_0x0791:
            r10 = 1
            r11 = 0
            r5 = 0
            r8 = 0
            r4.A0E(r5, r6, r7, r8, r10, r11)
            return
        L_0x079a:
            X.36w r0 = X.C60502o8.A00(r6)
            if (r0 == 0) goto L_0x07ad
            X.00H r0 = r3.A06
            java.lang.Object r1 = r0.get()
            X.1hY r1 = (X.C32661hY) r1
            r0 = 0
            r1.A01(r6, r0)
            return
        L_0x07ad:
            if (r4 != 0) goto L_0x0774
            java.lang.String r0 = "StatusThumbnailDownloadManager/downloadThumbnail Not able to download thumbnail"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x07b5:
            X.1Lc r1 = r3.A02
            X.00H r0 = r3.A04
            java.lang.Object r0 = r0.get()
            X.1CJ r0 = (X.AnonymousClass1CJ) r0
            boolean r0 = r0.A0O()
            boolean r0 = r1.A0A(r0)
            if (r0 == 0) goto L_0x07d8
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x07d8
            r0 = r6
            X.21V r0 = (X.AnonymousClass21V) r0
            boolean r0 = r3.A01(r0)
        L_0x07d4:
            if (r0 == 0) goto L_0x0014
            goto L_0x0745
        L_0x07d8:
            X.0vl r0 = r3.A0A
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 == 0) goto L_0x0014
            boolean r0 = r6.A16()
            if (r0 == 0) goto L_0x0745
            X.0ve r2 = r3.A00
            r1 = 8122(0x1fba, float:1.1381E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            goto L_0x07d4
        L_0x07f1:
            java.lang.Object r4 = r6.A01
            X.4RG r4 = (X.AnonymousClass4RG) r4
            java.lang.Object r5 = r6.A02
            X.6eG r5 = (X.C127386eG) r5
            r6 = 1
            X.C18070vi.A0d(r5, r6)
            java.util.HashSet r10 = r5.A00
            X.1hB r3 = r4.A01
            java.util.HashSet r7 = X.C17880vN.A12()
            X.1hC r8 = r3.A0C
            monitor-enter(r8)
            java.util.ArrayList r0 = r3.A0B()     // Catch:{ all -> 0x0e7e }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0e7e }
        L_0x0810:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0e7e }
            if (r0 == 0) goto L_0x0824
            X.21V r1 = X.C17880vN.A0b(r2)     // Catch:{ all -> 0x0e7e }
            boolean r0 = r1.A0w()     // Catch:{ all -> 0x0e7e }
            if (r0 == 0) goto L_0x0810
            r7.add(r1)     // Catch:{ all -> 0x0e7e }
            goto L_0x0810
        L_0x0824:
            monitor-exit(r8)     // Catch:{ all -> 0x0e7e }
            java.util.ArrayList r12 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r7.iterator()
        L_0x082d:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0850
            java.lang.Object r11 = r13.next()
            r1 = r11
            X.21V r1 = (X.AnonymousClass21V) r1
            boolean r0 = r10.contains(r1)
            if (r0 != 0) goto L_0x082d
            X.2rc r0 = r1.A02
            if (r0 == 0) goto L_0x084c
            long r1 = r0.A0C
            r8 = 70
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x082d
        L_0x084c:
            r12.add(r11)
            goto L_0x082d
        L_0x0850:
            java.util.Iterator r2 = r12.iterator()
        L_0x0854:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0863
            X.21V r1 = X.C17880vN.A0b(r2)
            r0 = 0
            X.C32431hB.A06(r3, r1, r0, r0, r0)
            goto L_0x0854
        L_0x0863:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r10.iterator()
        L_0x086b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x087d
            java.lang.Object r1 = r2.next()
            boolean r0 = r7.contains(r1)
            X.AnonymousClass3MZ.A1V(r1, r3, r0)
            goto L_0x086b
        L_0x087d:
            java.util.Iterator r2 = r3.iterator()
        L_0x0881:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0891
            X.21V r1 = X.C17880vN.A0b(r2)
            X.1j3 r0 = r4.A00
            r0.A05(r1)
            goto L_0x0881
        L_0x0891:
            java.util.HashSet r8 = r5.A01
            X.1hY r5 = r4.A02
            java.util.HashSet r7 = X.C17880vN.A12()
            X.00H r4 = r5.A0E
            java.lang.Object r2 = r4.get()
            X.1Sf r2 = (X.C26461Sf) r2
            r1 = 18
            X.7Nc r0 = new X.7Nc
            r0.<init>(r7, r1)
            r2.A06(r0)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r7.iterator()
        L_0x08b3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08c5
            java.lang.Object r1 = r2.next()
            boolean r0 = r8.contains(r1)
            X.AnonymousClass3MZ.A1V(r1, r3, r0)
            goto L_0x08b3
        L_0x08c5:
            java.util.Iterator r2 = r3.iterator()
        L_0x08c9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08e7
            X.206 r1 = X.C17880vN.A0Y(r2)
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            boolean r0 = r1.A0w()
            if (r0 == 0) goto L_0x08c9
            java.lang.Object r0 = r4.get()
            X.1Sf r0 = (X.C26461Sf) r0
            r0.A08(r1)
            goto L_0x08c9
        L_0x08e7:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r8.iterator()
        L_0x08ef:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0910
            java.lang.Object r2 = r3.next()
            r1 = r2
            X.206 r1 = (X.AnonymousClass206) r1
            boolean r0 = r7.contains(r1)
            if (r0 != 0) goto L_0x08ef
            X.36w r0 = X.C60502o8.A00(r1)
            if (r0 == 0) goto L_0x08ef
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x08ef
            r4.add(r2)
            goto L_0x08ef
        L_0x0910:
            java.util.Iterator r1 = r4.iterator()
        L_0x0914:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0014
            X.206 r0 = X.C17880vN.A0Y(r1)
            r5.A01(r0, r6)
            goto L_0x0914
        L_0x0922:
            java.lang.Object r0 = r6.A01
            X.6iG r0 = (X.C129726iG) r0
            java.lang.Object r2 = r6.A02
            X.206 r2 = (X.AnonymousClass206) r2
            r5 = 0
            r8 = 1
            X.1iV r11 = r0.A03
            X.6eH r4 = r0.A02
            X.6c3 r0 = r4.A01
            java.util.List r3 = r0.A00
            java.util.Iterator r1 = r3.iterator()
        L_0x0938:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0942
            r1.next()
            goto L_0x0938
        L_0x0942:
            boolean r0 = r2 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0965
            r0 = r2
            X.21V r0 = (X.AnonymousClass21V) r0
            if (r0 == 0) goto L_0x0965
            int r7 = r0.A0D
        L_0x094d:
            java.util.Iterator r3 = r3.iterator()
            r6 = 0
        L_0x0952:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0967
            java.lang.Object r0 = r3.next()
            X.6r4 r0 = (X.C134736r4) r0
            int r1 = r0.A00
            int r0 = r0.A01
            int r1 = r1 - r0
            int r6 = r6 + r1
            goto L_0x0952
        L_0x0965:
            r7 = 0
            goto L_0x094d
        L_0x0967:
            int r4 = r4.A00
            boolean r0 = X.C33241iV.A03(r2)
            if (r0 == 0) goto L_0x0014
            r1 = 0
            r22 = 4
            java.lang.Integer r12 = X.C62852s6.A01(r2)
            int r24 = X.C62852s6.A00(r2)
            org.json.JSONObject r3 = X.C17880vN.A15()
            boolean r9 = r2 instanceof X.AnonymousClass21K
            if (r9 == 0) goto L_0x0aab
            r0 = r2
            X.21K r0 = (X.AnonymousClass21K) r0
            if (r0 == 0) goto L_0x0aab
            X.AEt r0 = r0.BPK()
            if (r0 == 0) goto L_0x0aab
            X.AEk r0 = r0.A06
            if (r0 == 0) goto L_0x0aab
        L_0x0991:
            java.util.List r10 = r0.A03
        L_0x0993:
            java.lang.String r9 = "num_buttons"
            int r0 = r10.size()
            r3.put(r9, r0)
            int r0 = r10.size()
            if (r0 <= 0) goto L_0x09bf
            java.lang.Object r9 = r10.get(r5)
            boolean r0 = r9 instanceof X.C20253ADl
            if (r0 == 0) goto L_0x09b2
            X.ADl r9 = (X.C20253ADl) r9
            if (r9 == 0) goto L_0x09b2
            X.AEe r0 = r9.A01
            java.lang.String r1 = r0.A02
        L_0x09b2:
            java.lang.String r0 = "review_and_pay_v2"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x09bf
            java.lang.String r0 = "has_payments_cta"
            r3.put(r0, r8)
        L_0x09bf:
            java.lang.Integer r0 = X.C20120A8f.A02(r2)
            if (r0 == 0) goto L_0x09ce
            int r1 = r0.intValue()
            java.lang.String r0 = "card_index"
            r3.put(r0, r1)
        L_0x09ce:
            boolean r0 = X.C20120A8f.A08(r2)
            if (r0 == 0) goto L_0x09ea
            java.lang.String r1 = "feature_type"
            java.lang.String r0 = "offer"
            r3.put(r1, r0)
            java.lang.Long r0 = X.C20120A8f.A03(r2)
            if (r0 == 0) goto L_0x09ea
            long r0 = r0.longValue()
            java.lang.String r8 = "expiration_time"
            r3.put(r8, r0)
        L_0x09ea:
            X.206 r1 = X.C20120A8f.A00(r2)
            boolean r0 = r1 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x0a0b
            X.21K r1 = (X.AnonymousClass21K) r1
            if (r1 == 0) goto L_0x0a0b
            X.AEt r0 = r1.BPK()
            if (r0 == 0) goto L_0x0a0b
            X.ADa r0 = r0.A04
            if (r0 == 0) goto L_0x0a0b
            java.util.List r0 = r0.A00
            int r1 = r0.size()
            java.lang.String r0 = "num_cards"
            r3.put(r0, r1)
        L_0x0a0b:
            java.lang.String r0 = "media_length"
            r3.put(r0, r7)
            java.lang.String r0 = "media_unique_playtime"
            r3.put(r0, r6)
            java.lang.String r0 = "media_last_play_pos"
            r3.put(r0, r4)
            java.lang.String r17 = X.C18070vi.A0H(r3)
            java.lang.String r18 = X.C20120A8f.A04(r2)
            X.0ve r4 = r11.A00
            r0 = 6748(0x1a5c, float:9.456E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            r13 = 0
            if (r0 == 0) goto L_0x0a3d
            X.206 r0 = X.C20120A8f.A00(r2)
            X.1ya r0 = r0.A0O
            if (r0 == 0) goto L_0x0a3d
            int r0 = r0.hostStorage
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
        L_0x0a3d:
            java.lang.String r19 = X.C62852s6.A02(r4, r2)
            r0 = 6816(0x1aa0, float:9.551E-42)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0aa9
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.206 r0 = X.C20120A8f.A00(r2)
            long r0 = r0.A0G
            long r0 = r6.toSeconds(r0)
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
        L_0x0a59:
            r0 = 9048(0x2358, float:1.2679E-41)
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0aa7
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.206 r0 = X.C20120A8f.A00(r2)
            long r0 = r0.A0I
            long r0 = r6.toSeconds(r0)
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
        L_0x0a71:
            r0 = 6837(0x1ab5, float:9.58E-42)
            boolean r1 = X.C18020vd.A05(r3, r4, r0)
            if (r1 == 0) goto L_0x0aa4
            X.206 r1 = X.C20120A8f.A00(r2)
            X.205 r1 = r1.A0v
            int r1 = r1.hashCode()
            java.lang.Long r16 = X.C17880vN.A0n(r1)
        L_0x0a87:
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0aa1
            X.206 r0 = X.C20120A8f.A00(r2)
            X.205 r0 = r0.A0v
            java.lang.String r0 = r0.A01
            java.lang.String r20 = X.C17970vW.A04(r0)
        L_0x0a99:
            r23 = r5
            r21 = r5
            X.C33241iV.A02(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        L_0x0aa1:
            r20 = 0
            goto L_0x0a99
        L_0x0aa4:
            r16 = 0
            goto L_0x0a87
        L_0x0aa7:
            r15 = 0
            goto L_0x0a71
        L_0x0aa9:
            r14 = 0
            goto L_0x0a59
        L_0x0aab:
            boolean r0 = r2 instanceof X.C439421n
            if (r0 == 0) goto L_0x0abe
            r0 = r2
            X.21n r0 = (X.C439421n) r0
            if (r0 == 0) goto L_0x0abe
            X.2k6 r0 = r0.BaE()
            if (r0 == 0) goto L_0x0abe
            java.util.List r10 = r0.A06
            if (r10 != 0) goto L_0x0993
        L_0x0abe:
            if (r9 == 0) goto L_0x09bf
            r0 = r2
            X.21K r0 = (X.AnonymousClass21K) r0
            if (r0 == 0) goto L_0x09bf
            X.AEt r0 = r0.BPK()
            if (r0 == 0) goto L_0x09bf
            X.ADa r0 = r0.A04
            if (r0 == 0) goto L_0x09bf
            java.util.List r0 = r0.A00
            java.lang.Object r0 = r0.get(r5)
            X.AEt r0 = (X.C20285AEt) r0
            if (r0 == 0) goto L_0x09bf
            X.AEk r0 = r0.A06
            if (r0 == 0) goto L_0x09bf
            goto L_0x0991
        L_0x0adf:
            java.lang.Object r7 = r6.A01
            X.7Ka r7 = (X.C145127Ka) r7
            java.lang.Object r1 = r6.A02
            X.205 r1 = (X.AnonymousClass205) r1
            X.00H r0 = r7.A08
            X.206 r6 = X.AnonymousClass1W2.A01(r1, r0)
            boolean r0 = r6 instanceof X.AnonymousClass21V
            if (r0 == 0) goto L_0x0014
            java.lang.String r5 = X.C145127Ka.A00(r7, r6)
            if (r5 == 0) goto L_0x0014
            java.lang.Long r0 = r6.A0V
            if (r0 == 0) goto L_0x0b05
            long r3 = r0.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0b0d
        L_0x0b05:
            r0 = 1
            boolean r0 = r6.A11(r0)
            if (r0 == 0) goto L_0x0014
        L_0x0b0d:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            X.205 r0 = r6.A0v
            X.1BI r0 = r0.A00
            X.C145127Ka.A01(r0, r7, r1, r5)
            return
        L_0x0b17:
            java.lang.Object r2 = r6.A01
            com.whatsapp.mediacomposer.MediaComposerActivity r2 = (com.whatsapp.mediacomposer.MediaComposerActivity) r2
            java.lang.Object r1 = r6.A02
            android.view.Window r1 = (android.view.Window) r1
            X.1DS r0 = r2.A07
            java.lang.Object r0 = r0.A06()
            if (r0 != 0) goto L_0x0014
            r0 = 1
            r2.A1P = r0
            r0 = 0
            r1.setSharedElementEnterTransition(r0)
            android.view.View r1 = r2.A04
            r0 = 8
            r1.setVisibility(r0)
            r2.A2Z()
            return
        L_0x0b39:
            java.lang.Object r0 = r6.A01
            X.1Uv r0 = (X.C27131Uv) r0
            java.lang.Object r3 = r6.A02
            X.2nE r3 = (X.C60002nE) r3
            X.1P3 r2 = r0.A0G
            X.8v1 r0 = X.C173408v1.A00
            java.lang.String r1 = r0.getRawString()
            X.2nC r0 = new X.2nC
            r0.<init>(r3, r1)
            r2.A0W(r0)
            return
        L_0x0b52:
            java.lang.Object r0 = r6.A01
            X.1T6 r0 = (X.AnonymousClass1T6) r0
            java.lang.Object r1 = r6.A02
            X.2h4 r1 = (X.C56202h4) r1
            X.1SS r0 = r0.A05
            r0.A05(r1)
            return
        L_0x0b60:
            java.lang.Object r2 = r6.A01
            X.1T6 r2 = (X.AnonymousClass1T6) r2
            java.lang.Object r1 = r6.A02
            X.34B r1 = (X.AnonymousClass34B) r1
            X.9bC r0 = r1.A03
            X.AnonymousClass1T6.A06(r2, r1, r0)
            return
        L_0x0b6e:
            java.lang.Object r1 = r6.A01
            X.1T6 r1 = (X.AnonymousClass1T6) r1
            java.lang.Object r0 = r6.A02
            X.34B r0 = (X.AnonymousClass34B) r0
            r1.A0H(r0)
            return
        L_0x0b7a:
            java.lang.Object r1 = r6.A01
            X.1hs r1 = (X.C32861hs) r1
            java.lang.Object r0 = r6.A02
            X.2tS r0 = (X.C63642tS) r0
            X.1Lg r2 = r1.A04
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.A03
            java.util.List r1 = X.C29431cG.A0t(r0)
            r0 = 12
            goto L_0x0c46
        L_0x0b8e:
            java.lang.Object r2 = r6.A01
            X.1hs r2 = (X.C32861hs) r2
            java.lang.Object r3 = r6.A02
            X.206 r3 = (X.AnonymousClass206) r3
            X.121 r0 = r2.A03
            r0.CQw(r3)
            r4 = 0
            r5 = 6
            r7 = 1
            X.10I r0 = r2.A0M
            X.3Cs r1 = new X.3Cs
            r6 = r5
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (java.lang.Object) r4, (int) r5, (int) r6, (boolean) r7)
            r0.CGF(r1)
            return
        L_0x0baa:
            java.lang.Object r0 = r6.A01
            X.1hs r0 = (X.C32861hs) r0
            java.lang.Object r1 = r6.A02
            X.2tS r1 = (X.C63642tS) r1
            X.1Lg r2 = r0.A04
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A03
            r0 = -1
            goto L_0x0c46
        L_0x0bbd:
            java.lang.Object r5 = r6.A01
            X.1hs r5 = (X.C32861hs) r5
            java.lang.Object r0 = r6.A02
            X.2tS r0 = (X.C63642tS) r0
            X.1ho r4 = r5.A0A
            java.util.concurrent.CopyOnWriteArrayList r3 = r0.A03
            java.util.Iterator r7 = X.C29431cG.A0o(r3)
        L_0x0bcd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0c0a
            X.21V r6 = X.C17880vN.A0b(r7)
            X.0ve r2 = r4.A01
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r1 = 11380(0x2c74, float:1.5947E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0bf6
            X.2rc r2 = X.AnonymousClass206.A00(r6)
            r0 = 1
            r6.A0a(r0)
            r2.A0f = r0
            r0 = 0
            r2.A0C = r0
            goto L_0x0bcd
        L_0x0bf6:
            monitor-enter(r6)
            X.2rc r2 = X.AnonymousClass206.A00(r6)     // Catch:{ all -> 0x0c07 }
            r0 = 1
            r6.A0a(r0)     // Catch:{ all -> 0x0c07 }
            r2.A0f = r0     // Catch:{ all -> 0x0c07 }
            r0 = 0
            r2.A0C = r0     // Catch:{ all -> 0x0c07 }
            monitor-exit(r6)     // Catch:{ all -> 0x0c07 }
            goto L_0x0bcd
        L_0x0c07:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0c07 }
            throw r0
        L_0x0c0a:
            X.1Lg r1 = r5.A04
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = -1
            r1.A04(r3, r0)
            return
        L_0x0c15:
            java.lang.Object r0 = r6.A01
            X.1hs r0 = (X.C32861hs) r0
            java.lang.Object r2 = r6.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A04
            r0 = -1
            goto L_0x0d9f
        L_0x0c22:
            java.lang.Object r0 = r6.A01
            X.1hs r0 = (X.C32861hs) r0
            java.lang.Object r1 = r6.A02
            X.2tS r1 = (X.C63642tS) r1
            X.1hq r0 = r0.A0G
            r0.A00(r1)
            return
        L_0x0c30:
            java.lang.Object r0 = r6.A01
            X.3Aa r0 = (X.C70173Aa) r0
            java.lang.Object r1 = r6.A02
            X.2tS r1 = (X.C63642tS) r1
            java.lang.Object r0 = r0.A03
            X.1hs r0 = (X.C32861hs) r0
            X.1Lg r2 = r0.A04
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.A03
            r0 = 8
        L_0x0c46:
            r2.A04(r1, r0)
            return
        L_0x0c4a:
            java.lang.Object r7 = r6.A01
            X.1SS r7 = (X.AnonymousClass1SS) r7
            java.lang.Object r6 = r6.A02
            X.2h4 r6 = (X.C56202h4) r6
            monitor-enter(r7)
            X.C17960vV.A00()     // Catch:{ all -> 0x0ca3 }
            X.00z r2 = r7.A00     // Catch:{ all -> 0x0ca3 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ca3 }
            java.lang.String r0 = r6.A0D     // Catch:{ all -> 0x0ca3 }
            r1.append(r0)     // Catch:{ all -> 0x0ca3 }
            int r0 = r6.A0B     // Catch:{ all -> 0x0ca3 }
            java.lang.String r0 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x0ca3 }
            r2.A08(r0, r6)     // Catch:{ all -> 0x0ca3 }
            X.11P r5 = r7.A01     // Catch:{ all -> 0x0ca3 }
            X.AnonymousClass11P.A01(r5)     // Catch:{ all -> 0x0ca3 }
            X.1RM r0 = r7.A02     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c9c, Error | RuntimeException -> 0x0c97 }
            X.1au r4 = r0.A06()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c9c, Error | RuntimeException -> 0x0c97 }
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0c8d }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0c8d }
            java.lang.String r2 = "media_job"
            android.content.ContentValues r1 = X.AnonymousClass1SS.A00(r6, r7)     // Catch:{ all -> 0x0c8d }
            java.lang.String r0 = "MediaJobDataStore/insert"
            r3.A05(r2, r0, r1)     // Catch:{ all -> 0x0c8d }
            X.AnonymousClass11P.A01(r5)     // Catch:{ all -> 0x0c8d }
            r4.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c9c, Error | RuntimeException -> 0x0c97 }
            monitor-exit(r7)
            return
        L_0x0c8d:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0c92 }
            goto L_0x0c96
        L_0x0c92:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c9c, Error | RuntimeException -> 0x0c97 }
        L_0x0c96:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0c9c, Error | RuntimeException -> 0x0c97 }
        L_0x0c97:
            r1 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r1)     // Catch:{ all -> 0x0ca3 }
            goto L_0x0ca2
        L_0x0c9c:
            r1 = move-exception
            java.lang.String r0 = "MediaJobDataStore/insert"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0ca3 }
        L_0x0ca2:
            throw r1     // Catch:{ all -> 0x0ca3 }
        L_0x0ca3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0ca6:
            java.lang.Object r0 = r6.A01
            X.6xT r0 = (X.C138656xT) r0
            java.lang.Object r2 = r6.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A02
            goto L_0x0d57
        L_0x0cb2:
            java.lang.Object r3 = r6.A01
            X.5ti r3 = (X.C115295ti) r3
            java.lang.Object r2 = r6.A02
            X.73o r2 = (X.C1409173o) r2
            r1 = 30
            goto L_0x0cd3
        L_0x0cbd:
            java.lang.Object r1 = r6.A01
            X.5ti r1 = (X.C115295ti) r1
            java.lang.Object r0 = r6.A02
            X.73o r0 = (X.C1409173o) r0
            r1.A0H(r0)
            return
        L_0x0cc9:
            java.lang.Object r3 = r6.A01
            X.5ti r3 = (X.C115295ti) r3
            java.lang.Object r2 = r6.A02
            X.73o r2 = (X.C1409173o) r2
            r1 = 31
        L_0x0cd3:
            X.7Qr r0 = new X.7Qr
            r0.<init>(r3, r2, r1)
            X.C115295ti.A04(r2, r3, r0)
            return
        L_0x0cdc:
            java.lang.Object r0 = r6.A01
            X.5ti r0 = (X.C115295ti) r0
            java.lang.Object r3 = r6.A02
            X.9nA r3 = (X.C191779nA) r3
            X.70W r2 = r0.A0k
            X.1Kb r1 = r0.A0S
            r0 = 1
            int r0 = r1.A01(r3, r0)
            r2.A02 = r0
            return
        L_0x0cf0:
            java.lang.Object r4 = r6.A01
            X.5ti r4 = (X.C115295ti) r4
            java.lang.Object r3 = r6.A02
            X.1KB r2 = r4.A0C
            r1 = 32
            goto L_0x0d05
        L_0x0cfb:
            java.lang.Object r4 = r6.A01
            X.5ti r4 = (X.C115295ti) r4
            java.lang.Object r3 = r6.A02
            X.1KB r2 = r4.A0C
            r1 = 27
        L_0x0d05:
            X.7Qr r0 = new X.7Qr
            r0.<init>(r4, r3, r1)
            r2.A0J(r0)
            return
        L_0x0d0e:
            java.lang.Object r1 = r6.A01
            X.5ti r1 = (X.C115295ti) r1
            java.lang.Object r0 = r6.A02
            X.73o r0 = (X.C1409173o) r0
            r1.A0H(r0)
            X.C115295ti.A03(r0, r1)
            return
        L_0x0d1d:
            java.lang.Object r0 = r6.A01
            X.1hB r0 = (X.C32431hB) r0
            java.lang.Object r1 = r6.A02
            X.2rc r1 = (X.C62572rc) r1
            X.00H r0 = r0.A0J
            java.lang.Object r0 = r0.get()
            X.168 r0 = (X.AnonymousClass168) r0
            r0.A00(r1)
            return
        L_0x0d31:
            java.lang.Object r3 = r6.A01
            X.1hB r3 = (X.C32431hB) r3
            java.lang.Object r2 = r6.A02
            X.21V r2 = (X.AnonymousClass21V) r2
            X.1KB r1 = r3.A03
            r0 = 35
            r3.A0C(r1, r2, r0)
            return
        L_0x0d41:
            java.lang.Object r1 = r6.A01
            X.1hB r1 = (X.C32431hB) r1
            java.lang.Object r0 = r6.A02
            X.21V r0 = (X.AnonymousClass21V) r0
            X.C32431hB.A03(r1, r0)
            return
        L_0x0d4d:
            java.lang.Object r0 = r6.A01
            X.1hY r0 = (X.C32661hY) r0
            java.lang.Object r2 = r6.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A06
        L_0x0d57:
            r0 = 12
            goto L_0x0d9f
        L_0x0d5a:
            java.lang.Object r0 = r6.A01
            X.1hA r0 = (X.C32421hA) r0
            java.lang.Object r1 = r6.A02
            X.206 r1 = (X.AnonymousClass206) r1
            X.2KB r0 = r0.A01(r1)
            r0.A08(r1)
            return
        L_0x0d6a:
            java.lang.Object r1 = r6.A01
            android.app.job.JobParameters r1 = (android.app.job.JobParameters) r1
            java.lang.Object r0 = r6.A02
            com.whatsapp.media.download.service.MediaDownloadJobService r0 = (com.whatsapp.media.download.service.MediaDownloadJobService) r0
            com.whatsapp.media.download.service.MediaDownloadJobService.A00(r1, r0)
            return
        L_0x0d76:
            java.lang.Object r1 = r6.A01
            X.7Ka r1 = (X.C145127Ka) r1
            java.lang.Object r0 = r6.A02
            X.205 r0 = (X.AnonymousClass205) r0
            X.C145127Ka.A02(r1, r0)
            return
        L_0x0d82:
            java.lang.Object r2 = r6.A01
            X.6yW r2 = (X.C139246yW) r2
            java.lang.Object r1 = r6.A02
            X.21V r1 = (X.AnonymousClass21V) r1
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            r0.<init>()
            X.C139246yW.A00(r2, r1, r0)
            return
        L_0x0d93:
            java.lang.Object r0 = r6.A01
            X.2h9 r0 = (X.C56242h9) r0
            java.lang.Object r2 = r6.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1Lg r1 = r0.A08
            r0 = 9
        L_0x0d9f:
            r1.A02(r2, r0)
            return
        L_0x0da3:
            java.lang.Object r4 = r6.A01
            X.7FN r4 = (X.AnonymousClass7FN) r4
            java.lang.Object r5 = r6.A02
            X.206 r5 = (X.AnonymousClass206) r5
            r1 = 0
            goto L_0x0db6
        L_0x0dad:
            java.lang.Object r4 = r6.A01
            X.7FN r4 = (X.AnonymousClass7FN) r4
            java.lang.Object r5 = r6.A02
            X.206 r5 = (X.AnonymousClass206) r5
            r1 = 1
        L_0x0db6:
            java.util.HashMap r3 = com.whatsapp.media.transcode.MediaTranscodeService.A0B
            monitor-enter(r3)
            int r7 = r3.size()     // Catch:{ all -> 0x0e0f }
            X.205 r8 = r5.A0v     // Catch:{ all -> 0x0e0f }
            r3.containsKey(r8)     // Catch:{ all -> 0x0e0f }
            java.lang.Object r0 = r3.remove(r8)     // Catch:{ all -> 0x0e0f }
            X.206 r0 = (X.AnonymousClass206) r0     // Catch:{ all -> 0x0e0f }
            if (r1 == 0) goto L_0x0dcd
            if (r0 == 0) goto L_0x0e0d
            goto L_0x0dd0
        L_0x0dcd:
            if (r0 == 0) goto L_0x0e0d
            goto L_0x0e04
        L_0x0dd0:
            X.190 r6 = r4.A01     // Catch:{ all -> 0x0e0f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0e0f }
            java.lang.String r0 = "MediaTranscodeService/removeMessageAndStopService called from timeout, message status: "
            r1.append(r0)     // Catch:{ all -> 0x0e0f }
            int r0 = r5.A0D()     // Catch:{ all -> 0x0e0f }
            java.lang.String r2 = X.C17880vN.A0t(r1, r0)     // Catch:{ all -> 0x0e0f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0e0f }
            java.lang.String r0 = "chat type = "
            r1.append(r0)     // Catch:{ all -> 0x0e0f }
            X.1BI r0 = r8.A00     // Catch:{ all -> 0x0e0f }
            int r0 = r0.getType()     // Catch:{ all -> 0x0e0f }
            r1.append(r0)     // Catch:{ all -> 0x0e0f }
            java.lang.String r0 = ", message type = "
            X.AnonymousClass206.A07(r5, r0, r1)     // Catch:{ all -> 0x0e0f }
            java.lang.String r0 = ", size = "
            java.lang.String r1 = X.AnonymousClass001.A1I(r0, r1, r7)     // Catch:{ all -> 0x0e0f }
            r0 = 0
            r6.A0G(r2, r1, r0)     // Catch:{ all -> 0x0e0f }
        L_0x0e04:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0e0f }
            if (r0 == 0) goto L_0x0e0d
            X.AnonymousClass7FN.A00(r4, r5)     // Catch:{ all -> 0x0e0f }
        L_0x0e0d:
            monitor-exit(r3)     // Catch:{ all -> 0x0e0f }
            return
        L_0x0e0f:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0e0f }
            throw r0
        L_0x0e12:
            X.63q r2 = new X.63q
            r2.<init>()
            long r4 = r11.A07
            double r0 = (double) r4
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A05 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r100)
            r2.A06 = r0
            boolean r0 = X.C63972u0.A07(r7)
            if (r0 == 0) goto L_0x0e72
            if (r6 == 0) goto L_0x0e72
            boolean r0 = r6.exists()
            if (r0 == 0) goto L_0x0e72
            X.00H r0 = r3.A06
            java.lang.Object r1 = r0.get()
            X.70H r1 = (X.AnonymousClass70H) r1
            java.lang.String r0 = r11.A0J
            X.73B r1 = r1.A02(r6, r0)
            if (r1 == 0) goto L_0x0e6a
            boolean r0 = r1.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A02 = r0
            boolean r0 = r1.A0F
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A01 = r0
            boolean r0 = r1.A0B
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A00 = r0
            boolean r0 = r1.A0G
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03 = r0
            java.lang.Integer r0 = r1.A03()
            r2.A07 = r0
        L_0x0e6a:
            boolean r0 = r11.A0S
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A04 = r0
        L_0x0e72:
            X.18K r0 = r3.A02
            r0.CC7(r2)
            return
        L_0x0e78:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x0e7b:
            r0 = move-exception
            monitor-exit(r21)
            throw r0
        L_0x0e7e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0e7e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C146807Qr.run():void");
    }

    public C146807Qr(AnonymousClass1T6 r2, AnonymousClass34B r3) {
        this.A00 = 9;
        this.A01 = r2;
        this.A02 = r3;
    }
}
