package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.0xB  reason: invalid class name and case insensitive filesystem */
public class C18800xB {
    public static final long A03 = TimeUnit.HOURS.toMillis(24);
    public static final long A04 = TimeUnit.MINUTES.toMillis(30);
    public int A00;
    public long A01;
    public final C18820xD A02;

    public synchronized void A00(int i) {
        long j;
        synchronized (this) {
            if (i < 200 || !(i < 300 || i == 401 || i == 404)) {
                int i2 = this.A00 + 1;
                this.A00 = i2;
                if (i != 429) {
                    if (i < 500 || i >= 600) {
                        j = A03;
                        this.A01 = System.currentTimeMillis() + j;
                    }
                }
                j = (long) Math.min(Math.pow(2.0d, (double) i2) + ((double) ((long) (Math.random() * 1000.0d))), (double) A04);
                this.A01 = System.currentTimeMillis() + j;
            } else {
                this.A00 = 0;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.0xC, java.lang.Object] */
    public C18800xB() {
        C18810xC r1 = C18810xC.A00;
        C18810xC r12 = r1;
        if (r1 == null) {
            ? obj = new Object();
            C18810xC.A00 = obj;
            r12 = obj;
        }
        C18820xD r0 = C18820xD.A01;
        if (r0 == null) {
            r0 = new C18820xD(r12);
            C18820xD.A01 = r0;
        }
        this.A02 = r0;
    }
}
