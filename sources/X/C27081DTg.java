package X;

import android.graphics.Rect;

/* renamed from: X.DTg  reason: case insensitive filesystem */
public class C27081DTg implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public static Rect A00(int i, int i2, int i3, int i4) {
        int min = Math.min((int) (((float) (i - i2)) * 0.2f), (int) (0.2f * ((float) (i3 - i4))));
        return new Rect(Math.max(i2 - min, 0), Math.max(i4 - min, 0), i + min, i3 + min);
    }

    public C27081DTg(C23495Bhz bhz, C23107BbM bbM, C23508BiI biI) {
        this.A03 = 32;
        this.A00 = biI;
        this.A01 = bbM;
        this.A02 = bhz;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.DDt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: X.DDu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v224, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v225, resolved type: X.9zw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v226, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v310, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v312, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v314, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v318, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v320, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v329, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v332, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v334, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v365, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v378, resolved type: X.Cjg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v97, resolved type: X.DDt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v98, resolved type: X.DDt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v99, resolved type: X.DDt} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v772, resolved type: X.9zw} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v773, resolved type: X.9zw} */
    /* JADX WARNING: type inference failed for: r2v53, types: [X.E8l] */
    /* JADX WARNING: type inference failed for: r5v60, types: [X.EEC, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v45, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r14v23, types: [X.EAT] */
    /* JADX WARNING: type inference failed for: r14v25, types: [X.DHa] */
    /* JADX WARNING: type inference failed for: r14v26, types: [X.DHZ] */
    /* JADX WARNING: type inference failed for: r10v50, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v70, types: [java.lang.Thread$UncaughtExceptionHandler, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v48, types: [X.DGr, java.lang.Object, X.E9k] */
    /* JADX WARNING: type inference failed for: r1v594, types: [java.lang.Object, X.CL2] */
    /* JADX WARNING: type inference failed for: r4v57, types: [java.io.OutputStream, java.io.FilterOutputStream, X.Bwp] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.makeEndlessLoop(RegionMaker.java:368)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:172)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processSwitch(RegionMaker.java:871)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:128)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:1109:0x1772 A[Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac, C2L -> 0x18b5 }, LOOP:35: B:1106:0x176a->B:1109:0x1772, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:1112:0x177f A[Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac, C2L -> 0x18b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1114:0x17a1 A[Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac, C2L -> 0x18b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1122:0x1819 A[Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac, C2L -> 0x18b5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:1134:0x1832 A[SYNTHETIC, Splitter:B:1134:0x1832] */
    /* JADX WARNING: Removed duplicated region for block: B:1369:0x1d97  */
    /* JADX WARNING: Removed duplicated region for block: B:1372:0x1da3  */
    /* JADX WARNING: Removed duplicated region for block: B:1381:0x1de7  */
    /* JADX WARNING: Removed duplicated region for block: B:1384:0x1e0f  */
    /* JADX WARNING: Removed duplicated region for block: B:1385:0x1e15  */
    /* JADX WARNING: Removed duplicated region for block: B:1614:0x0b97 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1632:0x0ccc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:1642:0x0f72 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:539:0x0b75 A[Catch:{ all -> 0x0cbb, all -> 0x0d88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:543:0x0b86 A[Catch:{ all -> 0x0cbb, all -> 0x0d88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:596:0x0cac A[Catch:{ all -> 0x0cbb, all -> 0x0d88 }] */
    /* JADX WARNING: Removed duplicated region for block: B:650:0x0dd1 A[Catch:{ all -> 0x0e25, all -> 0x0e4a }] */
    /* JADX WARNING: Removed duplicated region for block: B:662:0x0e10 A[Catch:{ all -> 0x0e25, all -> 0x0e4a }] */
    /* JADX WARNING: Removed duplicated region for block: B:756:0x0fb8  */
    /* JADX WARNING: Removed duplicated region for block: B:759:0x0fc5  */
    /* JADX WARNING: Removed duplicated region for block: B:763:0x0ff7  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:693:0x0e63=Splitter:B:693:0x0e63, B:709:0x0ec4=Splitter:B:709:0x0ec4} */
    public void run() {
        /*
            r48 = this;
            r0 = r48
            int r1 = r0.A03
            switch(r1) {
                case 0: goto L_0x0f1e;
                case 1: goto L_0x0f2e;
                case 2: goto L_0x00a3;
                case 3: goto L_0x0f38;
                case 4: goto L_0x0f4f;
                case 5: goto L_0x0f5c;
                case 6: goto L_0x00bd;
                case 7: goto L_0x0f6c;
                case 8: goto L_0x1025;
                case 9: goto L_0x103e;
                case 10: goto L_0x10ad;
                case 11: goto L_0x10bd;
                case 12: goto L_0x10d3;
                case 13: goto L_0x10f0;
                case 14: goto L_0x115f;
                case 15: goto L_0x1173;
                case 16: goto L_0x1183;
                case 17: goto L_0x12b3;
                case 18: goto L_0x137e;
                case 19: goto L_0x00d6;
                case 20: goto L_0x1566;
                case 21: goto L_0x16bf;
                case 22: goto L_0x16cf;
                case 23: goto L_0x16f3;
                case 24: goto L_0x18d5;
                case 25: goto L_0x0366;
                case 26: goto L_0x220d;
                case 27: goto L_0x037f;
                case 28: goto L_0x1ba7;
                case 29: goto L_0x1bce;
                case 30: goto L_0x1e25;
                case 31: goto L_0x1ec9;
                case 32: goto L_0x1ef3;
                case 33: goto L_0x1f20;
                case 34: goto L_0x1f5c;
                case 35: goto L_0x1f69;
                case 36: goto L_0x1f76;
                case 37: goto L_0x1f8b;
                case 38: goto L_0x1fa4;
                case 39: goto L_0x1fc7;
                case 40: goto L_0x1ff7;
                case 41: goto L_0x203b;
                case 42: goto L_0x205a;
                case 43: goto L_0x20e8;
                case 44: goto L_0x2106;
                case 45: goto L_0x215f;
                case 46: goto L_0x2173;
                case 47: goto L_0x21c3;
                case 48: goto L_0x21dc;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r3 = r0.A00
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r2 = r0.A01
            X.206 r2 = (X.AnonymousClass206) r2
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r2.A0w()
            r4 = r0 ^ 1
            X.00H r0 = r3.A1N
            java.lang.Object r7 = r0.get()
            X.1T6 r7 = (X.AnonymousClass1T6) r7
            X.2iX r6 = new X.2iX
            r6.<init>(r3, r1)
            X.36w r1 = X.C60502o8.A00(r2)
            if (r1 == 0) goto L_0x2214
            java.lang.String r0 = r1.A05
            if (r0 == 0) goto L_0x2214
            X.17r r2 = r7.A00
            java.io.File r1 = r2.A0L(r1)
            java.lang.String r0 = X.C17890vO.A0Q()
            java.io.File r10 = r2.A0c(r0)
            if (r1 == 0) goto L_0x2214
            X.1NL r0 = r7.A0C     // Catch:{ IOException -> 0x009f }
            X.C64062u9.A0E(r0, r1, r10)     // Catch:{ IOException -> 0x009f }
            android.util.Pair r5 = X.C26511Sk.A0B(r10)
            r3 = 1
            if (r4 != r3) goto L_0x009c
            X.1So r1 = X.C26551So.A0a
        L_0x004e:
            r0 = 0
            X.2h8 r14 = X.C60422o0.A01(r0, r1, r10, r3)
            X.1Sb r4 = r7.A04
            r1 = 0
            java.lang.String r0 = X.C17890vO.A0Q()
            r2 = 0
            X.34A r8 = r4.A02(r0, r1, r1, r3)
            java.lang.String r16 = r8.A00()
            X.2h4 r13 = r8.A00
            X.2qf r0 = new X.2qf
            r0.<init>(r1, r1, r3)
            X.BAf r12 = X.AnonymousClass1T6.A00(r14)
            X.2rU r9 = new X.2rU
            r11 = r9
            r15 = r0
            r11.<init>(r12, r13, r14, r15, r16)
            X.73e r1 = r8.A01
            r0 = -1
            r1.A0B(r0, r2, r3)
            X.9i7 r0 = r9.A04
            r1.A0D(r0)
            X.00H r0 = r7.A0F
            r0.get()
            long r11 = java.lang.System.currentTimeMillis()
            X.1Sg r0 = r7.A0B
            X.8ff r0 = r0.A0A(r8, r9)
            X.3Ac r4 = new X.3Ac
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            java.util.concurrent.Executor r1 = r7.A0H
            X.1TJ r0 = r0.A0H
            r0.A03(r4, r1)
            return
        L_0x009c:
            X.1So r1 = X.C26551So.A0L
            goto L_0x004e
        L_0x009f:
            r6.A00()
            return
        L_0x00a3:
            java.lang.Object r1 = r0.A00     // Catch:{ Exception -> 0x00ac }
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch:{ Exception -> 0x00ac }
            java.lang.Object r5 = r1.call()     // Catch:{ Exception -> 0x00ac }
            goto L_0x00ad
        L_0x00ac:
            r5 = 0
        L_0x00ad:
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            android.os.Handler r3 = (android.os.Handler) r3
            r2 = 1
            X.DTg r1 = new X.DTg
            r1.<init>(r5, r0, r4, r2)
            r3.post(r1)
            return
        L_0x00bd:
            java.lang.Object r1 = r0.A01     // Catch:{ Exception -> 0x00cd }
            X.EEC r1 = (X.EEC) r1     // Catch:{ Exception -> 0x00cd }
            r1.get()     // Catch:{ Exception -> 0x00cd }
            java.lang.Object r2 = r0.A02     // Catch:{ Exception -> 0x00cd }
            X.BJL r2 = (X.BJL) r2     // Catch:{ Exception -> 0x00cd }
            r1 = 0
            r2.A04(r1)     // Catch:{ Exception -> 0x00cd }
            return
        L_0x00cd:
            r1 = move-exception
            java.lang.Object r0 = r0.A02
            X.DMr r0 = (X.DMr) r0
            r0.A03(r1)
            return
        L_0x00d6:
            java.lang.Object r10 = r0.A02     // Catch:{ all -> 0x0349 }
            X.CkB r10 = (X.C25680CkB) r10     // Catch:{ all -> 0x0349 }
            java.lang.Object r7 = r0.A01     // Catch:{ all -> 0x0349 }
            X.E8e r7 = (X.C28573E8e) r7     // Catch:{ all -> 0x0349 }
            java.lang.Object r12 = r0.A00     // Catch:{ all -> 0x0349 }
            X.DRJ r12 = (X.DRJ) r12     // Catch:{ all -> 0x0349 }
            java.lang.Class<X.CkB> r14 = X.C25680CkB.class
            java.lang.String r2 = "About to write to disk-cache for key %s"
            java.lang.String r23 = r7.Bb4()     // Catch:{ all -> 0x0349 }
            r1 = r23
            X.C26265CwA.A02(r14, r1, r2)     // Catch:{ all -> 0x0349 }
            X.CpV r8 = r10.A00     // Catch:{ IOException -> 0x0331 }
            X.Cpt r22 = X.C25980Cpt.A00()     // Catch:{ IOException -> 0x0331 }
            r1 = r22
            r1.A00 = r7     // Catch:{ IOException -> 0x0331 }
            java.lang.Object r6 = r8.A08     // Catch:{ IOException -> 0x0331 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0331 }
            java.lang.String r13 = X.C8C.A00(r7)     // Catch:{ UnsupportedEncodingException -> 0x0323 }
            monitor-exit(r6)     // Catch:{ all -> 0x0329 }
            monitor-enter(r6)     // Catch:{ IOException -> 0x0309 }
            boolean r21 = X.C25963CpV.A00(r8)     // Catch:{ all -> 0x0306 }
            X.E9f r9 = r8.A04     // Catch:{ all -> 0x0306 }
            boolean r1 = r9.isExternal()     // Catch:{ all -> 0x0306 }
            if (r1 == 0) goto L_0x012e
            java.lang.Integer r15 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0306 }
        L_0x0110:
            X.CuK r11 = r8.A06     // Catch:{ all -> 0x0306 }
            r19 = 41943040(0x2800000, double:2.0722615E-316)
            r1 = 41943040(0x2800000, double:2.0722615E-316)
            X.CYa r5 = r8.A05     // Catch:{ all -> 0x0306 }
            long r3 = r5.A00()     // Catch:{ all -> 0x0306 }
            long r19 = r19 - r3
            X.C26192CuK.A02(r11)     // Catch:{ all -> 0x0306 }
            long r17 = r11.A03(r15)     // Catch:{ all -> 0x0306 }
            r15 = 0
            int r3 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x0135
            goto L_0x0131
        L_0x012e:
            java.lang.Integer r15 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0306 }
            goto L_0x0110
        L_0x0131:
            int r3 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r3 >= 0) goto L_0x0138
        L_0x0135:
            r1 = 10485760(0xa00000, double:5.180654E-317)
        L_0x0138:
            r8.A01 = r1     // Catch:{ all -> 0x0306 }
            long r15 = r5.A00()     // Catch:{ all -> 0x0306 }
            long r1 = r8.A01     // Catch:{ all -> 0x0306 }
            int r3 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0159
            if (r21 != 0) goto L_0x0159
            monitor-enter(r5)     // Catch:{ all -> 0x0306 }
            r1 = 0
            r5.A02 = r1     // Catch:{ all -> 0x0151 }
            r1 = -1
            r5.A00 = r1     // Catch:{ all -> 0x0151 }
            r5.A01 = r1     // Catch:{ all -> 0x0151 }
            goto L_0x0155
        L_0x0151:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0306 }
            goto L_0x01ea
        L_0x0155:
            monitor-exit(r5)     // Catch:{ all -> 0x0306 }
            X.C25963CpV.A00(r8)     // Catch:{ all -> 0x0306 }
        L_0x0159:
            long r1 = r8.A01     // Catch:{ all -> 0x0306 }
            int r3 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x01f4
            r3 = 9
            long r1 = r1 * r3
            r3 = 10
            long r1 = r1 / r3
            java.util.Collection r11 = r9.BRL()     // Catch:{ IOException -> 0x01e6 }
            X.E4N r3 = r8.A07     // Catch:{ IOException -> 0x01e6 }
            long r19 = r3.now()     // Catch:{ IOException -> 0x01e6 }
            long r3 = X.C25963CpV.A0C     // Catch:{ IOException -> 0x01e6 }
            long r19 = r19 + r3
            int r3 = r11.size()     // Catch:{ IOException -> 0x01e6 }
            java.util.ArrayList r4 = X.C17880vN.A0z(r3)     // Catch:{ IOException -> 0x01e6 }
            int r3 = r11.size()     // Catch:{ IOException -> 0x01e6 }
            java.util.ArrayList r15 = X.C17880vN.A0z(r3)     // Catch:{ IOException -> 0x01e6 }
            java.util.Iterator r18 = r11.iterator()     // Catch:{ IOException -> 0x01e6 }
        L_0x0187:
            boolean r3 = r18.hasNext()     // Catch:{ IOException -> 0x01e6 }
            if (r3 == 0) goto L_0x01a3
            java.lang.Object r11 = r18.next()     // Catch:{ IOException -> 0x01e6 }
            X.CWT r11 = (X.CWT) r11     // Catch:{ IOException -> 0x01e6 }
            long r16 = r11.A00()     // Catch:{ IOException -> 0x01e6 }
            int r3 = (r16 > r19 ? 1 : (r16 == r19 ? 0 : -1))
            if (r3 <= 0) goto L_0x019f
            r4.add(r11)     // Catch:{ IOException -> 0x01e6 }
            goto L_0x0187
        L_0x019f:
            r15.add(r11)     // Catch:{ IOException -> 0x01e6 }
            goto L_0x0187
        L_0x01a3:
            X.C8D r11 = r8.A03     // Catch:{ IOException -> 0x01e6 }
            r3 = 3
            X.DUP.A00(r11, r15, r3)     // Catch:{ IOException -> 0x01e6 }
            r4.addAll(r15)     // Catch:{ IOException -> 0x01e6 }
            long r20 = r5.A00()     // Catch:{ all -> 0x0306 }
            long r20 = r20 - r1
            java.util.Iterator r19 = r4.iterator()     // Catch:{ all -> 0x0306 }
            r11 = 0
            r1 = 0
        L_0x01b9:
            boolean r3 = r19.hasNext()     // Catch:{ all -> 0x0306 }
            if (r3 == 0) goto L_0x01eb
            java.lang.Object r3 = r19.next()     // Catch:{ all -> 0x0306 }
            X.CWT r3 = (X.CWT) r3     // Catch:{ all -> 0x0306 }
            int r4 = (r1 > r20 ? 1 : (r1 == r20 ? 0 : -1))
            if (r4 > 0) goto L_0x01eb
            long r17 = r9.CEU(r3)     // Catch:{ all -> 0x0306 }
            java.util.Set r4 = r8.A09     // Catch:{ all -> 0x0306 }
            java.lang.String r3 = r3.A03     // Catch:{ all -> 0x0306 }
            r4.remove(r3)     // Catch:{ all -> 0x0306 }
            r15 = 0
            int r3 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r3 <= 0) goto L_0x01b9
            int r11 = r11 + 1
            long r1 = r1 + r17
            X.Cpt r3 = X.C25980Cpt.A00()     // Catch:{ all -> 0x0306 }
            r3.A01()     // Catch:{ all -> 0x0306 }
            goto L_0x01b9
        L_0x01e6:
            r1 = move-exception
            r1.getMessage()     // Catch:{ all -> 0x0306 }
        L_0x01ea:
            throw r1     // Catch:{ all -> 0x0306 }
        L_0x01eb:
            long r3 = -r1
            int r1 = -r11
            long r1 = (long) r1     // Catch:{ all -> 0x0306 }
            r5.A01(r3, r1)     // Catch:{ all -> 0x0306 }
            r9.CCy()     // Catch:{ all -> 0x0306 }
        L_0x01f4:
            monitor-exit(r6)     // Catch:{ all -> 0x0306 }
            X.CPI r9 = r9.BdZ(r7, r13)     // Catch:{ IOException -> 0x0309 }
            java.io.File r11 = r9.A00     // Catch:{ FileNotFoundException -> 0x02e3 }
            java.io.FileOutputStream r3 = X.C108945cZ.A19(r11)     // Catch:{ FileNotFoundException -> 0x02e3 }
            X.Bwp r4 = new X.Bwp     // Catch:{ all -> 0x02de }
            r4.<init>(r3)     // Catch:{ all -> 0x02de }
            r1 = 0
            r4.A00 = r1     // Catch:{ all -> 0x02de }
            X.C18070vi.A0b(r12)     // Catch:{ all -> 0x02de }
            java.io.InputStream r2 = r12.A08()     // Catch:{ all -> 0x02de }
            if (r2 == 0) goto L_0x02d9
            X.CV5 r1 = r10.A01     // Catch:{ all -> 0x02de }
            r1.A00(r2, r4)     // Catch:{ all -> 0x02de }
            r4.flush()     // Catch:{ all -> 0x02de }
            long r1 = r4.A00     // Catch:{ all -> 0x02de }
            r3.close()     // Catch:{ all -> 0x02ef }
            long r15 = r11.length()     // Catch:{ all -> 0x02ef }
            int r3 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x02e5
            monitor-enter(r6)     // Catch:{ all -> 0x02ef }
            X.DAO r4 = r9.A02     // Catch:{ all -> 0x02d6 }
            X.E4N r1 = r4.A00     // Catch:{ all -> 0x02d6 }
            long r1 = r1.now()     // Catch:{ all -> 0x02d6 }
            java.lang.String r3 = r9.A01     // Catch:{ all -> 0x02d6 }
            java.io.File r3 = r4.A02(r3)     // Catch:{ all -> 0x02d6 }
            X.C26208Cuj.A01(r3)     // Catch:{ Bx1 -> 0x02d1 }
            r3.delete()     // Catch:{ Bx1 -> 0x02d1 }
            boolean r4 = r11.renameTo(r3)     // Catch:{ Bx1 -> 0x02d1 }
            if (r4 == 0) goto L_0x0284
            boolean r4 = r3.exists()     // Catch:{ all -> 0x02d6 }
            if (r4 == 0) goto L_0x024a
            r3.setLastModified(r1)     // Catch:{ all -> 0x02d6 }
        L_0x024a:
            X.CXt r2 = new X.CXt     // Catch:{ all -> 0x02d6 }
            r2.<init>(r3)     // Catch:{ all -> 0x02d6 }
            java.util.Set r1 = r8.A09     // Catch:{ all -> 0x02d6 }
            r1.add(r13)     // Catch:{ all -> 0x02d6 }
            java.io.File r8 = r2.A00     // Catch:{ all -> 0x02d6 }
            long r3 = r8.length()     // Catch:{ all -> 0x02d6 }
            r1 = 1
            r5.A01(r3, r1)     // Catch:{ all -> 0x02d6 }
            monitor-exit(r6)     // Catch:{ all -> 0x02d6 }
            r8.length()     // Catch:{ all -> 0x02ef }
            monitor-enter(r5)     // Catch:{ all -> 0x02ef }
            monitor-exit(r5)     // Catch:{ all -> 0x02ef }
            boolean r1 = r11.exists()     // Catch:{ IOException -> 0x0309 }
            if (r1 == 0) goto L_0x0278
            boolean r1 = r11.delete()     // Catch:{ IOException -> 0x0309 }
            if (r1 != 0) goto L_0x0278
            java.lang.Class<X.CpV> r2 = X.C25963CpV.class
            java.lang.String r1 = "Failed to delete temp file"
            X.C26265CwA.A03(r2, r1)     // Catch:{ IOException -> 0x0309 }
        L_0x0278:
            r22.A01()     // Catch:{ IOException -> 0x0331 }
            java.lang.String r2 = "Successful disk-cache write for key %s"
            r1 = r23
            X.C26265CwA.A02(r14, r1, r2)     // Catch:{ IOException -> 0x0331 }
            goto L_0x033b
        L_0x0284:
            boolean r1 = r3.exists()     // Catch:{ Bx1 -> 0x02d1 }
            if (r1 != 0) goto L_0x02c7
            java.io.File r1 = r11.getParentFile()     // Catch:{ Bx1 -> 0x02d1 }
            boolean r1 = r1.exists()     // Catch:{ Bx1 -> 0x02d1 }
            if (r1 == 0) goto L_0x02bd
            boolean r1 = r11.exists()     // Catch:{ Bx1 -> 0x02d1 }
            if (r1 != 0) goto L_0x02bb
            java.lang.String r1 = r11.getAbsolutePath()     // Catch:{ Bx1 -> 0x02d1 }
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException     // Catch:{ Bx1 -> 0x02d1 }
            r4.<init>(r1)     // Catch:{ Bx1 -> 0x02d1 }
        L_0x02a3:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ Bx1 -> 0x02d1 }
            java.lang.String r1 = "Unknown error renaming "
            X.C17900vP.A0N(r11, r1, r2)     // Catch:{ Bx1 -> 0x02d1 }
            java.lang.String r1 = " to "
            X.C17900vP.A0N(r3, r1, r2)     // Catch:{ Bx1 -> 0x02d1 }
            java.lang.String r2 = r2.toString()     // Catch:{ Bx1 -> 0x02d1 }
            X.Bx1 r1 = new X.Bx1     // Catch:{ Bx1 -> 0x02d1 }
            r1.<init>(r2, r4)     // Catch:{ Bx1 -> 0x02d1 }
            throw r1     // Catch:{ Bx1 -> 0x02d1 }
        L_0x02bb:
            r4 = 0
            goto L_0x02a3
        L_0x02bd:
            java.lang.String r1 = r11.getAbsolutePath()     // Catch:{ Bx1 -> 0x02d1 }
            X.Bwl r4 = new X.Bwl     // Catch:{ Bx1 -> 0x02d1 }
            r4.<init>(r1)     // Catch:{ Bx1 -> 0x02d1 }
            goto L_0x02a3
        L_0x02c7:
            java.lang.String r1 = r3.getAbsolutePath()     // Catch:{ Bx1 -> 0x02d1 }
            X.Bx0 r4 = new X.Bx0     // Catch:{ Bx1 -> 0x02d1 }
            r4.<init>(r1)     // Catch:{ Bx1 -> 0x02d1 }
            goto L_0x02a3
        L_0x02d1:
            r1 = move-exception
            r1.getCause()     // Catch:{ all -> 0x02d6 }
            throw r1     // Catch:{ all -> 0x02d6 }
        L_0x02d6:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x02d6 }
            throw r1     // Catch:{ all -> 0x02ef }
        L_0x02d9:
            java.lang.IllegalStateException r1 = X.C17880vN.A0g()     // Catch:{ all -> 0x02de }
            throw r1     // Catch:{ all -> 0x02de }
        L_0x02de:
            r5 = move-exception
            r3.close()     // Catch:{ all -> 0x02ef }
            goto L_0x02ee
        L_0x02e3:
            r5 = move-exception
            goto L_0x02ee
        L_0x02e5:
            long r3 = r11.length()     // Catch:{ all -> 0x02ef }
            X.Bwz r5 = new X.Bwz     // Catch:{ all -> 0x02ef }
            r5.<init>(r1, r3)     // Catch:{ all -> 0x02ef }
        L_0x02ee:
            throw r5     // Catch:{ all -> 0x02ef }
        L_0x02ef:
            r3 = move-exception
            java.io.File r2 = r9.A00     // Catch:{ IOException -> 0x0309 }
            boolean r1 = r2.exists()     // Catch:{ IOException -> 0x0309 }
            if (r1 == 0) goto L_0x0305
            boolean r1 = r2.delete()     // Catch:{ IOException -> 0x0309 }
            if (r1 != 0) goto L_0x0305
            java.lang.Class<X.CpV> r2 = X.C25963CpV.class
            java.lang.String r1 = "Failed to delete temp file"
            X.C26265CwA.A03(r2, r1)     // Catch:{ IOException -> 0x0309 }
        L_0x0305:
            throw r3     // Catch:{ IOException -> 0x0309 }
        L_0x0306:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0306 }
            throw r1     // Catch:{ IOException -> 0x0309 }
        L_0x0309:
            r5 = move-exception
            r1 = r22
            r1.A01 = r5     // Catch:{ all -> 0x032c }
            java.lang.Class<X.CpV> r4 = X.C25963CpV.class
            java.lang.String r3 = "Failed inserting a file into the cache"
            X.EAY r2 = X.C26265CwA.A00     // Catch:{ all -> 0x032c }
            r1 = 6
            boolean r1 = r2.BfN(r1)     // Catch:{ all -> 0x032c }
            if (r1 == 0) goto L_0x0322
            java.lang.String r1 = r4.getSimpleName()     // Catch:{ all -> 0x032c }
            r2.BJo(r1, r3, r5)     // Catch:{ all -> 0x032c }
        L_0x0322:
            throw r5     // Catch:{ all -> 0x032c }
        L_0x0323:
            r1 = move-exception
            java.lang.RuntimeException r1 = X.AnonymousClass8BR.A0x(r1)     // Catch:{ all -> 0x0329 }
            throw r1     // Catch:{ all -> 0x0329 }
        L_0x0329:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0329 }
            goto L_0x0330
        L_0x032c:
            r1 = move-exception
            r22.A01()     // Catch:{ IOException -> 0x0331 }
        L_0x0330:
            throw r1     // Catch:{ IOException -> 0x0331 }
        L_0x0331:
            r3 = move-exception
            java.lang.Object[] r2 = X.AnonymousClass8BV.A1b(r23)     // Catch:{ all -> 0x0349 }
            java.lang.String r1 = "Failed to write to disk-cache for key %s"
            X.C26265CwA.A07(r1, r3, r2)     // Catch:{ all -> 0x0349 }
        L_0x033b:
            X.ClX r0 = r10.A02
            X.C18070vi.A0b(r12)
            r0.A03(r7, r12)
            if (r12 == 0) goto L_0x2217
            r12.close()
            return
        L_0x0349:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x034b }
        L_0x034b:
            r3 = move-exception
            java.lang.Object r1 = r0.A02
            X.CkB r1 = (X.C25680CkB) r1
            X.ClX r2 = r1.A02
            java.lang.Object r1 = r0.A01
            X.E8e r1 = (X.C28573E8e) r1
            java.lang.Object r0 = r0.A00
            X.DRJ r0 = (X.DRJ) r0
            X.C18070vi.A0b(r0)
            r2.A03(r1, r0)
            if (r0 == 0) goto L_0x0365
            r0.close()
        L_0x0365:
            throw r3
        L_0x0366:
            java.lang.Object r3 = r0.A02     // Catch:{ all -> 0x2217 }
            X.26e r3 = (X.C451126e) r3     // Catch:{ all -> 0x2217 }
            boolean r1 = r3.A00     // Catch:{ all -> 0x2217 }
            if (r1 != 0) goto L_0x2217
            android.content.res.Resources r2 = r3.A01     // Catch:{ all -> 0x2217 }
            java.lang.Object r1 = r0.A00     // Catch:{ all -> 0x2217 }
            android.content.res.Configuration r1 = (android.content.res.Configuration) r1     // Catch:{ all -> 0x2217 }
            java.lang.Object r0 = r0.A01     // Catch:{ all -> 0x2217 }
            android.util.DisplayMetrics r0 = (android.util.DisplayMetrics) r0     // Catch:{ all -> 0x2217 }
            r2.updateConfiguration(r1, r0)     // Catch:{ all -> 0x2217 }
            r0 = 1
            r3.A00 = r0     // Catch:{ all -> 0x2217 }
            return
        L_0x037f:
            java.lang.Object r4 = r0.A01     // Catch:{ Exception -> 0x0f11 }
            X.Cj7 r4 = (X.C25627Cj7) r4     // Catch:{ Exception -> 0x0f11 }
            java.lang.String r1 = "FbVideoResizeOperation.run()"
            android.os.Trace.beginSection(r1)     // Catch:{ Exception -> 0x0f11 }
            X.CmX r6 = new X.CmX     // Catch:{ Exception -> 0x0f11 }
            r6.<init>()     // Catch:{ Exception -> 0x0f11 }
            X.CVG r5 = new X.CVG     // Catch:{ Exception -> 0x0f11 }
            r5.<init>()     // Catch:{ Exception -> 0x0f11 }
            r6.A0E = r5     // Catch:{ Exception -> 0x0f11 }
            X.CUT r3 = r4.A0O     // Catch:{ Exception -> 0x0f11 }
            X.ClM r1 = r3.A04     // Catch:{ Exception -> 0x0f11 }
            r24 = r1
            if (r1 == 0) goto L_0x03be
            java.util.List r1 = r1.A0H     // Catch:{ Exception -> 0x0f11 }
            if (r1 == 0) goto L_0x03be
            boolean r1 = r1.isEmpty()     // Catch:{ Exception -> 0x0f11 }
            if (r1 != 0) goto L_0x03be
            r1 = r24
            java.util.List r1 = r1.A0H     // Catch:{ Exception -> 0x0f11 }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ Exception -> 0x0f11 }
        L_0x03ae:
            boolean r1 = r2.hasNext()     // Catch:{ Exception -> 0x0f11 }
            if (r1 == 0) goto L_0x03be
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0f11 }
            X.E9y r1 = (X.C28607E9y) r1     // Catch:{ Exception -> 0x0f11 }
            r1.CHu(r5)     // Catch:{ Exception -> 0x0f11 }
            goto L_0x03ae
        L_0x03be:
            r4.A03 = r6     // Catch:{ Exception -> 0x0f11 }
            X.Cjg r18 = new X.Cjg     // Catch:{ Exception -> 0x0f11 }
            r18.<init>()     // Catch:{ Exception -> 0x0f11 }
            r8 = 0
            boolean r1 = r4.A0D     // Catch:{ all -> 0x0e4a }
            r47 = r1
            X.C25627Cj7.A00(r4, r1)     // Catch:{ all -> 0x0e4a }
            java.lang.Thread r2 = X.BE8.A0k()     // Catch:{ all -> 0x0e4a }
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0e4a }
            boolean r1 = X.AnonymousClass3Ma.A1Z(r2, r1)
            X.C26171Ctn.A03(r1, r8)     // Catch:{ all -> 0x0e4a }
            java.lang.System.gc()     // Catch:{ all -> 0x0e4a }
            X.CmX r2 = r4.A03     // Catch:{ all -> 0x0e4a }
            X.CrM r5 = r3.A06     // Catch:{ all -> 0x0e4a }
            boolean r1 = X.AnonymousClass000.A1W(r5)
            r2.A0U = r1     // Catch:{ all -> 0x0e4a }
            boolean r1 = r3.A0E     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0401
            if (r5 == 0) goto L_0x0410
            X.BzJ r2 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0e4a }
            java.util.HashMap r1 = r5.A06(r2)     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0401
            java.util.HashMap r1 = r5.A06(r2)     // Catch:{ all -> 0x0e4a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0410
        L_0x0401:
            long r1 = r3.A01     // Catch:{ all -> 0x0e4a }
            r16 = r1
            X.EAd r1 = r4.A04     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x074e
            r1 = r47
            X.C25627Cj7.A00(r4, r1)     // Catch:{ all -> 0x0e4a }
            goto L_0x071e
        L_0x0410:
            r11 = 0
            if (r5 == 0) goto L_0x0551
            X.BzJ r9 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0e4a }
            boolean r1 = X.C26162Ctb.A04(r9, r5)     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0556
            java.util.HashMap r1 = r5.A02     // Catch:{ all -> 0x0e4a }
            java.lang.Object r1 = r1.get(r9)     // Catch:{ all -> 0x0e4a }
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0451
            java.util.Iterator r6 = X.C17890vO.A0i(r1)     // Catch:{ all -> 0x0e4a }
        L_0x0429:
            boolean r1 = r6.hasNext()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0451
            java.lang.Object r1 = X.C17890vO.A0P(r6)     // Catch:{ all -> 0x0e4a }
            X.Cmm r1 = (X.C25833Cmm) r1     // Catch:{ all -> 0x0e4a }
            java.util.List r1 = r1.A07     // Catch:{ all -> 0x0e4a }
            java.util.Iterator r2 = X.AnonymousClass8BV.A0y(r1)     // Catch:{ all -> 0x0e4a }
        L_0x043b:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0429
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0e4a }
            X.Cll r1 = (X.C25774Cll) r1     // Catch:{ all -> 0x0e4a }
            float r1 = r1.A00     // Catch:{ all -> 0x0e4a }
            boolean r1 = X.C24550C8v.A00(r1)     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x043b
            goto L_0x0556
        L_0x0451:
            X.E7q r12 = r4.A0H     // Catch:{ all -> 0x0e4a }
            X.CAM r1 = r4.A0L     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0556
            java.util.HashMap r1 = r5.A06(r9)     // Catch:{ IOException -> 0x0556 }
            X.C28111Yx.A02(r1)     // Catch:{ IOException -> 0x0556 }
            java.util.Collection r1 = r1.values()     // Catch:{ IOException -> 0x0556 }
            java.util.ArrayList r2 = X.C17880vN.A10(r1)     // Catch:{ IOException -> 0x0556 }
            r1 = 11
            X.DUR.A00(r1, r2)     // Catch:{ IOException -> 0x0556 }
            java.util.Iterator r16 = r2.iterator()     // Catch:{ IOException -> 0x0556 }
            r14 = -1
            r6 = -1
        L_0x0473:
            boolean r1 = r16.hasNext()     // Catch:{ IOException -> 0x0556 }
            if (r1 == 0) goto L_0x0493
            java.lang.Object r13 = r16.next()     // Catch:{ IOException -> 0x0556 }
            X.Cmm r13 = (X.C25833Cmm) r13     // Catch:{ IOException -> 0x0556 }
            int r1 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x048b
            long r1 = r13.A00     // Catch:{ IOException -> 0x0556 }
            int r10 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r10 == 0) goto L_0x048b
            goto L_0x0556
        L_0x048b:
            long r6 = r13.A00     // Catch:{ IOException -> 0x0556 }
            long r1 = X.C26162Ctb.A01(r12, r13, r11)     // Catch:{ IOException -> 0x0556 }
            long r6 = r6 + r1
            goto L_0x0473
        L_0x0493:
            java.util.HashMap r14 = r5.A06(r9)     // Catch:{ all -> 0x0e4a }
            if (r14 == 0) goto L_0x0556
            java.util.HashMap r1 = r5.A06(r9)     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x04d4
            java.util.Iterator r13 = X.C17890vO.A0j(r1)     // Catch:{ all -> 0x0e4a }
        L_0x04a3:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x04d4
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0e4a }
            X.Cmm r1 = (X.C25833Cmm) r1     // Catch:{ all -> 0x0e4a }
            java.util.List r1 = r1.A04     // Catch:{ all -> 0x0e4a }
            java.util.Iterator r12 = X.AnonymousClass8BV.A0y(r1)     // Catch:{ all -> 0x0e4a }
        L_0x04b5:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x04a3
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0e4a }
            X.CcJ r1 = (X.C25271CcJ) r1     // Catch:{ all -> 0x0e4a }
            X.C18070vi.A0b(r1)     // Catch:{ all -> 0x0e4a }
            X.A5W r2 = r1.A03     // Catch:{ all -> 0x0e4a }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0e4a }
            long r9 = r2.A03(r1)     // Catch:{ all -> 0x0e4a }
            r6 = 0
            int r1 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x04b5
            goto L_0x0556
        L_0x04d4:
            java.util.Iterator r12 = X.C17890vO.A0j(r14)     // Catch:{ all -> 0x0e4a }
            r6 = 0
            r10 = 1
        L_0x04da:
            boolean r1 = r12.hasNext()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x052d
            java.lang.Object r1 = r12.next()     // Catch:{ all -> 0x0e4a }
            X.Cmm r1 = (X.C25833Cmm) r1     // Catch:{ all -> 0x0e4a }
            java.util.List r1 = r1.A04     // Catch:{ all -> 0x0e4a }
            java.util.Iterator r9 = X.AnonymousClass8BV.A0y(r1)     // Catch:{ all -> 0x0e4a }
        L_0x04ec:
            boolean r1 = r9.hasNext()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x04da
            java.lang.Object r1 = r9.next()     // Catch:{ all -> 0x0e4a }
            X.CcJ r1 = (X.C25271CcJ) r1     // Catch:{ all -> 0x0e4a }
            java.io.File r1 = r1.A05     // Catch:{ IOException -> 0x0556 }
            if (r1 == 0) goto L_0x04ec
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0556 }
            if (r10 == 0) goto L_0x050b
            X.C18070vi.A0b(r1)     // Catch:{ IOException -> 0x0556 }
            X.Chv r6 = X.C25557Chv.A00(r1)     // Catch:{ IOException -> 0x0556 }
            r10 = 0
            goto L_0x04ec
        L_0x050b:
            X.C18070vi.A0b(r1)     // Catch:{ IOException -> 0x0556 }
            X.Chv r7 = X.C25557Chv.A00(r1)     // Catch:{ IOException -> 0x0556 }
            if (r6 == 0) goto L_0x0556
            if (r7 == 0) goto L_0x0556
            int r2 = r6.A00     // Catch:{ IOException -> 0x0556 }
            int r1 = r7.A00     // Catch:{ IOException -> 0x0556 }
            if (r2 != r1) goto L_0x0556
            int r2 = r6.A01     // Catch:{ IOException -> 0x0556 }
            int r1 = r7.A01     // Catch:{ IOException -> 0x0556 }
            if (r2 != r1) goto L_0x0556
            java.lang.String r2 = r6.A02     // Catch:{ IOException -> 0x0556 }
            java.lang.String r1 = r7.A02     // Catch:{ IOException -> 0x0556 }
            boolean r1 = android.text.TextUtils.equals(r2, r1)     // Catch:{ IOException -> 0x0556 }
            if (r1 == 0) goto L_0x0556
            goto L_0x04ec
        L_0x052d:
            X.CZT r1 = r3.A08     // Catch:{ all -> 0x0e4a }
            boolean r1 = r1 instanceof X.BWB     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0551
            java.io.File r1 = r3.A0A     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = r1.getPath()     // Catch:{ all -> 0x0e4a }
            X.Chv r1 = X.C25557Chv.A00(r1)     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0556
            java.lang.String r2 = r1.A02     // Catch:{ all -> 0x0e4a }
            if (r2 == 0) goto L_0x0556
            X.Bzp r1 = X.C24354Bzp.CODEC_AUDIO_AAC     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = r1.value     // Catch:{ all -> 0x0e4a }
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0551
            goto L_0x0556
        L_0x0551:
            boolean r1 = r3.A0M     // Catch:{ all -> 0x0e4a }
            r10 = 0
            if (r1 == 0) goto L_0x06e6
        L_0x0556:
            r10 = 1
            X.E54 r2 = r4.A0J     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = "audio_stream-"
            java.io.File r1 = r2.BHu(r1)     // Catch:{ all -> 0x0e4a }
            r4.A0A = r1     // Catch:{ all -> 0x0e4a }
            X.CpL r9 = new X.CpL     // Catch:{ all -> 0x0e4a }
            r9.<init>()     // Catch:{ all -> 0x0e4a }
            X.CAG r1 = X.CAG.$redex_init_class     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r5)     // Catch:{ all -> 0x0e4a }
            X.BzJ r2 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0e4a }
            java.util.HashMap r1 = r5.A06(r2)     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0575
            r7 = 0
            goto L_0x0580
        L_0x0575:
            java.util.HashMap r1 = r5.A06(r2)     // Catch:{ all -> 0x0e4a }
            int r7 = r1.size()     // Catch:{ all -> 0x0e4a }
            if (r7 <= 0) goto L_0x0580
            r11 = 1
        L_0x0580:
            java.lang.String r1 = "Must have 1 or more audio tracks to transcode audio."
            X.C26171Ctn.A03(r11, r1)     // Catch:{ all -> 0x0e4a }
            boolean[] r1 = new boolean[r7]     // Catch:{ all -> 0x0e4a }
            r9.A03 = r1     // Catch:{ all -> 0x0e4a }
            java.util.List[] r6 = new java.util.List[r7]     // Catch:{ all -> 0x0e4a }
            r9.A02 = r6     // Catch:{ all -> 0x0e4a }
            r2 = 0
        L_0x058e:
            if (r2 >= r7) goto L_0x0599
            java.util.ArrayList r1 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0e4a }
            r6[r2] = r1     // Catch:{ all -> 0x0e4a }
            int r2 = r2 + 1
            goto L_0x058e
        L_0x0599:
            r1 = 4096(0x1000, float:5.74E-42)
            r9.A00 = r1     // Catch:{ all -> 0x0e4a }
            java.lang.Integer r34 = X.AnonymousClass00R.A01     // Catch:{ all -> 0x0e4a }
            r7 = 0
            X.DTn r6 = new X.DTn     // Catch:{ all -> 0x0e4a }
            r6.<init>()     // Catch:{ all -> 0x0e4a }
            java.lang.String r2 = "VIDEO_TRANSCODER"
            r1 = 2
            java.util.concurrent.ThreadPoolExecutor r33 = X.C25325CdW.A00(r2, r6, r1, r7)     // Catch:{ all -> 0x0e4a }
            X.CmX r13 = r4.A03     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r13)     // Catch:{ all -> 0x0e4a }
            X.E7q r1 = r4.A0H     // Catch:{ all -> 0x0e4a }
            r17 = r1
            X.E7r r11 = r4.A0M     // Catch:{ all -> 0x0e4a }
            r6 = 0
            X.CNh r2 = new X.CNh     // Catch:{ all -> 0x0e4a }
            r2.<init>(r8, r7)     // Catch:{ all -> 0x0e4a }
            java.io.File r1 = r4.A0A     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0e4a }
            java.lang.String r32 = r1.getPath()     // Catch:{ all -> 0x0e4a }
            android.content.Context r1 = r4.A0E     // Catch:{ all -> 0x0e4a }
            X.DGr r7 = new X.DGr     // Catch:{ all -> 0x0e4a }
            r7.<init>()     // Catch:{ all -> 0x0e4a }
            X.DHd r12 = new X.DHd     // Catch:{ all -> 0x0e4a }
            r26 = r1
            r27 = r17
            r28 = r13
            r29 = r11
            r30 = r2
            r31 = r3
            r25 = r12
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0e4a }
            r7.A02 = r12     // Catch:{ all -> 0x0e4a }
            X.CL2 r1 = new X.CL2     // Catch:{ all -> 0x0e4a }
            r1.<init>()     // Catch:{ all -> 0x0e4a }
            r12.A0B = r1     // Catch:{ all -> 0x0e4a }
            X.CUT r1 = r12.A05     // Catch:{ all -> 0x0e4a }
            X.C5G r1 = r1.A09     // Catch:{ all -> 0x0e4a }
            X.CVF r2 = r1.A01     // Catch:{ all -> 0x0e4a }
            if (r2 != 0) goto L_0x0646
            r2 = 4
            java.lang.Integer[] r14 = X.AnonymousClass00R.A00(r2)     // Catch:{ all -> 0x0e4a }
            int r13 = r14.length     // Catch:{ all -> 0x0e4a }
        L_0x05f7:
            if (r6 >= r13) goto L_0x068a
            r11 = r14[r6]     // Catch:{ all -> 0x0e4a }
            java.lang.Integer r2 = X.AnonymousClass00R.A00     // Catch:{ all -> 0x0e4a }
            if (r11 != r2) goto L_0x0602
            int r6 = r6 + 1
            goto L_0x05f7
        L_0x0602:
            int r2 = r11.intValue()     // Catch:{ all -> 0x0e4a }
            switch(r2) {
                case 1: goto L_0x061a;
                case 2: goto L_0x0617;
                case 3: goto L_0x0614;
                default: goto L_0x0609;
            }     // Catch:{ all -> 0x0e4a }
        L_0x0609:
            java.lang.String r6 = "HE"
        L_0x060b:
            java.lang.String r2 = "lc"
            boolean r2 = r2.equalsIgnoreCase(r6)     // Catch:{ all -> 0x0e4a }
            if (r2 == 0) goto L_0x061f
            goto L_0x061d
        L_0x0614:
            java.lang.String r6 = "SSR"
            goto L_0x060b
        L_0x0617:
            java.lang.String r6 = "Main"
            goto L_0x060b
        L_0x061a:
            java.lang.String r6 = "LC"
            goto L_0x060b
        L_0x061d:
            r6 = 2
            goto L_0x063f
        L_0x061f:
            java.lang.String r2 = "main"
            boolean r2 = r2.equalsIgnoreCase(r6)     // Catch:{ all -> 0x0e4a }
            if (r2 == 0) goto L_0x0629
            r6 = 1
            goto L_0x063f
        L_0x0629:
            java.lang.String r2 = "ssr"
            boolean r2 = r2.equalsIgnoreCase(r6)     // Catch:{ all -> 0x0e4a }
            if (r2 == 0) goto L_0x0633
            r6 = 3
            goto L_0x063f
        L_0x0633:
            java.lang.String r2 = "he"
            boolean r2 = r2.equalsIgnoreCase(r6)     // Catch:{ all -> 0x0e4a }
            if (r2 == 0) goto L_0x063d
            r6 = 5
            goto L_0x063f
        L_0x063d:
            r2 = 0
            goto L_0x0644
        L_0x063f:
            X.CVF r2 = new X.CVF     // Catch:{ all -> 0x0e4a }
            r2.<init>(r6)     // Catch:{ all -> 0x0e4a }
        L_0x0644:
            r1.A01 = r2     // Catch:{ all -> 0x0e4a }
        L_0x0646:
            X.CL2 r2 = r12.A0B     // Catch:{ all -> 0x0e4a }
            r16 = r2
            X.Bzp r14 = X.C24354Bzp.CODEC_ANDROID_AUDIO_AAC     // Catch:{ all -> 0x0e4a }
            r13 = 44100(0xac44, float:6.1797E-41)
            r11 = 2
            r2 = 2
            int r15 = r1.A00     // Catch:{ all -> 0x0e4a }
            X.CVF r1 = r1.A01     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0659
            int r2 = r1.A00     // Catch:{ all -> 0x0e4a }
        L_0x0659:
            java.lang.String r1 = r14.value     // Catch:{ all -> 0x0e4a }
            android.media.MediaFormat r6 = android.media.MediaFormat.createAudioFormat(r1, r13, r11)     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = "aac-profile"
            r6.setInteger(r1, r2)     // Catch:{ all -> 0x0e4a }
            java.lang.String r2 = "max-input-size"
            r1 = 64000(0xfa00, float:8.9683E-41)
            r6.setInteger(r2, r1)     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = "bitrate"
            r6.setInteger(r1, r15)     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = "sample-rate"
            r6.setInteger(r1, r13)     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = "channel-count"
            r6.setInteger(r1, r11)     // Catch:{ all -> 0x0e4a }
            java.lang.String r2 = r14.value     // Catch:{ all -> 0x0e4a }
            X.By9 r1 = X.C24251By9.BUFFERS     // Catch:{ all -> 0x0e4a }
            X.Cc6 r2 = X.C26259Cw4.A02(r6, r1, r8, r2, r8)     // Catch:{ all -> 0x0e4a }
            r1 = r16
            r1.A00 = r2     // Catch:{ all -> 0x0e4a }
            r2.A02()     // Catch:{ all -> 0x0e4a }
        L_0x068a:
            X.CmX r6 = r12.A03     // Catch:{ all -> 0x0e4a }
            X.CL2 r1 = r12.A0B     // Catch:{ all -> 0x0e4a }
            X.Cc6 r1 = r1.A00     // Catch:{ all -> 0x0e4a }
            android.media.MediaCodec r2 = r1.A04     // Catch:{ all -> 0x0e4a }
            r1 = 0
            java.lang.String r1 = r2.getName()     // Catch:{ IllegalStateException -> 0x0697 }
        L_0x0697:
            r6.A0H = r1     // Catch:{ all -> 0x0e4a }
            X.DHd r2 = r7.A02     // Catch:{ all -> 0x0e4a }
            r1 = 5
            r2.CNe(r8, r1)     // Catch:{ all -> 0x0e4a }
            r1 = 4
            r7.A00 = r1     // Catch:{ all -> 0x0e4a }
            r1 = 0
            r7.A01 = r1     // Catch:{ all -> 0x0e4a }
            X.CmX r6 = r4.A03     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r6)     // Catch:{ all -> 0x0e4a }
            X.CXE r11 = r4.A0Q     // Catch:{ all -> 0x0e4a }
            X.CqW r2 = r4.A06     // Catch:{ all -> 0x0e4a }
            X.CSu r1 = new X.CSu     // Catch:{ all -> 0x0e4a }
            r1.<init>(r9, r7, r2, r3)     // Catch:{ all -> 0x0e4a }
            X.CvW r9 = new X.CvW     // Catch:{ all -> 0x0e4a }
            r31 = r8
            r27 = r9
            r28 = r8
            r29 = r1
            r30 = r17
            r32 = r3
            r33 = r11
            r27.<init>(r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0e4a }
            long r7 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0e4a }
            android.os.Handler r2 = r9.A0D     // Catch:{ all -> 0x0e4a }
            r1 = 3
            X.AnonymousClass8BT.A17(r2, r1)     // Catch:{ all -> 0x0e4a }
            X.AnonymousClass8BT.A17(r2, r10)     // Catch:{ all -> 0x0e4a }
            X.CSu r1 = r9.A0F     // Catch:{ all -> 0x0e2c }
            X.E9k r1 = r1.A02     // Catch:{ all -> 0x0e2c }
            r1.CRz()     // Catch:{ all -> 0x0e2c }
            r1 = 5
            X.AnonymousClass8BT.A17(r2, r1)     // Catch:{ all -> 0x0e2c }
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0e2c }
            long r1 = r1 - r7
            r6.A01 = r1     // Catch:{ all -> 0x0e2c }
        L_0x06e6:
            X.E55 r7 = r4.A0K     // Catch:{ all -> 0x0e4a }
            X.E7q r6 = r4.A0H     // Catch:{ all -> 0x0e4a }
            X.CAM r2 = r4.A0L     // Catch:{ all -> 0x0e4a }
            X.CZT r1 = r3.A08     // Catch:{ all -> 0x0e4a }
            X.EAd r6 = r7.BGD(r6, r2, r1)     // Catch:{ all -> 0x0e4a }
            r4.A04 = r6     // Catch:{ all -> 0x0e4a }
            if (r10 == 0) goto L_0x0701
            java.io.File r2 = r4.A0A     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = "audioOutputFile can only be null if useTranscodedAudioFile is false"
            X.C26159CtX.A02(r2, r1)     // Catch:{ all -> 0x0e4a }
            r6.CIf(r2)     // Catch:{ all -> 0x0e4a }
            goto L_0x0704
        L_0x0701:
            X.C25327CdY.A01(r6, r3)     // Catch:{ all -> 0x0e4a }
        L_0x0704:
            X.EAd r6 = r4.A04     // Catch:{ all -> 0x0e4a }
            X.BzJ r2 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0e4a }
            r1 = -1
            r6.CHF(r2, r1)     // Catch:{ all -> 0x0e4a }
            X.EAd r1 = r4.A04     // Catch:{ all -> 0x0e4a }
            boolean r1 = r1.BfV(r2)     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0401
            X.EAd r1 = r4.A04     // Catch:{ all -> 0x0e4a }
            android.media.MediaFormat r1 = r1.BYV()     // Catch:{ all -> 0x0e4a }
            r4.A02 = r1     // Catch:{ all -> 0x0e4a }
            goto L_0x0401
        L_0x071e:
            r6 = 0
            int r1 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x072b
            X.EAd r6 = r4.A04     // Catch:{ all -> 0x0e4a }
            r1 = r16
            r6.CHA(r1)     // Catch:{ all -> 0x0e4a }
        L_0x072b:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0e4a }
            X.BzJ r6 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0e4a }
            X.E7q r2 = r4.A0H     // Catch:{ all -> 0x0e4a }
            android.content.Context r1 = r4.A0E     // Catch:{ all -> 0x0e4a }
            long r1 = X.C25327CdY.A00(r1, r2, r6, r3)     // Catch:{ all -> 0x0e4a }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0e4a }
            long r1 = r7.convert(r1, r6)     // Catch:{ all -> 0x0e4a }
            r7 = 1215954944(0x487a0000, float:256000.0)
            r6 = 1090519040(0x41000000, float:8.0)
            float r7 = r7 / r6
            float r6 = (float) r1     // Catch:{ all -> 0x0e4a }
            float r7 = r7 * r6
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r1
            int r1 = java.lang.Math.round(r7)     // Catch:{ all -> 0x0e4a }
            long r1 = (long) r1     // Catch:{ all -> 0x0e4a }
            r4.A00 = r1     // Catch:{ all -> 0x0e4a }
        L_0x074e:
            boolean r1 = r3.A0F     // Catch:{ all -> 0x0e25 }
            r23 = r1
            if (r1 != 0) goto L_0x07f0
            X.E56 r1 = r4.A0P     // Catch:{ all -> 0x0e25 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0e25 }
            boolean r6 = X.C25872Cng.A02(r3)     // Catch:{ all -> 0x0e25 }
            X.E7t r1 = r1.BGt(r5, r6)     // Catch:{ all -> 0x0e25 }
            r4.A08 = r1     // Catch:{ all -> 0x0e25 }
            X.CmX r1 = r4.A03     // Catch:{ all -> 0x0e25 }
            r1.A0X = r6     // Catch:{ all -> 0x0e25 }
            if (r6 == 0) goto L_0x076a
            goto L_0x0771
        L_0x076a:
            boolean r2 = X.AnonymousClass000.A1W(r24)
            java.lang.String r1 = "Incompatible Parameters for Transcoding"
            goto L_0x0774
        L_0x0771:
            r2 = 0
            java.lang.String r1 = "Incompatible MediaExtractor for passthrough"
        L_0x0774:
            X.C26171Ctn.A03(r2, r1)     // Catch:{ all -> 0x0e25 }
            if (r5 == 0) goto L_0x0795
            if (r24 == 0) goto L_0x0795
            X.BzJ r1 = X.C24322BzJ.VIDEO     // Catch:{ all -> 0x0e25 }
            r2 = 0
            java.util.List r1 = r5.A07(r1, r2)     // Catch:{ all -> 0x0e25 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0e25 }
            java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0e25 }
            X.CcJ r2 = (X.C25271CcJ) r2     // Catch:{ all -> 0x0e25 }
            boolean r1 = X.C25627Cj7.A0T     // Catch:{ all -> 0x0e25 }
            boolean r2 = r2.A02(r1)     // Catch:{ all -> 0x0e25 }
            r1 = r24
            r1.A0J = r2     // Catch:{ all -> 0x0e25 }
        L_0x0795:
            if (r6 != 0) goto L_0x07f0
            X.C26159CtX.A01(r24)     // Catch:{ all -> 0x0e25 }
            int r1 = r24.A00()     // Catch:{ all -> 0x0e25 }
            long r6 = (long) r1     // Catch:{ all -> 0x0e25 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0e25 }
            X.BzJ r8 = X.C24322BzJ.VIDEO     // Catch:{ all -> 0x0e25 }
            X.E7q r2 = r4.A0H     // Catch:{ all -> 0x0e25 }
            android.content.Context r1 = r4.A0E     // Catch:{ all -> 0x0e25 }
            long r1 = X.C25327CdY.A00(r1, r2, r8, r3)     // Catch:{ all -> 0x0e25 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0e25 }
            long r1 = r9.convert(r1, r8)     // Catch:{ all -> 0x0e25 }
            float r8 = (float) r6     // Catch:{ all -> 0x0e25 }
            r6 = 1090519040(0x41000000, float:8.0)
            float r8 = r8 / r6
            float r6 = (float) r1     // Catch:{ all -> 0x0e25 }
            float r8 = r8 * r6
            r1 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 / r1
            int r1 = java.lang.Math.round(r8)     // Catch:{ all -> 0x0e25 }
            long r1 = (long) r1     // Catch:{ all -> 0x0e25 }
            r4.A01 = r1     // Catch:{ all -> 0x0e25 }
            X.CmX r2 = r4.A03     // Catch:{ all -> 0x0e25 }
            int r1 = r24.A00()     // Catch:{ all -> 0x0e25 }
            r2.A00 = r1     // Catch:{ all -> 0x0e25 }
            r1 = r24
            X.Cab r1 = r1.A0E     // Catch:{ all -> 0x0e25 }
            if (r1 == 0) goto L_0x07e7
            X.CmX r6 = r4.A03     // Catch:{ all -> 0x0e25 }
            int r2 = r1.A01     // Catch:{ all -> 0x0e25 }
            r1 = 1
            if (r2 == r1) goto L_0x07e4
            r1 = 2
            if (r2 == r1) goto L_0x07e1
            r1 = 8
            if (r2 == r1) goto L_0x07de
            goto L_0x07ec
        L_0x07de:
            java.lang.String r1 = "high"
            goto L_0x07ee
        L_0x07e1:
            java.lang.String r1 = "main"
            goto L_0x07ee
        L_0x07e4:
            java.lang.String r1 = "baseline"
            goto L_0x07ee
        L_0x07e7:
            X.CmX r6 = r4.A03     // Catch:{ all -> 0x0e25 }
            java.lang.String r1 = "baseline"
            goto L_0x07ee
        L_0x07ec:
            java.lang.String r1 = ""
        L_0x07ee:
            r6.A0J = r1     // Catch:{ all -> 0x0e25 }
        L_0x07f0:
            X.E54 r1 = r4.A0J     // Catch:{ all -> 0x0e4a }
            r20 = r1
            X.E7r r1 = r4.A0M     // Catch:{ all -> 0x0e4a }
            r46 = r1
            X.CmX r1 = r4.A03     // Catch:{ all -> 0x0e4a }
            r19 = r1
            android.content.Context r15 = r4.A0E     // Catch:{ all -> 0x0e4a }
            if (r23 == 0) goto L_0x0803
            r38 = 0
            goto L_0x080b
        L_0x0803:
            boolean r1 = r3.A0J     // Catch:{ all -> 0x0e4a }
            r38 = 4
            if (r1 != 0) goto L_0x080b
            r38 = 1
        L_0x080b:
            android.media.MediaFormat r14 = r4.A02     // Catch:{ all -> 0x0e4a }
            X.EAd r13 = r4.A04     // Catch:{ all -> 0x0e4a }
            X.EAT r12 = r4.A09     // Catch:{ all -> 0x0e4a }
            X.CdW r11 = r4.A0F     // Catch:{ all -> 0x0e4a }
            X.E7t r10 = r4.A08     // Catch:{ all -> 0x0e4a }
            long r6 = r4.A01     // Catch:{ all -> 0x0e4a }
            long r1 = r4.A00     // Catch:{ all -> 0x0e4a }
            X.CXd r9 = r4.A0G     // Catch:{ all -> 0x0e4a }
            X.E7q r8 = r4.A0H     // Catch:{ all -> 0x0e4a }
            r45 = r8
            X.Cbd r8 = new X.Cbd     // Catch:{ all -> 0x0e4a }
            r26 = r15
            r27 = r14
            r28 = r11
            r29 = r9
            r30 = r45
            r31 = r19
            r32 = r20
            r33 = r13
            r34 = r46
            r35 = r3
            r36 = r10
            r37 = r12
            r39 = r6
            r41 = r1
            r25 = r8
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41)     // Catch:{ all -> 0x0e4a }
            r4.A05 = r8     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = "FbVideoResizeOperation.configureMultiOutputCoordinator"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0e4a }
            X.Cbd r9 = r4.A05     // Catch:{ all -> 0x0e4a }
            X.CAP r1 = r4.A0N     // Catch:{ all -> 0x0e4a }
            r44 = r1
            r9.A00 = r1     // Catch:{ all -> 0x0e4a }
            X.BzJ r6 = X.C24322BzJ.VIDEO     // Catch:{ all -> 0x0e4a }
            X.E7q r13 = r9.A0A     // Catch:{ all -> 0x0e4a }
            X.CUT r8 = r9.A0F     // Catch:{ all -> 0x0e4a }
            android.content.Context r12 = r9.A07     // Catch:{ all -> 0x0e4a }
            long r37 = X.C25327CdY.A00(r12, r13, r6, r8)     // Catch:{ all -> 0x0e4a }
            r10 = -1
            int r1 = (r37 > r10 ? 1 : (r37 == r10 ? 0 : -1))
            if (r1 > 0) goto L_0x0869
            X.BzJ r1 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0e4a }
            long r37 = X.C25327CdY.A00(r12, r13, r1, r8)     // Catch:{ all -> 0x0e4a }
        L_0x0869:
            r35 = r37
            r15 = 0
            X.CXd r1 = r9.A09     // Catch:{ all -> 0x0e4a }
            r43 = r1
            X.CNi r14 = new X.CNi     // Catch:{ all -> 0x0e4a }
            r14.<init>(r1, r9)     // Catch:{ all -> 0x0e4a }
            X.E54 r1 = r9.A0C     // Catch:{ all -> 0x0e4a }
            r22 = r1
            X.E7r r1 = r9.A0E     // Catch:{ all -> 0x0e4a }
            r21 = r1
            boolean r7 = r8.A0E     // Catch:{ all -> 0x0e4a }
            if (r7 == 0) goto L_0x0886
            int r1 = r9.A04     // Catch:{ all -> 0x0e4a }
            long r1 = (long) r1     // Catch:{ all -> 0x0e4a }
            long r37 = r37 / r1
        L_0x0886:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0e4a }
            r1 = 1
            long r10 = r10.toMicros(r1)     // Catch:{ all -> 0x0e4a }
            r1 = 0
            long r39 = java.lang.Math.max(r10, r1)     // Catch:{ all -> 0x0e4a }
            if (r7 != 0) goto L_0x091d
            boolean r1 = r8.A0F     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x091a
            X.BzJ r29 = X.C24322BzJ.MIXED     // Catch:{ all -> 0x0e4a }
        L_0x089c:
            boolean r11 = r8.A0G     // Catch:{ all -> 0x0e4a }
            X.CmX r1 = r9.A0B     // Catch:{ all -> 0x0e4a }
            r19 = r1
            X.CZT r10 = r8.A08     // Catch:{ all -> 0x0e4a }
            java.lang.String r7 = r8.A0C     // Catch:{ all -> 0x0e4a }
            r20 = 0
            java.lang.String r2 = r8.A0B     // Catch:{ all -> 0x0e4a }
            X.DHA r1 = new X.DHA     // Catch:{ all -> 0x0e4a }
            r42 = r11
            r26 = r43
            r27 = r19
            r28 = r22
            r30 = r21
            r31 = r14
            r32 = r10
            r33 = r7
            r34 = r2
            r41 = r11
            r25 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r37, r39, r41, r42)     // Catch:{ all -> 0x0e4a }
            java.util.Map r2 = r9.A02     // Catch:{ all -> 0x0e4a }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)     // Catch:{ all -> 0x0e4a }
            r2.put(r7, r1)     // Catch:{ all -> 0x0e4a }
            boolean r2 = r8.A0F     // Catch:{ all -> 0x0e4a }
            if (r2 != 0) goto L_0x09d2
            r2 = 1
            java.lang.String r11 = "VIDEO_ENCODE_MUX"
            X.DTn r10 = new X.DTn     // Catch:{ all -> 0x0e4a }
            r10.<init>()     // Catch:{ all -> 0x0e4a }
            java.util.concurrent.ThreadPoolExecutor r34 = X.C25325CdW.A00(r11, r10, r2, r15)     // Catch:{ all -> 0x0e4a }
            android.media.MediaFormat r14 = r9.A08     // Catch:{ all -> 0x0e4a }
            X.E7t r11 = r9.A0G     // Catch:{ all -> 0x0e4a }
            java.lang.String r10 = "mVideoTranscoder can only be null if isSkipVideoTrack is true"
            X.C26159CtX.A02(r11, r10)     // Catch:{ all -> 0x0e4a }
            X.DHe r10 = new X.DHe     // Catch:{ all -> 0x0e4a }
            r25 = r10
            r26 = r12
            r27 = r14
            r28 = r43
            r29 = r13
            r30 = r19
            r31 = r1
            r32 = r8
            r33 = r11
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34)     // Catch:{ all -> 0x0e4a }
            java.util.Map r1 = r9.A01     // Catch:{ all -> 0x0e4a }
            r1.put(r7, r10)     // Catch:{ all -> 0x0e4a }
            X.E7t r1 = r10.A07     // Catch:{ all -> 0x0e4a }
            X.EAb r1 = r1.BHL()     // Catch:{ all -> 0x0e4a }
            r10.A09 = r1     // Catch:{ all -> 0x0e4a }
            X.CUT r11 = r10.A06     // Catch:{ all -> 0x0e4a }
            boolean r1 = X.C25872Cng.A02(r11)     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x09a7
            X.CZT r9 = r11.A08     // Catch:{ all -> 0x0e4a }
            int r21 = java.lang.Math.max(r2, r2)     // Catch:{ all -> 0x0e4a }
            goto L_0x0921
        L_0x091a:
            X.BzJ r29 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0e4a }
            goto L_0x089c
        L_0x091d:
            r29 = r6
            goto L_0x089c
        L_0x0921:
            int r21 = r21 + -1
            if (r21 < 0) goto L_0x09a7
            X.CmX r8 = r10.A04     // Catch:{ all -> 0x0988 }
            long r1 = r8.A09     // Catch:{ all -> 0x0988 }
            r12 = 1
            long r1 = r1 + r12
            r8.A09 = r1     // Catch:{ all -> 0x0988 }
            X.ClM r14 = r11.A04     // Catch:{ all -> 0x0988 }
            X.C26159CtX.A01(r14)     // Catch:{ all -> 0x0988 }
            X.Cab r1 = r14.A0E     // Catch:{ all -> 0x0988 }
            if (r1 != 0) goto L_0x097e
            boolean r1 = r14.A0I     // Catch:{ all -> 0x0988 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0988 }
            X.CrM r1 = r11.A06     // Catch:{ all -> 0x0988 }
            X.CXd r13 = r10.A00     // Catch:{ all -> 0x0988 }
            java.util.ArrayList r1 = X.C25329Cda.A01(r13, r1, r2)     // Catch:{ all -> 0x0988 }
            java.util.Iterator r19 = r1.iterator()     // Catch:{ all -> 0x0988 }
        L_0x0949:
            boolean r1 = r19.hasNext()     // Catch:{ all -> 0x0988 }
            if (r1 == 0) goto L_0x09a7
            java.lang.Object r12 = r19.next()     // Catch:{ all -> 0x0988 }
            X.Cab r12 = (X.C25185Cab) r12     // Catch:{ all -> 0x0988 }
            r14.A0E = r12     // Catch:{ all -> 0x0962 }
            X.EAb r2 = r10.A09     // Catch:{ all -> 0x0962 }
            X.C26159CtX.A01(r2)     // Catch:{ all -> 0x0962 }
            android.content.Context r1 = r10.A01     // Catch:{ all -> 0x0962 }
            r2.CCO(r1, r13, r14, r9)     // Catch:{ all -> 0x0962 }
            goto L_0x09a7
        L_0x0962:
            r8 = move-exception
            java.lang.Object[] r15 = X.BE7.A1b(r12)     // Catch:{ all -> 0x0988 }
            java.lang.String r2 = "VideoEncodeMuxerWrapper"
            java.lang.String r1 = "error preparing %s"
            X.C26294Cx6.A0D(r2, r1, r8, r15)     // Catch:{ all -> 0x0988 }
            int r2 = r12.A01     // Catch:{ all -> 0x0988 }
            r1 = 1
            if (r1 != r2) goto L_0x0949
            X.Bzp r1 = X.C24354Bzp.CODEC_VIDEO_H264     // Catch:{ all -> 0x0988 }
            X.Bzp r2 = r12.A02     // Catch:{ all -> 0x0988 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0988 }
            if (r1 == 0) goto L_0x0949
            throw r8     // Catch:{ all -> 0x0988 }
        L_0x097e:
            X.EAb r8 = r10.A09     // Catch:{ all -> 0x0988 }
            android.content.Context r2 = r10.A01     // Catch:{ all -> 0x0988 }
            X.CXd r1 = r10.A00     // Catch:{ all -> 0x0988 }
            r8.CCO(r2, r1, r14, r9)     // Catch:{ all -> 0x0988 }
            goto L_0x09a7
        L_0x0988:
            r8 = move-exception
            if (r21 <= 0) goto L_0x0e49
            java.lang.Throwable r1 = r8.getCause()     // Catch:{ all -> 0x0e4a }
            boolean r1 = r1 instanceof android.media.MediaCodec.CodecException     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0e49
            java.lang.Throwable r2 = r8.getCause()     // Catch:{ all -> 0x0e4a }
            android.media.MediaCodec$CodecException r2 = (android.media.MediaCodec.CodecException) r2     // Catch:{ all -> 0x0e4a }
            boolean r1 = r2.isTransient()     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0921
            boolean r1 = r2.isRecoverable()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0e49
            goto L_0x0921
        L_0x09a7:
            X.CmX r2 = r10.A04     // Catch:{ all -> 0x0e4a }
            X.EAb r1 = r10.A09     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = r1.BRF()     // Catch:{ all -> 0x0e4a }
            r2.A0H = r1     // Catch:{ all -> 0x0e4a }
            X.ClM r1 = r11.A04     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x09d2
            X.Cab r1 = r1.A0E     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x09d2
            int r8 = r1.A01     // Catch:{ all -> 0x0e4a }
            r1 = 1
            if (r8 == r1) goto L_0x09cb
            r1 = 2
            if (r8 == r1) goto L_0x09c8
            r1 = 8
            if (r8 == r1) goto L_0x09ce
            java.lang.String r1 = ""
            goto L_0x09d0
        L_0x09c8:
            java.lang.String r1 = "main"
            goto L_0x09d0
        L_0x09cb:
            java.lang.String r1 = "baseline"
            goto L_0x09d0
        L_0x09ce:
            java.lang.String r1 = "high"
        L_0x09d0:
            r2.A0J = r1     // Catch:{ all -> 0x0e4a }
        L_0x09d2:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0e4a }
            X.E9F r1 = r3.A05     // Catch:{ all -> 0x0e4a }
            r22 = r1
            X.CmX r2 = r4.A03     // Catch:{ all -> 0x0e4a }
            r1 = 1
            r2.A0T = r1     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = "FbVideoResizeOperation.extractDecodeEncodeMux"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0e4a }
            X.Cjg r21 = new X.Cjg     // Catch:{ all -> 0x0e4a }
            r21.<init>()     // Catch:{ all -> 0x0e4a }
            if (r23 != 0) goto L_0x0cce
            X.CmX r9 = r4.A03     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r9)     // Catch:{ all -> 0x0d88 }
            r1 = 0
            r9.A0B = r1     // Catch:{ all -> 0x0d88 }
            r9.A0A = r1     // Catch:{ all -> 0x0d88 }
            java.util.concurrent.ExecutorService r1 = r4.A0B     // Catch:{ all -> 0x0d88 }
            r11 = 1
            boolean r2 = X.AnonymousClass000.A1X(r1)
            java.lang.String r1 = "ExecutorService can't be initialized twice"
            X.C26171Ctn.A03(r2, r1)     // Catch:{ all -> 0x0d88 }
            r10 = 0
            X.DTn r8 = new X.DTn     // Catch:{ all -> 0x0d88 }
            r8.<init>()     // Catch:{ all -> 0x0d88 }
            java.lang.String r2 = "VIDEO_TRANSCODER"
            r1 = 2
            java.util.concurrent.ThreadPoolExecutor r1 = X.C25325CdW.A00(r2, r8, r1, r10)     // Catch:{ all -> 0x0d88 }
            r4.A0B = r1     // Catch:{ all -> 0x0d88 }
            X.Cbd r10 = r4.A05     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r10)     // Catch:{ all -> 0x0cbb }
            boolean r8 = r4.A0C     // Catch:{ all -> 0x0cbb }
            X.C25627Cj7.A00(r4, r8)     // Catch:{ all -> 0x0cbb }
            if (r5 == 0) goto L_0x0a62
            java.util.HashMap r1 = r5.A06(r6)     // Catch:{ all -> 0x0cbb }
            r14 = 0
            if (r1 == 0) goto L_0x0a62
            java.util.HashMap r1 = r5.A06(r6)     // Catch:{ all -> 0x0cbb }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0cbb }
            if (r1 != 0) goto L_0x0a62
            X.CZT r2 = r3.A08     // Catch:{ all -> 0x0cbb }
            X.CPs r1 = new X.CPs     // Catch:{ all -> 0x0cbb }
            r1.<init>(r6, r5, r2)     // Catch:{ all -> 0x0cbb }
            if (r24 == 0) goto L_0x0a37
            goto L_0x0a39
        L_0x0a37:
            r13 = 0
            goto L_0x0a41
        L_0x0a39:
            r1 = r24
            X.CKv r1 = r1.A0D     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0a37
            boolean r13 = r1.A00     // Catch:{ all -> 0x0cbb }
        L_0x0a41:
            java.util.List r12 = r5.A07(r6, r14)     // Catch:{ all -> 0x0cbb }
            if (r12 == 0) goto L_0x0a4e
            boolean r1 = r12.isEmpty()     // Catch:{ all -> 0x0cbb }
            r2 = 1
            if (r1 == 0) goto L_0x0b19
        L_0x0a4e:
            r2 = 0
            goto L_0x0b19
        L_0x0a51:
            X.C26159CtX.A01(r12)     // Catch:{ all -> 0x0cbb }
            java.lang.Object r2 = r12.get(r14)     // Catch:{ all -> 0x0cbb }
            X.CcJ r2 = (X.C25271CcJ) r2     // Catch:{ all -> 0x0cbb }
            boolean r1 = X.C25627Cj7.A0T     // Catch:{ all -> 0x0cbb }
            boolean r1 = r2.A02(r1)     // Catch:{ all -> 0x0cbb }
            if (r1 != 0) goto L_0x0b2e
        L_0x0a62:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0cbb }
            int r19 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0cbb }
            X.CXE r14 = r4.A0Q     // Catch:{ all -> 0x0cbb }
            java.util.concurrent.ExecutorService r1 = r4.A0B     // Catch:{ all -> 0x0cbb }
            r32 = r1
            X.C26159CtX.A01(r32)     // Catch:{ all -> 0x0cbb }
            X.CmX r1 = r4.A03     // Catch:{ all -> 0x0cbb }
            r26 = r1
            X.C26159CtX.A01(r26)     // Catch:{ all -> 0x0cbb }
            X.E7t r13 = r4.A08     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r13)     // Catch:{ all -> 0x0cbb }
            r12 = 0
            java.io.File r1 = r3.A0A     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0ad4
            java.lang.String r15 = r1.getPath()     // Catch:{ all -> 0x0cbb }
            X.CZT r1 = r3.A08     // Catch:{ all -> 0x0cbb }
            boolean r2 = r1.A02()     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = "video/mp4"
            java.lang.String r2 = X.C180949Oo.A00(r15, r1, r2)     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = "image/gif"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0aa7
            X.DHZ r14 = X.CXE.A00(r3, r13, r14)     // Catch:{ all -> 0x0cbb }
        L_0x0aa0:
            r4.A09 = r14     // Catch:{ all -> 0x0cbb }
            r14.BFX(r12)     // Catch:{ all -> 0x0cbb }
            goto L_0x0b6f
        L_0x0aa7:
            java.lang.String r1 = "image"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0abc
            android.content.Context r1 = r14.A00     // Catch:{ all -> 0x0cbb }
            X.E7l r2 = r14.A02     // Catch:{ all -> 0x0cbb }
            X.C199610h.A04(r2)     // Catch:{ all -> 0x0cbb }
            X.DHa r14 = new X.DHa     // Catch:{ all -> 0x0cbb }
            r14.<init>(r1, r2, r3, r13)     // Catch:{ all -> 0x0cbb }
            goto L_0x0aa0
        L_0x0abc:
            java.lang.String r1 = "video"
            boolean r1 = r2.startsWith(r1)     // Catch:{ all -> 0x0cbb }
            if (r1 != 0) goto L_0x0ad4
            java.lang.StringBuilder r5 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = "Cannot create DemuxDecodeWrapper. No compatible mimeType : "
            java.lang.String r2 = X.AnonymousClass001.A1H(r1, r2, r5)     // Catch:{ all -> 0x0cbb }
            X.C2Z r1 = new X.C2Z     // Catch:{ all -> 0x0cbb }
            r1.<init>((java.lang.String) r2)     // Catch:{ all -> 0x0cbb }
            throw r1     // Catch:{ all -> 0x0cbb }
        L_0x0ad4:
            if (r5 == 0) goto L_0x0af6
            java.util.List r1 = r5.A07(r6, r12)     // Catch:{ all -> 0x0cbb }
            r1.getClass()     // Catch:{ all -> 0x0cbb }
            java.lang.Object r1 = r1.get(r12)     // Catch:{ all -> 0x0cbb }
            X.CcJ r1 = (X.C25271CcJ) r1     // Catch:{ all -> 0x0cbb }
            r23 = r14
            r24 = r26
            r25 = r1
            r26 = r3
            r27 = r13
            r28 = r32
            r29 = r12
            X.EAT r14 = r23.A01(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0cbb }
            goto L_0x0aa0
        L_0x0af6:
            android.content.Context r1 = r14.A00     // Catch:{ all -> 0x0cbb }
            r24 = r1
            X.E56 r1 = r14.A06     // Catch:{ all -> 0x0cbb }
            r15 = r1
            X.E55 r6 = r14.A04     // Catch:{ all -> 0x0cbb }
            X.E7q r2 = r14.A03     // Catch:{ all -> 0x0cbb }
            X.CAM r1 = r14.A05     // Catch:{ all -> 0x0cbb }
            X.DHc r14 = new X.DHc     // Catch:{ all -> 0x0cbb }
            r23 = r14
            r25 = r2
            r27 = r6
            r28 = r1
            r29 = r3
            r30 = r13
            r31 = r15
            r33 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)     // Catch:{ all -> 0x0cbb }
            goto L_0x0aa0
        L_0x0b19:
            java.lang.String r1 = "MediaTrackSegment is empty for first track"
            X.C26171Ctn.A03(r2, r1)     // Catch:{ all -> 0x0cbb }
            java.util.HashMap r1 = r5.A06(r6)     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0b3f
            java.util.HashMap r1 = r5.A06(r6)     // Catch:{ all -> 0x0cbb }
            int r1 = r1.size()     // Catch:{ all -> 0x0cbb }
            if (r1 <= r11) goto L_0x0b3f
        L_0x0b2e:
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x0cbb }
            int r12 = android.os.Process.getThreadPriority(r1)     // Catch:{ all -> 0x0cbb }
            X.Cbd r6 = r4.A05     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r6)     // Catch:{ all -> 0x0cbb }
            X.Ck5 r5 = r4.A0I     // Catch:{ all -> 0x0cbb }
            goto L_0x0c62
        L_0x0b3f:
            boolean r1 = r3.A0N     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0b6b
            java.util.HashMap r1 = r5.A06(r6)     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0b6b
            java.util.Iterator r15 = X.C17890vO.A0j(r1)     // Catch:{ all -> 0x0cbb }
        L_0x0b4d:
            boolean r1 = r15.hasNext()     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0b6b
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x0cbb }
            X.Cmm r1 = (X.C25833Cmm) r1     // Catch:{ all -> 0x0cbb }
            java.util.List r2 = r1.A04     // Catch:{ all -> 0x0cbb }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0cbb }
            r1.<init>(r2)     // Catch:{ all -> 0x0cbb }
            java.util.ArrayList r1 = X.C17880vN.A10(r2)     // Catch:{ all -> 0x0cbb }
            int r1 = r1.size()     // Catch:{ all -> 0x0cbb }
            if (r1 <= r11) goto L_0x0b4d
            goto L_0x0b2e
        L_0x0b6b:
            if (r13 != 0) goto L_0x0b2e
            goto L_0x0a51
        L_0x0b6f:
            r13 = 0
            int r1 = (r16 > r13 ? 1 : (r16 == r13 ? 0 : -1))
            if (r1 < 0) goto L_0x0b7c
            X.EAT r6 = r4.A09     // Catch:{ all -> 0x0cbb }
            r1 = r16
            r6.CHA(r1)     // Catch:{ all -> 0x0cbb }
        L_0x0b7c:
            X.Ck5 r6 = r4.A0I     // Catch:{ all -> 0x0cbb }
            r2 = 0
        L_0x0b7f:
            X.CAP r1 = r10.A00     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            if (r2 >= r11) goto L_0x0b97
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0cbb }
            java.lang.Object r2 = X.AnonymousClass000.A0w(r1, r2)     // Catch:{ all -> 0x0cbb }
            X.EAX r2 = (X.EAX) r2     // Catch:{ all -> 0x0cbb }
            if (r2 == 0) goto L_0x0b95
            r1 = r19
            r2.CNe(r6, r1)     // Catch:{ all -> 0x0cbb }
        L_0x0b95:
            r2 = 1
            goto L_0x0b7f
        L_0x0b97:
            X.EAT r1 = r4.A09     // Catch:{ all -> 0x0cbb }
            r1.start()     // Catch:{ all -> 0x0cbb }
            if (r5 == 0) goto L_0x0bcb
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0cbb }
            java.lang.Object r1 = X.C26159CtX.A00(r7, r1)     // Catch:{ all -> 0x0cbb }
            X.EAX r1 = (X.EAX) r1     // Catch:{ all -> 0x0cbb }
            r1.BBq(r12)     // Catch:{ all -> 0x0cbb }
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            r1.getClass()     // Catch:{ all -> 0x0cbb }
            X.DHK r6 = new X.DHK     // Catch:{ all -> 0x0cbb }
            r6.<init>(r1, r12)     // Catch:{ all -> 0x0cbb }
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            r1.getClass()     // Catch:{ all -> 0x0cbb }
            X.DHJ r2 = new X.DHJ     // Catch:{ all -> 0x0cbb }
            r2.<init>(r1, r12)     // Catch:{ all -> 0x0cbb }
            X.CZT r1 = r3.A08     // Catch:{ all -> 0x0cbb }
            X.BW9 r1 = X.C26060CrZ.A01(r5, r2, r6, r1)     // Catch:{ all -> 0x0cbb }
            r4.A07 = r1     // Catch:{ all -> 0x0cbb }
        L_0x0bcb:
            boolean r1 = r4.A0S     // Catch:{ all -> 0x0cbb }
            if (r1 != 0) goto L_0x0ca1
            X.C25627Cj7.A00(r4, r8)     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = "FbVideoResizeOperation.decoderLoop()"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = "FbVideoResizeOperation.decodeFrameAndAdvance()"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0cbb }
            X.EAT r1 = r4.A09     // Catch:{ all -> 0x0cbb }
            long r1 = r1.BI6()     // Catch:{ all -> 0x0cbb }
            X.EAT r5 = r4.A09     // Catch:{ all -> 0x0cbb }
            boolean r6 = r5.BeS()     // Catch:{ all -> 0x0cbb }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0cbb }
            X.Cml r5 = r4.A07     // Catch:{ all -> 0x0cbb }
            if (r5 == 0) goto L_0x0bf2
            r5.A01(r1)     // Catch:{ all -> 0x0cbb }
        L_0x0bf2:
            java.lang.String r5 = "FbVideoResizeOperation.renderAndDisplayFrame()"
            android.os.Trace.beginSection(r5)     // Catch:{ all -> 0x0cbb }
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 < 0) goto L_0x0bfe
            r10.A02(r1)     // Catch:{ all -> 0x0cbb }
        L_0x0bfe:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = "FbVideoResizeOperation.probablyEncode()"
            android.os.Trace.beginSection(r1)     // Catch:{ all -> 0x0cbb }
            if (r6 == 0) goto L_0x0c37
            r2 = 0
        L_0x0c09:
            X.CAP r1 = r10.A00     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            if (r2 >= r11) goto L_0x0c20
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0cbb }
            java.lang.Object r1 = X.AnonymousClass000.A0w(r1, r2)     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            X.EAX r1 = (X.EAX) r1     // Catch:{ all -> 0x0cbb }
            r1.flush()     // Catch:{ all -> 0x0cbb }
            r2 = 1
            goto L_0x0c09
        L_0x0c20:
            r2 = 0
        L_0x0c21:
            X.CAP r1 = r10.A00     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            if (r2 >= r11) goto L_0x0c37
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0cbb }
            java.lang.Object r1 = X.AnonymousClass000.A0w(r1, r2)     // Catch:{ all -> 0x0cbb }
            X.EAX r1 = (X.EAX) r1     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0c35
            r1.CNM()     // Catch:{ all -> 0x0cbb }
        L_0x0c35:
            r2 = 1
            goto L_0x0c21
        L_0x0c37:
            r5 = 0
            r2 = 1
        L_0x0c39:
            X.CAP r1 = r10.A00     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            if (r5 >= r11) goto L_0x0c56
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0cbb }
            java.lang.Object r1 = X.AnonymousClass000.A0w(r1, r5)     // Catch:{ all -> 0x0cbb }
            X.EAX r1 = (X.EAX) r1     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0c54
            if (r2 == 0) goto L_0x0c53
            boolean r1 = r1.BeK()     // Catch:{ all -> 0x0cbb }
            r2 = 1
            if (r1 != 0) goto L_0x0c54
        L_0x0c53:
            r2 = 0
        L_0x0c54:
            r5 = 1
            goto L_0x0c39
        L_0x0c56:
            if (r2 != 0) goto L_0x0ca1
            android.os.Trace.endSection()     // Catch:{ all -> 0x0cbb }
            android.os.Trace.endSection()     // Catch:{ all -> 0x0cbb }
            if (r6 != 0) goto L_0x0ca1
            goto L_0x0bcb
        L_0x0c62:
            r2 = 0
        L_0x0c63:
            X.CAP r1 = r6.A00     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            if (r2 >= r11) goto L_0x0c79
            java.util.Map r1 = r6.A01     // Catch:{ all -> 0x0cbb }
            java.lang.Object r1 = X.AnonymousClass000.A0w(r1, r2)     // Catch:{ all -> 0x0cbb }
            X.EAX r1 = (X.EAX) r1     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0c77
            r1.CNe(r5, r12)     // Catch:{ all -> 0x0cbb }
        L_0x0c77:
            r2 = 1
            goto L_0x0c63
        L_0x0c79:
            X.CXE r12 = r4.A0Q     // Catch:{ all -> 0x0cbb }
            X.CmX r6 = r4.A03     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r6)     // Catch:{ all -> 0x0cbb }
            X.Cbd r5 = r4.A05     // Catch:{ all -> 0x0cbb }
            X.E7t r2 = r4.A08     // Catch:{ all -> 0x0cbb }
            java.lang.String r1 = "mVideoTranscoder is null only when both isSkipVideoTrack and enableAVSynchronizedTranscoding are true"
            X.C26159CtX.A02(r2, r1)     // Catch:{ all -> 0x0cbb }
            X.CqW r1 = new X.CqW     // Catch:{ all -> 0x0cbb }
            r23 = r1
            r24 = r45
            r25 = r6
            r26 = r5
            r27 = r3
            r28 = r2
            r29 = r12
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x0cbb }
            r4.A06 = r1     // Catch:{ all -> 0x0cbb }
            r1.A01()     // Catch:{ all -> 0x0cbb }
        L_0x0ca1:
            X.C25627Cj7.A00(r4, r8)     // Catch:{ all -> 0x0cbb }
            r2 = 0
        L_0x0ca5:
            X.CAP r1 = r10.A00     // Catch:{ all -> 0x0cbb }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0cbb }
            if (r2 >= r11) goto L_0x0ccc
            java.util.Map r1 = r10.A01     // Catch:{ all -> 0x0cbb }
            java.lang.Object r1 = X.AnonymousClass000.A0w(r1, r2)     // Catch:{ all -> 0x0cbb }
            X.EAX r1 = (X.EAX) r1     // Catch:{ all -> 0x0cbb }
            if (r1 == 0) goto L_0x0cb9
            r1.CRz()     // Catch:{ all -> 0x0cbb }
        L_0x0cb9:
            r2 = 1
            goto L_0x0ca5
        L_0x0cbb:
            r2 = move-exception
            X.EAT r1 = r4.A09     // Catch:{ all -> 0x0d88 }
            if (r1 == 0) goto L_0x0cc3
            r1.cancel()     // Catch:{ all -> 0x0d88 }
        L_0x0cc3:
            boolean r1 = r2 instanceof java.util.concurrent.ExecutionException     // Catch:{ all -> 0x0d88 }
            if (r1 == 0) goto L_0x0ccb
            java.lang.Throwable r2 = X.BE9.A0u(r2)     // Catch:{ all -> 0x0d88 }
        L_0x0ccb:
            throw r2     // Catch:{ all -> 0x0d88 }
        L_0x0ccc:
            r9.A0S = r11     // Catch:{ all -> 0x0d88 }
        L_0x0cce:
            android.media.MediaFormat r1 = r4.A02     // Catch:{ all -> 0x0d88 }
            if (r1 == 0) goto L_0x0dbf
            X.CmX r9 = r4.A03     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r9)     // Catch:{ all -> 0x0d88 }
            X.Cbd r5 = r4.A05     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r5)     // Catch:{ all -> 0x0d88 }
            X.EAd r11 = r4.A04     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r11)     // Catch:{ all -> 0x0d88 }
            r1 = 0
            r9.A07 = r1     // Catch:{ all -> 0x0d88 }
            r10 = 1
            r9.A0R = r10     // Catch:{ all -> 0x0d88 }
            X.BzJ r2 = X.C24322BzJ.AUDIO     // Catch:{ all -> 0x0d88 }
            r1 = -1
            r11.CHF(r2, r1)     // Catch:{ all -> 0x0d88 }
            boolean r8 = r4.A0C     // Catch:{ all -> 0x0d88 }
            X.C25627Cj7.A00(r4, r8)     // Catch:{ all -> 0x0d88 }
            java.util.Map r6 = r5.A02     // Catch:{ all -> 0x0d88 }
            java.lang.Object r5 = X.C26159CtX.A00(r7, r6)     // Catch:{ all -> 0x0d88 }
            X.DHA r5 = (X.DHA) r5     // Catch:{ all -> 0x0d88 }
            boolean r1 = r5.A05     // Catch:{ all -> 0x0d88 }
            if (r1 != 0) goto L_0x0d13
            android.media.MediaFormat r1 = r4.A02     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0d88 }
            r5.A02 = r1     // Catch:{ all -> 0x0d88 }
            r9.A0N = r10     // Catch:{ all -> 0x0d88 }
            r5.start()     // Catch:{ all -> 0x0d88 }
            X.CmX r2 = r4.A03     // Catch:{ all -> 0x0d88 }
            java.lang.String r1 = r5.BV9()     // Catch:{ all -> 0x0d88 }
            r2.A0I = r1     // Catch:{ all -> 0x0d88 }
        L_0x0d13:
            X.DH1 r5 = new X.DH1     // Catch:{ all -> 0x0d88 }
            r5.<init>()     // Catch:{ all -> 0x0d88 }
            boolean r1 = r46.CLg()     // Catch:{ all -> 0x0d88 }
            if (r1 == 0) goto L_0x0d41
            android.media.MediaFormat r1 = r11.BYV()     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0d88 }
            X.CAN.A00(r1, r5)     // Catch:{ all -> 0x0d88 }
            X.C25627Cj7.A00(r4, r8)     // Catch:{ all -> 0x0d88 }
            java.lang.Object r1 = X.C26159CtX.A00(r7, r6)     // Catch:{ all -> 0x0d88 }
            X.DHA r1 = (X.DHA) r1     // Catch:{ all -> 0x0d88 }
            r1.CSO(r5)     // Catch:{ Exception -> 0x0d35 }
            goto L_0x0d41
        L_0x0d35:
            X.CmX r14 = r4.A03     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r14)     // Catch:{ all -> 0x0d88 }
            long r1 = r14.A07     // Catch:{ all -> 0x0d88 }
            r12 = 1
            long r1 = r1 + r12
            r14.A07 = r1     // Catch:{ all -> 0x0d88 }
        L_0x0d41:
            r15 = 1
        L_0x0d42:
            X.C25627Cj7.A00(r4, r8)     // Catch:{ all -> 0x0d88 }
            java.nio.ByteBuffer r1 = r5.A00     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0d88 }
            int r13 = r11.CDT(r1)     // Catch:{ all -> 0x0d88 }
            long r1 = r11.BYW()     // Catch:{ all -> 0x0d88 }
            if (r13 <= 0) goto L_0x0dbf
            int r12 = r11.BYU()     // Catch:{ all -> 0x0d88 }
            r5.CI8(r13, r1, r12)     // Catch:{ all -> 0x0d88 }
            if (r15 == 0) goto L_0x0d62
            r9.A03 = r1     // Catch:{ all -> 0x0d88 }
            r9.A0P = r10     // Catch:{ all -> 0x0d88 }
            r15 = 0
        L_0x0d62:
            r9.A05 = r1     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r44)     // Catch:{ all -> 0x0d88 }
            java.lang.Object r1 = X.C26159CtX.A00(r7, r6)     // Catch:{ all -> 0x0d88 }
            X.DHA r1 = (X.DHA) r1     // Catch:{ all -> 0x0d88 }
            r1.CSO(r5)     // Catch:{ Exception -> 0x0d71 }
            goto L_0x0d7d
        L_0x0d71:
            X.CmX r14 = r4.A03     // Catch:{ all -> 0x0d88 }
            X.C26159CtX.A01(r14)     // Catch:{ all -> 0x0d88 }
            long r1 = r14.A07     // Catch:{ all -> 0x0d88 }
            r12 = 1
            long r1 = r1 + r12
            r14.A07 = r1     // Catch:{ all -> 0x0d88 }
        L_0x0d7d:
            long r1 = r9.A08     // Catch:{ all -> 0x0d88 }
            r12 = 1
            long r1 = r1 + r12
            r9.A08 = r1     // Catch:{ all -> 0x0d88 }
            r11.BBv()     // Catch:{ all -> 0x0d88 }
            goto L_0x0d42
        L_0x0d88:
            r6 = move-exception
            r1 = r21
            X.C25650Cjg.A00(r1, r6)     // Catch:{ all -> 0x0e13 }
            r5 = 1
            X.CmX r2 = r4.A03     // Catch:{ all -> 0x0e11 }
            X.C26159CtX.A01(r2)     // Catch:{ all -> 0x0e11 }
            java.lang.String r1 = r6.getMessage()     // Catch:{ all -> 0x0e11 }
            r2.A0K = r1     // Catch:{ all -> 0x0e11 }
            java.lang.Throwable r1 = r6.getCause()     // Catch:{ all -> 0x0e11 }
            if (r1 == 0) goto L_0x0dab
            X.CmX r2 = r4.A03     // Catch:{ all -> 0x0e11 }
            X.C26159CtX.A01(r2)     // Catch:{ all -> 0x0e11 }
            java.lang.String r1 = X.BE7.A0p(r6)     // Catch:{ all -> 0x0e11 }
            r2.A0M = r1     // Catch:{ all -> 0x0e11 }
        L_0x0dab:
            X.CmX r2 = r4.A03     // Catch:{ all -> 0x0e11 }
            X.C26159CtX.A01(r2)     // Catch:{ all -> 0x0e11 }
            java.lang.String r1 = android.util.Log.getStackTraceString(r6)     // Catch:{ all -> 0x0e11 }
            r2.A0L = r1     // Catch:{ all -> 0x0e11 }
        L_0x0db6:
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0e4a }
            r1.A00()     // Catch:{ all -> 0x0e4a }
            goto L_0x0dcb
        L_0x0dbf:
            boolean r1 = r4.A0S     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0db6
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0e4a }
            r1.A01()     // Catch:{ all -> 0x0e4a }
        L_0x0dcb:
            r1 = r21
            java.lang.Throwable r1 = r1.A01     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0e10
            android.os.Trace.endSection()     // Catch:{ all -> 0x0e4a }
            boolean r1 = r4.A0S     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0de6
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0e4a }
            boolean r1 = r1.A03     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0de6
            java.lang.String r1 = "Last segment is not produced"
            X.C2Z r8 = new X.C2Z     // Catch:{ all -> 0x0e4a }
            r8.<init>((java.lang.String) r1)     // Catch:{ all -> 0x0e4a }
            goto L_0x0e49
        L_0x0de6:
            r1 = r47
            X.C25627Cj7.A00(r4, r1)     // Catch:{ all -> 0x0e4a }
            if (r22 == 0) goto L_0x0df8
            boolean r1 = r4.A0S     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0dfd
            X.CmX r2 = r4.A03     // Catch:{ all -> 0x0e4a }
            r1 = r22
            r1.Bnq(r2)     // Catch:{ all -> 0x0e4a }
        L_0x0df8:
            android.os.Trace.endSection()     // Catch:{ all -> 0x0e4a }
            goto L_0x0ec4
        L_0x0dfd:
            X.Ck5 r2 = r4.A0I     // Catch:{ all -> 0x0e4a }
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r1 = r20
            r2.A00(r1, r5)     // Catch:{ all -> 0x0e4a }
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0e4a }
            java.util.List r2 = r1.A0I     // Catch:{ all -> 0x0e4a }
            r1 = r22
            r1.BpP(r2)     // Catch:{ all -> 0x0e4a }
            goto L_0x0df8
        L_0x0e10:
            throw r1     // Catch:{ all -> 0x0e4a }
        L_0x0e11:
            r8 = move-exception
            goto L_0x0e15
        L_0x0e13:
            r8 = move-exception
            r5 = 0
        L_0x0e15:
            boolean r1 = r4.A0S     // Catch:{ all -> 0x0e4a }
            if (r1 != 0) goto L_0x0e1c
            if (r5 != 0) goto L_0x0e1c
            goto L_0x0e41
        L_0x0e1c:
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0e4a }
            r1.A00()     // Catch:{ all -> 0x0e4a }
            goto L_0x0e49
        L_0x0e25:
            r1 = move-exception
            X.BVw r8 = new X.BVw     // Catch:{ all -> 0x0e4a }
            r8.<init>(r1)     // Catch:{ all -> 0x0e4a }
            goto L_0x0e49
        L_0x0e2c:
            r8 = move-exception
            java.lang.Class<X.Cj7> r6 = X.C25627Cj7.class
            java.lang.String r5 = "audio transcode pipeline err"
            boolean r1 = X.BE8.A1R()     // Catch:{ all -> 0x0e4a }
            if (r1 == 0) goto L_0x0e49
            X.EAY r2 = X.C26294Cx6.A01     // Catch:{ all -> 0x0e4a }
            java.lang.String r1 = r6.getSimpleName()     // Catch:{ all -> 0x0e4a }
            r2.BJo(r1, r5, r8)     // Catch:{ all -> 0x0e4a }
            goto L_0x0e49
        L_0x0e41:
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0e4a }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x0e4a }
            r1.A01()     // Catch:{ all -> 0x0e4a }
        L_0x0e49:
            throw r8     // Catch:{ all -> 0x0e4a }
        L_0x0e4a:
            r8 = move-exception
            boolean r1 = r8 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x0ef2 }
            if (r1 == 0) goto L_0x0e82
            boolean r1 = r4.A0C     // Catch:{ all -> 0x0ef2 }
            if (r1 == 0) goto L_0x0e5a
            X.Cbd r1 = r4.A05     // Catch:{ all -> 0x0ef2 }
            if (r1 == 0) goto L_0x0e5a
            r1.A00()     // Catch:{ all -> 0x0ef2 }
        L_0x0e5a:
            X.E9F r2 = r3.A05     // Catch:{ all -> 0x0ef2 }
            if (r2 == 0) goto L_0x0e63
            X.CmX r1 = r4.A03     // Catch:{ all -> 0x0ef2 }
            r2.Bnq(r1)     // Catch:{ all -> 0x0ef2 }
        L_0x0e63:
            X.EAT r2 = r4.A09     // Catch:{ Exception -> 0x0f11 }
            r1 = r18
            X.CVE r1 = r1.A01(r2)     // Catch:{ Exception -> 0x0f11 }
            r1.A00()     // Catch:{ Exception -> 0x0f11 }
            X.EAd r3 = r4.A04     // Catch:{ Exception -> 0x0f11 }
            r2 = 4
            r1 = r18
            X.C25635CjM.A01(r1, r3, r2)     // Catch:{ Exception -> 0x0f11 }
            java.util.concurrent.ExecutorService r1 = r4.A0B     // Catch:{ Exception -> 0x0f11 }
            if (r1 == 0) goto L_0x0f11
            r1.shutdown()     // Catch:{ Exception -> 0x0f11 }
            r1 = 0
            r4.A0B = r1     // Catch:{ Exception -> 0x0f11 }
            goto L_0x0f11
        L_0x0e82:
            boolean r1 = r8 instanceof X.C2Z     // Catch:{ all -> 0x0ef2 }
            if (r1 == 0) goto L_0x0e93
            X.C2Z r8 = (X.C2Z) r8     // Catch:{ all -> 0x0ef2 }
        L_0x0e88:
            X.CmX r7 = r4.A03     // Catch:{ all -> 0x0ef2 }
            java.lang.Class<X.Cj7> r6 = X.C25627Cj7.class
            java.lang.String r5 = "Exception"
            boolean r1 = X.BE8.A1R()     // Catch:{ all -> 0x0ef2 }
            goto L_0x0eaa
        L_0x0e93:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x0ef2 }
            java.lang.String r1 = "Failed to resize video ("
            r2.append(r1)     // Catch:{ all -> 0x0ef2 }
            X.AnonymousClass8BS.A1I(r2, r8)     // Catch:{ all -> 0x0ef2 }
            java.lang.String r2 = X.AnonymousClass8BU.A0q(r2)     // Catch:{ all -> 0x0ef2 }
            X.C2Z r1 = new X.C2Z     // Catch:{ all -> 0x0ef2 }
            r1.<init>(r2, r8)     // Catch:{ all -> 0x0ef2 }
            r8 = r1
            goto L_0x0e88
        L_0x0eaa:
            if (r1 == 0) goto L_0x0eb5
            X.EAY r2 = X.C26294Cx6.A01     // Catch:{ all -> 0x0ef2 }
            java.lang.String r1 = r6.getSimpleName()     // Catch:{ all -> 0x0ef2 }
            r2.BJo(r1, r5, r8)     // Catch:{ all -> 0x0ef2 }
        L_0x0eb5:
            r8.getMessage()     // Catch:{ all -> 0x0ef2 }
            X.E9F r1 = r3.A05     // Catch:{ all -> 0x0ef2 }
            if (r1 == 0) goto L_0x0ebf
            r1.BtX(r7, r8)     // Catch:{ all -> 0x0ef2 }
        L_0x0ebf:
            r1 = r18
            X.C25650Cjg.A00(r1, r8)     // Catch:{ all -> 0x0ef2 }
        L_0x0ec4:
            X.EAT r2 = r4.A09     // Catch:{ Exception -> 0x0f11 }
            r1 = r18
            X.CVE r1 = r1.A01(r2)     // Catch:{ Exception -> 0x0f11 }
            r1.A00()     // Catch:{ Exception -> 0x0f11 }
            X.EAd r3 = r4.A04     // Catch:{ Exception -> 0x0f11 }
            r2 = 4
            r1 = r18
            X.C25635CjM.A01(r1, r3, r2)     // Catch:{ Exception -> 0x0f11 }
            java.util.concurrent.ExecutorService r1 = r4.A0B     // Catch:{ Exception -> 0x0f11 }
            if (r1 == 0) goto L_0x0ee1
            r1.shutdown()     // Catch:{ Exception -> 0x0f11 }
            r1 = 0
            r4.A0B = r1     // Catch:{ Exception -> 0x0f11 }
        L_0x0ee1:
            r1 = r18
            java.lang.Throwable r5 = r1.A01     // Catch:{ Exception -> 0x0f11 }
            if (r5 == 0) goto L_0x0f11
            boolean r1 = r5 instanceof X.C2Z     // Catch:{ Exception -> 0x0f11 }
            if (r1 != 0) goto L_0x0f10
            X.C2Z r1 = new X.C2Z     // Catch:{ Exception -> 0x0f11 }
            r1.<init>((java.lang.Throwable) r5)     // Catch:{ Exception -> 0x0f11 }
            r5 = r1
            goto L_0x0f10
        L_0x0ef2:
            r5 = move-exception
            X.EAT r2 = r4.A09     // Catch:{ Exception -> 0x0f11 }
            r1 = r18
            X.CVE r1 = r1.A01(r2)     // Catch:{ Exception -> 0x0f11 }
            r1.A00()     // Catch:{ Exception -> 0x0f11 }
            X.EAd r3 = r4.A04     // Catch:{ Exception -> 0x0f11 }
            r2 = 4
            r1 = r18
            X.C25635CjM.A01(r1, r3, r2)     // Catch:{ Exception -> 0x0f11 }
            java.util.concurrent.ExecutorService r1 = r4.A0B     // Catch:{ Exception -> 0x0f11 }
            if (r1 == 0) goto L_0x0f10
            r1.shutdown()     // Catch:{ Exception -> 0x0f11 }
            r1 = 0
            r4.A0B = r1     // Catch:{ Exception -> 0x0f11 }
        L_0x0f10:
            throw r5     // Catch:{ Exception -> 0x0f11 }
        L_0x0f11:
            java.lang.Object r1 = r0.A02
            X.DGq r1 = (X.C26859DGq) r1
            java.util.concurrent.CountDownLatch r0 = r1.A00
            r0.countDown()
            r0 = 0
            r1.A01 = r0
            return
        L_0x0f1e:
            java.lang.Object r2 = r0.A01
            X.2Ws r2 = (X.C51032Ws) r2
            java.lang.Object r1 = r0.A02
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            X.1Zq r0 = r2.A00
            if (r0 == 0) goto L_0x2217
            r0.A03(r1)
            return
        L_0x0f2e:
            java.lang.Object r1 = r0.A01
            X.1GV r1 = (X.AnonymousClass1GV) r1
            java.lang.Object r0 = r0.A02
            r1.accept(r0)
            return
        L_0x0f38:
            java.lang.Object r3 = r0.A00
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r0.A02
            X.BLU r1 = (X.BLU) r1
            r3.endViewTransition(r2)
            X.1wC r0 = r1.A00
            X.1t9 r0 = r0.A00
            r0.A03(r1)
            return
        L_0x0f4f:
            java.lang.Object r0 = r0.A02
            X.BLW r0 = (X.BLW) r0
            X.00P r1 = r0.A01
            X.Cmw r0 = X.C25431Cfd.A01
            r0 = 3
            X.C18070vi.A0d(r1, r0)
            return
        L_0x0f5c:
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            java.lang.Object r1 = r0.A02
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r0 = 2
            X.C18070vi.A0d(r1, r0)
            X.C25842Cmw.A01(r2, r1)
            return
        L_0x0f6c:
            java.lang.Object r1 = r0.A01
            java.util.Iterator r8 = X.AnonymousClass8BR.A13(r1)
        L_0x0f72:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x1019
            java.lang.Object r6 = r8.next()
            X.6zE r6 = (X.C139656zE) r6
            java.util.Set r1 = r6.A0F
            if (r1 == 0) goto L_0x0f72
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0f72
            java.lang.Object r3 = r0.A00
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r3 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r3
            androidx.core.graphics.drawable.IconCompat r4 = r6.A09
            r5 = 0
            if (r4 == 0) goto L_0x0f9e
            int r2 = r4.A06()
            r1 = 1
            if (r2 == r1) goto L_0x1009
            r1 = 2
            if (r2 == r1) goto L_0x0ff9
            r1 = 5
            if (r2 == r1) goto L_0x1009
        L_0x0f9e:
            r7 = r5
            r1 = r5
        L_0x0fa0:
            X.71Y r4 = new X.71Y
            r4.<init>(r6)
            X.6zE r2 = r4.A00
            r2.A09 = r5
            X.6zE r2 = r4.A00()
            X.9cN r5 = new X.9cN
            r5.<init>(r2, r7, r1)
            androidx.core.graphics.drawable.IconCompat r1 = r6.A09
            java.lang.String r4 = r5.A01
            if (r4 == 0) goto L_0x0ff7
            android.graphics.Bitmap r2 = r1.A07()
        L_0x0fbc:
            java.lang.String r7 = r6.A0D
            java.util.Map r1 = r3.A04
            r1.put(r7, r5)
            if (r2 == 0) goto L_0x0f72
            r1 = 1
            X.AkQ r6 = new X.AkQ
            r6.<init>(r3, r2, r4, r1)
            X.BJL r5 = new X.BJL
            r5.<init>()
            java.util.concurrent.ExecutorService r4 = r3.A06
            r2 = 8
            X.DTg r1 = new X.DTg
            r1.<init>(r6, r3, r5, r2)
            r4.submit(r1)
            java.util.Map r1 = r3.A03
            java.lang.Object r2 = r1.put(r7, r5)
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            if (r2 == 0) goto L_0x0fea
            r1 = 0
            r2.cancel(r1)
        L_0x0fea:
            r1 = 0
            X.AkQ r2 = new X.AkQ
            r2.<init>(r0, r5, r7, r1)
            java.util.concurrent.ExecutorService r1 = r3.A05
            r5.BBG(r2, r1)
            goto L_0x0f72
        L_0x0ff7:
            r2 = 0
            goto L_0x0fbc
        L_0x0ff9:
            android.content.Context r1 = r3.A00
            android.content.res.Resources r2 = r1.getResources()
            int r1 = r4.A05()
            java.lang.String r7 = r2.getResourceName(r1)
            r1 = r5
            goto L_0x0fa0
        L_0x1009:
            java.io.File r2 = r3.A01
            java.lang.String r1 = X.C17890vO.A0Q()
            java.io.File r1 = X.C17880vN.A0e(r2, r1)
            java.lang.String r1 = r1.getAbsolutePath()
            r7 = r5
            goto L_0x0fa0
        L_0x1019:
            java.lang.Object r1 = r0.A00
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r1 = (androidx.sharetarget.ShortcutInfoCompatSaverImpl) r1
            java.lang.Object r0 = r0.A02
            X.BJL r0 = (X.BJL) r0
            r1.A03(r0)
            return
        L_0x1025:
            java.lang.Object r2 = r0.A01
            X.DMr r2 = (X.DMr) r2
            boolean r1 = r2.isCancelled()
            if (r1 != 0) goto L_0x2217
            java.lang.Object r0 = r0.A02     // Catch:{ Exception -> 0x1039 }
            X.C108945cZ.A1P(r0)     // Catch:{ Exception -> 0x1039 }
            r0 = 0
            r2.A04(r0)     // Catch:{ Exception -> 0x1039 }
            return
        L_0x1039:
            r0 = move-exception
            r2.A03(r0)
            return
        L_0x103e:
            java.lang.Object r8 = r0.A00
            X.AHp r8 = (X.C20359AHp) r8
            java.lang.Object r2 = r0.A01
            java.util.concurrent.Future r2 = (java.util.concurrent.Future) r2
            java.lang.Object r1 = r0.A02
            X.Aka r1 = (X.C21469Aka) r1
            java.lang.Object r0 = r2.get()     // Catch:{ InterruptedException | ExecutionException -> 0x1053 }
            boolean r7 = X.AnonymousClass000.A1Y(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x1053 }
            goto L_0x1054
        L_0x1053:
            r7 = 1
        L_0x1054:
            java.lang.Object r6 = r8.A09
            monitor-enter(r6)
            X.A2t r0 = r1.A08     // Catch:{ all -> 0x10aa }
            X.9pp r5 = X.AnonymousClass9OL.A00(r0)     // Catch:{ all -> 0x10aa }
            java.lang.String r4 = r5.A01     // Catch:{ all -> 0x10aa }
            java.util.Map r0 = r8.A05     // Catch:{ all -> 0x10aa }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x10aa }
            X.Aka r0 = (X.C21469Aka) r0     // Catch:{ all -> 0x10aa }
            if (r0 != 0) goto L_0x1071
            java.util.Map r0 = r8.A04     // Catch:{ all -> 0x10aa }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x10aa }
            X.Aka r0 = (X.C21469Aka) r0     // Catch:{ all -> 0x10aa }
        L_0x1071:
            if (r0 != r1) goto L_0x1076
            X.C20359AHp.A00(r8, r4)     // Catch:{ all -> 0x10aa }
        L_0x1076:
            X.A5Z r3 = X.A5Z.A00()     // Catch:{ all -> 0x10aa }
            java.lang.String r2 = X.C20359AHp.A0B     // Catch:{ all -> 0x10aa }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x10aa }
            X.C17900vP.A0a(r8, r1)     // Catch:{ all -> 0x10aa }
            X.BE6.A1J(r1)     // Catch:{ all -> 0x10aa }
            r1.append(r4)     // Catch:{ all -> 0x10aa }
            java.lang.String r0 = " executed; reschedule = "
            java.lang.String r0 = X.C17900vP.A0D(r0, r1, r7)     // Catch:{ all -> 0x10aa }
            r3.A03(r2, r0)     // Catch:{ all -> 0x10aa }
            java.util.List r0 = r8.A0A     // Catch:{ all -> 0x10aa }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x10aa }
        L_0x1098:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x10aa }
            if (r0 == 0) goto L_0x10a8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x10aa }
            X.B6b r0 = (X.C22398B6b) r0     // Catch:{ all -> 0x10aa }
            r0.BtY(r5, r7)     // Catch:{ all -> 0x10aa }
            goto L_0x1098
        L_0x10a8:
            monitor-exit(r6)     // Catch:{ all -> 0x10aa }
            return
        L_0x10aa:
            r1 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x10aa }
            throw r1
        L_0x10ad:
            java.lang.Object r2 = r0.A00
            X.AHp r2 = (X.C20359AHp) r2
            java.lang.Object r1 = r0.A02
            X.9UL r1 = (X.AnonymousClass9UL) r1
            java.lang.Object r0 = r0.A01
            X.9cP r0 = (X.C185329cP) r0
            r2.A04(r0, r1)
            return
        L_0x10bd:
            java.lang.Object r4 = r0.A01
            X.DFL r4 = (X.DFL) r4
            java.lang.Object r3 = r0.A02
            X.E8A r3 = (X.E8A) r3
            X.A4p r2 = new X.A4p
            r2.<init>()
            r1 = 0
            java.lang.Object r0 = r0.A00
            X.DOZ r0 = (X.DOZ) r0
            X.C26209Cul.A04(r0, r4, r2, r3, r1)
            return
        L_0x10d3:
            java.lang.Object r1 = r0.A01
            X.Boh r1 = (X.C23736Boh) r1
            X.Cph r4 = new X.Cph
            r4.<init>(r1)
            java.lang.Object r3 = r0.A02
            X.E8A r3 = (X.E8A) r3
            X.A4p r2 = new X.A4p
            r2.<init>()
            r1 = 0
            java.lang.Object r0 = r0.A00
            X.9zJ r0 = X.BE7.A0R(r2, r0, r1)
            r4.A02(r0, r3)
            return
        L_0x10f0:
            java.lang.Object r6 = r0.A00
            if (r6 != 0) goto L_0x113d
            r6 = 0
        L_0x10f5:
            java.lang.Object r5 = r0.A01
            X.DOZ r5 = (X.DOZ) r5
            X.DNk r1 = X.C26272CwJ.A01(r5)
            X.DNn r3 = new X.DNn
            r3.<init>(r6)
            X.CTl r1 = r1.A05
            if (r1 == 0) goto L_0x113b
            X.DFL r2 = r1.A01
            r1 = 0
            X.DFL r1 = X.DNW.A00(r2, r3, r1)
        L_0x110d:
            r4 = 0
            if (r1 != 0) goto L_0x1128
            java.lang.String r2 = "AccessibilityUtils"
            java.lang.Object[] r1 = X.AnonymousClass8BV.A1b(r6)
            r0 = 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "Component does not exist in the hierarchy for id: %s. Is the component with this ID not yet rendered? If so, this will not work."
            java.lang.String r0 = java.lang.String.format(r0, r1)
            X.C18070vi.A0X(r0)
        L_0x1124:
            X.C25913CoX.A00(r5, r2, r0, r4)
            return
        L_0x1128:
            android.view.View r3 = r1.A06(r5)
            if (r3 != 0) goto L_0x1149
            java.lang.String r2 = "AccessibilityUtils"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "No View found for component with id: "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r6, r1)
            goto L_0x1124
        L_0x113b:
            r1 = 0
            goto L_0x110d
        L_0x113d:
            boolean r1 = r6 instanceof java.lang.String
            if (r1 == 0) goto L_0x1144
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x10f5
        L_0x1144:
            java.lang.String r6 = r6.toString()
            goto L_0x10f5
        L_0x1149:
            int r2 = r3.getId()
            r1 = -1
            if (r2 != r1) goto L_0x1157
            int r2 = android.view.View.generateViewId()
            r3.setId(r2)
        L_0x1157:
            java.lang.Object r0 = r0.A02
            android.view.View r0 = (android.view.View) r0
            r0.setLabelFor(r2)
            return
        L_0x115f:
            java.lang.Object r3 = r0.A01
            X.BCy r3 = (X.C22563BCy) r3
            java.lang.Object r1 = r0.A00
            X.CtM r1 = (X.C26154CtM) r1
            int r2 = r1.A00
            X.Caq r1 = r1.A01
            java.lang.Object r0 = r0.A02
            X.CTB r0 = (X.CTB) r0
            r3.BsG(r1, r0, r2)
            return
        L_0x1173:
            java.lang.Object r1 = r0.A02
            X.BA6 r1 = (X.BA6) r1
            java.lang.Object r0 = r0.A01
            X.9zw r0 = (X.C199399zw) r0
            X.9LV r0 = r0.A01()
            r1.Btj(r0)
            return
        L_0x1183:
            java.lang.Object r3 = r0.A00
            X.A8i r3 = (X.C20123A8i) r3
            java.lang.Object r1 = r0.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r6 = r0.A01
            X.9p5 r6 = (X.C192849p5) r6
            X.A4D r0 = r6.A07
            java.util.List r4 = java.util.Collections.singletonList(r0)
            java.lang.Object r2 = r3.A05
            monitor-enter(r2)
            monitor-enter(r6)     // Catch:{ all -> 0x12b0 }
            boolean r0 = r6.A03     // Catch:{ all -> 0x119f }
            monitor-exit(r6)     // Catch:{ all -> 0x12b0 }
            if (r0 != 0) goto L_0x12ae
            goto L_0x11a2
        L_0x119f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x12b0 }
            goto L_0x11d9
        L_0x11a2:
            java.util.ArrayList r5 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x12b0 }
            java.util.Iterator r12 = r1.iterator()     // Catch:{ all -> 0x12b0 }
        L_0x11aa:
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x12b0 }
            if (r0 == 0) goto L_0x128f
            java.lang.Object r10 = r12.next()     // Catch:{ all -> 0x12b0 }
            X.AEq r10 = (X.C20282AEq) r10     // Catch:{ all -> 0x12b0 }
            X.A7A r8 = r3.A01     // Catch:{ all -> 0x12b0 }
            X.A6K r0 = r10.A01     // Catch:{ all -> 0x12b0 }
            java.lang.String r7 = r0.A0A     // Catch:{ all -> 0x12b0 }
            java.util.Map r1 = r8.A03     // Catch:{ all -> 0x12b0 }
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x12b0 }
            if (r0 == 0) goto L_0x11da
            java.lang.Object r9 = r1.get(r7)     // Catch:{ all -> 0x12b0 }
            X.9lh r9 = (X.C190899lh) r9     // Catch:{ all -> 0x12b0 }
            if (r9 != 0) goto L_0x11ee
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = "No InternalLoadRequest in mAssetIdToInternalLoadRequestMap for id: "
            r1.append(r0)     // Catch:{ all -> 0x12b0 }
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r7, r1)     // Catch:{ all -> 0x12b0 }
        L_0x11d9:
            throw r0     // Catch:{ all -> 0x12b0 }
        L_0x11da:
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x12b0 }
            if (r0 != 0) goto L_0x1280
            X.9lh r9 = new X.9lh     // Catch:{ all -> 0x12b0 }
            r9.<init>(r10)     // Catch:{ all -> 0x12b0 }
            r1.put(r7, r9)     // Catch:{ all -> 0x12b0 }
            X.A7A.A02(r9, r8)     // Catch:{ all -> 0x12b0 }
            r5.add(r9)     // Catch:{ all -> 0x12b0 }
        L_0x11ee:
            java.util.Map r7 = r8.A04     // Catch:{ all -> 0x12b0 }
            boolean r0 = r7.containsKey(r6)     // Catch:{ all -> 0x12b0 }
            X.C26159CtX.A03(r0)     // Catch:{ all -> 0x12b0 }
            java.util.Map r1 = r8.A05     // Catch:{ all -> 0x12b0 }
            boolean r0 = r1.containsKey(r9)     // Catch:{ all -> 0x12b0 }
            X.C26159CtX.A03(r0)     // Catch:{ all -> 0x12b0 }
            java.util.List r11 = X.AnonymousClass8BS.A0t(r6, r7)     // Catch:{ all -> 0x12b0 }
            java.util.List r1 = X.AnonymousClass8BS.A0t(r9, r1)     // Catch:{ all -> 0x12b0 }
            X.C26159CtX.A01(r1)     // Catch:{ all -> 0x12b0 }
            boolean r0 = r1.contains(r6)     // Catch:{ all -> 0x12b0 }
            r7 = 0
            java.lang.String r10 = "InternalStateManager"
            if (r0 == 0) goto L_0x1230
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = "ExternalLoadRequest already linked with InternalLoadRequest: "
            r1.append(r0)     // Catch:{ all -> 0x12b0 }
            X.AEq r0 = r9.A03     // Catch:{ all -> 0x12b0 }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x12b0 }
            java.lang.IllegalStateException r9 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ all -> 0x12b0 }
            X.9iK r1 = r8.A01     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = "External load request already linked"
        L_0x122b:
            r1.A00(r10, r0, r9, r7)     // Catch:{ all -> 0x12b0 }
            goto L_0x11aa
        L_0x1230:
            X.C26159CtX.A01(r11)     // Catch:{ all -> 0x12b0 }
            boolean r0 = r11.contains(r9)     // Catch:{ all -> 0x12b0 }
            if (r0 == 0) goto L_0x1251
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = "InternalLoadRequest already linked with ExternalLoadRequest: "
            r1.append(r0)     // Catch:{ all -> 0x12b0 }
            X.AEq r0 = r9.A03     // Catch:{ all -> 0x12b0 }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x12b0 }
            java.lang.IllegalStateException r9 = X.AnonymousClass000.A0o(r0, r1)     // Catch:{ all -> 0x12b0 }
            X.9iK r1 = r8.A01     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = "Internal load request already linked"
            goto L_0x122b
        L_0x1251:
            r11.add(r9)     // Catch:{ all -> 0x12b0 }
            r1.add(r6)     // Catch:{ all -> 0x12b0 }
            boolean r0 = r6.A00()     // Catch:{ all -> 0x12b0 }
            if (r0 == 0) goto L_0x1265
            int r0 = r9.A01     // Catch:{ all -> 0x12b0 }
            int r0 = r0 + 1
            r9.A01 = r0     // Catch:{ all -> 0x12b0 }
            goto L_0x11aa
        L_0x1265:
            int r0 = r9.A00     // Catch:{ all -> 0x12b0 }
            int r0 = r0 + 1
            r9.A00 = r0     // Catch:{ all -> 0x12b0 }
            java.util.Map r1 = r8.A02     // Catch:{ all -> 0x12b0 }
            X.AEq r0 = r9.A03     // Catch:{ all -> 0x12b0 }
            X.A6K r0 = r0.A01     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = r0.A0A     // Catch:{ all -> 0x12b0 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x12b0 }
            X.9zP r0 = (X.C199089zP) r0     // Catch:{ all -> 0x12b0 }
            if (r0 == 0) goto L_0x11aa
            r0.A01(r7)     // Catch:{ all -> 0x12b0 }
            goto L_0x11aa
        L_0x1280:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x12b0 }
            java.lang.String r0 = "mAssetIdToInternalLoadRequestMap already has InternalLoadRequest for id: "
            r1.append(r0)     // Catch:{ all -> 0x12b0 }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0o(r7, r1)     // Catch:{ all -> 0x12b0 }
            goto L_0x11d9
        L_0x128f:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x12b0 }
            if (r0 != 0) goto L_0x12ae
            monitor-exit(r2)     // Catch:{ all -> 0x12b0 }
            boolean r0 = r6.A00()
            r2 = 1
            r0 = r0 ^ 1
            java.util.ArrayList r1 = X.C20123A8i.A03(r3, r4, r5, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x12aa
            X.C20123A8i.A03(r3, r4, r1, r2)
        L_0x12aa:
            X.C20123A8i.A05(r3)
            return
        L_0x12ae:
            monitor-exit(r2)     // Catch:{ all -> 0x12b0 }
            return
        L_0x12b0:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x12b0 }
            throw r1
        L_0x12b3:
            java.lang.Object r1 = r0.A00
            X.9kr r1 = (X.C190389kr) r1
            X.A8i r5 = r1.A00
            java.lang.Object r9 = r0.A01
            X.AEq r9 = (X.C20282AEq) r9
            java.lang.Object r8 = r0.A02
            java.io.File r8 = (java.io.File) r8
            X.9lh r6 = r1.A01
            X.1IX r0 = X.C20123A8i.A01(r5, r6)
            java.util.ArrayList r7 = X.AnonymousClass000.A14(r0)
            java.util.Iterator r4 = r0.iterator()
            r3 = 0
            r2 = 0
        L_0x12d1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x12ec
            java.lang.Object r1 = r4.next()
            X.9p5 r1 = (X.C192849p5) r1
            X.A4D r0 = r1.A07
            r7.add(r0)
            if (r2 != 0) goto L_0x12d1
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x12d1
            r2 = 1
            goto L_0x12d1
        L_0x12ec:
            X.AIf r2 = new X.AIf
            r2.<init>(r5, r9, r7)
            X.AId r1 = r5.A02
            X.A6K r0 = r9.A01
            java.io.File r0 = r1.CGf(r0, r2, r8)
            if (r0 == 0) goto L_0x12fc
            r3 = 1
        L_0x12fc:
            r7 = 0
            r4 = 0
            if (r3 != 0) goto L_0x1314
            X.9zw r1 = new X.9zw
            r1.<init>()
            X.9Is r0 = X.C179629Is.CACHE_PUT_FAILED
        L_0x1307:
            r1.A00 = r0
            X.9LV r0 = r1.A01()
            X.C20123A8i.A06(r5, r6, r4, r0, r7)
        L_0x1310:
            X.C20123A8i.A05(r5)
            return
        L_0x1314:
            java.lang.Object r8 = r5.A05
            monitor-enter(r8)
            X.1IX r9 = X.C20123A8i.A01(r5, r6)     // Catch:{ all -> 0x137b }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x137b }
        L_0x131f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x137b }
            if (r0 == 0) goto L_0x1333
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x137b }
            X.9p5 r0 = (X.C192849p5) r0     // Catch:{ all -> 0x137b }
            boolean r0 = r0.A00()     // Catch:{ all -> 0x137b }
            if (r0 != 0) goto L_0x131f
            r0 = 1
            goto L_0x1334
        L_0x1333:
            r0 = 0
        L_0x1334:
            r3 = 1
            if (r0 != 0) goto L_0x133c
            X.C20123A8i.A06(r5, r6, r4, r4, r3)     // Catch:{ all -> 0x137b }
            monitor-exit(r8)     // Catch:{ all -> 0x137b }
            goto L_0x1310
        L_0x133c:
            java.util.ArrayList r2 = X.AnonymousClass000.A14(r9)     // Catch:{ all -> 0x137b }
            java.util.Iterator r1 = r9.iterator()     // Catch:{ all -> 0x137b }
        L_0x1344:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x137b }
            if (r0 == 0) goto L_0x1356
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x137b }
            X.9p5 r0 = (X.C192849p5) r0     // Catch:{ all -> 0x137b }
            X.A4D r0 = r0.A07     // Catch:{ all -> 0x137b }
            r2.add(r0)     // Catch:{ all -> 0x137b }
            goto L_0x1344
        L_0x1356:
            monitor-exit(r8)     // Catch:{ all -> 0x137b }
            java.util.List r0 = java.util.Collections.singletonList(r6)
            X.0yx r0 = X.C20123A8i.A00(r5, r2, r0, r3)
            java.lang.Object r1 = r0.A00
            java.util.Map r1 = (java.util.Map) r1
            boolean r0 = r1.containsKey(r6)
            if (r0 != 0) goto L_0x1371
            X.9zw r1 = new X.9zw
            r1.<init>()
            X.9Is r0 = X.C179629Is.CACHE_GET_AFTER_PUT_FAILED
            goto L_0x1307
        L_0x1371:
            java.lang.Object r0 = r1.get(r6)
            X.9Ze r0 = (X.C183679Ze) r0
            X.C20123A8i.A06(r5, r6, r0, r4, r3)
            goto L_0x1310
        L_0x137b:
            r1 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x137b }
            throw r1
        L_0x137e:
            java.lang.Object r5 = r0.A00
            X.8Bo r5 = (X.AnonymousClass8Bo) r5
            java.lang.Object r2 = r0.A01
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Object r1 = r0.A02
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.String r3 = r1.getAction()
            java.lang.String r0 = "com.facebook.rti.fbns.intent.RECEIVE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x2217
            java.lang.String r0 = "auth_bundle"
            android.os.Bundle r4 = r1.getBundleExtra(r0)
            if (r4 != 0) goto L_0x13a4
            java.lang.String r0 = "FBNSPreloadAuthUtils/Invalid auth bundle"
        L_0x13a0:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x13a4:
            java.lang.String r3 = "auth_pending_intent"
            java.lang.Class<android.app.PendingIntent> r0 = android.app.PendingIntent.class
            java.lang.Object r0 = X.C24141Ja.A00(r4, r0, r3)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            if (r0 != 0) goto L_0x13b3
            java.lang.String r0 = "FBNSPreloadAuthUtils/Invalid auth intent"
            goto L_0x13a0
        L_0x13b3:
            java.lang.String r0 = r0.getCreatorPackage()
            boolean r0 = X.C25309CdE.A01(r2, r0)
            if (r0 == 0) goto L_0x2217
            java.lang.String r0 = "receive_type"
            java.lang.String r4 = r1.getStringExtra(r0)
            java.lang.String r0 = "message"
            boolean r0 = r0.equals(r4)
            java.lang.String r3 = "data"
            if (r0 == 0) goto L_0x14bf
            java.lang.String r4 = r1.getStringExtra(r3)
            com.whatsapp.push.WAFbnsPreloadReceiver r5 = (com.whatsapp.push.WAFbnsPreloadReceiver) r5
            X.00H r0 = r5.A01
            java.lang.Object r6 = r0.get()
            X.A6C r6 = (X.A6C) r6
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x1480
            org.json.JSONObject r5 = X.C17880vN.A16(r4)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r0 = "params"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "pim"
            org.json.JSONObject r5 = r5.optJSONObject(r3)     // Catch:{ JSONException -> 0x1473 }
            r7 = 0
            if (r5 == 0) goto L_0x1464
            java.lang.String r3 = "pjid"
            java.lang.String r25 = r5.optString(r3)     // Catch:{ JSONException -> 0x1473 }
        L_0x13fa:
            java.lang.String r3 = "id"
            java.lang.String r10 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "ip"
            java.lang.String r11 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "cl_sess"
            java.lang.String r12 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "mmsov"
            java.lang.String r13 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "fbips"
            java.lang.String r14 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "er_ri"
            java.lang.String r15 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r5 = "1"
            java.lang.String r3 = "notify"
            java.lang.String r3 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            boolean r28 = r5.equals(r3)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "push_id"
            java.lang.String r16 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "push_event_id"
            java.lang.String r17 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "push_ts"
            java.lang.String r18 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "pn"
            java.lang.String r19 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "registration_code"
            java.lang.String r20 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "enc_p"
            java.lang.String r21 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "enc_iv"
            java.lang.String r22 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "enc_c"
            java.lang.String r23 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            java.lang.String r3 = "enc_t"
            java.lang.String r24 = r0.optString(r3, r7)     // Catch:{ JSONException -> 0x1473 }
            r26 = 1
            monitor-enter(r6)     // Catch:{ JSONException -> 0x1473 }
            goto L_0x1467
        L_0x1464:
            r25 = r7
            goto L_0x13fa
        L_0x1467:
            r9 = r7
            r8 = r7
            r27 = r26
            r6.A03(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x1470 }
            monitor-exit(r6)     // Catch:{ JSONException -> 0x1473 }
            goto L_0x1480
        L_0x1470:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ JSONException -> 0x1473 }
            throw r0     // Catch:{ JSONException -> 0x1473 }
        L_0x1473:
            r5 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r0 = "WAFbnsPreloadReceiver/handleFbnsPush: invalid payload:"
            r3.append(r0)
            X.C108985cd.A1M(r4, r3, r5)
        L_0x1480:
            java.lang.String r0 = "extra_notification_sender"
            java.lang.String r5 = r1.getStringExtra(r0)
            java.lang.String r4 = "extra_notification_id"
            java.lang.String r1 = r1.getStringExtra(r4)
            if (r5 == 0) goto L_0x2217
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x2217
            if (r1 == 0) goto L_0x2217
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x2217
            java.lang.String r0 = "com.facebook.rti.intent.ACTION_NOTIFICATION_ACK"
            android.content.Intent r3 = X.C108945cZ.A0G(r0)
            r3.putExtra(r4, r1)
            java.lang.String r1 = "extra_processor_completed"
            r0 = 1
            r3.putExtra(r1, r0)
            java.util.List r0 = X.C24698CGk.A00
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x14e5
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "FBNSPreloadIPC/Unknown package "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r5, r1)
            goto L_0x13a0
        L_0x14bf:
            java.lang.String r0 = "registered"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x1552
            java.lang.String r9 = r1.getStringExtra(r3)
            com.whatsapp.push.WAFbnsPreloadReceiver r5 = (com.whatsapp.push.WAFbnsPreloadReceiver) r5
            X.1m8 r3 = r5.A00
            boolean r0 = r3.A01()
            if (r0 != 0) goto L_0x14db
            java.lang.String r0 = "FbnsTokenManager/onTokenRecevied fbns disabled for account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x14db:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x14f9
            java.lang.String r0 = "FbnsTokenManager/onTokenRecevied tokenFromFb is null"
            goto L_0x13a0
        L_0x14e5:
            r3.setPackage(r5)     // Catch:{ RuntimeException -> 0x14ef }
            X.C25309CdE.A00(r2, r3)     // Catch:{ RuntimeException -> 0x14ef }
            r2.sendBroadcast(r3)     // Catch:{ RuntimeException -> 0x14ef }
            return
        L_0x14ef:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.DeadObjectException
            if (r0 == 0) goto L_0x1d32
            return
        L_0x14f9:
            monitor-enter(r3)
            X.0z4 r4 = r3.A03     // Catch:{ all -> 0x154f }
            java.lang.String r2 = r4.A0e()     // Catch:{ all -> 0x154f }
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r4)     // Catch:{ all -> 0x154f }
            java.lang.String r1 = "last_server_fbns_token"
            r6 = 0
            java.lang.String r0 = r0.getString(r1, r6)     // Catch:{ all -> 0x154f }
            boolean r0 = r9.equals(r0)     // Catch:{ all -> 0x154f }
            if (r0 == 0) goto L_0x1536
            java.lang.String r0 = "FbnsTokenManager/onTokenReceived called with token that is already on the server side"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x154f }
        L_0x1516:
            boolean r0 = r9.equals(r2)     // Catch:{ all -> 0x154f }
            if (r0 == 0) goto L_0x1523
            java.lang.String r0 = "FbnsTokenManager/onTokenRecevied token already saved"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x154f }
        L_0x1521:
            monitor-exit(r3)     // Catch:{ all -> 0x154f }
            goto L_0x154e
        L_0x1523:
            r2 = 242478021(0xe73ebc5, float:3.0065581E-30)
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x154f }
            java.lang.String r0 = "fbns_token"
            android.content.SharedPreferences$Editor r1 = r1.putString(r0, r9)     // Catch:{ all -> 0x154f }
            java.lang.String r0 = "fbns_app_vers"
            X.C17880vN.A1C(r1, r0, r2)     // Catch:{ all -> 0x154f }
            goto L_0x1521
        L_0x1536:
            X.00H r0 = r3.A04     // Catch:{ all -> 0x154f }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x154f }
            X.9m7 r5 = (X.C191159m7) r5     // Catch:{ all -> 0x154f }
            java.lang.String r10 = "fbns"
            r8 = r6
            r11 = r6
            r7 = r6
            r5.A00(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x154f }
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r4)     // Catch:{ all -> 0x154f }
            X.C17880vN.A1E(r0, r1, r9)     // Catch:{ all -> 0x154f }
            goto L_0x1516
        L_0x154e:
            return
        L_0x154f:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x154f }
            throw r1
        L_0x1552:
            java.lang.String r0 = "unregistered"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x2217
            java.lang.String r0 = "reg_error"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x2217
            r1.getStringExtra(r3)
            return
        L_0x1566:
            java.lang.Object r3 = r0.A00
            X.CpE r3 = (X.C25946CpE) r3
            java.lang.Object r2 = r0.A02
            X.CSq r2 = (X.C24990CSq) r2
            java.lang.Object r9 = r0.A01
            X.CNG r9 = (X.CNG) r9
            r10 = 0
            X.ECs r0 = r2.A05     // Catch:{ IOException -> 0x1686, all -> 0x1684 }
            X.DDI r0 = (X.DDI) r0     // Catch:{ IOException -> 0x1686, all -> 0x1684 }
            X.Cbv r0 = r0.A07     // Catch:{ IOException -> 0x1686, all -> 0x1684 }
            android.net.Uri r1 = r0.A03     // Catch:{ IOException -> 0x1686, all -> 0x1684 }
            r0 = 5
            java.net.HttpURLConnection r19 = X.C25946CpE.A00(r1, r3, r0)     // Catch:{ IOException -> 0x1686, all -> 0x1684 }
            X.E7V r0 = r3.A01     // Catch:{ IOException -> 0x1682 }
            long r0 = r0.now()     // Catch:{ IOException -> 0x1682 }
            r2.A02 = r0     // Catch:{ IOException -> 0x1682 }
            if (r19 == 0) goto L_0x2217
            java.io.InputStream r10 = r19.getInputStream()     // Catch:{ IOException -> 0x1682 }
            boolean r0 = X.C26212Cuq.A04()     // Catch:{ IOException -> 0x1682 }
            if (r0 == 0) goto L_0x1599
            java.lang.String r0 = "NetworkFetcher->onResponse"
            X.C26212Cuq.A03(r0)     // Catch:{ IOException -> 0x1682 }
        L_0x1599:
            X.DDH r5 = r9.A01     // Catch:{ IOException -> 0x1682 }
            X.CSq r8 = r9.A00     // Catch:{ IOException -> 0x1682 }
            X.CVg r0 = r5.A01     // Catch:{ IOException -> 0x1682 }
            X.BSG r1 = r0.A01     // Catch:{ IOException -> 0x1682 }
            int[] r0 = r1.A00     // Catch:{ IOException -> 0x1682 }
            r4 = 0
            r0 = r0[r4]     // Catch:{ IOException -> 0x1682 }
            X.Bxi r7 = new X.Bxi     // Catch:{ IOException -> 0x1682 }
            r7.<init>(r1, r0)     // Catch:{ IOException -> 0x1682 }
            X.BSI r14 = r5.A00     // Catch:{ IOException -> 0x1682 }
            r0 = 16384(0x4000, float:2.2959E-41)
            java.lang.Object r6 = r14.get(r0)     // Catch:{ IOException -> 0x1682 }
            byte[] r6 = (byte[]) r6     // Catch:{ IOException -> 0x1682 }
        L_0x15b5:
            int r0 = r10.read(r6)     // Catch:{ all -> 0x167a }
            if (r0 < 0) goto L_0x1603
            if (r0 <= 0) goto L_0x15b5
            r7.write(r6, r4, r0)     // Catch:{ all -> 0x167a }
            X.ECs r12 = r8.A05     // Catch:{ all -> 0x167a }
            r11 = r12
            X.DDI r11 = (X.DDI) r11     // Catch:{ all -> 0x167a }
            X.CUW r0 = r11.A04     // Catch:{ all -> 0x167a }
            X.C9C r0 = r0.A0I     // Catch:{ all -> 0x167a }
            if (r0 == 0) goto L_0x15eb
            boolean r0 = r12.BfB()     // Catch:{ all -> 0x167a }
            if (r0 == 0) goto L_0x15eb
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x167a }
            long r0 = r8.A01     // Catch:{ all -> 0x167a }
            long r17 = r2 - r0
            r15 = 100
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 < 0) goto L_0x15eb
            r8.A01 = r2     // Catch:{ all -> 0x167a }
            X.E9w r0 = r11.A05     // Catch:{ all -> 0x167a }
            r0.C1n(r12)     // Catch:{ all -> 0x167a }
            X.CcD r0 = r8.A04     // Catch:{ all -> 0x167a }
            X.DDH.A00(r7, r0, r4)     // Catch:{ all -> 0x167a }
        L_0x15eb:
            int r0 = r7.A00     // Catch:{ all -> 0x167a }
            int r0 = -r0
            double r0 = (double) r0     // Catch:{ all -> 0x167a }
            r2 = 4677104761256804352(0x40e86a0000000000, double:50000.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.exp(r0)     // Catch:{ all -> 0x167a }
            float r2 = (float) r0     // Catch:{ all -> 0x167a }
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r2
            X.CcD r0 = r8.A04     // Catch:{ all -> 0x167a }
            r0.A05(r1)     // Catch:{ all -> 0x167a }
            goto L_0x15b5
        L_0x1603:
            X.CpE r0 = r5.A02     // Catch:{ all -> 0x167a }
            X.E7V r0 = r0.A01     // Catch:{ all -> 0x167a }
            long r0 = r0.now()     // Catch:{ all -> 0x167a }
            r8.A00 = r0     // Catch:{ all -> 0x167a }
            int r15 = r7.A00     // Catch:{ all -> 0x167a }
            X.ECs r5 = r8.A05     // Catch:{ all -> 0x167a }
            r13 = r5
            X.DDI r13 = (X.DDI) r13     // Catch:{ all -> 0x167a }
            X.E9w r12 = r13.A05     // Catch:{ all -> 0x167a }
            java.lang.String r11 = "NetworkFetchProducer"
            boolean r0 = r12.CFc(r5, r11)     // Catch:{ all -> 0x167a }
            if (r0 != 0) goto L_0x1620
            r4 = 0
            goto L_0x1659
        L_0x1620:
            r0 = 4
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x167a }
            r4.<init>(r0)     // Catch:{ all -> 0x167a }
            long r0 = r8.A02     // Catch:{ all -> 0x167a }
            long r2 = r8.A03     // Catch:{ all -> 0x167a }
            long r0 = r0 - r2
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x167a }
            java.lang.String r0 = "queue_time"
            r4.put(r0, r1)     // Catch:{ all -> 0x167a }
            long r2 = r8.A00     // Catch:{ all -> 0x167a }
            long r0 = r8.A02     // Catch:{ all -> 0x167a }
            long r2 = r2 - r0
            java.lang.String r1 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x167a }
            java.lang.String r0 = "fetch_time"
            r4.put(r0, r1)     // Catch:{ all -> 0x167a }
            long r2 = r8.A00     // Catch:{ all -> 0x167a }
            long r0 = r8.A03     // Catch:{ all -> 0x167a }
            long r2 = r2 - r0
            java.lang.String r1 = java.lang.Long.toString(r2)     // Catch:{ all -> 0x167a }
            java.lang.String r0 = "total_time"
            r4.put(r0, r1)     // Catch:{ all -> 0x167a }
            java.lang.String r1 = "image_size"
            java.lang.String r0 = java.lang.Integer.toString(r15)     // Catch:{ all -> 0x167a }
            r4.put(r1, r0)     // Catch:{ all -> 0x167a }
        L_0x1659:
            r12.C1q(r5, r11, r4)     // Catch:{ all -> 0x167a }
            r0 = 1
            r12.C9Q(r5, r11, r0)     // Catch:{ all -> 0x167a }
            java.lang.String r1 = "network"
            java.lang.String r0 = "default"
            r13.CD4(r1, r0)     // Catch:{ all -> 0x167a }
            r1 = 1
            X.CcD r0 = r8.A04     // Catch:{ all -> 0x167a }
            X.DDH.A00(r7, r0, r1)     // Catch:{ all -> 0x167a }
            r14.CEE(r6)     // Catch:{ IOException -> 0x1682 }
            r7.close()     // Catch:{ IOException -> 0x1682 }
            X.C26212Cuq.A00()     // Catch:{ IOException -> 0x1682 }
            r10.close()     // Catch:{ IOException -> 0x16af }
            goto L_0x16af
        L_0x167a:
            r0 = move-exception
            r14.CEE(r6)     // Catch:{ IOException -> 0x1682 }
            r7.close()     // Catch:{ IOException -> 0x1682 }
            throw r0     // Catch:{ IOException -> 0x1682 }
        L_0x1682:
            r6 = move-exception
            goto L_0x1689
        L_0x1684:
            r1 = move-exception
            throw r1
        L_0x1686:
            r6 = move-exception
            r19 = r10
        L_0x1689:
            X.CSq r5 = r9.A00     // Catch:{ all -> 0x16b3 }
            X.ECs r4 = r5.A05     // Catch:{ all -> 0x16b3 }
            r3 = r4
            X.DDI r3 = (X.DDI) r3     // Catch:{ all -> 0x16b3 }
            X.E9w r2 = r3.A05     // Catch:{ all -> 0x16b3 }
            r0 = 0
            java.lang.String r1 = "NetworkFetchProducer"
            r2.C1p(r4, r1, r6, r0)     // Catch:{ all -> 0x16b3 }
            r0 = 0
            r2.C9Q(r4, r1, r0)     // Catch:{ all -> 0x16b3 }
            java.lang.String r1 = "network"
            java.lang.String r0 = "default"
            r3.CD4(r1, r0)     // Catch:{ all -> 0x16b3 }
            X.CcD r0 = r5.A04     // Catch:{ all -> 0x16b3 }
            r0.A08(r6)     // Catch:{ all -> 0x16b3 }
            if (r10 == 0) goto L_0x16ad
            r10.close()     // Catch:{ IOException -> 0x16ad }
        L_0x16ad:
            if (r19 == 0) goto L_0x2217
        L_0x16af:
            r19.disconnect()
            return
        L_0x16b3:
            r1 = move-exception
            if (r10 == 0) goto L_0x16b9
            r10.close()     // Catch:{ IOException -> 0x16b9 }
        L_0x16b9:
            if (r19 == 0) goto L_0x1d32
            r19.disconnect()
            throw r1
        L_0x16bf:
            java.lang.Object r2 = r0.A00
            X.E4g r2 = (X.C28500E4g) r2
            java.lang.Object r1 = r0.A01
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r0 = r0.A02
            android.graphics.Point r0 = (android.graphics.Point) r0
            r2.Bun(r0, r1)
            return
        L_0x16cf:
            java.lang.Object r1 = r0.A00
            X.Cc8 r1 = (X.C25267Cc8) r1
            X.E4g r5 = r1.A02
            if (r5 == 0) goto L_0x2217
            java.lang.Object r4 = r0.A01
            float[] r4 = (float[]) r4
            java.lang.Object r3 = r0.A02
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 0
            if (r4 == 0) goto L_0x16ef
            r0 = 0
            r0 = r4[r0]
            int r1 = (int) r0
            r0 = 1
            r0 = r4[r0]
            int r0 = (int) r0
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>(r1, r0)
        L_0x16ef:
            r5.Bun(r2, r3)
            return
        L_0x16f3:
            java.lang.Object r4 = r0.A00
            X.CSS r4 = (X.CSS) r4
            java.lang.Object r2 = r0.A02
            X.9jh r2 = (X.C189719jh) r2
            X.CNO r8 = r4.A01     // Catch:{ C2L -> 0x18b5 }
            X.9Nr r0 = r4.A02     // Catch:{ C2L -> 0x18b5 }
            java.lang.String r3 = r0.A00()     // Catch:{ C2L -> 0x18b5 }
            java.lang.String r7 = "get_install_state"
            android.os.Bundle r6 = X.C17880vN.A0D()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r0 = "package_name"
            r6.putString(r0, r3)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            android.content.ContentResolver r5 = r8.A00     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            android.net.Uri r1 = X.C24673CEn.A00     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r0 = 0
            android.os.Bundle r7 = r5.call(r1, r7, r0, r6)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            if (r7 == 0) goto L_0x1886
            java.lang.String r0 = "exception"
            android.os.Bundle r1 = r7.getBundle(r0)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            if (r1 != 0) goto L_0x1877
            java.lang.String r0 = "state"
            java.lang.Object r0 = X.C24559C9f.A00(r7, r0)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            int r8 = r0.intValue()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r0 = 9
            java.lang.Integer[] r6 = X.AnonymousClass00R.A00(r0)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            int r5 = r6.length     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r1 = 0
        L_0x1735:
            if (r1 >= r5) goto L_0x1758
            r0 = r6[r1]     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            switch(r0) {
                case 1: goto L_0x1750;
                case 2: goto L_0x174e;
                case 3: goto L_0x174c;
                case 4: goto L_0x174a;
                case 5: goto L_0x1748;
                case 6: goto L_0x1746;
                case 7: goto L_0x1744;
                case 8: goto L_0x1741;
                default: goto L_0x1740;
            }     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
        L_0x1740:
            goto L_0x1752
        L_0x1741:
            r0 = 8
            goto L_0x1753
        L_0x1744:
            r0 = 7
            goto L_0x1753
        L_0x1746:
            r0 = 6
            goto L_0x1753
        L_0x1748:
            r0 = 5
            goto L_0x1753
        L_0x174a:
            r0 = 4
            goto L_0x1753
        L_0x174c:
            r0 = 3
            goto L_0x1753
        L_0x174e:
            r0 = 2
            goto L_0x1753
        L_0x1750:
            r0 = 1
            goto L_0x1753
        L_0x1752:
            r0 = 0
        L_0x1753:
            if (r8 == r0) goto L_0x1758
            int r1 = r1 + 1
            goto L_0x1735
        L_0x1758:
            java.lang.String r0 = "error_type"
            java.lang.Object r0 = X.C24559C9f.A00(r7, r0)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            int r8 = r0.intValue()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            X.Bzb[] r6 = X.C24340Bzb.values()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            int r5 = r6.length     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r1 = 0
        L_0x176a:
            if (r1 >= r5) goto L_0x1775
            r0 = r6[r1]     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            int r0 = r0.id     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            if (r8 == r0) goto L_0x1775
            int r1 = r1 + 1
            goto L_0x176a
        L_0x1775:
            java.lang.String r0 = "referrer_details"
            android.os.Bundle r6 = r7.getBundle(r0)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r0 = 0
            if (r6 != 0) goto L_0x17a1
            java.lang.String r6 = "appmanager_missing_referrer_details_bundle"
            java.lang.String r5 = "appmanager_unknown"
            X.CNP r11 = new X.CNP     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r11.<init>(r5, r6)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            X.CPe r10 = new X.CPe     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r12 = r0
            r14 = r0
            r10.<init>(r11, r12, r14)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
        L_0x178f:
            r5 = 0
            X.CKQ r9 = new X.CKQ     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r9.<init>(r10)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r8 = "downloaded_size_bytes"
            r7.getLong(r8, r0)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r8 = "total_download_size_bytes"
            r7.getLong(r8, r0)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            goto L_0x1811
        L_0x17a1:
            java.lang.String r5 = "referrer_click_timestamp_seconds"
            long r12 = r6.getLong(r5)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "install_begin_timestamp_seconds"
            r6.getLong(r5)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "first_install_time"
            long r14 = r6.getLong(r5)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "installed_version_code"
            r6.getInt(r5)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "installed_version_name"
            java.lang.String r10 = ""
            r6.getString(r5, r10)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "installation_method_type"
            r6.getString(r5, r10)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "installation_uuid"
            r6.getString(r5, r10)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "utm"
            android.os.Bundle r9 = r6.getBundle(r5)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            if (r9 != 0) goto L_0x17df
            java.lang.String r6 = "appmanager_missing_utm_bundle"
            java.lang.String r5 = "appmanager_unknown"
            X.CNP r11 = new X.CNP     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r11.<init>(r5, r6)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
        L_0x17d9:
            X.CPe r10 = new X.CPe     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r10.<init>(r11, r12, r14)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            goto L_0x178f
        L_0x17df:
            java.lang.String r5 = "utm_source"
            java.lang.String r11 = "appmanager_unknown"
            java.lang.String r8 = r9.getString(r5, r11)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "utm_medium"
            r9.getString(r5, r11)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "utm_campaign"
            java.lang.String r6 = r9.getString(r5, r11)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "utm_content"
            r9.getString(r5, r11)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "utm_term"
            r9.getString(r5, r11)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "utm_id"
            r9.getString(r5, r11)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "impression_id"
            r9.getString(r5, r10)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r5 = "custom_data"
            r9.getString(r5, r10)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            X.CNP r11 = new X.CNP     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r11.<init>(r8, r6)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            goto L_0x17d9
        L_0x1811:
            X.CPe r10 = r9.A00     // Catch:{ C2L -> 0x18b5 }
            long r7 = r10.A00     // Catch:{ C2L -> 0x18b5 }
            int r9 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x1871
            android.content.Context r0 = r4.A00     // Catch:{ C2L -> 0x18b5 }
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x182c }
            if (r1 == 0) goto L_0x182c
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r3, r0)     // Catch:{ NameNotFoundException -> 0x182c }
            if (r0 == 0) goto L_0x182c
            long r0 = r0.firstInstallTime     // Catch:{ C2L -> 0x18b5 }
            goto L_0x182e
        L_0x182c:
            r0 = 0
        L_0x182e:
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x1871
            long r7 = r10.A01     // Catch:{ C2L -> 0x18b5 }
            X.9c0 r0 = r2.A00     // Catch:{ C2L -> 0x18b5 }
            X.0z4 r9 = r0.A00     // Catch:{ C2L -> 0x18b5 }
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r9)     // Catch:{ C2L -> 0x18b5 }
            java.lang.String r1 = "referrer_clicked_time_for_app_manager"
            long r5 = r0.getLong(r1, r5)     // Catch:{ C2L -> 0x18b5 }
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x2217
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r9)     // Catch:{ C2L -> 0x18b5 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r1, r7)     // Catch:{ C2L -> 0x18b5 }
            r0.apply()     // Catch:{ C2L -> 0x18b5 }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()     // Catch:{ C2L -> 0x18b5 }
            X.CNP r1 = r10.A02     // Catch:{ C2L -> 0x18b5 }
            java.lang.String r0 = r1.A01     // Catch:{ C2L -> 0x18b5 }
            r3.append(r0)     // Catch:{ C2L -> 0x18b5 }
            r0 = 124(0x7c, float:1.74E-43)
            r3.append(r0)     // Catch:{ C2L -> 0x18b5 }
            java.lang.String r0 = r1.A00     // Catch:{ C2L -> 0x18b5 }
            java.lang.String r3 = X.AnonymousClass000.A0y(r0, r3)     // Catch:{ C2L -> 0x18b5 }
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r9)     // Catch:{ C2L -> 0x18b5 }
            java.lang.String r0 = "app_install_source_from_app_manager"
            X.C17880vN.A1E(r1, r0, r3)     // Catch:{ C2L -> 0x18b5 }
            return
        L_0x1871:
            java.lang.Integer r0 = X.AnonymousClass00R.A0u     // Catch:{ C2L -> 0x18b5 }
            r2.A00(r0)     // Catch:{ C2L -> 0x18b5 }
            return
        L_0x1877:
            X.C5w r0 = r8.A01     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            X.Cjz r0 = r0.A00(r1)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.Throwable r1 = r0.A01()     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            boolean r0 = r1 instanceof X.C2L     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            if (r0 == 0) goto L_0x1890
            throw r1     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
        L_0x1886:
            X.Bzb r1 = X.C24340Bzb.UNKNOWN     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            java.lang.String r0 = "api response is null"
            X.C2L r3 = new X.C2L     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r3.<init>((X.C24340Bzb) r1, (java.lang.String) r0)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            goto L_0x1897
        L_0x1890:
            X.Bzb r0 = X.C24340Bzb.UNKNOWN     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            X.C2L r3 = new X.C2L     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
            r3.<init>((X.C24340Bzb) r0, (java.lang.Throwable) r1)     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
        L_0x1897:
            throw r3     // Catch:{ IllegalArgumentException | UnsupportedOperationException -> 0x18a3, IllegalStateException -> 0x189a, C2L -> 0x1898, Exception -> 0x18ac }
        L_0x1898:
            r0 = move-exception
            throw r0     // Catch:{ C2L -> 0x18b5 }
        L_0x189a:
            r1 = move-exception
            X.Bzb r0 = X.C24340Bzb.UNKNOWN     // Catch:{ C2L -> 0x18b5 }
            X.C2L r3 = new X.C2L     // Catch:{ C2L -> 0x18b5 }
            r3.<init>((X.C24340Bzb) r0, (java.lang.Throwable) r1)     // Catch:{ C2L -> 0x18b5 }
            goto L_0x18b4
        L_0x18a3:
            r1 = move-exception
            X.Bzb r0 = X.C24340Bzb.INTERNAL_UNRECOVERABLE     // Catch:{ C2L -> 0x18b5 }
            X.C2L r3 = new X.C2L     // Catch:{ C2L -> 0x18b5 }
            r3.<init>((X.C24340Bzb) r0, (java.lang.Throwable) r1)     // Catch:{ C2L -> 0x18b5 }
            goto L_0x18b4
        L_0x18ac:
            r1 = move-exception
            X.Bzb r0 = X.C24340Bzb.UNKNOWN     // Catch:{ C2L -> 0x18b5 }
            X.C2L r3 = new X.C2L     // Catch:{ C2L -> 0x18b5 }
            r3.<init>((X.C24340Bzb) r0, (java.lang.Throwable) r1)     // Catch:{ C2L -> 0x18b5 }
        L_0x18b4:
            throw r3     // Catch:{ C2L -> 0x18b5 }
        L_0x18b5:
            r3 = move-exception
            X.9iX r1 = r4.A04
            java.lang.String r0 = "OxygenInstallSDK_UNEXPECTED_STATE_EXCEPTION"
            r1.A00(r0, r3)
            X.Bzb r0 = r3.mErrorType
            int r1 = r0.ordinal()
            r0 = 0
            if (r1 == r0) goto L_0x18d2
            r0 = 3
            if (r1 == r0) goto L_0x18cf
            java.lang.Integer r0 = X.AnonymousClass00R.A01
        L_0x18cb:
            r2.A00(r0)
            return
        L_0x18cf:
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x18cb
        L_0x18d2:
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            goto L_0x18cb
        L_0x18d5:
            java.lang.Object r7 = r0.A00
            X.DEn r7 = (X.C26805DEn) r7
            java.lang.Object r8 = r0.A01
            X.ClL r8 = (X.C25751ClL) r8
            java.lang.Object r0 = r0.A02
            r20 = r0
            r0 = r20
            android.os.Handler r0 = (android.os.Handler) r0
            r20 = r0
            r2 = 0
            r9 = 1
            X.C18070vi.A0e(r8, r9, r0)
            java.lang.ref.WeakReference r0 = r7.A0C
            r22 = r0
            java.lang.Object r6 = r22.get()
            X.E7h r6 = (X.C28556E7h) r6
            if (r6 == 0) goto L_0x2217
            X.D3k r5 = r7.A08
            java.lang.Integer r0 = r7.A03
            if (r0 == 0) goto L_0x1ba0
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x192c
            if (r0 != r9) goto L_0x1ba0
            java.lang.String r4 = r5.A0A
        L_0x1908:
            if (r4 == 0) goto L_0x1b99
            java.lang.Integer r1 = r7.A04
            java.lang.Integer r0 = X.AnonymousClass00R.A03
            if (r1 != r0) goto L_0x1929
            X.Bze r3 = X.C24343Bze.SC_V2_AUTO
        L_0x1912:
            java.lang.Integer r0 = r7.A03
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x1924
            if (r0 != r9) goto L_0x1b94
            java.util.Map r1 = r7.A0D
            X.BzT r0 = X.C24332BzT.ID_BACK
        L_0x1920:
            r1.put(r0, r3)
            goto L_0x192f
        L_0x1924:
            java.util.Map r1 = r7.A0D
            X.BzT r0 = X.C24332BzT.ID_FRONT
            goto L_0x1920
        L_0x1929:
            X.Bze r3 = X.C24343Bze.CAMERA_MANUAL
            goto L_0x1912
        L_0x192c:
            java.lang.String r4 = r5.A0B
            goto L_0x1908
        L_0x192f:
            android.graphics.BitmapFactory$Options r3 = new android.graphics.BitmapFactory$Options     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r3.<init>()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r3.inJustDecodeBounds = r9     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.CKO r0 = X.C25751ClL.A0X     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.Object r1 = r8.A01(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            byte[] r1 = (byte[]) r1     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            if (r1 == 0) goto L_0x2217
            int r0 = r1.length     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r21 = r0
            android.graphics.BitmapFactory.decodeByteArray(r1, r2, r0, r3)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.CKN r0 = X.C25751ClL.A0N     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.Object r12 = r8.A00(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0X(r12)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.graphics.Rect r12 = (android.graphics.Rect) r12     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r13 = r7.A01     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r0 = r6
            com.facebook.smartcapture.view.IdCaptureActivity r0 = (com.facebook.smartcapture.view.IdCaptureActivity) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            com.facebook.smartcapture.camera.CameraFragment r10 = r0.A02     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0b(r10)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.BHG r14 = r10.A01     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r19 = 0
            if (r14 == 0) goto L_0x1971
            X.EAk r10 = r14.A0Q     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            if (r10 == 0) goto L_0x1990
            int r11 = r10.getCameraFacing()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
        L_0x1969:
            X.EAk r10 = r14.A0Q     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            if (r10 == 0) goto L_0x1971
            int r19 = r10.BDs(r11, r13)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
        L_0x1971:
            int r15 = r12.width()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r14 = r12.height()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.widget.FrameLayout r10 = r0.A01     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0b(r10)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r13 = r10.getWidth()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.widget.FrameLayout r10 = r0.A01     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0b(r10)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r11 = r10.getHeight()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r10 = r3.outWidth     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r12 = r3.outHeight     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            goto L_0x1992
        L_0x1990:
            r11 = 0
            goto L_0x1969
        L_0x1992:
            boolean r18 = X.C108975cc.A1D(r12, r10)
            float r3 = X.C72463Mc.A00(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.BzI r0 = r7.A02     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            if (r0 != 0) goto L_0x19a0
            X.BzI r0 = r7.A07     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
        L_0x19a0:
            android.graphics.Rect r3 = X.C24570C9r.A00(r0, r3, r13, r11)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.graphics.Rect r15 = X.C25450Cg1.A00(r15, r14, r10, r12)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r10 = r15.width()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r15.height()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.graphics.Rect r11 = X.C25450Cg1.A00(r13, r11, r10, r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r17 = X.BE6.A02(r11)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r0 = (float) r13     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r17 = r17 / r0
            int r10 = r15.left     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r11.left     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r16 = r0
            int r10 = r10 + r0
            float r13 = (float) r10     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r3.left     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r10 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r10 = r10 * r17
            float r13 = r13 + r10
            int r13 = (int) r13     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r15.top     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r14 = r11.top     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r0 + r14
            float r11 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r3.top     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r3 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r3 = r3 * r17
            float r11 = r11 + r3
            int r11 = (int) r11     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r15.right     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r0 - r16
            float r0 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r0 = r0 - r10
            int r10 = (int) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r15.bottom     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r0 - r14
            float r0 = (float) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r0 = r0 - r3
            int r3 = (int) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            if (r18 == 0) goto L_0x19fb
            android.graphics.Rect r11 = A00(r10, r13, r3, r11)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
        L_0x19ea:
            int r0 = X.C25317CdN.A00(r1)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r10 = 90
            if (r0 > 0) goto L_0x1a13
            r0 = r19
            int r0 = 450 - r0
            int r3 = r0 % 360
            if (r18 == 0) goto L_0x1a0b
            goto L_0x1a03
        L_0x19fb:
            int r0 = r12 - r10
            int r12 = r12 - r13
            android.graphics.Rect r11 = A00(r3, r11, r12, r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            goto L_0x19ea
        L_0x1a03:
            if (r3 == r10) goto L_0x1a09
            r0 = 270(0x10e, float:3.78E-43)
            if (r3 != r0) goto L_0x1a12
        L_0x1a09:
            r10 = 0
            goto L_0x1a13
        L_0x1a0b:
            if (r3 == 0) goto L_0x1a13
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 != r0) goto L_0x1a12
            goto L_0x1a13
        L_0x1a12:
            r10 = r3
        L_0x1a13:
            r0 = r21
            android.graphics.BitmapRegionDecoder r1 = android.graphics.BitmapRegionDecoder.newInstance(r1, r2, r0, r9)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0X(r1)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r0 = 0
            android.graphics.Bitmap r3 = r1.decodeRegion(r11, r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0X(r3)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            if (r10 == 0) goto L_0x1a67
            android.graphics.Matrix r11 = X.C108945cZ.A0J()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r0 = (float) r10     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r11.postRotate(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.Runtime r10 = java.lang.Runtime.getRuntime()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r14 = r10.totalMemory()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r0 = r10.freeMemory()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r14 = r14 - r0
            long r12 = r10.maxMemory()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r12 = r12 - r14
            int r0 = r3.getAllocationByteCount()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r0 = (long) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r10 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x1a5f
            int r15 = r3.getWidth()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r16 = r3.getHeight()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r14 = r2
            r12 = r3
            r13 = r2
            r17 = r11
            r18 = r9
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            if (r3 != 0) goto L_0x1a67
            return
        L_0x1a5f:
            java.lang.String r0 = "Source bitmap null or not enough memory to allocate rotated bitmap"
            java.io.IOException r1 = X.C17880vN.A0f(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            goto L_0x1b80
        L_0x1a67:
            long r0 = r5.A01     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.io.FileOutputStream r10 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r10.<init>(r4)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x1b75 }
            r14 = 90
            r3.compress(r2, r14, r10)     // Catch:{ all -> 0x1b75 }
            r10.close()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r12 = r3.getWidth()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r11 = r3.getHeight()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.io.File r2 = X.C108945cZ.A17(r4)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r17 = r2.length()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r10 = 0
        L_0x1a89:
            r15 = 0
            int r2 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x1ac7
            int r2 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x1ac7
            int r10 = r10 + 1
            java.io.File r2 = X.C108945cZ.A17(r4)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r2.delete()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r2 = (float) r12     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r13 = 1064514355(0x3f733333, float:0.95)
            float r2 = r2 * r13
            int r12 = (int) r2     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r2 = (float) r11     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            float r2 = r2 * r13
            int r11 = (int) r2     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.graphics.Bitmap r15 = android.graphics.Bitmap.createScaledBitmap(r3, r12, r11, r9)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0X(r15)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r13.<init>(r4)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x1ac5 }
            r15.compress(r2, r14, r13)     // Catch:{ all -> 0x1ac5 }
            r13.close()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r15.recycle()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.io.File r2 = X.C108945cZ.A17(r4)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r17 = r2.length()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            goto L_0x1a89
        L_0x1ac5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x1b7c }
        L_0x1ac7:
            X.CYt r13 = r7.A09     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r0 = r13.A01     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            long r2 = r2 - r0
            float r1 = (float) r2     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r0
            X.CNU r3 = new X.CNU     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r3.<init>(r13, r1)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.String r1 = "resize_count"
            org.json.JSONObject r0 = r3.A00     // Catch:{ JSONException -> 0x1ae0, FileNotFoundException | IOException -> 0x1b81 }
            r0.put(r1, r10)     // Catch:{ JSONException -> 0x1ae0, FileNotFoundException | IOException -> 0x1b81 }
        L_0x1ae0:
            java.lang.String r1 = "width"
            org.json.JSONObject r0 = r3.A00     // Catch:{ JSONException -> 0x1ae7, FileNotFoundException | IOException -> 0x1b81 }
            r0.put(r1, r12)     // Catch:{ JSONException -> 0x1ae7, FileNotFoundException | IOException -> 0x1b81 }
        L_0x1ae7:
            java.lang.String r1 = "height"
            org.json.JSONObject r0 = r3.A00     // Catch:{ JSONException -> 0x1aee, FileNotFoundException | IOException -> 0x1b81 }
            r0.put(r1, r11)     // Catch:{ JSONException -> 0x1aee, FileNotFoundException | IOException -> 0x1b81 }
        L_0x1aee:
            java.lang.Long r2 = java.lang.Long.valueOf(r17)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.String r1 = "size"
            org.json.JSONObject r0 = r3.A00     // Catch:{ JSONException -> 0x1af9, FileNotFoundException | IOException -> 0x1b81 }
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x1af9, FileNotFoundException | IOException -> 0x1b81 }
        L_0x1af9:
            X.CYt r1 = r3.A01     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            org.json.JSONObject r0 = r3.A00     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r1.A00(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.CxM r10 = new X.CxM     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r10.<init>((java.lang.String) r4)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.CKN r0 = X.C25751ClL.A0M     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.Object r0 = r8.A00(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0X(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            android.graphics.Rect r0 = (android.graphics.Rect) r0     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r1 = r0.width()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r0 = r0.height()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            if (r1 <= r0) goto L_0x1b24
            r0 = 6
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.String r0 = "Orientation"
            r10.A0c(r0, r1)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
        L_0x1b24:
            java.lang.String r8 = "UserComment"
            java.lang.String r2 = r5.A0C     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.String r1 = ""
            if (r2 != 0) goto L_0x1b2d
            r2 = r1
        L_0x1b2d:
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x1b67, FileNotFoundException | IOException -> 0x1b81 }
            byte[] r0 = X.C108975cc.A1O(r2)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r1.update(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.StringBuilder r11 = X.AnonymousClass000.A10()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            byte[] r5 = r1.digest()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r4 = r5.length     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r3 = 0
            r2 = 0
        L_0x1b45:
            if (r2 >= r4) goto L_0x1b63
            byte r0 = r5[r2]     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.Object[] r1 = new java.lang.Object[r9]     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            X.C17880vN.A1T(r1, r0, r3)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r9)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            java.lang.String r0 = "%02x"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            X.C18070vi.A0X(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r11.append(r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            int r2 = r2 + 1
            goto L_0x1b45
        L_0x1b63:
            java.lang.String r1 = X.C18070vi.A0H(r11)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
        L_0x1b67:
            r10.A0c(r8, r1)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r10.A0b()     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            r1 = 20
            r0 = r20
            X.C27076DTa.A00(r0, r6, r7, r1)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            return
        L_0x1b75:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x1b77 }
        L_0x1b77:
            r1 = move-exception
            X.CDX.A00(r10, r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
            goto L_0x1b80
        L_0x1b7c:
            r1 = move-exception
            X.CDX.A00(r13, r0)     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
        L_0x1b80:
            throw r1     // Catch:{ FileNotFoundException | IOException -> 0x1b81 }
        L_0x1b81:
            java.lang.Object r1 = r22.get()
            X.E7h r1 = (X.C28556E7h) r1
            if (r1 == 0) goto L_0x2217
            com.facebook.smartcapture.view.IdCaptureActivity r1 = (com.facebook.smartcapture.view.IdCaptureActivity) r1
            X.7RP r0 = new X.7RP
            r0.<init>((com.facebook.smartcapture.view.IdCaptureActivity) r1)
            r1.runOnUiThread(r0)
            return
        L_0x1b94:
            X.3EW r1 = X.AnonymousClass3MW.A14()
            throw r1
        L_0x1b99:
            java.lang.String r0 = "Required path not passed to IdCaptureConfig"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        L_0x1ba0:
            java.lang.String r0 = "Unsupported CaptureStage"
            java.lang.UnsupportedOperationException r0 = X.BE6.A0v(r0)
            throw r0
        L_0x1ba7:
            java.lang.Object r1 = r0.A00
            X.ClF r1 = (X.C25745ClF) r1
            java.lang.Object r3 = r0.A01
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            java.lang.Object r2 = r0.A02
            java.util.concurrent.CountDownLatch r2 = (java.util.concurrent.CountDownLatch) r2
            X.CZB r0 = r1.A03     // Catch:{ all -> 0x1bc9 }
            if (r0 == 0) goto L_0x1bc5
            int r0 = r0.A00     // Catch:{ all -> 0x1bc9 }
            r1 = 3553(0xde1, float:4.979E-42)
            android.opengl.GLES20.glBindTexture(r1, r0)     // Catch:{ all -> 0x1bc9 }
            r0 = 0
            android.opengl.GLUtils.texImage2D(r1, r0, r3, r0)     // Catch:{ all -> 0x1bc9 }
            android.opengl.GLES20.glFlush()     // Catch:{ all -> 0x1bc9 }
        L_0x1bc5:
            r2.countDown()
            return
        L_0x1bc9:
            r1 = move-exception
            r2.countDown()
            throw r1
        L_0x1bce:
            java.lang.Object r5 = r0.A02
            java.util.Map r5 = (java.util.Map) r5
            java.util.Iterator r11 = X.AnonymousClass000.A15(r5)
        L_0x1bd6:
            boolean r1 = r11.hasNext()
            r3 = 1
            r10 = 0
            if (r1 == 0) goto L_0x1c70
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r11)
            java.lang.Object r8 = r1.getKey()
            java.lang.Number r8 = (java.lang.Number) r8
            int r4 = r8.intValue()
            java.lang.Object r7 = X.C26159CtX.A00(r8, r5)
            X.DDp r7 = (X.C26783DDp) r7
            X.ClF r1 = r7.A08
            X.CRD r1 = r1.A02
            int r1 = r1.A03
            int r9 = -r1
            float[] r12 = r7.A0D
            android.opengl.Matrix.setIdentityM(r12, r10)
            r1 = 1056964608(0x3f000000, float:0.5)
            r6 = 0
            android.opengl.Matrix.translateM(r12, r10, r1, r1, r6)
            int r1 = -r9
            float r1 = (float) r1
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r16 = r6
            r13 = r10
            r14 = r1
            r15 = r6
            r17 = r2
            android.opengl.Matrix.rotateM(r12, r13, r14, r15, r16, r17)
            r1 = 1065353216(0x3f800000, float:1.0)
            android.opengl.Matrix.scaleM(r12, r10, r1, r2, r1)
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            android.opengl.Matrix.translateM(r12, r10, r1, r1, r6)
            r7.A02 = r9
            r7.A05 = r3
            r14 = 0
            r7.A04 = r14
            java.lang.Object r1 = r0.A01
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x1c3c
            java.lang.Object r2 = X.C26159CtX.A00(r8, r1)
            X.E8l r2 = (X.E8l) r2
            java.lang.Object r1 = r0.A00
            X.DHE r1 = (X.DHE) r1
            X.EAJ r1 = r1.A01
            X.C26159CtX.A01(r1)
            r7.BCi(r1)
            r7 = r2
        L_0x1c3c:
            java.lang.Object r6 = r0.A00
            X.DHE r6 = (X.DHE) r6
            X.CjS r13 = r6.A0E
            boolean r1 = r6.A06
            X.DDm r12 = new X.DDm
            r15 = r7
            r16 = r3
            r17 = r1
            r12.<init>(r13, r14, r15, r16, r17)
            int r2 = r7.BT4()
            r1 = 6
            if (r2 == r1) goto L_0x1c58
            r1 = 7
            if (r2 != r1) goto L_0x1c65
        L_0x1c58:
            X.CZT r2 = r6.A0H
            boolean r1 = r2 instanceof X.BWA
            if (r1 != 0) goto L_0x1c62
            boolean r1 = r2 instanceof X.BWB
            if (r1 == 0) goto L_0x1c65
        L_0x1c62:
            r1 = 3
            r12.A00 = r1
        L_0x1c65:
            X.EDC r1 = r6.A0D
            X.Cmv r1 = X.DDR.A08(r1)
            r1.A04(r12, r4)
            goto L_0x1bd6
        L_0x1c70:
            java.lang.Object r1 = X.AnonymousClass000.A0w(r5, r10)
            X.C26159CtX.A01(r1)
            X.DDp r1 = (X.C26783DDp) r1
            X.ClF r1 = r1.A08
            X.CRD r1 = r1.A02
            int r15 = r1.A01
            int r2 = r1.A02
            int r1 = r1.A03
            int r1 = r1 % 180
            boolean r1 = X.AnonymousClass000.A1O(r1)
            java.lang.Object r12 = r0.A00
            X.DHE r12 = (X.DHE) r12
            X.ClM r11 = r12.A0F
            int r0 = r11.A09
            int r0 = r0 % 180
            if (r0 != 0) goto L_0x1c96
            r3 = 0
        L_0x1c96:
            r27 = r2
            if (r1 == 0) goto L_0x1c9d
            r27 = r15
            r15 = r2
        L_0x1c9d:
            if (r3 == 0) goto L_0x1cf1
            int r14 = r11.A08
            int r9 = r11.A0A
        L_0x1ca3:
            X.CjS r8 = r12.A0E
            android.content.Context r7 = r12.A0B
            X.CrM r0 = r12.A0V
            X.EDC r6 = r12.A0D
            X.BUX r22 = new X.BUX
            r22.<init>()
            X.BzJ r2 = X.C24322BzJ.VIDEO
            java.util.HashMap r1 = r0.A00
            java.lang.Object r0 = r1.get(r2)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x1d7f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x1d7f
            X.DDu r5 = new X.DDu
            r5.<init>(r8)
            java.lang.Object r0 = r1.get(r2)
            if (r0 == 0) goto L_0x1d7f
            java.lang.Object r1 = r1.get(r2)
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            java.util.Iterator r4 = r1.iterator()
        L_0x1cdb:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x1d04
            java.lang.Object r3 = r4.next()
            X.C6M r3 = (X.C6M) r3
            com.facebook.videolite.transcoder.base.composition.MediaEffect r2 = r3.A01
            boolean r1 = r2 instanceof X.BW6
            if (r1 == 0) goto L_0x1cf6
            r0.add(r3)
            goto L_0x1cdb
        L_0x1cf1:
            int r14 = r11.A0A
            int r9 = r11.A08
            goto L_0x1ca3
        L_0x1cf6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "unsupported media effect received by composite media graph wrapper: "
            X.BE9.A1G(r2, r0, r1)
            java.lang.RuntimeException r1 = X.BE8.A0f(r1)
            throw r1
        L_0x1d04:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x1d84
            r1 = r6
            X.BPv r1 = (X.C22807BPv) r1
            android.os.Handler r4 = r1.A01
            r3 = 1
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r0.iterator()
        L_0x1d18:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x1d37
            java.lang.Object r1 = r13.next()
            X.C6M r1 = (X.C6M) r1
            com.facebook.videolite.transcoder.base.composition.MediaEffect r1 = r1.A01
            X.BW6 r1 = (X.BW6) r1
            X.E9y r1 = r1.A00
            if (r1 != 0) goto L_0x1d33
            java.lang.String r0 = "glRenderer"
            X.C18070vi.A11(r0)
            r1 = 0
        L_0x1d32:
            throw r1
        L_0x1d33:
            r2.add(r1)
            goto L_0x1d18
        L_0x1d37:
            X.BUa r13 = new X.BUa
            r13.<init>()
            X.C18070vi.A0d(r7, r3)
            X.DAl r1 = new X.DAl
            r1.<init>(r5, r0)
            X.CjS r21 = new X.CjS
            r21.<init>()
            if (r4 != 0) goto L_0x1d54
            java.lang.String r0 = "Lite-SurfacePipe-Thread"
            android.os.Handler r4 = r13.BSH(r0)
            X.C18070vi.A0X(r4)
        L_0x1d54:
            java.lang.String r0 = "Lite-CPU-Frames-Thread"
            android.os.Handler r19 = r13.BSH(r0)
            X.C18070vi.A0X(r19)
            X.DDv r0 = new X.DDv
            r26 = r10
            r23 = r10
            r24 = r10
            r25 = r3
            r20 = r1
            r18 = r4
            r17 = r7
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.A00 = r3
            X.DDr r1 = r0.A0L
            r1.A00 = r3
            r0.A06 = r2
            r5.A00 = r0
            goto L_0x1d84
        L_0x1d7f:
            X.DDt r5 = new X.DDt
            r5.<init>(r8)
        L_0x1d84:
            r3 = r6
            X.BPv r3 = (X.C22807BPv) r3
            android.os.Handler r2 = r3.A01
            android.os.Looper r1 = r2.getLooper()
            android.os.Looper r0 = android.os.Looper.myLooper()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x1e15
            r0 = 2
            X.C27076DTa.A00(r2, r5, r3, r0)
        L_0x1d9b:
            X.Cyc r0 = r3.A06
            X.EDG r2 = r0.A00
            boolean r0 = r2 instanceof X.C26787DDu
            if (r0 == 0) goto L_0x1dae
            X.DDu r2 = (X.C26787DDu) r2
            X.CKy r1 = new X.CKy
            r1.<init>(r12)
            X.CNg r0 = r2.A05
            r0.A00 = r1
        L_0x1dae:
            r26 = r6
            r28 = r15
            r29 = r14
            r30 = r9
            r31 = r10
            r26.CRF(r27, r28, r29, r30, r31)
            X.Cyb r0 = r3.A07
            X.Cmv r0 = r0.A00
            X.C18070vi.A0X(r0)
            android.graphics.RectF r3 = r11.A0C
            X.Cjt r1 = r0.A07
            X.Cr9 r0 = r0.A05
            X.DDn r2 = X.C25663Cjt.A00(r0, r1, r10)
            float r0 = r3.top
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x1e0f
            float r0 = r3.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x1e0f
            float r0 = r3.right
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x1e0f
            float r0 = r3.bottom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x1e0f
            r0 = 0
        L_0x1de8:
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            int r0 = r11.A0A
            X.BE8.A1C(r1, r0)
            int r0 = r11.A08
            r1.append(r0)
            X.BE6.A1K(r1)
            java.lang.String r0 = "rotation:"
            r1.append(r0)
            int r0 = r11.A09
            r1.append(r0)
            X.CV8 r3 = r8.A00
            java.lang.String r2 = "ARFrameLiteRenderer.outputMetadata"
            java.lang.String r1 = r1.toString()
            monitor-enter(r3)
            goto L_0x1e1b
        L_0x1e0f:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r3)
            goto L_0x1de8
        L_0x1e15:
            X.Cyc r0 = r3.A06
            r0.A01(r5)
            goto L_0x1d9b
        L_0x1e1b:
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x1e22 }
            r0.put(r2, r1)     // Catch:{ all -> 0x1e22 }
            monitor-exit(r3)
            return
        L_0x1e22:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        L_0x1e25:
            java.lang.Object r1 = r0.A00
            X.CVH r1 = (X.CVH) r1
            X.Cyg r10 = r1.A00
            java.lang.Object r1 = r0.A01
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r3 = r0.A02
            int r2 = r1.intValue()
            r1 = 1
            r0 = 0
            if (r2 == r0) goto L_0x1e4e
            if (r2 == r1) goto L_0x1e45
            r0 = 2
            if (r2 != r0) goto L_0x2217
            int r0 = r10.A02
            int r0 = r0 + 1
            r10.A02 = r0
            return
        L_0x1e45:
            X.C199610h.A04(r3)
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            X.C26380Cyg.A0C(r10, r3)
            return
        L_0x1e4e:
            X.C199610h.A04(r3)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r0]
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            long r4 = X.BE8.A0I(r3, r1)
            r13 = 0
            if (r0 == 0) goto L_0x1e78
            boolean r0 = r10.A0R
            if (r0 == 0) goto L_0x1e78
            r10.A0R = r13
            X.Coy r8 = r10.A0b
            java.util.HashMap r3 = X.C26380Cyg.A00(r10)
            long r6 = r10.A0A
            long r1 = r4 - r6
            java.lang.String r0 = "first_frame_render_time_ms"
            X.BE7.A1I(r0, r3, r1)
            X.C25933Coy.A00(r8, r3)
        L_0x1e78:
            long r1 = r10.A06
            r6 = 0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x1e84
            long r1 = r10.A0A
            r10.A06 = r1
        L_0x1e84:
            r14 = 1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x1ec3
            long r11 = r4 - r1
            r1 = 35
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x1ec1
            long r8 = r10.A09
            long r8 = r8 + r11
            r10.A09 = r8
            long r6 = r10.A0B
            long r6 = r6 + r14
            r10.A0B = r6
            java.lang.Object[] r1 = X.BE6.A1a()
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            r1[r13] = r3
            X.C17890vO.A1M(r1, r8)
            X.C17890vO.A1N(r1, r6)
            X.BE8.A1P(r1, r13)
            java.lang.String r0 = "doFrameRendered: adding delta=%s, mOverallStuckTimeMs=%s, mStuckFramesCount=%s, mEnableDeltaStuckTime=%s"
            X.C26380Cyg.A0A(r10, r0, r1)
            java.util.List r2 = r10.A0O
            int r1 = r2.size()
            r0 = 500(0x1f4, float:7.0E-43)
            if (r1 >= r0) goto L_0x1ec1
            r2.add(r3)
        L_0x1ec1:
            r10.A06 = r4
        L_0x1ec3:
            long r0 = r10.A08
            long r0 = r0 + r14
            r10.A08 = r0
            return
        L_0x1ec9:
            java.lang.Object r3 = r0.A02
            X.CtE r3 = (X.C26149CtE) r3
            java.lang.Object r2 = r0.A00
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1 = 0
            X.C26149CtE.A00(r3, r2, r1)
            java.lang.Object r1 = r0.A01
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            X.CRX r0 = r3.A08
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A02
            int r0 = r0.get()
            boolean r0 = X.AnonymousClass000.A1R(r0)
            r0 = r0 ^ 1
            X.C26149CtE.A00(r3, r1, r0)
            X.Cax r0 = r3.A07
            r0.A02(r2)
            r0.A02(r1)
            return
        L_0x1ef3:
            java.lang.Object r4 = r0.A02
            X.Cyp r4 = (X.C26389Cyp) r4
            r3 = 0
            r1 = 0
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ RemoteException -> 0x1f17 }
            java.lang.String r0 = r4.A01     // Catch:{ RemoteException -> 0x1f17 }
            r2.writeInterfaceToken(r0)     // Catch:{ RemoteException -> 0x1f17 }
            r2.writeInt(r1)     // Catch:{ RemoteException -> 0x1f17 }
            r2.writeByteArray(r3)     // Catch:{ RemoteException -> 0x1f17 }
            android.os.IBinder r1 = r4.A00     // Catch:{ all -> 0x1f12 }
            r0 = 1
            r1.transact(r0, r2, r3, r0)     // Catch:{ all -> 0x1f12 }
            r2.recycle()     // Catch:{ RemoteException -> 0x1f17 }
            return
        L_0x1f12:
            r0 = move-exception
            r2.recycle()     // Catch:{ RemoteException -> 0x1f17 }
            throw r0     // Catch:{ RemoteException -> 0x1f17 }
        L_0x1f17:
            r2 = move-exception
            java.lang.String r1 = "WearableLS"
            java.lang.String r0 = "Failed to send a response back"
            android.util.Log.e(r1, r0, r2)
            return
        L_0x1f20:
            java.lang.Object r4 = r0.A00
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L_0x2217
            java.lang.Object r3 = r0.A02
            X.BiR r3 = (X.C23511BiR) r3
            android.widget.OverScroller r1 = r3.A01
            if (r1 == 0) goto L_0x2217
            boolean r1 = r1.computeScrollOffset()
            java.lang.Object r2 = r0.A01
            androidx.coordinatorlayout.widget.CoordinatorLayout r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r2
            if (r1 == 0) goto L_0x1f45
            android.widget.OverScroller r1 = r3.A01
            int r1 = r1.getCurrY()
            r3.A0S(r4, r2, r1)
            r4.postOnAnimation(r0)
            return
        L_0x1f45:
            com.google.android.material.appbar.AppBarLayout$BaseBehavior r3 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r3
            com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
            com.google.android.material.appbar.AppBarLayout.BaseBehavior.A02(r2, r3, r4)
            boolean r0 = r4.A09
            if (r0 == 0) goto L_0x2217
            android.view.View r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.A00(r2)
            boolean r0 = r4.A04(r0)
            r4.A05(r0)
            return
        L_0x1f5c:
            java.lang.Object r1 = r0.A00
            X.0x8 r1 = (X.C18770x8) r1
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            java.util.concurrent.ExecutorService r2 = r1.A00
            r1 = 10
            goto L_0x1f82
        L_0x1f69:
            java.lang.Object r1 = r0.A00
            X.0x8 r1 = (X.C18770x8) r1
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            java.util.concurrent.ExecutorService r2 = r1.A00
            r1 = 13
            goto L_0x1f82
        L_0x1f76:
            java.lang.Object r1 = r0.A00
            X.0x8 r1 = (X.C18770x8) r1
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            java.util.concurrent.ExecutorService r2 = r1.A00
            r1 = 11
        L_0x1f82:
            X.3Cf r0 = new X.3Cf
            r0.<init>(r4, r3, r1)
            r2.execute(r0)
            return
        L_0x1f8b:
            java.lang.Object r3 = r0.A00
            X.BEe r3 = (X.C22580BEe) r3
            java.lang.Object r1 = r0.A01
            android.content.Intent r1 = (android.content.Intent) r1
            java.lang.Object r2 = r0.A02
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            r0 = 0
            r3.A01(r1)     // Catch:{ all -> 0x1f9f }
            r2.setResult(r0)
            return
        L_0x1f9f:
            r1 = move-exception
            r2.setResult(r0)
            throw r1
        L_0x1fa4:
            java.lang.Object r3 = r0.A00
            X.DNk r3 = (X.C26962DNk) r3
            java.lang.Object r2 = r0.A02
            X.Bno r2 = (X.C23681Bno) r2
            java.lang.String r0 = "Tree operations are only supported from the UI Thread"
            X.C26176Ctu.A02(r0)
            java.lang.String r1 = r2.A01
            java.lang.Object r0 = r2.A00
            java.util.Map r1 = X.C108975cc.A0h(r1, r0)
            X.CrK r0 = r3.A04
            X.CrK r0 = r0.A07(r1)
            r3.A04 = r0
            java.util.Map r0 = r3.A08
            r0.putAll(r1)
            return
        L_0x1fc7:
            java.lang.Object r4 = r0.A02
            X.CkG r4 = (X.C25685CkG) r4
            java.util.UUID r1 = X.C25685CkG.A07     // Catch:{ all -> 0x1fd8 }
            android.bluetooth.BluetoothManager r3 = r4.A01     // Catch:{ all -> 0x1fd8 }
            android.content.Context r2 = r4.A02     // Catch:{ all -> 0x1fd8 }
            X.BEg r1 = r4.A03     // Catch:{ all -> 0x1fd8 }
            android.bluetooth.BluetoothGattServer r3 = r3.openGattServer(r2, r1)     // Catch:{ all -> 0x1fd8 }
            goto L_0x1fdd
        L_0x1fd8:
            r1 = move-exception
            X.1IU r3 = X.C108945cZ.A1J(r1)
        L_0x1fdd:
            java.lang.Object r2 = r0.A01
            X.1Di r2 = (X.C22821Di) r2
            java.lang.Object r1 = r0.A00
            X.1OS r1 = (X.AnonymousClass1OS) r1
            java.lang.Throwable r0 = X.C30671eK.A00(r3)
            if (r0 != 0) goto L_0x1ff3
            android.bluetooth.BluetoothGattServer r3 = (android.bluetooth.BluetoothGattServer) r3
            r4.A00 = r3
            r2.invoke(r4)
            return
        L_0x1ff3:
            r1.invoke(r4, r0)
            return
        L_0x1ff7:
            java.lang.Object r1 = r0.A00
            X.1fR r1 = (X.C31361fR) r1
            java.lang.Object r9 = r0.A01
            X.1E2 r9 = (X.AnonymousClass1E2) r9
            java.lang.Object r8 = r0.A02
            X.1E2 r8 = (X.AnonymousClass1E2) r8
            X.1RL r7 = r1.A04
            monitor-enter(r7)
            X.1DL r0 = r7.A02     // Catch:{ all -> 0x2038 }
            long r5 = r0.A09(r9)     // Catch:{ all -> 0x2038 }
            long r3 = r0.A09(r8)     // Catch:{ all -> 0x2038 }
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x2036
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x2036
            java.lang.Boolean r0 = r7.A06(r9)     // Catch:{ all -> 0x2038 }
            if (r0 == 0) goto L_0x2027
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x2038 }
            X.AnonymousClass1RL.A04(r7, r8, r3, r0)     // Catch:{ all -> 0x2038 }
        L_0x2027:
            long r1 = X.AnonymousClass1RL.A00(r7, r9)     // Catch:{ all -> 0x2038 }
            X.00H r0 = r7.A05     // Catch:{ all -> 0x2038 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x2038 }
            X.2nB r0 = (X.C59972nB) r0     // Catch:{ all -> 0x2038 }
            r0.A03(r3, r1)     // Catch:{ all -> 0x2038 }
        L_0x2036:
            monitor-exit(r7)
            return
        L_0x2038:
            r1 = move-exception
            monitor-exit(r7)
            throw r1
        L_0x203b:
            java.lang.Object r1 = r0.A00
            com.whatsapp.Conversation r1 = (com.whatsapp.Conversation) r1
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            X.1CJ r0 = r1.A06
            r0.A0J()
            java.lang.String r0 = "Conversation/keepSplashscreen/chatsCache now ready"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1KB r2 = r1.A05
            r1 = 22
            X.3Cf r0 = new X.3Cf
            r0.<init>(r4, r3, r1)
            r2.A0J(r0)
            return
        L_0x205a:
            java.lang.Object r1 = r0.A00
            X.4eN r1 = (X.C90624eN) r1
            java.lang.Object r5 = r0.A02
            X.0vc r5 = (X.C18010vc) r5
            java.lang.Object r0 = r1.A01
            X.4gJ r0 = (X.C91824gJ) r0
            X.4aN r11 = r0.A01
            X.3NS r0 = X.AnonymousClass4aN.A0W
            X.4Xi[] r4 = r11.A0P
            int r0 = r11.A00
            r0 = r4[r0]
            int r3 = r0.A00()
            r2 = 0
            r1 = 0
        L_0x2076:
            if (r1 >= r3) goto L_0x2217
            int r0 = r11.A00
            r0 = r4[r0]
            int[] r6 = r0.A01(r5, r1)
            X.5z5 r0 = new X.5z5
            r0.<init>(r6)
            long r13 = X.C43291zZ.A00(r0, r2)
            r7 = 0
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x20cb
            int r0 = r11.A00
            r0 = r4[r0]
            int[] r10 = r0.A01(r5, r1)
            java.lang.StringBuilder r8 = X.AnonymousClass000.A10()
            int r9 = r10.length
            r7 = 0
        L_0x209d:
            if (r7 >= r9) goto L_0x20ac
            r0 = r10[r7]
            X.BE7.A10(r0, r8)
            r0 = 32
            r8.append(r0)
            int r7 = r7 + 1
            goto L_0x209d
        L_0x20ac:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A10()
            java.lang.String r0 = "bad emoji on page "
            r7.append(r0)
            int r0 = r11.A00
            r7.append(r0)
            java.lang.String r0 = " index "
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = ": "
            java.lang.String r0 = X.AnonymousClass001.A1E(r8, r0, r7)
            X.C17960vV.A0F(r2, r0)
        L_0x20cb:
            android.graphics.drawable.Drawable r0 = X.AnonymousClass4aN.A00(r13)
            if (r0 != 0) goto L_0x20e5
            X.5z5 r12 = new X.5z5
            r12.<init>(r6)
            r10 = 0
            X.4Nf r9 = new X.4Nf
            r9.<init>(r10, r11, r12, r13)
            X.3NS r0 = X.AnonymousClass4aN.A0W
            android.os.Message r0 = android.os.Message.obtain(r0, r2, r2, r2, r9)
            r0.sendToTarget()
        L_0x20e5:
            int r1 = r1 + 1
            goto L_0x2076
        L_0x20e8:
            java.lang.Object r3 = r0.A00
            X.1F9 r3 = (X.AnonymousClass1F9) r3
            java.lang.Object r2 = r0.A01
            X.1Fx r2 = (X.C23401Fx) r2
            java.lang.Object r1 = r0.A02
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            X.1Fv r0 = r3.getLifecycle()
            X.1Fw r0 = (X.C23391Fw) r0
            X.1Fx r0 = r0.A02
            boolean r0 = r0.A00(r2)
            if (r0 == 0) goto L_0x2217
            r1.run()
            return
        L_0x2106:
            java.lang.Object r3 = r0.A00
            X.30i r3 = (X.C676530i) r3
            java.lang.Object r5 = r0.A01
            X.206 r5 = (X.AnonymousClass206) r5
            java.lang.Object r4 = r0.A02
            X.1BI r4 = (X.AnonymousClass1BI) r4
            X.1BI r1 = r5.A0H()
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r1)
            com.whatsapp.jid.UserJid r0 = r5.A0I()
            boolean r0 = X.C42701yb.A01(r0)
            if (r0 == 0) goto L_0x2131
            X.205 r0 = r5.A0v
            X.1BI r0 = r0.A00
            boolean r0 = X.C42701yb.A01(r0)
            r1 = 1
            if (r0 == 0) goto L_0x2132
        L_0x2131:
            r1 = 0
        L_0x2132:
            boolean r0 = X.C22971Dz.A0e(r4)
            if (r0 != 0) goto L_0x2156
            boolean r0 = X.C22971Dz.A0a(r4)
            if (r0 != 0) goto L_0x2156
            if (r1 != 0) goto L_0x2156
            X.1M9 r3 = r3.A03
            X.1E7 r2 = r3.A0H(r4)
        L_0x2146:
            java.lang.String r1 = r5.A0e
            java.lang.String r0 = r2.A0c
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x2217
            r2.A0c = r1
            r3.A0W(r2)
            return
        L_0x2156:
            if (r2 == 0) goto L_0x2217
            X.1M9 r3 = r3.A03
            X.1E7 r2 = r3.A0H(r2)
            goto L_0x2146
        L_0x215f:
            java.lang.Object r2 = r0.A00
            X.30i r2 = (X.C676530i) r2
            java.lang.Object r1 = r0.A01
            X.206 r1 = (X.AnonymousClass206) r1
            X.00H r0 = r2.A0H
            java.lang.Object r0 = r0.get()
            X.1KF r0 = (X.AnonymousClass1KF) r0
            r0.A01(r1)
            return
        L_0x2173:
            java.lang.Object r4 = r0.A00
            X.1kd r4 = (X.C34531kd) r4
            java.lang.Object r2 = r0.A01
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r9 = r0.A02
            java.util.List r9 = (java.util.List) r9
            r5 = 0
            X.1kY r1 = r4.A0H     // Catch:{ IOException -> 0x21ab }
            java.lang.String r0 = r1.A01(r2)     // Catch:{ IOException -> 0x21ab }
            if (r0 == 0) goto L_0x2217
            X.6gh r3 = r1.A00(r0)     // Catch:{ 1iZ -> 0x21b5 }
            java.util.ArrayList r2 = r3.A01     // Catch:{ 1iZ -> 0x21b5 }
            int r1 = r2.size()     // Catch:{ 1iZ -> 0x21b5 }
            r0 = 1
            r10 = 0
            if (r1 <= r0) goto L_0x219c
            X.1iW r0 = r4.A03     // Catch:{ 1iZ -> 0x21b5 }
            r0.A0h(r5, r9, r2, r10)     // Catch:{ 1iZ -> 0x21b5 }
            return
        L_0x219c:
            X.1iW r5 = r4.A03     // Catch:{ 1iZ -> 0x21b5 }
            java.lang.String r7 = r3.A00     // Catch:{ 1iZ -> 0x21b5 }
            java.lang.Object r8 = r2.get(r10)     // Catch:{ 1iZ -> 0x21b5 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ 1iZ -> 0x21b5 }
            r6 = 0
            r5.A0g(r6, r7, r8, r9, r10)     // Catch:{ 1iZ -> 0x21b5 }
            return
        L_0x21ab:
            X.1KB r2 = r4.A02
            r0 = 35
            X.3Bt r1 = new X.3Bt
            r1.<init>(r4, r0)
            goto L_0x21bf
        L_0x21b5:
            r3 = move-exception
            X.1KB r2 = r4.A02
            r0 = 49
            X.3Cf r1 = new X.3Cf
            r1.<init>(r4, r3, r0)
        L_0x21bf:
            r2.A0J(r1)
            return
        L_0x21c3:
            java.lang.Object r3 = r0.A00
            X.1kd r3 = (X.C34531kd) r3
            java.lang.Object r2 = r0.A01
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.Object r1 = r0.A02
            X.Af0 r1 = (X.C21132Af0) r1
            byte[] r0 = X.C34531kd.A03(r2, r3)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x21d7 }
            r1.accept(r0)     // Catch:{ 1iX | IOException | OutOfMemoryError -> 0x21d7 }
            return
        L_0x21d7:
            r0 = move-exception
            r1.A0C(r0)
            return
        L_0x21dc:
            java.lang.Object r3 = r0.A00
            X.1iW r3 = (X.C33251iW) r3
            java.lang.Object r7 = r0.A01
            X.206 r7 = (X.AnonymousClass206) r7
            java.lang.Object r2 = r0.A02
            X.206 r2 = (X.AnonymousClass206) r2
            X.1RU r1 = r3.A0u
            X.6RT r0 = X.AnonymousClass6RT.MEDIA_ALBUM
            r1.BCh(r7, r2, r0)
            X.122 r6 = r3.A0U
            r5 = 1
            X.1PT r1 = r6.A0w
            boolean r0 = r1.A0b
            if (r0 == 0) goto L_0x2209
            X.1Np r4 = r1.A0G
            X.205 r0 = r7.A0v
            java.lang.String r0 = r0.A01
            int r3 = r0.hashCode()
            r2 = -1
            int r1 = r7.A0u
            r0 = 4
            r4.A04(r3, r0, r2, r1)
        L_0x2209:
            X.AnonymousClass122.A06(r6, r7, r5)
            return
        L_0x220d:
            java.lang.String r0 = "version"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)     // Catch:{  }
            throw r0     // Catch:{  }
        L_0x2214:
            r6.A00()
        L_0x2217:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27081DTg.run():void");
    }

    public C27081DTg(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public C27081DTg(C28573E8e e8e, C25680CkB ckB, DRJ drj) {
        this.A03 = 19;
        this.A02 = ckB;
        this.A01 = e8e;
        this.A00 = drj;
    }
}
