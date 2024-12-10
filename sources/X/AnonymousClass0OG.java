package X;

/* renamed from: X.0OG  reason: invalid class name */
public final class AnonymousClass0OG {
    public Object A00;
    public boolean A01;
    public final C05820Vv A02;
    public final C17280uP A03;
    public final C17280uP A04;

    public static final void A00(AnonymousClass0OG r2, int i, int i2) {
        if (((float) i) >= 0.0f) {
            r2.A03.CJC(i);
            r2.A02.A01(i);
            r2.A04.CJC(i2);
            return;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Index should be non-negative (");
        throw AnonymousClass000.A0k(AnonymousClass001.A1L(A10, i));
    }

    public AnonymousClass0OG(int i, int i2) {
        C18100vl r0 = AnonymousClass0GU.A01;
        this.A03 = new AnonymousClass08Y(i);
        this.A04 = new AnonymousClass08Y(i2);
        this.A02 = new C05820Vv(i);
    }

    public AnonymousClass0OG() {
        this(0, 0);
    }
}
