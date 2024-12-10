package X;

/* renamed from: X.6pA  reason: invalid class name */
public final class AnonymousClass6pA {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final C19830z4 A02;

    public final void A00(int i) {
        C19830z4 r0;
        boolean z;
        AnonymousClass00H r1 = this.A01;
        if ((!C108975cc.A1I(r1) || i < 4) && (C108975cc.A1I(r1) || i < 3)) {
            r0 = this.A02;
            z = false;
        } else {
            r0 = this.A02;
            z = true;
        }
        C17880vN.A1F(C19830z4.A00(r0), "sticker_contextual_suggestion_eligibility", z);
    }

    public final boolean A01() {
        if (C17880vN.A1W(C17890vO.A0B(this.A02), "sticker_contextual_suggestion_eligibility")) {
            return true;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A00, 3403) || !C108975cc.A1I(this.A01)) {
            return false;
        }
        return true;
    }

    public AnonymousClass6pA(C19830z4 r1, C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A00 = r2;
        this.A02 = r1;
        this.A01 = r3;
    }
}
