package X;

/* renamed from: X.1v1  reason: invalid class name and case insensitive filesystem */
public class C40631v1 {
    public final C40401ue A00;
    public final AnonymousClass1M6 A01 = new C66262xt(this, 0);
    public final C39511tC A02;
    public final C34171k3 A03 = new C45882Ca(this, 1);
    public final C35751mk A04;
    public final C23581Gv A05 = new C66772yi(this, 2);
    public final C24671Lf A06;
    public final C28741ap A07 = new AnonymousClass30Y(this, 0);
    public final AnonymousClass1Q1 A08;
    public final C25231Nk A09 = new AnonymousClass30Z(this, 1);
    public final AnonymousClass1NN A0A;
    public final C25221Nj A0B = new C683733c(this, 1);
    public final C25191Ng A0C;

    public void A00() {
        this.A08.registerObserver(this.A07);
        this.A06.registerObserver(this.A05);
        this.A04.registerObserver(this.A03);
        this.A0A.registerObserver(this.A09);
        this.A02.registerObserver(this.A01);
        this.A0C.registerObserver(this.A0B);
    }

    public void A01() {
        this.A08.unregisterObserver(this.A07);
        this.A06.unregisterObserver(this.A05);
        this.A04.unregisterObserver(this.A03);
        this.A0A.unregisterObserver(this.A09);
        this.A02.unregisterObserver(this.A01);
        this.A0C.unregisterObserver(this.A0B);
    }

    public C40631v1(C39511tC r4, C35751mk r5, C40401ue r6, C24671Lf r7, AnonymousClass1Q1 r8, AnonymousClass1NN r9, C25191Ng r10) {
        this.A08 = r8;
        this.A00 = r6;
        this.A06 = r7;
        this.A04 = r5;
        this.A0A = r9;
        this.A02 = r4;
        this.A0C = r10;
    }
}
