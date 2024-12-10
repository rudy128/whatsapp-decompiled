package X;

/* renamed from: X.Akc  reason: case insensitive filesystem */
public class C21471Akc implements Runnable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C21471Akc(C113975oM r1, C21472Akd akd, int i) {
        this.A00 = i;
        if (26 - i != 0) {
            this.A01 = akd;
            this.A02 = r1;
            return;
        }
        this.A01 = akd;
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0187, code lost:
        if (r20 != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0189, code lost:
        r2 = r6.A0E();
        r1 = r2.Bbt(r7).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0199, code lost:
        if (r1.hasNext() == false) goto L_0x01a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x019b, code lost:
        r2.BIB(((X.AnonymousClass9O0) r1.next()).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a7, code lost:
        r21 = false;
        r20 = false;
        r5 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A00(X.A7G r24) {
        /*
            r9 = r24
            java.util.List r0 = r9.A06
            r23 = 0
            if (r0 == 0) goto L_0x0045
            java.util.Iterator r6 = r0.iterator()
        L_0x000c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0045
            java.lang.Object r5 = r6.next()
            X.A7G r5 = (X.A7G) r5
            boolean r0 = r5.A00
            if (r0 != 0) goto L_0x0023
            boolean r0 = A00(r5)
            r23 = r23 | r0
            goto L_0x000c
        L_0x0023:
            X.A5Z r4 = X.A5Z.A00()
            java.lang.String r3 = X.C182069Sy.A00
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Already enqueued work ids ("
            r2.append(r0)
            java.lang.String r1 = ", "
            java.util.List r0 = r5.A05
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            r2.append(r0)
            java.lang.String r0 = X.AnonymousClass8BU.A0q(r2)
            r4.A06(r3, r0)
            goto L_0x000c
        L_0x0045:
            java.util.HashSet r1 = X.A7G.A00(r9)
            X.A7W r8 = r9.A02
            java.util.List r0 = r9.A07
            r24 = r0
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r10 = r1.toArray(r0)
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.lang.String r7 = r9.A04
            java.lang.Integer r11 = r9.A03
            long r3 = java.lang.System.currentTimeMillis()
            androidx.work.impl.WorkDatabase r6 = r8.A04
            r12 = 0
            if (r10 == 0) goto L_0x00ba
            int r5 = r10.length
            if (r5 <= 0) goto L_0x00ba
            r15 = 1
            r2 = 0
            r22 = 1
            r21 = 0
            r20 = 0
        L_0x0070:
            r13 = r10[r2]
            X.BD8 r0 = r6.A0E()
            X.A2t r0 = r0.Bbs(r13)
            if (r0 != 0) goto L_0x009e
            X.A5Z r3 = X.A5Z.A00()
            java.lang.String r2 = X.C182069Sy.A00
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Prerequisite "
            r1.append(r0)
            r1.append(r13)
            java.lang.String r0 = " doesn't exist; not enqueuing"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r3.A04(r2, r0)
        L_0x0097:
            r14 = 0
        L_0x0098:
            r0 = 1
            r9.A00 = r0
            r14 = r14 | r23
            return r14
        L_0x009e:
            java.lang.Integer r1 = r0.A0G
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            boolean r0 = X.AnonymousClass000.A1Z(r1, r0)
            r22 = r22 & r0
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x00b3
            r20 = 1
        L_0x00ae:
            int r2 = r2 + 1
            if (r2 >= r5) goto L_0x00c1
            goto L_0x0070
        L_0x00b3:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r1 != r0) goto L_0x00ae
            r21 = 1
            goto L_0x00ae
        L_0x00ba:
            r15 = 0
            r22 = 1
            r21 = 0
            r20 = 0
        L_0x00c1:
            boolean r19 = X.AnonymousClass8BR.A1S(r7)
            if (r19 == 0) goto L_0x01ba
            if (r15 != 0) goto L_0x01ba
            X.BD8 r0 = r6.A0E()
            java.util.ArrayList r14 = r0.Bbt(r7)
            boolean r0 = r14.isEmpty()
            if (r0 != 0) goto L_0x01ba
            java.lang.Integer r13 = X.AnonymousClass00R.A0C
            if (r11 == r13) goto L_0x011e
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r11 == r0) goto L_0x011e
            java.lang.Integer r5 = X.AnonymousClass00R.A01
            if (r11 != r5) goto L_0x00fc
            java.util.Iterator r2 = r14.iterator()
        L_0x00e7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r2.next()
            X.9O0 r0 = (X.AnonymousClass9O0) r0
            java.lang.Integer r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 == r0) goto L_0x0097
            if (r1 != r5) goto L_0x00e7
            goto L_0x0097
        L_0x00fc:
            X.8KT r0 = new X.8KT
            r0.<init>(r8, r7, r12)
            r0.run()
            X.BD8 r2 = r6.A0E()
            java.util.Iterator r1 = r14.iterator()
        L_0x010c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r0 = r1.next()
            X.9O0 r0 = (X.AnonymousClass9O0) r0
            java.lang.String r0 = r0.A01
            r2.BIB(r0)
            goto L_0x010c
        L_0x011e:
            X.B6d r18 = r6.A09()
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r17 = r14.iterator()
        L_0x012a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0181
            java.lang.Object r15 = r17.next()
            X.9O0 r15 = (X.AnonymousClass9O0) r15
            java.lang.String r12 = r15.A01
            r1 = r18
            X.AHq r1 = (X.C20360AHq) r1
            java.lang.String r0 = "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?"
            r14 = 1
            X.AHX r2 = X.A3D.A00(r0, r14)
            r2.BDB(r14, r12)
            X.A6c r1 = r1.A01
            r1.A06()
            r0 = 0
            android.database.Cursor r1 = X.AnonymousClass9OB.A00(r1, r2, r0)
            boolean r16 = r1.moveToFirst()     // Catch:{ all -> 0x0271 }
            if (r16 == 0) goto L_0x015e
            int r0 = r1.getInt(r0)     // Catch:{ all -> 0x0271 }
            if (r0 != 0) goto L_0x015d
            r14 = 0
        L_0x015d:
            r0 = r14
        L_0x015e:
            r1.close()
            r2.A00()
            if (r0 != 0) goto L_0x012a
            java.lang.Integer r2 = r15.A00
            boolean r1 = X.AnonymousClass000.A1Z(r2, r13)
            r1 = r1 & r22
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r2 != r0) goto L_0x017a
            r20 = 1
        L_0x0174:
            r5.add(r12)
            r22 = r1
            goto L_0x012a
        L_0x017a:
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            if (r2 != r0) goto L_0x0174
            r21 = 1
            goto L_0x0174
        L_0x0181:
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r11 != r0) goto L_0x01af
            if (r21 != 0) goto L_0x0189
            if (r20 == 0) goto L_0x01af
        L_0x0189:
            X.BD8 r2 = r6.A0E()
            java.util.ArrayList r0 = r2.Bbt(r7)
            java.util.Iterator r1 = r0.iterator()
        L_0x0195:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01a7
            java.lang.Object r0 = r1.next()
            X.9O0 r0 = (X.AnonymousClass9O0) r0
            java.lang.String r0 = r0.A01
            r2.BIB(r0)
            goto L_0x0195
        L_0x01a7:
            java.util.List r5 = java.util.Collections.emptyList()
            r21 = 0
            r20 = 0
        L_0x01af:
            java.lang.Object[] r10 = r5.toArray(r10)
            java.lang.String[] r10 = (java.lang.String[]) r10
            int r0 = r10.length
            boolean r15 = X.AnonymousClass000.A1R(r0)
        L_0x01ba:
            r14 = 0
            goto L_0x01bd
        L_0x01bc:
            r14 = 1
        L_0x01bd:
            java.util.Iterator r13 = r24.iterator()
        L_0x01c1:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x0098
            java.lang.Object r11 = r13.next()
            X.9cO r11 = (X.C185319cO) r11
            X.A2t r5 = r11.A00
            if (r15 == 0) goto L_0x026d
            if (r22 != 0) goto L_0x026d
            if (r20 == 0) goto L_0x0263
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
        L_0x01d7:
            r5.A0G = r0
        L_0x01d9:
            java.lang.Integer r1 = r5.A0G
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            if (r1 != r0) goto L_0x01e0
            r14 = 1
        L_0x01e0:
            X.BD8 r2 = r6.A0E()
            java.util.List r0 = r8.A07
            X.A2t r1 = X.C196369uw.A00(r5, r0)
            X.AHv r2 = (X.C20365AHv) r2
            X.A6c r5 = r2.A02
            r5.A06()
            r5.A07()
            X.8JG r0 = r2.A00     // Catch:{ all -> 0x0279 }
            r0.A03(r1)     // Catch:{ all -> 0x0279 }
            r5.A08()     // Catch:{ all -> 0x0279 }
            X.C20076A6c.A02(r5)
            if (r15 == 0) goto L_0x022e
            int r12 = r10.length
            r2 = 0
        L_0x0203:
            if (r2 >= r12) goto L_0x022e
            r5 = r10[r2]
            java.util.UUID r0 = r11.A02
            java.lang.String r0 = X.C18070vi.A0H(r0)
            X.9ZV r1 = new X.9ZV
            r1.<init>(r0, r5)
            X.B6d r0 = r6.A09()
            X.AHq r0 = (X.C20360AHq) r0
            X.A6c r5 = r0.A01
            r5.A06()
            r5.A07()
            X.8JG r0 = r0.A00     // Catch:{ all -> 0x0279 }
            r0.A03(r1)     // Catch:{ all -> 0x0279 }
            r5.A08()     // Catch:{ all -> 0x0279 }
            X.C20076A6c.A02(r5)
            int r2 = r2 + 1
            goto L_0x0203
        L_0x022e:
            X.BA4 r2 = r6.A0F()
            java.util.UUID r5 = r11.A02
            java.lang.String r1 = X.C18070vi.A0H(r5)
            java.util.Set r0 = r11.A01
            r2.Bdf(r1, r0)
            if (r19 == 0) goto L_0x01c1
            X.B4S r2 = r6.A0C()
            java.lang.String r0 = X.C18070vi.A0H(r5)
            X.9ZW r1 = new X.9ZW
            r1.<init>(r7, r0)
            X.AHt r2 = (X.C20363AHt) r2
            X.A6c r5 = r2.A01
            r5.A06()
            r5.A07()
            X.8JG r0 = r2.A00     // Catch:{ all -> 0x0279 }
            r0.A03(r1)     // Catch:{ all -> 0x0279 }
            r5.A08()     // Catch:{ all -> 0x0279 }
            X.C20076A6c.A02(r5)
            goto L_0x01c1
        L_0x0263:
            if (r21 == 0) goto L_0x0269
            java.lang.Integer r0 = X.AnonymousClass00R.A0j
            goto L_0x01d7
        L_0x0269:
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            goto L_0x01d7
        L_0x026d:
            r5.A07 = r3
            goto L_0x01d9
        L_0x0271:
            r0 = move-exception
            r1.close()
            r2.A00()
            throw r0
        L_0x0279:
            r0 = move-exception
            X.C20076A6c.A02(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21471Akc.A00(X.A7G):boolean");
    }

    public static boolean A01(Object obj) {
        if (!(obj instanceof C21471Akc) || ((C21471Akc) obj).A00 != 29) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v128, resolved type: X.8Kd} */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.00O, java.util.Map] */
    /* JADX WARNING: type inference failed for: r9v7, types: [X.EEC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v12, types: [java.lang.Object, X.Akg] */
    /* JADX WARNING: type inference failed for: r2v110, types: [X.8Cn, X.8Kb] */
    /* JADX WARNING: type inference failed for: r3v53, types: [X.9NS, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v119, types: [X.8Cn, X.8Ke] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    public void run() {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x0a53;
                case 1: goto L_0x0a47;
                case 2: goto L_0x045c;
                case 3: goto L_0x0a3b;
                case 4: goto L_0x0a11;
                case 5: goto L_0x044c;
                case 6: goto L_0x09f4;
                case 7: goto L_0x040f;
                case 8: goto L_0x0993;
                case 9: goto L_0x08fb;
                case 10: goto L_0x08b7;
                case 11: goto L_0x08a3;
                case 12: goto L_0x06a8;
                case 13: goto L_0x0afc;
                case 14: goto L_0x067d;
                case 15: goto L_0x066d;
                case 16: goto L_0x0664;
                case 17: goto L_0x0ae3;
                case 18: goto L_0x063d;
                case 19: goto L_0x03fa;
                case 20: goto L_0x03ec;
                case 21: goto L_0x0615;
                case 22: goto L_0x0606;
                case 23: goto L_0x03b2;
                case 24: goto L_0x0a80;
                case 25: goto L_0x0a5c;
                case 26: goto L_0x05e3;
                case 27: goto L_0x03a2;
                case 28: goto L_0x058d;
                case 29: goto L_0x0386;
                case 30: goto L_0x0566;
                case 31: goto L_0x0545;
                case 32: goto L_0x0517;
                case 33: goto L_0x034d;
                case 34: goto L_0x0329;
                case 35: goto L_0x0008;
                case 36: goto L_0x0502;
                case 37: goto L_0x0007;
                case 38: goto L_0x0007;
                case 39: goto L_0x04a3;
                case 40: goto L_0x026c;
                case 41: goto L_0x04f2;
                case 42: goto L_0x04e2;
                case 43: goto L_0x04d2;
                case 44: goto L_0x04b7;
                case 45: goto L_0x0007;
                case 46: goto L_0x04a8;
                case 47: goto L_0x04a3;
                case 48: goto L_0x004a;
                case 49: goto L_0x0014;
                default: goto L_0x0007;
            }
        L_0x0007:
            return
        L_0x0008:
            java.lang.Object r2 = r0.A01
            X.E8A r2 = (X.E8A) r2
            X.9zJ r1 = X.C199029zJ.A01
            java.lang.Object r0 = r0.A02
            X.Boh r0 = (X.C23736Boh) r0
            goto L_0x0349
        L_0x0014:
            java.lang.Object r1 = r0.A02
            X.A05 r1 = (X.A05) r1
            X.9kr r0 = r1.A03
            X.AEq r3 = r1.A04
            X.A8i r2 = r0.A00
            X.9lh r0 = r0.A01
            java.util.List r1 = X.C20123A8i.A04(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0007
            X.A23 r2 = r2.A03
            java.lang.Object r0 = X.C108955ca.A0p(r1)
            X.9p5 r0 = (X.C192849p5) r0
            X.A4D r1 = r0.A07
            r0 = 1
            X.C18070vi.A0d(r1, r0)
            boolean r0 = X.A23.A00(r1, r2)
            if (r0 != 0) goto L_0x0007
            X.8fT r2 = r2.A00
            int r1 = X.C167138fT.A00(r3, r1)
            java.lang.String r0 = "download_pause"
            r2.A02(r1, r0)
            return
        L_0x004a:
            java.lang.Object r5 = r0.A01
            X.9xf r5 = (X.C198029xf) r5
            java.lang.Object r7 = r0.A02
            X.9ww r7 = (X.C197589ww) r7
            X.9yG r6 = X.C198389yG.A04
            if (r6 == 0) goto L_0x0007
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r2 = X.AnonymousClass8BS.A0n(r0)
            java.lang.String[] r0 = X.C198029xf.A07
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r1 = r0.contains(r2)
            java.lang.String[] r0 = X.C198029xf.A08
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r3 = r0.contains(r2)
            boolean r0 = X.C198029xf.A03
            r12 = 1
            if (r0 == 0) goto L_0x0081
            java.lang.String[] r0 = X.C198029xf.A06
            java.util.List r0 = java.util.Arrays.asList(r0)
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L_0x0089
        L_0x0081:
            boolean r0 = X.C198029xf.A05
            if (r0 == 0) goto L_0x00e7
            if (r1 != 0) goto L_0x0089
            if (r3 == 0) goto L_0x00e7
        L_0x0089:
            r8 = 1
        L_0x008a:
            boolean r0 = X.C198029xf.A04
            if (r0 == 0) goto L_0x009f
            if (r1 == 0) goto L_0x009f
            X.2pV r0 = r7.A00
            X.0ve r2 = r0.A00
            r1 = 9266(0x2432, float:1.2984E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 1
            if (r0 != 0) goto L_0x00a0
        L_0x009f:
            r4 = 0
        L_0x00a0:
            boolean r0 = X.C198029xf.A05
            if (r0 == 0) goto L_0x00b5
            if (r3 == 0) goto L_0x00b5
            X.2pV r0 = r7.A00
            X.0ve r2 = r0.A00
            r1 = 9346(0x2482, float:1.3097E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 1
            if (r0 != 0) goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            if (r8 == 0) goto L_0x00b9
            r12 = 0
        L_0x00b9:
            X.2pV r0 = r7.A00
            X.0ve r2 = r0.A00
            r0 = 9266(0x2432, float:1.2984E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 != 0) goto L_0x00cf
            r0 = 9346(0x2482, float:1.3097E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x00d5
        L_0x00cf:
            com.facebook.common.hiddenapis2.ApiExemption.enableUnsafeExemption()
            com.facebook.common.hiddenapis2.ApiExemption.removeRestriction_DO_NOT_USE()
        L_0x00d5:
            if (r4 == 0) goto L_0x01ab
            android.os.Looper r4 = r5.A00
            X.9NS r3 = new X.9NS
            r3.<init>()
            r9 = 0
            r3.A04 = r9
            java.lang.Class<android.os.Looper> r7 = android.os.Looper.class
            java.lang.String r2 = "getMessageMonitor"
            r1 = 0
            goto L_0x00e9
        L_0x00e7:
            r8 = 0
            goto L_0x008a
        L_0x00e9:
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x00f4 }
            java.lang.reflect.Method r1 = r7.getDeclaredMethod(r2, r0)     // Catch:{ all -> 0x00f4 }
            r0 = 1
            r1.setAccessible(r0)     // Catch:{ all -> 0x00f4 }
            goto L_0x0115
        L_0x00f4:
            if (r1 != 0) goto L_0x0115
        L_0x00f6:
            java.lang.Object r0 = r3.A00
            if (r0 == 0) goto L_0x01c4
            java.lang.reflect.Field r0 = r3.A01
            if (r0 == 0) goto L_0x01c4
            java.lang.reflect.Method r0 = r3.A03
            if (r0 == 0) goto L_0x01c4
            java.lang.reflect.Method r0 = r3.A02
            if (r0 == 0) goto L_0x01c4
            boolean r0 = r3.A04
            X.BCh r5 = r5.A01
            if (r0 == 0) goto L_0x01d0
            X.8Ke r2 = new X.8Ke
            r2.<init>(r4, r5, r6)
            r2.A00 = r3
            goto L_0x01e5
        L_0x0115:
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r1.invoke(r4, r0)     // Catch:{ all -> 0x00f6 }
            r3.A00 = r0     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00f6
            java.lang.Class<android.os.Message> r11 = android.os.Message.class
            java.lang.String r0 = "monitorInfo"
            java.lang.reflect.Field r7 = r11.getDeclaredField(r0)     // Catch:{ all -> 0x012c }
            r0 = 1
            r7.setAccessible(r0)     // Catch:{ all -> 0x012d }
            goto L_0x012d
        L_0x012c:
            r7 = 0
        L_0x012d:
            r3.A01 = r7     // Catch:{ all -> 0x00f6 }
            if (r7 == 0) goto L_0x00f6
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x00f6 }
            java.lang.Class r8 = r0.getClass()     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "markDispatch"
            r10 = 2
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f6 }
            r1[r9] = r11     // Catch:{ all -> 0x00f6 }
            java.lang.Class r0 = r7.getType()     // Catch:{ all -> 0x00f6 }
            r7 = 1
            r1[r7] = r0     // Catch:{ all -> 0x00f6 }
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r2, r1)     // Catch:{ all -> 0x014d }
            r0.setAccessible(r7)     // Catch:{ all -> 0x014e }
            goto L_0x014e
        L_0x014d:
            r0 = 0
        L_0x014e:
            r3.A02 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r2 = "markFinish"
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ all -> 0x00f6 }
            r1[r9] = r11     // Catch:{ all -> 0x00f6 }
            java.lang.reflect.Field r0 = r3.A01     // Catch:{ all -> 0x00f6 }
            java.lang.Class r0 = r0.getType()     // Catch:{ all -> 0x00f6 }
            r1[r7] = r0     // Catch:{ all -> 0x00f6 }
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r2, r1)     // Catch:{ all -> 0x0166 }
            r0.setAccessible(r7)     // Catch:{ all -> 0x0167 }
            goto L_0x0167
        L_0x0166:
            r0 = 0
        L_0x0167:
            r3.A03 = r0     // Catch:{ all -> 0x00f6 }
            java.lang.String r1 = "isMonitorLooper"
            r2 = 0
            java.lang.Class[] r0 = new java.lang.Class[r9]     // Catch:{ all -> 0x0176 }
            java.lang.reflect.Method r2 = r8.getDeclaredMethod(r1, r0)     // Catch:{ all -> 0x0176 }
            r2.setAccessible(r7)     // Catch:{ all -> 0x0176 }
            goto L_0x0178
        L_0x0176:
            if (r2 == 0) goto L_0x018a
        L_0x0178:
            java.lang.Object r1 = r3.A00     // Catch:{ all -> 0x00f6 }
            java.lang.Object[] r0 = new java.lang.Object[r9]     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x018a
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f6 }
            r3.A04 = r0     // Catch:{ all -> 0x00f6 }
        L_0x018a:
            java.lang.String r0 = "mEnableMonitorMessage"
            java.lang.reflect.Field r1 = r8.getDeclaredField(r0)     // Catch:{ all -> 0x00f6 }
            r1.setAccessible(r7)     // Catch:{ all -> 0x0194 }
            goto L_0x0196
        L_0x0194:
            if (r1 == 0) goto L_0x00f6
        L_0x0196:
            java.lang.Object r0 = r3.A00     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00f6
            boolean r1 = r3.A04     // Catch:{ all -> 0x00f6 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f6 }
            r0 = r0 | r1
            r3.A04 = r0     // Catch:{ all -> 0x00f6 }
            goto L_0x00f6
        L_0x01ab:
            if (r3 == 0) goto L_0x01c4
            android.os.Looper r4 = r5.A00
            X.Akg r8 = new X.Akg
            r8.<init>()
            r11 = 0
            r8.A03 = r11
            java.lang.Class<android.os.Looper> r1 = android.os.Looper.class
            java.lang.String r0 = "mLooperExt"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch:{ all -> 0x01d8 }
            r10 = 1
            r0.setAccessible(r10)     // Catch:{ all -> 0x01d6 }
            goto L_0x0235
        L_0x01c4:
            android.os.Looper r4 = r5.A00
            X.BCh r5 = r5.A01
            if (r12 != 0) goto L_0x01d0
            X.8Kd r2 = new X.8Kd
            r2.<init>(r4, r5, r6)
            goto L_0x01e5
        L_0x01d0:
            X.8Kc r2 = new X.8Kc
            r2.<init>(r4, r5, r6)
            goto L_0x01e5
        L_0x01d6:
            if (r0 != 0) goto L_0x0235
        L_0x01d8:
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x01c4
            X.BCh r5 = r5.A01
            X.8Kb r2 = new X.8Kb
            r2.<init>(r4, r5, r6)
            r2.A00 = r8
        L_0x01e5:
            boolean r0 = r2 instanceof X.C162288Kd
            if (r0 == 0) goto L_0x0221
            java.lang.String r0 = "proxy"
        L_0x01eb:
            r5.CNq(r4, r0)
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C180539My.A05 = r0
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0214
            r0 = 1
            r2.A02 = r0
            android.os.Message r0 = android.os.Message.obtain()
            r2.A01 = r0
            r0.setTarget(r2)
            X.BCh r1 = r2.A03
            android.os.Message r0 = r2.A01
            r1.CNm(r0)
            android.os.Message r0 = android.os.Message.obtain(r2, r2)
            r2.A00 = r0
            r2.sendMessageAtFrontOfQueue(r0)
        L_0x0214:
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            if (r4 != r0) goto L_0x0007
            long r0 = android.os.SystemClock.uptimeMillis()
            X.C180539My.A04 = r0
            return
        L_0x0221:
            r1 = r2
            X.8Kc r1 = (X.C162278Kc) r1
            boolean r0 = r1 instanceof X.C162298Ke
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "looperMi"
            goto L_0x01eb
        L_0x022b:
            boolean r0 = r1 instanceof X.C162268Kb
            if (r0 == 0) goto L_0x0232
            java.lang.String r0 = "looperRealme"
            goto L_0x01eb
        L_0x0232:
            java.lang.String r0 = "looper"
            goto L_0x01eb
        L_0x0235:
            r8.A01 = r0
            r9 = 0
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x025f }
            r8.A00 = r0     // Catch:{ all -> 0x025f }
            if (r0 == 0) goto L_0x025f
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x025f }
            java.lang.String r3 = "stopLooperMessageMonitor"
            r0 = 3
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ all -> 0x025f }
            java.lang.Class<android.os.Message> r0 = android.os.Message.class
            r2[r11] = r0     // Catch:{ all -> 0x025f }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x025f }
            r2[r10] = r0     // Catch:{ all -> 0x025f }
            java.lang.Class r1 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x025f }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x025f }
            java.lang.reflect.Method r0 = r7.getDeclaredMethod(r3, r2)     // Catch:{ all -> 0x025f }
            r8.A02 = r0     // Catch:{ all -> 0x025f }
            r0.setAccessible(r10)     // Catch:{ all -> 0x025f }
        L_0x025f:
            java.lang.Object r0 = r8.A00
            if (r0 == 0) goto L_0x0268
            java.lang.reflect.Method r0 = r8.A02
            if (r0 == 0) goto L_0x0268
            r9 = 1
        L_0x0268:
            r8.A03 = r9
            goto L_0x01d8
        L_0x026c:
            java.lang.Object r4 = r0.A01
            X.CpD r4 = (X.C25945CpD) r4
            java.util.concurrent.ConcurrentLinkedQueue r7 = r4.A01
            java.util.Iterator r10 = r7.iterator()
        L_0x0276:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r8 = r10.next()
            X.9gT r8 = (X.C187849gT) r8
            r5 = 0
            r6 = 1
            boolean r0 = r8.A05     // Catch:{ Exception -> 0x02f9 }
            if (r0 == 0) goto L_0x02d1
            X.Csh r3 = r4.A02     // Catch:{ IllegalStateException -> 0x0296 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0296 }
            r3.A02 = r0     // Catch:{ IllegalStateException -> 0x0296 }
            X.EAe r9 = r8.A00     // Catch:{ IllegalStateException -> 0x0296 }
            r9.reset()     // Catch:{ IllegalStateException -> 0x0296 }
            goto L_0x029f
        L_0x0296:
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x02c9 }
            X.EAe r9 = r8.A00     // Catch:{ all -> 0x02c9 }
            X.C25945CpD.A01(r9, r4, r0)     // Catch:{ all -> 0x02c9 }
            X.Csh r3 = r4.A02     // Catch:{ Exception -> 0x02f9 }
        L_0x029f:
            r0 = -1
            r3.A02 = r0     // Catch:{ Exception -> 0x02f9 }
            boolean r0 = r8.A03     // Catch:{ Exception -> 0x02f9 }
            if (r0 == 0) goto L_0x02e7
            java.util.Map r2 = r3.A03     // Catch:{ Exception -> 0x02f9 }
            monitor-enter(r2)     // Catch:{ Exception -> 0x02f9 }
            java.util.Map r1 = r3.A03     // Catch:{ all -> 0x02c6 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x02c6 }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x02c6 }
            java.util.Set r1 = (java.util.Set) r1     // Catch:{ all -> 0x02c6 }
            monitor-exit(r2)     // Catch:{ all -> 0x02c6 }
            if (r1 == 0) goto L_0x02e7
            monitor-enter(r1)     // Catch:{ Exception -> 0x02f9 }
            r1.add(r9)     // Catch:{ all -> 0x02c3 }
            int r0 = r3.A00     // Catch:{ all -> 0x02c3 }
            int r0 = r0 + 1
            r3.A00 = r0     // Catch:{ all -> 0x02c3 }
            monitor-exit(r1)     // Catch:{ all -> 0x02c3 }
            goto L_0x02e7
        L_0x02c3:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02c3 }
            goto L_0x02f8
        L_0x02c6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x02c6 }
            goto L_0x02f8
        L_0x02c9:
            r3 = move-exception
            X.Csh r2 = r4.A02     // Catch:{ Exception -> 0x02f9 }
            r0 = -1
            r2.A02 = r0     // Catch:{ Exception -> 0x02f9 }
            throw r3     // Catch:{ Exception -> 0x02f9 }
        L_0x02d1:
            X.Cj6 r3 = r8.A01     // Catch:{ Exception -> 0x02f9 }
            boolean r2 = r8.A04     // Catch:{ Exception -> 0x02f9 }
            X.EAe r1 = r8.A00     // Catch:{ Exception -> 0x02f9 }
            boolean r0 = r3.A0P     // Catch:{ all -> 0x02f4 }
            if (r0 == 0) goto L_0x02e1
            if (r2 != 0) goto L_0x02e4
            boolean r0 = r3.A0O     // Catch:{ all -> 0x02f4 }
            if (r0 != 0) goto L_0x02e4
        L_0x02e1:
            r1.stop()     // Catch:{ all -> 0x02f4 }
        L_0x02e4:
            r1.release()     // Catch:{ Exception -> 0x02f9 }
        L_0x02e7:
            monitor-enter(r7)     // Catch:{ Exception -> 0x02f0 }
            r7.remove(r8)     // Catch:{ all -> 0x02ed }
            monitor-exit(r7)     // Catch:{ all -> 0x02ed }
            goto L_0x0276
        L_0x02ed:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x02ed }
            throw r0     // Catch:{ Exception -> 0x02f0 }
        L_0x02f0:
            r0 = move-exception
            java.lang.String r3 = "MediaCodecPoolOptimized"
            goto L_0x0318
        L_0x02f4:
            r0 = move-exception
            r1.release()     // Catch:{ Exception -> 0x02f9 }
        L_0x02f8:
            throw r0     // Catch:{ Exception -> 0x02f9 }
        L_0x02f9:
            r0 = move-exception
            java.lang.String r3 = "MediaCodecPoolOptimized"
            java.lang.String r2 = "error-while-release-codec-from-set: %s"
            java.lang.Object[] r1 = new java.lang.Object[r6]     // Catch:{ all -> 0x0ccd }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0ccd }
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r0, r2, r1, r5)     // Catch:{ all -> 0x0ccd }
            android.util.Log.w(r3, r0)     // Catch:{ all -> 0x0ccd }
            if (r8 == 0) goto L_0x0276
            monitor-enter(r7)     // Catch:{ Exception -> 0x0317 }
            r7.remove(r8)     // Catch:{ all -> 0x0314 }
            monitor-exit(r7)     // Catch:{ all -> 0x0314 }
            goto L_0x0276
        L_0x0314:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0314 }
            throw r0     // Catch:{ Exception -> 0x0317 }
        L_0x0317:
            r0 = move-exception
        L_0x0318:
            java.lang.String r2 = "error-while-release-codec-from-set-finally: %s"
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r0, r2, r1, r5)
            android.util.Log.w(r3, r0)
            goto L_0x0276
        L_0x0329:
            java.lang.Object r4 = r0.A02
            X.Boh r4 = (X.C23736Boh) r4
            boolean r1 = X.C26176Ctu.A03()
            if (r1 == 0) goto L_0x0007
            java.lang.ref.WeakReference r1 = r4.A08
            java.lang.Object r3 = r1.get()
            X.DOZ r3 = (X.DOZ) r3
            if (r3 == 0) goto L_0x0007
            java.lang.Object r2 = r0.A01
            X.E8A r2 = (X.E8A) r2
            X.9zJ r1 = X.C199029zJ.A01
            java.util.List r0 = r4.A06
            X.Boh r0 = X.C23736Boh.A01(r3, r2, r0)
        L_0x0349:
            X.C25974Cph.A00(r0, r1, r2)
            return
        L_0x034d:
            java.lang.Object r4 = r0.A02
            X.0Bz r4 = (X.C01930Bz) r4
        L_0x0351:
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0007
            boolean r1 = r4 instanceof X.BV8
            if (r1 != 0) goto L_0x0007
            r1 = r4
            android.view.View r1 = (android.view.View) r1
            android.view.TouchDelegate r2 = r1.getTouchDelegate()
            boolean r1 = r2 instanceof X.AnonymousClass8D2
            if (r1 == 0) goto L_0x0374
            X.8D2 r2 = (X.AnonymousClass8D2) r2
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            r2.A00(r1)
        L_0x036d:
            android.view.View r4 = (android.view.View) r4
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0351
        L_0x0374:
            if (r2 != 0) goto L_0x036d
            r3 = r4
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            X.8D2 r1 = new X.8D2
            r1.<init>(r3, r2)
            r3.setTouchDelegate(r1)
            goto L_0x036d
        L_0x0386:
            java.lang.Object r3 = r0.A02
            X.DMs r3 = (X.DMs) r3
            java.lang.Object r1 = r3.value
            if (r1 != r0) goto L_0x0007
            java.lang.Object r1 = r0.A01
            X.EEC r1 = (X.EEC) r1
            java.lang.Object r2 = X.DMs.A00(r1)
            X.C6U r1 = X.DMs.A00
            boolean r0 = r1.A02(r3, r0, r2)
            if (r0 == 0) goto L_0x0007
            X.DMs.A03(r3)
            return
        L_0x03a2:
            java.lang.Object r5 = r0.A01
            X.Akd r5 = (X.C21472Akd) r5
            java.lang.Object r2 = r5.A03
            X.DMs r2 = (X.DMs) r2
            boolean r1 = r2.isCancelled()
            if (r1 != 0) goto L_0x0007
            goto L_0x0cec
        L_0x03b2:
            java.lang.Object r1 = r0.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r4 = r0.A02
            X.9uK r4 = (X.C196019uK) r4
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x03c2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0007
            java.lang.Object r2 = r3.next()
            X.B4P r2 = (X.B4P) r2
            java.lang.Object r0 = r4.A00
            X.AHn r2 = (X.C20357AHn) r2
            X.9pI r1 = r2.A00
            boolean r0 = r1.A02(r0)
            if (r0 == 0) goto L_0x03e9
            int r0 = r1.A00()
            X.8KB r1 = new X.8KB
            r1.<init>(r0)
        L_0x03e3:
            X.5bl r0 = r2.A01
            r0.CQ0(r1)
            goto L_0x03c2
        L_0x03e9:
            X.8KC r1 = X.AnonymousClass8KC.A00
            goto L_0x03e3
        L_0x03ec:
            java.lang.Object r5 = r0.A01
            X.Aka r5 = (X.C21469Aka) r5
            X.5oM r4 = r5.A0F
            boolean r1 = r4.isCancelled()
            if (r1 != 0) goto L_0x0007
            goto L_0x0d54
        L_0x03fa:
            java.lang.Object r2 = r0.A01
            X.Aka r2 = (X.C21469Aka) r2
            java.lang.Object r1 = r0.A02
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            X.5oM r0 = r2.A0F
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0007
            r0 = 1
            r1.cancel(r0)
            return
        L_0x040f:
            java.lang.Object r5 = r0.A01
            X.7Q7 r5 = (X.AnonymousClass7Q7) r5
            java.lang.Object r4 = r5.A02
            X.1uh r4 = (X.C40431uh) r4
            int r2 = r4.A00
            int r1 = r5.A01
            if (r2 != r1) goto L_0x0007
            java.lang.Object r3 = r5.A04
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r1 = r0.A02
            X.Cl4 r1 = (X.C25734Cl4) r1
            java.lang.Object r2 = r5.A03
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r4.A01 = r3
            java.util.List r0 = java.util.Collections.unmodifiableList(r3)
            r4.A02 = r0
            X.1uj r0 = r4.A05
            r1.A01(r0)
            java.util.List r0 = r4.A06
            java.util.Iterator r1 = r0.iterator()
        L_0x043c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0446
            r1.next()
            goto L_0x043c
        L_0x0446:
            if (r2 == 0) goto L_0x0007
            r2.run()
            return
        L_0x044c:
            java.lang.Object r1 = r0.A02
            X.1t7 r1 = (X.C39461t7) r1
            java.util.List r0 = r1.A03
            boolean r0 = X.AnonymousClass000.A1a(r0)
            if (r0 == 0) goto L_0x0007
            r1.A07()
            return
        L_0x045c:
            java.lang.reflect.Method r6 = X.C197539wr.A04     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            r5 = 1
            r4 = 2
            r3 = 0
            if (r6 == 0) goto L_0x0479
            java.lang.Object r2 = r0.A01     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            java.lang.Object[] r1 = X.AnonymousClass8BR.A1a()     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            java.lang.Object r0 = r0.A02     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            r1[r3] = r0     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            X.AnonymousClass8BR.A1L(r1, r5, r3)     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            java.lang.String r0 = "AppCompat recreation"
            r1[r4] = r0     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
        L_0x0474:
            r6.invoke(r2, r1)     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            goto L_0x0d80
        L_0x0479:
            java.lang.reflect.Method r6 = X.C197539wr.A03     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            java.lang.Object r2 = r0.A01     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            java.lang.Object r0 = r0.A02     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            r1[r3] = r0     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            X.AnonymousClass8BR.A1L(r1, r5, r3)     // Catch:{ RuntimeException -> 0x0487, all -> 0x0d81 }
            goto L_0x0474
        L_0x0487:
            r2 = move-exception
            java.lang.Class r1 = r2.getClass()
            java.lang.Class<java.lang.RuntimeException> r0 = java.lang.RuntimeException.class
            if (r1 != r0) goto L_0x0007
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0007
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "Unable to stop"
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L_0x0d8a
            return
        L_0x04a3:
            java.lang.Object r0 = r0.A02
            monitor-enter(r0)
            monitor-exit(r0)
            return
        L_0x04a8:
            java.lang.Object r2 = r0.A01
            X.CMq r2 = (X.C24847CMq) r2
            java.lang.Object r1 = r0.A02
            X.CU1 r1 = (X.CU1) r1
            X.D9R r0 = r2.A01
            X.Cyh r0 = r0.A01
            r0.A0K = r1
            return
        L_0x04b7:
            java.lang.Object r1 = r0.A01
            X.CMq r1 = (X.C24847CMq) r1
            java.lang.Object r2 = r0.A02
            android.view.Surface r2 = (android.view.Surface) r2
            X.D9R r0 = r1.A01
            X.Cyh r1 = r0.A01
            r1.A0I = r2
            boolean r0 = r2.isValid()
            X.C26381Cyh.A0F(r1, r0)
            X.DGM r0 = r1.A0o
            r0.BsN()
            return
        L_0x04d2:
            java.lang.Object r2 = r0.A02
            X.BCy r2 = (X.C22563BCy) r2
            java.lang.Object r0 = r0.A01
            X.CtM r0 = (X.C26154CtM) r0
            int r1 = r0.A00
            X.Caq r0 = r0.A01
            r2.C2X(r0, r1)
            return
        L_0x04e2:
            java.lang.Object r2 = r0.A02
            X.BCy r2 = (X.C22563BCy) r2
            java.lang.Object r0 = r0.A01
            X.CtM r0 = (X.C26154CtM) r0
            int r1 = r0.A00
            X.Caq r0 = r0.A01
            r2.Bxx(r0, r1)
            return
        L_0x04f2:
            java.lang.Object r2 = r0.A02
            X.BCy r2 = (X.C22563BCy) r2
            java.lang.Object r0 = r0.A01
            X.CtM r0 = (X.C26154CtM) r0
            int r1 = r0.A00
            X.Caq r0 = r0.A01
            r2.Bxw(r0, r1)
            return
        L_0x0502:
            java.lang.Object r0 = r0.A02
            X.Cbw r0 = (X.C25257Cbw) r0
            X.D9J.A0F(r0)     // Catch:{ BOK -> 0x050a }
            return
        L_0x050a:
            r2 = move-exception
            java.lang.String r1 = "ExoPlayerImplInternal"
            java.lang.String r0 = "Unexpected error delivering message on external thread."
            android.util.Log.e(r1, r0, r2)
            java.lang.RuntimeException r1 = X.AnonymousClass8BR.A0x(r2)
            throw r1
        L_0x0517:
            java.lang.Object r4 = r0.A01
            X.8IC r4 = (X.AnonymousClass8IC) r4
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {1065353216, 0} // fill-array
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r1)
            r4.A00 = r3
            java.lang.Object r2 = r0.A02
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            X.BM0 r1 = r4.A03
            X.A9E r0 = new X.A9E
            r0.<init>(r2, r1)
            r3.addUpdateListener(r0)
            android.animation.ValueAnimator r2 = r4.A00
            r0 = 200(0xc8, double:9.9E-322)
            r2.setDuration(r0)
            android.animation.ValueAnimator r0 = r4.A00
            r0.start()
            r0 = 0
            r4.A02 = r0
            return
        L_0x0545:
            java.lang.Object r3 = r0.A02
            X.Cig r3 = (X.C25601Cig) r3
            X.6Vl r1 = r3.A04
            java.lang.Object r2 = r0.A01
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            if (r1 == 0) goto L_0x0562
            android.widget.FrameLayout r1 = r3.A00
            if (r1 != 0) goto L_0x055e
            android.content.Context r0 = r3.A01
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r0)
            r3.A00 = r1
        L_0x055e:
            r2.addView(r1)
            return
        L_0x0562:
            X.C25601Cig.A00(r2, r3)
            return
        L_0x0566:
            java.lang.Object r3 = r0.A01
            androidx.work.impl.workers.ConstraintTrackingWorker r3 = (androidx.work.impl.workers.ConstraintTrackingWorker) r3
            java.lang.Object r1 = r0.A02
            X.EEC r1 = (X.EEC) r1
            java.lang.Object r2 = r3.A03
            monitor-enter(r2)
            boolean r0 = r3.A04     // Catch:{ all -> 0x058a }
            if (r0 == 0) goto L_0x0583
            X.5oM r1 = r3.A02     // Catch:{ all -> 0x058a }
            X.C18070vi.A0W(r1)     // Catch:{ all -> 0x058a }
            X.8Ji r0 = new X.8Ji     // Catch:{ all -> 0x058a }
            r0.<init>()     // Catch:{ all -> 0x058a }
            r1.A05(r0)     // Catch:{ all -> 0x058a }
            goto L_0x0588
        L_0x0583:
            X.5oM r0 = r3.A02     // Catch:{ all -> 0x058a }
            r0.A04(r1)     // Catch:{ all -> 0x058a }
        L_0x0588:
            monitor-exit(r2)
            return
        L_0x058a:
            r1 = move-exception
            monitor-exit(r2)
            throw r1
        L_0x058d:
            java.lang.Object r2 = r0.A02
            X.9zv r2 = (X.C199389zv) r2
            java.lang.Object r5 = r2.A01
            monitor-enter(r5)
            java.util.Map r1 = r2.A03     // Catch:{ all -> 0x05e0 }
            java.lang.Object r6 = r0.A01     // Catch:{ all -> 0x05e0 }
            X.9pp r6 = (X.C193279pp) r6     // Catch:{ all -> 0x05e0 }
            java.lang.Object r0 = r1.remove(r6)     // Catch:{ all -> 0x05e0 }
            X.Akc r0 = (X.C21471Akc) r0     // Catch:{ all -> 0x05e0 }
            if (r0 == 0) goto L_0x05cb
            java.util.Map r0 = r2.A02     // Catch:{ all -> 0x05e0 }
            java.lang.Object r4 = r0.remove(r6)     // Catch:{ all -> 0x05e0 }
            X.B4T r4 = (X.B4T) r4     // Catch:{ all -> 0x05e0 }
            if (r4 == 0) goto L_0x05c9
            X.AHo r4 = (X.C20358AHo) r4     // Catch:{ all -> 0x05e0 }
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x05e0 }
            java.lang.String r2 = X.C20358AHo.A0E     // Catch:{ all -> 0x05e0 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x05e0 }
            java.lang.String r0 = "Exceeded time limits on execution for "
            X.AnonymousClass8BX.A12(r3, r6, r0, r2, r1)     // Catch:{ all -> 0x05e0 }
            java.util.concurrent.Executor r2 = r4.A0A     // Catch:{ all -> 0x05e0 }
            r1 = 21
            X.AkX r0 = new X.AkX     // Catch:{ all -> 0x05e0 }
            r0.<init>((java.lang.Object) r4, (int) r1)     // Catch:{ all -> 0x05e0 }
            r2.execute(r0)     // Catch:{ all -> 0x05e0 }
        L_0x05c9:
            monitor-exit(r5)     // Catch:{ all -> 0x05e0 }
            goto L_0x05df
        L_0x05cb:
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x05e0 }
            java.lang.String r2 = "WrkTimerRunnable"
            java.lang.String r1 = "Timer with %s is already marked as complete."
            java.lang.Object[] r0 = X.AnonymousClass8BV.A1b(r6)     // Catch:{ all -> 0x05e0 }
            java.lang.String r0 = java.lang.String.format(r1, r0)     // Catch:{ all -> 0x05e0 }
            r3.A03(r2, r0)     // Catch:{ all -> 0x05e0 }
            goto L_0x05c9
        L_0x05df:
            return
        L_0x05e0:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x05e0 }
            throw r1
        L_0x05e3:
            java.lang.Object r2 = r0.A01
            X.Akd r2 = (X.C21472Akd) r2
            java.lang.Object r1 = r0.A02
            X.DMs r1 = (X.DMs) r1
            java.lang.Object r0 = r2.A03
            X.DMs r0 = (X.DMs) r0
            boolean r0 = r0.isCancelled()
            if (r0 != 0) goto L_0x0601
            java.lang.Object r0 = r2.A06
            X.A2q r0 = (X.C20001A2q) r0
            X.EEC r0 = r0.A07()
            r1.A04(r0)
            return
        L_0x0601:
            r0 = 1
            r1.cancel(r0)
            return
        L_0x0606:
            java.lang.Object r1 = r0.A01
            X.9mE r1 = (X.C191229mE) r1
            java.lang.Object r2 = r0.A02
            X.9UL r2 = (X.AnonymousClass9UL) r2
            X.B6c r1 = r1.A02
            r0 = 3
            r1.COf(r2, r0)
            return
        L_0x0615:
            X.A5Z r5 = X.A5Z.A00()
            java.lang.String r4 = X.C198379yF.A04
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "Scheduling work "
            r2.append(r1)
            java.lang.Object r3 = r0.A02
            X.A2t r3 = (X.A2t) r3
            java.lang.String r1 = r3.A0M
            X.AnonymousClass8BW.A16(r5, r1, r4, r2)
            java.lang.Object r0 = r0.A01
            X.9yF r0 = (X.C198379yF) r0
            X.BBo r2 = r0.A01
            r0 = 1
            X.A2t[] r1 = new X.A2t[r0]
            r0 = 0
            r1[r0] = r3
            r2.CGu(r1)
            return
        L_0x063d:
            java.lang.Object r1 = r0.A01
            X.AHp r1 = (X.C20359AHp) r1
            java.lang.Object r4 = r0.A02
            X.9pp r4 = (X.C193279pp) r4
            r3 = 0
            java.lang.Object r2 = r1.A09
            monitor-enter(r2)
            java.util.List r0 = r1.A0A     // Catch:{ all -> 0x0661 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0661 }
        L_0x064f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0661 }
            if (r0 == 0) goto L_0x065f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0661 }
            X.B6b r0 = (X.C22398B6b) r0     // Catch:{ all -> 0x0661 }
            r0.BtY(r4, r3)     // Catch:{ all -> 0x0661 }
            goto L_0x064f
        L_0x065f:
            monitor-exit(r2)     // Catch:{ all -> 0x0661 }
            return
        L_0x0661:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0661 }
            throw r1
        L_0x0664:
            java.lang.Object r1 = r0.A01
            X.CQu r1 = (X.C24944CQu) r1
            java.lang.Object r2 = r0.A02
            X.1GV r0 = r1.A02
            goto L_0x0679
        L_0x066d:
            java.lang.Object r1 = r0.A01
            X.CWP r1 = (X.CWP) r1
            java.lang.Object r2 = r0.A02
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.1GV r0 = r1.A01
        L_0x0679:
            r0.accept(r2)
            return
        L_0x067d:
            java.lang.Object r5 = r0.A01
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r5 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r5
            java.util.Map r1 = r5.A04
            r1.clear()
            java.util.Map r4 = r5.A03
            java.util.Iterator r3 = X.C17890vO.A0l(r4)
        L_0x068c:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x069d
            java.lang.Object r2 = r3.next()
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            r1 = 0
            r2.cancel(r1)
            goto L_0x068c
        L_0x069d:
            r4.clear()
            java.lang.Object r0 = r0.A02
            X.BJL r0 = (X.BJL) r0
            r5.A03(r0)
            return
        L_0x06a8:
            java.lang.Object r1 = r0.A01
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r1 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r1
            java.lang.Object r2 = r0.A02
            java.util.List r2 = (java.util.List) r2
            r1.A04(r2)
            java.io.File r5 = r1.A02
            java.lang.String r11 = "share_targets"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = ".new"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r6 = X.C108945cZ.A17(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = r5.getPath()
            r1.append(r0)
            java.lang.String r0 = ".bak"
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            java.io.File r1 = X.C108945cZ.A17(r0)
            r7 = 0
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0850 }
            if (r0 == 0) goto L_0x06eb
            X.AnonymousClass9O9.A00(r1, r5)     // Catch:{ Exception -> 0x0850 }
        L_0x06eb:
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r6)     // Catch:{ FileNotFoundException -> 0x06f0 }
            goto L_0x06fe
        L_0x06f0:
            java.io.File r0 = r6.getParentFile()     // Catch:{ Exception -> 0x0850 }
            boolean r0 = r0.mkdirs()     // Catch:{ Exception -> 0x0850 }
            if (r0 == 0) goto L_0x0830
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r6)     // Catch:{ FileNotFoundException -> 0x083f }
        L_0x06fe:
            java.io.BufferedOutputStream r10 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0852 }
            r10.<init>(r3)     // Catch:{ Exception -> 0x0852 }
            org.xmlpull.v1.XmlSerializer r9 = android.util.Xml.newSerializer()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "UTF_8"
            r9.setOutput(r10, r0)     // Catch:{ Exception -> 0x0852 }
            java.lang.Boolean r0 = X.AnonymousClass000.A0i()     // Catch:{ Exception -> 0x0852 }
            r9.startDocument(r7, r0)     // Catch:{ Exception -> 0x0852 }
            r9.startTag(r7, r11)     // Catch:{ Exception -> 0x0852 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ Exception -> 0x0852 }
        L_0x071a:
            boolean r0 = r16.hasNext()     // Catch:{ Exception -> 0x0852 }
            if (r0 == 0) goto L_0x0803
            java.lang.Object r2 = r16.next()     // Catch:{ Exception -> 0x0852 }
            X.9cN r2 = (X.C185309cN) r2     // Catch:{ Exception -> 0x0852 }
            java.lang.String r8 = "target"
            r9.startTag(r7, r8)     // Catch:{ Exception -> 0x0852 }
            X.6zE r14 = r2.A00     // Catch:{ Exception -> 0x0852 }
            java.lang.String r1 = "id"
            java.lang.String r0 = r14.A0D     // Catch:{ Exception -> 0x0852 }
            X.C196339us.A01(r1, r0, r9)     // Catch:{ Exception -> 0x0852 }
            java.lang.CharSequence r0 = r14.A0B     // Catch:{ Exception -> 0x0852 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "short_label"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
            int r0 = r14.A02     // Catch:{ Exception -> 0x0852 }
            java.lang.String r1 = java.lang.Integer.toString(r0)     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "rank"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
            java.lang.CharSequence r0 = r14.A0C     // Catch:{ Exception -> 0x0852 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0852 }
            if (r0 != 0) goto L_0x075d
            java.lang.CharSequence r0 = r14.A0C     // Catch:{ Exception -> 0x0852 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "long_label"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
        L_0x075d:
            java.lang.CharSequence r0 = r14.A0A     // Catch:{ Exception -> 0x0852 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0852 }
            if (r0 != 0) goto L_0x0770
            java.lang.CharSequence r0 = r14.A0A     // Catch:{ Exception -> 0x0852 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "disabled_message"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
        L_0x0770:
            android.content.ComponentName r0 = r14.A04     // Catch:{ Exception -> 0x0852 }
            if (r0 == 0) goto L_0x077d
            java.lang.String r1 = r0.flattenToString()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "component"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
        L_0x077d:
            java.lang.String r1 = r2.A02     // Catch:{ Exception -> 0x0852 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0852 }
            if (r0 != 0) goto L_0x078a
            java.lang.String r0 = "icon_resource_name"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
        L_0x078a:
            java.lang.String r1 = r2.A01     // Catch:{ Exception -> 0x0852 }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x0852 }
            if (r0 != 0) goto L_0x0797
            java.lang.String r0 = "icon_bitmap_path"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
        L_0x0797:
            android.content.Intent[] r1 = r14.A0P     // Catch:{ Exception -> 0x0852 }
            int r0 = r1.length     // Catch:{ Exception -> 0x0852 }
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r1, r0)     // Catch:{ Exception -> 0x0852 }
            android.content.Intent[] r13 = (android.content.Intent[]) r13     // Catch:{ Exception -> 0x0852 }
            int r12 = r13.length     // Catch:{ Exception -> 0x0852 }
            r4 = 0
        L_0x07a2:
            if (r4 >= r12) goto L_0x07da
            r15 = r13[r4]     // Catch:{ Exception -> 0x0852 }
            java.lang.String r2 = "intent"
            r9.startTag(r7, r2)     // Catch:{ Exception -> 0x0852 }
            java.lang.String r1 = "action"
            java.lang.String r0 = r15.getAction()     // Catch:{ Exception -> 0x0852 }
            X.C196339us.A01(r1, r0, r9)     // Catch:{ Exception -> 0x0852 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x0852 }
            if (r0 == 0) goto L_0x07d4
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "targetPackage"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
            android.content.ComponentName r0 = r15.getComponent()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r1 = r0.getClassName()     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "targetClass"
            X.C196339us.A01(r0, r1, r9)     // Catch:{ Exception -> 0x0852 }
        L_0x07d4:
            r9.endTag(r7, r2)     // Catch:{ Exception -> 0x0852 }
            int r4 = r4 + 1
            goto L_0x07a2
        L_0x07da:
            java.util.Set r0 = r14.A0F     // Catch:{ Exception -> 0x0852 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x0852 }
        L_0x07e0:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x0852 }
            if (r0 == 0) goto L_0x07fe
            java.lang.String r2 = X.C17880vN.A0v(r4)     // Catch:{ Exception -> 0x0852 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0852 }
            if (r0 != 0) goto L_0x07e0
            java.lang.String r1 = "categories"
            r9.startTag(r7, r1)     // Catch:{ Exception -> 0x0852 }
            java.lang.String r0 = "name"
            X.C196339us.A01(r0, r2, r9)     // Catch:{ Exception -> 0x0852 }
            r9.endTag(r7, r1)     // Catch:{ Exception -> 0x0852 }
            goto L_0x07e0
        L_0x07fe:
            r9.endTag(r7, r8)     // Catch:{ Exception -> 0x0852 }
            goto L_0x071a
        L_0x0803:
            r9.endTag(r7, r11)     // Catch:{ Exception -> 0x0852 }
            r9.endDocument()     // Catch:{ Exception -> 0x0852 }
            r10.flush()     // Catch:{ Exception -> 0x0852 }
            r3.flush()     // Catch:{ Exception -> 0x0852 }
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ IOException -> 0x0818 }
            r0.sync()     // Catch:{ IOException -> 0x0818 }
            r0 = 1
            goto L_0x0819
        L_0x0818:
            r0 = 0
        L_0x0819:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x0822
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)     // Catch:{ Exception -> 0x0852 }
        L_0x0822:
            r3.close()     // Catch:{ IOException -> 0x0826 }
            goto L_0x082c
        L_0x0826:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)     // Catch:{ Exception -> 0x0852 }
        L_0x082c:
            X.AnonymousClass9O9.A00(r6, r5)     // Catch:{ Exception -> 0x0852 }
            return
        L_0x0830:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0850 }
            java.lang.String r0 = "Failed to create directory for "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ Exception -> 0x0850 }
            java.io.IOException r0 = X.C17880vN.A0f(r0)     // Catch:{ Exception -> 0x0850 }
            goto L_0x084f
        L_0x083f:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0850 }
            java.lang.String r0 = "Failed to create new file "
            java.lang.String r1 = X.AnonymousClass001.A1E(r6, r0, r1)     // Catch:{ Exception -> 0x0850 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x0850 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0850 }
        L_0x084f:
            throw r0     // Catch:{ Exception -> 0x0850 }
        L_0x0850:
            r4 = move-exception
            goto L_0x0854
        L_0x0852:
            r4 = move-exception
            r7 = r3
        L_0x0854:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r3 = "Failed to write to file "
            java.lang.String r1 = X.AnonymousClass001.A1E(r5, r3, r0)
            java.lang.String r0 = "ShortcutInfoCompatSaver"
            android.util.Log.e(r0, r1, r4)
            if (r7 == 0) goto L_0x0895
            java.io.FileDescriptor r0 = r7.getFD()     // Catch:{ IOException -> 0x086e }
            r0.sync()     // Catch:{ IOException -> 0x086e }
            r0 = 1
            goto L_0x086f
        L_0x086e:
            r0 = 0
        L_0x086f:
            java.lang.String r2 = "AtomicFile"
            if (r0 != 0) goto L_0x0878
            java.lang.String r0 = "Failed to sync file output stream"
            android.util.Log.e(r2, r0)
        L_0x0878:
            r7.close()     // Catch:{ IOException -> 0x087c }
            goto L_0x0882
        L_0x087c:
            r1 = move-exception
            java.lang.String r0 = "Failed to close file output stream"
            android.util.Log.e(r2, r0, r1)
        L_0x0882:
            boolean r0 = r6.delete()
            if (r0 != 0) goto L_0x0895
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Failed to delete new file "
            java.lang.String r0 = X.AnonymousClass001.A1E(r6, r0, r1)
            android.util.Log.e(r2, r0)
        L_0x0895:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A10()
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r3, r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0, r4)
            throw r1
        L_0x08a3:
            java.lang.Object r1 = r0.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.Object r0 = r0.A02
            X.AlC r0 = (X.C21503AlC) r0
            r1.run()     // Catch:{ all -> 0x08b2 }
            r0.A00()
            return
        L_0x08b2:
            r1 = move-exception
            r0.A00()
            throw r1
        L_0x08b7:
            java.lang.Object r3 = r0.A02
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.util.Iterator r5 = r3.iterator()
        L_0x08bf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x08f0
            java.lang.Object r10 = r5.next()
            X.1xT r10 = (X.C42011xT) r10
            java.lang.Object r9 = r0.A01
            X.1qV r9 = (X.C37981qV) r9
            android.view.View r7 = r10.A0H
            android.view.ViewPropertyAnimator r8 = r7.animate()
            java.util.ArrayList r1 = r9.A00
            r1.add(r10)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r4 = r8.alpha(r1)
            long r1 = r9.A00
            android.view.ViewPropertyAnimator r1 = r4.setDuration(r1)
            r11 = 1
            X.5cx r6 = new X.5cx
            r6.<init>((android.view.View) r7, (android.view.ViewPropertyAnimator) r8, (X.C37981qV) r9, (X.C42011xT) r10, (int) r11)
            X.AnonymousClass8BS.A0y(r6, r1)
            goto L_0x08bf
        L_0x08f0:
            r3.clear()
            java.lang.Object r0 = r0.A01
            X.1qV r0 = (X.C37981qV) r0
            java.util.ArrayList r0 = r0.A01
            goto L_0x09f0
        L_0x08fb:
            java.lang.Object r3 = r0.A02
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.util.Iterator r6 = r3.iterator()
        L_0x0903:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x0989
            java.lang.Object r10 = r6.next()
            X.6UZ r10 = (X.AnonymousClass6UZ) r10
            java.lang.Object r11 = r0.A01
            X.1qV r11 = (X.C37981qV) r11
            X.1xT r1 = r10.A05
            r13 = 0
            if (r1 != 0) goto L_0x0986
            r8 = r13
        L_0x0919:
            X.1xT r1 = r10.A04
            if (r1 == 0) goto L_0x091f
            android.view.View r13 = r1.A0H
        L_0x091f:
            r4 = 0
            if (r8 == 0) goto L_0x0954
            android.view.ViewPropertyAnimator r5 = r8.animate()
            long r1 = r11.A09()
            android.view.ViewPropertyAnimator r9 = r5.setDuration(r1)
            java.util.ArrayList r2 = r11.A02
            X.1xT r1 = r10.A05
            r2.add(r1)
            int r2 = r10.A02
            int r1 = r10.A00
            int r2 = r2 - r1
            float r1 = (float) r2
            r9.translationX(r1)
            int r2 = r10.A03
            int r1 = r10.A01
            int r2 = r2 - r1
            float r1 = (float) r2
            r9.translationY(r1)
            android.view.ViewPropertyAnimator r1 = r9.alpha(r4)
            r12 = 2
            X.5cx r7 = new X.5cx
            r7.<init>((android.view.View) r8, (android.view.ViewPropertyAnimator) r9, (X.AnonymousClass6UZ) r10, (X.C37981qV) r11, (int) r12)
            X.AnonymousClass8BS.A0y(r7, r1)
        L_0x0954:
            if (r13 == 0) goto L_0x0903
            android.view.ViewPropertyAnimator r14 = r13.animate()
            java.util.ArrayList r2 = r11.A02
            X.1xT r1 = r10.A04
            r2.add(r1)
            android.view.ViewPropertyAnimator r1 = r14.translationX(r4)
            android.view.ViewPropertyAnimator r4 = r1.translationY(r4)
            long r1 = r11.A09()
            android.view.ViewPropertyAnimator r2 = r4.setDuration(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r1 = r2.alpha(r1)
            r17 = 3
            X.5cx r12 = new X.5cx
            r15 = r10
            r16 = r11
            r12.<init>((android.view.View) r13, (android.view.ViewPropertyAnimator) r14, (X.AnonymousClass6UZ) r15, (X.C37981qV) r16, (int) r17)
            X.AnonymousClass8BS.A0y(r12, r1)
            goto L_0x0903
        L_0x0986:
            android.view.View r8 = r1.A0H
            goto L_0x0919
        L_0x0989:
            r3.clear()
            java.lang.Object r0 = r0.A01
            X.1qV r0 = (X.C37981qV) r0
            java.util.ArrayList r0 = r0.A03
            goto L_0x09f0
        L_0x0993:
            java.lang.Object r3 = r0.A02
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            java.util.Iterator r5 = r3.iterator()
        L_0x099b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x09e7
            java.lang.Object r4 = r5.next()
            X.2Rx r4 = (X.C49782Rx) r4
            java.lang.Object r9 = r0.A01
            X.1qV r9 = (X.C37981qV) r9
            X.1xT r10 = r4.A04
            int r2 = r4.A00
            int r1 = r4.A01
            int r11 = r4.A02
            int r12 = r4.A03
            android.view.View r7 = r10.A0H
            int r11 = r11 - r2
            int r12 = r12 - r1
            r2 = 0
            if (r11 == 0) goto L_0x09c3
            android.view.ViewPropertyAnimator r1 = r7.animate()
            r1.translationX(r2)
        L_0x09c3:
            if (r12 == 0) goto L_0x09cc
            android.view.ViewPropertyAnimator r1 = r7.animate()
            r1.translationY(r2)
        L_0x09cc:
            android.view.ViewPropertyAnimator r8 = r7.animate()
            java.util.ArrayList r1 = r9.A04
            r1.add(r10)
            long r1 = r9.A0A()
            android.view.ViewPropertyAnimator r1 = r8.setDuration(r1)
            r13 = 0
            X.5cw r6 = new X.5cw
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass8BS.A0y(r6, r1)
            goto L_0x099b
        L_0x09e7:
            r3.clear()
            java.lang.Object r0 = r0.A01
            X.1qV r0 = (X.C37981qV) r0
            java.util.ArrayList r0 = r0.A05
        L_0x09f0:
            r0.remove(r3)
            return
        L_0x09f4:
            java.lang.Object r2 = r0.A01
            X.9ld r2 = (X.C190859ld) r2
            java.lang.Object r1 = r0.A02
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            java.util.Queue r0 = r2.A03
            boolean r0 = r0.offer(r1)
            if (r0 == 0) goto L_0x0a0a
            r2.A00()
            return
        L_0x0a0a:
            java.lang.String r0 = "cannot enqueue any more runnables"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0n(r0)
            throw r1
        L_0x0a11:
            java.lang.Object r3 = r0.A01
            X.1t9 r3 = (X.C39481t9) r3
            java.lang.Object r2 = r0.A02
            X.2SF r2 = (X.AnonymousClass2SF) r2
            r0 = 2
            boolean r0 = X.AnonymousClass1GP.A0G(r0)
            if (r0 == 0) goto L_0x0a37
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Transition for operation "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " has completed"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            java.lang.String r0 = "FragmentManager"
            android.util.Log.v(r0, r1)
        L_0x0a37:
            r3.A03(r2)
            return
        L_0x0a3b:
            java.lang.Object r1 = r0.A01
            X.1Zq r1 = (X.C28251Zq) r1
            java.lang.Object r0 = r0.A02
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            r1.A03(r0)
            return
        L_0x0a47:
            java.lang.Object r1 = r0.A01
            android.app.Application r1 = (android.app.Application) r1
            java.lang.Object r0 = r0.A02
            X.A9G r0 = (X.A9G) r0
            r1.unregisterActivityLifecycleCallbacks(r0)
            return
        L_0x0a53:
            java.lang.Object r1 = r0.A01
            X.A9G r1 = (X.A9G) r1
            java.lang.Object r0 = r0.A02
            r1.A00 = r0
            return
        L_0x0a5c:
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x0a70 }
            X.C108945cZ.A1P(r1)     // Catch:{ all -> 0x0a70 }
            java.lang.Object r1 = r0.A02
            X.AlD r1 = (X.C21504AlD) r1
            java.lang.Object r0 = r1.A01
            monitor-enter(r0)
            r1.A00()     // Catch:{ all -> 0x0a6d }
            monitor-exit(r0)     // Catch:{ all -> 0x0a6d }
            return
        L_0x0a6d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0a6d }
            throw r1
        L_0x0a70:
            r2 = move-exception
            java.lang.Object r1 = r0.A02
            X.AlD r1 = (X.C21504AlD) r1
            java.lang.Object r0 = r1.A01
            monitor-enter(r0)
            r1.A00()     // Catch:{ all -> 0x0a7d }
        L_0x0a7b:
            monitor-exit(r0)     // Catch:{ all -> 0x0a7d }
            goto L_0x0a7f
        L_0x0a7d:
            r2 = move-exception
            goto L_0x0a7b
        L_0x0a7f:
            throw r2
        L_0x0a80:
            java.lang.Object r3 = r0.A02     // Catch:{ all -> 0x0ad5 }
            X.A7G r3 = (X.A7G) r3     // Catch:{ all -> 0x0ad5 }
            java.util.HashSet r1 = X.C17880vN.A12()     // Catch:{ all -> 0x0ad5 }
            boolean r1 = X.A7G.A01(r3, r1)     // Catch:{ all -> 0x0ad5 }
            if (r1 != 0) goto L_0x0abd
            X.A7W r6 = r3.A02     // Catch:{ all -> 0x0ad5 }
            androidx.work.impl.WorkDatabase r5 = r6.A04     // Catch:{ all -> 0x0ad5 }
            r5.A07()     // Catch:{ all -> 0x0ad5 }
            X.00I r4 = r6.A02     // Catch:{ all -> 0x0ad0 }
            X.C196369uw.A01(r4, r3, r5)     // Catch:{ all -> 0x0ad0 }
            boolean r1 = A00(r3)     // Catch:{ all -> 0x0ad0 }
            r5.A08()     // Catch:{ all -> 0x0ad0 }
            X.C20076A6c.A02(r5)     // Catch:{ all -> 0x0ad5 }
            if (r1 == 0) goto L_0x0ab3
            android.content.Context r3 = r6.A01     // Catch:{ all -> 0x0ad5 }
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r2 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            r1 = 1
            X.C197039w3.A00(r3, r2, r1)     // Catch:{ all -> 0x0ad5 }
            java.util.List r1 = r6.A07     // Catch:{ all -> 0x0ad5 }
            X.C20066A5p.A01(r4, r5, r1)     // Catch:{ all -> 0x0ad5 }
        L_0x0ab3:
            java.lang.Object r2 = r0.A01     // Catch:{ all -> 0x0ad5 }
            X.AHc r2 = (X.C20346AHc) r2     // Catch:{ all -> 0x0ad5 }
            X.8Jr r1 = X.BDL.A01     // Catch:{ all -> 0x0ad5 }
            r2.A00(r1)     // Catch:{ all -> 0x0ad5 }
            return
        L_0x0abd:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ad5 }
            java.lang.String r1 = "WorkContinuation has cycles ("
            r2.append(r1)     // Catch:{ all -> 0x0ad5 }
            r2.append(r3)     // Catch:{ all -> 0x0ad5 }
            java.lang.String r1 = ")"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0o(r1, r2)     // Catch:{ all -> 0x0ad5 }
            goto L_0x0ad4
        L_0x0ad0:
            r1 = move-exception
            X.C20076A6c.A02(r5)     // Catch:{ all -> 0x0ad5 }
        L_0x0ad4:
            throw r1     // Catch:{ all -> 0x0ad5 }
        L_0x0ad5:
            r2 = move-exception
            java.lang.Object r1 = r0.A01
            X.AHc r1 = (X.C20346AHc) r1
            X.8Js r0 = new X.8Js
            r0.<init>(r2)
            r1.A00(r0)
            return
        L_0x0ae3:
            java.lang.Object r1 = r0.A01     // Catch:{ all -> 0x0af3 }
            androidx.work.Worker r1 = (androidx.work.Worker) r1     // Catch:{ all -> 0x0af3 }
            X.9rG r2 = r1.A0A()     // Catch:{ all -> 0x0af3 }
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x0af3 }
            X.5oM r1 = (X.C113975oM) r1     // Catch:{ all -> 0x0af3 }
            r1.A05(r2)     // Catch:{ all -> 0x0af3 }
            return
        L_0x0af3:
            r1 = move-exception
            java.lang.Object r0 = r0.A02
            X.DMs r0 = (X.DMs) r0
            r0.A06(r1)
            return
        L_0x0afc:
            java.lang.Object r2 = r0.A02     // Catch:{ Exception -> 0x0cc4 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ Exception -> 0x0cc4 }
            boolean r1 = r2.exists()     // Catch:{ Exception -> 0x0cc4 }
            if (r1 == 0) goto L_0x0b41
            boolean r1 = r2.isDirectory()     // Catch:{ Exception -> 0x0cc4 }
            if (r1 != 0) goto L_0x0b41
            boolean r1 = r2.delete()     // Catch:{ Exception -> 0x0cc4 }
            if (r1 != 0) goto L_0x0b41
        L_0x0b12:
            java.lang.Object r3 = r0.A01     // Catch:{ Exception -> 0x0cc4 }
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r3 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r3     // Catch:{ Exception -> 0x0cc4 }
            java.io.File r1 = r3.A01     // Catch:{ Exception -> 0x0cc4 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0cc4 }
            if (r0 == 0) goto L_0x0b3d
            boolean r0 = r1.isDirectory()     // Catch:{ Exception -> 0x0cc4 }
            if (r0 != 0) goto L_0x0b3d
            boolean r0 = r1.delete()     // Catch:{ Exception -> 0x0cc4 }
            if (r0 != 0) goto L_0x0b3d
        L_0x0b2a:
            java.util.Map r0 = r3.A04     // Catch:{ Exception -> 0x0cc4 }
            r22 = r0
            java.io.File r0 = r3.A02     // Catch:{ Exception -> 0x0cc4 }
            r21 = r0
            android.content.Context r0 = r3.A00     // Catch:{ Exception -> 0x0cc4 }
            r20 = r0
            r8 = 0
            X.00P r5 = new X.00P     // Catch:{ Exception -> 0x0cc4 }
            r5.<init>(r8)     // Catch:{ Exception -> 0x0cc4 }
            goto L_0x0b45
        L_0x0b3d:
            X.AnonymousClass8BV.A1H(r1)     // Catch:{ Exception -> 0x0cc4 }
            goto L_0x0b2a
        L_0x0b41:
            X.AnonymousClass8BV.A1H(r2)     // Catch:{ Exception -> 0x0cc4 }
            goto L_0x0b12
        L_0x0b45:
            java.io.FileInputStream r19 = X.C108945cZ.A18(r21)     // Catch:{ Exception -> 0x0c99 }
            boolean r0 = r21.exists()     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0c8b
            org.xmlpull.v1.XmlPullParser r7 = android.util.Xml.newPullParser()     // Catch:{ all -> 0x0c8f }
            java.lang.String r1 = "UTF_8"
            r0 = r19
            r7.setInput(r0, r1)     // Catch:{ all -> 0x0c8f }
        L_0x0b5a:
            int r1 = r7.next()     // Catch:{ all -> 0x0c8f }
            r0 = 1
            if (r1 == r0) goto L_0x0c8b
            r0 = 2
            if (r1 != r0) goto L_0x0b5a
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x0c8f }
            java.lang.String r1 = "target"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0b5a
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x0c8f }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0b5a
            java.lang.String r0 = "id"
            java.lang.String r18 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "short_label"
            java.lang.String r17 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            boolean r0 = android.text.TextUtils.isEmpty(r18)     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0b5a
            boolean r0 = android.text.TextUtils.isEmpty(r17)     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0b5a
            java.lang.String r0 = "rank"
            java.lang.String r0 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            int r14 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "long_label"
            java.lang.String r13 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "disabled_message"
            java.lang.String r12 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "component"
            java.lang.String r2 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0bb6
            r11 = 0
            goto L_0x0bba
        L_0x0bb6:
            android.content.ComponentName r11 = android.content.ComponentName.unflattenFromString(r2)     // Catch:{ all -> 0x0c8f }
        L_0x0bba:
            java.lang.String r0 = "icon_resource_name"
            java.lang.String r10 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "icon_bitmap_path"
            java.lang.String r9 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            java.util.ArrayList r6 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0c8f }
            java.util.HashSet r4 = X.C17880vN.A12()     // Catch:{ all -> 0x0c8f }
        L_0x0bce:
            int r2 = r7.next()     // Catch:{ all -> 0x0c8f }
            r0 = 1
            if (r2 == r0) goto L_0x0c34
            r0 = 2
            if (r2 != r0) goto L_0x0c27
            java.lang.String r2 = r7.getName()     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "intent"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0bfc
            java.lang.String r0 = "categories"
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0bce
            java.lang.String r0 = "name"
            java.lang.String r2 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0bce
            r4.add(r2)     // Catch:{ all -> 0x0c8f }
            goto L_0x0bce
        L_0x0bfc:
            java.lang.String r0 = "action"
            java.lang.String r16 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "targetPackage"
            java.lang.String r15 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = "targetClass"
            java.lang.String r2 = X.C196339us.A00(r0, r7)     // Catch:{ all -> 0x0c8f }
            if (r16 == 0) goto L_0x0bce
            android.content.Intent r0 = X.C108945cZ.A0G(r16)     // Catch:{ all -> 0x0c8f }
            boolean r16 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x0c8f }
            if (r16 != 0) goto L_0x0c23
            boolean r16 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0c8f }
            if (r16 != 0) goto L_0x0c23
            r0.setClassName(r15, r2)     // Catch:{ all -> 0x0c8f }
        L_0x0c23:
            r6.add(r0)     // Catch:{ all -> 0x0c8f }
            goto L_0x0bce
        L_0x0c27:
            r0 = 3
            if (r2 != r0) goto L_0x0bce
            java.lang.String r0 = r7.getName()     // Catch:{ all -> 0x0c8f }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0c8f }
            if (r0 == 0) goto L_0x0bce
        L_0x0c34:
            X.71Y r2 = new X.71Y     // Catch:{ all -> 0x0c8f }
            r1 = r20
            r0 = r18
            r2.<init>((android.content.Context) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0c8f }
            X.6zE r1 = r2.A00     // Catch:{ all -> 0x0c8f }
            r0 = r17
            r1.A0B = r0     // Catch:{ all -> 0x0c8f }
            r1.A02 = r14     // Catch:{ all -> 0x0c8f }
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0c4d
            r1.A0C = r13     // Catch:{ all -> 0x0c8f }
        L_0x0c4d:
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0c55
            r1.A0A = r12     // Catch:{ all -> 0x0c8f }
        L_0x0c55:
            if (r11 == 0) goto L_0x0c59
            r1.A04 = r11     // Catch:{ all -> 0x0c8f }
        L_0x0c59:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0c69
            android.content.Intent[] r0 = new android.content.Intent[r8]     // Catch:{ all -> 0x0c8f }
            java.lang.Object[] r0 = r6.toArray(r0)     // Catch:{ all -> 0x0c8f }
            android.content.Intent[] r0 = (android.content.Intent[]) r0     // Catch:{ all -> 0x0c8f }
            r1.A0P = r0     // Catch:{ all -> 0x0c8f }
        L_0x0c69:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x0c8f }
            if (r0 != 0) goto L_0x0c79
            X.016 r0 = new X.016     // Catch:{ all -> 0x0c8f }
            r0.<init>((int) r8)     // Catch:{ all -> 0x0c8f }
            r0.addAll(r4)     // Catch:{ all -> 0x0c8f }
            r1.A0F = r0     // Catch:{ all -> 0x0c8f }
        L_0x0c79:
            X.6zE r0 = r2.A00()     // Catch:{ all -> 0x0c8f }
            X.9cN r1 = new X.9cN     // Catch:{ all -> 0x0c8f }
            r1.<init>(r0, r10, r9)     // Catch:{ all -> 0x0c8f }
            X.6zE r0 = r1.A00     // Catch:{ all -> 0x0c8f }
            java.lang.String r0 = r0.A0D     // Catch:{ all -> 0x0c8f }
            r5.put(r0, r1)     // Catch:{ all -> 0x0c8f }
            goto L_0x0b5a
        L_0x0c8b:
            r19.close()     // Catch:{ Exception -> 0x0c99 }
            goto L_0x0cb3
        L_0x0c8f:
            r1 = move-exception
            r19.close()     // Catch:{ all -> 0x0c94 }
            goto L_0x0c98
        L_0x0c94:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ Exception -> 0x0c99 }
        L_0x0c98:
            throw r1     // Catch:{ Exception -> 0x0c99 }
        L_0x0c99:
            r4 = move-exception
            r21.delete()     // Catch:{ Exception -> 0x0cc4 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Exception -> 0x0cc4 }
            java.lang.String r1 = "Failed to load saved values from file "
            r0 = r21
            X.C17900vP.A0N(r0, r1, r2)     // Catch:{ Exception -> 0x0cc4 }
            java.lang.String r0 = ". Old state removed, new added"
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r2)     // Catch:{ Exception -> 0x0cc4 }
            java.lang.String r0 = "ShortcutInfoCompatSaver"
            android.util.Log.e(r0, r1, r4)     // Catch:{ Exception -> 0x0cc4 }
        L_0x0cb3:
            r0 = r22
            r0.putAll(r5)     // Catch:{ Exception -> 0x0cc4 }
            java.util.Collection r0 = r22.values()     // Catch:{ Exception -> 0x0cc4 }
            java.util.ArrayList r0 = X.C17880vN.A10(r0)     // Catch:{ Exception -> 0x0cc4 }
            r3.A04(r0)     // Catch:{ Exception -> 0x0cc4 }
            return
        L_0x0cc4:
            r2 = move-exception
            java.lang.String r1 = "ShortcutInfoCompatSaver"
            java.lang.String r0 = "ShortcutInfoCompatSaver started with an exceptions "
            android.util.Log.w(r1, r0, r2)
            return
        L_0x0ccd:
            r4 = move-exception
            if (r8 == 0) goto L_0x0ceb
            monitor-enter(r7)     // Catch:{ Exception -> 0x0cd9 }
            r7.remove(r8)     // Catch:{ all -> 0x0cd6 }
            monitor-exit(r7)     // Catch:{ all -> 0x0cd6 }
            throw r4
        L_0x0cd6:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0cd6 }
            throw r0     // Catch:{ Exception -> 0x0cd9 }
        L_0x0cd9:
            r0 = move-exception
            java.lang.String r3 = "MediaCodecPoolOptimized"
            java.lang.String r2 = "error-while-release-codec-from-set-finally: %s"
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = X.AnonymousClass8BS.A0l(r0, r2, r1, r5)
            android.util.Log.w(r3, r0)
        L_0x0ceb:
            throw r4
        L_0x0cec:
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x0d4f }
            X.5oM r0 = (X.C113975oM) r0     // Catch:{ all -> 0x0d4f }
            java.lang.Object r7 = r0.get()     // Catch:{ all -> 0x0d4f }
            X.9rG r7 = (X.C194159rG) r7     // Catch:{ all -> 0x0d4f }
            if (r7 == 0) goto L_0x0d36
            X.A5Z r4 = X.A5Z.A00()     // Catch:{ all -> 0x0d4f }
            java.lang.String r3 = X.C182079Sz.A00     // Catch:{ all -> 0x0d4f }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0d4f }
            java.lang.String r0 = "Updating notification for "
            r1.append(r0)     // Catch:{ all -> 0x0d4f }
            java.lang.Object r0 = r5.A05     // Catch:{ all -> 0x0d4f }
            X.A2t r0 = (X.A2t) r0     // Catch:{ all -> 0x0d4f }
            java.lang.String r0 = r0.A0I     // Catch:{ all -> 0x0d4f }
            X.AnonymousClass8BW.A16(r4, r0, r3, r1)     // Catch:{ all -> 0x0d4f }
            java.lang.Object r6 = r5.A02     // Catch:{ all -> 0x0d4f }
            X.B4L r6 = (X.B4L) r6     // Catch:{ all -> 0x0d4f }
            java.lang.Object r8 = r5.A01     // Catch:{ all -> 0x0d4f }
            android.content.Context r8 = (android.content.Context) r8     // Catch:{ all -> 0x0d4f }
            java.lang.Object r0 = r5.A06     // Catch:{ all -> 0x0d4f }
            X.A2q r0 = (X.C20001A2q) r0     // Catch:{ all -> 0x0d4f }
            androidx.work.WorkerParameters r0 = r0.A01     // Catch:{ all -> 0x0d4f }
            java.util.UUID r5 = r0.A08     // Catch:{ all -> 0x0d4f }
            X.AHb r6 = (X.C20345AHb) r6     // Catch:{ all -> 0x0d4f }
            X.5oM r9 = new X.5oM     // Catch:{ all -> 0x0d4f }
            r9.<init>()     // Catch:{ all -> 0x0d4f }
            X.3Kb r0 = r6.A02     // Catch:{ all -> 0x0d4f }
            r10 = 1
            X.AkZ r4 = new X.AkZ     // Catch:{ all -> 0x0d4f }
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0d4f }
            r0.BKq(r4)     // Catch:{ all -> 0x0d4f }
            r2.A04(r9)     // Catch:{ all -> 0x0d4f }
            return
        L_0x0d36:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0d4f }
            java.lang.String r0 = "Worker was marked important ("
            r1.append(r0)     // Catch:{ all -> 0x0d4f }
            java.lang.Object r0 = r5.A05     // Catch:{ all -> 0x0d4f }
            X.A2t r0 = (X.A2t) r0     // Catch:{ all -> 0x0d4f }
            java.lang.String r0 = r0.A0I     // Catch:{ all -> 0x0d4f }
            r1.append(r0)     // Catch:{ all -> 0x0d4f }
            java.lang.String r0 = ") but did not provide ForegroundInfo"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ all -> 0x0d4f }
            throw r0     // Catch:{ all -> 0x0d4f }
        L_0x0d4f:
            r0 = move-exception
            r2.A06(r0)
            return
        L_0x0d54:
            java.lang.Object r0 = r0.A02     // Catch:{ all -> 0x0d7b }
            X.EEC r0 = (X.EEC) r0     // Catch:{ all -> 0x0d7b }
            r0.get()     // Catch:{ all -> 0x0d7b }
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x0d7b }
            java.lang.String r2 = X.C21469Aka.A0I     // Catch:{ all -> 0x0d7b }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0d7b }
            java.lang.String r0 = "Starting work for "
            r1.append(r0)     // Catch:{ all -> 0x0d7b }
            X.A2t r0 = r5.A08     // Catch:{ all -> 0x0d7b }
            java.lang.String r0 = r0.A0I     // Catch:{ all -> 0x0d7b }
            X.AnonymousClass8BW.A16(r3, r0, r2, r1)     // Catch:{ all -> 0x0d7b }
            X.A2q r0 = r5.A03     // Catch:{ all -> 0x0d7b }
            X.EEC r0 = r0.A08()     // Catch:{ all -> 0x0d7b }
            r4.A04(r0)     // Catch:{ all -> 0x0d7b }
            return
        L_0x0d7b:
            r0 = move-exception
            r4.A06(r0)
            return
        L_0x0d80:
            return
        L_0x0d81:
            r2 = move-exception
            java.lang.String r1 = "ActivityRecreator"
            java.lang.String r0 = "Exception while invoking performStopActivity"
            android.util.Log.e(r1, r0, r2)
            return
        L_0x0d8a:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21471Akc.run():void");
    }

    public C21471Akc(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public C21471Akc(C21469Aka aka, EEC eec, int i) {
        this.A00 = i;
        if (19 - i != 0) {
            this.A01 = aka;
            this.A02 = eec;
            return;
        }
        this.A01 = aka;
        this.A02 = eec;
    }

    public C21471Akc(C20359AHp aHp, C193279pp r3) {
        this.A00 = 18;
        this.A01 = aHp;
        this.A02 = r3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C21471Akc(A7G a7g) {
        this((Object) new C20346AHc(), (Object) a7g, 24);
        this.A00 = 24;
    }
}
