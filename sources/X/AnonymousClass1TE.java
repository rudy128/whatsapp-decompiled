package X;

/* renamed from: X.1TE  reason: invalid class name */
public class AnonymousClass1TE {
    public final C002100z A00 = new C002100z(1000);
    public final C002100z A01 = new C002100z(1000);

    public void A00(C178119Bw r4) {
        C002100z r2 = this.A01;
        synchronized (r2) {
            r2.A08(Long.valueOf(r4.A01()), r4);
        }
        C002100z r1 = this.A00;
        synchronized (r1) {
            r1.A08(r4.A04, r4);
        }
    }

    public void A01(C178119Bw r4) {
        C002100z r2 = this.A01;
        synchronized (r2) {
            r2.A05(Long.valueOf(r4.A01()));
        }
        C002100z r1 = this.A00;
        synchronized (r1) {
            r1.A05(r4.A04);
        }
    }
}
