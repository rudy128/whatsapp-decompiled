package X;

/* renamed from: X.6nY  reason: invalid class name and case insensitive filesystem */
public final class C132766nY {
    public final AnonymousClass11S A00;
    public final C19830z4 A01;
    public final C18030ve A02;
    public final C27021Uk A03;
    public final C18600wl A04;

    public final C127246e2 A00(int i, boolean z) {
        String str;
        if (!(i == 1 || i == 6)) {
            if (i != 7) {
                if (!(i == 9 || i == 10)) {
                    switch (i) {
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        default:
                            if (z) {
                                str = "EMOJI";
                            } else {
                                str = "GIFS";
                            }
                            String string = C17890vO.A0B(this.A01).getString("expressions_keyboard_selected_tab", str);
                            C18070vi.A0X(string);
                            int ordinal = C122706Rk.valueOf(string).ordinal();
                            if (ordinal != 0) {
                                if (ordinal == 1) {
                                    return C117245zS.A00;
                                }
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        throw AnonymousClass3MW.A14();
                                    }
                                } else if (this.A03.A01() || (!this.A00.A0N())) {
                                    return C117225zQ.A00;
                                }
                            }
                            break;
                    }
                }
            }
            return C117255zT.A00;
        }
        return C117235zR.A00;
    }

    public C132766nY(AnonymousClass11S r1, C19830z4 r2, C18030ve r3, C27021Uk r4, C18600wl r5) {
        C18070vi.A0w(r3, r1, r2, r4, r5);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
    }
}
