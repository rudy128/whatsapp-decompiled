package X;

/* renamed from: X.4kT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94344kT implements AnonymousClass5Z4 {
    public final /* synthetic */ C73103Oz A00;
    public final /* synthetic */ AnonymousClass4aY A01;
    public final /* synthetic */ AnonymousClass4OZ[] A02;

    public final void C1I(AnonymousClass206 r9) {
        C62572rc r1;
        CM2 cm2;
        AnonymousClass4aY r7 = this.A01;
        AnonymousClass4OZ[] r6 = this.A02;
        C73103Oz r5 = this.A00;
        if (r9 instanceof C441822l) {
            if (r6[0] == null) {
                r6[0] = new AnonymousClass4OZ(((C87724Ws) r7.A5s.get()).A03, ((C87724Ws) r7.A5s.get()).A01, C23761Hn.A01);
                C98714rb.A00(r7.A4c, r7, r6, r5, 31);
            }
            AnonymousClass4OZ r12 = r6[0];
            C441722k r92 = (C441722k) r9;
            C18070vi.A0d(r92, 0);
            AnonymousClass1G4 r2 = r12.A04;
            if (r2.getValue() == null && AnonymousClass3MX.A0y(r12.A01).A0C(r92, true) && (r1 = r92.A02) != null) {
                AnonymousClass7LG r0 = (AnonymousClass7LG) r92.A00.A02;
                if (r0 != null) {
                    cm2 = r0.A04;
                } else {
                    cm2 = null;
                }
                String str = r1.A0P;
                if (!(cm2 instanceof C24126Bvs) && str == null) {
                    r2.setValue(r92.A0v);
                }
            }
        }
    }

    public /* synthetic */ C94344kT(C73103Oz r1, AnonymousClass4aY r2, AnonymousClass4OZ[] r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
