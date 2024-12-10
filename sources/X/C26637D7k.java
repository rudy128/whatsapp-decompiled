package X;

/* renamed from: X.D7k  reason: case insensitive filesystem */
public final /* synthetic */ class C26637D7k implements E3k {
    public final /* synthetic */ C26642D7p A00;

    public final void C9s() {
        C26642D7p d7p = this.A00;
        boolean A1P = AnonymousClass000.A1P((d7p.A02.A0C() > 1.0f ? 1 : (d7p.A02.A0C() == 1.0f ? 0 : -1)));
        if (A1P != d7p.A06) {
            d7p.A06 = A1P;
            d7p.A0J.invalidateSelf();
        }
    }

    public /* synthetic */ C26637D7k(C26642D7p d7p) {
        this.A00 = d7p;
    }
}
