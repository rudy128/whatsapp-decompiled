package X;

/* renamed from: X.2l6  reason: invalid class name and case insensitive filesystem */
public class C58692l6 {
    public boolean A00 = false;
    public boolean A01 = true;
    public final AnonymousClass1KB A02;
    public final C19830z4 A03;
    public final C51982aB A04;
    public final C18030ve A05;

    public void A00() {
        this.A02.CGP(new C70573Bq(this, 24));
    }

    public C58692l6(AnonymousClass1KB r2, C19830z4 r3, C51982aB r4, C18030ve r5) {
        this.A05 = r5;
        this.A02 = r2;
        this.A04 = r4;
        this.A03 = r3;
    }

    public boolean A01() {
        A00();
        if (!C18020vd.A05(C18040vf.A02, this.A05, 1624)) {
            return true;
        }
        C19830z4 r2 = this.A03;
        if (!C17890vO.A0B(r2).contains("tos_2016_opt_out_state") || r2.A2V()) {
            return false;
        }
        return true;
    }
}
