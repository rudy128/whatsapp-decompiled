package X;

import android.content.Context;

/* renamed from: X.2xU  reason: invalid class name and case insensitive filesystem */
public class C66022xU implements AnonymousClass191 {
    public final Context A00;

    public /* synthetic */ void Blg() {
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0741  */
    /* JADX WARNING: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0496  */
    public void Blf() {
        /*
            r71 = this;
            r0 = r71
            android.content.Context r0 = r0.A00
            r70 = r0
            java.lang.String r0 = "app-init/async/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00c r2 = X.C17890vO.A0H(r70)
            r0 = r2
            X.10E r0 = (X.AnonymousClass10E) r0
            X.00S r1 = r0.ABY
            java.lang.Object r47 = r1.get()
            r1 = r47
            X.118 r1 = (X.AnonymousClass118) r1
            r47 = r1
            X.0ve r35 = r2.BAL()
            X.1KB r31 = X.AnonymousClass10E.A12(r0)
            X.11S r34 = r2.BA6()
            X.00S r1 = r0.ABd
            r1.get()
            X.00S r1 = r0.ABB
            java.lang.Object r12 = r1.get()
            X.11W r12 = (X.AnonymousClass11W) r12
            X.10I r37 = r2.CRy()
            X.00S r1 = r0.A8v
            java.lang.Object r51 = r1.get()
            r1 = r51
            X.17r r1 = (X.C218617r) r1
            r51 = r1
            X.18K r56 = r2.CS2()
            X.00S r1 = r0.AA9
            java.lang.Object r55 = r1.get()
            r1 = r55
            X.181 r1 = (X.AnonymousClass181) r1
            r55 = r1
            X.00S r1 = r0.A3t
            java.lang.Object r54 = r1.get()
            X.00S r1 = r0.AAr
            java.lang.Object r53 = r1.get()
            r1 = r53
            X.1mH r1 = (X.C35461mH) r1
            r53 = r1
            X.00S r1 = r0.ABi
            java.lang.Object r52 = r1.get()
            r1 = r52
            X.1DA r1 = (X.AnonymousClass1DA) r1
            r52 = r1
            X.00S r1 = r0.A5t
            java.lang.Object r11 = r1.get()
            X.1Do r11 = (X.C22881Do) r11
            X.00S r1 = r0.A8Q
            java.lang.Object r50 = r1.get()
            r1 = r50
            X.1fU r1 = (X.C31391fU) r1
            r50 = r1
            X.11Z r36 = r2.COg()
            X.00S r1 = r0.A1o
            r1.get()
            X.00S r1 = r0.A3H
            java.lang.Object r49 = r1.get()
            X.10E r1 = r0.Ao8
            X.10G r8 = r1.A00
            X.00S r1 = r8.A2K
            java.lang.Object r10 = r1.get()
            X.2fc r10 = (X.C55342fc) r10
            X.00S r1 = r0.A06
            X.00H r48 = X.C000200d.A00(r1)
            X.00S r1 = r0.A9z
            java.lang.Object r25 = r1.get()
            r1 = r25
            X.1Ot r1 = (X.C25581Ot) r1
            r25 = r1
            X.00S r1 = r0.AAp
            java.lang.Object r22 = r1.get()
            r1 = r22
            X.11C r1 = (X.AnonymousClass11C) r1
            r22 = r1
            X.0vb r60 = r2.CS9()
            X.00S r1 = r0.A3B
            java.lang.Object r26 = r1.get()
            r1 = r26
            X.2kZ r1 = (X.C58362kZ) r1
            r26 = r1
            X.00S r1 = r0.A61
            r1.get()
            X.00S r1 = r0.A0x
            java.lang.Object r7 = r1.get()
            X.1pj r7 = (X.C37551pj) r7
            X.00S r1 = r0.A2E
            java.lang.Object r20 = r1.get()
            r1 = r20
            X.1Nb r1 = (X.AnonymousClass1Nb) r1
            r20 = r1
            X.00S r1 = r0.A9d
            java.lang.Object r46 = r1.get()
            r1 = r46
            X.18j r1 = (X.C220418j) r1
            r46 = r1
            X.00S r1 = r0.AAq
            java.lang.Object r45 = r1.get()
            r1 = r45
            X.1cr r1 = (X.C29781cr) r1
            r45 = r1
            X.00S r1 = r0.ABm
            java.lang.Object r21 = r1.get()
            r1 = r21
            X.1hL r1 = (X.C32531hL) r1
            r21 = r1
            com.whatsapp.nativelibloader.WhatsAppLibLoader r44 = r2.CS8()
            X.00S r1 = r0.A0O
            java.lang.Object r27 = r1.get()
            r1 = r27
            X.1gM r1 = (X.C31931gM) r1
            r27 = r1
            X.00S r1 = r0.A2k
            java.lang.Object r15 = r1.get()
            X.12E r15 = (X.AnonymousClass12E) r15
            X.00S r1 = r8.A35
            java.lang.Object r19 = r1.get()
            r1 = r19
            X.2pz r1 = (X.C61622pz) r1
            r19 = r1
            X.1Cd r23 = r2.Bjr()
            X.00S r1 = r0.A9T
            java.lang.Object r43 = r1.get()
            X.00S r1 = r0.ABj
            java.lang.Object r18 = r1.get()
            r1 = r18
            X.17x r1 = (X.C219217x) r1
            r18 = r1
            X.0z4 r17 = r2.CRw()
            X.00S r1 = r0.A9A
            java.lang.Object r9 = r1.get()
            X.1Vn r9 = (X.C27301Vn) r9
            X.00S r1 = r0.A3D
            java.lang.Object r24 = r1.get()
            r1 = r24
            X.1ks r1 = (X.C34661ks) r1
            r24 = r1
            X.00S r1 = r0.A3k
            java.lang.Object r42 = r1.get()
            r1 = r42
            X.1WP r1 = (X.AnonymousClass1WP) r1
            r42 = r1
            X.00S r1 = r0.A5p
            java.lang.Object r16 = r1.get()
            r1 = r16
            X.1Uv r1 = (X.C27131Uv) r1
            r16 = r1
            X.00S r1 = r0.A77
            java.lang.Object r6 = r1.get()
            X.A1I r6 = (X.A1I) r6
            X.00S r1 = r0.A39
            java.lang.Object r66 = r1.get()
            X.1CM r41 = r2.CEB()
            X.00S r1 = r0.A9s
            java.lang.Object r28 = r1.get()
            r1 = r28
            X.0vc r1 = (X.C18010vc) r1
            r28 = r1
            X.00S r1 = r0.A0L
            java.lang.Object r29 = r1.get()
            r1 = r29
            X.195 r1 = (X.AnonymousClass195) r1
            r29 = r1
            X.00S r1 = r8.A3W
            java.lang.Object r68 = r1.get()
            X.00S r1 = r0.ABn
            X.00H r1 = X.C000200d.A00(r1)
            java.lang.Object r33 = r1.get()
            r1 = r33
            X.11O r1 = (X.AnonymousClass11O) r1
            r33 = r1
            X.00S r1 = r8.A07
            java.lang.Object r30 = r1.get()
            r1 = r30
            X.A1H r1 = (X.A1H) r1
            r30 = r1
            X.00S r1 = r0.A2p
            java.lang.Object r5 = r1.get()
            X.1RQ r5 = (X.AnonymousClass1RQ) r5
            X.00S r1 = r0.A2V
            java.lang.Object r40 = r1.get()
            r1 = r40
            X.1Tf r1 = (X.C26721Tf) r1
            r40 = r1
            X.00S r1 = r8.A1a
            java.lang.Object r4 = r1.get()
            X.4Xj r4 = (X.C87864Xj) r4
            X.00S r1 = r0.AAT
            java.lang.Object r3 = r1.get()
            X.6zC r3 = (X.C139636zC) r3
            X.00S r1 = r0.A4c
            java.lang.Object r39 = r1.get()
            r1 = r39
            X.1oU r1 = (X.C36801oU) r1
            r39 = r1
            X.00S r1 = r0.AAs
            java.lang.Object r38 = r1.get()
            X.00S r1 = r8.A08
            java.lang.Object r2 = r1.get()
            X.6nh r2 = (X.C132846nh) r2
            X.00S r1 = r0.A6M
            java.lang.Object r32 = r1.get()
            X.00S r0 = r0.A73
            java.lang.Object r14 = r0.get()
            com.whatsapp.NativeMediaHandler r14 = (com.whatsapp.NativeMediaHandler) r14
            java.lang.String r13 = "_has_set_default_values"
            r1 = 0
            r0 = r70
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r13, r1)
            if (r0 == 0) goto L_0x0230
            boolean r0 = r0.getBoolean(r13, r1)
            if (r0 != 0) goto L_0x0230
            r13 = 40
            X.7Pd r1 = new X.7Pd
            r0 = r49
            r1.<init>(r0, r13)
            r0 = r31
            r0.A0J(r1)
        L_0x0230:
            boolean r0 = r44.A04()
            if (r0 == 0) goto L_0x02af
            r14.A00()
            r56.CO1()
            java.lang.Object r0 = r48.get()     // Catch:{ Exception -> 0x024b }
            X.2ZS r0 = (X.AnonymousClass2ZS) r0     // Catch:{ Exception -> 0x024b }
            java.util.concurrent.atomic.AtomicReference r0 = r0.A00     // Catch:{ Exception -> 0x024b }
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x024b }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x024b }
            goto L_0x0252
        L_0x024b:
            r1 = move-exception
            java.lang.String r0 = "appinit/async/getAccessSessionId"
            com.whatsapp.util.Log.e(r0, r1)
            r1 = 0
        L_0x0252:
            boolean r0 = r41.A04()
            if (r0 == 0) goto L_0x0261
            r34.A0I()
            r0 = r34
            com.whatsapp.Me r0 = r0.A00
            if (r0 != 0) goto L_0x0287
        L_0x0261:
            X.2iV r0 = r50.BX3()
            java.lang.String r0 = r0.A01
            r56 = r52
            r57 = r55
            r58 = r47
            r59 = r17
            r61 = r46
            r62 = r12
            r63 = r37
            r64 = r0
            r65 = r1
            boolean r0 = r56.A03(r57, r58, r59, r60, r61, r62, r63, r64, r65)
            if (r0 != 0) goto L_0x0287
            java.lang.String r0 = "LegacyAppAsyncInit/runAsyncInits/waMsysSetup.bootstrapForReg failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.C181689Rl.A00(r31)
        L_0x0287:
            r34.A0I()
            r0 = r34
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x02af
            r23.A06()
            r0 = r23
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x02af
            r0 = r22
            r2.A00(r0)
            X.1US r13 = r15.A0B
            X.10s r2 = r13.A0P
            r1 = 29
            X.25f r0 = new X.25f
            r0.<init>((java.lang.Object) r13, (int) r1)
            r2.execute(r0)
            r15.A05()
        L_0x02af:
            X.0vb r0 = r12.A06
            java.util.Set r0 = r0.A09
            r0.add(r12)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x02c7
            r0 = 32
            if (r1 > r0) goto L_0x02c7
            r1 = r70
            r0 = r22
            X.C39571tI.A00(r1, r0)
        L_0x02c7:
            X.10s r2 = r4.A04
            r1 = 34
            X.4ro r0 = new X.4ro
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.execute(r0)
            boolean r0 = X.AnonymousClass1J8.A01(r35)
            if (r0 == 0) goto L_0x02e3
            r1 = 33
            X.4ro r0 = new X.4ro
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.execute(r0)
        L_0x02e3:
            r1 = 3005(0xbbd, float:4.211E-42)
            X.0vf r2 = X.C18040vf.A02
            r0 = r35
            boolean r0 = X.C18020vd.A05(r2, r0, r1)
            if (r0 == 0) goto L_0x0311
            X.00H r4 = r6.A06
            java.lang.Object r1 = r4.get()
            X.CYT r1 = (X.CYT) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            java.util.List r1 = r1.A01(r0)
            r0 = 1
            X.A1I.A00(r6, r1, r0)
            java.lang.Object r1 = r4.get()
            X.CYT r1 = (X.CYT) r1
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            java.util.List r1 = r1.A01(r0)
            r0 = 0
            X.A1I.A00(r6, r1, r0)
        L_0x0311:
            r12 = 2
            java.lang.String r0 = "AppInit2"
            r9.BEJ(r12, r0)
            java.lang.String r14 = "app-init/permissions/"
            r0 = 4
            java.io.File[] r9 = new java.io.File[r0]     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.io.File r0 = r70.getFilesDir()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.io.File r0 = r0.getParentFile()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            r6 = 0
            r9[r6] = r0     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.io.File r0 = r70.getFilesDir()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            r4 = 1
            r9[r4] = r0     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.io.File r1 = r70.getFilesDir()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.lang.String r0 = "Logs"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            r9[r12] = r0     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.lang.String r1 = "msgstore.db"
            r0 = r70
            java.io.File r0 = r0.getDatabasePath(r1)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.io.File r1 = r0.getParentFile()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            r0 = 3
            r9[r0] = r1     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            r12 = 4
        L_0x034a:
            r13 = r9[r6]     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r14)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.lang.String r0 = r13.getName()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            r1.append(r0)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.lang.String r0 = " w="
            r1.append(r0)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            boolean r0 = r13.canWrite()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            X.C17900vP.A0r(r1, r0)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            boolean r0 = r13.canWrite()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            if (r0 != 0) goto L_0x0380
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r14)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.lang.String r0 = r13.getName()     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            r1.append(r0)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            java.lang.String r0 = " set w="
            r1.append(r0)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            boolean r0 = r13.setWritable(r4, r4)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
            X.C17900vP.A0r(r1, r0)     // Catch:{ Exception -> 0x0385, NoSuchMethodError -> 0x0389 }
        L_0x0380:
            int r6 = r6 + 1
            if (r6 >= r12) goto L_0x03a1
            goto L_0x034a
        L_0x0385:
            r4 = move-exception
            java.lang.String r0 = "app-init/checkpermissions/error "
            goto L_0x039e
        L_0x0389:
            r4 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "app-init/checkpermissions/nomethod ("
            r1.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1.append(r0)
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
        L_0x039e:
            com.whatsapp.util.Log.i(r0, r4)
        L_0x03a1:
            r45.A00()
            r9 = 9
            X.7R0 r6 = new X.7R0
            r4 = r70
            r1 = r54
            r0 = r38
            r6.<init>(r4, r1, r0, r9)
            r0 = r26
            r0.A01(r6)
            boolean r4 = r11.A01
            r1 = 5
            X.AWs r0 = new X.AWs
            r0.<init>(r4, r1)
            r11.notifyAllObservers(r0)
            boolean r0 = r11.A01
            if (r0 == 0) goto L_0x03dc
            boolean r4 = r34.A0N()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "app-init/async/loginfailed + inCompanion="
            X.C17900vP.A0n(r0, r1, r4)
            if (r4 == 0) goto L_0x03e2
            r6 = 0
            r4 = 1
            r1 = 0
            r0 = r40
            r0.A02(r6, r1, r4)
        L_0x03dc:
            X.2ep r0 = r10.A03
            if (r0 != 0) goto L_0x0409
            monitor-enter(r10)
            goto L_0x03f3
        L_0x03e2:
            r1 = 42
            X.7Pd r6 = new X.7Pd
            r0 = r43
            r6.<init>(r0, r1)
            r0 = 2600(0xa28, double:1.2846E-320)
            r4 = r31
            r4.A0K(r6, r0)
            goto L_0x03dc
        L_0x03f3:
            X.2ep r0 = r10.A03     // Catch:{ all -> 0x0406 }
            if (r0 != 0) goto L_0x0404
            X.17y r0 = r10.A01     // Catch:{ all -> 0x0406 }
            X.17z r4 = r0.A00     // Catch:{ all -> 0x0406 }
            X.10I r1 = r10.A02     // Catch:{ all -> 0x0406 }
            X.2ep r0 = new X.2ep     // Catch:{ all -> 0x0406 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x0406 }
            r10.A03 = r0     // Catch:{ all -> 0x0406 }
        L_0x0404:
            monitor-exit(r10)     // Catch:{ all -> 0x0406 }
            goto L_0x0409
        L_0x0406:
            r1 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0406 }
            throw r1
        L_0x0409:
            X.2ep r6 = r10.A03
            java.util.concurrent.locks.Lock r1 = r6.A03
            r1.lock()
            boolean r0 = r6.A00
            if (r0 != 0) goto L_0x0496
            r1.unlock()
            X.10I r4 = r6.A02
            r1 = 28
            X.7Ql r0 = new X.7Ql
            r0.<init>(r6, r1)
            r4.CGF(r0)
        L_0x0423:
            r0 = r53
            X.10I r1 = r0.A01
            X.1mL r0 = r0.A00
            r1.CGF(r0)
            java.io.File r1 = r70.getFilesDir()
            java.lang.String r0 = "last_warning"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            r0.delete()
            java.lang.String r0 = "expiration_date"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            r0.delete()
            java.lang.String r0 = "account_type"
            java.io.File r0 = X.C17880vN.A0e(r1, r0)
            r0.delete()
            X.2hC r0 = r51.A08()
            java.io.File r4 = r0.A0B
            r1 = 0
            X.C218617r.A07(r4, r1)
            java.lang.String r0 = "thumbnails"
            java.io.File r0 = X.C17890vO.A0I(r4, r0, r1)
            X.C64062u9.A0R(r0)
            r0 = r39
            X.10I r6 = r0.A0L
            r4 = 23
            X.AkO r1 = new X.AkO
            r1.<init>((java.lang.Object) r0, (int) r4)
            r6.CGF(r1)
            r0 = r47
            android.content.Context r4 = r0.A00
            boolean r0 = X.C41361wE.A09(r4)
            if (r0 == 0) goto L_0x047a
            r39.A06()
        L_0x047a:
            r23.A06()
            r0 = r23
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x04f6
            r16.A0Q()
            X.C27131Uv.A09(r16)
            X.1Qk r10 = r5.A01
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            X.1Cd r0 = r10.A02
            X.1at r11 = r0.get()
            goto L_0x049a
        L_0x0496:
            r1.unlock()
            goto L_0x0423
        L_0x049a:
            r0 = r11
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x04c7 }
            X.1Ev r6 = r0.A02     // Catch:{ all -> 0x04c7 }
            java.lang.String r1 = "SELECT _id, chat_row_id, block_size, deleted_message_row_id, deleted_starred_message_row_id, deleted_messages_remove_files, deleted_categories_message_row_id, deleted_categories_starred_message_row_id, deleted_categories_remove_files, deleted_message_categories, singular_message_delete_rows_id, delete_files_singular_delete FROM deleted_chat_job"
            java.lang.String r0 = "GET_DELETED_CHAT_JOB_SQL"
            android.database.Cursor r1 = X.C23141Ev.A00(r6, r1, r0)     // Catch:{ all -> 0x04c7 }
        L_0x04a7:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x04b7
            X.2h3 r0 = X.C25991Qk.A00(r1, r10)     // Catch:{ all -> 0x04bb }
            if (r0 == 0) goto L_0x04a7
            r9.add(r0)     // Catch:{ all -> 0x04bb }
            goto L_0x04a7
        L_0x04b7:
            r1.close()     // Catch:{ all -> 0x04c7 }
            goto L_0x04fb
        L_0x04bb:
            r2 = move-exception
            if (r1 == 0) goto L_0x04c6
            r1.close()     // Catch:{ all -> 0x04c2 }
            goto L_0x04c6
        L_0x04c2:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r2, r0)     // Catch:{ all -> 0x04c7 }
        L_0x04c6:
            throw r2     // Catch:{ all -> 0x04c7 }
        L_0x04c7:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x04cc }
            throw r1
        L_0x04cc:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)
            throw r1
        L_0x04d1:
            java.util.List r0 = r6.A09
            if (r0 == 0) goto L_0x04f8
            long r0 = r6.A04
            r10 = -9223372036854775808
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x04f8
            java.lang.String r0 = "action_singular_delete"
            r5.A00(r6, r0)
        L_0x04e2:
            r42.getClass()
            r5 = 41
            X.7Pd r1 = new X.7Pd
            r0 = r42
            r1.<init>(r0, r5)
            r0 = r31
            r0.A0J(r1)
            r42.A01()
        L_0x04f6:
            monitor-enter(r7)
            goto L_0x051e
        L_0x04f8:
            java.lang.String r0 = "action_clear"
            goto L_0x051a
        L_0x04fb:
            r11.close()
            java.util.Iterator r12 = r9.iterator()
        L_0x0502:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x04e2
            java.lang.Object r6 = r12.next()
            X.2h3 r6 = (X.C56192h3) r6
            X.1CJ r1 = r5.A00
            X.1BI r0 = r6.A07
            boolean r0 = r1.A0T(r0)
            if (r0 == 0) goto L_0x04d1
            java.lang.String r0 = "action_delete"
        L_0x051a:
            r5.A00(r6, r0)
            goto L_0x0502
        L_0x051e:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0M     // Catch:{ all -> 0x076a }
            boolean r0 = r0.get()     // Catch:{ all -> 0x076a }
            if (r0 != 0) goto L_0x053d
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0L     // Catch:{ all -> 0x076a }
            r0 = 1
            r6 = 0
            boolean r0 = r1.compareAndSet(r6, r0)     // Catch:{ all -> 0x076a }
            if (r0 == 0) goto L_0x053d
            X.10I r5 = r7.A0G     // Catch:{ all -> 0x076a }
            r0 = 3
            X.9Bd r1 = new X.9Bd     // Catch:{ all -> 0x076a }
            r1.<init>((java.lang.Object) r7, (int) r0)     // Catch:{ all -> 0x076a }
            java.lang.Void[] r0 = new java.lang.Void[r6]     // Catch:{ all -> 0x076a }
            r5.CGD(r1, r0)     // Catch:{ all -> 0x076a }
        L_0x053d:
            monitor-exit(r7)
            r7.A0E()
            long r11 = java.lang.System.currentTimeMillis()
            X.0ve r1 = r3.A01
            r0 = 1944(0x798, float:2.724E-42)
            int r5 = X.C18020vd.A00(r2, r1, r0)
            r1 = 0
            r0 = 120(0x78, float:1.68E-43)
            if (r5 >= r1) goto L_0x067a
            r5 = 0
        L_0x0553:
            r9 = 86400000(0x5265c00, double:4.2687272E-316)
            X.0z4 r0 = r3.A00
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "sticker_store_last_fetch_time"
            long r1 = X.C17890vO.A05(r1, r0)
            long r1 = r1 + r9
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x057f
            if (r5 <= 0) goto L_0x066c
            java.lang.Class<com.whatsapp.stickers.stickerpack.FetchDownloadableStickerPackWorker> r0 = com.whatsapp.stickers.stickerpack.FetchDownloadableStickerPackWorker.class
            X.8Jv r6 = X.C139636zC.A00(r0, r5)
            X.19K r0 = r3.A03
            java.lang.Object r2 = r0.get()
            X.A7W r2 = (X.A7W) r2
            java.lang.String r1 = "fetch_sticker_pack_data"
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r2.A07(r6, r0, r1)
        L_0x057f:
            X.00H r0 = r3.A07
            java.lang.Object r0 = r0.get()
            X.6fB r0 = (X.C127936fB) r0
            X.0vl r0 = r0.A01
            android.content.SharedPreferences r1 = X.C17880vN.A0C(r0)
            java.lang.String r0 = "discovery_pack_last_fetch_time"
            long r0 = X.C17890vO.A05(r1, r0)
            long r9 = r9 + r0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x05af
            if (r5 <= 0) goto L_0x065e
            java.lang.Class<com.whatsapp.stickers.stickerpack.FetchDiscoveryPackWorker> r0 = com.whatsapp.stickers.stickerpack.FetchDiscoveryPackWorker.class
            X.8Jv r5 = X.C139636zC.A00(r0, r5)
            X.19K r0 = r3.A03
            java.lang.Object r2 = r0.get()
            X.A7W r2 = (X.A7W) r2
            java.lang.String r1 = "fetch_discovery_pack_data"
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r2.A07(r5, r0, r1)
        L_0x05af:
            X.00S r0 = r8.A4v
            java.lang.Object r2 = r0.get()
            X.2so r2 = (X.C63282so) r2
            r2.getClass()
            r0 = r27
            android.os.Handler r0 = r0.A00
            r2.A02(r0)
            r0 = r27
            android.os.Handler r0 = r0.A01
            r2.A02(r0)
            android.os.Handler r0 = r26.A00()
            r2.A02(r0)
            r0 = r25
            java.util.concurrent.ThreadPoolExecutor r1 = r0.A00
            java.lang.String r0 = "SignalExecutor"
            r2.A03(r0, r1)
            r0 = r24
            java.util.concurrent.ThreadPoolExecutor r1 = r0.A01
            if (r1 == 0) goto L_0x05e3
            java.lang.String r0 = "DecryptMessageExecutor"
            r2.A03(r0, r1)
        L_0x05e3:
            r2.A01()
            r69 = 46
            X.3Cr r64 = new X.3Cr
            r65 = r23
            r67 = r35
            r64.<init>((java.lang.Object) r65, (java.lang.Object) r66, (java.lang.Object) r67, (java.lang.Object) r68, (int) r69)
            r64.run()
            boolean r0 = X.AnonymousClass112.A09()
            if (r0 == 0) goto L_0x0614
            android.content.pm.ApplicationInfo r0 = r70.getApplicationInfo()
            int r1 = r0.targetSdkVersion
            r0 = 33
            if (r1 >= r0) goto L_0x0614
            r2 = 0
            r0 = r33
            android.content.SharedPreferences r1 = r0.A00
            java.lang.String r0 = "registration_state"
            int r0 = r1.getInt(r0, r2)
            if (r0 != 0) goto L_0x0614
        L_0x0611:
            java.lang.String r3 = "fixed"
            goto L_0x0680
        L_0x0614:
            boolean r0 = X.AnonymousClass112.A07()
            if (r0 == 0) goto L_0x0611
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r17)
            java.lang.String r6 = "notification_channel_upgrade_version"
            int r0 = X.C17890vO.A00(r0, r6)
            r5 = 1
            if (r0 == r5) goto L_0x0611
            java.util.HashSet r0 = X.AnonymousClass1Nb.A04(r20)
            java.util.Iterator r7 = r0.iterator()
        L_0x062f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0658
            X.1BI r0 = X.C17880vN.A0Q(r7)
            r1 = r20
            X.1yM r1 = r1.A0a(r0)
            r2 = r20
            X.AnonymousClass1Nb.A07(r1, r2)
            X.1M9 r1 = r2.A05
            X.1E7 r3 = r1.A0E(r0)
            r1 = r21
            r1.A07(r0)
            if (r3 == 0) goto L_0x062f
            r2 = 0
            r0 = r70
            r1.A04(r0, r3, r2)
            goto L_0x062f
        L_0x0658:
            r0 = r17
            X.C17900vP.A0M(r0, r6, r5)
            goto L_0x0611
        L_0x065e:
            X.10I r2 = r3.A02
            r1 = 25
            X.7RI r0 = new X.7RI
            r0.<init>(r3, r1)
            r2.CGF(r0)
            goto L_0x05af
        L_0x066c:
            X.10I r2 = r3.A02
            r1 = 26
            X.7RI r0 = new X.7RI
            r0.<init>(r3, r1)
            r2.CGF(r0)
            goto L_0x057f
        L_0x067a:
            if (r5 <= r0) goto L_0x0553
            r5 = 120(0x78, float:1.68E-43)
            goto L_0x0553
        L_0x0680:
            java.lang.String r0 = "google_bug_154855417"
            r1 = r28
            android.content.SharedPreferences r5 = r1.A05(r0)     // Catch:{ Exception -> 0x06d2 }
            boolean r0 = r5.contains(r3)     // Catch:{ Exception -> 0x06d2 }
            if (r0 != 0) goto L_0x06d7
            java.io.File r1 = r4.getFilesDir()     // Catch:{ Exception -> 0x06d2 }
            java.lang.String r0 = "ZoomTables.data"
            java.io.File r7 = X.C17880vN.A0e(r1, r0)     // Catch:{ Exception -> 0x06d2 }
            java.io.File r1 = r4.getFilesDir()     // Catch:{ Exception -> 0x06d2 }
            java.lang.String r0 = "SavedClientParameters.data.cs"
            java.io.File r6 = X.C17880vN.A0e(r1, r0)     // Catch:{ Exception -> 0x06d2 }
            java.io.File r2 = r4.getFilesDir()     // Catch:{ Exception -> 0x06d2 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x06d2 }
            java.lang.String r0 = "DATA_ServerControlledParametersManager.data.v1."
            r1.append(r0)     // Catch:{ Exception -> 0x06d2 }
            java.lang.String r0 = r4.getPackageName()     // Catch:{ Exception -> 0x06d2 }
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ Exception -> 0x06d2 }
            java.io.File r0 = X.C17880vN.A0e(r2, r0)     // Catch:{ Exception -> 0x06d2 }
            r7.delete()     // Catch:{ Exception -> 0x06d2 }
            r6.delete()     // Catch:{ Exception -> 0x06d2 }
            r0.delete()     // Catch:{ Exception -> 0x06d2 }
            android.content.SharedPreferences$Editor r1 = r5.edit()     // Catch:{ Exception -> 0x06d2 }
            r0 = 1
            X.C17880vN.A1F(r1, r3, r0)     // Catch:{ Exception -> 0x06d2 }
            java.lang.String r0 = "app-init/async/fixGoogleMapsCrash154855417 applied"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x06d2 }
            goto L_0x06d7
        L_0x06d2:
            java.lang.String r0 = "app-init/async/fixGoogleMapsCrash154855417 failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x06d7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x074b
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            r0 = r18
            int r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x074b
            java.lang.String r0 = "appinit/async sdk>=31, no read_phone_state permission"
        L_0x06e9:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x06ec:
            r34.A0I()
            r0 = r34
            X.1E3 r0 = r0.A02
            if (r0 == 0) goto L_0x0710
            boolean r0 = X.AnonymousClass112.A0A()
            if (r0 == 0) goto L_0x0707
            boolean r0 = r18.A06()
            if (r0 == 0) goto L_0x0710
            r0 = r29
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0710
        L_0x0707:
            r2 = r29
            r1 = r18
            r0 = r16
            com.whatsapp.location.LocationSharingService.A03(r4, r2, r1, r0)
        L_0x0710:
            r30.A02()
            X.C61622pz.A00(r19)
            r0 = r19
            X.00H r0 = r0.A03
            java.lang.Object r0 = r0.get()
            X.A1Q r0 = (X.A1Q) r0
            r0.A02()
            r36.A05()
            java.lang.String r0 = "app-init/async/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 444(0x1bc, float:6.22E-43)
            r0 = r35
            r0.A0N(r1)
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r17)
            java.lang.String r3 = "number_of_process_starts"
            int r2 = X.C17890vO.A00(r0, r3)
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r0) goto L_0x074a
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r17)
            int r0 = r2 + 1
            X.C17880vN.A1C(r1, r3, r0)
        L_0x074a:
            return
        L_0x074b:
            android.telephony.TelephonyManager r2 = r22.A0K()
            if (r2 != 0) goto L_0x0754
            java.lang.String r0 = "appinit/async tm=null"
            goto L_0x06e9
        L_0x0754:
            java.lang.String r0 = "appinit/async set listener for call state"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1 = 10
            X.7R0 r0 = new X.7R0
            r3 = r32
            r5 = r37
            r0.<init>(r3, r5, r2, r1)
            r1 = r31
            r1.A0J(r0)
            goto L_0x06ec
        L_0x076a:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66022xU.Blf():void");
    }

    public C66022xU(Context context) {
        this.A00 = context;
    }

    public void Ba9() {
    }
}
