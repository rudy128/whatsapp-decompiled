package X;

/* renamed from: X.An1  reason: case insensitive filesystem */
public final class C21612An1 extends DV6 {
    public int A00;
    public int A01;
    public final /* synthetic */ C21614An3 A02;

    public C21612An1(C21614An3 an3) {
        this.A02 = an3;
        this.A00 = an3.size();
        this.A01 = an3.A01;
    }

    public void A00() {
        int i = this.A00;
        if (i == 0) {
            this.A00 = 2;
            return;
        }
        C21614An3 an3 = this.A02;
        Object[] objArr = an3.A03;
        int i2 = this.A01;
        this.A01 = objArr[i2];
        this.A00 = 1;
        this.A01 = (i2 + 1) % an3.A02;
        this.A00 = i - 1;
    }
}
