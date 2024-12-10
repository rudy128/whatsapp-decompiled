package X;

/* renamed from: X.4Rq  reason: invalid class name and case insensitive filesystem */
public final class C86444Rq {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass00H A01;

    public final int A00(C46162Dk r4, Integer num) {
        int i;
        int i2 = r4.A01;
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        int i3 = (1 << i) | i2;
        ((C32991i5) this.A01.get()).A08(r4.A0M(), i3);
        return i3;
    }

    public final void A01(C29681ch r3, Integer num) {
        C46162Dk r1;
        C18070vi.A0d(r3, 0);
        C29691ci A002 = AnonymousClass1CJ.A00(this.A00, r3);
        if ((A002 instanceof C46162Dk) && (r1 = (C46162Dk) A002) != null) {
            A00(r1, num);
        }
    }

    public C86444Rq(AnonymousClass1CJ r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
