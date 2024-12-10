package X;

import android.graphics.Bitmap;
import android.util.SparseArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

public abstract class DBG implements C28655ECp {
    public final SparseArray A00;
    public final C28431E0x A01;
    public final C25051CVf A02;
    public final C25051CVf A03;
    public final CRL A04;
    public final Set A05;
    public final C28619EAr A06;
    public final Class A07 = getClass();

    private void A00() {
        EAY eay = C26265CwA.A00;
        if (eay.BfN(2)) {
            Class cls = this.A07;
            C25051CVf cVf = this.A03;
            Integer valueOf = Integer.valueOf(cVf.A00);
            Integer valueOf2 = Integer.valueOf(cVf.A01);
            C25051CVf cVf2 = this.A02;
            Integer valueOf3 = Integer.valueOf(cVf2.A00);
            Integer valueOf4 = Integer.valueOf(cVf2.A01);
            String simpleName = cls.getSimpleName();
            Object[] A1a = BE6.A1a();
            AnonymousClass8BW.A1K(valueOf, valueOf2, valueOf3, A1a);
            A1a[3] = valueOf4;
            eay.CRf(simpleName, BE7.A0o("Used = (%d, %d); Free = (%d, %d)", A1a));
        }
    }

    public synchronized Object A04(CRK crk) {
        Object poll;
        poll = crk.A03.poll();
        if (poll != null) {
            crk.A00++;
        }
        return poll;
    }

    public synchronized void A05(int i) {
        C25051CVf cVf = this.A03;
        int i2 = cVf.A01;
        C25051CVf cVf2 = this.A02;
        int i3 = cVf2.A01;
        int i4 = i2 + i3;
        int min = Math.min(i4 - i, i3);
        if (min > 0) {
            if (C26265CwA.A00.BfN(2)) {
                C26265CwA.A00(this.A07, Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(min), "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d");
            }
            A00();
            int i5 = 0;
            while (true) {
                SparseArray sparseArray = this.A00;
                if (i5 >= sparseArray.size() || min <= 0) {
                    A00();
                } else {
                    CRK crk = (CRK) sparseArray.valueAt(i5);
                    C26208Cuj.A01(crk);
                    while (true) {
                        Object poll = crk.A03.poll();
                        if (poll == null) {
                            break;
                        }
                        A06(poll);
                        min -= crk.A01;
                        cVf2.A00(crk.A01);
                        if (min <= 0) {
                            break;
                        }
                    }
                    i5++;
                }
            }
            A00();
            if (C26265CwA.A00.BfN(2)) {
                C26265CwA.A01(this.A07, Integer.valueOf(i), Integer.valueOf(cVf.A01 + cVf2.A01), "trimToSize: TargetSize = %d; Final Size = %d");
            }
        }
    }

    public synchronized boolean A07() {
        return C108975cc.A1D(this.A03.A01 + this.A02.A01, this.A04.A02);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CEE(java.lang.Object r9) {
        /*
            r8 = this;
            r7 = r8
            X.C26208Cuj.A01(r9)
            int r5 = r8.A02(r9)
            monitor-enter(r7)
            android.util.SparseArray r0 = r8.A00     // Catch:{ all -> 0x00f8 }
            java.lang.Object r3 = r0.get(r5)     // Catch:{ all -> 0x00f8 }
            X.CRK r3 = (X.CRK) r3     // Catch:{ all -> 0x00f8 }
            java.util.Set r0 = r8.A05     // Catch:{ all -> 0x00fa }
            boolean r0 = r0.remove(r9)     // Catch:{ all -> 0x00fa }
            r6 = 2
            if (r0 != 0) goto L_0x0047
            java.lang.Class r1 = r8.A07     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "release (free, value unrecognized) (object, size) = (%x, %s)"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x00fa }
            int r0 = java.lang.System.identityHashCode(r9)     // Catch:{ all -> 0x00fa }
            X.AnonymousClass000.A1L(r3, r0)     // Catch:{ all -> 0x00fa }
            X.AnonymousClass000.A1M(r3, r5)     // Catch:{ all -> 0x00fa }
            X.EAY r2 = X.C26265CwA.A00     // Catch:{ all -> 0x00fa }
            r0 = 6
            boolean r0 = r2.BfN(r0)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x003e
            java.lang.String r1 = r1.getSimpleName()     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = X.BE7.A0o(r4, r3)     // Catch:{ all -> 0x00fa }
            r2.BJn(r1, r0)     // Catch:{ all -> 0x00fa }
        L_0x003e:
            r8.A06(r9)     // Catch:{ all -> 0x00fa }
        L_0x0041:
            r8.A00()     // Catch:{ all -> 0x00fa }
            monitor-exit(r7)     // Catch:{ all -> 0x00fa }
            goto L_0x00f7
        L_0x0047:
            if (r3 == 0) goto L_0x00de
            int r1 = r3.A00     // Catch:{ all -> 0x00fa }
            java.util.Queue r4 = r3.A03     // Catch:{ all -> 0x00fa }
            int r0 = r4.size()     // Catch:{ all -> 0x00fa }
            int r1 = r1 + r0
            int r0 = r3.A02     // Catch:{ all -> 0x00fa }
            if (r1 > r0) goto L_0x00d1
            boolean r0 = r8.A07()     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r8 instanceof X.BSG     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x006d
            r0 = r9
            X.EAI r0 = (X.EAI) r0     // Catch:{ all -> 0x00fa }
            X.C26208Cuj.A01(r0)     // Catch:{ all -> 0x00fa }
            boolean r0 = r0.isClosed()     // Catch:{ all -> 0x00fa }
            r0 = r0 ^ 1
            goto L_0x0081
        L_0x006d:
            boolean r0 = r8 instanceof X.BSH     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x0084
            r1 = r9
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ all -> 0x00fa }
            X.C26208Cuj.A01(r1)     // Catch:{ all -> 0x00fa }
            boolean r0 = r1.isRecycled()     // Catch:{ all -> 0x00fa }
            if (r0 != 0) goto L_0x00d1
            boolean r0 = r1.isMutable()     // Catch:{ all -> 0x00fa }
        L_0x0081:
            if (r0 != 0) goto L_0x0087
            goto L_0x00d1
        L_0x0084:
            X.C26208Cuj.A01(r9)     // Catch:{ all -> 0x00fa }
        L_0x0087:
            X.C26208Cuj.A01(r9)     // Catch:{ all -> 0x00fa }
            r2 = 0
            r1 = 1
            int r0 = r3.A00     // Catch:{ all -> 0x00fa }
            if (r0 <= 0) goto L_0x00b8
            int r0 = r0 - r1
            r3.A00 = r0     // Catch:{ all -> 0x00fa }
            r4.add(r9)     // Catch:{ all -> 0x00fa }
        L_0x0096:
            X.CVf r1 = r8.A02     // Catch:{ all -> 0x00fa }
            int r0 = r1.A00     // Catch:{ all -> 0x00fa }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x00fa }
            int r0 = r1.A01     // Catch:{ all -> 0x00fa }
            int r0 = r0 + r5
            r1.A01 = r0     // Catch:{ all -> 0x00fa }
            X.CVf r0 = r8.A03     // Catch:{ all -> 0x00fa }
            r0.A00(r5)     // Catch:{ all -> 0x00fa }
            X.EAY r0 = X.C26265CwA.A00     // Catch:{ all -> 0x00fa }
            boolean r0 = r0.BfN(r6)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x0041
            java.lang.Class r1 = r8.A07     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "release (reuse) (object, size) = (%x, %s)"
            A01(r1, r9, r0, r5)     // Catch:{ all -> 0x00fa }
            goto L_0x0041
        L_0x00b8:
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x00fa }
            r4[r2] = r9     // Catch:{ all -> 0x00fa }
            java.lang.String r3 = "BUCKET"
            java.lang.String r2 = "Tried to release value %s from an empty bucket!"
            X.EAY r1 = X.C26265CwA.A00     // Catch:{ all -> 0x00fa }
            r0 = 6
            boolean r0 = r1.BfN(r0)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = X.BE7.A0o(r2, r4)     // Catch:{ all -> 0x00fa }
            r1.BJn(r3, r0)     // Catch:{ all -> 0x00fa }
            goto L_0x0096
        L_0x00d1:
            int r2 = r3.A00     // Catch:{ all -> 0x00fa }
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1R(r2)
            X.C26208Cuj.A05(r0)     // Catch:{ all -> 0x00fa }
            int r2 = r2 - r1
            r3.A00 = r2     // Catch:{ all -> 0x00fa }
        L_0x00de:
            X.EAY r0 = X.C26265CwA.A00     // Catch:{ all -> 0x00fa }
            boolean r0 = r0.BfN(r6)     // Catch:{ all -> 0x00fa }
            if (r0 == 0) goto L_0x00ed
            java.lang.Class r1 = r8.A07     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "release (free) (object, size) = (%x, %s)"
            A01(r1, r9, r0, r5)     // Catch:{ all -> 0x00fa }
        L_0x00ed:
            r8.A06(r9)     // Catch:{ all -> 0x00fa }
            X.CVf r0 = r8.A03     // Catch:{ all -> 0x00fa }
            r0.A00(r5)     // Catch:{ all -> 0x00fa }
            goto L_0x0041
        L_0x00f7:
            return
        L_0x00f8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00fa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBG.CEE(java.lang.Object):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
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
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0143 A[SYNTHETIC, Splitter:B:111:0x0143] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3 A[SYNTHETIC, Splitter:B:57:0x00c3] */
    public java.lang.Object get(int r12) {
        /*
            r11 = this;
            r10 = r11
            monitor-enter(r10)
            boolean r0 = r11.A07()     // Catch:{ all -> 0x0150 }
            if (r0 == 0) goto L_0x000f
            X.CVf r0 = r11.A02     // Catch:{ all -> 0x0150 }
            int r1 = r0.A01     // Catch:{ all -> 0x0150 }
            r0 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            X.C26208Cuj.A05(r0)     // Catch:{ all -> 0x0150 }
            monitor-exit(r10)
            r1 = r11
            boolean r0 = r11 instanceof X.BSG
            if (r0 == 0) goto L_0x0034
            X.BSG r1 = (X.BSG) r1
            if (r12 <= 0) goto L_0x002a
            int[] r3 = r1.A00
            int r1 = r3.length
            r0 = 0
        L_0x0021:
            if (r0 >= r1) goto L_0x0053
            r2 = r3[r0]
            if (r2 >= r12) goto L_0x0054
            int r0 = r0 + 1
            goto L_0x0021
        L_0x002a:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            X.DZb r0 = new X.DZb
            r0.<init>(r1)
            throw r0
        L_0x0034:
            boolean r0 = r11 instanceof X.BSI
            if (r0 == 0) goto L_0x0053
            X.BSI r1 = (X.BSI) r1
            if (r12 <= 0) goto L_0x0049
            int[] r3 = r1.A00
            int r1 = r3.length
            r0 = 0
        L_0x0040:
            if (r0 >= r1) goto L_0x0053
            r2 = r3[r0]
            if (r2 >= r12) goto L_0x0054
            int r0 = r0 + 1
            goto L_0x0040
        L_0x0049:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            X.DZb r0 = new X.DZb
            r0.<init>(r1)
            throw r0
        L_0x0053:
            r2 = r12
        L_0x0054:
            monitor-enter(r10)
            android.util.SparseArray r4 = r11.A00     // Catch:{ all -> 0x0141 }
            java.lang.Object r5 = r4.get(r2)     // Catch:{ all -> 0x0141 }
            X.CRK r5 = (X.CRK) r5     // Catch:{ all -> 0x0141 }
            if (r5 == 0) goto L_0x0099
            java.lang.Object r3 = r11.A04(r5)     // Catch:{ all -> 0x014d }
            if (r3 == 0) goto L_0x0099
            java.util.Set r0 = r11.A05     // Catch:{ all -> 0x014d }
            boolean r0 = r0.add(r3)     // Catch:{ all -> 0x014d }
            X.C26208Cuj.A05(r0)     // Catch:{ all -> 0x014d }
            int r2 = r11.A02(r3)     // Catch:{ all -> 0x014d }
            X.CVf r1 = r11.A03     // Catch:{ all -> 0x014d }
            int r0 = r1.A00     // Catch:{ all -> 0x014d }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x014d }
            int r0 = r1.A01     // Catch:{ all -> 0x014d }
            int r0 = r0 + r2
            r1.A01 = r0     // Catch:{ all -> 0x014d }
            X.CVf r0 = r11.A02     // Catch:{ all -> 0x014d }
            r0.A00(r2)     // Catch:{ all -> 0x014d }
            r11.A00()     // Catch:{ all -> 0x014d }
            r1 = 2
            X.EAY r0 = X.C26265CwA.A00     // Catch:{ all -> 0x014d }
            boolean r0 = r0.BfN(r1)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0097
            java.lang.Class r1 = r11.A07     // Catch:{ all -> 0x014d }
            java.lang.String r0 = "get (reuse) (object, size) = (%x, %s)"
            A01(r1, r3, r0, r2)     // Catch:{ all -> 0x014d }
        L_0x0097:
            monitor-exit(r10)     // Catch:{ all -> 0x014d }
            return r3
        L_0x0099:
            X.CRL r6 = r11.A04     // Catch:{ all -> 0x0141 }
            int r7 = r6.A01     // Catch:{ all -> 0x0141 }
            X.CVf r1 = r11.A03     // Catch:{ all -> 0x0141 }
            int r3 = r1.A01     // Catch:{ all -> 0x0141 }
            int r0 = r7 - r3
            if (r2 > r0) goto L_0x00be
            int r9 = r6.A02     // Catch:{ all -> 0x0141 }
            X.CVf r8 = r11.A02     // Catch:{ all -> 0x0141 }
            int r0 = r8.A01     // Catch:{ all -> 0x0141 }
            int r3 = r3 + r0
            int r0 = r9 - r3
            if (r2 <= r0) goto L_0x00b4
            int r9 = r9 - r2
            r11.A05(r9)     // Catch:{ all -> 0x0141 }
        L_0x00b4:
            int r3 = r1.A01     // Catch:{ all -> 0x0141 }
            int r0 = r8.A01     // Catch:{ all -> 0x0141 }
            int r0 = r0 + r3
            int r0 = r7 - r0
            if (r2 > r0) goto L_0x00be
            goto L_0x00c0
        L_0x00be:
            r0 = 0
            goto L_0x00c1
        L_0x00c0:
            r0 = 1
        L_0x00c1:
            if (r0 == 0) goto L_0x0143
            int r0 = r1.A00     // Catch:{ all -> 0x014d }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x014d }
            int r3 = r3 + r2
            r1.A01 = r3     // Catch:{ all -> 0x014d }
            if (r5 == 0) goto L_0x00d4
            int r0 = r5.A00     // Catch:{ all -> 0x014d }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x014d }
        L_0x00d4:
            monitor-exit(r10)     // Catch:{ all -> 0x014d }
            java.lang.Object r3 = r11.A03(r2)     // Catch:{ all -> 0x00da }
            goto L_0x0106
        L_0x00da:
            r5 = move-exception
            monitor-enter(r10)
            r1.A00(r2)     // Catch:{ all -> 0x013e }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ all -> 0x013c }
            X.CRK r4 = (X.CRK) r4     // Catch:{ all -> 0x013c }
            if (r4 == 0) goto L_0x00f4
            int r3 = r4.A00     // Catch:{ all -> 0x013e }
            r1 = 1
            boolean r0 = X.AnonymousClass000.A1R(r3)
            X.C26208Cuj.A05(r0)     // Catch:{ all -> 0x013e }
            int r3 = r3 - r1
            r4.A00 = r3     // Catch:{ all -> 0x013e }
        L_0x00f4:
            monitor-exit(r10)     // Catch:{ all -> 0x013e }
            java.lang.Class<java.lang.Error> r1 = java.lang.Error.class
            boolean r0 = r1.isInstance(r5)
            if (r0 != 0) goto L_0x0135
            java.lang.Class<java.lang.RuntimeException> r1 = java.lang.RuntimeException.class
            boolean r0 = r1.isInstance(r5)
            if (r0 != 0) goto L_0x0135
            r3 = 0
        L_0x0106:
            monitor-enter(r10)
            java.util.Set r0 = r11.A05     // Catch:{ all -> 0x0132 }
            boolean r0 = r0.add(r3)     // Catch:{ all -> 0x0132 }
            X.C26208Cuj.A05(r0)     // Catch:{ all -> 0x0132 }
            boolean r0 = r11.A07()     // Catch:{ all -> 0x0130 }
            if (r0 == 0) goto L_0x011b
            int r0 = r6.A02     // Catch:{ all -> 0x0130 }
            r11.A05(r0)     // Catch:{ all -> 0x0130 }
        L_0x011b:
            r11.A00()     // Catch:{ all -> 0x0132 }
            r1 = 2
            X.EAY r0 = X.C26265CwA.A00     // Catch:{ all -> 0x0132 }
            boolean r0 = r0.BfN(r1)     // Catch:{ all -> 0x0132 }
            if (r0 == 0) goto L_0x012e
            java.lang.Class r1 = r11.A07     // Catch:{ all -> 0x0132 }
            java.lang.String r0 = "get (alloc) (object, size) = (%x, %s)"
            A01(r1, r3, r0, r2)     // Catch:{ all -> 0x0132 }
        L_0x012e:
            monitor-exit(r10)     // Catch:{ all -> 0x0132 }
            return r3
        L_0x0130:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0132 }
        L_0x0132:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0132 }
            throw r0
        L_0x0135:
            java.lang.Object r0 = r1.cast(r5)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x013c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013e:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x013e }
            throw r0
        L_0x0141:
            r1 = move-exception
            goto L_0x014c
        L_0x0143:
            X.CVf r0 = r11.A02     // Catch:{ all -> 0x014d }
            int r0 = r0.A01     // Catch:{ all -> 0x014d }
            X.DZc r1 = new X.DZc     // Catch:{ all -> 0x014d }
            r1.<init>(r7, r3, r0, r2)     // Catch:{ all -> 0x014d }
        L_0x014c:
            throw r1     // Catch:{ all -> 0x014d }
        L_0x014d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x014d }
            throw r0
        L_0x0150:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DBG.get(int):java.lang.Object");
    }

    public int A02(Object obj) {
        if (this instanceof BSG) {
            EAI eai = (EAI) obj;
            C26208Cuj.A01(eai);
            return eai.BZK();
        } else if (this instanceof BSI) {
            byte[] bArr = (byte[]) obj;
            C18070vi.A0d(bArr, 0);
            return bArr.length;
        } else {
            Bitmap bitmap = (Bitmap) obj;
            C26208Cuj.A01(bitmap);
            return bitmap.getAllocationByteCount();
        }
    }

    public Object A03(int i) {
        if (this instanceof BSI) {
            return new byte[i];
        }
        if (this instanceof BSH) {
            return Bitmap.createBitmap(1, BE7.A03((double) i, 2.0d), Bitmap.Config.RGB_565);
        }
        return new DRL(i);
    }

    public void A06(Object obj) {
        if (this instanceof BSG) {
            EAI eai = (EAI) obj;
            C26208Cuj.A01(eai);
            eai.close();
        } else if (!(this instanceof BSI)) {
            Bitmap bitmap = (Bitmap) obj;
            C26208Cuj.A01(bitmap);
            bitmap.recycle();
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.CVf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v8, types: [X.CVf, java.lang.Object] */
    public DBG(C28431E0x e0x, CRL crl, C28619EAr eAr) {
        C26208Cuj.A01(e0x);
        this.A01 = e0x;
        C26208Cuj.A01(crl);
        this.A04 = crl;
        C26208Cuj.A01(eAr);
        this.A06 = eAr;
        this.A00 = BE6.A0Q();
        SparseIntArray sparseIntArray = new SparseIntArray(0);
        synchronized (this) {
            SparseArray sparseArray = this.A00;
            sparseArray.clear();
            SparseIntArray sparseIntArray2 = this.A04.A03;
            for (int i = 0; i < sparseIntArray2.size(); i++) {
                int keyAt = sparseIntArray2.keyAt(i);
                sparseArray.put(keyAt, new CRK(keyAt, sparseIntArray2.valueAt(i), sparseIntArray.get(keyAt, 0)));
            }
        }
        this.A05 = Collections.newSetFromMap(new IdentityHashMap());
        this.A02 = new Object();
        this.A03 = new Object();
    }

    public static void A01(Class cls, Object obj, String str, int i) {
        C26265CwA.A01(cls, Integer.valueOf(System.identityHashCode(obj)), Integer.valueOf(i), str);
    }
}
