package X;

import java.util.List;

/* renamed from: X.2Cm  reason: invalid class name and case insensitive filesystem */
public final class C46002Cm extends C60192nY {
    public final C19880zA A00;
    public final AnonymousClass11S A01;
    public final C26311Rq A02;
    public final C19880zA A03;
    public final AnonymousClass11P A04;

    public final List A0K() {
        C19880zA r1 = this.A03;
        if (!r1.A07() || ((C35101le) r1.A03()).A00(C35131lh.A06) != 2) {
            return C18460wS.A00;
        }
        long A012 = AnonymousClass11P.A01(this.A04);
        return C18070vi.A0M(new AnonymousClass8q8(C62382rJ.A03, (C19999A2n) null, AnonymousClass2R3.A01, (String) null, A012));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46002Cm(C19880zA r2, C19880zA r3, AnonymousClass11S r4, AnonymousClass11P r5, C26331Rs r6, C26311Rq r7) {
        super(r6);
        C18070vi.A0o(r5, r4, r7);
        C18070vi.A0d(r6, 6);
        this.A04 = r5;
        this.A01 = r4;
        this.A02 = r7;
        this.A03 = r2;
        this.A00 = r3;
    }
}
