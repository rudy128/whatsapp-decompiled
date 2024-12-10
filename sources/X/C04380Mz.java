package X;

/* renamed from: X.0Mz  reason: invalid class name and case insensitive filesystem */
public final class C04380Mz {
    public long A00 = A00();
    public C26251Cvq A01;
    public E3V A02;
    public C28644ECa A03;
    public C24246By4 A04;
    public Object A05;

    private final long A00() {
        return C04550Nv.A01(this.A01, this.A02, this.A03, C04550Nv.A00, 1);
    }

    public final void A01(C26251Cvq cvq, E3V e3v, C28644ECa eCa, C24246By4 by4, Object obj) {
        if (by4 != this.A04 || !C18070vi.A18(eCa, this.A03) || !C18070vi.A18(e3v, this.A02) || !C18070vi.A18(cvq, this.A01) || !C18070vi.A18(obj, this.A05)) {
            this.A04 = by4;
            this.A03 = eCa;
            this.A02 = e3v;
            this.A01 = cvq;
            this.A05 = obj;
            this.A00 = A00();
        }
    }

    public C04380Mz(C26251Cvq cvq, E3V e3v, C28644ECa eCa, C24246By4 by4, Object obj) {
        this.A04 = by4;
        this.A03 = eCa;
        this.A02 = e3v;
        this.A01 = cvq;
        this.A05 = obj;
    }
}
