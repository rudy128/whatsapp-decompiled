package X;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.DBq  reason: case insensitive filesystem */
public final class C26737DBq implements E96 {
    public int A00;
    public C25993Cq8 A01;
    public final int A02;
    public final String A03;
    public final int A04;
    public final int A05;
    public final E95 A06;
    public final CN9 A07;
    public final Ci6 A08;
    public final C25082CWs A09;
    public final boolean A0A;

    public /* synthetic */ void CCQ(C28657ECr eCr, C28603E9u e9u, C129546hy r3, int i) {
    }

    private final CNA A00(int i, int i2) {
        if (!this.A0A) {
            return new CNA(this.A05, this.A04);
        }
        int i3 = this.A05;
        int i4 = this.A04;
        if (i < i3 || i2 < i4) {
            double d = ((double) i3) / ((double) i4);
            if (i2 > i) {
                if (i2 > i4) {
                    i2 = i4;
                }
                i4 = i2;
                i3 = (int) (((double) i2) * d);
            } else {
                if (i > i3) {
                    i = i3;
                }
                i3 = i;
                i4 = (int) (((double) i) / d);
            }
        }
        return new CNA(i3, i4);
    }

    public static final C25993Cq8 A01(C26737DBq dBq) {
        C25993Cq8 cq8 = dBq.A01;
        if (cq8 == null) {
            Ci6 ci6 = dBq.A08;
            String str = dBq.A03;
            C25082CWs cWs = dBq.A09;
            E95 e95 = dBq.A06;
            C18070vi.A0i(str, e95);
            ConcurrentHashMap concurrentHashMap = Ci6.A03;
            synchronized (concurrentHashMap) {
                CND cnd = (CND) concurrentHashMap.get(str);
                if (cnd != null) {
                    concurrentHashMap.remove(str);
                    cq8 = cnd.A00;
                } else {
                    cq8 = new C25993Cq8(e95, new C24771CJo(ci6.A01), cWs, ci6.A02, ci6.A00);
                }
            }
            dBq.A01 = cq8;
        }
        return cq8;
    }

    public void CCP(int i, int i2) {
        if (i > 0 && i2 > 0 && this.A05 > 0 && this.A04 > 0) {
            CNA A002 = A00(i, i2);
            C25993Cq8 A012 = A01(this);
            int i3 = A002.A01;
            C18070vi.A0d(C27862Dmz.A00, 2);
            C25993Cq8.A01(A012, i3, i3);
        }
    }

    public C26737DBq(E95 e95, Ci6 ci6, C25082CWs cWs, String str, boolean z) {
        this.A06 = e95;
        this.A09 = cWs;
        this.A08 = ci6;
        this.A0A = z;
        this.A03 = str == null ? String.valueOf(hashCode()) : str;
        EAH eah = ((C26734DBl) e95).A00.A06;
        this.A05 = eah.getWidth();
        this.A04 = eah.getHeight();
        long millis = TimeUnit.SECONDS.toMillis(1) / ((long) (e95.BUH() / e95.getFrameCount()));
        int i = (int) (millis < 1 ? 1 : millis);
        this.A02 = i;
        this.A00 = i;
        this.A07 = new CN9(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        if (r3 <= r9) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
        if (r9 <= r2) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r9 >= 0) goto L_0x0048;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.DRN BNP(int r9, int r10, int r11) {
        /*
            r8 = this;
            X.CNA r0 = r8.A00(r10, r11)
            X.Cq8 r5 = A01(r8)
            int r7 = r0.A01
            int r6 = r0.A00
            java.util.Map r0 = r5.A01
            java.lang.Object r1 = X.AnonymousClass000.A0w(r0, r9)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r1 == 0) goto L_0x0099
            int r9 = r1.intValue()
            r5.A00 = r9
            java.util.concurrent.ConcurrentHashMap r0 = r5.A08
            java.lang.Object r1 = r0.get(r1)
            X.CNB r1 = (X.CNB) r1
            if (r1 == 0) goto L_0x0096
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0096
            X.DRN r4 = r1.A01
            boolean r0 = r4.A06()
            if (r0 == 0) goto L_0x0096
            X.CJp r0 = r5.A05
            int r3 = r5.A0A
            int r2 = r5.A03
            int r2 = r2 + r3
            int r1 = r0.A00
            int r2 = r2 % r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto L_0x0094
            if (r0 == 0) goto L_0x0094
        L_0x0044:
            if (r3 >= r2) goto L_0x008c
            if (r3 > r9) goto L_0x004d
        L_0x0048:
            if (r9 > r2) goto L_0x004d
        L_0x004a:
            X.C25993Cq8.A01(r5, r7, r6)
        L_0x004d:
            X.DRN r1 = r4.clone()
            java.lang.Integer r0 = X.AnonymousClass00R.A00
        L_0x0053:
            X.CNC r5 = new X.CNC
            r5.<init>(r1, r0)
            X.CN9 r4 = r8.A07
            java.util.concurrent.atomic.AtomicInteger r0 = X.C25466CgL.A05
            r3 = 0
            X.C18070vi.A0d(r4, r3)
            java.util.concurrent.ConcurrentHashMap r2 = X.C25466CgL.A02
            boolean r0 = r2.contains(r4)
            if (r0 != 0) goto L_0x0073
            int r0 = r4.A00
            float r1 = (float) r0
            r0 = 1045220557(0x3e4ccccd, float:0.2)
            float r1 = r1 * r0
            int r0 = (int) r1
            X.C17890vO.A0z(r4, r2, r0)
        L_0x0073:
            java.lang.Integer r0 = r5.A01
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x0089
            r0 = 1
            if (r1 == r0) goto L_0x0086
            java.util.concurrent.atomic.AtomicInteger r0 = X.C25466CgL.A03
        L_0x0080:
            r0.incrementAndGet()
            X.DRN r0 = r5.A00
            return r0
        L_0x0086:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C25466CgL.A04
            goto L_0x0080
        L_0x0089:
            java.util.concurrent.atomic.AtomicInteger r0 = X.C25466CgL.A05
            goto L_0x0080
        L_0x008c:
            if (r3 > r9) goto L_0x0091
            if (r9 > r1) goto L_0x0091
            goto L_0x004a
        L_0x0091:
            if (r9 < 0) goto L_0x004d
            goto L_0x0048
        L_0x0094:
            int r2 = r2 + r1
            goto L_0x0044
        L_0x0096:
            X.C25993Cq8.A01(r5, r7, r6)
        L_0x0099:
            X.CJp r0 = r5.A05
            int r4 = r0.A00
            r1 = 0
            X.1Oc r0 = new X.1Oc
            r0.<init>(r1, r4)
            java.util.Iterator r3 = r0.iterator()
        L_0x00a7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00e1
            r0 = r3
            X.20T r0 = (X.AnonymousClass20T) r0
            int r0 = r0.A00()
            int r2 = r9 - r0
            int r2 = r2 % r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto L_0x00df
            if (r0 == 0) goto L_0x00df
        L_0x00bf:
            java.util.concurrent.ConcurrentHashMap r0 = r5.A08
            java.lang.Object r1 = X.AnonymousClass8BT.A0r(r0, r2)
            X.CNB r1 = (X.CNB) r1
            if (r1 == 0) goto L_0x00a7
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00a7
            X.DRN r1 = r1.A01
            boolean r0 = r1.A06()
            if (r0 == 0) goto L_0x00a7
            X.DRN r1 = r1.clone()
            r5.A00 = r2
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            goto L_0x0053
        L_0x00df:
            int r2 = r2 + r4
            goto L_0x00bf
        L_0x00e1:
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            goto L_0x0053
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C26737DBq.BNP(int, int, int):X.DRN");
    }

    public void C6z() {
        A01(this);
        C25993Cq8 A012 = A01(this);
        String str = this.A03;
        C18070vi.A0d(str, 0);
        Ci6.A03.put(str, new CND(A012, new Date()));
        this.A01 = null;
    }
}
