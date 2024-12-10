package X;

/* renamed from: X.AiT  reason: case insensitive filesystem */
public abstract class C21340AiT implements Cloneable {
    public long A00;
    public transient int A01;
    public transient boolean A02;

    public final synchronized long A01() {
        return this.A00;
    }

    public final void A02() {
        this.A02 = true;
        this.A01++;
    }

    public final synchronized void A03(long j) {
        this.A00 = j;
    }

    public boolean A04() {
        if (this.A02 || this.A00 == -1) {
            return true;
        }
        return false;
    }

    public Object clone() {
        return super.clone();
    }
}
