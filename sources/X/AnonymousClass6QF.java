package X;

/* renamed from: X.6QF  reason: invalid class name */
public final class AnonymousClass6QF extends C123416Uj {
    public static final Integer A03 = AnonymousClass00R.A04;
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final void A04() {
        AnonymousClass00H r3 = this.A02;
        int A002 = C17890vO.A00(AnonymousClass716.A01(r3), "pref_xfamily_audience_nux_dialog");
        C17880vN.A1C(AnonymousClass716.A00((AnonymousClass716) r3.get()).edit(), "pref_xfamily_audience_nux_dialog", A002 + 1);
    }

    public final boolean A05() {
        boolean A19 = C18070vi.A19(C108945cZ.A11(this.A01).A01(A03), true);
        AnonymousClass00H r5 = this.A02;
        int A002 = C17890vO.A00(AnonymousClass716.A01(r5), "pref_xfamily_sharing_to_fb_tooltip");
        if (A19) {
            int A003 = C18020vd.A00(C18040vf.A02, this.A00, 6490);
            if (A003 <= 1) {
                A003 = 1;
            }
            if (A002 < A003) {
                return true;
            }
            return false;
        } else if (A002 <= 0) {
            return false;
        } else {
            if (C18020vd.A00(C18040vf.A02, this.A00, 6490) <= 0) {
                return false;
            }
            C17880vN.A1C(AnonymousClass716.A00((AnonymousClass716) r5.get()).edit(), "pref_xfamily_sharing_to_fb_tooltip", 0);
            return false;
        }
    }

    public AnonymousClass6QF(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
