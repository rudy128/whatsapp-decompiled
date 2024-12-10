package X;

/* renamed from: X.09n  reason: invalid class name and case insensitive filesystem */
public final class C017009n extends C04640Oe {
    public int A00;
    public float A01;
    public AnonymousClass0HD A02;
    public final C17280uP A03;
    public final C17330uU A04;
    public final C17330uU A05;
    public final AnonymousClass0A8 A06;

    public long A02() {
        return ((AnonymousClass0QG) this.A05.getValue()).A00;
    }

    public void A06(C17770vC r11) {
        AnonymousClass0A8 r9 = this.A06;
        AnonymousClass0HD r8 = this.A02;
        if (r8 == null) {
            r8 = (AnonymousClass0HD) r9.A07.getValue();
        }
        if (!AnonymousClass001.A1b(this.A04) || r11.getLayoutDirection() != C24246By4.Rtl) {
            r9.A07(r8, r11, this.A01);
        } else {
            long BOQ = r11.BOQ();
            AnonymousClass0t6 BQs = r11.BQs();
            long BZL = BQs.BZL();
            AnonymousClass0WZ.A00(BQs).CGs(-1.0f, 1.0f, BOQ);
            r9.A07(r8, r11, this.A01);
            AnonymousClass001.A1P(BQs, BZL);
        }
        this.A00 = this.A03.BT8();
    }

    public C017009n(AnonymousClass0AA r4) {
        this.A05 = AnonymousClass0Q9.A02(new AnonymousClass0QG(AnonymousClass0QG.A02));
        this.A04 = AnonymousClass0Q9.A04(false);
        AnonymousClass0A8 r1 = new AnonymousClass0A8(r4);
        r1.A08(new C08190eh(this));
        this.A06 = r1;
        this.A03 = new AnonymousClass08Y(0);
        this.A01 = 1.0f;
        this.A00 = -1;
    }

    public void A03(float f) {
        this.A01 = f;
    }

    public void A04(AnonymousClass0HD r1) {
        this.A02 = r1;
    }

    public C017009n() {
        this(new AnonymousClass0AA());
    }
}
