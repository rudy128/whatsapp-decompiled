package X;

import java.util.concurrent.atomic.AtomicLong;

public class A06 {
    public long A00;
    public BE5 A01;
    public BE5 A02;
    public final AnonymousClass11P A03;
    public final AtomicLong A04;
    public final C200710s A05;

    public A06(AnonymousClass11P r3, AnonymousClass10I r4, AtomicLong atomicLong) {
        C18070vi.A0e(r4, 1, r3);
        this.A03 = r3;
        this.A04 = atomicLong;
        this.A05 = new C200710s(r4, true);
    }

    public static final synchronized void A00(A06 a06) {
        synchronized (a06) {
            BE5 be5 = a06.A02;
            a06.A01 = null;
            a06.A02 = null;
            if (be5 != null) {
                a06.A01(be5);
                be5.Br0();
            }
        }
    }

    public synchronized void A01(BE5 be5) {
        synchronized (this) {
            long A012 = (this.A00 + this.A04.get()) - AnonymousClass11P.A01(this.A03);
            if (A012 > 0) {
                this.A02 = be5;
                be5.Br1();
                this.A05.A05(new C21445AkC(this, 48), A012);
            } else if (this.A01 == null) {
                C20524AOj aOj = new C20524AOj(be5, this);
                this.A01 = aOj;
                this.A05.execute(aOj);
            } else {
                this.A02 = be5;
            }
        }
    }
}
