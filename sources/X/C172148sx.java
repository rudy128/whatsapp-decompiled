package X;

/* renamed from: X.8sx  reason: invalid class name and case insensitive filesystem */
public final class C172148sx extends C436020e {
    public C436220g A00 = C436220g.A01;
    public AnonymousClass2I4 A01;
    public AnonymousClass2I2 A02;
    public Integer A03;
    public AnonymousClass20E A04;
    public final AnonymousClass00H A05;

    public C172148sx(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A05 = r2;
    }

    public void A00() {
        String str;
        if (this.A04 == null) {
            str = "subsystem was not specified.";
        } else if (this.A03 == null) {
            str = "integrationState was not specified.";
        } else if (this.A02 == null) {
            str = "integrationPoint was not configured.";
        } else if (this.A01 == null) {
            AnonymousClass2I4 r1 = (AnonymousClass2I4) AnonymousClass8BS.A0a(((C188339hG) this.A05.get()).A06);
            C18070vi.A0d(r1, 0);
            this.A01 = r1;
            r1.A01();
            AnonymousClass8BT.A1D(r1);
            return;
        } else {
            return;
        }
        A02(str);
        throw null;
    }
}
