package X;

/* renamed from: X.0Vt  reason: invalid class name and case insensitive filesystem */
public final class C05800Vt implements C16300s2 {
    public C22821Di A00;
    public C22821Di A01;
    public final C05830Vw A02;
    public final /* synthetic */ C03520Io A03;

    public C05800Vt(C03520Io r1, C05830Vw r2, C22821Di r3, C22821Di r4) {
        this.A03 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r4;
    }

    public final void A02(C16580sf r5) {
        Object invoke = this.A00.invoke(r5.BaC());
        if (AnonymousClass001.A1b(this.A03.A03.A04)) {
            this.A02.A03((C17190uG) this.A01.invoke(r5), this.A00.invoke(r5.BSw()), invoke);
            return;
        }
        this.A02.A02((C17190uG) this.A01.invoke(r5), invoke);
    }

    public Object getValue() {
        A02((C16580sf) this.A03.A03.A05.getValue());
        return this.A02.A07.getValue();
    }

    public final C22821Di A00() {
        return this.A00;
    }

    public final C22821Di A01() {
        return this.A01;
    }

    public final void A03(C22821Di r1) {
        this.A00 = r1;
    }

    public final void A04(C22821Di r1) {
        this.A01 = r1;
    }
}
