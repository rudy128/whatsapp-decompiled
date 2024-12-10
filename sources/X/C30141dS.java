package X;

/* renamed from: X.1dS  reason: invalid class name and case insensitive filesystem */
public final class C30141dS {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;

    public C30141dS(AnonymousClass11S r2, C18030ve r3, AnonymousClass00H r4) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    public final boolean A00() {
        if (!this.A00.A0N()) {
            if (!C18020vd.A05(C18040vf.A02, this.A01, 2722)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (!((AnonymousClass1c4) this.A02.get()).A08() || A00()) {
            return false;
        }
        C18030ve r3 = this.A01;
        C18040vf r2 = C18040vf.A01;
        if (C18020vd.A00(r2, r3, 3964) == 2 || C18020vd.A00(r2, r3, 3964) == 3) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        if (((AnonymousClass1c4) this.A02.get()).A08() && A00()) {
            if (C18020vd.A00(C18040vf.A01, this.A01, 3964) != 3) {
                return false;
            }
            return true;
        }
        return false;
    }
}
