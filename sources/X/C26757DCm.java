package X;

import android.os.SystemClock;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.DCm  reason: case insensitive filesystem */
public class C26757DCm implements E7Y, C28658ECt {
    public CSO A00;
    public long A01;
    public final C25248Cbn A02;
    public final C25248Cbn A03;
    public final Map A04 = new WeakHashMap();
    public final E4K A05;
    public final E16 A06;
    public final E4T A07;

    private synchronized DRN A00(CSN csn) {
        DRN A002;
        synchronized (this) {
            C26208Cuj.A05(!csn.A01);
            csn.A00++;
            A002 = DRN.A00(new DBL(csn, this), csn.A02.A05());
        }
        return A002;
    }

    public static synchronized DRN A01(CSN csn, C26757DCm dCm) {
        DRN drn;
        synchronized (dCm) {
            C26208Cuj.A01(csn);
            if (!csn.A01 || csn.A00 != 0) {
                drn = null;
            } else {
                drn = csn.A02;
            }
        }
        return drn;
    }

    public static synchronized void A03(C26757DCm dCm) {
        synchronized (dCm) {
            if (dCm.A01 + dCm.A00.A04 <= SystemClock.uptimeMillis()) {
                dCm.A01 = SystemClock.uptimeMillis();
                CSO cso = (CSO) dCm.A05.get();
                C26208Cuj.A02(cso, "mMemoryCacheParamsSupplier returned null");
                dCm.A00 = cso;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        r3 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r3.hasNext() == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        r2 = (X.CSN) r3.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C26208Cuj.A01(r2);
        X.C26208Cuj.A05(!r2.A01);
        r2.A01 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0096, code lost:
        r0 = th;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04() {
        /*
            r9 = this;
            r8 = r9
            monitor-enter(r8)
            X.CSO r0 = r9.A00     // Catch:{ all -> 0x00e8 }
            r4 = 2147483647(0x7fffffff, float:NaN)
            int r2 = r0.A00     // Catch:{ all -> 0x00e8 }
            X.Cbn r7 = r9.A02     // Catch:{ all -> 0x00e6 }
            int r1 = r7.A00()     // Catch:{ all -> 0x00e6 }
            X.Cbn r3 = r9.A03     // Catch:{ all -> 0x00e6 }
            int r0 = r3.A00()     // Catch:{ all -> 0x00e6 }
            int r1 = r1 - r0
            int r6 = X.BE6.A09(r2, r1, r4)     // Catch:{ all -> 0x00e8 }
            X.CSO r0 = r9.A00     // Catch:{ all -> 0x00e8 }
            int r4 = r0.A03     // Catch:{ all -> 0x00e8 }
            int r2 = r0.A02     // Catch:{ all -> 0x00e8 }
            int r1 = r7.A01()     // Catch:{ all -> 0x00e6 }
            int r0 = r3.A01()     // Catch:{ all -> 0x00e6 }
            int r1 = r1 - r0
            int r0 = X.BE6.A09(r2, r1, r4)     // Catch:{ all -> 0x00e8 }
            r5 = 0
            int r6 = java.lang.Math.max(r6, r5)     // Catch:{ all -> 0x00e6 }
            int r2 = java.lang.Math.max(r0, r5)     // Catch:{ all -> 0x00e6 }
            int r0 = r3.A00()     // Catch:{ all -> 0x00e6 }
            if (r0 > r6) goto L_0x0044
            int r0 = r3.A01()     // Catch:{ all -> 0x00e6 }
            if (r0 > r2) goto L_0x0044
            r4 = 0
            goto L_0x0098
        L_0x0044:
            java.util.ArrayList r4 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00e6 }
        L_0x0048:
            int r0 = r3.A00()     // Catch:{ all -> 0x00e6 }
            if (r0 > r6) goto L_0x0072
            int r0 = r3.A01()     // Catch:{ all -> 0x00e6 }
            if (r0 > r2) goto L_0x0072
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x00e6 }
        L_0x0058:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x0098
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x00e6 }
            X.CSN r2 = (X.CSN) r2     // Catch:{ all -> 0x00e6 }
            X.C26208Cuj.A01(r2)     // Catch:{ all -> 0x0096 }
            boolean r0 = r2.A01     // Catch:{ all -> 0x0096 }
            r1 = 1
            r0 = r0 ^ 1
            X.C26208Cuj.A05(r0)     // Catch:{ all -> 0x0096 }
            r2.A01 = r1     // Catch:{ all -> 0x0096 }
            goto L_0x0058
        L_0x0072:
            monitor-enter(r3)     // Catch:{ all -> 0x00e6 }
            java.util.LinkedHashMap r1 = r3.A02     // Catch:{ all -> 0x00ca }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x007d
            r0 = 0
            goto L_0x0085
        L_0x007d:
            java.util.Iterator r0 = X.C17890vO.A0k(r1)     // Catch:{ all -> 0x00ca }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x00ca }
        L_0x0085:
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x0089
            goto L_0x00cd
        L_0x0089:
            r3.A02(r0)     // Catch:{ all -> 0x00e6 }
            java.lang.Object r0 = r7.A02(r0)     // Catch:{ all -> 0x00e6 }
            X.CSN r0 = (X.CSN) r0     // Catch:{ all -> 0x00e6 }
            r4.add(r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x0048
        L_0x0096:
            r0 = move-exception
            goto L_0x00e5
        L_0x0098:
            monitor-exit(r8)     // Catch:{ all -> 0x00e8 }
            if (r4 == 0) goto L_0x00c9
            java.util.Iterator r1 = r4.iterator()
        L_0x009f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r0 = r1.next()
            X.CSN r0 = (X.CSN) r0
            X.DRN r0 = A01(r0, r9)
            if (r0 == 0) goto L_0x009f
            r0.close()
            goto L_0x009f
        L_0x00b5:
            java.util.Iterator r1 = r4.iterator()
        L_0x00b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00c9
            java.lang.Object r0 = r1.next()
            X.CSN r0 = (X.CSN) r0
            A02(r0)
            goto L_0x00b9
        L_0x00c9:
            return
        L_0x00ca:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e6 }
            goto L_0x00e5
        L_0x00cd:
            java.lang.String r2 = "key is null, but exclusiveEntries count: %d, size: %d"
            java.lang.Object[] r1 = X.AnonymousClass3MW.A1b()     // Catch:{ all -> 0x00e6 }
            int r0 = r3.A00()     // Catch:{ all -> 0x00e6 }
            X.C17880vN.A1T(r1, r0, r5)     // Catch:{ all -> 0x00e6 }
            int r0 = r3.A01()     // Catch:{ all -> 0x00e6 }
            X.AnonymousClass000.A1M(r1, r0)     // Catch:{ all -> 0x00e6 }
            java.lang.IllegalStateException r0 = X.BE8.A0Y(r2, r1)     // Catch:{ all -> 0x00e6 }
        L_0x00e5:
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00e8 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26757DCm.A04():void");
    }

    public DRN BDh(DRN drn, C24775CJs cJs, Object obj) {
        CSN csn;
        DRN drn2;
        DRN drn3;
        C26208Cuj.A01(obj);
        C26208Cuj.A01(drn);
        A03(this);
        synchronized (this) {
            C25248Cbn cbn = this.A03;
            csn = (CSN) cbn.A02(obj);
            C25248Cbn cbn2 = this.A02;
            CSN csn2 = (CSN) cbn2.A02(obj);
            drn2 = null;
            if (csn2 != null) {
                C26208Cuj.A05(!csn2.A01);
                csn2.A01 = true;
                drn3 = A01(csn2, this);
            } else {
                drn3 = null;
            }
            int BZN = this.A07.BZN(drn.A05());
            if (BZN <= this.A00.A01) {
                if (cbn2.A00() - cbn.A00() <= this.A00.A00 - 1) {
                    if (cbn2.A01() - cbn.A01() <= this.A00.A02 - BZN) {
                        CSN csn3 = new CSN(drn, cJs, obj);
                        cbn2.A03(obj, csn3);
                        drn2 = A00(csn3);
                    }
                }
            }
        }
        if (drn3 != null) {
            drn3.close();
        }
        A02(csn);
        A04();
        return drn2;
    }

    public DRN BDi(DRN drn, Object obj) {
        return BDh(drn, (C24775CJs) null, obj);
    }

    public static void A02(CSN csn) {
        C24775CJs cJs;
        if (csn != null && (cJs = csn.A03) != null) {
            Object obj = csn.A04;
            CRI cri = cJs.A00;
            synchronized (cri) {
                cri.A03.remove(obj);
            }
        }
    }

    public C26757DCm(E4K e4k, E16 e16, E4T e4t) {
        this.A07 = e4t;
        this.A03 = new C25248Cbn(new C26761DCq(this, e4t));
        this.A02 = new C25248Cbn(new C26761DCq(this, e4t));
        this.A06 = e16;
        this.A05 = e4k;
        Object obj = e4k.get();
        C26208Cuj.A02(obj, "mMemoryCacheParamsSupplier returned null");
        this.A00 = (CSO) obj;
        this.A01 = SystemClock.uptimeMillis();
    }

    public DRN BMF(Object obj) {
        CSN csn;
        Object obj2;
        DRN drn;
        C26208Cuj.A01(obj);
        synchronized (this) {
            csn = (CSN) this.A03.A02(obj);
            C25248Cbn cbn = this.A02;
            synchronized (cbn) {
                obj2 = cbn.A02.get(obj);
            }
            CSN csn2 = (CSN) obj2;
            if (csn2 != null) {
                drn = A00(csn2);
            } else {
                drn = null;
            }
        }
        A02(csn);
        A03(this);
        A04();
        return drn;
    }
}
