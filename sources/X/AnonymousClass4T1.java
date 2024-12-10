package X;

/* renamed from: X.4T1  reason: invalid class name */
public final class AnonymousClass4T1 {
    public int A00;
    public int A01;

    public final synchronized int A00() {
        int i;
        i = this.A01 + 1;
        this.A01 = i;
        return i;
    }

    public final synchronized void A01() {
        int i = this.A01 + 1;
        this.A01 = i;
        A02(i);
    }

    public final synchronized boolean A02(int i) {
        if (i <= this.A00) {
            return false;
        }
        this.A00 = i;
        return true;
    }
}
