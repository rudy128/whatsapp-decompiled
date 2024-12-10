package X;

/* renamed from: X.1UN  reason: invalid class name */
public final class AnonymousClass1UN {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final C19830z4 A02;
    public final AnonymousClass1UZ A03;
    public final C18030ve A04;

    public AnonymousClass1UN(AnonymousClass11S r2, AnonymousClass11P r3, C19830z4 r4, AnonymousClass1UZ r5, C18030ve r6) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r6, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r2, 5);
        this.A01 = r3;
        this.A04 = r6;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
    }

    public final boolean A00() {
        if (!this.A00.A0N() && A07()) {
            C19830z4 r5 = this.A02;
            if (r5.A0D() == 2) {
                return true;
            }
            if (r5.A0D() != 1 || r5.A0O() > 0 || r5.A0P() < AnonymousClass11P.A01(this.A01) - 172800000) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A01() {
        if (this.A00.A0N()) {
            return false;
        }
        C18030ve r2 = this.A04;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 5868) || !C18020vd.A05(r1, r2, 8543)) {
            return false;
        }
        C19830z4 r5 = this.A02;
        if (!r5.A2J() || !r5.A2K() || r5.A0D() != 1 || r5.A0O() > 0 || r5.A0P() >= AnonymousClass11P.A01(this.A01) - 172800000) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        if (!this.A00.A0N() && this.A02.A0D() == 3) {
            if (!C18020vd.A05(C18040vf.A02, this.A04, 5868)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A04() {
        if (!this.A00.A0N()) {
            if (!C18020vd.A05(C18040vf.A02, this.A04, 5868)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A06() {
        if (!this.A00.A0N()) {
            C18030ve r2 = this.A04;
            C18040vf r1 = C18040vf.A02;
            if (!C18020vd.A05(r1, r2, 5868) || !C18020vd.A05(r1, r2, 8543) || !this.A02.A2J()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A07() {
        if (!this.A00.A0N() && this.A02.A2K()) {
            C18030ve r2 = this.A04;
            C18040vf r1 = C18040vf.A02;
            if (!C18020vd.A05(r1, r2, 5868) || !C18020vd.A05(r1, r2, 8543)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final boolean A08() {
        C18030ve r2 = this.A04;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 5868) || !C18020vd.A05(r1, r2, 8543)) {
            return false;
        }
        return true;
    }

    public final boolean A09() {
        if (!C18020vd.A05(C18040vf.A02, this.A04, 12767) || !A08()) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        if (!A07()) {
            return false;
        }
        C19830z4 r1 = this.A02;
        if (!r1.A2J() || r1.A0O() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        if (!A04() || !this.A02.A2K()) {
            return false;
        }
        return true;
    }
}
