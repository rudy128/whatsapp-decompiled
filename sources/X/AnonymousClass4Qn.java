package X;

/* renamed from: X.4Qn  reason: invalid class name */
public final class AnonymousClass4Qn {
    public long A00;
    public C81253yw A01;
    public final AnonymousClass11P A02;
    public final AnonymousClass18K A03;

    public final void A00(int i) {
        C81253yw r4 = this.A01;
        if (r4 != null) {
            r4.A00 = Integer.valueOf(i);
            if (this.A00 > 0 && (i == 0 || i == 1 || i == 2)) {
                r4.A01 = Long.valueOf(AnonymousClass11P.A01(this.A02) - this.A00);
            }
            this.A03.CC7(r4);
            this.A01 = null;
        }
    }

    public AnonymousClass4Qn(AnonymousClass11P r1, AnonymousClass18K r2) {
        C18070vi.A0j(r1, r2);
        this.A02 = r1;
        this.A03 = r2;
    }
}
