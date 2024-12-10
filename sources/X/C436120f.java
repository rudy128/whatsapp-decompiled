package X;

/* renamed from: X.20f  reason: invalid class name and case insensitive filesystem */
public final class C436120f extends C436020e {
    public C436220g A00 = C436220g.A01;
    public C437820x A01;
    public C437520u A02;
    public C436520j A03;
    public Integer A04;
    public Integer A05;
    public AnonymousClass20E A06;
    public final AnonymousClass00H A07;

    public C436120f(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A07 = r2;
    }

    public final C436520j A03() {
        if (this.A03 == null) {
            Object obj = ((C435720b) this.A07.get()).A05.get();
            C18070vi.A0X(obj);
            C436520j r1 = (C436520j) obj;
            C18070vi.A0d(r1, 0);
            this.A03 = r1;
            return r1;
        }
        A02("Only one integrations{} is allowed. Multiple detected.");
        throw null;
    }
}
