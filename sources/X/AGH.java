package X;

public final /* synthetic */ class AGH implements AnonymousClass02j {
    public final /* synthetic */ AnonymousClass01C A00;
    public final /* synthetic */ C218417p A01;
    public final /* synthetic */ C22821Di A02;

    public final void Bkx(Object obj) {
        C22821Di r4 = this.A02;
        C218417p r3 = this.A01;
        AnonymousClass01C r2 = this.A00;
        C18070vi.A0d(r4, 0);
        if (obj != null) {
            try {
                r4.invoke(new AnonymousClass97B(C18070vi.A0H(obj)));
            } catch (SecurityException e) {
                r4.invoke(new AnonymousClass97A(e.toString()));
            }
        } else {
            r4.invoke(AnonymousClass97C.A00);
        }
        AnonymousClass02n r0 = r3.A02;
        if (r0 != null) {
            r0.A01();
        }
        r2.getLifecycle().A06(r3);
    }

    public /* synthetic */ AGH(AnonymousClass01C r1, C218417p r2, C22821Di r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
