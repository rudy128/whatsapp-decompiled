package X;

/* renamed from: X.6uW  reason: invalid class name and case insensitive filesystem */
public final class C136856uW {
    public C1605789a A00;
    public C136056tC A01;
    public C136056tC A02;
    public boolean A03;
    public final C146367Ov A04 = new C146367Ov(this, 1);
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;

    public final void A00() {
        C136056tC r0 = this.A01;
        if (r0 != null && r0.A02) {
            C30131dR A13 = C108945cZ.A13(this.A09);
            A13.A04("SEE_F_ICON_DISAPPEAR");
            A13.A01();
            C136056tC r1 = this.A01;
            if (r1 == null) {
                C18070vi.A11("currentShareViewState");
                throw null;
            }
            r1.A02 = false;
            r1.A04 = false;
            C1605789a r02 = this.A00;
            if (r02 != null) {
                r02.C5S(r1);
            }
        }
    }

    public final void A01() {
        if (this.A01 == null) {
            C122726Rr r1 = C122726Rr.HIDE;
            this.A01 = new C136056tC(r1, r1, false, false, false);
        }
        if (this.A02 == null) {
            C122726Rr r12 = C122726Rr.HIDE;
            this.A02 = new C136056tC(r12, r12, false, false, false);
        }
    }

    public final void A02() {
        C108945cZ.A13(this.A09).A03("EXIT_STATUS_VIEW");
        C108945cZ.A13(this.A08).A03("EXIT_STATUS_VIEW");
        ((AnonymousClass7FM) this.A05.get()).A02();
    }

    public final void A03() {
        if (this.A01 == null) {
            C122726Rr r1 = C122726Rr.HIDE;
            this.A01 = new C136056tC(r1, r1, false, false, false);
        }
        if (this.A02 == null) {
            C122726Rr r12 = C122726Rr.HIDE;
            this.A02 = new C136056tC(r12, r12, false, false, false);
        }
        if (!this.A03) {
            this.A03 = true;
            C17880vN.A0V(this.A06).registerObserver(this.A04);
        }
    }

    public C136856uW(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r4, r5, r6, r7);
        this.A05 = r3;
        this.A06 = r4;
        this.A07 = r5;
        this.A09 = r6;
        this.A08 = r7;
    }
}
