package X;

/* renamed from: X.1PV  reason: invalid class name */
public final class AnonymousClass1PV {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass11S A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1MB A04;
    public final AnonymousClass00H A05;

    public AnonymousClass1PV(AnonymousClass11S r2, AnonymousClass11P r3, C18030ve r4, AnonymousClass1MB r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0d(r3, 1);
        C18070vi.A0d(r4, 2);
        C18070vi.A0d(r2, 3);
        C18070vi.A0d(r6, 4);
        C18070vi.A0d(r7, 5);
        C18070vi.A0d(r5, 6);
        this.A03 = r3;
        this.A00 = r4;
        this.A02 = r2;
        this.A05 = r6;
        this.A01 = r7;
        this.A04 = r5;
    }

    public AnonymousClass2M8 A00(AnonymousClass1BI r8, AnonymousClass206 r9, C688334w r10) {
        boolean z = true;
        if (r10.A00 != 1) {
            z = false;
        }
        AnonymousClass2M8 r6 = null;
        if (z) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 4873)) {
                if (((C57492jA) this.A01.get()).A00(r8) < 0) {
                    r6 = A01(r8, false);
                }
                if (!this.A04.A03(r8)) {
                    r9.A0b(8388608);
                }
            }
        }
        return r6;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.20i, X.2M8] */
    public AnonymousClass2M8 A01(AnonymousClass1BI r6, boolean z) {
        C18070vi.A0d(r6, 0);
        AnonymousClass11P r2 = this.A03;
        AnonymousClass205 r4 = new AnonymousClass205(r6, AnonymousClass1PP.A00(this.A02, r2, false), true);
        long A012 = AnonymousClass11P.A01(r2);
        int i = 147;
        if (z) {
            i = 155;
        }
        return new C436420i(r4, i, A012);
    }

    public boolean A02() {
        C18030ve r1 = this.A00;
        C18040vf r3 = C18040vf.A02;
        if (!C18020vd.A05(r3, r1, 4873)) {
            return false;
        }
        AnonymousClass00H r2 = this.A05;
        if (!C18020vd.A05(r3, ((AnonymousClass72A) r2.get()).A01, 5747) || C18070vi.A18(((AnonymousClass72A) r2.get()).A01(), "yes")) {
            return true;
        }
        return false;
    }
}
