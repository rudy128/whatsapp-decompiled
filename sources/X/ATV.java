package X;

public final class ATV implements B85, C436820m {
    public final C193209pi A00;
    public final AnonymousClass00H A01;

    public ATV(C193209pi r2, AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = r2;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r9) {
        C23577Bm6 bm6;
        C18070vi.A0h(r9, a2m);
        C17960vV.A0G(r9 instanceof C438521e, AnonymousClass001.A1E(r9, "FMessageInteractiveProtocolSerializer: message type is not supported ", AnonymousClass000.A10()));
        C438521e r92 = (C438521e) r9;
        C20285AEt aEt = r92.A00;
        if (aEt != null) {
            C20083A6j.A02(a2m, r92, aEt, this.A01);
            AnonymousClass8X8 r6 = a2m.A00;
            C163878Wr A002 = AnonymousClass8X8.A00(r6);
            AnonymousClass8X3 r4 = (AnonymousClass8X3) AnonymousClass8BW.A0M(A002).A0O();
            r4.A0G();
            C193209pi r3 = this.A00;
            C165638bW r2 = (C165638bW) r4.A00;
            if (r2.mediaCase_ == 4) {
                bm6 = (C23577Bm6) r2.media_;
            } else {
                bm6 = C166268cc.DEFAULT_INSTANCE;
            }
            C163748We A003 = r3.A00(a2m, (C163748We) bm6.A0O(), r92);
            if (A003 != null) {
                AnonymousClass8BX.A0O(r4, A003).mediaCase_ = 4;
            }
            AnonymousClass8X8.A07(r4, r6, A002);
        }
    }
}
