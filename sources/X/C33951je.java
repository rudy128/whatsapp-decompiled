package X;

/* renamed from: X.1je  reason: invalid class name and case insensitive filesystem */
public class C33951je implements AnonymousClass1RJ {
    public final C26721Tf A00;

    public int[] BSG() {
        return new int[]{242, 243, 244, 245};
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public boolean BcT(android.os.Message r21, int r22) {
        /*
            r20 = this;
            r0 = 242(0xf2, float:3.39E-43)
            r2 = 1
            r6 = r20
            r3 = r21
            r1 = r22
            if (r1 != r0) goto L_0x0097
            java.lang.Object r4 = r3.obj
            X.C17960vV.A07(r4)
            X.1ca r4 = (X.C29621ca) r4
            java.lang.String r0 = "pair-device"
            X.1ca r1 = r4.A0K(r0)
            if (r1 == 0) goto L_0x0a05
            java.lang.String r0 = "ref"
            java.util.List r0 = r1.A0R(r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x0029:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r3.next()
            X.1ca r1 = (X.C29621ca) r1
            java.lang.String r0 = r1.A0M()
            r11.add(r0)
            r1.A0M()
            goto L_0x0029
        L_0x0040:
            java.lang.String r1 = "id"
            r0 = 0
            java.lang.String r1 = r4.A0Q(r1, r0)
            if (r1 == 0) goto L_0x0a05
            X.1Tf r0 = r6.A00
            X.11w r6 = X.C26721Tf.A00(r0)
            monitor-enter(r6)
            X.A15 r4 = r6.A0h     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = "cmp_refs_recvd"
            r4.A01(r0)     // Catch:{ all -> 0x0a06 }
            X.1Dn r5 = r6.A0P     // Catch:{ all -> 0x0a06 }
            int r3 = r5.A00()     // Catch:{ all -> 0x0a06 }
            r0 = 10
            if (r3 < r0) goto L_0x0088
            r0 = 14
            if (r3 > r0) goto L_0x0090
            X.2i1 r0 = r6.A0Q     // Catch:{ all -> 0x0a06 }
            r0.A00(r1)     // Catch:{ all -> 0x0a06 }
            r0 = 10
            if (r3 != r0) goto L_0x0074
            r0 = 0
            X.C203711w.A03(r6, r0)     // Catch:{ all -> 0x0a06 }
            goto L_0x0a04
        L_0x0074:
            r1 = 14
            if (r3 == r1) goto L_0x0083
            java.lang.String r0 = "companion/registration/refs/reconnected during link code registration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a06 }
            X.C203711w.A02(r6)     // Catch:{ all -> 0x0a06 }
            r5.A01(r1)     // Catch:{ all -> 0x0a06 }
        L_0x0083:
            X.C203711w.A03(r6, r2)     // Catch:{ all -> 0x0a06 }
            goto L_0x0a04
        L_0x0088:
            r10 = 3
            r9 = 2
            if (r3 != r10) goto L_0x008e
            goto L_0x0913
        L_0x008e:
            if (r3 == r9) goto L_0x091e
        L_0x0090:
            java.lang.String r0 = "companion/registration/refs/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0a06 }
            goto L_0x0a04
        L_0x0097:
            r0 = 243(0xf3, float:3.4E-43)
            if (r1 != r0) goto L_0x04f5
            java.lang.Object r4 = r3.obj
            X.C17960vV.A07(r4)
            X.1ca r4 = (X.C29621ca) r4
            java.lang.String r0 = "pair-success"
            X.1ca r1 = r4.A0K(r0)
            if (r1 == 0) goto L_0x0a05
            java.lang.String r19 = "device-identity"
            r0 = r19
            X.1ca r3 = r1.A0K(r0)
            java.lang.String r0 = "device"
            X.1ca r5 = r1.A0K(r0)
            if (r3 == 0) goto L_0x0a05
            if (r5 == 0) goto L_0x0a05
            java.lang.String r10 = "id"
            r1 = 0
            java.lang.String r9 = r4.A0Q(r10, r1)
            byte[] r3 = r3.A01
            java.lang.String r0 = "jid"
            java.lang.String r1 = r5.A0Q(r0, r1)
            java.lang.Class<X.1yJ> r4 = X.C42521yJ.class
            java.lang.String r0 = "lid"
            com.whatsapp.jid.Jid r12 = r5.A0F(r4, r0)
            X.1yJ r12 = (X.C42521yJ) r12
            if (r9 == 0) goto L_0x0a05
            if (r3 == 0) goto L_0x0a05
            if (r1 == 0) goto L_0x0a05
            X.1Tf r0 = r6.A00
            X.11w r8 = X.C26721Tf.A00(r0)
            monitor-enter(r8)
            X.A15 r7 = r8.A0h     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "cmp_pair_success"
            r7.A01(r0)     // Catch:{ all -> 0x04f2 }
            X.1Dn r11 = r8.A0P     // Catch:{ all -> 0x04f2 }
            int r4 = r11.A00()     // Catch:{ all -> 0x04f2 }
            r0 = 3
            if (r4 == r0) goto L_0x0113
            r0 = 13
            if (r4 == r0) goto L_0x0113
            java.lang.String r3 = "companion_pair_success_invalid_state"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f2 }
            r1.<init>()     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "State="
            r1.append(r0)     // Catch:{ all -> 0x04f2 }
            r1.append(r4)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04f2 }
            r7.A02(r3, r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "companion/registration/pair-success/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f2 }
            goto L_0x04f0
        L_0x0113:
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion     // Catch:{ all -> 0x04f2 }
            com.whatsapp.jid.DeviceJid r6 = r0.A06(r1)     // Catch:{ all -> 0x04f2 }
            r5 = 0
            if (r6 == 0) goto L_0x015b
            X.00H r0 = r8.A0j     // Catch:{ all -> 0x04f2 }
            r16 = r0
            java.lang.Object r14 = r16.get()     // Catch:{ all -> 0x04f2 }
            X.1cN r14 = (X.C29491cN) r14     // Catch:{ all -> 0x04f2 }
            com.whatsapp.jid.UserJid r13 = r6.userJid     // Catch:{ all -> 0x04f2 }
            r4 = 0
            X.C18070vi.A0d(r13, r4)     // Catch:{ all -> 0x04f2 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x04f2 }
            r15.<init>()     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "AccountSwitcher/isUserJidAlreadyRegistered/"
            r15.append(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r1 = r13.user     // Catch:{ all -> 0x04f2 }
            X.C18070vi.A0d(r1, r4)     // Catch:{ all -> 0x04f2 }
            r0 = 4
            java.lang.String r0 = X.AnonymousClass1EG.A0B(r1, r0)     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x0143
            r1 = r0
        L_0x0143:
            r15.append(r1)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = r15.toString()     // Catch:{ all -> 0x04f2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04f2 }
            java.util.List r1 = r14.A09(r4, r2, r4)     // Catch:{ all -> 0x04f2 }
            boolean r0 = r1 instanceof java.util.Collection     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x0169
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x0169
        L_0x015b:
            r0 = 4
            r11.A01(r0)     // Catch:{ all -> 0x04f2 }
            java.lang.Runnable r1 = r8.A0A     // Catch:{ all -> 0x04f2 }
            if (r1 == 0) goto L_0x018d
            X.10I r0 = r8.A0i     // Catch:{ all -> 0x04f2 }
            r0.CEz(r1)     // Catch:{ all -> 0x04f2 }
            goto L_0x018d
        L_0x0169:
            java.util.Iterator r14 = r1.iterator()     // Catch:{ all -> 0x04f2 }
        L_0x016d:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x0189
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x04f2 }
            X.2rb r0 = (X.C62562rb) r0     // Catch:{ all -> 0x04f2 }
            java.lang.String r1 = r0.A06     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = r13.user     // Catch:{ all -> 0x04f2 }
            boolean r0 = X.C18070vi.A18(r1, r0)     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x016d
            int r4 = r4 + 1
            if (r4 >= 0) goto L_0x016d
            goto L_0x04c4
        L_0x0189:
            if (r4 <= 0) goto L_0x015b
            goto L_0x04c8
        L_0x018d:
            X.2BA r0 = X.AnonymousClass2BA.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x04b4 }
            X.Bm6 r1 = X.C23577Bm6.A07(r0, r3)     // Catch:{ 1PN -> 0x04b4 }
            X.2BA r1 = (X.AnonymousClass2BA) r1     // Catch:{ 1PN -> 0x04b4 }
            r4 = 0
            if (r1 != 0) goto L_0x019c
            java.lang.String r0 = "companion/registration/pair-success/invalid device identity hmac"
            goto L_0x0434
        L_0x019c:
            X.DSQ r0 = r1.hmac_     // Catch:{ all -> 0x04f2 }
            byte[] r13 = r0.A06()     // Catch:{ all -> 0x04f2 }
            X.DSQ r0 = r1.details_     // Catch:{ all -> 0x04f2 }
            byte[] r3 = r0.A06()     // Catch:{ all -> 0x04f2 }
            int r0 = r1.accountType_     // Catch:{ all -> 0x04f2 }
            X.2RD r1 = X.AnonymousClass2RD.A00(r0)     // Catch:{ all -> 0x04f2 }
            if (r1 != 0) goto L_0x01b2
            X.2RD r1 = X.AnonymousClass2RD.E2EE     // Catch:{ all -> 0x04f2 }
        L_0x01b2:
            byte[] r14 = r8.A0H     // Catch:{ all -> 0x04f2 }
            X.19D r15 = r8.A0c     // Catch:{ all -> 0x04f2 }
            r16 = r3
            X.C18070vi.A0d(r13, r4)     // Catch:{ all -> 0x04f2 }
            X.C18070vi.A0d(r3, r2)     // Catch:{ all -> 0x04f2 }
            r0 = 4
            X.C18070vi.A0d(r15, r0)     // Catch:{ all -> 0x04f2 }
            if (r14 == 0) goto L_0x042a
            X.2RD r0 = X.AnonymousClass2RD.HOSTED     // Catch:{ all -> 0x04f2 }
            if (r1 != r0) goto L_0x01e2
            r1 = 7074(0x1ba2, float:9.913E-42)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ all -> 0x04f2 }
            boolean r0 = X.C18020vd.A05(r0, r15, r1)     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x01e2
            r0 = 2
            byte[][] r1 = new byte[r0][]     // Catch:{ all -> 0x04f2 }
            byte[] r0 = X.C19620yd.A0F     // Catch:{ all -> 0x04f2 }
            r1[r4] = r0     // Catch:{ all -> 0x04f2 }
            r1[r2] = r3     // Catch:{ all -> 0x04f2 }
            byte[] r16 = X.A8G.A05(r1)     // Catch:{ all -> 0x04f2 }
            X.C18070vi.A0X(r16)     // Catch:{ all -> 0x04f2 }
        L_0x01e2:
            r0 = r16
            byte[] r0 = X.AnonymousClass9QC.A00(r0, r14)     // Catch:{ Exception -> 0x0424 }
            X.C18070vi.A0b(r0)     // Catch:{ all -> 0x04f2 }
            byte[] r1 = android.util.Base64.encode(r13, r4)     // Catch:{ all -> 0x04f2 }
            byte[] r0 = android.util.Base64.encode(r0, r4)     // Catch:{ all -> 0x04f2 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x042a
            X.2BI r0 = X.AnonymousClass2BI.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x0421 }
            X.Bm6 r13 = X.C23577Bm6.A07(r0, r3)     // Catch:{ 1PN -> 0x0421 }
            X.2BI r13 = (X.AnonymousClass2BI) r13     // Catch:{ 1PN -> 0x0421 }
            X.DSQ r0 = r13.accountSignatureKey_     // Catch:{ all -> 0x04f2 }
            byte[] r18 = r0.A06()     // Catch:{ all -> 0x04f2 }
            X.1fL r3 = r8.A0O     // Catch:{ all -> 0x04f2 }
            X.1jP r1 = new X.1jP     // Catch:{ all -> 0x04f2 }
            r0 = r18
            r1.<init>(r0)     // Catch:{ all -> 0x04f2 }
            X.2kO r14 = new X.2kO     // Catch:{ all -> 0x04f2 }
            r14.<init>(r1)     // Catch:{ all -> 0x04f2 }
            X.11P r0 = r3.A03     // Catch:{ all -> 0x04f2 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x04f2 }
            r15 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r15
            r3.A00 = r0     // Catch:{ all -> 0x04f2 }
            X.1Rw r0 = r3.A02     // Catch:{ all -> 0x04f2 }
            X.1P3 r0 = r0.A05     // Catch:{ all -> 0x04f2 }
            X.1PJ r0 = r0.A01     // Catch:{ all -> 0x04f2 }
            X.2cG r0 = r0.A03()     // Catch:{ all -> 0x04f2 }
            X.2kO r0 = r0.A01     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = X.C26371Rw.A05(r0, r14)     // Catch:{ all -> 0x04f2 }
            r3.A01 = r0     // Catch:{ all -> 0x04f2 }
            r0 = 0
            X.C31301fL.A00(r3, r2, r0)     // Catch:{ all -> 0x04f2 }
            X.2cG r0 = r8.A05     // Catch:{ all -> 0x04f2 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x04f2 }
            X.2kO r0 = r0.A01     // Catch:{ all -> 0x04f2 }
            X.1jP r0 = r0.A00     // Catch:{ all -> 0x04f2 }
            byte[] r14 = r0.A00     // Catch:{ all -> 0x04f2 }
            X.C18070vi.A0d(r14, r2)     // Catch:{ all -> 0x04f2 }
            X.DSQ r0 = r13.accountSignature_     // Catch:{ all -> 0x04f2 }
            byte[] r17 = r0.A06()     // Catch:{ all -> 0x04f2 }
            X.DSQ r0 = r13.accountSignatureKey_     // Catch:{ all -> 0x04f2 }
            byte[] r15 = r0.A06()     // Catch:{ all -> 0x04f2 }
            r0 = 3
            byte[][] r1 = new byte[r0][]     // Catch:{ all -> 0x04f2 }
            byte[] r0 = X.C19620yd.A0E     // Catch:{ all -> 0x04f2 }
            r1[r4] = r0     // Catch:{ all -> 0x04f2 }
            X.DSQ r0 = r13.details_     // Catch:{ all -> 0x04f2 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x04f2 }
            r1[r2] = r0     // Catch:{ all -> 0x04f2 }
            r0 = 2
            r1[r0] = r14     // Catch:{ all -> 0x04f2 }
            byte[] r16 = X.A8G.A05(r1)     // Catch:{ all -> 0x04f2 }
            byte[][] r1 = new byte[r0][]     // Catch:{ 1Ak -> 0x042d }
            byte[] r0 = new byte[r2]     // Catch:{ 1Ak -> 0x042d }
            r14 = 5
            r0[r4] = r14     // Catch:{ 1Ak -> 0x042d }
            r1[r4] = r0     // Catch:{ 1Ak -> 0x042d }
            r1[r2] = r15     // Catch:{ 1Ak -> 0x042d }
            byte[] r0 = X.A8G.A05(r1)     // Catch:{ 1Ak -> 0x042d }
            X.1jP r0 = X.C63962tz.A01(r0)     // Catch:{ 1Ak -> 0x042d }
            X.C18070vi.A0b(r0)     // Catch:{ 1Ak -> 0x042d }
            r15 = r17
            r1 = r16
            boolean r0 = X.C63962tz.A07(r0, r1, r15)     // Catch:{ all -> 0x04f2 }
            if (r0 == 0) goto L_0x0432
            r8.A09 = r13     // Catch:{ all -> 0x04f2 }
            r0 = r18
            r8.A0G = r0     // Catch:{ all -> 0x04f2 }
            r11.A01(r14)     // Catch:{ all -> 0x04f2 }
            r8.A06 = r6     // Catch:{ all -> 0x04f2 }
            r8.A07 = r12     // Catch:{ all -> 0x04f2 }
            X.2BI r0 = r8.A09     // Catch:{ 1PN -> 0x041e }
            X.DSQ r0 = r0.details_     // Catch:{ 1PN -> 0x041e }
            byte[] r1 = r0.A06()     // Catch:{ 1PN -> 0x041e }
            X.2BM r0 = X.AnonymousClass2BM.DEFAULT_INSTANCE     // Catch:{ 1PN -> 0x041e }
            X.Bm6 r11 = X.C23577Bm6.A07(r0, r1)     // Catch:{ 1PN -> 0x041e }
            X.2BM r11 = (X.AnonymousClass2BM) r11     // Catch:{ 1PN -> 0x041e }
            X.C17960vV.A07(r11)     // Catch:{ all -> 0x04f2 }
            X.2BI r6 = r8.A09     // Catch:{ all -> 0x04f2 }
            X.2cG r1 = r8.A05     // Catch:{ all -> 0x04f2 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x04f2 }
            X.2kO r0 = r1.A01     // Catch:{ all -> 0x04f2 }
            X.1jP r13 = r0.A00     // Catch:{ all -> 0x04f2 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x04f2 }
            X.2kN r7 = r1.A00     // Catch:{ all -> 0x04f2 }
            X.C18070vi.A0d(r6, r4)     // Catch:{ all -> 0x04f2 }
            X.C18070vi.A0d(r13, r2)     // Catch:{ all -> 0x04f2 }
            r1 = 2
            X.C18070vi.A0d(r7, r1)     // Catch:{ all -> 0x04f2 }
            r0 = 4
            byte[][] r12 = new byte[r0][]     // Catch:{ all -> 0x04f2 }
            byte[] r0 = X.C19620yd.A0G     // Catch:{ all -> 0x04f2 }
            r12[r4] = r0     // Catch:{ all -> 0x04f2 }
            X.DSQ r0 = r6.details_     // Catch:{ all -> 0x04f2 }
            byte[] r0 = r0.A06()     // Catch:{ all -> 0x04f2 }
            r12[r2] = r0     // Catch:{ all -> 0x04f2 }
            byte[] r0 = r13.A00     // Catch:{ all -> 0x04f2 }
            r12[r1] = r0     // Catch:{ all -> 0x04f2 }
            X.DSQ r0 = r6.accountSignatureKey_     // Catch:{ all -> 0x04f2 }
            byte[] r1 = r0.A06()     // Catch:{ all -> 0x04f2 }
            r0 = 3
            r12[r0] = r1     // Catch:{ all -> 0x04f2 }
            byte[] r0 = X.A8G.A05(r12)     // Catch:{ all -> 0x04f2 }
            X.Bmt r6 = r6.A0O()     // Catch:{ all -> 0x04f2 }
            X.2AV r6 = (X.AnonymousClass2AV) r6     // Catch:{ all -> 0x04f2 }
            byte[] r1 = X.C63962tz.A09(r7, r0)     // Catch:{ all -> 0x04f2 }
            int r0 = r1.length     // Catch:{ all -> 0x04f2 }
            X.BmB r4 = X.DSQ.A01(r1, r4, r0)     // Catch:{ all -> 0x04f2 }
            r6.A0E()     // Catch:{ all -> 0x04f2 }
            X.Bm6 r1 = r6.A00     // Catch:{ all -> 0x04f2 }
            X.2BI r1 = (X.AnonymousClass2BI) r1     // Catch:{ all -> 0x04f2 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x04f2 }
            r0 = r0 | 8
            r1.bitField0_ = r0     // Catch:{ all -> 0x04f2 }
            r1.deviceSignature_ = r4     // Catch:{ all -> 0x04f2 }
            X.Bm6 r0 = r6.A0C()     // Catch:{ all -> 0x04f2 }
            X.2BI r0 = (X.AnonymousClass2BI) r0     // Catch:{ all -> 0x04f2 }
            r8.A09 = r0     // Catch:{ all -> 0x04f2 }
            X.Bmt r4 = r0.A0O()     // Catch:{ all -> 0x04f2 }
            X.2AV r4 = (X.AnonymousClass2AV) r4     // Catch:{ all -> 0x04f2 }
            r4.A0E()     // Catch:{ all -> 0x04f2 }
            X.Bm6 r1 = r4.A00     // Catch:{ all -> 0x04f2 }
            X.2BI r1 = (X.AnonymousClass2BI) r1     // Catch:{ all -> 0x04f2 }
            int r0 = r1.bitField0_     // Catch:{ all -> 0x04f2 }
            r0 = r0 & -3
            r1.bitField0_ = r0     // Catch:{ all -> 0x04f2 }
            X.2BI r0 = X.AnonymousClass2BI.DEFAULT_INSTANCE     // Catch:{ all -> 0x04f2 }
            X.DSQ r0 = r0.accountSignatureKey_     // Catch:{ all -> 0x04f2 }
            r1.accountSignatureKey_ = r0     // Catch:{ all -> 0x04f2 }
            X.Bm6 r0 = r4.A0C()     // Catch:{ all -> 0x04f2 }
            byte[] r7 = r0.A0M()     // Catch:{ all -> 0x04f2 }
            X.00H r0 = r8.A0m     // Catch:{ all -> 0x04f2 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x04f2 }
            X.9nI r12 = (X.C191849nI) r12     // Catch:{ all -> 0x04f2 }
            X.19D r13 = r12.A08     // Catch:{ all -> 0x04f2 }
            r0 = 6430(0x191e, float:9.01E-42)
            X.0vf r1 = X.C18040vf.A02     // Catch:{ all -> 0x04f2 }
            boolean r6 = X.C18020vd.A05(r1, r13, r0)     // Catch:{ all -> 0x04f2 }
            int r4 = r12.A03     // Catch:{ all -> 0x04f2 }
            r0 = 7217(0x1c31, float:1.0113E-41)
            int r1 = X.C18020vd.A00(r1, r13, r0)     // Catch:{ all -> 0x04f2 }
            r0 = 0
            if (r4 >= r1) goto L_0x0346
            r0 = 1
        L_0x0346:
            if (r6 == 0) goto L_0x034b
            if (r0 == 0) goto L_0x034b
            goto L_0x034d
        L_0x034b:
            r6 = 0
            goto L_0x035d
        L_0x034d:
            r12.A00()     // Catch:{ all -> 0x04f2 }
            com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1 r1 = new com.whatsapp.companionmode.registration.KeyAttestationLifetimeManager$getAttestation$1     // Catch:{ all -> 0x04f2 }
            r1.<init>(r12, r5)     // Catch:{ all -> 0x04f2 }
            X.1OR r0 = X.AnonymousClass1OR.A00     // Catch:{ all -> 0x04f2 }
            java.lang.Object r6 = X.AnonymousClass4GT.A00(r0, r1)     // Catch:{ all -> 0x04f2 }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x04f2 }
        L_0x035d:
            X.00H r0 = r8.A0l     // Catch:{ all -> 0x04f2 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x04f2 }
            X.9nH r12 = (X.C191839nH) r12     // Catch:{ all -> 0x04f2 }
            X.0vl r0 = r12.A08     // Catch:{ all -> 0x04f2 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x04f2 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x04f2 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x04f2 }
            r4 = 0
            if (r0 == 0) goto L_0x0384
            r12.A00()     // Catch:{ all -> 0x04f2 }
            com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1 r1 = new com.whatsapp.companionmode.registration.F9C0B802B9993AE2D6C98$ffd6af6cfc2b88e5fe9b0$1     // Catch:{ all -> 0x04f2 }
            r1.<init>(r12, r5)     // Catch:{ all -> 0x04f2 }
            X.1OR r0 = X.AnonymousClass1OR.A00     // Catch:{ all -> 0x04f2 }
            java.lang.Object r4 = X.AnonymousClass4GT.A00(r0, r1)     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x04f2 }
        L_0x0384:
            int r0 = r11.rawId_     // Catch:{ all -> 0x04f2 }
            r8.A02 = r0     // Catch:{ all -> 0x04f2 }
            int r5 = r11.keyIndex_     // Catch:{ all -> 0x04f2 }
            r8.A00 = r5     // Catch:{ all -> 0x04f2 }
            long r0 = r11.timestamp_     // Catch:{ all -> 0x04f2 }
            r8.A03 = r0     // Catch:{ all -> 0x04f2 }
            X.2i1 r0 = r8.A0Q     // Catch:{ all -> 0x04f2 }
            java.lang.String r13 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x04f2 }
            X.1OZ r11 = r0.A00     // Catch:{ all -> 0x04f2 }
            r5 = 307(0x133, float:4.3E-43)
            X.1MD[] r12 = new X.AnonymousClass1MD[r2]     // Catch:{ all -> 0x04f2 }
            java.lang.String r1 = "key-index"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((java.lang.String) r1, (java.lang.String) r13)     // Catch:{ all -> 0x04f2 }
            r13 = 0
            r12[r13] = r0     // Catch:{ all -> 0x04f2 }
            X.1ca r1 = new X.1ca     // Catch:{ all -> 0x04f2 }
            r0 = r19
            r1.<init>((java.lang.String) r0, (byte[]) r7, (X.AnonymousClass1MD[]) r12)     // Catch:{ all -> 0x04f2 }
            java.lang.String r7 = "key_attestation"
            X.1MD[] r0 = new X.AnonymousClass1MD[r13]     // Catch:{ all -> 0x04f2 }
            X.1ca r12 = new X.1ca     // Catch:{ all -> 0x04f2 }
            r12.<init>((java.lang.String) r7, (byte[]) r6, (X.AnonymousClass1MD[]) r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r7 = "gpia"
            X.1MD[] r6 = new X.AnonymousClass1MD[r13]     // Catch:{ all -> 0x04f2 }
            X.1ca r0 = new X.1ca     // Catch:{ all -> 0x04f2 }
            r0.<init>((java.lang.String) r7, (java.lang.String) r4, (X.AnonymousClass1MD[]) r6)     // Catch:{ all -> 0x04f2 }
            X.1MD[] r14 = new X.AnonymousClass1MD[r13]     // Catch:{ all -> 0x04f2 }
            r7 = 3
            X.1ca[] r4 = new X.C29621ca[r7]     // Catch:{ all -> 0x04f2 }
            r4[r13] = r1     // Catch:{ all -> 0x04f2 }
            r4[r2] = r12     // Catch:{ all -> 0x04f2 }
            r6 = 2
            r4[r6] = r0     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "pair-device-sign"
            X.1ca r12 = new X.1ca     // Catch:{ all -> 0x04f2 }
            r12.<init>((java.lang.String) r0, (X.AnonymousClass1MD[]) r14, (X.C29621ca[]) r4)     // Catch:{ all -> 0x04f2 }
            X.1MD[] r7 = new X.AnonymousClass1MD[r7]     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = "to"
            X.8v4 r1 = X.C173438v4.A00     // Catch:{ all -> 0x04f2 }
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r4)     // Catch:{ all -> 0x04f2 }
            r7[r13] = r0     // Catch:{ all -> 0x04f2 }
            java.lang.String r4 = "type"
            java.lang.String r1 = "result"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((java.lang.String) r4, (java.lang.String) r1)     // Catch:{ all -> 0x04f2 }
            r7[r2] = r0     // Catch:{ all -> 0x04f2 }
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((java.lang.String) r10, (java.lang.String) r9)     // Catch:{ all -> 0x04f2 }
            r7[r6] = r0     // Catch:{ all -> 0x04f2 }
            java.lang.String r1 = "iq"
            X.1ca r0 = new X.1ca     // Catch:{ all -> 0x04f2 }
            r0.<init>((X.C29621ca) r12, (java.lang.String) r1, (X.AnonymousClass1MD[]) r7)     // Catch:{ all -> 0x04f2 }
            r11.A0O(r0, r5)     // Catch:{ all -> 0x04f2 }
            r0 = 0
            X.C31301fL.A00(r3, r6, r0)     // Catch:{ all -> 0x04f2 }
            java.lang.Runnable r1 = r8.A0D     // Catch:{ all -> 0x04f2 }
            if (r1 == 0) goto L_0x040b
            X.10I r0 = r8.A0i     // Catch:{ all -> 0x04f2 }
            r0.CEz(r1)     // Catch:{ all -> 0x04f2 }
        L_0x040b:
            X.10I r4 = r8.A0i     // Catch:{ all -> 0x04f2 }
            r0 = 15
            X.7Pc r3 = new X.7Pc     // Catch:{ all -> 0x04f2 }
            r3.<init>(r8, r0)     // Catch:{ all -> 0x04f2 }
            r0 = 15000(0x3a98, double:7.411E-320)
            X.25d r0 = r4.CGv(r3, r0)     // Catch:{ all -> 0x04f2 }
            r8.A0D = r0     // Catch:{ all -> 0x04f2 }
            goto L_0x04f0
        L_0x041e:
            r3 = move-exception
            goto L_0x04df
        L_0x0421:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity"
            goto L_0x0434
        L_0x0424:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegistrationAdvUtil/verifyDeviceIdentityHMAC/Failed to calculate hmac-sha256"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04f2 }
        L_0x042a:
            java.lang.String r0 = "companion/registration/pair-success/hmac verification failed"
            goto L_0x0434
        L_0x042d:
            java.lang.String r0 = "CompanionRegistrationAdvUtil/verifyDeviceIdentityAccountSignature/invalidKeyException"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f2 }
        L_0x0432:
            java.lang.String r0 = "companion/registration/pair-success/account signature verification failed"
        L_0x0434:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f2 }
            r0 = 6
            r11.A01(r0)     // Catch:{ all -> 0x04f2 }
            X.1fL r3 = r8.A0O     // Catch:{ all -> 0x04f2 }
            r0 = 401(0x191, double:1.98E-321)
            X.C31301fL.A00(r3, r2, r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "companion_pair_success_not_authorized"
            r7.A02(r0, r5)     // Catch:{ all -> 0x04f2 }
            X.2i1 r0 = r8.A0Q     // Catch:{ all -> 0x04f2 }
            X.1OZ r6 = r0.A00     // Catch:{ all -> 0x04f2 }
            r5 = 306(0x132, float:4.29E-43)
            r11 = 2
            X.1MD[] r14 = new X.AnonymousClass1MD[r11]     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = "code"
            r1 = 401(0x191, float:5.62E-43)
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((java.lang.String) r3, (int) r1)     // Catch:{ all -> 0x04f2 }
            r13 = 0
            r14[r4] = r0     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = "text"
            java.lang.String r1 = "not-authorized"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((java.lang.String) r3, (java.lang.String) r1)     // Catch:{ all -> 0x04f2 }
            r14[r2] = r0     // Catch:{ all -> 0x04f2 }
            java.lang.String r12 = "error"
            X.1ca r7 = new X.1ca     // Catch:{ all -> 0x04f2 }
            r7.<init>(r12, r14)     // Catch:{ all -> 0x04f2 }
            r0 = 3
            X.1MD[] r4 = new X.AnonymousClass1MD[r0]     // Catch:{ all -> 0x04f2 }
            java.lang.String r3 = "to"
            X.8v4 r1 = X.C173438v4.A00     // Catch:{ all -> 0x04f2 }
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r3)     // Catch:{ all -> 0x04f2 }
            r4[r13] = r0     // Catch:{ all -> 0x04f2 }
            java.lang.String r1 = "type"
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((java.lang.String) r1, (java.lang.String) r12)     // Catch:{ all -> 0x04f2 }
            r4[r2] = r0     // Catch:{ all -> 0x04f2 }
            X.1MD r0 = new X.1MD     // Catch:{ all -> 0x04f2 }
            r0.<init>((java.lang.String) r10, (java.lang.String) r9)     // Catch:{ all -> 0x04f2 }
            r4[r11] = r0     // Catch:{ all -> 0x04f2 }
            java.lang.String r1 = "iq"
            X.1ca r0 = new X.1ca     // Catch:{ all -> 0x04f2 }
            r0.<init>((X.C29621ca) r7, (java.lang.String) r1, (X.AnonymousClass1MD[]) r4)     // Catch:{ all -> 0x04f2 }
            r6.A0O(r0, r5)     // Catch:{ all -> 0x04f2 }
            java.lang.Runnable r1 = r8.A0E     // Catch:{ all -> 0x04f2 }
            if (r1 == 0) goto L_0x04a2
            X.10I r0 = r8.A0i     // Catch:{ all -> 0x04f2 }
            r0.CEz(r1)     // Catch:{ all -> 0x04f2 }
        L_0x04a2:
            X.10I r4 = r8.A0i     // Catch:{ all -> 0x04f2 }
            r0 = 17
            X.7Pc r3 = new X.7Pc     // Catch:{ all -> 0x04f2 }
            r3.<init>(r8, r0)     // Catch:{ all -> 0x04f2 }
            r0 = 1000(0x3e8, double:4.94E-321)
            X.25d r0 = r4.CGv(r3, r0)     // Catch:{ all -> 0x04f2 }
            r8.A0E = r0     // Catch:{ all -> 0x04f2 }
            goto L_0x04f0
        L_0x04b4:
            r0 = move-exception
            java.lang.String r1 = "companion_pair_success_device_identity_hmac_parsing_failed"
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x04f2 }
            r7.A02(r1, r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity HMAC"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f2 }
            goto L_0x04ed
        L_0x04c4:
            X.AnonymousClass1ZU.A0A()     // Catch:{ all -> 0x04f2 }
            throw r5     // Catch:{ all -> 0x04f2 }
        L_0x04c8:
            java.lang.String r0 = "companion_pair_success_account_already_registered"
            r7.A02(r0, r5)     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = "companion/registration/pair-success/account already registered on device, cancelling registration"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x04f2 }
            java.lang.Object r1 = r16.get()     // Catch:{ all -> 0x04f2 }
            X.1cN r1 = (X.C29491cN) r1     // Catch:{ all -> 0x04f2 }
            com.whatsapp.jid.UserJid r0 = r6.userJid     // Catch:{ all -> 0x04f2 }
            java.lang.String r0 = r0.user     // Catch:{ all -> 0x04f2 }
            r1.A01 = r0     // Catch:{ all -> 0x04f2 }
            goto L_0x04ed
        L_0x04df:
            java.lang.String r0 = "companion/registration/pair-success/failed to parse device identity"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04f2 }
            java.lang.String r1 = "companion_pair_success_failed_parsing_signed_device_identity"
            java.lang.String r0 = r3.getMessage()     // Catch:{ all -> 0x04f2 }
            r7.A02(r1, r0)     // Catch:{ all -> 0x04f2 }
        L_0x04ed:
            r8.A05()     // Catch:{ all -> 0x04f2 }
        L_0x04f0:
            monitor-exit(r8)
            return r2
        L_0x04f2:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x04f5:
            r0 = 244(0xf4, float:3.42E-43)
            if (r1 != r0) goto L_0x08d5
            X.1Tf r0 = r6.A00
            X.11w r3 = X.C26721Tf.A00(r0)
            monitor-enter(r3)
            X.1Dn r4 = r3.A0P     // Catch:{ all -> 0x08d2 }
            int r0 = r4.A00()     // Catch:{ all -> 0x08d2 }
            r6 = 5
            if (r0 != r6) goto L_0x08cb
            X.2BI r0 = r3.A09     // Catch:{ all -> 0x08d2 }
            if (r0 == 0) goto L_0x08cb
            X.1Mn r0 = r3.A0e     // Catch:{ all -> 0x08d2 }
            r0.A00()     // Catch:{ all -> 0x08d2 }
            X.00H r10 = r3.A0o     // Catch:{ all -> 0x08d2 }
            java.lang.Object r1 = r10.get()     // Catch:{ all -> 0x08d2 }
            X.17v r1 = (X.C219017v) r1     // Catch:{ all -> 0x08d2 }
            r0 = 16
            r5 = 0
            r1.A0F(r5, r0)     // Catch:{ all -> 0x08d2 }
            X.C203711w.A01(r3)     // Catch:{ all -> 0x08d2 }
            java.lang.Runnable r1 = r3.A0D     // Catch:{ all -> 0x08d2 }
            if (r1 == 0) goto L_0x052c
            X.10I r0 = r3.A0i     // Catch:{ all -> 0x08d2 }
            r0.CEz(r1)     // Catch:{ all -> 0x08d2 }
        L_0x052c:
            r0 = 7
            r4.A01(r0)     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.DeviceJid r11 = r3.A06     // Catch:{ all -> 0x08d2 }
            X.C17960vV.A07(r11)     // Catch:{ all -> 0x08d2 }
            X.0z4 r9 = r3.A0W     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = r11.user     // Catch:{ all -> 0x08d2 }
            r9.A1d(r0)     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = r11.user     // Catch:{ all -> 0x08d2 }
            java.lang.String r8 = X.C20056A5f.A02(r0)     // Catch:{ all -> 0x08d2 }
            X.C17960vV.A07(r8)     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = r11.user     // Catch:{ all -> 0x08d2 }
            java.lang.String r1 = X.C63942tw.A04(r0)     // Catch:{ all -> 0x08d2 }
            X.C17960vV.A07(r1)     // Catch:{ all -> 0x08d2 }
            int r0 = r8.length()     // Catch:{ all -> 0x08d2 }
            java.lang.String r7 = r1.substring(r0)     // Catch:{ all -> 0x08d2 }
            r9.A1t(r8, r7)     // Catch:{ all -> 0x08d2 }
            r9.A23(r5)     // Catch:{ all -> 0x08d2 }
            r9.A22(r5)     // Catch:{ all -> 0x08d2 }
            X.11R r1 = r3.A0R     // Catch:{ all -> 0x08d2 }
            int r0 = r11.getDevice()     // Catch:{ all -> 0x08d2 }
            r1.A00(r0)     // Catch:{ all -> 0x08d2 }
            X.11Q r12 = r3.A0S     // Catch:{ all -> 0x08d2 }
            X.2BI r0 = r3.A09     // Catch:{ all -> 0x08d2 }
            byte[] r1 = r0.A0M()     // Catch:{ all -> 0x08d2 }
            r0 = 3
            java.lang.String r4 = android.util.Base64.encodeToString(r1, r0)     // Catch:{ all -> 0x08d2 }
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r12)     // Catch:{ all -> 0x08d2 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "adv_signed_identity"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r4)     // Catch:{ all -> 0x08d2 }
            r0.apply()     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = r11.user     // Catch:{ all -> 0x08d2 }
            com.whatsapp.Me r1 = new com.whatsapp.Me     // Catch:{ all -> 0x08d2 }
            r1.<init>(r8, r7, r0)     // Catch:{ all -> 0x08d2 }
            X.11S r8 = r3.A0K     // Catch:{ all -> 0x08d2 }
            r8.A0I()     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "me"
            boolean r0 = X.AnonymousClass11S.A05(r1, r8, r0)     // Catch:{ all -> 0x08d2 }
            r7 = 0
            if (r0 != 0) goto L_0x05ac
            java.lang.String r0 = "companion/registration/complete/save me object failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08d2 }
            X.A15 r1 = r3.A0h     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "companion_store_me_object_failed"
            r1.A02(r0, r7)     // Catch:{ all -> 0x08d2 }
            r3.A05()     // Catch:{ all -> 0x08d2 }
            goto L_0x08d0
        L_0x05ac:
            r8.A0I()     // Catch:{ all -> 0x08d2 }
            X.AnonymousClass11S.A03(r1, r8)     // Catch:{ all -> 0x08d2 }
            java.lang.Object r4 = r10.get()     // Catch:{ all -> 0x08d2 }
            X.17v r4 = (X.C219017v) r4     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.UserJid r1 = r11.userJid     // Catch:{ all -> 0x08d2 }
            boolean r0 = r4.A17     // Catch:{ all -> 0x08d2 }
            if (r0 == 0) goto L_0x05c0
            r4.A05 = r1     // Catch:{ all -> 0x08d2 }
        L_0x05c0:
            X.1Ui r12 = r3.A0g     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.UserJid r13 = r11.userJid     // Catch:{ all -> 0x08d2 }
            java.lang.String r14 = "CompanionRegistrationManagerImpl.onRegistrationSuccess"
            r4 = 0
            r17 = r5
            r15 = r5
            r16 = r2
            r12.A03(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x08d2 }
            X.1Cn r0 = r3.A0Y     // Catch:{ all -> 0x08d2 }
            r0.A00()     // Catch:{ all -> 0x08d2 }
            X.1Hb r1 = r3.A0d     // Catch:{ all -> 0x08d2 }
            boolean r0 = r8.A0N()     // Catch:{ all -> 0x08d2 }
            X.188 r12 = r1.A08     // Catch:{ all -> 0x08d2 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x08d2 }
            X.C18070vi.A0d(r12, r5)     // Catch:{ all -> 0x08d2 }
            r0 = 12027(0x2efb, float:1.6853E-41)
            r12.CHx(r1, r0, r5)     // Catch:{ all -> 0x08d2 }
            r12.CHx(r1, r0, r2)     // Catch:{ all -> 0x08d2 }
            X.1yJ r0 = r3.A07     // Catch:{ all -> 0x08d2 }
            if (r0 == 0) goto L_0x0620
            com.whatsapp.jid.UserJid r13 = r11.userJid     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.PhoneUserJid r13 = (com.whatsapp.jid.PhoneUserJid) r13     // Catch:{ all -> 0x08d2 }
            r8.A0I()     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.PhoneUserJid r0 = r8.A0E     // Catch:{ all -> 0x08d2 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x08d2 }
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x08d2 }
            if (r0 == 0) goto L_0x0610
            X.1yJ r0 = r3.A07     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.UserJid r1 = r0.userJid     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x08d2 }
            X.1E2 r1 = (X.AnonymousClass1E2) r1     // Catch:{ all -> 0x08d2 }
            r8.A0J(r1)     // Catch:{ all -> 0x08d2 }
            goto L_0x0620
        L_0x0610:
            X.1Ln r12 = r3.A0Z     // Catch:{ all -> 0x08d2 }
            X.1yJ r0 = r3.A07     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.UserJid r1 = r0.userJid     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.LidUserJid"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x08d2 }
            X.1E2 r1 = (X.AnonymousClass1E2) r1     // Catch:{ all -> 0x08d2 }
            r12.A0P(r1, r13)     // Catch:{ all -> 0x08d2 }
        L_0x0620:
            r0 = 2
            byte[][] r1 = new byte[r0][]     // Catch:{ 1Ak -> 0x08b6 }
            byte[] r0 = new byte[r2]     // Catch:{ 1Ak -> 0x08b6 }
            r0[r5] = r6     // Catch:{ 1Ak -> 0x08b6 }
            r1[r5] = r0     // Catch:{ 1Ak -> 0x08b6 }
            byte[] r0 = r3.A0G     // Catch:{ 1Ak -> 0x08b6 }
            r1[r2] = r0     // Catch:{ 1Ak -> 0x08b6 }
            byte[] r0 = X.A8G.A05(r1)     // Catch:{ 1Ak -> 0x08b6 }
            X.1jP r0 = X.C63962tz.A01(r0)     // Catch:{ 1Ak -> 0x08b6 }
            X.2kO r7 = new X.2kO     // Catch:{ all -> 0x08d2 }
            r7.<init>(r0)     // Catch:{ all -> 0x08d2 }
            X.1P3 r1 = r3.A0X     // Catch:{ all -> 0x08d2 }
            boolean r0 = r1.A0Y()     // Catch:{ all -> 0x08d2 }
            if (r0 == 0) goto L_0x0727
            com.whatsapp.jid.UserJid r0 = r11.userJid     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x08d2 }
            X.2nE r0 = X.C63962tz.A02(r0)     // Catch:{ all -> 0x08d2 }
            r1.A0a(r7, r0)     // Catch:{ all -> 0x08d2 }
        L_0x064f:
            int r7 = r3.A02     // Catch:{ all -> 0x08d2 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r9)     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "adv_raw_id"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r7)     // Catch:{ all -> 0x08d2 }
            r0.apply()     // Catch:{ all -> 0x08d2 }
            int r7 = r3.A00     // Catch:{ all -> 0x08d2 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r9)     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "adv_current_key_index"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r7)     // Catch:{ all -> 0x08d2 }
            r0.apply()     // Catch:{ all -> 0x08d2 }
            long r0 = r3.A03     // Catch:{ all -> 0x08d2 }
            android.content.SharedPreferences$Editor r11 = X.C19830z4.A00(r9)     // Catch:{ all -> 0x08d2 }
            java.lang.String r7 = "adv_timestamp_sec"
            android.content.SharedPreferences$Editor r0 = r11.putLong(r7, r0)     // Catch:{ all -> 0x08d2 }
            r0.apply()     // Catch:{ all -> 0x08d2 }
            X.11P r0 = r3.A0U     // Catch:{ all -> 0x08d2 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x08d2 }
            android.content.SharedPreferences$Editor r9 = X.C19830z4.A00(r9)     // Catch:{ all -> 0x08d2 }
            java.lang.String r7 = "registration_success_time_ms"
            android.content.SharedPreferences$Editor r0 = r9.putLong(r7, r0)     // Catch:{ all -> 0x08d2 }
            r0.apply()     // Catch:{ all -> 0x08d2 }
            X.1de r0 = r3.A0f     // Catch:{ all -> 0x08d2 }
            r0.A00()     // Catch:{ all -> 0x08d2 }
            X.00H r0 = r3.A0n     // Catch:{ all -> 0x08d2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x08d2 }
            X.1Do r0 = (X.C22881Do) r0     // Catch:{ all -> 0x08d2 }
            r0.A00(r5, r5)     // Catch:{ all -> 0x08d2 }
            X.10x r9 = new X.10x     // Catch:{ all -> 0x08d2 }
            r9.<init>()     // Catch:{ all -> 0x08d2 }
            r8.A0I()     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.PhoneUserJid r0 = r8.A0E     // Catch:{ all -> 0x08d2 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x08d2 }
            com.whatsapp.jid.DeviceJid r7 = r0.getPrimaryDevice()     // Catch:{ all -> 0x08d2 }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x08d2 }
            r9.put(r7, r0)     // Catch:{ all -> 0x08d2 }
            X.10w r1 = r9.build()     // Catch:{ all -> 0x08d2 }
            X.1RK r0 = r3.A0a     // Catch:{ all -> 0x08d2 }
            r0.A0C(r1, r5, r5)     // Catch:{ all -> 0x08d2 }
            java.lang.Object r0 = r10.get()     // Catch:{ all -> 0x08d2 }
            X.17v r0 = (X.C219017v) r0     // Catch:{ all -> 0x08d2 }
            r0.A07()     // Catch:{ all -> 0x08d2 }
            X.1fL r8 = r3.A0O     // Catch:{ all -> 0x08d2 }
            r7 = 3
            r0 = 0
            X.C31301fL.A00(r8, r7, r0)     // Catch:{ all -> 0x08d2 }
            r1 = 13
            X.7KX r0 = new X.7KX     // Catch:{ all -> 0x08d2 }
            r0.<init>(r1)     // Catch:{ all -> 0x08d2 }
            r3.notifyAllObservers(r0)     // Catch:{ all -> 0x08d2 }
            X.00H r0 = r3.A0p     // Catch:{ all -> 0x08d2 }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x08d2 }
            X.2Kj r7 = (X.C47892Kj) r7     // Catch:{ all -> 0x08d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08d2 }
            r1.<init>()     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "RegistrationObservable/notifyRegistrationComplete isCompanionMode="
            r1.append(r0)     // Catch:{ all -> 0x08d2 }
            r1.append(r2)     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x08d2 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08d2 }
            r9 = 2
            X.7KP r0 = new X.7KP     // Catch:{ all -> 0x08d2 }
            r0.<init>(r2, r9)     // Catch:{ all -> 0x08d2 }
            r7.notifyAllObservers(r0)     // Catch:{ all -> 0x08d2 }
            X.2Km r11 = r3.A0N     // Catch:{ all -> 0x08d2 }
            java.util.concurrent.atomic.AtomicInteger r0 = r11.A0A     // Catch:{ all -> 0x08d2 }
            r0.set(r5)     // Catch:{ all -> 0x08d2 }
            X.Af0 r7 = new X.Af0     // Catch:{ all -> 0x08d2 }
            r7.<init>()     // Catch:{ all -> 0x08d2 }
            X.1lA r10 = r11.A02     // Catch:{ all -> 0x08d2 }
            X.Af0 r13 = new X.Af0     // Catch:{ all -> 0x08d2 }
            r13.<init>()     // Catch:{ all -> 0x08d2 }
            r1 = 6
            X.7Nc r0 = new X.7Nc     // Catch:{ all -> 0x08d2 }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x08d2 }
            r13.A09(r0)     // Catch:{ all -> 0x08d2 }
            X.2Zn r0 = new X.2Zn     // Catch:{ all -> 0x08d2 }
            r0.<init>(r13)     // Catch:{ all -> 0x08d2 }
            X.1lB r8 = r10.A03     // Catch:{ all -> 0x08d2 }
            monitor-enter(r8)     // Catch:{ all -> 0x08d2 }
            goto L_0x0739
        L_0x0727:
            X.00H r0 = r3.A0q     // Catch:{ all -> 0x08d2 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x08d2 }
            X.1Ot r1 = (X.C25581Ot) r1     // Catch:{ all -> 0x08d2 }
            X.3DD r0 = new X.3DD     // Catch:{ all -> 0x08d2 }
            r0.<init>(r11, r3, r7, r2)     // Catch:{ all -> 0x08d2 }
            r1.A01(r0)     // Catch:{ all -> 0x08d2 }
            goto L_0x064f
        L_0x0739:
            r8.A00 = r0     // Catch:{ all -> 0x08b3 }
            monitor-exit(r8)     // Catch:{ all -> 0x08d2 }
            X.Aef r0 = new X.Aef     // Catch:{ all -> 0x08d2 }
            r0.<init>(r10, r6)     // Catch:{ all -> 0x08d2 }
            r13.A09(r0)     // Catch:{ all -> 0x08d2 }
            X.11Q r0 = r10.A05     // Catch:{ JSONException -> 0x077b }
            org.json.JSONObject r8 = r0.A02()     // Catch:{ JSONException -> 0x077b }
            android.content.SharedPreferences r6 = X.AnonymousClass11Q.A01(r0)     // Catch:{ JSONException -> 0x077b }
            java.lang.String r0 = "HAS_COMPANION_HISTORY_SYNC_FAILED"
            boolean r0 = r6.getBoolean(r0, r5)     // Catch:{ JSONException -> 0x077b }
            if (r0 == 0) goto L_0x0766
            java.lang.String r6 = "History Sync Failed"
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ JSONException -> 0x077b }
            r0.<init>(r6)     // Catch:{ JSONException -> 0x077b }
            X.5yg r6 = new X.5yg     // Catch:{ JSONException -> 0x077b }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x077b }
        L_0x0762:
            r13.A0B(r6)     // Catch:{ JSONException -> 0x077b }
            goto L_0x0780
        L_0x0766:
            if (r8 == 0) goto L_0x0780
            java.lang.String r0 = "sync_type"
            int r0 = r8.getInt(r0)     // Catch:{ JSONException -> 0x077b }
            if (r0 <= 0) goto L_0x0780
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ JSONException -> 0x077b }
            X.2Dn r6 = new X.2Dn     // Catch:{ JSONException -> 0x077b }
            r6.<init>(r0)     // Catch:{ JSONException -> 0x077b }
            goto L_0x0762
        L_0x077b:
            java.lang.String r0 = "ReceiveHistorySyncManager/ unable to parse history sync companion state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08d2 }
        L_0x0780:
            X.2g1 r8 = r11.A01     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "CompanionSyncdBootstrapManager/startCriticalBootstrapPhase started"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x08d2 }
            X.Af0 r12 = new X.Af0     // Catch:{ all -> 0x08d2 }
            r12.<init>()     // Catch:{ all -> 0x08d2 }
            X.4qx r0 = new X.4qx     // Catch:{ all -> 0x08d2 }
            r0.<init>(r8, r1)     // Catch:{ all -> 0x08d2 }
            r12.A09(r0)     // Catch:{ all -> 0x08d2 }
            X.11S r0 = r8.A00     // Catch:{ all -> 0x08d2 }
            boolean r0 = r0.A0N()     // Catch:{ all -> 0x08d2 }
            if (r0 != 0) goto L_0x07c3
            java.lang.String r1 = "SyncdBooststrap/device is not companion"
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x08d2 }
            r0.<init>(r1)     // Catch:{ all -> 0x08d2 }
            X.5yg r1 = new X.5yg     // Catch:{ all -> 0x08d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x08d2 }
        L_0x07a8:
            r12.A0B(r1)     // Catch:{ all -> 0x08d2 }
        L_0x07ab:
            X.1lk r10 = r11.A03     // Catch:{ all -> 0x08d2 }
            X.Af0 r6 = new X.Af0     // Catch:{ all -> 0x08d2 }
            r6.<init>()     // Catch:{ all -> 0x08d2 }
            X.3AU r0 = new X.3AU     // Catch:{ all -> 0x08d2 }
            r0.<init>()     // Catch:{ all -> 0x08d2 }
            r6.A09(r0)     // Catch:{ all -> 0x08d2 }
            X.2bz r0 = new X.2bz     // Catch:{ all -> 0x08d2 }
            r0.<init>(r6, r10)     // Catch:{ all -> 0x08d2 }
            X.1ll r8 = r10.A01     // Catch:{ all -> 0x08d2 }
            monitor-enter(r8)     // Catch:{ all -> 0x08d2 }
            goto L_0x0812
        L_0x07c3:
            X.11Q r6 = r8.A03     // Catch:{ all -> 0x08d2 }
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r6)     // Catch:{ all -> 0x08d2 }
            java.lang.String r1 = "companion_syncd_critical_bootstrap_state"
            int r0 = r0.getInt(r1, r5)     // Catch:{ all -> 0x08d2 }
            if (r0 == 0) goto L_0x07f3
            android.content.SharedPreferences r0 = X.AnonymousClass11Q.A01(r6)     // Catch:{ all -> 0x08d2 }
            int r1 = r0.getInt(r1, r5)     // Catch:{ all -> 0x08d2 }
            r0 = 3
            if (r1 < r0) goto L_0x07e6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x08d2 }
            X.2Dn r1 = new X.2Dn     // Catch:{ all -> 0x08d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x08d2 }
            goto L_0x07a8
        L_0x07e6:
            java.lang.String r1 = "SyncdBooststrap/state is not completed"
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ all -> 0x08d2 }
            r0.<init>(r1)     // Catch:{ all -> 0x08d2 }
            X.5yg r1 = new X.5yg     // Catch:{ all -> 0x08d2 }
            r1.<init>(r0)     // Catch:{ all -> 0x08d2 }
            goto L_0x07a8
        L_0x07f3:
            X.2ya r1 = new X.2ya     // Catch:{ all -> 0x08d2 }
            r1.<init>(r12, r8, r5)     // Catch:{ all -> 0x08d2 }
            X.1Ta r0 = r8.A01     // Catch:{ all -> 0x08d2 }
            r0.registerObserver(r1)     // Catch:{ all -> 0x08d2 }
            X.4qs r0 = new X.4qs     // Catch:{ all -> 0x08d2 }
            r0.<init>(r8, r1, r9)     // Catch:{ all -> 0x08d2 }
            r12.A09(r0)     // Catch:{ all -> 0x08d2 }
            X.10I r6 = r8.A05     // Catch:{ all -> 0x08d2 }
            r1 = 43
            X.4rg r0 = new X.4rg     // Catch:{ all -> 0x08d2 }
            r0.<init>((java.lang.Object) r8, (int) r1)     // Catch:{ all -> 0x08d2 }
            r6.CGF(r0)     // Catch:{ all -> 0x08d2 }
            goto L_0x07ab
        L_0x0812:
            r8.A00 = r0     // Catch:{ all -> 0x08b3 }
            monitor-exit(r8)     // Catch:{ all -> 0x08d2 }
            r1 = 7
            X.7Nc r0 = new X.7Nc     // Catch:{ all -> 0x08d2 }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x08d2 }
            r6.A09(r0)     // Catch:{ all -> 0x08d2 }
            java.lang.Object r8 = r10.A04     // Catch:{ all -> 0x08d2 }
            monitor-enter(r8)     // Catch:{ all -> 0x08d2 }
            X.11Q r0 = r10.A02     // Catch:{ all -> 0x08b0 }
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)     // Catch:{ all -> 0x08b0 }
            java.lang.String r0 = "has_received_security_notification_setting"
            boolean r0 = r1.getBoolean(r0, r5)     // Catch:{ all -> 0x08b0 }
            if (r0 == 0) goto L_0x083b
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x08b0 }
            X.2Dn r0 = new X.2Dn     // Catch:{ all -> 0x08b0 }
            r0.<init>(r1)     // Catch:{ all -> 0x08b0 }
            r6.A0B(r0)     // Catch:{ all -> 0x08b0 }
        L_0x083b:
            monitor-exit(r8)     // Catch:{ all -> 0x08b0 }
            X.7Nc r0 = new X.7Nc     // Catch:{ all -> 0x08d2 }
            r0.<init>(r11, r9)     // Catch:{ all -> 0x08d2 }
            r13.A09(r0)     // Catch:{ all -> 0x08d2 }
            r8 = 3
            X.7Nc r0 = new X.7Nc     // Catch:{ all -> 0x08d2 }
            r0.<init>(r11, r8)     // Catch:{ all -> 0x08d2 }
            r12.A09(r0)     // Catch:{ all -> 0x08d2 }
            r1 = 4
            X.7Nc r0 = new X.7Nc     // Catch:{ all -> 0x08d2 }
            r0.<init>(r11, r1)     // Catch:{ all -> 0x08d2 }
            r6.A09(r0)     // Catch:{ all -> 0x08d2 }
            X.Af0[] r0 = new X.C21132Af0[r8]     // Catch:{ all -> 0x08d2 }
            r0[r5] = r12     // Catch:{ all -> 0x08d2 }
            r0[r2] = r13     // Catch:{ all -> 0x08d2 }
            r0[r9] = r6     // Catch:{ all -> 0x08d2 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ all -> 0x08d2 }
            X.8fc r5 = new X.8fc     // Catch:{ all -> 0x08d2 }
            r5.<init>(r0)     // Catch:{ all -> 0x08d2 }
            java.io.PrintStream r9 = java.lang.System.out     // Catch:{ all -> 0x08d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x08d2 }
            r1.<init>()     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = "before schedule: waWorker="
            r1.append(r0)     // Catch:{ all -> 0x08d2 }
            X.10I r8 = r11.A09     // Catch:{ all -> 0x08d2 }
            int r0 = java.lang.System.identityHashCode(r8)     // Catch:{ all -> 0x08d2 }
            r1.append(r0)     // Catch:{ all -> 0x08d2 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x08d2 }
            r9.println(r0)     // Catch:{ all -> 0x08d2 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x08d2 }
            X.18O r1 = r11.A00     // Catch:{ all -> 0x08d2 }
            X.18Q r0 = X.AnonymousClass18O.A15     // Catch:{ all -> 0x08d2 }
            int r0 = r1.A04(r0)     // Catch:{ all -> 0x08d2 }
            long r0 = (long) r0     // Catch:{ all -> 0x08d2 }
            long r0 = r9.toMillis(r0)     // Catch:{ all -> 0x08d2 }
            X.3Cr r10 = new X.3Cr     // Catch:{ all -> 0x08d2 }
            r14 = r6
            r15 = r2
            r10.<init>((java.lang.Object) r11, (java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r14, (int) r15)     // Catch:{ all -> 0x08d2 }
            X.25d r1 = r8.CGv(r10, r0)     // Catch:{ all -> 0x08d2 }
            X.3AW r0 = new X.3AW     // Catch:{ all -> 0x08d2 }
            r0.<init>(r7, r11, r1, r4)     // Catch:{ all -> 0x08d2 }
            r5.A09(r0)     // Catch:{ all -> 0x08d2 }
            r1 = 10
            X.7Nc r0 = new X.7Nc     // Catch:{ all -> 0x08d2 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x08d2 }
            r7.A09(r0)     // Catch:{ all -> 0x08d2 }
            goto L_0x08d0
        L_0x08b0:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x08b0 }
            goto L_0x08b5
        L_0x08b3:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x08d2 }
        L_0x08b5:
            throw r0     // Catch:{ all -> 0x08d2 }
        L_0x08b6:
            r5 = move-exception
            java.lang.String r0 = "companion/registration/complete/failed to save primary public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08d2 }
            X.A15 r4 = r3.A0h     // Catch:{ all -> 0x08d2 }
            java.lang.String r1 = "companion_pub_key_store_failed"
            java.lang.String r0 = r5.getMessage()     // Catch:{ all -> 0x08d2 }
            r4.A02(r1, r0)     // Catch:{ all -> 0x08d2 }
            r3.A0A(r7, r2, r2)     // Catch:{ all -> 0x08d2 }
            goto L_0x08d0
        L_0x08cb:
            java.lang.String r0 = "companion/registration/complete/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x08d2 }
        L_0x08d0:
            monitor-exit(r3)
            return r2
        L_0x08d2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x08d5:
            r0 = 245(0xf5, float:3.43E-43)
            if (r1 != r0) goto L_0x0a09
            X.1Tf r0 = r6.A00
            X.11w r6 = X.C26721Tf.A00(r0)
            monitor-enter(r6)
            X.1fL r4 = r6.A0O     // Catch:{ all -> 0x0a06 }
            r3 = 2
            r0 = 516(0x204, double:2.55E-321)
            X.C31301fL.A00(r4, r3, r0)     // Catch:{ all -> 0x0a06 }
            X.1Dn r0 = r6.A0P     // Catch:{ all -> 0x0a06 }
            int r5 = r0.A00()     // Catch:{ all -> 0x0a06 }
            X.A15 r4 = r6.A0h     // Catch:{ all -> 0x0a06 }
            java.lang.String r3 = "companion_registration_failed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a06 }
            r1.<init>()     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = "State="
            r1.append(r0)     // Catch:{ all -> 0x0a06 }
            r1.append(r5)     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a06 }
            r4.A02(r3, r0)     // Catch:{ all -> 0x0a06 }
            r0 = 5
            if (r5 == r0) goto L_0x092b
            r0 = 6
            if (r5 == r0) goto L_0x092b
            java.lang.String r0 = "companion/registration/complete/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0a06 }
            goto L_0x0a04
        L_0x0913:
            java.lang.String r0 = "companion/registration/refs/reconnected"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0a06 }
            r5.A01(r9)     // Catch:{ all -> 0x0a06 }
            X.C203711w.A01(r6)     // Catch:{ all -> 0x0a06 }
        L_0x091e:
            int r0 = r11.size()     // Catch:{ all -> 0x0a06 }
            r3 = 0
            r8 = 6
            if (r0 == r8) goto L_0x0930
            java.lang.String r0 = "companion_refs_received_invalid_keys"
            r4.A02(r0, r3)     // Catch:{ all -> 0x0a06 }
        L_0x092b:
            r6.A05()     // Catch:{ all -> 0x0a06 }
            goto L_0x0a04
        L_0x0930:
            r5.A01(r10)     // Catch:{ all -> 0x0a06 }
            X.2i1 r0 = r6.A0Q     // Catch:{ all -> 0x0a06 }
            r0.A00(r1)     // Catch:{ all -> 0x0a06 }
            java.lang.Runnable r1 = r6.A0C     // Catch:{ all -> 0x0a06 }
            if (r1 == 0) goto L_0x0941
            X.10I r0 = r6.A0i     // Catch:{ all -> 0x0a06 }
            r0.CEz(r1)     // Catch:{ all -> 0x0a06 }
        L_0x0941:
            X.10I r7 = r6.A0i     // Catch:{ all -> 0x0a06 }
            r0 = 16
            X.7Pc r5 = new X.7Pc     // Catch:{ all -> 0x0a06 }
            r5.<init>(r6, r0)     // Catch:{ all -> 0x0a06 }
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            X.25d r0 = r7.CGv(r5, r0)     // Catch:{ all -> 0x0a06 }
            r6.A0C = r0     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = "HmacSHA256"
            javax.crypto.KeyGenerator r0 = javax.crypto.KeyGenerator.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0964 }
            javax.crypto.SecretKey r0 = r0.generateKey()     // Catch:{ NoSuchAlgorithmException -> 0x0964 }
            byte[] r0 = r0.getEncoded()     // Catch:{ NoSuchAlgorithmException -> 0x0964 }
            r6.A0H = r0     // Catch:{ NoSuchAlgorithmException -> 0x0964 }
            goto L_0x096f
        L_0x0964:
            java.lang.String r0 = "companion/registration/qr/failed to get keys"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = "companion_refs_received_keygen_failed"
            r4.A02(r0, r3)     // Catch:{ all -> 0x0a06 }
            goto L_0x092b
        L_0x096f:
            X.1Cw r0 = r6.A0J     // Catch:{ all -> 0x0a06 }
            X.AlW r0 = r0.A0E()     // Catch:{ all -> 0x0a06 }
            X.AlU r13 = r0.A02     // Catch:{ all -> 0x0a06 }
            r12 = 0
            r5 = 0
        L_0x0979:
            java.lang.String r4 = "%s,%s,%s,%s,%s"
            r0 = 5
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ all -> 0x0a06 }
            java.lang.Object r0 = r11.get(r5)     // Catch:{ all -> 0x0a06 }
            r3[r12] = r0     // Catch:{ all -> 0x0a06 }
            byte[] r0 = r13.A01     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x0a06 }
            r3[r2] = r0     // Catch:{ all -> 0x0a06 }
            X.2cG r0 = r6.A05     // Catch:{ all -> 0x0a06 }
            X.C17960vV.A07(r0)     // Catch:{ all -> 0x0a06 }
            X.2kO r0 = r0.A01     // Catch:{ all -> 0x0a06 }
            X.1jP r0 = r0.A00     // Catch:{ all -> 0x0a06 }
            byte[] r0 = r0.A00     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x0a06 }
            r3[r9] = r0     // Catch:{ all -> 0x0a06 }
            byte[] r0 = r6.A0H     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)     // Catch:{ all -> 0x0a06 }
            r3[r10] = r0     // Catch:{ all -> 0x0a06 }
            X.00H r0 = r6.A0k     // Catch:{ all -> 0x0a06 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0a06 }
            X.2km r0 = (X.C58492km) r0     // Catch:{ all -> 0x0a06 }
            java.lang.Integer r0 = r0.A00()     // Catch:{ all -> 0x0a06 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0a06 }
            if (r0 == r12) goto L_0x09bd
            if (r0 == r9) goto L_0x09ba
            goto L_0x09c0
        L_0x09ba:
            java.lang.String r1 = "f"
            goto L_0x09c2
        L_0x09bd:
            java.lang.String r1 = "e"
            goto L_0x09c2
        L_0x09c0:
            java.lang.String r1 = "d"
        L_0x09c2:
            r0 = 4
            r3[r0] = r1     // Catch:{ all -> 0x0a06 }
            java.lang.String r14 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0a06 }
            int r15 = r5 * 20000
            long r3 = (long) r15     // Catch:{ all -> 0x0a06 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a06 }
            r1.<init>()     // Catch:{ all -> 0x0a06 }
            java.lang.String r0 = "CompanionRegistrationManager/refChangeRunnable"
            r1.append(r0)     // Catch:{ all -> 0x0a06 }
            r1.append(r15)     // Catch:{ all -> 0x0a06 }
            r1.toString()     // Catch:{ all -> 0x0a06 }
            X.7Qs r0 = new X.7Qs     // Catch:{ all -> 0x0a06 }
            r0.<init>(r2, r14, r6)     // Catch:{ all -> 0x0a06 }
            X.25d r1 = r7.CGv(r0, r3)     // Catch:{ all -> 0x0a06 }
            java.util.List r0 = r6.A0s     // Catch:{ all -> 0x0a06 }
            r0.add(r1)     // Catch:{ all -> 0x0a06 }
            int r5 = r5 + 1
            if (r5 < r8) goto L_0x0979
            X.00H r0 = r6.A0m     // Catch:{ all -> 0x0a06 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0a06 }
            X.9nI r0 = (X.C191849nI) r0     // Catch:{ all -> 0x0a06 }
            r0.A00()     // Catch:{ all -> 0x0a06 }
            X.00H r0 = r6.A0l     // Catch:{ all -> 0x0a06 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0a06 }
            X.9nH r0 = (X.C191839nH) r0     // Catch:{ all -> 0x0a06 }
            r0.A00()     // Catch:{ all -> 0x0a06 }
        L_0x0a04:
            monitor-exit(r6)
        L_0x0a05:
            return r2
        L_0x0a06:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0a09:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33951je.BcT(android.os.Message, int):boolean");
    }

    public C33951je(C26721Tf r1) {
        this.A00 = r1;
    }
}
