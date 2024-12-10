package X;

/* renamed from: X.1Lc  reason: invalid class name and case insensitive filesystem */
public final class C24641Lc {
    public final AnonymousClass11S A00;
    public final C18030ve A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final C18100vl A04 = new C18110vm(new C71013Dl(this, 10));

    public C24641Lc(AnonymousClass11S r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r5, 3);
        C18070vi.A0d(r6, 4);
        this.A01 = r4;
        this.A00 = r3;
        this.A03 = r5;
        this.A02 = r6;
    }

    public final boolean A06() {
        long j;
        C18030ve r6 = this.A01;
        C18040vf r5 = C18040vf.A02;
        if (C18020vd.A00(r5, r6, 8521) > 0) {
            j = (long) C18020vd.A00(r5, r6, 9973);
        } else {
            j = 0;
        }
        return j > 0 || (C18020vd.A00(r5, r6, 8522) > 0 && ((long) C18020vd.A00(r5, r6, 9973)) > 0);
    }

    public final int A00(boolean z) {
        int i;
        C18030ve r2 = this.A01;
        if (z) {
            i = 8521;
        } else {
            i = 8522;
        }
        return C18020vd.A00(C18040vf.A02, r2, i);
    }

    public final boolean A01() {
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A01;
        if (!C18020vd.A05(r1, r2, 11190) || C18020vd.A05(r1, r2, 9228)) {
            return false;
        }
        return true;
    }

    public final boolean A02() {
        C18030ve r3 = this.A01;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A00(r2, r3, 6278) != 2) {
            return false;
        }
        AnonymousClass11S r1 = this.A00;
        if (!r1.A0N()) {
            return true;
        }
        if (!r1.A0N() || !C18020vd.A05(r2, r3, 12021)) {
            return false;
        }
        return true;
    }

    public final boolean A03() {
        C18030ve r3 = this.A01;
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r3, 9817)) {
            return false;
        }
        AnonymousClass11S r1 = this.A00;
        if (!r1.A0N()) {
            return true;
        }
        if (!r1.A0N() || !C18020vd.A05(r2, r3, 12021)) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A01;
        if (!C18020vd.A05(r1, r2, 7436) || C18020vd.A05(r1, r2, 10229)) {
            return false;
        }
        return true;
    }

    public final boolean A05() {
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 7597) || !C18020vd.A05(r1, r2, 7783)) {
            return false;
        }
        return true;
    }

    public final boolean A07() {
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 8687) || C18020vd.A05(r1, r2, 8880)) {
            return false;
        }
        return true;
    }

    public final boolean A08() {
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A02;
        if ((!C18020vd.A05(r1, r2, 7558) || !C18020vd.A05(r1, r2, 9461) || C18020vd.A00(r1, r2, 12557) != 0) && C18020vd.A00(r1, r2, 12557) != 3) {
            return false;
        }
        return true;
    }

    public final boolean A09(AnonymousClass206 r5) {
        C692236j A022 = C63672tV.A02(r5);
        if (A022 == null || !A022.A08) {
            return true;
        }
        if (!C18020vd.A05(C18040vf.A02, this.A01, 11626)) {
            return false;
        }
        return true;
    }

    public final boolean A0A(boolean z) {
        int A002 = A00(z);
        if (A002 == 1 || A002 == 2 || A00(z) == 1 || A00(z) == 2 || A00(z) == 5) {
            return true;
        }
        return false;
    }
}
