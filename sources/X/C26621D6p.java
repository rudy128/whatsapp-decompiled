package X;

/* renamed from: X.D6p  reason: case insensitive filesystem */
public final class C26621D6p implements C22851Dl {
    public C42621yT A00;
    public final C200710s A01;
    public final /* synthetic */ C15950rT A02;
    public final /* synthetic */ C22801Dg A03;
    public final /* synthetic */ CW0 A04;

    public C26621D6p(C15950rT r4, C22801Dg r5, CW0 cw0) {
        this.A04 = cw0;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = new C200710s(cw0.A01, true);
    }

    public void Bo9(Object obj) {
        C28676EDt dQv;
        C42621yT r0 = this.A00;
        if (r0 != null) {
            r0.A01();
        }
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A04.A00.A00, 12304);
        C22801Dg r2 = this.A03;
        C15950rT r02 = this.A02;
        if (A05) {
            dQv = new C27051DQw(r2, obj, AnonymousClass3MW.A0z(r02));
        } else {
            dQv = new C27050DQv(r02, r2, obj);
        }
        C28676EDt eDt = dQv;
        this.A00 = eDt.BOH().A00;
        C200710s r03 = this.A01;
        r03.A03();
        r03.execute(eDt);
    }
}
