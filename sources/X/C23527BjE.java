package X;

/* renamed from: X.BjE  reason: case insensitive filesystem */
public final class C23527BjE extends BjB {
    public final transient int A00;
    public final transient int A01;
    public final /* synthetic */ BjB c;

    public final int size() {
        return this.A01;
    }

    public C23527BjE(BjB bjB, int i, int i2) {
        this.c = bjB;
        this.A00 = i;
        this.A01 = i2;
    }

    public final Object get(int i) {
        C25877Cnm.A01(i, this.A01);
        return this.c.get(i + this.A00);
    }
}
