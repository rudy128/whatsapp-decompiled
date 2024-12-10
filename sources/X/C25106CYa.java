package X;

/* renamed from: X.CYa  reason: case insensitive filesystem */
public class C25106CYa {
    public long A00 = -1;
    public long A01 = -1;
    public boolean A02 = false;

    public synchronized long A00() {
        return this.A01;
    }

    public synchronized void A01(long j, long j2) {
        if (this.A02) {
            this.A01 += j;
            this.A00 += j2;
        }
    }
}
