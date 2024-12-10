package X;

/* renamed from: X.1Jt  reason: invalid class name and case insensitive filesystem */
public final class C24331Jt extends C006102s {
    public AnonymousClass00S A00;
    public AnonymousClass00S A01;
    public AnonymousClass00S A02;
    public final C24331Jt A03;
    public final AnonymousClass10E A04;

    public C24331Jt(AnonymousClass10E r1) {
        this.A03 = this;
        this.A04 = r1;
        A02();
    }

    private void A02() {
        AnonymousClass10E r3 = this.A04;
        C24331Jt r2 = this.A03;
        this.A02 = C000200d.A01(new C24341Ju(r2, r3, 0));
        this.A01 = C000200d.A01(new C24341Ju(r2, r3, 1));
        this.A00 = C000200d.A01(new C24341Ju(r2, r3, 2));
    }

    public C006502w A03() {
        return new C24351Jv(this.A03, this.A04);
    }

    public AnonymousClass047 A04() {
        return (AnonymousClass047) this.A02.get();
    }
}
