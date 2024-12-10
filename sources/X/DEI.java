package X;

public final class DEI implements C28552E7c {
    public final /* synthetic */ boolean A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;

    public void Bhc(C28592E9h e9h, C25054CVi cVi) {
        C22808BPw bPw = new C22808BPw(e9h);
        boolean z = this.A01;
        boolean z2 = this.A02;
        Boolean valueOf = Boolean.valueOf(z);
        bPw.A0V = valueOf;
        C22895BUg bUg = bPw.A0H;
        if (bUg != null) {
            bUg.A00(EBS.A0I, valueOf);
        }
        Boolean valueOf2 = Boolean.valueOf(z2);
        bPw.A0W = valueOf2;
        if (bUg != null) {
            bUg.A00(EBS.A0M, valueOf2);
        }
        cVi.A00(bPw);
        cVi.A00(new BUK(e9h));
        cVi.A00(new C22807BPv(e9h));
        cVi.A00(new BUO(e9h, true));
        cVi.A00(new BUJ(e9h));
        cVi.A00(new BUL(e9h));
        cVi.A00(new BQ0(e9h));
        cVi.A00(new C22811BPz(e9h));
        cVi.A00(new C22810BPy(e9h));
        cVi.A00(new BUF(e9h));
        if (this.A00) {
            cVi.A00(new C22891BUc(e9h));
        }
    }

    public /* synthetic */ void Bhd(C28592E9h e9h, CZ2 cz2) {
    }

    public DEI(boolean z, boolean z2, boolean z3) {
        this.A00 = z;
        this.A01 = z2;
        this.A02 = z3;
    }
}
