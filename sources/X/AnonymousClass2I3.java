package X;

/* renamed from: X.2I3  reason: invalid class name */
public final class AnonymousClass2I3 extends C436020e {
    public C436220g A00 = C436220g.A01;
    public AnonymousClass2I4 A01;
    public AnonymousClass2I0 A02;
    public Integer A03;
    public AnonymousClass20E A04;
    public final AnonymousClass00H A05;

    public AnonymousClass2I3(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A05 = r2;
    }

    public final void A03(C22821Di r3) {
        if (this.A02 == null) {
            Object obj = ((C435720b) this.A05.get()).A03.get();
            C18070vi.A0X(obj);
            AnonymousClass2I0 r1 = (AnonymousClass2I0) obj;
            C18070vi.A0d(r1, 0);
            this.A02 = r1;
            r1.A01();
            r3.invoke(r1);
            r1.A00();
            r1.A00 = true;
            return;
        }
        A02("Only one integrationPoint{} is allowed. Multiple detected.");
        throw null;
    }
}
