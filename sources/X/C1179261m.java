package X;

/* renamed from: X.61m  reason: invalid class name and case insensitive filesystem */
public final class C1179261m extends C25871Py {
    public boolean A00;
    public final AnonymousClass12E A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass118 A03;
    public final C19830z4 A04;
    public final C18030ve A05;
    public final AnonymousClass10I A06;

    public void A01() {
        if (!this.A00) {
            if (C18020vd.A05(C18040vf.A02, this.A05, 4921)) {
                String A0r = C17880vN.A0r(C17890vO.A0B(this.A04), "my_current_status");
                if (!AnonymousClass72Y.A03(C108945cZ.A0E(this.A03), A0r)) {
                    A0r = null;
                }
                this.A06.CGF(new AnonymousClass7RS(23, A0r, this));
            }
        }
    }

    public void A02() {
        this.A00 = C18020vd.A05(C18040vf.A02, this.A05, 4921);
    }

    public C1179261m(AnonymousClass12E r2, AnonymousClass118 r3, C19830z4 r4, C18030ve r5, AnonymousClass10I r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r3, r6, r7, r2);
        C18070vi.A0d(r4, 6);
        this.A05 = r5;
        this.A03 = r3;
        this.A06 = r6;
        this.A02 = r7;
        this.A01 = r2;
        this.A04 = r4;
    }
}
