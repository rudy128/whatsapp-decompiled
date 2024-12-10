package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Cq6  reason: case insensitive filesystem */
public final class C25991Cq6 {
    public int A00;
    public int A01;
    public long A02;
    public CSZ A03;
    public BTA A04;
    public Float A05;
    public C22821Di A06;
    public C22821Di A07;
    public final AtomicInteger A08;
    public final AtomicInteger A09;

    public C25991Cq6() {
        this((CSZ) null, (AnonymousClass1Y1) null, 1);
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.BTA, java.lang.Object] */
    public /* synthetic */ C25991Cq6(CSZ csz, AnonymousClass1Y1 r5, int i) {
        this.A03 = new CSZ(2000);
        this.A08 = new AtomicInteger(0);
        this.A09 = new AtomicInteger(0);
        this.A02 = System.currentTimeMillis();
        System.currentTimeMillis();
        this.A00 = 400000;
        ? obj = new Object();
        obj.A00 = 0;
        this.A04 = obj;
    }

    public static final void A00(BTA bta, C25991Cq6 cq6) {
        int i = cq6.A04.A00;
        int i2 = bta.A00;
        if (i != i2) {
            C25845Cn1 cn1 = C24712CGy.A01;
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Updating throughput health from ");
            A10.append(i);
            cn1.A01("sup:BtcThroughputHealth", AnonymousClass001.A1I(" to ", A10, i2));
            cq6.A04 = bta;
            C22821Di r0 = cq6.A06;
            if (r0 != null) {
                r0.invoke(bta);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v31, types: [X.BTA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v35, types: [X.BTA, java.lang.Object] */
    public final void A01(int i) {
        int i2;
        AtomicInteger atomicInteger;
        BTA bta;
        C22821Di r0;
        CSZ csz = this.A03;
        long currentTimeMillis = System.currentTimeMillis();
        long j = csz.A02;
        BTL btl = new BTL(i, currentTimeMillis + j);
        ConcurrentLinkedQueue concurrentLinkedQueue = csz.A03;
        if (concurrentLinkedQueue.isEmpty()) {
            csz.A00 = System.currentTimeMillis();
        }
        concurrentLinkedQueue.add(btl);
        csz.A01 += (long) i;
        csz.A04.schedule(new C27080DTf((Object) csz, 4), j, TimeUnit.MILLISECONDS);
        CSZ csz2 = this.A03;
        float f = (float) (csz2.A01 * 8);
        long j2 = csz2.A02;
        long currentTimeMillis2 = System.currentTimeMillis() - csz2.A00;
        if (j2 > currentTimeMillis2) {
            j2 = currentTimeMillis2;
        }
        Float valueOf = Float.valueOf(f / (((float) j2) / 1000.0f));
        this.A05 = valueOf;
        if (!(valueOf == null || (r0 = this.A07) == null)) {
            r0.invoke(valueOf);
        }
        Float f2 = this.A05;
        CSZ csz3 = this.A03;
        if (System.currentTimeMillis() - csz3.A00 >= csz3.A02 && System.currentTimeMillis() - this.A02 > 1000) {
            this.A02 = System.currentTimeMillis();
            if (f2 != null) {
                float floatValue = f2.floatValue();
                C25845Cn1 cn1 = C24712CGy.A01;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Actual bitrate: ");
                A10.append(f2);
                A10.append(" Expected bitrate: ");
                int i3 = this.A00;
                A10.append(i3);
                A10.append(", pct: ");
                A10.append((floatValue * 100.0f) / ((float) i3));
                cn1.A02("sup:BtcThroughputHealth", A10.toString());
                double d = (double) floatValue;
                double d2 = (double) this.A00;
                double d3 = C24458C4y.A01 * d2;
                if (d <= d3) {
                    i2 = 1;
                } else {
                    double d4 = C24458C4y.A00 * d2;
                    if (d3 > d || d > d4) {
                        i2 = 0;
                        if (d >= d4) {
                            i2 = 3;
                        }
                    } else {
                        i2 = 2;
                    }
                }
                if (floatValue <= ((float) (this.A01 + 100000)) || i2 == 1) {
                    atomicInteger = this.A08;
                    int incrementAndGet = atomicInteger.incrementAndGet();
                    this.A09.set(0);
                    if (incrementAndGet >= C24458C4y.A02) {
                        ? obj = new Object();
                        obj.A00 = 1;
                        bta = obj;
                    }
                    System.currentTimeMillis();
                }
                atomicInteger = this.A09;
                int incrementAndGet2 = atomicInteger.incrementAndGet();
                this.A08.set(0);
                if (incrementAndGet2 >= C24458C4y.A03) {
                    ? obj2 = new Object();
                    obj2.A00 = i2;
                    bta = obj2;
                }
                System.currentTimeMillis();
                A00(bta, this);
                atomicInteger.set(0);
                System.currentTimeMillis();
            }
        }
    }
}
