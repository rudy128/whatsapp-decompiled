package X;

public final /* synthetic */ class D5Z implements AnonymousClass02j {
    public final /* synthetic */ AnonymousClass01C A00;
    public final /* synthetic */ C26616D6k A01;
    public final /* synthetic */ C22821Di A02;

    public final void Bkx(Object obj) {
        C22821Di r4 = this.A02;
        AnonymousClass01C r3 = this.A00;
        C26616D6k d6k = this.A01;
        C18070vi.A0d(r4, 0);
        if (obj != null) {
            try {
                r4.invoke(new C24091BvJ(C18070vi.A0H(obj)));
            } catch (SecurityException e) {
                r4.invoke(new C24090BvI(e.toString()));
            }
        } else {
            r4.invoke(C24092BvK.A00);
        }
        r3.getLifecycle().A06(d6k);
        AnonymousClass02n r0 = d6k.A00;
        if (r0 != null) {
            r0.A01();
        }
    }

    public /* synthetic */ D5Z(AnonymousClass01C r1, C26616D6k d6k, C22821Di r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = d6k;
    }
}
