package X;

/* renamed from: X.1R5  reason: invalid class name */
public class AnonymousClass1R5 implements AnonymousClass1R4 {
    public final AnonymousClass11S A00;
    public final AnonymousClass1M9 A01;
    public final C24921Me A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass118 A04;
    public final AnonymousClass1QB A05;
    public final AnonymousClass1Q2 A06;
    public final AnonymousClass1R3 A07;
    public final AnonymousClass1QL A08;
    public final AnonymousClass1QS A09;
    public final AnonymousClass1QE A0A = AnonymousClass1QE.A00("PaymentStatusNotifier", "notification", "COMMON");
    public final AnonymousClass1R2 A0B;
    public final AnonymousClass1PP A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass1Cd A0F;
    public final AnonymousClass1QO A0G;

    /* JADX WARNING: type inference failed for: r7v1, types: [X.20i, X.2MH, X.206] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00af */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0169 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void A00() {
        /*
            r17 = this;
            r4 = r17
            monitor-enter(r4)
            X.00H r0 = r4.A0D     // Catch:{ all -> 0x01e9 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x01e9 }
            X.121 r5 = (X.AnonymousClass121) r5     // Catch:{ all -> 0x01e9 }
            X.1QS r3 = r4.A09     // Catch:{ all -> 0x01e9 }
            X.AnonymousClass1QS.A00(r3)     // Catch:{ all -> 0x01e9 }
            X.1QR r6 = r3.A04     // Catch:{ all -> 0x01e9 }
            monitor-enter(r6)     // Catch:{ all -> 0x01e9 }
            X.11P r2 = r6.A01     // Catch:{ all -> 0x01e6 }
            long r15 = X.AnonymousClass11P.A01(r2)     // Catch:{ all -> 0x01e6 }
            java.util.ArrayList r1 = r6.A0R()     // Catch:{ all -> 0x01e6 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x01e6 }
            r7.<init>()     // Catch:{ all -> 0x01e6 }
            X.1Cd r0 = r6.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x00af }
            X.1au r8 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00af }
            X.1xA r14 = r8.BD0()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r13 = r1.iterator()     // Catch:{ all -> 0x009b }
        L_0x0030:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0091
            java.lang.Object r10 = r13.next()     // Catch:{ all -> 0x009b }
            X.AW0 r10 = (X.AW0) r10     // Catch:{ all -> 0x009b }
            X.8pG r0 = r10.A0A     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0048
            long r11 = r0.A0A()     // Catch:{ all -> 0x009b }
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 >= 0) goto L_0x0030
        L_0x0048:
            android.content.ContentValues r11 = new android.content.ContentValues     // Catch:{ all -> 0x009b }
            r11.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x009b }
            X.AnonymousClass1QR.A07(r1, r0)     // Catch:{ all -> 0x009b }
            java.lang.String r1 = "status"
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x009b }
            r11.put(r1, r0)     // Catch:{ all -> 0x009b }
            java.lang.String r12 = "timestamp"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r15 / r0
            int r9 = (int) r0     // Catch:{ all -> 0x009b }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x009b }
            r11.put(r12, r0)     // Catch:{ all -> 0x009b }
            X.1QE r9 = r6.A04     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "expireOldPendingRequests key id:"
            r1.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x009b }
            r1.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x009b }
            r9.A06(r0)     // Catch:{ all -> 0x009b }
            int r0 = X.AnonymousClass1QR.A00(r11, r8, r10)     // Catch:{ all -> 0x009b }
            if (r0 <= 0) goto L_0x0030
            r7.add(r10)     // Catch:{ all -> 0x009b }
            goto L_0x0030
        L_0x0091:
            r14.A00()     // Catch:{ all -> 0x009b }
            r14.close()     // Catch:{ all -> 0x00a5 }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00af }
            goto L_0x00b6
        L_0x009b:
            r1 = move-exception
            r14.close()     // Catch:{ all -> 0x00a0 }
            goto L_0x00a4
        L_0x00a0:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x00a5 }
        L_0x00a4:
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x00af }
        L_0x00ae:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x00af }
        L_0x00af:
            X.1QE r1 = r6.A04     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "expireOldPendingRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x01e6 }
        L_0x00b6:
            monitor-exit(r6)     // Catch:{ all -> 0x01e9 }
            X.AnonymousClass1QS.A00(r3)     // Catch:{ all -> 0x01e9 }
            monitor-enter(r6)     // Catch:{ all -> 0x01e9 }
            long r14 = X.AnonymousClass11P.A01(r2)     // Catch:{ all -> 0x01e6 }
            r1 = 1
            java.lang.Integer[] r3 = new java.lang.Integer[r1]     // Catch:{ all -> 0x01e6 }
            r0 = 20
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e6 }
            r2 = 0
            r3[r2] = r0     // Catch:{ all -> 0x01e6 }
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ all -> 0x01e6 }
            r0 = 40
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x01e6 }
            r1[r2] = r0     // Catch:{ all -> 0x01e6 }
            r0 = -1
            java.util.List r1 = r6.A0X(r3, r1, r0)     // Catch:{ all -> 0x01e6 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x01e6 }
            r3.<init>()     // Catch:{ all -> 0x01e6 }
            X.1Cd r0 = r6.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169 }
            X.1au r8 = r0.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169 }
            X.1xA r13 = r8.BD0()     // Catch:{ all -> 0x015f }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ all -> 0x0155 }
        L_0x00ed:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x014b
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x0155 }
            X.AW0 r10 = (X.AW0) r10     // Catch:{ all -> 0x0155 }
            X.8pG r0 = r10.A0A     // Catch:{ all -> 0x0155 }
            if (r0 == 0) goto L_0x0105
            long r1 = r0.A0A()     // Catch:{ all -> 0x0155 }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ed
        L_0x0105:
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x0155 }
            r9.<init>()     // Catch:{ all -> 0x0155 }
            java.lang.String r1 = r10.A0L     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r10.A0K     // Catch:{ all -> 0x0155 }
            X.AnonymousClass1QR.A07(r1, r0)     // Catch:{ all -> 0x0155 }
            java.lang.String r1 = "status"
            r0 = 16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0155 }
            r9.put(r1, r0)     // Catch:{ all -> 0x0155 }
            java.lang.String r11 = "timestamp"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r14 / r0
            int r2 = (int) r0     // Catch:{ all -> 0x0155 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0155 }
            r9.put(r11, r0)     // Catch:{ all -> 0x0155 }
            X.1QE r2 = r6.A04     // Catch:{ all -> 0x0155 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0155 }
            r1.<init>()     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = "expireOldPendingRequests key id:"
            r1.append(r0)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r10.A0L     // Catch:{ all -> 0x0155 }
            r1.append(r0)     // Catch:{ all -> 0x0155 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0155 }
            r2.A06(r0)     // Catch:{ all -> 0x0155 }
            X.AnonymousClass1QR.A00(r9, r8, r10)     // Catch:{ all -> 0x0155 }
            r3.add(r10)     // Catch:{ all -> 0x0155 }
            goto L_0x00ed
        L_0x014b:
            r13.A00()     // Catch:{ all -> 0x0155 }
            r13.close()     // Catch:{ all -> 0x015f }
            r8.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169 }
            goto L_0x0170
        L_0x0155:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x015a }
            goto L_0x015e
        L_0x015a:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x015f }
        L_0x015e:
            throw r1     // Catch:{ all -> 0x015f }
        L_0x015f:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0164 }
            goto L_0x0168
        L_0x0164:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169 }
        L_0x0168:
            throw r1     // Catch:{ SQLiteDatabaseCorruptException -> 0x0169 }
        L_0x0169:
            X.1QE r1 = r6.A04     // Catch:{ all -> 0x01e6 }
            java.lang.String r0 = "expirePendingMandateRequests failed."
            r1.A05(r0)     // Catch:{ all -> 0x01e6 }
        L_0x0170:
            monitor-exit(r6)     // Catch:{ all -> 0x01e9 }
            r7.addAll(r3)     // Catch:{ all -> 0x01e9 }
            java.util.Iterator r8 = r7.iterator()     // Catch:{ all -> 0x01e9 }
        L_0x0178:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x01e4
            java.lang.Object r6 = r8.next()     // Catch:{ all -> 0x01e9 }
            X.AW0 r6 = (X.AW0) r6     // Catch:{ all -> 0x01e9 }
            X.1PP r2 = r4.A0C     // Catch:{ all -> 0x01e9 }
            X.1BI r1 = r6.A0C     // Catch:{ all -> 0x01e9 }
            r0 = 1
            X.205 r3 = r2.A01(r1, r0)     // Catch:{ all -> 0x01e9 }
            X.11P r0 = r4.A03     // Catch:{ all -> 0x01e9 }
            long r0 = X.AnonymousClass11P.A01(r0)     // Catch:{ all -> 0x01e9 }
            r2 = 44
            X.2MH r7 = new X.2MH     // Catch:{ all -> 0x01e9 }
            r7.<init>(r3, r2, r0)     // Catch:{ all -> 0x01e9 }
            com.whatsapp.jid.UserJid r0 = r6.A0D     // Catch:{ all -> 0x01e9 }
            r7.A01 = r0     // Catch:{ all -> 0x01e9 }
            com.whatsapp.jid.UserJid r0 = r6.A0E     // Catch:{ all -> 0x01e9 }
            r7.A00 = r0     // Catch:{ all -> 0x01e9 }
            java.lang.String r1 = r6.A0I     // Catch:{ all -> 0x01e9 }
            X.1KN r0 = r6.A09     // Catch:{ all -> 0x01e9 }
            java.lang.String r0 = X.AnonymousClass1R2.A09(r0, r1)     // Catch:{ all -> 0x01e9 }
            r7.A03 = r0     // Catch:{ all -> 0x01e9 }
            X.1BI r3 = r6.A0C     // Catch:{ all -> 0x01e9 }
            boolean r2 = r6.A0Q     // Catch:{ all -> 0x01e9 }
            java.lang.String r1 = r6.A0L     // Catch:{ all -> 0x01e9 }
            X.205 r0 = new X.205     // Catch:{ all -> 0x01e9 }
            r0.<init>(r3, r1, r2)     // Catch:{ all -> 0x01e9 }
            r7.A02 = r0     // Catch:{ all -> 0x01e9 }
            X.205 r0 = r7.A0v     // Catch:{ all -> 0x01e9 }
            X.1BI r0 = r0.A00     // Catch:{ all -> 0x01e9 }
            if (r0 == 0) goto L_0x0178
            r2 = 16
            r5.BBZ(r7, r2)     // Catch:{ all -> 0x01e9 }
            X.00H r0 = r4.A0E     // Catch:{ all -> 0x01e2 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01e2 }
            X.2lL r0 = (X.C58842lL) r0     // Catch:{ all -> 0x01e2 }
            X.206 r1 = r0.A00(r6)     // Catch:{ all -> 0x01e2 }
            if (r1 == 0) goto L_0x0178
            r6.A02 = r2     // Catch:{ all -> 0x01e2 }
            X.AnonymousClass25B.A02(r6, r1)     // Catch:{ all -> 0x01e2 }
            X.1Q2 r0 = r4.A06     // Catch:{ all -> 0x01e2 }
            r0.A01(r1, r2)     // Catch:{ all -> 0x01e2 }
            X.1QB r0 = r4.A05     // Catch:{ all -> 0x01e2 }
            r0.A0L(r1)     // Catch:{ all -> 0x01e2 }
            goto L_0x0178
        L_0x01e2:
            r0 = move-exception
            goto L_0x01e8
        L_0x01e4:
            monitor-exit(r4)
            return
        L_0x01e6:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01e9 }
        L_0x01e8:
            throw r0     // Catch:{ all -> 0x01e9 }
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R5.A00():void");
    }

    /* JADX WARNING: type inference failed for: r10v1, types: [X.2Mi, X.20i, X.2MH, java.lang.Object] */
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0211  */
    public void Bvh() {
        /*
            r22 = this;
            r4 = r22
            X.11S r0 = r4.A00
            r0.A0I()
            com.whatsapp.Me r0 = r0.A00
            if (r0 == 0) goto L_0x048d
            X.1QO r1 = r4.A0G
            r0 = 0
            boolean r0 = r1.A04(r0)
            if (r0 == 0) goto L_0x048d
            X.1Cd r0 = r4.A0F
            r0.A06()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x048d
            X.1QS r7 = r4.A09
            X.BD1 r0 = r7.A06()
            X.3M8 r0 = r0.BPV()
            if (r0 == 0) goto L_0x002f
            boolean r0 = r0.CLf()
            if (r0 == 0) goto L_0x00d6
        L_0x002f:
            X.1QL r0 = r4.A08
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x00d6
            X.BD1 r0 = r7.A06()
            X.2gR r3 = r0.BWw()
            if (r3 == 0) goto L_0x00d6
            X.00H r0 = r4.A0D
            java.lang.Object r2 = r0.get()
            X.121 r2 = (X.AnonymousClass121) r2
            X.AnonymousClass1QS.A00(r7)
            X.1QR r0 = r7.A04
            monitor-enter(r0)
            r1 = 1
            java.lang.String[] r15 = new java.lang.String[r1]     // Catch:{ all -> 0x0489 }
            r1 = 102(0x66, float:1.43E-43)
            java.lang.String r5 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0489 }
            r1 = 0
            r15[r1] = r5     // Catch:{ all -> 0x0489 }
            X.1Cd r1 = r0.A03     // Catch:{ IllegalStateException -> 0x00b9 }
            X.1at r10 = r1.get()     // Catch:{ IllegalStateException -> 0x00b9 }
            r1 = r10
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x00af }
            X.1Ev r11 = r1.A02     // Catch:{ all -> 0x00af }
            java.lang.String r12 = "pay_transaction"
            java.lang.String[] r13 = X.AnonymousClass1QR.A0D     // Catch:{ all -> 0x00af }
            java.lang.String r14 = "status=? AND metadata LIKE '%expiryTs%'"
            java.lang.String r17 = "timestamp ASC"
            java.lang.String r18 = "100"
            java.lang.String r19 = "readUnacceptedTransactions/QUERY_PAY_TRANSACTION"
            r16 = 0
            android.database.Cursor r8 = r11.A0B(r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00af }
            java.lang.String r1 = "readUnacceptedTransactions"
            java.util.ArrayList r9 = X.AnonymousClass1QR.A0B(r8, r0, r1)     // Catch:{ all -> 0x00a3 }
            X.1QE r6 = r0.A04     // Catch:{ all -> 0x00a3 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a3 }
            r5.<init>()     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = "readUnacceptedTransactions returned: "
            r5.append(r1)     // Catch:{ all -> 0x00a3 }
            int r1 = r9.size()     // Catch:{ all -> 0x00a3 }
            r5.append(r1)     // Catch:{ all -> 0x00a3 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00a3 }
            r6.A06(r1)     // Catch:{ all -> 0x00a3 }
            if (r8 == 0) goto L_0x009f
            r8.close()     // Catch:{ all -> 0x00af }
        L_0x009f:
            r10.close()     // Catch:{ IllegalStateException -> 0x00b9 }
            goto L_0x00c6
        L_0x00a3:
            r5 = move-exception
            if (r8 == 0) goto L_0x00ae
            r8.close()     // Catch:{ all -> 0x00aa }
            goto L_0x00ae
        L_0x00aa:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r5, r1)     // Catch:{ all -> 0x00af }
        L_0x00ae:
            throw r5     // Catch:{ all -> 0x00af }
        L_0x00af:
            r5 = move-exception
            r10.close()     // Catch:{ all -> 0x00b4 }
            goto L_0x00b8
        L_0x00b4:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r5, r1)     // Catch:{ IllegalStateException -> 0x00b9 }
        L_0x00b8:
            throw r5     // Catch:{ IllegalStateException -> 0x00b9 }
        L_0x00b9:
            r6 = move-exception
            X.1QE r5 = r0.A04     // Catch:{ all -> 0x0489 }
            java.lang.String r1 = "readUnacceptedTransactions/IllegalStateException "
            r5.A0A(r1, r6)     // Catch:{ all -> 0x0489 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0489 }
            r9.<init>()     // Catch:{ all -> 0x0489 }
        L_0x00c6:
            monitor-exit(r0)
            int r0 = r9.size()
            if (r0 != 0) goto L_0x00e1
            X.1QE r2 = r4.A0A
            java.lang.String r1 = "sendAcceptPaymentReminderNotificationsIfNeeded skipped. No pending transaction with expiry timestamp."
            r0 = 0
            X.AnonymousClass1QE.A02(r2, r0, r1)
        L_0x00d6:
            r4.A00()
            X.AnonymousClass1QS.A00(r7)
            X.1QR r0 = r7.A04
            monitor-enter(r0)
            goto L_0x0311
        L_0x00e1:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r17 = r9.iterator()
        L_0x00ea:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x02fb
            java.lang.Object r9 = r17.next()
            X.AW0 r9 = (X.AW0) r9
            X.8pG r0 = r9.A0A
            if (r0 == 0) goto L_0x02f7
            long r0 = r0.A0A()
            java.lang.String r6 = java.lang.String.valueOf(r0)
        L_0x0102:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "PAY: BrazilPaymentStatusNotificationHelper/buildPaymentReminders - transaction transferred at: "
            r5.append(r0)
            long r0 = r9.A05
            r5.append(r0)
            java.lang.String r0 = ", expired at: "
            r5.append(r0)
            r5.append(r6)
            java.lang.String r0 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1R2 r12 = r3.A05
            java.lang.Long r16 = r12.A0P(r9)
            if (r16 == 0) goto L_0x0178
            java.lang.String r6 = r9.A0L
            long r13 = r16.longValue()
            r10 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x02df
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x02df
            org.json.JSONObject r1 = r3.A00
            if (r1 != 0) goto L_0x015c
            X.1QD r0 = r3.A04
            android.content.SharedPreferences r5 = r0.A03()
            java.lang.String r1 = "payments_nagged_transactions"
            java.lang.String r0 = ""
            java.lang.String r0 = r5.getString(r1, r0)
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0155 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0155 }
            r3.A00 = r1     // Catch:{ Exception -> 0x0155 }
            goto L_0x015c
        L_0x0155:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r3.A00 = r1
        L_0x015c:
            boolean r0 = r1.optBoolean(r6)
            if (r0 != 0) goto L_0x02df
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Calendar r1 = java.util.Calendar.getInstance(r0)
            r0 = 11
            int r1 = r1.get(r0)
            r0 = 9
            if (r1 < r0) goto L_0x02df
            r0 = 21
            if (r1 >= r0) goto L_0x02df
        L_0x0178:
            com.whatsapp.jid.UserJid r5 = r9.A0E
            if (r5 == 0) goto L_0x00ea
            X.1Me r1 = r3.A02
            X.1M9 r0 = r3.A01
            X.1E7 r0 = r0.A0H(r5)
            java.lang.String r11 = r1.A0I(r0)
            X.1PP r5 = r3.A06
            X.1BI r1 = r9.A0C
            r0 = 1
            X.205 r6 = r5.A01(r1, r0)
            X.11P r0 = r3.A03
            long r0 = X.AnonymousClass11P.A01(r0)
            r5 = 39
            X.2Mi r10 = new X.2Mi
            r10.<init>(r6, r5, r0)
            r1 = 3
            java.lang.Comparable[] r6 = new java.lang.Comparable[r1]
            r5 = 0
            com.whatsapp.jid.UserJid r0 = r9.A0E
            r6[r5] = r0
            r5 = 1
            java.lang.String r0 = r9.A0I
            r6[r5] = r0
            X.1KN r0 = r9.A09
            java.lang.String r5 = ""
            r13 = r5
            if (r0 != 0) goto L_0x0299
            r1 = r5
        L_0x01b3:
            r0 = 2
            r6[r0] = r1
            java.util.List r1 = java.util.Arrays.asList(r6)
            java.lang.String r0 = ";"
            java.lang.String r0 = android.text.TextUtils.join(r0, r1)
            r10.A02 = r0
            java.lang.String r1 = r9.A0I
            X.1KN r0 = r9.A09
            java.lang.String r0 = X.AnonymousClass1R2.A09(r0, r1)
            r10.A03 = r0
            X.1KN r0 = r9.A09
            if (r0 == 0) goto L_0x01da
            java.math.BigDecimal r0 = r0.A00
            int r0 = r0.intValue()
            java.lang.String r5 = java.lang.String.valueOf(r0)
        L_0x01da:
            r10.A01 = r5
            long r5 = r9.A05
            X.11P r0 = r12.A03
            long r0 = X.AnonymousClass11P.A01(r0)
            r14 = 7
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            int r0 = X.A87.A00(r15, r0, r5)
            if (r0 != 0) goto L_0x0229
            X.0vb r1 = r12.A05
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 272(0x110, float:3.81E-43)
        L_0x01f7:
            java.lang.String r0 = r1.A08(r0)
            X.C18070vi.A0X(r0)
        L_0x01fe:
            r10.A04 = r0
            r10.A03 = r11
            X.1BI r5 = r9.A0C
            boolean r1 = r9.A0Q
            java.lang.String r6 = r9.A0L
            X.205 r0 = new X.205
            r0.<init>(r5, r6, r1)
            r10.A02 = r0
            if (r16 == 0) goto L_0x02da
            int r0 = r16.intValue()
            r10.A00 = r0
            org.json.JSONObject r5 = r3.A00
            if (r5 != 0) goto L_0x02b8
            X.1QD r0 = r3.A04
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payments_nagged_transactions"
            java.lang.String r0 = r1.getString(r0, r13)
            goto L_0x02a9
        L_0x0229:
            r1 = 1
            if (r0 != r1) goto L_0x0235
            X.0vb r1 = r12.A05
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            r0 = 298(0x12a, float:4.18E-43)
            goto L_0x01f7
        L_0x0235:
            if (r0 >= r14) goto L_0x0245
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTimeInMillis(r5)
            int r0 = r0.get(r14)
            switch(r0) {
                case 1: goto L_0x028c;
                case 2: goto L_0x0284;
                case 3: goto L_0x027c;
                case 4: goto L_0x0274;
                case 5: goto L_0x026c;
                case 6: goto L_0x0264;
                case 7: goto L_0x025c;
                default: goto L_0x0245;
            }
        L_0x0245:
            X.118 r0 = r12.A04
            android.content.Context r15 = r0.A00
            r14 = 2131897064(0x7f122ae8, float:1.9429007E38)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            X.0vb r0 = r12.A05
            java.lang.String r5 = X.AnonymousClass11X.A02(r0, r5)
            r0 = 0
            r1[r0] = r5
            java.lang.String r0 = r15.getString(r14, r1)
            goto L_0x01fe
        L_0x025c:
            X.118 r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131897067(0x7f122aeb, float:1.9429013E38)
            goto L_0x0293
        L_0x0264:
            X.118 r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131897065(0x7f122ae9, float:1.9429009E38)
            goto L_0x0293
        L_0x026c:
            X.118 r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131897069(0x7f122aed, float:1.9429017E38)
            goto L_0x0293
        L_0x0274:
            X.118 r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131897071(0x7f122aef, float:1.9429021E38)
            goto L_0x0293
        L_0x027c:
            X.118 r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131897070(0x7f122aee, float:1.942902E38)
            goto L_0x0293
        L_0x0284:
            X.118 r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131897066(0x7f122aea, float:1.942901E38)
            goto L_0x0293
        L_0x028c:
            X.118 r0 = r12.A04
            android.content.Context r1 = r0.A00
            r0 = 2131897068(0x7f122aec, float:1.9429015E38)
        L_0x0293:
            java.lang.String r0 = r1.getString(r0)
            goto L_0x01fe
        L_0x0299:
            java.math.BigDecimal r0 = r0.A00
            java.math.BigDecimal r0 = r0.scaleByPowerOfTen(r1)
            long r0 = r0.longValue()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            goto L_0x01b3
        L_0x02a9:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ Exception -> 0x02b1 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x02b1 }
            r3.A00 = r5     // Catch:{ Exception -> 0x02b1 }
            goto L_0x02b8
        L_0x02b1:
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            r3.A00 = r5
        L_0x02b8:
            r0 = 1
            r5.put(r6, r0)     // Catch:{ Exception -> 0x02bd }
            goto L_0x02c3
        L_0x02bd:
            r1 = move-exception
            java.lang.String r0 = "BrazilPaymentStatusNotificationHelper/setNaggedTransaction/error"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02c3:
            X.1QD r0 = r3.A04
            java.lang.String r5 = r5.toString()
            android.content.SharedPreferences r0 = r0.A03()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "payments_nagged_transactions"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r5)
            r0.apply()
        L_0x02da:
            r8.add(r10)
            goto L_0x00ea
        L_0x02df:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "PAY: BrazilPaymentStatusNotificationHelper/buildPaymentReminders - transaction skipped: "
            r1.append(r0)
            java.lang.String r0 = r9.A0L
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00ea
        L_0x02f7:
            java.lang.String r6 = "EMPTY"
            goto L_0x0102
        L_0x02fb:
            java.util.Iterator r3 = r8.iterator()
        L_0x02ff:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d6
            java.lang.Object r1 = r3.next()
            X.206 r1 = (X.AnonymousClass206) r1
            r0 = 16
            r2.BBZ(r1, r0)
            goto L_0x02ff
        L_0x0311:
            X.11P r1 = r0.A01     // Catch:{ all -> 0x0489 }
            long r11 = X.AnonymousClass11P.A01(r1)     // Catch:{ all -> 0x0489 }
            monitor-enter(r0)     // Catch:{ all -> 0x0489 }
            monitor-enter(r0)     // Catch:{ all -> 0x0486 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0483 }
            r1 = 8
            java.lang.String r6 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0483 }
            r1 = 0
            r3[r1] = r6     // Catch:{ all -> 0x0483 }
            r1 = 602(0x25a, float:8.44E-43)
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0483 }
            r1 = 1
            r3[r1] = r2     // Catch:{ all -> 0x0483 }
            java.lang.String r5 = "(type=? AND status=?)"
            android.util.Pair r4 = new android.util.Pair     // Catch:{ all -> 0x0483 }
            r4.<init>(r5, r3)     // Catch:{ all -> 0x0483 }
            r1 = 2
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0483 }
            r1 = 0
            r3[r1] = r6     // Catch:{ all -> 0x0483 }
            r1 = 608(0x260, float:8.52E-43)
            java.lang.String r2 = java.lang.Integer.toString(r1)     // Catch:{ all -> 0x0483 }
            r1 = 1
            r3[r1] = r2     // Catch:{ all -> 0x0483 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0483 }
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0483 }
            java.lang.String r1 = "OR"
            android.util.Pair r4 = X.AnonymousClass1QR.A04(r4, r2, r1)     // Catch:{ all -> 0x0483 }
            r1 = 0
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0483 }
            r2 = 0
            android.util.Pair r1 = new android.util.Pair     // Catch:{ all -> 0x0483 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0483 }
            java.lang.Object r3 = r1.second     // Catch:{ all -> 0x0483 }
            java.lang.Object r1 = r1.first     // Catch:{ all -> 0x0483 }
            android.util.Pair r2 = new android.util.Pair     // Catch:{ all -> 0x0483 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0483 }
            java.lang.String r1 = "AND"
            android.util.Pair r1 = X.AnonymousClass1QR.A04(r4, r2, r1)     // Catch:{ all -> 0x0483 }
            java.lang.Object r3 = r1.first     // Catch:{ all -> 0x0483 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0483 }
            java.lang.Object r2 = r1.second     // Catch:{ all -> 0x0483 }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x0483 }
            java.lang.String r20 = ""
            X.1Cd r1 = r0.A03     // Catch:{ IllegalStateException -> 0x03ce }
            X.1at r7 = r1.get()     // Catch:{ IllegalStateException -> 0x03ce }
            r1 = r7
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x03c4 }
            X.1Ev r13 = r1.A02     // Catch:{ all -> 0x03c4 }
            java.lang.String r14 = "pay_transaction"
            java.lang.String[] r15 = X.AnonymousClass1QR.A0D     // Catch:{ all -> 0x03c4 }
            java.lang.String r19 = "init_timestamp DESC"
            java.lang.String r21 = "readPendingAndActiveWithdrawalsV2/QUERY_PAY_TRANSACTION"
            r6 = 0
            r16 = r3
            r17 = r2
            r18 = r6
            android.database.Cursor r5 = r13.A0B(r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x03c4 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2"
            java.util.ArrayList r3 = X.AnonymousClass1QR.A0B(r5, r0, r1)     // Catch:{ all -> 0x03b8 }
            X.1QE r4 = r0.A04     // Catch:{ all -> 0x03b8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b8 }
            r2.<init>()     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2 returned: "
            r2.append(r1)     // Catch:{ all -> 0x03b8 }
            int r1 = r3.size()     // Catch:{ all -> 0x03b8 }
            r2.append(r1)     // Catch:{ all -> 0x03b8 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x03b8 }
            X.AnonymousClass1QE.A02(r4, r6, r1)     // Catch:{ all -> 0x03b8 }
            if (r5 == 0) goto L_0x03b4
            r5.close()     // Catch:{ all -> 0x03c4 }
        L_0x03b4:
            r7.close()     // Catch:{ IllegalStateException -> 0x03ce }
            goto L_0x03db
        L_0x03b8:
            r2 = move-exception
            if (r5 == 0) goto L_0x03c3
            r5.close()     // Catch:{ all -> 0x03bf }
            goto L_0x03c3
        L_0x03bf:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x03c4 }
        L_0x03c3:
            throw r2     // Catch:{ all -> 0x03c4 }
        L_0x03c4:
            r2 = move-exception
            r7.close()     // Catch:{ all -> 0x03c9 }
            goto L_0x03cd
        L_0x03c9:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ IllegalStateException -> 0x03ce }
        L_0x03cd:
            throw r2     // Catch:{ IllegalStateException -> 0x03ce }
        L_0x03ce:
            r2 = move-exception
            X.1QE r4 = r0.A04     // Catch:{ all -> 0x0483 }
            java.lang.String r1 = "readPendingAndActiveWithdrawalsV2/IllegalStateException "
            r4.A0A(r1, r2)     // Catch:{ all -> 0x0483 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0483 }
            r3.<init>()     // Catch:{ all -> 0x0483 }
        L_0x03db:
            monitor-exit(r0)     // Catch:{ all -> 0x0486 }
            monitor-exit(r0)     // Catch:{ all -> 0x0489 }
            X.1Cd r1 = r0.A03     // Catch:{ SQLiteDatabaseCorruptException -> 0x047d }
            X.1au r10 = r1.A05()     // Catch:{ SQLiteDatabaseCorruptException -> 0x047d }
            X.1xA r9 = r10.BD0()     // Catch:{ all -> 0x0473 }
            java.util.Iterator r8 = r3.iterator()     // Catch:{ all -> 0x0469 }
        L_0x03eb:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x0469 }
            if (r1 == 0) goto L_0x045f
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x0469 }
            X.AW0 r5 = (X.AW0) r5     // Catch:{ all -> 0x0469 }
            X.8pG r1 = r5.A0A     // Catch:{ all -> 0x0469 }
            if (r1 == 0) goto L_0x0409
            long r6 = r1.A0A()     // Catch:{ all -> 0x0469 }
            r2 = 0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x03eb
            int r1 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x03eb
        L_0x0409:
            android.content.ContentValues r14 = new android.content.ContentValues     // Catch:{ all -> 0x0469 }
            r14.<init>()     // Catch:{ all -> 0x0469 }
            java.lang.String r2 = r5.A0L     // Catch:{ all -> 0x0469 }
            java.lang.String r1 = r5.A0K     // Catch:{ all -> 0x0469 }
            X.AnonymousClass1QR.A07(r2, r1)     // Catch:{ all -> 0x0469 }
            java.lang.String r2 = "status"
            r1 = 607(0x25f, float:8.5E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0469 }
            r14.put(r2, r1)     // Catch:{ all -> 0x0469 }
            java.lang.String r6 = "timestamp"
            r1 = 1000(0x3e8, double:4.94E-321)
            long r2 = r11 / r1
            int r1 = (int) r2     // Catch:{ all -> 0x0469 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0469 }
            r14.put(r6, r1)     // Catch:{ all -> 0x0469 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0469 }
            r2.<init>()     // Catch:{ all -> 0x0469 }
            java.lang.String r1 = "expireOldWithdrawals key id:"
            r2.append(r1)     // Catch:{ all -> 0x0469 }
            java.lang.String r1 = r5.A0K     // Catch:{ all -> 0x0469 }
            r2.append(r1)     // Catch:{ all -> 0x0469 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0469 }
            r4.A06(r1)     // Catch:{ all -> 0x0469 }
            r1 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0469 }
            r2 = 0
            java.lang.String r1 = r5.A0K     // Catch:{ all -> 0x0469 }
            r3[r2] = r1     // Catch:{ all -> 0x0469 }
            r1 = r10
            X.1av r1 = (X.C28801av) r1     // Catch:{ all -> 0x0469 }
            X.1Ev r13 = r1.A02     // Catch:{ all -> 0x0469 }
            java.lang.String r16 = "id=?"
            java.lang.String r17 = "expireOldWithdrawalsV2/UPDATE_PAY_TRANSACTION"
            java.lang.String r15 = "pay_transaction"
            r18 = r3
            r13.A02(r14, r15, r16, r17, r18)     // Catch:{ all -> 0x0469 }
            goto L_0x03eb
        L_0x045f:
            r9.A00()     // Catch:{ all -> 0x0469 }
            r9.close()     // Catch:{ all -> 0x0473 }
            r10.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x047d }
            goto L_0x048c
        L_0x0469:
            r2 = move-exception
            r9.close()     // Catch:{ all -> 0x046e }
            goto L_0x0472
        L_0x046e:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ all -> 0x0473 }
        L_0x0472:
            throw r2     // Catch:{ all -> 0x0473 }
        L_0x0473:
            r2 = move-exception
            r10.close()     // Catch:{ all -> 0x0478 }
            goto L_0x047c
        L_0x0478:
            r1 = move-exception
            X.AnonymousClass0DT.A00(r2, r1)     // Catch:{ SQLiteDatabaseCorruptException -> 0x047d }
        L_0x047c:
            throw r2     // Catch:{ SQLiteDatabaseCorruptException -> 0x047d }
        L_0x047d:
            java.lang.String r1 = "expireOldWithdrawals failed."
            r4.A05(r1)     // Catch:{ all -> 0x0489 }
            goto L_0x048c
        L_0x0483:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0486 }
            throw r1     // Catch:{ all -> 0x0486 }
        L_0x0486:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0489 }
            throw r1     // Catch:{ all -> 0x0489 }
        L_0x0489:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x048c:
            monitor-exit(r0)
        L_0x048d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1R5.Bvh():void");
    }

    public AnonymousClass1R5(AnonymousClass11S r4, AnonymousClass1M9 r5, C24921Me r6, AnonymousClass11P r7, AnonymousClass118 r8, AnonymousClass1QB r9, AnonymousClass1Q2 r10, AnonymousClass1R3 r11, AnonymousClass1Cd r12, AnonymousClass1QL r13, AnonymousClass1QO r14, AnonymousClass1QS r15, AnonymousClass1R2 r16, AnonymousClass1PP r17, AnonymousClass00H r18, AnonymousClass00H r19) {
        this.A04 = r8;
        this.A03 = r7;
        this.A00 = r4;
        this.A0B = r16;
        this.A01 = r5;
        this.A02 = r6;
        this.A06 = r10;
        this.A09 = r15;
        this.A05 = r9;
        this.A07 = r11;
        this.A0C = r17;
        this.A0F = r12;
        this.A08 = r13;
        this.A0G = r14;
        this.A0E = r18;
        this.A0D = r19;
    }
}
