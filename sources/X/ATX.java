package X;

public final class ATX implements B85, C436820m {
    public final C19969A1e A00;
    public final AnonymousClass00H A01;

    public ATX(C19969A1e a1e, AnonymousClass00H r3) {
        C18070vi.A0d(r3, 1);
        this.A01 = r3;
        this.A00 = a1e;
    }

    public void BDb(C19998A2m a2m, AnonymousClass206 r8) {
        C23577Bm6 bm6;
        C18070vi.A0h(r8, a2m);
        AnonymousClass8BY.A1G(r8, "Message type is not supported ", AnonymousClass000.A10(), r8 instanceof C438121a);
        C438121a r82 = (C438121a) r8;
        C20285AEt aEt = r82.A00;
        if (aEt != null) {
            C20083A6j.A02(a2m, r82, aEt, this.A01);
            AnonymousClass8X8 r5 = a2m.A00;
            C163878Wr A002 = AnonymousClass8X8.A00(r5);
            AnonymousClass8X3 r3 = (AnonymousClass8X3) AnonymousClass8BW.A0M(A002).A0O();
            r3.A0G();
            C165638bW r2 = (C165638bW) r3.A00;
            if (r2.mediaCase_ == 7) {
                bm6 = (C23577Bm6) r2.media_;
            } else {
                bm6 = C166248ca.DEFAULT_INSTANCE;
            }
            C163928Ww r1 = (C163928Ww) bm6.A0O();
            this.A00.A02(a2m, r1, r82);
            AnonymousClass8BX.A0O(r3, r1).mediaCase_ = 7;
            AnonymousClass8X8.A07(r3, r5, A002);
        }
    }
}
