package X;

/* renamed from: X.4Qc  reason: invalid class name and case insensitive filesystem */
public final class C86084Qc {
    public int A00;
    public final C55892gX A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public final boolean A00(AnonymousClass206 r6) {
        this.A03.get();
        String A002 = C35771mm.A00(r6);
        if (A002 != null && "MARKETING".equals(A002)) {
            C18030ve r4 = this.A02;
            C18040vf r3 = C18040vf.A02;
            if (C18020vd.A05(r3, r4, 5484) && this.A00 % 2 == 0) {
                this.A00 = AnonymousClass1JU.A01.A03(1, 100);
            }
            if (!C18020vd.A05(r3, r4, 4512)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C86084Qc(C55892gX r1, C18030ve r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
    }
}
