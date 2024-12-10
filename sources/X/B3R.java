package X;

public final class B3R extends AnonymousClass11G implements C22821Di {
    public static final B3R A00 = new B3R();

    public B3R() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C172148sx r4 = (C172148sx) obj;
        C18070vi.A0d(r4, 0);
        r4.A04 = AnonymousClass3MW.A15(C190329kl.class);
        r4.A03 = AnonymousClass00R.A01;
        B3Q b3q = B3Q.A00;
        C18070vi.A0d(b3q, 0);
        if (r4.A02 == null) {
            AnonymousClass2I2 r0 = (AnonymousClass2I2) AnonymousClass8BS.A0a(((C188339hG) r4.A05.get()).A02);
            C18070vi.A0d(r0, 0);
            r4.A02 = r0;
            r0.A01();
            b3q.invoke(r0);
            AnonymousClass8BT.A1D(r0);
            return C27621Wu.A00;
        }
        r4.A02("Only one integrationPoint{} is allowed. Multiple detected.");
        throw null;
    }
}
